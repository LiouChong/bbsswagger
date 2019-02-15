package com.bysj.controller;

import com.bysj.common.ActionResponse;
import com.bysj.entity.vo.query.PermissionQuery;
import com.bysj.entity.vo.request.PermissionRequest;
import com.bysj.service.IPermissionService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 *
 * @author lc
 * @since 2019-01-10
 */
@Api(value = "Permission", description = "权限表")
@RestController
@RequestMapping("/v1/bbs/permission")
public class PermissionController {

    @Resource
    public IPermissionService iPermissionService;

    /**
     * 保存
     * @param permissionRequest
     * @return actionResponse
     */
    @ApiOperation(value = "保存接口", notes = "传入实体对象信息")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ActionResponse.class, responseContainer = "actionResponse"),
    })
    @RequestMapping(value = "/save/single", method = RequestMethod.POST)
    public ActionResponse saveSingle(@ApiParam(value = "permission") @RequestBody PermissionRequest permissionRequest)throws Exception{
        iPermissionService.savePermission(permissionRequest);
        return ActionResponse.success();
    }

    /**
     * 修改
     * @param permissionRequest
     * @return actionResponse
     */
    @ApiOperation(value = "修改接口", notes = "传入实体对象信息")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ActionResponse.class, responseContainer = "actionResponse"),
    })
    @RequestMapping(value = "/update/single", method = RequestMethod.POST)
    public ActionResponse updateSingle(@ApiParam(value = "permission")PermissionRequest permissionRequest)throws Exception{
        iPermissionService.updatePermission(permissionRequest);
        return ActionResponse.success();
    }

    /**
     * 批量查询
     * @param permissionQuery
     * @return actionResponse
     */
    @ApiOperation(value = "批量查询接口", notes = "传入查询条件")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ActionResponse.class, responseContainer = "actionResponse"),
    })
    @RequestMapping(value = "/query/list", method = RequestMethod.GET)
    public ActionResponse queryList(@ApiParam(value = "permission") PermissionQuery permissionQuery)throws Exception{
        return ActionResponse.success(iPermissionService.findPagePermission(permissionQuery));
    }

    /**
     * 通过ID查询
     * @param id
     * @return actionResponse
     */
    @ApiOperation(value = "通过ID查询", notes = "主键封装对象")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ActionResponse.class, responseContainer = "actionResponse"),
    })
    @RequestMapping(value = "/query/{id}", method = RequestMethod.GET)
    public ActionResponse queryById(@ApiParam(value = "permission") @PathVariable("id") Integer id)throws Exception{
        return ActionResponse.success(iPermissionService.getById(id));
    }

    /**
     * 通过ID删除
     * @param id
     * @return actionResponse
     */
    @ApiOperation(value = "通过ID删除接口", notes = "主键封装对象")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = ActionResponse.class, responseContainer = "actionResponse"),
    })
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public ActionResponse deleteById(@ApiParam(value = "id") @PathVariable("id") Integer id)throws Exception{
        return ActionResponse.success(iPermissionService.deleteById(id));
    }
}


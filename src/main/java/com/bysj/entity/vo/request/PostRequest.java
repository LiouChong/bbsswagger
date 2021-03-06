package com.bysj.entity.vo.request;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * <p>
 * PostRequest 请求对象
 * </p>
 *
 * @author wh
 * @since 2018-12-27
 */

public class PostRequest   {

    @ApiModelProperty("")
    private String title;
    @ApiModelProperty("")
    private String info;
    @ApiModelProperty("")
    private Date publishTime;
    @ApiModelProperty("")
    private Integer posterId;
    @ApiModelProperty("")
    private Integer ifGood;
    @ApiModelProperty("")
    private Integer ifDelete;
    @ApiModelProperty("")
    private Integer plateId;
    @ApiModelProperty("")
    private String plateName;
    @ApiModelProperty("")
    private Integer replyCount;
    @ApiModelProperty("")
    private String posterName;
    @ApiModelProperty("")
    private String posterPicture;
    @ApiModelProperty("")
    private Integer thumbupCount;
    @ApiModelProperty("")
    private Date lastModifyTime;



    public String getTitle() {
    return title;
    }

    public void setTitle(String title) {
        this.title = title;
        }


    public String getInfo() {
    return info;
    }

    public void setInfo(String info) {
        this.info = info;
        }


    public Date getPublishTime() {
    return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
        }


    public Integer getPosterId() {
    return posterId;
    }

    public void setPosterId(Integer posterId) {
        this.posterId = posterId;
        }


    public Integer getIfGood() {
    return ifGood;
    }

    public void setIfGood(Integer ifGood) {
        this.ifGood = ifGood;
        }


    public Integer getIfDelete() {
    return ifDelete;
    }

    public void setIfDelete(Integer ifDelete) {
        this.ifDelete = ifDelete;
        }


    public Integer getPlateId() {
    return plateId;
    }

    public void setPlateId(Integer plateId) {
        this.plateId = plateId;
        }


    public String getPlateName() {
    return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName;
        }


    public Integer getReplyCount() {
    return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
        }


    public String getPosterName() {
    return posterName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
        }


    public String getPosterPicture() {
    return posterPicture;
    }

    public void setPosterPicture(String posterPicture) {
        this.posterPicture = posterPicture;
        }


    public Integer getThumbupCount() {
    return thumbupCount;
    }

    public void setThumbupCount(Integer thumbupCount) {
        this.thumbupCount = thumbupCount;
        }


    public Date getLastModifyTime() {
    return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        }



}
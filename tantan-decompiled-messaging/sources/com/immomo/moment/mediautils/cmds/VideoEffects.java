package com.immomo.moment.mediautils.cmds;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class VideoEffects implements Serializable {

    @SerializedName("timeRangeScale")
    private List<TimeRangeScale> timeRangeScales;

    @SerializedName("cut")
    private List<VideoCut> videoCuts;

    @SerializedName("videoFilter")
    private List<VideoFilter> videoFilters;

    public List<TimeRangeScale> getTimeRangeScales() {
        return this.timeRangeScales;
    }

    public List<VideoCut> getVideoCuts() {
        return this.videoCuts;
    }

    public List<VideoFilter> getVideoFilters() {
        return this.videoFilters;
    }

    public void setTimeRangeScales(TimeRangeScale... timeRangeScaleArr) {
        if (timeRangeScaleArr == null || timeRangeScaleArr.length == 0) {
            return;
        }
        this.timeRangeScales = new ArrayList();
        for (TimeRangeScale timeRangeScale : timeRangeScaleArr) {
            if (timeRangeScale != null) {
                this.timeRangeScales.add(timeRangeScale);
            }
        }
    }

    public void setVideoCuts(VideoCut... videoCutArr) {
        if (videoCutArr == null || videoCutArr.length == 0) {
            return;
        }
        this.videoCuts = new ArrayList();
        for (VideoCut videoCut : videoCutArr) {
            if (videoCut != null) {
                this.videoCuts.add(videoCut);
            }
        }
    }

    public void setVideoFilters(VideoFilter... videoFilterArr) {
        if (videoFilterArr == null || videoFilterArr.length == 0) {
            return;
        }
        this.videoFilters = new ArrayList();
        for (VideoFilter videoFilter : videoFilterArr) {
            if (videoFilter != null) {
                this.videoFilters.add(videoFilter);
            }
        }
    }

    public void setTimeRangeScales(List<TimeRangeScale> list) {
        this.timeRangeScales = list;
    }

    public void setVideoCuts(List<VideoCut> list) {
        this.videoCuts = list;
    }

    public void setVideoFilters(List<VideoFilter> list) {
        this.videoFilters = list;
    }
}

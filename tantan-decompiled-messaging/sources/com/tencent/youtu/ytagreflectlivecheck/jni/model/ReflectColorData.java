package com.tencent.youtu.ytagreflectlivecheck.jni.model;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ReflectColorData {
    public long begin_time;
    public long changepoint_time;
    public ArrayList<Long> changepoint_time_list;
    public int config_begin;
    public int frame_num;
    public int height;
    public ArrayList<ColorImgData> images_data;
    public int landmark_num;
    public String log;
    public float offset_sys;
    public String reflect_video;
    public String version;
    public int width;

    public long getBegin_time() {
        return this.begin_time;
    }

    public long getChangepoint_time() {
        return this.changepoint_time;
    }

    public int getConfig_begin() {
        return this.config_begin;
    }

    public int getFrame_num() {
        return this.frame_num;
    }

    public int getHeight() {
        return this.height;
    }

    public ArrayList<ColorImgData> getImages_data() {
        return this.images_data;
    }

    public int getLandmark_num() {
        return this.landmark_num;
    }

    public String getLog() {
        return this.log;
    }

    public float getOffset_sys() {
        return this.offset_sys;
    }

    public String getReflect_video() {
        return this.reflect_video;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBegin_time(long j) {
        this.begin_time = j;
    }

    public void setChangepoint_time(long j) {
        this.changepoint_time = j;
    }

    public void setConfig_begin(int i) {
        this.config_begin = i;
    }

    public void setFrame_num(int i) {
        this.frame_num = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImages_data(ArrayList<ColorImgData> arrayList) {
        this.images_data = arrayList;
    }

    public void setLandmark_num(int i) {
        this.landmark_num = i;
    }

    public void setLog(String str) {
        this.log = str;
    }

    public void setOffset_sys(float f) {
        this.offset_sys = f;
    }

    public void setReflectVideo(String str) {
        this.reflect_video = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}

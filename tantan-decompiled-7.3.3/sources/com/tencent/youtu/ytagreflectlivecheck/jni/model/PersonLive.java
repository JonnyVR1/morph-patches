package com.tencent.youtu.ytagreflectlivecheck.jni.model;

import com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class PersonLive {
    public String app_id = "";
    public String client_version;
    public String color_data;
    public ArrayList<FaceFrame> frames;
    public int platform;
    public ReflectColorData reflect_data;
    public LiveStyleRequester.SeleceData select_data;

    public String getColor_data() {
        return this.color_data;
    }

    public ArrayList<FaceFrame> getFrames() {
        return this.frames;
    }

    public int getPlatform() {
        return this.platform;
    }

    public ReflectColorData getReflect_data() {
        return this.reflect_data;
    }

    public void setColor_data(String str) {
        this.color_data = str;
    }

    public void setFrames(ArrayList<FaceFrame> arrayList) {
        this.frames = arrayList;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setReflect_data(ReflectColorData reflectColorData) {
        this.reflect_data = reflectColorData;
    }
}

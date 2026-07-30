package com.immomo.velib.anim.model;

import android.text.TextUtils;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p149l.qek0;

/* JADX INFO: loaded from: classes7.dex */
public class VideoEffectModel {
    private Element avatar;
    private List<Element> elements;
    private int height;
    private Location location;

    @SerializedName("loopON")
    private boolean loopOn;

    @SerializedName("mix_settings")
    private MixSetting mixSetting;
    private int originVideoWidth;
    private List<PostProcessingModel> postProcessing;
    private Element text;
    private String video;
    private String videoFolder;
    private int width;

    public static String getConfigPath(String str) {
        return str + "/config.json";
    }

    public static VideoEffectModel parseByPath(String str) {
        String strM174220f = qek0.m174220f(getConfigPath(str));
        VideoEffectModel videoEffectModel = null;
        if (TextUtils.isEmpty(strM174220f)) {
            return null;
        }
        try {
            videoEffectModel = (VideoEffectModel) new Gson().fromJson(strM174220f, VideoEffectModel.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (videoEffectModel != null) {
            videoEffectModel.setVideoFolder(str);
            if (videoEffectModel.getAvatar() != null) {
                videoEffectModel.getAvatar().setFolder(str);
            }
            if (videoEffectModel.getText() != null) {
                videoEffectModel.getText().setFolder(str);
            }
            if (videoEffectModel.getElements() != null) {
                for (Element element : videoEffectModel.getElements()) {
                    int i = videoEffectModel.width;
                    if (i == 0) {
                        i = 720;
                    }
                    element.vWidth = i;
                    int i2 = videoEffectModel.height;
                    if (i2 == 0) {
                        i2 = EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK;
                    }
                    element.vHeight = i2;
                    element.setFolder(str);
                }
            }
        }
        return videoEffectModel;
    }

    public Element getAvatar() {
        return this.avatar;
    }

    public List<Element> getElements() {
        return this.elements;
    }

    public int getHeight() {
        return this.height;
    }

    public Location getLocation() {
        return this.location;
    }

    public MixSetting getMixSetting() {
        return this.mixSetting;
    }

    public int getOriginVideoWidth() {
        return this.originVideoWidth;
    }

    public List<PostProcessingModel> getPostProcessing() {
        return this.postProcessing;
    }

    public Element getText() {
        return this.text;
    }

    public String getVideo() {
        return this.video;
    }

    public String getVideoFolder() {
        return this.videoFolder;
    }

    public String getVideoPath() {
        return this.videoFolder + "/" + this.video;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isLoopOn() {
        return this.loopOn;
    }

    public void setAvatar(Element element) {
        this.avatar = element;
    }

    public void setElements(List<Element> list) {
        this.elements = list;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setLoopOn(boolean z) {
        this.loopOn = z;
    }

    public void setMixSetting(MixSetting mixSetting) {
        this.mixSetting = mixSetting;
    }

    public void setOriginVideoWidth(int i) {
        this.originVideoWidth = i;
    }

    public void setPostProcessing(List<PostProcessingModel> list) {
        this.postProcessing = list;
    }

    public void setText(Element element) {
        this.text = element;
    }

    public void setVideo(String str) {
        this.video = str;
    }

    public void setVideoFolder(String str) {
        this.videoFolder = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}

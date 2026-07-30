package com.tantanapp.media.ttmediaeffect.video;

import com.immomo.velib.anim.model.Element;
import com.immomo.velib.anim.model.Location;
import com.immomo.velib.anim.model.PostProcessingModel;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class VideoEffectModel {
    private com.immomo.velib.anim.model.VideoEffectModel realVideoEffectModel;

    public VideoEffectModel(com.immomo.velib.anim.model.VideoEffectModel videoEffectModel) {
        if (videoEffectModel == null) {
            this.realVideoEffectModel = new com.immomo.velib.anim.model.VideoEffectModel();
        } else {
            this.realVideoEffectModel = videoEffectModel;
        }
    }

    public static String getConfigPath(String str) {
        return com.immomo.velib.anim.model.VideoEffectModel.getConfigPath(str);
    }

    public static VideoEffectModel parseByPath(String str) {
        return new VideoEffectModel(com.immomo.velib.anim.model.VideoEffectModel.parseByPath(str));
    }

    public int getAlphaType() {
        return this.realVideoEffectModel.getAlphaType();
    }

    public Element getAvatar() {
        return this.realVideoEffectModel.getAvatar();
    }

    public List<Element> getElements() {
        return this.realVideoEffectModel.getElements();
    }

    public int getHeight() {
        return this.realVideoEffectModel.getHeight();
    }

    public Location getLocation() {
        return this.realVideoEffectModel.getLocation();
    }

    public List<PostProcessingModel> getPostProcessing() {
        return this.realVideoEffectModel.getPostProcessing();
    }

    public com.immomo.velib.anim.model.VideoEffectModel getRealVidelEffectModel() {
        return this.realVideoEffectModel;
    }

    public Element getText() {
        return this.realVideoEffectModel.getText();
    }

    public String getVideo() {
        return this.realVideoEffectModel.getVideo();
    }

    public String getVideoFolder() {
        return this.realVideoEffectModel.getVideoFolder();
    }

    public int getWidth() {
        return this.realVideoEffectModel.getWidth();
    }

    public void setAlphaType(int i) {
        this.realVideoEffectModel.setAlphaType(i);
    }

    public void setAvatar(Element element) {
        this.realVideoEffectModel.setAvatar(element);
    }

    public void setElements(List<Element> list) {
        this.realVideoEffectModel.setElements(list);
    }

    public void setHeight(int i) {
        this.realVideoEffectModel.setHeight(i);
    }

    public void setLocation(Location location) {
        this.realVideoEffectModel.setLocation(location);
    }

    public void setPostProcessing(List<PostProcessingModel> list) {
        this.realVideoEffectModel.setPostProcessing(list);
    }

    public void setText(Element element) {
        this.realVideoEffectModel.setText(element);
    }

    public void setVideo(String str) {
        this.realVideoEffectModel.setVideo(str);
    }

    public void setVideoFolder(String str) {
        this.realVideoEffectModel.setVideoFolder(str);
    }

    public void setWidth(int i) {
        this.realVideoEffectModel.setWidth(i);
    }

    public VideoEffectModel() {
        this.realVideoEffectModel = new com.immomo.velib.anim.model.VideoEffectModel();
    }
}

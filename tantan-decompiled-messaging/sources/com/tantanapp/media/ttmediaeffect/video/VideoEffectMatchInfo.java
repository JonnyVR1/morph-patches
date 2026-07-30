package com.tantanapp.media.ttmediaeffect.video;

/* JADX INFO: loaded from: classes13.dex */
public class VideoEffectMatchInfo {
    private com.immomo.velib.anim.model.VideoEffectMatchInfo realEffectMatchInfo;

    public VideoEffectMatchInfo(com.immomo.velib.anim.model.VideoEffectMatchInfo videoEffectMatchInfo) {
        if (videoEffectMatchInfo != null) {
            this.realEffectMatchInfo = videoEffectMatchInfo;
        } else {
            this.realEffectMatchInfo = new com.immomo.velib.anim.model.VideoEffectMatchInfo("", "", "");
        }
    }

    public String getId() {
        return this.realEffectMatchInfo.getId();
    }

    public String getImgId() {
        return this.realEffectMatchInfo.getImgId();
    }

    public com.immomo.velib.anim.model.VideoEffectMatchInfo getRealEffectMatchInfo() {
        return this.realEffectMatchInfo;
    }

    public String getText() {
        return this.realEffectMatchInfo.getText();
    }

    public void setId(String str) {
        this.realEffectMatchInfo.setId(str);
    }

    public void setImgId(String str) {
        this.realEffectMatchInfo.setImgId(str);
    }

    public void setText(String str) {
        this.realEffectMatchInfo.setText(str);
    }

    public VideoEffectMatchInfo(String str, String str2, String str3) {
        this.realEffectMatchInfo = new com.immomo.velib.anim.model.VideoEffectMatchInfo(str, str2, str3);
    }
}

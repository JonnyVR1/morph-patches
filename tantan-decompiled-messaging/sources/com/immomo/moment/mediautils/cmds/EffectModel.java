package com.immomo.moment.mediautils.cmds;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import p149l.upq;

/* JADX INFO: loaded from: classes7.dex */
public class EffectModel implements Serializable {

    @SerializedName("audio")
    private AudioEffects audioEffects;

    @SerializedName("media")
    private String mediaPath;

    @SerializedName("effects")
    private VideoEffects videoEffects;

    public static EffectModel getEffectModel(String str) {
        return (EffectModel) upq.m194907b().m194908a(str, EffectModel.class);
    }

    public static String toEffectCmd(EffectModel effectModel) {
        return upq.m194907b().m194910d(effectModel);
    }

    public AudioEffects getAudioEffects() {
        return this.audioEffects;
    }

    public String getMediaPath() {
        return this.mediaPath;
    }

    public VideoEffects getVideoEffects() {
        return this.videoEffects;
    }

    public void setAudioEffects(AudioEffects audioEffects) {
        this.audioEffects = audioEffects;
    }

    public void setMediaPath(String str) {
        this.mediaPath = str;
    }

    public void setVideoEffects(VideoEffects videoEffects) {
        this.videoEffects = videoEffects;
    }
}

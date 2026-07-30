package com.immomo.moment.mediautils.cmds;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.data.OMSSizeType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AudioEffects implements Serializable {

    @SerializedName(Constants.KEY_BG)
    private List<AudioBackground> audioBackgrounds;

    @SerializedName("source")
    private C3989a audioSource;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.cmds.AudioEffects$a */
    public static class C3989a {

        @SerializedName("cycle")
        private boolean cycle;

        @SerializedName(OMSSizeType.ratio)
        private float ratio;

        /* JADX INFO: renamed from: a */
        public float m19693a() {
            return this.ratio;
        }

        /* JADX INFO: renamed from: b */
        public void m19694b(boolean z) {
            this.cycle = z;
        }

        /* JADX INFO: renamed from: c */
        public void m19695c(float f) {
            this.ratio = f;
        }
    }

    public List<AudioBackground> getAudioBackgrounds() {
        return this.audioBackgrounds;
    }

    public C3989a getAudioSource() {
        return this.audioSource;
    }

    public void setAudioBackgrounds(AudioBackground... audioBackgroundArr) {
        if (audioBackgroundArr == null || audioBackgroundArr.length == 0) {
            return;
        }
        this.audioBackgrounds = new ArrayList();
        for (AudioBackground audioBackground : audioBackgroundArr) {
            if (audioBackground != null) {
                this.audioBackgrounds.add(audioBackground);
            }
        }
    }

    public void setAudioSource(C3989a c3989a) {
        this.audioSource = c3989a;
    }

    public void setAudioBackgrounds(List<AudioBackground> list) {
        this.audioBackgrounds = list;
    }
}

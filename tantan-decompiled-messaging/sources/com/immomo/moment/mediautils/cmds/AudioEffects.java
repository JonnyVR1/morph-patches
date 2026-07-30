package com.immomo.moment.mediautils.cmds;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.data.OMSSizeType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AudioEffects implements Serializable {

    @SerializedName(Constants.KEY_BG)
    private List<AudioBackground> audioBackgrounds;

    @SerializedName("source")
    private C3846a audioSource;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.cmds.AudioEffects$a */
    public static class C3846a {

        @SerializedName("cycle")
        private boolean cycle;

        @SerializedName(OMSSizeType.ratio)
        private float ratio;

        /* JADX INFO: renamed from: a */
        public float m18713a() {
            return this.ratio;
        }

        /* JADX INFO: renamed from: b */
        public void m18714b(boolean z) {
            this.cycle = z;
        }

        /* JADX INFO: renamed from: c */
        public void m18715c(float f) {
            this.ratio = f;
        }
    }

    public List<AudioBackground> getAudioBackgrounds() {
        return this.audioBackgrounds;
    }

    public C3846a getAudioSource() {
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

    public void setAudioSource(C3846a c3846a) {
        this.audioSource = c3846a;
    }

    public void setAudioBackgrounds(List<AudioBackground> list) {
        this.audioBackgrounds = list;
    }
}

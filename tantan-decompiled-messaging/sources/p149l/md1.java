package p149l;

import com.immomo.mediacore.audio.AudioVolumeWeight;

/* JADX INFO: loaded from: classes13.dex */
public class md1 {

    /* JADX INFO: renamed from: a */
    public AudioVolumeWeight f133203a;

    public md1(AudioVolumeWeight audioVolumeWeight) {
        if (audioVolumeWeight != null) {
            this.f133203a = audioVolumeWeight;
        } else {
            this.f133203a = new AudioVolumeWeight();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m154034a() {
        return this.f133203a.uid;
    }

    /* JADX INFO: renamed from: b */
    public float m154035b() {
        return this.f133203a.volume;
    }

    public md1() {
        this.f133203a = new AudioVolumeWeight();
    }
}

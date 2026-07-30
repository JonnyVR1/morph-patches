package p153l;

import com.immomo.mediacore.audio.AudioVolumeWeight;

/* JADX INFO: loaded from: classes13.dex */
public class td1 {

    /* JADX INFO: renamed from: a */
    public AudioVolumeWeight f173293a;

    public td1(AudioVolumeWeight audioVolumeWeight) {
        if (audioVolumeWeight != null) {
            this.f173293a = audioVolumeWeight;
        } else {
            this.f173293a = new AudioVolumeWeight();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m190565a() {
        return this.f173293a.uid;
    }

    /* JADX INFO: renamed from: b */
    public float m190566b() {
        return this.f173293a.volume;
    }

    public td1() {
        this.f173293a = new AudioVolumeWeight();
    }
}

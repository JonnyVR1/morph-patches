package tv.danmaku.ijk.media.source.audio;

import com.immomo.mediacore.audio.AudioQuality;
import com.immomo.mediacore.sink.SinkBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class audioSource {

    /* JADX INFO: renamed from: a */
    protected AudioQuality f208388a;

    /* JADX INFO: renamed from: b */
    protected AudioQuality f208389b;

    /* JADX INFO: renamed from: c */
    private List<SinkBase.PcmDateCallback> f208390c;

    /* JADX INFO: renamed from: d */
    private List<SinkBase.ExtPcmDateCallback> f208391d;

    /* JADX INFO: renamed from: e */
    int f208392e;

    public audioSource() {
        AudioQuality audioQualityM223810clone = AudioQuality.DEFAULT_AUDIO_QUALITY.m223810clone();
        this.f208388a = audioQualityM223810clone;
        this.f208389b = audioQualityM223810clone.m223810clone();
        this.f208390c = new ArrayList();
        this.f208391d = new ArrayList();
        this.f208392e = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m222338a() {
        this.f208390c.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m222339b(SinkBase.ExtPcmDateCallback extPcmDateCallback) {
        List<SinkBase.ExtPcmDateCallback> list = this.f208391d;
        if (list == null || extPcmDateCallback == null || !list.contains(extPcmDateCallback)) {
            return;
        }
        this.f208391d.remove(extPcmDateCallback);
    }

    /* JADX INFO: renamed from: c */
    public void m222340c(SinkBase.ExtPcmDateCallback extPcmDateCallback) {
        List<SinkBase.ExtPcmDateCallback> list = this.f208391d;
        if (list == null || extPcmDateCallback == null || list.contains(extPcmDateCallback)) {
            return;
        }
        this.f208391d.add(extPcmDateCallback);
    }

    /* JADX INFO: renamed from: d */
    public void mo222341d() {
    }
}

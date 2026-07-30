package tv.danmaku.ijk.media.source.audio;

import com.immomo.mediacore.audio.AudioQuality;
import com.immomo.mediacore.sink.SinkBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class audioSource {

    /* JADX INFO: renamed from: a */
    protected AudioQuality f209310a;

    /* JADX INFO: renamed from: b */
    protected AudioQuality f209311b;

    /* JADX INFO: renamed from: c */
    private List<SinkBase.PcmDateCallback> f209312c;

    /* JADX INFO: renamed from: d */
    private List<SinkBase.ExtPcmDateCallback> f209313d;

    /* JADX INFO: renamed from: e */
    int f209314e;

    public audioSource() {
        AudioQuality audioQualityM225056clone = AudioQuality.DEFAULT_AUDIO_QUALITY.m225056clone();
        this.f209310a = audioQualityM225056clone;
        this.f209311b = audioQualityM225056clone.m225056clone();
        this.f209312c = new ArrayList();
        this.f209313d = new ArrayList();
        this.f209314e = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m223584a() {
        this.f209312c.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m223585b(SinkBase.ExtPcmDateCallback extPcmDateCallback) {
        List<SinkBase.ExtPcmDateCallback> list = this.f209313d;
        if (list == null || extPcmDateCallback == null || !list.contains(extPcmDateCallback)) {
            return;
        }
        this.f209313d.remove(extPcmDateCallback);
    }

    /* JADX INFO: renamed from: c */
    public void m223586c(SinkBase.ExtPcmDateCallback extPcmDateCallback) {
        List<SinkBase.ExtPcmDateCallback> list = this.f209313d;
        if (list == null || extPcmDateCallback == null || list.contains(extPcmDateCallback)) {
            return;
        }
        this.f209313d.add(extPcmDateCallback);
    }

    /* JADX INFO: renamed from: d */
    public void mo223587d() {
    }
}

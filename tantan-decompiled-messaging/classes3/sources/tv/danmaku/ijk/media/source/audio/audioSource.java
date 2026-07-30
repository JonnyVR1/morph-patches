package tv.danmaku.ijk.media.source.audio;

import com.immomo.mediacore.audio.AudioQuality;
import com.immomo.mediacore.sink.SinkBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class audioSource {

    /* JADX INFO: renamed from: a */
    protected AudioQuality f12013a;

    /* JADX INFO: renamed from: b */
    protected AudioQuality f12014b;

    /* JADX INFO: renamed from: c */
    private List<SinkBase.PcmDateCallback> f12015c;

    /* JADX INFO: renamed from: d */
    private List<SinkBase.ExtPcmDateCallback> f12016d;

    /* JADX INFO: renamed from: e */
    int f12017e;

    public audioSource() {
        AudioQuality audioQualityClone = AudioQuality.DEFAULT_AUDIO_QUALITY.clone();
        this.f12013a = audioQualityClone;
        this.f12014b = audioQualityClone.clone();
        this.f12015c = new ArrayList();
        this.f12016d = new ArrayList();
        this.f12017e = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m10809a() {
        this.f12015c.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m10810b(SinkBase.ExtPcmDateCallback extPcmDateCallback) {
        List<SinkBase.ExtPcmDateCallback> list = this.f12016d;
        if (list == null || extPcmDateCallback == null || !list.contains(extPcmDateCallback)) {
            return;
        }
        this.f12016d.remove(extPcmDateCallback);
    }

    /* JADX INFO: renamed from: c */
    public void m10811c(SinkBase.ExtPcmDateCallback extPcmDateCallback) {
        List<SinkBase.ExtPcmDateCallback> list = this.f12016d;
        if (list == null || extPcmDateCallback == null || list.contains(extPcmDateCallback)) {
            return;
        }
        this.f12016d.add(extPcmDateCallback);
    }

    /* JADX INFO: renamed from: d */
    public void mo10812d() {
    }
}

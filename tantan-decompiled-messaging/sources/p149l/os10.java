package p149l;

import com.p046p1.mobile.putong.live.external.intl.music.MusicScanningItemView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;

/* JADX INFO: loaded from: classes13.dex */
public class os10 extends d1q<MusicScanningItemView> {

    /* JADX INFO: renamed from: a */
    public IntlMusicBean f145370a;

    /* JADX INFO: renamed from: b */
    public boolean f145371b;

    /* JADX INFO: renamed from: c */
    public boolean f145372c;

    public os10(IntlMusicBean intlMusicBean) {
        this.f145370a = intlMusicBean;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(MusicScanningItemView musicScanningItemView) {
        super.mo70566u(musicScanningItemView);
        musicScanningItemView.m70237h0(this.f145370a, this.f145371b, this.f145372c);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162802v0;
    }
}

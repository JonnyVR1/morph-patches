package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.external.intl.music.MusicPlaylistItemView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;

/* JADX INFO: loaded from: classes13.dex */
public class sr10 extends d1q<MusicPlaylistItemView> {

    /* JADX INFO: renamed from: a */
    public IntlMusicBean f166034a;

    /* JADX INFO: renamed from: b */
    public boolean f166035b;

    /* JADX INFO: renamed from: c */
    public boolean f166036c;

    /* JADX INFO: renamed from: d */
    public View.OnClickListener f166037d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f166038e;

    /* JADX INFO: renamed from: f */
    public int f166039f;

    public sr10(IntlMusicBean intlMusicBean) {
        this.f166034a = intlMusicBean;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(MusicPlaylistItemView musicPlaylistItemView) {
        super.mo70566u(musicPlaylistItemView);
        musicPlaylistItemView.m70235i0(this.f166039f, this.f166034a, this.f166035b, this.f166036c, this.f166037d, this.f166038e);
    }

    /* JADX INFO: renamed from: I */
    public void m185620I(View.OnClickListener onClickListener) {
        this.f166038e = onClickListener;
    }

    /* JADX INFO: renamed from: J */
    public void m185621J(View.OnClickListener onClickListener) {
        this.f166037d = onClickListener;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162799u0;
    }
}

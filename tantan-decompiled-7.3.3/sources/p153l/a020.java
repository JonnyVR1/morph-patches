package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.external.intl.music.MusicPlaylistItemView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;

/* JADX INFO: loaded from: classes9.dex */
public class a020 extends d3q<MusicPlaylistItemView> {

    /* JADX INFO: renamed from: a */
    public IntlMusicBean f67679a;

    /* JADX INFO: renamed from: b */
    public boolean f67680b;

    /* JADX INFO: renamed from: c */
    public boolean f67681c;

    /* JADX INFO: renamed from: d */
    public View.OnClickListener f67682d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f67683e;

    /* JADX INFO: renamed from: f */
    public int f67684f;

    public a020(IntlMusicBean intlMusicBean) {
        this.f67679a = intlMusicBean;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(MusicPlaylistItemView musicPlaylistItemView) {
        super.mo71749u(musicPlaylistItemView);
        musicPlaylistItemView.m71418i0(this.f67684f, this.f67679a, this.f67680b, this.f67681c, this.f67682d, this.f67683e);
    }

    /* JADX INFO: renamed from: I */
    public void m95294I(View.OnClickListener onClickListener) {
        this.f67683e = onClickListener;
    }

    /* JADX INFO: renamed from: J */
    public void m95295J(View.OnClickListener onClickListener) {
        this.f67682d = onClickListener;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193913u0;
    }
}

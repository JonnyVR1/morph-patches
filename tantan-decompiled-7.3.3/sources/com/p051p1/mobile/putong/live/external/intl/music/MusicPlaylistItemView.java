package com.p051p1.mobile.putong.live.external.intl.music;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.kdu;
import p153l.ldc0;
import p153l.m120;
import p153l.nbc0;
import p153l.qa00;
import p153l.qnp0;

/* JADX INFO: loaded from: classes9.dex */
public class MusicPlaylistItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f46544d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f46545e;

    /* JADX INFO: renamed from: f */
    public TextView f46546f;

    /* JADX INFO: renamed from: g */
    public VImage f46547g;

    /* JADX INFO: renamed from: h */
    public View f46548h;

    /* JADX INFO: renamed from: i */
    public TextView f46549i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f46550j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.music.MusicPlaylistItemView$a */
    public class C12712a extends AnimListener {
        public C12712a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            MusicPlaylistItemView.this.f46550j.pauseAnimation();
            MusicPlaylistItemView.this.f46550j.stepToFrame(0.0f, false);
        }
    }

    public MusicPlaylistItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public void m71418i0(int i, IntlMusicBean intlMusicBean, boolean z, boolean z2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        m120.m156551a(intlMusicBean.filePath, this.f46545e, nbc0.f141104H);
        this.f46544d.setText(intlMusicBean.title);
        this.f46546f.setText(kdu.m149281Z(intlMusicBean.duration / 1000));
        bnl0.m105524M(this.f46547g, (z || i == 0) ? false : true);
        bnl0.m105509E0(this.f46547g, onClickListener);
        bnl0.m105509E0(this.f46548h, onClickListener2);
        this.f46548h.setSelected(z2);
        this.f46549i.setText(intlMusicBean.author);
        if (z) {
            bnl0.m105524M(this.f46547g, false);
            bnl0.m105524M(this.f46548h, true);
        } else {
            bnl0.m105524M(this.f46548h, false);
            bnl0.m105524M(this.f46547g, i != 0);
            this.f46547g.setImageResource(nbc0.f141122Q);
        }
        if (intlMusicBean.isPlaying()) {
            this.f46550j.stopAnimation(true);
            SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/63a64560-95e9-444b-8252-cf3436101be414").autoPlay(true).repeatCount(-1).into(this.f46550j);
            bnl0.m105524M(this.f46550j, true);
            return;
        }
        boolean zIsPaused = intlMusicBean.isPaused();
        SVGAnimationView sVGAnimationView = this.f46550j;
        if (!zIsPaused) {
            sVGAnimationView.stopAnimation(true);
            bnl0.m105524M(this.f46550j, false);
        } else {
            if (sVGAnimationView.isAnimating()) {
                this.f46550j.pauseAnimation();
            } else {
                SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/63a64560-95e9-444b-8252-cf3436101be414").autoPlay(true).repeatCount(-1).animListener(new C12712a()).into(this.f46550j);
            }
            bnl0.m105524M(this.f46550j, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f46544d = (TextView) findViewById(ldc0.f131496Q0);
        this.f46545e = (VDraweeView) findViewById(ldc0.f131492P);
        this.f46546f = (TextView) findViewById(ldc0.f131483M0);
        this.f46547g = (VImage) findViewById(ldc0.f131506T1);
        this.f46548h = findViewById(ldc0.f131619x1);
        this.f46549i = (TextView) findViewById(ldc0.f131475K0);
        this.f46550j = (SVGAnimationView) findViewById(ldc0.f131557i);
        qnp0.m177261d1(this.f46545e, qa00.m175859d(8.0f));
    }

    public MusicPlaylistItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicPlaylistItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

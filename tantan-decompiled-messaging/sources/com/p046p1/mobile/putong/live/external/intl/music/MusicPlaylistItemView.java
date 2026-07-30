package com.p046p1.mobile.putong.live.external.intl.music;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.et10;
import p149l.f5c0;
import p149l.h3c0;
import p149l.jbu;
import p149l.mep0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class MusicPlaylistItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public TextView f45696d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f45697e;

    /* JADX INFO: renamed from: f */
    public TextView f45698f;

    /* JADX INFO: renamed from: g */
    public VImage f45699g;

    /* JADX INFO: renamed from: h */
    public View f45700h;

    /* JADX INFO: renamed from: i */
    public TextView f45701i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f45702j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.music.MusicPlaylistItemView$a */
    public class C12549a extends AnimListener {
        public C12549a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            MusicPlaylistItemView.this.f45702j.pauseAnimation();
            MusicPlaylistItemView.this.f45702j.stepToFrame(0.0f, false);
        }
    }

    public MusicPlaylistItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public void m70235i0(int i, IntlMusicBean intlMusicBean, boolean z, boolean z2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        et10.m117969a(intlMusicBean.filePath, this.f45697e, h3c0.f105613H);
        this.f45696d.setText(intlMusicBean.title);
        this.f45698f.setText(jbu.m140818Z(intlMusicBean.duration / 1000));
        xdl0.m208344M(this.f45699g, (z || i == 0) ? false : true);
        xdl0.m208329E0(this.f45699g, onClickListener);
        xdl0.m208329E0(this.f45700h, onClickListener2);
        this.f45700h.setSelected(z2);
        this.f45701i.setText(intlMusicBean.author);
        if (z) {
            xdl0.m208344M(this.f45699g, false);
            xdl0.m208344M(this.f45700h, true);
        } else {
            xdl0.m208344M(this.f45700h, false);
            xdl0.m208344M(this.f45699g, i != 0);
            this.f45699g.setImageResource(h3c0.f105631Q);
        }
        if (intlMusicBean.isPlaying()) {
            this.f45702j.stopAnimation(true);
            SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/63a64560-95e9-444b-8252-cf3436101be414").autoPlay(true).repeatCount(-1).into(this.f45702j);
            xdl0.m208344M(this.f45702j, true);
            return;
        }
        boolean zIsPaused = intlMusicBean.isPaused();
        SVGAnimationView sVGAnimationView = this.f45702j;
        if (!zIsPaused) {
            sVGAnimationView.stopAnimation(true);
            xdl0.m208344M(this.f45702j, false);
        } else {
            if (sVGAnimationView.isAnimating()) {
                this.f45702j.pauseAnimation();
            } else {
                SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/63a64560-95e9-444b-8252-cf3436101be414").autoPlay(true).repeatCount(-1).animListener(new C12549a()).into(this.f45702j);
            }
            xdl0.m208344M(this.f45702j, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f45696d = (TextView) findViewById(f5c0.f95039Q0);
        this.f45697e = (VDraweeView) findViewById(f5c0.f95035P);
        this.f45698f = (TextView) findViewById(f5c0.f95026M0);
        this.f45699g = (VImage) findViewById(f5c0.f95049T1);
        this.f45700h = findViewById(f5c0.f95162x1);
        this.f45701i = (TextView) findViewById(f5c0.f95018K0);
        this.f45702j = (SVGAnimationView) findViewById(f5c0.f95100i);
        mep0.m154302d1(this.f45697e, t100.m186890d(8.0f));
    }

    public MusicPlaylistItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicPlaylistItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

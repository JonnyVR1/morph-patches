package com.p051p1.mobile.putong.feed.newui.camera;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import p137rx.C22421c;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.lbc0;
import p153l.psd0;
import p153l.qcj;
import p153l.rv10;
import p153l.uqb0;
import p153l.y20;
import p153l.yv10;

/* JADX INFO: loaded from: classes13.dex */
public class MusicAggregateHeader extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f40191a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f40192b;

    /* JADX INFO: renamed from: c */
    public ImageView f40193c;

    /* JADX INFO: renamed from: d */
    public TextView f40194d;

    /* JADX INFO: renamed from: e */
    public TextView f40195e;

    /* JADX INFO: renamed from: f */
    public TextView f40196f;

    /* JADX INFO: renamed from: g */
    public ObjectAnimator f40197g;

    /* JADX INFO: renamed from: h */
    public rv10 f40198h;

    /* JADX INFO: renamed from: i */
    public y20<MusicContent> f40199i;

    /* JADX INFO: renamed from: j */
    public Music f40200j;

    public MusicAggregateHeader(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m62264g(View view) {
        yv10.m217482a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final MusicAggregateAct m62265h() {
        return (MusicAggregateAct) getContext();
    }

    /* JADX INFO: renamed from: i */
    public final void m62266i() {
        bnl0.m105593z(this.f40196f);
        m62268k();
        m62267j();
    }

    /* JADX INFO: renamed from: j */
    public final void m62267j() {
        this.f40192b.setOnClickListener(new View.OnClickListener() { // from class: l.sv10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170786a.m62272o(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m62268k() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f40193c, BLiveGiftItem.TYPE_ROTATION, 0.0f, 360.0f);
        this.f40197g = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1200L);
        this.f40197g.setInterpolator(new LinearInterpolator());
        this.f40197g.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m62269l(Bitmap bitmap) {
        this.f40191a.setImageBitmap(bitmap);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m62270m(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        final int color = Color.parseColor("#aa383e46");
        final int i = 24;
        C22421c.just(bitmap).map(new qcj() { // from class: l.wv10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bsj0.m106279o((Bitmap) obj, color, i);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173596G(new y20() { // from class: l.xv10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196347a.m62269l((Bitmap) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m62271n(View view) {
        m62273p();
    }

    /* JADX INFO: renamed from: o */
    public final void m62272o(View view) {
        m62276s(this.f40200j);
        Music music = this.f40200j;
        if (music.playState != 2) {
            return;
        }
        this.f40198h.m183241K(music, new y20() { // from class: l.tv10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176236a.m62274q((MusicContent) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62264g(this);
        m62266i();
    }

    /* JADX INFO: renamed from: p */
    public final void m62273p() {
        m62265h().startActivity(PhotoAlbumFeedAct.m65538X1(m62265h(), this.f40200j.owner, "mute_list", -1, 2));
    }

    /* JADX INFO: renamed from: q */
    public final void m62274q(MusicContent musicContent) {
        y20<MusicContent> y20Var = this.f40199i;
        if (y20Var == null) {
            return;
        }
        y20Var.call(musicContent);
        this.f40200j.playState = 3;
        m62277t();
    }

    /* JADX INFO: renamed from: r */
    public void m62275r(Music music) {
        this.f40200j = music;
        if (TextUtils.equals(music.source, "default")) {
            this.f40194d.setText("@" + music.name);
            this.f40195e.setText(m62265h().getString(R$string.f39717B1));
            this.f40194d.setVisibility(0);
            this.f40196f.setVisibility(8);
        } else {
            this.f40195e.setText(music.name);
            this.f40194d.setVisibility(8);
            this.f40196f.setVisibility(0);
            this.f40196f.setText(music.describe);
        }
        uqb0.f180374G.m127115L0(this.f40192b, music.cover);
        uqb0.f180374G.m127108I(music.cover, new y20() { // from class: l.uv10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181107a.m62270m((Bitmap) obj);
            }
        });
        m62277t();
        this.f40194d.setOnClickListener(new View.OnClickListener() { // from class: l.vv10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185883a.m62271n(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m62276s(Music music) {
        if (music.playState == 1) {
            music.playState = 2;
        } else {
            music.playState = 1;
            m62265h().m62246E2();
        }
        m62277t();
    }

    /* JADX INFO: renamed from: t */
    public final void m62277t() {
        int i = lbc0.f131165v6;
        this.f40197g.cancel();
        this.f40193c.setRotation(0.0f);
        int i2 = this.f40200j.playState;
        if (i2 == 2) {
            i = lbc0.f131149t6;
            this.f40197g.start();
        } else if (i2 == 3) {
            i = lbc0.f131157u6;
        }
        this.f40193c.setImageResource(i);
    }

    public MusicAggregateHeader(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicAggregateHeader(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

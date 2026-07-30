package com.p046p1.mobile.putong.feed.newui.camera;

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
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import p133rx.C22306c;
import p147v.VDraweeView;
import p149l.e30;
import p149l.f3c0;
import p149l.jn10;
import p149l.mkd0;
import p149l.qib0;
import p149l.qn10;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class MusicAggregateHeader extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f39343a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f39344b;

    /* JADX INFO: renamed from: c */
    public ImageView f39345c;

    /* JADX INFO: renamed from: d */
    public TextView f39346d;

    /* JADX INFO: renamed from: e */
    public TextView f39347e;

    /* JADX INFO: renamed from: f */
    public TextView f39348f;

    /* JADX INFO: renamed from: g */
    public ObjectAnimator f39349g;

    /* JADX INFO: renamed from: h */
    public jn10 f39350h;

    /* JADX INFO: renamed from: i */
    public e30<MusicContent> f39351i;

    /* JADX INFO: renamed from: j */
    public Music f39352j;

    public MusicAggregateHeader(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m61080g(View view) {
        qn10.m175583a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final MusicAggregateAct m61081h() {
        return (MusicAggregateAct) getContext();
    }

    /* JADX INFO: renamed from: i */
    public final void m61082i() {
        xdl0.m208413z(this.f39348f);
        m61084k();
        m61083j();
    }

    /* JADX INFO: renamed from: j */
    public final void m61083j() {
        this.f39344b.setOnClickListener(new View.OnClickListener() { // from class: l.kn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123856a.m61088o(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m61084k() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f39345c, BLiveGiftItem.TYPE_ROTATION, 0.0f, 360.0f);
        this.f39349g = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1200L);
        this.f39349g.setInterpolator(new LinearInterpolator());
        this.f39349g.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m61085l(Bitmap bitmap) {
        this.f39343a.setImageBitmap(bitmap);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m61086m(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        final int color = Color.parseColor("#aa383e46");
        final int i = 24;
        C22306c.just(bitmap).map(new w9j() { // from class: l.on10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return yij0.m214959o((Bitmap) obj, color, i);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154955G(new e30() { // from class: l.pn10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150320a.m61085l((Bitmap) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m61087n(View view) {
        m61089p();
    }

    /* JADX INFO: renamed from: o */
    public final void m61088o(View view) {
        m61092s(this.f39352j);
        Music music = this.f39352j;
        if (music.playState != 2) {
            return;
        }
        this.f39350h.m142252K(music, new e30() { // from class: l.ln10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128955a.m61090q((MusicContent) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61080g(this);
        m61082i();
    }

    /* JADX INFO: renamed from: p */
    public final void m61089p() {
        m61081h().startActivity(PhotoAlbumFeedAct.m64355V1(m61081h(), this.f39352j.owner, "mute_list", -1, 2));
    }

    /* JADX INFO: renamed from: q */
    public final void m61090q(MusicContent musicContent) {
        e30<MusicContent> e30Var = this.f39351i;
        if (e30Var == null) {
            return;
        }
        e30Var.call(musicContent);
        this.f39352j.playState = 3;
        m61093t();
    }

    /* JADX INFO: renamed from: r */
    public void m61091r(Music music) {
        this.f39352j = music;
        if (TextUtils.equals(music.source, "default")) {
            this.f39346d.setText("@" + music.name);
            this.f39347e.setText(m61081h().getString(R$string.f38869B1));
            this.f39346d.setVisibility(0);
            this.f39348f.setVisibility(8);
        } else {
            this.f39347e.setText(music.name);
            this.f39346d.setVisibility(8);
            this.f39348f.setVisibility(0);
            this.f39348f.setText(music.describe);
        }
        qib0.f154691G.m102331L0(this.f39344b, music.cover);
        qib0.f154691G.m102324I(music.cover, new e30() { // from class: l.mn10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134727a.m61086m((Bitmap) obj);
            }
        });
        m61093t();
        this.f39346d.setOnClickListener(new View.OnClickListener() { // from class: l.nn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139691a.m61087n(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m61092s(Music music) {
        if (music.playState == 1) {
            music.playState = 2;
        } else {
            music.playState = 1;
            m61081h().m61061D2();
        }
        m61093t();
    }

    /* JADX INFO: renamed from: t */
    public final void m61093t() {
        int i = f3c0.f94647v6;
        this.f39349g.cancel();
        this.f39345c.setRotation(0.0f);
        int i2 = this.f39352j.playState;
        if (i2 == 2) {
            i = f3c0.f94631t6;
            this.f39349g.start();
        } else if (i2 == 3) {
            i = f3c0.f94639u6;
        }
        this.f39345c.setImageResource(i);
    }

    public MusicAggregateHeader(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicAggregateHeader(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

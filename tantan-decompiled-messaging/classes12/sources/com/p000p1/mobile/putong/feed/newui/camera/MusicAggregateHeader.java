package com.p000p1.mobile.putong.feed.newui.camera;

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
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import l.e30;
import l.mkd0;
import l.qib0;
import l.w9j;
import l.xdl0;
import l.yij0;
import p007l.f3c0;
import p007l.jn10;
import p007l.qn10;
import rx.c;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MusicAggregateHeader extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f804a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f805b;

    /* JADX INFO: renamed from: c */
    public ImageView f806c;

    /* JADX INFO: renamed from: d */
    public TextView f807d;

    /* JADX INFO: renamed from: e */
    public TextView f808e;

    /* JADX INFO: renamed from: f */
    public TextView f809f;

    /* JADX INFO: renamed from: g */
    public ObjectAnimator f810g;

    /* JADX INFO: renamed from: h */
    public jn10 f811h;

    /* JADX INFO: renamed from: i */
    public e30<MusicContent> f812i;

    /* JADX INFO: renamed from: j */
    public Music f813j;

    public MusicAggregateHeader(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m2013g(View view) {
        qn10.m13589a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final MusicAggregateAct m2014h() {
        return (MusicAggregateAct) getContext();
    }

    /* JADX INFO: renamed from: i */
    public final void m2015i() {
        xdl0.z(this.f809f);
        m2017k();
        m2016j();
    }

    /* JADX INFO: renamed from: j */
    public final void m2016j() {
        this.f805b.setOnClickListener(new View.OnClickListener() { // from class: l.kn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9747a.m2021o(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m2017k() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f806c, "rotation", 0.0f, 360.0f);
        this.f810g = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1200L);
        this.f810g.setInterpolator(new LinearInterpolator());
        this.f810g.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m2018l(Bitmap bitmap) {
        this.f804a.setImageBitmap(bitmap);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m2019m(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        final int color = Color.parseColor("#aa383e46");
        final int i = 24;
        c.just(bitmap).map(new w9j() { // from class: l.on10
            public final Object call(Object obj) {
                return yij0.o((Bitmap) obj, color, i);
            }
        }).compose(mkd0.C()).subscribe(mkd0.G(new e30() { // from class: l.pn10
            public final void call(Object obj) {
                this.f11889a.m2018l((Bitmap) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m2020n(View view) {
        m2022p();
    }

    /* JADX INFO: renamed from: o */
    public final void m2021o(View view) {
        m2025s(this.f813j);
        Music music = this.f813j;
        if (music.playState != 2) {
            return;
        }
        this.f811h.m11244K(music, new e30() { // from class: l.ln10
            public final void call(Object obj) {
                this.f10074a.m2023q((MusicContent) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2013g(this);
        m2015i();
    }

    /* JADX INFO: renamed from: p */
    public final void m2022p() {
        m2014h().startActivity(PhotoAlbumFeedAct.m5428V1(m2014h(), this.f813j.owner, "mute_list", -1, 2));
    }

    /* JADX INFO: renamed from: q */
    public final void m2023q(MusicContent musicContent) {
        e30<MusicContent> e30Var = this.f812i;
        if (e30Var == null) {
            return;
        }
        e30Var.call(musicContent);
        this.f813j.playState = 3;
        m2026t();
    }

    /* JADX INFO: renamed from: r */
    public void m2024r(Music music) {
        this.f813j = music;
        if (TextUtils.equals(music.source, "default")) {
            this.f807d.setText("@" + music.name);
            this.f808e.setText(m2014h().getString(R$string.f330B1));
            this.f807d.setVisibility(0);
            this.f809f.setVisibility(8);
        } else {
            this.f808e.setText(music.name);
            this.f807d.setVisibility(8);
            this.f809f.setVisibility(0);
            this.f809f.setText(music.describe);
        }
        qib0.G.L0(this.f805b, music.cover);
        qib0.G.I(music.cover, new e30() { // from class: l.mn10
            public final void call(Object obj) {
                this.f10518a.m2019m((Bitmap) obj);
            }
        });
        m2026t();
        this.f807d.setOnClickListener(new View.OnClickListener() { // from class: l.nn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10837a.m2020n(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m2025s(Music music) {
        if (music.playState == 1) {
            music.playState = 2;
        } else {
            music.playState = 1;
            m2014h().m1992D2();
        }
        m2026t();
    }

    /* JADX INFO: renamed from: t */
    public final void m2026t() {
        int i = f3c0.f7930v6;
        this.f810g.cancel();
        this.f806c.setRotation(0.0f);
        int i2 = this.f813j.playState;
        if (i2 == 2) {
            i = f3c0.f7914t6;
            this.f810g.start();
        } else if (i2 == 3) {
            i = f3c0.f7922u6;
        }
        this.f806c.setImageResource(i);
    }

    public MusicAggregateHeader(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicAggregateHeader(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p000p1.mobile.putong.feed.newui.camera;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import l.dac0;
import l.e30;
import l.e51;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.t100;
import l.w9j;
import l.xdl0;
import p007l.f3c0;
import p007l.kq10;
import p007l.kuv;
import p007l.pb4;
import p007l.up10;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MusicItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MusicItemView f828a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f829b;

    /* JADX INFO: renamed from: c */
    public ImageView f830c;

    /* JADX INFO: renamed from: d */
    public TextView f831d;

    /* JADX INFO: renamed from: e */
    public TextView f832e;

    /* JADX INFO: renamed from: f */
    public TextView f833f;

    /* JADX INFO: renamed from: g */
    public TextView f834g;

    /* JADX INFO: renamed from: h */
    public ImageView f835h;

    /* JADX INFO: renamed from: i */
    public ImageView f836i;

    /* JADX INFO: renamed from: j */
    public TextView f837j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1996b f838k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1995a f839l;

    /* JADX INFO: renamed from: m */
    public ObjectAnimator f840m;

    /* JADX INFO: renamed from: n */
    public dac0<MusicContent> f841n;

    /* JADX INFO: renamed from: o */
    public Music f842o;

    /* JADX INFO: renamed from: p */
    public int f843p;

    /* JADX INFO: renamed from: q */
    public ViewGroup f844q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicItemView$a */
    public interface InterfaceC1995a {
        /* JADX INFO: renamed from: a */
        void mo2116a(Music music, int i);

        /* JADX INFO: renamed from: b */
        boolean mo2117b(MusicContent musicContent, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicItemView$b */
    public interface InterfaceC1996b {
        /* JADX INFO: renamed from: a */
        void mo2118a(MusicContent musicContent, int i);
    }

    public MusicItemView(Context context) {
        super(context);
    }

    private String getDurationString() {
        int i = (int) this.f842o.audio.duration;
        return String.format("%02d:%02d", Integer.valueOf(i / 60), Integer.valueOf(i % 60));
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Boolean m2086A(Music music, MusicContent musicContent) {
        return Boolean.valueOf((this.f838k == null || musicContent == null || !TextUtils.equals(music.f242id, musicContent.id)) ? false : true);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m2087B(MusicContent musicContent) {
        this.f838k.mo2118a(musicContent, this.f843p);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m2088C(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zExists = new File(str).exists();
        Music music = this.f842o;
        if (!zExists) {
            music.cover = "";
        } else {
            music.cover = str;
            m2098M(str);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m2089D(final e30<MusicContent> e30Var) {
        e51.G(new Runnable() { // from class: l.zp10
            @Override // java.lang.Runnable
            public final void run() {
                this.f15822a.m2111v(e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m2090E(boolean z) {
        lsi0.h(z ? R$string.f621v0 : R$string.f570n0);
    }

    /* JADX INFO: renamed from: F */
    public final void m2091F(View view) {
        Music music = this.f842o;
        if (music.favor) {
            FeedModule.f314b.m1440Z1(music.f242id).subscribe(mkd0.H(new e30() { // from class: l.iq10
                public final void call(Object obj) {
                    this.f9117a.m2112w((roj0) obj);
                }
            }, new e30() { // from class: l.jq10
                public final void call(Object obj) {
                    lsi0.h(R$string.f592q1);
                }
            }));
        } else {
            FeedModule.f314b.m1426R1(music).subscribe(mkd0.H(new e30() { // from class: l.wp10
                public final void call(Object obj) {
                    this.f14658a.m2113x((roj0) obj);
                }
            }, new e30() { // from class: l.xp10
                public final void call(Object obj) {
                    lsi0.h(R$string.f592q1);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m2092G(View view) {
        boolean zM2110u = m2110u();
        Music music = this.f842o;
        if (zM2110u) {
            m2093H(music, this.f843p);
        } else {
            m2094I(music, this.f843p);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m2093H(final Music music, final int i) {
        m2102Q(music, i);
        if (music.playState != 2) {
            return;
        }
        m2089D(new e30() { // from class: l.yp10
            public final void call(Object obj) {
                this.f15485a.m2114y(music, i, (MusicContent) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final void m2094I(final Music music, final int i) {
        m2102Q(music, i);
        if (music.playState != 2) {
            return;
        }
        m2106q().duringCreated(FeedModule.f314b.m1442b2(music)).filter(new w9j() { // from class: l.eq10
            public final Object call(Object obj) {
                MusicContent musicContent = (MusicContent) obj;
                return Boolean.valueOf(musicContent != null && TextUtils.equals(music.f242id, musicContent.id));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.fq10
            public final void call(Object obj) {
                this.f8184a.m2115z(music, i, (MusicContent) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m2115z(Music music, MusicContent musicContent, int i) {
        InterfaceC1995a interfaceC1995a = this.f839l;
        if (interfaceC1995a != null && music.playState == 2 && interfaceC1995a.mo2117b(musicContent, i)) {
            music.playState = 3;
            m2103R();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m2096K(View view) {
        if (NullChecker.a(this.f839l)) {
            this.f839l.mo2116a(this.f842o, -1);
        }
        m2106q().startActivity(MusicAggregateAct.m1982k2(getContext(), this.f842o));
    }

    /* JADX INFO: renamed from: L */
    public void m2097L(Music music, int i) {
        this.f842o = music;
        this.f843p = i;
        this.f831d.setText(music.name);
        boolean zEquals = TextUtils.equals(this.f842o.source, "default");
        xdl0.M(this.f832e, zEquals);
        this.f831d.setMaxWidth(t100.d(zEquals ? 60.0f : 200.0f));
        this.f833f.setText(music.describe);
        this.f834g.setText(getDurationString());
        m2100O();
        m2104S();
        m2101P();
        xdl0.M(this.f835h, !m2110u());
        xdl0.M(this.f836i, !m2110u());
    }

    /* JADX INFO: renamed from: M */
    public final void m2098M(String str) {
        qib0.G.i0(this.f829b, Uri.fromFile(new File(str)).toString());
    }

    /* JADX INFO: renamed from: N */
    public final void m2099N(View view) throws Throwable {
        if (this.f842o.playState == 2) {
            lsi0.h(R$string.f365H0);
            return;
        }
        if (!m2110u()) {
            final Music music = this.f842o;
            m2106q().duringCreated(FeedModule.f314b.m1442b2(music)).filter(new w9j() { // from class: l.gq10
                public final Object call(Object obj) {
                    return this.f8498a.m2086A(music, (MusicContent) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.hq10
                public final void call(Object obj) {
                    this.f8789a.m2087B((MusicContent) obj);
                }
            }));
        } else {
            if (this.f838k == null) {
                return;
            }
            MusicContent musicContentM15127a = up10.m15127a(pb4.m12954D(this.f842o.audio.url), this.f842o);
            musicContentM15127a.type = 3;
            this.f838k.mo2118a(musicContentM15127a, this.f843p);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m2100O() {
        if (TextUtils.isEmpty(this.f842o.cover)) {
            qib0.G.Y0(this.f829b, f3c0.f7763b);
            return;
        }
        if (!m2110u()) {
            qib0.G.L0(this.f829b, this.f842o.cover);
        } else if (!TextUtils.isEmpty(this.f842o.cover) && this.f842o.cover.contains("/")) {
            m2098M(this.f842o.cover);
        } else {
            qib0.G.Y0(this.f829b, f3c0.f7763b);
            this.f841n.c(m2106q(), kuv.m11522d(this.f842o.cover)).subscribe(mkd0.G(new e30() { // from class: l.aq10
                public final void call(Object obj) {
                    this.f5804a.m2088C((String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m2101P() {
        this.f835h.setImageResource(this.f842o.favor ? f3c0.f7946x6 : f3c0.f7954y6);
    }

    /* JADX INFO: renamed from: Q */
    public final void m2102Q(Music music, int i) {
        if (music.playState == 1) {
            music.playState = 2;
        } else {
            music.playState = 1;
        }
        if (NullChecker.a(this.f839l)) {
            this.f839l.mo2116a(music, i);
        }
        this.f841n.notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: R */
    public final void m2103R() {
        int childCount = this.f844q.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f844q.getChildAt(i);
            if (childAt.getTag() instanceof MusicItemView) {
                MusicItemView musicItemView = (MusicItemView) childAt.getTag();
                if (NullChecker.b(musicItemView)) {
                    musicItemView.m2104S();
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m2104S() {
        xdl0.M(this.f837j, isSelected());
        int i = f3c0.f7578B6;
        this.f840m.cancel();
        this.f830c.setRotation(0.0f);
        int i2 = this.f842o.playState;
        if (i2 == 2) {
            i = f3c0.f7962z6;
            this.f840m.start();
        } else if (i2 == 3) {
            i = f3c0.f7570A6;
        }
        this.f830c.setImageResource(i);
    }

    @Override // android.view.View
    public boolean isSelected() {
        Music music = this.f842o;
        return (music == null || music.playState == 1) ? false : true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2105p(this);
        m2107r();
    }

    /* JADX INFO: renamed from: p */
    public final void m2105p(View view) {
        kq10.m11512a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public Act m2106q() {
        return getContext();
    }

    /* JADX INFO: renamed from: r */
    public void m2107r() {
        setTag(this);
        m2109t();
        m2108s();
    }

    /* JADX INFO: renamed from: s */
    public final void m2108s() {
        setOnClickListener(new View.OnClickListener() { // from class: l.vp10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14260a.m2092G(view);
            }
        });
        this.f836i.setOnClickListener(new View.OnClickListener() { // from class: l.bq10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6407a.m2096K(view);
            }
        });
        this.f837j.setOnClickListener(new View.OnClickListener() { // from class: l.cq10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                this.f6706a.m2099N(view);
            }
        });
        this.f835h.setOnClickListener(new View.OnClickListener() { // from class: l.dq10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7027a.m2091F(view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m2109t() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f830c, "rotation", 0.0f, 360.0f);
        this.f840m = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1200L);
        this.f840m.setInterpolator(new LinearInterpolator());
        this.f840m.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2110u() {
        return TextUtils.equals("local", this.f842o.type);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m2111v(e30 e30Var) {
        Music music = this.f842o;
        e30Var.call(up10.m15127a(music.audio.url, music));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m2112w(roj0 roj0Var) {
        m2090E(false);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m2113x(roj0 roj0Var) {
        m2090E(true);
    }

    public MusicItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

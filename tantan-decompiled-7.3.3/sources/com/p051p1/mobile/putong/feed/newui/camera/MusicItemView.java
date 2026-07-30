package com.p051p1.mobile.putong.feed.newui.camera;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.cy10;
import p153l.jic0;
import p153l.l51;
import p153l.lbc0;
import p153l.lwv;
import p153l.o1j0;
import p153l.oc4;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.sy10;
import p153l.uqb0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MusicItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MusicItemView f40215a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f40216b;

    /* JADX INFO: renamed from: c */
    public ImageView f40217c;

    /* JADX INFO: renamed from: d */
    public TextView f40218d;

    /* JADX INFO: renamed from: e */
    public TextView f40219e;

    /* JADX INFO: renamed from: f */
    public TextView f40220f;

    /* JADX INFO: renamed from: g */
    public TextView f40221g;

    /* JADX INFO: renamed from: h */
    public ImageView f40222h;

    /* JADX INFO: renamed from: i */
    public ImageView f40223i;

    /* JADX INFO: renamed from: j */
    public TextView f40224j;

    /* JADX INFO: renamed from: k */
    public InterfaceC11315b f40225k;

    /* JADX INFO: renamed from: l */
    public InterfaceC11314a f40226l;

    /* JADX INFO: renamed from: m */
    public ObjectAnimator f40227m;

    /* JADX INFO: renamed from: n */
    public jic0<MusicContent> f40228n;

    /* JADX INFO: renamed from: o */
    public Music f40229o;

    /* JADX INFO: renamed from: p */
    public int f40230p;

    /* JADX INFO: renamed from: q */
    public ViewGroup f40231q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicItemView$a */
    public interface InterfaceC11314a {
        /* JADX INFO: renamed from: a */
        void mo62366a(Music music, int i);

        /* JADX INFO: renamed from: b */
        boolean mo62367b(MusicContent musicContent, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicItemView$b */
    public interface InterfaceC11315b {
        /* JADX INFO: renamed from: a */
        void mo62368a(MusicContent musicContent, int i);
    }

    public MusicItemView(Context context) {
        super(context);
    }

    private String getDurationString() {
        int i = (int) this.f40229o.audio.duration;
        return String.format("%02d:%02d", Integer.valueOf(i / 60), Integer.valueOf(i % 60));
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Boolean m62336A(Music music, MusicContent musicContent) {
        return Boolean.valueOf((this.f40225k == null || musicContent == null || !TextUtils.equals(music.f39629id, musicContent.f54827id)) ? false : true);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m62337B(MusicContent musicContent) {
        this.f40225k.mo62368a(musicContent, this.f40230p);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m62338C(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zExists = new File(str).exists();
        Music music = this.f40229o;
        if (!zExists) {
            music.cover = "";
        } else {
            music.cover = str;
            m62348M(str);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m62339D(final y20<MusicContent> y20Var) {
        l51.m152887G(new Runnable() { // from class: l.hy10
            @Override // java.lang.Runnable
            public final void run() {
                this.f112089a.m62361v(y20Var);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m62340E(boolean z) {
        o1j0.m165634h(z ? R$string.f40008v0 : R$string.f39957n0);
    }

    /* JADX INFO: renamed from: F */
    public final void m62341F(View view) {
        Music music = this.f40229o;
        if (music.favor) {
            FeedModule.f39701b.m61698Z1(music.f39629id).subscribe(psd0.m173597H(new y20() { // from class: l.qy10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f160089a.m62362w((uxj0) obj);
                }
            }, new y20() { // from class: l.ry10
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165634h(R$string.f39979q1);
                }
            }));
        } else {
            FeedModule.f39701b.m61684R1(music).subscribe(psd0.m173597H(new y20() { // from class: l.ey10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f96367a.m62363x((uxj0) obj);
                }
            }, new y20() { // from class: l.fy10
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165634h(R$string.f39979q1);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m62342G(View view) {
        boolean zM62360u = m62360u();
        Music music = this.f40229o;
        if (zM62360u) {
            m62343H(music, this.f40230p);
        } else {
            m62344I(music, this.f40230p);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m62343H(final Music music, final int i) {
        m62352Q(music, i);
        if (music.playState != 2) {
            return;
        }
        m62339D(new y20() { // from class: l.gy10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107022a.m62364y(music, i, (MusicContent) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final void m62344I(final Music music, final int i) {
        m62352Q(music, i);
        if (music.playState != 2) {
            return;
        }
        m62356q().duringCreated(FeedModule.f39701b.m61700b2(music)).filter(new qcj() { // from class: l.my10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                MusicContent musicContent = (MusicContent) obj;
                return Boolean.valueOf(musicContent != null && TextUtils.equals(music.f39629id, musicContent.f54827id));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ny10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144285a.m62365z(music, i, (MusicContent) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m62365z(Music music, MusicContent musicContent, int i) {
        InterfaceC11314a interfaceC11314a = this.f40226l;
        if (interfaceC11314a != null && music.playState == 2 && interfaceC11314a.mo62367b(musicContent, i)) {
            music.playState = 3;
            m62353R();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m62346K(View view) {
        if (NullChecker.m82486a(this.f40226l)) {
            this.f40226l.mo62366a(this.f40229o, -1);
        }
        m62356q().startActivity(MusicAggregateAct.m62236l2(getContext(), this.f40229o));
    }

    /* JADX INFO: renamed from: L */
    public void m62347L(Music music, int i) {
        this.f40229o = music;
        this.f40230p = i;
        this.f40218d.setText(music.name);
        boolean zEquals = TextUtils.equals(this.f40229o.source, "default");
        bnl0.m105524M(this.f40219e, zEquals);
        this.f40218d.setMaxWidth(qa00.m175859d(zEquals ? 60.0f : 200.0f));
        this.f40220f.setText(music.describe);
        this.f40221g.setText(getDurationString());
        m62350O();
        m62354S();
        m62351P();
        bnl0.m105524M(this.f40222h, !m62360u());
        bnl0.m105524M(this.f40223i, !m62360u());
    }

    /* JADX INFO: renamed from: M */
    public final void m62348M(String str) {
        uqb0.f180374G.m127146i0(this.f40216b, Uri.fromFile(new File(str)).toString());
    }

    /* JADX INFO: renamed from: N */
    public final void m62349N(View view) throws Throwable {
        if (this.f40229o.playState == 2) {
            o1j0.m165634h(R$string.f39752H0);
            return;
        }
        if (!m62360u()) {
            final Music music = this.f40229o;
            m62356q().duringCreated(FeedModule.f39701b.m61700b2(music)).filter(new qcj() { // from class: l.oy10
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f149731a.m62336A(music, (MusicContent) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.py10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f154614a.m62337B((MusicContent) obj);
                }
            }));
        } else {
            if (this.f40225k == null) {
                return;
            }
            MusicContent musicContentM113085a = cy10.m113085a(oc4.m167074D(this.f40229o.audio.url), this.f40229o);
            musicContentM113085a.type = 3;
            this.f40225k.mo62368a(musicContentM113085a, this.f40230p);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m62350O() {
        if (TextUtils.isEmpty(this.f40229o.cover)) {
            uqb0.f180374G.m127138Y0(this.f40216b, lbc0.f130998b);
            return;
        }
        if (!m62360u()) {
            uqb0.f180374G.m127115L0(this.f40216b, this.f40229o.cover);
        } else if (!TextUtils.isEmpty(this.f40229o.cover) && this.f40229o.cover.contains("/")) {
            m62348M(this.f40229o.cover);
        } else {
            uqb0.f180374G.m127138Y0(this.f40216b, lbc0.f130998b);
            this.f40228n.mo68557c(m62356q(), lwv.m156118d(this.f40229o.cover)).subscribe(psd0.m173596G(new y20() { // from class: l.iy10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f117492a.m62338C((String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m62351P() {
        this.f40222h.setImageResource(this.f40229o.favor ? lbc0.f131181x6 : lbc0.f131189y6);
    }

    /* JADX INFO: renamed from: Q */
    public final void m62352Q(Music music, int i) {
        if (music.playState == 1) {
            music.playState = 2;
        } else {
            music.playState = 1;
        }
        if (NullChecker.m82486a(this.f40226l)) {
            this.f40226l.mo62366a(music, i);
        }
        this.f40228n.notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: R */
    public final void m62353R() {
        int childCount = this.f40231q.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f40231q.getChildAt(i);
            if (childAt.getTag() instanceof MusicItemView) {
                MusicItemView musicItemView = (MusicItemView) childAt.getTag();
                if (NullChecker.m82487b(musicItemView)) {
                    musicItemView.m62354S();
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m62354S() {
        bnl0.m105524M(this.f40224j, isSelected());
        int i = lbc0.f130813B6;
        this.f40227m.cancel();
        this.f40217c.setRotation(0.0f);
        int i2 = this.f40229o.playState;
        if (i2 == 2) {
            i = lbc0.f131197z6;
            this.f40227m.start();
        } else if (i2 == 3) {
            i = lbc0.f130805A6;
        }
        this.f40217c.setImageResource(i);
    }

    @Override // android.view.View
    public boolean isSelected() {
        Music music = this.f40229o;
        return (music == null || music.playState == 1) ? false : true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62355p(this);
        m62357r();
    }

    /* JADX INFO: renamed from: p */
    public final void m62355p(View view) {
        sy10.m188532a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public Act m62356q() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: r */
    public void m62357r() {
        setTag(this);
        m62359t();
        m62358s();
    }

    /* JADX INFO: renamed from: s */
    public final void m62358s() {
        setOnClickListener(new View.OnClickListener() { // from class: l.dy10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91132a.m62342G(view);
            }
        });
        this.f40223i.setOnClickListener(new View.OnClickListener() { // from class: l.jy10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123107a.m62346K(view);
            }
        });
        this.f40224j.setOnClickListener(new View.OnClickListener() { // from class: l.ky10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                this.f129261a.m62349N(view);
            }
        });
        this.f40222h.setOnClickListener(new View.OnClickListener() { // from class: l.ly10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134024a.m62341F(view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m62359t() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f40217c, BLiveGiftItem.TYPE_ROTATION, 0.0f, 360.0f);
        this.f40227m = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1200L);
        this.f40227m.setInterpolator(new LinearInterpolator());
        this.f40227m.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m62360u() {
        return TextUtils.equals("local", this.f40229o.type);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m62361v(y20 y20Var) {
        Music music = this.f40229o;
        y20Var.call(cy10.m113085a(music.audio.url, music));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m62362w(uxj0 uxj0Var) {
        m62340E(false);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m62363x(uxj0 uxj0Var) {
        m62340E(true);
    }

    public MusicItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

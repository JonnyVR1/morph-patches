package com.p046p1.mobile.putong.feed.newui.camera;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import p147v.VDraweeView;
import p149l.dac0;
import p149l.e30;
import p149l.e51;
import p149l.f3c0;
import p149l.kq10;
import p149l.kuv;
import p149l.lsi0;
import p149l.mkd0;
import p149l.pb4;
import p149l.qib0;
import p149l.roj0;
import p149l.t100;
import p149l.up10;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class MusicItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MusicItemView f39367a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f39368b;

    /* JADX INFO: renamed from: c */
    public ImageView f39369c;

    /* JADX INFO: renamed from: d */
    public TextView f39370d;

    /* JADX INFO: renamed from: e */
    public TextView f39371e;

    /* JADX INFO: renamed from: f */
    public TextView f39372f;

    /* JADX INFO: renamed from: g */
    public TextView f39373g;

    /* JADX INFO: renamed from: h */
    public ImageView f39374h;

    /* JADX INFO: renamed from: i */
    public ImageView f39375i;

    /* JADX INFO: renamed from: j */
    public TextView f39376j;

    /* JADX INFO: renamed from: k */
    public InterfaceC11152b f39377k;

    /* JADX INFO: renamed from: l */
    public InterfaceC11151a f39378l;

    /* JADX INFO: renamed from: m */
    public ObjectAnimator f39379m;

    /* JADX INFO: renamed from: n */
    public dac0<MusicContent> f39380n;

    /* JADX INFO: renamed from: o */
    public Music f39381o;

    /* JADX INFO: renamed from: p */
    public int f39382p;

    /* JADX INFO: renamed from: q */
    public ViewGroup f39383q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicItemView$a */
    public interface InterfaceC11151a {
        /* JADX INFO: renamed from: a */
        void mo61182a(Music music, int i);

        /* JADX INFO: renamed from: b */
        boolean mo61183b(MusicContent musicContent, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.MusicItemView$b */
    public interface InterfaceC11152b {
        /* JADX INFO: renamed from: a */
        void mo61184a(MusicContent musicContent, int i);
    }

    public MusicItemView(Context context) {
        super(context);
    }

    private String getDurationString() {
        int i = (int) this.f39381o.audio.duration;
        return String.format("%02d:%02d", Integer.valueOf(i / 60), Integer.valueOf(i % 60));
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Boolean m61152A(Music music, MusicContent musicContent) {
        return Boolean.valueOf((this.f39377k == null || musicContent == null || !TextUtils.equals(music.f38781id, musicContent.f53979id)) ? false : true);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m61153B(MusicContent musicContent) {
        this.f39377k.mo61184a(musicContent, this.f39382p);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m61154C(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zExists = new File(str).exists();
        Music music = this.f39381o;
        if (!zExists) {
            music.cover = "";
        } else {
            music.cover = str;
            m61164M(str);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m61155D(final e30<MusicContent> e30Var) {
        e51.m114742G(new Runnable() { // from class: l.zp10
            @Override // java.lang.Runnable
            public final void run() {
                this.f204167a.m61177v(e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m61156E(boolean z) {
        lsi0.m151578h(z ? R$string.f39160v0 : R$string.f39109n0);
    }

    /* JADX INFO: renamed from: F */
    public final void m61157F(View view) {
        Music music = this.f39381o;
        if (music.favor) {
            FeedModule.f38853b.m60514Z1(music.f38781id).subscribe(mkd0.m154956H(new e30() { // from class: l.iq10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f114368a.m61178w((roj0) obj);
                }
            }, new e30() { // from class: l.jq10
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151578h(R$string.f39131q1);
                }
            }));
        } else {
            FeedModule.f38853b.m60500R1(music).subscribe(mkd0.m154956H(new e30() { // from class: l.wp10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f187485a.m61179x((roj0) obj);
                }
            }, new e30() { // from class: l.xp10
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151578h(R$string.f39131q1);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m61158G(View view) {
        boolean zM61176u = m61176u();
        Music music = this.f39381o;
        if (zM61176u) {
            m61159H(music, this.f39382p);
        } else {
            m61160I(music, this.f39382p);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m61159H(final Music music, final int i) {
        m61168Q(music, i);
        if (music.playState != 2) {
            return;
        }
        m61155D(new e30() { // from class: l.yp10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199381a.m61180y(music, i, (MusicContent) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final void m61160I(final Music music, final int i) {
        m61168Q(music, i);
        if (music.playState != 2) {
            return;
        }
        m61172q().duringCreated(FeedModule.f38853b.m60516b2(music)).filter(new w9j() { // from class: l.eq10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                MusicContent musicContent = (MusicContent) obj;
                return Boolean.valueOf(musicContent != null && TextUtils.equals(music.f38781id, musicContent.f53979id));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.fq10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98757a.m61181z(music, i, (MusicContent) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m61181z(Music music, MusicContent musicContent, int i) {
        InterfaceC11151a interfaceC11151a = this.f39378l;
        if (interfaceC11151a != null && music.playState == 2 && interfaceC11151a.mo61183b(musicContent, i)) {
            music.playState = 3;
            m61169R();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m61162K(View view) {
        if (NullChecker.m81303a(this.f39378l)) {
            this.f39378l.mo61182a(this.f39381o, -1);
        }
        m61172q().startActivity(MusicAggregateAct.m61052k2(getContext(), this.f39381o));
    }

    /* JADX INFO: renamed from: L */
    public void m61163L(Music music, int i) {
        this.f39381o = music;
        this.f39382p = i;
        this.f39370d.setText(music.name);
        boolean zEquals = TextUtils.equals(this.f39381o.source, "default");
        xdl0.m208344M(this.f39371e, zEquals);
        this.f39370d.setMaxWidth(t100.m186890d(zEquals ? 60.0f : 200.0f));
        this.f39372f.setText(music.describe);
        this.f39373g.setText(getDurationString());
        m61166O();
        m61170S();
        m61167P();
        xdl0.m208344M(this.f39374h, !m61176u());
        xdl0.m208344M(this.f39375i, !m61176u());
    }

    /* JADX INFO: renamed from: M */
    public final void m61164M(String str) {
        qib0.f154691G.m102363i0(this.f39368b, Uri.fromFile(new File(str)).toString());
    }

    /* JADX INFO: renamed from: N */
    public final void m61165N(View view) throws Throwable {
        if (this.f39381o.playState == 2) {
            lsi0.m151578h(R$string.f38904H0);
            return;
        }
        if (!m61176u()) {
            final Music music = this.f39381o;
            m61172q().duringCreated(FeedModule.f38853b.m60516b2(music)).filter(new w9j() { // from class: l.gq10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f103871a.m61152A(music, (MusicContent) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.hq10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f109025a.m61153B((MusicContent) obj);
                }
            }));
        } else {
            if (this.f39377k == null) {
                return;
            }
            MusicContent musicContentM194583a = up10.m194583a(pb4.m168135D(this.f39381o.audio.url), this.f39381o);
            musicContentM194583a.type = 3;
            this.f39377k.mo61184a(musicContentM194583a, this.f39382p);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m61166O() {
        if (TextUtils.isEmpty(this.f39381o.cover)) {
            qib0.f154691G.m102354Y0(this.f39368b, f3c0.f94480b);
            return;
        }
        if (!m61176u()) {
            qib0.f154691G.m102331L0(this.f39368b, this.f39381o.cover);
        } else if (!TextUtils.isEmpty(this.f39381o.cover) && this.f39381o.cover.contains("/")) {
            m61164M(this.f39381o.cover);
        } else {
            qib0.f154691G.m102354Y0(this.f39368b, f3c0.f94480b);
            this.f39380n.mo67374c(m61172q(), kuv.m147320d(this.f39381o.cover)).subscribe(mkd0.m154955G(new e30() { // from class: l.aq10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f71118a.m61154C((String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m61167P() {
        this.f39374h.setImageResource(this.f39381o.favor ? f3c0.f94663x6 : f3c0.f94671y6);
    }

    /* JADX INFO: renamed from: Q */
    public final void m61168Q(Music music, int i) {
        if (music.playState == 1) {
            music.playState = 2;
        } else {
            music.playState = 1;
        }
        if (NullChecker.m81303a(this.f39378l)) {
            this.f39378l.mo61182a(music, i);
        }
        this.f39380n.notifyItemChanged(i);
    }

    /* JADX INFO: renamed from: R */
    public final void m61169R() {
        int childCount = this.f39383q.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f39383q.getChildAt(i);
            if (childAt.getTag() instanceof MusicItemView) {
                MusicItemView musicItemView = (MusicItemView) childAt.getTag();
                if (NullChecker.m81304b(musicItemView)) {
                    musicItemView.m61170S();
                }
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m61170S() {
        xdl0.m208344M(this.f39376j, isSelected());
        int i = f3c0.f94295B6;
        this.f39379m.cancel();
        this.f39369c.setRotation(0.0f);
        int i2 = this.f39381o.playState;
        if (i2 == 2) {
            i = f3c0.f94679z6;
            this.f39379m.start();
        } else if (i2 == 3) {
            i = f3c0.f94287A6;
        }
        this.f39369c.setImageResource(i);
    }

    @Override // android.view.View
    public boolean isSelected() {
        Music music = this.f39381o;
        return (music == null || music.playState == 1) ? false : true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61171p(this);
        m61173r();
    }

    /* JADX INFO: renamed from: p */
    public final void m61171p(View view) {
        kq10.m146918a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public Act m61172q() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: r */
    public void m61173r() {
        setTag(this);
        m61175t();
        m61174s();
    }

    /* JADX INFO: renamed from: s */
    public final void m61174s() {
        setOnClickListener(new View.OnClickListener() { // from class: l.vp10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182442a.m61158G(view);
            }
        });
        this.f39375i.setOnClickListener(new View.OnClickListener() { // from class: l.bq10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76748a.m61162K(view);
            }
        });
        this.f39376j.setOnClickListener(new View.OnClickListener() { // from class: l.cq10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                this.f82015a.m61165N(view);
            }
        });
        this.f39374h.setOnClickListener(new View.OnClickListener() { // from class: l.dq10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87378a.m61157F(view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m61175t() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f39369c, BLiveGiftItem.TYPE_ROTATION, 0.0f, 360.0f);
        this.f39379m = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1200L);
        this.f39379m.setInterpolator(new LinearInterpolator());
        this.f39379m.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m61176u() {
        return TextUtils.equals("local", this.f39381o.type);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m61177v(e30 e30Var) {
        Music music = this.f39381o;
        e30Var.call(up10.m194583a(music.audio.url, music));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m61178w(roj0 roj0Var) {
        m61156E(false);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m61179x(roj0 roj0Var) {
        m61156E(true);
    }

    public MusicItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

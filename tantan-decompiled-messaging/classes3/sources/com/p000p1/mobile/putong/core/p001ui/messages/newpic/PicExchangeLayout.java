package com.p000p1.mobile.putong.core.p001ui.messages.newpic;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.media.widget.RecorderView;
import com.p000p1.mobile.putong.core.p001ui.messages.media.widget.ShootingResultView;
import com.p000p1.mobile.putong.core.p001ui.messages.newpic.PicExchangeLayout;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.data.PicExchangeEditPopWindowConfig;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.b86;
import l.bt0;
import l.c3c0;
import l.j760;
import l.lsx;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.rhi;
import l.t100;
import l.vc70;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p003l.c4g0;
import p003l.dd70;
import p003l.e30;
import p003l.jo0;
import p003l.m250;
import p003l.qg50;
import p003l.w9j;
import p014rx.C1099c;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PicExchangeLayout extends LinearLayout {

    /* JADX INFO: renamed from: v */
    public static final int f2033v = t100.c().widthPixels - t100.q;

    /* JADX INFO: renamed from: a */
    public ImageView f2034a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f2035b;

    /* JADX INFO: renamed from: c */
    public VLinear f2036c;

    /* JADX INFO: renamed from: d */
    public TextView f2037d;

    /* JADX INFO: renamed from: e */
    public TextView f2038e;

    /* JADX INFO: renamed from: f */
    public TextView f2039f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f2040g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f2041h;

    /* JADX INFO: renamed from: i */
    public ImageView f2042i;

    /* JADX INFO: renamed from: j */
    public ImageView f2043j;

    /* JADX INFO: renamed from: k */
    public ImageView f2044k;

    /* JADX INFO: renamed from: l */
    public ShootingResultView f2045l;

    /* JADX INFO: renamed from: m */
    public ImageView f2046m;

    /* JADX INFO: renamed from: n */
    public dd70 f2047n;

    /* JADX INFO: renamed from: o */
    public String f2048o;

    /* JADX INFO: renamed from: p */
    public String f2049p;

    /* JADX INFO: renamed from: q */
    public boolean f2050q;

    /* JADX INFO: renamed from: r */
    public int f2051r;

    /* JADX INFO: renamed from: s */
    public AnimatorSet f2052s;

    /* JADX INFO: renamed from: t */
    public Map<String, Drawable> f2053t;

    /* JADX INFO: renamed from: u */
    public c4g0 f2054u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.newpic.PicExchangeLayout$a */
    public class C0156a implements qg50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f2055a;

        public C0156a(boolean z) {
            this.f2055a = z;
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m2709e(Throwable th) {
        }

        @Override // p003l.qg50
        /* JADX INFO: renamed from: a */
        public void mo2711a(Exception exc) {
            exc.getMessage();
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m2712g(List list) {
            PicExchangeLayout.this.f2047n.f2943b.f2063f = ((Media) list.get(0)).url;
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m2713h() {
            PicExchangeLayout.this.m2693G();
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m2714i(String str, boolean z) {
            RecorderView.StatusInfo statusInfo = new RecorderView.StatusInfo(str, true);
            PicExchangeLayout.this.f2045l.m2343p();
            PicExchangeLayout picExchangeLayout = PicExchangeLayout.this;
            if (z) {
                picExchangeLayout.f2045l.m2341n(statusInfo.getPath(), PicExchangeLayout.f2033v);
                xdl0.M(PicExchangeLayout.this.f2045l, true);
                PicExchangeLayout.this.f2045l.postDelayed(new Runnable() { // from class: l.uc70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7964a.m2713h();
                    }
                }, 500L);
            } else {
                picExchangeLayout.f2045l.m2340m(statusInfo.getPath(), statusInfo.isPhoto(), xdl0.w(24.0f));
                PicExchangeLayout.this.f2047n.f2943b.f2060c = PicExchangePresenter.Status.shooting_preview;
                PicExchangeLayout.this.m2693G();
            }
        }

        @Override // p003l.qg50
        public void success(final String str) {
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                return;
            }
            if (!this.f2055a) {
                Picture pictureNew_ = Picture.new_();
                ((Media) pictureNew_).url = rhi.B(str);
                ((Media) pictureNew_).mediaType = "image/*";
                ((Media) pictureNew_).status = MediaLocalStatus.get("raw");
                PicExchangeLayout.this.f2047n.f2942a.duringCreated(new lsx(vwb.M(pictureNew_), false, true).compose(mkd0.C()).last().filter(new w9j() { // from class: l.qc70
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!vwb.J((List) obj));
                    }
                })).subscribe((m250) mkd0.H(new e30() { // from class: l.rc70
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f6888a.m2712g((List) obj);
                    }
                }, new e30() { // from class: l.sc70
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        PicExchangeLayout.C0156a.m2709e((Throwable) obj);
                    }
                }));
            }
            PutongCoreMvpAct putongCoreMvpAct = PicExchangeLayout.this.f2047n.f2942a;
            final boolean z = this.f2055a;
            putongCoreMvpAct.runOnUiThread(new Runnable() { // from class: l.tc70
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7443a.m2714i(str, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.newpic.PicExchangeLayout$b */
    public static /* synthetic */ class C0157b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2057a;

        static {
            int[] iArr = new int[PicExchangePresenter.Status.values().length];
            f2057a = iArr;
            try {
                iArr[PicExchangePresenter.Status.main_choose_photo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2057a[PicExchangePresenter.Status.shooting_preview.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2057a[PicExchangePresenter.Status.random_preview.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2057a[PicExchangePresenter.Status.shooting_preview_del.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public PicExchangeLayout(Context context) {
        super(context);
        this.f2048o = "key_bubble_random_guide";
        this.f2049p = "key_bubble_limit_guide";
        this.f2050q = false;
        this.f2051r = -1;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2673a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2674b(dd70 dd70Var, String str, View view) {
        dd70Var.f2943b.m2727C0(str);
        zvf0.r("e_photo_album", dd70Var.f2942a.pageId());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2675c(dd70 dd70Var, View view) {
        dd70Var.f2943b.m2729E0();
        zvf0.r("e_camera_switch", dd70Var.f2942a.pageId());
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m2687A(List list) {
        this.f2050q = true;
        m2693G();
        xdl0.M(this.f2041h, false);
        m2697r(b86.b(list, list.size()));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: B */
    public final void m2688B() {
        PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig;
        String str;
        String str2;
        int i;
        String str3;
        View view;
        int i2;
        View view2 = null;
        try {
            picExchangeEditPopWindowConfig = (PicExchangeEditPopWindowConfig) PicExchangeEditPopWindowConfig.JSON_ADAPTER.parse((String) CoreModule.c.e0.U3.get());
        } catch (IOException unused) {
            picExchangeEditPopWindowConfig = null;
        }
        if (picExchangeEditPopWindowConfig == null) {
            return;
        }
        if (!this.f2047n.f2943b.f2064g || !xdl0.O0(this.f2036c) || mqi0.C(mqi0.o(), picExchangeEditPopWindowConfig.switchFunTime) || (i2 = picExchangeEditPopWindowConfig.switchFunNum) >= 5) {
            if (!xdl0.O0(this.f2042i) || mqi0.C(mqi0.o(), picExchangeEditPopWindowConfig.randomTime) || (i = picExchangeEditPopWindowConfig.randomNum) >= 5) {
                str = "";
                str2 = "";
            } else {
                picExchangeEditPopWindowConfig.randomNum = i + 1;
                picExchangeEditPopWindowConfig.randomTime = mqi0.o();
                str3 = this.f2048o;
                view = this.f2042i;
                str2 = "随机一张";
            }
            if (TextUtils.isEmpty(str2)) {
            }
            a aVar = new a(getContext());
            aVar.D(str2).l(t100.d(7.0f)).p(90).x(t100.d(-8.0f)).b(5000L).M(true).d(new a.b() { // from class: l.nc70
                /* JADX INFO: renamed from: a */
                public final void m6531a(String str4) {
                    this.f5871a.m2705z(str4);
                }
            }).q(a.Q);
            d.l().u(aVar, view2, str);
            CoreModule.c.e0.U3.put(picExchangeEditPopWindowConfig.toJson());
        }
        picExchangeEditPopWindowConfig.switchFunNum = i2 + 1;
        picExchangeEditPopWindowConfig.switchFunTime = mqi0.o();
        str3 = this.f2049p;
        view = this.f2038e;
        str2 = "切换玩法";
        View view3 = view;
        str = str3;
        view2 = view3;
        if (TextUtils.isEmpty(str2)) {
            a aVar2 = new a(getContext());
            aVar2.D(str2).l(t100.d(7.0f)).p(90).x(t100.d(-8.0f)).b(5000L).M(true).d(new a.b() { // from class: l.nc70
                /* JADX INFO: renamed from: a */
                public final void m6531a(String str4) {
                    this.f5871a.m2705z(str4);
                }
            }).q(a.Q);
            d.l().u(aVar2, view2, str);
            CoreModule.c.e0.U3.put(picExchangeEditPopWindowConfig.toJson());
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m2689C() {
        if (NullChecker.a(this.f2053t)) {
            this.f2053t.clear();
        }
        mkd0.z(this.f2054u);
        this.f2050q = false;
        xdl0.M(this.f2041h, true);
    }

    /* JADX INFO: renamed from: D */
    public final void m2690D() {
        if (this.f2050q || this.f2053t == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList(this.f2053t.keySet());
        long size = ((long) arrayList.size()) * 150;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2052s = animatorSet;
        animatorSet.playTogether(bt0.q(this.f2040g, "scaleX", new float[]{1.0f, 0.95f, 1.0f}), bt0.q(this.f2040g, "scaleY", new float[]{1.0f, 0.95f, 1.0f}));
        this.f2052s.setInterpolator(new LinearInterpolator());
        this.f2052s.setDuration(size);
        this.f2052s.addListener(bt0.h(new Runnable() { // from class: l.oc70
            @Override // java.lang.Runnable
            public final void run() {
                this.f6095a.m2687A(arrayList);
            }
        }, new Runnable() { // from class: l.pc70
            @Override // java.lang.Runnable
            public final void run() {
                this.f6359a.m2689C();
            }
        }, new Runnable() { // from class: l.pc70
            @Override // java.lang.Runnable
            public final void run() {
                this.f6359a.m2689C();
            }
        }));
        this.f2052s.start();
    }

    /* JADX INFO: renamed from: E */
    public final void m2691E(boolean z) {
        PicExchangePresenter picExchangePresenter = this.f2047n.f2943b;
        picExchangePresenter.f2063f = null;
        picExchangePresenter.m2730F0(new C0156a(z));
    }

    /* JADX INFO: renamed from: F */
    public final void m2692F() {
        if (this.f2047n.f2943b.m2735p0()) {
            xdl0.M(this.f2036c, false);
            xdl0.M(this.f2039f, true);
            this.f2039f.setText("拍一张回复，与对方交换");
            xdl0.M(this.f2044k, this.f2047n.f2943b.f2060c == PicExchangePresenter.Status.main_choose_photo);
            return;
        }
        PicExchangePresenter.Status status = this.f2047n.f2943b.f2060c;
        PicExchangePresenter.Status status2 = PicExchangePresenter.Status.main_choose_photo;
        VLinear vLinear = this.f2036c;
        if (status != status2) {
            xdl0.M(vLinear, false);
            xdl0.M(this.f2039f, true);
            this.f2039f.setText(this.f2047n.f2943b.f2064g ? "立即发送，对方回拍后才可查看" : "立即发送，对方仅可限时查看");
            this.f2034a.setImageResource(c3c0.C5);
            xdl0.M(this.f2044k, false);
            return;
        }
        xdl0.M(vLinear, true);
        xdl0.M(this.f2039f, false);
        this.f2037d.setTextColor(this.f2047n.f2943b.f2064g ? Color.parseColor("#ffffffff") : Color.parseColor("#80FFFFFF"));
        this.f2038e.setTextColor(!this.f2047n.f2943b.f2064g ? Color.parseColor("#ffffffff") : Color.parseColor("#80FFFFFF"));
        Drawable drawable = getResources().getDrawable(c3c0.F5);
        drawable.setBounds(0, 0, t100.d(12.0f), t100.d(3.0f));
        this.f2037d.setCompoundDrawables(null, null, null, this.f2047n.f2943b.f2064g ? drawable : null);
        TextView textView = this.f2038e;
        if (this.f2047n.f2943b.f2064g) {
            drawable = null;
        }
        textView.setCompoundDrawables(null, null, null, drawable);
    }

    /* JADX INFO: renamed from: G */
    public void m2693G() {
        int i = C0157b.f2057a[this.f2047n.f2943b.f2060c.ordinal()];
        if (i == 1) {
            xdl0.M(this.f2045l, false);
            xdl0.M(this.f2046m, true);
            this.f2034a.setImageResource(c3c0.E5);
            xdl0.M(this.f2042i, true);
            this.f2042i.setImageResource(c3c0.G5);
            xdl0.M(this.f2043j, true);
            this.f2043j.setImageResource(c3c0.J5);
            xdl0.M(this.f2044k, true);
        } else if (i == 2) {
            xdl0.M(this.f2046m, false);
            xdl0.M(this.f2045l, true);
            xdl0.M(this.f2042i, true);
            this.f2042i.setImageResource(c3c0.D5);
            xdl0.M(this.f2043j, true);
            this.f2043j.setImageResource(c3c0.H5);
        } else if (i == 3) {
            xdl0.M(this.f2046m, false);
            xdl0.M(this.f2045l, true);
            xdl0.M(this.f2042i, true);
            this.f2042i.setImageResource(c3c0.G5);
            xdl0.M(this.f2043j, true);
            this.f2043j.setImageResource(c3c0.H5);
        } else if (i == 4) {
            xdl0.M(this.f2045l, false);
            xdl0.M(this.f2046m, true);
            xdl0.M(this.f2042i, false);
            xdl0.M(this.f2043j, true);
            this.f2043j.setImageResource(c3c0.J5);
        }
        m2692F();
    }

    /* JADX INFO: renamed from: o */
    public final void m2694o(View view) {
        vc70.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2694o(this);
    }

    /* JADX INFO: renamed from: p */
    public void m2695p() {
        if (NullChecker.a(this.f2052s) && this.f2050q) {
            this.f2052s.cancel();
        }
        PicExchangePresenter.Status status = this.f2047n.f2943b.f2060c;
        PicExchangePresenter.Status status2 = PicExchangePresenter.Status.main_choose_photo;
        boolean zEquals = status.equals(status2);
        dd70 dd70Var = this.f2047n;
        if (zEquals) {
            dd70Var.f2942a.finish();
            zvf0.r("e_newphoto_close", this.f2047n.f2942a.pageId());
        } else {
            dd70Var.f2943b.f2060c = status2;
            m2693G();
            zvf0.r("e_newphoto_back", this.f2047n.f2942a.pageId());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2696q() {
        d.l().k(this.f2049p);
        d.l().k(this.f2048o);
    }

    /* JADX INFO: renamed from: r */
    public final void m2697r(final List<String> list) {
        mkd0.z(this.f2054u);
        final int size = list.size();
        this.f2051r = 0;
        this.f2054u = C1099c.interval(10L, 150L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m5414a()).subscribe((m250<? super Long>) mkd0.H(new e30() { // from class: l.fc70
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3491a.m2699t(size, list, (Long) obj);
            }
        }, new e30() { // from class: l.gc70
            @Override // p003l.e30
            public final void call(Object obj) {
                PicExchangeLayout.m2673a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public void m2698s(final dd70 dd70Var) {
        this.f2047n = dd70Var;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2040g.getLayoutParams();
        int i = f2033v;
        layoutParams.width = i;
        layoutParams.height = i;
        this.f2040g.setLayoutParams(layoutParams);
        xdl0.E0(this.f2037d, new View.OnClickListener() { // from class: l.ec70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3250a.m2700u(dd70Var, view);
            }
        });
        xdl0.E0(this.f2038e, new View.OnClickListener() { // from class: l.hc70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4168a.m2701v(dd70Var, view);
            }
        });
        xdl0.E0(this.f2043j, new View.OnClickListener() { // from class: l.ic70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4389a.m2702w(dd70Var, view);
            }
        });
        xdl0.E0(this.f2042i, new View.OnClickListener() { // from class: l.jc70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4616a.m2703x(dd70Var, view);
            }
        });
        final String stringExtra = dd70Var.f2942a.getIntent().getStringExtra("ext_uid");
        xdl0.E0(this.f2044k, new View.OnClickListener() { // from class: l.kc70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PicExchangeLayout.m2674b(dd70Var, stringExtra, view);
            }
        });
        xdl0.E0(this.f2034a, new View.OnClickListener() { // from class: l.lc70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5258a.m2704y(view);
            }
        });
        this.f2040g.addView(dd70Var.f2943b.f2059b.m7700j());
        this.f2046m = new ImageView(getContext());
        int i2 = t100.s;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 8388613;
        int i3 = t100.m;
        layoutParams2.topMargin = i3;
        layoutParams2.rightMargin = i3;
        this.f2046m.setImageResource(c3c0.I5);
        this.f2040g.addView(this.f2046m, layoutParams2);
        xdl0.E0(this.f2046m, new View.OnClickListener() { // from class: l.mc70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PicExchangeLayout.m2675c(dd70Var, view);
            }
        });
        ShootingResultView shootingResultView = new ShootingResultView(getContext());
        this.f2045l = shootingResultView;
        shootingResultView.setRadius(xdl0.w(24.0f));
        this.f2040g.addView(this.f2045l);
        if (NullChecker.a(this.f2045l.getCancelView())) {
            xdl0.M(this.f2045l.getCancelView(), false);
        }
        m2693G();
        m2688B();
        if (xdl0.w0() < t100.d(300.0f) + i + xdl0.F0()) {
            xdl0.X(this.f2035b, t100.d(10.0f));
            xdl0.U(this.f2035b, t100.d(32.0f));
            xdl0.X(this.f2041h, t100.d(42.0f));
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m2699t(int i, List list, Long l2) {
        Drawable drawable;
        int i2 = this.f2051r;
        if (i2 < 0 || i2 >= i) {
            m2689C();
            return;
        }
        String str = (String) list.get(i2);
        if (TextUtils.isEmpty(str) || (drawable = this.f2053t.get(str)) == null) {
            return;
        }
        this.f2047n.f2943b.f2063f = rhi.B(str);
        this.f2045l.m2342o(drawable);
        this.f2051r++;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m2700u(dd70 dd70Var, View view) {
        dd70Var.f2943b.f2064g = true;
        m2693G();
        m2691E(true);
        zvf0.r("e_switchphoto_tab", dd70Var.f2942a.pageId());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m2701v(dd70 dd70Var, View view) {
        dd70Var.f2943b.f2064g = false;
        m2696q();
        m2693G();
        m2691E(true);
        zvf0.r("e_timephoto_tab", dd70Var.f2942a.pageId());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m2702w(dd70 dd70Var, View view) {
        String str;
        if (dd70Var.f2943b.f2060c.equals(PicExchangePresenter.Status.main_choose_photo) || dd70Var.f2943b.f2060c.equals(PicExchangePresenter.Status.shooting_preview_del)) {
            m2691E(false);
            zvf0.r("e_camera_on", dd70Var.f2942a.pageId());
            return;
        }
        dd70Var.f2943b.m2726A0();
        String strPageId = dd70Var.f2942a.pageId();
        PicExchangePresenter picExchangePresenter = dd70Var.f2943b;
        if (picExchangePresenter.f2064g) {
            str = picExchangePresenter.m2735p0() ? "reply" : "switch";
        } else {
            str = "time";
        }
        zvf0.u("e_newphoto_send", strPageId, new j760[]{vwb.Y("new_photo_type", str), vwb.Y("new_photo_channel", dd70Var.f2943b.f2060c.equals(PicExchangePresenter.Status.random_preview) ? "random" : "camera")});
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m2703x(dd70 dd70Var, View view) {
        m2696q();
        if (!dd70Var.f2943b.f2060c.equals(PicExchangePresenter.Status.main_choose_photo) && !dd70Var.f2943b.f2060c.equals(PicExchangePresenter.Status.random_preview)) {
            if (dd70Var.f2943b.f2060c.equals(PicExchangePresenter.Status.shooting_preview)) {
                dd70Var.f2943b.f2060c = PicExchangePresenter.Status.shooting_preview_del;
                this.f2045l.m2343p();
                m2693G();
                zvf0.r("e_newphoto_delete", dd70Var.f2942a.pageId());
                return;
            }
            return;
        }
        if (NullChecker.a(dd70Var.f2943b.f2067j) && NullChecker.a(dd70Var.f2943b.f2065h) && dd70Var.f2943b.f2065h.isEmpty()) {
            osi0.g("暂无照片");
            return;
        }
        PicExchangePresenter picExchangePresenter = dd70Var.f2943b;
        if (picExchangePresenter.f2067j == null || picExchangePresenter.f2065h == null) {
            osi0.g("相册准备中...");
            return;
        }
        picExchangePresenter.f2060c = PicExchangePresenter.Status.random_preview;
        if (NullChecker.a(this.f2053t)) {
            this.f2053t.clear();
            this.f2053t.putAll(dd70Var.f2943b.f2065h);
        } else {
            this.f2053t = new HashMap(dd70Var.f2943b.f2065h);
        }
        m2690D();
        dd70Var.f2943b.m2733m0();
        zvf0.r("e_picture_random", dd70Var.f2942a.pageId());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m2704y(View view) {
        m2695p();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m2705z(String str) {
        m2696q();
    }

    public PicExchangeLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2048o = "key_bubble_random_guide";
        this.f2049p = "key_bubble_limit_guide";
        this.f2050q = false;
        this.f2051r = -1;
    }

    public PicExchangeLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2048o = "key_bubble_random_guide";
        this.f2049p = "key_bubble_limit_guide";
        this.f2050q = false;
        this.f2051r = -1;
    }
}

package com.p046p1.mobile.putong.core.p053ui.messages.newpic;

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
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PicExchangeEditPopWindowConfig;
import com.p046p1.mobile.putong.core.p053ui.messages.media.widget.RecorderView;
import com.p046p1.mobile.putong.core.p053ui.messages.media.widget.ShootingResultView;
import com.p046p1.mobile.putong.core.p053ui.messages.newpic.PicExchangeLayout;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VLinear;
import p149l.b86;
import p149l.bt0;
import p149l.c3c0;
import p149l.c4g0;
import p149l.dd70;
import p149l.e30;
import p149l.jo0;
import p149l.lsx;
import p149l.mkd0;
import p149l.mqi0;
import p149l.osi0;
import p149l.qg50;
import p149l.rhi;
import p149l.t100;
import p149l.vc70;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class PicExchangeLayout extends LinearLayout {

    /* JADX INFO: renamed from: v */
    public static final int f32142v = t100.m186889c().widthPixels - t100.f167268q;

    /* JADX INFO: renamed from: a */
    public ImageView f32143a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f32144b;

    /* JADX INFO: renamed from: c */
    public VLinear f32145c;

    /* JADX INFO: renamed from: d */
    public TextView f32146d;

    /* JADX INFO: renamed from: e */
    public TextView f32147e;

    /* JADX INFO: renamed from: f */
    public TextView f32148f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f32149g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f32150h;

    /* JADX INFO: renamed from: i */
    public ImageView f32151i;

    /* JADX INFO: renamed from: j */
    public ImageView f32152j;

    /* JADX INFO: renamed from: k */
    public ImageView f32153k;

    /* JADX INFO: renamed from: l */
    public ShootingResultView f32154l;

    /* JADX INFO: renamed from: m */
    public ImageView f32155m;

    /* JADX INFO: renamed from: n */
    public dd70 f32156n;

    /* JADX INFO: renamed from: o */
    public String f32157o;

    /* JADX INFO: renamed from: p */
    public String f32158p;

    /* JADX INFO: renamed from: q */
    public boolean f32159q;

    /* JADX INFO: renamed from: r */
    public int f32160r;

    /* JADX INFO: renamed from: s */
    public AnimatorSet f32161s;

    /* JADX INFO: renamed from: t */
    public Map<String, Drawable> f32162t;

    /* JADX INFO: renamed from: u */
    public c4g0 f32163u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.newpic.PicExchangeLayout$a */
    public class C8573a implements qg50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f32164a;

        public C8573a(boolean z) {
            this.f32164a = z;
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m49560e(Throwable th) {
        }

        @Override // p149l.qg50
        /* JADX INFO: renamed from: a */
        public void mo49562a(Exception exc) {
            exc.getMessage();
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m49563g(List list) {
            PicExchangeLayout.this.f32156n.f85534b.f32172f = ((Media) list.get(0)).url;
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m49564h() {
            PicExchangeLayout.this.m49544G();
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m49565i(String str, boolean z) {
            RecorderView.StatusInfo statusInfo = new RecorderView.StatusInfo(str, true);
            PicExchangeLayout.this.f32154l.m49224p();
            PicExchangeLayout picExchangeLayout = PicExchangeLayout.this;
            if (z) {
                picExchangeLayout.f32154l.m49222n(statusInfo.getPath(), PicExchangeLayout.f32142v);
                xdl0.m208344M(PicExchangeLayout.this.f32154l, true);
                PicExchangeLayout.this.f32154l.postDelayed(new Runnable() { // from class: l.uc70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f175802a.m49564h();
                    }
                }, 500L);
            } else {
                picExchangeLayout.f32154l.m49221m(statusInfo.getPath(), statusInfo.isPhoto(), xdl0.m208407w(24.0f));
                PicExchangeLayout.this.f32156n.f85534b.f32169c = PicExchangePresenter.Status.shooting_preview;
                PicExchangeLayout.this.m49544G();
            }
        }

        @Override // p149l.qg50
        public void success(final String str) {
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                return;
            }
            if (!this.f32164a) {
                Picture pictureNew_ = Picture.new_();
                pictureNew_.url = rhi.m179355B(str);
                pictureNew_.mediaType = "image/*";
                pictureNew_.status = MediaLocalStatus.get("raw");
                PicExchangeLayout.this.f32156n.f85533a.duringCreated(new lsx((List<Media>) vwb.m200299M(pictureNew_), false, true).compose(mkd0.m154951C()).last().filter(new w9j() { // from class: l.qc70
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!vwb.m200296J((List) obj));
                    }
                })).subscribe(mkd0.m154956H(new e30() { // from class: l.rc70
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f158745a.m49563g((List) obj);
                    }
                }, new e30() { // from class: l.sc70
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        PicExchangeLayout.C8573a.m49560e((Throwable) obj);
                    }
                }));
            }
            PicExchangeEditAct picExchangeEditAct = PicExchangeLayout.this.f32156n.f85533a;
            final boolean z = this.f32164a;
            picExchangeEditAct.runOnUiThread(new Runnable() { // from class: l.tc70
                @Override // java.lang.Runnable
                public final void run() {
                    this.f169416a.m49565i(str, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.newpic.PicExchangeLayout$b */
    public static /* synthetic */ class C8574b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32166a;

        static {
            int[] iArr = new int[PicExchangePresenter.Status.values().length];
            f32166a = iArr;
            try {
                iArr[PicExchangePresenter.Status.main_choose_photo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32166a[PicExchangePresenter.Status.shooting_preview.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32166a[PicExchangePresenter.Status.random_preview.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32166a[PicExchangePresenter.Status.shooting_preview_del.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public PicExchangeLayout(Context context) {
        super(context);
        this.f32157o = "key_bubble_random_guide";
        this.f32158p = "key_bubble_limit_guide";
        this.f32159q = false;
        this.f32160r = -1;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49524a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49525b(dd70 dd70Var, String str, View view) {
        dd70Var.f85534b.m49578C0(str);
        zvf0.m220396r("e_photo_album", dd70Var.f85533a.pageId());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m49526c(dd70 dd70Var, View view) {
        dd70Var.f85534b.m49580E0();
        zvf0.m220396r("e_camera_switch", dd70Var.f85533a.pageId());
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m49538A(List list) {
        this.f32159q = true;
        m49544G();
        xdl0.m208344M(this.f32150h, false);
        m49548r(b86.m100757b(list, list.size()));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: B */
    public final void m49539B() {
        PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig;
        String str;
        String str2;
        int i;
        String str3;
        View view;
        int i2;
        View view2 = null;
        try {
            picExchangeEditPopWindowConfig = PicExchangeEditPopWindowConfig.JSON_ADAPTER.parse(CoreModule.f17545c.f19639e0.f149281U3.get());
        } catch (IOException unused) {
            picExchangeEditPopWindowConfig = null;
        }
        if (picExchangeEditPopWindowConfig == null) {
            return;
        }
        if (!this.f32156n.f85534b.f32173g || !xdl0.m208349O0(this.f32145c) || mqi0.m155928C(mqi0.m155944o(), picExchangeEditPopWindowConfig.switchFunTime) || (i2 = picExchangeEditPopWindowConfig.switchFunNum) >= 5) {
            if (!xdl0.m208349O0(this.f32151i) || mqi0.m155928C(mqi0.m155944o(), picExchangeEditPopWindowConfig.randomTime) || (i = picExchangeEditPopWindowConfig.randomNum) >= 5) {
                str = "";
                str2 = "";
            } else {
                picExchangeEditPopWindowConfig.randomNum = i + 1;
                picExchangeEditPopWindowConfig.randomTime = mqi0.m155944o();
                str3 = this.f32157o;
                view = this.f32151i;
                str2 = "随机一张";
            }
            if (TextUtils.isEmpty(str2)) {
            }
            C4345a c4345a = new C4345a(getContext());
            c4345a.m20849D(str2).m20871l(t100.m186890d(7.0f)).m20874p(90).m20882x(t100.m186890d(-8.0f)).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20858M(true).m20863d(new C4345a.b() { // from class: l.nc70
                @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.b
                /* JADX INFO: renamed from: a */
                public final void mo20885a(String str4) {
                    this.f138134a.m49556z(str4);
                }
            }).m20875q(C4345a.f15683Q);
            C4348d.m20896l().m20909u(c4345a, view2, str);
            CoreModule.f17545c.f19639e0.f149281U3.put(picExchangeEditPopWindowConfig.toJson());
        }
        picExchangeEditPopWindowConfig.switchFunNum = i2 + 1;
        picExchangeEditPopWindowConfig.switchFunTime = mqi0.m155944o();
        str3 = this.f32158p;
        view = this.f32147e;
        str2 = "切换玩法";
        View view3 = view;
        str = str3;
        view2 = view3;
        if (TextUtils.isEmpty(str2)) {
            C4345a c4345a2 = new C4345a(getContext());
            c4345a2.m20849D(str2).m20871l(t100.m186890d(7.0f)).m20874p(90).m20882x(t100.m186890d(-8.0f)).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20858M(true).m20863d(new C4345a.b() { // from class: l.nc70
                @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.b
                /* JADX INFO: renamed from: a */
                public final void mo20885a(String str4) {
                    this.f138134a.m49556z(str4);
                }
            }).m20875q(C4345a.f15683Q);
            C4348d.m20896l().m20909u(c4345a2, view2, str);
            CoreModule.f17545c.f19639e0.f149281U3.put(picExchangeEditPopWindowConfig.toJson());
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m49540C() {
        if (NullChecker.m81303a(this.f32162t)) {
            this.f32162t.clear();
        }
        mkd0.m154992z(this.f32163u);
        this.f32159q = false;
        xdl0.m208344M(this.f32150h, true);
    }

    /* JADX INFO: renamed from: D */
    public final void m49541D() {
        if (this.f32159q || this.f32162t == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList(this.f32162t.keySet());
        long size = ((long) arrayList.size()) * 150;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32161s = animatorSet;
        animatorSet.playTogether(bt0.m103744q(this.f32149g, "scaleX", 1.0f, 0.95f, 1.0f), bt0.m103744q(this.f32149g, "scaleY", 1.0f, 0.95f, 1.0f));
        this.f32161s.setInterpolator(new LinearInterpolator());
        this.f32161s.setDuration(size);
        this.f32161s.addListener(bt0.m103735h(new Runnable() { // from class: l.oc70
            @Override // java.lang.Runnable
            public final void run() {
                this.f143012a.m49538A(arrayList);
            }
        }, new Runnable() { // from class: l.pc70
            @Override // java.lang.Runnable
            public final void run() {
                this.f148148a.m49540C();
            }
        }, new Runnable() { // from class: l.pc70
            @Override // java.lang.Runnable
            public final void run() {
                this.f148148a.m49540C();
            }
        }));
        this.f32161s.start();
    }

    /* JADX INFO: renamed from: E */
    public final void m49542E(boolean z) {
        PicExchangePresenter picExchangePresenter = this.f32156n.f85534b;
        picExchangePresenter.f32172f = null;
        picExchangePresenter.m49581F0(new C8573a(z));
    }

    /* JADX INFO: renamed from: F */
    public final void m49543F() {
        if (this.f32156n.f85534b.m49585p0()) {
            xdl0.m208344M(this.f32145c, false);
            xdl0.m208344M(this.f32148f, true);
            this.f32148f.setText("拍一张回复，与对方交换");
            xdl0.m208344M(this.f32153k, this.f32156n.f85534b.f32169c == PicExchangePresenter.Status.main_choose_photo);
            return;
        }
        PicExchangePresenter.Status status = this.f32156n.f85534b.f32169c;
        PicExchangePresenter.Status status2 = PicExchangePresenter.Status.main_choose_photo;
        VLinear vLinear = this.f32145c;
        if (status != status2) {
            xdl0.m208344M(vLinear, false);
            xdl0.m208344M(this.f32148f, true);
            this.f32148f.setText(this.f32156n.f85534b.f32173g ? "立即发送，对方回拍后才可查看" : "立即发送，对方仅可限时查看");
            this.f32143a.setImageResource(c3c0.f78491C5);
            xdl0.m208344M(this.f32153k, false);
            return;
        }
        xdl0.m208344M(vLinear, true);
        xdl0.m208344M(this.f32148f, false);
        this.f32146d.setTextColor(this.f32156n.f85534b.f32173g ? Color.parseColor("#ffffffff") : Color.parseColor("#80FFFFFF"));
        this.f32147e.setTextColor(!this.f32156n.f85534b.f32173g ? Color.parseColor("#ffffffff") : Color.parseColor("#80FFFFFF"));
        Drawable drawable = getResources().getDrawable(c3c0.f78518F5);
        drawable.setBounds(0, 0, t100.m186890d(12.0f), t100.m186890d(3.0f));
        this.f32146d.setCompoundDrawables(null, null, null, this.f32156n.f85534b.f32173g ? drawable : null);
        TextView textView = this.f32147e;
        if (this.f32156n.f85534b.f32173g) {
            drawable = null;
        }
        textView.setCompoundDrawables(null, null, null, drawable);
    }

    /* JADX INFO: renamed from: G */
    public void m49544G() {
        int i = C8574b.f32166a[this.f32156n.f85534b.f32169c.ordinal()];
        if (i == 1) {
            xdl0.m208344M(this.f32154l, false);
            xdl0.m208344M(this.f32155m, true);
            this.f32143a.setImageResource(c3c0.f78509E5);
            xdl0.m208344M(this.f32151i, true);
            this.f32151i.setImageResource(c3c0.f78527G5);
            xdl0.m208344M(this.f32152j, true);
            this.f32152j.setImageResource(c3c0.f78554J5);
            xdl0.m208344M(this.f32153k, true);
        } else if (i == 2) {
            xdl0.m208344M(this.f32155m, false);
            xdl0.m208344M(this.f32154l, true);
            xdl0.m208344M(this.f32151i, true);
            this.f32151i.setImageResource(c3c0.f78500D5);
            xdl0.m208344M(this.f32152j, true);
            this.f32152j.setImageResource(c3c0.f78536H5);
        } else if (i == 3) {
            xdl0.m208344M(this.f32155m, false);
            xdl0.m208344M(this.f32154l, true);
            xdl0.m208344M(this.f32151i, true);
            this.f32151i.setImageResource(c3c0.f78527G5);
            xdl0.m208344M(this.f32152j, true);
            this.f32152j.setImageResource(c3c0.f78536H5);
        } else if (i == 4) {
            xdl0.m208344M(this.f32154l, false);
            xdl0.m208344M(this.f32155m, true);
            xdl0.m208344M(this.f32151i, false);
            xdl0.m208344M(this.f32152j, true);
            this.f32152j.setImageResource(c3c0.f78554J5);
        }
        m49543F();
    }

    /* JADX INFO: renamed from: o */
    public final void m49545o(View view) {
        vc70.m197747a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49545o(this);
    }

    /* JADX INFO: renamed from: p */
    public void m49546p() {
        if (NullChecker.m81303a(this.f32161s) && this.f32159q) {
            this.f32161s.cancel();
        }
        PicExchangePresenter.Status status = this.f32156n.f85534b.f32169c;
        PicExchangePresenter.Status status2 = PicExchangePresenter.Status.main_choose_photo;
        boolean zEquals = status.equals(status2);
        dd70 dd70Var = this.f32156n;
        if (zEquals) {
            dd70Var.f85533a.m44477e2();
            zvf0.m220396r("e_newphoto_close", this.f32156n.f85533a.pageId());
        } else {
            dd70Var.f85534b.f32169c = status2;
            m49544G();
            zvf0.m220396r("e_newphoto_back", this.f32156n.f85533a.pageId());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m49547q() {
        C4348d.m20896l().m20900k(this.f32158p);
        C4348d.m20896l().m20900k(this.f32157o);
    }

    /* JADX INFO: renamed from: r */
    public final void m49548r(final List<String> list) {
        mkd0.m154992z(this.f32163u);
        final int size = list.size();
        this.f32160r = 0;
        this.f32163u = C22306c.interval(10L, 150L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.fc70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96774a.m49550t(size, list, (Long) obj);
            }
        }, new e30() { // from class: l.gc70
            @Override // p149l.e30
            public final void call(Object obj) {
                PicExchangeLayout.m49524a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public void m49549s(final dd70 dd70Var) {
        this.f32156n = dd70Var;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f32149g.getLayoutParams();
        int i = f32142v;
        layoutParams.width = i;
        layoutParams.height = i;
        this.f32149g.setLayoutParams(layoutParams);
        xdl0.m208329E0(this.f32146d, new View.OnClickListener() { // from class: l.ec70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90475a.m49551u(dd70Var, view);
            }
        });
        xdl0.m208329E0(this.f32147e, new View.OnClickListener() { // from class: l.hc70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107031a.m49552v(dd70Var, view);
            }
        });
        xdl0.m208329E0(this.f32152j, new View.OnClickListener() { // from class: l.ic70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112441a.m49553w(dd70Var, view);
            }
        });
        xdl0.m208329E0(this.f32151i, new View.OnClickListener() { // from class: l.jc70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117269a.m49554x(dd70Var, view);
            }
        });
        final String stringExtra = dd70Var.f85533a.getIntent().getStringExtra("ext_uid");
        xdl0.m208329E0(this.f32153k, new View.OnClickListener() { // from class: l.kc70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PicExchangeLayout.m49525b(dd70Var, stringExtra, view);
            }
        });
        xdl0.m208329E0(this.f32143a, new View.OnClickListener() { // from class: l.lc70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127383a.m49555y(view);
            }
        });
        this.f32149g.addView(dd70Var.f85534b.f32168b.m186991j());
        this.f32155m = new ImageView(getContext());
        int i2 = t100.f167270s;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 8388613;
        int i3 = t100.f167264m;
        layoutParams2.topMargin = i3;
        layoutParams2.rightMargin = i3;
        this.f32155m.setImageResource(c3c0.f78545I5);
        this.f32149g.addView(this.f32155m, layoutParams2);
        xdl0.m208329E0(this.f32155m, new View.OnClickListener() { // from class: l.mc70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PicExchangeLayout.m49526c(dd70Var, view);
            }
        });
        ShootingResultView shootingResultView = new ShootingResultView(getContext());
        this.f32154l = shootingResultView;
        shootingResultView.setRadius(xdl0.m208407w(24.0f));
        this.f32149g.addView(this.f32154l);
        if (NullChecker.m81303a(this.f32154l.getCancelView())) {
            xdl0.m208344M(this.f32154l.getCancelView(), false);
        }
        m49544G();
        m49539B();
        if (xdl0.m208408w0() < t100.m186890d(300.0f) + i + xdl0.m208331F0()) {
            xdl0.m208360X(this.f32144b, t100.m186890d(10.0f));
            xdl0.m208357U(this.f32144b, t100.m186890d(32.0f));
            xdl0.m208360X(this.f32150h, t100.m186890d(42.0f));
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m49550t(int i, List list, Long l2) {
        Drawable drawable;
        int i2 = this.f32160r;
        if (i2 < 0 || i2 >= i) {
            m49540C();
            return;
        }
        String str = (String) list.get(i2);
        if (TextUtils.isEmpty(str) || (drawable = this.f32162t.get(str)) == null) {
            return;
        }
        this.f32156n.f85534b.f32172f = rhi.m179355B(str);
        this.f32154l.m49223o(drawable);
        this.f32160r++;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m49551u(dd70 dd70Var, View view) {
        dd70Var.f85534b.f32173g = true;
        m49544G();
        m49542E(true);
        zvf0.m220396r("e_switchphoto_tab", dd70Var.f85533a.pageId());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m49552v(dd70 dd70Var, View view) {
        dd70Var.f85534b.f32173g = false;
        m49547q();
        m49544G();
        m49542E(true);
        zvf0.m220396r("e_timephoto_tab", dd70Var.f85533a.pageId());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m49553w(dd70 dd70Var, View view) {
        String str;
        if (dd70Var.f85534b.f32169c.equals(PicExchangePresenter.Status.main_choose_photo) || dd70Var.f85534b.f32169c.equals(PicExchangePresenter.Status.shooting_preview_del)) {
            m49542E(false);
            zvf0.m220396r("e_camera_on", dd70Var.f85533a.pageId());
            return;
        }
        dd70Var.f85534b.m49577A0();
        String strPageId = dd70Var.f85533a.pageId();
        PicExchangePresenter picExchangePresenter = dd70Var.f85534b;
        if (picExchangePresenter.f32173g) {
            str = picExchangePresenter.m49585p0() ? SysnotifListener.ACTION_REPLY : "switch";
        } else {
            str = "time";
        }
        zvf0.m220399u("e_newphoto_send", strPageId, vwb.m200311Y("new_photo_type", str), vwb.m200311Y("new_photo_channel", dd70Var.f85534b.f32169c.equals(PicExchangePresenter.Status.random_preview) ? BLivePkCategory.random : "camera"));
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m49554x(dd70 dd70Var, View view) {
        m49547q();
        if (!dd70Var.f85534b.f32169c.equals(PicExchangePresenter.Status.main_choose_photo) && !dd70Var.f85534b.f32169c.equals(PicExchangePresenter.Status.random_preview)) {
            if (dd70Var.f85534b.f32169c.equals(PicExchangePresenter.Status.shooting_preview)) {
                dd70Var.f85534b.f32169c = PicExchangePresenter.Status.shooting_preview_del;
                this.f32154l.m49224p();
                m49544G();
                zvf0.m220396r("e_newphoto_delete", dd70Var.f85533a.pageId());
                return;
            }
            return;
        }
        if (NullChecker.m81303a(dd70Var.f85534b.f32176j) && NullChecker.m81303a(dd70Var.f85534b.f32174h) && dd70Var.f85534b.f32174h.isEmpty()) {
            osi0.m165783g("暂无照片");
            return;
        }
        PicExchangePresenter picExchangePresenter = dd70Var.f85534b;
        if (picExchangePresenter.f32176j == null || picExchangePresenter.f32174h == null) {
            osi0.m165783g("相册准备中...");
            return;
        }
        picExchangePresenter.f32169c = PicExchangePresenter.Status.random_preview;
        if (NullChecker.m81303a(this.f32162t)) {
            this.f32162t.clear();
            this.f32162t.putAll(dd70Var.f85534b.f32174h);
        } else {
            this.f32162t = new HashMap(dd70Var.f85534b.f32174h);
        }
        m49541D();
        dd70Var.f85534b.m49583m0();
        zvf0.m220396r("e_picture_random", dd70Var.f85533a.pageId());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m49555y(View view) {
        m49546p();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m49556z(String str) {
        m49547q();
    }

    public PicExchangeLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32157o = "key_bubble_random_guide";
        this.f32158p = "key_bubble_limit_guide";
        this.f32159q = false;
        this.f32160r = -1;
    }

    public PicExchangeLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32157o = "key_bubble_random_guide";
        this.f32158p = "key_bubble_limit_guide";
        this.f32159q = false;
        this.f32160r = -1;
    }
}

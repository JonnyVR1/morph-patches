package com.p051p1.mobile.putong.core.p058ui.messages.newpic;

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
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PicExchangeEditPopWindowConfig;
import com.p051p1.mobile.putong.core.p058ui.messages.media.widget.RecorderView;
import com.p051p1.mobile.putong.core.p058ui.messages.media.widget.ShootingResultView;
import com.p051p1.mobile.putong.core.p058ui.messages.newpic.PicExchangeLayout;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VLinear;
import p153l.bl70;
import p153l.bnl0;
import p153l.fo0;
import p153l.g96;
import p153l.gt0;
import p153l.i1y;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jl70;
import p153l.jyb;
import p153l.kcg0;
import p153l.oki;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.r1j0;
import p153l.wo50;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class PicExchangeLayout extends LinearLayout {

    /* JADX INFO: renamed from: v */
    public static final int f32990v = qa00.m175858c().widthPixels - qa00.f156330q;

    /* JADX INFO: renamed from: a */
    public ImageView f32991a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f32992b;

    /* JADX INFO: renamed from: c */
    public VLinear f32993c;

    /* JADX INFO: renamed from: d */
    public TextView f32994d;

    /* JADX INFO: renamed from: e */
    public TextView f32995e;

    /* JADX INFO: renamed from: f */
    public TextView f32996f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f32997g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f32998h;

    /* JADX INFO: renamed from: i */
    public ImageView f32999i;

    /* JADX INFO: renamed from: j */
    public ImageView f33000j;

    /* JADX INFO: renamed from: k */
    public ImageView f33001k;

    /* JADX INFO: renamed from: l */
    public ShootingResultView f33002l;

    /* JADX INFO: renamed from: m */
    public ImageView f33003m;

    /* JADX INFO: renamed from: n */
    public jl70 f33004n;

    /* JADX INFO: renamed from: o */
    public String f33005o;

    /* JADX INFO: renamed from: p */
    public String f33006p;

    /* JADX INFO: renamed from: q */
    public boolean f33007q;

    /* JADX INFO: renamed from: r */
    public int f33008r;

    /* JADX INFO: renamed from: s */
    public AnimatorSet f33009s;

    /* JADX INFO: renamed from: t */
    public Map<String, Drawable> f33010t;

    /* JADX INFO: renamed from: u */
    public kcg0 f33011u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.newpic.PicExchangeLayout$a */
    public class C8736a implements wo50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f33012a;

        public C8736a(boolean z) {
            this.f33012a = z;
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m50743e(Throwable th) {
        }

        @Override // p153l.wo50
        /* JADX INFO: renamed from: a */
        public void mo50745a(Exception exc) {
            exc.getMessage();
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m50746g(List list) {
            PicExchangeLayout.this.f33004n.f121482b.f33020f = ((Media) list.get(0)).url;
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m50747h() {
            PicExchangeLayout.this.m50727G();
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m50748i(String str, boolean z) {
            RecorderView.StatusInfo statusInfo = new RecorderView.StatusInfo(str, true);
            PicExchangeLayout.this.f33002l.m50407p();
            PicExchangeLayout picExchangeLayout = PicExchangeLayout.this;
            if (z) {
                picExchangeLayout.f33002l.m50405n(statusInfo.getPath(), PicExchangeLayout.f32990v);
                bnl0.m105524M(PicExchangeLayout.this.f33002l, true);
                PicExchangeLayout.this.f33002l.postDelayed(new Runnable() { // from class: l.al70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f72079a.m50747h();
                    }
                }, 500L);
            } else {
                picExchangeLayout.f33002l.m50404m(statusInfo.getPath(), statusInfo.isPhoto(), bnl0.m105587w(24.0f));
                PicExchangeLayout.this.f33004n.f121482b.f33017c = PicExchangePresenter.Status.shooting_preview;
                PicExchangeLayout.this.m50727G();
            }
        }

        @Override // p153l.wo50
        public void success(final String str) {
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                return;
            }
            if (!this.f33012a) {
                Picture pictureNew_ = Picture.new_();
                pictureNew_.url = oki.m168011B(str);
                pictureNew_.mediaType = "image/*";
                pictureNew_.status = MediaLocalStatus.get("raw");
                PicExchangeLayout.this.f33004n.f121481a.duringCreated(new i1y((List<Media>) jyb.m147482M(pictureNew_), false, true).compose(psd0.m173592C()).last().filter(new qcj() { // from class: l.wk70
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!jyb.m147479J((List) obj));
                    }
                })).subscribe(psd0.m173597H(new y20() { // from class: l.xk70
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f194715a.m50746g((List) obj);
                    }
                }, new y20() { // from class: l.yk70
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        PicExchangeLayout.C8736a.m50743e((Throwable) obj);
                    }
                }));
            }
            PicExchangeEditAct picExchangeEditAct = PicExchangeLayout.this.f33004n.f121481a;
            final boolean z = this.f33012a;
            picExchangeEditAct.runOnUiThread(new Runnable() { // from class: l.zk70
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204747a.m50748i(str, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.newpic.PicExchangeLayout$b */
    public static /* synthetic */ class C8737b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33014a;

        static {
            int[] iArr = new int[PicExchangePresenter.Status.values().length];
            f33014a = iArr;
            try {
                iArr[PicExchangePresenter.Status.main_choose_photo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33014a[PicExchangePresenter.Status.shooting_preview.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33014a[PicExchangePresenter.Status.random_preview.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33014a[PicExchangePresenter.Status.shooting_preview_del.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public PicExchangeLayout(Context context) {
        super(context);
        this.f33005o = "key_bubble_random_guide";
        this.f33006p = "key_bubble_limit_guide";
        this.f33007q = false;
        this.f33008r = -1;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m50707a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m50708b(jl70 jl70Var, String str, View view) {
        jl70Var.f121482b.m50761C0(str);
        i4g0.m138520r("e_photo_album", jl70Var.f121481a.pageId());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m50709c(jl70 jl70Var, View view) {
        jl70Var.f121482b.m50763E0();
        i4g0.m138520r("e_camera_switch", jl70Var.f121481a.pageId());
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m50721A(List list) {
        this.f33007q = true;
        m50727G();
        bnl0.m105524M(this.f32998h, false);
        m50731r(g96.m129515b(list, list.size()));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: B */
    public final void m50722B() {
        PicExchangeEditPopWindowConfig picExchangeEditPopWindowConfig;
        String str;
        String str2;
        int i;
        String str3;
        View view;
        int i2;
        View view2 = null;
        try {
            picExchangeEditPopWindowConfig = PicExchangeEditPopWindowConfig.JSON_ADAPTER.parse(CoreModule.f18264c.f20381e0.f89138U3.get());
        } catch (IOException unused) {
            picExchangeEditPopWindowConfig = null;
        }
        if (picExchangeEditPopWindowConfig == null) {
            return;
        }
        if (!this.f33004n.f121482b.f33021g || !bnl0.m105529O0(this.f32993c) || pzi0.m174438C(pzi0.m174454o(), picExchangeEditPopWindowConfig.switchFunTime) || (i2 = picExchangeEditPopWindowConfig.switchFunNum) >= 5) {
            if (!bnl0.m105529O0(this.f32999i) || pzi0.m174438C(pzi0.m174454o(), picExchangeEditPopWindowConfig.randomTime) || (i = picExchangeEditPopWindowConfig.randomNum) >= 5) {
                str = "";
                str2 = "";
            } else {
                picExchangeEditPopWindowConfig.randomNum = i + 1;
                picExchangeEditPopWindowConfig.randomTime = pzi0.m174454o();
                str3 = this.f33005o;
                view = this.f32999i;
                str2 = "随机一张";
            }
            if (TextUtils.isEmpty(str2)) {
            }
            C4496a c4496a = new C4496a(getContext());
            c4496a.m21848D(str2).m21870l(qa00.m175859d(7.0f)).m21873p(90).m21881x(qa00.m175859d(-8.0f)).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21857M(true).m21862d(new C4496a.b() { // from class: l.tk70
                @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.b
                /* JADX INFO: renamed from: a */
                public final void mo21884a(String str4) {
                    this.f174692a.m50739z(str4);
                }
            }).m21874q(C4496a.f16402Q);
            C4499d.m21895l().m21908u(c4496a, view2, str);
            CoreModule.f18264c.f20381e0.f89138U3.put(picExchangeEditPopWindowConfig.toJson());
        }
        picExchangeEditPopWindowConfig.switchFunNum = i2 + 1;
        picExchangeEditPopWindowConfig.switchFunTime = pzi0.m174454o();
        str3 = this.f33006p;
        view = this.f32995e;
        str2 = "切换玩法";
        View view3 = view;
        str = str3;
        view2 = view3;
        if (TextUtils.isEmpty(str2)) {
            C4496a c4496a2 = new C4496a(getContext());
            c4496a2.m21848D(str2).m21870l(qa00.m175859d(7.0f)).m21873p(90).m21881x(qa00.m175859d(-8.0f)).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21857M(true).m21862d(new C4496a.b() { // from class: l.tk70
                @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.b
                /* JADX INFO: renamed from: a */
                public final void mo21884a(String str4) {
                    this.f174692a.m50739z(str4);
                }
            }).m21874q(C4496a.f16402Q);
            C4499d.m21895l().m21908u(c4496a2, view2, str);
            CoreModule.f18264c.f20381e0.f89138U3.put(picExchangeEditPopWindowConfig.toJson());
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m50723C() {
        if (NullChecker.m82486a(this.f33010t)) {
            this.f33010t.clear();
        }
        psd0.m173633z(this.f33011u);
        this.f33007q = false;
        bnl0.m105524M(this.f32998h, true);
    }

    /* JADX INFO: renamed from: D */
    public final void m50724D() {
        if (this.f33007q || this.f33010t == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList(this.f33010t.keySet());
        long size = ((long) arrayList.size()) * 150;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33009s = animatorSet;
        animatorSet.playTogether(gt0.m132171q(this.f32997g, "scaleX", 1.0f, 0.95f, 1.0f), gt0.m132171q(this.f32997g, "scaleY", 1.0f, 0.95f, 1.0f));
        this.f33009s.setInterpolator(new LinearInterpolator());
        this.f33009s.setDuration(size);
        this.f33009s.addListener(gt0.m132162h(new Runnable() { // from class: l.uk70
            @Override // java.lang.Runnable
            public final void run() {
                this.f179370a.m50721A(arrayList);
            }
        }, new Runnable() { // from class: l.vk70
            @Override // java.lang.Runnable
            public final void run() {
                this.f184463a.m50723C();
            }
        }, new Runnable() { // from class: l.vk70
            @Override // java.lang.Runnable
            public final void run() {
                this.f184463a.m50723C();
            }
        }));
        this.f33009s.start();
    }

    /* JADX INFO: renamed from: E */
    public final void m50725E(boolean z) {
        PicExchangePresenter picExchangePresenter = this.f33004n.f121482b;
        picExchangePresenter.f33020f = null;
        picExchangePresenter.m50764F0(new C8736a(z));
    }

    /* JADX INFO: renamed from: F */
    public final void m50726F() {
        if (this.f33004n.f121482b.m50768p0()) {
            bnl0.m105524M(this.f32993c, false);
            bnl0.m105524M(this.f32996f, true);
            this.f32996f.setText("拍一张回复，与对方交换");
            bnl0.m105524M(this.f33001k, this.f33004n.f121482b.f33017c == PicExchangePresenter.Status.main_choose_photo);
            return;
        }
        PicExchangePresenter.Status status = this.f33004n.f121482b.f33017c;
        PicExchangePresenter.Status status2 = PicExchangePresenter.Status.main_choose_photo;
        VLinear vLinear = this.f32993c;
        if (status != status2) {
            bnl0.m105524M(vLinear, false);
            bnl0.m105524M(this.f32996f, true);
            this.f32996f.setText(this.f33004n.f121482b.f33021g ? "立即发送，对方回拍后才可查看" : "立即发送，对方仅可限时查看");
            this.f32991a.setImageResource(ibc0.f113766C5);
            bnl0.m105524M(this.f33001k, false);
            return;
        }
        bnl0.m105524M(vLinear, true);
        bnl0.m105524M(this.f32996f, false);
        this.f32994d.setTextColor(this.f33004n.f121482b.f33021g ? Color.parseColor("#ffffffff") : Color.parseColor("#80FFFFFF"));
        this.f32995e.setTextColor(!this.f33004n.f121482b.f33021g ? Color.parseColor("#ffffffff") : Color.parseColor("#80FFFFFF"));
        Drawable drawable = getResources().getDrawable(ibc0.f113793F5);
        drawable.setBounds(0, 0, qa00.m175859d(12.0f), qa00.m175859d(3.0f));
        this.f32994d.setCompoundDrawables(null, null, null, this.f33004n.f121482b.f33021g ? drawable : null);
        TextView textView = this.f32995e;
        if (this.f33004n.f121482b.f33021g) {
            drawable = null;
        }
        textView.setCompoundDrawables(null, null, null, drawable);
    }

    /* JADX INFO: renamed from: G */
    public void m50727G() {
        int i = C8737b.f33014a[this.f33004n.f121482b.f33017c.ordinal()];
        if (i == 1) {
            bnl0.m105524M(this.f33002l, false);
            bnl0.m105524M(this.f33003m, true);
            this.f32991a.setImageResource(ibc0.f113784E5);
            bnl0.m105524M(this.f32999i, true);
            this.f32999i.setImageResource(ibc0.f113802G5);
            bnl0.m105524M(this.f33000j, true);
            this.f33000j.setImageResource(ibc0.f113829J5);
            bnl0.m105524M(this.f33001k, true);
        } else if (i == 2) {
            bnl0.m105524M(this.f33003m, false);
            bnl0.m105524M(this.f33002l, true);
            bnl0.m105524M(this.f32999i, true);
            this.f32999i.setImageResource(ibc0.f113775D5);
            bnl0.m105524M(this.f33000j, true);
            this.f33000j.setImageResource(ibc0.f113811H5);
        } else if (i == 3) {
            bnl0.m105524M(this.f33003m, false);
            bnl0.m105524M(this.f33002l, true);
            bnl0.m105524M(this.f32999i, true);
            this.f32999i.setImageResource(ibc0.f113802G5);
            bnl0.m105524M(this.f33000j, true);
            this.f33000j.setImageResource(ibc0.f113811H5);
        } else if (i == 4) {
            bnl0.m105524M(this.f33002l, false);
            bnl0.m105524M(this.f33003m, true);
            bnl0.m105524M(this.f32999i, false);
            bnl0.m105524M(this.f33000j, true);
            this.f33000j.setImageResource(ibc0.f113829J5);
        }
        m50726F();
    }

    /* JADX INFO: renamed from: o */
    public final void m50728o(View view) {
        bl70.m104870a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50728o(this);
    }

    /* JADX INFO: renamed from: p */
    public void m50729p() {
        if (NullChecker.m82486a(this.f33009s) && this.f33007q) {
            this.f33009s.cancel();
        }
        PicExchangePresenter.Status status = this.f33004n.f121482b.f33017c;
        PicExchangePresenter.Status status2 = PicExchangePresenter.Status.main_choose_photo;
        boolean zEquals = status.equals(status2);
        jl70 jl70Var = this.f33004n;
        if (zEquals) {
            jl70Var.f121481a.m45660g2();
            i4g0.m138520r("e_newphoto_close", this.f33004n.f121481a.pageId());
        } else {
            jl70Var.f121482b.f33017c = status2;
            m50727G();
            i4g0.m138520r("e_newphoto_back", this.f33004n.f121481a.pageId());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m50730q() {
        C4499d.m21895l().m21899k(this.f33006p);
        C4499d.m21895l().m21899k(this.f33005o);
    }

    /* JADX INFO: renamed from: r */
    public final void m50731r(final List<String> list) {
        psd0.m173633z(this.f33011u);
        final int size = list.size();
        this.f33008r = 0;
        this.f33011u = C22421c.interval(10L, 150L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.lk70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132449a.m50733t(size, list, (Long) obj);
            }
        }, new y20() { // from class: l.mk70
            @Override // p153l.y20
            public final void call(Object obj) {
                PicExchangeLayout.m50707a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public void m50732s(final jl70 jl70Var) {
        this.f33004n = jl70Var;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f32997g.getLayoutParams();
        int i = f32990v;
        layoutParams.width = i;
        layoutParams.height = i;
        this.f32997g.setLayoutParams(layoutParams);
        bnl0.m105509E0(this.f32994d, new View.OnClickListener() { // from class: l.kk70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127172a.m50734u(jl70Var, view);
            }
        });
        bnl0.m105509E0(this.f32995e, new View.OnClickListener() { // from class: l.nk70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142437a.m50735v(jl70Var, view);
            }
        });
        bnl0.m105509E0(this.f33000j, new View.OnClickListener() { // from class: l.ok70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147737a.m50736w(jl70Var, view);
            }
        });
        bnl0.m105509E0(this.f32999i, new View.OnClickListener() { // from class: l.pk70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152803a.m50737x(jl70Var, view);
            }
        });
        final String stringExtra = jl70Var.f121481a.getIntent().getStringExtra("ext_uid");
        bnl0.m105509E0(this.f33001k, new View.OnClickListener() { // from class: l.qk70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PicExchangeLayout.m50708b(jl70Var, stringExtra, view);
            }
        });
        bnl0.m105509E0(this.f32991a, new View.OnClickListener() { // from class: l.rk70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163546a.m50738y(view);
            }
        });
        this.f32997g.addView(jl70Var.f121482b.f33016b.m103281j());
        this.f33003m = new ImageView(getContext());
        int i2 = qa00.f156332s;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 8388613;
        int i3 = qa00.f156326m;
        layoutParams2.topMargin = i3;
        layoutParams2.rightMargin = i3;
        this.f33003m.setImageResource(ibc0.f113820I5);
        this.f32997g.addView(this.f33003m, layoutParams2);
        bnl0.m105509E0(this.f33003m, new View.OnClickListener() { // from class: l.sk70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PicExchangeLayout.m50709c(jl70Var, view);
            }
        });
        ShootingResultView shootingResultView = new ShootingResultView(getContext());
        this.f33002l = shootingResultView;
        shootingResultView.setRadius(bnl0.m105587w(24.0f));
        this.f32997g.addView(this.f33002l);
        if (NullChecker.m82486a(this.f33002l.getCancelView())) {
            bnl0.m105524M(this.f33002l.getCancelView(), false);
        }
        m50727G();
        m50722B();
        if (bnl0.m105588w0() < qa00.m175859d(300.0f) + i + bnl0.m105511F0()) {
            bnl0.m105540X(this.f32992b, qa00.m175859d(10.0f));
            bnl0.m105537U(this.f32992b, qa00.m175859d(32.0f));
            bnl0.m105540X(this.f32998h, qa00.m175859d(42.0f));
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m50733t(int i, List list, Long l2) {
        Drawable drawable;
        int i2 = this.f33008r;
        if (i2 < 0 || i2 >= i) {
            m50723C();
            return;
        }
        String str = (String) list.get(i2);
        if (TextUtils.isEmpty(str) || (drawable = this.f33010t.get(str)) == null) {
            return;
        }
        this.f33004n.f121482b.f33020f = oki.m168011B(str);
        this.f33002l.m50406o(drawable);
        this.f33008r++;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m50734u(jl70 jl70Var, View view) {
        jl70Var.f121482b.f33021g = true;
        m50727G();
        m50725E(true);
        i4g0.m138520r("e_switchphoto_tab", jl70Var.f121481a.pageId());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m50735v(jl70 jl70Var, View view) {
        jl70Var.f121482b.f33021g = false;
        m50730q();
        m50727G();
        m50725E(true);
        i4g0.m138520r("e_timephoto_tab", jl70Var.f121481a.pageId());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m50736w(jl70 jl70Var, View view) {
        String str;
        if (jl70Var.f121482b.f33017c.equals(PicExchangePresenter.Status.main_choose_photo) || jl70Var.f121482b.f33017c.equals(PicExchangePresenter.Status.shooting_preview_del)) {
            m50725E(false);
            i4g0.m138520r("e_camera_on", jl70Var.f121481a.pageId());
            return;
        }
        jl70Var.f121482b.m50760A0();
        String strPageId = jl70Var.f121481a.pageId();
        PicExchangePresenter picExchangePresenter = jl70Var.f121482b;
        if (picExchangePresenter.f33021g) {
            str = picExchangePresenter.m50768p0() ? SysnotifListener.ACTION_REPLY : "switch";
        } else {
            str = "time";
        }
        i4g0.m138523u("e_newphoto_send", strPageId, jyb.m147494Y("new_photo_type", str), jyb.m147494Y("new_photo_channel", jl70Var.f121482b.f33017c.equals(PicExchangePresenter.Status.random_preview) ? BLivePkCategory.random : "camera"));
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m50737x(jl70 jl70Var, View view) {
        m50730q();
        if (!jl70Var.f121482b.f33017c.equals(PicExchangePresenter.Status.main_choose_photo) && !jl70Var.f121482b.f33017c.equals(PicExchangePresenter.Status.random_preview)) {
            if (jl70Var.f121482b.f33017c.equals(PicExchangePresenter.Status.shooting_preview)) {
                jl70Var.f121482b.f33017c = PicExchangePresenter.Status.shooting_preview_del;
                this.f33002l.m50407p();
                m50727G();
                i4g0.m138520r("e_newphoto_delete", jl70Var.f121481a.pageId());
                return;
            }
            return;
        }
        if (NullChecker.m82486a(jl70Var.f121482b.f33024j) && NullChecker.m82486a(jl70Var.f121482b.f33022h) && jl70Var.f121482b.f33022h.isEmpty()) {
            r1j0.m179420g("暂无照片");
            return;
        }
        PicExchangePresenter picExchangePresenter = jl70Var.f121482b;
        if (picExchangePresenter.f33024j == null || picExchangePresenter.f33022h == null) {
            r1j0.m179420g("相册准备中...");
            return;
        }
        picExchangePresenter.f33017c = PicExchangePresenter.Status.random_preview;
        if (NullChecker.m82486a(this.f33010t)) {
            this.f33010t.clear();
            this.f33010t.putAll(jl70Var.f121482b.f33022h);
        } else {
            this.f33010t = new HashMap(jl70Var.f121482b.f33022h);
        }
        m50724D();
        jl70Var.f121482b.m50766m0();
        i4g0.m138520r("e_picture_random", jl70Var.f121481a.pageId());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m50738y(View view) {
        m50729p();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m50739z(String str) {
        m50730q();
    }

    public PicExchangeLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33005o = "key_bubble_random_guide";
        this.f33006p = "key_bubble_limit_guide";
        this.f33007q = false;
        this.f33008r = -1;
    }

    public PicExchangeLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33005o = "key_bubble_random_guide";
        this.f33006p = "key_bubble_limit_guide";
        this.f33007q = false;
        this.f33008r = -1;
    }
}

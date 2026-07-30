package com.p000p1.mobile.putong.core.p004ui.vip.privilege;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.VipFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import l.e30;
import l.eb2;
import l.eqh0;
import l.ht80;
import l.mkd0;
import l.t100;
import l.vcl0;
import l.w2b0;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.zb90;
import l.zvf0;
import p006l.gt80;
import p006l.owo;
import p006l.qgl0;
import p006l.qib0;
import p006l.src0;
import p006l.w0c0;
import p006l.x2c0;
import p006l.xma;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeCard extends PrivilegeBaseCard {

    /* JADX INFO: renamed from: A */
    public boolean f7229A;

    /* JADX INFO: renamed from: d */
    public PrivilegeCard f7230d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f7231e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f7232f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f7233g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f7234h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f7235i;

    /* JADX INFO: renamed from: j */
    public VImage f7236j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f7237k;

    /* JADX INFO: renamed from: l */
    public VImage f7238l;

    /* JADX INFO: renamed from: m */
    public VLinear f7239m;

    /* JADX INFO: renamed from: n */
    public VImage f7240n;

    /* JADX INFO: renamed from: o */
    public VText f7241o;

    /* JADX INFO: renamed from: p */
    public VText f7242p;

    /* JADX INFO: renamed from: q */
    public VText f7243q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f7244r;

    /* JADX INFO: renamed from: s */
    public VText f7245s;

    /* JADX INFO: renamed from: t */
    public VText f7246t;

    /* JADX INFO: renamed from: u */
    public SVGAnimationView f7247u;

    /* JADX INFO: renamed from: v */
    public SVGAnimationView f7248v;

    /* JADX INFO: renamed from: w */
    public eb2 f7249w;

    /* JADX INFO: renamed from: x */
    public PutongFrag f7250x;

    /* JADX INFO: renamed from: y */
    public PurchaseType f7251y;

    /* JADX INFO: renamed from: z */
    public boolean f7252z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$a */
    public class C0410a extends AnimListener {
        public C0410a() {
        }

        public void onFinished() {
            xdl0.M0(PrivilegeCard.this.f7238l, true);
        }

        public void onStart() {
            gt80.m15969a().f13490f = true;
            xdl0.M0(PrivilegeCard.this.f7247u, false);
            xdl0.M0(PrivilegeCard.this.f7238l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$b */
    public class C0411b extends AnimListener {
        public C0411b() {
        }

        public void onFinished() {
            super.onFinished();
            xdl0.M0(PrivilegeCard.this.f7238l, true);
        }

        public void onStart() {
            super.onStart();
            gt80.m15969a().f13489e = true;
            xdl0.M0(PrivilegeCard.this.f7247u, false);
            xdl0.M0(PrivilegeCard.this.f7238l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$c */
    public class C0412c extends AnimListener {
        public C0412c() {
        }

        public void onFinished() {
            super.onFinished();
        }

        public void onStart() {
            super.onStart();
            xdl0.M0(PrivilegeCard.this.f7238l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$d */
    public class C0413d extends AnimListener {
        public C0413d() {
        }

        public void onFinished() {
            super.onFinished();
        }

        public void onStart() {
            super.onStart();
            gt80.m15969a().f13488d = true;
            xdl0.M0(PrivilegeCard.this.f7238l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$e */
    public class C0414e extends AnimListener {
        public C0414e() {
        }

        public void onFinished() {
            super.onFinished();
        }

        public void onStart() {
            super.onStart();
            gt80.m15969a().f13487c = true;
            xdl0.M0(PrivilegeCard.this.f7238l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$f */
    public class C0415f extends AnimListener {
        public C0415f() {
        }

        public void onFinished() {
            super.onFinished();
        }

        public void onStart() {
            super.onStart();
            xdl0.M0(PrivilegeCard.this.f7238l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$g */
    public class C0416g extends AnimListener {
        public C0416g() {
        }

        public void onFinished() {
            super.onFinished();
            xdl0.M0(PrivilegeCard.this.f7247u, true);
            PrivilegeCard.this.f7247u.startAnimation();
        }

        public void onStart() {
            super.onStart();
            gt80.m15969a().f13486b = true;
            xdl0.M0(PrivilegeCard.this.f7247u, false);
            xdl0.M0(PrivilegeCard.this.f7238l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$h */
    public class C0417h implements RequestCallback {
        public C0417h() {
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            xdl0.M0(PrivilegeCard.this.f7238l, true);
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$i */
    public static /* synthetic */ class C0418i {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7261a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f7261a = iArr;
            try {
                iArr[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7261a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7261a[PurchaseType.TYPE_GET_VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7261a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7261a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7261a[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public PrivilegeCard(Context context) {
        super(context);
        this.f7252z = false;
        this.f7229A = false;
    }

    /* JADX INFO: renamed from: L0 */
    private void m10310L0() {
        this.f7252z = false;
        xdl0.M(this.f7246t, false);
        switch (C0418i.f7261a[this.f7251y.ordinal()]) {
            case 1:
                m10338V0();
                break;
            case 2:
                m10332P0();
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                m10337U0();
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
                m10335S0();
                break;
            case 5:
                m10333Q0();
                break;
            case 6:
                m10334R0();
                break;
        }
        m10347w0();
    }

    /* JADX INFO: renamed from: N0 */
    private void m10311N0() {
        this.f7249w.n(this.f7250x, CoreModule.f1534c.f3628e0.m21486o9().map(new w9j() { // from class: l.ys80
            public final Object call(Object obj) {
                return ((User) obj).fp().profileSmall();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.zs80
            public final void call(Object obj) {
                this.f28956a.m10348z0((Picture.ImageUri) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    private void m10321u0() {
        if (xdl0.w0() <= 1280) {
            this.f7241o.setTextSize(2, xdl0.w0() < 960 ? 16.0f : 18.0f);
            this.f7243q.setTextSize(2, xdl0.w0() < 960 ? 12.0f : 13.0f);
            this.f7245s.setTextSize(2, xdl0.w0() < 960 ? 11.0f : 12.0f);
            this.f7246t.setTextSize(2, xdl0.w0() < 960 ? 10.0f : 11.0f);
            ((RelativeLayout.LayoutParams) this.f7243q.getLayoutParams()).setMargins(t100.d(17.0f), t100.d(4.0f), t100.d(17.0f), 0);
            ((RelativeLayout.LayoutParams) this.f7237k.getLayoutParams()).setMargins(t100.d(16.0f), t100.d(16.0f), 0, 0);
            this.f7244r.getLayoutParams().width = t100.d(22.0f);
            this.f7244r.getLayoutParams().height = t100.d(22.0f);
        }
    }

    /* JADX INFO: renamed from: y0 */
    private void m10322y0() {
        m10311N0();
        switch (C0418i.f7261a[this.f7251y.ordinal()]) {
            case 1:
                m10344e1();
                break;
            case 2:
                m10339X0();
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                m10343d1();
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
                m10342a1();
                break;
            case 5:
                m10340Y0();
                break;
            case 6:
                m10341Z0();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m10323B0(View view) {
        zvf0.u("e_myvip_auto", "p_privileges_view", src0.m24159r().m24175R());
        String strC = w2b0.c("p_privilege,default", 2);
        if (src0.m24159r().m24190z()) {
            src0.m24159r().m24176S((Act) xdl0.E(this), src0.m24159r().m24179l() ? "myvip_reauto_button_unauto_order" : "myvip_reauto_button");
            return;
        }
        boolean zM24172M = src0.m24159r().m24172M();
        PutongFrag putongFrag = this.f7250x;
        if (zM24172M) {
            if (putongFrag instanceof VipFrag) {
                ((VipFrag) putongFrag).m10918X4(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, null, strC);
                return;
            } else {
                CoreModule.m1854P().m11706a().m5338Rm((Act) xdl0.E(this), strC);
                return;
            }
        }
        if (putongFrag instanceof VipFrag) {
            ((VipFrag) putongFrag).m10918X4(PurchaseType.TYPE_GET_VIP, null, strC);
        } else {
            c.I1(xdl0.E(this), strC);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m10324D0(UserPrivilege userPrivilege) {
        this.f7245s.setText(qgl0.m22046d(userPrivilege));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m10325E0(UserPrivilege userPrivilege) {
        this.f7245s.setText(qgl0.m22046d(userPrivilege));
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m10326G0(UserPrivilege userPrivilege) {
        this.f7245s.setText(qgl0.m22046d(userPrivilege));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m10327H0(UserPrivilege userPrivilege) {
        if (this.f7252z) {
            m10331O0(qgl0.m22046d(userPrivilege));
        } else {
            this.f7245s.setText(qgl0.m22046d(userPrivilege));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m10328I0(User user) {
        if (this.f7252z) {
            m10331O0(qgl0.m22045c(this.f7250x.act()));
        } else {
            this.f7245s.setText(qgl0.m22045c(this.f7250x.act()));
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m10329J0(UserPrivilege userPrivilege) {
        this.f7245s.setText(qgl0.m22046d(userPrivilege));
    }

    /* JADX INFO: renamed from: K0 */
    public final AnimListener m10330K0() {
        return new C0416g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public final void m10331O0(String str) {
        boolean zM24189y = src0.m24159r().m24189y();
        boolean zM24190z = src0.m24159r().m24190z();
        if (src0.m24159r().m24179l()) {
            xdl0.M(this.f7246t, true);
            this.f7246t.setText("去开通");
            VText vText = this.f7245s;
            PurchaseType purchaseType = this.f7251y;
            PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            vText.setText(src0.m24147Q(purchaseType == purchaseType2));
            this.f7243q.setText(zb90.d(this.f7251y == purchaseType2 ? SummarizedPrivilegesId.get("svip") : SummarizedPrivilegesId.get("unknown_")));
            zvf0.A("e_myvip_auto", "p_privileges_view", src0.m24159r().m24175R());
        } else {
            VText vText2 = this.f7246t;
            if (zM24189y) {
                xdl0.M(vText2, false);
                xaj0<String, Integer, String> xaj0VarM24185u = src0.m24159r().m24185u();
                int iIntValue = ((Integer) xaj0VarM24185u.b).intValue();
                VText vText3 = this.f7245s;
                if (iIntValue == 0) {
                    vText3.setText(String.format(getContext().getString(R$string.f1738G2), xaj0VarM24185u.a));
                } else {
                    vText3.setText(String.format(getContext().getString(R$string.f1768H2), xaj0VarM24185u.a, xaj0VarM24185u.b, xaj0VarM24185u.c));
                }
            } else {
                if (!xdl0.O0(vText2)) {
                    xdl0.M(this.f7246t, true);
                    zvf0.A("e_myvip_auto", "p_privileges_view", src0.m24159r().m24175R());
                }
                VText vText4 = this.f7243q;
                if (zM24190z) {
                    vText4.setText(zb90.d(this.f7251y == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? SummarizedPrivilegesId.get("svip") : SummarizedPrivilegesId.get("unknown_")));
                } else {
                    vText4.setText(str);
                }
                this.f7245s.setText(src0.m24158n());
            }
        }
        this.f7246t.setTextColor(getContext().getResources().getColor(this.f7251y == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? w0c0.f24593B0 : w0c0.f24743y0));
        xdl0.E0(this.f7246t, new View.OnClickListener() { // from class: l.dt80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10560a.m10323B0(view);
            }
        });
        m10347w0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P0 */
    public final void m10332P0() {
        m10311N0();
        this.f7229A = gt80.m15969a().f13489e;
        this.f7231e.setBackgroundResource(x2c0.f27122tf);
        xdl0.M(this.f7240n, false);
        this.f7235i.setBackgroundResource(x2c0.f25951I7);
        this.f7238l.setImageResource(x2c0.f25982J7);
        m10336T0(Color.parseColor("#D659AE"));
        this.f7242p.setTextColor(Color.parseColor("#88D659AE"));
        this.f7233g.setImageResource(x2c0.f26013K7);
        xdl0.V(this.f7241o, 0);
        this.f7241o.setText("她专享会员");
        this.f7241o.setTextColor(Color.parseColor("#BF499A"));
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("femaleVip"));
        this.f7245s.setTextColor(Color.parseColor("#D659AE"));
        this.f7245s.setText(qgl0.m22046d(userPrivilegeM27421w4));
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/13b958ef-7348-4b20-b4ef-e1b293bd661114.pdf").loadCallback(m10346v0()).animListener(new C0411b()).into(this.f7248v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public final void m10333Q0() {
        m10311N0();
        this.f7229A = gt80.m15969a().f13486b;
        this.f7231e.setBackgroundResource(x2c0.f27154uf);
        xdl0.M(this.f7240n, false);
        this.f7235i.setBackgroundResource(x2c0.f26178Ph);
        this.f7238l.setImageResource(x2c0.f26714gl);
        m10336T0(Color.parseColor("#EDD7A3"));
        this.f7242p.setTextColor(Color.parseColor("#88EDD7A3"));
        this.f7236j.setImageResource(x2c0.f27032ql);
        xdl0.V(this.f7241o, 0);
        this.f7241o.setText("黑金会员");
        this.f7241o.setTextColor(Color.parseColor("#ffdea2"));
        boolean zM27351F3 = xma.m27351F3();
        VText vText = this.f7243q;
        if (zM27351F3) {
            vText.setText("尊享探探全平台权益");
        } else {
            vText.setText("");
        }
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("oDiamond"));
        this.f7245s.setTextColor(Color.parseColor("#ffdea2"));
        this.f7245s.setText(qgl0.m22046d(userPrivilegeM27421w4));
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/57ddffe4-496d-4b33-8a24-730f5b74442712.pdf").loadCallback(m10346v0()).animListener(m10330K0()).into(this.f7248v);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).animListener(new C0415f()).from("https://auto.tancdn.com/v1/raw/1f20ff80-2be8-4b6b-97e3-1b386ef7ebfe13.pdf").into(this.f7247u);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/ce9f0f77-ab7b-4dd7-89ae-5a70f41e19cf13.pdf").into(this.f7233g);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).from("https://auto.tancdn.com/v1/raw/19fb0c0a-5ce2-4b1e-9fc7-a8f2a89b27c513.pdf").into(this.f7234h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public final void m10334R0() {
        m10311N0();
        this.f7229A = gt80.m15969a().f13485a;
        this.f7231e.setBackgroundResource(x2c0.f26902mj);
        xdl0.M(this.f7240n, false);
        this.f7235i.setBackgroundResource(x2c0.f26870lj);
        this.f7238l.setImageResource(x2c0.f26746hl);
        m10336T0(Color.parseColor("#21252F"));
        this.f7242p.setTextColor(Color.parseColor("#88EDD7A3"));
        xdl0.V(this.f7241o, 0);
        this.f7241o.setText("白金会员");
        this.f7241o.setTextColor(Color.parseColor("#21252F"));
        boolean zM27353H3 = xma.m27353H3();
        VText vText = this.f7243q;
        if (zM27353H3) {
            vText.setText("");
        } else {
            vText.setText("");
        }
        UserPrivilege userPrivilegeM27421w4 = CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("platinum"));
        this.f7245s.setTextColor(Color.parseColor("#7D8592"));
        this.f7245s.setText(qgl0.m22046d(userPrivilegeM27421w4));
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/adc3cfbd-9efd-46ef-81d6-3397e9fefd0514.pdf").loadCallback(m10346v0()).animListener(m10330K0()).into(this.f7248v);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).animListener(new C0412c()).from("https://auto.tancdn.com/v1/raw/c71d8162-99b7-41bc-bd6b-f90f494d102a14.pdf").into(this.f7247u);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/bfed9882-bda4-4ebc-883c-95f814c1300714.pdf").into(this.f7233g);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).from("https://auto.tancdn.com/v1/raw/ca3c47cd-6545-4b87-a380-a49f4774923b14.pdf").into(this.f7234h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    public final void m10335S0() {
        m10311N0();
        this.f7229A = gt80.m15969a().f13487c;
        this.f7231e.setBackgroundResource(x2c0.f27186vf);
        this.f7240n.setImageResource(x2c0.f26682fl);
        this.f7235i.setBackgroundResource(x2c0.f26217Qp);
        this.f7238l.setImageResource(x2c0.f26777il);
        m10336T0(getResources().getColor(w0c0.f24593B0));
        this.f7246t.setBackgroundResource(x2c0.f26650el);
        this.f7236j.setImageResource(x2c0.f27064rl);
        this.f7242p.setAlpha(0.5f);
        this.f7241o.setText(getResources().getText(R$string.f2217W1));
        if (this.f7252z) {
            m10331O0(qgl0.m22046d(CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("svip"))));
        } else {
            this.f7243q.setText("");
            xdl0.M(this.f7246t, false);
        }
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/dfcb3ce7-f5dc-4598-8654-4ef1487d71ed12.pdf").loadCallback(m10346v0()).animListener(new C0414e()).into(this.f7248v);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/e249dbe0-61dc-47f0-8ec2-6e81c9038d8112.pdf").into(this.f7233g);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).from("https://auto.tancdn.com/v1/raw/8df9ebbd-e5a8-4750-9330-d8e055fda3e712.pdf").into(this.f7234h);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m10336T0(int i) {
        this.f7241o.setTextColor(i);
        this.f7243q.setTextColor(i);
        this.f7245s.setTextColor(i);
        this.f7246t.setTextColor(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U0 */
    public final void m10337U0() {
        m10311N0();
        this.f7229A = gt80.m15969a().f13488d;
        this.f7231e.setBackgroundResource(x2c0.f27218wf);
        this.f7240n.setImageResource(x2c0.f26968ol);
        this.f7235i.setBackgroundResource(x2c0.f26466Yq);
        this.f7238l.setImageResource(x2c0.f27000pl);
        m10336T0(getResources().getColor(w0c0.f24743y0));
        this.f7246t.setBackgroundResource(x2c0.f26936nl);
        this.f7236j.setImageResource(x2c0.f27096sl);
        this.f7242p.setAlpha(0.5f);
        this.f7241o.setText(getResources().getText(R$string.f2247X1));
        this.f7245s.setText(qgl0.m22045c(this.f7250x.act()));
        if (this.f7252z) {
            m10331O0(qgl0.m22045c(this.f7250x.act()));
        } else {
            this.f7243q.setText("");
            xdl0.M(this.f7246t, false);
        }
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/35b423b7-225b-49e3-a18a-df3a23371a5f13.pdf").loadCallback(m10346v0()).animListener(new C0413d()).into(this.f7248v);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/6f9fb4ca-3f6f-40db-8478-25666169c6c212.pdf").into(this.f7233g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V0 */
    public final void m10338V0() {
        m10311N0();
        this.f7229A = gt80.m15969a().f13490f;
        this.f7231e.setBackgroundResource(x2c0.f27250xf);
        this.f7235i.setBackgroundResource(x2c0.f26688fr);
        this.f7233g.setImageResource(x2c0.f26720gr);
        m10336T0(Color.parseColor("#E6639534"));
        this.f7242p.setTextColor(Color.parseColor("#E6639534"));
        xdl0.M(this.f7240n, false);
        this.f7238l.setImageResource(x2c0.f26752hr);
        xdl0.V(this.f7241o, 0);
        this.f7241o.setTextColor(Color.parseColor("#497C19"));
        this.f7241o.setText("青春专享会员");
        this.f7245s.setText(qgl0.m22046d(CoreModule.f1534c.f3544C0.m27421w4(SummarizedPrivilegesId.get("youthVip"))));
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/287a4bf4-70c7-45a7-90f7-add77d8e3d3114.pdf").loadCallback(m10346v0()).animListener(new C0410a()).into(this.f7248v);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m10339X0() {
        this.f7249w.n(this.f7250x, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("femaleVip"))).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.et80
            public final void call(Object obj) {
                this.f11441a.m10324D0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    public void m10340Y0() {
        this.f7249w.n(this.f7250x, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("oDiamond"))).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ct80
            public final void call(Object obj) {
                this.f9837a.m10325E0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z0 */
    public void m10341Z0() {
        this.f7249w.n(this.f7250x, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("platinum"))).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.xs80
            public final void call(Object obj) {
                this.f27704a.m10326G0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public void m10342a1() {
        this.f7249w.n(this.f7250x, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.bt80
            public final void call(Object obj) {
                this.f9082a.m10327H0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d1 */
    public void m10343d1() {
        this.f7249w.n(this.f7250x, CoreModule.f1534c.f3628e0.m21486o9()).distinctUntilChanged(new owo()).subscribe(mkd0.G(new e30() { // from class: l.at80
            public final void call(Object obj) {
                this.f8509a.m10328I0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e1 */
    public final void m10344e1() {
        this.f7249w.n(this.f7250x, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("youthVip"))).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ft80
            public final void call(Object obj) {
                this.f12898a.m10329J0((UserPrivilege) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: h0 */
    public void mo10307h0(eb2 eb2Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        this.f7249w = eb2Var;
        this.f7250x = putongFrag;
        this.f7251y = purchaseType;
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: i0 */
    public void mo10308i0() {
        if (!this.f7229A) {
            this.f7248v.startAnimation();
            this.f7233g.startAnimation();
        } else if (this.f7251y == PurchaseType.TYPE_O_DIAMOND && !this.f7248v.isAnimating() && !this.f7247u.isAnimating()) {
            xdl0.M0(this.f7247u, true);
            xdl0.M0(this.f7248v, false);
            this.f7247u.startAnimation();
        }
        if (!this.f7234h.isAnimating()) {
            this.f7234h.startAnimation();
        }
        this.f7229A = true;
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: j0 */
    public void mo10309j0() {
        m10310L0();
        m10322y0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m10345t0(this);
        m10321u0();
        xdl0.M(this.f7243q, false);
        this.f7241o.setTextSize(18.0f);
        this.f7243q = this.f7242p;
        this.f7245s.setAlpha(0.9f);
        xdl0.X(this.f7240n, -t100.a);
        xdl0.M(this.f7238l, true);
        xdl0.C0(this.f7240n, t100.d(28.0f));
        vcl0.a(this.f7233g, t100.d(6.0f));
        vcl0.a(this.f7232f, t100.d(6.0f));
        this.f7246t.setTypeface(eqh0.c(3));
        this.f7241o.setTypeface(eqh0.c(3));
        xdl0.V(this.f7241o, t100.d(3.0f));
        xdl0.M(this.f7232f, true);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m10345t0(View view) {
        ht80.a(this, view);
    }

    /* JADX INFO: renamed from: v0 */
    public final RequestCallback m10346v0() {
        return new C0417h();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m10347w0() {
        VText vText = this.f7243q;
        xdl0.M(vText, !TextUtils.isEmpty(vText.getText()));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m10348z0(Picture.ImageUri imageUri) {
        qib0.f19782G.m12754Q0(this.f7244r, imageUri);
    }

    public PrivilegeCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7252z = false;
        this.f7229A = false;
    }

    public PrivilegeCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7252z = false;
        this.f7229A = false;
    }
}

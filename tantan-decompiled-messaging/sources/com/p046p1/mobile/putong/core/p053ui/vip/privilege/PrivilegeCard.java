package com.p046p1.mobile.putong.core.p053ui.vip.privilege;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.VipFrag;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.e30;
import p149l.eb2;
import p149l.eqh0;
import p149l.gt80;
import p149l.ht80;
import p149l.mkd0;
import p149l.owo;
import p149l.qgl0;
import p149l.qib0;
import p149l.src0;
import p149l.t100;
import p149l.vcl0;
import p149l.w0c0;
import p149l.w2b0;
import p149l.w9j;
import p149l.x2c0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.xma;
import p149l.zb90;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeCard extends PrivilegeBaseCard {

    /* JADX INFO: renamed from: A */
    public boolean f37448A;

    /* JADX INFO: renamed from: d */
    public PrivilegeCard f37449d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f37450e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f37451f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f37452g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f37453h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f37454i;

    /* JADX INFO: renamed from: j */
    public VImage f37455j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f37456k;

    /* JADX INFO: renamed from: l */
    public VImage f37457l;

    /* JADX INFO: renamed from: m */
    public VLinear f37458m;

    /* JADX INFO: renamed from: n */
    public VImage f37459n;

    /* JADX INFO: renamed from: o */
    public VText f37460o;

    /* JADX INFO: renamed from: p */
    public VText f37461p;

    /* JADX INFO: renamed from: q */
    public VText f37462q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f37463r;

    /* JADX INFO: renamed from: s */
    public VText f37464s;

    /* JADX INFO: renamed from: t */
    public VText f37465t;

    /* JADX INFO: renamed from: u */
    public SVGAnimationView f37466u;

    /* JADX INFO: renamed from: v */
    public SVGAnimationView f37467v;

    /* JADX INFO: renamed from: w */
    public eb2 f37468w;

    /* JADX INFO: renamed from: x */
    public PutongFrag f37469x;

    /* JADX INFO: renamed from: y */
    public PurchaseType f37470y;

    /* JADX INFO: renamed from: z */
    public boolean f37471z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$a */
    public class C8974a extends AnimListener {
        public C8974a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            xdl0.m208345M0(PrivilegeCard.this.f37457l, true);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            gt80.m127907a().f104261f = true;
            xdl0.m208345M0(PrivilegeCard.this.f37466u, false);
            xdl0.m208345M0(PrivilegeCard.this.f37457l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$b */
    public class C8975b extends AnimListener {
        public C8975b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            xdl0.m208345M0(PrivilegeCard.this.f37457l, true);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            gt80.m127907a().f104260e = true;
            xdl0.m208345M0(PrivilegeCard.this.f37466u, false);
            xdl0.m208345M0(PrivilegeCard.this.f37457l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$c */
    public class C8976c extends AnimListener {
        public C8976c() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            xdl0.m208345M0(PrivilegeCard.this.f37457l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$d */
    public class C8977d extends AnimListener {
        public C8977d() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            gt80.m127907a().f104259d = true;
            xdl0.m208345M0(PrivilegeCard.this.f37457l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$e */
    public class C8978e extends AnimListener {
        public C8978e() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            gt80.m127907a().f104258c = true;
            xdl0.m208345M0(PrivilegeCard.this.f37457l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$f */
    public class C8979f extends AnimListener {
        public C8979f() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            xdl0.m208345M0(PrivilegeCard.this.f37457l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$g */
    public class C8980g extends AnimListener {
        public C8980g() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            xdl0.m208345M0(PrivilegeCard.this.f37466u, true);
            PrivilegeCard.this.f37466u.startAnimation();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            gt80.m127907a().f104257b = true;
            xdl0.m208345M0(PrivilegeCard.this.f37466u, false);
            xdl0.m208345M0(PrivilegeCard.this.f37457l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$h */
    public class C8981h implements RequestCallback {
        public C8981h() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            xdl0.m208345M0(PrivilegeCard.this.f37457l, true);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$i */
    public static /* synthetic */ class C8982i {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37480a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f37480a = iArr;
            try {
                iArr[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37480a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37480a[PurchaseType.TYPE_GET_VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37480a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37480a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37480a[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public PrivilegeCard(Context context) {
        super(context);
        this.f37471z = false;
        this.f37448A = false;
    }

    /* JADX INFO: renamed from: L0 */
    private void m56839L0() {
        this.f37471z = false;
        xdl0.m208344M(this.f37465t, false);
        switch (C8982i.f37480a[this.f37470y.ordinal()]) {
            case 1:
                m56867V0();
                break;
            case 2:
                m56861P0();
                break;
            case 3:
                m56866U0();
                break;
            case 4:
                m56864S0();
                break;
            case 5:
                m56862Q0();
                break;
            case 6:
                m56863R0();
                break;
        }
        m56876w0();
    }

    /* JADX INFO: renamed from: N0 */
    private void m56840N0() {
        this.f37468w.m115452n(this.f37469x, CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.ys80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().profileSmall();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.zs80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204574a.m56877z0((Picture.ImageUri) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    private void m56850u0() {
        if (xdl0.m208408w0() <= 1280) {
            this.f37460o.setTextSize(2, xdl0.m208408w0() < 960 ? 16.0f : 18.0f);
            this.f37462q.setTextSize(2, xdl0.m208408w0() < 960 ? 12.0f : 13.0f);
            this.f37464s.setTextSize(2, xdl0.m208408w0() < 960 ? 11.0f : 12.0f);
            this.f37465t.setTextSize(2, xdl0.m208408w0() < 960 ? 10.0f : 11.0f);
            ((RelativeLayout.LayoutParams) this.f37462q.getLayoutParams()).setMargins(t100.m186890d(17.0f), t100.m186890d(4.0f), t100.m186890d(17.0f), 0);
            ((RelativeLayout.LayoutParams) this.f37456k.getLayoutParams()).setMargins(t100.m186890d(16.0f), t100.m186890d(16.0f), 0, 0);
            this.f37463r.getLayoutParams().width = t100.m186890d(22.0f);
            this.f37463r.getLayoutParams().height = t100.m186890d(22.0f);
        }
    }

    /* JADX INFO: renamed from: y0 */
    private void m56851y0() {
        m56840N0();
        switch (C8982i.f37480a[this.f37470y.ordinal()]) {
            case 1:
                m56873e1();
                break;
            case 2:
                m56868X0();
                break;
            case 3:
                m56872d1();
                break;
            case 4:
                m56871a1();
                break;
            case 5:
                m56869Y0();
                break;
            case 6:
                m56870Z0();
                break;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m56852B0(View view) {
        zvf0.m220399u("e_myvip_auto", OMSDialogPositon.p_privileges_view, src0.m185656r().m185672R());
        String strM201089c = w2b0.m201089c("p_privilege,default", 2);
        if (src0.m185656r().m185687z()) {
            src0.m185656r().m185673S((Act) xdl0.m208328E(this), src0.m185656r().m185676l() ? "myvip_reauto_button_unauto_order" : "myvip_reauto_button");
            return;
        }
        boolean zM185669M = src0.m185656r().m185669M();
        PutongFrag putongFrag = this.f37469x;
        if (zM185669M) {
            if (putongFrag instanceof VipFrag) {
                ((VipFrag) putongFrag).m57432X4(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, null, strM201089c);
                return;
            } else {
                CoreModule.m29935P().m94651a().mo33401Rm((Act) xdl0.m208328E(this), strM201089c);
                return;
            }
        }
        if (putongFrag instanceof VipFrag) {
            ((VipFrag) putongFrag).m57432X4(PurchaseType.TYPE_GET_VIP, null, strM201089c);
        } else {
            C8764c.m53400I1((Act) xdl0.m208328E(this), strM201089c);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m56853D0(UserPrivilege userPrivilege) {
        this.f37464s.setText(qgl0.m174441d(userPrivilege));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m56854E0(UserPrivilege userPrivilege) {
        this.f37464s.setText(qgl0.m174441d(userPrivilege));
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m56855G0(UserPrivilege userPrivilege) {
        this.f37464s.setText(qgl0.m174441d(userPrivilege));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m56856H0(UserPrivilege userPrivilege) {
        if (this.f37471z) {
            m56860O0(qgl0.m174441d(userPrivilege));
        } else {
            this.f37464s.setText(qgl0.m174441d(userPrivilege));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m56857I0(User user) {
        if (this.f37471z) {
            m56860O0(qgl0.m174440c(this.f37469x.act()));
        } else {
            this.f37464s.setText(qgl0.m174440c(this.f37469x.act()));
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m56858J0(UserPrivilege userPrivilege) {
        this.f37464s.setText(qgl0.m174441d(userPrivilege));
    }

    /* JADX INFO: renamed from: K0 */
    public final AnimListener m56859K0() {
        return new C8980g();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m56860O0(String str) {
        boolean zM185686y = src0.m185656r().m185686y();
        boolean zM185687z = src0.m185656r().m185687z();
        if (src0.m185656r().m185676l()) {
            xdl0.m208344M(this.f37465t, true);
            this.f37465t.setText("去开通");
            VText vText = this.f37464s;
            PurchaseType purchaseType = this.f37470y;
            PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            vText.setText(src0.m185644Q(purchaseType == purchaseType2));
            this.f37462q.setText(zb90.m217827d(this.f37470y == purchaseType2 ? SummarizedPrivilegesId.get("svip") : SummarizedPrivilegesId.get("unknown_")));
            zvf0.m220368A("e_myvip_auto", OMSDialogPositon.p_privileges_view, src0.m185656r().m185672R());
        } else {
            VText vText2 = this.f37465t;
            if (zM185686y) {
                xdl0.m208344M(vText2, false);
                xaj0<String, Integer, String> xaj0VarM185682u = src0.m185656r().m185682u();
                int iIntValue = xaj0VarM185682u.f191752b.intValue();
                VText vText3 = this.f37464s;
                if (iIntValue == 0) {
                    vText3.setText(String.format(getContext().getString(R$string.f17749G2), xaj0VarM185682u.f191751a));
                } else {
                    vText3.setText(String.format(getContext().getString(R$string.f17779H2), xaj0VarM185682u.f191751a, xaj0VarM185682u.f191752b, xaj0VarM185682u.f191753c));
                }
            } else {
                if (!xdl0.m208349O0(vText2)) {
                    xdl0.m208344M(this.f37465t, true);
                    zvf0.m220368A("e_myvip_auto", OMSDialogPositon.p_privileges_view, src0.m185656r().m185672R());
                }
                VText vText4 = this.f37462q;
                if (zM185687z) {
                    vText4.setText(zb90.m217827d(this.f37470y == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? SummarizedPrivilegesId.get("svip") : SummarizedPrivilegesId.get("unknown_")));
                } else {
                    vText4.setText(str);
                }
                this.f37464s.setText(src0.m185655n());
            }
        }
        this.f37465t.setTextColor(getContext().getResources().getColor(this.f37470y == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? w0c0.f183753B0 : w0c0.f183903y0));
        xdl0.m208329E0(this.f37465t, new View.OnClickListener() { // from class: l.dt80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87824a.m56852B0(view);
            }
        });
        m56876w0();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m56861P0() {
        m56840N0();
        this.f37448A = gt80.m127907a().f104260e;
        this.f37450e.setBackgroundResource(x2c0.f190586tf);
        xdl0.m208344M(this.f37459n, false);
        this.f37454i.setBackgroundResource(x2c0.f189415I7);
        this.f37457l.setImageResource(x2c0.f189446J7);
        m56865T0(Color.parseColor("#D659AE"));
        this.f37461p.setTextColor(Color.parseColor("#88D659AE"));
        this.f37452g.setImageResource(x2c0.f189477K7);
        xdl0.m208358V(this.f37460o, 0);
        this.f37460o.setText("她专享会员");
        this.f37460o.setTextColor(Color.parseColor("#BF499A"));
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("femaleVip"));
        this.f37464s.setTextColor(Color.parseColor("#D659AE"));
        this.f37464s.setText(qgl0.m174441d(userPrivilegeM210113w4));
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/13b958ef-7348-4b20-b4ef-e1b293bd661114.pdf").loadCallback(m56875v0()).animListener(new C8975b()).into(this.f37467v);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m56862Q0() {
        m56840N0();
        this.f37448A = gt80.m127907a().f104257b;
        this.f37450e.setBackgroundResource(x2c0.f190618uf);
        xdl0.m208344M(this.f37459n, false);
        this.f37454i.setBackgroundResource(x2c0.f189642Ph);
        this.f37457l.setImageResource(x2c0.f190178gl);
        m56865T0(Color.parseColor("#EDD7A3"));
        this.f37461p.setTextColor(Color.parseColor("#88EDD7A3"));
        this.f37455j.setImageResource(x2c0.f190496ql);
        xdl0.m208358V(this.f37460o, 0);
        this.f37460o.setText("黑金会员");
        this.f37460o.setTextColor(Color.parseColor("#ffdea2"));
        boolean zM210043F3 = xma.m210043F3();
        VText vText = this.f37462q;
        if (zM210043F3) {
            vText.setText("尊享探探全平台权益");
        } else {
            vText.setText("");
        }
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("oDiamond"));
        this.f37464s.setTextColor(Color.parseColor("#ffdea2"));
        this.f37464s.setText(qgl0.m174441d(userPrivilegeM210113w4));
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/57ddffe4-496d-4b33-8a24-730f5b74442712.pdf").loadCallback(m56875v0()).animListener(m56859K0()).into(this.f37467v);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).animListener(new C8979f()).from("https://auto.tancdn.com/v1/raw/1f20ff80-2be8-4b6b-97e3-1b386ef7ebfe13.pdf").into(this.f37466u);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/ce9f0f77-ab7b-4dd7-89ae-5a70f41e19cf13.pdf").into(this.f37452g);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).from("https://auto.tancdn.com/v1/raw/19fb0c0a-5ce2-4b1e-9fc7-a8f2a89b27c513.pdf").into(this.f37453h);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m56863R0() {
        m56840N0();
        this.f37448A = gt80.m127907a().f104256a;
        this.f37450e.setBackgroundResource(x2c0.f190366mj);
        xdl0.m208344M(this.f37459n, false);
        this.f37454i.setBackgroundResource(x2c0.f190334lj);
        this.f37457l.setImageResource(x2c0.f190210hl);
        m56865T0(Color.parseColor("#21252F"));
        this.f37461p.setTextColor(Color.parseColor("#88EDD7A3"));
        xdl0.m208358V(this.f37460o, 0);
        this.f37460o.setText("白金会员");
        this.f37460o.setTextColor(Color.parseColor("#21252F"));
        boolean zM210045H3 = xma.m210045H3();
        VText vText = this.f37462q;
        if (zM210045H3) {
            vText.setText("");
        } else {
            vText.setText("");
        }
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("platinum"));
        this.f37464s.setTextColor(Color.parseColor("#7D8592"));
        this.f37464s.setText(qgl0.m174441d(userPrivilegeM210113w4));
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/adc3cfbd-9efd-46ef-81d6-3397e9fefd0514.pdf").loadCallback(m56875v0()).animListener(m56859K0()).into(this.f37467v);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).animListener(new C8976c()).from("https://auto.tancdn.com/v1/raw/c71d8162-99b7-41bc-bd6b-f90f494d102a14.pdf").into(this.f37466u);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/bfed9882-bda4-4ebc-883c-95f814c1300714.pdf").into(this.f37452g);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).from("https://auto.tancdn.com/v1/raw/ca3c47cd-6545-4b87-a380-a49f4774923b14.pdf").into(this.f37453h);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m56864S0() {
        m56840N0();
        this.f37448A = gt80.m127907a().f104258c;
        this.f37450e.setBackgroundResource(x2c0.f190650vf);
        this.f37459n.setImageResource(x2c0.f190146fl);
        this.f37454i.setBackgroundResource(x2c0.f189681Qp);
        this.f37457l.setImageResource(x2c0.f190241il);
        m56865T0(getResources().getColor(w0c0.f183753B0));
        this.f37465t.setBackgroundResource(x2c0.f190114el);
        this.f37455j.setImageResource(x2c0.f190528rl);
        this.f37461p.setAlpha(0.5f);
        this.f37460o.setText(getResources().getText(R$string.f18228W1));
        if (this.f37471z) {
            m56860O0(qgl0.m174441d(CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("svip"))));
        } else {
            this.f37462q.setText("");
            xdl0.m208344M(this.f37465t, false);
        }
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/dfcb3ce7-f5dc-4598-8654-4ef1487d71ed12.pdf").loadCallback(m56875v0()).animListener(new C8978e()).into(this.f37467v);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/e249dbe0-61dc-47f0-8ec2-6e81c9038d8112.pdf").into(this.f37452g);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).from("https://auto.tancdn.com/v1/raw/8df9ebbd-e5a8-4750-9330-d8e055fda3e712.pdf").into(this.f37453h);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m56865T0(int i) {
        this.f37460o.setTextColor(i);
        this.f37462q.setTextColor(i);
        this.f37464s.setTextColor(i);
        this.f37465t.setTextColor(i);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m56866U0() {
        m56840N0();
        this.f37448A = gt80.m127907a().f104259d;
        this.f37450e.setBackgroundResource(x2c0.f190682wf);
        this.f37459n.setImageResource(x2c0.f190432ol);
        this.f37454i.setBackgroundResource(x2c0.f189930Yq);
        this.f37457l.setImageResource(x2c0.f190464pl);
        m56865T0(getResources().getColor(w0c0.f183903y0));
        this.f37465t.setBackgroundResource(x2c0.f190400nl);
        this.f37455j.setImageResource(x2c0.f190560sl);
        this.f37461p.setAlpha(0.5f);
        this.f37460o.setText(getResources().getText(R$string.f18258X1));
        this.f37464s.setText(qgl0.m174440c(this.f37469x.act()));
        if (this.f37471z) {
            m56860O0(qgl0.m174440c(this.f37469x.act()));
        } else {
            this.f37462q.setText("");
            xdl0.m208344M(this.f37465t, false);
        }
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/35b423b7-225b-49e3-a18a-df3a23371a5f13.pdf").loadCallback(m56875v0()).animListener(new C8977d()).into(this.f37467v);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/6f9fb4ca-3f6f-40db-8478-25666169c6c212.pdf").into(this.f37452g);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m56867V0() {
        m56840N0();
        this.f37448A = gt80.m127907a().f104261f;
        this.f37450e.setBackgroundResource(x2c0.f190714xf);
        this.f37454i.setBackgroundResource(x2c0.f190152fr);
        this.f37452g.setImageResource(x2c0.f190184gr);
        m56865T0(Color.parseColor("#E6639534"));
        this.f37461p.setTextColor(Color.parseColor("#E6639534"));
        xdl0.m208344M(this.f37459n, false);
        this.f37457l.setImageResource(x2c0.f190216hr);
        xdl0.m208358V(this.f37460o, 0);
        this.f37460o.setTextColor(Color.parseColor("#497C19"));
        this.f37460o.setText("青春专享会员");
        this.f37464s.setText(qgl0.m174441d(CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("youthVip"))));
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/287a4bf4-70c7-45a7-90f7-add77d8e3d3114.pdf").loadCallback(m56875v0()).animListener(new C8974a()).into(this.f37467v);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m56868X0() {
        this.f37468w.m115452n(this.f37469x, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("femaleVip"))).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.et80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93100a.m56853D0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    public void m56869Y0() {
        this.f37468w.m115452n(this.f37469x, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("oDiamond"))).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ct80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82462a.m56854E0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z0 */
    public void m56870Z0() {
        this.f37468w.m115452n(this.f37469x, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("platinum"))).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.xs80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194210a.m56855G0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public void m56871a1() {
        this.f37468w.m115452n(this.f37469x, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.bt80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77191a.m56856H0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d1 */
    public void m56872d1() {
        this.f37468w.m115452n(this.f37469x, CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged(new owo()).subscribe(mkd0.m154955G(new e30() { // from class: l.at80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71590a.m56857I0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e1 */
    public final void m56873e1() {
        this.f37468w.m115452n(this.f37469x, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("youthVip"))).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ft80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99157a.m56858J0((UserPrivilege) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: h0 */
    public void mo56836h0(eb2 eb2Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        this.f37468w = eb2Var;
        this.f37469x = putongFrag;
        this.f37470y = purchaseType;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: i0 */
    public void mo56837i0() {
        if (!this.f37448A) {
            this.f37467v.startAnimation();
            this.f37452g.startAnimation();
        } else if (this.f37470y == PurchaseType.TYPE_O_DIAMOND && !this.f37467v.isAnimating() && !this.f37466u.isAnimating()) {
            xdl0.m208345M0(this.f37466u, true);
            xdl0.m208345M0(this.f37467v, false);
            this.f37466u.startAnimation();
        }
        if (!this.f37453h.isAnimating()) {
            this.f37453h.startAnimation();
        }
        this.f37448A = true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: j0 */
    public void mo56838j0() {
        m56839L0();
        m56851y0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56874t0(this);
        m56850u0();
        xdl0.m208344M(this.f37462q, false);
        this.f37460o.setTextSize(18.0f);
        this.f37462q = this.f37461p;
        this.f37464s.setAlpha(0.9f);
        xdl0.m208360X(this.f37459n, -t100.f167252a);
        xdl0.m208344M(this.f37457l, true);
        xdl0.m208325C0(this.f37459n, t100.m186890d(28.0f));
        vcl0.m197905a(this.f37452g, t100.m186890d(6.0f));
        vcl0.m197905a(this.f37451f, t100.m186890d(6.0f));
        this.f37465t.setTypeface(eqh0.m117752c(3));
        this.f37460o.setTypeface(eqh0.m117752c(3));
        xdl0.m208358V(this.f37460o, t100.m186890d(3.0f));
        xdl0.m208344M(this.f37451f, true);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m56874t0(View view) {
        ht80.m132861a(this, view);
    }

    /* JADX INFO: renamed from: v0 */
    public final RequestCallback m56875v0() {
        return new C8981h();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m56876w0() {
        VText vText = this.f37462q;
        xdl0.m208344M(vText, !TextUtils.isEmpty(vText.getText()));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m56877z0(Picture.ImageUri imageUri) {
        qib0.f154691G.m102341Q0(this.f37463r, imageUri);
    }

    public PrivilegeCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37471z = false;
        this.f37448A = false;
    }

    public PrivilegeCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37471z = false;
        this.f37448A = false;
    }
}

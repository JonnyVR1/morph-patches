package com.p051p1.mobile.putong.core.p058ui.vip.privilege;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.VipFrag;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.abb0;
import p153l.bkj0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.dk90;
import p153l.i4g0;
import p153l.joa;
import p153l.k190;
import p153l.l190;
import p153l.lb2;
import p153l.lyh0;
import p153l.oyo;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.upl0;
import p153l.uqb0;
import p153l.xzc0;
import p153l.y20;
import p153l.zll0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeCard extends PrivilegeBaseCard {

    /* JADX INFO: renamed from: A */
    public boolean f38296A;

    /* JADX INFO: renamed from: d */
    public PrivilegeCard f38297d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f38298e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f38299f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f38300g;

    /* JADX INFO: renamed from: h */
    public SVGAnimationView f38301h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f38302i;

    /* JADX INFO: renamed from: j */
    public VImage f38303j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f38304k;

    /* JADX INFO: renamed from: l */
    public VImage f38305l;

    /* JADX INFO: renamed from: m */
    public VLinear f38306m;

    /* JADX INFO: renamed from: n */
    public VImage f38307n;

    /* JADX INFO: renamed from: o */
    public VText f38308o;

    /* JADX INFO: renamed from: p */
    public VText f38309p;

    /* JADX INFO: renamed from: q */
    public VText f38310q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f38311r;

    /* JADX INFO: renamed from: s */
    public VText f38312s;

    /* JADX INFO: renamed from: t */
    public VText f38313t;

    /* JADX INFO: renamed from: u */
    public SVGAnimationView f38314u;

    /* JADX INFO: renamed from: v */
    public SVGAnimationView f38315v;

    /* JADX INFO: renamed from: w */
    public lb2 f38316w;

    /* JADX INFO: renamed from: x */
    public PutongFrag f38317x;

    /* JADX INFO: renamed from: y */
    public PurchaseType f38318y;

    /* JADX INFO: renamed from: z */
    public boolean f38319z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$a */
    public class C9137a extends AnimListener {
        public C9137a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            bnl0.m105525M0(PrivilegeCard.this.f38305l, true);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            k190.m147845a().f123463f = true;
            bnl0.m105525M0(PrivilegeCard.this.f38314u, false);
            bnl0.m105525M0(PrivilegeCard.this.f38305l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$b */
    public class C9138b extends AnimListener {
        public C9138b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            bnl0.m105525M0(PrivilegeCard.this.f38305l, true);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            k190.m147845a().f123462e = true;
            bnl0.m105525M0(PrivilegeCard.this.f38314u, false);
            bnl0.m105525M0(PrivilegeCard.this.f38305l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$c */
    public class C9139c extends AnimListener {
        public C9139c() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bnl0.m105525M0(PrivilegeCard.this.f38305l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$d */
    public class C9140d extends AnimListener {
        public C9140d() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            k190.m147845a().f123461d = true;
            bnl0.m105525M0(PrivilegeCard.this.f38305l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$e */
    public class C9141e extends AnimListener {
        public C9141e() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            k190.m147845a().f123460c = true;
            bnl0.m105525M0(PrivilegeCard.this.f38305l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$f */
    public class C9142f extends AnimListener {
        public C9142f() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bnl0.m105525M0(PrivilegeCard.this.f38305l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$g */
    public class C9143g extends AnimListener {
        public C9143g() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            bnl0.m105525M0(PrivilegeCard.this.f38314u, true);
            PrivilegeCard.this.f38314u.startAnimation();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            k190.m147845a().f123459b = true;
            bnl0.m105525M0(PrivilegeCard.this.f38314u, false);
            bnl0.m105525M0(PrivilegeCard.this.f38305l, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$h */
    public class C9144h implements RequestCallback {
        public C9144h() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            bnl0.m105525M0(PrivilegeCard.this.f38305l, true);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeCard$i */
    public static /* synthetic */ class C9145i {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38328a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f38328a = iArr;
            try {
                iArr[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38328a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38328a[PurchaseType.TYPE_GET_VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38328a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38328a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38328a[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public PrivilegeCard(Context context) {
        super(context);
        this.f38319z = false;
        this.f38296A = false;
    }

    /* JADX INFO: renamed from: L0 */
    private void m58022L0() {
        this.f38319z = false;
        bnl0.m105524M(this.f38313t, false);
        switch (C9145i.f38328a[this.f38318y.ordinal()]) {
            case 1:
                m58050V0();
                break;
            case 2:
                m58044P0();
                break;
            case 3:
                m58049U0();
                break;
            case 4:
                m58047S0();
                break;
            case 5:
                m58045Q0();
                break;
            case 6:
                m58046R0();
                break;
        }
        m58059w0();
    }

    /* JADX INFO: renamed from: N0 */
    private void m58023N0() {
        this.f38316w.m153557n(this.f38317x, CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.c190
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().profileSmall();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.d190
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84659a.m58060z0((Picture.ImageUri) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    private void m58033u0() {
        if (bnl0.m105588w0() <= 1280) {
            this.f38308o.setTextSize(2, bnl0.m105588w0() < 960 ? 16.0f : 18.0f);
            this.f38310q.setTextSize(2, bnl0.m105588w0() < 960 ? 12.0f : 13.0f);
            this.f38312s.setTextSize(2, bnl0.m105588w0() < 960 ? 11.0f : 12.0f);
            this.f38313t.setTextSize(2, bnl0.m105588w0() < 960 ? 10.0f : 11.0f);
            ((RelativeLayout.LayoutParams) this.f38310q.getLayoutParams()).setMargins(qa00.m175859d(17.0f), qa00.m175859d(4.0f), qa00.m175859d(17.0f), 0);
            ((RelativeLayout.LayoutParams) this.f38304k.getLayoutParams()).setMargins(qa00.m175859d(16.0f), qa00.m175859d(16.0f), 0, 0);
            this.f38311r.getLayoutParams().width = qa00.m175859d(22.0f);
            this.f38311r.getLayoutParams().height = qa00.m175859d(22.0f);
        }
    }

    /* JADX INFO: renamed from: y0 */
    private void m58034y0() {
        m58023N0();
        switch (C9145i.f38328a[this.f38318y.ordinal()]) {
            case 1:
                m58056e1();
                break;
            case 2:
                m58051X0();
                break;
            case 3:
                m58055d1();
                break;
            case 4:
                m58054a1();
                break;
            case 5:
                m58052Y0();
                break;
            case 6:
                m58053Z0();
                break;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m58035B0(View view) {
        i4g0.m138523u("e_myvip_auto", OMSDialogPositon.p_privileges_view, xzc0.m213720r().m213736R());
        String strM96736c = abb0.m96736c("p_privilege,default", 2);
        if (xzc0.m213720r().m213751z()) {
            xzc0.m213720r().m213737S((Act) bnl0.m105508E(this), xzc0.m213720r().m213740l() ? "myvip_reauto_button_unauto_order" : "myvip_reauto_button");
            return;
        }
        boolean zM213733M = xzc0.m213720r().m213733M();
        PutongFrag putongFrag = this.f38317x;
        if (zM213733M) {
            if (putongFrag instanceof VipFrag) {
                ((VipFrag) putongFrag).m58615X4(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, null, strM96736c);
                return;
            } else {
                CoreModule.m30933P().m143405a().mo34404Rm((Act) bnl0.m105508E(this), strM96736c);
                return;
            }
        }
        if (putongFrag instanceof VipFrag) {
            ((VipFrag) putongFrag).m58615X4(PurchaseType.TYPE_GET_VIP, null, strM96736c);
        } else {
            C8927c.m54583I1((Act) bnl0.m105508E(this), strM96736c);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m58036D0(UserPrivilege userPrivilege) {
        this.f38312s.setText(upl0.m197103d(userPrivilege));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m58037E0(UserPrivilege userPrivilege) {
        this.f38312s.setText(upl0.m197103d(userPrivilege));
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m58038G0(UserPrivilege userPrivilege) {
        this.f38312s.setText(upl0.m197103d(userPrivilege));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m58039H0(UserPrivilege userPrivilege) {
        if (this.f38319z) {
            m58043O0(upl0.m197103d(userPrivilege));
        } else {
            this.f38312s.setText(upl0.m197103d(userPrivilege));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m58040I0(User user) {
        if (this.f38319z) {
            m58043O0(upl0.m197102c(this.f38317x.act()));
        } else {
            this.f38312s.setText(upl0.m197102c(this.f38317x.act()));
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m58041J0(UserPrivilege userPrivilege) {
        this.f38312s.setText(upl0.m197103d(userPrivilege));
    }

    /* JADX INFO: renamed from: K0 */
    public final AnimListener m58042K0() {
        return new C9143g();
    }

    /* JADX INFO: renamed from: O0 */
    public final void m58043O0(String str) {
        boolean zM213750y = xzc0.m213720r().m213750y();
        boolean zM213751z = xzc0.m213720r().m213751z();
        if (xzc0.m213720r().m213740l()) {
            bnl0.m105524M(this.f38313t, true);
            this.f38313t.setText("去开通");
            VText vText = this.f38312s;
            PurchaseType purchaseType = this.f38318y;
            PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            vText.setText(xzc0.m213708Q(purchaseType == purchaseType2));
            this.f38310q.setText(dk90.m116225d(this.f38318y == purchaseType2 ? SummarizedPrivilegesId.get("svip") : SummarizedPrivilegesId.get("unknown_")));
            i4g0.m138492A("e_myvip_auto", OMSDialogPositon.p_privileges_view, xzc0.m213720r().m213736R());
        } else {
            VText vText2 = this.f38313t;
            if (zM213750y) {
                bnl0.m105524M(vText2, false);
                bkj0<String, Integer, String> bkj0VarM213746u = xzc0.m213720r().m213746u();
                int iIntValue = bkj0VarM213746u.f77082b.intValue();
                VText vText3 = this.f38312s;
                if (iIntValue == 0) {
                    vText3.setText(String.format(getContext().getString(R$string.f18536I2), bkj0VarM213746u.f77081a));
                } else {
                    vText3.setText(String.format(getContext().getString(R$string.f18567J2), bkj0VarM213746u.f77081a, bkj0VarM213746u.f77082b, bkj0VarM213746u.f77083c));
                }
            } else {
                if (!bnl0.m105529O0(vText2)) {
                    bnl0.m105524M(this.f38313t, true);
                    i4g0.m138492A("e_myvip_auto", OMSDialogPositon.p_privileges_view, xzc0.m213720r().m213736R());
                }
                VText vText4 = this.f38310q;
                if (zM213751z) {
                    vText4.setText(dk90.m116225d(this.f38318y == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? SummarizedPrivilegesId.get("svip") : SummarizedPrivilegesId.get("unknown_")));
                } else {
                    vText4.setText(str);
                }
                this.f38312s.setText(xzc0.m213719n());
            }
        }
        this.f38313t.setTextColor(getContext().getResources().getColor(this.f38318y == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? c9c0.f80325C0 : c9c0.f80476z0));
        bnl0.m105509E0(this.f38313t, new View.OnClickListener() { // from class: l.h190
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107422a.m58035B0(view);
            }
        });
        m58059w0();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m58044P0() {
        m58023N0();
        this.f38296A = k190.m147845a().f123462e;
        this.f38298e.setBackgroundResource(dbc0.f87055hg);
        bnl0.m105524M(this.f38307n, false);
        this.f38302i.setBackgroundResource(dbc0.f86272J7);
        this.f38305l.setImageResource(dbc0.f86304K7);
        m58048T0(Color.parseColor("#D659AE"));
        this.f38309p.setTextColor(Color.parseColor("#88D659AE"));
        this.f38300g.setImageResource(dbc0.f86336L7);
        bnl0.m105538V(this.f38308o, 0);
        this.f38308o.setText("她专享会员");
        this.f38308o.setTextColor(Color.parseColor("#BF499A"));
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("femaleVip"));
        this.f38312s.setTextColor(Color.parseColor("#D659AE"));
        this.f38312s.setText(upl0.m197103d(userPrivilegeM146426x4));
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/13b958ef-7348-4b20-b4ef-e1b293bd661114.pdf").loadCallback(m58058v0()).animListener(new C9138b()).into(this.f38315v);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m58045Q0() {
        m58023N0();
        this.f38296A = k190.m147845a().f123459b;
        this.f38298e.setBackgroundResource(dbc0.f87087ig);
        bnl0.m105524M(this.f38307n, false);
        this.f38302i.setBackgroundResource(dbc0.f86091Di);
        this.f38305l.setImageResource(dbc0.f86638Ul);
        m58048T0(Color.parseColor("#EDD7A3"));
        this.f38309p.setTextColor(Color.parseColor("#88EDD7A3"));
        this.f38303j.setImageResource(dbc0.f86962em);
        bnl0.m105538V(this.f38308o, 0);
        this.f38308o.setText("黑金会员");
        this.f38308o.setTextColor(Color.parseColor("#ffdea2"));
        boolean zM146357G3 = joa.m146357G3();
        VText vText = this.f38310q;
        if (zM146357G3) {
            vText.setText("尊享探探全平台权益");
        } else {
            vText.setText("");
        }
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("oDiamond"));
        this.f38312s.setTextColor(Color.parseColor("#ffdea2"));
        this.f38312s.setText(upl0.m197103d(userPrivilegeM146426x4));
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/57ddffe4-496d-4b33-8a24-730f5b74442712.pdf").loadCallback(m58058v0()).animListener(m58042K0()).into(this.f38315v);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).animListener(new C9142f()).from("https://auto.tancdn.com/v1/raw/1f20ff80-2be8-4b6b-97e3-1b386ef7ebfe13.pdf").into(this.f38314u);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/ce9f0f77-ab7b-4dd7-89ae-5a70f41e19cf13.pdf").into(this.f38300g);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).from("https://auto.tancdn.com/v1/raw/19fb0c0a-5ce2-4b1e-9fc7-a8f2a89b27c513.pdf").into(this.f38301h);
    }

    /* JADX INFO: renamed from: R0 */
    public final void m58046R0() {
        m58023N0();
        this.f38296A = k190.m147845a().f123458a;
        this.f38298e.setBackgroundResource(dbc0.f86829ak);
        bnl0.m105524M(this.f38307n, false);
        this.f38302i.setBackgroundResource(dbc0.f86796Zj);
        this.f38305l.setImageResource(dbc0.f86670Vl);
        m58048T0(Color.parseColor("#21252F"));
        this.f38309p.setTextColor(Color.parseColor("#88EDD7A3"));
        bnl0.m105538V(this.f38308o, 0);
        this.f38308o.setText("白金会员");
        this.f38308o.setTextColor(Color.parseColor("#21252F"));
        boolean zM146359I3 = joa.m146359I3();
        VText vText = this.f38310q;
        if (zM146359I3) {
            vText.setText("");
        } else {
            vText.setText("");
        }
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("platinum"));
        this.f38312s.setTextColor(Color.parseColor("#7D8592"));
        this.f38312s.setText(upl0.m197103d(userPrivilegeM146426x4));
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/adc3cfbd-9efd-46ef-81d6-3397e9fefd0514.pdf").loadCallback(m58058v0()).animListener(m58042K0()).into(this.f38315v);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).animListener(new C9139c()).from("https://auto.tancdn.com/v1/raw/c71d8162-99b7-41bc-bd6b-f90f494d102a14.pdf").into(this.f38314u);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/bfed9882-bda4-4ebc-883c-95f814c1300714.pdf").into(this.f38300g);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).from("https://auto.tancdn.com/v1/raw/ca3c47cd-6545-4b87-a380-a49f4774923b14.pdf").into(this.f38301h);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m58047S0() {
        m58023N0();
        this.f38296A = k190.m147845a().f123460c;
        this.f38298e.setBackgroundResource(dbc0.f87119jg);
        this.f38307n.setImageResource(dbc0.f86606Tl);
        this.f38302i.setBackgroundResource(dbc0.f86131Eq);
        this.f38305l.setImageResource(dbc0.f86702Wl);
        m58048T0(getResources().getColor(c9c0.f80325C0));
        this.f38313t.setBackgroundResource(dbc0.f86574Sl);
        this.f38303j.setImageResource(dbc0.f86995fm);
        this.f38309p.setAlpha(0.5f);
        this.f38308o.setText(getResources().getText(R$string.f18958W1));
        if (this.f38319z) {
            m58043O0(upl0.m197103d(CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("svip"))));
        } else {
            this.f38310q.setText("");
            bnl0.m105524M(this.f38313t, false);
        }
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/dfcb3ce7-f5dc-4598-8654-4ef1487d71ed12.pdf").loadCallback(m58058v0()).animListener(new C9141e()).into(this.f38315v);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/e249dbe0-61dc-47f0-8ec2-6e81c9038d8112.pdf").into(this.f38300g);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(-1).from("https://auto.tancdn.com/v1/raw/8df9ebbd-e5a8-4750-9330-d8e055fda3e712.pdf").into(this.f38301h);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m58048T0(int i) {
        this.f38308o.setTextColor(i);
        this.f38310q.setTextColor(i);
        this.f38312s.setTextColor(i);
        this.f38313t.setTextColor(i);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m58049U0() {
        m58023N0();
        this.f38296A = k190.m147845a().f123461d;
        this.f38298e.setBackgroundResource(dbc0.f87152kg);
        this.f38307n.setImageResource(dbc0.f86897cm);
        this.f38302i.setBackgroundResource(dbc0.f86388Mr);
        this.f38305l.setImageResource(dbc0.f86930dm);
        m58048T0(getResources().getColor(c9c0.f80476z0));
        this.f38313t.setBackgroundResource(dbc0.f86864bm);
        this.f38303j.setImageResource(dbc0.f87028gm);
        this.f38309p.setAlpha(0.5f);
        this.f38308o.setText(getResources().getText(R$string.f18988X1));
        this.f38312s.setText(upl0.m197102c(this.f38317x.act()));
        if (this.f38319z) {
            m58043O0(upl0.m197102c(this.f38317x.act()));
        } else {
            this.f38310q.setText("");
            bnl0.m105524M(this.f38313t, false);
        }
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/35b423b7-225b-49e3-a18a-df3a23371a5f13.pdf").loadCallback(m58058v0()).animListener(new C9140d()).into(this.f38315v);
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/6f9fb4ca-3f6f-40db-8478-25666169c6c212.pdf").into(this.f38300g);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m58050V0() {
        m58023N0();
        this.f38296A = k190.m147845a().f123463f;
        this.f38298e.setBackgroundResource(dbc0.f87185lg);
        this.f38302i.setBackgroundResource(dbc0.f86612Tr);
        this.f38300g.setImageResource(dbc0.f86644Ur);
        m58048T0(Color.parseColor("#E6639534"));
        this.f38309p.setTextColor(Color.parseColor("#E6639534"));
        bnl0.m105524M(this.f38307n, false);
        this.f38305l.setImageResource(dbc0.f86676Vr);
        bnl0.m105538V(this.f38308o, 0);
        this.f38308o.setTextColor(Color.parseColor("#497C19"));
        this.f38308o.setText("青春专享会员");
        this.f38312s.setText(upl0.m197103d(CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("youthVip"))));
        SVGALoader.with(getContext()).autoPlay(false).repeatCount(1).from("https://auto.tancdn.com/v1/raw/287a4bf4-70c7-45a7-90f7-add77d8e3d3114.pdf").loadCallback(m58058v0()).animListener(new C9137a()).into(this.f38315v);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m58051X0() {
        this.f38316w.m153557n(this.f38317x, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("femaleVip"))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.i190
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112502a.m58036D0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    public void m58052Y0() {
        this.f38316w.m153557n(this.f38317x, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("oDiamond"))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.g190
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101727a.m58037E0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z0 */
    public void m58053Z0() {
        this.f38316w.m153557n(this.f38317x, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("platinum"))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.b190
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74341a.m58038G0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public void m58054a1() {
        this.f38316w.m153557n(this.f38317x, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.f190
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96775a.m58039H0((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d1 */
    public void m58055d1() {
        this.f38316w.m153557n(this.f38317x, CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged(new oyo()).subscribe(psd0.m173596G(new y20() { // from class: l.e190
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91572a.m58040I0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e1 */
    public final void m58056e1() {
        this.f38316w.m153557n(this.f38317x, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("youthVip"))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.j190
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117945a.m58041J0((UserPrivilege) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: h0 */
    public void mo58019h0(lb2 lb2Var, PutongFrag putongFrag, PurchaseType purchaseType) {
        this.f38316w = lb2Var;
        this.f38317x = putongFrag;
        this.f38318y = purchaseType;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: i0 */
    public void mo58020i0() {
        if (!this.f38296A) {
            this.f38315v.startAnimation();
            this.f38300g.startAnimation();
        } else if (this.f38318y == PurchaseType.TYPE_O_DIAMOND && !this.f38315v.isAnimating() && !this.f38314u.isAnimating()) {
            bnl0.m105525M0(this.f38314u, true);
            bnl0.m105525M0(this.f38315v, false);
            this.f38314u.startAnimation();
        }
        if (!this.f38301h.isAnimating()) {
            this.f38301h.startAnimation();
        }
        this.f38296A = true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.PrivilegeBaseCard
    /* JADX INFO: renamed from: j0 */
    public void mo58021j0() {
        m58022L0();
        m58034y0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58057t0(this);
        m58033u0();
        bnl0.m105524M(this.f38310q, false);
        this.f38308o.setTextSize(18.0f);
        this.f38310q = this.f38309p;
        this.f38312s.setAlpha(0.9f);
        bnl0.m105540X(this.f38307n, -qa00.f156314a);
        bnl0.m105524M(this.f38305l, true);
        bnl0.m105505C0(this.f38307n, qa00.m175859d(28.0f));
        zll0.m220292a(this.f38300g, qa00.m175859d(6.0f));
        zll0.m220292a(this.f38299f, qa00.m175859d(6.0f));
        this.f38313t.setTypeface(lyh0.m156283c(3));
        this.f38308o.setTypeface(lyh0.m156283c(3));
        bnl0.m105538V(this.f38308o, qa00.m175859d(3.0f));
        bnl0.m105524M(this.f38299f, true);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m58057t0(View view) {
        l190.m152466a(this, view);
    }

    /* JADX INFO: renamed from: v0 */
    public final RequestCallback m58058v0() {
        return new C9144h();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m58059w0() {
        VText vText = this.f38310q;
        bnl0.m105524M(vText, !TextUtils.isEmpty(vText.getText()));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m58060z0(Picture.ImageUri imageUri) {
        uqb0.f180374G.m127125Q0(this.f38311r, imageUri);
    }

    public PrivilegeCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38319z = false;
        this.f38296A = false;
    }

    public PrivilegeCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38319z = false;
        this.f38296A = false;
    }
}

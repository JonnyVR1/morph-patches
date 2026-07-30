package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ats extends bts<yuk, lsw> {

    /* JADX INFO: renamed from: g */
    public kuk f73410g;

    /* JADX INFO: renamed from: h */
    public int f73411h = 0;

    /* JADX INFO: renamed from: A */
    public int m100246A() {
        return m106381v().getHeight();
    }

    /* JADX INFO: renamed from: B */
    public BLiveGuardType m100247B() {
        return ((yuk) this.f48554b).f201629q;
    }

    /* JADX INFO: renamed from: C */
    public final void m100248C() {
        P p = this.f48554b;
        BLiveGuardType bLiveGuardType = ((yuk) p).f201629q;
        if (((yuk) p).m213815L2() && (TEnum.equals(bLiveGuardType, BLiveGuardType.potentialGuard) || TEnum.equals(bLiveGuardType, BLiveGuardType.onlineGuard))) {
            m100257M();
        } else {
            m100259O();
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m100249E(BLiveGuardType bLiveGuardType, String str, DialogC12774a dialogC12774a, View view) {
        P p = this.f48554b;
        ((yuk) p).m217409L4(bLiveGuardType, str, ((yuk) p).m217428t4());
        dialogC12774a.m72940O();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m100250F(final BLiveGuardType bLiveGuardType, final String str, final DialogC12774a dialogC12774a, String str2, View view) {
        VText vText = (VText) view.findViewById(mdc0.f135942G4);
        vText.setText(R$string.f48230m5);
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.yss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f201449a.m100249E(bLiveGuardType, str, dialogC12774a, view2);
            }
        });
        VText vText2 = (VText) view.findViewById(mdc0.f136168f0);
        vText2.setText(R$string.f48510z);
        vText2.setOnClickListener(new View.OnClickListener() { // from class: l.zss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dialogC12774a.m72940O();
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            izs.m142868s("context_single_room", (VDraweeView) view.findViewById(mdc0.f136150d2), str2);
        }
        m100256L(bLiveGuardType, (VText) view.findViewById(mdc0.f136329w2));
    }

    /* JADX INFO: renamed from: G */
    public void m100251G(BLiveGuardboardRecord bLiveGuardboardRecord) {
        ((yuk) this.f48554b).m217431w4(bLiveGuardboardRecord);
    }

    /* JADX INFO: renamed from: H */
    public void m100252H() {
        ((yuk) this.f48554b).m217406I4();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.oo2] */
    /* JADX INFO: renamed from: I */
    public void m100253I(final BLiveGuardType bLiveGuardType, final String str) {
        final String str2 = ((yuk) this.f48554b).m217434z4(bLiveGuardType) ? "renew_power" : "become_knight";
        z1r.m218366b(((yuk) this.f48554b).m213810E2(), ((yuk) this.f48554b).m217428t4(), str2);
        final DialogC12774a dialogC12774a = new DialogC12774a(this.f48554b, yec0.f199074f5, qag0.m175926g());
        dialogC12774a.m72959h0(new y20() { // from class: l.xss
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196134a.m100250F(bLiveGuardType, str2, dialogC12774a, str, (View) obj);
            }
        });
        dialogC12774a.show();
    }

    /* JADX INFO: renamed from: J */
    public void m100254J(lsw lswVar) {
        this.f73410g.m151544A(lswVar);
    }

    /* JADX INFO: renamed from: K */
    public void m100255K(y20<String> y20Var) {
        ((yuk) this.f48554b).m217422n4(y20Var);
    }

    /* JADX INFO: renamed from: L */
    public final void m100256L(BLiveGuardType bLiveGuardType, VText vText) {
        if (((yuk) this.f48554b).m217427s4(bLiveGuardType) > 0) {
            int iM217419k4 = ((yuk) this.f48554b).m217419k4(bLiveGuardType);
            String strM209911u = xau.m209911u(R$string.f48384t5, Integer.valueOf(((yuk) this.f48554b).m217420l4(bLiveGuardType) * iM217419k4));
            vText.setText(fvk.m127666q(xau.m209912v(fvk.m127664o(bLiveGuardType, ((yuk) this.f48554b).m217434z4(bLiveGuardType)), Integer.valueOf(iM217419k4), strM209911u), strM209911u));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m100257M() {
        this.f73411h = 2;
        this.f78394f.m4252j(2, false);
    }

    /* JADX INFO: renamed from: N */
    public void m100258N() {
        this.f73411h = 1;
        this.f78394f.m4252j(1, false);
    }

    /* JADX INFO: renamed from: O */
    public void m100259O() {
        this.f73411h = 0;
        this.f78394f.m4252j(0, false);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        kuk kukVar = new kuk(this, ((yuk) this.f48554b).m213815L2());
        this.f73410g = kukVar;
        this.f78394f.setAdapter(kukVar);
        this.f78394f.setUserInputEnabled(false);
        m100248C();
        m72916s(new DialogC12774a.c() { // from class: l.wss
            @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a.c
            /* JADX INFO: renamed from: o */
            public final void mo72967o() {
                this.f190690a.m100260z();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: j */
    public void mo72910j() {
        super.mo72910j();
        if (NullChecker.m82486a(this.f78394f)) {
            this.f78394f.setAdapter(null);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m100260z() {
        if (this.f73411h != 0) {
            m100259O();
        } else {
            mo72910j();
        }
    }
}

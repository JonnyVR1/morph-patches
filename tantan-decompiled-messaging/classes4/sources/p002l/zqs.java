package p002l;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.hxs;
import l.w8u;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zqs extends ars<isk, mpw> {

    /* JADX INFO: renamed from: g */
    public urk f23567g;

    /* JADX INFO: renamed from: h */
    public int f23568h = 0;

    /* JADX INFO: renamed from: A */
    public int m27508A() {
        return m10071v().getHeight();
    }

    /* JADX INFO: renamed from: B */
    public BLiveGuardType m27509B() {
        return ((isk) this.f3748b).f13395q;
    }

    /* JADX INFO: renamed from: C */
    public final void m27510C() {
        P p = this.f3748b;
        BLiveGuardType bLiveGuardType = ((isk) p).f13395q;
        if (((isk) p).m25552L2() && (TEnum.equals(bLiveGuardType, "potentialGuard") || TEnum.equals(bLiveGuardType, "onlineGuard"))) {
            m27519M();
        } else {
            m27521O();
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m27511E(BLiveGuardType bLiveGuardType, String str, C0200a c0200a, View view) {
        P p = this.f3748b;
        ((isk) p).m15347L4(bLiveGuardType, str, ((isk) p).m15368t4());
        c0200a.m5125O();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m27512F(final BLiveGuardType bLiveGuardType, final String str, final C0200a c0200a, String str2, View view) {
        VText vTextFindViewById = view.findViewById(g5c0.f10847G4);
        vTextFindViewById.setText(R$string.f3424m5);
        vTextFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.xqs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f22414a.m27511E(bLiveGuardType, str, c0200a, view2);
            }
        });
        VText vTextFindViewById2 = view.findViewById(g5c0.f11073f0);
        vTextFindViewById2.setText(R$string.f3704z);
        vTextFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.yqs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c0200a.m5125O();
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            hxs.s("context_single_room", view.findViewById(g5c0.f11055d2), str2);
        }
        m27518L(bLiveGuardType, (VText) view.findViewById(g5c0.f11234w2));
    }

    /* JADX INFO: renamed from: G */
    public void m27513G(BLiveGuardboardRecord bLiveGuardboardRecord) {
        ((isk) this.f3748b).m15371w4(bLiveGuardboardRecord);
    }

    /* JADX INFO: renamed from: H */
    public void m27514H() {
        ((isk) this.f3748b).m15343I4();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2] */
    /* JADX INFO: renamed from: I */
    public void m27515I(final BLiveGuardType bLiveGuardType, final String str) {
        final String str2 = ((isk) this.f3748b).m15374z4(bLiveGuardType) ? "renew_power" : "become_knight";
        yzq.m27013b(((isk) this.f3748b).m25547E2(), ((isk) this.f3748b).m15368t4(), str2);
        final C0200a c0200a = new C0200a(this.f3748b, t6c0.f19838f5, j2g0.m15581g());
        c0200a.m5144h0(new e30() { // from class: l.wqs
            public final void call(Object obj) {
                this.f21937a.m27512F(bLiveGuardType, str2, c0200a, str, (View) obj);
            }
        });
        c0200a.show();
    }

    /* JADX INFO: renamed from: J */
    public void m27516J(mpw mpwVar) {
        this.f23567g.m23582A(mpwVar);
    }

    /* JADX INFO: renamed from: K */
    public void m27517K(e30<String> e30Var) {
        ((isk) this.f3748b).m15361n4(e30Var);
    }

    /* JADX INFO: renamed from: L */
    public final void m27518L(BLiveGuardType bLiveGuardType, VText vText) {
        if (((isk) this.f3748b).m15366s4(bLiveGuardType) > 0) {
            int iM15358k4 = ((isk) this.f3748b).m15358k4(bLiveGuardType);
            String strU = w8u.u(R$string.f3578t5, Integer.valueOf(((isk) this.f3748b).m15359l4(bLiveGuardType) * iM15358k4));
            vText.setText(psk.m20670q(w8u.v(psk.m20668o(bLiveGuardType, ((isk) this.f3748b).m15374z4(bLiveGuardType)), new Object[]{Integer.valueOf(iM15358k4), strU}), strU));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m27519M() {
        this.f23568h = 2;
        this.f7872f.j(2, false);
    }

    /* JADX INFO: renamed from: N */
    public void m27520N() {
        this.f23568h = 1;
        this.f7872f.j(1, false);
    }

    /* JADX INFO: renamed from: O */
    public void m27521O() {
        this.f23568h = 0;
        this.f7872f.j(0, false);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p002l.vpl
    public void init() {
        super.init();
        urk urkVar = new urk(this, ((isk) this.f3748b).m25552L2());
        this.f23567g = urkVar;
        this.f7872f.setAdapter(urkVar);
        this.f7872f.setUserInputEnabled(false);
        m27510C();
        m5101s(new C0200a.c() { // from class: l.vqs
            @Override // com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a.c
            /* JADX INFO: renamed from: o */
            public final void mo5152o() {
                this.f21272a.m27522z();
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: j */
    public void mo5095j() {
        super.mo5095j();
        if (NullChecker.a(this.f7872f)) {
            this.f7872f.setAdapter((RecyclerView.Adapter) null);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m27522z() {
        if (this.f23568h != 0) {
            m27521O();
        } else {
            mo5095j();
        }
    }
}

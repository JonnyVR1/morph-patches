package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardboardRecord;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zqs extends ars<isk, mpw> {

    /* JADX INFO: renamed from: g */
    public urk f204413g;

    /* JADX INFO: renamed from: h */
    public int f204414h = 0;

    /* JADX INFO: renamed from: A */
    public int m219880A() {
        return m98551v().getHeight();
    }

    /* JADX INFO: renamed from: B */
    public BLiveGuardType m219881B() {
        return ((isk) this.f47706b).f114774q;
    }

    /* JADX INFO: renamed from: C */
    public final void m219882C() {
        P p = this.f47706b;
        BLiveGuardType bLiveGuardType = ((isk) p).f114774q;
        if (((isk) p).m206032L2() && (TEnum.equals(bLiveGuardType, BLiveGuardType.potentialGuard) || TEnum.equals(bLiveGuardType, BLiveGuardType.onlineGuard))) {
            m219891M();
        } else {
            m219893O();
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m219883E(BLiveGuardType bLiveGuardType, String str, DialogC12611a dialogC12611a, View view) {
        P p = this.f47706b;
        ((isk) p).m138008L4(bLiveGuardType, str, ((isk) p).m138028t4());
        dialogC12611a.m71757O();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m219884F(final BLiveGuardType bLiveGuardType, final String str, final DialogC12611a dialogC12611a, String str2, View view) {
        VText vText = (VText) view.findViewById(g5c0.f100697G4);
        vText.setText(R$string.f47382m5);
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.xqs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f194035a.m219883E(bLiveGuardType, str, dialogC12611a, view2);
            }
        });
        VText vText2 = (VText) view.findViewById(g5c0.f100923f0);
        vText2.setText(R$string.f47662z);
        vText2.setOnClickListener(new View.OnClickListener() { // from class: l.yqs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dialogC12611a.m71757O();
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            hxs.m133406s("context_single_room", (VDraweeView) view.findViewById(g5c0.f100905d2), str2);
        }
        m219890L(bLiveGuardType, (VText) view.findViewById(g5c0.f101084w2));
    }

    /* JADX INFO: renamed from: G */
    public void m219885G(BLiveGuardboardRecord bLiveGuardboardRecord) {
        ((isk) this.f47706b).m138031w4(bLiveGuardboardRecord);
    }

    /* JADX INFO: renamed from: H */
    public void m219886H() {
        ((isk) this.f47706b).m138005I4();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2] */
    /* JADX INFO: renamed from: I */
    public void m219887I(final BLiveGuardType bLiveGuardType, final String str) {
        final String str2 = ((isk) this.f47706b).m138034z4(bLiveGuardType) ? "renew_power" : "become_knight";
        yzq.m216687b(((isk) this.f47706b).m206027E2(), ((isk) this.f47706b).m138028t4(), str2);
        final DialogC12611a dialogC12611a = new DialogC12611a(this.f47706b, t6c0.f168342f5, j2g0.m139460g());
        dialogC12611a.m71776h0(new e30() { // from class: l.wqs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187721a.m219884F(bLiveGuardType, str2, dialogC12611a, str, (View) obj);
            }
        });
        dialogC12611a.show();
    }

    /* JADX INFO: renamed from: J */
    public void m219888J(mpw mpwVar) {
        this.f204413g.m195077A(mpwVar);
    }

    /* JADX INFO: renamed from: K */
    public void m219889K(e30<String> e30Var) {
        ((isk) this.f47706b).m138022n4(e30Var);
    }

    /* JADX INFO: renamed from: L */
    public final void m219890L(BLiveGuardType bLiveGuardType, VText vText) {
        if (((isk) this.f47706b).m138027s4(bLiveGuardType) > 0) {
            int iM138019k4 = ((isk) this.f47706b).m138019k4(bLiveGuardType);
            String strM202218u = w8u.m202218u(R$string.f47536t5, Integer.valueOf(((isk) this.f47706b).m138020l4(bLiveGuardType) * iM138019k4));
            vText.setText(psk.m171174q(w8u.m202219v(psk.m171172o(bLiveGuardType, ((isk) this.f47706b).m138034z4(bLiveGuardType)), Integer.valueOf(iM138019k4), strM202218u), strM202218u));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m219891M() {
        this.f204414h = 2;
        this.f71340f.m4250j(2, false);
    }

    /* JADX INFO: renamed from: N */
    public void m219892N() {
        this.f204414h = 1;
        this.f71340f.m4250j(1, false);
    }

    /* JADX INFO: renamed from: O */
    public void m219893O() {
        this.f204414h = 0;
        this.f71340f.m4250j(0, false);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        urk urkVar = new urk(this, ((isk) this.f47706b).m206032L2());
        this.f204413g = urkVar;
        this.f71340f.setAdapter(urkVar);
        this.f71340f.setUserInputEnabled(false);
        m219882C();
        m71733s(new DialogC12611a.c() { // from class: l.vqs
            @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a.c
            /* JADX INFO: renamed from: o */
            public final void mo71784o() {
                this.f182673a.m219894z();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: j */
    public void mo71727j() {
        super.mo71727j();
        if (NullChecker.m81303a(this.f71340f)) {
            this.f71340f.setAdapter(null);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m219894z() {
        if (this.f204414h != 0) {
            m219893O();
        } else {
            mo71727j();
        }
    }
}

package p153l;

import android.content.DialogInterface;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.FirstRechargePaySuccessDialog;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.LiveRemindDialog;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.NewFirstRechargePaySuccessDialog;

/* JADX INFO: loaded from: classes4.dex */
public class lpc0 {

    /* JADX INFO: renamed from: l.lpc0$a */
    public class C18436a implements aiv.C15716a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i6t f133032a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f133033b;

        public C18436a(i6t i6tVar, boolean z) {
            this.f133032a = i6tVar;
            this.f133033b = z;
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            lpc0.m155174d(this.f133032a, this.f133033b);
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
            lpc0.m155174d(this.f133032a, this.f133033b);
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
            lpc0.m155174d(this.f133032a, this.f133033b);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m155172b(jl80 jl80Var, i6t i6tVar) {
        jl80Var.dismiss();
        i6tVar.m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(900).m174141B(efv.f93862s).m174146t(80).m174140A(bnl0.m105592y0(), qa00.m175859d(580.0f)).m174143q());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m155173c(boolean z, uoe0 uoe0Var, String str, String str2, jl80 jl80Var, BLiveGiftItem bLiveGiftItem, i6t i6tVar, boolean z2) {
        if (z && uoe0Var != null) {
            gpc0.m131244d(uoe0Var, str, true);
        }
        gpc0.m131246f(str2);
        jl80Var.setOnDismissListener(null);
        jl80Var.dismiss();
        if (bLiveGiftItem != null) {
            i6tVar.m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136084u(bLiveGiftItem.f45225id + "", new C18436a(i6tVar, z2), 1, "", "", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.firstrecharge))).m136083t());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m155174d(i6t i6tVar, boolean z) {
        if (i6tVar == null || z) {
            return;
        }
        i6tVar.m213811F2().GiftDialogEventGroup.openGiftDialogEvent().mo199273j(new lx50().m156159i(3000).m156160j("live"));
    }

    /* JADX INFO: renamed from: e */
    public static void m155175e(final i6t i6tVar, BLiveFirstRechargeDetail bLiveFirstRechargeDetail, final BLiveGiftItem bLiveGiftItem, final String str, final uoe0 uoe0Var, final String str2, final boolean z, final boolean z2) {
        final jl80 jl80VarM146049r0 = new jl80.C17971a(i6tVar.act()).m146022Q(yec0.f198708B4).m146019N(n3d0.m161278b(obc0.f146132Na)).m146049r0();
        gpc0.m131247g(str);
        jl80VarM146049r0.show();
        NewFirstRechargePaySuccessDialog newFirstRechargePaySuccessDialog = (NewFirstRechargePaySuccessDialog) jl80VarM146049r0.m145966L();
        jl80VarM146049r0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jpc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                lpc0.m155174d(i6tVar, z2);
            }
        });
        if (bLiveFirstRechargeDetail != null) {
            newFirstRechargePaySuccessDialog.m76333j0(bLiveFirstRechargeDetail, bLiveGiftItem, z, new x20() { // from class: l.kpc0
                @Override // p153l.x20
                public final void call() {
                    lpc0.m155173c(z, uoe0Var, str2, str, jl80VarM146049r0, bLiveGiftItem, i6tVar, z2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m155176f(final i6t i6tVar, BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        final jl80 jl80VarM146049r0 = new jl80.C17971a(i6tVar.act()).m146022Q(yec0.f199018b1).m146019N(n3d0.m161278b(obc0.f146132Na)).m146049r0();
        jl80VarM146049r0.show();
        FirstRechargePaySuccessDialog firstRechargePaySuccessDialog = (FirstRechargePaySuccessDialog) jl80VarM146049r0.m145966L();
        if (bLiveFirstRechargeDetail != null) {
            firstRechargePaySuccessDialog.m76305j0(i6tVar, bLiveFirstRechargeDetail, new x20() { // from class: l.hpc0
                @Override // p153l.x20
                public final void call() {
                    lpc0.m155172b(jl80VarM146049r0, i6tVar);
                }
            }, new x20() { // from class: l.ipc0
                @Override // p153l.x20
                public final void call() {
                    jl80VarM146049r0.dismiss();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m155177g(Act act, String str, String str2) {
        Dialog dialogM21566z = act.dialog().m21516M(yec0.f198883Q).m21556u().m21566z();
        dialogM21566z.show();
        ((LiveRemindDialog) dialogM21566z.m21457P()).m76319k0(str, str2, new sqk(dialogM21566z));
    }
}

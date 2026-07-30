package p002l;

import android.content.DialogInterface;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.FirstRechargePaySuccessDialog;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.LiveRemindDialog;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.NewFirstRechargePaySuccessDialog;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import l.cok;
import l.d30;
import l.dd80;
import l.ddv;
import l.kvc0;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ehc0 {

    /* JADX INFO: renamed from: l.ehc0$a */
    public class C0545a implements zfv.C0940a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ h4t f9791a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f9792b;

        public C0545a(h4t h4tVar, boolean z) {
            this.f9791a = h4tVar;
            this.f9792b = z;
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: a */
        public void mo5855a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            ehc0.m12536d(this.f9791a, this.f9792b);
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: b */
        public void mo5856b() {
            ehc0.m12536d(this.f9791a, this.f9792b);
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: c */
        public void mo5857c() {
            ehc0.m12536d(this.f9791a, this.f9792b);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m12534b(dd80 dd80Var, h4t h4tVar) {
        dd80Var.dismiss();
        h4tVar.m25548F2().OpenH5Event.open().j(jp50.m16064c(900).m16094B(ddv.s).m16099t(80).m16093A(xdl0.y0(), t100.d(580.0f)).m16096q());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12535c(boolean z, pge0 pge0Var, String str, String str2, dd80 dd80Var, BLiveGiftItem bLiveGiftItem, h4t h4tVar, boolean z2) {
        if (z && pge0Var != null) {
            zgc0.m27329d(pge0Var, str, true);
        }
        zgc0.m27331f(str2);
        dd80Var.setOnDismissListener((DialogInterface.OnDismissListener) null);
        dd80Var.dismiss();
        if (bLiveGiftItem != null) {
            h4tVar.m25548F2().SendGiftEventGroup.sendGift().j(new cfe0.C0512a().m10983u(bLiveGiftItem.id + "", new C0545a(h4tVar, z2), 1, "", "", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("firstrecharge"))).m10982t());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m12536d(h4t h4tVar, boolean z) {
        if (h4tVar == null || z) {
            return;
        }
        h4tVar.m25548F2().GiftDialogEventGroup.openGiftDialogEvent().j(new fp50().m13445i(3000).m13446j("live"));
    }

    /* JADX INFO: renamed from: e */
    public static void m12537e(final h4t h4tVar, BLiveFirstRechargeDetail bLiveFirstRechargeDetail, final BLiveGiftItem bLiveGiftItem, final String str, final pge0 pge0Var, final String str2, final boolean z, final boolean z2) {
        final dd80 dd80VarR0 = new dd80.a(h4tVar.act()).Q(t6c0.f19472B4).N(kvc0.b(i3c0.f12589Na)).r0();
        zgc0.m27332g(str);
        dd80VarR0.show();
        NewFirstRechargePaySuccessDialog newFirstRechargePaySuccessDialog = (NewFirstRechargePaySuccessDialog) dd80VarR0.L();
        dd80VarR0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.chc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ehc0.m12536d(h4tVar, z2);
            }
        });
        if (bLiveFirstRechargeDetail != null) {
            newFirstRechargePaySuccessDialog.m8766j0(bLiveFirstRechargeDetail, bLiveGiftItem, z, new d30() { // from class: l.dhc0
                public final void call() {
                    ehc0.m12535c(z, pge0Var, str2, str, dd80VarR0, bLiveGiftItem, h4tVar, z2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m12538f(final h4t h4tVar, BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        final dd80 dd80VarR0 = new dd80.a(h4tVar.act()).Q(t6c0.f19782b1).N(kvc0.b(i3c0.f12589Na)).r0();
        dd80VarR0.show();
        FirstRechargePaySuccessDialog firstRechargePaySuccessDialog = (FirstRechargePaySuccessDialog) dd80VarR0.L();
        if (bLiveFirstRechargeDetail != null) {
            firstRechargePaySuccessDialog.m8738j0(h4tVar, bLiveFirstRechargeDetail, new d30() { // from class: l.ahc0
                public final void call() {
                    ehc0.m12534b(dd80VarR0, h4tVar);
                }
            }, new d30() { // from class: l.bhc0
                public final void call() {
                    dd80VarR0.dismiss();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m12539g(Act act, String str, String str2) {
        Dialog dialogZ = act.dialog().M(t6c0.f19647Q).u().z();
        dialogZ.show();
        ((LiveRemindDialog) dialogZ.P()).m8752k0(str, str2, new cok(dialogZ));
    }
}

package p149l;

import android.content.DialogInterface;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.FirstRechargePaySuccessDialog;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.LiveRemindDialog;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.NewFirstRechargePaySuccessDialog;

/* JADX INFO: loaded from: classes4.dex */
public class ehc0 {

    /* JADX INFO: renamed from: l.ehc0$a */
    public class C16608a implements zfv.C21687a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ h4t f91318a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f91319b;

        public C16608a(h4t h4tVar, boolean z) {
            this.f91318a = h4tVar;
            this.f91319b = z;
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            ehc0.m116447d(this.f91318a, this.f91319b);
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
            ehc0.m116447d(this.f91318a, this.f91319b);
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
            ehc0.m116447d(this.f91318a, this.f91319b);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m116445b(dd80 dd80Var, h4t h4tVar) {
        dd80Var.dismiss();
        h4tVar.m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(900).m142598B(ddv.f85669s).m142603t(80).m142597A(xdl0.m208412y0(), t100.m186890d(580.0f)).m142600q());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m116446c(boolean z, pge0 pge0Var, String str, String str2, dd80 dd80Var, BLiveGiftItem bLiveGiftItem, h4t h4tVar, boolean z2) {
        if (z && pge0Var != null) {
            zgc0.m218632d(pge0Var, str, true);
        }
        zgc0.m218634f(str2);
        dd80Var.setOnDismissListener(null);
        dd80Var.dismiss();
        if (bLiveGiftItem != null) {
            h4tVar.m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106530u(bLiveGiftItem.f44377id + "", new C16608a(h4tVar, z2), 1, "", "", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.firstrecharge))).m106529t());
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m116447d(h4t h4tVar, boolean z) {
        if (h4tVar == null || z) {
            return;
        }
        h4tVar.m206028F2().GiftDialogEventGroup.openGiftDialogEvent().mo172463j(new fp50().m122565i(3000).m122566j("live"));
    }

    /* JADX INFO: renamed from: e */
    public static void m116448e(final h4t h4tVar, BLiveFirstRechargeDetail bLiveFirstRechargeDetail, final BLiveGiftItem bLiveGiftItem, final String str, final pge0 pge0Var, final String str2, final boolean z, final boolean z2) {
        final dd80 dd80VarM110989r0 = new dd80.C16336a(h4tVar.act()).m110962Q(t6c0.f167976B4).m110959N(kvc0.m147353b(i3c0.f110804Na)).m110989r0();
        zgc0.m218635g(str);
        dd80VarM110989r0.show();
        NewFirstRechargePaySuccessDialog newFirstRechargePaySuccessDialog = (NewFirstRechargePaySuccessDialog) dd80VarM110989r0.m110906L();
        dd80VarM110989r0.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.chc0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ehc0.m116447d(h4tVar, z2);
            }
        });
        if (bLiveFirstRechargeDetail != null) {
            newFirstRechargePaySuccessDialog.m75150j0(bLiveFirstRechargeDetail, bLiveGiftItem, z, new d30() { // from class: l.dhc0
                @Override // p149l.d30
                public final void call() {
                    ehc0.m116446c(z, pge0Var, str2, str, dd80VarM110989r0, bLiveGiftItem, h4tVar, z2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m116449f(final h4t h4tVar, BLiveFirstRechargeDetail bLiveFirstRechargeDetail) {
        final dd80 dd80VarM110989r0 = new dd80.C16336a(h4tVar.act()).m110962Q(t6c0.f168286b1).m110959N(kvc0.m147353b(i3c0.f110804Na)).m110989r0();
        dd80VarM110989r0.show();
        FirstRechargePaySuccessDialog firstRechargePaySuccessDialog = (FirstRechargePaySuccessDialog) dd80VarM110989r0.m110906L();
        if (bLiveFirstRechargeDetail != null) {
            firstRechargePaySuccessDialog.m75122j0(h4tVar, bLiveFirstRechargeDetail, new d30() { // from class: l.ahc0
                @Override // p149l.d30
                public final void call() {
                    ehc0.m116445b(dd80VarM110989r0, h4tVar);
                }
            }, new d30() { // from class: l.bhc0
                @Override // p149l.d30
                public final void call() {
                    dd80VarM110989r0.dismiss();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m116450g(Act act, String str, String str2) {
        Dialog dialogM20567z = act.dialog().m20517M(t6c0.f168151Q).m20557u().m20567z();
        dialogM20567z.show();
        ((LiveRemindDialog) dialogM20567z.m20458P()).m75136k0(str, str2, new cok(dialogM20567z));
    }
}

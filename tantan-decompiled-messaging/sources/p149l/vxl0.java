package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveJumpInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveUserDressUp;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.GiftWallSendGiftDialogContentView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class vxl0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m200571a(x6s x6sVar, BLiveJumpInfo bLiveJumpInfo) {
        if (NullChecker.m81303a(bLiveJumpInfo) && !TextUtils.isEmpty(bLiveJumpInfo.schema)) {
            x6sVar.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(200).m206701e(bLiveJumpInfo.schema).m206699c());
            x6sVar.m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
            x6sVar.m206028F2().VirtualUserDressUpDlgEvent.closeDressUpDialog().m172467p();
        }
        zvf0.m220399u(ycu.f197485c, m200573c(x6sVar), vwb.m200311Y("popup_type", bLiveJumpInfo.popupType));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m200572b(DialogInterface dialogInterface) {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c */
    public static String m200573c(h4t h4tVar) {
        return h4tVar.m206027E2().mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room";
    }

    /* JADX INFO: renamed from: d */
    public static void m200574d(Act act, BLiveUserDressUp bLiveUserDressUp, final x6s x6sVar) {
        if (TextUtils.isEmpty(bLiveUserDressUp.name)) {
            return;
        }
        GiftWallSendGiftDialogContentView giftWallSendGiftDialogContentView = (GiftWallSendGiftDialogContentView) LayoutInflater.from(act).inflate(t6c0.f168069J1, (ViewGroup) null);
        dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(giftWallSendGiftDialogContentView).m110961P(true).m110958M(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.txl0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                vxl0.m200572b(dialogInterface);
            }
        }).m110960O();
        giftWallSendGiftDialogContentView.m73664m0(bLiveUserDressUp, dd80VarM110960O, m200573c(x6sVar), new e30() { // from class: l.uxl0
            @Override // p149l.e30
            public final void call(Object obj) {
                vxl0.m200571a(x6sVar, (BLiveJumpInfo) obj);
            }
        });
        dd80VarM110960O.show();
    }
}

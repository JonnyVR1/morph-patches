package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveJumpInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveUserDressUp;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.GiftWallSendGiftDialogContentView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class z6m0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m218805a(y8s y8sVar, BLiveJumpInfo bLiveJumpInfo) {
        if (NullChecker.m82486a(bLiveJumpInfo) && !TextUtils.isEmpty(bLiveJumpInfo.schema)) {
            y8sVar.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(200).m103154e(bLiveJumpInfo.schema).m103152c());
            y8sVar.m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
            y8sVar.m213811F2().VirtualUserDressUpDlgEvent.closeDressUpDialog().m199277p();
        }
        i4g0.m138523u(zeu.f204076c, m218807c(y8sVar), jyb.m147494Y("popup_type", bLiveJumpInfo.popupType));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m218806b(DialogInterface dialogInterface) {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: c */
    public static String m218807c(i6t i6tVar) {
        return i6tVar.m213810E2().mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room";
    }

    /* JADX INFO: renamed from: d */
    public static void m218808d(Act act, BLiveUserDressUp bLiveUserDressUp, final y8s y8sVar) {
        if (TextUtils.isEmpty(bLiveUserDressUp.name)) {
            return;
        }
        GiftWallSendGiftDialogContentView giftWallSendGiftDialogContentView = (GiftWallSendGiftDialogContentView) LayoutInflater.from(act).inflate(yec0.f198801J1, (ViewGroup) null);
        jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(giftWallSendGiftDialogContentView).m146021P(true).m146018M(false).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.x6m0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                z6m0.m218806b(dialogInterface);
            }
        }).m146020O();
        giftWallSendGiftDialogContentView.m74847m0(bLiveUserDressUp, jl80VarM146020O, m218807c(y8sVar), new y20() { // from class: l.y6m0
            @Override // p153l.y20
            public final void call(Object obj) {
                z6m0.m218805a(y8sVar, (BLiveJumpInfo) obj);
            }
        });
        jl80VarM146020O.show();
    }
}

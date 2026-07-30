package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.FirstRechargePaySuccessDialog;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.LocalFirstRechargeGiftItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class boi {
    /* JADX INFO: renamed from: a */
    public static void m102945a(FirstRechargePaySuccessDialog firstRechargePaySuccessDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        firstRechargePaySuccessDialog.f50866d = (VDraweeView) viewGroup.getChildAt(0);
        firstRechargePaySuccessDialog.f50867e = (VImage) viewGroup.getChildAt(1);
        firstRechargePaySuccessDialog.f50868f = (VText) viewGroup.getChildAt(2);
        firstRechargePaySuccessDialog.f50869g = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        firstRechargePaySuccessDialog.f50870h = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        firstRechargePaySuccessDialog.f50871i = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
    }
}

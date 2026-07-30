package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.FirstRechargePaySuccessDialog;
import com.p000p1.mobile.putong.live.livingroom.increment.recharge.LocalFirstRechargeGiftItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class boi {
    /* JADX INFO: renamed from: a */
    public static void m10537a(FirstRechargePaySuccessDialog firstRechargePaySuccessDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        firstRechargePaySuccessDialog.f6908d = viewGroup.getChildAt(0);
        firstRechargePaySuccessDialog.f6909e = viewGroup.getChildAt(1);
        firstRechargePaySuccessDialog.f6910f = viewGroup.getChildAt(2);
        firstRechargePaySuccessDialog.f6911g = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        firstRechargePaySuccessDialog.f6912h = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        firstRechargePaySuccessDialog.f6913i = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
    }
}

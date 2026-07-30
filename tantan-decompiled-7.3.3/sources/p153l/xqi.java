package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.FirstRechargePaySuccessDialog;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.LocalFirstRechargeGiftItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xqi {
    /* JADX INFO: renamed from: a */
    public static void m212735a(FirstRechargePaySuccessDialog firstRechargePaySuccessDialog, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        firstRechargePaySuccessDialog.f51714d = (VDraweeView) viewGroup.getChildAt(0);
        firstRechargePaySuccessDialog.f51715e = (VImage) viewGroup.getChildAt(1);
        firstRechargePaySuccessDialog.f51716f = (VText) viewGroup.getChildAt(2);
        firstRechargePaySuccessDialog.f51717g = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        firstRechargePaySuccessDialog.f51718h = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        firstRechargePaySuccessDialog.f51719i = (LocalFirstRechargeGiftItemView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
    }
}

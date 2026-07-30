package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatPayItemView;
import com.p051p1.mobile.putong.live.external.internal.vchat.view.LiveVChatRechargeItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class jsu {
    /* JADX INFO: renamed from: a */
    public static void m146874a(isu isuVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        isuVar.f116723f = viewGroup.getChildAt(0);
        isuVar.f116724g = (CustomClickConstraintLayout) viewGroup.getChildAt(1);
        isuVar.f116725h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        isuVar.f116726i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        isuVar.f116727j = (LiveVChatRechargeItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        isuVar.f116728k = (LiveVChatRechargeItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        isuVar.f116729l = (LiveVChatRechargeItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        isuVar.f116730m = (LiveVChatRechargeItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        isuVar.f116731n = (LiveVChatRechargeItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        isuVar.f116732o = (LiveVChatRechargeItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        isuVar.f116733p = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        isuVar.f116734q = (LiveVChatPayItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(0);
        isuVar.f116735r = (LiveVChatPayItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(1);
        isuVar.f116736s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(2);
        isuVar.f116737t = (Group) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(3);
        isuVar.f116738u = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(4);
    }
}

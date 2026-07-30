package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatPayItemView;
import com.p046p1.mobile.putong.live.external.internal.vchat.view.LiveVChatRechargeItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.recharge.CustomClickConstraintLayout;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class iqu {
    /* JADX INFO: renamed from: a */
    public static void m137792a(hqu hquVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hquVar.f109124f = viewGroup.getChildAt(0);
        hquVar.f109125g = (CustomClickConstraintLayout) viewGroup.getChildAt(1);
        hquVar.f109126h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hquVar.f109127i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hquVar.f109128j = (LiveVChatRechargeItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        hquVar.f109129k = (LiveVChatRechargeItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        hquVar.f109130l = (LiveVChatRechargeItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        hquVar.f109131m = (LiveVChatRechargeItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        hquVar.f109132n = (LiveVChatRechargeItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        hquVar.f109133o = (LiveVChatRechargeItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        hquVar.f109134p = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        hquVar.f109135q = (LiveVChatPayItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(0);
        hquVar.f109136r = (LiveVChatPayItemView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(1);
        hquVar.f109137s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(2);
        hquVar.f109138t = (Group) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(3);
        hquVar.f109139u = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8)).getChildAt(4);
    }
}

package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.messages.promotion.PrivilegePromotionHeaderView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o690 {
    /* JADX INFO: renamed from: a */
    public static void m162827a(PrivilegePromotionHeaderView privilegePromotionHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegePromotionHeaderView.f25871a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegePromotionHeaderView.f25872b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegePromotionHeaderView.f25873c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegePromotionHeaderView.f25874d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        privilegePromotionHeaderView.f25875e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        privilegePromotionHeaderView.f25876f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegePromotionHeaderView.f25877g = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m162828b(PrivilegePromotionHeaderView privilegePromotionHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95811h9, viewGroup, true);
        m162827a(privilegePromotionHeaderView, viewInflate);
        return viewInflate;
    }
}

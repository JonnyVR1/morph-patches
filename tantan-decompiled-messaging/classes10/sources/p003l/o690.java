package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.messages.promotion.PrivilegePromotionHeaderView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o690 {
    /* JADX INFO: renamed from: a */
    public static void m8399a(PrivilegePromotionHeaderView privilegePromotionHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegePromotionHeaderView.a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegePromotionHeaderView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegePromotionHeaderView.c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegePromotionHeaderView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        privilegePromotionHeaderView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        privilegePromotionHeaderView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegePromotionHeaderView.g = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m8400b(PrivilegePromotionHeaderView privilegePromotionHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.h9, viewGroup, true);
        m8399a(privilegePromotionHeaderView, viewInflate);
        return viewInflate;
    }
}

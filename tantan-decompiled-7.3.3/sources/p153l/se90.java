package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.messages.promotion.PrivilegePromotionHeaderView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class se90 {
    /* JADX INFO: renamed from: a */
    public static void m185529a(PrivilegePromotionHeaderView privilegePromotionHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegePromotionHeaderView.f26613a = (RelativeLayout) viewGroup.getChildAt(0);
        privilegePromotionHeaderView.f26614b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegePromotionHeaderView.f26615c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegePromotionHeaderView.f26616d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        privilegePromotionHeaderView.f26617e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        privilegePromotionHeaderView.f26618f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        privilegePromotionHeaderView.f26619g = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m185530b(PrivilegePromotionHeaderView privilegePromotionHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125983o9, viewGroup, true);
        m185529a(privilegePromotionHeaderView, viewInflate);
        return viewInflate;
    }
}

package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.vip.privilege.PrivilegeSupremePartnerCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rb90 {
    /* JADX INFO: renamed from: a */
    public static void m9127a(PrivilegeSupremePartnerCard privilegeSupremePartnerCard, View view) {
        privilegeSupremePartnerCard.d = (PrivilegeSupremePartnerCard) view;
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeSupremePartnerCard.e = (FrameLayout) viewGroup.getChildAt(0);
        privilegeSupremePartnerCard.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeSupremePartnerCard.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeSupremePartnerCard.h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeSupremePartnerCard.i = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        privilegeSupremePartnerCard.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        privilegeSupremePartnerCard.k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}

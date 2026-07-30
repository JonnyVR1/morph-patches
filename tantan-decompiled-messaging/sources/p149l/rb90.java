package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.PrivilegeSupremePartnerCard;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rb90 {
    /* JADX INFO: renamed from: a */
    public static void m178579a(PrivilegeSupremePartnerCard privilegeSupremePartnerCard, View view) {
        privilegeSupremePartnerCard.f37491d = (PrivilegeSupremePartnerCard) view;
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeSupremePartnerCard.f37492e = (FrameLayout) viewGroup.getChildAt(0);
        privilegeSupremePartnerCard.f37493f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeSupremePartnerCard.f37494g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeSupremePartnerCard.f37495h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeSupremePartnerCard.f37496i = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        privilegeSupremePartnerCard.f37497j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        privilegeSupremePartnerCard.f37498k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}

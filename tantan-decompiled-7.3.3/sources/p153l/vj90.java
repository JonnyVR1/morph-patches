package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.PrivilegeSupremePartnerCard;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vj90 {
    /* JADX INFO: renamed from: a */
    public static void m201496a(PrivilegeSupremePartnerCard privilegeSupremePartnerCard, View view) {
        privilegeSupremePartnerCard.f38339d = (PrivilegeSupremePartnerCard) view;
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeSupremePartnerCard.f38340e = (FrameLayout) viewGroup.getChildAt(0);
        privilegeSupremePartnerCard.f38341f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeSupremePartnerCard.f38342g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeSupremePartnerCard.f38343h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        privilegeSupremePartnerCard.f38344i = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        privilegeSupremePartnerCard.f38345j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        privilegeSupremePartnerCard.f38346k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}

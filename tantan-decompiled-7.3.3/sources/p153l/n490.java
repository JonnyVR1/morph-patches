package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeDescListSeeImageItem;
import p151v.AutoVDraweeView;
import p151v.VLinear_FillerMeasure;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n490 {
    /* JADX INFO: renamed from: a */
    public static void m161556a(PrivilegeDescListSeeImageItem privilegeDescListSeeImageItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListSeeImageItem.f35891a = (AutoVDraweeView) viewGroup.getChildAt(0);
        privilegeDescListSeeImageItem.f35892b = (VLinear_FillerMeasure) viewGroup.getChildAt(1);
        privilegeDescListSeeImageItem.f35893c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privilegeDescListSeeImageItem.f35894d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        privilegeDescListSeeImageItem.f35895e = (LinearLayout) viewGroup.getChildAt(2);
        privilegeDescListSeeImageItem.f35896f = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeDescListSeeImageItem.f35897g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

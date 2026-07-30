package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeDescListSeeImageItem;
import p147v.AutoVDraweeView;
import p147v.VLinear_FillerMeasure;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jw80 {
    /* JADX INFO: renamed from: a */
    public static void m143650a(PrivilegeDescListSeeImageItem privilegeDescListSeeImageItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListSeeImageItem.f35043a = (AutoVDraweeView) viewGroup.getChildAt(0);
        privilegeDescListSeeImageItem.f35044b = (VLinear_FillerMeasure) viewGroup.getChildAt(1);
        privilegeDescListSeeImageItem.f35045c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        privilegeDescListSeeImageItem.f35046d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        privilegeDescListSeeImageItem.f35047e = (LinearLayout) viewGroup.getChildAt(2);
        privilegeDescListSeeImageItem.f35048f = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeDescListSeeImageItem.f35049g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

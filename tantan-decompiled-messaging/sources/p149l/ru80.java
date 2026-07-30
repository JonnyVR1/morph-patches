package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeDescListCustomModelItem;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ru80 {
    /* JADX INFO: renamed from: a */
    public static void m180863a(PrivilegeDescListCustomModelItem privilegeDescListCustomModelItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListCustomModelItem._header_pic = (VDraweeView) viewGroup.getChildAt(0);
        privilegeDescListCustomModelItem._mask = (VDraweeView) viewGroup.getChildAt(1);
        privilegeDescListCustomModelItem._label = (VText) viewGroup.getChildAt(2);
    }
}

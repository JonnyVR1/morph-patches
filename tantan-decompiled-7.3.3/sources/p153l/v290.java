package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeDescListCustomModelItem;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class v290 {
    /* JADX INFO: renamed from: a */
    public static void m199126a(PrivilegeDescListCustomModelItem privilegeDescListCustomModelItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeDescListCustomModelItem._header_pic = (VDraweeView) viewGroup.getChildAt(0);
        privilegeDescListCustomModelItem._mask = (VDraweeView) viewGroup.getChildAt(1);
        privilegeDescListCustomModelItem._label = (VText) viewGroup.getChildAt(2);
    }
}

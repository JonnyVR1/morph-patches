package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceSingleTextView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class oc90 {
    /* JADX INFO: renamed from: a */
    public static void m167142a(PrivilegeEntranceSingleTextView privilegeEntranceSingleTextView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntranceSingleTextView._texture = (VImage) viewGroup.getChildAt(0);
        privilegeEntranceSingleTextView._title = (VText) viewGroup.getChildAt(1);
        privilegeEntranceSingleTextView._go = (VImage) viewGroup.getChildAt(2);
    }
}

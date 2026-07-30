package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceSingleTextView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class k490 {
    /* JADX INFO: renamed from: a */
    public static void m144483a(PrivilegeEntranceSingleTextView privilegeEntranceSingleTextView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntranceSingleTextView._texture = (VImage) viewGroup.getChildAt(0);
        privilegeEntranceSingleTextView._title = (VText) viewGroup.getChildAt(1);
        privilegeEntranceSingleTextView._go = (VImage) viewGroup.getChildAt(2);
    }
}

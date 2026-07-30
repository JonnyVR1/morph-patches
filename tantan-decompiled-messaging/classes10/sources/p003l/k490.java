package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.banner.view.PrivilegeEntranceSingleTextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k490 {
    /* JADX INFO: renamed from: a */
    public static void m7529a(PrivilegeEntranceSingleTextView privilegeEntranceSingleTextView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeEntranceSingleTextView._texture = viewGroup.getChildAt(0);
        privilegeEntranceSingleTextView._title = viewGroup.getChildAt(1);
        privilegeEntranceSingleTextView._go = viewGroup.getChildAt(2);
    }
}

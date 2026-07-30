package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.ReminderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fpc0 {
    /* JADX INFO: renamed from: a */
    public static void m6489a(ReminderView reminderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        reminderView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        reminderView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        reminderView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        reminderView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        reminderView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}

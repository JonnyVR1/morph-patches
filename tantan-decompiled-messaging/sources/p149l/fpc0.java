package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ReminderView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fpc0 {
    /* JADX INFO: renamed from: a */
    public static void m122589a(ReminderView reminderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        reminderView.f31678a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        reminderView.f31679b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        reminderView.f31680c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        reminderView.f31681d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        reminderView.f31682e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}

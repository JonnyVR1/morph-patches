package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.ReminderView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kxc0 {
    /* JADX INFO: renamed from: a */
    public static void m151823a(ReminderView reminderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        reminderView.f32526a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        reminderView.f32527b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        reminderView.f32528c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        reminderView.f32529d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        reminderView.f32530e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}

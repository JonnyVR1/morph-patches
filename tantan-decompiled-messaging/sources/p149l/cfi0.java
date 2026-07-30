package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.common.signin.main.TaskExpandOrFoldView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cfi0 {
    /* JADX INFO: renamed from: a */
    public static void m106557a(TaskExpandOrFoldView taskExpandOrFoldView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        taskExpandOrFoldView.f49319a = (LinearLayout) viewGroup.getChildAt(0);
        taskExpandOrFoldView.f49320b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        taskExpandOrFoldView.f49321c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}

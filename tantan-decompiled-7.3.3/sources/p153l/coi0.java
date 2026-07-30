package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.common.signin.main.TaskExpandOrFoldView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class coi0 {
    /* JADX INFO: renamed from: a */
    public static void m111658a(TaskExpandOrFoldView taskExpandOrFoldView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        taskExpandOrFoldView.f50167a = (LinearLayout) viewGroup.getChildAt(0);
        taskExpandOrFoldView.f50168b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        taskExpandOrFoldView.f50169c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}

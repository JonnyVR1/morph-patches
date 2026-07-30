package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.emoji.VEditTextEmojiCompat;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ek6 {
    /* JADX INFO: renamed from: a */
    public static void m116924a(dk6 dk6Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dk6Var.f86599a = (FrameLayout) viewGroup.getChildAt(0);
        dk6Var.f86600b = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dk6Var.f86601c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        dk6Var.f86602d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        dk6Var.f86603e = (LinearLayout) viewGroup.getChildAt(1);
        dk6Var.f86604f = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        dk6Var.f86605g = (VEditTextEmojiCompat) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        dk6Var.f86606h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        dk6Var.f86607i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        dk6Var.f86608j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m116925b(dk6 dk6Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95652Y1, viewGroup, false);
        m116924a(dk6Var, viewInflate);
        return viewInflate;
    }
}

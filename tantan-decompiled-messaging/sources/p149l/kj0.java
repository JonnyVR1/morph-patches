package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.newui.messages.AllPairsItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kj0 {
    /* JADX INFO: renamed from: a */
    public static void m146166a(AllPairsItemView allPairsItemView, View view) {
        allPairsItemView.f24584a = (AllPairsItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        allPairsItemView.f24585b = (VDraweeView) viewGroup.getChildAt(0);
        allPairsItemView.f24586c = (ConstraintLayout) viewGroup.getChildAt(1);
        allPairsItemView.f24587d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        allPairsItemView.f24588e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        allPairsItemView.f24589f = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        allPairsItemView.f24590g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        allPairsItemView.f24591h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        allPairsItemView.f24592i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(4);
        allPairsItemView.f24593j = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        allPairsItemView.f24594k = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.AnswerView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class at0 {
    /* JADX INFO: renamed from: a */
    public static void m98648a(AnswerView answerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        answerView.f32901a = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        answerView.f32902b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        answerView.f32903c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        answerView.f32904d = (VImage) viewGroup.getChildAt(1);
    }
}

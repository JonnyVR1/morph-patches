package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.AnswerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class at0 {
    /* JADX INFO: renamed from: a */
    public static void m5626a(AnswerView answerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        answerView.a = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        answerView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        answerView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        answerView.d = viewGroup.getChildAt(1);
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.AnswerView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ft0 {
    /* JADX INFO: renamed from: a */
    public static void m127280a(AnswerView answerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        answerView.f33749a = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        answerView.f33750b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        answerView.f33751c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        answerView.f33752d = (VImage) viewGroup.getChildAt(1);
    }
}

package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public class x9p {
    /* JADX INFO: renamed from: a */
    public static void m209807a(w9p w9pVar, View view) {
        w9pVar._question_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w9pVar._question_content_title = (TextView) viewGroup.getChildAt(0);
        w9pVar._question_answer_root = (LinearLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m209808b(w9p w9pVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125422G5, viewGroup, false);
        m209807a(w9pVar, viewInflate);
        return viewInflate;
    }
}

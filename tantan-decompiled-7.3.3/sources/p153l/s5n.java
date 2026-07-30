package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public class s5n {
    /* JADX INFO: renamed from: a */
    public static void m184741a(r5n r5nVar, View view) {
        r5nVar._question_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r5nVar._question_content_title = (TextView) viewGroup.getChildAt(0);
        r5nVar._question_answer_root = (LinearLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m184742b(r5n r5nVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126097v4, viewGroup, false);
        m184741a(r5nVar, viewInflate);
        return viewInflate;
    }
}

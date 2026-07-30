package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public class x7p {
    /* JADX INFO: renamed from: a */
    public static void m207306a(w7p w7pVar, View view) {
        w7pVar._question_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w7pVar._question_content_title = (TextView) viewGroup.getChildAt(0);
        w7pVar._question_answer_root = (LinearLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m207307b(w7p w7pVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95352F5, viewGroup, false);
        m207306a(w7pVar, viewInflate);
        return viewInflate;
    }
}

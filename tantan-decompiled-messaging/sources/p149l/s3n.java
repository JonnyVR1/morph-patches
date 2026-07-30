package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes10.dex */
public class s3n {
    /* JADX INFO: renamed from: a */
    public static void m182200a(r3n r3nVar, View view) {
        r3nVar._question_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r3nVar._question_content_title = (TextView) viewGroup.getChildAt(0);
        r3nVar._question_answer_root = (LinearLayout) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m182201b(r3n r3nVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96043v4, viewGroup, false);
        m182200a(r3nVar, viewInflate);
        return viewInflate;
    }
}

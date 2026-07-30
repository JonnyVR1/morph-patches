package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.text.TextBuzzAct;

/* JADX INFO: loaded from: classes10.dex */
public class dii0 {
    /* JADX INFO: renamed from: a */
    public static void m111873a(TextBuzzAct textBuzzAct, View view) {
        textBuzzAct._text_buzz_root = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m111874b(TextBuzzAct textBuzzAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106018C, viewGroup, false);
        m111873a(textBuzzAct, viewInflate);
        return viewInflate;
    }
}

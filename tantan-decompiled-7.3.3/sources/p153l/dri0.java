package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.text.TextBuzzAct;

/* JADX INFO: loaded from: classes10.dex */
public class dri0 {
    /* JADX INFO: renamed from: a */
    public static void m117687a(TextBuzzAct textBuzzAct, View view) {
        textBuzzAct._text_buzz_root = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m117688b(TextBuzzAct textBuzzAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136460C, viewGroup, false);
        m117687a(textBuzzAct, viewInflate);
        return viewInflate;
    }
}

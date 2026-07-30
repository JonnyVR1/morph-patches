package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.lovebuzz.text.TextBuzzAct;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dii0 {
    /* JADX INFO: renamed from: a */
    public static void m6118a(TextBuzzAct textBuzzAct, View view) {
        textBuzzAct.c = (FrameLayout) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m6119b(TextBuzzAct textBuzzAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.C, viewGroup, false);
        m6118a(textBuzzAct, viewInflate);
        return viewInflate;
    }
}

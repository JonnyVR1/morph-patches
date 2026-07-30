package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.NormalBuzzComboEntranceView;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hm40 {
    /* JADX INFO: renamed from: a */
    public static void m7018a(NormalBuzzComboEntranceView normalBuzzComboEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        normalBuzzComboEntranceView.d = viewGroup.getChildAt(0);
        normalBuzzComboEntranceView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        normalBuzzComboEntranceView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        normalBuzzComboEntranceView.g = viewGroup.getChildAt(1);
        normalBuzzComboEntranceView.h = viewGroup.getChildAt(2);
        normalBuzzComboEntranceView.i = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m7019b(NormalBuzzComboEntranceView normalBuzzComboEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.d, viewGroup, true);
        m7018a(normalBuzzComboEntranceView, viewInflate);
        return viewInflate;
    }
}

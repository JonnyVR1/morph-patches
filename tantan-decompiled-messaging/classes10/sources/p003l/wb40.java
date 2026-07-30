package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.NewUIBuzzComboEntranceView;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wb40 {
    /* JADX INFO: renamed from: a */
    public static void m10462a(NewUIBuzzComboEntranceView newUIBuzzComboEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newUIBuzzComboEntranceView.d = viewGroup.getChildAt(0);
        newUIBuzzComboEntranceView.e = viewGroup.getChildAt(1);
        newUIBuzzComboEntranceView.f = viewGroup.getChildAt(2);
        newUIBuzzComboEntranceView.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        newUIBuzzComboEntranceView.h = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        newUIBuzzComboEntranceView.i = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m10463b(NewUIBuzzComboEntranceView newUIBuzzComboEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f, viewGroup, true);
        m10462a(newUIBuzzComboEntranceView, viewInflate);
        return viewInflate;
    }
}

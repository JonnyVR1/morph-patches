package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.MemojiBuzzComboEntranceView;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yfy {
    /* JADX INFO: renamed from: a */
    public static void m11174a(MemojiBuzzComboEntranceView memojiBuzzComboEntranceView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        memojiBuzzComboEntranceView.a = viewGroup.getChildAt(0);
        memojiBuzzComboEntranceView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        memojiBuzzComboEntranceView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        memojiBuzzComboEntranceView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        memojiBuzzComboEntranceView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        memojiBuzzComboEntranceView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        memojiBuzzComboEntranceView.g = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11175b(MemojiBuzzComboEntranceView memojiBuzzComboEntranceView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.e, viewGroup, true);
        m11174a(memojiBuzzComboEntranceView, viewInflate);
        return viewInflate;
    }
}

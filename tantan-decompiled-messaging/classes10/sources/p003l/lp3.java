package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzSwitchItemView;
import l.h6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lp3 {
    /* JADX INFO: renamed from: a */
    public static void m7761a(BuzzSwitchItemView buzzSwitchItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        buzzSwitchItemView.d = viewGroup.getChildAt(0);
        buzzSwitchItemView.e = viewGroup.getChildAt(1);
        buzzSwitchItemView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        buzzSwitchItemView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        buzzSwitchItemView.h = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7762b(BuzzSwitchItemView buzzSwitchItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.m, viewGroup, true);
        m7761a(buzzSwitchItemView, viewInflate);
        return viewInflate;
    }
}

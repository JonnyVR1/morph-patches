package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hqn {
    /* JADX INFO: renamed from: a */
    public static void m7062a(IntlLetterSendPanel intlLetterSendPanel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLetterSendPanel.a = viewGroup.getChildAt(0);
        intlLetterSendPanel.b = viewGroup.getChildAt(2);
        intlLetterSendPanel.c = viewGroup.getChildAt(3);
        intlLetterSendPanel.d = viewGroup.getChildAt(4);
        intlLetterSendPanel.e = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        intlLetterSendPanel.f = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        intlLetterSendPanel.g = viewGroup.getChildAt(8);
        intlLetterSendPanel.h = viewGroup.getChildAt(9);
        intlLetterSendPanel.i = viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m7063b(IntlLetterSendPanel intlLetterSendPanel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ad, viewGroup, true);
        m7062a(intlLetterSendPanel, viewInflate);
        return viewInflate;
    }
}

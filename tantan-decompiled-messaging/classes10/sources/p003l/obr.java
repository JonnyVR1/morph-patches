package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.vip.widget.LetterSendPanel;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class obr {
    /* JADX INFO: renamed from: a */
    public static void m8437a(LetterSendPanel letterSendPanel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        letterSendPanel.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        letterSendPanel.b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        letterSendPanel.c = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        letterSendPanel.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        letterSendPanel.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        letterSendPanel.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        letterSendPanel.g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        letterSendPanel.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        letterSendPanel.i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        letterSendPanel.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        letterSendPanel.k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        letterSendPanel.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        letterSendPanel.m = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8438b(LetterSendPanel letterSendPanel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.kd, viewGroup, true);
        m8437a(letterSendPanel, viewInflate);
        return viewInflate;
    }
}

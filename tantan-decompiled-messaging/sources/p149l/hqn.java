package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.IntlLetterSendPanel;
import p147v.VEditText;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hqn {
    /* JADX INFO: renamed from: a */
    public static void m132458a(IntlLetterSendPanel intlLetterSendPanel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLetterSendPanel.f37969a = (VImage) viewGroup.getChildAt(0);
        intlLetterSendPanel.f37970b = (VText) viewGroup.getChildAt(2);
        intlLetterSendPanel.f37971c = (VText) viewGroup.getChildAt(3);
        intlLetterSendPanel.f37972d = (VRecyclerView) viewGroup.getChildAt(4);
        intlLetterSendPanel.f37973e = (VEditText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        intlLetterSendPanel.f37974f = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        intlLetterSendPanel.f37975g = (VText) viewGroup.getChildAt(8);
        intlLetterSendPanel.f37976h = (VText) viewGroup.getChildAt(9);
        intlLetterSendPanel.f37977i = (VText) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m132459b(IntlLetterSendPanel intlLetterSendPanel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95280Ad, viewGroup, true);
        m132458a(intlLetterSendPanel, viewInflate);
        return viewInflate;
    }
}

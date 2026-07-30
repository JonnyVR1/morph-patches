package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterSendPanel;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qdr {
    /* JADX INFO: renamed from: a */
    public static void m176204a(LetterSendPanel letterSendPanel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        letterSendPanel.f38854a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        letterSendPanel.f38855b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        letterSendPanel.f38856c = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        letterSendPanel.f38857d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        letterSendPanel.f38858e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        letterSendPanel.f38859f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        letterSendPanel.f38860g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        letterSendPanel.f38861h = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        letterSendPanel.f38862i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        letterSendPanel.f38863j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        letterSendPanel.f38864k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        letterSendPanel.f38865l = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        letterSendPanel.f38866m = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m176205b(LetterSendPanel letterSendPanel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126038rd, viewGroup, true);
        m176204a(letterSendPanel, viewInflate);
        return viewInflate;
    }
}

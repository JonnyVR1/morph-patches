package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.IntlLetterSendPanel;
import p151v.VEditText;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hsn {
    /* JADX INFO: renamed from: a */
    public static void m136990a(IntlLetterSendPanel intlLetterSendPanel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLetterSendPanel.f38817a = (VImage) viewGroup.getChildAt(0);
        intlLetterSendPanel.f38818b = (VText) viewGroup.getChildAt(2);
        intlLetterSendPanel.f38819c = (VText) viewGroup.getChildAt(3);
        intlLetterSendPanel.f38820d = (VRecyclerView) viewGroup.getChildAt(4);
        intlLetterSendPanel.f38821e = (VEditText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        intlLetterSendPanel.f38822f = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        intlLetterSendPanel.f38823g = (VText) viewGroup.getChildAt(8);
        intlLetterSendPanel.f38824h = (VText) viewGroup.getChildAt(9);
        intlLetterSendPanel.f38825i = (VText) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m136991b(IntlLetterSendPanel intlLetterSendPanel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125446Hd, viewGroup, true);
        m136990a(intlLetterSendPanel, viewInflate);
        return viewInflate;
    }
}

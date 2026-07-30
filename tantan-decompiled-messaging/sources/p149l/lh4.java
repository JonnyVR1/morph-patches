package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomLiteratureMessageLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lh4 {
    /* JADX INFO: renamed from: a */
    public static void m149829a(CardBottomLiteratureMessageLayout cardBottomLiteratureMessageLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomLiteratureMessageLayout.f23515c = (LinearLayout) viewGroup.getChildAt(0);
        cardBottomLiteratureMessageLayout.f23516d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomLiteratureMessageLayout.f23517e = (CardBottomBaseInfoView) viewGroup.getChildAt(1);
        cardBottomLiteratureMessageLayout.f23518f = (CardUserContentView) viewGroup.getChildAt(2);
    }
}

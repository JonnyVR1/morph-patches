package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomLiteratureMessageLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ki4 {
    /* JADX INFO: renamed from: a */
    public static void m149858a(CardBottomLiteratureMessageLayout cardBottomLiteratureMessageLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomLiteratureMessageLayout.f24257c = (LinearLayout) viewGroup.getChildAt(0);
        cardBottomLiteratureMessageLayout.f24258d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardBottomLiteratureMessageLayout.f24259e = (CardBottomBaseInfoView) viewGroup.getChildAt(1);
        cardBottomLiteratureMessageLayout.f24260f = (CardUserContentView) viewGroup.getChildAt(2);
    }
}

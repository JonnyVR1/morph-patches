package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardPictureViewOpt;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundLinearLayout;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class eer {
    /* JADX INFO: renamed from: a */
    public static void m120560a(der derVar, View view) {
        derVar.f88066f = (CardPhotoFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        derVar.f88067g = (CardPictureViewOpt) viewGroup.getChildAt(0);
        derVar.f88068h = (VImage) viewGroup.getChildAt(1);
        derVar.f88069i = (RoundLinearLayout) viewGroup.getChildAt(2);
        derVar.f88070j = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        derVar.f88071k = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

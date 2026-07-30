package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.CardPhotoFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardPictureViewOpt;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundLinearLayout;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dcr {
    /* JADX INFO: renamed from: a */
    public static void m110872a(ccr ccrVar, View view) {
        ccrVar.f80289f = (CardPhotoFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ccrVar.f80290g = (CardPictureViewOpt) viewGroup.getChildAt(0);
        ccrVar.f80291h = (VImage) viewGroup.getChildAt(1);
        ccrVar.f80292i = (RoundLinearLayout) viewGroup.getChildAt(2);
        ccrVar.f80293j = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ccrVar.f80294k = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pk4 {
    /* JADX INFO: renamed from: a */
    public static void m8757a(CardIntlPictureViewOpt cardIntlPictureViewOpt, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardIntlPictureViewOpt.b = viewGroup.getChildAt(0);
        cardIntlPictureViewOpt.c = viewGroup.getChildAt(1);
        cardIntlPictureViewOpt.d = (FrameLayout) viewGroup.getChildAt(2);
        cardIntlPictureViewOpt.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}

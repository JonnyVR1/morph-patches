package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.likeminded.LikeMindedCardTabView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class efr {
    /* JADX INFO: renamed from: a */
    public static void m120708a(LikeMindedCardTabView likeMindedCardTabView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likeMindedCardTabView._image = (VDraweeView) viewGroup.getChildAt(0);
        likeMindedCardTabView._title = (TextView) viewGroup.getChildAt(1);
    }
}

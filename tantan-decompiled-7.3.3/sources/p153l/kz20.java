package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterTagItem;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kz20 {
    /* JADX INFO: renamed from: a */
    public static void m152159a(NewFilterTagItem newFilterTagItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newFilterTagItem.f37034a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newFilterTagItem.f37035b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newFilterTagItem.f37036c = (VImage) viewGroup.getChildAt(1);
    }
}

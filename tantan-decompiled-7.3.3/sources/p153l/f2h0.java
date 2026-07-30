package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.discovery.SuggestUserItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f2h0 {
    /* JADX INFO: renamed from: a */
    public static void m123616a(SuggestUserItem suggestUserItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        suggestUserItem.f22109a = (VDraweeView) viewGroup.getChildAt(0);
        suggestUserItem.f22110b = (VText) viewGroup.getChildAt(1);
        suggestUserItem.f22111c = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        suggestUserItem.f22112d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        suggestUserItem.f22113e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}

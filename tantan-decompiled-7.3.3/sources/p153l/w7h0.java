package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeCustomModelItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class w7h0 {
    /* JADX INFO: renamed from: a */
    public static void m205278a(SupremeCustomModelItem supremeCustomModelItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        supremeCustomModelItem._header_pic = (VDraweeView) viewGroup.getChildAt(0);
        supremeCustomModelItem._mask = (VDraweeView) viewGroup.getChildAt(1);
        supremeCustomModelItem._selectborder = (VImage) viewGroup.getChildAt(2);
        supremeCustomModelItem._label = (VText) viewGroup.getChildAt(3);
    }
}

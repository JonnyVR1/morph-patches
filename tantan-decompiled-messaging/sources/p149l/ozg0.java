package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.supreme.SupremeCustomModelItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ozg0 {
    /* JADX INFO: renamed from: a */
    public static void m166771a(SupremeCustomModelItem supremeCustomModelItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        supremeCustomModelItem._header_pic = (VDraweeView) viewGroup.getChildAt(0);
        supremeCustomModelItem._mask = (VDraweeView) viewGroup.getChildAt(1);
        supremeCustomModelItem._selectborder = (VImage) viewGroup.getChildAt(2);
        supremeCustomModelItem._label = (VText) viewGroup.getChildAt(3);
    }
}

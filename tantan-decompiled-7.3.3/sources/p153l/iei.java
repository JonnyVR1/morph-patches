package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VDraweeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class iei {
    /* JADX INFO: renamed from: a */
    public static void m139614a(hei heiVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        heiVar._get_privilege = (VLinear) viewGroup.getChildAt(0);
        heiVar._get_privilege_text = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        heiVar._get_privilege_subtitle = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        heiVar._stickers = (TextView) viewGroup.getChildAt(1);
        heiVar._subtitle = (TextView) viewGroup.getChildAt(2);
        heiVar._title = (TextView) viewGroup.getChildAt(3);
        heiVar._image = (VDraweeView) viewGroup.getChildAt(4);
    }
}

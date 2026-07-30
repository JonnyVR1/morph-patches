package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VDraweeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class tci {
    /* JADX INFO: renamed from: a */
    public static void m187987a(sci sciVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sciVar._get_privilege = (VLinear) viewGroup.getChildAt(0);
        sciVar._get_privilege_text = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        sciVar._get_privilege_subtitle = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        sciVar._stickers = (TextView) viewGroup.getChildAt(1);
        sciVar._subtitle = (TextView) viewGroup.getChildAt(2);
        sciVar._title = (TextView) viewGroup.getChildAt(3);
        sciVar._image = (VDraweeView) viewGroup.getChildAt(4);
    }
}

package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class vnq0 {
    /* JADX INFO: renamed from: a */
    public static void m202004a(unq0 unq0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        unq0Var._get_privilege = (TextView) viewGroup.getChildAt(0);
        unq0Var._stickers = (TextView) viewGroup.getChildAt(1);
        unq0Var._subtitle = (TextView) viewGroup.getChildAt(2);
        unq0Var._title = (TextView) viewGroup.getChildAt(3);
        unq0Var._image = (VDraweeView) viewGroup.getChildAt(4);
    }
}

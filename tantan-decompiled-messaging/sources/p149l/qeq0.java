package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class qeq0 {
    /* JADX INFO: renamed from: a */
    public static void m174229a(peq0 peq0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        peq0Var._get_privilege = (TextView) viewGroup.getChildAt(0);
        peq0Var._stickers = (TextView) viewGroup.getChildAt(1);
        peq0Var._subtitle = (TextView) viewGroup.getChildAt(2);
        peq0Var._title = (TextView) viewGroup.getChildAt(3);
        peq0Var._image = (VDraweeView) viewGroup.getChildAt(4);
    }
}

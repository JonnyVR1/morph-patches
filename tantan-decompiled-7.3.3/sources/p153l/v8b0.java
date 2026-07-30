package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class v8b0 {
    /* JADX INFO: renamed from: a */
    public static void m200296a(u8b0 u8b0Var, View view) {
        u8b0Var._agreement_root = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        u8b0Var._check = viewGroup.getChildAt(0);
        u8b0Var._agreement = (TextView) viewGroup.getChildAt(1);
    }
}

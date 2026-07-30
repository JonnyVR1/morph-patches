package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeLetterView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class b690 {
    /* JADX INFO: renamed from: a */
    public static void m5694a(PrivilegeLetterView privilegeLetterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeLetterView.a = (ImageView) viewGroup.getChildAt(0);
        privilegeLetterView.b = (ImageView) viewGroup.getChildAt(1);
        privilegeLetterView.c = (LinearLayout) viewGroup.getChildAt(2);
        privilegeLetterView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeLetterView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

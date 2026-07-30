package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeLetterView;

/* JADX INFO: loaded from: classes10.dex */
public class b690 {
    /* JADX INFO: renamed from: a */
    public static void m100402a(PrivilegeLetterView privilegeLetterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeLetterView.f35083a = (ImageView) viewGroup.getChildAt(0);
        privilegeLetterView.f35084b = (ImageView) viewGroup.getChildAt(1);
        privilegeLetterView.f35085c = (LinearLayout) viewGroup.getChildAt(2);
        privilegeLetterView.f35086d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeLetterView.f35087e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

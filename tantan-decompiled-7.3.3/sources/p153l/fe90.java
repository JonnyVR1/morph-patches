package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeLetterView;

/* JADX INFO: loaded from: classes10.dex */
public class fe90 {
    /* JADX INFO: renamed from: a */
    public static void m125299a(PrivilegeLetterView privilegeLetterView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeLetterView.f35931a = (ImageView) viewGroup.getChildAt(0);
        privilegeLetterView.f35932b = (ImageView) viewGroup.getChildAt(1);
        privilegeLetterView.f35933c = (LinearLayout) viewGroup.getChildAt(2);
        privilegeLetterView.f35934d = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        privilegeLetterView.f35935e = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}

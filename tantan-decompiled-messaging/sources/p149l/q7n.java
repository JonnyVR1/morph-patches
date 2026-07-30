package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q7n {
    /* JADX INFO: renamed from: a */
    public static void m173290a(p7n p7nVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        p7nVar.f147523a = (VText) viewGroup.getChildAt(1);
        p7nVar.f147524b = (VText) viewGroup.getChildAt(2);
        p7nVar.f147525c = (LinearLayout) viewGroup.getChildAt(3);
        p7nVar.f147526d = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        p7nVar.f147527e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}

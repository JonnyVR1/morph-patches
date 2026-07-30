package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VProgressBar;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qhq0 {
    /* JADX INFO: renamed from: a */
    public static void m176611a(ohq0 ohq0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ohq0Var.f147473a = (VProgressBar) viewGroup.getChildAt(0);
        ohq0Var.f147474b = (LinearLayout) viewGroup.getChildAt(1);
        ohq0Var.f147475c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ohq0Var.f147476d = (VRecyclerView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m176612b(ohq0 ohq0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162554g2, viewGroup, false);
        m176611a(ohq0Var, viewInflate);
        return viewInflate;
    }
}

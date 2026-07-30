package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import p151v.VEditText;
import p151v.VHandleBar;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class pmm {
    /* JADX INFO: renamed from: a */
    public static void m172956a(omm ommVar, View view) {
        ommVar.f147953a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ommVar.f147954b = (CoordinatorLayout) viewGroup.getChildAt(0);
        ommVar.f147955c = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ommVar.f147956d = (VHandleBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ommVar.f147957e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        ommVar.f147958f = (VRecyclerView) view.findViewById(hdc0.f108977y);
        ViewGroup viewGroup2 = (ViewGroup) view;
        ommVar.f147959g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3);
        ommVar.f147960h = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3);
        ommVar.f147961i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        ommVar.f147962j = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        ommVar.f147963k = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        ommVar.f147964l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        ommVar.f147965m = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        ommVar.f147966n = (CommonEmptyView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(4);
        ommVar.f147967o = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m172957b(omm ommVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173550O0, viewGroup, false);
        m172956a(ommVar, viewInflate);
        return viewInflate;
    }
}

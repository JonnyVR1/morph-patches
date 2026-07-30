package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import p147v.VEditText;
import p147v.VHandleBar;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class nkm {
    /* JADX INFO: renamed from: a */
    public static void m159980a(mkm mkmVar, View view) {
        mkmVar.f134336a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mkmVar.f134337b = (CoordinatorLayout) viewGroup.getChildAt(0);
        mkmVar.f134338c = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mkmVar.f134339d = (VHandleBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        mkmVar.f134340e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        mkmVar.f134341f = (VRecyclerView) view.findViewById(b5c0.f73624y);
        ViewGroup viewGroup2 = (ViewGroup) view;
        mkmVar.f134342g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3);
        mkmVar.f134343h = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3);
        mkmVar.f134344i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        mkmVar.f134345j = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        mkmVar.f134346k = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        mkmVar.f134347l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        mkmVar.f134348m = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        mkmVar.f134349n = (CommonEmptyView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(4);
        mkmVar.f134350o = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m159981b(mkm mkmVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142081O0, viewGroup, false);
        m159980a(mkmVar, viewInflate);
        return viewInflate;
    }
}

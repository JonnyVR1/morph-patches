package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nkm {
    /* JADX INFO: renamed from: a */
    public static void m12281a(mkm mkmVar, View view) {
        mkmVar.f10485a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mkmVar.f10486b = viewGroup.getChildAt(0);
        mkmVar.f10487c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mkmVar.f10488d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        mkmVar.f10489e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        mkmVar.f10490f = view.findViewById(b5c0.f6105y);
        ViewGroup viewGroup2 = (ViewGroup) view;
        mkmVar.f10491g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3);
        mkmVar.f10492h = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3);
        mkmVar.f10493i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        mkmVar.f10494j = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        mkmVar.f10495k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        mkmVar.f10496l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(1);
        mkmVar.f10497m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        mkmVar.f10498n = (CommonEmptyView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(4);
        mkmVar.f10499o = ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(0)).getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m12282b(mkm mkmVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11100O0, viewGroup, false);
        m12281a(mkmVar, viewInflate);
        return viewInflate;
    }
}

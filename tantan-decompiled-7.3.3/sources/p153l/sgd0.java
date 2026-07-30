package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p051p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p051p1.mobile.putong.live.livingroom.view.RightSideViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class sgd0 {
    /* JADX INFO: renamed from: a */
    public static void m185768a(rgd0 rgd0Var, View view) {
        rgd0Var.f162993a = (RightSideViewGroup) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rgd0Var.f162994b = (LiveScrollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rgd0Var.f162995c = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        rgd0Var.f162996d = (LiveSideView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m185769b(rgd0 rgd0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199139k5, viewGroup, false);
        m185768a(rgd0Var, viewInflate);
        return viewInflate;
    }
}

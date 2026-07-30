package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p046p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p046p1.mobile.putong.live.livingroom.view.RightSideViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class p8d0 {
    /* JADX INFO: renamed from: a */
    public static void m167794a(o8d0 o8d0Var, View view) {
        o8d0Var.f142611a = (RightSideViewGroup) view;
        ViewGroup viewGroup = (ViewGroup) view;
        o8d0Var.f142612b = (LiveScrollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        o8d0Var.f142613c = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        o8d0Var.f142614d = (LiveSideView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m167795b(o8d0 o8d0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168407k5, viewGroup, false);
        m167794a(o8d0Var, viewInflate);
        return viewInflate;
    }
}

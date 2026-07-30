package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.p000p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p8d0 {
    /* JADX INFO: renamed from: a */
    public static void m20130a(o8d0 o8d0Var, View view) {
        o8d0Var.f16427a = (RightSideViewGroup) view;
        ViewGroup viewGroup = (ViewGroup) view;
        o8d0Var.f16428b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        o8d0Var.f16429c = (ViewStub) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        o8d0Var.f16430d = (LiveSideView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m20131b(o8d0 o8d0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19903k5, viewGroup, false);
        m20130a(o8d0Var, viewInflate);
        return viewInflate;
    }
}

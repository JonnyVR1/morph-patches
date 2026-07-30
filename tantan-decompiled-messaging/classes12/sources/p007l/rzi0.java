package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rzi0 {
    /* JADX INFO: renamed from: a */
    public static void m13973a(qzi0 qzi0Var, View view) {
        qzi0Var.f12434a = ((ViewGroup) view).getChildAt(0);
        qzi0Var.f12435b = view.findViewById(b5c0.f6021Z1);
        qzi0Var.f12436c = (CommonEmptyView) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m13974b(qzi0 qzi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11211f4, viewGroup, false);
        m13973a(qzi0Var, viewInflate);
        return viewInflate;
    }
}

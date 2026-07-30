package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.view.RectangleLayout;

/* JADX INFO: loaded from: classes4.dex */
public class yqe {
    /* JADX INFO: renamed from: a */
    public static void m215719a(xqe xqeVar, View view) {
        xqeVar.f193997a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xqeVar.f193998b = viewGroup.getChildAt(0);
        xqeVar.f193999c = (RectangleLayout) viewGroup.getChildAt(1);
        xqeVar.f194000d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m215720b(xqe xqeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f167996D0, viewGroup, false);
        m215719a(xqeVar, viewInflate);
        return viewInflate;
    }
}

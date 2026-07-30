package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.p060ui.moments.C11410b;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VFrame_Shadow;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class un00 {
    /* JADX INFO: renamed from: a */
    public static void m194412a(C11410b c11410b, View view) {
        c11410b.f43977a = (FrameLayout) view.findViewById(b5c0.f73465A1);
        ViewGroup viewGroup = (ViewGroup) view;
        c11410b.f43978b = (VFrame_Shadow) viewGroup.getChildAt(0);
        c11410b.f43979c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        c11410b.f43980d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        c11410b.f43981e = (LinearLayout) viewGroup.getChildAt(1);
        c11410b.f43982f = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        c11410b.f43983g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        c11410b.f43984h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m194413b(C11410b c11410b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142290t4, viewGroup, false);
        m194412a(c11410b, viewInflate);
        return viewInflate;
    }
}

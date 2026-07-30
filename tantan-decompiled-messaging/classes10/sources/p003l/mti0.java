package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.vip.privilege.vipfrag.view.TopCardLayout;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mti0 {
    /* JADX INFO: renamed from: a */
    public static void m8264a(TopCardLayout topCardLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topCardLayout.a = viewGroup.getChildAt(0);
        topCardLayout.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8265b(TopCardLayout topCardLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.j9, viewGroup, true);
        m8264a(topCardLayout, viewInflate);
        return viewInflate;
    }
}

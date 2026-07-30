package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.a;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class r4q0 {
    /* JADX INFO: renamed from: a */
    public static void m9085a(a aVar, View view) {
        aVar.b = ((ViewGroup) view).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9086b(a aVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Sc, viewGroup, true);
        m9085a(aVar, viewInflate);
        return viewInflate;
    }
}

package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.profile.newmine.newprofile.task.a;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rei0 {
    /* JADX INFO: renamed from: a */
    public static void m9133a(a aVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aVar.a = viewGroup.getChildAt(0);
        aVar.b = viewGroup.getChildAt(1);
        aVar.c = viewGroup.getChildAt(2);
        aVar.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        aVar.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9134b(a aVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.D7, viewGroup, false);
        m9133a(aVar, viewInflate);
        return viewInflate;
    }
}

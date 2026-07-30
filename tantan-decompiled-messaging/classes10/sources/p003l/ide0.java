package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.settings.log.SelectLogTimeAct;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ide0 {
    /* JADX INFO: renamed from: a */
    public static void m7155a(SelectLogTimeAct selectLogTimeAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        selectLogTimeAct.c = viewGroup.getChildAt(0);
        selectLogTimeAct.d = viewGroup.getChildAt(3);
        selectLogTimeAct.e = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m7156b(SelectLogTimeAct selectLogTimeAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Je, viewGroup, false);
        m7155a(selectLogTimeAct, viewInflate);
        return viewInflate;
    }
}

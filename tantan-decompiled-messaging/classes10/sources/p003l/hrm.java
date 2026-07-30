package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.incentivevideo.IncentVideoResultAct;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hrm {
    /* JADX INFO: renamed from: a */
    public static void m7068a(IncentVideoResultAct incentVideoResultAct, View view) {
        incentVideoResultAct.f2157c = (TextView) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7069b(IncentVideoResultAct incentVideoResultAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.n, viewGroup, false);
        m7068a(incentVideoResultAct, viewInflate);
        return viewInflate;
    }
}

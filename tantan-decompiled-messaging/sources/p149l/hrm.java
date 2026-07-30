package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.incentivevideo.IncentVideoResultAct;

/* JADX INFO: loaded from: classes10.dex */
public class hrm {
    /* JADX INFO: renamed from: a */
    public static void m132690a(IncentVideoResultAct incentVideoResultAct, View view) {
        incentVideoResultAct.f29763c = (TextView) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m132691b(IncentVideoResultAct incentVideoResultAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95902n, viewGroup, false);
        m132690a(incentVideoResultAct, viewInflate);
        return viewInflate;
    }
}

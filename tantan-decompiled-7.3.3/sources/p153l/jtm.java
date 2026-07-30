package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.incentivevideo.IncentVideoResultAct;

/* JADX INFO: loaded from: classes10.dex */
public class jtm {
    /* JADX INFO: renamed from: a */
    public static void m146908a(IncentVideoResultAct incentVideoResultAct, View view) {
        incentVideoResultAct.f30611c = (TextView) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m146909b(IncentVideoResultAct incentVideoResultAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125956n, viewGroup, false);
        m146908a(incentVideoResultAct, viewInflate);
        return viewInflate;
    }
}

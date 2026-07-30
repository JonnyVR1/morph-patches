package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import java.util.List;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public interface c3m {
    /* JADX INFO: renamed from: a */
    View mo13098a(ViewGroup viewGroup, boolean z);

    /* JADX INFO: renamed from: b */
    void mo13099b();

    /* JADX INFO: renamed from: c */
    void mo13100c(b90 b90Var);

    /* JADX INFO: renamed from: e */
    void mo13101e(PayMethod payMethod);

    /* JADX INFO: renamed from: h */
    void mo13103h(List<d> list, e30<d> e30Var, e30<Integer> e30Var2);

    void release();

    /* JADX INFO: renamed from: f */
    default void mo13102f(List<d> list, e30<d> e30Var, e30<Integer> e30Var2, e30<d> e30Var3) {
    }
}

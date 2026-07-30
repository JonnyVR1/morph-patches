package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.PayMethod;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface c3m {
    /* JADX INFO: renamed from: a */
    View mo105092a(ViewGroup viewGroup, boolean z);

    /* JADX INFO: renamed from: b */
    void mo105093b();

    /* JADX INFO: renamed from: c */
    void mo105094c(b90 b90Var);

    /* JADX INFO: renamed from: e */
    void mo105095e(PayMethod payMethod);

    /* JADX INFO: renamed from: h */
    void mo105097h(List<C8765d> list, e30<C8765d> e30Var, e30<Integer> e30Var2);

    void release();

    /* JADX INFO: renamed from: f */
    default void mo105096f(List<C8765d> list, e30<C8765d> e30Var, e30<Integer> e30Var2, e30<C8765d> e30Var3) {
    }
}

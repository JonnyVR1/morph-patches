package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.PayMethod;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface t5m {
    /* JADX INFO: renamed from: a */
    View mo126108a(ViewGroup viewGroup, boolean z);

    /* JADX INFO: renamed from: b */
    void mo126110b();

    /* JADX INFO: renamed from: c */
    void mo126112c(x80 x80Var);

    /* JADX INFO: renamed from: e */
    void mo126115e(PayMethod payMethod);

    /* JADX INFO: renamed from: h */
    void mo126117h(List<C8928d> list, y20<C8928d> y20Var, y20<Integer> y20Var2);

    void release();

    /* JADX INFO: renamed from: f */
    default void mo141377f(List<C8928d> list, y20<C8928d> y20Var, y20<Integer> y20Var2, y20<C8928d> y20Var3) {
    }
}

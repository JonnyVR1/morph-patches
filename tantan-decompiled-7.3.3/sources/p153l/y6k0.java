package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public interface y6k0 {
    @NonNull
    /* JADX INFO: renamed from: a */
    View mo149538a();

    /* JADX INFO: renamed from: b */
    void mo149539b(boolean z);

    /* JADX INFO: renamed from: c */
    void mo149540c();

    @NonNull
    /* JADX INFO: renamed from: d */
    VImage mo149541d();

    /* JADX INFO: renamed from: e */
    void mo149542e(String str, bkj0<String, String, String> bkj0Var);

    @NonNull
    /* JADX INFO: renamed from: g */
    ODiamondTagLabel mo149544g();

    /* JADX INFO: renamed from: h */
    void mo149545h(View.OnClickListener onClickListener);

    /* JADX INFO: renamed from: i */
    void mo149546i(User user);

    View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* JADX INFO: renamed from: j */
    void mo149547j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2);

    /* JADX INFO: renamed from: l */
    void mo149549l(User user);

    /* JADX INFO: renamed from: n */
    void mo149551n(View.OnClickListener onClickListener);

    /* JADX INFO: renamed from: o */
    void mo149552o(int i);

    /* JADX INFO: renamed from: p */
    void mo149553p(User user);

    /* JADX INFO: renamed from: q */
    void mo149554q(User user);

    /* JADX INFO: renamed from: r */
    default boolean mo149555r() {
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    VText mo149556t();

    /* JADX INFO: renamed from: u */
    void mo149557u();

    @NonNull
    /* JADX INFO: renamed from: v */
    VImage mo149558v();

    /* JADX INFO: renamed from: f */
    default void mo149543f() {
    }

    /* JADX INFO: renamed from: s */
    default void mo177915s() {
    }

    /* JADX INFO: renamed from: k */
    default void mo149548k(View.OnClickListener onClickListener) {
    }

    /* JADX INFO: renamed from: m */
    default void mo149550m(User user) {
    }
}

package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public interface sxj0 {
    @NonNull
    /* JADX INFO: renamed from: a */
    View mo103678a();

    /* JADX INFO: renamed from: b */
    void mo103679b(boolean z);

    /* JADX INFO: renamed from: c */
    void mo103680c();

    @NonNull
    /* JADX INFO: renamed from: d */
    VImage mo103681d();

    /* JADX INFO: renamed from: e */
    void mo103682e(String str, xaj0<String, String, String> xaj0Var);

    @NonNull
    /* JADX INFO: renamed from: g */
    ODiamondTagLabel mo103683g();

    /* JADX INFO: renamed from: h */
    void mo103684h(View.OnClickListener onClickListener);

    /* JADX INFO: renamed from: i */
    void mo103685i(User user);

    View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* JADX INFO: renamed from: j */
    void mo103686j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2);

    /* JADX INFO: renamed from: l */
    void mo103687l(User user);

    /* JADX INFO: renamed from: n */
    void mo103688n(View.OnClickListener onClickListener);

    /* JADX INFO: renamed from: o */
    void mo103689o(int i);

    /* JADX INFO: renamed from: p */
    void mo103690p(User user);

    /* JADX INFO: renamed from: q */
    void mo103691q(User user);

    /* JADX INFO: renamed from: r */
    default boolean mo115099r() {
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    VText mo103693t();

    /* JADX INFO: renamed from: u */
    void mo103694u();

    @NonNull
    /* JADX INFO: renamed from: v */
    VImage mo103695v();

    /* JADX INFO: renamed from: f */
    default void mo115096f() {
    }

    /* JADX INFO: renamed from: k */
    default void mo115097k(View.OnClickListener onClickListener) {
    }

    /* JADX INFO: renamed from: m */
    default void mo115098m(User user) {
    }

    /* JADX INFO: renamed from: s */
    default void mo103692s() {
    }
}

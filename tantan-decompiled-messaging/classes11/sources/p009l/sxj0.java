package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p1.mobile.putong.data.User;
import l.xaj0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface sxj0 {
    @NonNull
    /* JADX INFO: renamed from: a */
    View mo12204a();

    /* JADX INFO: renamed from: b */
    void mo12205b(boolean z);

    /* JADX INFO: renamed from: c */
    void mo12206c();

    @NonNull
    /* JADX INFO: renamed from: d */
    VImage mo12207d();

    /* JADX INFO: renamed from: e */
    void mo12208e(String str, xaj0<String, String, String> xaj0Var);

    @NonNull
    /* JADX INFO: renamed from: g */
    ODiamondTagLabel mo12209g();

    /* JADX INFO: renamed from: h */
    void mo12210h(View.OnClickListener onClickListener);

    /* JADX INFO: renamed from: i */
    void mo12211i(User user);

    View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* JADX INFO: renamed from: j */
    void mo12212j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2);

    /* JADX INFO: renamed from: l */
    void mo12213l(User user);

    /* JADX INFO: renamed from: n */
    void mo12214n(View.OnClickListener onClickListener);

    /* JADX INFO: renamed from: o */
    void mo12215o(int i);

    /* JADX INFO: renamed from: p */
    void mo12216p(User user);

    /* JADX INFO: renamed from: q */
    void mo12217q(User user);

    /* JADX INFO: renamed from: r */
    default boolean mo13777r() {
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    VText mo12219t();

    /* JADX INFO: renamed from: u */
    void mo12220u();

    @NonNull
    /* JADX INFO: renamed from: v */
    VImage mo12221v();

    /* JADX INFO: renamed from: f */
    default void mo13774f() {
    }

    /* JADX INFO: renamed from: k */
    default void mo13775k(View.OnClickListener onClickListener) {
    }

    /* JADX INFO: renamed from: m */
    default void mo13776m(User user) {
    }

    /* JADX INFO: renamed from: s */
    default void mo12218s() {
    }
}

package p009l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.PushMessageCustom;
import java.util.HashMap;
import l.d30;
import l.roj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface bkn0 {

    /* JADX INFO: renamed from: l.bkn0$a */
    public static class C0787a {

        /* JADX INFO: renamed from: a */
        public final int f10163a;

        /* JADX INFO: renamed from: b */
        public Object f10164b;

        /* JADX INFO: renamed from: c */
        public String f10165c;

        public C0787a(Object obj, int i) {
            this.f10164b = obj;
            this.f10163a = i;
            this.f10165c = obj.getClass().getName();
        }
    }

    /* JADX INFO: renamed from: a */
    HashMap<String, String> m12082a();

    /* JADX INFO: renamed from: b */
    void m12083b();

    /* JADX INFO: renamed from: c */
    boolean m12084c();

    /* JADX INFO: renamed from: d */
    Intent m12085d(Context context);

    /* JADX INFO: renamed from: e */
    void m12086e(Context context, String str, String str2, @Nullable String str3);

    /* JADX INFO: renamed from: f */
    c<roj0> m12087f();

    /* JADX INFO: renamed from: g */
    void m12088g(View view, PushMessageCustom pushMessageCustom, d30 d30Var);

    /* JADX INFO: renamed from: h */
    void m12089h(Act act, ViewGroup viewGroup, String str, String str2);

    /* JADX INFO: renamed from: i */
    void m12090i(Act act, String str);

    /* JADX INFO: renamed from: j */
    void m12091j(Act act);

    /* JADX INFO: renamed from: k */
    l2s m12092k();

    /* JADX INFO: renamed from: l */
    String m12093l(int i);

    /* JADX INFO: renamed from: m */
    c<roj0> m12094m();

    /* JADX INFO: renamed from: n */
    void m12095n(Context context);

    /* JADX INFO: renamed from: o */
    void m12096o(Act act);

    /* JADX INFO: renamed from: p */
    void m12097p(Context context, String str, String str2, String str3, @Nullable String str4);

    /* JADX INFO: renamed from: q */
    boolean m12098q();

    /* JADX INFO: renamed from: r */
    void m12099r(Context context, String str);

    /* JADX INFO: renamed from: s */
    View m12100s(Act act);

    /* JADX INFO: renamed from: t */
    c<l2s> m12101t();

    /* JADX INFO: renamed from: u */
    void m12102u(Act act, Bundle bundle);
}

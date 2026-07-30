package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import java.util.HashMap;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public interface bkn0 {

    /* JADX INFO: renamed from: l.bkn0$a */
    public static class C15894a {

        /* JADX INFO: renamed from: a */
        public final int f76060a;

        /* JADX INFO: renamed from: b */
        public Object f76061b;

        /* JADX INFO: renamed from: c */
        public String f76062c;

        public C15894a(Object obj, int i) {
            this.f76061b = obj;
            this.f76060a = i;
            this.f76062c = obj.getClass().getName();
        }
    }

    /* JADX INFO: renamed from: a */
    HashMap<String, String> mo102416a();

    /* JADX INFO: renamed from: b */
    void mo102417b();

    /* JADX INFO: renamed from: c */
    boolean mo102418c();

    /* JADX INFO: renamed from: d */
    Intent mo102419d(Context context);

    /* JADX INFO: renamed from: e */
    void mo102420e(Context context, String str, String str2, @Nullable String str3);

    /* JADX INFO: renamed from: f */
    C22306c<roj0> mo102421f();

    /* JADX INFO: renamed from: g */
    void mo102422g(View view, PushMessageCustom pushMessageCustom, d30 d30Var);

    /* JADX INFO: renamed from: h */
    void mo102423h(Act act, ViewGroup viewGroup, String str, String str2);

    /* JADX INFO: renamed from: i */
    void mo102424i(Act act, String str);

    /* JADX INFO: renamed from: j */
    void mo102425j(Act act);

    /* JADX INFO: renamed from: k */
    l2s mo102426k();

    /* JADX INFO: renamed from: l */
    String mo102427l(int i);

    /* JADX INFO: renamed from: m */
    C22306c<roj0> mo102428m();

    /* JADX INFO: renamed from: n */
    void mo102429n(Context context);

    /* JADX INFO: renamed from: o */
    void mo102430o(Act act);

    /* JADX INFO: renamed from: p */
    void mo102431p(Context context, String str, String str2, String str3, @Nullable String str4);

    /* JADX INFO: renamed from: q */
    boolean mo102432q();

    /* JADX INFO: renamed from: r */
    void mo102433r(Context context, String str);

    /* JADX INFO: renamed from: s */
    View mo102434s(Act act);

    /* JADX INFO: renamed from: t */
    C22306c<l2s> mo102435t();

    /* JADX INFO: renamed from: u */
    void mo102436u(Act act, Bundle bundle);
}

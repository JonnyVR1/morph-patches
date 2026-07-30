package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import java.util.HashMap;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public interface ftn0 {

    /* JADX INFO: renamed from: l.ftn0$a */
    public static class C17070a {

        /* JADX INFO: renamed from: a */
        public final int f100763a;

        /* JADX INFO: renamed from: b */
        public Object f100764b;

        /* JADX INFO: renamed from: c */
        public String f100765c;

        public C17070a(Object obj, int i) {
            this.f100764b = obj;
            this.f100763a = i;
            this.f100765c = obj.getClass().getName();
        }
    }

    /* JADX INFO: renamed from: a */
    HashMap<String, String> mo127330a();

    /* JADX INFO: renamed from: b */
    void mo127331b();

    /* JADX INFO: renamed from: c */
    boolean mo127332c();

    /* JADX INFO: renamed from: d */
    Intent mo127333d(Context context);

    /* JADX INFO: renamed from: e */
    void mo127334e(Context context, String str, String str2, @Nullable String str3);

    /* JADX INFO: renamed from: f */
    C22421c<uxj0> mo127335f();

    /* JADX INFO: renamed from: g */
    void mo127336g(View view, PushMessageCustom pushMessageCustom, x20 x20Var);

    /* JADX INFO: renamed from: h */
    void mo127337h(Act act, ViewGroup viewGroup, String str, String str2);

    /* JADX INFO: renamed from: i */
    void mo127338i(Act act, String str);

    /* JADX INFO: renamed from: j */
    void mo127339j(Act act);

    /* JADX INFO: renamed from: k */
    m4s mo127340k();

    /* JADX INFO: renamed from: l */
    String mo127341l(int i);

    /* JADX INFO: renamed from: m */
    C22421c<uxj0> mo127342m();

    /* JADX INFO: renamed from: n */
    void mo127343n(Context context);

    /* JADX INFO: renamed from: o */
    void mo127344o(Act act);

    /* JADX INFO: renamed from: p */
    void mo127345p(Context context, String str, String str2, String str3, @Nullable String str4);

    /* JADX INFO: renamed from: q */
    boolean mo127346q();

    /* JADX INFO: renamed from: r */
    void mo127347r(Context context, String str);

    /* JADX INFO: renamed from: s */
    View mo127348s(Act act);

    /* JADX INFO: renamed from: t */
    C22421c<m4s> mo127349t();

    /* JADX INFO: renamed from: u */
    void mo127350u(Act act, Bundle bundle);
}

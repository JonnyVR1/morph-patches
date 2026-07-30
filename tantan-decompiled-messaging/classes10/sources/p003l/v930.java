package p003l;

import android.os.Bundle;
import com.p1.mobile.putong.newui.main.base.TabName;
import l.j760;
import l.t100;
import l.w9j;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class v930 {

    /* JADX INFO: renamed from: a */
    public static a<j760<TabName, Boolean>> f7941a = a.b();

    /* JADX INFO: renamed from: b */
    public static a<TabName> f7942b = a.b();

    /* JADX INFO: renamed from: c */
    public static a<j760<TabName, Bundle>> f7943c = a.b();

    /* JADX INFO: renamed from: d */
    public static a<String> f7944d = a.b();

    /* JADX INFO: renamed from: e */
    public static a<j760<TabName, Boolean>> f7945e = a.b();

    /* JADX INFO: renamed from: f */
    public static int f7946f = t100.d(66.0f);

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Bundle m10187c(j760 j760Var) {
        return (Bundle) j760Var.b;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m10190f(j760 j760Var) {
        return (Boolean) j760Var.b;
    }

    /* JADX INFO: renamed from: g */
    public static c<Bundle> m10191g(final TabName tabName) {
        return f7943c.filter(new w9j() { // from class: l.p930
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj) != null);
            }
        }).filter(new w9j() { // from class: l.q930
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj).a == tabName);
            }
        }).map(new w9j() { // from class: l.r930
            public final Object call(Object obj) {
                return v930.m10187c((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static TabName m10192h() {
        return (TabName) f7942b.e();
    }

    /* JADX INFO: renamed from: i */
    public static c<j760<TabName, Boolean>> m10193i() {
        return f7945e.asObservable();
    }

    /* JADX INFO: renamed from: j */
    public static c<Boolean> m10194j(final TabName tabName) {
        return f7941a.filter(new w9j() { // from class: l.s930
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj) != null);
            }
        }).filter(new w9j() { // from class: l.t930
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj).a == tabName);
            }
        }).map(new w9j() { // from class: l.u930
            public final Object call(Object obj) {
                return v930.m10190f((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static c<TabName> m10195k() {
        return f7942b;
    }

    /* JADX INFO: renamed from: l */
    public static void m10196l(TabName tabName, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        f7943c.onNext(new j760(tabName, bundle));
        f7943c.onNext((Object) null);
    }

    /* JADX INFO: renamed from: m */
    public static void m10197m(TabName tabName, boolean z) {
        f7941a.onNext(new j760(tabName, Boolean.valueOf(z)));
        f7941a.onNext((Object) null);
    }

    /* JADX INFO: renamed from: n */
    public static void m10198n(TabName tabName) {
        f7942b.onNext(tabName);
    }

    /* JADX INFO: renamed from: o */
    public static void m10199o(TabName tabName, boolean z) {
        f7945e.onNext(new j760(tabName, Boolean.valueOf(z)));
    }
}

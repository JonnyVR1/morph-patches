package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes10.dex */
public class v930 {

    /* JADX INFO: renamed from: a */
    public static C22392a<j760<TabName, Boolean>> f180602a = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    public static C22392a<TabName> f180603b = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public static C22392a<j760<TabName, Bundle>> f180604c = C22392a.m221512b();

    /* JADX INFO: renamed from: d */
    public static C22392a<String> f180605d = C22392a.m221512b();

    /* JADX INFO: renamed from: e */
    public static C22392a<j760<TabName, Boolean>> f180606e = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public static int f180607f = t100.m186890d(66.0f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Bundle m197529c(j760 j760Var) {
        return (Bundle) j760Var.f116565b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m197532f(j760 j760Var) {
        return (Boolean) j760Var.f116565b;
    }

    /* JADX INFO: renamed from: g */
    public static C22306c<Bundle> m197533g(final TabName tabName) {
        return f180604c.filter(new w9j() { // from class: l.p930
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj) != null);
            }
        }).filter(new w9j() { // from class: l.q930
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj).f116564a == tabName);
            }
        }).map(new w9j() { // from class: l.r930
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return v930.m197529c((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static TabName m197534h() {
        return f180603b.m221515e();
    }

    /* JADX INFO: renamed from: i */
    public static C22306c<j760<TabName, Boolean>> m197535i() {
        return f180606e.asObservable();
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<Boolean> m197536j(final TabName tabName) {
        return f180602a.filter(new w9j() { // from class: l.s930
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj) != null);
            }
        }).filter(new w9j() { // from class: l.t930
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((j760) obj).f116564a == tabName);
            }
        }).map(new w9j() { // from class: l.u930
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return v930.m197532f((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static C22306c<TabName> m197537k() {
        return f180603b;
    }

    /* JADX INFO: renamed from: l */
    public static void m197538l(TabName tabName, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        f180604c.onNext(new j760<>(tabName, bundle));
        f180604c.onNext(null);
    }

    /* JADX INFO: renamed from: m */
    public static void m197539m(TabName tabName, boolean z) {
        f180602a.onNext(new j760<>(tabName, Boolean.valueOf(z)));
        f180602a.onNext(null);
    }

    /* JADX INFO: renamed from: n */
    public static void m197540n(TabName tabName) {
        f180603b.onNext(tabName);
    }

    /* JADX INFO: renamed from: o */
    public static void m197541o(TabName tabName, boolean z) {
        f180606e.onNext(new j760<>(tabName, Boolean.valueOf(z)));
    }
}

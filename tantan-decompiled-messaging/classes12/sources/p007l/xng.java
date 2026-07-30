package p007l;

import android.app.Activity;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xng extends vzh implements yng {

    /* JADX INFO: renamed from: a */
    public eng f15050a;

    /* JADX INFO: renamed from: b */
    public v3h f15051b;

    public xng(Activity activity, Moment moment) {
        m16797c(activity);
        m16798d(activity, moment);
        m16800f();
    }

    @Override // p007l.yng
    /* JADX INFO: renamed from: a */
    public void mo7451a(Exception exc) {
        if (NullChecker.a(this.f15051b)) {
            this.f15051b.mo7451a(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m16796b() {
        if (NullChecker.a(this.f15050a)) {
            App.e.unregisterActivityLifecycleCallbacks(this.f15050a);
        }
        if (NullChecker.a(this.f15051b)) {
            App.e.unregisterActivityLifecycleCallbacks(this.f15051b);
            this.f15051b.m15293k();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m16797c(Activity activity) {
        this.f15050a = new eng(activity);
    }

    /* JADX INFO: renamed from: d */
    public final void m16798d(Activity activity, Moment moment) {
        if (NullChecker.a(activity) && NullChecker.a(moment)) {
            this.f15051b = new v3h(activity, moment);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m16799e(Moment moment) {
        if (NullChecker.a(this.f15051b)) {
            this.f15051b.m15301s(moment);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m16800f() {
        if (NullChecker.a(this.f15050a)) {
            App.e.registerActivityLifecycleCallbacks(this.f15050a);
        }
        if (NullChecker.a(this.f15051b)) {
            App.e.registerActivityLifecycleCallbacks(this.f15051b);
        }
    }

    @Override // p007l.yng
    /* JADX INFO: renamed from: h */
    public void mo7504h() {
        if (NullChecker.a(this.f15051b)) {
            this.f15051b.mo7504h();
        }
    }

    @Override // p007l.yng
    /* JADX INFO: renamed from: i */
    public void mo7452i(boolean z) {
        if (NullChecker.a(this.f15051b)) {
            this.f15051b.mo7452i(z);
        }
    }

    @Override // p007l.yng
    /* JADX INFO: renamed from: j */
    public void mo7453j(float f) {
        if (NullChecker.a(this.f15051b)) {
            this.f15051b.mo7453j(f);
        }
    }

    @Override // p007l.yng
    public void onComplete() {
        if (NullChecker.a(this.f15051b)) {
            this.f15051b.onComplete();
        }
    }

    @Override // p007l.yng
    public void onPause() {
        if (NullChecker.a(this.f15051b)) {
            this.f15051b.onPause();
        }
    }

    @Override // p007l.yng
    public void onResume() {
        if (NullChecker.a(this.f15051b)) {
            this.f15051b.onResume();
        }
    }

    @Override // p007l.yng
    public void onStart() {
        if (NullChecker.a(this.f15051b)) {
            this.f15051b.onStart();
        }
    }
}

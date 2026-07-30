package p153l;

import android.app.Activity;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class mpg extends k1i implements npg {

    /* JADX INFO: renamed from: a */
    public tog f137918a;

    /* JADX INFO: renamed from: b */
    public k5h f137919b;

    public mpg(Activity activity, Moment moment) {
        m159364c(activity);
        m159365d(activity, moment);
        m159367f();
    }

    @Override // p153l.npg
    /* JADX INFO: renamed from: a */
    public void mo67474a(Exception exc) {
        if (NullChecker.m82486a(this.f137919b)) {
            this.f137919b.mo67474a(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m159363b() {
        if (NullChecker.m82486a(this.f137918a)) {
            App.f16088e.unregisterActivityLifecycleCallbacks(this.f137918a);
        }
        if (NullChecker.m82486a(this.f137919b)) {
            App.f16088e.unregisterActivityLifecycleCallbacks(this.f137919b);
            this.f137919b.m148386k();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m159364c(Activity activity) {
        this.f137918a = new tog(activity);
    }

    /* JADX INFO: renamed from: d */
    public final void m159365d(Activity activity, Moment moment) {
        if (NullChecker.m82486a(activity) && NullChecker.m82486a(moment)) {
            this.f137919b = new k5h(activity, moment);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m159366e(Moment moment) {
        if (NullChecker.m82486a(this.f137919b)) {
            this.f137919b.m148394s(moment);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m159367f() {
        if (NullChecker.m82486a(this.f137918a)) {
            App.f16088e.registerActivityLifecycleCallbacks(this.f137918a);
        }
        if (NullChecker.m82486a(this.f137919b)) {
            App.f16088e.registerActivityLifecycleCallbacks(this.f137919b);
        }
    }

    @Override // p153l.npg
    /* JADX INFO: renamed from: h */
    public void mo67522h() {
        if (NullChecker.m82486a(this.f137919b)) {
            this.f137919b.mo67522h();
        }
    }

    @Override // p153l.npg
    /* JADX INFO: renamed from: i */
    public void mo67475i(boolean z) {
        if (NullChecker.m82486a(this.f137919b)) {
            this.f137919b.mo67475i(z);
        }
    }

    @Override // p153l.npg
    /* JADX INFO: renamed from: j */
    public void mo67476j(float f) {
        if (NullChecker.m82486a(this.f137919b)) {
            this.f137919b.mo67476j(f);
        }
    }

    @Override // p153l.npg
    public void onComplete() {
        if (NullChecker.m82486a(this.f137919b)) {
            this.f137919b.onComplete();
        }
    }

    @Override // p153l.npg
    public void onPause() {
        if (NullChecker.m82486a(this.f137919b)) {
            this.f137919b.onPause();
        }
    }

    @Override // p153l.npg
    public void onResume() {
        if (NullChecker.m82486a(this.f137919b)) {
            this.f137919b.onResume();
        }
    }

    @Override // p153l.npg
    public void onStart() {
        if (NullChecker.m82486a(this.f137919b)) {
            this.f137919b.onStart();
        }
    }
}

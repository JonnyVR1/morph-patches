package p149l;

import android.app.Activity;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class xng extends vzh implements yng {

    /* JADX INFO: renamed from: a */
    public eng f193681a;

    /* JADX INFO: renamed from: b */
    public v3h f193682b;

    public xng(Activity activity, Moment moment) {
        m210159c(activity);
        m210160d(activity, moment);
        m210162f();
    }

    @Override // p149l.yng
    /* JADX INFO: renamed from: a */
    public void mo66291a(Exception exc) {
        if (NullChecker.m81303a(this.f193682b)) {
            this.f193682b.mo66291a(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m210158b() {
        if (NullChecker.m81303a(this.f193681a)) {
            App.f15369e.unregisterActivityLifecycleCallbacks(this.f193681a);
        }
        if (NullChecker.m81303a(this.f193682b)) {
            App.f15369e.unregisterActivityLifecycleCallbacks(this.f193682b);
            this.f193682b.m196858k();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m210159c(Activity activity) {
        this.f193681a = new eng(activity);
    }

    /* JADX INFO: renamed from: d */
    public final void m210160d(Activity activity, Moment moment) {
        if (NullChecker.m81303a(activity) && NullChecker.m81303a(moment)) {
            this.f193682b = new v3h(activity, moment);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m210161e(Moment moment) {
        if (NullChecker.m81303a(this.f193682b)) {
            this.f193682b.m196866s(moment);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m210162f() {
        if (NullChecker.m81303a(this.f193681a)) {
            App.f15369e.registerActivityLifecycleCallbacks(this.f193681a);
        }
        if (NullChecker.m81303a(this.f193682b)) {
            App.f15369e.registerActivityLifecycleCallbacks(this.f193682b);
        }
    }

    @Override // p149l.yng
    /* JADX INFO: renamed from: h */
    public void mo66339h() {
        if (NullChecker.m81303a(this.f193682b)) {
            this.f193682b.mo66339h();
        }
    }

    @Override // p149l.yng
    /* JADX INFO: renamed from: i */
    public void mo66292i(boolean z) {
        if (NullChecker.m81303a(this.f193682b)) {
            this.f193682b.mo66292i(z);
        }
    }

    @Override // p149l.yng
    /* JADX INFO: renamed from: j */
    public void mo66293j(float f) {
        if (NullChecker.m81303a(this.f193682b)) {
            this.f193682b.mo66293j(f);
        }
    }

    @Override // p149l.yng
    public void onComplete() {
        if (NullChecker.m81303a(this.f193682b)) {
            this.f193682b.onComplete();
        }
    }

    @Override // p149l.yng
    public void onPause() {
        if (NullChecker.m81303a(this.f193682b)) {
            this.f193682b.onPause();
        }
    }

    @Override // p149l.yng
    public void onResume() {
        if (NullChecker.m81303a(this.f193682b)) {
            this.f193682b.onResume();
        }
    }

    @Override // p149l.yng
    public void onStart() {
        if (NullChecker.m81303a(this.f193682b)) {
            this.f193682b.onStart();
        }
    }
}

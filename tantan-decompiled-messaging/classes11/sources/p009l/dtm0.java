package p009l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.message.R;
import l.c4g0;
import l.e30;
import l.lsi0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class dtm0 {

    /* JADX INFO: renamed from: a */
    public final qsm0 f11988a;

    /* JADX INFO: renamed from: b */
    public final tqm0 f11989b;

    /* JADX INFO: renamed from: c */
    public final a<Integer> f11990c = a.c(0);

    /* JADX INFO: renamed from: d */
    public c4g0 f11991d;

    /* JADX INFO: renamed from: e */
    public final Application.ActivityLifecycleCallbacks f11992e;

    public dtm0(tqm0 tqm0Var, qsm0 qsm0Var) {
        C0856a c0856a = new C0856a();
        this.f11992e = c0856a;
        this.f11989b = tqm0Var;
        this.f11988a = qsm0Var;
        App.e.registerActivityLifecycleCallbacks(c0856a);
    }

    /* JADX INFO: renamed from: a */
    public int m13476a() {
        return ((Integer) this.f11990c.e()).intValue();
    }

    /* JADX INFO: renamed from: b */
    public void m13477b(int i) {
        if (i == 2) {
            lsi0.w(R.string.d7);
            return;
        }
        if (i == 4) {
            String strM21250k = this.f11988a.m21250k();
            if (TextUtils.equals(strM21250k, "busy")) {
                if (this.f11988a.m21254o()) {
                    lsi0.w(R.string.c7);
                }
            } else if (TextUtils.equals(strM21250k, "rejected")) {
                if (this.f11988a.m21254o()) {
                    lsi0.w(R.string.k7);
                }
            } else if (TextUtils.equals(strM21250k, "canceled")) {
                if (this.f11988a.m21254o()) {
                    return;
                }
                lsi0.w(R.string.P6);
            } else {
                if (!TextUtils.equals(strM21250k, "finished") || this.f11988a.m21245f().f22277s) {
                    return;
                }
                lsi0.w(R.string.h7);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo12238c(int i);

    /* JADX INFO: renamed from: d */
    public void m13478d(qsm0 qsm0Var) {
        this.f11991d = qsm0Var.m21259t("VoiceCallViewInterface", new e30() { // from class: l.ctm0
            public final void call(Object obj) {
                this.f10764a.mo12238c(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo12239e(Activity activity);

    /* JADX INFO: renamed from: f */
    public abstract void mo12240f(@Nullable Context context);

    /* JADX INFO: renamed from: g */
    public abstract void mo12241g(Context context);

    /* JADX INFO: renamed from: h */
    public void m13479h(@Nullable Context context, int i) {
        if (((Integer) this.f11990c.e()).intValue() != i) {
            this.f11990c.onNext(Integer.valueOf(i));
            mo12240f(context);
        }
    }

    /* JADX INFO: renamed from: i */
    public c<Integer> m13480i() {
        return this.f11990c;
    }

    /* JADX INFO: renamed from: l.dtm0$a */
    public class C0856a implements Application.ActivityLifecycleCallbacks {
        public C0856a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            dtm0.this.mo12239e(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}

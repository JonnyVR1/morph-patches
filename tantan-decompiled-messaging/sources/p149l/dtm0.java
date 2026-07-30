package p149l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class dtm0 {

    /* JADX INFO: renamed from: a */
    public final qsm0 f87855a;

    /* JADX INFO: renamed from: b */
    public final tqm0 f87856b;

    /* JADX INFO: renamed from: c */
    public final C22392a<Integer> f87857c = C22392a.m221513c(0);

    /* JADX INFO: renamed from: d */
    public c4g0 f87858d;

    /* JADX INFO: renamed from: e */
    public final Application.ActivityLifecycleCallbacks f87859e;

    public dtm0(tqm0 tqm0Var, qsm0 qsm0Var) {
        C16469a c16469a = new C16469a();
        this.f87859e = c16469a;
        this.f87856b = tqm0Var;
        this.f87855a = qsm0Var;
        App.f15369e.registerActivityLifecycleCallbacks(c16469a);
    }

    /* JADX INFO: renamed from: a */
    public int m113575a() {
        return this.f87857c.m221515e().intValue();
    }

    /* JADX INFO: renamed from: b */
    public void m113576b(int i) {
        if (i == 2) {
            lsi0.m151593w(R$string.f20951d7);
            return;
        }
        if (i == 4) {
            String strM176317k = this.f87855a.m176317k();
            if (TextUtils.equals(strM176317k, VoiceCallStatus.busy)) {
                if (this.f87855a.m176321o()) {
                    lsi0.m151593w(R$string.f20942c7);
                }
            } else if (TextUtils.equals(strM176317k, "rejected")) {
                if (this.f87855a.m176321o()) {
                    lsi0.m151593w(R$string.f21014k7);
                }
            } else if (TextUtils.equals(strM176317k, "canceled")) {
                if (this.f87855a.m176321o()) {
                    return;
                }
                lsi0.m151593w(R$string.f20835P6);
            } else {
                if (!TextUtils.equals(strM176317k, "finished") || this.f87855a.m176312f().f187562s) {
                    return;
                }
                lsi0.m151593w(R$string.f20987h7);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo103873c(int i);

    /* JADX INFO: renamed from: d */
    public void m113577d(qsm0 qsm0Var) {
        this.f87858d = qsm0Var.m176326t("VoiceCallViewInterface", new e30() { // from class: l.ctm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82489a.mo103873c(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo103874e(Activity activity);

    /* JADX INFO: renamed from: f */
    public abstract void mo103875f(@Nullable Context context);

    /* JADX INFO: renamed from: g */
    public abstract void mo103876g(Context context);

    /* JADX INFO: renamed from: h */
    public void m113578h(@Nullable Context context, int i) {
        if (this.f87857c.m221515e().intValue() != i) {
            this.f87857c.onNext(Integer.valueOf(i));
            mo103875f(context);
        }
    }

    /* JADX INFO: renamed from: i */
    public C22306c<Integer> m113579i() {
        return this.f87857c;
    }

    /* JADX INFO: renamed from: l.dtm0$a */
    public class C16469a implements Application.ActivityLifecycleCallbacks {
        public C16469a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            dtm0.this.mo103874e(activity);
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

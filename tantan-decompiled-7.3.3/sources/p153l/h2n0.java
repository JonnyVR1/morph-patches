package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h2n0 {

    /* JADX INFO: renamed from: a */
    public final u1n0 f107568a;

    /* JADX INFO: renamed from: b */
    public final xzm0 f107569b;

    /* JADX INFO: renamed from: c */
    public final C22507a<Integer> f107570c = C22507a.m222759c(0);

    /* JADX INFO: renamed from: d */
    public kcg0 f107571d;

    /* JADX INFO: renamed from: e */
    public final Application.ActivityLifecycleCallbacks f107572e;

    public h2n0(xzm0 xzm0Var, u1n0 u1n0Var) {
        C17374a c17374a = new C17374a();
        this.f107572e = c17374a;
        this.f107569b = xzm0Var;
        this.f107568a = u1n0Var;
        App.f16088e.registerActivityLifecycleCallbacks(c17374a);
    }

    /* JADX INFO: renamed from: a */
    public int m133395a() {
        return this.f107570c.m222761e().intValue();
    }

    /* JADX INFO: renamed from: b */
    public void m133396b(int i) {
        if (i == 2) {
            o1j0.m165649w(R$string.f21693d7);
            return;
        }
        if (i == 4) {
            String strM194035k = this.f107568a.m194035k();
            if (TextUtils.equals(strM194035k, VoiceCallStatus.busy)) {
                if (this.f107568a.m194039o()) {
                    o1j0.m165649w(R$string.f21684c7);
                }
            } else if (TextUtils.equals(strM194035k, "rejected")) {
                if (this.f107568a.m194039o()) {
                    o1j0.m165649w(R$string.f21756k7);
                }
            } else if (TextUtils.equals(strM194035k, "canceled")) {
                if (this.f107568a.m194039o()) {
                    return;
                }
                o1j0.m165649w(R$string.f21577P6);
            } else {
                if (!TextUtils.equals(strM194035k, "finished") || this.f107568a.m194030f().f74171s) {
                    return;
                }
                o1j0.m165649w(R$string.f21729h7);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo123637c(int i);

    /* JADX INFO: renamed from: d */
    public void m133397d(u1n0 u1n0Var) {
        this.f107571d = u1n0Var.m194044t("VoiceCallViewInterface", new y20() { // from class: l.g2n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101861a.mo123637c(((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo123638e(Activity activity);

    /* JADX INFO: renamed from: f */
    public abstract void mo123639f(@Nullable Context context);

    /* JADX INFO: renamed from: g */
    public abstract void mo123640g(Context context);

    /* JADX INFO: renamed from: h */
    public void m133398h(@Nullable Context context, int i) {
        if (this.f107570c.m222761e().intValue() != i) {
            this.f107570c.onNext(Integer.valueOf(i));
            mo123639f(context);
        }
    }

    /* JADX INFO: renamed from: i */
    public C22421c<Integer> m133399i() {
        return this.f107570c;
    }

    /* JADX INFO: renamed from: l.h2n0$a */
    public class C17374a implements Application.ActivityLifecycleCallbacks {
        public C17374a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            h2n0.this.mo123638e(activity);
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

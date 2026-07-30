package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p149l.fu0;
import p149l.i01;
import p149l.i30;
import p149l.k30;
import p149l.u30;

/* JADX INFO: renamed from: androidx.appcompat.app.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0075b {

    /* JADX INFO: renamed from: a */
    public static int f316a = -100;

    /* JADX INFO: renamed from: b */
    public static final i01<WeakReference<AbstractC0075b>> f317b = new i01<>();

    /* JADX INFO: renamed from: c */
    public static final Object f318c = new Object();

    /* JADX INFO: renamed from: D */
    public static void m359D(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f316a != i) {
            f316a = i;
            m360c();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m360c() {
        synchronized (f318c) {
            try {
                Iterator<WeakReference<AbstractC0075b>> it = f317b.iterator();
                while (it.hasNext()) {
                    AbstractC0075b abstractC0075b = it.next().get();
                    if (abstractC0075b != null) {
                        abstractC0075b.mo295b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static AbstractC0075b m361e(@NonNull Activity activity, @Nullable fu0 fu0Var) {
        return new AppCompatDelegateImpl(activity, fu0Var);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static AbstractC0075b m362f(@NonNull Dialog dialog, @Nullable fu0 fu0Var) {
        return new AppCompatDelegateImpl(dialog, fu0Var);
    }

    /* JADX INFO: renamed from: h */
    public static int m363h() {
        return f316a;
    }

    /* JADX INFO: renamed from: o */
    public static void m364o(@NonNull AbstractC0075b abstractC0075b) {
        synchronized (f318c) {
            m366y(abstractC0075b);
            f317b.add(new WeakReference<>(abstractC0075b));
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m365p(@NonNull AbstractC0075b abstractC0075b) {
        synchronized (f318c) {
            m366y(abstractC0075b);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m366y(@NonNull AbstractC0075b abstractC0075b) {
        synchronized (f318c) {
            try {
                Iterator<WeakReference<AbstractC0075b>> it = f317b.iterator();
                while (it.hasNext()) {
                    AbstractC0075b abstractC0075b2 = it.next().get();
                    if (abstractC0075b2 == abstractC0075b || abstractC0075b2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo257A(@LayoutRes int i);

    /* JADX INFO: renamed from: B */
    public abstract void mo259B(View view);

    /* JADX INFO: renamed from: C */
    public abstract void mo261C(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: E */
    public abstract void mo264E(@Nullable Toolbar toolbar);

    /* JADX INFO: renamed from: F */
    public void mo266F(@StyleRes int i) {
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo268G(@Nullable CharSequence charSequence);

    @Nullable
    /* JADX INFO: renamed from: H */
    public abstract u30 mo270H(@NonNull u30.InterfaceC20342a interfaceC20342a);

    /* JADX INFO: renamed from: a */
    public abstract void mo293a(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo295b();

    /* JADX INFO: renamed from: d */
    public void mo298d(Context context) {
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public abstract <T extends View> T mo302g(@IdRes int i);

    @Nullable
    /* JADX INFO: renamed from: i */
    public abstract k30 mo305i();

    /* JADX INFO: renamed from: j */
    public int mo307j() {
        return -100;
    }

    /* JADX INFO: renamed from: k */
    public abstract MenuInflater mo309k();

    @Nullable
    /* JADX INFO: renamed from: l */
    public abstract i30 mo311l();

    /* JADX INFO: renamed from: m */
    public abstract void mo313m();

    /* JADX INFO: renamed from: n */
    public abstract void mo315n();

    /* JADX INFO: renamed from: q */
    public abstract void mo319q(Configuration configuration);

    /* JADX INFO: renamed from: r */
    public abstract void mo321r(Bundle bundle);

    /* JADX INFO: renamed from: s */
    public abstract void mo323s();

    /* JADX INFO: renamed from: t */
    public abstract void mo325t(Bundle bundle);

    /* JADX INFO: renamed from: u */
    public abstract void mo327u();

    /* JADX INFO: renamed from: v */
    public abstract void mo329v(Bundle bundle);

    /* JADX INFO: renamed from: w */
    public abstract void mo331w();

    /* JADX INFO: renamed from: x */
    public abstract void mo333x();

    /* JADX INFO: renamed from: z */
    public abstract boolean mo336z(int i);
}

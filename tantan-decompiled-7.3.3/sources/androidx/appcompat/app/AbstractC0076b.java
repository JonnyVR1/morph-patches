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
import p153l.c30;
import p153l.e30;
import p153l.lu0;
import p153l.o30;
import p153l.p01;

/* JADX INFO: renamed from: androidx.appcompat.app.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0076b {

    /* JADX INFO: renamed from: a */
    public static int f316a = -100;

    /* JADX INFO: renamed from: b */
    public static final p01<WeakReference<AbstractC0076b>> f317b = new p01<>();

    /* JADX INFO: renamed from: c */
    public static final Object f318c = new Object();

    /* JADX INFO: renamed from: D */
    public static void m360D(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f316a != i) {
            f316a = i;
            m361c();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m361c() {
        synchronized (f318c) {
            try {
                Iterator<WeakReference<AbstractC0076b>> it = f317b.iterator();
                while (it.hasNext()) {
                    AbstractC0076b abstractC0076b = it.next().get();
                    if (abstractC0076b != null) {
                        abstractC0076b.mo296b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static AbstractC0076b m362e(@NonNull Activity activity, @Nullable lu0 lu0Var) {
        return new AppCompatDelegateImpl(activity, lu0Var);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static AbstractC0076b m363f(@NonNull Dialog dialog, @Nullable lu0 lu0Var) {
        return new AppCompatDelegateImpl(dialog, lu0Var);
    }

    /* JADX INFO: renamed from: h */
    public static int m364h() {
        return f316a;
    }

    /* JADX INFO: renamed from: o */
    public static void m365o(@NonNull AbstractC0076b abstractC0076b) {
        synchronized (f318c) {
            m367y(abstractC0076b);
            f317b.add(new WeakReference<>(abstractC0076b));
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m366p(@NonNull AbstractC0076b abstractC0076b) {
        synchronized (f318c) {
            m367y(abstractC0076b);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m367y(@NonNull AbstractC0076b abstractC0076b) {
        synchronized (f318c) {
            try {
                Iterator<WeakReference<AbstractC0076b>> it = f317b.iterator();
                while (it.hasNext()) {
                    AbstractC0076b abstractC0076b2 = it.next().get();
                    if (abstractC0076b2 == abstractC0076b || abstractC0076b2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo258A(@LayoutRes int i);

    /* JADX INFO: renamed from: B */
    public abstract void mo260B(View view);

    /* JADX INFO: renamed from: C */
    public abstract void mo262C(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: E */
    public abstract void mo265E(@Nullable Toolbar toolbar);

    /* JADX INFO: renamed from: F */
    public void mo267F(@StyleRes int i) {
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo269G(@Nullable CharSequence charSequence);

    @Nullable
    /* JADX INFO: renamed from: H */
    public abstract o30 mo271H(@NonNull o30.InterfaceC19018a interfaceC19018a);

    /* JADX INFO: renamed from: a */
    public abstract void mo294a(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo296b();

    /* JADX INFO: renamed from: d */
    public void mo299d(Context context) {
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public abstract <T extends View> T mo303g(@IdRes int i);

    @Nullable
    /* JADX INFO: renamed from: i */
    public abstract e30 mo306i();

    /* JADX INFO: renamed from: j */
    public int mo308j() {
        return -100;
    }

    /* JADX INFO: renamed from: k */
    public abstract MenuInflater mo310k();

    @Nullable
    /* JADX INFO: renamed from: l */
    public abstract c30 mo312l();

    /* JADX INFO: renamed from: m */
    public abstract void mo314m();

    /* JADX INFO: renamed from: n */
    public abstract void mo316n();

    /* JADX INFO: renamed from: q */
    public abstract void mo320q(Configuration configuration);

    /* JADX INFO: renamed from: r */
    public abstract void mo322r(Bundle bundle);

    /* JADX INFO: renamed from: s */
    public abstract void mo324s();

    /* JADX INFO: renamed from: t */
    public abstract void mo326t(Bundle bundle);

    /* JADX INFO: renamed from: u */
    public abstract void mo328u();

    /* JADX INFO: renamed from: v */
    public abstract void mo330v(Bundle bundle);

    /* JADX INFO: renamed from: w */
    public abstract void mo332w();

    /* JADX INFO: renamed from: x */
    public abstract void mo334x();

    /* JADX INFO: renamed from: z */
    public abstract boolean mo337z(int i);
}

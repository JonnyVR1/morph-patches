package p153l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class q0j0 extends ContextWrapper {

    /* JADX INFO: renamed from: c */
    public static final Object f155055c = new Object();

    /* JADX INFO: renamed from: d */
    public static ArrayList<WeakReference<q0j0>> f155056d;

    /* JADX INFO: renamed from: a */
    public final Resources f155057a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f155058b;

    public q0j0(@NonNull Context context) {
        super(context);
        if (!v1l0.m199019b()) {
            this.f155057a = new s0j0(this, context.getResources());
            this.f155058b = null;
            return;
        }
        v1l0 v1l0Var = new v1l0(this, context.getResources());
        this.f155057a = v1l0Var;
        Resources.Theme themeNewTheme = v1l0Var.newTheme();
        this.f155058b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m174713a(@NonNull Context context) {
        if ((context instanceof q0j0) || (context.getResources() instanceof s0j0) || (context.getResources() instanceof v1l0)) {
            return false;
        }
        return v1l0.m199019b();
    }

    /* JADX INFO: renamed from: b */
    public static Context m174714b(@NonNull Context context) {
        if (!m174713a(context)) {
            return context;
        }
        synchronized (f155055c) {
            try {
                ArrayList<WeakReference<q0j0>> arrayList = f155056d;
                if (arrayList == null) {
                    f155056d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<q0j0> weakReference = f155056d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f155056d.remove(size);
                        }
                    }
                    for (int size2 = f155056d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<q0j0> weakReference2 = f155056d.get(size2);
                        q0j0 q0j0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (q0j0Var != null && q0j0Var.getBaseContext() == context) {
                            return q0j0Var;
                        }
                    }
                }
                q0j0 q0j0Var2 = new q0j0(context);
                f155056d.add(new WeakReference<>(q0j0Var2));
                return q0j0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f155057a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f155057a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f155058b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f155058b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}

package p149l;

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
public class nri0 extends ContextWrapper {

    /* JADX INFO: renamed from: c */
    public static final Object f140189c = new Object();

    /* JADX INFO: renamed from: d */
    public static ArrayList<WeakReference<nri0>> f140190d;

    /* JADX INFO: renamed from: a */
    public final Resources f140191a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f140192b;

    public nri0(@NonNull Context context) {
        super(context);
        if (!psk0.m171179b()) {
            this.f140191a = new pri0(this, context.getResources());
            this.f140192b = null;
            return;
        }
        psk0 psk0Var = new psk0(this, context.getResources());
        this.f140191a = psk0Var;
        Resources.Theme themeNewTheme = psk0Var.newTheme();
        this.f140192b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m160740a(@NonNull Context context) {
        if ((context instanceof nri0) || (context.getResources() instanceof pri0) || (context.getResources() instanceof psk0)) {
            return false;
        }
        return psk0.m171179b();
    }

    /* JADX INFO: renamed from: b */
    public static Context m160741b(@NonNull Context context) {
        if (!m160740a(context)) {
            return context;
        }
        synchronized (f140189c) {
            try {
                ArrayList<WeakReference<nri0>> arrayList = f140190d;
                if (arrayList == null) {
                    f140190d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<nri0> weakReference = f140190d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f140190d.remove(size);
                        }
                    }
                    for (int size2 = f140190d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<nri0> weakReference2 = f140190d.get(size2);
                        nri0 nri0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (nri0Var != null && nri0Var.getBaseContext() == context) {
                            return nri0Var;
                        }
                    }
                }
                nri0 nri0Var2 = new nri0(context);
                f140190d.add(new WeakReference<>(nri0Var2));
                return nri0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f140191a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f140191a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f140192b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f140192b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}

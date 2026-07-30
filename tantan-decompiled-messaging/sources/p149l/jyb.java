package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class jyb implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Context f120294a;

    /* JADX INFO: renamed from: l.jyb$a */
    public class C17891a extends gyb {
        public C17891a(jpl jplVar, ComponentName componentName, Context context) {
            super(jplVar, componentName, context);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo114048a(@NonNull ComponentName componentName, @NonNull gyb gybVar);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: b */
    public void m143841b(@NonNull Context context) {
        this.f120294a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        if (this.f120294a != null) {
            mo114048a(componentName, new C17891a(jpl.AbstractBinderC17841a.m142747O(iBinder), componentName, this.f120294a));
        } else {
            qkq0.m175383a("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
    }
}

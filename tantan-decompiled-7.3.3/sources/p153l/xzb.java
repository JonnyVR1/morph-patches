package p153l;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public abstract class xzb implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    @Nullable
    public Context f196843a;

    /* JADX INFO: renamed from: l.xzb$a */
    public class C21483a extends uzb {
        public C21483a(wrl wrlVar, ComponentName componentName, Context context) {
            super(wrlVar, componentName, context);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo159617a(@NonNull ComponentName componentName, @NonNull uzb uzbVar);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: b */
    public void m213705b(@NonNull Context context) {
        this.f196843a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        if (this.f196843a != null) {
            mo159617a(componentName, new C21483a(wrl.AbstractBinderC21172a.m207602O(iBinder), componentName, this.f196843a));
        } else {
            wtq0.m207906a("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
    }
}

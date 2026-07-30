package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 28)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class CoreComponentFactory extends AppComponentFactory {

    /* JADX INFO: renamed from: androidx.core.app.CoreComponentFactory$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC0233a {
        /* JADX INFO: renamed from: a */
        Object m1198a();
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m1197a(T t) {
        T t2;
        return (!(t instanceof InterfaceC0233a) || (t2 = (T) ((InterfaceC0233a) t).m1198a()) == null) ? t : t2;
    }

    @NonNull
    public Activity instantiateActivity(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) m1197a(super.instantiateActivity(classLoader, str, intent));
    }

    @NonNull
    public Application instantiateApplication(@NonNull ClassLoader classLoader, @NonNull String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) m1197a(super.instantiateApplication(classLoader, str));
    }

    @NonNull
    public ContentProvider instantiateProvider(@NonNull ClassLoader classLoader, @NonNull String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) m1197a(super.instantiateProvider(classLoader, str));
    }

    @NonNull
    public BroadcastReceiver instantiateReceiver(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) m1197a(super.instantiateReceiver(classLoader, str, intent));
    }

    @NonNull
    public Service instantiateService(@NonNull ClassLoader classLoader, @NonNull String str, @Nullable Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) m1197a(super.instantiateService(classLoader, str, intent));
    }
}

package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p153l.ker;
import p153l.tll0;
import p153l.utv;

/* JADX INFO: renamed from: androidx.loader.app.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0495a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a */
    public interface a<D> {
        @NonNull
        @MainThread
        /* JADX INFO: renamed from: a */
        utv<D> mo3109a(int i, @Nullable Bundle bundle);

        @MainThread
        /* JADX INFO: renamed from: b */
        void mo3110b(@NonNull utv<D> utvVar, D d);

        @MainThread
        /* JADX INFO: renamed from: c */
        void mo3111c(@NonNull utv<D> utvVar);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <T extends ker & tll0> AbstractC0495a m3108b(@NonNull T t) {
        return new LoaderManagerImpl(t, t.getViewModelStore());
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public abstract void mo3086a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @NonNull
    @MainThread
    /* JADX INFO: renamed from: c */
    public abstract <D> utv<D> mo3087c(int i, @Nullable Bundle bundle, @NonNull a<D> aVar);

    /* JADX INFO: renamed from: d */
    public abstract void mo3088d();

    @NonNull
    @MainThread
    /* JADX INFO: renamed from: e */
    public abstract <D> utv<D> mo3089e(int i, @Nullable Bundle bundle, @NonNull a<D> aVar);
}

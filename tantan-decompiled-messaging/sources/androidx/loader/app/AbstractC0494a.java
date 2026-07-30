package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p149l.jcr;
import p149l.pcl0;
import p149l.trv;

/* JADX INFO: renamed from: androidx.loader.app.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0494a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a */
    public interface a<D> {
        @NonNull
        @MainThread
        /* JADX INFO: renamed from: a */
        trv<D> mo3108a(int i, @Nullable Bundle bundle);

        @MainThread
        /* JADX INFO: renamed from: b */
        void mo3109b(@NonNull trv<D> trvVar, D d);

        @MainThread
        /* JADX INFO: renamed from: c */
        void mo3110c(@NonNull trv<D> trvVar);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <T extends jcr & pcl0> AbstractC0494a m3107b(@NonNull T t) {
        return new LoaderManagerImpl(t, t.getViewModelStore());
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public abstract void mo3085a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @NonNull
    @MainThread
    /* JADX INFO: renamed from: c */
    public abstract <D> trv<D> mo3086c(int i, @Nullable Bundle bundle, @NonNull a<D> aVar);

    /* JADX INFO: renamed from: d */
    public abstract void mo3087d();

    @NonNull
    @MainThread
    /* JADX INFO: renamed from: e */
    public abstract <D> trv<D> mo3088e(int i, @Nullable Bundle bundle, @NonNull a<D> aVar);
}

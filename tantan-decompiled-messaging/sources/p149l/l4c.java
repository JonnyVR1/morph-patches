package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes.dex */
public interface l4c<T> {

    /* JADX INFO: renamed from: l.l4c$a */
    public interface InterfaceC18148a<T> {
        /* JADX INFO: renamed from: b */
        void mo5407b(@Nullable T t);

        /* JADX INFO: renamed from: c */
        void mo5408c(@NonNull Exception exc);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    Class<T> mo103356a();

    void cancel();

    void cleanup();

    /* JADX INFO: renamed from: d */
    void mo99210d(@NonNull Priority priority, @NonNull InterfaceC18148a<? super T> interfaceC18148a);

    @NonNull
    DataSource getDataSource();
}

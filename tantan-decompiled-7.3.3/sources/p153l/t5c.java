package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes.dex */
public interface t5c<T> {

    /* JADX INFO: renamed from: l.t5c$a */
    public interface InterfaceC20239a<T> {
        /* JADX INFO: renamed from: b */
        void mo5432b(@Nullable T t);

        /* JADX INFO: renamed from: c */
        void mo5433c(@NonNull Exception exc);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    Class<T> mo106029a();

    void cancel();

    void cleanup();

    /* JADX INFO: renamed from: d */
    void mo95590d(@NonNull Priority priority, @NonNull InterfaceC20239a<? super T> interfaceC20239a);

    @NonNull
    DataSource getDataSource();
}

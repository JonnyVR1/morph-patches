package p149l;

import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface x4c<T> {

    /* JADX INFO: renamed from: l.x4c$a */
    public interface InterfaceC21025a<T> {
        @NonNull
        /* JADX INFO: renamed from: a */
        Class<T> mo112977a();

        @NonNull
        /* JADX INFO: renamed from: b */
        x4c<T> mo112978b(@NonNull T t);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    T mo112975a() throws IOException;

    void cleanup();
}

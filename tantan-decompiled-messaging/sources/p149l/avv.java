package p149l;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class avv<T> implements l4c<T> {

    /* JADX INFO: renamed from: a */
    private final Uri f71976a;

    /* JADX INFO: renamed from: b */
    private final ContentResolver f71977b;

    /* JADX INFO: renamed from: c */
    private T f71978c;

    public avv(ContentResolver contentResolver, Uri uri) {
        this.f71977b = contentResolver;
        this.f71976a = uri;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo99208b(T t) throws IOException;

    /* JADX INFO: renamed from: c */
    public abstract T mo99209c(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // p149l.l4c
    public void cleanup() {
        T t = this.f71978c;
        if (t != null) {
            try {
                mo99208b(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // p149l.l4c
    /* JADX INFO: renamed from: d */
    public final void mo99210d(@NonNull Priority priority, @NonNull l4c.InterfaceC18148a<? super T> interfaceC18148a) {
        try {
            T tMo99209c = mo99209c(this.f71976a, this.f71977b);
            this.f71978c = tMo99209c;
            interfaceC18148a.mo5407b(tMo99209c);
        } catch (FileNotFoundException e) {
            Log.isLoggable("LocalUriFetcher", 3);
            interfaceC18148a.mo5408c(e);
        }
    }

    @Override // p149l.l4c
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // p149l.l4c
    public void cancel() {
    }
}

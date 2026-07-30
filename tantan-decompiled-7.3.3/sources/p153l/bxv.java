package p153l;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bxv<T> implements t5c<T> {

    /* JADX INFO: renamed from: a */
    private final Uri f78917a;

    /* JADX INFO: renamed from: b */
    private final ContentResolver f78918b;

    /* JADX INFO: renamed from: c */
    private T f78919c;

    public bxv(ContentResolver contentResolver, Uri uri) {
        this.f78918b = contentResolver;
        this.f78917a = uri;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo106912b(T t) throws IOException;

    /* JADX INFO: renamed from: c */
    public abstract T mo106913c(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // p153l.t5c
    public void cleanup() {
        T t = this.f78919c;
        if (t != null) {
            try {
                mo106912b(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // p153l.t5c
    /* JADX INFO: renamed from: d */
    public final void mo95590d(@NonNull Priority priority, @NonNull t5c.InterfaceC20239a<? super T> interfaceC20239a) {
        try {
            T tMo106913c = mo106913c(this.f78917a, this.f78918b);
            this.f78919c = tMo106913c;
            interfaceC20239a.mo5432b(tMo106913c);
        } catch (FileNotFoundException e) {
            Log.isLoggable("LocalUriFetcher", 3);
            interfaceC20239a.mo5433c(e);
        }
    }

    @Override // p153l.t5c
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override // p153l.t5c
    public void cancel() {
    }
}

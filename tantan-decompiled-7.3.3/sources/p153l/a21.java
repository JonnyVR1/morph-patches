package p153l;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a21<T> implements t5c<T> {

    /* JADX INFO: renamed from: a */
    private final String f67914a;

    /* JADX INFO: renamed from: b */
    private final AssetManager f67915b;

    /* JADX INFO: renamed from: c */
    private T f67916c;

    public a21(AssetManager assetManager, String str) {
        this.f67915b = assetManager;
        this.f67914a = str;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo95588b(T t) throws IOException;

    /* JADX INFO: renamed from: c */
    public abstract T mo95589c(AssetManager assetManager, String str) throws IOException;

    @Override // p153l.t5c
    public void cleanup() {
        T t = this.f67916c;
        if (t == null) {
            return;
        }
        try {
            mo95588b(t);
        } catch (IOException unused) {
        }
    }

    @Override // p153l.t5c
    /* JADX INFO: renamed from: d */
    public void mo95590d(@NonNull Priority priority, @NonNull t5c.InterfaceC20239a<? super T> interfaceC20239a) {
        try {
            T tMo95589c = mo95589c(this.f67915b, this.f67914a);
            this.f67916c = tMo95589c;
            interfaceC20239a.mo5432b(tMo95589c);
        } catch (IOException e) {
            Log.isLoggable("AssetPathFetcher", 3);
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

package p149l;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class t11<T> implements l4c<T> {

    /* JADX INFO: renamed from: a */
    private final String f167278a;

    /* JADX INFO: renamed from: b */
    private final AssetManager f167279b;

    /* JADX INFO: renamed from: c */
    private T f167280c;

    public t11(AssetManager assetManager, String str) {
        this.f167279b = assetManager;
        this.f167278a = str;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo104615b(T t) throws IOException;

    /* JADX INFO: renamed from: c */
    public abstract T mo104616c(AssetManager assetManager, String str) throws IOException;

    @Override // p149l.l4c
    public void cleanup() {
        T t = this.f167280c;
        if (t == null) {
            return;
        }
        try {
            mo104615b(t);
        } catch (IOException unused) {
        }
    }

    @Override // p149l.l4c
    /* JADX INFO: renamed from: d */
    public void mo99210d(@NonNull Priority priority, @NonNull l4c.InterfaceC18148a<? super T> interfaceC18148a) {
        try {
            T tMo104616c = mo104616c(this.f167279b, this.f167278a);
            this.f167280c = tMo104616c;
            interfaceC18148a.mo5407b(tMo104616c);
        } catch (IOException e) {
            Log.isLoggable("AssetPathFetcher", 3);
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

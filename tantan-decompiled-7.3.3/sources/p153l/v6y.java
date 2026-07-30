package p153l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class v6y implements re00<Uri, File> {

    /* JADX INFO: renamed from: a */
    private final Context f182704a;

    /* JADX INFO: renamed from: l.v6y$a */
    public static final class C20775a implements se00<Uri, File> {

        /* JADX INFO: renamed from: a */
        private final Context f182705a;

        public C20775a(Context context) {
            this.f182705a = context;
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<Uri, File> mo101570b(qs10 qs10Var) {
            return new v6y(this.f182705a);
        }
    }

    public v6y(Context context) {
        this.f182704a = context;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<File> mo101565a(@NonNull Uri uri, int i, int i2, @NonNull u560 u560Var) {
        return new re00.C19812a<>(new d950(uri), new C20776b(this.f182704a, uri));
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull Uri uri) {
        return x6y.m209564b(uri);
    }

    /* JADX INFO: renamed from: l.v6y$b */
    public static class C20776b implements t5c<File> {

        /* JADX INFO: renamed from: c */
        private static final String[] f182706c = {"_data"};

        /* JADX INFO: renamed from: a */
        private final Context f182707a;

        /* JADX INFO: renamed from: b */
        private final Uri f182708b;

        public C20776b(Context context, Uri uri) {
            this.f182707a = context;
            this.f182708b = uri;
        }

        @Override // p153l.t5c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<File> mo106029a() {
            return File.class;
        }

        @Override // p153l.t5c
        /* JADX INFO: renamed from: d */
        public void mo95590d(@NonNull Priority priority, @NonNull t5c.InterfaceC20239a<? super File> interfaceC20239a) {
            Cursor cursorQuery = this.f182707a.getContentResolver().query(this.f182708b, f182706c, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                interfaceC20239a.mo5432b(new File(string));
                return;
            }
            interfaceC20239a.mo5433c(new FileNotFoundException("Failed to find file path for: " + this.f182708b));
        }

        @Override // p153l.t5c
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // p153l.t5c
        public void cancel() {
        }

        @Override // p153l.t5c
        public void cleanup() {
        }
    }
}

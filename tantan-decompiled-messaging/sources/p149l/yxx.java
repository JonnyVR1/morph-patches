package p149l;

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
public final class yxx implements i600<Uri, File> {

    /* JADX INFO: renamed from: a */
    private final Context f200674a;

    /* JADX INFO: renamed from: l.yxx$a */
    public static final class C21575a implements j600<Uri, File> {

        /* JADX INFO: renamed from: a */
        private final Context f200675a;

        public C21575a(Context context) {
            this.f200675a = context;
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Uri, File> mo103357b(gk10 gk10Var) {
            return new yxx(this.f200675a);
        }
    }

    public yxx(Context context) {
        this.f200674a = context;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<File> mo103352a(@NonNull Uri uri, int i, int i2, @NonNull px50 px50Var) {
        return new i600.C17490a<>(new o050(uri), new C21576b(this.f200674a, uri));
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull Uri uri) {
        return ayx.m99588b(uri);
    }

    /* JADX INFO: renamed from: l.yxx$b */
    public static class C21576b implements l4c<File> {

        /* JADX INFO: renamed from: c */
        private static final String[] f200676c = {"_data"};

        /* JADX INFO: renamed from: a */
        private final Context f200677a;

        /* JADX INFO: renamed from: b */
        private final Uri f200678b;

        public C21576b(Context context, Uri uri) {
            this.f200677a = context;
            this.f200678b = uri;
        }

        @Override // p149l.l4c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<File> mo103356a() {
            return File.class;
        }

        @Override // p149l.l4c
        /* JADX INFO: renamed from: d */
        public void mo99210d(@NonNull Priority priority, @NonNull l4c.InterfaceC18148a<? super File> interfaceC18148a) {
            Cursor cursorQuery = this.f200677a.getContentResolver().query(this.f200678b, f200676c, null, null, null);
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
                interfaceC18148a.mo5407b(new File(string));
                return;
            }
            interfaceC18148a.mo5408c(new FileNotFoundException("Failed to find file path for: " + this.f200678b));
        }

        @Override // p149l.l4c
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // p149l.l4c
        public void cancel() {
        }

        @Override // p149l.l4c
        public void cleanup() {
        }
    }
}

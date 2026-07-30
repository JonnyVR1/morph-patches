package p153l;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class xyi0 implements t5c<InputStream> {

    /* JADX INFO: renamed from: a */
    private final Uri f196746a;

    /* JADX INFO: renamed from: b */
    private final dzi0 f196747b;

    /* JADX INFO: renamed from: c */
    private InputStream f196748c;

    /* JADX INFO: renamed from: l.xyi0$a */
    public static class C21476a implements bzi0 {

        /* JADX INFO: renamed from: b */
        private static final String[] f196749b = {"_data"};

        /* JADX INFO: renamed from: a */
        private final ContentResolver f196750a;

        public C21476a(ContentResolver contentResolver) {
            this.f196750a = contentResolver;
        }

        @Override // p153l.bzi0
        /* JADX INFO: renamed from: a */
        public Cursor mo107162a(Uri uri) {
            return this.f196750a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f196749b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: renamed from: l.xyi0$b */
    public static class C21477b implements bzi0 {

        /* JADX INFO: renamed from: b */
        private static final String[] f196751b = {"_data"};

        /* JADX INFO: renamed from: a */
        private final ContentResolver f196752a;

        public C21477b(ContentResolver contentResolver) {
            this.f196752a = contentResolver;
        }

        @Override // p153l.bzi0
        /* JADX INFO: renamed from: a */
        public Cursor mo107162a(Uri uri) {
            return this.f196752a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f196751b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @VisibleForTesting
    public xyi0(Uri uri, dzi0 dzi0Var) {
        this.f196746a = uri;
        this.f196747b = dzi0Var;
    }

    /* JADX INFO: renamed from: b */
    private static xyi0 m213623b(Context context, Uri uri, bzi0 bzi0Var) {
        return new xyi0(uri, new dzi0(ComponentCallbacks2C1057a.m5319c(context).m5334j().m5306g(), bzi0Var, ComponentCallbacks2C1057a.m5319c(context).m5329e(), context.getContentResolver()));
    }

    /* JADX INFO: renamed from: c */
    public static xyi0 m213624c(Context context, Uri uri) {
        return m213623b(context, uri, new C21476a(context.getContentResolver()));
    }

    /* JADX INFO: renamed from: e */
    public static xyi0 m213625e(Context context, Uri uri) {
        return m213623b(context, uri, new C21477b(context.getContentResolver()));
    }

    /* JADX INFO: renamed from: f */
    private InputStream m213626f() throws Throwable {
        InputStream inputStreamM118745d = this.f196747b.m118745d(this.f196746a);
        int iM118744a = inputStreamM118745d != null ? this.f196747b.m118744a(this.f196746a) : -1;
        return iM118744a != -1 ? new s7f(inputStreamM118745d, iM118744a) : inputStreamM118745d;
    }

    @Override // p153l.t5c
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo106029a() {
        return InputStream.class;
    }

    @Override // p153l.t5c
    public void cleanup() {
        InputStream inputStream = this.f196748c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // p153l.t5c
    /* JADX INFO: renamed from: d */
    public void mo95590d(@NonNull Priority priority, @NonNull t5c.InterfaceC20239a<? super InputStream> interfaceC20239a) throws Throwable {
        try {
            InputStream inputStreamM213626f = m213626f();
            this.f196748c = inputStreamM213626f;
            interfaceC20239a.mo5432b(inputStreamM213626f);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
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

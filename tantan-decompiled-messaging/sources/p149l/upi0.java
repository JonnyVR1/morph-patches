package p149l;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class upi0 implements l4c<InputStream> {

    /* JADX INFO: renamed from: a */
    private final Uri f177626a;

    /* JADX INFO: renamed from: b */
    private final aqi0 f177627b;

    /* JADX INFO: renamed from: c */
    private InputStream f177628c;

    /* JADX INFO: renamed from: l.upi0$a */
    public static class C20479a implements ypi0 {

        /* JADX INFO: renamed from: b */
        private static final String[] f177629b = {"_data"};

        /* JADX INFO: renamed from: a */
        private final ContentResolver f177630a;

        public C20479a(ContentResolver contentResolver) {
            this.f177630a = contentResolver;
        }

        @Override // p149l.ypi0
        /* JADX INFO: renamed from: a */
        public Cursor mo194882a(Uri uri) {
            return this.f177630a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f177629b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: renamed from: l.upi0$b */
    public static class C20480b implements ypi0 {

        /* JADX INFO: renamed from: b */
        private static final String[] f177631b = {"_data"};

        /* JADX INFO: renamed from: a */
        private final ContentResolver f177632a;

        public C20480b(ContentResolver contentResolver) {
            this.f177632a = contentResolver;
        }

        @Override // p149l.ypi0
        /* JADX INFO: renamed from: a */
        public Cursor mo194882a(Uri uri) {
            return this.f177632a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f177631b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @VisibleForTesting
    public upi0(Uri uri, aqi0 aqi0Var) {
        this.f177626a = uri;
        this.f177627b = aqi0Var;
    }

    /* JADX INFO: renamed from: b */
    private static upi0 m194878b(Context context, Uri uri, ypi0 ypi0Var) {
        return new upi0(uri, new aqi0(ComponentCallbacks2C1053a.m5309c(context).m5325j().m5296g(), ypi0Var, ComponentCallbacks2C1053a.m5309c(context).m5320e(), context.getContentResolver()));
    }

    /* JADX INFO: renamed from: c */
    public static upi0 m194879c(Context context, Uri uri) {
        return m194878b(context, uri, new C20479a(context.getContentResolver()));
    }

    /* JADX INFO: renamed from: e */
    public static upi0 m194880e(Context context, Uri uri) {
        return m194878b(context, uri, new C20480b(context.getContentResolver()));
    }

    /* JADX INFO: renamed from: f */
    private InputStream m194881f() throws Throwable {
        InputStream inputStreamM98303d = this.f177627b.m98303d(this.f177626a);
        int iM98302a = inputStreamM98303d != null ? this.f177627b.m98302a(this.f177626a) : -1;
        return iM98302a != -1 ? new m6f(inputStreamM98303d, iM98302a) : inputStreamM98303d;
    }

    @Override // p149l.l4c
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo103356a() {
        return InputStream.class;
    }

    @Override // p149l.l4c
    public void cleanup() {
        InputStream inputStream = this.f177628c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // p149l.l4c
    /* JADX INFO: renamed from: d */
    public void mo99210d(@NonNull Priority priority, @NonNull l4c.InterfaceC18148a<? super InputStream> interfaceC18148a) throws Throwable {
        try {
            InputStream inputStreamM194881f = m194881f();
            this.f177628c = inputStreamM194881f;
            interfaceC18148a.mo5407b(inputStreamM194881f);
        } catch (FileNotFoundException e) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
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

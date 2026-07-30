package p149l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class ymb0<DataT> implements i600<Uri, DataT> {

    /* JADX INFO: renamed from: a */
    private final Context f198977a;

    /* JADX INFO: renamed from: b */
    private final i600<File, DataT> f198978b;

    /* JADX INFO: renamed from: c */
    private final i600<Uri, DataT> f198979c;

    /* JADX INFO: renamed from: d */
    private final Class<DataT> f198980d;

    /* JADX INFO: renamed from: l.ymb0$a */
    public static abstract class AbstractC21436a<DataT> implements j600<Uri, DataT> {

        /* JADX INFO: renamed from: a */
        private final Context f198981a;

        /* JADX INFO: renamed from: b */
        private final Class<DataT> f198982b;

        public AbstractC21436a(Context context, Class<DataT> cls) {
            this.f198981a = context;
            this.f198982b = cls;
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public final i600<Uri, DataT> mo103357b(@NonNull gk10 gk10Var) {
            return new ymb0(this.f198981a, gk10Var.m126584d(File.class, this.f198982b), gk10Var.m126584d(Uri.class, this.f198982b), this.f198982b);
        }
    }

    /* JADX INFO: renamed from: l.ymb0$b */
    @RequiresApi(29)
    public static final class C21437b extends AbstractC21436a<ParcelFileDescriptor> {
        public C21437b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: renamed from: l.ymb0$c */
    @RequiresApi(29)
    public static final class C21438c extends AbstractC21436a<InputStream> {
        public C21438c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: l.ymb0$d */
    public static final class C21439d<DataT> implements l4c<DataT> {

        /* JADX INFO: renamed from: k */
        private static final String[] f198983k = {"_data"};

        /* JADX INFO: renamed from: a */
        private final Context f198984a;

        /* JADX INFO: renamed from: b */
        private final i600<File, DataT> f198985b;

        /* JADX INFO: renamed from: c */
        private final i600<Uri, DataT> f198986c;

        /* JADX INFO: renamed from: d */
        private final Uri f198987d;

        /* JADX INFO: renamed from: e */
        private final int f198988e;

        /* JADX INFO: renamed from: f */
        private final int f198989f;

        /* JADX INFO: renamed from: g */
        private final px50 f198990g;

        /* JADX INFO: renamed from: h */
        private final Class<DataT> f198991h;

        /* JADX INFO: renamed from: i */
        private volatile boolean f198992i;

        /* JADX INFO: renamed from: j */
        @Nullable
        private volatile l4c<DataT> f198993j;

        public C21439d(Context context, i600<File, DataT> i600Var, i600<Uri, DataT> i600Var2, Uri uri, int i, int i2, px50 px50Var, Class<DataT> cls) {
            this.f198984a = context.getApplicationContext();
            this.f198985b = i600Var;
            this.f198986c = i600Var2;
            this.f198987d = uri;
            this.f198988e = i;
            this.f198989f = i2;
            this.f198990g = px50Var;
            this.f198991h = cls;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        private i600.C17490a<DataT> m215346b() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f198985b.mo103352a(m215349f(this.f198987d), this.f198988e, this.f198989f, this.f198990g);
            }
            boolean zM215348e = m215348e();
            Uri requireOriginal = this.f198987d;
            if (zM215348e) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            return this.f198986c.mo103352a(requireOriginal, this.f198988e, this.f198989f, this.f198990g);
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        private l4c<DataT> m215347c() throws FileNotFoundException {
            i600.C17490a<DataT> c17490aM215346b = m215346b();
            if (c17490aM215346b != null) {
                return c17490aM215346b.f111667c;
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        private boolean m215348e() {
            return this.f198984a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        private File m215349f(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f198984a.getContentResolver().query(uri, f198983k, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (TextUtils.isEmpty(string)) {
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                File file = new File(string);
                cursorQuery.close();
                return file;
            } catch (Throwable th) {
                if (0 == 0) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        }

        @Override // p149l.l4c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<DataT> mo103356a() {
            return this.f198991h;
        }

        @Override // p149l.l4c
        public void cancel() {
            this.f198992i = true;
            l4c<DataT> l4cVar = this.f198993j;
            if (l4cVar != null) {
                l4cVar.cancel();
            }
        }

        @Override // p149l.l4c
        public void cleanup() {
            l4c<DataT> l4cVar = this.f198993j;
            if (l4cVar != null) {
                l4cVar.cleanup();
            }
        }

        @Override // p149l.l4c
        /* JADX INFO: renamed from: d */
        public void mo99210d(@NonNull Priority priority, @NonNull l4c.InterfaceC18148a<? super DataT> interfaceC18148a) {
            try {
                l4c<DataT> l4cVarM215347c = m215347c();
                if (l4cVarM215347c == null) {
                    interfaceC18148a.mo5408c(new IllegalArgumentException("Failed to build fetcher for: " + this.f198987d));
                } else {
                    this.f198993j = l4cVarM215347c;
                    if (this.f198992i) {
                        cancel();
                    } else {
                        l4cVarM215347c.mo99210d(priority, interfaceC18148a);
                    }
                }
            } catch (FileNotFoundException e) {
                interfaceC18148a.mo5408c(e);
            }
        }

        @Override // p149l.l4c
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }
    }

    public ymb0(Context context, i600<File, DataT> i600Var, i600<Uri, DataT> i600Var2, Class<DataT> cls) {
        this.f198977a = context.getApplicationContext();
        this.f198978b = i600Var;
        this.f198979c = i600Var2;
        this.f198980d = cls;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<DataT> mo103352a(@NonNull Uri uri, int i, int i2, @NonNull px50 px50Var) {
        return new i600.C17490a<>(new o050(uri), new C21439d(this.f198977a, this.f198978b, this.f198979c, uri, i, i2, px50Var, this.f198980d));
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && ayx.m99588b(uri);
    }
}

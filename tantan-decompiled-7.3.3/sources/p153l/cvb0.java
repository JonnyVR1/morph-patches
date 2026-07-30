package p153l;

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
public final class cvb0<DataT> implements re00<Uri, DataT> {

    /* JADX INFO: renamed from: a */
    private final Context f83964a;

    /* JADX INFO: renamed from: b */
    private final re00<File, DataT> f83965b;

    /* JADX INFO: renamed from: c */
    private final re00<Uri, DataT> f83966c;

    /* JADX INFO: renamed from: d */
    private final Class<DataT> f83967d;

    /* JADX INFO: renamed from: l.cvb0$a */
    public static abstract class AbstractC16371a<DataT> implements se00<Uri, DataT> {

        /* JADX INFO: renamed from: a */
        private final Context f83968a;

        /* JADX INFO: renamed from: b */
        private final Class<DataT> f83969b;

        public AbstractC16371a(Context context, Class<DataT> cls) {
            this.f83968a = context;
            this.f83969b = cls;
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public final re00<Uri, DataT> mo101570b(@NonNull qs10 qs10Var) {
            return new cvb0(this.f83968a, qs10Var.m177716d(File.class, this.f83969b), qs10Var.m177716d(Uri.class, this.f83969b), this.f83969b);
        }
    }

    /* JADX INFO: renamed from: l.cvb0$b */
    @RequiresApi(29)
    public static final class C16372b extends AbstractC16371a<ParcelFileDescriptor> {
        public C16372b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: renamed from: l.cvb0$c */
    @RequiresApi(29)
    public static final class C16373c extends AbstractC16371a<InputStream> {
        public C16373c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: l.cvb0$d */
    public static final class C16374d<DataT> implements t5c<DataT> {

        /* JADX INFO: renamed from: k */
        private static final String[] f83970k = {"_data"};

        /* JADX INFO: renamed from: a */
        private final Context f83971a;

        /* JADX INFO: renamed from: b */
        private final re00<File, DataT> f83972b;

        /* JADX INFO: renamed from: c */
        private final re00<Uri, DataT> f83973c;

        /* JADX INFO: renamed from: d */
        private final Uri f83974d;

        /* JADX INFO: renamed from: e */
        private final int f83975e;

        /* JADX INFO: renamed from: f */
        private final int f83976f;

        /* JADX INFO: renamed from: g */
        private final u560 f83977g;

        /* JADX INFO: renamed from: h */
        private final Class<DataT> f83978h;

        /* JADX INFO: renamed from: i */
        private volatile boolean f83979i;

        /* JADX INFO: renamed from: j */
        @Nullable
        private volatile t5c<DataT> f83980j;

        public C16374d(Context context, re00<File, DataT> re00Var, re00<Uri, DataT> re00Var2, Uri uri, int i, int i2, u560 u560Var, Class<DataT> cls) {
            this.f83971a = context.getApplicationContext();
            this.f83972b = re00Var;
            this.f83973c = re00Var2;
            this.f83974d = uri;
            this.f83975e = i;
            this.f83976f = i2;
            this.f83977g = u560Var;
            this.f83978h = cls;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        private re00.C19812a<DataT> m112790b() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f83972b.mo101565a(m112793f(this.f83974d), this.f83975e, this.f83976f, this.f83977g);
            }
            boolean zM112792e = m112792e();
            Uri requireOriginal = this.f83974d;
            if (zM112792e) {
                requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
            }
            return this.f83973c.mo101565a(requireOriginal, this.f83975e, this.f83976f, this.f83977g);
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        private t5c<DataT> m112791c() throws FileNotFoundException {
            re00.C19812a<DataT> c19812aM112790b = m112790b();
            if (c19812aM112790b != null) {
                return c19812aM112790b.f162371c;
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        private boolean m112792e() {
            return this.f83971a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        private File m112793f(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f83971a.getContentResolver().query(uri, f83970k, null, null, null);
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

        @Override // p153l.t5c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<DataT> mo106029a() {
            return this.f83978h;
        }

        @Override // p153l.t5c
        public void cancel() {
            this.f83979i = true;
            t5c<DataT> t5cVar = this.f83980j;
            if (t5cVar != null) {
                t5cVar.cancel();
            }
        }

        @Override // p153l.t5c
        public void cleanup() {
            t5c<DataT> t5cVar = this.f83980j;
            if (t5cVar != null) {
                t5cVar.cleanup();
            }
        }

        @Override // p153l.t5c
        /* JADX INFO: renamed from: d */
        public void mo95590d(@NonNull Priority priority, @NonNull t5c.InterfaceC20239a<? super DataT> interfaceC20239a) {
            try {
                t5c<DataT> t5cVarM112791c = m112791c();
                if (t5cVarM112791c == null) {
                    interfaceC20239a.mo5433c(new IllegalArgumentException("Failed to build fetcher for: " + this.f83974d));
                } else {
                    this.f83980j = t5cVarM112791c;
                    if (this.f83979i) {
                        cancel();
                    } else {
                        t5cVarM112791c.mo95590d(priority, interfaceC20239a);
                    }
                }
            } catch (FileNotFoundException e) {
                interfaceC20239a.mo5433c(e);
            }
        }

        @Override // p153l.t5c
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }
    }

    public cvb0(Context context, re00<File, DataT> re00Var, re00<Uri, DataT> re00Var2, Class<DataT> cls) {
        this.f83964a = context.getApplicationContext();
        this.f83965b = re00Var;
        this.f83966c = re00Var2;
        this.f83967d = cls;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<DataT> mo101565a(@NonNull Uri uri, int i, int i2, @NonNull u560 u560Var) {
        return new re00.C19812a<>(new d950(uri), new C16374d(this.f83964a, this.f83965b, this.f83966c, uri, i, i2, u560Var, this.f83967d));
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && x6y.m209564b(uri);
    }
}

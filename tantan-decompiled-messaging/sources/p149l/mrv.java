package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.p046p1.mobile.android.p048ui.cropiwa.TooLargeException;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class mrv extends AsyncTask<Void, Void, Throwable> {

    /* JADX INFO: renamed from: a */
    public Context f135417a;

    /* JADX INFO: renamed from: b */
    public Uri f135418b;

    /* JADX INFO: renamed from: c */
    public int f135419c;

    /* JADX INFO: renamed from: d */
    public int f135420d;

    /* JADX INFO: renamed from: e */
    public Bitmap f135421e;

    public mrv(Context context, Uri uri, int i, int i2) {
        this.f135417a = context;
        this.f135418b = uri;
        this.f135419c = i;
        this.f135420d = i2;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        try {
            Bitmap bitmapM123178n = fub.m123168h().m123178n(this.f135417a, this.f135418b, this.f135419c, this.f135420d, 0);
            this.f135421e = bitmapM123178n;
            if (bitmapM123178n == null) {
                return new NullPointerException("Failed to load bitmap");
            }
            return null;
        } catch (TooLargeException e) {
            return e;
        } catch (IOException e2) {
            CrashHelper.m81296c(e2);
            return e2;
        } catch (IllegalArgumentException e3) {
            CrashHelper.m81296c(e3);
            return e3;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th) {
        fub.m123168h().m123179o(this.f135418b, this.f135421e, th);
    }
}

package p007l;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.p003p1.mobile.android.p005ui.cropiwa.TooLargeException;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class mrv extends AsyncTask<Void, Void, Throwable> {

    /* JADX INFO: renamed from: a */
    public Context f3326a;

    /* JADX INFO: renamed from: b */
    public Uri f3327b;

    /* JADX INFO: renamed from: c */
    public int f3328c;

    /* JADX INFO: renamed from: d */
    public int f3329d;

    /* JADX INFO: renamed from: e */
    public Bitmap f3330e;

    public mrv(Context context, Uri uri, int i, int i2) {
        this.f3326a = context;
        this.f3327b = uri;
        this.f3328c = i;
        this.f3329d = i2;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        try {
            Bitmap bitmapM9158n = fub.m9148h().m9158n(this.f3326a, this.f3327b, this.f3328c, this.f3329d, 0);
            this.f3330e = bitmapM9158n;
            if (bitmapM9158n == null) {
                return new NullPointerException("Failed to load bitmap");
            }
            return null;
        } catch (TooLargeException e) {
            return e;
        } catch (IOException e2) {
            CrashHelper.c(e2);
            return e2;
        } catch (IllegalArgumentException e3) {
            CrashHelper.c(e3);
            return e3;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th) {
        fub.m9148h().m9159o(this.f3327b, this.f3330e, th);
    }
}

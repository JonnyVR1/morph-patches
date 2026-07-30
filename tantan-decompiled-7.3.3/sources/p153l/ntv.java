package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.p051p1.mobile.android.p053ui.cropiwa.TooLargeException;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class ntv extends AsyncTask<Void, Void, Throwable> {

    /* JADX INFO: renamed from: a */
    public Context f143646a;

    /* JADX INFO: renamed from: b */
    public Uri f143647b;

    /* JADX INFO: renamed from: c */
    public int f143648c;

    /* JADX INFO: renamed from: d */
    public int f143649d;

    /* JADX INFO: renamed from: e */
    public Bitmap f143650e;

    public ntv(Context context, Uri uri, int i, int i2) {
        this.f143646a = context;
        this.f143647b = uri;
        this.f143648c = i;
        this.f143649d = i2;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        try {
            Bitmap bitmapM192797n = tvb.m192787h().m192797n(this.f143646a, this.f143647b, this.f143648c, this.f143649d, 0);
            this.f143650e = bitmapM192797n;
            if (bitmapM192797n == null) {
                return new NullPointerException("Failed to load bitmap");
            }
            return null;
        } catch (TooLargeException e) {
            return e;
        } catch (IOException e2) {
            CrashHelper.m82479c(e2);
            return e2;
        } catch (IllegalArgumentException e3) {
            CrashHelper.m82479c(e3);
            return e3;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th) {
        tvb.m192787h().m192798o(this.f143647b, this.f143650e, th);
    }
}

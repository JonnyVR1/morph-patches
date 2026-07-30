package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class rsw extends AsyncTask<Void, Void, Drawable> {

    /* JADX INFO: renamed from: a */
    public Uri f164734a;

    /* JADX INFO: renamed from: b */
    public int f164735b;

    /* JADX INFO: renamed from: c */
    public int f164736c;

    /* JADX INFO: renamed from: d */
    public int f164737d;

    /* JADX INFO: renamed from: e */
    public int f164738e;

    /* JADX INFO: renamed from: f */
    public WeakReference<Context> f164739f;

    public rsw(Context context, Uri uri, int i, int i2) {
        this.f164739f = new WeakReference<>(context);
        this.f164734a = uri;
        this.f164735b = i;
        this.f164736c = i2;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Drawable doInBackground(Void... voidArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeStream(this.f164739f.get().getContentResolver().openInputStream(this.f164734a), null, options);
            int i = options.outWidth;
            this.f164737d = i;
            int i2 = options.outHeight;
            this.f164738e = i2;
            Runtime.getRuntime().gc();
            int iMin = Math.min(this.f164735b * this.f164736c * 4, (int) ((Runtime.getRuntime().maxMemory() / 8) / 4));
            int i3 = i * i2;
            while (i3 > iMin) {
                int i4 = options.inSampleSize * 2;
                options.inSampleSize = i4;
                i3 = (this.f164737d / i4) * (this.f164738e / i4);
            }
            options.inJustDecodeBounds = false;
            Bitmap bitmapM214979H = yb5.m214979H(this.f164739f.get(), this.f164734a, options);
            if (bitmapM214979H == null) {
                this.f164737d = -1;
                this.f164738e = -1;
                return null;
            }
            Bitmap bitmapM192783c = tvb.m192783c(this.f164739f.get(), this.f164734a, bitmapM214979H);
            float f = this.f164737d / this.f164738e;
            float width = bitmapM192783c.getWidth() / bitmapM192783c.getHeight();
            if ((f < 1.0f && width > 1.0f) || (f > 1.0f && width < 1.0f)) {
                int i5 = this.f164737d;
                this.f164737d = this.f164738e;
                this.f164738e = i5;
            }
            return new BitmapDrawable(this.f164739f.get().getResources(), bitmapM192783c);
        } catch (FileNotFoundException e) {
            CrashHelper.m82479c(e);
            this.f164737d = -1;
            this.f164738e = -1;
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m183034b() {
        return this.f164738e;
    }

    /* JADX INFO: renamed from: c */
    public int m183035c() {
        return this.f164737d;
    }

    /* JADX INFO: renamed from: d */
    public int m183036d() {
        return this.f164736c;
    }

    /* JADX INFO: renamed from: e */
    public int m183037e() {
        return this.f164735b;
    }
}

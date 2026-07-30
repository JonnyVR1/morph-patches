package p149l;

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

/* JADX INFO: loaded from: classes12.dex */
public class spw extends AsyncTask<Void, Void, Drawable> {

    /* JADX INFO: renamed from: a */
    public Uri f165882a;

    /* JADX INFO: renamed from: b */
    public int f165883b;

    /* JADX INFO: renamed from: c */
    public int f165884c;

    /* JADX INFO: renamed from: d */
    public int f165885d;

    /* JADX INFO: renamed from: e */
    public int f165886e;

    /* JADX INFO: renamed from: f */
    public WeakReference<Context> f165887f;

    public spw(Context context, Uri uri, int i, int i2) {
        this.f165887f = new WeakReference<>(context);
        this.f165882a = uri;
        this.f165883b = i;
        this.f165884c = i2;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Drawable doInBackground(Void... voidArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeStream(this.f165887f.get().getContentResolver().openInputStream(this.f165882a), null, options);
            int i = options.outWidth;
            this.f165885d = i;
            int i2 = options.outHeight;
            this.f165886e = i2;
            Runtime.getRuntime().gc();
            int iMin = Math.min(this.f165883b * this.f165884c * 4, (int) ((Runtime.getRuntime().maxMemory() / 8) / 4));
            int i3 = i * i2;
            while (i3 > iMin) {
                int i4 = options.inSampleSize * 2;
                options.inSampleSize = i4;
                i3 = (this.f165885d / i4) * (this.f165886e / i4);
            }
            options.inJustDecodeBounds = false;
            Bitmap bitmapM213792H = ya5.m213792H(this.f165887f.get(), this.f165882a, options);
            if (bitmapM213792H == null) {
                this.f165885d = -1;
                this.f165886e = -1;
                return null;
            }
            Bitmap bitmapM123164c = fub.m123164c(this.f165887f.get(), this.f165882a, bitmapM213792H);
            float f = this.f165885d / this.f165886e;
            float width = bitmapM123164c.getWidth() / bitmapM123164c.getHeight();
            if ((f < 1.0f && width > 1.0f) || (f > 1.0f && width < 1.0f)) {
                int i5 = this.f165885d;
                this.f165885d = this.f165886e;
                this.f165886e = i5;
            }
            return new BitmapDrawable(this.f165887f.get().getResources(), bitmapM123164c);
        } catch (FileNotFoundException e) {
            CrashHelper.m81296c(e);
            this.f165885d = -1;
            this.f165886e = -1;
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m185391b() {
        return this.f165886e;
    }

    /* JADX INFO: renamed from: c */
    public int m185392c() {
        return this.f165885d;
    }

    /* JADX INFO: renamed from: d */
    public int m185393d() {
        return this.f165884c;
    }

    /* JADX INFO: renamed from: e */
    public int m185394e() {
        return this.f165883b;
    }
}

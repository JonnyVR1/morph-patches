package p007l;

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
import l.fub;
import l.ya5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class spw extends AsyncTask<Void, Void, Drawable> {

    /* JADX INFO: renamed from: a */
    public Uri f13027a;

    /* JADX INFO: renamed from: b */
    public int f13028b;

    /* JADX INFO: renamed from: c */
    public int f13029c;

    /* JADX INFO: renamed from: d */
    public int f13030d;

    /* JADX INFO: renamed from: e */
    public int f13031e;

    /* JADX INFO: renamed from: f */
    public WeakReference<Context> f13032f;

    public spw(Context context, Uri uri, int i, int i2) {
        this.f13032f = new WeakReference<>(context);
        this.f13027a = uri;
        this.f13028b = i;
        this.f13029c = i2;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Drawable doInBackground(Void... voidArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeStream(this.f13032f.get().getContentResolver().openInputStream(this.f13027a), null, options);
            int i = options.outWidth;
            this.f13030d = i;
            int i2 = options.outHeight;
            this.f13031e = i2;
            Runtime.getRuntime().gc();
            int iMin = Math.min(this.f13028b * this.f13029c * 4, (int) ((Runtime.getRuntime().maxMemory() / 8) / 4));
            int i3 = i * i2;
            while (i3 > iMin) {
                int i4 = options.inSampleSize * 2;
                options.inSampleSize = i4;
                i3 = (this.f13030d / i4) * (this.f13031e / i4);
            }
            options.inJustDecodeBounds = false;
            Bitmap bitmapH = ya5.H(this.f13032f.get(), this.f13027a, options);
            if (bitmapH == null) {
                this.f13030d = -1;
                this.f13031e = -1;
                return null;
            }
            Bitmap bitmapC = fub.c(this.f13032f.get(), this.f13027a, bitmapH);
            float f = this.f13030d / this.f13031e;
            float width = bitmapC.getWidth() / bitmapC.getHeight();
            if ((f < 1.0f && width > 1.0f) || (f > 1.0f && width < 1.0f)) {
                int i5 = this.f13030d;
                this.f13030d = this.f13031e;
                this.f13031e = i5;
            }
            return new BitmapDrawable(this.f13032f.get().getResources(), bitmapC);
        } catch (FileNotFoundException e) {
            CrashHelper.c(e);
            this.f13030d = -1;
            this.f13031e = -1;
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m14280b() {
        return this.f13031e;
    }

    /* JADX INFO: renamed from: c */
    public int m14281c() {
        return this.f13030d;
    }

    /* JADX INFO: renamed from: d */
    public int m14282d() {
        return this.f13029c;
    }

    /* JADX INFO: renamed from: e */
    public int m14283e() {
        return this.f13028b;
    }
}

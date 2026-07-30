package p007l;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.p003p1.mobile.android.p005ui.cropiwa.CropIwaView;
import com.p003p1.mobile.android.p005ui.cropiwa.TooLargeException;
import com.p003p1.mobile.android.p005ui.cropiwa.image.CropIwaResultReceiver;
import com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaShapeMask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.io.OutputStream;
import l.du2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class dub extends AsyncTask<Void, Void, Throwable> {

    /* JADX INFO: renamed from: a */
    public Context f2599a;

    /* JADX INFO: renamed from: b */
    public cub f2600b;

    /* JADX INFO: renamed from: c */
    public CropIwaShapeMask f2601c;

    /* JADX INFO: renamed from: d */
    public Uri f2602d;

    /* JADX INFO: renamed from: e */
    public qub f2603e;

    /* JADX INFO: renamed from: f */
    public CropIwaView f2604f;

    public dub(Context context, cub cubVar, CropIwaShapeMask cropIwaShapeMask, Uri uri, qub qubVar, CropIwaView cropIwaView) {
        this.f2599a = context;
        this.f2600b = cubVar;
        this.f2601c = cropIwaShapeMask;
        this.f2602d = uri;
        this.f2603e = qubVar;
        this.f2604f = cropIwaView;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        du2.a(CropIwaResultReceiver.TAG, "CropImageTask-doInBackground");
        try {
            Bitmap bitmapM9158n = fub.m9148h().m9158n(this.f2599a, this.f2602d, this.f2603e.m10463k(), this.f2603e.m10461i(), this.f2604f.getImageViewRotation());
            if (bitmapM9158n == null) {
                return new NullPointerException("Failed to load bitmap");
            }
            Bitmap bitmapApplyMaskTo = this.f2601c.applyMaskTo(this.f2600b.m8804a(bitmapM9158n));
            Uri uriM10460h = this.f2603e.m10460h();
            OutputStream outputStreamOpenOutputStream = this.f2599a.getContentResolver().openOutputStream(uriM10460h);
            bitmapApplyMaskTo.compress(this.f2603e.m10459g(), this.f2603e.m10462j(bitmapApplyMaskTo), outputStreamOpenOutputStream);
            n6f.m9951b(this.f2602d.getPath(), uriM10460h.getPath(), false);
            sub.m10725b(outputStreamOpenOutputStream);
            bitmapM9158n.recycle();
            bitmapApplyMaskTo.recycle();
            return null;
        } catch (TooLargeException e) {
            return e;
        } catch (IOException e2) {
            CrashHelper.c(e2);
            return e2;
        } catch (IllegalArgumentException e3) {
            CrashHelper.c(e3);
            return e3;
        } catch (NullPointerException e4) {
            CrashHelper.c(e4);
            return e4;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th) {
        du2.a(CropIwaResultReceiver.TAG, "CropImageTask-onPostExecute");
        if (th == null) {
            CropIwaResultReceiver.onCropCompleted(this.f2599a, this.f2603e.m10460h());
            return;
        }
        boolean z = th instanceof IllegalArgumentException;
        Context context = this.f2599a;
        if (z) {
            CropIwaResultReceiver.onCropInvalid(context);
        } else {
            CropIwaResultReceiver.onCropFailed(context, th);
        }
    }
}

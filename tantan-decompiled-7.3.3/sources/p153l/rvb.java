package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.p051p1.mobile.android.p053ui.cropiwa.CropIwaView;
import com.p051p1.mobile.android.p053ui.cropiwa.TooLargeException;
import com.p051p1.mobile.android.p053ui.cropiwa.image.CropIwaResultReceiver;
import com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaShapeMask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public class rvb extends AsyncTask<Void, Void, Throwable> {

    /* JADX INFO: renamed from: a */
    public Context f164996a;

    /* JADX INFO: renamed from: b */
    public qvb f164997b;

    /* JADX INFO: renamed from: c */
    public CropIwaShapeMask f164998c;

    /* JADX INFO: renamed from: d */
    public Uri f164999d;

    /* JADX INFO: renamed from: e */
    public ewb f165000e;

    /* JADX INFO: renamed from: f */
    public CropIwaView f165001f;

    public rvb(Context context, qvb qvbVar, CropIwaShapeMask cropIwaShapeMask, Uri uri, ewb ewbVar, CropIwaView cropIwaView) {
        this.f164996a = context;
        this.f164997b = qvbVar;
        this.f164998c = cropIwaShapeMask;
        this.f164999d = uri;
        this.f165000e = ewbVar;
        this.f165001f = cropIwaView;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        tu2.m192703a(CropIwaResultReceiver.TAG, "CropImageTask-doInBackground");
        try {
            Bitmap bitmapM192797n = tvb.m192787h().m192797n(this.f164996a, this.f164999d, this.f165000e.m122938k(), this.f165000e.m122936i(), this.f165001f.getImageViewRotation());
            if (bitmapM192797n == null) {
                return new NullPointerException("Failed to load bitmap");
            }
            Bitmap bitmapApplyMaskTo = this.f164998c.applyMaskTo(this.f164997b.m178256a(bitmapM192797n));
            Uri uriM122935h = this.f165000e.m122935h();
            OutputStream outputStreamOpenOutputStream = this.f164996a.getContentResolver().openOutputStream(uriM122935h);
            bitmapApplyMaskTo.compress(this.f165000e.m122934g(), this.f165000e.m122937j(bitmapApplyMaskTo), outputStreamOpenOutputStream);
            t7f.m189565b(this.f164999d.getPath(), uriM122935h.getPath(), false);
            gwb.m132649b(outputStreamOpenOutputStream);
            bitmapM192797n.recycle();
            bitmapApplyMaskTo.recycle();
            return null;
        } catch (TooLargeException e) {
            return e;
        } catch (IOException e2) {
            CrashHelper.m82479c(e2);
            return e2;
        } catch (IllegalArgumentException e3) {
            CrashHelper.m82479c(e3);
            return e3;
        } catch (NullPointerException e4) {
            CrashHelper.m82479c(e4);
            return e4;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th) {
        tu2.m192703a(CropIwaResultReceiver.TAG, "CropImageTask-onPostExecute");
        if (th == null) {
            CropIwaResultReceiver.onCropCompleted(this.f164996a, this.f165000e.m122935h());
            return;
        }
        boolean z = th instanceof IllegalArgumentException;
        Context context = this.f164996a;
        if (z) {
            CropIwaResultReceiver.onCropInvalid(context);
        } else {
            CropIwaResultReceiver.onCropFailed(context, th);
        }
    }
}

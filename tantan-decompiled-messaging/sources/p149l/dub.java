package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.p046p1.mobile.android.p048ui.cropiwa.CropIwaView;
import com.p046p1.mobile.android.p048ui.cropiwa.TooLargeException;
import com.p046p1.mobile.android.p048ui.cropiwa.image.CropIwaResultReceiver;
import com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaShapeMask;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public class dub extends AsyncTask<Void, Void, Throwable> {

    /* JADX INFO: renamed from: a */
    public Context f87962a;

    /* JADX INFO: renamed from: b */
    public cub f87963b;

    /* JADX INFO: renamed from: c */
    public CropIwaShapeMask f87964c;

    /* JADX INFO: renamed from: d */
    public Uri f87965d;

    /* JADX INFO: renamed from: e */
    public qub f87966e;

    /* JADX INFO: renamed from: f */
    public CropIwaView f87967f;

    public dub(Context context, cub cubVar, CropIwaShapeMask cropIwaShapeMask, Uri uri, qub qubVar, CropIwaView cropIwaView) {
        this.f87962a = context;
        this.f87963b = cubVar;
        this.f87964c = cropIwaShapeMask;
        this.f87965d = uri;
        this.f87966e = qubVar;
        this.f87967f = cropIwaView;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        du2.m113670a(CropIwaResultReceiver.TAG, "CropImageTask-doInBackground");
        try {
            Bitmap bitmapM123178n = fub.m123168h().m123178n(this.f87962a, this.f87965d, this.f87966e.m176591k(), this.f87966e.m176589i(), this.f87967f.getImageViewRotation());
            if (bitmapM123178n == null) {
                return new NullPointerException("Failed to load bitmap");
            }
            Bitmap bitmapApplyMaskTo = this.f87964c.applyMaskTo(this.f87963b.m108743a(bitmapM123178n));
            Uri uriM176588h = this.f87966e.m176588h();
            OutputStream outputStreamOpenOutputStream = this.f87962a.getContentResolver().openOutputStream(uriM176588h);
            bitmapApplyMaskTo.compress(this.f87966e.m176587g(), this.f87966e.m176590j(bitmapApplyMaskTo), outputStreamOpenOutputStream);
            n6f.m158040b(this.f87965d.getPath(), uriM176588h.getPath(), false);
            sub.m186005b(outputStreamOpenOutputStream);
            bitmapM123178n.recycle();
            bitmapApplyMaskTo.recycle();
            return null;
        } catch (TooLargeException e) {
            return e;
        } catch (IOException e2) {
            CrashHelper.m81296c(e2);
            return e2;
        } catch (IllegalArgumentException e3) {
            CrashHelper.m81296c(e3);
            return e3;
        } catch (NullPointerException e4) {
            CrashHelper.m81296c(e4);
            return e4;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th) {
        du2.m113670a(CropIwaResultReceiver.TAG, "CropImageTask-onPostExecute");
        if (th == null) {
            CropIwaResultReceiver.onCropCompleted(this.f87962a, this.f87966e.m176588h());
            return;
        }
        boolean z = th instanceof IllegalArgumentException;
        Context context = this.f87962a;
        if (z) {
            CropIwaResultReceiver.onCropInvalid(context);
        } else {
            CropIwaResultReceiver.onCropFailed(context, th);
        }
    }
}

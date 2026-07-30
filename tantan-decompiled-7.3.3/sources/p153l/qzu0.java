package p153l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class qzu0 {

    /* JADX INFO: renamed from: a */
    public final Context f160299a;

    /* JADX INFO: renamed from: b */
    public final ApplicationInfo f160300b;

    /* JADX INFO: renamed from: e */
    public String f160303e = "";

    /* JADX INFO: renamed from: c */
    public final int f160301c = ((Integer) jas0.m144075c().m176505a(sgs0.f168237a9)).intValue();

    /* JADX INFO: renamed from: d */
    public final int f160302d = ((Integer) jas0.m144075c().m176505a(sgs0.f168250b9)).intValue();

    public qzu0(Context context) {
        this.f160299a = context;
        this.f160300b = context.getApplicationInfo();
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m178828a() throws JSONException {
        String strM12351R;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.f160299a;
            String str = this.f160300b.packageName;
            ukw0 ukw0Var = C2098b.f9751l;
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, Wrappers.packageManager(context).getApplicationLabel(str));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, this.f160300b.packageName);
        bxy0.m106934r();
        Drawable drawable = null;
        try {
            strM12351R = C2098b.m12351R(this.f160299a);
        } catch (RemoteException unused2) {
            strM12351R = null;
        }
        jSONObject.put("adMobAppId", strM12351R);
        if (this.f160303e.isEmpty()) {
            try {
                drawable = Wrappers.packageManager(this.f160299a).getApplicationLabelAndIcon(this.f160300b.packageName).f152157b;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f160301c, this.f160302d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f160301c, this.f160302d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f160303e = strEncodeToString;
        }
        if (!this.f160303e.isEmpty()) {
            jSONObject.put("icon", this.f160303e);
            jSONObject.put("iconWidthPx", this.f160301c);
            jSONObject.put("iconHeightPx", this.f160302d);
        }
        return jSONObject;
    }
}

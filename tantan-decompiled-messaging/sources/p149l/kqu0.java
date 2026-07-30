package p149l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class kqu0 {

    /* JADX INFO: renamed from: a */
    public final Context f124296a;

    /* JADX INFO: renamed from: b */
    public final ApplicationInfo f124297b;

    /* JADX INFO: renamed from: e */
    public String f124300e = "";

    /* JADX INFO: renamed from: c */
    public final int f124298c = ((Integer) d1s0.m109677c().m144697a(m7s0.f132166a9)).intValue();

    /* JADX INFO: renamed from: d */
    public final int f124299d = ((Integer) d1s0.m109677c().m144697a(m7s0.f132179b9)).intValue();

    public kqu0(Context context) {
        this.f124296a = context;
        this.f124297b = context.getApplicationInfo();
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m146958a() throws JSONException {
        String strM12297R;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.f124296a;
            String str = this.f124297b.packageName;
            obw0 obw0Var = C2075b.f9714l;
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, Wrappers.packageManager(context).getApplicationLabel(str));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, this.f124297b.packageName);
        vny0.m199080r();
        Drawable drawable = null;
        try {
            strM12297R = C2075b.m12297R(this.f124296a);
        } catch (RemoteException unused2) {
            strM12297R = null;
        }
        jSONObject.put("adMobAppId", strM12297R);
        if (this.f124300e.isEmpty()) {
            try {
                drawable = Wrappers.packageManager(this.f124296a).getApplicationLabelAndIcon(this.f124297b.packageName).f116565b;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f124298c, this.f124299d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f124298c, this.f124299d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f124300e = strEncodeToString;
        }
        if (!this.f124300e.isEmpty()) {
            jSONObject.put("icon", this.f124300e);
            jSONObject.put("iconWidthPx", this.f124298c);
            jSONObject.put("iconHeightPx", this.f124299d);
        }
        return jSONObject;
    }
}

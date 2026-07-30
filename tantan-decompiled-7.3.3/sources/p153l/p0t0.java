package p153l;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.internal.util.C2098b;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes6.dex */
public final class p0t0 extends s0t0 {

    /* JADX INFO: renamed from: c */
    public final Map f150096c;

    /* JADX INFO: renamed from: d */
    public final Context f150097d;

    public p0t0(wit0 wit0Var, Map map) {
        super(wit0Var, "storePicture");
        this.f150096c = map;
        this.f150097d = wit0Var.zzi();
    }

    /* JADX INFO: renamed from: i */
    public final void m170182i() {
        if (this.f150097d == null) {
            m183979c("Activity context is not available");
            return;
        }
        bxy0.m106934r();
        if (!new vfs0(this.f150097d).m201183c()) {
            m183979c("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f150096c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            m183979c("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            m183979c("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        bxy0.m106934r();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            m183979c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesM120261e = bxy0.m106933q().m120261e();
        bxy0.m106934r();
        AlertDialog.Builder builderM12371j = C2098b.m12371j(this.f150097d);
        builderM12371j.setTitle(resourcesM120261e != null ? resourcesM120261e.getString(R$string.f9705m) : "Save image");
        builderM12371j.setMessage(resourcesM120261e != null ? resourcesM120261e.getString(R$string.f9706n) : "Allow Ad to store image in Picture gallery?");
        builderM12371j.setPositiveButton(resourcesM120261e != null ? resourcesM120261e.getString(R$string.f9707o) : HttpHeaders.ACCEPT, new n0t0(this, str, lastPathSegment));
        builderM12371j.setNegativeButton(resourcesM120261e != null ? resourcesM120261e.getString(R$string.f9708p) : "Decline", new o0t0(this));
        builderM12371j.create().show();
    }
}

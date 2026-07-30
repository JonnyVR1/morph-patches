package p149l;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.internal.util.C2075b;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class jrs0 extends mrs0 {

    /* JADX INFO: renamed from: c */
    public final Map f119438c;

    /* JADX INFO: renamed from: d */
    public final Context f119439d;

    public jrs0(q9t0 q9t0Var, Map map) {
        super(q9t0Var, "storePicture");
        this.f119438c = map;
        this.f119439d = q9t0Var.zzi();
    }

    /* JADX INFO: renamed from: i */
    public final void m142974i() {
        if (this.f119439d == null) {
            m156080c("Activity context is not available");
            return;
        }
        vny0.m199080r();
        if (!new p6s0(this.f119439d).m167692c()) {
            m156080c("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f119438c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            m156080c("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            m156080c("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        vny0.m199080r();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            m156080c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesM212276e = vny0.m199079q().m212276e();
        vny0.m199080r();
        AlertDialog.Builder builderM12317j = C2075b.m12317j(this.f119439d);
        builderM12317j.setTitle(resourcesM212276e != null ? resourcesM212276e.getString(R$string.f9668m) : "Save image");
        builderM12317j.setMessage(resourcesM212276e != null ? resourcesM212276e.getString(R$string.f9669n) : "Allow Ad to store image in Picture gallery?");
        builderM12317j.setPositiveButton(resourcesM212276e != null ? resourcesM212276e.getString(R$string.f9670o) : "Accept", new hrs0(this, str, lastPathSegment));
        builderM12317j.setNegativeButton(resourcesM212276e != null ? resourcesM212276e.getString(R$string.f9671p) : "Decline", new irs0(this));
        builderM12317j.create().show();
    }
}

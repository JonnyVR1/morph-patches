package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C2098b;
import java.util.Map;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes6.dex */
public final class tqs0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final Context f175774a;

    public tqs0(Context context) {
        this.f175774a = context;
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final void mo12917a(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        d2v0.m113737k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(MimeTypes.TEXT_PLAIN);
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            bxy0.m106934r();
            C2098b.m12380s(this.f175774a, intent);
        } catch (RuntimeException e) {
            dct0.m115299h("Failed to open Share Sheet", e);
            bxy0.m106933q().m120275w(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}

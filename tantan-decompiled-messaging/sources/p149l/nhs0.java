package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C2075b;
import java.util.Map;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes6.dex */
public final class nhs0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final Context f139031a;

    public nhs0(Context context) {
        this.f139031a = context;
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        xsu0.m210834k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(MimeTypes.TEXT_PLAIN);
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            vny0.m199080r();
            C2075b.m12326s(this.f139031a, intent);
        } catch (RuntimeException e) {
            x2t0.m206870h("Failed to open Share Sheet", e);
            vny0.m199079q().m212290w(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}

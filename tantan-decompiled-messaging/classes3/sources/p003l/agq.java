package p003l;

import android.net.Uri;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import java.net.URI;
import l.ahq;
import l.j2e0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class agq extends ahq {

    /* JADX INFO: renamed from: l.agq$a */
    public class C0164a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f2205a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f2206b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ URI f2207c;

        public C0164a(String str, String str2, URI uri) {
            this.f2205a = str;
            this.f2206b = str2;
            this.f2207c = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f2205a)) {
                try {
                    String[] strArrSplit = this.f2205a.split("statsModuleParameter");
                    if (!vwb.K(strArrSplit)) {
                        if (strArrSplit.length > 1) {
                            zvf0.t(strArrSplit[0], this.f2206b, new JSONObject(strArrSplit[1]));
                        } else {
                            zvf0.r(strArrSplit[0], this.f2206b);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            j2e0.m(xdl0.D(view.getContext()), Uri.parse(this.f2207c.toString()));
        }
    }

    /* JADX INFO: renamed from: b */
    public ClickableSpan m2869b(URI uri, boolean z, String str, String str2) {
        return z ? super.b(uri, z, str, str2) : new C0164a(str, str2, uri);
    }

    /* JADX INFO: renamed from: c */
    public String m2870c() {
        return "<a href *= *\" *tantan://msgReport.*\">.*</a>";
    }
}

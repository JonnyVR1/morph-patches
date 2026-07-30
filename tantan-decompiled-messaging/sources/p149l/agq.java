package p149l;

import android.net.Uri;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import java.net.URI;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class agq extends ahq {

    /* JADX INFO: renamed from: l.agq$a */
    public class C15614a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f69387a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f69388b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ URI f69389c;

        public C15614a(String str, String str2, URI uri) {
            this.f69387a = str;
            this.f69388b = str2;
            this.f69389c = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f69387a)) {
                try {
                    String[] strArrSplit = this.f69387a.split("statsModuleParameter");
                    if (!vwb.m200297K(strArrSplit)) {
                        if (strArrSplit.length > 1) {
                            zvf0.m220398t(strArrSplit[0], this.f69388b, new JSONObject(strArrSplit[1]));
                        } else {
                            zvf0.m220396r(strArrSplit[0], this.f69388b);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            j2e0.m139446m(xdl0.m208326D(view.getContext()), Uri.parse(this.f69389c.toString()));
        }
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo96321b(URI uri, boolean z, String str, String str2) {
        return z ? super.mo96321b(uri, z, str, str2) : new C15614a(str, str2, uri);
    }

    @Override // p149l.ahq
    /* JADX INFO: renamed from: c */
    public String mo96322c() {
        return "<a href *= *\" *tantan://msgReport.*\">.*</a>";
    }
}

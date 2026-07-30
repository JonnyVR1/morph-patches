package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import java.net.URI;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class aiq extends ajq {

    /* JADX INFO: renamed from: l.aiq$a */
    public class C15715a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f71557a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f71558b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ URI f71559c;

        public C15715a(String str, String str2, URI uri) {
            this.f71557a = str;
            this.f71558b = str2;
            this.f71559c = uri;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f71557a)) {
                try {
                    String[] strArrSplit = this.f71557a.split("statsModuleParameter");
                    if (!jyb.m147480K(strArrSplit)) {
                        if (strArrSplit.length > 1) {
                            i4g0.m138522t(strArrSplit[0], this.f71558b, new JSONObject(strArrSplit[1]));
                        } else {
                            i4g0.m138520r(strArrSplit[0], this.f71558b);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            nae0.m162083m(bnl0.m105506D(view.getContext()), Uri.parse(this.f71559c.toString()));
        }
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: b */
    public ClickableSpan mo98010b(URI uri, boolean z, String str, String str2) {
        return z ? super.mo98010b(uri, z, str, str2) : new C15715a(str, str2, uri);
    }

    @Override // p153l.ajq
    /* JADX INFO: renamed from: c */
    public String mo98011c() {
        return "<a href *= *\" *tantan://msgReport.*\">.*</a>";
    }
}

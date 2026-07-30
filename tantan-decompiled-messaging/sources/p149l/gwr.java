package p149l;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class gwr {

    /* JADX INFO: renamed from: a */
    public String f104769a;

    /* JADX INFO: renamed from: b */
    public String f104770b;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f104771c = new HashMap();

    public gwr(String str) {
        this.f104770b = str;
        m128510f(str);
    }

    /* JADX INFO: renamed from: b */
    public final String m128506b(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        return TextUtils.isEmpty(queryParameter) ? "" : queryParameter;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo128507c(String str);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m128508d(Uri uri, String str) {
        this.f104771c.put(str, m128506b(uri, str));
    }

    /* JADX INFO: renamed from: e */
    public final void m128509e(String str) {
        final Uri uri = Uri.parse(str);
        List<String> pathSegments = uri.getPathSegments();
        if (vwb.m200296J(pathSegments)) {
            return;
        }
        this.f104769a = pathSegments.get(pathSegments.size() - 1);
        vwb.m200354z(uri.getQueryParameterNames(), new e30() { // from class: l.fwr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99680a.m128508d(uri, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m128510f(String str) {
        if (!TextUtils.isEmpty(str) && mo128507c(str)) {
            m128509e(str);
        }
    }
}

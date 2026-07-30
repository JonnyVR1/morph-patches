package p153l;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class hyr {

    /* JADX INFO: renamed from: a */
    public String f112154a;

    /* JADX INFO: renamed from: b */
    public String f112155b;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f112156c = new HashMap();

    public hyr(String str) {
        this.f112155b = str;
        m137771f(str);
    }

    /* JADX INFO: renamed from: b */
    public final String m137767b(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        return TextUtils.isEmpty(queryParameter) ? "" : queryParameter;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo137768c(String str);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m137769d(Uri uri, String str) {
        this.f112156c.put(str, m137767b(uri, str));
    }

    /* JADX INFO: renamed from: e */
    public final void m137770e(String str) {
        final Uri uri = Uri.parse(str);
        List<String> pathSegments = uri.getPathSegments();
        if (jyb.m147479J(pathSegments)) {
            return;
        }
        this.f112154a = pathSegments.get(pathSegments.size() - 1);
        jyb.m147537z(uri.getQueryParameterNames(), new y20() { // from class: l.gyr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107104a.m137769d(uri, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m137771f(String str) {
        if (!TextUtils.isEmpty(str) && mo137768c(str)) {
            m137770e(str);
        }
    }
}

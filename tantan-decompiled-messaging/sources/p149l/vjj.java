package p149l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class vjj {

    /* JADX INFO: renamed from: a */
    private String f181733a;

    /* JADX INFO: renamed from: b */
    private Map<String, String> f181734b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f181735c;

    /* JADX INFO: renamed from: a */
    public stc0 m198673a() {
        oxk.C19066a c19066a = new oxk.C19066a();
        Map<String, String> map = this.f181734b;
        if (map != null && !map.isEmpty()) {
            for (String str : this.f181734b.keySet()) {
                c19066a.m166563a(str, this.f181734b.get(str));
            }
        }
        Uri.Builder builderBuildUpon = Uri.parse(this.f181733a).buildUpon();
        Map<String, String> map2 = this.f181735c;
        if (map2 != null && !map2.isEmpty()) {
            for (String str2 : this.f181735c.keySet()) {
                builderBuildUpon.appendQueryParameter(str2, this.f181735c.get(str2));
            }
        }
        return new stc0.C20027a().m185890i(c19066a.m166567e()).m185898q(builderBuildUpon.toString()).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: b */
    public vjj m198674b(Map<String, String> map) {
        this.f181734b = map;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public vjj m198675c(Map<String, String> map) {
        this.f181735c = map;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public vjj m198676d(String str) {
        this.f181733a = str;
        return this;
    }
}

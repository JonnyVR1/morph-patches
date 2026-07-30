package p153l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class omj {

    /* JADX INFO: renamed from: a */
    private String f147946a;

    /* JADX INFO: renamed from: b */
    private Map<String, String> f147947b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f147948c;

    /* JADX INFO: renamed from: a */
    public x1d0 m168229a() {
        e0l.C16674a c16674a = new e0l.C16674a();
        Map<String, String> map = this.f147947b;
        if (map != null && !map.isEmpty()) {
            for (String str : this.f147947b.keySet()) {
                c16674a.m118882a(str, this.f147947b.get(str));
            }
        }
        Uri.Builder builderBuildUpon = Uri.parse(this.f147946a).buildUpon();
        Map<String, String> map2 = this.f147948c;
        if (map2 != null && !map2.isEmpty()) {
            for (String str2 : this.f147948c.keySet()) {
                builderBuildUpon.appendQueryParameter(str2, this.f147948c.get(str2));
            }
        }
        return new x1d0.C21228a().m209035i(c16674a.m118886e()).m209043q(builderBuildUpon.toString()).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: b */
    public omj m168230b(Map<String, String> map) {
        this.f147947b = map;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public omj m168231c(Map<String, String> map) {
        this.f147948c = map;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public omj m168232d(String str) {
        this.f147946a = str;
        return this;
    }
}

package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Media;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class gqd implements z5y<Media> {

    /* JADX INFO: renamed from: a */
    public final List<Media> f105674a;

    public gqd(List<String> list) {
        this.f105674a = jyb.m147486Q(list, new eqd());
    }

    @Override // p153l.z5y
    /* JADX INFO: renamed from: a */
    public int mo131371a(final String str) {
        return jyb.m147476G(this.f105674a, new qcj() { // from class: l.fqd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Media) obj).url, str));
            }
        });
    }

    @Override // p153l.z5y
    public List<Media> source() {
        return this.f105674a;
    }
}

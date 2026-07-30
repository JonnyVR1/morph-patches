package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.data.Industries;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class j1x extends gzw<p1x> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> f117997a;

    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> f117998b;

    public j1x(ner nerVar) {
        super(nerVar);
        this.f117997a = new ArrayList<>();
        this.f117998b = new HashMap();
    }

    @Override // p153l.gzw
    /* JADX INFO: renamed from: g0 */
    public void mo95433g0(MarrySeriesType marrySeriesType, User user) {
        m143159n0();
        jyb.m147503d0(this.f117997a, new qcj() { // from class: l.h1x
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, App.f16088e.getString(R$string.f28732l2)));
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public List<String> m143157l0() {
        return this.f117997a;
    }

    /* JADX INFO: renamed from: m0 */
    public List<String> m143158m0(int i) {
        if (i < 0 || i >= this.f117997a.size()) {
            return new ArrayList();
        }
        List<String> list = this.f117998b.get(this.f117997a.get(i));
        if (!jyb.m147479J(list)) {
            jyb.m147503d0(list, new qcj() { // from class: l.i1x
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((String) obj, App.f16088e.getString(R$string.f28732l2)));
                }
            });
        }
        return list;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m143159n0() {
        List<Industries> listM212801t = xra.m212801t(false);
        if (jyb.m147479J(listM212801t)) {
            return false;
        }
        for (int i = 0; i < listM212801t.size(); i++) {
            Industries industries = listM212801t.get(i);
            this.f117997a.add(industries.name);
            this.f117998b.put(industries.name, industries.departments);
        }
        return true;
    }
}

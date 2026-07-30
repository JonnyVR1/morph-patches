package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.data.Industries;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class kyw extends hww<qyw> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> f125338a;

    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> f125339b;

    public kyw(mcr mcrVar) {
        super(mcrVar);
        this.f125338a = new ArrayList<>();
        this.f125339b = new HashMap();
    }

    @Override // p149l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo104384g0(MarrySeriesType marrySeriesType, User user) {
        m147906n0();
        vwb.m200320d0(this.f125338a, new w9j() { // from class: l.iyw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, App.f15369e.getString(R$string.f27884l2)));
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public List<String> m147904l0() {
        return this.f125338a;
    }

    /* JADX INFO: renamed from: m0 */
    public List<String> m147905m0(int i) {
        if (i < 0 || i >= this.f125338a.size()) {
            return new ArrayList();
        }
        List<String> list = this.f125339b.get(this.f125338a.get(i));
        if (!vwb.m200296J(list)) {
            vwb.m200320d0(list, new w9j() { // from class: l.jyw
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((String) obj, App.f15369e.getString(R$string.f27884l2)));
                }
            });
        }
        return list;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m147906n0() {
        List<Industries> listM150982t = lqa.m150982t(false);
        if (vwb.m200296J(listM150982t)) {
            return false;
        }
        for (int i = 0; i < listM150982t.size(); i++) {
            Industries industries = listM150982t.get(i);
            this.f125338a.add(industries.name);
            this.f125339b.put(industries.name, industries.departments);
        }
        return true;
    }
}

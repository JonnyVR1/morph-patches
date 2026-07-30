package p003l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.Industries;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.lqa;
import l.mcr;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class kyw extends hww<qyw> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<String> f5139a;

    /* JADX INFO: renamed from: b */
    public final Map<String, List<String>> f5140b;

    public kyw(mcr mcrVar) {
        super(mcrVar);
        this.f5139a = new ArrayList<>();
        this.f5140b = new HashMap();
    }

    @Override // p003l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo3202g0(MarrySeriesType marrySeriesType, User user) {
        m5919n0();
        vwb.d0(this.f5139a, new w9j() { // from class: l.iyw
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, App.e.getString(R.string.l2)));
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public List<String> m5917l0() {
        return this.f5139a;
    }

    /* JADX INFO: renamed from: m0 */
    public List<String> m5918m0(int i) {
        if (i < 0 || i >= this.f5139a.size()) {
            return new ArrayList();
        }
        List<String> list = this.f5140b.get(this.f5139a.get(i));
        if (!vwb.J(list)) {
            vwb.d0(list, new w9j() { // from class: l.jyw
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((String) obj, App.e.getString(R.string.l2)));
                }
            });
        }
        return list;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m5919n0() {
        List listT = lqa.t(false);
        if (vwb.J(listT)) {
            return false;
        }
        for (int i = 0; i < listT.size(); i++) {
            Industries industries = (Industries) listT.get(i);
            this.f5139a.add(industries.name);
            this.f5140b.put(industries.name, industries.departments);
        }
        return true;
    }
}

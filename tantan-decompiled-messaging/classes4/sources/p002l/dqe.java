package p002l;

import com.p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import java.util.List;
import l.d30;
import l.f30;
import l.q4l0;
import l.v9j;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dqe {

    /* JADX INFO: renamed from: a */
    public String f9386a;

    /* JADX INFO: renamed from: b */
    public v9j<Boolean> f9387b;

    /* JADX INFO: renamed from: c */
    public d30 f9388c;

    /* JADX INFO: renamed from: d */
    public d30 f9389d;

    /* JADX INFO: renamed from: e */
    public f30<q4l0, BLiveEffect> f9390e;

    /* JADX INFO: renamed from: f */
    public List<BLiveDynamicEffectExtend> f9391f;

    /* JADX INFO: renamed from: g */
    public List<BLiveSpecialEffectResources> f9392g;

    public dqe(String str) {
        this.f9386a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m11979a() {
        this.f9392g = null;
    }

    /* JADX INFO: renamed from: b */
    public d30 m11980b() {
        return this.f9388c;
    }

    /* JADX INFO: renamed from: c */
    public List<BLiveDynamicEffectExtend> m11981c() {
        return this.f9391f;
    }

    /* JADX INFO: renamed from: d */
    public List<BLiveSpecialEffectResources> m11982d() {
        return this.f9392g;
    }

    /* JADX INFO: renamed from: e */
    public d30 m11983e() {
        return this.f9389d;
    }

    /* JADX INFO: renamed from: f */
    public v9j<Boolean> m11984f() {
        return this.f9387b;
    }

    /* JADX INFO: renamed from: g */
    public String m11985g() {
        return this.f9386a;
    }

    /* JADX INFO: renamed from: h */
    public f30<q4l0, BLiveEffect> m11986h() {
        return this.f9390e;
    }

    /* JADX INFO: renamed from: i */
    public dqe m11987i(d30 d30Var) {
        this.f9388c = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public dqe m11988j(List<BLiveDynamicEffectExtend> list) {
        if (vwb.J(list)) {
            return this;
        }
        this.f9391f = list;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public dqe m11989k(List<BLiveSpecialEffectResources> list) {
        this.f9392g = list;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public dqe m11990l(d30 d30Var) {
        this.f9389d = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public dqe m11991m(v9j<Boolean> v9jVar) {
        this.f9387b = v9jVar;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public dqe m11992n(f30<q4l0, BLiveEffect> f30Var) {
        this.f9390e = f30Var;
        return this;
    }
}

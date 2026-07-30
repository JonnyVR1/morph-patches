package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class dqe {

    /* JADX INFO: renamed from: a */
    public String f87403a;

    /* JADX INFO: renamed from: b */
    public v9j<Boolean> f87404b;

    /* JADX INFO: renamed from: c */
    public d30 f87405c;

    /* JADX INFO: renamed from: d */
    public d30 f87406d;

    /* JADX INFO: renamed from: e */
    public f30<q4l0, BLiveEffect> f87407e;

    /* JADX INFO: renamed from: f */
    public List<BLiveDynamicEffectExtend> f87408f;

    /* JADX INFO: renamed from: g */
    public List<BLiveSpecialEffectResources> f87409g;

    public dqe(String str) {
        this.f87403a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m113007a() {
        this.f87409g = null;
    }

    /* JADX INFO: renamed from: b */
    public d30 m113008b() {
        return this.f87405c;
    }

    /* JADX INFO: renamed from: c */
    public List<BLiveDynamicEffectExtend> m113009c() {
        return this.f87408f;
    }

    /* JADX INFO: renamed from: d */
    public List<BLiveSpecialEffectResources> m113010d() {
        return this.f87409g;
    }

    /* JADX INFO: renamed from: e */
    public d30 m113011e() {
        return this.f87406d;
    }

    /* JADX INFO: renamed from: f */
    public v9j<Boolean> m113012f() {
        return this.f87404b;
    }

    /* JADX INFO: renamed from: g */
    public String m113013g() {
        return this.f87403a;
    }

    /* JADX INFO: renamed from: h */
    public f30<q4l0, BLiveEffect> m113014h() {
        return this.f87407e;
    }

    /* JADX INFO: renamed from: i */
    public dqe m113015i(d30 d30Var) {
        this.f87405c = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public dqe m113016j(List<BLiveDynamicEffectExtend> list) {
        if (vwb.m200296J(list)) {
            return this;
        }
        this.f87408f = list;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public dqe m113017k(List<BLiveSpecialEffectResources> list) {
        this.f87409g = list;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public dqe m113018l(d30 d30Var) {
        this.f87406d = d30Var;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public dqe m113019m(v9j<Boolean> v9jVar) {
        this.f87404b = v9jVar;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public dqe m113020n(f30<q4l0, BLiveEffect> f30Var) {
        this.f87407e = f30Var;
        return this;
    }
}

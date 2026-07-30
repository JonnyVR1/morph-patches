package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveDynamicEffectExtend;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveSpecialEffectResources;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class hre {

    /* JADX INFO: renamed from: a */
    public String f111327a;

    /* JADX INFO: renamed from: b */
    public pcj<Boolean> f111328b;

    /* JADX INFO: renamed from: c */
    public x20 f111329c;

    /* JADX INFO: renamed from: d */
    public x20 f111330d;

    /* JADX INFO: renamed from: e */
    public z20<udl0, BLiveEffect> f111331e;

    /* JADX INFO: renamed from: f */
    public List<BLiveDynamicEffectExtend> f111332f;

    /* JADX INFO: renamed from: g */
    public List<BLiveSpecialEffectResources> f111333g;

    public hre(String str) {
        this.f111327a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m136818a() {
        this.f111333g = null;
    }

    /* JADX INFO: renamed from: b */
    public x20 m136819b() {
        return this.f111329c;
    }

    /* JADX INFO: renamed from: c */
    public List<BLiveDynamicEffectExtend> m136820c() {
        return this.f111332f;
    }

    /* JADX INFO: renamed from: d */
    public List<BLiveSpecialEffectResources> m136821d() {
        return this.f111333g;
    }

    /* JADX INFO: renamed from: e */
    public x20 m136822e() {
        return this.f111330d;
    }

    /* JADX INFO: renamed from: f */
    public pcj<Boolean> m136823f() {
        return this.f111328b;
    }

    /* JADX INFO: renamed from: g */
    public String m136824g() {
        return this.f111327a;
    }

    /* JADX INFO: renamed from: h */
    public z20<udl0, BLiveEffect> m136825h() {
        return this.f111331e;
    }

    /* JADX INFO: renamed from: i */
    public hre m136826i(x20 x20Var) {
        this.f111329c = x20Var;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public hre m136827j(List<BLiveDynamicEffectExtend> list) {
        if (jyb.m147479J(list)) {
            return this;
        }
        this.f111332f = list;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public hre m136828k(List<BLiveSpecialEffectResources> list) {
        this.f111333g = list;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public hre m136829l(x20 x20Var) {
        this.f111330d = x20Var;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public hre m136830m(pcj<Boolean> pcjVar) {
        this.f111328b = pcjVar;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public hre m136831n(z20<udl0, BLiveEffect> z20Var) {
        this.f111331e = z20Var;
        return this;
    }
}

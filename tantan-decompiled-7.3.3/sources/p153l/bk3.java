package p153l;

import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class bk3 {

    /* JADX INFO: renamed from: a */
    public jxd0 f77038a;

    /* JADX INFO: renamed from: b */
    public jxd0 f77039b;

    /* JADX INFO: renamed from: c */
    public jxd0 f77040c;

    /* JADX INFO: renamed from: d */
    public jxd0 f77041d;

    /* JADX INFO: renamed from: e */
    public byd0 f77042e;

    /* JADX INFO: renamed from: f */
    public jxd0 f77043f;

    public bk3() {
        String str = "live_home_reddot" + mbs.m157870o0();
        Boolean bool = Boolean.FALSE;
        this.f77038a = new jxd0(str, bool);
        this.f77039b = new jxd0("live_fake_playground_reddot" + mbs.m157870o0(), bool);
        this.f77040c = new jxd0("background_small_window" + mbs.m157870o0(), bool);
        this.f77041d = new jxd0("has_set_out_app_float_switch" + mbs.m157870o0(), bool);
        this.f77042e = new byd0("intl_voice_activities_in_chat_" + mbs.m157870o0(), 0L);
        this.f77043f = new jxd0(mbs.m157870o0() + "has_verification_anchor", bool);
    }

    /* JADX INFO: renamed from: b */
    public boolean m104788b() {
        nsh0.m164608j("[live]verification", "check anchor verification state: result =" + this.f77043f.get());
        return this.f77043f.get().booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public boolean m104789c(List<LiveSquareTabBean> list) {
        return jyb.m147520m(list, new qcj() { // from class: l.ak3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(y6u.m214508l(((LiveSquareTabBean) obj).getRequestName()));
            }
        }) && !this.f77039b.get().booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public boolean m104790d() {
        return pzi0.m174440E(this.f77042e.get().longValue(), 43200);
    }

    /* JADX INFO: renamed from: e */
    public void m104791e(boolean z) {
        this.f77040c.put(Boolean.valueOf(z));
        this.f77041d.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f */
    public void m104792f() {
        this.f77042e.put(Long.valueOf(pzi0.m174454o()));
    }
}

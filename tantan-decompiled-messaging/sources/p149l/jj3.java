package p149l;

import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class jj3 {

    /* JADX INFO: renamed from: a */
    public hpd0 f118220a;

    /* JADX INFO: renamed from: b */
    public hpd0 f118221b;

    /* JADX INFO: renamed from: c */
    public hpd0 f118222c;

    /* JADX INFO: renamed from: d */
    public hpd0 f118223d;

    /* JADX INFO: renamed from: e */
    public zpd0 f118224e;

    /* JADX INFO: renamed from: f */
    public hpd0 f118225f;

    public jj3() {
        String str = "live_home_reddot" + l9s.m149093o0();
        Boolean bool = Boolean.FALSE;
        this.f118220a = new hpd0(str, bool);
        this.f118221b = new hpd0("live_fake_playground_reddot" + l9s.m149093o0(), bool);
        this.f118222c = new hpd0("background_small_window" + l9s.m149093o0(), bool);
        this.f118223d = new hpd0("has_set_out_app_float_switch" + l9s.m149093o0(), bool);
        this.f118224e = new zpd0("intl_voice_activities_in_chat_" + l9s.m149093o0(), 0L);
        this.f118225f = new hpd0(l9s.m149093o0() + "has_verification_anchor", bool);
    }

    /* JADX INFO: renamed from: b */
    public boolean m141737b() {
        gkh0.m126627j("[live]verification", "check anchor verification state: result =" + this.f118225f.get());
        return this.f118225f.get().booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public boolean m141738c(List<LiveSquareTabBean> list) {
        return vwb.m200337m(list, new w9j() { // from class: l.ij3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(x4u.m207026l(((LiveSquareTabBean) obj).getRequestName()));
            }
        }) && !this.f118221b.get().booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public boolean m141739d() {
        return mqi0.m155930E(this.f118224e.get().longValue(), 43200);
    }

    /* JADX INFO: renamed from: e */
    public void m141740e(boolean z) {
        this.f118222c.put(Boolean.valueOf(z));
        this.f118223d.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f */
    public void m141741f() {
        this.f118224e.put(Long.valueOf(mqi0.m155944o()));
    }
}

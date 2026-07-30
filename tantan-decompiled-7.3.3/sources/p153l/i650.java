package p153l;

import android.text.TextUtils;
import com.immomo.medialog.api.http.LiveXRequestException;
import com.immomo.medialog.util.utilcode.util.NetworkUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class i650 implements fvl {

    /* JADX INFO: renamed from: a */
    private ry3 f113137a;

    /* JADX INFO: renamed from: b */
    private String f113138b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f113139c = new HashMap();

    /* JADX INFO: renamed from: d */
    private Map<String, String> f113140d = new HashMap();

    /* JADX INFO: renamed from: e */
    private n1j[] f113141e;

    /* JADX INFO: renamed from: f */
    private int f113142f;

    /* JADX INFO: renamed from: g */
    private int f113143g;

    public i650(String str, Map<String, String> map, Map<String, String> map2, n1j[] n1jVarArr, rt0 rt0Var) {
        this.f113138b = str;
        this.f113139c.putAll(map);
        this.f113140d.putAll(map2);
        this.f113141e = n1jVarArr;
        m138798e(rt0Var);
    }

    /* JADX INFO: renamed from: c */
    private x1d0 m138796c() {
        return new omj().m168230b(this.f113139c).m168231c(this.f113140d).m168232d(this.f113138b).m168229a();
    }

    /* JADX INFO: renamed from: d */
    private x1d0 m138797d() {
        return new ul80().m196546e(this.f113138b).m196544c(this.f113139c).m196545d(this.f113140d).m196543b(this.f113141e).m196542a();
    }

    /* JADX INFO: renamed from: e */
    private void m138798e(rt0 rt0Var) {
        if (rt0Var == null) {
            rt0Var = new yld();
        }
        if (rt0Var.mo97275d() != null) {
            this.f113139c.putAll(rt0Var.mo97275d());
        }
        if (rt0Var.mo97274c() != null) {
            this.f113140d.putAll(rt0Var.mo97274c());
        }
        if (rt0Var.mo97276e() != null) {
            Iterator<String> it = rt0Var.mo97276e().iterator();
            while (it.hasNext()) {
                this.f113140d.remove(it.next());
            }
        }
        this.f113142f = rt0Var.mo183054b();
        this.f113143g = rt0Var.mo183053a();
    }

    /* JADX INFO: renamed from: f */
    private fvl.C17084a m138799f(boolean z) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        x1d0 x1d0VarM138797d = z ? m138797d() : m138796c();
        if (!NetworkUtils.m19404b()) {
            throw new LiveXRequestException(-1002, null, "错误码：%s,当前网络不可用，请检查");
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i > this.f113142f) {
                throw new LiveXRequestException(-1004, null, "错误码：%s,网络请求失败，请稍后重试");
            }
            h2d0 h2d0Var = new h2d0();
            try {
                ry3 ry3VarMo146674a = vg50.m201217g().mo146674a("REQUEST_INSTANCE", h2d0Var, x1d0VarM138797d);
                this.f113137a = ry3VarMo146674a;
                i5d0 i5d0VarExecute = ry3VarMo146674a.execute();
                if (!i5d0VarExecute.m138661I()) {
                    throw new LiveXRequestException(-1001, null, "错误码：%s,网络请求失败，请稍后重试");
                }
                if (!TextUtils.isEmpty(h2d0Var.m133381a())) {
                    vg50.m201217g().m201218f(h2d0Var.m133382b(), h2d0Var.m133381a(), 0);
                }
                return new fvl.C17084a(i5d0VarExecute.m138673q(), i5d0VarExecute.m138662J(), i5d0VarExecute.m138670k().string());
            } catch (Exception e) {
                if (!TextUtils.isEmpty(h2d0Var.m133381a())) {
                    vg50.m201217g().m201218f(h2d0Var.m133382b(), h2d0Var.m133381a(), 1);
                }
                if (i2 > this.f113142f || System.currentTimeMillis() - jCurrentTimeMillis > this.f113143g) {
                    throw new LiveXRequestException(-1003, e, "错误码：%s,网络请求失败，请稍后重试");
                }
                if (!NetworkUtils.m19404b()) {
                    throw new LiveXRequestException(-1002, null, "错误码：%s,当前网络不可用，请检查");
                }
                Thread.sleep(1000L);
                i = i2;
            }
        }
    }

    @Override // p153l.fvl
    /* JADX INFO: renamed from: a */
    public fvl.C17084a mo127670a() {
        try {
            return m138799f(true);
        } catch (Exception e) {
            if (!(e instanceof LiveXRequestException)) {
                return new fvl.C17084a(-1999, e.getMessage(), null);
            }
            LiveXRequestException liveXRequestException = (LiveXRequestException) e;
            return new fvl.C17084a(liveXRequestException.code, liveXRequestException.showMsg, null);
        }
    }

    @Override // p153l.fvl
    /* JADX INFO: renamed from: b */
    public fvl.C17084a mo127671b() {
        try {
            return m138799f(false);
        } catch (Exception e) {
            if (!(e instanceof LiveXRequestException)) {
                return new fvl.C17084a(-1999, e.getMessage(), null);
            }
            LiveXRequestException liveXRequestException = (LiveXRequestException) e;
            return new fvl.C17084a(liveXRequestException.code, liveXRequestException.showMsg, null);
        }
    }
}

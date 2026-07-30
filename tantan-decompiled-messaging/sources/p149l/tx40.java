package p149l;

import android.text.TextUtils;
import com.immomo.medialog.api.http.LiveXRequestException;
import com.immomo.medialog.util.utilcode.util.NetworkUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class tx40 implements ssl {

    /* JADX INFO: renamed from: a */
    private sx3 f172476a;

    /* JADX INFO: renamed from: b */
    private String f172477b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f172478c = new HashMap();

    /* JADX INFO: renamed from: d */
    private Map<String, String> f172479d = new HashMap();

    /* JADX INFO: renamed from: e */
    private syi[] f172480e;

    /* JADX INFO: renamed from: f */
    private int f172481f;

    /* JADX INFO: renamed from: g */
    private int f172482g;

    public tx40(String str, Map<String, String> map, Map<String, String> map2, syi[] syiVarArr, lt0 lt0Var) {
        this.f172477b = str;
        this.f172478c.putAll(map);
        this.f172479d.putAll(map2);
        this.f172480e = syiVarArr;
        m190941e(lt0Var);
    }

    /* JADX INFO: renamed from: c */
    private stc0 m190939c() {
        return new vjj().m198674b(this.f172478c).m198675c(this.f172479d).m198676d(this.f172477b).m198673a();
    }

    /* JADX INFO: renamed from: d */
    private stc0 m190940d() {
        return new ld80().m149407e(this.f172477b).m149405c(this.f172478c).m149406d(this.f172479d).m149404b(this.f172480e).m149403a();
    }

    /* JADX INFO: renamed from: e */
    private void m190941e(lt0 lt0Var) {
        if (lt0Var == null) {
            lt0Var = new skd();
        }
        if (lt0Var.mo151659d() != null) {
            this.f172478c.putAll(lt0Var.mo151659d());
        }
        if (lt0Var.mo151658c() != null) {
            this.f172479d.putAll(lt0Var.mo151658c());
        }
        if (lt0Var.mo151660e() != null) {
            Iterator<String> it = lt0Var.mo151660e().iterator();
            while (it.hasNext()) {
                this.f172479d.remove(it.next());
            }
        }
        this.f172481f = lt0Var.mo151657b();
        this.f172482g = lt0Var.mo151656a();
    }

    /* JADX INFO: renamed from: f */
    private ssl.C20019a m190942f(boolean z) throws Exception {
        long jCurrentTimeMillis = System.currentTimeMillis();
        stc0 stc0VarM190940d = z ? m190940d() : m190939c();
        if (!NetworkUtils.m18395b()) {
            throw new LiveXRequestException(-1002, null, "错误码：%s,当前网络不可用，请检查");
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i > this.f172481f) {
                throw new LiveXRequestException(-1004, null, "错误码：%s,网络请求失败，请稍后重试");
            }
            euc0 euc0Var = new euc0();
            try {
                sx3 sx3VarMo163106a = o850.m163105g().mo163106a("REQUEST_INSTANCE", euc0Var, stc0VarM190940d);
                this.f172476a = sx3VarMo163106a;
                exc0 exc0VarExecute = sx3VarMo163106a.execute();
                if (!exc0VarExecute.m118597I()) {
                    throw new LiveXRequestException(-1001, null, "错误码：%s,网络请求失败，请稍后重试");
                }
                if (!TextUtils.isEmpty(euc0Var.m118158a())) {
                    o850.m163105g().m163108f(euc0Var.m118159b(), euc0Var.m118158a(), 0);
                }
                return new ssl.C20019a(exc0VarExecute.m118609q(), exc0VarExecute.m118598J(), exc0VarExecute.m118606k().string());
            } catch (Exception e) {
                if (!TextUtils.isEmpty(euc0Var.m118158a())) {
                    o850.m163105g().m163108f(euc0Var.m118159b(), euc0Var.m118158a(), 1);
                }
                if (i2 > this.f172481f || System.currentTimeMillis() - jCurrentTimeMillis > this.f172482g) {
                    throw new LiveXRequestException(-1003, e, "错误码：%s,网络请求失败，请稍后重试");
                }
                if (!NetworkUtils.m18395b()) {
                    throw new LiveXRequestException(-1002, null, "错误码：%s,当前网络不可用，请检查");
                }
                Thread.sleep(1000L);
                i = i2;
            }
        }
    }

    @Override // p149l.ssl
    /* JADX INFO: renamed from: a */
    public ssl.C20019a mo185750a() {
        try {
            return m190942f(true);
        } catch (Exception e) {
            if (!(e instanceof LiveXRequestException)) {
                return new ssl.C20019a(-1999, e.getMessage(), null);
            }
            LiveXRequestException liveXRequestException = (LiveXRequestException) e;
            return new ssl.C20019a(liveXRequestException.code, liveXRequestException.showMsg, null);
        }
    }

    @Override // p149l.ssl
    /* JADX INFO: renamed from: b */
    public ssl.C20019a mo185751b() {
        try {
            return m190942f(false);
        } catch (Exception e) {
            if (!(e instanceof LiveXRequestException)) {
                return new ssl.C20019a(-1999, e.getMessage(), null);
            }
            LiveXRequestException liveXRequestException = (LiveXRequestException) e;
            return new ssl.C20019a(liveXRequestException.code, liveXRequestException.showMsg, null);
        }
    }
}

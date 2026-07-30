package p007l;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.data.Data;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.dbcenter.exception.DbRegisterException;
import com.p000p1.mobile.putong.dbcenter.p002db.opt.TransactionOpt;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.app.SQLDBDamagedException;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import l.d30;
import l.du2;
import l.e30;
import l.qib0;
import l.v9j;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class f8c {

    /* JADX INFO: renamed from: a */
    public volatile a7c f8021a;

    /* JADX INFO: renamed from: b */
    public volatile AtomicBoolean f8022b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, ArrayList<Pair<String, orh0>>> f8023c;

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap<String, b8c> f8024d;

    /* JADX INFO: renamed from: l.f8c$a */
    public static class C2384a {

        /* JADX INFO: renamed from: a */
        public static f8c f8025a = new f8c();
    }

    public f8c() {
        this.f8022b = new AtomicBoolean(false);
        this.f8023c = new HashMap<>();
        this.f8024d = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10078a(d30 d30Var, Envelope envelope, boolean z, boolean z2, boolean z3) {
        BaseData next;
        Data data;
        ArrayList<BaseData> arrayList;
        if (d30Var != null) {
            d30Var.call();
        }
        if (envelope != null) {
            for (pp2 pp2Var : rpq.m13943b().m13946d()) {
                Class<?> clsM10083p = m10083p(pp2Var, 0);
                if (clsM10083p == null || (data = envelope.data) == null || (arrayList = data.dataList) == null) {
                    next = null;
                    break;
                }
                Iterator<BaseData> it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!next.getClass().getName().equals(clsM10083p.getName()));
                Envelope envelope2 = envelope;
                boolean z4 = z;
                boolean z5 = z2;
                boolean z6 = z3;
                if (NullChecker.a(next)) {
                    pp2Var.mo9059a(envelope2, next, z4, z5, z6);
                }
                envelope = envelope2;
                z = z4;
                z2 = z5;
                z3 = z6;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static Class<?> m10081g(Type type, int i) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m10081g(((ParameterizedType) type).getActualTypeArguments()[i], i);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()) + " index " + i);
    }

    /* JADX INFO: renamed from: o */
    public static f8c m10082o() {
        return C2384a.f8025a;
    }

    /* JADX INFO: renamed from: p */
    public static Class<?> m10083p(Object obj, int i) {
        return m10081g(((ParameterizedType) obj.getClass().getGenericInterfaces()[i]).getActualTypeArguments()[i], i);
    }

    /* JADX INFO: renamed from: A */
    public void m10084A(d30 d30Var, d30 d30Var2) {
        if (this.f8021a == null || this.f8021a.m8438n()) {
            return;
        }
        this.f8021a.m8450z(d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: B */
    public void m10085B(d30 d30Var) {
        if (this.f8021a == null || this.f8021a.m8438n() || !this.f8022b.get()) {
            return;
        }
        this.f8021a.m8431A(d30Var);
    }

    /* JADX INFO: renamed from: C */
    public void m10086C(String str) {
        this.f8024d.remove(str);
    }

    /* JADX INFO: renamed from: d */
    public <T> void m10087d(boolean z, v9j<T> v9jVar, e30<T> e30Var, d30 d30Var, String str) {
        if (this.f8021a == null || this.f8021a.m8438n()) {
            return;
        }
        this.f8021a.m8433h(z, v9jVar, e30Var, d30Var, false, str);
    }

    /* JADX INFO: renamed from: e */
    public <T> void m10088e(boolean z, v9j<T> v9jVar, e30<T> e30Var, d30 d30Var, boolean z2, String str) {
        if (this.f8021a == null || this.f8021a.m8438n()) {
            return;
        }
        this.f8021a.m8433h(z, v9jVar, e30Var, d30Var, z2, str);
    }

    /* JADX INFO: renamed from: f */
    public DbRegisterException m10089f(b8c b8cVar) {
        String str;
        if (b8cVar == null) {
            str = "请注册有效的逻辑";
        } else if (TextUtils.isEmpty(b8cVar.mo8747e())) {
            str = "请设置有效的getProviderDescribe";
        } else if (b8cVar.mo8745c() <= 0) {
            str = b8cVar.mo8747e() + ": db version must >= 1";
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new DbRegisterException(str);
    }

    /* JADX INFO: renamed from: h */
    public SQLiteDatabase m10090h() {
        return this.f8021a.m8436k();
    }

    /* JADX INFO: renamed from: i */
    public void m10091i() {
        this.f8022b.set(true);
    }

    /* JADX INFO: renamed from: j */
    public void m10092j() {
        m10093k(true);
    }

    /* JADX INFO: renamed from: k */
    public void m10093k(boolean z) {
        rpq.m13943b().m13950h();
        this.f8023c.clear();
        if (this.f8021a == null || this.f8021a.m8438n()) {
            return;
        }
        this.f8021a.m8437m(z);
    }

    /* JADX INFO: renamed from: l */
    public boolean m10094l() {
        if (this.f8021a == null || this.f8021a.m8438n()) {
            return true;
        }
        return this.f8021a.m8438n();
    }

    /* JADX INFO: renamed from: m */
    public void m10095m() {
        if (this.f8021a == null || this.f8021a.m8438n()) {
            return;
        }
        this.f8021a.m8439o();
    }

    /* JADX INFO: renamed from: n */
    public orh0 m10096n(String str, Object obj) {
        ArrayList<Pair<String, orh0>> arrayList = this.f8023c.get(str);
        if (vwb.J(arrayList)) {
            return null;
        }
        for (Pair<String, orh0> pair : arrayList) {
            if (TextUtils.equals((CharSequence) pair.first, obj.getClass().getName())) {
                return (orh0) pair.second;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public TransactionOpt m10097q() {
        return this.f8021a.f5618q;
    }

    /* JADX INFO: renamed from: r */
    public boolean m10098r() {
        return this.f8022b.get();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.app.SQLDBDamagedException */
    /* JADX INFO: renamed from: s */
    public void m10099s() throws SQLDBDamagedException {
        try {
            String strUserId = qib0.c0.userId();
            du2.a("[common][DatabaseStore]", "DbProviderManager initDb userId:" + strUserId);
            this.f8021a = new a7c("core_v2_" + strUserId, App.d.g("core_v2_" + strUserId), 213, Act.foreground().map(new w9j() { // from class: l.d8c
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Act.r) obj) != null);
                }
            }), new v9j() { // from class: l.e8c
                public final Object call() {
                    return Long.valueOf(App.e());
                }
            });
            du2.a("[common][DatabaseStore]", "DbProviderManager initDb begin init");
            this.f8021a.m8436k();
            this.f8021a.m8446v();
            du2.a("[common][DatabaseStore]", "DbProviderManager initDb preloadProviderInfoCache");
        } catch (SQLiteException e) {
            CrashHelper.c(e);
            if (!NullChecker.a(e.getMessage())) {
                throw e;
            }
            if (!e.getMessage().startsWith("Failed to change locale for db ") && !e.getMessage().contains("no such table")) {
                throw e;
            }
            throw new SQLDBDamagedException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m10100t(b8c b8cVar) {
        this.f8021a.m8447w(b8cVar);
    }

    /* JADX INFO: renamed from: u */
    public void m10101u(Envelope envelope) {
        m10104x(envelope, null, false, false, false);
    }

    /* JADX INFO: renamed from: v */
    public void m10102v(Envelope envelope, d30 d30Var) {
        m10104x(envelope, d30Var, false, false, false);
    }

    /* JADX INFO: renamed from: w */
    public void m10103w(Envelope envelope, d30 d30Var, boolean z, boolean z2) {
        m10104x(envelope, d30Var, z, z2, false);
    }

    /* JADX INFO: renamed from: x */
    public void m10104x(final Envelope envelope, final d30 d30Var, final boolean z, final boolean z2, final boolean z3) {
        m10085B(new d30() { // from class: l.c8c
            public final void call() {
                f8c.m10078a(d30Var, envelope, z, z2, z3);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public void m10105y(b8c b8cVar) {
        du2.a("[common][DatabaseStore]", "DbProviderManager registerModule providerName:" + b8cVar.mo8747e());
        DbRegisterException dbRegisterExceptionM10089f = m10089f(b8cVar);
        if (dbRegisterExceptionM10089f != null) {
            throw dbRegisterExceptionM10089f;
        }
        m10086C(b8cVar.mo8747e());
        if (this.f8024d.get(b8cVar.mo8747e()) != null) {
            return;
        }
        Iterator<b8c> it = this.f8024d.values().iterator();
        while (it.hasNext()) {
            if (b8cVar.mo8746d() == it.next().mo8746d()) {
                throw new DbRegisterException(b8cVar.mo8747e() + ": db provider has same index");
            }
        }
        this.f8024d.put(b8cVar.mo8747e(), b8cVar);
        m10100t(b8cVar);
    }

    /* JADX INFO: renamed from: z */
    public void m10106z() {
        this.f8022b.set(false);
    }
}

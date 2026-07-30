package p149l;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.app.SQLDBDamagedException;
import com.p046p1.mobile.putong.data.Data;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.dbcenter.exception.DbRegisterException;
import com.p046p1.mobile.putong.dbcenter.p057db.opt.TransactionOpt;
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

/* JADX INFO: loaded from: classes12.dex */
public class f8c {

    /* JADX INFO: renamed from: a */
    public volatile a7c f96335a;

    /* JADX INFO: renamed from: b */
    public volatile AtomicBoolean f96336b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, ArrayList<Pair<String, orh0>>> f96337c;

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap<String, b8c> f96338d;

    /* JADX INFO: renamed from: l.f8c$a */
    public static class C16773a {

        /* JADX INFO: renamed from: a */
        public static f8c f96339a = new f8c();
    }

    public f8c() {
        this.f96336b = new AtomicBoolean(false);
        this.f96337c = new HashMap<>();
        this.f96338d = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m119874a(d30 d30Var, Envelope envelope, boolean z, boolean z2, boolean z3) {
        BaseData next;
        Data data;
        ArrayList<BaseData> arrayList;
        if (d30Var != null) {
            d30Var.call();
        }
        if (envelope != null) {
            for (pp2 pp2Var : rpq.m180387b().m180390d()) {
                Class<?> clsM119879p = m119879p(pp2Var, 0);
                if (clsM119879p == null || (data = envelope.data) == null || (arrayList = data.dataList) == null) {
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
                } while (!next.getClass().getName().equals(clsM119879p.getName()));
                Envelope envelope2 = envelope;
                boolean z4 = z;
                boolean z5 = z2;
                boolean z6 = z3;
                if (NullChecker.m81303a(next)) {
                    pp2Var.mo104455a(envelope2, next, z4, z5, z6);
                }
                envelope = envelope2;
                z = z4;
                z2 = z5;
                z3 = z6;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static Class<?> m119877g(Type type, int i) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m119877g(((ParameterizedType) type).getActualTypeArguments()[i], i);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()) + " index " + i);
    }

    /* JADX INFO: renamed from: o */
    public static f8c m119878o() {
        return C16773a.f96339a;
    }

    /* JADX INFO: renamed from: p */
    public static Class<?> m119879p(Object obj, int i) {
        return m119877g(((ParameterizedType) obj.getClass().getGenericInterfaces()[i]).getActualTypeArguments()[i], i);
    }

    /* JADX INFO: renamed from: A */
    public void m119880A(d30 d30Var, d30 d30Var2) {
        if (this.f96335a == null || this.f96335a.m95272n()) {
            return;
        }
        this.f96335a.m95284z(d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: B */
    public void m119881B(d30 d30Var) {
        if (this.f96335a == null || this.f96335a.m95272n() || !this.f96336b.get()) {
            return;
        }
        this.f96335a.m95265A(d30Var);
    }

    /* JADX INFO: renamed from: C */
    public void m119882C(String str) {
        this.f96338d.remove(str);
    }

    /* JADX INFO: renamed from: d */
    public <T> void m119883d(boolean z, v9j<T> v9jVar, e30<T> e30Var, d30 d30Var, String str) {
        if (this.f96335a == null || this.f96335a.m95272n()) {
            return;
        }
        this.f96335a.m95267h(z, v9jVar, e30Var, d30Var, false, str);
    }

    /* JADX INFO: renamed from: e */
    public <T> void m119884e(boolean z, v9j<T> v9jVar, e30<T> e30Var, d30 d30Var, boolean z2, String str) {
        if (this.f96335a == null || this.f96335a.m95272n()) {
            return;
        }
        this.f96335a.m95267h(z, v9jVar, e30Var, d30Var, z2, str);
    }

    /* JADX INFO: renamed from: f */
    public DbRegisterException m119885f(b8c b8cVar) {
        String str;
        if (b8cVar == null) {
            str = "请注册有效的逻辑";
        } else if (TextUtils.isEmpty(b8cVar.mo100763e())) {
            str = "请设置有效的getProviderDescribe";
        } else if (b8cVar.mo100761c() <= 0) {
            str = b8cVar.mo100763e() + ": db version must >= 1";
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new DbRegisterException(str);
    }

    /* JADX INFO: renamed from: h */
    public SQLiteDatabase m119886h() {
        return this.f96335a.m95270k();
    }

    /* JADX INFO: renamed from: i */
    public void m119887i() {
        this.f96336b.set(true);
    }

    /* JADX INFO: renamed from: j */
    public void m119888j() {
        m119889k(true);
    }

    /* JADX INFO: renamed from: k */
    public void m119889k(boolean z) {
        rpq.m180387b().m180394h();
        this.f96337c.clear();
        if (this.f96335a == null || this.f96335a.m95272n()) {
            return;
        }
        this.f96335a.m95271m(z);
    }

    /* JADX INFO: renamed from: l */
    public boolean m119890l() {
        if (this.f96335a == null || this.f96335a.m95272n()) {
            return true;
        }
        return this.f96335a.m95272n();
    }

    /* JADX INFO: renamed from: m */
    public void m119891m() {
        if (this.f96335a == null || this.f96335a.m95272n()) {
            return;
        }
        this.f96335a.m95273o();
    }

    /* JADX INFO: renamed from: n */
    public orh0 m119892n(String str, Object obj) {
        ArrayList<Pair<String, orh0>> arrayList = this.f96337c.get(str);
        if (vwb.m200296J(arrayList)) {
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
    public TransactionOpt m119893q() {
        return this.f96335a.f67888q;
    }

    /* JADX INFO: renamed from: r */
    public boolean m119894r() {
        return this.f96336b.get();
    }

    /* JADX INFO: renamed from: s */
    public void m119895s() {
        try {
            String strUserId = qib0.f154714c0.userId();
            du2.m113670a("[common][DatabaseStore]", "DbProviderManager initDb userId:" + strUserId);
            this.f96335a = new a7c("core_v2_" + strUserId, App.f15368d.m20432g("core_v2_" + strUserId), 213, Act.foreground().map(new w9j() { // from class: l.d8c
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Act.C4299r) obj) != null);
                }
            }), new v9j() { // from class: l.e8c
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return Long.valueOf(App.m20426e());
                }
            });
            du2.m113670a("[common][DatabaseStore]", "DbProviderManager initDb begin init");
            this.f96335a.m95270k();
            this.f96335a.m95280v();
            du2.m113670a("[common][DatabaseStore]", "DbProviderManager initDb preloadProviderInfoCache");
        } catch (SQLiteException e) {
            CrashHelper.m81296c(e);
            if (!NullChecker.m81303a(e.getMessage())) {
                throw e;
            }
            if (!e.getMessage().startsWith("Failed to change locale for db ") && !e.getMessage().contains("no such table")) {
                throw e;
            }
            throw new SQLDBDamagedException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m119896t(b8c b8cVar) {
        this.f96335a.m95281w(b8cVar);
    }

    /* JADX INFO: renamed from: u */
    public void m119897u(Envelope envelope) {
        m119900x(envelope, null, false, false, false);
    }

    /* JADX INFO: renamed from: v */
    public void m119898v(Envelope envelope, d30 d30Var) {
        m119900x(envelope, d30Var, false, false, false);
    }

    /* JADX INFO: renamed from: w */
    public void m119899w(Envelope envelope, d30 d30Var, boolean z, boolean z2) {
        m119900x(envelope, d30Var, z, z2, false);
    }

    /* JADX INFO: renamed from: x */
    public void m119900x(final Envelope envelope, final d30 d30Var, final boolean z, final boolean z2, final boolean z3) {
        m119881B(new d30() { // from class: l.c8c
            @Override // p149l.d30
            public final void call() {
                f8c.m119874a(d30Var, envelope, z, z2, z3);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public void m119901y(b8c b8cVar) {
        du2.m113670a("[common][DatabaseStore]", "DbProviderManager registerModule providerName:" + b8cVar.mo100763e());
        DbRegisterException dbRegisterExceptionM119885f = m119885f(b8cVar);
        if (dbRegisterExceptionM119885f != null) {
            throw dbRegisterExceptionM119885f;
        }
        m119882C(b8cVar.mo100763e());
        if (this.f96338d.get(b8cVar.mo100763e()) != null) {
            return;
        }
        Iterator<b8c> it = this.f96338d.values().iterator();
        while (it.hasNext()) {
            if (b8cVar.mo100762d() == it.next().mo100762d()) {
                throw new DbRegisterException(b8cVar.mo100763e() + ": db provider has same index");
            }
        }
        this.f96338d.put(b8cVar.mo100763e(), b8cVar);
        m119896t(b8cVar);
    }

    /* JADX INFO: renamed from: z */
    public void m119902z() {
        this.f96336b.set(false);
    }
}

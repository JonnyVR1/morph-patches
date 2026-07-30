package p153l;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.app.SQLDBDamagedException;
import com.p051p1.mobile.putong.data.Data;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.dbcenter.exception.DbRegisterException;
import com.p051p1.mobile.putong.dbcenter.p062db.opt.TransactionOpt;
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
public class l9c {

    /* JADX INFO: renamed from: a */
    public volatile g8c f130583a;

    /* JADX INFO: renamed from: b */
    public volatile AtomicBoolean f130584b;

    /* JADX INFO: renamed from: c */
    public HashMap<String, ArrayList<Pair<String, wzh0>>> f130585c;

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap<String, h9c> f130586d;

    /* JADX INFO: renamed from: l.l9c$a */
    public static class C18371a {

        /* JADX INFO: renamed from: a */
        public static l9c f130587a = new l9c();
    }

    public l9c() {
        this.f130584b = new AtomicBoolean(false);
        this.f130585c = new HashMap<>();
        this.f130586d = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m153390a(x20 x20Var, Envelope envelope, boolean z, boolean z2, boolean z3) {
        BaseData next;
        Data data;
        ArrayList<BaseData> arrayList;
        if (x20Var != null) {
            x20Var.call();
        }
        if (envelope != null) {
            for (gq2 gq2Var : rrq.m182815b().m182818d()) {
                Class<?> clsM153395p = m153395p(gq2Var, 0);
                if (clsM153395p == null || (data = envelope.data) == null || (arrayList = data.dataList) == null) {
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
                } while (!next.getClass().getName().equals(clsM153395p.getName()));
                Envelope envelope2 = envelope;
                boolean z4 = z;
                boolean z5 = z2;
                boolean z6 = z3;
                if (NullChecker.m82486a(next)) {
                    gq2Var.mo131338a(envelope2, next, z4, z5, z6);
                }
                envelope = envelope2;
                z = z4;
                z2 = z5;
                z3 = z6;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static Class<?> m153393g(Type type, int i) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m153393g(((ParameterizedType) type).getActualTypeArguments()[i], i);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()) + " index " + i);
    }

    /* JADX INFO: renamed from: o */
    public static l9c m153394o() {
        return C18371a.f130587a;
    }

    /* JADX INFO: renamed from: p */
    public static Class<?> m153395p(Object obj, int i) {
        return m153393g(((ParameterizedType) obj.getClass().getGenericInterfaces()[i]).getActualTypeArguments()[i], i);
    }

    /* JADX INFO: renamed from: A */
    public void m153396A(x20 x20Var, x20 x20Var2) {
        if (this.f130583a == null || this.f130583a.m129392n()) {
            return;
        }
        this.f130583a.m129404z(x20Var, x20Var2);
    }

    /* JADX INFO: renamed from: B */
    public void m153397B(x20 x20Var) {
        if (this.f130583a == null || this.f130583a.m129392n() || !this.f130584b.get()) {
            return;
        }
        this.f130583a.m129385A(x20Var);
    }

    /* JADX INFO: renamed from: C */
    public void m153398C(String str) {
        this.f130586d.remove(str);
    }

    /* JADX INFO: renamed from: d */
    public <T> void m153399d(boolean z, pcj<T> pcjVar, y20<T> y20Var, x20 x20Var, String str) {
        if (this.f130583a == null || this.f130583a.m129392n()) {
            return;
        }
        this.f130583a.m129387h(z, pcjVar, y20Var, x20Var, false, str);
    }

    /* JADX INFO: renamed from: e */
    public <T> void m153400e(boolean z, pcj<T> pcjVar, y20<T> y20Var, x20 x20Var, boolean z2, String str) {
        if (this.f130583a == null || this.f130583a.m129392n()) {
            return;
        }
        this.f130583a.m129387h(z, pcjVar, y20Var, x20Var, z2, str);
    }

    /* JADX INFO: renamed from: f */
    public DbRegisterException m153401f(h9c h9cVar) {
        String str;
        if (h9cVar == null) {
            str = "请注册有效的逻辑";
        } else if (TextUtils.isEmpty(h9cVar.mo133947e())) {
            str = "请设置有效的getProviderDescribe";
        } else if (h9cVar.mo133945c() <= 0) {
            str = h9cVar.mo133947e() + ": db version must >= 1";
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new DbRegisterException(str);
    }

    /* JADX INFO: renamed from: h */
    public SQLiteDatabase m153402h() {
        return this.f130583a.m129390k();
    }

    /* JADX INFO: renamed from: i */
    public void m153403i() {
        this.f130584b.set(true);
    }

    /* JADX INFO: renamed from: j */
    public void m153404j() {
        m153405k(true);
    }

    /* JADX INFO: renamed from: k */
    public void m153405k(boolean z) {
        rrq.m182815b().m182822h();
        this.f130585c.clear();
        if (this.f130583a == null || this.f130583a.m129392n()) {
            return;
        }
        this.f130583a.m129391m(z);
    }

    /* JADX INFO: renamed from: l */
    public boolean m153406l() {
        if (this.f130583a == null || this.f130583a.m129392n()) {
            return true;
        }
        return this.f130583a.m129392n();
    }

    /* JADX INFO: renamed from: m */
    public void m153407m() {
        if (this.f130583a == null || this.f130583a.m129392n()) {
            return;
        }
        this.f130583a.m129393o();
    }

    /* JADX INFO: renamed from: n */
    public wzh0 m153408n(String str, Object obj) {
        ArrayList<Pair<String, wzh0>> arrayList = this.f130585c.get(str);
        if (jyb.m147479J(arrayList)) {
            return null;
        }
        for (Pair<String, wzh0> pair : arrayList) {
            if (TextUtils.equals((CharSequence) pair.first, obj.getClass().getName())) {
                return (wzh0) pair.second;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public TransactionOpt m153409q() {
        return this.f130583a.f102673q;
    }

    /* JADX INFO: renamed from: r */
    public boolean m153410r() {
        return this.f130584b.get();
    }

    /* JADX INFO: renamed from: s */
    public void m153411s() {
        try {
            String strUserId = uqb0.f180397c0.userId();
            tu2.m192703a("[common][DatabaseStore]", "DbProviderManager initDb userId:" + strUserId);
            this.f130583a = new g8c("core_v2_" + strUserId, App.f16087d.m21431g("core_v2_" + strUserId), 213, Act.foreground().map(new qcj() { // from class: l.j9c
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Act.C4450r) obj) != null);
                }
            }), new pcj() { // from class: l.k9c
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return Long.valueOf(App.m21425e());
                }
            });
            tu2.m192703a("[common][DatabaseStore]", "DbProviderManager initDb begin init");
            this.f130583a.m129390k();
            this.f130583a.m129400v();
            tu2.m192703a("[common][DatabaseStore]", "DbProviderManager initDb preloadProviderInfoCache");
        } catch (SQLiteException e) {
            CrashHelper.m82479c(e);
            if (!NullChecker.m82486a(e.getMessage())) {
                throw e;
            }
            if (!e.getMessage().startsWith("Failed to change locale for db ") && !e.getMessage().contains("no such table")) {
                throw e;
            }
            throw new SQLDBDamagedException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m153412t(h9c h9cVar) {
        this.f130583a.m129401w(h9cVar);
    }

    /* JADX INFO: renamed from: u */
    public void m153413u(Envelope envelope) {
        m153416x(envelope, null, false, false, false);
    }

    /* JADX INFO: renamed from: v */
    public void m153414v(Envelope envelope, x20 x20Var) {
        m153416x(envelope, x20Var, false, false, false);
    }

    /* JADX INFO: renamed from: w */
    public void m153415w(Envelope envelope, x20 x20Var, boolean z, boolean z2) {
        m153416x(envelope, x20Var, z, z2, false);
    }

    /* JADX INFO: renamed from: x */
    public void m153416x(final Envelope envelope, final x20 x20Var, final boolean z, final boolean z2, final boolean z3) {
        m153397B(new x20() { // from class: l.i9c
            @Override // p153l.x20
            public final void call() {
                l9c.m153390a(x20Var, envelope, z, z2, z3);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public void m153417y(h9c h9cVar) {
        tu2.m192703a("[common][DatabaseStore]", "DbProviderManager registerModule providerName:" + h9cVar.mo133947e());
        DbRegisterException dbRegisterExceptionM153401f = m153401f(h9cVar);
        if (dbRegisterExceptionM153401f != null) {
            throw dbRegisterExceptionM153401f;
        }
        m153398C(h9cVar.mo133947e());
        if (this.f130586d.get(h9cVar.mo133947e()) != null) {
            return;
        }
        Iterator<h9c> it = this.f130586d.values().iterator();
        while (it.hasNext()) {
            if (h9cVar.mo133946d() == it.next().mo133946d()) {
                throw new DbRegisterException(h9cVar.mo133947e() + ": db provider has same index");
            }
        }
        this.f130586d.put(h9cVar.mo133947e(), h9cVar);
        m153412t(h9cVar);
    }

    /* JADX INFO: renamed from: z */
    public void m153418z() {
        this.f130584b.set(false);
    }
}

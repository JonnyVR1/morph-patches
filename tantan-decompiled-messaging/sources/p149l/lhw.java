package p149l;

import java.util.List;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes2.dex */
public class lhw {

    /* JADX INFO: renamed from: a */
    private Database f128145a;

    /* JADX INFO: renamed from: b */
    private l2c f128146b;

    /* JADX INFO: renamed from: l.lhw$b */
    public static class C18224b {

        /* JADX INFO: renamed from: a */
        private static lhw f128147a = new lhw();
    }

    /* JADX INFO: renamed from: a */
    private boolean m149856a() {
        if (this.f128146b != null) {
            return true;
        }
        Database writableDb = new khw(ev0.m118233a(), "mk_bridge_stat").getWritableDb();
        this.f128145a = writableDb;
        l2c l2cVarNewSession = new j2c(writableDb).newSession();
        this.f128146b = l2cVarNewSession;
        m149858d(l2cVarNewSession);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static lhw m149857b() {
        return C18224b.f128147a;
    }

    /* JADX INFO: renamed from: d */
    private void m149858d(l2c l2cVar) {
        boolean z = ev0.f93301b;
        QueryBuilder.LOG_SQL = z;
        QueryBuilder.LOG_VALUES = z;
        this.f128146b = l2cVar;
    }

    /* JADX INFO: renamed from: c */
    public List<ghw> m149859c() {
        m149856a();
        if (this.f128145a != null) {
            return this.f128146b.m148279a().queryBuilder().where(hhw.C17319a.f107836h.m221110eq(0), new WhereCondition[0]).list();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public void m149860e(List<ghw> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        m149856a();
        if (this.f128145a != null) {
            hhw hhwVarM148279a = this.f128146b.m148279a();
            for (ghw ghwVar : list) {
                if (hhwVarM148279a.queryBuilder().where(hhwVarM148279a.getPkProperty().m221110eq(ghwVar.f102820a), new WhereCondition[0]).count() <= 0) {
                    hhwVarM148279a.insert(ghwVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m149861f(List<ghw> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        m149856a();
        this.f128146b.m148279a().updateInTx(list);
    }

    private lhw() {
    }
}

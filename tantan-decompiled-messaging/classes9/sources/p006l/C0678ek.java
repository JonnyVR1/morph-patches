package p006l;

import com.p000p1.mobile.putong.account.data.AccountCommonData;
import com.p1.mobile.putong.data.Envelope;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import l.b8c;
import l.orh0;
import l.pp2;
import l.rpq;

/* JADX INFO: renamed from: l.ek */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0678ek extends b8c implements pp2<AccountCommonData> {
    /* JADX INFO: renamed from: c */
    public int m14590c() {
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public int m14591d() {
        return 3;
    }

    /* JADX INFO: renamed from: e */
    public String m14592e() {
        return "account";
    }

    /* JADX INFO: renamed from: f */
    public ArrayList<orh0> m14593f() {
        return super.f();
    }

    /* JADX INFO: renamed from: g */
    public void m14594g() {
        rpq.b().e(AccountCommonData.JSON_ADAPTER, this);
    }

    /* JADX INFO: renamed from: i */
    public void m14596i() {
        super.i();
        rpq.b().i(this, AccountCommonData.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: h */
    public void m14595h() {
    }

    /* JADX INFO: renamed from: b */
    public void m14589b(Envelope envelope) {
    }

    /* JADX INFO: renamed from: j */
    public void m14597j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m14588a(Envelope envelope, AccountCommonData accountCommonData, boolean z, boolean z2, boolean z3) {
    }
}

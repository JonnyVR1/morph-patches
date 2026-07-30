package p153l;

import com.p051p1.mobile.putong.account.data.AccountCommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.SchemeKey;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.zj */
/* JADX INFO: loaded from: classes9.dex */
public class C21827zj extends h9c implements gq2<AccountCommonData> {
    @Override // p153l.h9c
    /* JADX INFO: renamed from: c */
    public int mo133945c() {
        return 1;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: d */
    public int mo133946d() {
        return 3;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: e */
    public String mo133947e() {
        return SchemeKey.account;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: f */
    public ArrayList<wzh0> mo134045f() {
        return super.mo134045f();
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: g */
    public void mo133948g() {
        rrq.m182815b().m182819e(AccountCommonData.JSON_ADAPTER, this);
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: i */
    public void mo133950i() {
        super.mo133950i();
        rrq.m182815b().m182823i(this, AccountCommonData.JSON_ADAPTER);
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: h */
    public void mo133949h() {
    }

    @Override // p153l.gq2
    /* JADX INFO: renamed from: b */
    public void mo131339b(Envelope envelope) {
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: j */
    public void mo133951j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // p153l.gq2
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo131338a(Envelope envelope, AccountCommonData accountCommonData, boolean z, boolean z2, boolean z3) {
    }
}

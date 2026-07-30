package p149l;

import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.live.base.data.LiveCommonData;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public class g6s extends b8c implements pp2<LiveCommonData> {
    @Override // p149l.b8c
    /* JADX INFO: renamed from: c */
    public int mo100761c() {
        return 1;
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: d */
    public int mo100762d() {
        return 4;
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: e */
    public String mo100763e() {
        return "live";
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: g */
    public void mo100765g() {
        rpq.m180387b().m180391e(LiveCommonData.JSON_ADAPTER, this);
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: i */
    public void mo100767i() {
        super.mo100767i();
        rpq.m180387b().m180395i(this, LiveCommonData.JSON_ADAPTER);
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: h */
    public void mo100766h() {
    }

    @Override // p149l.pp2
    /* JADX INFO: renamed from: b */
    public void mo104456b(Envelope envelope) {
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: j */
    public void mo100768j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // p149l.pp2
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo104455a(Envelope envelope, LiveCommonData liveCommonData, boolean z, boolean z2, boolean z3) {
    }
}

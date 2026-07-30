package p153l;

import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.live.base.data.LiveCommonData;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public class h8s extends h9c implements gq2<LiveCommonData> {
    @Override // p153l.h9c
    /* JADX INFO: renamed from: c */
    public int mo133945c() {
        return 1;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: d */
    public int mo133946d() {
        return 4;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: e */
    public String mo133947e() {
        return "live";
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: g */
    public void mo133948g() {
        rrq.m182815b().m182819e(LiveCommonData.JSON_ADAPTER, this);
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: i */
    public void mo133950i() {
        super.mo133950i();
        rrq.m182815b().m182823i(this, LiveCommonData.JSON_ADAPTER);
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
    public void mo131338a(Envelope envelope, LiveCommonData liveCommonData, boolean z, boolean z2, boolean z3) {
    }
}

package p007l;

import android.app.Activity;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.DoublePair;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p000p1.mobile.putong.feed.data.PoiMarkInfoData;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.orm.OrderedColumn;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import l.d30;
import l.mkd0;
import l.mqi0;
import l.vwb;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class w980 {

    /* JADX INFO: renamed from: f */
    public static int f14475f = 86400000;

    /* JADX INFO: renamed from: g */
    public static volatile w980 f14476g;

    /* JADX INFO: renamed from: a */
    public PoiGuidePopWindow f14477a;

    /* JADX INFO: renamed from: b */
    public PoiMarkInfoData f14478b;

    /* JADX INFO: renamed from: c */
    public d30 f14479c;

    /* JADX INFO: renamed from: d */
    public int f14480d;

    /* JADX INFO: renamed from: e */
    public int f14481e;

    public w980() {
        this.f14480d = 0;
        this.f14481e = 0;
        this.f14480d = tih.m14553b();
        this.f14481e = tih.m14554c();
    }

    /* JADX INFO: renamed from: h */
    public static w980 m15748h() {
        if (f14476g == null) {
            synchronized (w980.class) {
                try {
                    if (f14476g == null) {
                        f14476g = new w980();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14476g;
    }

    /* JADX INFO: renamed from: e */
    public void m15749e(d30 d30Var) {
        this.f14479c = d30Var;
    }

    /* JADX INFO: renamed from: f */
    public boolean m15750f(Act act) {
        if (this.f14477a == null) {
            return false;
        }
        if (act == null) {
            act = m15751g();
        }
        if (act != null && !m15753j() && !m15752i() && !m15755l() && this.f14477a.firstTimeShow && cjh.m9194d()) {
            if (TEnum.equals(this.f14477a.type, "share")) {
                m15748h().m15765v();
                r980.m13888c(act, this.f14477a, true, null);
                return true;
            }
            if (TEnum.equals(this.f14477a.type, "poi")) {
                m15748h().m15764u();
                r980.m13887b(act, this.f14477a, true, null);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public Act m15751g() {
        Iterator it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) it.next()).iterator();
            while (it2.hasNext()) {
                Act act = (Activity) ((Act.r) it2.next()).a.get();
                if (NullChecker.a(act) && (act instanceof Act)) {
                    return act;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m15752i() {
        return NullChecker.a(this.f14478b) && (mqi0.o() - this.f14478b.punchInDate) - ((long) (this.f14481e * f14475f)) < 0;
    }

    /* JADX INFO: renamed from: j */
    public boolean m15753j() {
        return NullChecker.a(this.f14478b) && (mqi0.o() - this.f14478b.triggerDate) - ((long) (this.f14480d * f14475f)) < 0;
    }

    /* JADX INFO: renamed from: k */
    public boolean m15754k() {
        return NullChecker.a(this.f14477a);
    }

    /* JADX INFO: renamed from: l */
    public boolean m15755l() {
        return m15756m() || m15757n();
    }

    /* JADX INFO: renamed from: m */
    public boolean m15756m() {
        if (((Long) FeedModule.f316d.f14938M.get()).longValue() > 0) {
            return mqi0.D(((Long) FeedModule.f316d.f14938M.get()).longValue());
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m15757n() {
        if (((Long) FeedModule.f316d.f14940N.get()).longValue() > 0) {
            return mqi0.D(((Long) FeedModule.f316d.f14940N.get()).longValue());
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m15758o(MessageLocation messageLocation) throws Exception {
        PoiMarkInfoData poiMarkInfoDataNew_;
        if (NullChecker.a(this.f14478b) && TextUtils.equals(this.f14478b.poiName, messageLocation.name)) {
            poiMarkInfoDataNew_ = this.f14478b;
        } else {
            List<PoiMarkInfoData> listQuery = FeedModule.f321i.f6468g.query(PoiMarkInfoData.POINAME.EQ(messageLocation.name), ((OrderedColumn) PoiMarkInfoData._ID).DESC, 1);
            poiMarkInfoDataNew_ = !vwb.J(listQuery) ? listQuery.get(0) : null;
            if (poiMarkInfoDataNew_ == null) {
                poiMarkInfoDataNew_ = PoiMarkInfoData.new_();
                ((DbObject) poiMarkInfoDataNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) App.i.get()).intValue());
                poiMarkInfoDataNew_.poiName = messageLocation.name;
                poiMarkInfoDataNew_.address = messageLocation.address;
                DoublePair doublePair = messageLocation.coordinates;
                poiMarkInfoDataNew_.latitude = doublePair.first;
                poiMarkInfoDataNew_.longitude = doublePair.second;
                poiMarkInfoDataNew_.triggerDate = 0L;
                poiMarkInfoDataNew_.triggerTimes = 0;
            }
        }
        poiMarkInfoDataNew_.punchInDate = mqi0.o();
        final PoiMarkInfoData poiMarkInfoDataM19716clone = poiMarkInfoDataNew_.m19716clone();
        f8c.m10082o().m10085B(new d30() { // from class: l.v980
            public final void call() {
                FeedModule.f321i.f6468g.upsert(poiMarkInfoDataM19716clone);
            }
        });
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m15759p() {
        FeedModule.f321i.f6468g.upsert(this.f14478b.m19716clone());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m15760q(MessageLocation messageLocation) throws Exception {
        PoiMarkInfoData poiMarkInfoData = this.f14478b;
        if (poiMarkInfoData == null) {
            PoiMarkInfoData poiMarkInfoDataNew_ = PoiMarkInfoData.new_();
            this.f14478b = poiMarkInfoDataNew_;
            ((DbObject) poiMarkInfoDataNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) App.i.get()).intValue());
            PoiMarkInfoData poiMarkInfoData2 = this.f14478b;
            poiMarkInfoData2.poiName = messageLocation.name;
            poiMarkInfoData2.address = messageLocation.address;
            DoublePair doublePair = messageLocation.coordinates;
            poiMarkInfoData2.latitude = doublePair.first;
            poiMarkInfoData2.longitude = doublePair.second;
            poiMarkInfoData2.triggerDate = mqi0.o();
            PoiMarkInfoData poiMarkInfoData3 = this.f14478b;
            poiMarkInfoData3.punchInDate = 0L;
            poiMarkInfoData3.triggerTimes = 1;
        } else {
            poiMarkInfoData.triggerDate = mqi0.o();
            this.f14478b.triggerTimes++;
        }
        f8c.m10082o().m10085B(new d30() { // from class: l.t980
            public final void call() {
                this.f13235a.m15759p();
            }
        });
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: r */
    public void m15761r(final MessageLocation messageLocation) {
        c.fromCallable(new Callable() { // from class: l.u980
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f13596a.m15758o(messageLocation);
            }
        }).compose(mkd0.C()).subscribe(mkd0.B());
    }

    /* JADX INFO: renamed from: s */
    public final void m15762s() {
        m15763t(this.f14477a.location);
    }

    /* JADX INFO: renamed from: t */
    public void m15763t(final MessageLocation messageLocation) {
        c.fromCallable(new Callable() { // from class: l.s980
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12841a.m15760q(messageLocation);
            }
        }).compose(mkd0.C()).subscribe(mkd0.B());
    }

    /* JADX INFO: renamed from: u */
    public void m15764u() {
        FeedModule.f316d.f14938M.put(Long.valueOf(mqi0.o()));
        m15762s();
    }

    /* JADX INFO: renamed from: v */
    public void m15765v() {
        FeedModule.f316d.f14940N.put(Long.valueOf(mqi0.o()));
        m15762s();
    }
}

package p149l;

import android.app.Activity;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p046p1.mobile.putong.feed.data.PoiMarkInfoData;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class w980 {

    /* JADX INFO: renamed from: f */
    public static int f185312f = 86400000;

    /* JADX INFO: renamed from: g */
    public static volatile w980 f185313g;

    /* JADX INFO: renamed from: a */
    public PoiGuidePopWindow f185314a;

    /* JADX INFO: renamed from: b */
    public PoiMarkInfoData f185315b;

    /* JADX INFO: renamed from: c */
    public d30 f185316c;

    /* JADX INFO: renamed from: d */
    public int f185317d;

    /* JADX INFO: renamed from: e */
    public int f185318e;

    public w980() {
        this.f185317d = 0;
        this.f185318e = 0;
        this.f185317d = tih.m189186b();
        this.f185318e = tih.m189187c();
    }

    /* JADX INFO: renamed from: h */
    public static w980 m202252h() {
        if (f185313g == null) {
            synchronized (w980.class) {
                try {
                    if (f185313g == null) {
                        f185313g = new w980();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f185313g;
    }

    /* JADX INFO: renamed from: e */
    public void m202253e(d30 d30Var) {
        this.f185316c = d30Var;
    }

    /* JADX INFO: renamed from: f */
    public boolean m202254f(Act act) {
        if (this.f185314a == null) {
            return false;
        }
        if (act == null) {
            act = m202255g();
        }
        if (act != null && !m202257j() && !m202256i() && !m202259l() && this.f185314a.firstTimeShow && cjh.m107158d()) {
            if (TEnum.equals(this.f185314a.type, "share")) {
                m202252h().m202269v();
                r980.m178299c(act, this.f185314a, true, null);
                return true;
            }
            if (TEnum.equals(this.f185314a.type, "poi")) {
                m202252h().m202268u();
                r980.m178298b(act, this.f185314a, true, null);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public Act m202255g() {
        Iterator<ArrayList<Act.C4299r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4299r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f15343a.get();
                if (NullChecker.m81303a(activity) && (activity instanceof Act)) {
                    return (Act) activity;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m202256i() {
        return NullChecker.m81303a(this.f185315b) && (mqi0.m155944o() - this.f185315b.punchInDate) - ((long) (this.f185318e * f185312f)) < 0;
    }

    /* JADX INFO: renamed from: j */
    public boolean m202257j() {
        return NullChecker.m81303a(this.f185315b) && (mqi0.m155944o() - this.f185315b.triggerDate) - ((long) (this.f185317d * f185312f)) < 0;
    }

    /* JADX INFO: renamed from: k */
    public boolean m202258k() {
        return NullChecker.m81303a(this.f185314a);
    }

    /* JADX INFO: renamed from: l */
    public boolean m202259l() {
        return m202260m() || m202261n();
    }

    /* JADX INFO: renamed from: m */
    public boolean m202260m() {
        if (FeedModule.f38855d.f193003M.get().longValue() > 0) {
            return mqi0.m155929D(FeedModule.f38855d.f193003M.get().longValue());
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m202261n() {
        if (FeedModule.f38855d.f193005N.get().longValue() > 0) {
            return mqi0.m155929D(FeedModule.f38855d.f193005N.get().longValue());
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m202262o(MessageLocation messageLocation) throws Exception {
        PoiMarkInfoData poiMarkInfoDataNew_;
        if (NullChecker.m81303a(this.f185315b) && TextUtils.equals(this.f185315b.poiName, messageLocation.name)) {
            poiMarkInfoDataNew_ = this.f185315b;
        } else {
            List<PoiMarkInfoData> listQuery = FeedModule.f38860i.f77917g.query(PoiMarkInfoData.POINAME.mo60175EQ(messageLocation.name), PoiMarkInfoData._ID.DESC, 1);
            poiMarkInfoDataNew_ = !vwb.m200296J(listQuery) ? listQuery.get(0) : null;
            if (poiMarkInfoDataNew_ == null) {
                poiMarkInfoDataNew_ = PoiMarkInfoData.new_();
                poiMarkInfoDataNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f15373i.get().intValue());
                poiMarkInfoDataNew_.poiName = messageLocation.name;
                poiMarkInfoDataNew_.address = messageLocation.address;
                DoublePair doublePair = messageLocation.coordinates;
                poiMarkInfoDataNew_.latitude = doublePair.first;
                poiMarkInfoDataNew_.longitude = doublePair.second;
                poiMarkInfoDataNew_.triggerDate = 0L;
                poiMarkInfoDataNew_.triggerTimes = 0;
            }
        }
        poiMarkInfoDataNew_.punchInDate = mqi0.m155944o();
        final PoiMarkInfoData poiMarkInfoDataMo223809clone = poiMarkInfoDataNew_.mo223809clone();
        f8c.m119878o().m119881B(new d30() { // from class: l.v980
            @Override // p149l.d30
            public final void call() {
                FeedModule.f38860i.f77917g.upsert(poiMarkInfoDataMo223809clone);
            }
        });
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m202263p() {
        FeedModule.f38860i.f77917g.upsert(this.f185315b.mo223809clone());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m202264q(MessageLocation messageLocation) throws Exception {
        PoiMarkInfoData poiMarkInfoData = this.f185315b;
        if (poiMarkInfoData == null) {
            PoiMarkInfoData poiMarkInfoDataNew_ = PoiMarkInfoData.new_();
            this.f185315b = poiMarkInfoDataNew_;
            poiMarkInfoDataNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f15373i.get().intValue());
            PoiMarkInfoData poiMarkInfoData2 = this.f185315b;
            poiMarkInfoData2.poiName = messageLocation.name;
            poiMarkInfoData2.address = messageLocation.address;
            DoublePair doublePair = messageLocation.coordinates;
            poiMarkInfoData2.latitude = doublePair.first;
            poiMarkInfoData2.longitude = doublePair.second;
            poiMarkInfoData2.triggerDate = mqi0.m155944o();
            PoiMarkInfoData poiMarkInfoData3 = this.f185315b;
            poiMarkInfoData3.punchInDate = 0L;
            poiMarkInfoData3.triggerTimes = 1;
        } else {
            poiMarkInfoData.triggerDate = mqi0.m155944o();
            this.f185315b.triggerTimes++;
        }
        f8c.m119878o().m119881B(new d30() { // from class: l.t980
            @Override // p149l.d30
            public final void call() {
                this.f168995a.m202263p();
            }
        });
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: r */
    public void m202265r(final MessageLocation messageLocation) {
        C22306c.fromCallable(new Callable() { // from class: l.u980
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f175198a.m202262o(messageLocation);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154950B());
    }

    /* JADX INFO: renamed from: s */
    public final void m202266s() {
        m202267t(this.f185314a.location);
    }

    /* JADX INFO: renamed from: t */
    public void m202267t(final MessageLocation messageLocation) {
        C22306c.fromCallable(new Callable() { // from class: l.s980
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f163156a.m202264q(messageLocation);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154950B());
    }

    /* JADX INFO: renamed from: u */
    public void m202268u() {
        FeedModule.f38855d.f193003M.put(Long.valueOf(mqi0.m155944o()));
        m202266s();
    }

    /* JADX INFO: renamed from: v */
    public void m202269v() {
        FeedModule.f38855d.f193005N.put(Long.valueOf(mqi0.m155944o()));
        m202266s();
    }
}

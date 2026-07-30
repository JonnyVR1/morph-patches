package p153l;

import android.app.Activity;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.PoiGuidePopWindow;
import com.p051p1.mobile.putong.feed.data.PoiMarkInfoData;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class ci80 {

    /* JADX INFO: renamed from: f */
    public static int f81904f = 86400000;

    /* JADX INFO: renamed from: g */
    public static volatile ci80 f81905g;

    /* JADX INFO: renamed from: a */
    public PoiGuidePopWindow f81906a;

    /* JADX INFO: renamed from: b */
    public PoiMarkInfoData f81907b;

    /* JADX INFO: renamed from: c */
    public x20 f81908c;

    /* JADX INFO: renamed from: d */
    public int f81909d;

    /* JADX INFO: renamed from: e */
    public int f81910e;

    public ci80() {
        this.f81909d = 0;
        this.f81910e = 0;
        this.f81909d = ikh.m140294b();
        this.f81910e = ikh.m140295c();
    }

    /* JADX INFO: renamed from: h */
    public static ci80 m109858h() {
        if (f81905g == null) {
            synchronized (ci80.class) {
                try {
                    if (f81905g == null) {
                        f81905g = new ci80();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f81905g;
    }

    /* JADX INFO: renamed from: e */
    public void m109859e(x20 x20Var) {
        this.f81908c = x20Var;
    }

    /* JADX INFO: renamed from: f */
    public boolean m109860f(Act act) {
        if (this.f81906a == null) {
            return false;
        }
        if (act == null) {
            act = m109861g();
        }
        if (act != null && !m109863j() && !m109862i() && !m109865l() && this.f81906a.firstTimeShow && rkh.m181860d()) {
            if (TEnum.equals(this.f81906a.type, "share")) {
                m109858h().m109875v();
                xh80.m211024c(act, this.f81906a, true, null);
                return true;
            }
            if (TEnum.equals(this.f81906a.type, "poi")) {
                m109858h().m109874u();
                xh80.m211023b(act, this.f81906a, true, null);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public Act m109861g() {
        Iterator<ArrayList<Act.C4450r>> it = Act.globalLifeCycle_().values().iterator();
        while (it.hasNext()) {
            Iterator<Act.C4450r> it2 = it.next().iterator();
            while (it2.hasNext()) {
                Activity activity = it2.next().f16062a.get();
                if (NullChecker.m82486a(activity) && (activity instanceof Act)) {
                    return (Act) activity;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m109862i() {
        return NullChecker.m82486a(this.f81907b) && (pzi0.m174454o() - this.f81907b.punchInDate) - ((long) (this.f81910e * f81904f)) < 0;
    }

    /* JADX INFO: renamed from: j */
    public boolean m109863j() {
        return NullChecker.m82486a(this.f81907b) && (pzi0.m174454o() - this.f81907b.triggerDate) - ((long) (this.f81909d * f81904f)) < 0;
    }

    /* JADX INFO: renamed from: k */
    public boolean m109864k() {
        return NullChecker.m82486a(this.f81906a);
    }

    /* JADX INFO: renamed from: l */
    public boolean m109865l() {
        return m109866m() || m109867n();
    }

    /* JADX INFO: renamed from: m */
    public boolean m109866m() {
        if (FeedModule.f39703d.f121313M.get().longValue() > 0) {
            return pzi0.m174439D(FeedModule.f39703d.f121313M.get().longValue());
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m109867n() {
        if (FeedModule.f39703d.f121315N.get().longValue() > 0) {
            return pzi0.m174439D(FeedModule.f39703d.f121315N.get().longValue());
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Boolean m109868o(MessageLocation messageLocation) throws Exception {
        PoiMarkInfoData poiMarkInfoDataNew_;
        if (NullChecker.m82486a(this.f81907b) && TextUtils.equals(this.f81907b.poiName, messageLocation.name)) {
            poiMarkInfoDataNew_ = this.f81907b;
        } else {
            List<PoiMarkInfoData> listQuery = FeedModule.f39708i.f160261g.query(PoiMarkInfoData.POINAME.mo61359EQ(messageLocation.name), PoiMarkInfoData._ID.DESC, 1);
            poiMarkInfoDataNew_ = !jyb.m147479J(listQuery) ? listQuery.get(0) : null;
            if (poiMarkInfoDataNew_ == null) {
                poiMarkInfoDataNew_ = PoiMarkInfoData.new_();
                poiMarkInfoDataNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f16092i.get().intValue());
                poiMarkInfoDataNew_.poiName = messageLocation.name;
                poiMarkInfoDataNew_.address = messageLocation.address;
                DoublePair doublePair = messageLocation.coordinates;
                poiMarkInfoDataNew_.latitude = doublePair.first;
                poiMarkInfoDataNew_.longitude = doublePair.second;
                poiMarkInfoDataNew_.triggerDate = 0L;
                poiMarkInfoDataNew_.triggerTimes = 0;
            }
        }
        poiMarkInfoDataNew_.punchInDate = pzi0.m174454o();
        final PoiMarkInfoData poiMarkInfoDataMo225055clone = poiMarkInfoDataNew_.mo225055clone();
        l9c.m153394o().m153397B(new x20() { // from class: l.bi80
            @Override // p153l.x20
            public final void call() {
                FeedModule.f39708i.f160261g.upsert(poiMarkInfoDataMo225055clone);
            }
        });
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m109869p() {
        FeedModule.f39708i.f160261g.upsert(this.f81907b.mo225055clone());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m109870q(MessageLocation messageLocation) throws Exception {
        PoiMarkInfoData poiMarkInfoData = this.f81907b;
        if (poiMarkInfoData == null) {
            PoiMarkInfoData poiMarkInfoDataNew_ = PoiMarkInfoData.new_();
            this.f81907b = poiMarkInfoDataNew_;
            poiMarkInfoDataNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f16092i.get().intValue());
            PoiMarkInfoData poiMarkInfoData2 = this.f81907b;
            poiMarkInfoData2.poiName = messageLocation.name;
            poiMarkInfoData2.address = messageLocation.address;
            DoublePair doublePair = messageLocation.coordinates;
            poiMarkInfoData2.latitude = doublePair.first;
            poiMarkInfoData2.longitude = doublePair.second;
            poiMarkInfoData2.triggerDate = pzi0.m174454o();
            PoiMarkInfoData poiMarkInfoData3 = this.f81907b;
            poiMarkInfoData3.punchInDate = 0L;
            poiMarkInfoData3.triggerTimes = 1;
        } else {
            poiMarkInfoData.triggerDate = pzi0.m174454o();
            this.f81907b.triggerTimes++;
        }
        l9c.m153394o().m153397B(new x20() { // from class: l.zh80
            @Override // p153l.x20
            public final void call() {
                this.f204388a.m109869p();
            }
        });
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: r */
    public void m109871r(final MessageLocation messageLocation) {
        C22421c.fromCallable(new Callable() { // from class: l.ai80
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f71459a.m109868o(messageLocation);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173591B());
    }

    /* JADX INFO: renamed from: s */
    public final void m109872s() {
        m109873t(this.f81906a.location);
    }

    /* JADX INFO: renamed from: t */
    public void m109873t(final MessageLocation messageLocation) {
        C22421c.fromCallable(new Callable() { // from class: l.yh80
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f199910a.m109870q(messageLocation);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173591B());
    }

    /* JADX INFO: renamed from: u */
    public void m109874u() {
        FeedModule.f39703d.f121313M.put(Long.valueOf(pzi0.m174454o()));
        m109872s();
    }

    /* JADX INFO: renamed from: v */
    public void m109875v() {
        FeedModule.f39703d.f121315N.put(Long.valueOf(pzi0.m174454o()));
        m109872s();
    }
}

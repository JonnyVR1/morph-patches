package p153l;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.UserWealthGradeConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorKnightInfos;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftStarBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveMedals;
import com.p051p1.mobile.putong.live.base.data.BLiveMomentConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMomentConfigItem;
import com.p051p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes10.dex */
public class hiv {

    /* JADX INFO: renamed from: g */
    public Pagination f110076g;

    /* JADX INFO: renamed from: i */
    public boolean f110078i;

    /* JADX INFO: renamed from: w */
    public BLiveMomentConfig f110092w;

    /* JADX INFO: renamed from: a */
    public String f110070a = "";

    /* JADX INFO: renamed from: b */
    public iu5 f110071b = new iu5();

    /* JADX INFO: renamed from: c */
    public C22508b<Integer> f110072c = C22508b.m222767b();

    /* JADX INFO: renamed from: d */
    public C22507a<Long> f110073d = C22507a.m222758b();

    /* JADX INFO: renamed from: e */
    public C22507a<pf60<Boolean, BLiveData>> f110074e = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public C22507a<BLiveAnchorKnightInfos> f110075f = C22507a.m222758b();

    /* JADX INFO: renamed from: h */
    public C22508b<BLiveGiftStarBoard> f110077h = C22508b.m222767b();

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap<String, Long> f110079j = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap<Integer, BLiveGiftItem> f110080k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l */
    public final ConcurrentHashMap<String, ConcurrentHashMap<Integer, BLiveGiftItem>> f110081l = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: m */
    public final C22508b<aiv.C15716a> f110082m = C22508b.m222767b();

    /* JADX INFO: renamed from: n */
    public final C22508b<aiv.C15717b> f110083n = C22508b.m222767b();

    /* JADX INFO: renamed from: o */
    public final C22508b<xxj> f110084o = C22508b.m222767b();

    /* JADX INFO: renamed from: p */
    public final C22508b<BLiveResourceInfo> f110085p = C22508b.m222767b();

    /* JADX INFO: renamed from: q */
    public SparseArray<BLiveIntlVoiceMedal> f110086q = new SparseArray<>();

    /* JADX INFO: renamed from: r */
    public SparseArray<BLiveIntlVoiceMedal> f110087r = new SparseArray<>();

    /* JADX INFO: renamed from: s */
    public C22508b<BLiveIntlGiftLeaderboard> f110088s = C22508b.m222767b();

    /* JADX INFO: renamed from: t */
    public final C22508b<uxj0> f110089t = C22508b.m222767b();

    /* JADX INFO: renamed from: u */
    public ConcurrentSkipListMap<String, BLiveMedals> f110090u = new ConcurrentSkipListMap<>();

    /* JADX INFO: renamed from: v */
    public ConcurrentHashMap<Long, BLiveUserLevel> f110091v = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: x */
    public ConcurrentHashMap<Long, BLiveAnchorLevel> f110093x = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: y */
    public C22508b<md4> f110094y = C22508b.m222767b();

    /* JADX INFO: renamed from: A */
    public boolean m135141A(String str, String str2) {
        return this.f110081l.size() == 0 || !this.f110081l.containsKey(str2) || this.f110081l.get(str2).size() == 0 || !this.f110079j.containsKey(str2) || new Date(Long.parseLong(str)).after(new Date(this.f110079j.get(str2).longValue()));
    }

    /* JADX INFO: renamed from: B */
    public void m135142B() {
        if (this.f110091v.size() == 0 || this.f110093x.size() == 0) {
            aiv.m98099g1().subscribe(dhw.m115824c());
        }
    }

    /* JADX INFO: renamed from: C */
    public void m135143C(Long l2) {
        this.f110073d.onNext(l2);
    }

    /* JADX INFO: renamed from: D */
    public void m135144D(int i) {
        this.f110072c.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: E */
    public void m135145E(BLiveResourceInfo bLiveResourceInfo) {
        this.f110085p.onNext(bLiveResourceInfo);
    }

    /* JADX INFO: renamed from: F */
    public void m135146F(xxj xxjVar) {
        this.f110084o.onNext(xxjVar);
    }

    /* JADX INFO: renamed from: G */
    public void m135147G(String str, String str2) {
        this.f110094y.onNext(new md4(str, str2));
    }

    /* JADX INFO: renamed from: H */
    public void m135148H(String str, String str2, aiv.C15716a.a aVar) {
        this.f110082m.onNext(new aiv.C15716a(str, str2, aVar));
    }

    /* JADX INFO: renamed from: I */
    public void m135149I(String str, String str2) {
        this.f110083n.onNext(new aiv.C15717b(str, str2));
    }

    /* JADX INFO: renamed from: J */
    public void m135150J(String str) {
        this.f110070a = str;
    }

    /* JADX INFO: renamed from: K */
    public void m135151K(List<BLiveIntlVoiceMedal> list) {
        this.f110086q.clear();
        jyb.m147537z(list, new y20() { // from class: l.fiv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99270a.m135173y((BLiveIntlVoiceMedal) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m135152L(List<BLiveIntlVoiceMedal> list) {
        this.f110087r.clear();
        jyb.m147537z(list, new y20() { // from class: l.giv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104529a.m135174z((BLiveIntlVoiceMedal) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m135153e() {
        this.f110070a = "";
    }

    /* JADX INFO: renamed from: f */
    public BLiveAnchorLevel m135154f(long j) {
        return this.f110093x.get(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: g */
    public C22421c<md4> m135155g() {
        return this.f110094y.asObservable();
    }

    /* JADX INFO: renamed from: h */
    public C22421c<Long> m135156h() {
        return this.f110073d.asObservable().onBackpressureLatest().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: i */
    public String m135157i() {
        return this.f110070a;
    }

    /* JADX INFO: renamed from: j */
    public BLiveIntlVoiceMedal m135158j(int i) {
        SparseArray<BLiveIntlVoiceMedal> sparseArray = this.f110086q;
        if (sparseArray == null || i >= sparseArray.size()) {
            return null;
        }
        return this.f110086q.get(i);
    }

    /* JADX INFO: renamed from: k */
    public SparseArray<BLiveIntlVoiceMedal> m135159k() {
        return this.f110086q;
    }

    /* JADX INFO: renamed from: l */
    public BLiveGiftItem m135160l(int i) {
        return this.f110080k.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: m */
    public BLiveGiftItem m135161m(String str) {
        int i = -1;
        if (TextUtils.isEmpty(str)) {
            return this.f110080k.get(-1);
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            CrashHelper.m82479c(e);
        }
        return this.f110080k.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public BLiveIntlVoiceMedal m135162n(int i) {
        SparseArray<BLiveIntlVoiceMedal> sparseArray = this.f110087r;
        if (sparseArray == null || i > sparseArray.size()) {
            return null;
        }
        return this.f110087r.get(i);
    }

    /* JADX INFO: renamed from: o */
    public SparseArray<BLiveIntlVoiceMedal> m135163o() {
        return this.f110087r;
    }

    /* JADX INFO: renamed from: p */
    public C22421c<Integer> m135164p() {
        return this.f110072c.asObservable();
    }

    /* JADX INFO: renamed from: q */
    public C22421c<BLiveResourceInfo> m135165q() {
        return this.f110085p.asObservable();
    }

    /* JADX INFO: renamed from: r */
    public C22421c<aiv.C15716a> m135166r() {
        return this.f110082m.asObservable().onBackpressureLatest().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: s */
    public C22421c<xxj> m135167s() {
        return this.f110084o.asObservable();
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public BLiveMedal m135168t(final String str, final String str2, @Nullable String str3) {
        if (str3 != null && this.f110090u.containsKey(str3)) {
            return (BLiveMedal) jyb.m147529r(this.f110090u.get(str3).medals, new qcj() { // from class: l.div
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    BLiveMedal bLiveMedal = (BLiveMedal) obj;
                    return Boolean.valueOf(bLiveMedal.f45245id.equals(str) && (bLiveMedal.showPlaces.contains(str2) || bLiveMedal.showPlaces.contains("all")));
                }
            });
        }
        aiv.m98090d1();
        if (this.f110090u.isEmpty()) {
            return null;
        }
        return (BLiveMedal) jyb.m147529r(this.f110090u.lastEntry().getValue().medals, new qcj() { // from class: l.eiv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveMedal bLiveMedal = (BLiveMedal) obj;
                return Boolean.valueOf(bLiveMedal.f45245id.equals(str) && (bLiveMedal.showPlaces.contains(str2) || bLiveMedal.showPlaces.contains("all")));
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public C22421c<aiv.C15717b> m135169u() {
        return this.f110083n.asObservable().onBackpressureLatest().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: v */
    public BLiveUserLevel m135170v(long j) {
        return this.f110091v.get(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: w */
    public final String m135171w(int i) {
        BLiveMomentConfig bLiveMomentConfig = this.f110092w;
        if (bLiveMomentConfig != null && !jyb.m147479J(bLiveMomentConfig.textList)) {
            for (BLiveMomentConfigItem bLiveMomentConfigItem : this.f110092w.textList) {
                if (bLiveMomentConfigItem.grade == i) {
                    return bLiveMomentConfigItem.text;
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: x */
    public UserWealthGradeConfig m135172x(int i) {
        BLiveUserLevel bLiveUserLevelM135170v = m135170v(i);
        String str = bLiveUserLevelM135170v == null ? "" : bLiveUserLevelM135170v.backendUrl;
        UserWealthGradeConfig userWealthGradeConfigNew_ = UserWealthGradeConfig.new_();
        BLiveMomentConfig bLiveMomentConfig = this.f110092w;
        if (bLiveMomentConfig != null) {
            userWealthGradeConfigNew_.minGradeShow = bLiveMomentConfig.minGradeShow;
            userWealthGradeConfigNew_.wealthIconUrl = str;
            userWealthGradeConfigNew_.wealthGradeDesc = m135171w(i);
        }
        return userWealthGradeConfigNew_;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m135173y(BLiveIntlVoiceMedal bLiveIntlVoiceMedal) {
        this.f110086q.put(bLiveIntlVoiceMedal.familyGrade, bLiveIntlVoiceMedal);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m135174z(BLiveIntlVoiceMedal bLiveIntlVoiceMedal) {
        this.f110087r.put(bLiveIntlVoiceMedal.grade, bLiveIntlVoiceMedal);
    }
}

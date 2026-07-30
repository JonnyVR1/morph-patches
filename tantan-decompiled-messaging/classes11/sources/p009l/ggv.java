package p009l;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.Pagination;
import com.p1.mobile.putong.data.UserWealthGradeConfig;
import com.p1.mobile.putong.live.base.data.BLiveAnchorKnightInfos;
import com.p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftStarBoard;
import com.p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard;
import com.p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal;
import com.p1.mobile.putong.live.base.data.BLiveMedal;
import com.p1.mobile.putong.live.base.data.BLiveMedals;
import com.p1.mobile.putong.live.base.data.BLiveMomentConfig;
import com.p1.mobile.putong.live.base.data.BLiveMomentConfigItem;
import com.p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import l.e30;
import l.et5;
import l.ffw;
import l.hvj;
import l.j760;
import l.jo0;
import l.nc4;
import l.roj0;
import l.vwb;
import l.w9j;
import l.zfv;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ggv {

    /* JADX INFO: renamed from: g */
    public Pagination f13544g;

    /* JADX INFO: renamed from: i */
    public boolean f13546i;

    /* JADX INFO: renamed from: w */
    public BLiveMomentConfig f13560w;

    /* JADX INFO: renamed from: a */
    public String f13538a = "";

    /* JADX INFO: renamed from: b */
    public et5 f13539b = new et5();

    /* JADX INFO: renamed from: c */
    public b<Integer> f13540c = b.b();

    /* JADX INFO: renamed from: d */
    public a<Long> f13541d = a.b();

    /* JADX INFO: renamed from: e */
    public a<j760<Boolean, BLiveData>> f13542e = a.b();

    /* JADX INFO: renamed from: f */
    public a<BLiveAnchorKnightInfos> f13543f = a.b();

    /* JADX INFO: renamed from: h */
    public b<BLiveGiftStarBoard> f13545h = b.b();

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap<String, Long> f13547j = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap<Integer, BLiveGiftItem> f13548k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l */
    public final ConcurrentHashMap<String, ConcurrentHashMap<Integer, BLiveGiftItem>> f13549l = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: m */
    public final b<zfv.a> f13550m = b.b();

    /* JADX INFO: renamed from: n */
    public final b<zfv.b> f13551n = b.b();

    /* JADX INFO: renamed from: o */
    public final b<hvj> f13552o = b.b();

    /* JADX INFO: renamed from: p */
    public final b<BLiveResourceInfo> f13553p = b.b();

    /* JADX INFO: renamed from: q */
    public SparseArray<BLiveIntlVoiceMedal> f13554q = new SparseArray<>();

    /* JADX INFO: renamed from: r */
    public SparseArray<BLiveIntlVoiceMedal> f13555r = new SparseArray<>();

    /* JADX INFO: renamed from: s */
    public b<BLiveIntlGiftLeaderboard> f13556s = b.b();

    /* JADX INFO: renamed from: t */
    public final b<roj0> f13557t = b.b();

    /* JADX INFO: renamed from: u */
    public ConcurrentSkipListMap<String, BLiveMedals> f13558u = new ConcurrentSkipListMap<>();

    /* JADX INFO: renamed from: v */
    public ConcurrentHashMap<Long, BLiveUserLevel> f13559v = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: x */
    public ConcurrentHashMap<Long, BLiveAnchorLevel> f13561x = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: y */
    public b<nc4> f13562y = b.b();

    /* JADX INFO: renamed from: A */
    public boolean m15004A(String str, String str2) {
        return this.f13549l.size() == 0 || !this.f13549l.containsKey(str2) || this.f13549l.get(str2).size() == 0 || !this.f13547j.containsKey(str2) || new Date(Long.parseLong(str)).after(new Date(this.f13547j.get(str2).longValue()));
    }

    /* JADX INFO: renamed from: B */
    public void m15005B() {
        if (this.f13559v.size() == 0 || this.f13561x.size() == 0) {
            zfv.g1().subscribe(ffw.c());
        }
    }

    /* JADX INFO: renamed from: C */
    public void m15006C(Long l2) {
        this.f13541d.onNext(l2);
    }

    /* JADX INFO: renamed from: D */
    public void m15007D(int i) {
        this.f13540c.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: E */
    public void m15008E(BLiveResourceInfo bLiveResourceInfo) {
        this.f13553p.onNext(bLiveResourceInfo);
    }

    /* JADX INFO: renamed from: F */
    public void m15009F(hvj hvjVar) {
        this.f13552o.onNext(hvjVar);
    }

    /* JADX INFO: renamed from: G */
    public void m15010G(String str, String str2) {
        this.f13562y.onNext(new nc4(str, str2));
    }

    /* JADX INFO: renamed from: H */
    public void m15011H(String str, String str2, zfv.a.a aVar) {
        this.f13550m.onNext(new zfv.a(str, str2, aVar));
    }

    /* JADX INFO: renamed from: I */
    public void m15012I(String str, String str2) {
        this.f13551n.onNext(new zfv.b(str, str2));
    }

    /* JADX INFO: renamed from: J */
    public void m15013J(String str) {
        this.f13538a = str;
    }

    /* JADX INFO: renamed from: K */
    public void m15014K(List<BLiveIntlVoiceMedal> list) {
        this.f13554q.clear();
        vwb.z(list, new e30() { // from class: l.egv
            public final void call(Object obj) {
                this.f12559a.m15036y((BLiveIntlVoiceMedal) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m15015L(List<BLiveIntlVoiceMedal> list) {
        this.f13555r.clear();
        vwb.z(list, new e30() { // from class: l.fgv
            public final void call(Object obj) {
                this.f12996a.m15037z((BLiveIntlVoiceMedal) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m15016e() {
        this.f13538a = "";
    }

    /* JADX INFO: renamed from: f */
    public BLiveAnchorLevel m15017f(long j) {
        return this.f13561x.get(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: g */
    public c<nc4> m15018g() {
        return this.f13562y.asObservable();
    }

    /* JADX INFO: renamed from: h */
    public c<Long> m15019h() {
        return this.f13541d.asObservable().onBackpressureLatest().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: i */
    public String m15020i() {
        return this.f13538a;
    }

    /* JADX INFO: renamed from: j */
    public BLiveIntlVoiceMedal m15021j(int i) {
        SparseArray<BLiveIntlVoiceMedal> sparseArray = this.f13554q;
        if (sparseArray == null || i >= sparseArray.size()) {
            return null;
        }
        return this.f13554q.get(i);
    }

    /* JADX INFO: renamed from: k */
    public SparseArray<BLiveIntlVoiceMedal> m15022k() {
        return this.f13554q;
    }

    /* JADX INFO: renamed from: l */
    public BLiveGiftItem m15023l(int i) {
        return this.f13548k.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: m */
    public BLiveGiftItem m15024m(String str) {
        int i = -1;
        if (TextUtils.isEmpty(str)) {
            return this.f13548k.get(-1);
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            CrashHelper.c(e);
        }
        return this.f13548k.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public BLiveIntlVoiceMedal m15025n(int i) {
        SparseArray<BLiveIntlVoiceMedal> sparseArray = this.f13555r;
        if (sparseArray == null || i > sparseArray.size()) {
            return null;
        }
        return this.f13555r.get(i);
    }

    /* JADX INFO: renamed from: o */
    public SparseArray<BLiveIntlVoiceMedal> m15026o() {
        return this.f13555r;
    }

    /* JADX INFO: renamed from: p */
    public c<Integer> m15027p() {
        return this.f13540c.asObservable();
    }

    /* JADX INFO: renamed from: q */
    public c<BLiveResourceInfo> m15028q() {
        return this.f13553p.asObservable();
    }

    /* JADX INFO: renamed from: r */
    public c<zfv.a> m15029r() {
        return this.f13550m.asObservable().onBackpressureLatest().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: s */
    public c<hvj> m15030s() {
        return this.f13552o.asObservable();
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public BLiveMedal m15031t(final String str, final String str2, @Nullable String str3) {
        if (str3 != null && this.f13558u.containsKey(str3)) {
            return (BLiveMedal) vwb.r(this.f13558u.get(str3).medals, new w9j() { // from class: l.cgv
                public final Object call(Object obj) {
                    BLiveMedal bLiveMedal = (BLiveMedal) obj;
                    return Boolean.valueOf(bLiveMedal.id.equals(str) && (bLiveMedal.showPlaces.contains(str2) || bLiveMedal.showPlaces.contains("all")));
                }
            });
        }
        zfv.d1();
        if (this.f13558u.isEmpty()) {
            return null;
        }
        return (BLiveMedal) vwb.r(this.f13558u.lastEntry().getValue().medals, new w9j() { // from class: l.dgv
            public final Object call(Object obj) {
                BLiveMedal bLiveMedal = (BLiveMedal) obj;
                return Boolean.valueOf(bLiveMedal.id.equals(str) && (bLiveMedal.showPlaces.contains(str2) || bLiveMedal.showPlaces.contains("all")));
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public c<zfv.b> m15032u() {
        return this.f13551n.asObservable().onBackpressureLatest().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: v */
    public BLiveUserLevel m15033v(long j) {
        return this.f13559v.get(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: w */
    public final String m15034w(int i) {
        BLiveMomentConfig bLiveMomentConfig = this.f13560w;
        if (bLiveMomentConfig != null && !vwb.J(bLiveMomentConfig.textList)) {
            for (BLiveMomentConfigItem bLiveMomentConfigItem : this.f13560w.textList) {
                if (bLiveMomentConfigItem.grade == i) {
                    return bLiveMomentConfigItem.text;
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: x */
    public UserWealthGradeConfig m15035x(int i) {
        BLiveUserLevel bLiveUserLevelM15033v = m15033v(i);
        String str = bLiveUserLevelM15033v == null ? "" : bLiveUserLevelM15033v.backendUrl;
        UserWealthGradeConfig userWealthGradeConfigNew_ = UserWealthGradeConfig.new_();
        BLiveMomentConfig bLiveMomentConfig = this.f13560w;
        if (bLiveMomentConfig != null) {
            userWealthGradeConfigNew_.minGradeShow = bLiveMomentConfig.minGradeShow;
            userWealthGradeConfigNew_.wealthIconUrl = str;
            userWealthGradeConfigNew_.wealthGradeDesc = m15034w(i);
        }
        return userWealthGradeConfigNew_;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m15036y(BLiveIntlVoiceMedal bLiveIntlVoiceMedal) {
        this.f13554q.put(bLiveIntlVoiceMedal.familyGrade, bLiveIntlVoiceMedal);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m15037z(BLiveIntlVoiceMedal bLiveIntlVoiceMedal) {
        this.f13555r.put(bLiveIntlVoiceMedal.grade, bLiveIntlVoiceMedal);
    }
}

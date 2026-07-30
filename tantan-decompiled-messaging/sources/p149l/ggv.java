package p149l;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.UserWealthGradeConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorKnightInfos;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftStarBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlVoiceMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveMedals;
import com.p046p1.mobile.putong.live.base.data.BLiveMomentConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMomentConfigItem;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class ggv {

    /* JADX INFO: renamed from: g */
    public Pagination f102546g;

    /* JADX INFO: renamed from: i */
    public boolean f102548i;

    /* JADX INFO: renamed from: w */
    public BLiveMomentConfig f102562w;

    /* JADX INFO: renamed from: a */
    public String f102540a = "";

    /* JADX INFO: renamed from: b */
    public et5 f102541b = new et5();

    /* JADX INFO: renamed from: c */
    public C22393b<Integer> f102542c = C22393b.m221521b();

    /* JADX INFO: renamed from: d */
    public C22392a<Long> f102543d = C22392a.m221512b();

    /* JADX INFO: renamed from: e */
    public C22392a<j760<Boolean, BLiveData>> f102544e = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public C22392a<BLiveAnchorKnightInfos> f102545f = C22392a.m221512b();

    /* JADX INFO: renamed from: h */
    public C22393b<BLiveGiftStarBoard> f102547h = C22393b.m221521b();

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap<String, Long> f102549j = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap<Integer, BLiveGiftItem> f102550k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l */
    public final ConcurrentHashMap<String, ConcurrentHashMap<Integer, BLiveGiftItem>> f102551l = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: m */
    public final C22393b<zfv.C21687a> f102552m = C22393b.m221521b();

    /* JADX INFO: renamed from: n */
    public final C22393b<zfv.C21688b> f102553n = C22393b.m221521b();

    /* JADX INFO: renamed from: o */
    public final C22393b<hvj> f102554o = C22393b.m221521b();

    /* JADX INFO: renamed from: p */
    public final C22393b<BLiveResourceInfo> f102555p = C22393b.m221521b();

    /* JADX INFO: renamed from: q */
    public SparseArray<BLiveIntlVoiceMedal> f102556q = new SparseArray<>();

    /* JADX INFO: renamed from: r */
    public SparseArray<BLiveIntlVoiceMedal> f102557r = new SparseArray<>();

    /* JADX INFO: renamed from: s */
    public C22393b<BLiveIntlGiftLeaderboard> f102558s = C22393b.m221521b();

    /* JADX INFO: renamed from: t */
    public final C22393b<roj0> f102559t = C22393b.m221521b();

    /* JADX INFO: renamed from: u */
    public ConcurrentSkipListMap<String, BLiveMedals> f102560u = new ConcurrentSkipListMap<>();

    /* JADX INFO: renamed from: v */
    public ConcurrentHashMap<Long, BLiveUserLevel> f102561v = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: x */
    public ConcurrentHashMap<Long, BLiveAnchorLevel> f102563x = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: y */
    public C22393b<nc4> f102564y = C22393b.m221521b();

    /* JADX INFO: renamed from: A */
    public boolean m126007A(String str, String str2) {
        return this.f102551l.size() == 0 || !this.f102551l.containsKey(str2) || this.f102551l.get(str2).size() == 0 || !this.f102549j.containsKey(str2) || new Date(Long.parseLong(str)).after(new Date(this.f102549j.get(str2).longValue()));
    }

    /* JADX INFO: renamed from: B */
    public void m126008B() {
        if (this.f102561v.size() == 0 || this.f102563x.size() == 0) {
            zfv.m218565g1().subscribe(ffw.m121192c());
        }
    }

    /* JADX INFO: renamed from: C */
    public void m126009C(Long l2) {
        this.f102543d.onNext(l2);
    }

    /* JADX INFO: renamed from: D */
    public void m126010D(int i) {
        this.f102542c.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: E */
    public void m126011E(BLiveResourceInfo bLiveResourceInfo) {
        this.f102555p.onNext(bLiveResourceInfo);
    }

    /* JADX INFO: renamed from: F */
    public void m126012F(hvj hvjVar) {
        this.f102554o.onNext(hvjVar);
    }

    /* JADX INFO: renamed from: G */
    public void m126013G(String str, String str2) {
        this.f102564y.onNext(new nc4(str, str2));
    }

    /* JADX INFO: renamed from: H */
    public void m126014H(String str, String str2, zfv.C21687a.a aVar) {
        this.f102552m.onNext(new zfv.C21687a(str, str2, aVar));
    }

    /* JADX INFO: renamed from: I */
    public void m126015I(String str, String str2) {
        this.f102553n.onNext(new zfv.C21688b(str, str2));
    }

    /* JADX INFO: renamed from: J */
    public void m126016J(String str) {
        this.f102540a = str;
    }

    /* JADX INFO: renamed from: K */
    public void m126017K(List<BLiveIntlVoiceMedal> list) {
        this.f102556q.clear();
        vwb.m200354z(list, new e30() { // from class: l.egv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91213a.m126039y((BLiveIntlVoiceMedal) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public void m126018L(List<BLiveIntlVoiceMedal> list) {
        this.f102557r.clear();
        vwb.m200354z(list, new e30() { // from class: l.fgv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97401a.m126040z((BLiveIntlVoiceMedal) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m126019e() {
        this.f102540a = "";
    }

    /* JADX INFO: renamed from: f */
    public BLiveAnchorLevel m126020f(long j) {
        return this.f102563x.get(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: g */
    public C22306c<nc4> m126021g() {
        return this.f102564y.asObservable();
    }

    /* JADX INFO: renamed from: h */
    public C22306c<Long> m126022h() {
        return this.f102543d.asObservable().onBackpressureLatest().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: i */
    public String m126023i() {
        return this.f102540a;
    }

    /* JADX INFO: renamed from: j */
    public BLiveIntlVoiceMedal m126024j(int i) {
        SparseArray<BLiveIntlVoiceMedal> sparseArray = this.f102556q;
        if (sparseArray == null || i >= sparseArray.size()) {
            return null;
        }
        return this.f102556q.get(i);
    }

    /* JADX INFO: renamed from: k */
    public SparseArray<BLiveIntlVoiceMedal> m126025k() {
        return this.f102556q;
    }

    /* JADX INFO: renamed from: l */
    public BLiveGiftItem m126026l(int i) {
        return this.f102550k.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: m */
    public BLiveGiftItem m126027m(String str) {
        int i = -1;
        if (TextUtils.isEmpty(str)) {
            return this.f102550k.get(-1);
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            CrashHelper.m81296c(e);
        }
        return this.f102550k.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public BLiveIntlVoiceMedal m126028n(int i) {
        SparseArray<BLiveIntlVoiceMedal> sparseArray = this.f102557r;
        if (sparseArray == null || i > sparseArray.size()) {
            return null;
        }
        return this.f102557r.get(i);
    }

    /* JADX INFO: renamed from: o */
    public SparseArray<BLiveIntlVoiceMedal> m126029o() {
        return this.f102557r;
    }

    /* JADX INFO: renamed from: p */
    public C22306c<Integer> m126030p() {
        return this.f102542c.asObservable();
    }

    /* JADX INFO: renamed from: q */
    public C22306c<BLiveResourceInfo> m126031q() {
        return this.f102555p.asObservable();
    }

    /* JADX INFO: renamed from: r */
    public C22306c<zfv.C21687a> m126032r() {
        return this.f102552m.asObservable().onBackpressureLatest().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: s */
    public C22306c<hvj> m126033s() {
        return this.f102554o.asObservable();
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public BLiveMedal m126034t(final String str, final String str2, @Nullable String str3) {
        if (str3 != null && this.f102560u.containsKey(str3)) {
            return (BLiveMedal) vwb.m200346r(this.f102560u.get(str3).medals, new w9j() { // from class: l.cgv
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    BLiveMedal bLiveMedal = (BLiveMedal) obj;
                    return Boolean.valueOf(bLiveMedal.f44397id.equals(str) && (bLiveMedal.showPlaces.contains(str2) || bLiveMedal.showPlaces.contains("all")));
                }
            });
        }
        zfv.m218556d1();
        if (this.f102560u.isEmpty()) {
            return null;
        }
        return (BLiveMedal) vwb.m200346r(this.f102560u.lastEntry().getValue().medals, new w9j() { // from class: l.dgv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveMedal bLiveMedal = (BLiveMedal) obj;
                return Boolean.valueOf(bLiveMedal.f44397id.equals(str) && (bLiveMedal.showPlaces.contains(str2) || bLiveMedal.showPlaces.contains("all")));
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public C22306c<zfv.C21688b> m126035u() {
        return this.f102553n.asObservable().onBackpressureLatest().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: v */
    public BLiveUserLevel m126036v(long j) {
        return this.f102561v.get(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: w */
    public final String m126037w(int i) {
        BLiveMomentConfig bLiveMomentConfig = this.f102562w;
        if (bLiveMomentConfig != null && !vwb.m200296J(bLiveMomentConfig.textList)) {
            for (BLiveMomentConfigItem bLiveMomentConfigItem : this.f102562w.textList) {
                if (bLiveMomentConfigItem.grade == i) {
                    return bLiveMomentConfigItem.text;
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: x */
    public UserWealthGradeConfig m126038x(int i) {
        BLiveUserLevel bLiveUserLevelM126036v = m126036v(i);
        String str = bLiveUserLevelM126036v == null ? "" : bLiveUserLevelM126036v.backendUrl;
        UserWealthGradeConfig userWealthGradeConfigNew_ = UserWealthGradeConfig.new_();
        BLiveMomentConfig bLiveMomentConfig = this.f102562w;
        if (bLiveMomentConfig != null) {
            userWealthGradeConfigNew_.minGradeShow = bLiveMomentConfig.minGradeShow;
            userWealthGradeConfigNew_.wealthIconUrl = str;
            userWealthGradeConfigNew_.wealthGradeDesc = m126037w(i);
        }
        return userWealthGradeConfigNew_;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m126039y(BLiveIntlVoiceMedal bLiveIntlVoiceMedal) {
        this.f102556q.put(bLiveIntlVoiceMedal.familyGrade, bLiveIntlVoiceMedal);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m126040z(BLiveIntlVoiceMedal bLiveIntlVoiceMedal) {
        this.f102557r.put(bLiveIntlVoiceMedal.grade, bLiveIntlVoiceMedal);
    }
}

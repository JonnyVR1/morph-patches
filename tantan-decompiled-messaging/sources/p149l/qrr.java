package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.ActivitySuggests;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallExtend;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes13.dex */
public class qrr {

    /* JADX INFO: renamed from: a */
    public final List<BLiveActivity> f156034a;

    /* JADX INFO: renamed from: b */
    public final Map<String, BLiveMultiCallExtend> f156035b;

    /* JADX INFO: renamed from: c */
    public final Map<String, BLiveAbsData> f156036c;

    /* JADX INFO: renamed from: d */
    public final Map<String, BLiveAbsRoom> f156037d;

    /* JADX INFO: renamed from: e */
    public final Map<String, User> f156038e;

    /* JADX INFO: renamed from: f */
    public final List<ActivitySuggests> f156039f;

    /* JADX INFO: renamed from: g */
    public final Map<ActivitySuggests, nau> f156040g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Pagination f156041h;

    /* JADX INFO: renamed from: i */
    public boolean f156042i;

    public qrr(BLiveEnvelope bLiveEnvelope) {
        ArrayList arrayList = new ArrayList();
        this.f156034a = arrayList;
        this.f156035b = new HashMap();
        this.f156036c = new HashMap();
        this.f156037d = new HashMap();
        this.f156038e = new HashMap();
        this.f156039f = new ArrayList();
        this.f156040g = new HashMap();
        this.f156042i = false;
        if (!vwb.m200296J(bLiveEnvelope.data.liveActivities)) {
            arrayList.addAll(bLiveEnvelope.data.liveActivities);
        }
        if (!vwb.m200296J(bLiveEnvelope.data.lives)) {
            for (BLive bLive : bLiveEnvelope.data.lives) {
                this.f156036c.put(bLive.f44323id, bLive);
            }
        }
        if (!vwb.m200296J(bLiveEnvelope.data.rooms)) {
            for (BLiveRoom bLiveRoom : bLiveEnvelope.data.rooms) {
                this.f156037d.put(bLiveRoom.f44324id, bLiveRoom);
            }
        }
        if (!vwb.m200296J(bLiveEnvelope.data.users)) {
            for (User user : bLiveEnvelope.data.users) {
                this.f156038e.put(user.f56011id, user);
            }
        }
        if (!vwb.m200296J(bLiveEnvelope.data.multiCallExtends)) {
            vwb.m200354z(bLiveEnvelope.data.multiCallExtends, new e30() { // from class: l.krr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f124385a.m176123q((BLiveMultiCallExtend) obj);
                }
            });
        }
        this.f156041h = bLiveEnvelope.pagination;
        this.f156042i = x4u.m207025k(this);
        m176113g();
    }

    /* JADX INFO: renamed from: g */
    public final void m176113g() {
        ArrayList arrayList = new ArrayList();
        for (BLiveActivity bLiveActivity : this.f156034a) {
            BLiveAbsData bLiveAbsDataM176126t = m176126t(bLiveActivity.reference.f44419id);
            if (bLiveAbsDataM176126t != null && (x4u.m207032r(bLiveAbsDataM176126t) || qib0.f154693H.guessedCurrentServerTime() - bLiveAbsDataM176126t.endTime <= 1.296E9d)) {
                arrayList.add(bLiveActivity);
            }
        }
        this.f156034a.clear();
        this.f156034a.addAll(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public List<ActivitySuggests> m176114h() {
        return this.f156039f;
    }

    /* JADX INFO: renamed from: i */
    public List<BLiveActivity> m176115i() {
        return this.f156034a;
    }

    /* JADX INFO: renamed from: j */
    public int m176116j() {
        return vwb.m200323f(this.f156034a, new w9j() { // from class: l.nrr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f140217a.m176120n((BLiveActivity) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public Pagination m176117k() {
        return this.f156041h;
    }

    /* JADX INFO: renamed from: l */
    public Map<ActivitySuggests, nau> m176118l() {
        return this.f156040g;
    }

    /* JADX INFO: renamed from: m */
    public boolean m176119m() {
        Pagination pagination;
        return (!this.f156042i || (pagination = this.f156041h) == null || TextUtils.isEmpty(pagination.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m176120n(BLiveActivity bLiveActivity) {
        BLiveAbsData bLiveAbsDataM176126t = m176126t(bLiveActivity.reference.f44419id);
        if (bLiveAbsDataM176126t != null) {
            return bLiveActivity.isMultiCallAudience() ? Boolean.valueOf(bLiveActivity.isMultiCallAudienceGoing()) : Boolean.valueOf(x4u.m207032r(bLiveAbsDataM176126t));
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m176121o(ActivitySuggests activitySuggests) {
        if (vwb.m200296J(activitySuggests.liveActivities)) {
            return;
        }
        this.f156039f.add(activitySuggests);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m176122p(ActivitySuggests activitySuggests) {
        this.f156040g.put(activitySuggests, new nau(activitySuggests));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m176123q(BLiveMultiCallExtend bLiveMultiCallExtend) {
        this.f156035b.put(bLiveMultiCallExtend.liveId, bLiveMultiCallExtend);
    }

    /* JADX INFO: renamed from: r */
    public qrr m176124r(@Nullable qrr qrrVar) {
        this.f156042i = x4u.m207025k(qrrVar);
        if (qrrVar == null) {
            return this;
        }
        x4u.m207018d(this.f156034a, qrrVar.f156034a, new w9j() { // from class: l.orr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveActivity) obj).f44327id;
            }
        });
        this.f156036c.putAll(qrrVar.f156036c);
        this.f156037d.putAll(qrrVar.f156037d);
        this.f156038e.putAll(qrrVar.f156038e);
        this.f156041h = qrrVar.f156041h;
        m176113g();
        return this;
    }

    /* JADX INFO: renamed from: s */
    public qrr m176125s(@Nullable BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData;
        if (bLiveEnvelope != null && (bLiveData = bLiveEnvelope.data) != null) {
            if (!vwb.m200296J(bLiveData.users)) {
                for (User user : bLiveEnvelope.data.users) {
                    this.f156038e.put(user.f56011id, user);
                }
            }
            if (!vwb.m200296J(bLiveEnvelope.data.rooms)) {
                for (BLiveRoom bLiveRoom : bLiveEnvelope.data.rooms) {
                    this.f156037d.put(bLiveRoom.f44324id, bLiveRoom);
                }
            }
            if (!vwb.m200296J(bLiveEnvelope.data.lives)) {
                for (BLive bLive : bLiveEnvelope.data.lives) {
                    this.f156036c.put(bLive.f44323id, bLive);
                }
            }
            int iM176116j = m176116j();
            int iM195600C4 = s9s.f163228b.m195600C4();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(bLiveEnvelope.data.activitySuggests);
            arrayList2.size();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ActivitySuggests activitySuggests = (ActivitySuggests) arrayList2.remove(new Random().nextInt(arrayList2.size()));
                if (!vwb.m200296J(activitySuggests.liveActivities)) {
                    arrayList.add(activitySuggests);
                    if (arrayList.size() == 2) {
                        break;
                    }
                }
            }
            if (iM176116j > 0 && iM176116j < iM195600C4 && !arrayList.isEmpty()) {
                int i2 = 0;
                while (iM176116j < iM195600C4 && !arrayList.isEmpty()) {
                    if (i2 >= arrayList.size()) {
                        i2 = 0;
                    }
                    BLiveActivity bLiveActivityRemove = ((ActivitySuggests) arrayList.get(i2)).liveActivities.remove(new Random().nextInt(((ActivitySuggests) arrayList.get(i2)).liveActivities.size()));
                    int size2 = this.f156034a.size();
                    List<BLiveActivity> list = this.f156034a;
                    if (size2 > iM176116j) {
                        list.add(iM176116j, bLiveActivityRemove);
                    } else {
                        list.add(bLiveActivityRemove);
                    }
                    if (vwb.m200296J(((ActivitySuggests) arrayList.get(i2)).liveActivities)) {
                        arrayList.remove(i2);
                    }
                    i2++;
                    iM176116j++;
                }
            }
            this.f156039f.clear();
            vwb.m200354z(bLiveEnvelope.data.activitySuggests, new e30() { // from class: l.lrr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f129749a.m176121o((ActivitySuggests) obj);
                }
            });
            vwb.m200354z(this.f156039f, new e30() { // from class: l.mrr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f135402a.m176122p((ActivitySuggests) obj);
                }
            });
        }
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public BLiveAbsData m176126t(String str) {
        return this.f156036c.get(str);
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public BLiveAbsRoom m176127u(String str) {
        return this.f156037d.get(str);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public User m176128v(String str) {
        if (this.f156038e.containsKey(str)) {
            return this.f156038e.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public void m176129w() {
        Iterator<Map.Entry<ActivitySuggests, nau>> it = this.f156040g.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m158717b();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m176130x(final fsr fsrVar) {
        nau nauVar = this.f156040g.get(fsrVar.f99103e);
        if (nauVar != null) {
            if (nauVar.m158719d(fsrVar.f99101c)) {
                boolean zIsEmpty = this.f156034a.isEmpty();
                List<BLiveActivity> list = this.f156034a;
                if (zIsEmpty) {
                    list.add(fsrVar.f99101c);
                } else if (vwb.m200323f(list, new w9j() { // from class: l.prr
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((BLiveActivity) obj).f44327id, fsrVar.f99101c.f44327id));
                    }
                }) == 0) {
                    this.f156034a.add(0, fsrVar.f99101c);
                }
            }
            if (nauVar.m158716a().isEmpty()) {
                this.f156040g.remove(fsrVar.f99103e);
                this.f156039f.remove(fsrVar.f99103e);
            }
        }
    }
}

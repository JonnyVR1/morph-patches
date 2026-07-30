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
public class mtn {

    /* JADX INFO: renamed from: a */
    public final List<BLiveActivity> f135640a;

    /* JADX INFO: renamed from: b */
    public final Map<String, BLiveMultiCallExtend> f135641b;

    /* JADX INFO: renamed from: c */
    public final Map<String, BLiveAbsData> f135642c;

    /* JADX INFO: renamed from: d */
    public final Map<String, BLiveAbsRoom> f135643d;

    /* JADX INFO: renamed from: e */
    public final Map<String, User> f135644e;

    /* JADX INFO: renamed from: f */
    public final List<ActivitySuggests> f135645f;

    /* JADX INFO: renamed from: g */
    public final Map<ActivitySuggests, m8o> f135646g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Pagination f135647h;

    /* JADX INFO: renamed from: i */
    public boolean f135648i;

    public mtn(BLiveEnvelope bLiveEnvelope) {
        ArrayList arrayList = new ArrayList();
        this.f135640a = arrayList;
        this.f135641b = new HashMap();
        this.f135642c = new HashMap();
        this.f135643d = new HashMap();
        this.f135644e = new HashMap();
        this.f135645f = new ArrayList();
        this.f135646g = new HashMap();
        this.f135648i = false;
        if (!vwb.m200296J(bLiveEnvelope.data.liveActivities)) {
            arrayList.addAll(bLiveEnvelope.data.liveActivities);
        }
        if (!vwb.m200296J(bLiveEnvelope.data.lives)) {
            for (BLive bLive : bLiveEnvelope.data.lives) {
                this.f135642c.put(bLive.f44323id, bLive);
            }
        }
        if (!vwb.m200296J(bLiveEnvelope.data.rooms)) {
            for (BLiveRoom bLiveRoom : bLiveEnvelope.data.rooms) {
                this.f135643d.put(bLiveRoom.f44324id, bLiveRoom);
            }
        }
        if (!vwb.m200296J(bLiveEnvelope.data.users)) {
            for (User user : bLiveEnvelope.data.users) {
                this.f135644e.put(user.f56011id, user);
            }
        }
        if (!vwb.m200296J(bLiveEnvelope.data.multiCallExtends)) {
            vwb.m200354z(bLiveEnvelope.data.multiCallExtends, new e30() { // from class: l.gtn
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104326a.m156325q((BLiveMultiCallExtend) obj);
                }
            });
        }
        this.f135647h = bLiveEnvelope.pagination;
        this.f135648i = x4u.m207024j(this);
        m156315g();
    }

    /* JADX INFO: renamed from: g */
    public final void m156315g() {
        ArrayList arrayList = new ArrayList();
        for (BLiveActivity bLiveActivity : this.f135640a) {
            BLiveAbsData bLiveAbsDataM156328t = m156328t(bLiveActivity.reference.f44419id);
            if (bLiveAbsDataM156328t != null && (x4u.m207032r(bLiveAbsDataM156328t) || qib0.f154693H.guessedCurrentServerTime() - bLiveAbsDataM156328t.endTime <= 1.296E9d)) {
                arrayList.add(bLiveActivity);
            }
        }
        this.f135640a.clear();
        this.f135640a.addAll(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public List<ActivitySuggests> m156316h() {
        return this.f135645f;
    }

    /* JADX INFO: renamed from: i */
    public List<BLiveActivity> m156317i() {
        return this.f135640a;
    }

    /* JADX INFO: renamed from: j */
    public int m156318j() {
        return vwb.m200323f(this.f135640a, new w9j() { // from class: l.ktn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f124600a.m156322n((BLiveActivity) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public Pagination m156319k() {
        return this.f135647h;
    }

    /* JADX INFO: renamed from: l */
    public Map<ActivitySuggests, m8o> m156320l() {
        return this.f135646g;
    }

    /* JADX INFO: renamed from: m */
    public boolean m156321m() {
        Pagination pagination;
        return (!this.f135648i || (pagination = this.f135647h) == null || TextUtils.isEmpty(pagination.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m156322n(BLiveActivity bLiveActivity) {
        BLiveAbsData bLiveAbsDataM156328t = m156328t(bLiveActivity.reference.f44419id);
        if (bLiveAbsDataM156328t != null) {
            return bLiveActivity.isMultiCallAudience() ? Boolean.valueOf(bLiveActivity.isMultiCallAudienceGoing()) : Boolean.valueOf(x4u.m207032r(bLiveAbsDataM156328t));
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m156323o(ActivitySuggests activitySuggests) {
        if (vwb.m200296J(activitySuggests.liveActivities)) {
            return;
        }
        this.f135645f.add(activitySuggests);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m156324p(ActivitySuggests activitySuggests) {
        this.f135646g.put(activitySuggests, new m8o(activitySuggests));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m156325q(BLiveMultiCallExtend bLiveMultiCallExtend) {
        this.f135641b.put(bLiveMultiCallExtend.liveId, bLiveMultiCallExtend);
    }

    /* JADX INFO: renamed from: r */
    public mtn m156326r(@Nullable mtn mtnVar) {
        this.f135648i = x4u.m207024j(mtnVar);
        if (mtnVar == null) {
            return this;
        }
        x4u.m207018d(this.f135640a, mtnVar.f135640a, new w9j() { // from class: l.jtn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveActivity) obj).f44327id;
            }
        });
        this.f135642c.putAll(mtnVar.f135642c);
        this.f135643d.putAll(mtnVar.f135643d);
        this.f135644e.putAll(mtnVar.f135644e);
        this.f135647h = mtnVar.f135647h;
        m156315g();
        return this;
    }

    /* JADX INFO: renamed from: s */
    public mtn m156327s(@Nullable BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData;
        if (bLiveEnvelope != null && (bLiveData = bLiveEnvelope.data) != null) {
            if (!vwb.m200296J(bLiveData.users)) {
                for (User user : bLiveEnvelope.data.users) {
                    this.f135644e.put(user.f56011id, user);
                }
            }
            if (!vwb.m200296J(bLiveEnvelope.data.rooms)) {
                for (BLiveRoom bLiveRoom : bLiveEnvelope.data.rooms) {
                    this.f135643d.put(bLiveRoom.f44324id, bLiveRoom);
                }
            }
            if (!vwb.m200296J(bLiveEnvelope.data.lives)) {
                for (BLive bLive : bLiveEnvelope.data.lives) {
                    this.f135642c.put(bLive.f44323id, bLive);
                }
            }
            int iM156318j = m156318j();
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
            if (iM156318j > 0 && iM156318j < iM195600C4 && !arrayList.isEmpty()) {
                int i2 = 0;
                while (iM156318j < iM195600C4 && !arrayList.isEmpty()) {
                    if (i2 >= arrayList.size()) {
                        i2 = 0;
                    }
                    BLiveActivity bLiveActivityRemove = ((ActivitySuggests) arrayList.get(i2)).liveActivities.remove(new Random().nextInt(((ActivitySuggests) arrayList.get(i2)).liveActivities.size()));
                    int size2 = this.f135640a.size();
                    List<BLiveActivity> list = this.f135640a;
                    if (size2 > iM156318j) {
                        list.add(iM156318j, bLiveActivityRemove);
                    } else {
                        list.add(bLiveActivityRemove);
                    }
                    if (vwb.m200296J(((ActivitySuggests) arrayList.get(i2)).liveActivities)) {
                        arrayList.remove(i2);
                    }
                    i2++;
                    iM156318j++;
                }
            }
            this.f135645f.clear();
            vwb.m200354z(bLiveEnvelope.data.activitySuggests, new e30() { // from class: l.htn
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f109403a.m156323o((ActivitySuggests) obj);
                }
            });
            vwb.m200354z(this.f135645f, new e30() { // from class: l.itn
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f114894a.m156324p((ActivitySuggests) obj);
                }
            });
        }
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public BLiveAbsData m156328t(String str) {
        return this.f135642c.get(str);
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public BLiveAbsRoom m156329u(String str) {
        return this.f135643d.get(str);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public User m156330v(String str) {
        if (this.f135644e.containsKey(str)) {
            return this.f135644e.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public void m156331w() {
        Iterator<Map.Entry<ActivitySuggests, m8o>> it = this.f135646g.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m153488b();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m156332x(final ntn ntnVar) {
        m8o m8oVar = this.f135646g.get(ntnVar.f140497e);
        if (m8oVar != null) {
            if (m8oVar.m153490d(ntnVar.f140495c)) {
                boolean zIsEmpty = this.f135640a.isEmpty();
                List<BLiveActivity> list = this.f135640a;
                if (zIsEmpty) {
                    list.add(ntnVar.f140495c);
                } else if (vwb.m200323f(list, new w9j() { // from class: l.ltn
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((BLiveActivity) obj).f44327id, ntnVar.f140495c.f44327id));
                    }
                }) == 0) {
                    this.f135640a.add(0, ntnVar.f140495c);
                }
            }
            if (m8oVar.m153487a().isEmpty()) {
                this.f135646g.remove(ntnVar.f140497e);
                this.f135645f.remove(ntnVar.f140497e);
            }
        }
    }
}

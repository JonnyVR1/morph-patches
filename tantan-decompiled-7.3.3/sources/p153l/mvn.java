package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.ActivitySuggests;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallExtend;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
public class mvn {

    /* JADX INFO: renamed from: a */
    public final List<BLiveActivity> f138911a;

    /* JADX INFO: renamed from: b */
    public final Map<String, BLiveMultiCallExtend> f138912b;

    /* JADX INFO: renamed from: c */
    public final Map<String, BLiveAbsData> f138913c;

    /* JADX INFO: renamed from: d */
    public final Map<String, BLiveAbsRoom> f138914d;

    /* JADX INFO: renamed from: e */
    public final Map<String, User> f138915e;

    /* JADX INFO: renamed from: f */
    public final List<ActivitySuggests> f138916f;

    /* JADX INFO: renamed from: g */
    public final Map<ActivitySuggests, mao> f138917g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Pagination f138918h;

    /* JADX INFO: renamed from: i */
    public boolean f138919i;

    public mvn(BLiveEnvelope bLiveEnvelope) {
        ArrayList arrayList = new ArrayList();
        this.f138911a = arrayList;
        this.f138912b = new HashMap();
        this.f138913c = new HashMap();
        this.f138914d = new HashMap();
        this.f138915e = new HashMap();
        this.f138916f = new ArrayList();
        this.f138917g = new HashMap();
        this.f138919i = false;
        if (!jyb.m147479J(bLiveEnvelope.data.liveActivities)) {
            arrayList.addAll(bLiveEnvelope.data.liveActivities);
        }
        if (!jyb.m147479J(bLiveEnvelope.data.lives)) {
            for (BLive bLive : bLiveEnvelope.data.lives) {
                this.f138913c.put(bLive.f45171id, bLive);
            }
        }
        if (!jyb.m147479J(bLiveEnvelope.data.rooms)) {
            for (BLiveRoom bLiveRoom : bLiveEnvelope.data.rooms) {
                this.f138914d.put(bLiveRoom.f45172id, bLiveRoom);
            }
        }
        if (!jyb.m147479J(bLiveEnvelope.data.users)) {
            for (User user : bLiveEnvelope.data.users) {
                this.f138915e.put(user.f56859id, user);
            }
        }
        if (!jyb.m147479J(bLiveEnvelope.data.multiCallExtends)) {
            jyb.m147537z(bLiveEnvelope.data.multiCallExtends, new y20() { // from class: l.gvn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f106655a.m160297q((BLiveMultiCallExtend) obj);
                }
            });
        }
        this.f138918h = bLiveEnvelope.pagination;
        this.f138919i = y6u.m214506j(this);
        m160287g();
    }

    /* JADX INFO: renamed from: g */
    public final void m160287g() {
        ArrayList arrayList = new ArrayList();
        for (BLiveActivity bLiveActivity : this.f138911a) {
            BLiveAbsData bLiveAbsDataM160300t = m160300t(bLiveActivity.reference.f45267id);
            if (bLiveAbsDataM160300t != null && (y6u.m214514r(bLiveAbsDataM160300t) || uqb0.f180376H.guessedCurrentServerTime() - bLiveAbsDataM160300t.endTime <= 1.296E9d)) {
                arrayList.add(bLiveActivity);
            }
        }
        this.f138911a.clear();
        this.f138911a.addAll(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public List<ActivitySuggests> m160288h() {
        return this.f138916f;
    }

    /* JADX INFO: renamed from: i */
    public List<BLiveActivity> m160289i() {
        return this.f138911a;
    }

    /* JADX INFO: renamed from: j */
    public int m160290j() {
        return jyb.m147506f(this.f138911a, new qcj() { // from class: l.kvn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f128977a.m160294n((BLiveActivity) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public Pagination m160291k() {
        return this.f138918h;
    }

    /* JADX INFO: renamed from: l */
    public Map<ActivitySuggests, mao> m160292l() {
        return this.f138917g;
    }

    /* JADX INFO: renamed from: m */
    public boolean m160293m() {
        Pagination pagination;
        return (!this.f138919i || (pagination = this.f138918h) == null || TextUtils.isEmpty(pagination.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m160294n(BLiveActivity bLiveActivity) {
        BLiveAbsData bLiveAbsDataM160300t = m160300t(bLiveActivity.reference.f45267id);
        if (bLiveAbsDataM160300t != null) {
            return bLiveActivity.isMultiCallAudience() ? Boolean.valueOf(bLiveActivity.isMultiCallAudienceGoing()) : Boolean.valueOf(y6u.m214514r(bLiveAbsDataM160300t));
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m160295o(ActivitySuggests activitySuggests) {
        if (jyb.m147479J(activitySuggests.liveActivities)) {
            return;
        }
        this.f138916f.add(activitySuggests);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m160296p(ActivitySuggests activitySuggests) {
        this.f138917g.put(activitySuggests, new mao(activitySuggests));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m160297q(BLiveMultiCallExtend bLiveMultiCallExtend) {
        this.f138912b.put(bLiveMultiCallExtend.liveId, bLiveMultiCallExtend);
    }

    /* JADX INFO: renamed from: r */
    public mvn m160298r(@Nullable mvn mvnVar) {
        this.f138919i = y6u.m214506j(mvnVar);
        if (mvnVar == null) {
            return this;
        }
        y6u.m214500d(this.f138911a, mvnVar.f138911a, new qcj() { // from class: l.jvn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveActivity) obj).f45175id;
            }
        });
        this.f138913c.putAll(mvnVar.f138913c);
        this.f138914d.putAll(mvnVar.f138914d);
        this.f138915e.putAll(mvnVar.f138915e);
        this.f138918h = mvnVar.f138918h;
        m160287g();
        return this;
    }

    /* JADX INFO: renamed from: s */
    public mvn m160299s(@Nullable BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData;
        if (bLiveEnvelope != null && (bLiveData = bLiveEnvelope.data) != null) {
            if (!jyb.m147479J(bLiveData.users)) {
                for (User user : bLiveEnvelope.data.users) {
                    this.f138915e.put(user.f56859id, user);
                }
            }
            if (!jyb.m147479J(bLiveEnvelope.data.rooms)) {
                for (BLiveRoom bLiveRoom : bLiveEnvelope.data.rooms) {
                    this.f138914d.put(bLiveRoom.f45172id, bLiveRoom);
                }
            }
            if (!jyb.m147479J(bLiveEnvelope.data.lives)) {
                for (BLive bLive : bLiveEnvelope.data.lives) {
                    this.f138913c.put(bLive.f45171id, bLive);
                }
            }
            int iM160290j = m160290j();
            int iM203387C4 = tbs.f172989b.m203387C4();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(bLiveEnvelope.data.activitySuggests);
            arrayList2.size();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ActivitySuggests activitySuggests = (ActivitySuggests) arrayList2.remove(new Random().nextInt(arrayList2.size()));
                if (!jyb.m147479J(activitySuggests.liveActivities)) {
                    arrayList.add(activitySuggests);
                    if (arrayList.size() == 2) {
                        break;
                    }
                }
            }
            if (iM160290j > 0 && iM160290j < iM203387C4 && !arrayList.isEmpty()) {
                int i2 = 0;
                while (iM160290j < iM203387C4 && !arrayList.isEmpty()) {
                    if (i2 >= arrayList.size()) {
                        i2 = 0;
                    }
                    BLiveActivity bLiveActivityRemove = ((ActivitySuggests) arrayList.get(i2)).liveActivities.remove(new Random().nextInt(((ActivitySuggests) arrayList.get(i2)).liveActivities.size()));
                    int size2 = this.f138911a.size();
                    List<BLiveActivity> list = this.f138911a;
                    if (size2 > iM160290j) {
                        list.add(iM160290j, bLiveActivityRemove);
                    } else {
                        list.add(bLiveActivityRemove);
                    }
                    if (jyb.m147479J(((ActivitySuggests) arrayList.get(i2)).liveActivities)) {
                        arrayList.remove(i2);
                    }
                    i2++;
                    iM160290j++;
                }
            }
            this.f138916f.clear();
            jyb.m147537z(bLiveEnvelope.data.activitySuggests, new y20() { // from class: l.hvn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111770a.m160295o((ActivitySuggests) obj);
                }
            });
            jyb.m147537z(this.f138916f, new y20() { // from class: l.ivn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f117100a.m160296p((ActivitySuggests) obj);
                }
            });
        }
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public BLiveAbsData m160300t(String str) {
        return this.f138913c.get(str);
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public BLiveAbsRoom m160301u(String str) {
        return this.f138914d.get(str);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public User m160302v(String str) {
        if (this.f138915e.containsKey(str)) {
            return this.f138915e.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public void m160303w() {
        Iterator<Map.Entry<ActivitySuggests, mao>> it = this.f138917g.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m157732b();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m160304x(final nvn nvnVar) {
        mao maoVar = this.f138917g.get(nvnVar.f143825e);
        if (maoVar != null) {
            if (maoVar.m157734d(nvnVar.f143823c)) {
                boolean zIsEmpty = this.f138911a.isEmpty();
                List<BLiveActivity> list = this.f138911a;
                if (zIsEmpty) {
                    list.add(nvnVar.f143823c);
                } else if (jyb.m147506f(list, new qcj() { // from class: l.lvn
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((BLiveActivity) obj).f45175id, nvnVar.f143823c.f45175id));
                    }
                }) == 0) {
                    this.f138911a.add(0, nvnVar.f143823c);
                }
            }
            if (maoVar.m157731a().isEmpty()) {
                this.f138917g.remove(nvnVar.f143825e);
                this.f138916f.remove(nvnVar.f143825e);
            }
        }
    }
}

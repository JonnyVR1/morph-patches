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
public class rtr {

    /* JADX INFO: renamed from: a */
    public final List<BLiveActivity> f164849a;

    /* JADX INFO: renamed from: b */
    public final Map<String, BLiveMultiCallExtend> f164850b;

    /* JADX INFO: renamed from: c */
    public final Map<String, BLiveAbsData> f164851c;

    /* JADX INFO: renamed from: d */
    public final Map<String, BLiveAbsRoom> f164852d;

    /* JADX INFO: renamed from: e */
    public final Map<String, User> f164853e;

    /* JADX INFO: renamed from: f */
    public final List<ActivitySuggests> f164854f;

    /* JADX INFO: renamed from: g */
    public final Map<ActivitySuggests, ocu> f164855g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Pagination f164856h;

    /* JADX INFO: renamed from: i */
    public boolean f164857i;

    public rtr(BLiveEnvelope bLiveEnvelope) {
        ArrayList arrayList = new ArrayList();
        this.f164849a = arrayList;
        this.f164850b = new HashMap();
        this.f164851c = new HashMap();
        this.f164852d = new HashMap();
        this.f164853e = new HashMap();
        this.f164854f = new ArrayList();
        this.f164855g = new HashMap();
        this.f164857i = false;
        if (!jyb.m147479J(bLiveEnvelope.data.liveActivities)) {
            arrayList.addAll(bLiveEnvelope.data.liveActivities);
        }
        if (!jyb.m147479J(bLiveEnvelope.data.lives)) {
            for (BLive bLive : bLiveEnvelope.data.lives) {
                this.f164851c.put(bLive.f45171id, bLive);
            }
        }
        if (!jyb.m147479J(bLiveEnvelope.data.rooms)) {
            for (BLiveRoom bLiveRoom : bLiveEnvelope.data.rooms) {
                this.f164852d.put(bLiveRoom.f45172id, bLiveRoom);
            }
        }
        if (!jyb.m147479J(bLiveEnvelope.data.users)) {
            for (User user : bLiveEnvelope.data.users) {
                this.f164853e.put(user.f56859id, user);
            }
        }
        if (!jyb.m147479J(bLiveEnvelope.data.multiCallExtends)) {
            jyb.m147537z(bLiveEnvelope.data.multiCallExtends, new y20() { // from class: l.ltr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f133561a.m183157q((BLiveMultiCallExtend) obj);
                }
            });
        }
        this.f164856h = bLiveEnvelope.pagination;
        this.f164857i = y6u.m214507k(this);
        m183147g();
    }

    /* JADX INFO: renamed from: g */
    public final void m183147g() {
        ArrayList arrayList = new ArrayList();
        for (BLiveActivity bLiveActivity : this.f164849a) {
            BLiveAbsData bLiveAbsDataM183160t = m183160t(bLiveActivity.reference.f45267id);
            if (bLiveAbsDataM183160t != null && (y6u.m214514r(bLiveAbsDataM183160t) || uqb0.f180376H.guessedCurrentServerTime() - bLiveAbsDataM183160t.endTime <= 1.296E9d)) {
                arrayList.add(bLiveActivity);
            }
        }
        this.f164849a.clear();
        this.f164849a.addAll(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public List<ActivitySuggests> m183148h() {
        return this.f164854f;
    }

    /* JADX INFO: renamed from: i */
    public List<BLiveActivity> m183149i() {
        return this.f164849a;
    }

    /* JADX INFO: renamed from: j */
    public int m183150j() {
        return jyb.m147506f(this.f164849a, new qcj() { // from class: l.otr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f149003a.m183154n((BLiveActivity) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public Pagination m183151k() {
        return this.f164856h;
    }

    /* JADX INFO: renamed from: l */
    public Map<ActivitySuggests, ocu> m183152l() {
        return this.f164855g;
    }

    /* JADX INFO: renamed from: m */
    public boolean m183153m() {
        Pagination pagination;
        return (!this.f164857i || (pagination = this.f164856h) == null || TextUtils.isEmpty(pagination.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Boolean m183154n(BLiveActivity bLiveActivity) {
        BLiveAbsData bLiveAbsDataM183160t = m183160t(bLiveActivity.reference.f45267id);
        if (bLiveAbsDataM183160t != null) {
            return bLiveActivity.isMultiCallAudience() ? Boolean.valueOf(bLiveActivity.isMultiCallAudienceGoing()) : Boolean.valueOf(y6u.m214514r(bLiveAbsDataM183160t));
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m183155o(ActivitySuggests activitySuggests) {
        if (jyb.m147479J(activitySuggests.liveActivities)) {
            return;
        }
        this.f164854f.add(activitySuggests);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m183156p(ActivitySuggests activitySuggests) {
        this.f164855g.put(activitySuggests, new ocu(activitySuggests));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m183157q(BLiveMultiCallExtend bLiveMultiCallExtend) {
        this.f164850b.put(bLiveMultiCallExtend.liveId, bLiveMultiCallExtend);
    }

    /* JADX INFO: renamed from: r */
    public rtr m183158r(@Nullable rtr rtrVar) {
        this.f164857i = y6u.m214507k(rtrVar);
        if (rtrVar == null) {
            return this;
        }
        y6u.m214500d(this.f164849a, rtrVar.f164849a, new qcj() { // from class: l.ptr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveActivity) obj).f45175id;
            }
        });
        this.f164851c.putAll(rtrVar.f164851c);
        this.f164852d.putAll(rtrVar.f164852d);
        this.f164853e.putAll(rtrVar.f164853e);
        this.f164856h = rtrVar.f164856h;
        m183147g();
        return this;
    }

    /* JADX INFO: renamed from: s */
    public rtr m183159s(@Nullable BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData;
        if (bLiveEnvelope != null && (bLiveData = bLiveEnvelope.data) != null) {
            if (!jyb.m147479J(bLiveData.users)) {
                for (User user : bLiveEnvelope.data.users) {
                    this.f164853e.put(user.f56859id, user);
                }
            }
            if (!jyb.m147479J(bLiveEnvelope.data.rooms)) {
                for (BLiveRoom bLiveRoom : bLiveEnvelope.data.rooms) {
                    this.f164852d.put(bLiveRoom.f45172id, bLiveRoom);
                }
            }
            if (!jyb.m147479J(bLiveEnvelope.data.lives)) {
                for (BLive bLive : bLiveEnvelope.data.lives) {
                    this.f164851c.put(bLive.f45171id, bLive);
                }
            }
            int iM183150j = m183150j();
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
            if (iM183150j > 0 && iM183150j < iM203387C4 && !arrayList.isEmpty()) {
                int i2 = 0;
                while (iM183150j < iM203387C4 && !arrayList.isEmpty()) {
                    if (i2 >= arrayList.size()) {
                        i2 = 0;
                    }
                    BLiveActivity bLiveActivityRemove = ((ActivitySuggests) arrayList.get(i2)).liveActivities.remove(new Random().nextInt(((ActivitySuggests) arrayList.get(i2)).liveActivities.size()));
                    int size2 = this.f164849a.size();
                    List<BLiveActivity> list = this.f164849a;
                    if (size2 > iM183150j) {
                        list.add(iM183150j, bLiveActivityRemove);
                    } else {
                        list.add(bLiveActivityRemove);
                    }
                    if (jyb.m147479J(((ActivitySuggests) arrayList.get(i2)).liveActivities)) {
                        arrayList.remove(i2);
                    }
                    i2++;
                    iM183150j++;
                }
            }
            this.f164854f.clear();
            jyb.m147537z(bLiveEnvelope.data.activitySuggests, new y20() { // from class: l.mtr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f138657a.m183155o((ActivitySuggests) obj);
                }
            });
            jyb.m147537z(this.f164854f, new y20() { // from class: l.ntr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f143629a.m183156p((ActivitySuggests) obj);
                }
            });
        }
        return this;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public BLiveAbsData m183160t(String str) {
        return this.f164851c.get(str);
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public BLiveAbsRoom m183161u(String str) {
        return this.f164852d.get(str);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public User m183162v(String str) {
        if (this.f164853e.containsKey(str)) {
            return this.f164853e.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public void m183163w() {
        Iterator<Map.Entry<ActivitySuggests, ocu>> it = this.f164855g.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m167236b();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m183164x(final gur gurVar) {
        ocu ocuVar = this.f164855g.get(gurVar.f106566e);
        if (ocuVar != null) {
            if (ocuVar.m167238d(gurVar.f106564c)) {
                boolean zIsEmpty = this.f164849a.isEmpty();
                List<BLiveActivity> list = this.f164849a;
                if (zIsEmpty) {
                    list.add(gurVar.f106564c);
                } else if (jyb.m147506f(list, new qcj() { // from class: l.qtr
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((BLiveActivity) obj).f45175id, gurVar.f106564c.f45175id));
                    }
                }) == 0) {
                    this.f164849a.add(0, gurVar.f106564c);
                }
            }
            if (ocuVar.m167235a().isEmpty()) {
                this.f164855g.remove(gurVar.f106566e);
                this.f164854f.remove(gurVar.f106566e);
            }
        }
    }
}

package p153l;

import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.data.LiveWindowInfo;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveState;
import com.p051p1.mobile.putong.data.VoiceLiveState;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.apibean.IntlVoiceLiveActivitiesCellBean;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class fk3 {

    /* JADX INFO: renamed from: a */
    public C16995a f99450a;

    /* JADX INFO: renamed from: b */
    public SchemeKey f99451b;

    /* JADX INFO: renamed from: c */
    public abe0 f99452c;

    /* JADX INFO: renamed from: d */
    public z20<String, String> f99453d;

    /* JADX INFO: renamed from: s */
    public IntlVoiceLiveActivitiesCellBean f99468s;

    /* JADX INFO: renamed from: x */
    public BLiveUserLevel f99473x;

    /* JADX INFO: renamed from: e */
    public ConcurrentHashMap<String, UserLiveState> f99454e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    public ConcurrentHashMap<String, VoiceLiveState> f99455f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    public ConcurrentHashMap<String, LiveWindowInfo> f99456g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h */
    public C22507a<BLiveMonetizationConfig> f99457h = C22507a.m222758b();

    /* JADX INFO: renamed from: i */
    public C22508b<User> f99458i = C22508b.m222767b();

    /* JADX INFO: renamed from: j */
    public dgu f99459j = new dgu();

    /* JADX INFO: renamed from: k */
    public C22508b<String> f99460k = C22508b.m222767b();

    /* JADX INFO: renamed from: l */
    public C22507a<lc3> f99461l = C22507a.m222758b();

    /* JADX INFO: renamed from: m */
    public C22508b<uxj0> f99462m = C22508b.m222767b();

    /* JADX INFO: renamed from: n */
    public C22507a<m4s> f99463n = C22507a.m222758b();

    /* JADX INFO: renamed from: o */
    public C22507a<uxj0> f99464o = C22507a.m222758b();

    /* JADX INFO: renamed from: p */
    public C22507a<String> f99465p = C22507a.m222758b();

    /* JADX INFO: renamed from: q */
    public C22507a<Boolean> f99466q = C22507a.m222758b();

    /* JADX INFO: renamed from: r */
    public C22507a<C16996b> f99467r = C22507a.m222758b();

    /* JADX INFO: renamed from: t */
    public C22507a<uxj0> f99469t = C22507a.m222758b();

    /* JADX INFO: renamed from: u */
    public final C22507a<Integer> f99470u = C22507a.m222759c(-1);

    /* JADX INFO: renamed from: v */
    public final C22507a<BLiveCounter> f99471v = C22507a.m222758b();

    /* JADX INFO: renamed from: w */
    public C22508b<a9d0> f99472w = C22508b.m222767b();

    /* JADX INFO: renamed from: l.fk3$a */
    public static class C16995a {

        /* JADX INFO: renamed from: a */
        public int f99474a;

        /* JADX INFO: renamed from: b */
        public String f99475b;

        /* JADX INFO: renamed from: c */
        public abe0 f99476c;

        /* JADX INFO: renamed from: d */
        public z20<String, String> f99477d;

        /* JADX INFO: renamed from: e */
        public PushMessage f99478e;

        /* JADX INFO: renamed from: f */
        public PushTrackData f99479f;
    }

    /* JADX INFO: renamed from: l.fk3$b */
    public static class C16996b {

        /* JADX INFO: renamed from: a */
        public String f99480a;

        /* JADX INFO: renamed from: b */
        public String f99481b;
    }

    /* JADX INFO: renamed from: A */
    public C22421c<uxj0> m125934A() {
        return this.f99462m.asObservable();
    }

    /* JADX INFO: renamed from: B */
    public String m125935B(String str) {
        UserLiveState userLiveState = this.f99454e.get(str);
        if (userLiveState == null) {
            return null;
        }
        return userLiveState.liveId;
    }

    /* JADX INFO: renamed from: C */
    public UserLiveState m125936C(String str) {
        return this.f99454e.get(str);
    }

    /* JADX INFO: renamed from: D */
    public String m125937D(String str) {
        VoiceLiveState voiceLiveState = this.f99455f.get(str);
        if (voiceLiveState == null) {
            return null;
        }
        return voiceLiveState.voiceLiveId;
    }

    /* JADX INFO: renamed from: E */
    public VoiceLiveState m125938E(String str) {
        return this.f99455f.get(str);
    }

    /* JADX INFO: renamed from: F */
    public void m125939F(Act act) {
        SchemeKey schemeKey = this.f99451b;
        if (schemeKey != null && this.f99452c != null) {
            if (SchemeKey.enterVoiceRoom.equals(schemeKey.toString())) {
                act.startActivity(mbs.m157875r(act, NavigationIntent.get("cards")));
                h3g0.m133482a(act, v5k0.m199898j(this.f99452c, "tabId"));
            } else if ("live".equals(this.f99451b.toString())) {
                act.startActivity(mbs.m157875r(act, NavigationIntent.get("live")));
            }
            q5k0.m175372I().mo175432e(this.f99451b, new abe0.C15681a(act, this.f99452c.m96740c()).m96748d(), this.f99453d);
            act.overridePendingTransition(0, 0);
        }
        m125955f();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m125940G(C16996b c16996b) {
        this.f99467r.onNext(null);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m125941H(User user) {
        if (this.f99454e.get(user.f56859id) != null) {
            this.f99454e.remove(user.f56859id);
        }
        if (TEnum.equals(user.liveState.state, "onlive") || TEnum.equals(user.liveState.state, "suspended")) {
            this.f99454e.put(user.f56859id, user.liveState);
        }
        if (this.f99455f.get(user.f56859id) != null) {
            this.f99455f.remove(user.f56859id);
        }
        if ("onlive".equalsIgnoreCase(user.voiceLiveState.state)) {
            this.f99455f.put(user.f56859id, user.voiceLiveState);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m125942I(String str) {
        this.f99460k.onNext(str);
    }

    /* JADX INFO: renamed from: J */
    public void m125943J() {
        this.f99462m.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: K */
    public void m125944K(List<User> list) {
        if (mqr.m159592l() && list != null) {
            jyb.m147537z(list, new y20() { // from class: l.ck3
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f82261a.m125941H((User) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: L */
    public void m125945L() {
        this.f99464o.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: M */
    public void m125946M(m4s m4sVar) {
        m4s m4sVarM125963n = m125963n();
        if (NullChecker.m82486a(m4sVarM125963n) && NullChecker.m82486a(m4sVar) && (TextUtils.isEmpty(m4sVar.m157054a()) || (!TextUtils.isEmpty(m4sVarM125963n.m157054a()) && m4sVarM125963n.m157054a().equals(m4sVar.m157054a())))) {
            this.f99463n.onNext(m4sVar);
            return;
        }
        if (NullChecker.m82486a(m4sVarM125963n) && !NullChecker.m82486a(m4sVar)) {
            this.f99463n.onNext(m4sVar);
        } else if (NullChecker.m82486a(m4sVar)) {
            this.f99463n.onNext(m4sVar);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m125947N(IntlVoiceLiveActivitiesCellBean intlVoiceLiveActivitiesCellBean) {
        this.f99468s = intlVoiceLiveActivitiesCellBean;
        this.f99469t.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: O */
    public void m125948O(SchemeKey schemeKey, abe0 abe0Var, z20<String, String> z20Var) {
        this.f99451b = schemeKey;
        this.f99452c = abe0Var;
        this.f99453d = z20Var;
    }

    /* JADX INFO: renamed from: P */
    public void m125949P(C16995a c16995a) {
        this.f99450a = c16995a;
    }

    /* JADX INFO: renamed from: Q */
    public void m125950Q(C16996b c16996b) {
        this.f99467r.onNext(c16996b);
    }

    /* JADX INFO: renamed from: R */
    public void m125951R(lc3 lc3Var) {
        this.f99461l.onNext(lc3Var);
    }

    /* JADX INFO: renamed from: S */
    public void m125952S(User user, boolean z) {
        this.f99459j.m115756e(user);
        tbs.f172993f.m143719u(user, z);
        if (z) {
            this.f99458i.onNext(user);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public void m125953d(User user) {
        this.f99459j.m115752a(user, "scene_out_live_room");
    }

    /* JADX INFO: renamed from: e */
    public void m125954e(BLiveCounter bLiveCounter) {
        this.f99471v.onNext(bLiveCounter);
    }

    /* JADX INFO: renamed from: f */
    public void m125955f() {
        this.f99451b = null;
        this.f99452c = null;
        this.f99453d = null;
    }

    /* JADX INFO: renamed from: g */
    public void m125956g() {
        this.f99450a = null;
    }

    /* JADX INFO: renamed from: h */
    public C22421c<BLiveCounter> m125957h() {
        return this.f99471v.asObservable();
    }

    /* JADX INFO: renamed from: i */
    public BLiveCounter m125958i() {
        return this.f99471v.m222761e();
    }

    /* JADX INFO: renamed from: j */
    public C22421c<BLiveMonetizationConfig> m125959j() {
        if (this.f99457h.m222761e() == null) {
            if (wft.m206159b(1)) {
                LiveSquareApi.requestBubble();
            } else {
                IntlLiveNormalApi.requestBubble();
            }
        }
        return this.f99457h.asObservable();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public BLiveMonetizationConfig m125960k() {
        return this.f99457h.m222761e();
    }

    /* JADX INFO: renamed from: l */
    public C22421c<User> m125961l() {
        return this.f99458i.asObservable();
    }

    /* JADX INFO: renamed from: m */
    public C16995a m125962m() {
        return this.f99450a;
    }

    /* JADX INFO: renamed from: n */
    public m4s m125963n() {
        return this.f99463n.m222761e();
    }

    /* JADX INFO: renamed from: o */
    public C22421c<m4s> m125964o() {
        return this.f99463n.asObservable().onBackpressureLatest();
    }

    /* JADX INFO: renamed from: p */
    public C22421c<uxj0> m125965p() {
        return this.f99464o.asObservable();
    }

    /* JADX INFO: renamed from: q */
    public IntlVoiceLiveActivitiesCellBean m125966q() {
        return this.f99468s;
    }

    /* JADX INFO: renamed from: r */
    public C22421c<uxj0> m125967r() {
        return this.f99469t.asObservable();
    }

    /* JADX INFO: renamed from: s */
    public C22421c<lc3> m125968s() {
        return this.f99461l.asObservable();
    }

    /* JADX INFO: renamed from: t */
    public lc3 m125969t() {
        return this.f99461l.m222761e();
    }

    /* JADX INFO: renamed from: u */
    public String m125970u() {
        return this.f99465p.m222761e();
    }

    /* JADX INFO: renamed from: v */
    public User m125971v(String str) {
        return this.f99459j.m115754c(str);
    }

    /* JADX INFO: renamed from: w */
    public long m125972w() {
        BLiveUserLevel bLiveUserLevel = this.f99473x;
        if (bLiveUserLevel != null) {
            return bLiveUserLevel.grade;
        }
        LiveSquareApi.requestMyLiveHierarchy();
        return 0L;
    }

    /* JADX INFO: renamed from: x */
    public C22421c<a9d0> m125973x() {
        return this.f99472w.asObservable();
    }

    /* JADX INFO: renamed from: y */
    public C22421c<C16996b> m125974y() {
        return this.f99467r.asObservable().filter(new qcj() { // from class: l.dk3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((fk3.C16996b) obj) != null);
            }
        }).doOnNext(new y20() { // from class: l.ek3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94340a.m125940G((fk3.C16996b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public C22421c<String> m125975z() {
        return this.f99460k.throttleLast(5L, TimeUnit.SECONDS).observeOn(fo0.m126432a());
    }
}

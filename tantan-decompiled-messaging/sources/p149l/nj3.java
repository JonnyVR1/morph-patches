package p149l;

import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.data.LiveWindowInfo;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveState;
import com.p046p1.mobile.putong.data.VoiceLiveState;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.apibean.IntlVoiceLiveActivitiesCellBean;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public class nj3 {

    /* JADX INFO: renamed from: a */
    public C18704a f139177a;

    /* JADX INFO: renamed from: b */
    public SchemeKey f139178b;

    /* JADX INFO: renamed from: c */
    public w2e0 f139179c;

    /* JADX INFO: renamed from: d */
    public f30<String, String> f139180d;

    /* JADX INFO: renamed from: s */
    public IntlVoiceLiveActivitiesCellBean f139195s;

    /* JADX INFO: renamed from: x */
    public BLiveUserLevel f139200x;

    /* JADX INFO: renamed from: e */
    public ConcurrentHashMap<String, UserLiveState> f139181e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    public ConcurrentHashMap<String, VoiceLiveState> f139182f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    public ConcurrentHashMap<String, LiveWindowInfo> f139183g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h */
    public C22392a<BLiveMonetizationConfig> f139184h = C22392a.m221512b();

    /* JADX INFO: renamed from: i */
    public C22393b<User> f139185i = C22393b.m221521b();

    /* JADX INFO: renamed from: j */
    public ceu f139186j = new ceu();

    /* JADX INFO: renamed from: k */
    public C22393b<String> f139187k = C22393b.m221521b();

    /* JADX INFO: renamed from: l */
    public C22392a<wb3> f139188l = C22392a.m221512b();

    /* JADX INFO: renamed from: m */
    public C22393b<roj0> f139189m = C22393b.m221521b();

    /* JADX INFO: renamed from: n */
    public C22392a<l2s> f139190n = C22392a.m221512b();

    /* JADX INFO: renamed from: o */
    public C22392a<roj0> f139191o = C22392a.m221512b();

    /* JADX INFO: renamed from: p */
    public C22392a<String> f139192p = C22392a.m221512b();

    /* JADX INFO: renamed from: q */
    public C22392a<Boolean> f139193q = C22392a.m221512b();

    /* JADX INFO: renamed from: r */
    public C22392a<C18705b> f139194r = C22392a.m221512b();

    /* JADX INFO: renamed from: t */
    public C22392a<roj0> f139196t = C22392a.m221512b();

    /* JADX INFO: renamed from: u */
    public final C22392a<Integer> f139197u = C22392a.m221513c(-1);

    /* JADX INFO: renamed from: v */
    public final C22392a<BLiveCounter> f139198v = C22392a.m221512b();

    /* JADX INFO: renamed from: w */
    public C22393b<x0d0> f139199w = C22393b.m221521b();

    /* JADX INFO: renamed from: l.nj3$a */
    public static class C18704a {

        /* JADX INFO: renamed from: a */
        public int f139201a;

        /* JADX INFO: renamed from: b */
        public String f139202b;

        /* JADX INFO: renamed from: c */
        public w2e0 f139203c;

        /* JADX INFO: renamed from: d */
        public f30<String, String> f139204d;

        /* JADX INFO: renamed from: e */
        public PushMessage f139205e;

        /* JADX INFO: renamed from: f */
        public PushTrackData f139206f;
    }

    /* JADX INFO: renamed from: l.nj3$b */
    public static class C18705b {

        /* JADX INFO: renamed from: a */
        public String f139207a;

        /* JADX INFO: renamed from: b */
        public String f139208b;
    }

    /* JADX INFO: renamed from: A */
    public C22306c<roj0> m159603A() {
        return this.f139189m.asObservable();
    }

    /* JADX INFO: renamed from: B */
    public String m159604B(String str) {
        UserLiveState userLiveState = this.f139181e.get(str);
        if (userLiveState == null) {
            return null;
        }
        return userLiveState.liveId;
    }

    /* JADX INFO: renamed from: C */
    public UserLiveState m159605C(String str) {
        return this.f139181e.get(str);
    }

    /* JADX INFO: renamed from: D */
    public String m159606D(String str) {
        VoiceLiveState voiceLiveState = this.f139182f.get(str);
        if (voiceLiveState == null) {
            return null;
        }
        return voiceLiveState.voiceLiveId;
    }

    /* JADX INFO: renamed from: E */
    public VoiceLiveState m159607E(String str) {
        return this.f139182f.get(str);
    }

    /* JADX INFO: renamed from: F */
    public void m159608F(Act act) {
        SchemeKey schemeKey = this.f139178b;
        if (schemeKey != null && this.f139179c != null) {
            if (SchemeKey.enterVoiceRoom.equals(schemeKey.toString())) {
                act.startActivity(l9s.m149098r(act, NavigationIntent.get("cards")));
                yuf0.m216111a(act, rwj0.m181411j(this.f139179c, "tabId"));
            } else if ("live".equals(this.f139178b.toString())) {
                act.startActivity(l9s.m149098r(act, NavigationIntent.get("live")));
            }
            mwj0.m156660I().mo156716e(this.f139178b, new w2e0.C20787a(act, this.f139179c.m201095c()).m201103d(), this.f139180d);
            act.overridePendingTransition(0, 0);
        }
        m159624f();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m159609G(C18705b c18705b) {
        this.f139194r.onNext(null);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m159610H(User user) {
        if (this.f139181e.get(user.f56011id) != null) {
            this.f139181e.remove(user.f56011id);
        }
        if (TEnum.equals(user.liveState.state, "onlive") || TEnum.equals(user.liveState.state, "suspended")) {
            this.f139181e.put(user.f56011id, user.liveState);
        }
        if (this.f139182f.get(user.f56011id) != null) {
            this.f139182f.remove(user.f56011id);
        }
        if ("onlive".equalsIgnoreCase(user.voiceLiveState.state)) {
            this.f139182f.put(user.f56011id, user.voiceLiveState);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m159611I(String str) {
        this.f139187k.onNext(str);
    }

    /* JADX INFO: renamed from: J */
    public void m159612J() {
        this.f139189m.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: K */
    public void m159613K(List<User> list) {
        if (lor.m150807l() && list != null) {
            vwb.m200354z(list, new e30() { // from class: l.kj3
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123428a.m159610H((User) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: L */
    public void m159614L() {
        this.f139191o.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: M */
    public void m159615M(l2s l2sVar) {
        l2s l2sVarM159632n = m159632n();
        if (NullChecker.m81303a(l2sVarM159632n) && NullChecker.m81303a(l2sVar) && (TextUtils.isEmpty(l2sVar.m148296a()) || (!TextUtils.isEmpty(l2sVarM159632n.m148296a()) && l2sVarM159632n.m148296a().equals(l2sVar.m148296a())))) {
            this.f139190n.onNext(l2sVar);
            return;
        }
        if (NullChecker.m81303a(l2sVarM159632n) && !NullChecker.m81303a(l2sVar)) {
            this.f139190n.onNext(l2sVar);
        } else if (NullChecker.m81303a(l2sVar)) {
            this.f139190n.onNext(l2sVar);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m159616N(IntlVoiceLiveActivitiesCellBean intlVoiceLiveActivitiesCellBean) {
        this.f139195s = intlVoiceLiveActivitiesCellBean;
        this.f139196t.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: O */
    public void m159617O(SchemeKey schemeKey, w2e0 w2e0Var, f30<String, String> f30Var) {
        this.f139178b = schemeKey;
        this.f139179c = w2e0Var;
        this.f139180d = f30Var;
    }

    /* JADX INFO: renamed from: P */
    public void m159618P(C18704a c18704a) {
        this.f139177a = c18704a;
    }

    /* JADX INFO: renamed from: Q */
    public void m159619Q(C18705b c18705b) {
        this.f139194r.onNext(c18705b);
    }

    /* JADX INFO: renamed from: R */
    public void m159620R(wb3 wb3Var) {
        this.f139188l.onNext(wb3Var);
    }

    /* JADX INFO: renamed from: S */
    public void m159621S(User user, boolean z) {
        this.f139186j.m106353e(user);
        s9s.f163232f.m134388u(user, z);
        if (z) {
            this.f139185i.onNext(user);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public void m159622d(User user) {
        this.f139186j.m106349a(user, "scene_out_live_room");
    }

    /* JADX INFO: renamed from: e */
    public void m159623e(BLiveCounter bLiveCounter) {
        this.f139198v.onNext(bLiveCounter);
    }

    /* JADX INFO: renamed from: f */
    public void m159624f() {
        this.f139178b = null;
        this.f139179c = null;
        this.f139180d = null;
    }

    /* JADX INFO: renamed from: g */
    public void m159625g() {
        this.f139177a = null;
    }

    /* JADX INFO: renamed from: h */
    public C22306c<BLiveCounter> m159626h() {
        return this.f139198v.asObservable();
    }

    /* JADX INFO: renamed from: i */
    public BLiveCounter m159627i() {
        return this.f139198v.m221515e();
    }

    /* JADX INFO: renamed from: j */
    public C22306c<BLiveMonetizationConfig> m159628j() {
        if (this.f139184h.m221515e() == null) {
            if (vdt.m198092b(1)) {
                LiveSquareApi.requestBubble();
            } else {
                IntlLiveNormalApi.requestBubble();
            }
        }
        return this.f139184h.asObservable();
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public BLiveMonetizationConfig m159629k() {
        return this.f139184h.m221515e();
    }

    /* JADX INFO: renamed from: l */
    public C22306c<User> m159630l() {
        return this.f139185i.asObservable();
    }

    /* JADX INFO: renamed from: m */
    public C18704a m159631m() {
        return this.f139177a;
    }

    /* JADX INFO: renamed from: n */
    public l2s m159632n() {
        return this.f139190n.m221515e();
    }

    /* JADX INFO: renamed from: o */
    public C22306c<l2s> m159633o() {
        return this.f139190n.asObservable().onBackpressureLatest();
    }

    /* JADX INFO: renamed from: p */
    public C22306c<roj0> m159634p() {
        return this.f139191o.asObservable();
    }

    /* JADX INFO: renamed from: q */
    public IntlVoiceLiveActivitiesCellBean m159635q() {
        return this.f139195s;
    }

    /* JADX INFO: renamed from: r */
    public C22306c<roj0> m159636r() {
        return this.f139196t.asObservable();
    }

    /* JADX INFO: renamed from: s */
    public C22306c<wb3> m159637s() {
        return this.f139188l.asObservable();
    }

    /* JADX INFO: renamed from: t */
    public wb3 m159638t() {
        return this.f139188l.m221515e();
    }

    /* JADX INFO: renamed from: u */
    public String m159639u() {
        return this.f139192p.m221515e();
    }

    /* JADX INFO: renamed from: v */
    public User m159640v(String str) {
        return this.f139186j.m106351c(str);
    }

    /* JADX INFO: renamed from: w */
    public long m159641w() {
        BLiveUserLevel bLiveUserLevel = this.f139200x;
        if (bLiveUserLevel != null) {
            return bLiveUserLevel.grade;
        }
        LiveSquareApi.requestMyLiveHierarchy();
        return 0L;
    }

    /* JADX INFO: renamed from: x */
    public C22306c<x0d0> m159642x() {
        return this.f139199w.asObservable();
    }

    /* JADX INFO: renamed from: y */
    public C22306c<C18705b> m159643y() {
        return this.f139194r.asObservable().filter(new w9j() { // from class: l.lj3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((nj3.C18705b) obj) != null);
            }
        }).doOnNext(new e30() { // from class: l.mj3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134094a.m159609G((nj3.C18705b) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public C22306c<String> m159644z() {
        return this.f139187k.throttleLast(5L, TimeUnit.SECONDS).observeOn(jo0.m142408a());
    }
}

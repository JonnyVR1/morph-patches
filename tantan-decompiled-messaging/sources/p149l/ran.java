package p149l;

import androidx.annotation.RestrictTo;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.util.CityAreaScope;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ran {

    /* JADX INFO: renamed from: k */
    public static volatile ran f158532k;

    /* JADX INFO: renamed from: a */
    public final tpd0 f158533a = new tpd0("intl.event.send_message_count", 0);

    /* JADX INFO: renamed from: b */
    public final hpd0 f158534b;

    /* JADX INFO: renamed from: c */
    public final kpd0 f158535c;

    /* JADX INFO: renamed from: d */
    public final hpd0 f158536d;

    /* JADX INFO: renamed from: e */
    public final zpd0 f158537e;

    /* JADX INFO: renamed from: f */
    public final tpd0 f158538f;

    /* JADX INFO: renamed from: g */
    public final zpd0 f158539g;

    /* JADX INFO: renamed from: h */
    public final hpd0 f158540h;

    /* JADX INFO: renamed from: i */
    public final kpd0 f158541i;

    /* JADX INFO: renamed from: j */
    public z3g0 f158542j;

    public ran() {
        Boolean bool = Boolean.FALSE;
        this.f158534b = new hpd0("intl.event.pic3", bool);
        this.f158535c = new kpd0("intl.last_match_time_" + CoreModule.m29931H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.f158536d = new hpd0("area_log_first_active_" + CoreModule.m29931H().userId(), bool);
        this.f158537e = new zpd0("area_active_post_time_" + CoreModule.m29931H().userId(), 0L);
        this.f158538f = new tpd0("intl.event.female_send_message_count_" + CoreModule.m29931H().userId(), 0);
        this.f158539g = new zpd0("intl.event.calc_received_message_time_" + CoreModule.m29931H().userId(), -1L);
        this.f158540h = new hpd0("intl.event.male_received_message_50_sent_" + CoreModule.m29931H().userId(), bool);
        this.f158541i = new kpd0("intl.event.last_received_message_time_" + CoreModule.m29931H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ CityAreaScope m178502c(final Location location) {
        return (CityAreaScope) vwb.m200346r(CityAreaScope.getAllCheckCityAreas(), new w9j() { // from class: l.gan
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((CityAreaScope) obj).cover(location));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m178503d(CityAreaScope cityAreaScope) {
        if (cityAreaScope != null) {
            qib0.m174815e1(cityAreaScope.getEventName(), new Object[0]);
            zvf0.m220371D("e_intl_third_party_active_check", "", vwb.m200311Y("active_city", cityAreaScope.getActiveCity()));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m178505f(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m178508i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m178509j(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m178510k(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ CityAreaScope m178511l(final Location location) {
        return (CityAreaScope) vwb.m200346r(CityAreaScope.getAllCheckCityAreasV2(), new w9j() { // from class: l.han
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((CityAreaScope) obj).cover(location));
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Optional m178513n(List list) {
        return list.isEmpty() ? Optional.absent() : Optional.m15413of((Conversation) list.get(0));
    }

    /* JADX INFO: renamed from: q */
    public static ran m178515q() {
        if (f158532k == null) {
            synchronized (ran.class) {
                try {
                    if (f158532k == null) {
                        f158532k = new ran();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f158532k;
    }

    /* JADX INFO: renamed from: A */
    public void m178516A() {
        if (this.f158534b.get().booleanValue()) {
            return;
        }
        this.f158542j.m217046b(CoreModule.f17545c.f19639e0.m169523o9().subscribe((z3g0<? super User>) new C19661a()));
    }

    /* JADX INFO: renamed from: B */
    public void m178517B() {
        int iIntValue = this.f158538f.get().intValue();
        if (!m178520r() || iIntValue >= 60) {
            return;
        }
        this.f158538f.put(Integer.valueOf(iIntValue + 1));
        if (iIntValue == 59) {
            qib0.m174815e1("female_send_message_60", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m178518C() {
        int iIntValue = this.f158533a.get().intValue();
        if (iIntValue < 0) {
            return;
        }
        if (iIntValue != 9) {
            this.f158533a.put(Integer.valueOf(iIntValue + 1));
        } else {
            qib0.m174815e1("message_10", new Object[0]);
            this.f158533a.put(-1);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m178519p() {
        this.f158542j = a4g0.m94917a();
        m178516A();
        m178528z();
        m178526x();
        m178527y();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m178520r() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return userM169527p9 != null && ((int) ((mqi0.m155944o() - ((long) userM169527p9.createdTime)) / 86400000)) <= 7;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m178521s(CityAreaScope cityAreaScope) {
        if (cityAreaScope != null) {
            qib0.m174815e1(cityAreaScope.getEventName(), new Object[0]);
            this.f158537e.put(Long.valueOf(mqi0.m155944o()));
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m178522t(Boolean bool) {
        if (bool.booleanValue()) {
            qib0.m174815e1(CityAreaScope.tokyo_first.getEventName(), new Object[0]);
            this.f158536d.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m178523u(Optional optional) {
        if (!optional.isPresent() || ((Conversation) optional.get()).latestTime <= this.f158541i.get().doubleValue()) {
            return;
        }
        qib0.m174815e1("message_received", new Object[0]);
        this.f158541i.put(Double.valueOf(((Conversation) optional.get()).latestTime));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m178524v(List list) {
        if (list.size() < 50 || this.f158540h.get().booleanValue()) {
            return;
        }
        qib0.m174815e1("male_received_message_50", new Object[0]);
        this.f158540h.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: w */
    public void m178525w() {
        this.f158535c.put(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        if (NullChecker.m81303a(this.f158542j)) {
            this.f158542j.unsubscribe();
        }
        this.f158542j = a4g0.m94917a();
        f158532k = null;
    }

    /* JADX INFO: renamed from: x */
    public void m178526x() {
        this.f158542j.m217046b(qib0.f154687E.m78864p().first().observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.lan
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ran.m178502c((Location) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.man
            @Override // p149l.e30
            public final void call(Object obj) {
                ran.m178503d((CityAreaScope) obj);
            }
        }, new e30() { // from class: l.nan
            @Override // p149l.e30
            public final void call(Object obj) {
                ran.m178505f((Throwable) obj);
            }
        })));
        if (!this.f158536d.get().booleanValue()) {
            z3g0 z3g0Var = this.f158542j;
            C22306c<Location> c22306cObserveOn = qib0.f154687E.m78864p().first().observeOn(Schedulers.m221493io());
            final CityAreaScope cityAreaScope = CityAreaScope.tokyo_first;
            Objects.requireNonNull(cityAreaScope);
            z3g0Var.m217046b(c22306cObserveOn.map(new w9j() { // from class: l.oan
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(cityAreaScope.cover((Location) obj));
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.pan
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f147991a.m178522t((Boolean) obj);
                }
            }, new e30() { // from class: l.qan
                @Override // p149l.e30
                public final void call(Object obj) {
                    ran.m178509j((Throwable) obj);
                }
            })));
        }
        if (mqi0.m155929D(this.f158537e.get().longValue())) {
            return;
        }
        this.f158542j.m217046b(qib0.f154687E.m78864p().first().observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.dan
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ran.m178511l((Location) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.ean
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90216a.m178521s((CityAreaScope) obj);
            }
        }, new e30() { // from class: l.fan
            @Override // p149l.e30
            public final void call(Object obj) {
                ran.m178510k((Throwable) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: y */
    public void m178527y() {
        oni.m165181A();
    }

    /* JADX INFO: renamed from: z */
    public void m178528z() {
        this.f158542j.m217046b(CoreModule.f17545c.f19642f0.m33011jq().map(new w9j() { // from class: l.can
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ran.m178513n((List) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.ian
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112315a.m178523u((Optional) obj);
            }
        }, new e30() { // from class: l.jan
            @Override // p149l.e30
            public final void call(Object obj) {
                ran.m178508i((Throwable) obj);
            }
        })));
        if (this.f158540h.get().booleanValue() || CoreModule.f17545c.f19639e0.m169520na().isFemale() || !m178520r()) {
            return;
        }
        this.f158542j.m217046b(CoreModule.f17545c.f19642f0.m32866Xo().subscribe(mkd0.m154955G(new e30() { // from class: l.kan
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122137a.m178524v((List) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: l.ran$a */
    public class C19661a extends z3g0<User> {
        public C19661a() {
        }

        @Override // p149l.m250
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void m132487l(User user) {
            if (user.pictures.size() >= 3) {
                qib0.m174815e1("pic_3", new Object[0]);
                ran.this.f158534b.put(Boolean.TRUE);
                unsubscribe();
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            mkd0.m154961M(th);
        }

        @Override // p149l.m250
        public void onCompleted() {
        }
    }
}

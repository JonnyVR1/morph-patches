package p003l;

import androidx.annotation.RestrictTo;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.util.CityAreaScope;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import l.a4g0;
import l.e30;
import l.hpd0;
import l.j760;
import l.kpd0;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.tpd0;
import l.vwb;
import l.w9j;
import l.z3g0;
import l.zpd0;
import l.zvf0;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ran {

    /* JADX INFO: renamed from: k */
    public static volatile ran f7151k;

    /* JADX INFO: renamed from: a */
    public final tpd0 f7152a = new tpd0("intl.event.send_message_count", 0);

    /* JADX INFO: renamed from: b */
    public final hpd0 f7153b;

    /* JADX INFO: renamed from: c */
    public final kpd0 f7154c;

    /* JADX INFO: renamed from: d */
    public final hpd0 f7155d;

    /* JADX INFO: renamed from: e */
    public final zpd0 f7156e;

    /* JADX INFO: renamed from: f */
    public final tpd0 f7157f;

    /* JADX INFO: renamed from: g */
    public final zpd0 f7158g;

    /* JADX INFO: renamed from: h */
    public final hpd0 f7159h;

    /* JADX INFO: renamed from: i */
    public final kpd0 f7160i;

    /* JADX INFO: renamed from: j */
    public z3g0 f7161j;

    public ran() {
        Boolean bool = Boolean.FALSE;
        this.f7153b = new hpd0("intl.event.pic3", bool);
        this.f7154c = new kpd0("intl.last_match_time_" + CoreModule.H().userId(), 0.0d);
        this.f7155d = new hpd0("area_log_first_active_" + CoreModule.H().userId(), bool);
        this.f7156e = new zpd0("area_active_post_time_" + CoreModule.H().userId(), 0L);
        this.f7157f = new tpd0("intl.event.female_send_message_count_" + CoreModule.H().userId(), 0);
        this.f7158g = new zpd0("intl.event.calc_received_message_time_" + CoreModule.H().userId(), -1L);
        this.f7159h = new hpd0("intl.event.male_received_message_50_sent_" + CoreModule.H().userId(), bool);
        this.f7160i = new kpd0("intl.event.last_received_message_time_" + CoreModule.H().userId(), 0.0d);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ CityAreaScope m9098c(final Location location) {
        return (CityAreaScope) vwb.r(CityAreaScope.getAllCheckCityAreas(), new w9j() { // from class: l.gan
            public final Object call(Object obj) {
                return Boolean.valueOf(((CityAreaScope) obj).cover(location));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m9099d(CityAreaScope cityAreaScope) {
        if (cityAreaScope != null) {
            qib0.e1(cityAreaScope.getEventName(), new Object[0]);
            zvf0.D("e_intl_third_party_active_check", "", new j760[]{vwb.Y("active_city", cityAreaScope.getActiveCity())});
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m9101f(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m9104i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m9105j(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m9106k(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ CityAreaScope m9107l(final Location location) {
        return (CityAreaScope) vwb.r(CityAreaScope.getAllCheckCityAreasV2(), new w9j() { // from class: l.han
            public final Object call(Object obj) {
                return Boolean.valueOf(((CityAreaScope) obj).cover(location));
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Optional m9109n(List list) {
        return list.isEmpty() ? Optional.absent() : Optional.of((Conversation) list.get(0));
    }

    /* JADX INFO: renamed from: q */
    public static ran m9111q() {
        if (f7151k == null) {
            synchronized (ran.class) {
                try {
                    if (f7151k == null) {
                        f7151k = new ran();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7151k;
    }

    /* JADX INFO: renamed from: A */
    public void m9112A() {
        if (((Boolean) this.f7153b.get()).booleanValue()) {
            return;
        }
        this.f7161j.b(CoreModule.c.e0.o9().subscribe(new C3414a()));
    }

    /* JADX INFO: renamed from: B */
    public void m9113B() {
        int iIntValue = ((Integer) this.f7157f.get()).intValue();
        if (!m9116r() || iIntValue >= 60) {
            return;
        }
        this.f7157f.put(Integer.valueOf(iIntValue + 1));
        if (iIntValue == 59) {
            qib0.e1("female_send_message_60", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m9114C() {
        int iIntValue = ((Integer) this.f7152a.get()).intValue();
        if (iIntValue < 0) {
            return;
        }
        if (iIntValue != 9) {
            this.f7152a.put(Integer.valueOf(iIntValue + 1));
        } else {
            qib0.e1("message_10", new Object[0]);
            this.f7152a.put(-1);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m9115p() {
        this.f7161j = a4g0.a();
        m9112A();
        m9124z();
        m9122x();
        m9123y();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m9116r() {
        User userP9 = CoreModule.c.e0.p9();
        return userP9 != null && ((int) ((mqi0.o() - ((long) userP9.createdTime)) / 86400000)) <= 7;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m9117s(CityAreaScope cityAreaScope) {
        if (cityAreaScope != null) {
            qib0.e1(cityAreaScope.getEventName(), new Object[0]);
            this.f7156e.put(Long.valueOf(mqi0.o()));
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m9118t(Boolean bool) {
        if (bool.booleanValue()) {
            qib0.e1(CityAreaScope.tokyo_first.getEventName(), new Object[0]);
            this.f7155d.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m9119u(Optional optional) {
        if (!optional.isPresent() || ((Conversation) optional.get()).latestTime <= ((Double) this.f7160i.get()).doubleValue()) {
            return;
        }
        qib0.e1("message_received", new Object[0]);
        this.f7160i.put(Double.valueOf(((Conversation) optional.get()).latestTime));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m9120v(List list) {
        if (list.size() < 50 || ((Boolean) this.f7159h.get()).booleanValue()) {
            return;
        }
        qib0.e1("male_received_message_50", new Object[0]);
        this.f7159h.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: w */
    public void m9121w() {
        this.f7154c.put(Double.valueOf(0.0d));
        if (NullChecker.a(this.f7161j)) {
            this.f7161j.unsubscribe();
        }
        this.f7161j = a4g0.a();
        f7151k = null;
    }

    /* JADX INFO: renamed from: x */
    public void m9122x() {
        this.f7161j.b(qib0.E.p().first().observeOn(Schedulers.io()).map(new w9j() { // from class: l.lan
            public final Object call(Object obj) {
                return ran.m9098c((Location) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.man
            public final void call(Object obj) {
                ran.m9099d((CityAreaScope) obj);
            }
        }, new e30() { // from class: l.nan
            public final void call(Object obj) {
                ran.m9101f((Throwable) obj);
            }
        })));
        if (!((Boolean) this.f7155d.get()).booleanValue()) {
            z3g0 z3g0Var = this.f7161j;
            c cVarObserveOn = qib0.E.p().first().observeOn(Schedulers.io());
            final CityAreaScope cityAreaScope = CityAreaScope.tokyo_first;
            Objects.requireNonNull(cityAreaScope);
            z3g0Var.b(cVarObserveOn.map(new w9j() { // from class: l.oan
                public final Object call(Object obj) {
                    return Boolean.valueOf(cityAreaScope.cover((Location) obj));
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.pan
                public final void call(Object obj) {
                    this.f6842a.m9118t((Boolean) obj);
                }
            }, new e30() { // from class: l.qan
                public final void call(Object obj) {
                    ran.m9105j((Throwable) obj);
                }
            })));
        }
        if (mqi0.D(((Long) this.f7156e.get()).longValue())) {
            return;
        }
        this.f7161j.b(qib0.E.p().first().observeOn(Schedulers.io()).map(new w9j() { // from class: l.dan
            public final Object call(Object obj) {
                return ran.m9107l((Location) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.ean
            public final void call(Object obj) {
                this.f4283a.m9117s((CityAreaScope) obj);
            }
        }, new e30() { // from class: l.fan
            public final void call(Object obj) {
                ran.m9106k((Throwable) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: y */
    public void m9123y() {
        oni.m8517A();
    }

    /* JADX INFO: renamed from: z */
    public void m9124z() {
        this.f7161j.b(CoreModule.c.f0.jq().map(new w9j() { // from class: l.can
            public final Object call(Object obj) {
                return ran.m9109n((List) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.ian
            public final void call(Object obj) {
                this.f5109a.m9119u((Optional) obj);
            }
        }, new e30() { // from class: l.jan
            public final void call(Object obj) {
                ran.m9104i((Throwable) obj);
            }
        })));
        if (((Boolean) this.f7159h.get()).booleanValue() || CoreModule.c.e0.na().isFemale() || !m9116r()) {
            return;
        }
        this.f7161j.b(CoreModule.c.f0.Xo().subscribe(mkd0.G(new e30() { // from class: l.kan
            public final void call(Object obj) {
                this.f5635a.m9120v((List) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: l.ran$a */
    public class C3414a extends z3g0<User> {
        public C3414a() {
        }

        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onNext(User user) {
            if (user.pictures.size() >= 3) {
                qib0.e1("pic_3", new Object[0]);
                ran.this.f7153b.put(Boolean.TRUE);
                unsubscribe();
            }
        }

        public void onError(Throwable th) {
            mkd0.M(th);
        }

        public void onCompleted() {
        }
    }
}

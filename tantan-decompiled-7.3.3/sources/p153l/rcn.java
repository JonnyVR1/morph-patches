package p153l;

import androidx.annotation.RestrictTo;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.util.CityAreaScope;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class rcn {

    /* JADX INFO: renamed from: k */
    public static volatile rcn f162231k;

    /* JADX INFO: renamed from: a */
    public final vxd0 f162232a = new vxd0("intl.event.send_message_count", 0);

    /* JADX INFO: renamed from: b */
    public final jxd0 f162233b;

    /* JADX INFO: renamed from: c */
    public final mxd0 f162234c;

    /* JADX INFO: renamed from: d */
    public final jxd0 f162235d;

    /* JADX INFO: renamed from: e */
    public final byd0 f162236e;

    /* JADX INFO: renamed from: f */
    public final vxd0 f162237f;

    /* JADX INFO: renamed from: g */
    public final byd0 f162238g;

    /* JADX INFO: renamed from: h */
    public final jxd0 f162239h;

    /* JADX INFO: renamed from: i */
    public final mxd0 f162240i;

    /* JADX INFO: renamed from: j */
    public gcg0 f162241j;

    public rcn() {
        Boolean bool = Boolean.FALSE;
        this.f162233b = new jxd0("intl.event.pic3", bool);
        this.f162234c = new mxd0("intl.last_match_time_" + CoreModule.m30929H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.f162235d = new jxd0("area_log_first_active_" + CoreModule.m30929H().userId(), bool);
        this.f162236e = new byd0("area_active_post_time_" + CoreModule.m30929H().userId(), 0L);
        this.f162237f = new vxd0("intl.event.female_send_message_count_" + CoreModule.m30929H().userId(), 0);
        this.f162238g = new byd0("intl.event.calc_received_message_time_" + CoreModule.m30929H().userId(), -1L);
        this.f162239h = new jxd0("intl.event.male_received_message_50_sent_" + CoreModule.m30929H().userId(), bool);
        this.f162240i = new mxd0("intl.event.last_received_message_time_" + CoreModule.m30929H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ CityAreaScope m180784c(final Location location) {
        return (CityAreaScope) jyb.m147529r(CityAreaScope.getAllCheckCityAreas(), new qcj() { // from class: l.gcn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((CityAreaScope) obj).cover(location));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m180785d(CityAreaScope cityAreaScope) {
        if (cityAreaScope != null) {
            uqb0.m197269e1(cityAreaScope.getEventName(), new Object[0]);
            i4g0.m138495D("e_intl_third_party_active_check", "", jyb.m147494Y("active_city", cityAreaScope.getActiveCity()));
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m180787f(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m180790i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m180791j(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m180792k(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ CityAreaScope m180793l(final Location location) {
        return (CityAreaScope) jyb.m147529r(CityAreaScope.getAllCheckCityAreasV2(), new qcj() { // from class: l.hcn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((CityAreaScope) obj).cover(location));
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Optional m180795n(List list) {
        return list.isEmpty() ? Optional.absent() : Optional.m15467of((Conversation) list.get(0));
    }

    /* JADX INFO: renamed from: q */
    public static rcn m180797q() {
        if (f162231k == null) {
            synchronized (rcn.class) {
                try {
                    if (f162231k == null) {
                        f162231k = new rcn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f162231k;
    }

    /* JADX INFO: renamed from: A */
    public void m180798A() {
        if (this.f162233b.get().booleanValue()) {
            return;
        }
        this.f162241j.m129866b(CoreModule.f18264c.f20381e0.m116596o9().subscribe((gcg0<? super User>) new C19805a()));
    }

    /* JADX INFO: renamed from: B */
    public void m180799B() {
        int iIntValue = this.f162237f.get().intValue();
        if (!m180802r() || iIntValue >= 60) {
            return;
        }
        this.f162237f.put(Integer.valueOf(iIntValue + 1));
        if (iIntValue == 59) {
            uqb0.m197269e1("female_send_message_60", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m180800C() {
        int iIntValue = this.f162232a.get().intValue();
        if (iIntValue < 0) {
            return;
        }
        if (iIntValue != 9) {
            this.f162232a.put(Integer.valueOf(iIntValue + 1));
        } else {
            uqb0.m197269e1("message_10", new Object[0]);
            this.f162232a.put(-1);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m180801p() {
        this.f162241j = icg0.m139434a();
        m180798A();
        m180810z();
        m180808x();
        m180809y();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m180802r() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return userM116600p9 != null && ((int) ((pzi0.m174454o() - ((long) userM116600p9.createdTime)) / 86400000)) <= 7;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m180803s(CityAreaScope cityAreaScope) {
        if (cityAreaScope != null) {
            uqb0.m197269e1(cityAreaScope.getEventName(), new Object[0]);
            this.f162236e.put(Long.valueOf(pzi0.m174454o()));
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m180804t(Boolean bool) {
        if (bool.booleanValue()) {
            uqb0.m197269e1(CityAreaScope.tokyo_first.getEventName(), new Object[0]);
            this.f162235d.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m180805u(Optional optional) {
        if (!optional.isPresent() || ((Conversation) optional.get()).latestTime <= this.f162240i.get().doubleValue()) {
            return;
        }
        uqb0.m197269e1("message_received", new Object[0]);
        this.f162240i.put(Double.valueOf(((Conversation) optional.get()).latestTime));
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m180806v(List list) {
        if (list.size() < 50 || this.f162239h.get().booleanValue()) {
            return;
        }
        uqb0.m197269e1("male_received_message_50", new Object[0]);
        this.f162239h.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: w */
    public void m180807w() {
        this.f162234c.put(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        if (NullChecker.m82486a(this.f162241j)) {
            this.f162241j.unsubscribe();
        }
        this.f162241j = icg0.m139434a();
        f162231k = null;
    }

    /* JADX INFO: renamed from: x */
    public void m180808x() {
        this.f162241j.m129866b(uqb0.f180370E.m80047p().first().observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.lcn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rcn.m180784c((Location) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.mcn
            @Override // p153l.y20
            public final void call(Object obj) {
                rcn.m180785d((CityAreaScope) obj);
            }
        }, new y20() { // from class: l.ncn
            @Override // p153l.y20
            public final void call(Object obj) {
                rcn.m180787f((Throwable) obj);
            }
        })));
        if (!this.f162235d.get().booleanValue()) {
            gcg0 gcg0Var = this.f162241j;
            C22421c<Location> c22421cObserveOn = uqb0.f180370E.m80047p().first().observeOn(Schedulers.m222739io());
            final CityAreaScope cityAreaScope = CityAreaScope.tokyo_first;
            Objects.requireNonNull(cityAreaScope);
            gcg0Var.m129866b(c22421cObserveOn.map(new qcj() { // from class: l.ocn
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(cityAreaScope.cover((Location) obj));
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.pcn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151614a.m180804t((Boolean) obj);
                }
            }, new y20() { // from class: l.qcn
                @Override // p153l.y20
                public final void call(Object obj) {
                    rcn.m180791j((Throwable) obj);
                }
            })));
        }
        if (pzi0.m174439D(this.f162236e.get().longValue())) {
            return;
        }
        this.f162241j.m129866b(uqb0.f180370E.m80047p().first().observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.dcn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rcn.m180793l((Location) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ecn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93082a.m180803s((CityAreaScope) obj);
            }
        }, new y20() { // from class: l.fcn
            @Override // p153l.y20
            public final void call(Object obj) {
                rcn.m180792k((Throwable) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: y */
    public void m180809y() {
        kqi.m150863A();
    }

    /* JADX INFO: renamed from: z */
    public void m180810z() {
        this.f162241j.m129866b(CoreModule.f18264c.f20384f0.m34014jq().map(new qcj() { // from class: l.ccn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rcn.m180795n((List) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.icn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114420a.m180805u((Optional) obj);
            }
        }, new y20() { // from class: l.jcn
            @Override // p153l.y20
            public final void call(Object obj) {
                rcn.m180790i((Throwable) obj);
            }
        })));
        if (this.f162239h.get().booleanValue() || CoreModule.f18264c.f20381e0.m116593na().isFemale() || !m180802r()) {
            return;
        }
        this.f162241j.m129866b(CoreModule.f18264c.f20384f0.m33869Xo().subscribe(psd0.m173596G(new y20() { // from class: l.kcn
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f125079a.m180806v((List) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: l.rcn$a */
    public class C19805a extends gcg0<User> {
        public C19805a() {
        }

        @Override // p153l.bb50
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void m137019l(User user) {
            if (user.pictures.size() >= 3) {
                uqb0.m197269e1("pic_3", new Object[0]);
                rcn.this.f162233b.put(Boolean.TRUE);
                unsubscribe();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            psd0.m173602M(th);
        }

        @Override // p153l.bb50
        public void onCompleted() {
        }
    }
}

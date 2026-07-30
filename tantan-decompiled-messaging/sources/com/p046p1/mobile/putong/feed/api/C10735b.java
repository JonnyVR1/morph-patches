package com.p046p1.mobile.putong.feed.api;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.LiveUserMask;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Report;
import com.p046p1.mobile.putong.data.Room;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.VoiceLiveGame;
import com.p046p1.mobile.putong.data.VoiceRoomInfo;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.api.C10735b;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.MomentMessageType;
import com.p046p1.mobile.putong.feed.data.MomentSettings;
import com.p046p1.mobile.putong.feed.data.MomentVisibilityStatus;
import com.p046p1.mobile.putong.feed.data.OnVoiceCall;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.data.VoiceLive;
import com.p046p1.mobile.putong.feed.helper.MomentUserNullException;
import com.p046p1.mobile.putong.feed.helper.exception.FeedException;
import com.p046p1.mobile.putong.feed.helper.exception.MomentPostFailedExcepion;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.bt00;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.f8c;
import p149l.fgf0;
import p149l.ggi;
import p149l.ijb0;
import p149l.j760;
import p149l.jo0;
import p149l.k9j;
import p149l.kjb0;
import p149l.la20;
import p149l.lsx;
import p149l.mkd0;
import p149l.mqi0;
import p149l.omg;
import p149l.pgm;
import p149l.q860;
import p149l.qib0;
import p149l.qnd;
import p149l.r5l0;
import p149l.rhi;
import p149l.roj0;
import p149l.s5l0;
import p149l.stc0;
import p149l.u2h;
import p149l.utc0;
import p149l.v9j;
import p149l.vqg;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.y9j;
import p149l.ymf0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.b */
/* JADX INFO: loaded from: classes12.dex */
public class C10735b extends omg {

    /* JADX INFO: renamed from: H */
    public final C22393b<Throwable> f39204H = C22393b.m221521b();

    /* JADX INFO: renamed from: I */
    public C22393b<Moment> f39205I = C22393b.m221521b();

    /* JADX INFO: renamed from: J */
    public C22393b<String> f39206J = C22393b.m221521b();

    /* JADX INFO: renamed from: K */
    public C22392a<SparseArray<Moment>> f39207K = C22392a.m221513c(new SparseArray());

    /* JADX INFO: renamed from: L */
    public boolean f39208L = true;

    /* JADX INFO: renamed from: M */
    public a f39209M = new a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.b$a */
    public class a extends fgf0<List<String>> {

        /* JADX INFO: renamed from: h */
        public LruCache<String, List<String>> f39210h;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.b$a$a, reason: collision with other inner class name */
        public class C22699a implements v9j<C22306c<List<String>>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C10735b f39212a;

            public C22699a(C10735b c10735b) {
                this.f39212a = c10735b;
            }

            /* JADX INFO: renamed from: d */
            public static /* synthetic */ List m60776d(Envelope envelope) {
                f8c.m119878o().m119897u(envelope);
                return vwb.m200303Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new w9j() { // from class: l.dy9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((User) obj).f56011id;
                    }
                });
            }

            @Override // p149l.v9j, java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public C22306c<List<String>> call() {
                return new la20(new v9j() { // from class: l.ay9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(omg.m165045G(omg.f144616A)).m185887f().m185883b();
                    }
                }).flatMap(new w9j() { // from class: l.by9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f77892a.m60778f((Envelope) obj);
                    }
                }).map(new w9j() { // from class: l.cy9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C10735b.a.C22699a.m60776d((Envelope) obj);
                    }
                });
            }

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C22306c m60778f(Envelope envelope) {
                return this.f39212a.m60749r4(envelope);
            }
        }

        public a() {
            super(C10735b.this, "mutedUsers", new ggi(new qnd("muted_users_protobuf", null, FeedModule.m60221F().userId()), 7, ProtobufAdapter.ARRAY_ADAPTER(ProtobufAdapter.STRING_ADAPTER)), new C22699a(C10735b.this));
            this.f39210h = new LruCache<>(10);
        }

        /* JADX INFO: renamed from: D */
        public static /* synthetic */ stc0 m60763D(String str, boolean z) {
            stc0.C20027a c20027aM185898q = omg.f144622G.auth().m185898q(omg.m165046H(str));
            return (z ? c20027aM185898q.m185894m(utc0.create(Network.JSON, "")) : c20027aM185898q.m185885d()).m185883b();
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m60768I(String str) {
            List<String> listM189028K = FeedModule.f38860i.f77913c.m189028K(str, true);
            if (!vwb.m200296J(listM189028K)) {
                this.f39210h.put(str, listM189028K);
            }
            FeedModule.f38860i.f77913c.m189032O(str, false);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ roj0 m60769J(final String str, Envelope envelope) {
            f8c.m119878o().m119898v(envelope, new d30() { // from class: l.yx9
                @Override // p149l.d30
                public final void call() {
                    this.f200583a.m60768I(str);
                }
            });
            List<String> listM121233n = m121233n();
            if (listM121233n == null) {
                listM121233n = new ArrayList<>();
            }
            m121229A(vwb.m200317c(listM121233n, str));
            return roj0.f160388a;
        }

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ void m60770K(String str, roj0 roj0Var) {
            if (NullChecker.m81303a(this.f39210h.get(str))) {
                final List<String> listRemove = this.f39210h.remove(str);
                f8c.m119878o().m119881B(new d30() { // from class: l.zx9
                    @Override // p149l.d30
                    public final void call() {
                        FeedModule.f38860i.f77913c.m189031N(listRemove, true);
                    }
                });
            }
            List<String> listM121233n = m121233n();
            if (listM121233n == null) {
                listM121233n = new ArrayList<>();
            }
            m121229A(vwb.m200318c0(listM121233n, str));
        }

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ C22306c m60771L(final String str, final boolean z) {
            v9j v9jVar = new v9j() { // from class: l.ux9
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return C10735b.a.m60763D(str, z);
                }
            };
            return z ? new la20(v9jVar).map(new w9j() { // from class: l.vx9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f183432a.m60769J(str, (Envelope) obj);
                }
            }).compose(omg.m165092n0()) : new la20(v9jVar).map(new w9j() { // from class: l.wx9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return roj0.f160388a;
                }
            }).doOnNext(new e30() { // from class: l.xx9
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f194844a.m60770K(str, (roj0) obj);
                }
            }).compose(omg.m165092n0());
        }

        /* JADX INFO: renamed from: M */
        public C22306c<roj0> m60772M(final String str, final boolean z) {
            return C10735b.this.scheduled(BLiveButtonType.mute, -1, new v9j() { // from class: l.tx9
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f172494a.m60771L(str, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ roj0 m60551A0(Envelope envelope) {
        ijb0.m136563c();
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ void m60553A2(Moment moment) {
        long j = moment._id;
        if (j != 0) {
            FeedModule.f38860i.f77913c.delete(j);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ C22306c m60557C0(w9j w9jVar, Moment moment) {
        return (C22306c) w9jVar.call(moment);
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ VoiceLiveGame m60558C1(VoiceLiveGame voiceLiveGame) {
        return voiceLiveGame;
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m60563E0(String str, final int i, DbLinks dbLinks) {
        FeedModule.f38860i.f77913c.delete(str);
        e51.m114742G(new Runnable() { // from class: l.tt9
            @Override // java.lang.Runnable
            public final void run() {
                ijb0.m136558V(i);
            }
        });
        qib0.f154722k0.f176630c.upsert(dbLinks);
        FeedModule.f38860i.f77914d.m100796G(str);
        FeedModule.m60222H().mo30799n6(str);
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m60570G1(boolean z, String str, Envelope envelope) {
        if (!z || str.equals(FeedModule.m60221F().userId())) {
            return;
        }
        e51.m114743H(FeedModule.f38852a, new Runnable() { // from class: l.rw9
            @Override // java.lang.Runnable
            public final void run() {
                ijb0.m136545I();
            }
        }, 600L);
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ VoiceRoomInfo m60572H0(VoiceRoomInfo voiceRoomInfo) {
        return voiceRoomInfo;
    }

    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ void m60574H2(Envelope envelope, final Moment moment) {
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        Pagination pagination = envelope.pagination;
        String str = pagination.links.next;
        if (str != null) {
            moment.likes.links.next = str;
        }
        PartialIdList partialIdList = moment.likes;
        partialIdList.count = pagination.total;
        partialIdList.ids = vwb.m200321e(partialIdList.ids, vwb.m200339n(vwb.m200303Q(commonData.users, new w9j() { // from class: l.nt9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).f56011id;
            }
        }), new w9j() { // from class: l.ot9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!moment.likes.ids.contains((String) obj));
            }
        }));
        FeedModule.f38860i.f77913c.upsert(moment);
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ C22306c m60576I1(final String str, final Moment moment, final Moment moment2) {
        return (!NullChecker.m81303a(moment2.media) || moment2.media.size() <= 0) ? C22306c.just(moment2) : new lsx((List<Media>) new ArrayList(moment2.media), false, str).doOnNext(new e30() { // from class: l.hu9
            @Override // p149l.e30
            public final void call(Object obj) {
                C10735b.m60651q2(moment2, (List) obj);
            }
        }).last().filter(new w9j() { // from class: l.ju9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(C10735b.m60599Q3(str));
            }
        }).flatMap(new w9j() { // from class: l.ku9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60609V1(moment, moment2, (List) obj);
            }
        }).map(new w9j() { // from class: l.lu9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60662v0(moment, moment2, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ roj0 m60579J1(final long j) {
        f8c.m119878o().m119881B(new d30() { // from class: l.su9
            @Override // p149l.d30
            public final void call() {
                FeedModule.f38860i.f77913c.delete(j);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: J2 */
    public static /* synthetic */ Room m60580J2(Room room) {
        return room;
    }

    /* JADX INFO: renamed from: M1 */
    public static /* synthetic */ stc0 m60588M1(boolean z, String str) {
        stc0.C20027a c20027aM185885d;
        if (z) {
            c20027aM185885d = omg.f144622G.auth().m185893l(utc0.create(Network.JSON, "{\"read\": true}")).m185898q(str + "&method=patch");
        } else {
            c20027aM185885d = omg.f144622G.auth().m185898q(str).m185885d();
        }
        return c20027aM185885d.m185883b();
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ roj0 m60590N0(final Moment moment, e30 e30Var, final Envelope envelope) {
        qib0.m174815e1("moments_sent", new Object[0]);
        bt00.m103769d(new j760(4, null));
        final Moment moment2 = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(0);
        moment2._id = moment._id;
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(moment2.f56011id);
        }
        f8c.m119878o().m119898v(envelope, new d30() { // from class: l.xw9
            @Override // p149l.d30
            public final void call() {
                C10735b.m60656t0(moment2, moment, envelope);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ VoiceLive m60597Q0(VoiceLive voiceLive) {
        return voiceLive;
    }

    /* JADX INFO: renamed from: Q3 */
    public static boolean m60599Q3(String str) {
        return FeedModule.m60221F().signedIn_() && TextUtils.equals(str, FeedModule.m60221F().userId());
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ int m60600R0(MomentMessage momentMessage, MomentMessage momentMessage2) {
        return (int) (momentMessage.createdTime - momentMessage2.createdTime);
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ roj0 m60603S1(final Envelope envelope) {
        f8c.m119878o().m119898v(envelope, new d30() { // from class: l.gw9
            @Override // p149l.d30
            public final void call() {
                C10735b.m60663v1(envelope);
            }
        });
        if (!((FeedData) envelope.getModuleData(FeedData.class)).activities.isEmpty()) {
            User userQuery = qib0.f154722k0.f176631d.query(((FeedData) envelope.getModuleData(FeedData.class)).activities.get(0).actors);
            if (NullChecker.m81304b(userQuery)) {
                qib0.f154691G.m102379z0(userQuery.m60124fp().profileSmall());
            }
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ LiveUserMask m60604T0(LiveUserMask liveUserMask) {
        return liveUserMask;
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ Live m60606U0(Live live) {
        return live;
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ C22306c m60608V0(final boolean z, MomentActivity momentActivity) {
        if ((z && NullChecker.m81303a(momentActivity) && !momentActivity.read) || (!z && NullChecker.m81303a(momentActivity))) {
            final String strM165071d = omg.m165071d(momentActivity.f56011id);
            return new la20(new v9j() { // from class: l.qv9
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return C10735b.m60588M1(z, strM165071d);
                }
            }).map(new w9j() { // from class: l.rv9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C10735b.m60672y1(z, (Envelope) obj);
                }
            }).compose(omg.m165092n0());
        }
        if (!z) {
            return C22306c.just(roj0.f160388a);
        }
        final String strM165069c = omg.m165069c();
        return new la20(new v9j() { // from class: l.sv9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185893l(utc0.create(Network.JSON, "{\"read\": true}")).m185898q(strM165069c + "&method=patch").m185883b();
            }
        }).compose(omg.m165092n0()).map(new w9j() { // from class: l.tv9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60551A0((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ C22306c m60609V1(Moment moment, final Moment moment2, final List list) {
        bt00.m103769d(new j760(2, moment));
        return ijb0.m136548L(list, "moment", "moment", UploadSource.get("moment")).map(new w9j() { // from class: l.iw9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60673y2(list, moment2, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m60615Y1(boolean z) {
        DbLinks dbLinks = (DbLinks) qib0.f154722k0.f176630c.query(SchemeKey.moment_activities);
        if (dbLinks != null) {
            dbLinks.extra = 0;
            if (!z) {
                dbLinks.total = 0;
            }
            qib0.f154722k0.f176630c.upsert(dbLinks);
        }
        if (z) {
            FeedModule.f38860i.f77914d.m100798I();
        } else {
            FeedModule.f38860i.f77914d.deleteAll();
            FeedModule.f38860i.f77913c.delete(Filter.AND(Moment.SETTINGS_MUTED.m81224T(), Moment.SETTINGS_VISIBILITY.m60176EQ("everyone")));
        }
        e51.m114742G(new Runnable() { // from class: l.ct9
            @Override // java.lang.Runnable
            public final void run() {
                ijb0.m136563c();
            }
        });
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ roj0 m60617Z1(Envelope envelope) {
        f8c.m119878o().m119899w(envelope, null, false, true);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ C22306c m60619a2(w9j w9jVar, Moment moment) {
        return (C22306c) w9jVar.call(moment);
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ roj0 m60621b2(final Envelope envelope) {
        f8c.m119878o().m119898v(envelope, new d30() { // from class: l.lx9
            @Override // p149l.d30
            public final void call() {
                C10735b.m60622c1(envelope);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m60622c1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56011id = SchemeKey.moment_activities;
        dbLinks.links = envelope.pagination.links;
        qib0.f154722k0.f176630c.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m60623c2(Moment moment) {
        moment.localCreatedSession = App.f15373i.get().intValue();
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56011id = moment.f56011id;
        dbLinks.links = Links.new_();
        FeedModule.f38860i.f77916f.upsert(dbLinks);
        FeedModule.f38860i.f77913c.insert(moment);
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ List m60627e2(int i, List list) {
        return list.size() > i ? list.subList(0, i) : list;
    }

    /* JADX INFO: renamed from: f2 */
    public static /* synthetic */ List m60629f2(Moment moment) {
        if (NullChecker.m81303a(moment)) {
            return moment.media;
        }
        return null;
    }

    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ void m60631g2(Envelope envelope, String str) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.links = envelope.pagination.links;
        dbLinks.f56011id = str;
        FeedModule.f38860i.f77913c.m189033P(str, vwb.m200303Q(((FeedData) envelope.getModuleData(FeedData.class)).moments, new w9j() { // from class: l.kx9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Moment) obj).f56011id;
            }
        }), false);
        FeedModule.f38860i.f77915e.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ C22306c m60632h1() {
        DbLinks dbLinks = (DbLinks) qib0.f154722k0.f176630c.queryCache(SchemeKey.moment_activities);
        final String str = dbLinks == null ? null : dbLinks.links.next;
        return NullChecker.m81303a(str) ? new la20((v9j<stc0>) new v9j() { // from class: l.pw9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165065a(str)).m185887f().m185883b();
            }
        }, omg.f144619D).map(new w9j() { // from class: l.qw9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60621b2((Envelope) obj);
            }
        }).compose(omg.m165092n0()) : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: j2 */
    public static /* synthetic */ Moment m60637j2(final Moment moment) {
        Picture picture;
        if (moment._id != 0) {
            final Moment momentMo223809clone = moment.mo223809clone();
            momentMo223809clone.localCreatedSession = App.f15373i.get().intValue();
            f8c.m119878o().m119881B(new d30() { // from class: l.xv9
                @Override // p149l.d30
                public final void call() {
                    FeedModule.f38860i.f77913c.updateBy_id(momentMo223809clone);
                }
            });
            return momentMo223809clone;
        }
        List<Moment> listM136575o = ijb0.m136575o();
        moment.localInFeed = true;
        moment.localInUserFeed = true;
        moment.createdTime = !listM136575o.isEmpty() ? omg.m165101s0(listM136575o.get(0).createdTime) : omg.m165099r0();
        moment.owner = FeedModule.m60221F().userId();
        if (moment.value == null) {
            moment.value = "";
        }
        moment.likes = PartialIdList.new_();
        moment.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f15373i.get().intValue());
        if (NullChecker.m81303a(moment.media)) {
            for (Media media : moment.media) {
                TrackMediaUploadUtil.m80296a0(media);
                if (TEnum.equals(media.status, "raw")) {
                    if (media instanceof Picture) {
                        Picture picture2 = (Picture) media;
                        if (picture2.size == null || media.mediaType == null) {
                            pgm pgmVar = new pgm(rhi.m179382z(media.url));
                            picture2.size = new Dimension(pgmVar.f148730d);
                            media.mediaType = pgmVar.f148729c;
                        }
                    } else if (media instanceof Video) {
                        Video video = (Video) media;
                        if (video.size == null || (picture = video.cover) == null || picture.size == null || video.mediaType == null || picture.mediaType == null) {
                            s5l0 s5l0Var = new s5l0(new r5l0(rhi.m179382z(video.url)), false, false);
                            video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                            video.size = new Dimension(s5l0Var.m182364m());
                            video.duration = s5l0Var.f162561b;
                            Picture picture3 = video.cover;
                            if (picture3 == null || picture3.url == null) {
                                video.processStartTime = SystemClock.uptimeMillis();
                                Picture picture4 = new Picture();
                                video.cover = picture4;
                                try {
                                    picture4.url = rhi.m179355B(s5l0Var.m182356c(0));
                                    video.cover.size = new Dimension(s5l0Var.m182362k());
                                    video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                                    qib0.f154691G.m102377x0(video.url);
                                } catch (Exception e) {
                                    CrashHelper.m81296c(e);
                                    throw new TrackMediaUploadUtil.GetVideoFrameException(e.getMessage(), e.getCause());
                                }
                            }
                            if (video.url.contains(k9j.m145077I().getAbsolutePath())) {
                                try {
                                    String[] strArrM145082N = k9j.m145082N(video.url, video.cover().url, k9j.f122028d, moment.f56011id, false);
                                    video.url = strArrM145082N[0];
                                    video.cover().url = strArrM145082N[1];
                                } catch (IOException e2) {
                                    CrashHelper.m81296c(e2);
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            moment.media = new ArrayList();
        }
        bt00.m103769d(new j760(1, moment));
        f8c.m119878o().m119881B(new d30() { // from class: l.wv9
            @Override // p149l.d30
            public final void call() {
                C10735b.m60623c2(moment);
            }
        });
        return moment;
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ void m60643m2(Map map, HashMap map2, OnVoiceCall onVoiceCall) {
        if (NullChecker.m81303a(map.get(onVoiceCall.user.f39244id))) {
            String str = onVoiceCall.user.f39244id;
            map2.put(str, (LiveUserMask) map.get(str));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m60651q2(Moment moment, List list) {
        final Moment momentMo223809clone = moment.mo223809clone();
        if (NullChecker.m81304b(list.get(0)) && (list.get(0) instanceof Video) && TEnum.equals(((Media) list.get(0)).status, MediaLocalStatus.preprocessed)) {
            try {
                String[] strArrM145082N = k9j.m145082N(((Media) list.get(0)).url, ((Media) list.get(0)).cover().url, k9j.f122028d, moment.f56011id, true);
                ((Media) list.get(0)).url = strArrM145082N[0];
                ((Media) list.get(0)).cover().url = strArrM145082N[1];
            } catch (IOException e) {
                CrashHelper.m81296c(e);
            }
        }
        momentMo223809clone.media = new ArrayList(list);
        f8c.m119878o().m119881B(new d30() { // from class: l.vv9
            @Override // p149l.d30
            public final void call() {
                FeedModule.f38860i.f77913c.updateBy_id(momentMo223809clone);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m60656t0(Moment moment, Moment moment2, Envelope envelope) {
        FeedModule.f38860i.f77913c.updateBy_id(moment);
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56011id = moment.f56011id;
        dbLinks.links = Links.new_();
        FeedModule.f38860i.f77916f.upsert(dbLinks);
        FeedModule.f38860i.f77916f.delete(moment2.f56011id);
        FeedModule.m60222H().mo30677Cb(envelope);
    }

    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ roj0 m60657t1(final String str, final Envelope envelope) {
        f8c.m119878o().m119899w(envelope, new d30() { // from class: l.jw9
            @Override // p149l.d30
            public final void call() {
                C10735b.m60631g2(envelope, str);
            }
        }, false, true);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m60659u0(final String str, Throwable th) {
        if (th instanceof ApiExcep.Client.NotFound) {
            f8c.m119878o().m119881B(new d30() { // from class: l.et9
                @Override // p149l.d30
                public final void call() {
                    C10735b.m60671y0(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ Moment m60662v0(Moment moment, Moment moment2, List list) {
        bt00.m103769d(new j760(3, moment));
        final Moment momentMo223809clone = moment2.mo223809clone();
        momentMo223809clone.media = new ArrayList(list);
        f8c.m119878o().m119881B(new d30() { // from class: l.nw9
            @Override // p149l.d30
            public final void call() {
                FeedModule.f38860i.f77913c.updateBy_id(momentMo223809clone);
            }
        });
        return momentMo223809clone;
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m60663v1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56011id = SchemeKey.moment_activities;
        dbLinks.links = envelope.pagination.links;
        qib0.f154722k0.f176630c.upsert(dbLinks);
        FeedModule.f38860i.f77914d.m100797H(vwb.m200303Q(((FeedData) envelope.getModuleData(FeedData.class)).activities, new w9j() { // from class: l.vw9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((MomentActivity) obj).f56011id;
            }
        }));
    }

    /* JADX INFO: renamed from: w1 */
    public static /* synthetic */ stc0 m60666w1(String str, String str2, boolean z) {
        stc0.C20027a c20027aM185898q = omg.f144622G.auth().m185898q(omg.m165042D(str, str2));
        return (z ? c20027aM185898q.m185894m(utc0.create(Network.JSON, "")) : c20027aM185898q.m185885d()).m185883b();
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m60668x0(Moment moment) {
        long j = moment._id;
        if (j != 0) {
            Moment momentQuery = FeedModule.f38860i.f77913c.query(j);
            momentQuery.localCreatedSession--;
            FeedModule.f38860i.f77913c.updateBy_id(momentQuery);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m60671y0(String str) {
        FeedModule.f38860i.f77913c.delete(str);
        FeedModule.m60222H().mo30799n6(str);
    }

    /* JADX INFO: renamed from: y1 */
    public static /* synthetic */ roj0 m60672y1(final boolean z, Envelope envelope) {
        f8c.m119878o().m119898v(envelope, new d30() { // from class: l.jx9
            @Override // p149l.d30
            public final void call() {
                C10735b.m60615Y1(z);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ List m60673y2(List list, Moment moment, List list2) {
        for (int i = 0; i < list.size(); i++) {
            if (((Media) list.get(i)) instanceof Video) {
                k9j.m145075G(k9j.f122028d, moment.f56011id);
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ Notification m60674z0(final String str, Notification notification) {
        if (!notification.m221300k() && (!notification.m221299j() || !(notification.m221294e() instanceof ApiExcep.Client.NotFound))) {
            return notification;
        }
        final DbLinks dbLinks = (DbLinks) qib0.f154722k0.f176630c.query(SchemeKey.moment_activities);
        final int iM136556T = ijb0.m136556T(str);
        dbLinks.extra = Math.max(0, dbLinks.extra - iM136556T);
        f8c.m119878o().m119881B(new d30() { // from class: l.bt9
            @Override // p149l.d30
            public final void call() {
                C10735b.m60563E0(str, iM136556T, dbLinks);
            }
        });
        return Notification.m221292c(roj0.f160388a);
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ C22306c m60677A3(final DbLinks dbLinks) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.nx9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165089m(dbLinks.links.next)).m185887f().m185883b();
            }
        }, omg.f144619D | omg.f144620E).map(new w9j() { // from class: l.ox9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f146157a.m60760z3((Envelope) obj);
            }
        }).compose(omg.m165092n0());
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m60678B3(String str, Envelope envelope) {
        DbLinks dbLinksM60745p4 = m60745p4(str);
        if (dbLinksM60745p4 == null) {
            dbLinksM60745p4 = DbLinks.new_();
            dbLinksM60745p4.f56011id = str;
            dbLinksM60745p4.links.previous = envelope.pagination.links.previous;
        }
        dbLinksM60745p4.links.next = envelope.pagination.links.next;
        FeedModule.f38860i.f77915e.upsert(dbLinksM60745p4);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ roj0 m60679C3(final String str, final Envelope envelope) {
        if (((FeedData) envelope.getModuleData(FeedData.class)).moments.size() == 0) {
            envelope.pagination.links.next = null;
        }
        f8c.m119878o().m119899w(envelope, new d30() { // from class: l.hw9
            @Override // p149l.d30
            public final void call() {
                this.f109739a.m60678B3(str, envelope);
            }
        }, false, true);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ C22306c m60680D3(final String str, final String str2) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.pu9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(str).m185887f().m185883b();
            }
        }, omg.f144619D).map(new w9j() { // from class: l.qu9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f156460a.m60679C3(str2, (Envelope) obj);
            }
        }).compose(omg.m165092n0());
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m60681E3(Envelope envelope) {
        DbLinks dbLinksM60743o4 = m60743o4();
        dbLinksM60743o4.links.next = envelope.pagination.links.next;
        qib0.f154722k0.f176630c.upsert(dbLinksM60743o4);
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ roj0 m60682F3(final Envelope envelope) {
        if (((FeedData) envelope.getModuleData(FeedData.class)).moments.size() == 0) {
            envelope.pagination.links.next = null;
        }
        f8c.m119878o().m119899w(envelope, new d30() { // from class: l.ht9
            @Override // p149l.d30
            public final void call() {
                this.f109378a.m60681E3(envelope);
            }
        }, false, true);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ C22306c m60683G3(final DbLinks dbLinks, final String str, final long j) {
        return new la20((v9j<stc0>) new v9j() { // from class: l.fx9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165089m(dbLinks.links.next)).m185887f().m185883b();
            }
        }, omg.f144619D | omg.f144620E).map(new w9j() { // from class: l.gx9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f104841a.m60682F3((Envelope) obj);
            }
        }).compose(omg.m165092n0()).doOnNext(new e30() { // from class: l.ix9
            @Override // p149l.e30
            public final void call(Object obj) {
                TrackMediaUploadUtil.m80298b0(str, SystemClock.elapsedRealtime() - j);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m60684H3(e30 e30Var, final Moment moment, final Throwable th) {
        MomentPostFailedExcepion.reportMomentPostFailed(th, false);
        zvf0.m220369B("e_post_moment_error", "post_error_moments", vwb.m200311Y("error", th == null ? CardButtonsShowAndHideType.unknow : th.toString()));
        bt00.m103769d(new j760(5, null));
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call("");
        }
        this.f39204H.m132487l(th);
        e51.m114748M(new Runnable() { // from class: l.kv9
            @Override // java.lang.Runnable
            public final void run() {
                yij0.m214926D(th);
            }
        });
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 40041) {
            f8c.m119878o().m119881B(new d30() { // from class: l.lv9
                @Override // p149l.d30
                public final void call() {
                    C10735b.m60553A2(moment);
                }
            });
        } else {
            f8c.m119878o().m119881B(new d30() { // from class: l.mv9
                @Override // p149l.d30
                public final void call() {
                    C10735b.m60668x0(moment);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ C22306c m60685I3(final e30 e30Var, final e30 e30Var2, final Moment moment) {
        return scheduled("postTheMoment", -1, new v9j() { // from class: l.fu9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                Moment moment2 = moment;
                return new la20((v9j<stc0>) new v9j() { // from class: l.yv9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(omg.m165107y()).m185893l(utc0.create(Network.JSON, moment2.toJson())).m185883b();
                    }
                }, omg.f144620E).map(new w9j() { // from class: l.zv9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C10735b.m60590N0(moment2, e30Var, (Envelope) obj);
                    }
                }).doOnError(e30Var2).compose(omg.m165092n0());
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m60686J3(boolean z, Envelope envelope) {
        if (z) {
            FeedModule.f38860i.f77913c.m189031N(vwb.m200303Q(((FeedData) envelope.getModuleData(FeedData.class)).moments, new w9j() { // from class: l.at9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Moment) obj).f56011id;
                }
            }), false);
        }
        DbLinks dbLinksM60743o4 = m60743o4();
        if (z || dbLinksM60743o4 == null) {
            dbLinksM60743o4 = new DbLinks();
            dbLinksM60743o4.links = envelope.pagination.links;
            dbLinksM60743o4.f56011id = Moments.TYPE;
        } else if (NullChecker.m81303a(envelope.pagination.links.previous)) {
            dbLinksM60743o4.links.previous = envelope.pagination.links.previous;
        }
        qib0.f154722k0.f176630c.upsert(dbLinksM60743o4);
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ roj0 m60687K3(final boolean z, final Envelope envelope) {
        if (u2h.m191494c()) {
            m60755u4(envelope);
        }
        f8c.m119878o().m119899w(envelope, new d30() { // from class: l.mx9
            @Override // p149l.d30
            public final void call() {
                this.f136144a.m60686J3(z, envelope);
            }
        }, false, true);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ C22306c m60688L3(final boolean z, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() > 0) {
            sb.append("&");
        }
        sb.append("query=preload");
        final String strM165089m = omg.m165089m(sb.toString());
        return new la20((v9j<stc0>) new v9j() { // from class: l.sw9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(strM165089m).m185887f().m185883b();
            }
        }, omg.f144619D | omg.f144620E).map(new w9j() { // from class: l.tw9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f172380a.m60687K3(z, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ C22306c m60689M3(final boolean z) {
        return C22306c.fromCallable(new Callable() { // from class: l.hv9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f109632a.m60690N3(z);
            }
        }).flatMap(new w9j() { // from class: l.iv9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f115102a.m60688L3(z, (String) obj);
            }
        }).compose(omg.m165092n0());
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ String m60690N3(boolean z) throws Exception {
        String str;
        DbLinks dbLinksM60743o4 = m60743o4();
        return (z || dbLinksM60743o4 == null || (str = dbLinksM60743o4.links.previous) == null) ? "limit=20" : str;
    }

    /* JADX INFO: renamed from: O2 */
    public C22306c<q860<MomentActivity>> m60691O2() {
        return mkd0.m154984r(ijb0.m136541E(), qib0.f154722k0.f176630c.uiGet(SchemeKey.moment_activities), new x9j() { // from class: l.ov9
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f145789a.m60732j3((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ C22306c m60692O3(Envelope envelope, Envelope envelope2) {
        envelope.addAll(envelope2);
        envelope.pagination.links.next = envelope2.pagination.links.next;
        return m60749r4(envelope);
    }

    /* JADX INFO: renamed from: P2 */
    public C22306c<roj0> m60693P2(q860<MomentActivity> q860Var) {
        return m60700T2(false, q860Var);
    }

    /* JADX INFO: renamed from: P3 */
    public C22306c<List<Moment>> m60694P3(final String str) {
        return scheduled(str + "/moments/latest", 0, new v9j() { // from class: l.zs9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20((v9j<stc0>) new v9j() { // from class: l.yu9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(omg.m165106x(str, omg.f144648z)).m185887f().m185883b();
                    }
                }, omg.f144619D).map(new w9j() { // from class: l.zu9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).moments;
                    }
                }).compose(omg.m165092n0());
            }
        });
    }

    /* JADX INFO: renamed from: Q2 */
    public C22306c<roj0> m60695Q2() {
        return scheduled("activity/poll", 0, new v9j() { // from class: l.cv9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C10735b.m60632h1();
            }
        });
    }

    /* JADX INFO: renamed from: R2 */
    public C22306c<roj0> m60696R2(q860<MomentActivity> q860Var) {
        return m60700T2(true, q860Var);
    }

    /* JADX INFO: renamed from: R3 */
    public C22306c<Envelope> m60697R3(final String str, final String str2, final boolean z) {
        return scheduled("/moments/" + str2 + "/likes/me", -1, new v9j() { // from class: l.bu9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f77288a.m60750s3(str, str2, z);
            }
        });
    }

    /* JADX INFO: renamed from: S2 */
    public C22306c<roj0> m60698S2() {
        return scheduled("activity/poll", 0, new v9j() { // from class: l.du9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20((v9j<stc0>) new v9j() { // from class: l.fv9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(omg.m165065a("limit=20")).m185887f().m185883b();
                    }
                }, omg.f144619D).map(new w9j() { // from class: l.gv9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C10735b.m60603S1((Envelope) obj);
                    }
                }).compose(omg.m165092n0());
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public C22306c<Boolean> m60699S3(final String str, final String str2) {
        return scheduled("moments/" + str2 + "/likes/next", 0, new v9j() { // from class: l.fw9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f99629a.m60754u3(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public C22306c<roj0> m60700T2(final boolean z, q860<MomentActivity> q860Var) {
        final MomentActivity momentActivity = (MomentActivity) vwb.m200292F(q860Var.f153135a);
        ijb0.m136564d();
        return scheduled("activity_patch", -1, new v9j() { // from class: l.ru9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C10735b.m60608V0(z, momentActivity);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public String m60701T3(String str, String str2) {
        String str3;
        Moment momentM60709X3 = m60709X3(str2);
        return (momentM60709X3 == null || (str3 = momentM60709X3.likes.links.next) == null) ? "" : str3;
    }

    /* JADX INFO: renamed from: U2 */
    public Moment m60702U2(Live live) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56011id = live.f38767id;
        momentNew_.isLive = true;
        momentNew_.live = live;
        momentNew_.owner = live.anchor.f38803id;
        return momentNew_;
    }

    /* JADX INFO: renamed from: U3 */
    public DbLinks m60703U3() {
        return (DbLinks) qib0.f154722k0.f176630c.queryCache(Moments.TYPE);
    }

    /* JADX INFO: renamed from: V2 */
    public Moment m60704V2(VoiceLive voiceLive) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56011id = voiceLive.f39250id;
        momentNew_.isVoiceLive = true;
        momentNew_.voiceLive = voiceLive;
        momentNew_.owner = voiceLive.anchor.f38803id;
        return momentNew_;
    }

    /* JADX INFO: renamed from: V3 */
    public DbLinks m60705V3(String str) {
        return (DbLinks) FeedModule.f38860i.f77915e.queryCache(str);
    }

    /* JADX INFO: renamed from: W2 */
    public C22306c<q860<Moment>> m60706W2(String str, final int i) {
        C22306c<List<Moment>> c22306cM136562b = ijb0.m136562b(str, i);
        if (i > 0) {
            c22306cM136562b = c22306cM136562b.map(new w9j() { // from class: l.uu9
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C10735b.m60627e2(i, (List) obj);
                }
            });
        }
        return mkd0.m154984r(c22306cM136562b, FeedModule.f38860i.f77915e.uiGet(str), new x9j() { // from class: l.vu9
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f183042a.m60734k3((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public C22306c<Moment> m60707W3(String str) {
        return FeedModule.f38860i.f77913c.uiGet(str).filter(new w9j() { // from class: l.nv9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Moment) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public C22306c<roj0> m60708X2(String str, final String str2, final MomentMessage momentMessage) {
        return ijb0.m136569i(str, str2, momentMessage.f56008id, new d30() { // from class: l.xt9
            @Override // p149l.d30
            public final void call() {
                this.f194359a.m60736l3(momentMessage, str2);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public Moment m60709X3(String str) {
        return FeedModule.f38860i.f77913c.queryCache(str);
    }

    /* JADX INFO: renamed from: Y2 */
    public DbLinks m60710Y2(String str) {
        return (DbLinks) FeedModule.f38860i.f77916f.queryCache(str);
    }

    /* JADX INFO: renamed from: Y3 */
    public C22306c<q860<Moment>> m60711Y3() {
        return u2h.m191494c() ? mkd0.m154985s(ijb0.m136543G(), qib0.f154722k0.f176630c.uiGet(Moments.TYPE), this.f39207K.observeOn(jo0.m142408a()), new y9j() { // from class: l.av9
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return this.f71923a.m60756v3((List) obj, (DbLinks) obj2, (SparseArray) obj3);
            }
        }) : mkd0.m154984r(ijb0.m136543G(), qib0.f154722k0.f176630c.uiGet(Moments.TYPE), new x9j() { // from class: l.bv9
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f77411a.m60757w3((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Z2 */
    public C22306c<roj0> m60712Z2(final String str, final String str2) {
        return scheduled("moments/" + str2 + "/comments/next", 0, new v9j() { // from class: l.mw9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f136026a.m60742o3(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public C22306c<q860<Moment>> m60713Z3(final String str) {
        return mkd0.m154984r(ijb0.m136544H(str), FeedModule.f38860i.f77915e.uiGet(str), new x9j() { // from class: l.dv9
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f88047a.m60758x3(str, (List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: a3 */
    public String m60714a3(String str, String str2) {
        DbLinks dbLinksM60710Y2 = m60710Y2(str2);
        return dbLinksM60710Y2 == null ? "" : dbLinksM60710Y2.links.next;
    }

    /* JADX INFO: renamed from: a4 */
    public C22306c<roj0> m60715a4() {
        final DbLinks dbLinksM60703U3 = m60703U3();
        return (NullChecker.m81304b(dbLinksM60703U3) && NullChecker.m81303a(dbLinksM60703U3.links.next)) ? scheduled("moments/next", 0, new v9j() { // from class: l.cw9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f82761a.m60677A3(dbLinksM60703U3);
            }
        }) : just();
    }

    /* JADX INFO: renamed from: b3 */
    public C22306c<MomentMessage> m60716b3(String str, MomentMessage momentMessage) {
        momentMessage.messageType = MomentMessageType.get("moment_comment");
        return ijb0.m136540D(str, momentMessage, true);
    }

    /* JADX INFO: renamed from: b4 */
    public C22306c<roj0> m60717b4(final String str) {
        DbLinks dbLinksM60705V3 = m60705V3(str);
        if (dbLinksM60705V3 == null) {
            dbLinksM60705V3 = new DbLinks();
            dbLinksM60705V3.f56011id = str;
            Links links = new Links();
            dbLinksM60705V3.links = links;
            links.next = omg.f144648z;
        }
        if (!NullChecker.m81303a(dbLinksM60705V3.links.next)) {
            return just();
        }
        final String strM165106x = omg.m165106x(str, dbLinksM60705V3.links.next);
        return scheduled(str + "/moments/next", 0, new v9j() { // from class: l.au9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f71735a.m60680D3(strM165106x, str);
            }
        });
    }

    /* JADX INFO: renamed from: c3 */
    public C22306c<q860<MomentMessage>> m60718c3(String str) {
        return mkd0.m154984r(ijb0.m136568h(str), FeedModule.f38860i.f77916f.uiGet(str, false), new x9j() { // from class: l.gu9
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f104383a.m60744p3((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public C22306c<roj0> m60719c4(final String str) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final DbLinks dbLinksM60703U3 = m60703U3();
        return (NullChecker.m81304b(dbLinksM60703U3) && NullChecker.m81303a(dbLinksM60703U3.links.next)) ? scheduled("moments/next", 0, new v9j() { // from class: l.kw9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f124942a.m60683G3(dbLinksM60703U3, str, jElapsedRealtime);
            }
        }) : just();
    }

    /* JADX INFO: renamed from: d3 */
    public List<MomentMessage> m60720d3(Moment moment) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81304b(moment.messages) && NullChecker.m81304b(moment.messages.ids)) {
            Iterator<String> it = moment.messages.ids.iterator();
            while (it.hasNext()) {
                MomentMessage momentMessage = (MomentMessage) FeedModule.m60222H().mo30773i8(it.next(), MomentMessage.JSON_ADAPTER);
                if (NullChecker.m81303a(momentMessage) && !momentMessage.recalled.booleanValue()) {
                    arrayList.add(momentMessage);
                }
            }
            vwb.m200295I(arrayList, new Comparator() { // from class: l.bw9
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C10735b.m60600R0((MomentMessage) obj, (MomentMessage) obj2);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d4 */
    public final Map<String, Room> m60721d4(List<Room> list) {
        return NullChecker.m81303a(list) ? vwb.m200319d(list, new w9j() { // from class: l.pt9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Room) obj).f38810id;
            }
        }, new w9j() { // from class: l.qt9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60580J2((Room) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: e3 */
    public void m60722e3(Act act, User user, Moment moment, String str, String str2, boolean z) {
        if (user != null) {
            FeedModule.m60222H().mo30696Ij(act, user.f56011id, NullChecker.m81303a(moment) ? moment.f56011id : null, moment, str, str2, false, z);
            return;
        }
        StringBuilder sb = new StringBuilder("Moment id: ");
        sb.append(NullChecker.m81303a(moment) ? moment.f56011id : null);
        sb.append("from:");
        sb.append(str);
        sb.append("\nActStackInfo:");
        sb.append(FeedException.getActStackInfo());
        sb.append("\n Trace: ");
        sb.append(FeedException.getTrace(new Exception()));
        CrashHelper.m81297d(new MomentUserNullException(sb.toString()), 100);
    }

    /* JADX INFO: renamed from: e4 */
    public final Map<String, Live> m60723e4(List<Live> list) {
        return NullChecker.m81303a(list) ? vwb.m200319d(list, new w9j() { // from class: l.rt9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Live) obj).f38767id;
            }
        }, new w9j() { // from class: l.st9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60606U0((Live) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: f3 */
    public void m60724f3(Act act, User user, Moment moment, String str, boolean z) {
        m60722e3(act, user, moment, str, vqg.m199499C(str), z);
    }

    /* JADX INFO: renamed from: f4 */
    public final Map<String, LiveUserMask> m60725f4(List<LiveUserMask> list) {
        return NullChecker.m81303a(list) ? vwb.m200319d(list, new w9j() { // from class: l.yt9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((LiveUserMask) obj).userId;
            }
        }, new w9j() { // from class: l.zt9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60604T0((LiveUserMask) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: g3 */
    public C22306c<roj0> m60726g3(final String str) {
        return scheduled(RequestParameters.SUBRESOURCE_DELETE, -1, new v9j() { // from class: l.uv9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return new la20(new v9j() { // from class: l.ax9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(omg.m165104v(str2)).m185885d().m185883b();
                    }
                }).materialize().map(new w9j() { // from class: l.bx9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C10735b.m60674z0(str2, (Notification) obj);
                    }
                }).dematerialize().take(1).compose(omg.m165092n0());
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final Map<String, VoiceLiveGame> m60727g4(List<VoiceLiveGame> list) {
        return NullChecker.m81303a(list) ? vwb.m200319d(list, new w9j() { // from class: l.ut9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((VoiceLiveGame) obj).f38836id;
            }
        }, new w9j() { // from class: l.wt9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60558C1((VoiceLiveGame) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: h3 */
    public C22306c<roj0> m60728h3(final long j) {
        return now(C22306c.fromCallable(new Callable() { // from class: l.vt9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C10735b.m60579J1(j);
            }
        }).compose(omg.m165092n0()));
    }

    /* JADX INFO: renamed from: h4 */
    public final Map<String, VoiceRoomInfo> m60729h4(List<VoiceRoomInfo> list) {
        return NullChecker.m81303a(list) ? vwb.m200319d(list, new w9j() { // from class: l.it9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((VoiceRoomInfo) obj).f38838id;
            }
        }, new w9j() { // from class: l.jt9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60572H0((VoiceRoomInfo) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m60730i3(String str) {
        return ijb0.m136580t(str);
    }

    /* JADX INFO: renamed from: i4 */
    public final Map<String, VoiceLive> m60731i4(List<VoiceLive> list) {
        return NullChecker.m81303a(list) ? vwb.m200319d(list, new w9j() { // from class: l.lt9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((VoiceLive) obj).f39250id;
            }
        }, new w9j() { // from class: l.mt9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60597Q0((VoiceLive) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ q860 m60732j3(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m60698S2();
        }
        return m165109q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: j4 */
    public C22306c<roj0> m60733j4(Moment moment) {
        return m60735k4(moment, null);
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ q860 m60734k3(List list, DbLinks dbLinks) {
        return m165109q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: k4 */
    public C22306c<roj0> m60735k4(final Moment moment, final e30<String> e30Var) {
        final String strUserId = FeedModule.m60221F().userId();
        bt00.m103769d(new j760(0, moment));
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.visibility = MomentVisibilityStatus.get("matches");
        momentSettings.muted = false;
        moment.settings = momentSettings;
        moment.messages = PartialIdList.new_();
        v9j v9jVar = new v9j() { // from class: l.iu9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C22306c.fromCallable(new Callable() { // from class: l.jv9
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C10735b.m60637j2(moment);
                    }
                });
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.tu9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60576I1(strUserId, moment, (Moment) obj);
            }
        };
        final e30<Throwable> e30Var2 = new e30() { // from class: l.ev9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93320a.m60684H3(e30Var, moment, (Throwable) obj);
            }
        };
        final w9j w9jVar2 = new w9j() { // from class: l.pv9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f151430a.m60685I3(e30Var, e30Var2, (Moment) obj);
            }
        };
        return now(((C22306c) v9jVar.call()).filter(new w9j() { // from class: l.aw9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(C10735b.m60599Q3(strUserId));
            }
        }).flatMap(new w9j() { // from class: l.lw9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60557C0(w9jVar, (Moment) obj);
            }
        }).filter(new w9j() { // from class: l.ww9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(C10735b.m60599Q3(strUserId));
            }
        }).compose(TrackMediaUploadUtil.m80306f0("moment", moment.media, new w9j() { // from class: l.hx9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60629f2((Moment) obj);
            }
        })).doOnError(e30Var2).compose(mkd0.m154965Q()).filter(new w9j() { // from class: l.sx9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(C10735b.m60599Q3(strUserId));
            }
        }).flatMap(new w9j() { // from class: l.kt9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C10735b.m60619a2(w9jVar2, (Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ void m60736l3(MomentMessage momentMessage, String str) {
        DbLinks dbLinksM60741n4 = m60741n4(momentMessage.moment);
        if (NullChecker.m81304b(dbLinksM60741n4)) {
            dbLinksM60741n4.total--;
            kjb0.m146189L(dbLinksM60741n4);
        }
        Moment momentQuery = FeedModule.f38860i.f77913c.query(str);
        if (NullChecker.m81303a(momentQuery)) {
            momentQuery.messages.ids.remove(momentMessage.f56008id);
            FeedModule.f38860i.f77913c.updateBy_id(momentQuery);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public C22306c<roj0> m60737l4(final String str) {
        return scheduled(str + "/moments/previous", 0, new v9j() { // from class: l.eu9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return new la20((v9j<stc0>) new v9j() { // from class: l.wu9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(omg.m165106x(str2, omg.f144648z)).m185887f().m185883b();
                    }
                }, omg.f144619D).map(new w9j() { // from class: l.xu9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C10735b.m60657t1(str2, (Envelope) obj);
                    }
                }).compose(omg.m165092n0());
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m60738m3(String str, Envelope envelope) {
        DbLinks dbLinksM60741n4 = m60741n4(str);
        Links links = dbLinksM60741n4.links;
        Pagination pagination = envelope.pagination;
        links.next = pagination.links.next;
        dbLinksM60741n4.total = pagination.total;
        FeedModule.f38860i.f77916f.upsert(dbLinksM60741n4);
    }

    /* JADX INFO: renamed from: m4 */
    public C22306c<roj0> m60739m4(boolean z) {
        final boolean z2 = z || this.f39208L;
        this.f39208L = false;
        return scheduled("moments/previous", 0, new v9j() { // from class: l.cu9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f82539a.m60689M3(z2);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ roj0 m60740n3(final String str, final Envelope envelope) {
        f8c.m119878o().m119898v(envelope, new d30() { // from class: l.ft9
            @Override // p149l.d30
            public final void call() {
                this.f99158a.m60738m3(str, envelope);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: n4 */
    public DbLinks m60741n4(String str) {
        return (DbLinks) FeedModule.f38860i.f77916f.query(str);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ C22306c m60742o3(final String str, final String str2) {
        final String strM60714a3 = m60714a3(str, str2);
        return NullChecker.m81303a(strM60714a3) ? new la20((v9j<stc0>) new v9j() { // from class: l.yw9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165040B(str, str2, strM60714a3)).m185887f().m185883b();
            }
        }, omg.f144619D).map(new w9j() { // from class: l.zw9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f205160a.m60740n3(str2, (Envelope) obj);
            }
        }).compose(omg.m165092n0()) : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: o4 */
    public DbLinks m60743o4() {
        return (DbLinks) qib0.f154722k0.f176630c.query(Moments.TYPE);
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ q860 m60744p3(List list, DbLinks dbLinks) {
        return m165109q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: p4 */
    public DbLinks m60745p4(String str) {
        return (DbLinks) FeedModule.f38860i.f77915e.query(str);
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m60746q3(String str, boolean z, Envelope envelope) {
        Moment momentM60747q4 = m60747q4(str);
        if (NullChecker.m81304b(momentM60747q4)) {
            boolean z2 = momentM60747q4.haveLiked;
            if (z2 && !z) {
                PartialIdList partialIdList = momentM60747q4.likes;
                partialIdList.count--;
                partialIdList.ids = vwb.m200318c0(partialIdList.ids, FeedModule.m60221F().userId());
            } else if (!z2 && z) {
                PartialIdList partialIdList2 = momentM60747q4.likes;
                partialIdList2.count++;
                partialIdList2.ids = vwb.m200317c(partialIdList2.ids, FeedModule.m60221F().userId());
            }
            momentM60747q4.haveLiked = z;
            if (NullChecker.m81303a(envelope)) {
                FeedModule.m60222H().mo30677Cb(envelope);
            }
            FeedModule.f38860i.f77913c.upsert(momentM60747q4);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public Moment m60747q4(String str) {
        return FeedModule.f38860i.f77913c.query(str);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ Envelope m60748r3(final String str, final boolean z, final Envelope envelope) {
        f8c.m119878o().m119898v(envelope, new d30() { // from class: l.ow9
            @Override // p149l.d30
            public final void call() {
                this.f145968a.m60746q3(str, z, envelope);
            }
        });
        return envelope;
    }

    /* JADX INFO: renamed from: r4 */
    public final C22306c<Envelope> m60749r4(final Envelope envelope) {
        return envelope.pagination.links.next == null ? C22306c.just(envelope) : new la20(new v9j() { // from class: l.dw9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165045G(envelope.pagination.links.next)).m185887f().m185883b();
            }
        }).flatMap(new w9j() { // from class: l.ew9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93473a.m60692O3(envelope, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ C22306c m60750s3(final String str, final String str2, final boolean z) {
        return new la20(new v9j() { // from class: l.mu9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C10735b.m60666w1(str, str2, z);
            }
        }).map(new w9j() { // from class: l.nu9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f140585a.m60748r3(str2, z, (Envelope) obj);
            }
        }).compose(omg.m165092n0()).doOnNext(new e30() { // from class: l.ou9
            @Override // p149l.e30
            public final void call(Object obj) {
                C10735b.m60570G1(z, str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public C22306c<roj0> m60751s4(final String str, final String str2) {
        return scheduled("moment/refresh/" + str2, 0, new v9j() { // from class: l.uw9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                String str3 = str;
                String str4 = str2;
                return new la20((v9j<stc0>) new v9j() { // from class: l.cx9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return omg.f144622G.auth().m185898q(omg.m165105w(str3, str4)).m185883b();
                    }
                }, omg.f144619D).map(new w9j() { // from class: l.dx9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C10735b.m60617Z1((Envelope) obj);
                    }
                }).doOnError(new e30() { // from class: l.ex9
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C10735b.m60659u0(str4, (Throwable) obj);
                    }
                }).compose(omg.m165092n0());
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ Boolean m60752t3(String str, final Envelope envelope) {
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        final Moment momentM60747q4 = m60747q4(str);
        f8c.m119878o().m119898v(envelope, new d30() { // from class: l.dt9
            @Override // p149l.d30
            public final void call() {
                C10735b.m60574H2(envelope, momentM60747q4);
            }
        });
        return Boolean.valueOf(commonData.users.size() > 0);
    }

    /* JADX INFO: renamed from: t4 */
    public C22306c<roj0> m60753t4(String str, String str2, Report report) {
        return ijb0.m136551O(str, str2, report);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ C22306c m60754u3(final String str, final String str2) {
        final String strM60701T3 = m60701T3(str, str2);
        return new la20(new v9j() { // from class: l.px9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return omg.f144622G.auth().m185898q(omg.m165041C(str, str2, strM60701T3)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.qx9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f156820a.m60752t3(str2, (Envelope) obj);
            }
        }).compose(omg.m165092n0());
    }

    /* JADX INFO: renamed from: u4 */
    public final void m60755u4(Envelope envelope) {
        if (vwb.m200296J(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            return;
        }
        Map<String, Live> mapM60723e4 = m60723e4(((FeedData) envelope.getModuleData(FeedData.class)).lives);
        Map<String, Room> mapM60721d4 = m60721d4(((FeedData) envelope.getModuleData(FeedData.class)).rooms);
        Map<String, VoiceLive> mapM60731i4 = m60731i4(((FeedData) envelope.getModuleData(FeedData.class)).voiceLives);
        final Map<String, LiveUserMask> mapM60725f4 = m60725f4(((FeedData) envelope.getModuleData(FeedData.class)).masks);
        Map<String, VoiceRoomInfo> mapM60729h4 = m60729h4(((FeedData) envelope.getModuleData(FeedData.class)).voiceRooms);
        Map<String, VoiceLiveGame> mapM60727g4 = m60727g4(((FeedData) envelope.getModuleData(FeedData.class)).voiceLiveGames);
        List<RawFeed> list = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        SparseArray<Moment> sparseArray = new SparseArray<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RawFeed rawFeed = list.get(i);
            if ("live".equals(rawFeed.type)) {
                Live live = mapM60723e4.get(rawFeed.f39243id);
                if (NullChecker.m81303a(live)) {
                    Moment momentM60702U2 = m60702U2(live);
                    Room room = mapM60721d4.get(live.room.f38803id);
                    if (NullChecker.m81303a(room)) {
                        momentM60702U2.value = room.title;
                        momentM60702U2.liveRoom = room;
                        momentM60702U2.localInFeed = true;
                        momentM60702U2.localInUserFeed = true;
                        momentM60702U2.createdTime = mqi0.m155944o();
                    }
                    sparseArray.put(i, momentM60702U2);
                }
            } else if (BLiveType.voiceLive.equals(rawFeed.type)) {
                VoiceLive voiceLive = mapM60731i4.get(rawFeed.f39243id);
                if (NullChecker.m81303a(voiceLive)) {
                    Moment momentM60704V2 = m60704V2(voiceLive);
                    final HashMap map = new HashMap();
                    vwb.m200354z(voiceLive.callInfo.onVoiceCalls, new e30() { // from class: l.rx9
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            C10735b.m60643m2(mapM60725f4, map, (OnVoiceCall) obj);
                        }
                    });
                    voiceLive.masksMap = map;
                    VoiceRoomInfo voiceRoomInfo = mapM60729h4.get(voiceLive.room.f38803id);
                    if (NullChecker.m81303a(voiceRoomInfo)) {
                        voiceLive.voiceRoomInfo = voiceRoomInfo;
                    }
                    voiceLive.voiceLiveGame = mapM60727g4.get(voiceLive.f39250id);
                    sparseArray.put(i, momentM60704V2);
                }
            }
        }
        this.f39207K.m132487l(sparseArray);
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ q860 m60756v3(List list, DbLinks dbLinks, SparseArray sparseArray) {
        if (dbLinks == null) {
            m60739m4(false);
        }
        return sparseArray.size() != 0 ? m165109q0(new ymf0(list, sparseArray), dbLinks) : m165109q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ q860 m60757w3(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m60739m4(false);
        }
        return m165109q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ q860 m60758x3(String str, List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m60737l4(str);
        }
        return m165109q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m60759y3(Envelope envelope) {
        DbLinks dbLinksM60743o4 = m60743o4();
        dbLinksM60743o4.links.next = envelope.pagination.links.next;
        qib0.f154722k0.f176630c.upsert(dbLinksM60743o4);
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ roj0 m60760z3(final Envelope envelope) {
        if (((FeedData) envelope.getModuleData(FeedData.class)).moments.size() == 0) {
            envelope.pagination.links.next = null;
        }
        f8c.m119878o().m119899w(envelope, new d30() { // from class: l.gt9
            @Override // p149l.d30
            public final void call() {
                this.f104262a.m60759y3(envelope);
            }
        }, false, true);
        return roj0.f160388a;
    }
}

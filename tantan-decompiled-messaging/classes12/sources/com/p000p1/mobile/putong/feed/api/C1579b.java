package com.p000p1.mobile.putong.feed.api;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import com.p000p1.mobile.putong.data.CommonData;
import com.p000p1.mobile.putong.data.DbLinks;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Live;
import com.p000p1.mobile.putong.data.LiveUserMask;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Moments;
import com.p000p1.mobile.putong.data.Pagination;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Report;
import com.p000p1.mobile.putong.data.Room;
import com.p000p1.mobile.putong.data.SchemeKey;
import com.p000p1.mobile.putong.data.UploadSource;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.VoiceLiveGame;
import com.p000p1.mobile.putong.data.VoiceRoomInfo;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.api.C1579b;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.MomentMessageType;
import com.p000p1.mobile.putong.feed.data.MomentSettings;
import com.p000p1.mobile.putong.feed.data.MomentVisibilityStatus;
import com.p000p1.mobile.putong.feed.data.OnVoiceCall;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.data.VoiceLive;
import com.p000p1.mobile.putong.feed.helper.MomentUserNullException;
import com.p000p1.mobile.putong.feed.helper.exception.FeedException;
import com.p000p1.mobile.putong.feed.helper.exception.MomentPostFailedExcepion;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.data.CopyObject;
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
import l.d30;
import l.e30;
import l.e51;
import l.fgf0;
import l.ggi;
import l.j760;
import l.jo0;
import l.k9j;
import l.la20;
import l.lsx;
import l.mkd0;
import l.mqi0;
import l.pgm;
import l.q860;
import l.qib0;
import l.qnd;
import l.r5l0;
import l.rhi;
import l.roj0;
import l.s5l0;
import l.stc0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.x9j;
import l.y9j;
import l.yij0;
import l.zvf0;
import p007l.bt00;
import p007l.f8c;
import p007l.ijb0;
import p007l.kjb0;
import p007l.omg;
import p007l.u2h;
import p007l.vqg;
import p007l.ymf0;
import rx.Notification;
import rx.c;
import rx.subjects.b;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C1579b extends omg {

    /* JADX INFO: renamed from: H */
    public final b<Throwable> f665H = b.b();

    /* JADX INFO: renamed from: I */
    public b<Moment> f666I = b.b();

    /* JADX INFO: renamed from: J */
    public b<String> f667J = b.b();

    /* JADX INFO: renamed from: K */
    public rx.subjects.a<SparseArray<Moment>> f668K = rx.subjects.a.c(new SparseArray());

    /* JADX INFO: renamed from: L */
    public boolean f669L = true;

    /* JADX INFO: renamed from: M */
    public a f670M = new a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.b$a */
    public class a extends fgf0<List<String>> {

        /* JADX INFO: renamed from: h */
        public LruCache<String, List<String>> f671h;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.b$a$a, reason: collision with other inner class name */
        public class C2559a implements v9j<c<List<String>>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C1579b f673a;

            public C2559a(C1579b c1579b) {
                this.f673a = c1579b;
            }

            /* JADX INFO: renamed from: d */
            public static /* synthetic */ List m1702d(Envelope envelope) {
                f8c.m10082o().m10101u(envelope);
                return vwb.Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new w9j() { // from class: l.dy9
                    public final Object call(Object obj) {
                        return ((DbObject) ((User) obj)).id;
                    }
                });
            }

            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public c<List<String>> call() {
                return new la20(new v9j() { // from class: l.ay9
                    public final Object call() {
                        return omg.f11509G.auth().q(omg.m12663G(omg.f11503A)).f().b();
                    }
                }).flatMap(new w9j() { // from class: l.by9
                    public final Object call(Object obj) {
                        return this.f6463a.m1704f((Envelope) obj);
                    }
                }).map(new w9j() { // from class: l.cy9
                    public final Object call(Object obj) {
                        return C1579b.a.C2559a.m1702d((Envelope) obj);
                    }
                });
            }

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ c m1704f(Envelope envelope) {
                return this.f673a.m1675r4(envelope);
            }
        }

        public a() {
            super(C1579b.this, "mutedUsers", new ggi(new qnd("muted_users_protobuf", (String) null, FeedModule.m1139F().userId()), 7, ProtobufAdapter.ARRAY_ADAPTER(ProtobufAdapter.STRING_ADAPTER)), new C2559a(C1579b.this));
            this.f671h = new LruCache<>(10);
        }

        /* JADX INFO: renamed from: D */
        public static /* synthetic */ stc0 m1689D(String str, boolean z) {
            stc0.a aVarQ = omg.f11509G.auth().q(omg.m12664H(str));
            return (z ? aVarQ.m(utc0.create(Network.JSON, "")) : aVarQ.d()).b();
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m1694I(String str) {
            List<String> listM14539K = FeedModule.f321i.f6464c.m14539K(str, true);
            if (!vwb.J(listM14539K)) {
                this.f671h.put(str, listM14539K);
            }
            FeedModule.f321i.f6464c.m14543O(str, false);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ roj0 m1695J(final String str, Envelope envelope) {
            f8c.m10082o().m10102v(envelope, new d30() { // from class: l.yx9
                public final void call() {
                    this.f15523a.m1694I(str);
                }
            });
            List arrayList = (List) n();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            A(vwb.c(arrayList, str));
            return roj0.a;
        }

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ void m1696K(String str, roj0 roj0Var) {
            if (NullChecker.a(this.f671h.get(str))) {
                final List<String> listRemove = this.f671h.remove(str);
                f8c.m10082o().m10085B(new d30() { // from class: l.zx9
                    public final void call() {
                        FeedModule.f321i.f6464c.m14542N(listRemove, true);
                    }
                });
            }
            List arrayList = (List) n();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            A(vwb.c0(arrayList, str));
        }

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ c m1697L(final String str, final boolean z) {
            v9j v9jVar = new v9j() { // from class: l.ux9
                public final Object call() {
                    return C1579b.a.m1689D(str, z);
                }
            };
            return z ? new la20(v9jVar).map(new w9j() { // from class: l.vx9
                public final Object call(Object obj) {
                    return this.f14321a.m1695J(str, (Envelope) obj);
                }
            }).compose(omg.m12710n0()) : new la20(v9jVar).map(new w9j() { // from class: l.wx9
                public final Object call(Object obj) {
                    return roj0.a;
                }
            }).doOnNext(new e30() { // from class: l.xx9
                public final void call(Object obj) {
                    this.f15175a.m1696K(str, (roj0) obj);
                }
            }).compose(omg.m12710n0());
        }

        /* JADX INFO: renamed from: M */
        public c<roj0> m1698M(final String str, final boolean z) {
            return C1579b.this.scheduled("mute", -1, new v9j() { // from class: l.tx9
                public final Object call() {
                    return this.f13462a.m1697L(str, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ roj0 m1477A0(Envelope envelope) {
        ijb0.m10916c();
        return roj0.a;
    }

    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ void m1479A2(Moment moment) {
        long j = ((DbObject) moment)._id;
        if (j != 0) {
            FeedModule.f321i.f6464c.delete(j);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ c m1483C0(w9j w9jVar, Moment moment) {
        return (c) w9jVar.call(moment);
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ VoiceLiveGame m1484C1(VoiceLiveGame voiceLiveGame) {
        return voiceLiveGame;
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m1489E0(String str, final int i, DbLinks dbLinks) {
        FeedModule.f321i.f6464c.delete(str);
        e51.G(new Runnable() { // from class: l.tt9
            @Override // java.lang.Runnable
            public final void run() {
                ijb0.m10911V(i);
            }
        });
        qib0.k0.c.upsert(dbLinks);
        FeedModule.f321i.f6465d.m8762G(str);
        FeedModule.m1140H().n6(str);
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m1496G1(boolean z, String str, Envelope envelope) {
        if (!z || str.equals(FeedModule.m1139F().userId())) {
            return;
        }
        e51.H(FeedModule.f313a, new Runnable() { // from class: l.rw9
            @Override // java.lang.Runnable
            public final void run() {
                ijb0.m10898I();
            }
        }, 600L);
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ VoiceRoomInfo m1498H0(VoiceRoomInfo voiceRoomInfo) {
        return voiceRoomInfo;
    }

    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ void m1500H2(Envelope envelope, final Moment moment) {
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        Pagination pagination = envelope.pagination;
        String str = pagination.links.next;
        if (str != null) {
            moment.likes.links.next = str;
        }
        PartialIdList partialIdList = moment.likes;
        partialIdList.count = pagination.total;
        partialIdList.ids = vwb.e(partialIdList.ids, new List[]{vwb.n(vwb.Q(commonData.users, new w9j() { // from class: l.nt9
            public final Object call(Object obj) {
                return ((DbObject) ((User) obj)).id;
            }
        }), new w9j() { // from class: l.ot9
            public final Object call(Object obj) {
                return Boolean.valueOf(!moment.likes.ids.contains((String) obj));
            }
        })});
        FeedModule.f321i.f6464c.upsert(moment);
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ c m1502I1(final String str, final Moment moment, final Moment moment2) {
        return (!NullChecker.a(moment2.media) || moment2.media.size() <= 0) ? c.just(moment2) : new lsx(new ArrayList(moment2.media), false, str).doOnNext(new e30() { // from class: l.hu9
            public final void call(Object obj) {
                C1579b.m1577q2(moment2, (List) obj);
            }
        }).last().filter(new w9j() { // from class: l.ju9
            public final Object call(Object obj) {
                return Boolean.valueOf(C1579b.m1525Q3(str));
            }
        }).flatMap(new w9j() { // from class: l.ku9
            public final Object call(Object obj) {
                return C1579b.m1535V1(moment, moment2, (List) obj);
            }
        }).map(new w9j() { // from class: l.lu9
            public final Object call(Object obj) {
                return C1579b.m1588v0(moment, moment2, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ roj0 m1505J1(final long j) {
        f8c.m10082o().m10085B(new d30() { // from class: l.su9
            public final void call() {
                FeedModule.f321i.f6464c.delete(j);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: J2 */
    public static /* synthetic */ Room m1506J2(Room room) {
        return room;
    }

    /* JADX INFO: renamed from: M1 */
    public static /* synthetic */ stc0 m1514M1(boolean z, String str) {
        stc0.a aVarD;
        if (z) {
            aVarD = omg.f11509G.auth().l(utc0.create(Network.JSON, "{\"read\": true}")).q(str + "&method=patch");
        } else {
            aVarD = omg.f11509G.auth().q(str).d();
        }
        return aVarD.b();
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ roj0 m1516N0(final Moment moment, e30 e30Var, final Envelope envelope) {
        qib0.e1("moments_sent", new Object[0]);
        bt00.m9032d(new j760(4, (Object) null));
        final Moment moment2 = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(0);
        ((DbObject) moment2)._id = ((DbObject) moment)._id;
        if (NullChecker.a(e30Var)) {
            e30Var.call(((DbObject) moment2).id);
        }
        f8c.m10082o().m10102v(envelope, new d30() { // from class: l.xw9
            public final void call() {
                C1579b.m1582t0(moment2, moment, envelope);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ VoiceLive m1523Q0(VoiceLive voiceLive) {
        return voiceLive;
    }

    /* JADX INFO: renamed from: Q3 */
    public static boolean m1525Q3(String str) {
        return FeedModule.m1139F().signedIn_() && TextUtils.equals(str, FeedModule.m1139F().userId());
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ int m1526R0(MomentMessage momentMessage, MomentMessage momentMessage2) {
        return (int) (momentMessage.createdTime - momentMessage2.createdTime);
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ roj0 m1529S1(final Envelope envelope) {
        f8c.m10082o().m10102v(envelope, new d30() { // from class: l.gw9
            public final void call() {
                C1579b.m1589v1(envelope);
            }
        });
        if (!((FeedData) envelope.getModuleData(FeedData.class)).activities.isEmpty()) {
            User user = (User) qib0.k0.d.query(((FeedData) envelope.getModuleData(FeedData.class)).activities.get(0).actors);
            if (NullChecker.b(user)) {
                qib0.G.z0(user.m1042fp().profileSmall());
            }
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ LiveUserMask m1530T0(LiveUserMask liveUserMask) {
        return liveUserMask;
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ Live m1532U0(Live live) {
        return live;
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ c m1534V0(final boolean z, MomentActivity momentActivity) {
        if ((z && NullChecker.a(momentActivity) && !momentActivity.read) || (!z && NullChecker.a(momentActivity))) {
            final String strM12689d = omg.m12689d(((DbObject) momentActivity).id);
            return new la20(new v9j() { // from class: l.qv9
                public final Object call() {
                    return C1579b.m1514M1(z, strM12689d);
                }
            }).map(new w9j() { // from class: l.rv9
                public final Object call(Object obj) {
                    return C1579b.m1598y1(z, (Envelope) obj);
                }
            }).compose(omg.m12710n0());
        }
        if (!z) {
            return c.just(roj0.a);
        }
        final String strM12687c = omg.m12687c();
        return new la20(new v9j() { // from class: l.sv9
            public final Object call() {
                return omg.f11509G.auth().l(utc0.create(Network.JSON, "{\"read\": true}")).q(strM12687c + "&method=patch").b();
            }
        }).compose(omg.m12710n0()).map(new w9j() { // from class: l.tv9
            public final Object call(Object obj) {
                return C1579b.m1477A0((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ c m1535V1(Moment moment, final Moment moment2, final List list) {
        bt00.m9032d(new j760(2, moment));
        return ijb0.m10901L(list, "moment", "moment", UploadSource.get("moment")).map(new w9j() { // from class: l.iw9
            public final Object call(Object obj) {
                return C1579b.m1599y2(list, moment2, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m1541Y1(boolean z) {
        DbLinks dbLinks = (DbLinks) qib0.k0.c.query(SchemeKey.moment_activities);
        if (dbLinks != null) {
            dbLinks.extra = 0;
            if (!z) {
                dbLinks.total = 0;
            }
            qib0.k0.c.upsert(dbLinks);
        }
        if (z) {
            FeedModule.f321i.f6465d.m8764I();
        } else {
            FeedModule.f321i.f6465d.deleteAll();
            FeedModule.f321i.f6464c.delete(Filter.AND(new Filter[]{Moment.SETTINGS_MUTED.T(), Moment.SETTINGS_VISIBILITY.m1094EQ("everyone")}));
        }
        e51.G(new Runnable() { // from class: l.ct9
            @Override // java.lang.Runnable
            public final void run() {
                ijb0.m10916c();
            }
        });
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ roj0 m1543Z1(Envelope envelope) {
        f8c.m10082o().m10103w(envelope, null, false, true);
        return roj0.a;
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ c m1545a2(w9j w9jVar, Moment moment) {
        return (c) w9jVar.call(moment);
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ roj0 m1547b2(final Envelope envelope) {
        f8c.m10082o().m10102v(envelope, new d30() { // from class: l.lx9
            public final void call() {
                C1579b.m1548c1(envelope);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m1548c1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        ((DbObject) dbLinks).id = SchemeKey.moment_activities;
        dbLinks.links = envelope.pagination.links;
        qib0.k0.c.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m1549c2(Moment moment) {
        moment.localCreatedSession = ((Integer) App.i.get()).intValue();
        DbLinks dbLinks = new DbLinks();
        ((DbObject) dbLinks).id = ((DbObject) moment).id;
        dbLinks.links = Links.new_();
        FeedModule.f321i.f6467f.upsert(dbLinks);
        FeedModule.f321i.f6464c.insert(moment);
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ List m1553e2(int i, List list) {
        return list.size() > i ? list.subList(0, i) : list;
    }

    /* JADX INFO: renamed from: f2 */
    public static /* synthetic */ List m1555f2(Moment moment) {
        if (NullChecker.a(moment)) {
            return moment.media;
        }
        return null;
    }

    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ void m1557g2(Envelope envelope, String str) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.links = envelope.pagination.links;
        ((DbObject) dbLinks).id = str;
        FeedModule.f321i.f6464c.m14544P(str, vwb.Q(((FeedData) envelope.getModuleData(FeedData.class)).moments, new w9j() { // from class: l.kx9
            public final Object call(Object obj) {
                return ((DbObject) ((Moment) obj)).id;
            }
        }), false);
        FeedModule.f321i.f6466e.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ c m1558h1() {
        DbLinks dbLinks = (DbLinks) qib0.k0.c.queryCache(SchemeKey.moment_activities);
        final String str = dbLinks == null ? null : dbLinks.links.next;
        return NullChecker.a(str) ? new la20(new v9j() { // from class: l.pw9
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12683a(str)).f().b();
            }
        }, omg.f11506D).map(new w9j() { // from class: l.qw9
            public final Object call(Object obj) {
                return C1579b.m1547b2((Envelope) obj);
            }
        }).compose(omg.m12710n0()) : c.just(roj0.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.util.TrackMediaUploadUtil$GetVideoFrameException */
    /* JADX INFO: renamed from: j2 */
    public static /* synthetic */ Moment m1563j2(final Moment moment) throws TrackMediaUploadUtil.GetVideoFrameException {
        Picture picture;
        if (((DbObject) moment)._id != 0) {
            final Moment momentM19592clone = moment.m19592clone();
            momentM19592clone.localCreatedSession = ((Integer) App.i.get()).intValue();
            f8c.m10082o().m10085B(new d30() { // from class: l.xv9
                public final void call() {
                    FeedModule.f321i.f6464c.updateBy_id(momentM19592clone);
                }
            });
            return momentM19592clone;
        }
        List<Moment> listM10928o = ijb0.m10928o();
        moment.localInFeed = true;
        moment.localInUserFeed = true;
        moment.createdTime = !listM10928o.isEmpty() ? omg.m12719s0(listM10928o.get(0).createdTime) : omg.m12717r0();
        moment.owner = FeedModule.m1139F().userId();
        if (moment.value == null) {
            moment.value = "";
        }
        moment.likes = PartialIdList.new_();
        ((DbObject) moment).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) App.i.get()).intValue());
        if (NullChecker.a(moment.media)) {
            for (Media media : moment.media) {
                TrackMediaUploadUtil.a0(media);
                if (TEnum.equals(media.status, MediaLocalStatus.raw)) {
                    if (media instanceof Picture) {
                        Picture picture2 = (Picture) media;
                        if (picture2.size == null || media.mediaType == null) {
                            pgm pgmVar = new pgm(rhi.z(media.url));
                            picture2.size = new Dimension(pgmVar.d);
                            media.mediaType = pgmVar.c;
                        }
                    } else if (media instanceof Video) {
                        Video video = (Video) media;
                        if (video.size == null || (picture = video.cover) == null || picture.size == null || video.mediaType == null || picture.mediaType == null) {
                            s5l0 s5l0Var = new s5l0(new r5l0(rhi.z(video.url)), false, false);
                            video.mediaType = "video/mp4";
                            video.size = new Dimension(s5l0Var.m());
                            video.duration = s5l0Var.b;
                            Picture picture3 = video.cover;
                            if (picture3 == null || picture3.url == null) {
                                video.processStartTime = SystemClock.uptimeMillis();
                                Picture picture4 = new Picture();
                                video.cover = picture4;
                                try {
                                    picture4.url = rhi.B(s5l0Var.c(0));
                                    video.cover.size = new Dimension(s5l0Var.k());
                                    video.cover.mediaType = "image/jpeg";
                                    qib0.G.x0(video.url);
                                } catch (Exception e) {
                                    CrashHelper.c(e);
                                    throw new TrackMediaUploadUtil.GetVideoFrameException(e.getMessage(), e.getCause());
                                }
                            }
                            if (video.url.contains(k9j.I().getAbsolutePath())) {
                                try {
                                    String[] strArrN = k9j.N(video.url, video.cover().url, k9j.d, ((DbObject) moment).id, false);
                                    video.url = strArrN[0];
                                    video.cover().url = strArrN[1];
                                } catch (IOException e2) {
                                    CrashHelper.c(e2);
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
        bt00.m9032d(new j760(1, moment));
        f8c.m10082o().m10085B(new d30() { // from class: l.wv9
            public final void call() {
                C1579b.m1549c2(moment);
            }
        });
        return moment;
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ void m1569m2(Map map, HashMap map2, OnVoiceCall onVoiceCall) {
        if (NullChecker.a(map.get(onVoiceCall.user.f705id))) {
            String str = onVoiceCall.user.f705id;
            map2.put(str, (LiveUserMask) map.get(str));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m1577q2(Moment moment, List list) {
        final Moment momentM19592clone = moment.m19592clone();
        if (NullChecker.b(list.get(0)) && (list.get(0) instanceof Video) && TEnum.equals(((Media) list.get(0)).status, MediaLocalStatus.preprocessed)) {
            try {
                String[] strArrN = k9j.N(((Media) list.get(0)).url, ((Media) list.get(0)).cover().url, k9j.d, ((DbObject) moment).id, true);
                ((Media) list.get(0)).url = strArrN[0];
                ((Media) list.get(0)).cover().url = strArrN[1];
            } catch (IOException e) {
                CrashHelper.c(e);
            }
        }
        momentM19592clone.media = new ArrayList(list);
        f8c.m10082o().m10085B(new d30() { // from class: l.vv9
            public final void call() {
                FeedModule.f321i.f6464c.updateBy_id(momentM19592clone);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m1582t0(Moment moment, Moment moment2, Envelope envelope) {
        FeedModule.f321i.f6464c.updateBy_id(moment);
        DbLinks dbLinks = new DbLinks();
        ((DbObject) dbLinks).id = ((DbObject) moment).id;
        dbLinks.links = Links.new_();
        FeedModule.f321i.f6467f.upsert(dbLinks);
        FeedModule.f321i.f6467f.delete(((DbObject) moment2).id);
        FeedModule.m1140H().Cb(envelope);
    }

    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ roj0 m1583t1(final String str, final Envelope envelope) {
        f8c.m10082o().m10103w(envelope, new d30() { // from class: l.jw9
            public final void call() {
                C1579b.m1557g2(envelope, str);
            }
        }, false, true);
        return roj0.a;
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m1585u0(final String str, Throwable th) {
        if (th instanceof ApiExcep.Client.NotFound) {
            f8c.m10082o().m10085B(new d30() { // from class: l.et9
                public final void call() {
                    C1579b.m1597y0(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ Moment m1588v0(Moment moment, Moment moment2, List list) {
        bt00.m9032d(new j760(3, moment));
        final Moment momentM19592clone = moment2.m19592clone();
        momentM19592clone.media = new ArrayList(list);
        f8c.m10082o().m10085B(new d30() { // from class: l.nw9
            public final void call() {
                FeedModule.f321i.f6464c.updateBy_id(momentM19592clone);
            }
        });
        return momentM19592clone;
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m1589v1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        ((DbObject) dbLinks).id = SchemeKey.moment_activities;
        dbLinks.links = envelope.pagination.links;
        qib0.k0.c.upsert(dbLinks);
        FeedModule.f321i.f6465d.m8763H(vwb.Q(((FeedData) envelope.getModuleData(FeedData.class)).activities, new w9j() { // from class: l.vw9
            public final Object call(Object obj) {
                return ((DbObject) ((MomentActivity) obj)).id;
            }
        }));
    }

    /* JADX INFO: renamed from: w1 */
    public static /* synthetic */ stc0 m1592w1(String str, String str2, boolean z) {
        stc0.a aVarQ = omg.f11509G.auth().q(omg.m12660D(str, str2));
        return (z ? aVarQ.m(utc0.create(Network.JSON, "")) : aVarQ.d()).b();
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m1594x0(Moment moment) {
        long j = ((DbObject) moment)._id;
        if (j != 0) {
            Moment momentQuery = FeedModule.f321i.f6464c.query(j);
            momentQuery.localCreatedSession--;
            FeedModule.f321i.f6464c.updateBy_id(momentQuery);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m1597y0(String str) {
        FeedModule.f321i.f6464c.delete(str);
        FeedModule.m1140H().n6(str);
    }

    /* JADX INFO: renamed from: y1 */
    public static /* synthetic */ roj0 m1598y1(final boolean z, Envelope envelope) {
        f8c.m10082o().m10102v(envelope, new d30() { // from class: l.jx9
            public final void call() {
                C1579b.m1541Y1(z);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ List m1599y2(List list, Moment moment, List list2) {
        for (int i = 0; i < list.size(); i++) {
            if (((Media) list.get(i)) instanceof Video) {
                k9j.G(k9j.d, ((DbObject) moment).id);
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ Notification m1600z0(final String str, Notification notification) {
        if (!notification.k() && (!notification.j() || !(notification.e() instanceof ApiExcep.Client.NotFound))) {
            return notification;
        }
        final DbLinks dbLinks = (DbLinks) qib0.k0.c.query(SchemeKey.moment_activities);
        final int iM10909T = ijb0.m10909T(str);
        dbLinks.extra = Math.max(0, dbLinks.extra - iM10909T);
        f8c.m10082o().m10085B(new d30() { // from class: l.bt9
            public final void call() {
                C1579b.m1489E0(str, iM10909T, dbLinks);
            }
        });
        return Notification.c(roj0.a);
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ c m1603A3(final DbLinks dbLinks) {
        return new la20(new v9j() { // from class: l.nx9
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12707m(dbLinks.links.next)).f().b();
            }
        }, omg.f11506D | omg.f11507E).map(new w9j() { // from class: l.ox9
            public final Object call(Object obj) {
                return this.f11639a.m1686z3((Envelope) obj);
            }
        }).compose(omg.m12710n0());
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m1604B3(String str, Envelope envelope) {
        DbLinks dbLinksM1671p4 = m1671p4(str);
        if (dbLinksM1671p4 == null) {
            dbLinksM1671p4 = DbLinks.new_();
            ((DbObject) dbLinksM1671p4).id = str;
            dbLinksM1671p4.links.previous = envelope.pagination.links.previous;
        }
        dbLinksM1671p4.links.next = envelope.pagination.links.next;
        FeedModule.f321i.f6466e.upsert(dbLinksM1671p4);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ roj0 m1605C3(final String str, final Envelope envelope) {
        if (((FeedData) envelope.getModuleData(FeedData.class)).moments.size() == 0) {
            envelope.pagination.links.next = null;
        }
        f8c.m10082o().m10103w(envelope, new d30() { // from class: l.hw9
            public final void call() {
                this.f8830a.m1604B3(str, envelope);
            }
        }, false, true);
        return roj0.a;
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ c m1606D3(final String str, final String str2) {
        return new la20(new v9j() { // from class: l.pu9
            public final Object call() {
                return omg.f11509G.auth().q(str).f().b();
            }
        }, omg.f11506D).map(new w9j() { // from class: l.qu9
            public final Object call(Object obj) {
                return this.f12391a.m1605C3(str2, (Envelope) obj);
            }
        }).compose(omg.m12710n0());
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m1607E3(Envelope envelope) {
        DbLinks dbLinksM1669o4 = m1669o4();
        dbLinksM1669o4.links.next = envelope.pagination.links.next;
        qib0.k0.c.upsert(dbLinksM1669o4);
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ roj0 m1608F3(final Envelope envelope) {
        if (((FeedData) envelope.getModuleData(FeedData.class)).moments.size() == 0) {
            envelope.pagination.links.next = null;
        }
        f8c.m10082o().m10103w(envelope, new d30() { // from class: l.ht9
            public final void call() {
                this.f8815a.m1607E3(envelope);
            }
        }, false, true);
        return roj0.a;
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ c m1609G3(final DbLinks dbLinks, final String str, final long j) {
        return new la20(new v9j() { // from class: l.fx9
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12707m(dbLinks.links.next)).f().b();
            }
        }, omg.f11506D | omg.f11507E).map(new w9j() { // from class: l.gx9
            public final Object call(Object obj) {
                return this.f8534a.m1608F3((Envelope) obj);
            }
        }).compose(omg.m12710n0()).doOnNext(new e30() { // from class: l.ix9
            public final void call(Object obj) {
                TrackMediaUploadUtil.b0(str, SystemClock.elapsedRealtime() - j);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m1610H3(e30 e30Var, final Moment moment, final Throwable th) {
        MomentPostFailedExcepion.reportMomentPostFailed(th, false);
        zvf0.B("e_post_moment_error", "post_error_moments", new j760[]{vwb.Y("error", th == null ? "unknow" : th.toString())});
        bt00.m9032d(new j760(5, (Object) null));
        if (NullChecker.a(e30Var)) {
            e30Var.call("");
        }
        this.f665H.onNext(th);
        e51.M(new Runnable() { // from class: l.kv9
            @Override // java.lang.Runnable
            public final void run() {
                yij0.D(th);
            }
        });
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 40041) {
            f8c.m10082o().m10085B(new d30() { // from class: l.lv9
                public final void call() {
                    C1579b.m1479A2(moment);
                }
            });
        } else {
            f8c.m10082o().m10085B(new d30() { // from class: l.mv9
                public final void call() {
                    C1579b.m1594x0(moment);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ c m1611I3(final e30 e30Var, final e30 e30Var2, final Moment moment) {
        return scheduled("postTheMoment", -1, new v9j() { // from class: l.fu9
            public final Object call() {
                Moment moment2 = moment;
                return new la20(new v9j() { // from class: l.yv9
                    public final Object call() {
                        return omg.f11509G.auth().q(omg.m12725y()).l(utc0.create(Network.JSON, moment2.toJson())).b();
                    }
                }, omg.f11507E).map(new w9j() { // from class: l.zv9
                    public final Object call(Object obj) {
                        return C1579b.m1516N0(moment2, e30Var, (Envelope) obj);
                    }
                }).doOnError(e30Var2).compose(omg.m12710n0());
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m1612J3(boolean z, Envelope envelope) {
        if (z) {
            FeedModule.f321i.f6464c.m14542N(vwb.Q(((FeedData) envelope.getModuleData(FeedData.class)).moments, new w9j() { // from class: l.at9
                public final Object call(Object obj) {
                    return ((DbObject) ((Moment) obj)).id;
                }
            }), false);
        }
        DbLinks dbLinksM1669o4 = m1669o4();
        if (z || dbLinksM1669o4 == null) {
            dbLinksM1669o4 = new DbLinks();
            dbLinksM1669o4.links = envelope.pagination.links;
            ((DbObject) dbLinksM1669o4).id = Moments.TYPE;
        } else if (NullChecker.a(envelope.pagination.links.previous)) {
            dbLinksM1669o4.links.previous = envelope.pagination.links.previous;
        }
        qib0.k0.c.upsert(dbLinksM1669o4);
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ roj0 m1613K3(final boolean z, final Envelope envelope) {
        if (u2h.m14718c()) {
            m1681u4(envelope);
        }
        f8c.m10082o().m10103w(envelope, new d30() { // from class: l.mx9
            public final void call() {
                this.f10595a.m1612J3(z, envelope);
            }
        }, false, true);
        return roj0.a;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ c m1614L3(final boolean z, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() > 0) {
            sb.append("&");
        }
        sb.append("query=preload");
        final String strM12707m = omg.m12707m(sb.toString());
        return new la20(new v9j() { // from class: l.sw9
            public final Object call() {
                return omg.f11509G.auth().q(strM12707m).f().b();
            }
        }, omg.f11506D | omg.f11507E).map(new w9j() { // from class: l.tw9
            public final Object call(Object obj) {
                return this.f13455a.m1613K3(z, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ c m1615M3(final boolean z) {
        return c.fromCallable(new Callable() { // from class: l.hv9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f8825a.m1616N3(z);
            }
        }).flatMap(new w9j() { // from class: l.iv9
            public final Object call(Object obj) {
                return this.f9140a.m1614L3(z, (String) obj);
            }
        }).compose(omg.m12710n0());
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ String m1616N3(boolean z) throws Exception {
        String str;
        DbLinks dbLinksM1669o4 = m1669o4();
        return (z || dbLinksM1669o4 == null || (str = dbLinksM1669o4.links.previous) == null) ? "limit=20" : str;
    }

    /* JADX INFO: renamed from: O2 */
    public c<q860<MomentActivity>> m1617O2() {
        return mkd0.r(ijb0.m10894E(), qib0.k0.c.uiGet(SchemeKey.moment_activities), new x9j() { // from class: l.ov9
            public final Object call(Object obj, Object obj2) {
                return this.f11624a.m1658j3((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ c m1618O3(Envelope envelope, Envelope envelope2) {
        envelope.addAll(envelope2);
        envelope.pagination.links.next = envelope2.pagination.links.next;
        return m1675r4(envelope);
    }

    /* JADX INFO: renamed from: P2 */
    public c<roj0> m1619P2(q860<MomentActivity> q860Var) {
        return m1626T2(false, q860Var);
    }

    /* JADX INFO: renamed from: P3 */
    public c<List<Moment>> m1620P3(final String str) {
        return scheduled(str + "/moments/latest", 0, new v9j() { // from class: l.zs9
            public final Object call() {
                return new la20(new v9j() { // from class: l.yu9
                    public final Object call() {
                        return omg.f11509G.auth().q(omg.m12724x(str, omg.f11535z)).f().b();
                    }
                }, omg.f11506D).map(new w9j() { // from class: l.zu9
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).moments;
                    }
                }).compose(omg.m12710n0());
            }
        });
    }

    /* JADX INFO: renamed from: Q2 */
    public c<roj0> m1621Q2() {
        return scheduled("activity/poll", 0, new v9j() { // from class: l.cv9
            public final Object call() {
                return C1579b.m1558h1();
            }
        });
    }

    /* JADX INFO: renamed from: R2 */
    public c<roj0> m1622R2(q860<MomentActivity> q860Var) {
        return m1626T2(true, q860Var);
    }

    /* JADX INFO: renamed from: R3 */
    public c<Envelope> m1623R3(final String str, final String str2, final boolean z) {
        return scheduled("/moments/" + str2 + "/likes/me", -1, new v9j() { // from class: l.bu9
            public final Object call() {
                return this.f6434a.m1676s3(str, str2, z);
            }
        });
    }

    /* JADX INFO: renamed from: S2 */
    public c<roj0> m1624S2() {
        return scheduled("activity/poll", 0, new v9j() { // from class: l.du9
            public final Object call() {
                return new la20(new v9j() { // from class: l.fv9
                    public final Object call() {
                        return omg.f11509G.auth().q(omg.m12683a("limit=20")).f().b();
                    }
                }, omg.f11506D).map(new w9j() { // from class: l.gv9
                    public final Object call(Object obj) {
                        return C1579b.m1529S1((Envelope) obj);
                    }
                }).compose(omg.m12710n0());
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public c<Boolean> m1625S3(final String str, final String str2) {
        return scheduled("moments/" + str2 + "/likes/next", 0, new v9j() { // from class: l.fw9
            public final Object call() {
                return this.f8263a.m1680u3(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public c<roj0> m1626T2(final boolean z, q860<MomentActivity> q860Var) {
        final MomentActivity momentActivity = (MomentActivity) vwb.F(q860Var.a);
        ijb0.m10917d();
        return scheduled("activity_patch", -1, new v9j() { // from class: l.ru9
            public final Object call() {
                return C1579b.m1534V0(z, momentActivity);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public String m1627T3(String str, String str2) {
        String str3;
        Moment momentM1635X3 = m1635X3(str2);
        return (momentM1635X3 == null || (str3 = momentM1635X3.likes.links.next) == null) ? "" : str3;
    }

    /* JADX INFO: renamed from: U2 */
    public Moment m1628U2(Live live) {
        Moment momentNew_ = Moment.new_();
        ((DbObject) momentNew_).id = live.f228id;
        momentNew_.isLive = true;
        momentNew_.live = live;
        momentNew_.owner = live.anchor.f264id;
        return momentNew_;
    }

    /* JADX INFO: renamed from: U3 */
    public DbLinks m1629U3() {
        return (DbLinks) qib0.k0.c.queryCache(Moments.TYPE);
    }

    /* JADX INFO: renamed from: V2 */
    public Moment m1630V2(VoiceLive voiceLive) {
        Moment momentNew_ = Moment.new_();
        ((DbObject) momentNew_).id = voiceLive.f711id;
        momentNew_.isVoiceLive = true;
        momentNew_.voiceLive = voiceLive;
        momentNew_.owner = voiceLive.anchor.f264id;
        return momentNew_;
    }

    /* JADX INFO: renamed from: V3 */
    public DbLinks m1631V3(String str) {
        return (DbLinks) FeedModule.f321i.f6466e.queryCache(str);
    }

    /* JADX INFO: renamed from: W2 */
    public c<q860<Moment>> m1632W2(String str, final int i) {
        c<List<Moment>> cVarM10915b = ijb0.m10915b(str, i);
        if (i > 0) {
            cVarM10915b = cVarM10915b.map(new w9j() { // from class: l.uu9
                public final Object call(Object obj) {
                    return C1579b.m1553e2(i, (List) obj);
                }
            });
        }
        return mkd0.r(cVarM10915b, FeedModule.f321i.f6466e.uiGet(str), new x9j() { // from class: l.vu9
            public final Object call(Object obj, Object obj2) {
                return this.f14304a.m1660k3((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public c<Moment> m1633W3(String str) {
        return FeedModule.f321i.f6464c.uiGet(str).filter(new w9j() { // from class: l.nv9
            public final Object call(Object obj) {
                return Boolean.valueOf(((Moment) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public c<roj0> m1634X2(String str, final String str2, final MomentMessage momentMessage) {
        return ijb0.m10922i(str, str2, ((CopyObject) momentMessage).id, new d30() { // from class: l.xt9
            public final void call() {
                this.f15148a.m1662l3(momentMessage, str2);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public Moment m1635X3(String str) {
        return FeedModule.f321i.f6464c.queryCache(str);
    }

    /* JADX INFO: renamed from: Y2 */
    public DbLinks m1636Y2(String str) {
        return (DbLinks) FeedModule.f321i.f6467f.queryCache(str);
    }

    /* JADX INFO: renamed from: Y3 */
    public c<q860<Moment>> m1637Y3() {
        return u2h.m14718c() ? mkd0.s(ijb0.m10896G(), qib0.k0.c.uiGet(Moments.TYPE), this.f668K.observeOn(jo0.a()), new y9j() { // from class: l.av9
            /* JADX INFO: renamed from: a */
            public final Object m8616a(Object obj, Object obj2, Object obj3) {
                return this.f5861a.m1682v3((List) obj, (DbLinks) obj2, (SparseArray) obj3);
            }
        }) : mkd0.r(ijb0.m10896G(), qib0.k0.c.uiGet(Moments.TYPE), new x9j() { // from class: l.bv9
            public final Object call(Object obj, Object obj2) {
                return this.f6442a.m1683w3((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Z2 */
    public c<roj0> m1638Z2(final String str, final String str2) {
        return scheduled("moments/" + str2 + "/comments/next", 0, new v9j() { // from class: l.mw9
            public final Object call() {
                return this.f10586a.m1668o3(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public c<q860<Moment>> m1639Z3(final String str) {
        return mkd0.r(ijb0.m10897H(str), FeedModule.f321i.f6466e.uiGet(str), new x9j() { // from class: l.dv9
            public final Object call(Object obj, Object obj2) {
                return this.f7071a.m1684x3(str, (List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: a3 */
    public String m1640a3(String str, String str2) {
        DbLinks dbLinksM1636Y2 = m1636Y2(str2);
        return dbLinksM1636Y2 == null ? "" : dbLinksM1636Y2.links.next;
    }

    /* JADX INFO: renamed from: a4 */
    public c<roj0> m1641a4() {
        final DbLinks dbLinksM1629U3 = m1629U3();
        return (NullChecker.b(dbLinksM1629U3) && NullChecker.a(dbLinksM1629U3.links.next)) ? scheduled("moments/next", 0, new v9j() { // from class: l.cw9
            public final Object call() {
                return this.f6739a.m1603A3(dbLinksM1629U3);
            }
        }) : just();
    }

    /* JADX INFO: renamed from: b3 */
    public c<MomentMessage> m1642b3(String str, MomentMessage momentMessage) {
        momentMessage.messageType = MomentMessageType.get(MomentMessageType.moment_comment);
        return ijb0.m10893D(str, momentMessage, true);
    }

    /* JADX INFO: renamed from: b4 */
    public c<roj0> m1643b4(final String str) {
        DbLinks dbLinksM1631V3 = m1631V3(str);
        if (dbLinksM1631V3 == null) {
            dbLinksM1631V3 = new DbLinks();
            ((DbObject) dbLinksM1631V3).id = str;
            Links links = new Links();
            dbLinksM1631V3.links = links;
            links.next = omg.f11535z;
        }
        if (!NullChecker.a(dbLinksM1631V3.links.next)) {
            return just();
        }
        final String strM12724x = omg.m12724x(str, dbLinksM1631V3.links.next);
        return scheduled(str + "/moments/next", 0, new v9j() { // from class: l.au9
            public final Object call() {
                return this.f5844a.m1606D3(strM12724x, str);
            }
        });
    }

    /* JADX INFO: renamed from: c3 */
    public c<q860<MomentMessage>> m1644c3(String str) {
        return mkd0.r(ijb0.m10921h(str), FeedModule.f321i.f6467f.uiGet(str, false), new x9j() { // from class: l.gu9
            public final Object call(Object obj, Object obj2) {
                return this.f8515a.m1670p3((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public c<roj0> m1645c4(final String str) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final DbLinks dbLinksM1629U3 = m1629U3();
        return (NullChecker.b(dbLinksM1629U3) && NullChecker.a(dbLinksM1629U3.links.next)) ? scheduled("moments/next", 0, new v9j() { // from class: l.kw9
            public final Object call() {
                return this.f9810a.m1609G3(dbLinksM1629U3, str, jElapsedRealtime);
            }
        }) : just();
    }

    /* JADX INFO: renamed from: d3 */
    public List<MomentMessage> m1646d3(Moment moment) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.b(moment.messages) && NullChecker.b(moment.messages.ids)) {
            Iterator<String> it = moment.messages.ids.iterator();
            while (it.hasNext()) {
                MomentMessage momentMessageI8 = FeedModule.m1140H().i8(it.next(), MomentMessage.JSON_ADAPTER);
                if (NullChecker.a(momentMessageI8) && !momentMessageI8.recalled.booleanValue()) {
                    arrayList.add(momentMessageI8);
                }
            }
            vwb.I(arrayList, new Comparator() { // from class: l.bw9
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C1579b.m1526R0((MomentMessage) obj, (MomentMessage) obj2);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d4 */
    public final Map<String, Room> m1647d4(List<Room> list) {
        return NullChecker.a(list) ? vwb.d(list, new w9j() { // from class: l.pt9
            public final Object call(Object obj) {
                return ((Room) obj).f271id;
            }
        }, new w9j() { // from class: l.qt9
            public final Object call(Object obj) {
                return C1579b.m1506J2((Room) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: e3 */
    public void m1648e3(Act act, User user, Moment moment, String str, String str2, boolean z) {
        if (user != null) {
            FeedModule.m1140H().Ij(act, ((DbObject) user).id, NullChecker.a(moment) ? ((DbObject) moment).id : null, moment, str, str2, false, z);
            return;
        }
        StringBuilder sb = new StringBuilder("Moment id: ");
        sb.append(NullChecker.a(moment) ? ((DbObject) moment).id : null);
        sb.append("from:");
        sb.append(str);
        sb.append("\nActStackInfo:");
        sb.append(FeedException.getActStackInfo());
        sb.append("\n Trace: ");
        sb.append(FeedException.getTrace(new Exception()));
        CrashHelper.d(new MomentUserNullException(sb.toString()), 100);
    }

    /* JADX INFO: renamed from: e4 */
    public final Map<String, Live> m1649e4(List<Live> list) {
        return NullChecker.a(list) ? vwb.d(list, new w9j() { // from class: l.rt9
            public final Object call(Object obj) {
                return ((Live) obj).f228id;
            }
        }, new w9j() { // from class: l.st9
            public final Object call(Object obj) {
                return C1579b.m1532U0((Live) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: f3 */
    public void m1650f3(Act act, User user, Moment moment, String str, boolean z) {
        m1648e3(act, user, moment, str, vqg.m15469C(str), z);
    }

    /* JADX INFO: renamed from: f4 */
    public final Map<String, LiveUserMask> m1651f4(List<LiveUserMask> list) {
        return NullChecker.a(list) ? vwb.d(list, new w9j() { // from class: l.yt9
            public final Object call(Object obj) {
                return ((LiveUserMask) obj).userId;
            }
        }, new w9j() { // from class: l.zt9
            public final Object call(Object obj) {
                return C1579b.m1530T0((LiveUserMask) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: g3 */
    public c<roj0> m1652g3(final String str) {
        return scheduled("delete", -1, new v9j() { // from class: l.uv9
            public final Object call() {
                String str2 = str;
                return new la20(new v9j() { // from class: l.ax9
                    public final Object call() {
                        return omg.f11509G.auth().q(omg.m12722v(str2)).d().b();
                    }
                }).materialize().map(new w9j() { // from class: l.bx9
                    public final Object call(Object obj) {
                        return C1579b.m1600z0(str2, (Notification) obj);
                    }
                }).dematerialize().take(1).compose(omg.m12710n0());
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final Map<String, VoiceLiveGame> m1653g4(List<VoiceLiveGame> list) {
        return NullChecker.a(list) ? vwb.d(list, new w9j() { // from class: l.ut9
            public final Object call(Object obj) {
                return ((VoiceLiveGame) obj).f297id;
            }
        }, new w9j() { // from class: l.wt9
            public final Object call(Object obj) {
                return C1579b.m1484C1((VoiceLiveGame) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: h3 */
    public c<roj0> m1654h3(final long j) {
        return now(c.fromCallable(new Callable() { // from class: l.vt9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1579b.m1505J1(j);
            }
        }).compose(omg.m12710n0()));
    }

    /* JADX INFO: renamed from: h4 */
    public final Map<String, VoiceRoomInfo> m1655h4(List<VoiceRoomInfo> list) {
        return NullChecker.a(list) ? vwb.d(list, new w9j() { // from class: l.it9
            public final Object call(Object obj) {
                return ((VoiceRoomInfo) obj).f299id;
            }
        }, new w9j() { // from class: l.jt9
            public final Object call(Object obj) {
                return C1579b.m1498H0((VoiceRoomInfo) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m1656i3(String str) {
        return ijb0.m10933t(str);
    }

    /* JADX INFO: renamed from: i4 */
    public final Map<String, VoiceLive> m1657i4(List<VoiceLive> list) {
        return NullChecker.a(list) ? vwb.d(list, new w9j() { // from class: l.lt9
            public final Object call(Object obj) {
                return ((VoiceLive) obj).f711id;
            }
        }, new w9j() { // from class: l.mt9
            public final Object call(Object obj) {
                return C1579b.m1523Q0((VoiceLive) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ q860 m1658j3(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m1624S2();
        }
        return m12727q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: j4 */
    public c<roj0> m1659j4(Moment moment) {
        return m1661k4(moment, null);
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ q860 m1660k3(List list, DbLinks dbLinks) {
        return m12727q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: k4 */
    public c<roj0> m1661k4(final Moment moment, final e30<String> e30Var) {
        final String strUserId = FeedModule.m1139F().userId();
        bt00.m9032d(new j760(0, moment));
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.visibility = MomentVisibilityStatus.get("matches");
        momentSettings.muted = false;
        moment.settings = momentSettings;
        moment.messages = PartialIdList.new_();
        v9j v9jVar = new v9j() { // from class: l.iu9
            public final Object call() {
                return c.fromCallable(new Callable() { // from class: l.jv9
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C1579b.m1563j2(moment);
                    }
                });
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.tu9
            public final Object call(Object obj) {
                return C1579b.m1502I1(strUserId, moment, (Moment) obj);
            }
        };
        final e30 e30Var2 = new e30() { // from class: l.ev9
            public final void call(Object obj) {
                this.f7483a.m1610H3(e30Var, moment, (Throwable) obj);
            }
        };
        final w9j w9jVar2 = new w9j() { // from class: l.pv9
            public final Object call(Object obj) {
                return this.f11991a.m1611I3(e30Var, e30Var2, (Moment) obj);
            }
        };
        return now(((c) v9jVar.call()).filter(new w9j() { // from class: l.aw9
            public final Object call(Object obj) {
                return Boolean.valueOf(C1579b.m1525Q3(strUserId));
            }
        }).flatMap(new w9j() { // from class: l.lw9
            public final Object call(Object obj) {
                return C1579b.m1483C0(w9jVar, (Moment) obj);
            }
        }).filter(new w9j() { // from class: l.ww9
            public final Object call(Object obj) {
                return Boolean.valueOf(C1579b.m1525Q3(strUserId));
            }
        }).compose(TrackMediaUploadUtil.f0("moment", moment.media, new w9j() { // from class: l.hx9
            public final Object call(Object obj) {
                return C1579b.m1555f2((Moment) obj);
            }
        })).doOnError(e30Var2).compose(mkd0.Q()).filter(new w9j() { // from class: l.sx9
            public final Object call(Object obj) {
                return Boolean.valueOf(C1579b.m1525Q3(strUserId));
            }
        }).flatMap(new w9j() { // from class: l.kt9
            public final Object call(Object obj) {
                return C1579b.m1545a2(w9jVar2, (Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ void m1662l3(MomentMessage momentMessage, String str) {
        DbLinks dbLinksM1667n4 = m1667n4(momentMessage.moment);
        if (NullChecker.b(dbLinksM1667n4)) {
            dbLinksM1667n4.total--;
            kjb0.m11448L(dbLinksM1667n4);
        }
        Moment momentQuery = FeedModule.f321i.f6464c.query(str);
        if (NullChecker.a(momentQuery)) {
            momentQuery.messages.ids.remove(((CopyObject) momentMessage).id);
            FeedModule.f321i.f6464c.updateBy_id(momentQuery);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public c<roj0> m1663l4(final String str) {
        return scheduled(str + "/moments/previous", 0, new v9j() { // from class: l.eu9
            public final Object call() {
                String str2 = str;
                return new la20(new v9j() { // from class: l.wu9
                    public final Object call() {
                        return omg.f11509G.auth().q(omg.m12724x(str2, omg.f11535z)).f().b();
                    }
                }, omg.f11506D).map(new w9j() { // from class: l.xu9
                    public final Object call(Object obj) {
                        return C1579b.m1583t1(str2, (Envelope) obj);
                    }
                }).compose(omg.m12710n0());
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m1664m3(String str, Envelope envelope) {
        DbLinks dbLinksM1667n4 = m1667n4(str);
        Links links = dbLinksM1667n4.links;
        Pagination pagination = envelope.pagination;
        links.next = pagination.links.next;
        dbLinksM1667n4.total = pagination.total;
        FeedModule.f321i.f6467f.upsert(dbLinksM1667n4);
    }

    /* JADX INFO: renamed from: m4 */
    public c<roj0> m1665m4(boolean z) {
        final boolean z2 = z || this.f669L;
        this.f669L = false;
        return scheduled("moments/previous", 0, new v9j() { // from class: l.cu9
            public final Object call() {
                return this.f6729a.m1615M3(z2);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ roj0 m1666n3(final String str, final Envelope envelope) {
        f8c.m10082o().m10102v(envelope, new d30() { // from class: l.ft9
            public final void call() {
                this.f8246a.m1664m3(str, envelope);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: n4 */
    public DbLinks m1667n4(String str) {
        return (DbLinks) FeedModule.f321i.f6467f.query(str);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ c m1668o3(final String str, final String str2) {
        final String strM1640a3 = m1640a3(str, str2);
        return NullChecker.a(strM1640a3) ? new la20(new v9j() { // from class: l.yw9
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12658B(str, str2, strM1640a3)).f().b();
            }
        }, omg.f11506D).map(new w9j() { // from class: l.zw9
            public final Object call(Object obj) {
                return this.f15868a.m1666n3(str2, (Envelope) obj);
            }
        }).compose(omg.m12710n0()) : c.just(roj0.a);
    }

    /* JADX INFO: renamed from: o4 */
    public DbLinks m1669o4() {
        return (DbLinks) qib0.k0.c.query(Moments.TYPE);
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ q860 m1670p3(List list, DbLinks dbLinks) {
        return m12727q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: p4 */
    public DbLinks m1671p4(String str) {
        return (DbLinks) FeedModule.f321i.f6466e.query(str);
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m1672q3(String str, boolean z, Envelope envelope) {
        Moment momentM1673q4 = m1673q4(str);
        if (NullChecker.b(momentM1673q4)) {
            boolean z2 = momentM1673q4.haveLiked;
            if (z2 && !z) {
                PartialIdList partialIdList = momentM1673q4.likes;
                partialIdList.count--;
                partialIdList.ids = vwb.c0(partialIdList.ids, FeedModule.m1139F().userId());
            } else if (!z2 && z) {
                PartialIdList partialIdList2 = momentM1673q4.likes;
                partialIdList2.count++;
                partialIdList2.ids = vwb.c(partialIdList2.ids, FeedModule.m1139F().userId());
            }
            momentM1673q4.haveLiked = z;
            if (NullChecker.a(envelope)) {
                FeedModule.m1140H().Cb(envelope);
            }
            FeedModule.f321i.f6464c.upsert(momentM1673q4);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public Moment m1673q4(String str) {
        return FeedModule.f321i.f6464c.query(str);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ Envelope m1674r3(final String str, final boolean z, final Envelope envelope) {
        f8c.m10082o().m10102v(envelope, new d30() { // from class: l.ow9
            public final void call() {
                this.f11626a.m1672q3(str, z, envelope);
            }
        });
        return envelope;
    }

    /* JADX INFO: renamed from: r4 */
    public final c<Envelope> m1675r4(final Envelope envelope) {
        return envelope.pagination.links.next == null ? c.just(envelope) : new la20(new v9j() { // from class: l.dw9
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12663G(envelope.pagination.links.next)).f().b();
            }
        }).flatMap(new w9j() { // from class: l.ew9
            public final Object call(Object obj) {
                return this.f7489a.m1618O3(envelope, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ c m1676s3(final String str, final String str2, final boolean z) {
        return new la20(new v9j() { // from class: l.mu9
            public final Object call() {
                return C1579b.m1592w1(str, str2, z);
            }
        }).map(new w9j() { // from class: l.nu9
            public final Object call(Object obj) {
                return this.f10884a.m1674r3(str2, z, (Envelope) obj);
            }
        }).compose(omg.m12710n0()).doOnNext(new e30() { // from class: l.ou9
            public final void call(Object obj) {
                C1579b.m1496G1(z, str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public c<roj0> m1677s4(final String str, final String str2) {
        return scheduled("moment/refresh/" + str2, 0, new v9j() { // from class: l.uw9
            public final Object call() {
                String str3 = str;
                String str4 = str2;
                return new la20(new v9j() { // from class: l.cx9
                    public final Object call() {
                        return omg.f11509G.auth().q(omg.m12723w(str3, str4)).b();
                    }
                }, omg.f11506D).map(new w9j() { // from class: l.dx9
                    public final Object call(Object obj) {
                        return C1579b.m1543Z1((Envelope) obj);
                    }
                }).doOnError(new e30() { // from class: l.ex9
                    public final void call(Object obj) {
                        C1579b.m1585u0(str4, (Throwable) obj);
                    }
                }).compose(omg.m12710n0());
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ Boolean m1678t3(String str, final Envelope envelope) {
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        final Moment momentM1673q4 = m1673q4(str);
        f8c.m10082o().m10102v(envelope, new d30() { // from class: l.dt9
            public final void call() {
                C1579b.m1500H2(envelope, momentM1673q4);
            }
        });
        return Boolean.valueOf(commonData.users.size() > 0);
    }

    /* JADX INFO: renamed from: t4 */
    public c<roj0> m1679t4(String str, String str2, Report report) {
        return ijb0.m10904O(str, str2, report);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ c m1680u3(final String str, final String str2) {
        final String strM1627T3 = m1627T3(str, str2);
        return new la20(new v9j() { // from class: l.px9
            public final Object call() {
                return omg.f11509G.auth().q(omg.m12659C(str, str2, strM1627T3)).f().b();
            }
        }).map(new w9j() { // from class: l.qx9
            public final Object call(Object obj) {
                return this.f12412a.m1678t3(str2, (Envelope) obj);
            }
        }).compose(omg.m12710n0());
    }

    /* JADX INFO: renamed from: u4 */
    public final void m1681u4(Envelope envelope) {
        if (vwb.J(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            return;
        }
        Map<String, Live> mapM1649e4 = m1649e4(((FeedData) envelope.getModuleData(FeedData.class)).lives);
        Map<String, Room> mapM1647d4 = m1647d4(((FeedData) envelope.getModuleData(FeedData.class)).rooms);
        Map<String, VoiceLive> mapM1657i4 = m1657i4(((FeedData) envelope.getModuleData(FeedData.class)).voiceLives);
        final Map<String, LiveUserMask> mapM1651f4 = m1651f4(((FeedData) envelope.getModuleData(FeedData.class)).masks);
        Map<String, VoiceRoomInfo> mapM1655h4 = m1655h4(((FeedData) envelope.getModuleData(FeedData.class)).voiceRooms);
        Map<String, VoiceLiveGame> mapM1653g4 = m1653g4(((FeedData) envelope.getModuleData(FeedData.class)).voiceLiveGames);
        List<RawFeed> list = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        SparseArray sparseArray = new SparseArray();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RawFeed rawFeed = list.get(i);
            if ("live".equals(rawFeed.type)) {
                Live live = mapM1649e4.get(rawFeed.f704id);
                if (NullChecker.a(live)) {
                    Moment momentM1628U2 = m1628U2(live);
                    Room room = mapM1647d4.get(live.room.f264id);
                    if (NullChecker.a(room)) {
                        momentM1628U2.value = room.title;
                        momentM1628U2.liveRoom = room;
                        momentM1628U2.localInFeed = true;
                        momentM1628U2.localInUserFeed = true;
                        momentM1628U2.createdTime = mqi0.o();
                    }
                    sparseArray.put(i, momentM1628U2);
                }
            } else if ("voiceLive".equals(rawFeed.type)) {
                VoiceLive voiceLive = mapM1657i4.get(rawFeed.f704id);
                if (NullChecker.a(voiceLive)) {
                    Moment momentM1630V2 = m1630V2(voiceLive);
                    final HashMap map = new HashMap();
                    vwb.z(voiceLive.callInfo.onVoiceCalls, new e30() { // from class: l.rx9
                        public final void call(Object obj) {
                            C1579b.m1569m2(mapM1651f4, map, (OnVoiceCall) obj);
                        }
                    });
                    voiceLive.masksMap = map;
                    VoiceRoomInfo voiceRoomInfo = mapM1655h4.get(voiceLive.room.f264id);
                    if (NullChecker.a(voiceRoomInfo)) {
                        voiceLive.voiceRoomInfo = voiceRoomInfo;
                    }
                    voiceLive.voiceLiveGame = mapM1653g4.get(voiceLive.f711id);
                    sparseArray.put(i, momentM1630V2);
                }
            }
        }
        this.f668K.onNext(sparseArray);
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ q860 m1682v3(List list, DbLinks dbLinks, SparseArray sparseArray) {
        if (dbLinks == null) {
            m1665m4(false);
        }
        return sparseArray.size() != 0 ? m12727q0(new ymf0(list, sparseArray), dbLinks) : m12727q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ q860 m1683w3(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m1665m4(false);
        }
        return m12727q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ q860 m1684x3(String str, List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m1663l4(str);
        }
        return m12727q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m1685y3(Envelope envelope) {
        DbLinks dbLinksM1669o4 = m1669o4();
        dbLinksM1669o4.links.next = envelope.pagination.links.next;
        qib0.k0.c.upsert(dbLinksM1669o4);
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ roj0 m1686z3(final Envelope envelope) {
        if (((FeedData) envelope.getModuleData(FeedData.class)).moments.size() == 0) {
            envelope.pagination.links.next = null;
        }
        f8c.m10082o().m10103w(envelope, new d30() { // from class: l.gt9
            public final void call() {
                this.f8511a.m1685y3(envelope);
            }
        }, false, true);
        return roj0.a;
    }
}

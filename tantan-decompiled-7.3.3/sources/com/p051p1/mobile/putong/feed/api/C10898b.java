package com.p051p1.mobile.putong.feed.api;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.LiveUserMask;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Report;
import com.p051p1.mobile.putong.data.Room;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.VoiceLiveGame;
import com.p051p1.mobile.putong.data.VoiceRoomInfo;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.api.C10898b;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.MomentMessageType;
import com.p051p1.mobile.putong.feed.data.MomentSettings;
import com.p051p1.mobile.putong.feed.data.MomentVisibilityStatus;
import com.p051p1.mobile.putong.feed.data.OnVoiceCall;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.data.VoiceLive;
import com.p051p1.mobile.putong.feed.helper.MomentUserNullException;
import com.p051p1.mobile.putong.feed.helper.exception.FeedException;
import com.p051p1.mobile.putong.feed.helper.exception.MomentPostFailedExcepion;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
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
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.dji;
import p153l.dog;
import p153l.ecj;
import p153l.fo0;
import p153l.hvf0;
import p153l.i1y;
import p153l.i4g0;
import p153l.j4h;
import p153l.jyb;
import p153l.k110;
import p153l.ksg;
import p153l.l51;
import p153l.l9c;
import p153l.mof0;
import p153l.mrb0;
import p153l.oki;
import p153l.orb0;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.rcj;
import p153l.scj;
import p153l.sim;
import p153l.ti20;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vel0;
import p153l.vg60;
import p153l.vod;
import p153l.wel0;
import p153l.x1d0;
import p153l.x20;
import p153l.y20;
import p153l.z1d0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.b */
/* JADX INFO: loaded from: classes13.dex */
public class C10898b extends dog {

    /* JADX INFO: renamed from: H */
    public final C22508b<Throwable> f40052H = C22508b.m222767b();

    /* JADX INFO: renamed from: I */
    public C22508b<Moment> f40053I = C22508b.m222767b();

    /* JADX INFO: renamed from: J */
    public C22508b<String> f40054J = C22508b.m222767b();

    /* JADX INFO: renamed from: K */
    public C22507a<SparseArray<Moment>> f40055K = C22507a.m222759c(new SparseArray());

    /* JADX INFO: renamed from: L */
    public boolean f40056L = true;

    /* JADX INFO: renamed from: M */
    public a f40057M = new a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.b$a */
    public class a extends mof0<List<String>> {

        /* JADX INFO: renamed from: h */
        public LruCache<String, List<String>> f40058h;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.api.b$a$a, reason: collision with other inner class name */
        public class C22815a implements pcj<C22421c<List<String>>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C10898b f40060a;

            public C22815a(C10898b c10898b) {
                this.f40060a = c10898b;
            }

            /* JADX INFO: renamed from: d */
            public static /* synthetic */ List m61960d(Envelope envelope) {
                l9c.m153394o().m153413u(envelope);
                return jyb.m147486Q(((CommonData) envelope.getModuleData(CommonData.class)).users, new qcj() { // from class: l.oz9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((User) obj).f56859id;
                    }
                });
            }

            @Override // p153l.pcj, java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public C22421c<List<String>> call() {
                return new ti20(new pcj() { // from class: l.lz9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(dog.m117206G(dog.f89923A)).m209032f().m209028b();
                    }
                }).flatMap(new qcj() { // from class: l.mz9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f139483a.m61962f((Envelope) obj);
                    }
                }).map(new qcj() { // from class: l.nz9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C10898b.a.C22815a.m61960d((Envelope) obj);
                    }
                });
            }

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ C22421c m61962f(Envelope envelope) {
                return this.f40060a.m61933r4(envelope);
            }
        }

        public a() {
            super(C10898b.this, "mutedUsers", new dji(new vod("muted_users_protobuf", null, FeedModule.m61405F().userId()), 7, ProtobufAdapter.ARRAY_ADAPTER(ProtobufAdapter.STRING_ADAPTER)), new C22815a(C10898b.this));
            this.f40058h = new LruCache<>(10);
        }

        /* JADX INFO: renamed from: D */
        public static /* synthetic */ x1d0 m61947D(String str, boolean z) {
            x1d0.C21228a c21228aM209043q = dog.f89929G.auth().m209043q(dog.m117207H(str));
            return (z ? c21228aM209043q.m209039m(z1d0.create(Network.JSON, "")) : c21228aM209043q.m209030d()).m209028b();
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m61952I(String str) {
            List<String> listM112015K = FeedModule.f39708i.f160257c.m112015K(str, true);
            if (!jyb.m147479J(listM112015K)) {
                this.f40058h.put(str, listM112015K);
            }
            FeedModule.f39708i.f160257c.m112019O(str, false);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ uxj0 m61953J(final String str, Envelope envelope) {
            l9c.m153394o().m153414v(envelope, new x20() { // from class: l.jz9
                @Override // p153l.x20
                public final void call() {
                    this.f123241a.m61952I(str);
                }
            });
            List<String> listM159277n = m159277n();
            if (listM159277n == null) {
                listM159277n = new ArrayList<>();
            }
            m159273A(jyb.m147500c(listM159277n, str));
            return uxj0.f181467a;
        }

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ void m61954K(String str, uxj0 uxj0Var) {
            if (NullChecker.m82486a(this.f40058h.get(str))) {
                final List<String> listRemove = this.f40058h.remove(str);
                l9c.m153394o().m153397B(new x20() { // from class: l.kz9
                    @Override // p153l.x20
                    public final void call() {
                        FeedModule.f39708i.f160257c.m112018N(listRemove, true);
                    }
                });
            }
            List<String> listM159277n = m159277n();
            if (listM159277n == null) {
                listM159277n = new ArrayList<>();
            }
            m159273A(jyb.m147501c0(listM159277n, str));
        }

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ C22421c m61955L(final String str, final boolean z) {
            pcj pcjVar = new pcj() { // from class: l.fz9
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return C10898b.a.m61947D(str, z);
                }
            };
            return z ? new ti20(pcjVar).map(new qcj() { // from class: l.gz9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f107180a.m61953J(str, (Envelope) obj);
                }
            }).compose(dog.m117253n0()) : new ti20(pcjVar).map(new qcj() { // from class: l.hz9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return uxj0.f181467a;
                }
            }).doOnNext(new y20() { // from class: l.iz9
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f117679a.m61954K(str, (uxj0) obj);
                }
            }).compose(dog.m117253n0());
        }

        /* JADX INFO: renamed from: M */
        public C22421c<uxj0> m61956M(final String str, final boolean z) {
            return C10898b.this.scheduled(BLiveButtonType.mute, -1, new pcj() { // from class: l.ez9
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f96571a.m61955L(str, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ uxj0 m61735A0(Envelope envelope) {
        mrb0.m159649c();
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ void m61737A2(Moment moment) {
        long j = moment._id;
        if (j != 0) {
            FeedModule.f39708i.f160257c.delete(j);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ C22421c m61741C0(qcj qcjVar, Moment moment) {
        return (C22421c) qcjVar.call(moment);
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ VoiceLiveGame m61742C1(VoiceLiveGame voiceLiveGame) {
        return voiceLiveGame;
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ void m61747E0(String str, final int i, DbLinks dbLinks) {
        FeedModule.f39708i.f160257c.delete(str);
        l51.m152887G(new Runnable() { // from class: l.ev9
            @Override // java.lang.Runnable
            public final void run() {
                mrb0.m159644V(i);
            }
        });
        uqb0.f180405k0.f184354c.upsert(dbLinks);
        FeedModule.f39708i.f160258d.m149784G(str);
        FeedModule.m61406H().mo31802n6(str);
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m61754G1(boolean z, String str, Envelope envelope) {
        if (!z || str.equals(FeedModule.m61405F().userId())) {
            return;
        }
        l51.m152888H(FeedModule.f39700a, new Runnable() { // from class: l.cy9
            @Override // java.lang.Runnable
            public final void run() {
                mrb0.m159631I();
            }
        }, 600L);
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ VoiceRoomInfo m61756H0(VoiceRoomInfo voiceRoomInfo) {
        return voiceRoomInfo;
    }

    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ void m61758H2(Envelope envelope, final Moment moment) {
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        Pagination pagination = envelope.pagination;
        String str = pagination.links.next;
        if (str != null) {
            moment.likes.links.next = str;
        }
        PartialIdList partialIdList = moment.likes;
        partialIdList.count = pagination.total;
        partialIdList.ids = jyb.m147504e(partialIdList.ids, jyb.m147522n(jyb.m147486Q(commonData.users, new qcj() { // from class: l.yu9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).f56859id;
            }
        }), new qcj() { // from class: l.zu9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!moment.likes.ids.contains((String) obj));
            }
        }));
        FeedModule.f39708i.f160257c.upsert(moment);
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ C22421c m61760I1(final String str, final Moment moment, final Moment moment2) {
        return (!NullChecker.m82486a(moment2.media) || moment2.media.size() <= 0) ? C22421c.just(moment2) : new i1y((List<Media>) new ArrayList(moment2.media), false, str).doOnNext(new y20() { // from class: l.sv9
            @Override // p153l.y20
            public final void call(Object obj) {
                C10898b.m61835q2(moment2, (List) obj);
            }
        }).last().filter(new qcj() { // from class: l.uv9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(C10898b.m61783Q3(str));
            }
        }).flatMap(new qcj() { // from class: l.vv9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61793V1(moment, moment2, (List) obj);
            }
        }).map(new qcj() { // from class: l.wv9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61846v0(moment, moment2, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J1 */
    public static /* synthetic */ uxj0 m61763J1(final long j) {
        l9c.m153394o().m153397B(new x20() { // from class: l.dw9
            @Override // p153l.x20
            public final void call() {
                FeedModule.f39708i.f160257c.delete(j);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: J2 */
    public static /* synthetic */ Room m61764J2(Room room) {
        return room;
    }

    /* JADX INFO: renamed from: M1 */
    public static /* synthetic */ x1d0 m61772M1(boolean z, String str) {
        x1d0.C21228a c21228aM209030d;
        if (z) {
            c21228aM209030d = dog.f89929G.auth().m209038l(z1d0.create(Network.JSON, "{\"read\": true}")).m209043q(str + "&method=patch");
        } else {
            c21228aM209030d = dog.f89929G.auth().m209043q(str).m209030d();
        }
        return c21228aM209030d.m209028b();
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ uxj0 m61774N0(final Moment moment, y20 y20Var, final Envelope envelope) {
        uqb0.m197269e1("moments_sent", new Object[0]);
        k110.m147843d(new pf60(4, null));
        final Moment moment2 = ((FeedData) envelope.getModuleData(FeedData.class)).moments.get(0);
        moment2._id = moment._id;
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(moment2.f56859id);
        }
        l9c.m153394o().m153414v(envelope, new x20() { // from class: l.iy9
            @Override // p153l.x20
            public final void call() {
                C10898b.m61840t0(moment2, moment, envelope);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ VoiceLive m61781Q0(VoiceLive voiceLive) {
        return voiceLive;
    }

    /* JADX INFO: renamed from: Q3 */
    public static boolean m61783Q3(String str) {
        return FeedModule.m61405F().signedIn_() && TextUtils.equals(str, FeedModule.m61405F().userId());
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ int m61784R0(MomentMessage momentMessage, MomentMessage momentMessage2) {
        return (int) (momentMessage.createdTime - momentMessage2.createdTime);
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ uxj0 m61787S1(final Envelope envelope) {
        l9c.m153394o().m153414v(envelope, new x20() { // from class: l.rx9
            @Override // p153l.x20
            public final void call() {
                C10898b.m61847v1(envelope);
            }
        });
        if (!((FeedData) envelope.getModuleData(FeedData.class)).activities.isEmpty()) {
            User userQuery = uqb0.f180405k0.f184355d.query(((FeedData) envelope.getModuleData(FeedData.class)).activities.get(0).actors);
            if (NullChecker.m82487b(userQuery)) {
                uqb0.f180374G.m127162z0(userQuery.m61308fp().profileSmall());
            }
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ LiveUserMask m61788T0(LiveUserMask liveUserMask) {
        return liveUserMask;
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ Live m61790U0(Live live) {
        return live;
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ C22421c m61792V0(final boolean z, MomentActivity momentActivity) {
        if ((z && NullChecker.m82486a(momentActivity) && !momentActivity.read) || (!z && NullChecker.m82486a(momentActivity))) {
            final String strM117232d = dog.m117232d(momentActivity.f56859id);
            return new ti20(new pcj() { // from class: l.bx9
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return C10898b.m61772M1(z, strM117232d);
                }
            }).map(new qcj() { // from class: l.cx9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C10898b.m61856y1(z, (Envelope) obj);
                }
            }).compose(dog.m117253n0());
        }
        if (!z) {
            return C22421c.just(uxj0.f181467a);
        }
        final String strM117230c = dog.m117230c();
        return new ti20(new pcj() { // from class: l.dx9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209038l(z1d0.create(Network.JSON, "{\"read\": true}")).m209043q(strM117230c + "&method=patch").m209028b();
            }
        }).compose(dog.m117253n0()).map(new qcj() { // from class: l.ex9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61735A0((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ C22421c m61793V1(Moment moment, final Moment moment2, final List list) {
        k110.m147843d(new pf60(2, moment));
        return mrb0.m159634L(list, "moment", "moment", UploadSource.get("moment")).map(new qcj() { // from class: l.tx9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61857y2(list, moment2, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ void m61799Y1(boolean z) {
        DbLinks dbLinks = (DbLinks) uqb0.f180405k0.f184354c.query(SchemeKey.moment_activities);
        if (dbLinks != null) {
            dbLinks.extra = 0;
            if (!z) {
                dbLinks.total = 0;
            }
            uqb0.f180405k0.f184354c.upsert(dbLinks);
        }
        if (z) {
            FeedModule.f39708i.f160258d.m149786I();
        } else {
            FeedModule.f39708i.f160258d.deleteAll();
            FeedModule.f39708i.f160257c.delete(Filter.AND(Moment.SETTINGS_MUTED.m82407T(), Moment.SETTINGS_VISIBILITY.m61360EQ("everyone")));
        }
        l51.m152887G(new Runnable() { // from class: l.nu9
            @Override // java.lang.Runnable
            public final void run() {
                mrb0.m159649c();
            }
        });
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ uxj0 m61801Z1(Envelope envelope) {
        l9c.m153394o().m153415w(envelope, null, false, true);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ C22421c m61803a2(qcj qcjVar, Moment moment) {
        return (C22421c) qcjVar.call(moment);
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ uxj0 m61805b2(final Envelope envelope) {
        l9c.m153394o().m153414v(envelope, new x20() { // from class: l.wy9
            @Override // p153l.x20
            public final void call() {
                C10898b.m61806c1(envelope);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m61806c1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56859id = SchemeKey.moment_activities;
        dbLinks.links = envelope.pagination.links;
        uqb0.f180405k0.f184354c.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: c2 */
    public static /* synthetic */ void m61807c2(Moment moment) {
        moment.localCreatedSession = App.f16092i.get().intValue();
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56859id = moment.f56859id;
        dbLinks.links = Links.new_();
        FeedModule.f39708i.f160260f.upsert(dbLinks);
        FeedModule.f39708i.f160257c.insert(moment);
    }

    /* JADX INFO: renamed from: e2 */
    public static /* synthetic */ List m61811e2(int i, List list) {
        return list.size() > i ? list.subList(0, i) : list;
    }

    /* JADX INFO: renamed from: f2 */
    public static /* synthetic */ List m61813f2(Moment moment) {
        if (NullChecker.m82486a(moment)) {
            return moment.media;
        }
        return null;
    }

    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ void m61815g2(Envelope envelope, String str) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.links = envelope.pagination.links;
        dbLinks.f56859id = str;
        FeedModule.f39708i.f160257c.m112020P(str, jyb.m147486Q(((FeedData) envelope.getModuleData(FeedData.class)).moments, new qcj() { // from class: l.vy9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Moment) obj).f56859id;
            }
        }), false);
        FeedModule.f39708i.f160259e.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ C22421c m61816h1() {
        DbLinks dbLinks = (DbLinks) uqb0.f180405k0.f184354c.queryCache(SchemeKey.moment_activities);
        final String str = dbLinks == null ? null : dbLinks.links.next;
        return NullChecker.m82486a(str) ? new ti20((pcj<x1d0>) new pcj() { // from class: l.ay9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117226a(str)).m209032f().m209028b();
            }
        }, dog.f89926D).map(new qcj() { // from class: l.by9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61805b2((Envelope) obj);
            }
        }).compose(dog.m117253n0()) : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: j2 */
    public static /* synthetic */ Moment m61821j2(final Moment moment) {
        Picture picture;
        if (moment._id != 0) {
            final Moment momentMo225055clone = moment.mo225055clone();
            momentMo225055clone.localCreatedSession = App.f16092i.get().intValue();
            l9c.m153394o().m153397B(new x20() { // from class: l.ix9
                @Override // p153l.x20
                public final void call() {
                    FeedModule.f39708i.f160257c.updateBy_id(momentMo225055clone);
                }
            });
            return momentMo225055clone;
        }
        List<Moment> listM159661o = mrb0.m159661o();
        moment.localInFeed = true;
        moment.localInUserFeed = true;
        moment.createdTime = !listM159661o.isEmpty() ? dog.m117262s0(listM159661o.get(0).createdTime) : dog.m117260r0();
        moment.owner = FeedModule.m61405F().userId();
        if (moment.value == null) {
            moment.value = "";
        }
        moment.likes = PartialIdList.new_();
        moment.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(App.f16092i.get().intValue());
        if (NullChecker.m82486a(moment.media)) {
            for (Media media : moment.media) {
                TrackMediaUploadUtil.m81479a0(media);
                if (TEnum.equals(media.status, "raw")) {
                    if (media instanceof Picture) {
                        Picture picture2 = (Picture) media;
                        if (picture2.size == null || media.mediaType == null) {
                            sim simVar = new sim(oki.m168038z(media.url));
                            picture2.size = new Dimension(simVar.f168843d);
                            media.mediaType = simVar.f168842c;
                        }
                    } else if (media instanceof Video) {
                        Video video = (Video) media;
                        if (video.size == null || (picture = video.cover) == null || picture.size == null || video.mediaType == null || picture.mediaType == null) {
                            wel0 wel0Var = new wel0(new vel0(oki.m168038z(video.url)), false, false);
                            video.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                            video.size = new Dimension(wel0Var.m206021m());
                            video.duration = wel0Var.f188702b;
                            Picture picture3 = video.cover;
                            if (picture3 == null || picture3.url == null) {
                                video.processStartTime = SystemClock.uptimeMillis();
                                Picture picture4 = new Picture();
                                video.cover = picture4;
                                try {
                                    picture4.url = oki.m168011B(wel0Var.m206013c(0));
                                    video.cover.size = new Dimension(wel0Var.m206019k());
                                    video.cover.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                                    uqb0.f180374G.m127160x0(video.url);
                                } catch (Exception e) {
                                    CrashHelper.m82479c(e);
                                    throw new TrackMediaUploadUtil.GetVideoFrameException(e.getMessage(), e.getCause());
                                }
                            }
                            if (video.url.contains(ecj.m120375I().getAbsolutePath())) {
                                try {
                                    String[] strArrM120380N = ecj.m120380N(video.url, video.cover().url, ecj.f93066d, moment.f56859id, false);
                                    video.url = strArrM120380N[0];
                                    video.cover().url = strArrM120380N[1];
                                } catch (IOException e2) {
                                    CrashHelper.m82479c(e2);
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
        k110.m147843d(new pf60(1, moment));
        l9c.m153394o().m153397B(new x20() { // from class: l.hx9
            @Override // p153l.x20
            public final void call() {
                C10898b.m61807c2(moment);
            }
        });
        return moment;
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ void m61827m2(Map map, HashMap map2, OnVoiceCall onVoiceCall) {
        if (NullChecker.m82486a(map.get(onVoiceCall.user.f40092id))) {
            String str = onVoiceCall.user.f40092id;
            map2.put(str, (LiveUserMask) map.get(str));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m61835q2(Moment moment, List list) {
        final Moment momentMo225055clone = moment.mo225055clone();
        if (NullChecker.m82487b(list.get(0)) && (list.get(0) instanceof Video) && TEnum.equals(((Media) list.get(0)).status, MediaLocalStatus.preprocessed)) {
            try {
                String[] strArrM120380N = ecj.m120380N(((Media) list.get(0)).url, ((Media) list.get(0)).cover().url, ecj.f93066d, moment.f56859id, true);
                ((Media) list.get(0)).url = strArrM120380N[0];
                ((Media) list.get(0)).cover().url = strArrM120380N[1];
            } catch (IOException e) {
                CrashHelper.m82479c(e);
            }
        }
        momentMo225055clone.media = new ArrayList(list);
        l9c.m153394o().m153397B(new x20() { // from class: l.gx9
            @Override // p153l.x20
            public final void call() {
                FeedModule.f39708i.f160257c.updateBy_id(momentMo225055clone);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m61840t0(Moment moment, Moment moment2, Envelope envelope) {
        FeedModule.f39708i.f160257c.updateBy_id(moment);
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56859id = moment.f56859id;
        dbLinks.links = Links.new_();
        FeedModule.f39708i.f160260f.upsert(dbLinks);
        FeedModule.f39708i.f160260f.delete(moment2.f56859id);
        FeedModule.m61406H().mo31680Cb(envelope);
    }

    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ uxj0 m61841t1(final String str, final Envelope envelope) {
        l9c.m153394o().m153415w(envelope, new x20() { // from class: l.ux9
            @Override // p153l.x20
            public final void call() {
                C10898b.m61815g2(envelope, str);
            }
        }, false, true);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m61843u0(final String str, Throwable th) {
        if (th instanceof ApiExcep.Client.NotFound) {
            l9c.m153394o().m153397B(new x20() { // from class: l.pu9
                @Override // p153l.x20
                public final void call() {
                    C10898b.m61855y0(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ Moment m61846v0(Moment moment, Moment moment2, List list) {
        k110.m147843d(new pf60(3, moment));
        final Moment momentMo225055clone = moment2.mo225055clone();
        momentMo225055clone.media = new ArrayList(list);
        l9c.m153394o().m153397B(new x20() { // from class: l.yx9
            @Override // p153l.x20
            public final void call() {
                FeedModule.f39708i.f160257c.updateBy_id(momentMo225055clone);
            }
        });
        return momentMo225055clone;
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m61847v1(Envelope envelope) {
        DbLinks dbLinks = new DbLinks();
        dbLinks.f56859id = SchemeKey.moment_activities;
        dbLinks.links = envelope.pagination.links;
        uqb0.f180405k0.f184354c.upsert(dbLinks);
        FeedModule.f39708i.f160258d.m149785H(jyb.m147486Q(((FeedData) envelope.getModuleData(FeedData.class)).activities, new qcj() { // from class: l.gy9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((MomentActivity) obj).f56859id;
            }
        }));
    }

    /* JADX INFO: renamed from: w1 */
    public static /* synthetic */ x1d0 m61850w1(String str, String str2, boolean z) {
        x1d0.C21228a c21228aM209043q = dog.f89929G.auth().m209043q(dog.m117203D(str, str2));
        return (z ? c21228aM209043q.m209039m(z1d0.create(Network.JSON, "")) : c21228aM209043q.m209030d()).m209028b();
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m61852x0(Moment moment) {
        long j = moment._id;
        if (j != 0) {
            Moment momentQuery = FeedModule.f39708i.f160257c.query(j);
            momentQuery.localCreatedSession--;
            FeedModule.f39708i.f160257c.updateBy_id(momentQuery);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m61855y0(String str) {
        FeedModule.f39708i.f160257c.delete(str);
        FeedModule.m61406H().mo31802n6(str);
    }

    /* JADX INFO: renamed from: y1 */
    public static /* synthetic */ uxj0 m61856y1(final boolean z, Envelope envelope) {
        l9c.m153394o().m153414v(envelope, new x20() { // from class: l.uy9
            @Override // p153l.x20
            public final void call() {
                C10898b.m61799Y1(z);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ List m61857y2(List list, Moment moment, List list2) {
        for (int i = 0; i < list.size(); i++) {
            if (((Media) list.get(i)) instanceof Video) {
                ecj.m120373G(ecj.f93066d, moment.f56859id);
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ Notification m61858z0(final String str, Notification notification) {
        if (!notification.m222546k() && (!notification.m222545j() || !(notification.m222540e() instanceof ApiExcep.Client.NotFound))) {
            return notification;
        }
        final DbLinks dbLinks = (DbLinks) uqb0.f180405k0.f184354c.query(SchemeKey.moment_activities);
        final int iM159642T = mrb0.m159642T(str);
        dbLinks.extra = Math.max(0, dbLinks.extra - iM159642T);
        l9c.m153394o().m153397B(new x20() { // from class: l.mu9
            @Override // p153l.x20
            public final void call() {
                C10898b.m61747E0(str, iM159642T, dbLinks);
            }
        });
        return Notification.m222538c(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ C22421c m61861A3(final DbLinks dbLinks) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.yy9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117250m(dbLinks.links.next)).m209032f().m209028b();
            }
        }, dog.f89926D | dog.f89927E).map(new qcj() { // from class: l.zy9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f206564a.m61944z3((Envelope) obj);
            }
        }).compose(dog.m117253n0());
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m61862B3(String str, Envelope envelope) {
        DbLinks dbLinksM61929p4 = m61929p4(str);
        if (dbLinksM61929p4 == null) {
            dbLinksM61929p4 = DbLinks.new_();
            dbLinksM61929p4.f56859id = str;
            dbLinksM61929p4.links.previous = envelope.pagination.links.previous;
        }
        dbLinksM61929p4.links.next = envelope.pagination.links.next;
        FeedModule.f39708i.f160259e.upsert(dbLinksM61929p4);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ uxj0 m61863C3(final String str, final Envelope envelope) {
        if (((FeedData) envelope.getModuleData(FeedData.class)).moments.size() == 0) {
            envelope.pagination.links.next = null;
        }
        l9c.m153394o().m153415w(envelope, new x20() { // from class: l.sx9
            @Override // p153l.x20
            public final void call() {
                this.f171096a.m61862B3(str, envelope);
            }
        }, false, true);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ C22421c m61864D3(final String str, final String str2) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.aw9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(str).m209032f().m209028b();
            }
        }, dog.f89926D).map(new qcj() { // from class: l.bw9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f78688a.m61863C3(str2, (Envelope) obj);
            }
        }).compose(dog.m117253n0());
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m61865E3(Envelope envelope) {
        DbLinks dbLinksM61927o4 = m61927o4();
        dbLinksM61927o4.links.next = envelope.pagination.links.next;
        uqb0.f180405k0.f184354c.upsert(dbLinksM61927o4);
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ uxj0 m61866F3(final Envelope envelope) {
        if (((FeedData) envelope.getModuleData(FeedData.class)).moments.size() == 0) {
            envelope.pagination.links.next = null;
        }
        l9c.m153394o().m153415w(envelope, new x20() { // from class: l.su9
            @Override // p153l.x20
            public final void call() {
                this.f170658a.m61865E3(envelope);
            }
        }, false, true);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ C22421c m61867G3(final DbLinks dbLinks, final String str, final long j) {
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.qy9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117250m(dbLinks.links.next)).m209032f().m209028b();
            }
        }, dog.f89926D | dog.f89927E).map(new qcj() { // from class: l.ry9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f165418a.m61866F3((Envelope) obj);
            }
        }).compose(dog.m117253n0()).doOnNext(new y20() { // from class: l.ty9
            @Override // p153l.y20
            public final void call(Object obj) {
                TrackMediaUploadUtil.m81481b0(str, SystemClock.elapsedRealtime() - j);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m61868H3(y20 y20Var, final Moment moment, final Throwable th) {
        MomentPostFailedExcepion.reportMomentPostFailed(th, false);
        i4g0.m138493B("e_post_moment_error", "post_error_moments", jyb.m147494Y("error", th == null ? CardButtonsShowAndHideType.unknow : th.toString()));
        k110.m147843d(new pf60(5, null));
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call("");
        }
        this.f40052H.m137019l(th);
        l51.m152893M(new Runnable() { // from class: l.vw9
            @Override // java.lang.Runnable
            public final void run() {
                bsj0.m106246D(th);
            }
        });
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 40041) {
            l9c.m153394o().m153397B(new x20() { // from class: l.ww9
                @Override // p153l.x20
                public final void call() {
                    C10898b.m61737A2(moment);
                }
            });
        } else {
            l9c.m153394o().m153397B(new x20() { // from class: l.xw9
                @Override // p153l.x20
                public final void call() {
                    C10898b.m61852x0(moment);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ C22421c m61869I3(final y20 y20Var, final y20 y20Var2, final Moment moment) {
        return scheduled("postTheMoment", -1, new pcj() { // from class: l.qv9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                Moment moment2 = moment;
                return new ti20((pcj<x1d0>) new pcj() { // from class: l.jx9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(dog.m117268y()).m209038l(z1d0.create(Network.JSON, moment2.toJson())).m209028b();
                    }
                }, dog.f89927E).map(new qcj() { // from class: l.kx9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C10898b.m61774N0(moment2, y20Var, (Envelope) obj);
                    }
                }).doOnError(y20Var2).compose(dog.m117253n0());
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m61870J3(boolean z, Envelope envelope) {
        if (z) {
            FeedModule.f39708i.f160257c.m112018N(jyb.m147486Q(((FeedData) envelope.getModuleData(FeedData.class)).moments, new qcj() { // from class: l.lu9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Moment) obj).f56859id;
                }
            }), false);
        }
        DbLinks dbLinksM61927o4 = m61927o4();
        if (z || dbLinksM61927o4 == null) {
            dbLinksM61927o4 = new DbLinks();
            dbLinksM61927o4.links = envelope.pagination.links;
            dbLinksM61927o4.f56859id = Moments.TYPE;
        } else if (NullChecker.m82486a(envelope.pagination.links.previous)) {
            dbLinksM61927o4.links.previous = envelope.pagination.links.previous;
        }
        uqb0.f180405k0.f184354c.upsert(dbLinksM61927o4);
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ uxj0 m61871K3(final boolean z, final Envelope envelope) {
        if (j4h.m143419c()) {
            m61939u4(envelope);
        }
        l9c.m153394o().m153415w(envelope, new x20() { // from class: l.xy9
            @Override // p153l.x20
            public final void call() {
                this.f196723a.m61870J3(z, envelope);
            }
        }, false, true);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ C22421c m61872L3(final boolean z, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() > 0) {
            sb.append("&");
        }
        sb.append("query=preload");
        final String strM117250m = dog.m117250m(sb.toString());
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.dy9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(strM117250m).m209032f().m209028b();
            }
        }, dog.f89926D | dog.f89927E).map(new qcj() { // from class: l.ey9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f96412a.m61871K3(z, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ C22421c m61873M3(final boolean z) {
        return C22421c.fromCallable(new Callable() { // from class: l.sw9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f170928a.m61874N3(z);
            }
        }).flatMap(new qcj() { // from class: l.tw9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f176387a.m61872L3(z, (String) obj);
            }
        }).compose(dog.m117253n0());
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ String m61874N3(boolean z) throws Exception {
        String str;
        DbLinks dbLinksM61927o4 = m61927o4();
        return (z || dbLinksM61927o4 == null || (str = dbLinksM61927o4.links.previous) == null) ? "limit=20" : str;
    }

    /* JADX INFO: renamed from: O2 */
    public C22421c<vg60<MomentActivity>> m61875O2() {
        return psd0.m173625r(mrb0.m159627E(), uqb0.f180405k0.f184354c.uiGet(SchemeKey.moment_activities), new rcj() { // from class: l.zw9
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f206327a.m61916j3((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ C22421c m61876O3(Envelope envelope, Envelope envelope2) {
        envelope.addAll(envelope2);
        envelope.pagination.links.next = envelope2.pagination.links.next;
        return m61933r4(envelope);
    }

    /* JADX INFO: renamed from: P2 */
    public C22421c<uxj0> m61877P2(vg60<MomentActivity> vg60Var) {
        return m61884T2(false, vg60Var);
    }

    /* JADX INFO: renamed from: P3 */
    public C22421c<List<Moment>> m61878P3(final String str) {
        return scheduled(str + "/moments/latest", 0, new pcj() { // from class: l.ku9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20((pcj<x1d0>) new pcj() { // from class: l.jw9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(dog.m117267x(str, dog.f89955z)).m209032f().m209028b();
                    }
                }, dog.f89926D).map(new qcj() { // from class: l.kw9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((FeedData) ((Envelope) obj).getModuleData(FeedData.class)).moments;
                    }
                }).compose(dog.m117253n0());
            }
        });
    }

    /* JADX INFO: renamed from: Q2 */
    public C22421c<uxj0> m61879Q2() {
        return scheduled("activity/poll", 0, new pcj() { // from class: l.nw9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C10898b.m61816h1();
            }
        });
    }

    /* JADX INFO: renamed from: R2 */
    public C22421c<uxj0> m61880R2(vg60<MomentActivity> vg60Var) {
        return m61884T2(true, vg60Var);
    }

    /* JADX INFO: renamed from: R3 */
    public C22421c<Envelope> m61881R3(final String str, final String str2, final boolean z) {
        return scheduled("/moments/" + str2 + "/likes/me", -1, new pcj() { // from class: l.mv9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f138885a.m61934s3(str, str2, z);
            }
        });
    }

    /* JADX INFO: renamed from: S2 */
    public C22421c<uxj0> m61882S2() {
        return scheduled("activity/poll", 0, new pcj() { // from class: l.ov9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20((pcj<x1d0>) new pcj() { // from class: l.qw9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(dog.m117226a("limit=20")).m209032f().m209028b();
                    }
                }, dog.f89926D).map(new qcj() { // from class: l.rw9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C10898b.m61787S1((Envelope) obj);
                    }
                }).compose(dog.m117253n0());
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public C22421c<Boolean> m61883S3(final String str, final String str2) {
        return scheduled("moments/" + str2 + "/likes/next", 0, new pcj() { // from class: l.qx9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f160019a.m61938u3(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public C22421c<uxj0> m61884T2(final boolean z, vg60<MomentActivity> vg60Var) {
        final MomentActivity momentActivity = (MomentActivity) jyb.m147475F(vg60Var.f184001a);
        mrb0.m159650d();
        return scheduled("activity_patch", -1, new pcj() { // from class: l.cw9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C10898b.m61792V0(z, momentActivity);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public String m61885T3(String str, String str2) {
        String str3;
        Moment momentM61893X3 = m61893X3(str2);
        return (momentM61893X3 == null || (str3 = momentM61893X3.likes.links.next) == null) ? "" : str3;
    }

    /* JADX INFO: renamed from: U2 */
    public Moment m61886U2(Live live) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56859id = live.f39615id;
        momentNew_.isLive = true;
        momentNew_.live = live;
        momentNew_.owner = live.anchor.f39651id;
        return momentNew_;
    }

    /* JADX INFO: renamed from: U3 */
    public DbLinks m61887U3() {
        return (DbLinks) uqb0.f180405k0.f184354c.queryCache(Moments.TYPE);
    }

    /* JADX INFO: renamed from: V2 */
    public Moment m61888V2(VoiceLive voiceLive) {
        Moment momentNew_ = Moment.new_();
        momentNew_.f56859id = voiceLive.f40098id;
        momentNew_.isVoiceLive = true;
        momentNew_.voiceLive = voiceLive;
        momentNew_.owner = voiceLive.anchor.f39651id;
        return momentNew_;
    }

    /* JADX INFO: renamed from: V3 */
    public DbLinks m61889V3(String str) {
        return (DbLinks) FeedModule.f39708i.f160259e.queryCache(str);
    }

    /* JADX INFO: renamed from: W2 */
    public C22421c<vg60<Moment>> m61890W2(String str, final int i) {
        C22421c<List<Moment>> c22421cM159648b = mrb0.m159648b(str, i);
        if (i > 0) {
            c22421cM159648b = c22421cM159648b.map(new qcj() { // from class: l.fw9
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C10898b.m61811e2(i, (List) obj);
                }
            });
        }
        return psd0.m173625r(c22421cM159648b, FeedModule.f39708i.f160259e.uiGet(str), new rcj() { // from class: l.gw9
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f106739a.m61918k3((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public C22421c<Moment> m61891W3(String str) {
        return FeedModule.f39708i.f160257c.uiGet(str).filter(new qcj() { // from class: l.yw9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Moment) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: X2 */
    public C22421c<uxj0> m61892X2(String str, final String str2, final MomentMessage momentMessage) {
        return mrb0.m159655i(str, str2, momentMessage.f56856id, new x20() { // from class: l.iv9
            @Override // p153l.x20
            public final void call() {
                this.f117029a.m61920l3(momentMessage, str2);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public Moment m61893X3(String str) {
        return FeedModule.f39708i.f160257c.queryCache(str);
    }

    /* JADX INFO: renamed from: Y2 */
    public DbLinks m61894Y2(String str) {
        return (DbLinks) FeedModule.f39708i.f160260f.queryCache(str);
    }

    /* JADX INFO: renamed from: Y3 */
    public C22421c<vg60<Moment>> m61895Y3() {
        return j4h.m143419c() ? psd0.m173626s(mrb0.m159629G(), uqb0.f180405k0.f184354c.uiGet(Moments.TYPE), this.f40055K.observeOn(fo0.m126432a()), new scj() { // from class: l.lw9
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return this.f133789a.m61940v3((List) obj, (DbLinks) obj2, (SparseArray) obj3);
            }
        }) : psd0.m173625r(mrb0.m159629G(), uqb0.f180405k0.f184354c.uiGet(Moments.TYPE), new rcj() { // from class: l.mw9
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f139036a.m61941w3((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: Z2 */
    public C22421c<uxj0> m61896Z2(final String str, final String str2) {
        return scheduled("moments/" + str2 + "/comments/next", 0, new pcj() { // from class: l.xx9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f196618a.m61926o3(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public C22421c<vg60<Moment>> m61897Z3(final String str) {
        return psd0.m173625r(mrb0.m159630H(str), FeedModule.f39708i.f160259e.uiGet(str), new rcj() { // from class: l.ow9
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f149463a.m61942x3(str, (List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: a3 */
    public String m61898a3(String str, String str2) {
        DbLinks dbLinksM61894Y2 = m61894Y2(str2);
        return dbLinksM61894Y2 == null ? "" : dbLinksM61894Y2.links.next;
    }

    /* JADX INFO: renamed from: a4 */
    public C22421c<uxj0> m61899a4() {
        final DbLinks dbLinksM61887U3 = m61887U3();
        return (NullChecker.m82487b(dbLinksM61887U3) && NullChecker.m82486a(dbLinksM61887U3.links.next)) ? scheduled("moments/next", 0, new pcj() { // from class: l.nx9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f144096a.m61861A3(dbLinksM61887U3);
            }
        }) : just();
    }

    /* JADX INFO: renamed from: b3 */
    public C22421c<MomentMessage> m61900b3(String str, MomentMessage momentMessage) {
        momentMessage.messageType = MomentMessageType.get("moment_comment");
        return mrb0.m159626D(str, momentMessage, true);
    }

    /* JADX INFO: renamed from: b4 */
    public C22421c<uxj0> m61901b4(final String str) {
        DbLinks dbLinksM61889V3 = m61889V3(str);
        if (dbLinksM61889V3 == null) {
            dbLinksM61889V3 = new DbLinks();
            dbLinksM61889V3.f56859id = str;
            Links links = new Links();
            dbLinksM61889V3.links = links;
            links.next = dog.f89955z;
        }
        if (!NullChecker.m82486a(dbLinksM61889V3.links.next)) {
            return just();
        }
        final String strM117267x = dog.m117267x(str, dbLinksM61889V3.links.next);
        return scheduled(str + "/moments/next", 0, new pcj() { // from class: l.lv9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f133690a.m61864D3(strM117267x, str);
            }
        });
    }

    /* JADX INFO: renamed from: c3 */
    public C22421c<vg60<MomentMessage>> m61902c3(String str) {
        return psd0.m173625r(mrb0.m159654h(str), FeedModule.f39708i.f160260f.uiGet(str, false), new rcj() { // from class: l.rv9
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f164990a.m61928p3((List) obj, (DbLinks) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public C22421c<uxj0> m61903c4(final String str) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final DbLinks dbLinksM61887U3 = m61887U3();
        return (NullChecker.m82487b(dbLinksM61887U3) && NullChecker.m82486a(dbLinksM61887U3.links.next)) ? scheduled("moments/next", 0, new pcj() { // from class: l.vx9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f186247a.m61867G3(dbLinksM61887U3, str, jElapsedRealtime);
            }
        }) : just();
    }

    /* JADX INFO: renamed from: d3 */
    public List<MomentMessage> m61904d3(Moment moment) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82487b(moment.messages) && NullChecker.m82487b(moment.messages.ids)) {
            Iterator<String> it = moment.messages.ids.iterator();
            while (it.hasNext()) {
                MomentMessage momentMessage = (MomentMessage) FeedModule.m61406H().mo31776i8(it.next(), MomentMessage.JSON_ADAPTER);
                if (NullChecker.m82486a(momentMessage) && !momentMessage.recalled.booleanValue()) {
                    arrayList.add(momentMessage);
                }
            }
            jyb.m147478I(arrayList, new Comparator() { // from class: l.mx9
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C10898b.m61784R0((MomentMessage) obj, (MomentMessage) obj2);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d4 */
    public final Map<String, Room> m61905d4(List<Room> list) {
        return NullChecker.m82486a(list) ? jyb.m147502d(list, new qcj() { // from class: l.av9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Room) obj).f39658id;
            }
        }, new qcj() { // from class: l.bv9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61764J2((Room) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: e3 */
    public void m61906e3(Act act, User user, Moment moment, String str, String str2, boolean z) {
        if (user != null) {
            FeedModule.m61406H().mo31699Ij(act, user.f56859id, NullChecker.m82486a(moment) ? moment.f56859id : null, moment, str, str2, false, z);
            return;
        }
        StringBuilder sb = new StringBuilder("Moment id: ");
        sb.append(NullChecker.m82486a(moment) ? moment.f56859id : null);
        sb.append("from:");
        sb.append(str);
        sb.append("\nActStackInfo:");
        sb.append(FeedException.getActStackInfo());
        sb.append("\n Trace: ");
        sb.append(FeedException.getTrace(new Exception()));
        CrashHelper.m82480d(new MomentUserNullException(sb.toString()), 100);
    }

    /* JADX INFO: renamed from: e4 */
    public final Map<String, Live> m61907e4(List<Live> list) {
        return NullChecker.m82486a(list) ? jyb.m147502d(list, new qcj() { // from class: l.cv9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Live) obj).f39615id;
            }
        }, new qcj() { // from class: l.dv9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61790U0((Live) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: f3 */
    public void m61908f3(Act act, User user, Moment moment, String str, boolean z) {
        m61906e3(act, user, moment, str, ksg.m151158C(str), z);
    }

    /* JADX INFO: renamed from: f4 */
    public final Map<String, LiveUserMask> m61909f4(List<LiveUserMask> list) {
        return NullChecker.m82486a(list) ? jyb.m147502d(list, new qcj() { // from class: l.jv9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((LiveUserMask) obj).userId;
            }
        }, new qcj() { // from class: l.kv9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61788T0((LiveUserMask) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: g3 */
    public C22421c<uxj0> m61910g3(final String str) {
        return scheduled(RequestParameters.SUBRESOURCE_DELETE, -1, new pcj() { // from class: l.fx9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return new ti20(new pcj() { // from class: l.ly9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(dog.m117265v(str2)).m209030d().m209028b();
                    }
                }).materialize().map(new qcj() { // from class: l.my9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C10898b.m61858z0(str2, (Notification) obj);
                    }
                }).dematerialize().take(1).compose(dog.m117253n0());
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final Map<String, VoiceLiveGame> m61911g4(List<VoiceLiveGame> list) {
        return NullChecker.m82486a(list) ? jyb.m147502d(list, new qcj() { // from class: l.fv9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((VoiceLiveGame) obj).f39684id;
            }
        }, new qcj() { // from class: l.hv9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61742C1((VoiceLiveGame) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: h3 */
    public C22421c<uxj0> m61912h3(final long j) {
        return now(C22421c.fromCallable(new Callable() { // from class: l.gv9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C10898b.m61763J1(j);
            }
        }).compose(dog.m117253n0()));
    }

    /* JADX INFO: renamed from: h4 */
    public final Map<String, VoiceRoomInfo> m61913h4(List<VoiceRoomInfo> list) {
        return NullChecker.m82486a(list) ? jyb.m147502d(list, new qcj() { // from class: l.tu9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((VoiceRoomInfo) obj).f39686id;
            }
        }, new qcj() { // from class: l.uu9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61756H0((VoiceRoomInfo) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m61914i3(String str) {
        return mrb0.m159666t(str);
    }

    /* JADX INFO: renamed from: i4 */
    public final Map<String, VoiceLive> m61915i4(List<VoiceLive> list) {
        return NullChecker.m82486a(list) ? jyb.m147502d(list, new qcj() { // from class: l.wu9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((VoiceLive) obj).f40098id;
            }
        }, new qcj() { // from class: l.xu9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61781Q0((VoiceLive) obj);
            }
        }) : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ vg60 m61916j3(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m61882S2();
        }
        return m117270q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: j4 */
    public C22421c<uxj0> m61917j4(Moment moment) {
        return m61919k4(moment, null);
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ vg60 m61918k3(List list, DbLinks dbLinks) {
        return m117270q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: k4 */
    public C22421c<uxj0> m61919k4(final Moment moment, final y20<String> y20Var) {
        final String strUserId = FeedModule.m61405F().userId();
        k110.m147843d(new pf60(0, moment));
        MomentSettings momentSettings = new MomentSettings();
        momentSettings.visibility = MomentVisibilityStatus.get("matches");
        momentSettings.muted = false;
        moment.settings = momentSettings;
        moment.messages = PartialIdList.new_();
        pcj pcjVar = new pcj() { // from class: l.tv9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C22421c.fromCallable(new Callable() { // from class: l.uw9
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C10898b.m61821j2(moment);
                    }
                });
            }
        };
        final qcj qcjVar = new qcj() { // from class: l.ew9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61760I1(strUserId, moment, (Moment) obj);
            }
        };
        final y20<Throwable> y20Var2 = new y20() { // from class: l.pw9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154385a.m61868H3(y20Var, moment, (Throwable) obj);
            }
        };
        final qcj qcjVar2 = new qcj() { // from class: l.ax9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f73825a.m61869I3(y20Var, y20Var2, (Moment) obj);
            }
        };
        return now(((C22421c) pcjVar.call()).filter(new qcj() { // from class: l.lx9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(C10898b.m61783Q3(strUserId));
            }
        }).flatMap(new qcj() { // from class: l.wx9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61741C0(qcjVar, (Moment) obj);
            }
        }).filter(new qcj() { // from class: l.hy9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(C10898b.m61783Q3(strUserId));
            }
        }).compose(TrackMediaUploadUtil.m81489f0("moment", moment.media, new qcj() { // from class: l.sy9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61813f2((Moment) obj);
            }
        })).doOnError(y20Var2).compose(psd0.m173606Q()).filter(new qcj() { // from class: l.dz9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(C10898b.m61783Q3(strUserId));
            }
        }).flatMap(new qcj() { // from class: l.vu9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C10898b.m61803a2(qcjVar2, (Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l3 */
    public final /* synthetic */ void m61920l3(MomentMessage momentMessage, String str) {
        DbLinks dbLinksM61925n4 = m61925n4(momentMessage.moment);
        if (NullChecker.m82487b(dbLinksM61925n4)) {
            dbLinksM61925n4.total--;
            orb0.m168883L(dbLinksM61925n4);
        }
        Moment momentQuery = FeedModule.f39708i.f160257c.query(str);
        if (NullChecker.m82486a(momentQuery)) {
            momentQuery.messages.ids.remove(momentMessage.f56856id);
            FeedModule.f39708i.f160257c.updateBy_id(momentQuery);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public C22421c<uxj0> m61921l4(final String str) {
        return scheduled(str + "/moments/previous", 0, new pcj() { // from class: l.pv9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                String str2 = str;
                return new ti20((pcj<x1d0>) new pcj() { // from class: l.hw9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(dog.m117267x(str2, dog.f89955z)).m209032f().m209028b();
                    }
                }, dog.f89926D).map(new qcj() { // from class: l.iw9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C10898b.m61841t1(str2, (Envelope) obj);
                    }
                }).compose(dog.m117253n0());
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m61922m3(String str, Envelope envelope) {
        DbLinks dbLinksM61925n4 = m61925n4(str);
        Links links = dbLinksM61925n4.links;
        Pagination pagination = envelope.pagination;
        links.next = pagination.links.next;
        dbLinksM61925n4.total = pagination.total;
        FeedModule.f39708i.f160260f.upsert(dbLinksM61925n4);
    }

    /* JADX INFO: renamed from: m4 */
    public C22421c<uxj0> m61923m4(boolean z) {
        final boolean z2 = z || this.f40056L;
        this.f40056L = false;
        return scheduled("moments/previous", 0, new pcj() { // from class: l.nv9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f143782a.m61873M3(z2);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ uxj0 m61924n3(final String str, final Envelope envelope) {
        l9c.m153394o().m153414v(envelope, new x20() { // from class: l.qu9
            @Override // p153l.x20
            public final void call() {
                this.f159531a.m61922m3(str, envelope);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: n4 */
    public DbLinks m61925n4(String str) {
        return (DbLinks) FeedModule.f39708i.f160260f.query(str);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ C22421c m61926o3(final String str, final String str2) {
        final String strM61898a3 = m61898a3(str, str2);
        return NullChecker.m82486a(strM61898a3) ? new ti20((pcj<x1d0>) new pcj() { // from class: l.jy9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117201B(str, str2, strM61898a3)).m209032f().m209028b();
            }
        }, dog.f89926D).map(new qcj() { // from class: l.ky9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f129290a.m61924n3(str2, (Envelope) obj);
            }
        }).compose(dog.m117253n0()) : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: o4 */
    public DbLinks m61927o4() {
        return (DbLinks) uqb0.f180405k0.f184354c.query(Moments.TYPE);
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ vg60 m61928p3(List list, DbLinks dbLinks) {
        return m117270q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: p4 */
    public DbLinks m61929p4(String str) {
        return (DbLinks) FeedModule.f39708i.f160259e.query(str);
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m61930q3(String str, boolean z, Envelope envelope) {
        Moment momentM61931q4 = m61931q4(str);
        if (NullChecker.m82487b(momentM61931q4)) {
            boolean z2 = momentM61931q4.haveLiked;
            if (z2 && !z) {
                PartialIdList partialIdList = momentM61931q4.likes;
                partialIdList.count--;
                partialIdList.ids = jyb.m147501c0(partialIdList.ids, FeedModule.m61405F().userId());
            } else if (!z2 && z) {
                PartialIdList partialIdList2 = momentM61931q4.likes;
                partialIdList2.count++;
                partialIdList2.ids = jyb.m147500c(partialIdList2.ids, FeedModule.m61405F().userId());
            }
            momentM61931q4.haveLiked = z;
            if (NullChecker.m82486a(envelope)) {
                FeedModule.m61406H().mo31680Cb(envelope);
            }
            FeedModule.f39708i.f160257c.upsert(momentM61931q4);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public Moment m61931q4(String str) {
        return FeedModule.f39708i.f160257c.query(str);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ Envelope m61932r3(final String str, final boolean z, final Envelope envelope) {
        l9c.m153394o().m153414v(envelope, new x20() { // from class: l.zx9
            @Override // p153l.x20
            public final void call() {
                this.f206446a.m61930q3(str, z, envelope);
            }
        });
        return envelope;
    }

    /* JADX INFO: renamed from: r4 */
    public final C22421c<Envelope> m61933r4(final Envelope envelope) {
        return envelope.pagination.links.next == null ? C22421c.just(envelope) : new ti20(new pcj() { // from class: l.ox9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117206G(envelope.pagination.links.next)).m209032f().m209028b();
            }
        }).flatMap(new qcj() { // from class: l.px9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f154542a.m61876O3(envelope, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ C22421c m61934s3(final String str, final String str2, final boolean z) {
        return new ti20(new pcj() { // from class: l.xv9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C10898b.m61850w1(str, str2, z);
            }
        }).map(new qcj() { // from class: l.yv9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f201687a.m61932r3(str2, z, (Envelope) obj);
            }
        }).compose(dog.m117253n0()).doOnNext(new y20() { // from class: l.zv9
            @Override // p153l.y20
            public final void call(Object obj) {
                C10898b.m61754G1(z, str, (Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public C22421c<uxj0> m61935s4(final String str, final String str2) {
        return scheduled("moment/refresh/" + str2, 0, new pcj() { // from class: l.fy9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                String str3 = str;
                String str4 = str2;
                return new ti20((pcj<x1d0>) new pcj() { // from class: l.ny9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return dog.f89929G.auth().m209043q(dog.m117266w(str3, str4)).m209028b();
                    }
                }, dog.f89926D).map(new qcj() { // from class: l.oy9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C10898b.m61801Z1((Envelope) obj);
                    }
                }).doOnError(new y20() { // from class: l.py9
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C10898b.m61843u0(str4, (Throwable) obj);
                    }
                }).compose(dog.m117253n0());
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ Boolean m61936t3(String str, final Envelope envelope) {
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        final Moment momentM61931q4 = m61931q4(str);
        l9c.m153394o().m153414v(envelope, new x20() { // from class: l.ou9
            @Override // p153l.x20
            public final void call() {
                C10898b.m61758H2(envelope, momentM61931q4);
            }
        });
        return Boolean.valueOf(commonData.users.size() > 0);
    }

    /* JADX INFO: renamed from: t4 */
    public C22421c<uxj0> m61937t4(String str, String str2, Report report) {
        return mrb0.m159637O(str, str2, report);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ C22421c m61938u3(final String str, final String str2) {
        final String strM61885T3 = m61885T3(str, str2);
        return new ti20(new pcj() { // from class: l.az9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dog.f89929G.auth().m209043q(dog.m117202C(str, str2, strM61885T3)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.bz9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f79116a.m61936t3(str2, (Envelope) obj);
            }
        }).compose(dog.m117253n0());
    }

    /* JADX INFO: renamed from: u4 */
    public final void m61939u4(Envelope envelope) {
        if (jyb.m147479J(((FeedData) envelope.getModuleData(FeedData.class)).feeds)) {
            return;
        }
        Map<String, Live> mapM61907e4 = m61907e4(((FeedData) envelope.getModuleData(FeedData.class)).lives);
        Map<String, Room> mapM61905d4 = m61905d4(((FeedData) envelope.getModuleData(FeedData.class)).rooms);
        Map<String, VoiceLive> mapM61915i4 = m61915i4(((FeedData) envelope.getModuleData(FeedData.class)).voiceLives);
        final Map<String, LiveUserMask> mapM61909f4 = m61909f4(((FeedData) envelope.getModuleData(FeedData.class)).masks);
        Map<String, VoiceRoomInfo> mapM61913h4 = m61913h4(((FeedData) envelope.getModuleData(FeedData.class)).voiceRooms);
        Map<String, VoiceLiveGame> mapM61911g4 = m61911g4(((FeedData) envelope.getModuleData(FeedData.class)).voiceLiveGames);
        List<RawFeed> list = ((FeedData) envelope.getModuleData(FeedData.class)).feeds;
        SparseArray<Moment> sparseArray = new SparseArray<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RawFeed rawFeed = list.get(i);
            if ("live".equals(rawFeed.type)) {
                Live live = mapM61907e4.get(rawFeed.f40091id);
                if (NullChecker.m82486a(live)) {
                    Moment momentM61886U2 = m61886U2(live);
                    Room room = mapM61905d4.get(live.room.f39651id);
                    if (NullChecker.m82486a(room)) {
                        momentM61886U2.value = room.title;
                        momentM61886U2.liveRoom = room;
                        momentM61886U2.localInFeed = true;
                        momentM61886U2.localInUserFeed = true;
                        momentM61886U2.createdTime = pzi0.m174454o();
                    }
                    sparseArray.put(i, momentM61886U2);
                }
            } else if (BLiveType.voiceLive.equals(rawFeed.type)) {
                VoiceLive voiceLive = mapM61915i4.get(rawFeed.f40091id);
                if (NullChecker.m82486a(voiceLive)) {
                    Moment momentM61888V2 = m61888V2(voiceLive);
                    final HashMap map = new HashMap();
                    jyb.m147537z(voiceLive.callInfo.onVoiceCalls, new y20() { // from class: l.cz9
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            C10898b.m61827m2(mapM61909f4, map, (OnVoiceCall) obj);
                        }
                    });
                    voiceLive.masksMap = map;
                    VoiceRoomInfo voiceRoomInfo = mapM61913h4.get(voiceLive.room.f39651id);
                    if (NullChecker.m82486a(voiceRoomInfo)) {
                        voiceLive.voiceRoomInfo = voiceRoomInfo;
                    }
                    voiceLive.voiceLiveGame = mapM61911g4.get(voiceLive.f40098id);
                    sparseArray.put(i, momentM61888V2);
                }
            }
        }
        this.f40055K.m137019l(sparseArray);
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ vg60 m61940v3(List list, DbLinks dbLinks, SparseArray sparseArray) {
        if (dbLinks == null) {
            m61923m4(false);
        }
        return sparseArray.size() != 0 ? m117270q0(new hvf0(list, sparseArray), dbLinks) : m117270q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ vg60 m61941w3(List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m61923m4(false);
        }
        return m117270q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ vg60 m61942x3(String str, List list, DbLinks dbLinks) {
        if (dbLinks == null) {
            m61921l4(str);
        }
        return m117270q0(list, dbLinks);
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m61943y3(Envelope envelope) {
        DbLinks dbLinksM61927o4 = m61927o4();
        dbLinksM61927o4.links.next = envelope.pagination.links.next;
        uqb0.f180405k0.f184354c.upsert(dbLinksM61927o4);
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ uxj0 m61944z3(final Envelope envelope) {
        if (((FeedData) envelope.getModuleData(FeedData.class)).moments.size() == 0) {
            envelope.pagination.links.next = null;
        }
        l9c.m153394o().m153415w(envelope, new x20() { // from class: l.ru9
            @Override // p153l.x20
            public final void call() {
                this.f164907a.m61943y3(envelope);
            }
        }, false, true);
        return uxj0.f181467a;
    }
}

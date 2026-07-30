package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.y;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import l.d30;
import l.e30;
import l.hpd0;
import l.j760;
import l.mkd0;
import l.vwb;
import l.w9j;
import rx.Notification;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ht20 {

    /* JADX INFO: renamed from: a */
    public static hpd0 f14244a = new hpd0("last_video_play_voice_" + CoreModule.H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: A */
    public static void m15950A(final ArrayList<j760<String, d30>> arrayList, final Act act) {
        arrayList.add(vwb.Y("debug multiple user debugItems", new d30() { // from class: l.gs20
            public final void call() {
                ht20.m15955b(arrayList, act);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public static void m15951B() {
        int iM15953D = m15953D();
        Relationship relationship = new Relationship();
        relationship.status = new ArrayList();
        y.i3(String.valueOf(iM15953D), relationship).materialize().subscribe();
    }

    /* JADX INFO: renamed from: C */
    public static void m15952C() {
        final String strValueOf = String.valueOf(m15953D());
        y.j3(strValueOf).materialize().filter(new w9j() { // from class: l.vs20
            public final Object call(Object obj) {
                return Boolean.valueOf(((Notification) obj).k());
            }
        }).flatMap(new w9j() { // from class: l.ws20
            public final Object call(Object obj) {
                return CoreModule.c.e0.W9(strValueOf);
            }
        }).materialize().doOnNext(new e30() { // from class: l.xs20
            public final void call(Object obj) {
                ht20.m15976w(strValueOf, (Notification) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: D */
    public static int m15953D() {
        int iMax = 117276;
        try {
            iMax = Math.max(Integer.parseInt(CoreModule.H().userId()), 117276);
        } catch (Exception unused) {
        }
        return new Random().nextInt(iMax);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15955b(ArrayList arrayList, final Act act) {
        arrayList.clear();
        arrayList.add(vwb.Y("debug make all card user like me卡片上的所有用户都喜欢我", new d30() { // from class: l.rs20
            public final void call() {
                ht20.m15963j();
            }
        }));
        arrayList.add(vwb.Y("debug make random 100 users like me ", new d30() { // from class: l.zs20
            public final void call() {
                c.interval(100L, TimeUnit.MILLISECONDS).onBackpressureDrop().takeUntil(new w9j() { // from class: l.qs20
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Long) obj).longValue() > 100);
                    }
                }).doOnNext(new e30() { // from class: l.ss20
                    public final void call(Object obj) {
                        ht20.m15951B();
                    }
                }).subscribe();
            }
        }));
        arrayList.add(vwb.Y("debug make random 500 users like me ", new d30() { // from class: l.at20
            public final void call() {
                c.interval(100L, TimeUnit.MILLISECONDS).onBackpressureDrop().takeUntil(new w9j() { // from class: l.ts20
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Long) obj).longValue() > 500);
                    }
                }).doOnNext(new e30() { // from class: l.us20
                    public final void call(Object obj) {
                        ht20.m15951B();
                    }
                }).subscribe();
            }
        }));
        arrayList.add(vwb.Y("debug match with random 10 users", new d30() { // from class: l.bt20
            public final void call() {
                c.interval(100L, TimeUnit.MILLISECONDS).onBackpressureDrop().takeUntil(new w9j() { // from class: l.is20
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Long) obj).longValue() >= 10);
                    }
                }).doOnNext(new e30() { // from class: l.js20
                    public final void call(Object obj) {
                        ht20.m15952C();
                    }
                }).subscribe(mkd0.H(new e30() { // from class: l.ks20
                    public final void call(Object obj) {
                        ht20.m15962i((Long) obj);
                    }
                }, new e30() { // from class: l.ls20
                    public final void call(Object obj) {
                        ht20.m15957d((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.Y("debug match with random 100 users", new d30() { // from class: l.ct20
            public final void call() {
                c.interval(100L, TimeUnit.MILLISECONDS).onBackpressureDrop().takeUntil(new w9j() { // from class: l.ms20
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Long) obj).longValue() >= 100);
                    }
                }).doOnNext(new e30() { // from class: l.ns20
                    public final void call(Object obj) {
                        ht20.m15952C();
                    }
                }).subscribe(mkd0.H(new e30() { // from class: l.os20
                    public final void call(Object obj) {
                        ht20.m15964k((Long) obj);
                    }
                }, new e30() { // from class: l.ps20
                    public final void call(Object obj) {
                        ht20.m15967n((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.Y("debug block all user ", new d30() { // from class: l.dt20
            public final void call() {
                CoreModule.c.f0.on().take(1).flatMap(new w9j() { // from class: l.et20
                    public final Object call(Object obj) {
                        return c.from(((q860) obj).f19068a);
                    }
                }).filter(new w9j() { // from class: l.ft20
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!User.isTeamAccount(((Conversation) obj).otherUser));
                    }
                }).flatMap(new w9j() { // from class: l.gt20
                    public final Object call(Object obj) {
                        Conversation conversation = (Conversation) obj;
                        return CoreModule.c.f0.qe(conversation.otherUser, act).materialize().map(new w9j() { // from class: l.ys20
                            public final Object call(Object obj2) {
                                return conversation.otherUser;
                            }
                        });
                    }
                }).subscribe(mkd0.G(new e30() { // from class: l.hs20
                    public final void call(Object obj) {
                        ht20.m15970q((String) obj);
                    }
                }));
            }
        }));
        act.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m15957d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m15962i(Long l2) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m15963j() {
        for (CoreSuggested.UserInfo userInfo : ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded) {
            if (!userInfo.id.contains("-") && CoreModule.c.e0.Pa(userInfo.id) != null) {
                Relationship relationship = new Relationship();
                relationship.status = new ArrayList();
                y.i3(String.valueOf(userInfo.id), relationship).materialize().subscribe();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m15964k(Long l2) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m15967n(Throwable th) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m15970q(String str) {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m15976w(String str, Notification notification) {
        if (CoreModule.c.e0.Pa(str) == null) {
            CoreModule.c.f0.qe(str, (Act) null);
            m15952C();
        }
    }
}

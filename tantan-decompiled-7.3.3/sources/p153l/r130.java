package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4910y;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.Notification;

/* JADX INFO: loaded from: classes11.dex */
public class r130 {

    /* JADX INFO: renamed from: a */
    public static jxd0 f160753a = new jxd0("last_video_play_voice_" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: A */
    public static void m179327A(final ArrayList<pf60<String, x20>> arrayList, final Act act) {
        arrayList.add(jyb.m147494Y("debug multiple user debugItems", new x20() { // from class: l.q030
            @Override // p153l.x20
            public final void call() {
                r130.m179332b(arrayList, act);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public static void m179328B() {
        int iM179330D = m179330D();
        Relationship relationship = new Relationship();
        relationship.status = new ArrayList();
        C4910y.m35904i3(String.valueOf(iM179330D), relationship).materialize().subscribe();
    }

    /* JADX INFO: renamed from: C */
    public static void m179329C() {
        final String strValueOf = String.valueOf(m179330D());
        C4910y.m35905j3(strValueOf).materialize().filter(new f130()).flatMap(new qcj() { // from class: l.g130
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.m116527W9(strValueOf);
            }
        }).materialize().doOnNext(new y20() { // from class: l.h130
            @Override // p153l.y20
            public final void call(Object obj) {
                r130.m179353w(strValueOf, (Notification) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: D */
    public static int m179330D() {
        int iMax = 117276;
        try {
            iMax = Math.max(Integer.parseInt(CoreModule.m30929H().userId()), 117276);
        } catch (Exception unused) {
        }
        return new Random().nextInt(iMax);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m179332b(ArrayList arrayList, final Act act) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("debug make all card user like me卡片上的所有用户都喜欢我", new x20() { // from class: l.b130
            @Override // p153l.x20
            public final void call() {
                r130.m179340j();
            }
        }));
        arrayList.add(jyb.m147494Y("debug make random 100 users like me ", new x20() { // from class: l.j130
            @Override // p153l.x20
            public final void call() {
                C22421c.interval(100L, TimeUnit.MILLISECONDS).onBackpressureDrop().takeUntil(new qcj() { // from class: l.a130
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Long) obj).longValue() > 100);
                    }
                }).doOnNext(new y20() { // from class: l.c130
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        r130.m179328B();
                    }
                }).subscribe();
            }
        }));
        arrayList.add(jyb.m147494Y("debug make random 500 users like me ", new x20() { // from class: l.k130
            @Override // p153l.x20
            public final void call() {
                C22421c.interval(100L, TimeUnit.MILLISECONDS).onBackpressureDrop().takeUntil(new qcj() { // from class: l.d130
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Long) obj).longValue() > 500);
                    }
                }).doOnNext(new y20() { // from class: l.e130
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        r130.m179328B();
                    }
                }).subscribe();
            }
        }));
        arrayList.add(jyb.m147494Y("debug match with random 10 users", new x20() { // from class: l.l130
            @Override // p153l.x20
            public final void call() {
                C22421c.interval(100L, TimeUnit.MILLISECONDS).onBackpressureDrop().takeUntil(new qcj() { // from class: l.s030
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Long) obj).longValue() >= 10);
                    }
                }).doOnNext(new y20() { // from class: l.t030
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        r130.m179329C();
                    }
                }).subscribe(psd0.m173597H(new y20() { // from class: l.u030
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        r130.m179339i((Long) obj);
                    }
                }, new y20() { // from class: l.v030
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        r130.m179334d((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(jyb.m147494Y("debug match with random 100 users", new x20() { // from class: l.m130
            @Override // p153l.x20
            public final void call() {
                C22421c.interval(100L, TimeUnit.MILLISECONDS).onBackpressureDrop().takeUntil(new qcj() { // from class: l.w030
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Long) obj).longValue() >= 100);
                    }
                }).doOnNext(new y20() { // from class: l.x030
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        r130.m179329C();
                    }
                }).subscribe(psd0.m173597H(new y20() { // from class: l.y030
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        r130.m179341k((Long) obj);
                    }
                }, new y20() { // from class: l.z030
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        r130.m179344n((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(jyb.m147494Y("debug block all user ", new x20() { // from class: l.n130
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m34076on().take(1).flatMap(new qcj() { // from class: l.o130
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C22421c.from(((vg60) obj).f184001a);
                    }
                }).filter(new qcj() { // from class: l.p130
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!User.isTeamAccount(((Conversation) obj).otherUser));
                    }
                }).flatMap(new qcj() { // from class: l.q130
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        Conversation conversation = (Conversation) obj;
                        return CoreModule.f18264c.f20384f0.m34093qe(conversation.otherUser, act).materialize().map(new qcj() { // from class: l.i130
                            @Override // p153l.qcj
                            public final Object call(Object obj2) {
                                return conversation.otherUser;
                            }
                        });
                    }
                }).subscribe(psd0.m173596G(new y20() { // from class: l.r030
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        r130.m179347q((String) obj);
                    }
                }));
            }
        }));
        act.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m179334d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m179339i(Long l2) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m179340j() {
        for (CoreSuggested.UserInfo userInfo : CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded) {
            if (!userInfo.f20214id.contains("-") && CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id) != null) {
                Relationship relationship = new Relationship();
                relationship.status = new ArrayList();
                C4910y.m35904i3(String.valueOf(userInfo.f20214id), relationship).materialize().subscribe();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m179341k(Long l2) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m179344n(Throwable th) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m179347q(String str) {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m179353w(String str, Notification notification) {
        if (CoreModule.f18264c.f20381e0.m116503Pa(str) == null) {
            CoreModule.f18264c.f20384f0.m34093qe(str, null);
            m179329C();
        }
    }
}

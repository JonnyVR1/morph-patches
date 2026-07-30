package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4759y;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.Notification;

/* JADX INFO: loaded from: classes11.dex */
public class ht20 {

    /* JADX INFO: renamed from: a */
    public static hpd0 f109362a = new hpd0("last_video_play_voice_" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: A */
    public static void m132814A(final ArrayList<j760<String, d30>> arrayList, final Act act) {
        arrayList.add(vwb.m200311Y("debug multiple user debugItems", new d30() { // from class: l.gs20
            @Override // p149l.d30
            public final void call() {
                ht20.m132819b(arrayList, act);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public static void m132815B() {
        int iM132817D = m132817D();
        Relationship relationship = new Relationship();
        relationship.status = new ArrayList();
        C4759y.m34901i3(String.valueOf(iM132817D), relationship).materialize().subscribe();
    }

    /* JADX INFO: renamed from: C */
    public static void m132816C() {
        final String strValueOf = String.valueOf(m132817D());
        C4759y.m34902j3(strValueOf).materialize().filter(new vs20()).flatMap(new w9j() { // from class: l.ws20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.m169454W9(strValueOf);
            }
        }).materialize().doOnNext(new e30() { // from class: l.xs20
            @Override // p149l.e30
            public final void call(Object obj) {
                ht20.m132840w(strValueOf, (Notification) obj);
            }
        }).subscribe();
    }

    /* JADX INFO: renamed from: D */
    public static int m132817D() {
        int iMax = 117276;
        try {
            iMax = Math.max(Integer.parseInt(CoreModule.m29931H().userId()), 117276);
        } catch (Exception unused) {
        }
        return new Random().nextInt(iMax);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m132819b(ArrayList arrayList, final Act act) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("debug make all card user like me卡片上的所有用户都喜欢我", new d30() { // from class: l.rs20
            @Override // p149l.d30
            public final void call() {
                ht20.m132827j();
            }
        }));
        arrayList.add(vwb.m200311Y("debug make random 100 users like me ", new d30() { // from class: l.zs20
            @Override // p149l.d30
            public final void call() {
                C22306c.interval(100L, TimeUnit.MILLISECONDS).onBackpressureDrop().takeUntil(new w9j() { // from class: l.qs20
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Long) obj).longValue() > 100);
                    }
                }).doOnNext(new e30() { // from class: l.ss20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ht20.m132815B();
                    }
                }).subscribe();
            }
        }));
        arrayList.add(vwb.m200311Y("debug make random 500 users like me ", new d30() { // from class: l.at20
            @Override // p149l.d30
            public final void call() {
                C22306c.interval(100L, TimeUnit.MILLISECONDS).onBackpressureDrop().takeUntil(new w9j() { // from class: l.ts20
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Long) obj).longValue() > 500);
                    }
                }).doOnNext(new e30() { // from class: l.us20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ht20.m132815B();
                    }
                }).subscribe();
            }
        }));
        arrayList.add(vwb.m200311Y("debug match with random 10 users", new d30() { // from class: l.bt20
            @Override // p149l.d30
            public final void call() {
                C22306c.interval(100L, TimeUnit.MILLISECONDS).onBackpressureDrop().takeUntil(new w9j() { // from class: l.is20
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Long) obj).longValue() >= 10);
                    }
                }).doOnNext(new e30() { // from class: l.js20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ht20.m132816C();
                    }
                }).subscribe(mkd0.m154956H(new e30() { // from class: l.ks20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ht20.m132826i((Long) obj);
                    }
                }, new e30() { // from class: l.ls20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ht20.m132821d((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.m200311Y("debug match with random 100 users", new d30() { // from class: l.ct20
            @Override // p149l.d30
            public final void call() {
                C22306c.interval(100L, TimeUnit.MILLISECONDS).onBackpressureDrop().takeUntil(new w9j() { // from class: l.ms20
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Long) obj).longValue() >= 100);
                    }
                }).doOnNext(new e30() { // from class: l.ns20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ht20.m132816C();
                    }
                }).subscribe(mkd0.m154956H(new e30() { // from class: l.os20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ht20.m132828k((Long) obj);
                    }
                }, new e30() { // from class: l.ps20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ht20.m132831n((Throwable) obj);
                    }
                }));
            }
        }));
        arrayList.add(vwb.m200311Y("debug block all user ", new d30() { // from class: l.dt20
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m33073on().take(1).flatMap(new w9j() { // from class: l.et20
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C22306c.from(((q860) obj).f153135a);
                    }
                }).filter(new w9j() { // from class: l.ft20
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!User.isTeamAccount(((Conversation) obj).otherUser));
                    }
                }).flatMap(new w9j() { // from class: l.gt20
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        Conversation conversation = (Conversation) obj;
                        return CoreModule.f17545c.f19642f0.m33090qe(conversation.otherUser, act).materialize().map(new w9j() { // from class: l.ys20
                            @Override // p149l.w9j
                            public final Object call(Object obj2) {
                                return conversation.otherUser;
                            }
                        });
                    }
                }).subscribe(mkd0.m154955G(new e30() { // from class: l.hs20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ht20.m132834q((String) obj);
                    }
                }));
            }
        }));
        act.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m132821d(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m132826i(Long l2) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m132827j() {
        for (CoreSuggested.UserInfo userInfo : CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded) {
            if (!userInfo.f19472id.contains("-") && CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id) != null) {
                Relationship relationship = new Relationship();
                relationship.status = new ArrayList();
                C4759y.m34901i3(String.valueOf(userInfo.f19472id), relationship).materialize().subscribe();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m132828k(Long l2) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m132831n(Throwable th) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m132834q(String str) {
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m132840w(String str, Notification notification) {
        if (CoreModule.f17545c.f19639e0.m169430Pa(str) == null) {
            CoreModule.f17545c.f19642f0.m33090qe(str, null);
            m132816C();
        }
    }
}

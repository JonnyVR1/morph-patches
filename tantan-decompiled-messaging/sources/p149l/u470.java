package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag;
import com.p069ss.bytertc.engine.type.ErrorCode;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class u470 extends jq2<b570> {

    /* JADX INFO: renamed from: a */
    public int f173701a;

    /* JADX INFO: renamed from: b */
    public List<User> f173702b;

    /* JADX INFO: renamed from: c */
    public String f173703c;

    /* JADX INFO: renamed from: d */
    public boolean f173704d;

    /* JADX INFO: renamed from: e */
    public w370 f173705e;

    public u470(mcr mcrVar) {
        super(mcrVar);
        this.f173701a = ErrorCode.ERROR_CODE_LICENSE_NOT_MATCH_WITH_CACHE;
        this.f173702b = new LinkedList();
        this.f173705e = new w370();
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ int m191678C0(User user, User user2) {
        return (int) (user2.localFollowship.userTime - user.localFollowship.userTime);
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m191679D0(Counter counter) {
        if (counter.followships.unreadFollowers > 0) {
            FeedModule.f38855d.m209529pd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m191680G0(Bundle bundle) {
        ((b570) this.viewModel).m100310r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ C22306c m191681H0() {
        return (this.f173703c.equals("fans") || this.f173703c.equals("activities_fans")) ? FeedModule.f38855d.m209432c7() : this.f173705e.m201260c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m191682I0(j760 j760Var) {
        ((b570) this.viewModel).m100309d(false);
        m191716X0(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m191683J0(Throwable th) {
        ((b570) this.viewModel).m100309d(false);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m191690k0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m191693n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ int m191694o0(User user, User user2) {
        Followship followship = user2.localFollowship;
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double d2 = followship == null ? 0.0d : followship.userTime;
        Followship followship2 = user.localFollowship;
        if (followship2 != null) {
            d = followship2.userTime;
        }
        return (int) (d2 - d);
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ int m191699t0(User user, User user2) {
        return (int) (user2.localFollowship.otherUserTime - user.localFollowship.otherUserTime);
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ int m191701x0(User user, User user2) {
        return (int) (user2.localFollowship.otherUserTime - user.localFollowship.otherUserTime);
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m191704E0(Links links) {
        return links == null || !TextUtils.isEmpty(links.next);
    }

    /* JADX INFO: renamed from: F0 */
    public void m191705F0(String str, boolean z) {
        this.f173703c = str;
        this.f173704d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m191706L0(final j760 j760Var) {
        int iM200293G = vwb.m200293G(this.f173702b, new w9j() { // from class: l.d470
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).f56011id.equals(((User) j760Var.f116564a).f56011id));
            }
        });
        if (iM200293G != -1) {
            if (this.f173703c.equals("fans") || this.f173703c.equals("activities_fans") || TextUtils.equals(this.f173703c, FollowshipStatus.following)) {
                this.f173702b.set(iM200293G, FeedModule.f38855d.m209447e8(((User) j760Var.f116564a).f56011id));
            } else if (!((Boolean) j760Var.f116565b).booleanValue()) {
                this.f173702b.remove(iM200293G);
            }
        }
        ((b570) this.viewModel).m100308c(this.f173702b);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m191707N0(j760 j760Var) {
        ((b570) this.viewModel).m100309d(false);
        m191716X0(j760Var);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m191708O0(Throwable th) {
        ((b570) this.viewModel).m100309d(false);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m191709P0(j760 j760Var) {
        ((b570) this.viewModel).m100309d(false);
        m191716X0(j760Var);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m191710Q0(Throwable th) {
        ((b570) this.viewModel).m100309d(false);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Boolean m191711R0(User user) {
        return Boolean.valueOf((this.f173702b.contains(user) || user.localFollowship == null) ? false : true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m191712S0(j760 j760Var) {
        if (NullChecker.m81304b(j760Var)) {
            PhotoAlbumFallsFeedFrag.f41199I = (Links) j760Var.f116564a;
            if (NullChecker.m81304b(j760Var.f116565b)) {
                this.f173702b.addAll(vwb.m200339n((Collection) j760Var.f116565b, new w9j() { // from class: l.h470
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f105813a.m191711R0((User) obj);
                    }
                }));
                vwb.m200295I(this.f173702b, new Comparator() { // from class: l.j470
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return u470.m191701x0((User) obj, (User) obj2);
                    }
                });
                ((b570) this.viewModel).m100308c(this.f173702b);
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ Boolean m191713U0(User user) {
        return Boolean.valueOf((this.f173702b.contains(user) || user.localFollowship == null) ? false : true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m191714V0(j760 j760Var) {
        if (NullChecker.m81304b(j760Var)) {
            PhotoAlbumFallsFeedFrag.f41199I = (Links) j760Var.f116564a;
            if (NullChecker.m81304b(j760Var.f116565b)) {
                this.f173702b.addAll(vwb.m200339n((Collection) j760Var.f116565b, new w9j() { // from class: l.k470
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f120952a.m191713U0((User) obj);
                    }
                }));
                vwb.m200295I(this.f173702b, new Comparator() { // from class: l.l470
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return u470.m191694o0((User) obj, (User) obj2);
                    }
                });
                ((b570) this.viewModel).m100308c(this.f173702b);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m191715W0() {
        if ("fans".equals(this.f173703c) || "activities_fans".equals(this.f173703c)) {
            duringCreated(FeedModule.f38855d.m209432c7()).subscribe(mkd0.m154956H(new e30() { // from class: l.q470
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f152550a.m191709P0((j760) obj);
                }
            }, new e30() { // from class: l.r470
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f157640a.m191710Q0((Throwable) obj);
                }
            }));
        } else {
            duringCreated(this.f173705e.m201260c()).subscribe(mkd0.m154956H(new e30() { // from class: l.s470
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f162275a.m191707N0((j760) obj);
                }
            }, new e30() { // from class: l.t470
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167694a.m191708O0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m191716X0(j760<Links, List<User>> j760Var) {
        this.f173702b.clear();
        PhotoAlbumFallsFeedFrag.f41199I = j760Var.f116564a;
        this.f173702b.addAll(vwb.m200339n(j760Var.f116565b, new w9j() { // from class: l.e470
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf((user.f56011id.equals(FeedModule.m60221F().userId()) || user.localFollowship == null) ? false : true);
            }
        }));
        if (this.f173703c.equals("fans") || this.f173703c.equals("activities_fans")) {
            vwb.m200295I(this.f173702b, new Comparator() { // from class: l.f470
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return u470.m191699t0((User) obj, (User) obj2);
                }
            });
        } else {
            vwb.m200295I(this.f173702b, new Comparator() { // from class: l.g470
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return u470.m191678C0((User) obj, (User) obj2);
                }
            });
        }
        ((b570) this.viewModel).m100308c(this.f173702b);
        m191717Y0();
    }

    /* JADX INFO: renamed from: Y0 */
    public void m191717Y0() {
        if ("fans".equals(this.f173703c) || FollowshipStatus.following.equals(this.f173703c)) {
            ijb0.m136549M(qib0.f154713b0.f139230a.userId());
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.x370
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190871a.m191680G0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.i470
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f111414a.m191681H0();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.m470
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131257a.m191682I0((j760) obj);
            }
        }, new e30() { // from class: l.n470
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137047a.m191683J0((Throwable) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.o470
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return FeedModule.f38855d.f193012Q0;
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.p470
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147042a.m191706L0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public void m191718a1() {
        if (this.f173704d) {
            FeedModule.f38855d.m209529pd();
        } else {
            duringCreated(ijb0.m136570j()).subscribe(mkd0.m154955G(new e30() { // from class: l.y370
                @Override // p149l.e30
                public final void call(Object obj) {
                    u470.m191679D0((Counter) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m191719e(int i) {
        if (i < this.f173702b.size() - 4 || this.f173702b.size() <= 0 || !m191704E0(PhotoAlbumFallsFeedFrag.f41199I)) {
            return;
        }
        if (this.f173703c.equals("fans") || this.f173703c.equals("activities_fans")) {
            duringCreated(this.f173705e.m201258a(PhotoAlbumFallsFeedFrag.f41199I)).subscribe(mkd0.m154956H(new e30() { // from class: l.z370
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201318a.m191712S0((j760) obj);
                }
            }, new e30() { // from class: l.a470
                @Override // p149l.e30
                public final void call(Object obj) {
                    u470.m191693n0((Throwable) obj);
                }
            }));
        } else {
            duringCreated(this.f173705e.m201259b(PhotoAlbumFallsFeedFrag.f41199I)).subscribe(mkd0.m154956H(new e30() { // from class: l.b470
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f73319a.m191714V0((j760) obj);
                }
            }, new e30() { // from class: l.c470
                @Override // p149l.e30
                public final void call(Object obj) {
                    u470.m191690k0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}

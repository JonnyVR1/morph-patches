package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.qib0;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class u470 extends jq2<b570> {

    /* JADX INFO: renamed from: a */
    public int f13531a;

    /* JADX INFO: renamed from: b */
    public List<User> f13532b;

    /* JADX INFO: renamed from: c */
    public String f13533c;

    /* JADX INFO: renamed from: d */
    public boolean f13534d;

    /* JADX INFO: renamed from: e */
    public w370 f13535e;

    public u470(mcr mcrVar) {
        super(mcrVar);
        this.f13531a = -1024;
        this.f13532b = new LinkedList();
        this.f13535e = new w370();
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ int m14726C0(User user, User user2) {
        return (int) (user2.localFollowship.userTime - user.localFollowship.userTime);
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m14727D0(Counter counter) {
        if (counter.followships.unreadFollowers > 0) {
            FeedModule.f316d.m16710pd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m14728G0(Bundle bundle) {
        ((b570) ((jq2) this).viewModel).m8639r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ c m14729H0() {
        return (this.f13533c.equals("fans") || this.f13533c.equals("activities_fans")) ? FeedModule.f316d.m16613c7() : this.f13535e.m15683c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m14730I0(j760 j760Var) {
        ((b570) ((jq2) this).viewModel).m8636d(false);
        m14764X0(j760Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m14731J0(Throwable th) {
        ((b570) ((jq2) this).viewModel).m8636d(false);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m14738k0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m14741n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ int m14742o0(User user, User user2) {
        Followship followship = user2.localFollowship;
        double d = followship == null ? 0.0d : followship.userTime;
        Followship followship2 = user.localFollowship;
        return (int) (d - (followship2 != null ? followship2.userTime : 0.0d));
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ int m14747t0(User user, User user2) {
        return (int) (user2.localFollowship.otherUserTime - user.localFollowship.otherUserTime);
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ int m14749x0(User user, User user2) {
        return (int) (user2.localFollowship.otherUserTime - user.localFollowship.otherUserTime);
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m14752E0(Links links) {
        return links == null || !TextUtils.isEmpty(links.next);
    }

    /* JADX INFO: renamed from: F0 */
    public void m14753F0(String str, boolean z) {
        this.f13533c = str;
        this.f13534d = z;
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m14754L0(final j760 j760Var) {
        int iG = vwb.G(this.f13532b, new w9j() { // from class: l.d470
            public final Object call(Object obj) {
                return Boolean.valueOf(((DbObject) ((User) obj)).id.equals(((DbObject) ((User) j760Var.a)).id));
            }
        });
        if (iG != -1) {
            if (this.f13533c.equals("fans") || this.f13533c.equals("activities_fans") || TextUtils.equals(this.f13533c, FollowshipStatus.following)) {
                this.f13532b.set(iG, FeedModule.f316d.m16628e8(((DbObject) ((User) j760Var.a)).id));
            } else if (!((Boolean) j760Var.b).booleanValue()) {
                this.f13532b.remove(iG);
            }
        }
        ((b570) ((jq2) this).viewModel).m8635c(this.f13532b);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m14755N0(j760 j760Var) {
        ((b570) ((jq2) this).viewModel).m8636d(false);
        m14764X0(j760Var);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m14756O0(Throwable th) {
        ((b570) ((jq2) this).viewModel).m8636d(false);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m14757P0(j760 j760Var) {
        ((b570) ((jq2) this).viewModel).m8636d(false);
        m14764X0(j760Var);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m14758Q0(Throwable th) {
        ((b570) ((jq2) this).viewModel).m8636d(false);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Boolean m14759R0(User user) {
        return Boolean.valueOf((this.f13532b.contains(user) || user.localFollowship == null) ? false : true);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m14760S0(j760 j760Var) {
        if (NullChecker.b(j760Var)) {
            PhotoAlbumFallsFeedFrag.f2660I = (Links) j760Var.a;
            if (NullChecker.b(j760Var.b)) {
                this.f13532b.addAll(vwb.n((Collection) j760Var.b, new w9j() { // from class: l.h470
                    public final Object call(Object obj) {
                        return this.f8574a.m14759R0((User) obj);
                    }
                }));
                vwb.I(this.f13532b, new Comparator() { // from class: l.j470
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return u470.m14749x0((User) obj, (User) obj2);
                    }
                });
                ((b570) ((jq2) this).viewModel).m8635c(this.f13532b);
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ Boolean m14761U0(User user) {
        return Boolean.valueOf((this.f13532b.contains(user) || user.localFollowship == null) ? false : true);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m14762V0(j760 j760Var) {
        if (NullChecker.b(j760Var)) {
            PhotoAlbumFallsFeedFrag.f2660I = (Links) j760Var.a;
            if (NullChecker.b(j760Var.b)) {
                this.f13532b.addAll(vwb.n((Collection) j760Var.b, new w9j() { // from class: l.k470
                    public final Object call(Object obj) {
                        return this.f9600a.m14761U0((User) obj);
                    }
                }));
                vwb.I(this.f13532b, new Comparator() { // from class: l.l470
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return u470.m14742o0((User) obj, (User) obj2);
                    }
                });
                ((b570) ((jq2) this).viewModel).m8635c(this.f13532b);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m14763W0() {
        if ("fans".equals(this.f13533c) || "activities_fans".equals(this.f13533c)) {
            duringCreated(FeedModule.f316d.m16613c7()).subscribe(mkd0.H(new e30() { // from class: l.q470
                public final void call(Object obj) {
                    this.f12081a.m14757P0((j760) obj);
                }
            }, new e30() { // from class: l.r470
                public final void call(Object obj) {
                    this.f12479a.m14758Q0((Throwable) obj);
                }
            }));
        } else {
            duringCreated(this.f13535e.m15683c()).subscribe(mkd0.H(new e30() { // from class: l.s470
                public final void call(Object obj) {
                    this.f12792a.m14755N0((j760) obj);
                }
            }, new e30() { // from class: l.t470
                public final void call(Object obj) {
                    this.f13190a.m14756O0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m14764X0(j760<Links, List<User>> j760Var) {
        this.f13532b.clear();
        PhotoAlbumFallsFeedFrag.f2660I = (Links) j760Var.a;
        this.f13532b.addAll(vwb.n((Collection) j760Var.b, new w9j() { // from class: l.e470
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf((((DbObject) user).id.equals(FeedModule.m1139F().userId()) || user.localFollowship == null) ? false : true);
            }
        }));
        if (this.f13533c.equals("fans") || this.f13533c.equals("activities_fans")) {
            vwb.I(this.f13532b, new Comparator() { // from class: l.f470
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return u470.m14747t0((User) obj, (User) obj2);
                }
            });
        } else {
            vwb.I(this.f13532b, new Comparator() { // from class: l.g470
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return u470.m14726C0((User) obj, (User) obj2);
                }
            });
        }
        ((b570) ((jq2) this).viewModel).m8635c(this.f13532b);
        m14765Y0();
    }

    /* JADX INFO: renamed from: Y0 */
    public void m14765Y0() {
        if ("fans".equals(this.f13533c) || FollowshipStatus.following.equals(this.f13533c)) {
            ijb0.m10902M(qib0.b0.a.userId());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m14766a0() {
        creates(new e30() { // from class: l.x370
            public final void call(Object obj) {
                this.f14754a.m14728G0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.i470
            public final Object call() {
                return this.f8894a.m14729H0();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.m470
            public final void call(Object obj) {
                this.f10219a.m14730I0((j760) obj);
            }
        }, new e30() { // from class: l.n470
            public final void call(Object obj) {
                this.f10649a.m14731J0((Throwable) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.o470
            public final Object call() {
                return FeedModule.f316d.f14947Q0;
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.p470
            public final void call(Object obj) {
                this.f11692a.m14754L0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public void m14767a1() {
        if (this.f13534d) {
            FeedModule.f316d.m16710pd();
        } else {
            duringCreated(ijb0.m10923j()).subscribe(mkd0.G(new e30() { // from class: l.y370
                public final void call(Object obj) {
                    u470.m14727D0((Counter) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m14768e(int i) {
        if (i < this.f13532b.size() - 4 || this.f13532b.size() <= 0 || !m14752E0(PhotoAlbumFallsFeedFrag.f2660I)) {
            return;
        }
        if (this.f13533c.equals("fans") || this.f13533c.equals("activities_fans")) {
            duringCreated(this.f13535e.m15681a(PhotoAlbumFallsFeedFrag.f2660I)).subscribe(mkd0.H(new e30() { // from class: l.z370
                public final void call(Object obj) {
                    this.f15573a.m14760S0((j760) obj);
                }
            }, new e30() { // from class: l.a470
                public final void call(Object obj) {
                    u470.m14741n0((Throwable) obj);
                }
            }));
        } else {
            duringCreated(this.f13535e.m15682b(PhotoAlbumFallsFeedFrag.f2660I)).subscribe(mkd0.H(new e30() { // from class: l.b470
                public final void call(Object obj) {
                    this.f5915a.m14762V0((j760) obj);
                }
            }, new e30() { // from class: l.c470
                public final void call(Object obj) {
                    u470.m14738k0((Throwable) obj);
                }
            }));
        }
    }

    public void destroy() {
    }
}

package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFallsFeedFrag;
import com.p074ss.bytertc.engine.type.ErrorCode;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class ad70 extends ar2<hd70> {

    /* JADX INFO: renamed from: a */
    public int f69792a;

    /* JADX INFO: renamed from: b */
    public List<User> f69793b;

    /* JADX INFO: renamed from: c */
    public String f69794c;

    /* JADX INFO: renamed from: d */
    public boolean f69795d;

    /* JADX INFO: renamed from: e */
    public cc70 f69796e;

    public ad70(ner nerVar) {
        super(nerVar);
        this.f69792a = ErrorCode.ERROR_CODE_LICENSE_NOT_MATCH_WITH_CACHE;
        this.f69793b = new LinkedList();
        this.f69796e = new cc70();
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ int m97021C0(User user, User user2) {
        return (int) (user2.localFollowship.userTime - user.localFollowship.userTime);
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m97022D0(Counter counter) {
        if (counter.followships.unreadFollowers > 0) {
            FeedModule.f39703d.m145770pd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m97023G0(Bundle bundle) {
        ((hd70) this.viewModel).m134574r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ C22421c m97024H0() {
        return (this.f69794c.equals("fans") || this.f69794c.equals("activities_fans")) ? FeedModule.f39703d.m145673c7() : this.f69796e.m108705c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m97025I0(pf60 pf60Var) {
        ((hd70) this.viewModel).m134573d(false);
        m97059X0(pf60Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m97026J0(Throwable th) {
        ((hd70) this.viewModel).m134573d(false);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m97033k0(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m97036n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ int m97037o0(User user, User user2) {
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
    public static /* synthetic */ int m97042t0(User user, User user2) {
        return (int) (user2.localFollowship.otherUserTime - user.localFollowship.otherUserTime);
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ int m97044x0(User user, User user2) {
        return (int) (user2.localFollowship.otherUserTime - user.localFollowship.otherUserTime);
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m97047E0(Links links) {
        return links == null || !TextUtils.isEmpty(links.next);
    }

    /* JADX INFO: renamed from: F0 */
    public void m97048F0(String str, boolean z) {
        this.f69794c = str;
        this.f69795d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m97049L0(final pf60 pf60Var) {
        int iM147476G = jyb.m147476G(this.f69793b, new qcj() { // from class: l.jc70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).f56859id.equals(((User) pf60Var.f152156a).f56859id));
            }
        });
        if (iM147476G != -1) {
            if (this.f69794c.equals("fans") || this.f69794c.equals("activities_fans") || TextUtils.equals(this.f69794c, FollowshipStatus.following)) {
                this.f69793b.set(iM147476G, FeedModule.f39703d.m145688e8(((User) pf60Var.f152156a).f56859id));
            } else if (!((Boolean) pf60Var.f152157b).booleanValue()) {
                this.f69793b.remove(iM147476G);
            }
        }
        ((hd70) this.viewModel).m134572c(this.f69793b);
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m97050N0(pf60 pf60Var) {
        ((hd70) this.viewModel).m134573d(false);
        m97059X0(pf60Var);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m97051O0(Throwable th) {
        ((hd70) this.viewModel).m134573d(false);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m97052P0(pf60 pf60Var) {
        ((hd70) this.viewModel).m134573d(false);
        m97059X0(pf60Var);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m97053Q0(Throwable th) {
        ((hd70) this.viewModel).m134573d(false);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Boolean m97054R0(User user) {
        return Boolean.valueOf((this.f69793b.contains(user) || user.localFollowship == null) ? false : true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m97055S0(pf60 pf60Var) {
        if (NullChecker.m82487b(pf60Var)) {
            PhotoAlbumFallsFeedFrag.f42047I = (Links) pf60Var.f152156a;
            if (NullChecker.m82487b(pf60Var.f152157b)) {
                this.f69793b.addAll(jyb.m147522n((Collection) pf60Var.f152157b, new qcj() { // from class: l.nc70
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f141321a.m97054R0((User) obj);
                    }
                }));
                jyb.m147478I(this.f69793b, new Comparator() { // from class: l.pc70
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ad70.m97044x0((User) obj, (User) obj2);
                    }
                });
                ((hd70) this.viewModel).m134572c(this.f69793b);
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ Boolean m97056U0(User user) {
        return Boolean.valueOf((this.f69793b.contains(user) || user.localFollowship == null) ? false : true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m97057V0(pf60 pf60Var) {
        if (NullChecker.m82487b(pf60Var)) {
            PhotoAlbumFallsFeedFrag.f42047I = (Links) pf60Var.f152156a;
            if (NullChecker.m82487b(pf60Var.f152157b)) {
                this.f69793b.addAll(jyb.m147522n((Collection) pf60Var.f152157b, new qcj() { // from class: l.qc70
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f156559a.m97056U0((User) obj);
                    }
                }));
                jyb.m147478I(this.f69793b, new Comparator() { // from class: l.rc70
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ad70.m97037o0((User) obj, (User) obj2);
                    }
                });
                ((hd70) this.viewModel).m134572c(this.f69793b);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m97058W0() {
        if ("fans".equals(this.f69794c) || "activities_fans".equals(this.f69794c)) {
            duringCreated(FeedModule.f39703d.m145673c7()).subscribe(psd0.m173597H(new y20() { // from class: l.wc70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188394a.m97052P0((pf60) obj);
                }
            }, new y20() { // from class: l.xc70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f193272a.m97053Q0((Throwable) obj);
                }
            }));
        } else {
            duringCreated(this.f69796e.m108705c()).subscribe(psd0.m173597H(new y20() { // from class: l.yc70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f198395a.m97050N0((pf60) obj);
                }
            }, new y20() { // from class: l.zc70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203739a.m97051O0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m97059X0(pf60<Links, List<User>> pf60Var) {
        this.f69793b.clear();
        PhotoAlbumFallsFeedFrag.f42047I = pf60Var.f152156a;
        this.f69793b.addAll(jyb.m147522n(pf60Var.f152157b, new qcj() { // from class: l.kc70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf((user.f56859id.equals(FeedModule.m61405F().userId()) || user.localFollowship == null) ? false : true);
            }
        }));
        if (this.f69794c.equals("fans") || this.f69794c.equals("activities_fans")) {
            jyb.m147478I(this.f69793b, new Comparator() { // from class: l.lc70
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ad70.m97042t0((User) obj, (User) obj2);
                }
            });
        } else {
            jyb.m147478I(this.f69793b, new Comparator() { // from class: l.mc70
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ad70.m97021C0((User) obj, (User) obj2);
                }
            });
        }
        ((hd70) this.viewModel).m134572c(this.f69793b);
        m97060Y0();
    }

    /* JADX INFO: renamed from: Y0 */
    public void m97060Y0() {
        if ("fans".equals(this.f69794c) || FollowshipStatus.following.equals(this.f69794c)) {
            mrb0.m159635M(uqb0.f180396b0.f170324a.userId());
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.dc70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87756a.m97023G0((Bundle) obj);
            }
        });
        duringCreated(new pcj() { // from class: l.oc70
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f146665a.m97024H0();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.sc70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167198a.m97025I0((pf60) obj);
            }
        }, new y20() { // from class: l.tc70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173213a.m97026J0((Throwable) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.uc70
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return FeedModule.f39703d.f121322Q0;
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.vc70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183341a.m97049L0((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a1 */
    public void m97061a1() {
        if (this.f69795d) {
            FeedModule.f39703d.m145770pd();
        } else {
            duringCreated(mrb0.m159656j()).subscribe(psd0.m173596G(new y20() { // from class: l.ec70
                @Override // p153l.y20
                public final void call(Object obj) {
                    ad70.m97022D0((Counter) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m97062e(int i) {
        if (i < this.f69793b.size() - 4 || this.f69793b.size() <= 0 || !m97047E0(PhotoAlbumFallsFeedFrag.f42047I)) {
            return;
        }
        if (this.f69794c.equals("fans") || this.f69794c.equals("activities_fans")) {
            duringCreated(this.f69796e.m108703a(PhotoAlbumFallsFeedFrag.f42047I)).subscribe(psd0.m173597H(new y20() { // from class: l.fc70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f98199a.m97055S0((pf60) obj);
                }
            }, new y20() { // from class: l.gc70
                @Override // p153l.y20
                public final void call(Object obj) {
                    ad70.m97036n0((Throwable) obj);
                }
            }));
        } else {
            duringCreated(this.f69796e.m108704b(PhotoAlbumFallsFeedFrag.f42047I)).subscribe(psd0.m173597H(new y20() { // from class: l.hc70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f108679a.m97057V0((pf60) obj);
                }
            }, new y20() { // from class: l.ic70
                @Override // p153l.y20
                public final void call(Object obj) {
                    ad70.m97033k0((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}

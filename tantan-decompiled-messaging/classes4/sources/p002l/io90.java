package p002l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.ProfileListFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p000p1.mobile.putong.core.p001ui.profile.views.VPager_SquaredRefactor;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CategorySuggestions;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.au2;
import l.d30;
import l.grk;
import l.ick0;
import l.j760;
import l.upa;
import l.vwb;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class io90 implements b1m {

    /* JADX INFO: renamed from: a */
    public int f13323a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f13324b = false;

    /* JADX INFO: renamed from: c */
    public boolean f13325c = false;

    /* JADX INFO: renamed from: d */
    public int f13326d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f13327e = false;

    /* JADX INFO: renamed from: f */
    public boolean f13328f = false;

    /* JADX INFO: renamed from: g */
    public j760<Integer, Integer> f13329g;

    /* JADX INFO: renamed from: h */
    public View f13330h;

    /* JADX INFO: renamed from: i */
    public vi90 f13331i;

    /* JADX INFO: renamed from: j */
    public ProfileListFragLocalImpl f13332j;

    public io90(vi90 vi90Var) {
        this.f13331i = vi90Var;
        ProfileListFragLocalImpl profileListFragLocalImplM23981c = vi90Var.m23981c();
        this.f13332j = profileListFragLocalImplM23981c;
        if (profileListFragLocalImplM23981c == null) {
            au2.w(new IllegalStateException("Profile Frag is Null"));
        }
        this.f13330h = new View(vi90Var.f21143g);
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: B1 */
    public List<View> mo2581B1() {
        return vwb.f0(new View[]{this.f13332j.m3223g5().f9696e});
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: B2 */
    public View mo2582B2() {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: C2 */
    public CategorySuggestions mo1498C2() {
        return ProfileListFrag.f1432I4;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: C3 */
    public View mo2588C3() {
        return this.f13332j.m3223g5().f9706o.m3348M0();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: D2 */
    public boolean mo1501D2() {
        return true;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: E1 */
    public boolean mo2600E1() {
        return !"live_profile_voice_mask_mode".equals(this.f13331i.f21138b);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: E2 */
    public j760<Integer, Integer> mo2601E2() {
        return this.f13329g;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: F */
    public View mo2606F() {
        return this.f13332j.m3223g5().f9698g.getChildAt(0);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: F1 */
    public User mo1506F1(boolean z) {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: G */
    public void mo1508G(View... viewArr) {
        for (View view : viewArr) {
            xdl0.E0(view, m15266l(this.f13331i.f21137a));
        }
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: G0 */
    public boolean mo2612G0(User user) {
        return this.f13331i.m23962J();
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: H0 */
    public void mo2617H0(int i) {
        this.f13326d = i;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: H1 */
    public View mo2618H1() {
        return (View) m15265k(this.f13332j.m3223g5().f9706o.f1829G);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: H2 */
    public LayoutInflater mo9267H2() {
        return this.f13332j.H2();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: H3 */
    public j760<List<Literatures>, List<LiteraturesComments>> mo1510H3() {
        return this.f13332j.m3217c5().f22794c;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: I1 */
    public boolean mo2625I1() {
        return true;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: J */
    public View mo2632J() {
        return m15261g(ProfileButton.ProfileButtonType.Dislike);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: J1 */
    public PutongFrag mo1514J1() {
        return this.f13331i.m23981c();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: J3 */
    public void mo1515J3() {
        this.f13332j.m3217c5().m26612W2();
    }

    @Override // p002l.c5m
    /* JADX INFO: renamed from: K2 */
    public User mo1517K2() {
        return this.f13332j.m3217c5().m26618Z2();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: K3 */
    public int mo2639K3() {
        return this.f13323a;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: M */
    public boolean mo2651M() {
        if (upa.V1()) {
            return TextUtils.equals(this.f13331i.f21138b, "chat_group_anonymity") || TextUtils.equals(this.f13331i.f21138b, "chat_group");
        }
        return false;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: M0 */
    public View mo2652M0() {
        return this.f13332j.m3223g5().f9695d;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: N2 */
    public boolean mo2659N2() {
        return this.f13331i.m23964L();
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: N3 */
    public View mo2660N3() {
        return m15261g(ProfileButton.ProfileButtonType.CityGreet);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: O1 */
    public boolean mo2665O1() {
        return "home_card".equals(this.f13331i.f21138b);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: P */
    public boolean mo2672P(String str) {
        return this.f13331i.m23969Q();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: P1 */
    public boolean mo1523P1() {
        return this.f13331i.m23963K();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: Q */
    public boolean mo2679Q() {
        return ("from_guess_liker_result".equals(this.f13331i.f21138b) || this.f13331i.m23997t() || "likers".equals(this.f13331i.f21138b) || "from_boost_refactor".equals(this.f13331i.f21138b)) ? false : true;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: Q2 */
    public View mo2680Q2() {
        return (View) m15265k(this.f13332j.m3223g5().f9706o.f1885y);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: R */
    public boolean mo1526R() {
        return ((Boolean) CoreModule.c.m0.x0.get()).booleanValue();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: R0 */
    public boolean mo1527R0() {
        return act() instanceof NewUI1ContainerActivity;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: R1 */
    public void mo2687R1(int i) {
        this.f13332j.m3223g5().m12393R0(i);
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: R2 */
    public View mo2688R2() {
        return (View) m15265k(this.f13332j.m3223g5().f9706o.f1843N);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: R3 */
    public void m1521N6() {
        this.f13332j.m3217c5().m26587D1();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: S */
    public boolean mo1530S() {
        return true;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: S1 */
    public View mo2693S1() {
        hh90 hh90VarM12401W = this.f13332j.m3223g5().m12401W();
        return (NullChecker.a(hh90VarM12401W) && hh90VarM12401W.m14368d().m2923a() == LayoutDesc.ComboType.SuperLike_Match) ? this.f13330h : m15261g(ProfileButton.ProfileButtonType.SuperLike);
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: S2 */
    public void mo2694S2(boolean z) {
        this.f13327e = z;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: U */
    public xdl0.g mo2707U() {
        int childCount = this.f13332j.m3223g5().f9696e.getChildCount();
        ProfileListFragLocalImpl profileListFragLocalImpl = this.f13332j;
        return childCount > 2 ? xdl0.i0(profileListFragLocalImpl.m3223g5().f9696e.getChildAt(1)) : xdl0.i0(profileListFragLocalImpl.m3223g5().f9696e);
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: U0 */
    public PictureView mo2708U0() {
        return this.f13332j.m3223g5().f9706o.m3354P0();
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: U2 */
    public void mo2709U2() {
        this.f13332j.m3223g5().m12383K0();
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: V0 */
    public void mo2716V0(boolean z) {
        this.f13328f = z;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: V2 */
    public RelationshipStatus mo2717V2() {
        return this.f13331i.f21141e.f21164m;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: W */
    public RecyclerView mo2724W() {
        return this.f13332j.m3223g5().f9696e;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: W2 */
    public View mo2725W2() {
        return this.f13330h;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: X1 */
    public boolean mo2731X1() {
        return this.f13324b;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: Y0 */
    public ViewGroup mo1537Y0() {
        return this.f13332j.m3223g5().f9696e;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: Z */
    public void mo2744Z(final int i) {
        this.f13332j.m3223g5().f9707p.mo14451a(new d30() { // from class: l.do90
            public final void call() {
                this.f9371a.m15264j(i);
            }
        });
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: Z1 */
    public boolean mo2745Z1() {
        return false;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: Z2 */
    public int mo1540Z2() {
        return 0;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: a0 */
    public boolean mo2751a0() {
        return this.f13328f;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: c0 */
    public int mo2761c0() {
        return this.f13332j.m3223g5().m12394S();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: c3 */
    public boolean mo2762c3(User user) {
        return false;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: d1 */
    public int mo2768d1() {
        int i = this.f13326d;
        this.f13326d = -1;
        return i;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: e2 */
    public void mo2775e2() {
        this.f13332j.m3223g5().f9706o.mo14451a(new d30() { // from class: l.ho90
            public final void call() {
                this.f12191a.m15262h();
            }
        });
    }

    @Override // p002l.bml
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Act act() {
        return this.f13331i.m23979a();
    }

    @Override // p002l.a1m
    public String from() {
        return this.f13331i.f21138b;
    }

    /* JADX INFO: renamed from: g */
    public final View m15261g(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButtonM12398U = this.f13332j.m3223g5().m12398U(profileButtonType);
        return NullChecker.a(profileButtonM12398U) ? profileButtonM12398U.m2926a() : this.f13330h;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: g3 */
    public boolean mo1556g3() {
        return true;
    }

    @Override // p002l.a1m
    public Context getContext() {
        return mo1514J1().getContext();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m15262h() {
        this.f13332j.m3223g5().f9706o.f1884x.b0();
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: h2 */
    public View mo2793h2() {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: h3 */
    public void mo1559h3() {
        this.f13332j.m3217c5().m26614X2();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m15263i(User user, View view) {
        this.f13332j.m3217c5().m26610V2(user);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: i3 */
    public int mo1562i3() {
        return this.f13332j.m3223g5().m12387O0();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m15264j(int i) {
        this.f13332j.m3223g5().f9707p.f13755v.setVisibility(i);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: j3 */
    public void mo1564j3(int i) {
        this.f13332j.m3217c5().m26589E1(i);
    }

    /* JADX INFO: renamed from: k */
    public <T> T m15265k(T t) {
        if (t != null) {
            return t;
        }
        ick0.a();
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: k0 */
    public void mo9269k0(Intent intent, a.a aVar) {
        this.f13332j.k0(intent, aVar);
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: k3 */
    public void mo2809k3() {
        this.f13332j.m3223g5().m12382J0();
    }

    /* JADX INFO: renamed from: l */
    public View.OnClickListener m15266l(final User user) {
        return new View.OnClickListener() { // from class: l.go90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11561a.m15263i(user, view);
            }
        };
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: l2 */
    public void mo2815l2(boolean z) {
        this.f13324b = z;
    }

    @Override // p002l.a1m
    public c<com.p1.mobile.android.app.c> lifecycle() {
        return mo1514J1().lifecycle();
    }

    @Override // p002l.a1m
    public com.p1.mobile.android.app.c lifecycle_() {
        return this.f13332j.lifecycle_();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: m0 */
    public boolean mo1570m0() {
        return false;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: m2 */
    public void mo2820m2(final int i, final boolean z) {
        final ProfileImagesItemHolder profileImagesItemHolder = this.f13332j.m3223g5().f9706o;
        profileImagesItemHolder.m14452b(new d30() { // from class: l.eo90
            public final void call() {
                profileImagesItemHolder.m3344J1(i, z);
            }
        });
        profileImagesItemHolder.mo14451a(new d30() { // from class: l.fo90
            public final void call() {
                profileImagesItemHolder.m3344J1(i, z);
            }
        });
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: m3 */
    public boolean mo2821m3(User user) {
        return false;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: me */
    public User mo2827me() {
        return this.f13332j.m3217c5().m26606R2();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: o */
    public void mo1575o() {
        this.f13332j.m3217c5().m26608U2();
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: o0 */
    public View mo2833o0() {
        return m15261g(ProfileButton.ProfileButtonType.Like);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: o1 */
    public boolean mo2834o1() {
        return this.f13327e;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: o2 */
    public void mo2835o2() {
        this.f13332j.m3223g5().m12381I0();
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: o3 */
    public View mo2836o3() {
        return this.f13332j.m3223g5().f9706o.f1826E0;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: p */
    public ViewGroup mo1577p() {
        return this.f13332j.m3223g5().f9693b;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: p1 */
    public void mo2842p1(boolean z) {
        this.f13325c = z;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: p2 */
    public boolean mo2843p2() {
        return false;
    }

    @Override // p002l.a1m
    public String pageId() {
        return this.f13332j.pageId();
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: q2 */
    public View mo2848q2() {
        return this.f13332j.m3223g5().m12401W().mo13303c();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: q3 */
    public boolean mo2849q3() {
        return (this.f13331i.m23992o() || this.f13331i.m23958F()) ? false : true;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public PictureView mo2855r3(int i) {
        ProfileImagesItemHolder profileImagesItemHolder = this.f13332j.m3223g5().f9706o;
        PictureView pictureViewM3337G0 = profileImagesItemHolder.m3337G0(i);
        if (pictureViewM3337G0 instanceof PictureView) {
            return pictureViewM3337G0;
        }
        if (profileImagesItemHolder.m3337G0(0) instanceof PictureView) {
            return profileImagesItemHolder.m3337G0(0);
        }
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: s1 */
    public boolean mo2860s1() {
        return this.f13331i.f21141e.f21157f;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: s2 */
    public LikedUser mo2861s2() {
        return this.f13331i.f21141e.f21166o;
    }

    @Override // p002l.a1m
    public void startActivity(Intent intent) {
        this.f13332j.startActivity(intent);
    }

    @Override // p002l.a1m
    public void startActivityForResult(Intent intent, int i) {
        this.f13332j.startActivityForResult(intent, i);
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: u2 */
    public VPager_SquaredRefactor mo2873u2() {
        return this.f13332j.m3223g5().f9706o.f1884x;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: u3 */
    public void mo2874u3(int i) {
        this.f13323a = i;
    }

    @Override // p002l.c5m
    public String userId() {
        return this.f13331i.f21140d;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: v1 */
    public boolean mo2880v1() {
        return this.f13325c;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: v2 */
    public boolean mo2881v2() {
        if (upa.V1()) {
            return TextUtils.equals(this.f13331i.f21138b, "chat_group_anonymity") || TextUtils.equals(this.f13331i.f21138b, "group_notification_anonymity");
        }
        return false;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: w3 */
    public View mo2887w3() {
        return this.f13332j.m3223g5().f9706o.f1823C;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: y0 */
    public String mo2897y0() {
        if (!this.f13331i.m23957E()) {
            return "";
        }
        vi90.C0862a c0862a = this.f13331i.f21141e;
        return grk.a(c0862a.f21155d, c0862a.f21156e);
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: y1 */
    public View mo2898y1() {
        return (View) m15265k(this.f13332j.m3223g5().f9706o.f1886z);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: y2 */
    public boolean mo2899y2() {
        return true;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: y3 */
    public void mo2900y3(j760<Integer, Integer> j760Var) {
        this.f13329g = j760Var;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: E */
    public void mo1504E() {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: t1 */
    public void mo2867t1() {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: p3 */
    public void mo1578p3(int i, Media media) {
    }
}

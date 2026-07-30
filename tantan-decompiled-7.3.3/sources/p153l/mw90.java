package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CategorySuggestions;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p051p1.mobile.putong.core.p058ui.profile.views.VPager_SquaredRefactor;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class mw90 implements u3m {

    /* JADX INFO: renamed from: a */
    public int f139037a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f139038b = false;

    /* JADX INFO: renamed from: c */
    public boolean f139039c = false;

    /* JADX INFO: renamed from: d */
    public int f139040d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f139041e = false;

    /* JADX INFO: renamed from: f */
    public boolean f139042f = false;

    /* JADX INFO: renamed from: g */
    public pf60<Integer, Integer> f139043g;

    /* JADX INFO: renamed from: h */
    public View f139044h;

    /* JADX INFO: renamed from: i */
    public zq90 f139045i;

    /* JADX INFO: renamed from: j */
    public ProfileListFragLocalImpl f139046j;

    public mw90(zq90 zq90Var) {
        this.f139045i = zq90Var;
        ProfileListFragLocalImpl profileListFragLocalImpl = (ProfileListFragLocalImpl) zq90Var.m220976c();
        this.f139046j = profileListFragLocalImpl;
        if (profileListFragLocalImpl == null) {
            qu2.m178128w(new IllegalStateException("Profile Frag is Null"));
        }
        this.f139044h = new View(zq90Var.f205582g);
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: B1 */
    public List<View> mo53236B1() {
        return jyb.m147507f0(this.f139046j.m53856g5().f115724e);
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: B2 */
    public View mo53237B2() {
        return null;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: C2 */
    public CategorySuggestions mo52233C2() {
        return ProfileListFrag.f34458I4;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: C3 */
    public View mo53243C3() {
        return this.f139046j.m53856g5().f115734o.m53980M0();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: D2 */
    public boolean mo52236D2() {
        return true;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: E1 */
    public boolean mo53254E1() {
        return !"live_profile_voice_mask_mode".equals(this.f139045i.f205577b);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: E2 */
    public pf60<Integer, Integer> mo53255E2() {
        return this.f139043g;
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: F */
    public View mo53260F() {
        return this.f139046j.m53856g5().f115726g.getChildAt(0);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: F1 */
    public User mo52241F1(boolean z) {
        return null;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: G */
    public void mo52243G(View... viewArr) {
        for (View view : viewArr) {
            bnl0.m105509E0(view, m160474l(this.f139045i.f205576a));
        }
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: G0 */
    public boolean mo53266G0(User user) {
        return this.f139045i.m220957J();
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: H0 */
    public void mo53271H0(int i) {
        this.f139040d = i;
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: H1 */
    public View mo53272H1() {
        return (View) m160473k(this.f139046j.m53856g5().f115734o.f34855G);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: H2 */
    public LayoutInflater mo146493H2() {
        return this.f139046j.mo21577H2();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: H3 */
    public pf60<List<Literatures>, List<LiteraturesComments>> mo52245H3() {
        return this.f139046j.m53852c5().f82358c;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: I1 */
    public boolean mo53279I1() {
        return true;
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: J */
    public View mo53286J() {
        return m160469g(ProfileButton.ProfileButtonType.Dislike);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: J1 */
    public PutongFrag mo52249J1() {
        return this.f139045i.m220976c();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: J3 */
    public void mo52250J3() {
        this.f139046j.m53852c5().m110557W2();
    }

    @Override // p153l.s7m
    /* JADX INFO: renamed from: K2 */
    public User mo52252K2() {
        return this.f139046j.m53852c5().m110562Z2();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: K3 */
    public int mo53293K3() {
        return this.f139037a;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: M */
    public boolean mo53305M() {
        if (gra.m131637V1()) {
            return TextUtils.equals(this.f139045i.f205577b, "chat_group_anonymity") || TextUtils.equals(this.f139045i.f205577b, "chat_group");
        }
        return false;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: M0 */
    public View mo53306M0() {
        return this.f139046j.m53856g5().f115723d;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: N2 */
    public boolean mo53313N2() {
        return this.f139045i.m220959L();
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: N3 */
    public View mo53314N3() {
        return m160469g(ProfileButton.ProfileButtonType.CityGreet);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: O1 */
    public boolean mo53319O1() {
        return "home_card".equals(this.f139045i.f205577b);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: P */
    public boolean mo53326P(String str) {
        return this.f139045i.m220964Q();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: P1 */
    public boolean mo52258P1() {
        return this.f139045i.m220958K();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: Q */
    public boolean mo53333Q() {
        return ("from_guess_liker_result".equals(this.f139045i.f205577b) || this.f139045i.m220992t() || "likers".equals(this.f139045i.f205577b) || "from_boost_refactor".equals(this.f139045i.f205577b)) ? false : true;
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: Q2 */
    public View mo53334Q2() {
        return (View) m160473k(this.f139046j.m53856g5().f115734o.f34911y);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: R */
    public boolean mo52261R() {
        return CoreModule.f18264c.f20405m0.f20205x0.get().booleanValue();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: R0 */
    public boolean mo52262R0() {
        return act() instanceof NewUI1ContainerActivity;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: R1 */
    public void mo53341R1(int i) {
        this.f139046j.m53856g5().m140864R0(i);
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: R2 */
    public View mo53342R2() {
        return (View) m160473k(this.f139046j.m53856g5().f115734o.f34869N);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: R3 */
    public void m53521tc() {
        this.f139046j.m53852c5().m110532D1();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: S */
    public boolean mo52265S() {
        return true;
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: S1 */
    public View mo53347S1() {
        lp90 lp90VarM140872W = this.f139046j.m53856g5().m140872W();
        return (NullChecker.m82486a(lp90VarM140872W) && lp90VarM140872W.m155166d().m53572a() == LayoutDesc.ComboType.SuperLike_Match) ? this.f139044h : m160469g(ProfileButton.ProfileButtonType.SuperLike);
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: S2 */
    public void mo53348S2(boolean z) {
        this.f139041e = z;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: U */
    public bnl0.C16067g mo53361U() {
        int childCount = this.f139046j.m53856g5().f115724e.getChildCount();
        ProfileListFragLocalImpl profileListFragLocalImpl = this.f139046j;
        return childCount > 2 ? bnl0.m105560i0(profileListFragLocalImpl.m53856g5().f115724e.getChildAt(1)) : bnl0.m105560i0(profileListFragLocalImpl.m53856g5().f115724e);
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: U0 */
    public PictureView mo53362U0() {
        return this.f139046j.m53856g5().f115734o.m53986P0();
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: U2 */
    public void mo53363U2() {
        this.f139046j.m53856g5().m140854K0();
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: V0 */
    public void mo53370V0(boolean z) {
        this.f139042f = z;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: V2 */
    public RelationshipStatus mo53371V2() {
        return this.f139045i.f205580e.f205603m;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: W */
    public RecyclerView mo53378W() {
        return this.f139046j.m53856g5().f115724e;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: W2 */
    public View mo53379W2() {
        return this.f139044h;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: X1 */
    public boolean mo53385X1() {
        return this.f139038b;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: Y0 */
    public ViewGroup mo52272Y0() {
        return this.f139046j.m53856g5().f115724e;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: Z */
    public void mo53398Z(final int i) {
        this.f139046j.m53856g5().f115735p.mo168208a(new x20() { // from class: l.hw90
            @Override // p153l.x20
            public final void call() {
                this.f111880a.m160472j(i);
            }
        });
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: Z1 */
    public boolean mo53399Z1() {
        return false;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: Z2 */
    public int mo52275Z2() {
        return 0;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: a0 */
    public boolean mo53405a0() {
        return this.f139042f;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: c0 */
    public int mo53415c0() {
        return this.f139046j.m53856g5().m140865S();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: c3 */
    public boolean mo53416c3(User user) {
        return false;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: d1 */
    public int mo53422d1() {
        int i = this.f139040d;
        this.f139040d = -1;
        return i;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: e2 */
    public void mo53428e2() {
        this.f139046j.m53856g5().f115734o.mo168208a(new x20() { // from class: l.lw90
            @Override // p153l.x20
            public final void call() {
                this.f133790a.m160470h();
            }
        });
    }

    @Override // p153l.nol
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Act act() {
        return this.f139045i.m220974a();
    }

    @Override // p153l.t3m
    public String from() {
        return this.f139045i.f205577b;
    }

    /* JADX INFO: renamed from: g */
    public final View m160469g(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButtonM140869U = this.f139046j.m53856g5().m140869U(profileButtonType);
        return NullChecker.m82486a(profileButtonM140869U) ? profileButtonM140869U.m53575a() : this.f139044h;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: g3 */
    public boolean mo52289g3() {
        return true;
    }

    @Override // p153l.t3m
    public Context getContext() {
        return mo52249J1().getContext();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m160470h() {
        this.f139046j.m53856g5().f115734o.f34910x.m224386b0();
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: h2 */
    public View mo53444h2() {
        return null;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: h3 */
    public void mo52291h3() {
        this.f139046j.m53852c5().m110559X2();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m160471i(User user, View view) {
        this.f139046j.m53852c5().m110555V2(user);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: i3 */
    public int mo52294i3() {
        return this.f139046j.m53856g5().m140858O0();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m160472j(int i) {
        this.f139046j.m53856g5().f115735p.f142965v.setVisibility(i);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: j3 */
    public void mo52296j3(int i) {
        this.f139046j.m53852c5().m110534E1(i);
    }

    /* JADX INFO: renamed from: k */
    public <T> T m160473k(T t) {
        if (t != null) {
            return t;
        }
        olk0.m168132a();
        return null;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: k0 */
    public void mo146496k0(Intent intent, C4468a.a aVar) {
        this.f139046j.m21589k0(intent, aVar);
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: k3 */
    public void mo53460k3() {
        this.f139046j.m53856g5().m140853J0();
    }

    /* JADX INFO: renamed from: l */
    public View.OnClickListener m160474l(final User user) {
        return new View.OnClickListener() { // from class: l.kw90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129041a.m160471i(user, view);
            }
        };
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: l2 */
    public void mo53466l2(boolean z) {
        this.f139038b = z;
    }

    @Override // p153l.t3m
    public C22421c<C4470c> lifecycle() {
        return mo52249J1().lifecycle();
    }

    @Override // p153l.t3m
    public C4470c lifecycle_() {
        return this.f139046j.lifecycle_();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: m0 */
    public boolean mo52302m0() {
        return false;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: m2 */
    public void mo53471m2(final int i, final boolean z) {
        final ProfileImagesItemHolder profileImagesItemHolder = this.f139046j.m53856g5().f115734o;
        profileImagesItemHolder.m168312b(new x20() { // from class: l.iw90
            @Override // p153l.x20
            public final void call() {
                profileImagesItemHolder.m53976J1(i, z);
            }
        });
        profileImagesItemHolder.mo168208a(new x20() { // from class: l.jw90
            @Override // p153l.x20
            public final void call() {
                profileImagesItemHolder.m53976J1(i, z);
            }
        });
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: m3 */
    public boolean mo53472m3(User user) {
        return false;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: me */
    public User mo53478me() {
        return this.f139046j.m53852c5().m110551R2();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: o */
    public void mo52306o() {
        this.f139046j.m53852c5().m110553U2();
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: o0 */
    public View mo53483o0() {
        return m160469g(ProfileButton.ProfileButtonType.Like);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: o1 */
    public boolean mo53484o1() {
        return this.f139041e;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: o2 */
    public void mo53485o2() {
        this.f139046j.m53856g5().m140852I0();
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: o3 */
    public View mo53486o3() {
        return this.f139046j.m53856g5().f115734o.f34852E0;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: p1 */
    public void mo53492p1(boolean z) {
        this.f139039c = z;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: p2 */
    public boolean mo53493p2() {
        return false;
    }

    @Override // p153l.t3m
    public String pageId() {
        return this.f139046j.pageId();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: q */
    public ViewGroup mo52310q() {
        return this.f139046j.m53856g5().f115721b;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: q2 */
    public View mo53498q2() {
        return this.f139046j.m53856g5().m140872W().mo155165c();
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: q3 */
    public boolean mo53499q3() {
        return (this.f139045i.m220987o() || this.f139045i.m220953F()) ? false : true;
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public PictureView mo53505r3(int i) {
        ProfileImagesItemHolder profileImagesItemHolder = this.f139046j.m53856g5().f115734o;
        View viewM53969G0 = profileImagesItemHolder.m53969G0(i);
        if (viewM53969G0 instanceof PictureView) {
            return (PictureView) viewM53969G0;
        }
        if (profileImagesItemHolder.m53969G0(0) instanceof PictureView) {
            return (PictureView) profileImagesItemHolder.m53969G0(0);
        }
        return null;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: s1 */
    public boolean mo53510s1() {
        return this.f139045i.f205580e.f205596f;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: s2 */
    public LikedUser mo53511s2() {
        return this.f139045i.f205580e.f205605o;
    }

    @Override // p153l.t3m
    public void startActivity(Intent intent) {
        this.f139046j.startActivity(intent);
    }

    @Override // p153l.t3m
    public void startActivityForResult(Intent intent, int i) {
        this.f139046j.startActivityForResult(intent, i);
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: u2 */
    public VPager_SquaredRefactor mo53523u2() {
        return this.f139046j.m53856g5().f115734o.f34910x;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: u3 */
    public void mo53524u3(int i) {
        this.f139037a = i;
    }

    @Override // p153l.s7m
    public String userId() {
        return this.f139045i.f205579d;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: v1 */
    public boolean mo53530v1() {
        return this.f139039c;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: v2 */
    public boolean mo53531v2() {
        if (gra.m131637V1()) {
            return TextUtils.equals(this.f139045i.f205577b, "chat_group_anonymity") || TextUtils.equals(this.f139045i.f205577b, "group_notification_anonymity");
        }
        return false;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: w3 */
    public View mo53537w3() {
        return this.f139046j.m53856g5().f115734o.f34849C;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: y0 */
    public String mo53547y0() {
        if (!this.f139045i.m220952E()) {
            return "";
        }
        zq90.C21863a c21863a = this.f139045i.f205580e;
        return wtk.m207893a(c21863a.f205594d, c21863a.f205595e);
    }

    @Override // p153l.q3m
    @Nullable
    /* JADX INFO: renamed from: y1 */
    public View mo53548y1() {
        return (View) m160473k(this.f139046j.m53856g5().f115734o.f34912z);
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: y2 */
    public boolean mo53549y2() {
        return true;
    }

    @Override // p153l.q3m
    /* JADX INFO: renamed from: y3 */
    public void mo53550y3(pf60<Integer, Integer> pf60Var) {
        this.f139043g = pf60Var;
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: E */
    public void mo52239E() {
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: t1 */
    public void mo53517t1() {
    }

    @Override // p153l.t3m
    /* JADX INFO: renamed from: p3 */
    public void mo52308p3(int i, Media media) {
    }
}

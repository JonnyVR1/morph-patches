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
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p000p1.mobile.putong.core.p001ui.profile.views.VPager_SquaredRefactor;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CategorySuggestions;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.grk;
import l.j760;
import l.upa;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bhf0 implements b1m {

    /* JADX INFO: renamed from: a */
    public int f8136a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f8137b = false;

    /* JADX INFO: renamed from: c */
    public boolean f8138c = false;

    /* JADX INFO: renamed from: d */
    public int f8139d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f8140e = false;

    /* JADX INFO: renamed from: f */
    public boolean f8141f = false;

    /* JADX INFO: renamed from: g */
    public j760<Integer, Integer> f8142g;

    /* JADX INFO: renamed from: h */
    public vi90 f8143h;

    public bhf0(vi90 vi90Var) {
        this.f8143h = vi90Var;
    }

    /* JADX INFO: renamed from: b */
    private View m10334b(ProfileButton.ProfileButtonType profileButtonType) {
        return null;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: B1 */
    public List<View> mo2581B1() {
        return null;
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
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: D2 */
    public boolean mo1501D2() {
        return true;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: E1 */
    public boolean mo2600E1() {
        return !"live_profile_voice_mask_mode".equals(this.f8143h.f21138b);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: E2 */
    public j760<Integer, Integer> mo2601E2() {
        return this.f8142g;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: F */
    public View mo2606F() {
        return null;
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
            xdl0.E0(view, m10336c(this.f8143h.f21137a));
        }
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: G0 */
    public boolean mo2612G0(User user) {
        return this.f8143h.m23962J();
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: H0 */
    public void mo2617H0(int i) {
        this.f8139d = i;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: H1 */
    public View mo2618H1() {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: H2 */
    public LayoutInflater mo9267H2() {
        return LayoutInflater.from(this.f8143h.f21143g);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: H3 */
    public j760<List<Literatures>, List<LiteraturesComments>> mo1510H3() {
        return null;
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
        return m10334b(ProfileButton.ProfileButtonType.Dislike);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: J1 */
    public PutongFrag mo1514J1() {
        return this.f8143h.m23981c();
    }

    @Override // p002l.c5m
    /* JADX INFO: renamed from: K2 */
    public User mo1517K2() {
        return this.f8143h.f21137a;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: K3 */
    public int mo2639K3() {
        return this.f8136a;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: M */
    public boolean mo2651M() {
        if (upa.V1()) {
            return TextUtils.equals(this.f8143h.f21138b, "chat_group_anonymity") || TextUtils.equals(this.f8143h.f21138b, "chat_group");
        }
        return false;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: M0 */
    public View mo2652M0() {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: N2 */
    public boolean mo2659N2() {
        return this.f8143h.m23964L();
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: N3 */
    public View mo2660N3() {
        return m10334b(ProfileButton.ProfileButtonType.CityGreet);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: O1 */
    public boolean mo2665O1() {
        return "home_card".equals(this.f8143h.f21138b);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: P */
    public boolean mo2672P(String str) {
        return this.f8143h.m23969Q();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: P1 */
    public boolean mo1523P1() {
        return this.f8143h.m23963K();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: Q */
    public boolean mo2679Q() {
        return ("from_guess_liker_result".equals(this.f8143h.f21138b) || this.f8143h.m23997t() || "likers".equals(this.f8143h.f21138b) || "from_boost_refactor".equals(this.f8143h.f21138b)) ? false : true;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: Q2 */
    public View mo2680Q2() {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: R */
    public boolean mo1526R() {
        return ((Boolean) CoreModule.c.m0.x0.get()).booleanValue();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: R0 */
    public boolean mo1527R0() {
        return false;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: R2 */
    public View mo2688R2() {
        return null;
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
        return null;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: S2 */
    public void mo2694S2(boolean z) {
        this.f8140e = z;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: U */
    public xdl0.g mo2707U() {
        return null;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: U0 */
    public PictureView mo2708U0() {
        return null;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: V0 */
    public void mo2716V0(boolean z) {
        this.f8141f = z;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: V2 */
    public RelationshipStatus mo2717V2() {
        return this.f8143h.f21141e.f21164m;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: W */
    public RecyclerView mo2724W() {
        return null;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: W2 */
    public View mo2725W2() {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: X1 */
    public boolean mo2731X1() {
        return this.f8137b;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: Y0 */
    public ViewGroup mo1537Y0() {
        return null;
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

    @Override // p002l.bml
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Act act() {
        return this.f8143h.m23979a();
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: a0 */
    public boolean mo2751a0() {
        return this.f8141f;
    }

    /* JADX INFO: renamed from: c */
    public View.OnClickListener m10336c(User user) {
        return null;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: c0 */
    public int mo2761c0() {
        return 0;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: c3 */
    public boolean mo2762c3(User user) {
        return false;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: d1 */
    public int mo2768d1() {
        int i = this.f8139d;
        this.f8139d = -1;
        return i;
    }

    @Override // p002l.a1m
    public String from() {
        return this.f8143h.f21138b;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: g3 */
    public boolean mo1556g3() {
        return true;
    }

    @Override // p002l.a1m
    public Context getContext() {
        return this.f8143h.f21143g;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: h2 */
    public View mo2793h2() {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: i3 */
    public int mo1562i3() {
        return 0;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: l2 */
    public void mo2815l2(boolean z) {
        this.f8137b = z;
    }

    @Override // p002l.a1m
    public c<com.p1.mobile.android.app.c> lifecycle() {
        return mo1514J1() != null ? mo1514J1().lifecycle() : act().lifecycle();
    }

    @Override // p002l.a1m
    public com.p1.mobile.android.app.c lifecycle_() {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: m0 */
    public boolean mo1570m0() {
        return false;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: m3 */
    public boolean mo2821m3(User user) {
        return false;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: me */
    public User mo2827me() {
        return null;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: o0 */
    public View mo2833o0() {
        return m10334b(ProfileButton.ProfileButtonType.Like);
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: o1 */
    public boolean mo2834o1() {
        return this.f8140e;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: o3 */
    public View mo2836o3() {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: p */
    public ViewGroup mo1577p() {
        return null;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: p1 */
    public void mo2842p1(boolean z) {
        this.f8138c = z;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: p2 */
    public boolean mo2843p2() {
        return false;
    }

    @Override // p002l.a1m
    public String pageId() {
        return null;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: q2 */
    public View mo2848q2() {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: q3 */
    public boolean mo2849q3() {
        return (this.f8143h.m23992o() || this.f8143h.m23958F()) ? false : true;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public PictureView mo2855r3(int i) {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: s1 */
    public boolean mo2860s1() {
        return this.f8143h.f21141e.f21157f;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: s2 */
    public LikedUser mo2861s2() {
        return this.f8143h.f21141e.f21166o;
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: u2 */
    public VPager_SquaredRefactor mo2873u2() {
        return null;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: u3 */
    public void mo2874u3(int i) {
        this.f8136a = i;
    }

    @Override // p002l.c5m
    public String userId() {
        return this.f8143h.f21140d;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: v1 */
    public boolean mo2880v1() {
        return this.f8138c;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: v2 */
    public boolean mo2881v2() {
        if (upa.V1()) {
            return TextUtils.equals(this.f8143h.f21138b, "chat_group_anonymity") || TextUtils.equals(this.f8143h.f21138b, "group_notification_anonymity");
        }
        return false;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: w3 */
    public View mo2887w3() {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: y0 */
    public String mo2897y0() {
        if (!this.f8143h.m23957E()) {
            return "";
        }
        vi90.C0862a c0862a = this.f8143h.f21141e;
        return grk.a(c0862a.f21155d, c0862a.f21156e);
    }

    @Override // p002l.x0m
    @Nullable
    /* JADX INFO: renamed from: y1 */
    public View mo2898y1() {
        return null;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: y2 */
    public boolean mo2899y2() {
        return true;
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: y3 */
    public void mo2900y3(j760<Integer, Integer> j760Var) {
        this.f8142g = j760Var;
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: E */
    public void mo1504E() {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: J3 */
    public void mo1515J3() {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: R3 */
    public void m2871tc() {
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: U2 */
    public void mo2709U2() {
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: e2 */
    public void mo2775e2() {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: h3 */
    public void mo1559h3() {
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: k3 */
    public void mo2809k3() {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: o */
    public void mo1575o() {
    }

    @Override // p002l.x0m
    /* JADX INFO: renamed from: o2 */
    public void mo2835o2() {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: t1 */
    public void mo2867t1() {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: R1 */
    public void mo2687R1(int i) {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: Z */
    public void mo2744Z(int i) {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: j3 */
    public void mo1564j3(int i) {
    }

    @Override // p002l.a1m
    public void startActivity(Intent intent) {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: k0 */
    public void mo9269k0(Intent intent, a.a aVar) {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: m2 */
    public void mo2820m2(int i, boolean z) {
    }

    @Override // p002l.a1m
    /* JADX INFO: renamed from: p3 */
    public void mo1578p3(int i, Media media) {
    }

    @Override // p002l.a1m
    public void startActivityForResult(Intent intent, int i) {
    }
}

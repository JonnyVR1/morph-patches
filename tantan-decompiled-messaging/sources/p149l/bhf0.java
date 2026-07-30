package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CategorySuggestions;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.ProfileListFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.p046p1.mobile.putong.core.p053ui.profile.views.VPager_SquaredRefactor;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class bhf0 implements b1m {

    /* JADX INFO: renamed from: a */
    public int f75602a = -1;

    /* JADX INFO: renamed from: b */
    public boolean f75603b = false;

    /* JADX INFO: renamed from: c */
    public boolean f75604c = false;

    /* JADX INFO: renamed from: d */
    public int f75605d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f75606e = false;

    /* JADX INFO: renamed from: f */
    public boolean f75607f = false;

    /* JADX INFO: renamed from: g */
    public j760<Integer, Integer> f75608g;

    /* JADX INFO: renamed from: h */
    public vi90 f75609h;

    public bhf0(vi90 vi90Var) {
        this.f75609h = vi90Var;
    }

    /* JADX INFO: renamed from: b */
    private View m101825b(ProfileButton.ProfileButtonType profileButtonType) {
        return null;
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: B1 */
    public List<View> mo52053B1() {
        return null;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: B2 */
    public View mo52054B2() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: C2 */
    public CategorySuggestions mo51050C2() {
        return ProfileListFrag.f33610I4;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: C3 */
    public View mo52060C3() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: D2 */
    public boolean mo51053D2() {
        return true;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: E1 */
    public boolean mo52071E1() {
        return !"live_profile_voice_mask_mode".equals(this.f75609h.f181562b);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: E2 */
    public j760<Integer, Integer> mo52072E2() {
        return this.f75608g;
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: F */
    public View mo52077F() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: F1 */
    public User mo51058F1(boolean z) {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: G */
    public void mo51060G(View... viewArr) {
        for (View view : viewArr) {
            xdl0.m208329E0(view, m101827c(this.f75609h.f181561a));
        }
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: G0 */
    public boolean mo52083G0(User user) {
        return this.f75609h.m198509J();
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: H0 */
    public void mo52088H0(int i) {
        this.f75605d = i;
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: H1 */
    public View mo52089H1() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: H2 */
    public LayoutInflater mo94568H2() {
        return LayoutInflater.from(this.f75609h.f181567g);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: H3 */
    public j760<List<Literatures>, List<LiteraturesComments>> mo51062H3() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: I1 */
    public boolean mo52096I1() {
        return true;
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: J */
    public View mo52103J() {
        return m101825b(ProfileButton.ProfileButtonType.Dislike);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: J1 */
    public PutongFrag mo51066J1() {
        return this.f75609h.m198528c();
    }

    @Override // p149l.c5m
    /* JADX INFO: renamed from: K2 */
    public User mo51069K2() {
        return this.f75609h.f181561a;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: K3 */
    public int mo52110K3() {
        return this.f75602a;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: M */
    public boolean mo52122M() {
        if (upa.m194706V1()) {
            return TextUtils.equals(this.f75609h.f181562b, "chat_group_anonymity") || TextUtils.equals(this.f75609h.f181562b, "chat_group");
        }
        return false;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: M0 */
    public View mo52123M0() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: N2 */
    public boolean mo52130N2() {
        return this.f75609h.m198511L();
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: N3 */
    public View mo52131N3() {
        return m101825b(ProfileButton.ProfileButtonType.CityGreet);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: O1 */
    public boolean mo52136O1() {
        return "home_card".equals(this.f75609h.f181562b);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: P */
    public boolean mo52143P(String str) {
        return this.f75609h.m198516Q();
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: P1 */
    public boolean mo51075P1() {
        return this.f75609h.m198510K();
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: Q */
    public boolean mo52150Q() {
        return ("from_guess_liker_result".equals(this.f75609h.f181562b) || this.f75609h.m198544t() || "likers".equals(this.f75609h.f181562b) || "from_boost_refactor".equals(this.f75609h.f181562b)) ? false : true;
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: Q2 */
    public View mo52151Q2() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: R */
    public boolean mo51078R() {
        return CoreModule.f17545c.f19663m0.f19463x0.get().booleanValue();
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: R0 */
    public boolean mo51079R0() {
        return false;
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: R2 */
    public View mo52159R2() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: S */
    public boolean mo51082S() {
        return true;
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: S1 */
    public View mo52164S1() {
        return null;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: S2 */
    public void mo52165S2(boolean z) {
        this.f75606e = z;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: U */
    public xdl0.C21104g mo52178U() {
        return null;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: U0 */
    public PictureView mo52179U0() {
        return null;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: V0 */
    public void mo52187V0(boolean z) {
        this.f75607f = z;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: V2 */
    public RelationshipStatus mo52188V2() {
        return this.f75609h.f181565e.f181588m;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: W */
    public RecyclerView mo52195W() {
        return null;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: W2 */
    public View mo52196W2() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: X1 */
    public boolean mo52202X1() {
        return this.f75603b;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: Y0 */
    public ViewGroup mo51089Y0() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: Z1 */
    public boolean mo52216Z1() {
        return false;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: Z2 */
    public int mo51092Z2() {
        return 0;
    }

    @Override // p149l.bml
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Act act() {
        return this.f75609h.m198526a();
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: a0 */
    public boolean mo52222a0() {
        return this.f75607f;
    }

    /* JADX INFO: renamed from: c */
    public View.OnClickListener m101827c(User user) {
        return null;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: c0 */
    public int mo52232c0() {
        return 0;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: c3 */
    public boolean mo52233c3(User user) {
        return false;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: d1 */
    public int mo52239d1() {
        int i = this.f75605d;
        this.f75605d = -1;
        return i;
    }

    @Override // p149l.a1m
    public String from() {
        return this.f75609h.f181562b;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: g3 */
    public boolean mo51106g3() {
        return true;
    }

    @Override // p149l.a1m
    public Context getContext() {
        return this.f75609h.f181567g;
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: h2 */
    public View mo52261h2() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: i3 */
    public int mo51111i3() {
        return 0;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: l2 */
    public void mo52283l2(boolean z) {
        this.f75603b = z;
    }

    @Override // p149l.a1m
    public C22306c<C4319c> lifecycle() {
        return mo51066J1() != null ? mo51066J1().lifecycle() : act().lifecycle();
    }

    @Override // p149l.a1m
    public C4319c lifecycle_() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: m0 */
    public boolean mo51119m0() {
        return false;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: m3 */
    public boolean mo52289m3(User user) {
        return false;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: me */
    public User mo52295me() {
        return null;
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: o0 */
    public View mo52300o0() {
        return m101825b(ProfileButton.ProfileButtonType.Like);
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: o1 */
    public boolean mo52301o1() {
        return this.f75606e;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: o3 */
    public View mo52303o3() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: p */
    public ViewGroup mo51125p() {
        return null;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: p1 */
    public void mo52309p1(boolean z) {
        this.f75604c = z;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: p2 */
    public boolean mo52310p2() {
        return false;
    }

    @Override // p149l.a1m
    public String pageId() {
        return null;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: q2 */
    public View mo52315q2() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: q3 */
    public boolean mo52316q3() {
        return (this.f75609h.m198539o() || this.f75609h.m198505F()) ? false : true;
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public PictureView mo52322r3(int i) {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: s1 */
    public boolean mo52327s1() {
        return this.f75609h.f181565e.f181581f;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: s2 */
    public LikedUser mo52328s2() {
        return this.f75609h.f181565e.f181590o;
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: u2 */
    public VPager_SquaredRefactor mo52340u2() {
        return null;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: u3 */
    public void mo52341u3(int i) {
        this.f75602a = i;
    }

    @Override // p149l.c5m
    public String userId() {
        return this.f75609h.f181564d;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: v1 */
    public boolean mo52347v1() {
        return this.f75604c;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: v2 */
    public boolean mo52348v2() {
        if (upa.m194706V1()) {
            return TextUtils.equals(this.f75609h.f181562b, "chat_group_anonymity") || TextUtils.equals(this.f75609h.f181562b, "group_notification_anonymity");
        }
        return false;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: w3 */
    public View mo52354w3() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: y0 */
    public String mo52364y0() {
        if (!this.f75609h.m198504E()) {
            return "";
        }
        vi90.C20647a c20647a = this.f75609h.f181565e;
        return grk.m127714a(c20647a.f181579d, c20647a.f181580e);
    }

    @Override // p149l.x0m
    @Nullable
    /* JADX INFO: renamed from: y1 */
    public View mo52365y1() {
        return null;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: y2 */
    public boolean mo52366y2() {
        return true;
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: y3 */
    public void mo52367y3(j760<Integer, Integer> j760Var) {
        this.f75608g = j760Var;
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: E */
    public void mo51056E() {
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: J3 */
    public void mo51067J3() {
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: R3 */
    public void m52338tc() {
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: U2 */
    public void mo52180U2() {
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: e2 */
    public void mo52245e2() {
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: h3 */
    public void mo51108h3() {
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: k3 */
    public void mo52277k3() {
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: o */
    public void mo51123o() {
    }

    @Override // p149l.x0m
    /* JADX INFO: renamed from: o2 */
    public void mo52302o2() {
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: t1 */
    public void mo52334t1() {
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: R1 */
    public void mo52158R1(int i) {
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: Z */
    public void mo52215Z(int i) {
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: j3 */
    public void mo51113j3(int i) {
    }

    @Override // p149l.a1m
    public void startActivity(Intent intent) {
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: k0 */
    public void mo94570k0(Intent intent, C4317a.a aVar) {
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: m2 */
    public void mo52288m2(int i, boolean z) {
    }

    @Override // p149l.a1m
    /* JADX INFO: renamed from: p3 */
    public void mo51126p3(int i, Media media) {
    }

    @Override // p149l.a1m
    public void startActivityForResult(Intent intent, int i) {
    }
}

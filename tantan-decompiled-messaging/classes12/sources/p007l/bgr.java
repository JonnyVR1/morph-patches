package p007l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.p001ui.likedusers.LikedUserItemView;
import com.p000p1.mobile.putong.core.p001ui.likedusers.mytab.LikedUsersMyTabFrag;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.RelationshipStatus;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.bzc0;
import l.czc0;
import l.d30;
import l.e30;
import l.jq2;
import l.mkd0;
import l.q860;
import l.vwb;
import l.w9j;
import l.xma;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bgr extends jq2<egr> implements hfr.InterfaceC2393b {

    /* JADX INFO: renamed from: a */
    public LikedUsersMyTabFrag f6319a;

    /* JADX INFO: renamed from: b */
    public LikedUserItemView f6320b;

    /* JADX INFO: renamed from: c */
    public LikedUser f6321c;

    /* JADX INFO: renamed from: d */
    public boolean f6322d;

    /* JADX INFO: renamed from: e */
    public boolean f6323e;

    /* JADX INFO: renamed from: f */
    public int f6324f;

    /* JADX INFO: renamed from: g */
    public int f6325g;

    /* JADX INFO: renamed from: h */
    public hfr f6326h;

    /* JADX INFO: renamed from: i */
    public boolean f6327i;

    public bgr(LikedUsersMyTabFrag likedUsersMyTabFrag) {
        super(likedUsersMyTabFrag);
        this.f6320b = null;
        this.f6321c = null;
        this.f6322d = false;
        this.f6325g = 0;
        this.f6327i = false;
        this.f6319a = likedUsersMyTabFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m8856E0(boolean z, User user, String str) {
        CoreMemberModule.F().b().be(act(), this.f6319a, true, true, z, 0, user.picture(0).cover().url, str, user, this.f6321c);
    }

    /* JADX INFO: renamed from: F0 */
    private boolean m8857F0() {
        return !CoreModule.N().mo1193Co();
    }

    /* JADX INFO: renamed from: O0 */
    private void m8858O0(final User user, final boolean z) {
        e30 e30Var = new e30() { // from class: l.qfr
            public final void call(Object obj) {
                this.f12228a.m8856E0(z, user, (String) obj);
            }
        };
        if (xma.D3()) {
            CoreModule.P().a().Mp(act(), user, e30Var, true);
        } else if (CoreModule.P().g().S9()) {
            CoreModule.P().a().Mp(act(), user, e30Var, true);
        } else {
            CoreModule.P().g().ot(act(), "p_navigation_ilike,card_button_pull");
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m8866l0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m8869o0() {
    }

    /* JADX INFO: renamed from: s0 */
    private String m8872s0(Intent intent) {
        String stringExtra = intent.getStringExtra(CoreModule.l.a().gl());
        String stringExtra2 = intent.getStringExtra(CoreModule.l.a().L8());
        String str = this.f6321c.id;
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return null;
        }
        return stringExtra2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m8873x0(Bundle bundle) {
        ((egr) ((jq2) this).viewModel).m9831r();
        ((egr) ((jq2) this).viewModel).m9828n();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m8874A0(UserPrivilege userPrivilege) {
        boolean zE4 = xma.e4();
        this.f6323e = !zE4;
        if (!zE4) {
            ((egr) ((jq2) this).viewModel).m9832s(false);
        }
        ((egr) ((jq2) this).viewModel).m9827m(this.f6323e);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m8875C0(int i, Intent intent, c cVar) {
        if (NullChecker.a(this.f6320b) && NullChecker.a(this.f6321c)) {
            User userPa = CoreModule.c.e0.Pa(this.f6321c.id);
            int intExtra = 0;
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            SwipeDirection swipeDirection = SwipeDirection.UP;
            boolean z2 = i == swipeDirection.getValue();
            String stringExtra = userPa.pictures.get(0).url;
            if (NullChecker.a(intent)) {
                intExtra = intent.getIntExtra(CoreMemberModule.F().b().bo(), 0);
                stringExtra = intent.getStringExtra(CoreMemberModule.F().b().ch());
            }
            String str = stringExtra;
            int i2 = intExtra;
            String strM8872s0 = (z2 && i == swipeDirection.getValue() && NullChecker.a(intent)) ? m8872s0(intent) : null;
            if (!TextUtils.isEmpty(strM8872s0)) {
                zvf0.r("e_iliked_letter", OMSDialogPositon.p_navigation_view);
            }
            CoreMemberModule.F().b().be(act(), this.f6319a, z, z2, true, i2, str, strM8872s0, userPa, this.f6321c);
        }
    }

    @Override // p007l.hfr.InterfaceC2393b
    /* JADX INFO: renamed from: D */
    public void mo8876D(LikedUser likedUser, boolean z) {
        this.f6321c = likedUser;
        User userPa = CoreModule.c.e0.Pa(likedUser.id);
        if (z) {
            if (m8880I0(TEnum.equals(likedUser.status, RelationshipStatus.superliked), likedUser, userPa, false)) {
                return;
            }
            this.f6319a.m492O4().notifyDataSetChanged();
        } else if (xma.e4()) {
            CoreModule.P().a().qm(act(), "p_navigation,ilike_module", Privilege.liked_user, (e30) null);
            this.f6319a.m492O4().notifyDataSetChanged();
        } else {
            if (CoreMemberModule.F().b().be(act(), this.f6319a, false, false, false, 0, userPa.picture(0).cover().profileMiddle().formatted(), "", userPa, likedUser)) {
                return;
            }
            this.f6319a.m492O4().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m8877D0(d30 d30Var, Boolean bool) {
        this.f6327i = false;
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m8878G0(boolean z) {
        this.f6324f = z ? 1 : 1 + this.f6319a.m492O4().m12195U();
        CoreModule.c.Z0.x3();
        if (z) {
            CoreModule.c.Z0.A3();
        }
        CoreModule.c.Z0.b4(this.f6324f, 25);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m8879H0(int i, final int i2, final Intent intent) {
        if (i != CoreModule.l.a().Ck()) {
            if (i != 786) {
                return false;
            }
            CoreMemberModule.F().b().Jb(act(), i2, intent);
            return true;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new w9j() { // from class: l.agr
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.pfr
            public final void call(Object obj) {
                this.f11828a.m8875C0(i2, intent, (c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m8880I0(boolean z, LikedUser likedUser, User user, boolean z2) {
        this.f6321c = likedUser;
        if (z && !m8857F0()) {
            return false;
        }
        if (!z || TEnum.equals(likedUser.status, RelationshipStatus.lettered)) {
            zvf0.r("e_iliked_superlike", OMSDialogPositon.p_navigation_view);
            czc0.a(((DbObject) user).id);
            return CoreMemberModule.F().b().be(act(), this.f6319a, true, true, z2, 0, user.picture(0).cover().url, (String) null, user, this.f6321c);
        }
        CoreMemberModule.F().b().Bi(user);
        zvf0.r("e_iliked_letter", OMSDialogPositon.p_navigation_view);
        if (xma.e4()) {
            CoreModule.P().a().qm(act(), "p_navigation,ilike_module", Privilege.liked_user, (e30) null);
            return false;
        }
        m8858O0(user, z2);
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public void m8881J0(LikedUser likedUser) {
        if (this.f6319a.m492O4().m12193S(likedUser)) {
            CoreModule.c.Z0.e4(likedUser.id);
            this.f6325g--;
            if (this.f6319a.m492O4().m12195U() <= 0) {
                ((egr) ((jq2) this).viewModel).m9830q(true);
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m8882L0(String str) {
        m8883N0(str, null);
    }

    /* JADX INFO: renamed from: N0 */
    public void m8883N0(String str, final d30 d30Var) {
        if (this.f6327i) {
            return;
        }
        this.f6327i = true;
        CoreModule.P().a().Lf(act(), str, Privilege.liked_user, (e30) null, new e30() { // from class: l.rfr
            public final void call(Object obj) {
                this.f12641a.m8877D0(d30Var, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public void m8884Z() {
        super.Z();
        this.f6323e = !xma.e4();
        m8878G0(true);
    }

    /* JADX INFO: renamed from: a0 */
    public void m8885a0() {
        super.a0();
        creates(new e30() { // from class: l.ofr
            public final void call(Object obj) {
                this.f11466a.m8873x0((Bundle) obj);
            }
        }, new d30() { // from class: l.sfr
            public final void call() {
                bgr.m8869o0();
            }
        });
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.tfr
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ufr
            public final void call(Object obj) {
                this.f13828a.m8889y0((NetworkInfo) obj);
            }
        }));
        duringCreated(bzc0.c().d()).filter(new w9j() { // from class: l.vfr
            public final Object call(Object obj) {
                String str = (String) obj;
                return Boolean.valueOf("all".equals(str) || "my_like".equals(str));
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.wfr
            public final void call(Object obj) {
                this.f14536a.m8890z0((String) obj);
            }
        }, new e30() { // from class: l.xfr
            public final void call(Object obj) {
                bgr.m8866l0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.yfr
            public final void call(Object obj) {
                this.f15423a.m8874A0((UserPrivilege) obj);
            }
        }));
        duringCreated(CoreModule.c.Z0.D3()).subscribe(mkd0.G(new e30() { // from class: l.zfr
            public final void call(Object obj) {
                this.f15730a.m8888u0((q860) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public k.e m8886r0() {
        if (this.f6326h == null) {
            this.f6326h = new hfr(this);
        }
        return this.f6326h;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m8887t0(User user) {
        return CoreModule.c.Z0.G3(((DbObject) user).id) == null;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m8888u0(q860 q860Var) {
        int i;
        if (q860Var != null && ((q860Var.a.isEmpty() && q860Var.d() > 0) || ((i = this.f6324f) > 1 && i >= q860Var.a.size()))) {
            this.f6322d = false;
            return;
        }
        int iD = q860Var == null ? 0 : q860Var.d();
        this.f6325g = iD;
        if (iD > 0) {
            this.f6322d = true;
        }
        if (((q860Var == null || vwb.J(q860Var.a)) ? 0 : q860Var.a.size()) >= this.f6325g) {
            this.f6322d = false;
        }
        ArrayList<LikedUser> arrayList = new ArrayList<>();
        if (NullChecker.a(q860Var)) {
            if (this.f6323e) {
                if (q860Var.a.size() > 500) {
                    this.f6322d = false;
                    arrayList.addAll(q860Var.a.subList(0, 500));
                } else {
                    arrayList.addAll(q860Var.a);
                }
            } else if (q860Var.a.size() > 50) {
                this.f6322d = false;
                arrayList.addAll(q860Var.a.subList(0, 50));
            } else {
                arrayList.addAll(q860Var.a);
            }
        }
        ((egr) ((jq2) this).viewModel).m9829p(arrayList, this.f6323e);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m8889y0(NetworkInfo networkInfo) {
        if (CoreModule.c.Z0.E3() == null || vwb.J(CoreModule.c.Z0.E3().a)) {
            m8878G0(true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m8890z0(String str) {
        m8878G0(true);
    }

    public void destroy() {
    }
}

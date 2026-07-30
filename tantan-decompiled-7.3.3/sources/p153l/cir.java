package p153l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.C0607k;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserItemView;
import com.p051p1.mobile.putong.core.p058ui.likedusers.mytab.LikedUsersMyTabFrag;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class cir extends ar2<fir> implements ihr.InterfaceC17721b {

    /* JADX INFO: renamed from: a */
    public LikedUsersMyTabFrag f81974a;

    /* JADX INFO: renamed from: b */
    public LikedUserItemView f81975b;

    /* JADX INFO: renamed from: c */
    public LikedUser f81976c;

    /* JADX INFO: renamed from: d */
    public boolean f81977d;

    /* JADX INFO: renamed from: e */
    public boolean f81978e;

    /* JADX INFO: renamed from: f */
    public int f81979f;

    /* JADX INFO: renamed from: g */
    public int f81980g;

    /* JADX INFO: renamed from: h */
    public ihr f81981h;

    /* JADX INFO: renamed from: i */
    public boolean f81982i;

    public cir(LikedUsersMyTabFrag likedUsersMyTabFrag) {
        super(likedUsersMyTabFrag);
        this.f81975b = null;
        this.f81976c = null;
        this.f81977d = false;
        this.f81980g = 0;
        this.f81982i = false;
        this.f81974a = likedUsersMyTabFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m109908E0(boolean z, User user, String str) {
        CoreMemberModule.m37004F().m187693b().mo36986be(act(), this.f81974a, true, true, z, 0, user.picture(0).cover().url, str, user, this.f81976c);
    }

    /* JADX INFO: renamed from: F0 */
    private boolean m109909F0() {
        return !CoreModule.m30932N().mo61451Co();
    }

    /* JADX INFO: renamed from: O0 */
    private void m109910O0(final User user, final boolean z) {
        y20<String> y20Var = new y20() { // from class: l.rhr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163192a.m109908E0(z, user, (String) obj);
            }
        };
        if (joa.m146355E3()) {
            CoreModule.m30933P().m143405a().mo34374Mp(act(), user, y20Var, true);
        } else if (CoreModule.m30933P().m143410g().mo36032S9()) {
            CoreModule.m30933P().m143405a().mo34374Mp(act(), user, y20Var, true);
        } else {
            CoreModule.m30933P().m143410g().mo36074ot(act(), "p_navigation_ilike,card_button_pull");
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m109918l0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m109921o0() {
    }

    /* JADX INFO: renamed from: s0 */
    private String m109924s0(Intent intent) {
        String stringExtra = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34509gl());
        String stringExtra2 = intent.getStringExtra(CoreModule.f18273l.m143405a().mo34360L8());
        String str = this.f81976c.f21174id;
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return null;
        }
        return stringExtra2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m109925x0(Bundle bundle) {
        ((fir) this.viewModel).m125707r();
        ((fir) this.viewModel).m125704n();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m109926A0(UserPrivilege userPrivilege) {
        boolean zM146386f4 = joa.m146386f4();
        this.f81978e = !zM146386f4;
        if (!zM146386f4) {
            ((fir) this.viewModel).m125708s(false);
        }
        ((fir) this.viewModel).m125703m(this.f81978e);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m109927C0(int i, Intent intent, C4470c c4470c) {
        if (NullChecker.m82486a(this.f81975b) && NullChecker.m82486a(this.f81976c)) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f81976c.f21174id);
            int intExtra = 0;
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            SwipeDirection swipeDirection = SwipeDirection.UP;
            boolean z2 = i == swipeDirection.getValue();
            String stringExtra = userM116503Pa.pictures.get(0).url;
            if (NullChecker.m82486a(intent)) {
                intExtra = intent.getIntExtra(CoreMemberModule.m37004F().m187693b().mo36988bo(), 0);
                stringExtra = intent.getStringExtra(CoreMemberModule.m37004F().m187693b().mo36990ch());
            }
            String str = stringExtra;
            int i2 = intExtra;
            String strM109924s0 = (z2 && i == swipeDirection.getValue() && NullChecker.m82486a(intent)) ? m109924s0(intent) : null;
            if (!TextUtils.isEmpty(strM109924s0)) {
                i4g0.m138520r("e_iliked_letter", OMSDialogPositon.p_navigation_view);
            }
            CoreMemberModule.m37004F().m187693b().mo36986be(act(), this.f81974a, z, z2, true, i2, str, strM109924s0, userM116503Pa, this.f81976c);
        }
    }

    @Override // p153l.ihr.InterfaceC17721b
    /* JADX INFO: renamed from: D */
    public void mo109928D(LikedUser likedUser, boolean z) {
        this.f81976c = likedUser;
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(likedUser.f21174id);
        if (z) {
            if (m109932I0(TEnum.equals(likedUser.status, "superliked"), likedUser, userM116503Pa, false)) {
                return;
            }
            this.f81974a.m48000O4().notifyDataSetChanged();
        } else if (joa.m146386f4()) {
            CoreModule.m30933P().m143405a().mo34575qm(act(), "p_navigation,ilike_module", Privilege.liked_user, null);
            this.f81974a.m48000O4().notifyDataSetChanged();
        } else {
            if (CoreMemberModule.m37004F().m187693b().mo36986be(act(), this.f81974a, false, false, false, 0, userM116503Pa.picture(0).cover().profileMiddle().formatted(), "", userM116503Pa, likedUser)) {
                return;
            }
            this.f81974a.m48000O4().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m109929D0(x20 x20Var, Boolean bool) {
        this.f81982i = false;
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m109930G0(boolean z) {
        this.f81979f = z ? 1 : 1 + this.f81974a.m48000O4().m167738U();
        CoreModule.f18264c.f20367Z0.m210790x3();
        if (z) {
            CoreModule.f18264c.f20367Z0.m210758A3();
        }
        CoreModule.f18264c.f20367Z0.m210785b4(this.f81979f, 25);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m109931H0(int i, final int i2, final Intent intent) {
        if (i != CoreModule.f18273l.m143405a().mo34302Ck()) {
            if (i != 786) {
                return false;
            }
            CoreMemberModule.m37004F().m187693b().mo36975Jb(act(), i2, intent);
            return true;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new qcj() { // from class: l.bir
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.qhr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157746a.m109927C0(i2, intent, (C4470c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m109932I0(boolean z, LikedUser likedUser, User user, boolean z2) {
        this.f81976c = likedUser;
        if (z && !m109909F0()) {
            return false;
        }
        if (!z || TEnum.equals(likedUser.status, "lettered")) {
            i4g0.m138520r("e_iliked_superlike", OMSDialogPositon.p_navigation_view);
            f7d0.m124434a(user.f56859id);
            return CoreMemberModule.m37004F().m187693b().mo36986be(act(), this.f81974a, true, true, z2, 0, user.picture(0).cover().url, null, user, this.f81976c);
        }
        CoreMemberModule.m37004F().m187693b().mo36973Bi(user);
        i4g0.m138520r("e_iliked_letter", OMSDialogPositon.p_navigation_view);
        if (joa.m146386f4()) {
            CoreModule.m30933P().m143405a().mo34575qm(act(), "p_navigation,ilike_module", Privilege.liked_user, null);
            return false;
        }
        m109910O0(user, z2);
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public void m109933J0(LikedUser likedUser) {
        if (this.f81974a.m48000O4().m167736S(likedUser)) {
            CoreModule.f18264c.f20367Z0.m210788e4(likedUser.f21174id);
            this.f81980g--;
            if (this.f81974a.m48000O4().m167738U() <= 0) {
                ((fir) this.viewModel).m125706q(true);
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m109934L0(String str) {
        m109935N0(str, null);
    }

    /* JADX INFO: renamed from: N0 */
    public void m109935N0(String str, final x20 x20Var) {
        if (this.f81982i) {
            return;
        }
        this.f81982i = true;
        CoreModule.m30933P().m143405a().mo34365Lf(act(), str, Privilege.liked_user, null, new y20() { // from class: l.shr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f168739a.m109929D0(x20Var, (Boolean) obj);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f81978e = !joa.m146386f4();
        m109930G0(true);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.phr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152466a.m109925x0((Bundle) obj);
            }
        }, new x20() { // from class: l.thr
            @Override // p153l.x20
            public final void call() {
                cir.m109921o0();
            }
        });
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.uhr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.vhr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184187a.m109939y0((NetworkInfo) obj);
            }
        }));
        duringCreated(e7d0.m119695c().m119698d()).filter(new qcj() { // from class: l.whr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                String str = (String) obj;
                return Boolean.valueOf("all".equals(str) || "my_like".equals(str));
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.xhr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194397a.m109940z0((String) obj);
            }
        }, new y20() { // from class: l.yhr
            @Override // p153l.y20
            public final void call(Object obj) {
                cir.m109918l0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.zhr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204445a.m109926A0((UserPrivilege) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20367Z0.m210761D3()).subscribe(psd0.m173596G(new y20() { // from class: l.air
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71571a.m109938u0((vg60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public C0607k.e m109936r0() {
        if (this.f81981h == null) {
            this.f81981h = new ihr(this);
        }
        return this.f81981h;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m109937t0(User user) {
        return CoreModule.f18264c.f20367Z0.m210764G3(user.f56859id) == null;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m109938u0(vg60 vg60Var) {
        int i;
        if (vg60Var != null && ((vg60Var.f184001a.isEmpty() && vg60Var.m201222d() > 0) || ((i = this.f81979f) > 1 && i >= vg60Var.f184001a.size()))) {
            this.f81977d = false;
            return;
        }
        int iM201222d = vg60Var == null ? 0 : vg60Var.m201222d();
        this.f81980g = iM201222d;
        if (iM201222d > 0) {
            this.f81977d = true;
        }
        if (((vg60Var == null || jyb.m147479J(vg60Var.f184001a)) ? 0 : vg60Var.f184001a.size()) >= this.f81980g) {
            this.f81977d = false;
        }
        ArrayList<LikedUser> arrayList = new ArrayList<>();
        if (NullChecker.m82486a(vg60Var)) {
            if (this.f81978e) {
                if (vg60Var.f184001a.size() > 500) {
                    this.f81977d = false;
                    arrayList.addAll(vg60Var.f184001a.subList(0, 500));
                } else {
                    arrayList.addAll(vg60Var.f184001a);
                }
            } else if (vg60Var.f184001a.size() > 50) {
                this.f81977d = false;
                arrayList.addAll(vg60Var.f184001a.subList(0, 50));
            } else {
                arrayList.addAll(vg60Var.f184001a);
            }
        }
        ((fir) this.viewModel).m125705p(arrayList, this.f81978e);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m109939y0(NetworkInfo networkInfo) {
        if (CoreModule.f18264c.f20367Z0.m210762E3() == null || jyb.m147479J(CoreModule.f18264c.f20367Z0.m210762E3().f184001a)) {
            m109930G0(true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m109940z0(String str) {
        m109930G0(true);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}

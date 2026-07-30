package p149l;

import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.C0605k;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserItemView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.mytab.LikedUsersMyTabFrag;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class bgr extends jq2<egr> implements hfr.InterfaceC17302b {

    /* JADX INFO: renamed from: a */
    public LikedUsersMyTabFrag f75485a;

    /* JADX INFO: renamed from: b */
    public LikedUserItemView f75486b;

    /* JADX INFO: renamed from: c */
    public LikedUser f75487c;

    /* JADX INFO: renamed from: d */
    public boolean f75488d;

    /* JADX INFO: renamed from: e */
    public boolean f75489e;

    /* JADX INFO: renamed from: f */
    public int f75490f;

    /* JADX INFO: renamed from: g */
    public int f75491g;

    /* JADX INFO: renamed from: h */
    public hfr f75492h;

    /* JADX INFO: renamed from: i */
    public boolean f75493i;

    public bgr(LikedUsersMyTabFrag likedUsersMyTabFrag) {
        super(likedUsersMyTabFrag);
        this.f75486b = null;
        this.f75487c = null;
        this.f75488d = false;
        this.f75491g = 0;
        this.f75493i = false;
        this.f75485a = likedUsersMyTabFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m101678E0(boolean z, User user, String str) {
        CoreMemberModule.m36001F().m132651b().mo35983be(act(), this.f75485a, true, true, z, 0, user.picture(0).cover().url, str, user, this.f75487c);
    }

    /* JADX INFO: renamed from: F0 */
    private boolean m101679F0() {
        return !CoreModule.m29934N().mo60267Co();
    }

    /* JADX INFO: renamed from: O0 */
    private void m101680O0(final User user, final boolean z) {
        e30<String> e30Var = new e30() { // from class: l.qfr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154162a.m101678E0(z, user, (String) obj);
            }
        };
        if (xma.m210041D3()) {
            CoreModule.m29935P().m94651a().mo33371Mp(act(), user, e30Var, true);
        } else if (CoreModule.m29935P().m94656g().mo35029S9()) {
            CoreModule.m29935P().m94651a().mo33371Mp(act(), user, e30Var, true);
        } else {
            CoreModule.m29935P().m94656g().mo35071ot(act(), "p_navigation_ilike,card_button_pull");
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m101688l0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m101691o0() {
    }

    /* JADX INFO: renamed from: s0 */
    private String m101694s0(Intent intent) {
        String stringExtra = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33506gl());
        String stringExtra2 = intent.getStringExtra(CoreModule.f17554l.m94651a().mo33357L8());
        String str = this.f75487c.f20432id;
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2) || !stringExtra.equals(str)) {
            return null;
        }
        return stringExtra2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m101695x0(Bundle bundle) {
        ((egr) this.viewModel).m116312r();
        ((egr) this.viewModel).m116309n();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m101696A0(UserPrivilege userPrivilege) {
        boolean zM210071e4 = xma.m210071e4();
        this.f75489e = !zM210071e4;
        if (!zM210071e4) {
            ((egr) this.viewModel).m116313s(false);
        }
        ((egr) this.viewModel).m116308m(this.f75489e);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m101697C0(int i, Intent intent, C4319c c4319c) {
        if (NullChecker.m81303a(this.f75486b) && NullChecker.m81303a(this.f75487c)) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f75487c.f20432id);
            int intExtra = 0;
            boolean z = i == SwipeDirection.RIGHT.getValue() || i == SwipeDirection.UP.getValue();
            SwipeDirection swipeDirection = SwipeDirection.UP;
            boolean z2 = i == swipeDirection.getValue();
            String stringExtra = userM169430Pa.pictures.get(0).url;
            if (NullChecker.m81303a(intent)) {
                intExtra = intent.getIntExtra(CoreMemberModule.m36001F().m132651b().mo35985bo(), 0);
                stringExtra = intent.getStringExtra(CoreMemberModule.m36001F().m132651b().mo35987ch());
            }
            String str = stringExtra;
            int i2 = intExtra;
            String strM101694s0 = (z2 && i == swipeDirection.getValue() && NullChecker.m81303a(intent)) ? m101694s0(intent) : null;
            if (!TextUtils.isEmpty(strM101694s0)) {
                zvf0.m220396r("e_iliked_letter", OMSDialogPositon.p_navigation_view);
            }
            CoreMemberModule.m36001F().m132651b().mo35983be(act(), this.f75485a, z, z2, true, i2, str, strM101694s0, userM169430Pa, this.f75487c);
        }
    }

    @Override // p149l.hfr.InterfaceC17302b
    /* JADX INFO: renamed from: D */
    public void mo101698D(LikedUser likedUser, boolean z) {
        this.f75487c = likedUser;
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(likedUser.f20432id);
        if (z) {
            if (m101702I0(TEnum.equals(likedUser.status, "superliked"), likedUser, userM169430Pa, false)) {
                return;
            }
            this.f75485a.m46817O4().notifyDataSetChanged();
        } else if (xma.m210071e4()) {
            CoreModule.m29935P().m94651a().mo33572qm(act(), "p_navigation,ilike_module", Privilege.liked_user, null);
            this.f75485a.m46817O4().notifyDataSetChanged();
        } else {
            if (CoreMemberModule.m36001F().m132651b().mo35983be(act(), this.f75485a, false, false, false, 0, userM169430Pa.picture(0).cover().profileMiddle().formatted(), "", userM169430Pa, likedUser)) {
                return;
            }
            this.f75485a.m46817O4().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m101699D0(d30 d30Var, Boolean bool) {
        this.f75493i = false;
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m101700G0(boolean z) {
        this.f75490f = z ? 1 : 1 + this.f75485a.m46817O4().m159277U();
        CoreModule.f17545c.f19625Z0.m163932x3();
        if (z) {
            CoreModule.f17545c.f19625Z0.m163900A3();
        }
        CoreModule.f17545c.f19625Z0.m163927b4(this.f75490f, 25);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m101701H0(int i, final int i2, final Intent intent) {
        if (i != CoreModule.f17554l.m94651a().mo33299Ck()) {
            if (i != 786) {
                return false;
            }
            CoreMemberModule.m36001F().m132651b().mo35972Jb(act(), i2, intent);
            return true;
        }
        if (i2 != SwipeDirection.RIGHT.getValue() && i2 != SwipeDirection.LEFT.getValue() && i2 != SwipeDirection.UP.getValue()) {
            return false;
        }
        lifecycle().takeFirst(new w9j() { // from class: l.agr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.pfr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148580a.m101697C0(i2, intent, (C4319c) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m101702I0(boolean z, LikedUser likedUser, User user, boolean z2) {
        this.f75487c = likedUser;
        if (z && !m101679F0()) {
            return false;
        }
        if (!z || TEnum.equals(likedUser.status, "lettered")) {
            zvf0.m220396r("e_iliked_superlike", OMSDialogPositon.p_navigation_view);
            czc0.m109405a(user.f56011id);
            return CoreMemberModule.m36001F().m132651b().mo35983be(act(), this.f75485a, true, true, z2, 0, user.picture(0).cover().url, null, user, this.f75487c);
        }
        CoreMemberModule.m36001F().m132651b().mo35970Bi(user);
        zvf0.m220396r("e_iliked_letter", OMSDialogPositon.p_navigation_view);
        if (xma.m210071e4()) {
            CoreModule.m29935P().m94651a().mo33572qm(act(), "p_navigation,ilike_module", Privilege.liked_user, null);
            return false;
        }
        m101680O0(user, z2);
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public void m101703J0(LikedUser likedUser) {
        if (this.f75485a.m46817O4().m159275S(likedUser)) {
            CoreModule.f17545c.f19625Z0.m163930e4(likedUser.f20432id);
            this.f75491g--;
            if (this.f75485a.m46817O4().m159277U() <= 0) {
                ((egr) this.viewModel).m116311q(true);
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m101704L0(String str) {
        m101705N0(str, null);
    }

    /* JADX INFO: renamed from: N0 */
    public void m101705N0(String str, final d30 d30Var) {
        if (this.f75493i) {
            return;
        }
        this.f75493i = true;
        CoreModule.m29935P().m94651a().mo33362Lf(act(), str, Privilege.liked_user, null, new e30() { // from class: l.rfr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159193a.m101699D0(d30Var, (Boolean) obj);
            }
        });
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f75489e = !xma.m210071e4();
        m101700G0(true);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.ofr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143731a.m101695x0((Bundle) obj);
            }
        }, new d30() { // from class: l.sfr
            @Override // p149l.d30
            public final void call() {
                bgr.m101691o0();
            }
        });
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.tfr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ufr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176314a.m101709y0((NetworkInfo) obj);
            }
        }));
        duringCreated(bzc0.m104564c().m104567d()).filter(new w9j() { // from class: l.vfr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                String str = (String) obj;
                return Boolean.valueOf("all".equals(str) || "my_like".equals(str));
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.wfr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186104a.m101710z0((String) obj);
            }
        }, new e30() { // from class: l.xfr
            @Override // p149l.e30
            public final void call(Object obj) {
                bgr.m101688l0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.yfr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198080a.m101696A0((UserPrivilege) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19625Z0.m163903D3()).subscribe(mkd0.m154955G(new e30() { // from class: l.zfr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202974a.m101708u0((q860) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public C0605k.e m101706r0() {
        if (this.f75492h == null) {
            this.f75492h = new hfr(this);
        }
        return this.f75492h;
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m101707t0(User user) {
        return CoreModule.f17545c.f19625Z0.m163906G3(user.f56011id) == null;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m101708u0(q860 q860Var) {
        int i;
        if (q860Var != null && ((q860Var.f153135a.isEmpty() && q860Var.m173344d() > 0) || ((i = this.f75490f) > 1 && i >= q860Var.f153135a.size()))) {
            this.f75488d = false;
            return;
        }
        int iM173344d = q860Var == null ? 0 : q860Var.m173344d();
        this.f75491g = iM173344d;
        if (iM173344d > 0) {
            this.f75488d = true;
        }
        if (((q860Var == null || vwb.m200296J(q860Var.f153135a)) ? 0 : q860Var.f153135a.size()) >= this.f75491g) {
            this.f75488d = false;
        }
        ArrayList<LikedUser> arrayList = new ArrayList<>();
        if (NullChecker.m81303a(q860Var)) {
            if (this.f75489e) {
                if (q860Var.f153135a.size() > 500) {
                    this.f75488d = false;
                    arrayList.addAll(q860Var.f153135a.subList(0, 500));
                } else {
                    arrayList.addAll(q860Var.f153135a);
                }
            } else if (q860Var.f153135a.size() > 50) {
                this.f75488d = false;
                arrayList.addAll(q860Var.f153135a.subList(0, 50));
            } else {
                arrayList.addAll(q860Var.f153135a);
            }
        }
        ((egr) this.viewModel).m116310p(arrayList, this.f75489e);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m101709y0(NetworkInfo networkInfo) {
        if (CoreModule.f17545c.f19625Z0.m163904E3() == null || vwb.m200296J(CoreModule.f17545c.f19625Z0.m163904E3().f153135a)) {
            m101700G0(true);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m101710z0(String str) {
        m101700G0(true);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}

package com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.Action;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.ShareItemBean;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.report.ReportAct;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.subjects.C22507a;
import p151v.VListCell;
import p153l.byd0;
import p153l.c9c0;
import p153l.i4g0;
import p153l.jyb;
import p153l.l4g0;
import p153l.l51;
import p153l.lik0;
import p153l.o1j0;
import p153l.pzi0;
import p153l.qtk;
import p153l.tr90;
import p153l.uqb0;
import p153l.vxd0;
import p153l.w1e;
import p153l.w30;
import p153l.wj90;
import p153l.wyd0;
import p153l.x20;
import p153l.y20;
import p153l.zq90;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileShareHelper {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final vxd0 f34830a = new vxd0("show_share_tip_count_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: b */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final vxd0 f34831b = new vxd0("show_share_today_tip_count" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: c */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final wyd0 f34832c = new wyd0("show_share_tip_data_" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: d */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final vxd0 f34833d = new vxd0("show_share_tip_user_count_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public vxd0 f34834e = new vxd0("game_cp_profile_share_tip_show_count" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: f */
    public byd0 f34835f = new byd0("game_cp_profile_share_tip_latest_show_time" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public final zq90 f34836g;

    /* JADX INFO: renamed from: h */
    public w30 f34837h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileShareHelper$1 */
    public class ResultReceiverC88941 extends ResultReceiver {
        final /* synthetic */ boolean val$matched;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResultReceiverC88941(Handler handler, boolean z) {
            super(handler);
            this.val$matched = z;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m53907b() {
            Intent intentPutExtra = new Intent().putExtra("userId", ProfileShareHelper.this.f34836g.f205579d);
            intentPutExtra.putExtra("action", "report");
            ProfileShareHelper.this.m53900u().setResult(SwipeDirection.LEFT.getValue(), intentPutExtra);
            ProfileShareHelper.this.m53900u().m68056e2();
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (i == -1) {
                boolean z = true;
                if (!ProfileShareHelper.this.f34836g.m220950C() && !ProfileShareHelper.this.f34836g.m220983j()) {
                    z = true ^ this.val$matched;
                }
                if (z) {
                    ProfileShareHelper.this.m53900u().post(new Runnable() { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.imp.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f34838a.m53907b();
                        }
                    });
                }
            }
        }
    }

    public ProfileShareHelper(zq90 zq90Var) {
        this.f34836g = zq90Var;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m53877A(View view) {
        i4g0.m138520r("e_user_profile_more_popup_cancel", "p_user_profile_more_popup");
        this.f34837h.m204614b();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m53878B() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(this.f34836g.f205579d)) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(this.f34836g.f205579d).m61308fp().profileSmall())) {
            C4891g c4891g = CoreModule.f18264c.f20384f0;
            Act actM53900u = m53900u();
            String str = this.f34836g.f205579d;
            c4891g.m33667Gp(actM53900u, false, str, CoreModule.f18264c.f20381e0.m116597oa(str).m61308fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m53879C() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(this.f34836g.f205579d)) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(this.f34836g.f205579d).m61308fp().profileSmall())) {
            C4891g c4891g = CoreModule.f18264c.f20384f0;
            Act actM53900u = m53900u();
            String str = this.f34836g.f205579d;
            c4891g.m33667Gp(actM53900u, true, str, CoreModule.f18264c.f20381e0.m116597oa(str).m61308fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m53880D(Relationship relationship) {
        m53897U();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m53881E(boolean z, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (TextUtils.equals(c22660a.f210081a.toString(), "分享给朋友看看")) {
            i4g0.m138520r("e_share_to_third_app", "p_user_profile_more_popup");
            if (lik0.m154377c(this.f34836g.f205579d)) {
                o1j0.m165651y("此用户不可被分享");
            } else {
                qtk.m178001U0(m53900u(), "share_bottom", new x20() { // from class: l.s0b0
                    @Override // p153l.x20
                    public final void call() {
                        this.f165675a.m53878B();
                    }
                }, new x20() { // from class: l.t0b0
                    @Override // p153l.x20
                    public final void call() {
                        this.f171486a.m53879C();
                    }
                });
            }
        }
        if (TextUtils.equals(c22660a.f210081a.toString(), m53900u().getString(R$string.f19600r))) {
            m53896T(z);
        }
        if (TextUtils.equals(c22660a.f210081a.toString(), "取消喜欢")) {
            i4g0.m138523u("e_unlike", "p_user_profile_more_popup", jyb.m147494Y("unlike_from", "profile"), jyb.m147494Y("other_user_id", this.f34836g.f205579d));
            FeedService feedServiceM30932N = CoreModule.m30932N();
            Act actM53900u = m53900u();
            zq90 zq90Var = this.f34836g;
            feedServiceM30932N.mo61502T7(actM53900u, zq90Var.f205576a, zq90Var.f205577b, new y20() { // from class: l.u0b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176872a.m53880D((Relationship) obj);
                }
            });
        } else if (TextUtils.equals(c22660a.f210081a.toString(), "取消关注")) {
            FeedService feedServiceM30932N2 = CoreModule.m30932N();
            Act actM53900u2 = m53900u();
            zq90 zq90Var2 = this.f34836g;
            feedServiceM30932N2.mo61514Vp(actM53900u2, zq90Var2.f205576a, zq90Var2.f205577b);
        } else if (TextUtils.equals(c22660a.f210081a.toString(), m53900u().getString(R$string.f19358j5))) {
            m53901v(new Runnable() { // from class: l.v0b0
                @Override // java.lang.Runnable
                public final void run() {
                    i4g0.m138523u("e_blacklist", "p_user_profile_more_popup", pf60.m172085a("blacklist_management", "add"));
                }
            });
        } else if (TextUtils.equals(c22660a.f210081a.toString(), m53900u().getString(R$string.f19789x2))) {
            m53895S(new Runnable() { // from class: l.w0b0
                @Override // java.lang.Runnable
                public final void run() {
                    i4g0.m138523u("e_blacklist", "p_user_profile_more_popup", pf60.m172085a("blacklist_management", Action.remove));
                }
            });
        }
        this.f34837h.m204614b();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m53882F() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(this.f34836g.f205579d)) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(this.f34836g.f205579d).m61308fp().profile480())) {
            C4891g c4891g = CoreModule.f18264c.f20384f0;
            Act actM53900u = m53900u();
            String str = this.f34836g.f205579d;
            c4891g.m33667Gp(actM53900u, false, str, CoreModule.f18264c.f20381e0.m116597oa(str).m61308fp().profile480());
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m53883G() {
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(this.f34836g.f205579d)) && NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(this.f34836g.f205579d).m61308fp().profile480())) {
            C4891g c4891g = CoreModule.f18264c.f20384f0;
            Act actM53900u = m53900u();
            String str = this.f34836g.f205579d;
            c4891g.m33667Gp(actM53900u, true, str, CoreModule.f18264c.f20381e0.m116597oa(str).m61308fp().profile480());
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m53884H(Relationship relationship) {
        m53897U();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m53885I(String str) {
        if (!TextUtils.equals(str, "取消喜欢")) {
            if (!TextUtils.equals(str, "取消关注")) {
                m53896T(this.f34836g.m220957J());
                return;
            }
            FeedService feedServiceM30932N = CoreModule.m30932N();
            Act actM53900u = m53900u();
            zq90 zq90Var = this.f34836g;
            feedServiceM30932N.mo61514Vp(actM53900u, zq90Var.f205576a, zq90Var.f205577b);
            return;
        }
        i4g0.m138523u("e_unlike", "p_user_profile_more_popup", jyb.m147494Y("unlike_from", "profile"), jyb.m147494Y("other_user_id", this.f34836g.f205579d));
        FeedService feedServiceM30932N2 = CoreModule.m30932N();
        Act actM53900u2 = m53900u();
        zq90 zq90Var2 = this.f34836g;
        feedServiceM30932N2.mo61502T7(actM53900u2, zq90Var2.f205576a, zq90Var2.f205577b, new y20() { // from class: l.g1b0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101735a.m53884H((Relationship) obj);
            }
        });
        if (this.f34836g.m220990r()) {
            CoreModule.f18264c.f20367Z0.m210789f4("");
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m53886J() {
        m53896T(this.f34836g.m220957J());
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m53887K(String str) {
        if (TextUtils.equals(str, m53900u().getString(R$string.f19358j5))) {
            m53901v(null);
        } else if (TextUtils.equals(str, m53900u().getString(R$string.f19789x2))) {
            m53895S(null);
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m53888L() {
        User userQuery = uqb0.f180405k0.f184355d.query(this.f34836g.f205579d);
        if (userQuery != null && NullChecker.m82486a(userQuery.localRelationship) && NullChecker.m82486a(userQuery.localRelationship.relationshipExtensions) && TEnum.equals(userQuery.localRelationship.relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED)) {
            userQuery.localRelationship.relationshipExtensions.relationType = RelationshipStatus.get("unknown_");
            uqb0.f180405k0.f184355d.upsert(userQuery);
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m53889M() {
        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.x0b0
            @Override // p153l.x20
            public final void call() {
                this.f191879a.m53888L();
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m53890N() {
        ArrayList arrayList = new ArrayList();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_user_profile_more_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("other_user_id", this.f34836g.f205579d));
        if (this.f34836g.m220957J()) {
            arrayList.add("分享给朋友看看");
        }
        if (CoreModule.m30932N().mo61573so()) {
            l4g0VarM204399c.m152781p(jyb.m147494Y("share_pop_from_which", "profile"));
            if (this.f34836g.m220963P()) {
                arrayList.add("取消喜欢");
            } else if (this.f34836g.m220979f()) {
                arrayList.add("取消关注");
            }
        }
        arrayList.add(m53900u().getString(R$string.f19600r));
        if (this.f34836g.m220984k() || this.f34836g.m220985m() || this.f34836g.m220986n()) {
            if (CoreModule.m30932N().mo61472Kk(this.f34836g.f205576a)) {
                l4g0VarM204399c.m152781p(jyb.m147494Y("blacklist_management", Action.remove));
                arrayList.add(m53900u().getString(R$string.f19789x2));
            } else {
                l4g0VarM204399c.m152781p(jyb.m147494Y("blacklist_management", "add"));
                arrayList.add(m53900u().getString(R$string.f19358j5));
            }
        }
        int iIndexOf = arrayList.indexOf(m53900u().getString(R$string.f19600r));
        w1e.m204402f(l4g0VarM204399c);
        w30.C21001b c21001b = new w30.C21001b(m53900u());
        final boolean zM220957J = this.f34836g.m220957J();
        c21001b.m204668T(new DialogInterface.OnDismissListener() { // from class: l.p0b0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m204657I(m53900u().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.y0b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196955a.m53877A(view);
            }
        }).m204665Q(arrayList).m204666R(new int[]{iIndexOf}, new int[]{c9c0.f80351L}).m204670V(new w30.InterfaceC21003d() { // from class: l.z0b0
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f202294a.m53881E(zM220957J, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f34837h = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX INFO: renamed from: O */
    public void m53891O() {
        final String str;
        String str2;
        if (!CoreModule.m30932N().mo61573so() || this.f34836g.m220958K()) {
            str = "";
        } else {
            if (!this.f34836g.m220961N() && !this.f34836g.m220962O()) {
                str2 = "取消喜欢";
            } else if (this.f34836g.m220979f()) {
                str2 = "取消关注";
            } else {
                str = "";
            }
            str = str2;
        }
        final String string = !CoreModule.m30932N().mo61472Kk(this.f34836g.f205576a) ? m53900u().getString(R$string.f19358j5) : m53900u().getString(R$string.f19789x2);
        qtk.m178013a1("", m53900u(), "", TextUtils.isEmpty(str) ? "share_right" : "", str, string, new x20() { // from class: l.a1b0
            @Override // p153l.x20
            public final void call() {
                this.f67805a.m53882F();
            }
        }, new x20() { // from class: l.b1b0
            @Override // p153l.x20
            public final void call() {
                this.f74361a.m53883G();
            }
        }, new x20() { // from class: l.c1b0
            @Override // p153l.x20
            public final void call() {
                this.f79385a.m53885I(str);
            }
        }, null, new x20() { // from class: l.d1b0
            @Override // p153l.x20
            public final void call() {
                this.f84661a.m53886J();
            }
        }, new x20() { // from class: l.e1b0
            @Override // p153l.x20
            public final void call() {
                this.f91588a.m53887K(string);
            }
        }, new x20() { // from class: l.f1b0
            @Override // p153l.x20
            public final void call() {
                C4499d.m21895l().m21899k("share_tip");
            }
        }, null, m53903x(), this.f34836g.f205576a);
    }

    /* JADX INFO: renamed from: P */
    public void m53892P() {
        this.f34834e.m203841a(1);
        this.f34835f.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: Q */
    public void m53893Q() {
        if (!this.f34832c.get().equals(pzi0.m174459t())) {
            this.f34832c.put(pzi0.m174459t());
            this.f34833d.put(0);
            this.f34831b.put(0);
        }
        if (NullChecker.m82486a(this.f34836g) && wj90.m206621d(this.f34836g.f205576a)) {
            return;
        }
        vxd0 vxd0Var = this.f34833d;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: R */
    public void m53894R() {
        vxd0 vxd0Var = this.f34831b;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        vxd0 vxd0Var2 = this.f34830a;
        vxd0Var2.put(Integer.valueOf(vxd0Var2.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: S */
    public final void m53895S(Runnable runnable) {
        tr90.m192435y(m53900u(), this.f34836g.f205576a, runnable);
    }

    /* JADX INFO: renamed from: T */
    public final void m53896T(boolean z) {
        m53900u().startActivity(ReportAct.m55814e2(m53900u(), this.f34836g.f205579d, "", z, new ResultReceiverC88941(null, z), "profile", true));
    }

    /* JADX INFO: renamed from: U */
    public final void m53897U() {
        if (this.f34836g.m220990r()) {
            LikedUser likedUserM210760C3 = CoreModule.f18264c.f20367Z0.m210760C3(this.f34836g.f205579d);
            if (this.f34836g.m220990r() && NullChecker.m82486a(likedUserM210760C3)) {
                likedUserM210760C3.status = RelationshipStatus.get("unknown_");
            }
        }
        l51.m152919y(new Runnable() { // from class: l.r0b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f160606a.m53889M();
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public boolean m53898V() {
        return this.f34831b.get().intValue() == 2 || this.f34830a.get().intValue() == 6 || !this.f34832c.get().equals(pzi0.m174459t()) || this.f34833d.get().intValue() > 3 || lik0.m154375a() || m53904y();
    }

    /* JADX INFO: renamed from: W */
    public boolean m53899W() {
        return this.f34833d.get().intValue() == 2 || this.f34833d.get().intValue() == 3;
    }

    /* JADX INFO: renamed from: u */
    public final Act m53900u() {
        return this.f34836g.m220974a();
    }

    /* JADX INFO: renamed from: v */
    public final void m53901v(final Runnable runnable) {
        tr90.m192423j(m53900u(), this.f34836g.f205576a, new Runnable() { // from class: l.q0b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f155038a.m53905z(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public boolean m53902w() {
        return this.f34834e.get().intValue() < 3 && !pzi0.m174438C(this.f34835f.get().longValue(), pzi0.m174454o());
    }

    /* JADX INFO: renamed from: x */
    public final List<ShareItemBean> m53903x() {
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m53904y() {
        return NullChecker.m82486a(this.f34836g) && wj90.m206621d(this.f34836g.f205576a);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m53905z(Runnable runnable) {
        if ((this.f34836g.m220974a() instanceof ProfileAct) && this.f34836g.m220987o()) {
            CoreModule.f18264c.f20405m0.m32013I8(jyb.m147482M(this.f34836g.f205576a.f56859id));
            C22507a<PartialListOpt<CoreSuggested.UserInfo>> c22507a = CoreModule.f18264c.f20405m0.f20136a0;
            c22507a.m137019l(c22507a.m222761e());
            this.f34836g.m220974a().onBackPressed();
        }
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }
}

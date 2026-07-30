package com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.ShareItemBean;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.report.ReportAct;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.ark;
import l.c40;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.f9k0;
import l.i0e;
import l.j760;
import l.lsi0;
import l.mqi0;
import l.pj90;
import l.qib0;
import l.sb90;
import l.tpd0;
import l.uqd0;
import l.vwb;
import l.w0c0;
import l.zpd0;
import l.zvf0;
import p002l.vi90;
import rx.subjects.a;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileShareHelper {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final tpd0 f1804a = new tpd0("show_share_tip_count_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: b */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final tpd0 f1805b = new tpd0("show_share_today_tip_count" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: c */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final uqd0 f1806c = new uqd0("show_share_tip_data_" + CoreModule.H().userId(), "");

    /* JADX INFO: renamed from: d */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final tpd0 f1807d = new tpd0("show_share_tip_user_count_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public tpd0 f1808e = new tpd0("game_cp_profile_share_tip_show_count" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: f */
    public zpd0 f1809f = new zpd0("game_cp_profile_share_tip_latest_show_time" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public final vi90 f1810g;

    /* JADX INFO: renamed from: h */
    public c40 f1811h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileShareHelper$1 */
    public class ResultReceiverC01561 extends ResultReceiver {
        final /* synthetic */ boolean val$matched;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResultReceiverC01561(Handler handler, boolean z) {
            super(handler);
            this.val$matched = z;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m3275b() {
            Intent intentPutExtra = new Intent().putExtra("userId", ProfileShareHelper.this.f1810g.f21140d);
            intentPutExtra.putExtra("action", "report");
            ProfileShareHelper.this.m3268u().setResult(SwipeDirection.LEFT.getValue(), intentPutExtra);
            ProfileShareHelper.this.m3268u().finish();
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (i == -1) {
                boolean z = true;
                if (!ProfileShareHelper.this.f1810g.m23955C() && !ProfileShareHelper.this.f1810g.m23988j()) {
                    z = true ^ this.val$matched;
                }
                if (z) {
                    ProfileShareHelper.this.m3268u().post(new Runnable() { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.imp.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f1812a.m3275b();
                        }
                    });
                }
            }
        }
    }

    public ProfileShareHelper(vi90 vi90Var) {
        this.f1810g = vi90Var;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m3245A(View view) {
        zvf0.r("e_user_profile_more_popup_cancel", "p_user_profile_more_popup");
        this.f1811h.b();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m3246B() {
        if (NullChecker.a(CoreModule.c.e0.oa(this.f1810g.f21140d)) && NullChecker.a(CoreModule.c.e0.oa(this.f1810g.f21140d).fp().profileSmall())) {
            g gVar = CoreModule.c.f0;
            Act actM3268u = m3268u();
            String str = this.f1810g.f21140d;
            gVar.Gp(actM3268u, false, str, CoreModule.c.e0.oa(str).fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m3247C() {
        if (NullChecker.a(CoreModule.c.e0.oa(this.f1810g.f21140d)) && NullChecker.a(CoreModule.c.e0.oa(this.f1810g.f21140d).fp().profileSmall())) {
            g gVar = CoreModule.c.f0;
            Act actM3268u = m3268u();
            String str = this.f1810g.f21140d;
            gVar.Gp(actM3268u, true, str, CoreModule.c.e0.oa(str).fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m3248D(Relationship relationship) {
        m3265U();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m3249E(boolean z, VListCell vListCell, VListCell.a aVar, int i) {
        if (TextUtils.equals(aVar.a.toString(), "分享给朋友看看")) {
            zvf0.r("e_share_to_third_app", "p_user_profile_more_popup");
            if (f9k0.c(this.f1810g.f21140d)) {
                lsi0.y("此用户不可被分享");
            } else {
                ark.U0(m3268u(), "share_bottom", new d30() { // from class: l.osa0
                    public final void call() {
                        this.f16770a.m3246B();
                    }
                }, new d30() { // from class: l.psa0
                    public final void call() {
                        this.f17633a.m3247C();
                    }
                });
            }
        }
        if (TextUtils.equals(aVar.a.toString(), m3268u().getString(R.string.r))) {
            m3264T(z);
        }
        if (TextUtils.equals(aVar.a.toString(), "取消喜欢")) {
            zvf0.u("e_unlike", "p_user_profile_more_popup", new j760[]{vwb.Y("unlike_from", "profile"), vwb.Y("other_user_id", this.f1810g.f21140d)});
            FeedService feedServiceN = CoreModule.N();
            Act actM3268u = m3268u();
            vi90 vi90Var = this.f1810g;
            feedServiceN.T7(actM3268u, vi90Var.f21137a, vi90Var.f21138b, new e30() { // from class: l.qsa0
                public final void call(Object obj) {
                    this.f18201a.m3248D((Relationship) obj);
                }
            });
        } else if (TextUtils.equals(aVar.a.toString(), "取消关注")) {
            FeedService feedServiceN2 = CoreModule.N();
            Act actM3268u2 = m3268u();
            vi90 vi90Var2 = this.f1810g;
            feedServiceN2.Vp(actM3268u2, vi90Var2.f21137a, vi90Var2.f21138b);
        } else if (TextUtils.equals(aVar.a.toString(), m3268u().getString(R.string.h5))) {
            m3269v(new Runnable() { // from class: l.rsa0
                @Override // java.lang.Runnable
                public final void run() {
                    zvf0.u("e_blacklist", "p_user_profile_more_popup", new j760[]{j760.a("blacklist_management", "add")});
                }
            });
        } else if (TextUtils.equals(aVar.a.toString(), m3268u().getString(R.string.v2))) {
            m3263S(new Runnable() { // from class: l.ssa0
                @Override // java.lang.Runnable
                public final void run() {
                    zvf0.u("e_blacklist", "p_user_profile_more_popup", new j760[]{j760.a("blacklist_management", "remove")});
                }
            });
        }
        this.f1811h.b();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m3250F() {
        if (NullChecker.a(CoreModule.c.e0.oa(this.f1810g.f21140d)) && NullChecker.a(CoreModule.c.e0.oa(this.f1810g.f21140d).fp().profile480())) {
            g gVar = CoreModule.c.f0;
            Act actM3268u = m3268u();
            String str = this.f1810g.f21140d;
            gVar.Gp(actM3268u, false, str, CoreModule.c.e0.oa(str).fp().profile480());
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m3251G() {
        if (NullChecker.a(CoreModule.c.e0.oa(this.f1810g.f21140d)) && NullChecker.a(CoreModule.c.e0.oa(this.f1810g.f21140d).fp().profile480())) {
            g gVar = CoreModule.c.f0;
            Act actM3268u = m3268u();
            String str = this.f1810g.f21140d;
            gVar.Gp(actM3268u, true, str, CoreModule.c.e0.oa(str).fp().profile480());
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m3252H(Relationship relationship) {
        m3265U();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m3253I(String str) {
        if (!TextUtils.equals(str, "取消喜欢")) {
            if (!TextUtils.equals(str, "取消关注")) {
                m3264T(this.f1810g.m23962J());
                return;
            }
            FeedService feedServiceN = CoreModule.N();
            Act actM3268u = m3268u();
            vi90 vi90Var = this.f1810g;
            feedServiceN.Vp(actM3268u, vi90Var.f21137a, vi90Var.f21138b);
            return;
        }
        zvf0.u("e_unlike", "p_user_profile_more_popup", new j760[]{vwb.Y("unlike_from", "profile"), vwb.Y("other_user_id", this.f1810g.f21140d)});
        FeedService feedServiceN2 = CoreModule.N();
        Act actM3268u2 = m3268u();
        vi90 vi90Var2 = this.f1810g;
        feedServiceN2.T7(actM3268u2, vi90Var2.f21137a, vi90Var2.f21138b, new e30() { // from class: l.cta0
            public final void call(Object obj) {
                this.f8934a.m3252H((Relationship) obj);
            }
        });
        if (this.f1810g.m23995r()) {
            CoreModule.c.Z0.f4("");
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m3254J() {
        m3264T(this.f1810g.m23962J());
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m3255K(String str) {
        if (TextUtils.equals(str, m3268u().getString(R.string.h5))) {
            m3269v(null);
        } else if (TextUtils.equals(str, m3268u().getString(R.string.v2))) {
            m3263S(null);
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m3256L() {
        User userQuery = qib0.k0.d.query(this.f1810g.f21140d);
        if (userQuery != null && NullChecker.a(userQuery.localRelationship) && NullChecker.a(userQuery.localRelationship.relationshipExtensions) && TEnum.equals(userQuery.localRelationship.relationshipExtensions.relationType, "SUPERLIKED")) {
            userQuery.localRelationship.relationshipExtensions.relationType = RelationshipStatus.get("unknown_");
            qib0.k0.d.upsert(userQuery);
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m3257M() {
        CoreModule.c.U.a(new d30() { // from class: l.tsa0
            public final void call() {
                this.f20366a.m3256L();
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m3258N() {
        ArrayList arrayList = new ArrayList();
        final cwf0 cwf0VarC = i0e.c("p_user_profile_more_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("other_user_id", this.f1810g.f21140d)});
        if (this.f1810g.m23962J()) {
            arrayList.add("分享给朋友看看");
        }
        if (CoreModule.N().so()) {
            cwf0VarC.p(new j760[]{vwb.Y("share_pop_from_which", "profile")});
            if (this.f1810g.m23968P()) {
                arrayList.add("取消喜欢");
            } else if (this.f1810g.m23984f()) {
                arrayList.add("取消关注");
            }
        }
        arrayList.add(m3268u().getString(R.string.r));
        if (this.f1810g.m23989k() || this.f1810g.m23990m() || this.f1810g.m23991n()) {
            if (CoreModule.N().Kk(this.f1810g.f21137a)) {
                cwf0VarC.p(new j760[]{vwb.Y("blacklist_management", "remove")});
                arrayList.add(m3268u().getString(R.string.v2));
            } else {
                cwf0VarC.p(new j760[]{vwb.Y("blacklist_management", "add")});
                arrayList.add(m3268u().getString(R.string.h5));
            }
        }
        int iIndexOf = arrayList.indexOf(m3268u().getString(R.string.r));
        i0e.f(cwf0VarC);
        c40.b bVar = new c40.b(m3268u());
        final boolean zM23962J = this.f1810g.m23962J();
        bVar.T(new DialogInterface.OnDismissListener() { // from class: l.lsa0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).I(m3268u().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.usa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20775a.m3245A(view);
            }
        }).Q(arrayList).R(new int[]{iIndexOf}, new int[]{w0c0.L}).V(new c40.d() { // from class: l.vsa0
            /* JADX INFO: renamed from: a */
            public final void m24118a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f21288a.m3249E(zM23962J, vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f1811h = c40VarF;
        c40VarF.f();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX INFO: renamed from: O */
    public void m3259O() {
        final String str;
        String str2;
        if (!CoreModule.N().so() || this.f1810g.m23963K()) {
            str = "";
        } else {
            if (!this.f1810g.m23966N() && !this.f1810g.m23967O()) {
                str2 = "取消喜欢";
            } else if (this.f1810g.m23984f()) {
                str2 = "取消关注";
            } else {
                str = "";
            }
            str = str2;
        }
        final String string = !CoreModule.N().Kk(this.f1810g.f21137a) ? m3268u().getString(R.string.h5) : m3268u().getString(R.string.v2);
        ark.a1("", m3268u(), "", TextUtils.isEmpty(str) ? "share_right" : "", str, string, new d30() { // from class: l.wsa0
            public final void call() {
                this.f21966a.m3250F();
            }
        }, new d30() { // from class: l.xsa0
            public final void call() {
                this.f22442a.m3251G();
            }
        }, new d30() { // from class: l.ysa0
            public final void call() {
                this.f23066a.m3253I(str);
            }
        }, (d30) null, new d30() { // from class: l.zsa0
            public final void call() {
                this.f23576a.m3254J();
            }
        }, new d30() { // from class: l.ata0
            public final void call() {
                this.f7877a.m3255K(string);
            }
        }, new d30() { // from class: l.bta0
            public final void call() {
                d.l().k("share_tip");
            }
        }, (d30) null, m3271x(), this.f1810g.f21137a);
    }

    /* JADX INFO: renamed from: P */
    public void m3260P() {
        this.f1808e.a(1);
        this.f1809f.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: Q */
    public void m3261Q() {
        if (!((String) this.f1806c.get()).equals(mqi0.t())) {
            this.f1806c.put(mqi0.t());
            this.f1807d.put(0);
            this.f1805b.put(0);
        }
        if (NullChecker.a(this.f1810g) && sb90.d(this.f1810g.f21137a)) {
            return;
        }
        tpd0 tpd0Var = this.f1807d;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: R */
    public void m3262R() {
        tpd0 tpd0Var = this.f1805b;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        tpd0 tpd0Var2 = this.f1804a;
        tpd0Var2.put(Integer.valueOf(((Integer) tpd0Var2.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: S */
    public final void m3263S(Runnable runnable) {
        pj90.y(m3268u(), this.f1810g.f21137a, runnable);
    }

    /* JADX INFO: renamed from: T */
    public final void m3264T(boolean z) {
        m3268u().startActivity(ReportAct.d2(m3268u(), this.f1810g.f21140d, "", z, new ResultReceiverC01561(null, z), "profile", true));
    }

    /* JADX INFO: renamed from: U */
    public final void m3265U() {
        if (this.f1810g.m23995r()) {
            LikedUser likedUserC3 = CoreModule.c.Z0.C3(this.f1810g.f21140d);
            if (this.f1810g.m23995r() && NullChecker.a(likedUserC3)) {
                likedUserC3.status = RelationshipStatus.get("unknown_");
            }
        }
        e51.y(new Runnable() { // from class: l.nsa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16175a.m3257M();
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public boolean m3266V() {
        return ((Integer) this.f1805b.get()).intValue() == 2 || ((Integer) this.f1804a.get()).intValue() == 6 || !((String) this.f1806c.get()).equals(mqi0.t()) || ((Integer) this.f1807d.get()).intValue() > 3 || f9k0.a() || m3272y();
    }

    /* JADX INFO: renamed from: W */
    public boolean m3267W() {
        return ((Integer) this.f1807d.get()).intValue() == 2 || ((Integer) this.f1807d.get()).intValue() == 3;
    }

    /* JADX INFO: renamed from: u */
    public final Act m3268u() {
        return this.f1810g.m23979a();
    }

    /* JADX INFO: renamed from: v */
    public final void m3269v(final Runnable runnable) {
        pj90.j(m3268u(), this.f1810g.f21137a, new Runnable() { // from class: l.msa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15610a.m3273z(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public boolean m3270w() {
        return ((Integer) this.f1808e.get()).intValue() < 3 && !mqi0.C(((Long) this.f1809f.get()).longValue(), mqi0.o());
    }

    /* JADX INFO: renamed from: x */
    public final List<ShareItemBean> m3271x() {
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m3272y() {
        return NullChecker.a(this.f1810g) && sb90.d(this.f1810g.f21137a);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m3273z(Runnable runnable) {
        if ((this.f1810g.m23979a() instanceof ProfileAct) && this.f1810g.m23992o()) {
            CoreModule.c.m0.I8(vwb.M(((DbObject) this.f1810g.f21137a).id));
            a aVar = CoreModule.c.m0.a0;
            aVar.onNext((PartialListOpt) aVar.e());
            this.f1810g.m23979a().onBackPressed();
        }
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }
}

package com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.Action;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.ShareItemBean;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.report.ReportAct;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.subjects.C22392a;
import p147v.VListCell;
import p149l.ark;
import p149l.c40;
import p149l.cwf0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.f9k0;
import p149l.i0e;
import p149l.lsi0;
import p149l.mqi0;
import p149l.pj90;
import p149l.qib0;
import p149l.sb90;
import p149l.tpd0;
import p149l.uqd0;
import p149l.vi90;
import p149l.vwb;
import p149l.w0c0;
import p149l.zpd0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileShareHelper {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final tpd0 f33982a = new tpd0("show_share_tip_count_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: b */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final tpd0 f33983b = new tpd0("show_share_today_tip_count" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: c */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final uqd0 f33984c = new uqd0("show_share_tip_data_" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: d */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final tpd0 f33985d = new tpd0("show_share_tip_user_count_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: e */
    public tpd0 f33986e = new tpd0("game_cp_profile_share_tip_show_count" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: f */
    public zpd0 f33987f = new zpd0("game_cp_profile_share_tip_latest_show_time" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public final vi90 f33988g;

    /* JADX INFO: renamed from: h */
    public c40 f33989h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileShareHelper$1 */
    public class ResultReceiverC87311 extends ResultReceiver {
        final /* synthetic */ boolean val$matched;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResultReceiverC87311(Handler handler, boolean z) {
            super(handler);
            this.val$matched = z;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m52724b() {
            Intent intentPutExtra = new Intent().putExtra("userId", ProfileShareHelper.this.f33988g.f181564d);
            intentPutExtra.putExtra("action", "report");
            ProfileShareHelper.this.m52717u().setResult(SwipeDirection.LEFT.getValue(), intentPutExtra);
            ProfileShareHelper.this.m52717u().m66873d2();
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (i == -1) {
                boolean z = true;
                if (!ProfileShareHelper.this.f33988g.m198502C() && !ProfileShareHelper.this.f33988g.m198535j()) {
                    z = true ^ this.val$matched;
                }
                if (z) {
                    ProfileShareHelper.this.m52717u().post(new Runnable() { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.imp.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f33990a.m52724b();
                        }
                    });
                }
            }
        }
    }

    public ProfileShareHelper(vi90 vi90Var) {
        this.f33988g = vi90Var;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m52694A(View view) {
        zvf0.m220396r("e_user_profile_more_popup_cancel", "p_user_profile_more_popup");
        this.f33989h.m105113b();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m52695B() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(this.f33988g.f181564d)) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(this.f33988g.f181564d).m60124fp().profileSmall())) {
            C4740g c4740g = CoreModule.f17545c.f19642f0;
            Act actM52717u = m52717u();
            String str = this.f33988g.f181564d;
            c4740g.m32664Gp(actM52717u, false, str, CoreModule.f17545c.f19639e0.m169524oa(str).m60124fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m52696C() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(this.f33988g.f181564d)) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(this.f33988g.f181564d).m60124fp().profileSmall())) {
            C4740g c4740g = CoreModule.f17545c.f19642f0;
            Act actM52717u = m52717u();
            String str = this.f33988g.f181564d;
            c4740g.m32664Gp(actM52717u, true, str, CoreModule.f17545c.f19639e0.m169524oa(str).m60124fp().profileSmall());
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m52697D(Relationship relationship) {
        m52714U();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m52698E(boolean z, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (TextUtils.equals(c22545a.f209159a.toString(), "分享给朋友看看")) {
            zvf0.m220396r("e_share_to_third_app", "p_user_profile_more_popup");
            if (f9k0.m120090c(this.f33988g.f181564d)) {
                lsi0.m151595y("此用户不可被分享");
            } else {
                ark.m98451U0(m52717u(), "share_bottom", new d30() { // from class: l.osa0
                    @Override // p149l.d30
                    public final void call() {
                        this.f145379a.m52695B();
                    }
                }, new d30() { // from class: l.psa0
                    @Override // p149l.d30
                    public final void call() {
                        this.f150987a.m52696C();
                    }
                });
            }
        }
        if (TextUtils.equals(c22545a.f209159a.toString(), m52717u().getString(R$string.f18868r))) {
            m52713T(z);
        }
        if (TextUtils.equals(c22545a.f209159a.toString(), "取消喜欢")) {
            zvf0.m220399u("e_unlike", "p_user_profile_more_popup", vwb.m200311Y("unlike_from", "profile"), vwb.m200311Y("other_user_id", this.f33988g.f181564d));
            FeedService feedServiceM29934N = CoreModule.m29934N();
            Act actM52717u = m52717u();
            vi90 vi90Var = this.f33988g;
            feedServiceM29934N.mo60318T7(actM52717u, vi90Var.f181561a, vi90Var.f181562b, new e30() { // from class: l.qsa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f156151a.m52697D((Relationship) obj);
                }
            });
        } else if (TextUtils.equals(c22545a.f209159a.toString(), "取消关注")) {
            FeedService feedServiceM29934N2 = CoreModule.m29934N();
            Act actM52717u2 = m52717u();
            vi90 vi90Var2 = this.f33988g;
            feedServiceM29934N2.mo60330Vp(actM52717u2, vi90Var2.f181561a, vi90Var2.f181562b);
        } else if (TextUtils.equals(c22545a.f209159a.toString(), m52717u().getString(R$string.f18568h5))) {
            m52718v(new Runnable() { // from class: l.rsa0
                @Override // java.lang.Runnable
                public final void run() {
                    zvf0.m220399u("e_blacklist", "p_user_profile_more_popup", j760.m140076a("blacklist_management", "add"));
                }
            });
        } else if (TextUtils.equals(c22545a.f209159a.toString(), m52717u().getString(R$string.f18991v2))) {
            m52712S(new Runnable() { // from class: l.ssa0
                @Override // java.lang.Runnable
                public final void run() {
                    zvf0.m220399u("e_blacklist", "p_user_profile_more_popup", j760.m140076a("blacklist_management", Action.remove));
                }
            });
        }
        this.f33989h.m105113b();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m52699F() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(this.f33988g.f181564d)) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(this.f33988g.f181564d).m60124fp().profile480())) {
            C4740g c4740g = CoreModule.f17545c.f19642f0;
            Act actM52717u = m52717u();
            String str = this.f33988g.f181564d;
            c4740g.m32664Gp(actM52717u, false, str, CoreModule.f17545c.f19639e0.m169524oa(str).m60124fp().profile480());
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m52700G() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(this.f33988g.f181564d)) && NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(this.f33988g.f181564d).m60124fp().profile480())) {
            C4740g c4740g = CoreModule.f17545c.f19642f0;
            Act actM52717u = m52717u();
            String str = this.f33988g.f181564d;
            c4740g.m32664Gp(actM52717u, true, str, CoreModule.f17545c.f19639e0.m169524oa(str).m60124fp().profile480());
        }
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m52701H(Relationship relationship) {
        m52714U();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m52702I(String str) {
        if (!TextUtils.equals(str, "取消喜欢")) {
            if (!TextUtils.equals(str, "取消关注")) {
                m52713T(this.f33988g.m198509J());
                return;
            }
            FeedService feedServiceM29934N = CoreModule.m29934N();
            Act actM52717u = m52717u();
            vi90 vi90Var = this.f33988g;
            feedServiceM29934N.mo60330Vp(actM52717u, vi90Var.f181561a, vi90Var.f181562b);
            return;
        }
        zvf0.m220399u("e_unlike", "p_user_profile_more_popup", vwb.m200311Y("unlike_from", "profile"), vwb.m200311Y("other_user_id", this.f33988g.f181564d));
        FeedService feedServiceM29934N2 = CoreModule.m29934N();
        Act actM52717u2 = m52717u();
        vi90 vi90Var2 = this.f33988g;
        feedServiceM29934N2.mo60318T7(actM52717u2, vi90Var2.f181561a, vi90Var2.f181562b, new e30() { // from class: l.cta0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82464a.m52701H((Relationship) obj);
            }
        });
        if (this.f33988g.m198542r()) {
            CoreModule.f17545c.f19625Z0.m163931f4("");
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m52703J() {
        m52713T(this.f33988g.m198509J());
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m52704K(String str) {
        if (TextUtils.equals(str, m52717u().getString(R$string.f18568h5))) {
            m52718v(null);
        } else if (TextUtils.equals(str, m52717u().getString(R$string.f18991v2))) {
            m52712S(null);
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m52705L() {
        User userQuery = qib0.f154722k0.f176631d.query(this.f33988g.f181564d);
        if (userQuery != null && NullChecker.m81303a(userQuery.localRelationship) && NullChecker.m81303a(userQuery.localRelationship.relationshipExtensions) && TEnum.equals(userQuery.localRelationship.relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED)) {
            userQuery.localRelationship.relationshipExtensions.relationType = RelationshipStatus.get("unknown_");
            qib0.f154722k0.f176631d.upsert(userQuery);
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m52706M() {
        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.tsa0
            @Override // p149l.d30
            public final void call() {
                this.f171920a.m52705L();
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public void m52707N() {
        ArrayList arrayList = new ArrayList();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_user_profile_more_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("other_user_id", this.f33988g.f181564d));
        if (this.f33988g.m198509J()) {
            arrayList.add("分享给朋友看看");
        }
        if (CoreModule.m29934N().mo60389so()) {
            cwf0VarM133794c.m109040p(vwb.m200311Y("share_pop_from_which", "profile"));
            if (this.f33988g.m198515P()) {
                arrayList.add("取消喜欢");
            } else if (this.f33988g.m198531f()) {
                arrayList.add("取消关注");
            }
        }
        arrayList.add(m52717u().getString(R$string.f18868r));
        if (this.f33988g.m198536k() || this.f33988g.m198537m() || this.f33988g.m198538n()) {
            if (CoreModule.m29934N().mo60288Kk(this.f33988g.f181561a)) {
                cwf0VarM133794c.m109040p(vwb.m200311Y("blacklist_management", Action.remove));
                arrayList.add(m52717u().getString(R$string.f18991v2));
            } else {
                cwf0VarM133794c.m109040p(vwb.m200311Y("blacklist_management", "add"));
                arrayList.add(m52717u().getString(R$string.f18568h5));
            }
        }
        int iIndexOf = arrayList.indexOf(m52717u().getString(R$string.f18868r));
        i0e.m133797f(cwf0VarM133794c);
        c40.C16057b c16057b = new c40.C16057b(m52717u());
        final boolean zM198509J = this.f33988g.m198509J();
        c16057b.m105167T(new DialogInterface.OnDismissListener() { // from class: l.lsa0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m105156I(m52717u().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.usa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177951a.m52694A(view);
            }
        }).m105164Q(arrayList).m105165R(new int[]{iIndexOf}, new int[]{w0c0.f183782L}).m105169V(new c40.InterfaceC16059d() { // from class: l.vsa0
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f182816a.m52698E(zM198509J, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f33989h = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX INFO: renamed from: O */
    public void m52708O() {
        final String str;
        String str2;
        if (!CoreModule.m29934N().mo60389so() || this.f33988g.m198510K()) {
            str = "";
        } else {
            if (!this.f33988g.m198513N() && !this.f33988g.m198514O()) {
                str2 = "取消喜欢";
            } else if (this.f33988g.m198531f()) {
                str2 = "取消关注";
            } else {
                str = "";
            }
            str = str2;
        }
        final String string = !CoreModule.m29934N().mo60288Kk(this.f33988g.f181561a) ? m52717u().getString(R$string.f18568h5) : m52717u().getString(R$string.f18991v2);
        ark.m98463a1("", m52717u(), "", TextUtils.isEmpty(str) ? "share_right" : "", str, string, new d30() { // from class: l.wsa0
            @Override // p149l.d30
            public final void call() {
                this.f187910a.m52699F();
            }
        }, new d30() { // from class: l.xsa0
            @Override // p149l.d30
            public final void call() {
                this.f194215a.m52700G();
            }
        }, new d30() { // from class: l.ysa0
            @Override // p149l.d30
            public final void call() {
                this.f199756a.m52702I(str);
            }
        }, null, new d30() { // from class: l.zsa0
            @Override // p149l.d30
            public final void call() {
                this.f204578a.m52703J();
            }
        }, new d30() { // from class: l.ata0
            @Override // p149l.d30
            public final void call() {
                this.f71592a.m52704K(string);
            }
        }, new d30() { // from class: l.bta0
            @Override // p149l.d30
            public final void call() {
                C4348d.m20896l().m20900k("share_tip");
            }
        }, null, m52720x(), this.f33988g.f181561a);
    }

    /* JADX INFO: renamed from: P */
    public void m52709P() {
        this.f33986e.m189988a(1);
        this.f33987f.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: Q */
    public void m52710Q() {
        if (!this.f33984c.get().equals(mqi0.m155949t())) {
            this.f33984c.put(mqi0.m155949t());
            this.f33985d.put(0);
            this.f33983b.put(0);
        }
        if (NullChecker.m81303a(this.f33988g) && sb90.m183208d(this.f33988g.f181561a)) {
            return;
        }
        tpd0 tpd0Var = this.f33985d;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: R */
    public void m52711R() {
        tpd0 tpd0Var = this.f33983b;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        tpd0 tpd0Var2 = this.f33982a;
        tpd0Var2.put(Integer.valueOf(tpd0Var2.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: S */
    public final void m52712S(Runnable runnable) {
        pj90.m169810y(m52717u(), this.f33988g.f181561a, runnable);
    }

    /* JADX INFO: renamed from: T */
    public final void m52713T(boolean z) {
        m52717u().startActivity(ReportAct.m54631d2(m52717u(), this.f33988g.f181564d, "", z, new ResultReceiverC87311(null, z), "profile", true));
    }

    /* JADX INFO: renamed from: U */
    public final void m52714U() {
        if (this.f33988g.m198542r()) {
            LikedUser likedUserM163902C3 = CoreModule.f17545c.f19625Z0.m163902C3(this.f33988g.f181564d);
            if (this.f33988g.m198542r() && NullChecker.m81303a(likedUserM163902C3)) {
                likedUserM163902C3.status = RelationshipStatus.get("unknown_");
            }
        }
        e51.m114774y(new Runnable() { // from class: l.nsa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f140254a.m52706M();
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public boolean m52715V() {
        return this.f33983b.get().intValue() == 2 || this.f33982a.get().intValue() == 6 || !this.f33984c.get().equals(mqi0.m155949t()) || this.f33985d.get().intValue() > 3 || f9k0.m120088a() || m52721y();
    }

    /* JADX INFO: renamed from: W */
    public boolean m52716W() {
        return this.f33985d.get().intValue() == 2 || this.f33985d.get().intValue() == 3;
    }

    /* JADX INFO: renamed from: u */
    public final Act m52717u() {
        return this.f33988g.m198526a();
    }

    /* JADX INFO: renamed from: v */
    public final void m52718v(final Runnable runnable) {
        pj90.m169798j(m52717u(), this.f33988g.f181561a, new Runnable() { // from class: l.msa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f135457a.m52722z(runnable);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public boolean m52719w() {
        return this.f33986e.get().intValue() < 3 && !mqi0.m155928C(this.f33987f.get().longValue(), mqi0.m155944o());
    }

    /* JADX INFO: renamed from: x */
    public final List<ShareItemBean> m52720x() {
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m52721y() {
        return NullChecker.m81303a(this.f33988g) && sb90.m183208d(this.f33988g.f181561a);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m52722z(Runnable runnable) {
        if ((this.f33988g.m198526a() instanceof ProfileAct) && this.f33988g.m198539o()) {
            CoreModule.f17545c.f19663m0.m31010I8(vwb.m200299M(this.f33988g.f181561a.f56011id));
            C22392a<PartialListOpt<CoreSuggested.UserInfo>> c22392a = CoreModule.f17545c.f19663m0.f19394a0;
            c22392a.m132487l(c22392a.m221515e());
            this.f33988g.m198526a().onBackPressed();
        }
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }
}

package com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp;

import android.os.Bundle;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p046p1.mobile.putong.core.p053ui.report.C8829f;
import com.p046p1.mobile.putong.core.util.DebugUtil;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.a1m;
import p149l.d30;
import p149l.eea0;
import p149l.fh90;
import p149l.hpd0;
import p149l.io90;
import p149l.j760;
import p149l.lra0;
import p149l.mm90;
import p149l.mqi0;
import p149l.o660;
import p149l.p660;
import p149l.vi90;
import p149l.vwb;
import p149l.yca0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileListFragLocalImpl extends PutongMvpFrag<yca0, eea0> {

    /* JADX INFO: renamed from: B */
    public io90 f33975B;

    /* JADX INFO: renamed from: C */
    public vi90 f33976C;

    /* JADX INFO: renamed from: D */
    public boolean f33977D = false;

    /* JADX INFO: renamed from: E */
    public boolean f33978E = false;

    /* JADX INFO: renamed from: F */
    public boolean f33979F = false;

    /* JADX INFO: renamed from: G */
    public yca0 f33980G;

    /* JADX INFO: renamed from: H */
    public eea0 f33981H;

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ void m52658R4() {
        hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149460r2;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.f17545c.f19639e0.f149453q2.put(bool);
    }

    /* JADX INFO: renamed from: S4 */
    public static ProfileListFragLocalImpl m52659S4(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        mm90 mm90Var = new mm90();
        mm90Var.f134562a = str;
        mm90Var.f134564c = z2;
        mm90Var.f134566e = str2;
        mm90Var.f134563b = z;
        mm90Var.f134567f = z3;
        mm90Var.f134568g = RelationshipStatus.get("unknown_");
        mm90Var.f134572k = false;
        mm90Var.f134573l = z4;
        mm90Var.f134574m = -1;
        return m52660T4(mm90Var);
    }

    /* JADX INFO: renamed from: T4 */
    public static ProfileListFragLocalImpl m52660T4(mm90 mm90Var) {
        ProfileListFragLocalImpl profileListFragLocalImpl = new ProfileListFragLocalImpl();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", mm90Var.f134562a);
        bundle.putBoolean("is_edit", mm90Var.f134564c);
        bundle.putString("input_type", mm90Var.f134565d);
        bundle.putBoolean("show_buttons", mm90Var.f134563b);
        bundle.putBoolean("canShowFollowButton", mm90Var.f134573l);
        bundle.putBoolean("no_showbuttons_infofromlocal", mm90Var.f134571j);
        bundle.putString("from", mm90Var.f134566e);
        bundle.putBoolean("open_media_picker", mm90Var.f134567f);
        bundle.putString("relationship_status", mm90Var.f134568g.toString());
        bundle.putInt("button_flag", mm90Var.f134569h);
        bundle.putBoolean("with_superlike", mm90Var.f134570i);
        bundle.putInt("pic_index", mm90Var.f134574m);
        bundle.putInt("pushReason", mm90Var.f134576o);
        bundle.putString("pushTag", mm90Var.f134577p);
        bundle.putSerializable("city_centre_data", mm90Var.f134578q);
        profileListFragLocalImpl.setArguments(bundle);
        return profileListFragLocalImpl;
    }

    /* JADX INFO: renamed from: V4 */
    private String m52661V4(User user) {
        if (CoreModule.f17545c.f19561E0.m203772B3(user) || User.isTeamAccount(user.f56011id) || user.isMe()) {
            return "";
        }
        return (user.location.isHideInfo() && user.location.isHideDistance()) ? "" : String.valueOf(user.location.distance);
    }

    /* JADX INFO: renamed from: W4 */
    private String m52662W4(String str) {
        o660 o660VarM167645d = p660.m167645d();
        String strM162820c = o660VarM167645d == null ? "" : o660VarM167645d.m162820c();
        if (TextUtils.equals("share_profile", str)) {
            return "journey_new_share";
        }
        return TextUtils.equals("from_find_partner", str) ? "p_find_partner_mainpage" : strM162820c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m52663Z4() {
        m20581b4().m20504F(this.f33976C.f181564d).m20568z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m52664a5() {
        if (NullChecker.m81303a(this.f33980G.m214117Z2())) {
            DebugUtil.m59280zk(this.f33980G.m214117Z2(), act());
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public ArrayList<j760<String, d30>> mo29633C4() {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        arrayList.add(vwb.m200311Y("user id", new d30() { // from class: l.h9a0
            @Override // p149l.d30
            public final void call() {
                this.f106524a.m52663Z4();
            }
        }));
        arrayList.add(vwb.m200311Y("用户位置信息", new d30() { // from class: l.i9a0
            @Override // p149l.d30
            public final void call() {
                this.f112130a.m52664a5();
            }
        }));
        arrayList.add(vwb.m200311Y("认证气泡本地数据清理：" + CoreModule.f17545c.f19639e0.f149460r2.get() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f17545c.f19639e0.f149453q2.get(), new d30() { // from class: l.j9a0
            @Override // p149l.d30
            public final void call() {
                ProfileListFragLocalImpl.m52658R4();
            }
        }));
        arrayList.add(vwb.m200311Y("弹出先发like弹窗", new d30() { // from class: l.k9a0
            @Override // p149l.d30
            public final void call() {
                xdx.m208433A().m208464N(CoreModule.m29932K().me_().f56011id);
            }
        }));
        return arrayList;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: X4, reason: merged with bridge method [inline-methods] */
    public yca0 mo29641M4() {
        yca0 yca0Var = new yca0(this, this.f33976C);
        this.f33980G = yca0Var;
        return yca0Var;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Y4, reason: merged with bridge method [inline-methods] */
    public eea0 mo29642N4() {
        eea0 eea0Var = new eea0(this, this.f33976C);
        this.f33981H = eea0Var;
        return eea0Var;
    }

    /* JADX INFO: renamed from: b5 */
    public void m52668b5() {
        this.f33980G.m214087D1();
    }

    /* JADX INFO: renamed from: c5 */
    public yca0 m52669c5() {
        return this.f33980G;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        vi90 vi90Var = new vi90(this, new fh90(this));
        this.f33976C = vi90Var;
        vi90Var.m198529d(getArguments());
        this.f33975B = new io90(this.f33976C);
        super.mo20583d4();
        if ("my_tab_profile_like".equals(this.f33976C.f181562b)) {
            this.pageHelper.m109041q(pageId());
        } else {
            m52671e5();
        }
    }

    /* JADX INFO: renamed from: d5 */
    public a1m m52670d5() {
        return this.f33975B;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: e5 */
    public void m52671e5() {
        String str;
        this.pageHelper.m109041q(pageId());
        C8829f.m54696b().m54701f(this.f33976C.f181562b);
        vi90 vi90Var = this.f33976C;
        String str2 = vi90Var.f181564d;
        String strValueOf = "";
        if (TextUtils.equals("home_card", vi90Var.f181562b) || TextUtils.equals("from_city_center_conv_banner", this.f33976C.f181562b)) {
            str = "home";
        } else {
            str = !TextUtils.equals("home_menu", this.f33976C.f181562b) ? "other" : "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("moments_user_id", str2);
            jSONObject.put("source", str);
            jSONObject.put("is_myself", this.f33976C.m198510K() ? "true" : "false");
            User userById = CoreModule.m29932K().getUserById(this.f33976C.f181564d);
            boolean z = false;
            if (NullChecker.m81303a(userById)) {
                if (!userById.location.isHideUpdateTime() && !userById.isMe() && !CoreModule.f17545c.f19561E0.m203801x3(userById)) {
                    strValueOf = String.valueOf((mqi0.m155944o() - userById.getLastActiveTimeMillis()) / 1000);
                }
                Relationship relationship = userById.localRelationship;
                if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
                    jSONObject.put("is_match", 0);
                } else {
                    jSONObject.put("is_match", 1);
                }
                jSONObject.put("distance", m52661V4(userById));
                jSONObject.put("lastactivity_time", strValueOf);
            }
            jSONObject.put("refer_source", m52662W4(this.f33976C.f181562b));
            if (TextUtils.equals("from_city_center_conv_banner", this.f33976C.f181562b) || (NullChecker.m81303a(this.f33976C.f181561a) && this.f33976C.f181561a.isOnCityTop())) {
                z = true;
            }
            jSONObject.put("city_cover", z);
            this.pageHelper.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public void m52672f5() {
        lra0.m151149h("android_back");
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f33981H.m115949r();
    }

    /* JADX INFO: renamed from: g5 */
    public eea0 m52673g5() {
        return this.f33981H;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        this.f33981H.m115916L0(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        PerformanceLogUtil.instance().endTrance();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return NullChecker.m81303a(this.f33980G) ? this.f33980G.pageId() : super.pageId();
    }
}

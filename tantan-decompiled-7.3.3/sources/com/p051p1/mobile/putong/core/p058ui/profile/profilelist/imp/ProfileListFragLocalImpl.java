package com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp;

import android.os.Bundle;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.PerformanceLogUtil;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p051p1.mobile.putong.core.p058ui.report.C8992f;
import com.p051p1.mobile.putong.core.util.DebugUtil;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.cla0;
import p153l.ima0;
import p153l.jp90;
import p153l.jxd0;
import p153l.jyb;
import p153l.mw90;
import p153l.pf60;
import p153l.pza0;
import p153l.pzi0;
import p153l.qu90;
import p153l.t3m;
import p153l.ue60;
import p153l.ve60;
import p153l.x20;
import p153l.zq90;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileListFragLocalImpl extends PutongMvpFrag<cla0, ima0> {

    /* JADX INFO: renamed from: B */
    public mw90 f34823B;

    /* JADX INFO: renamed from: C */
    public zq90 f34824C;

    /* JADX INFO: renamed from: D */
    public boolean f34825D = false;

    /* JADX INFO: renamed from: E */
    public boolean f34826E = false;

    /* JADX INFO: renamed from: F */
    public boolean f34827F = false;

    /* JADX INFO: renamed from: G */
    public cla0 f34828G;

    /* JADX INFO: renamed from: H */
    public ima0 f34829H;

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ void m53841R4() {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89317r2;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        CoreModule.f18264c.f20381e0.f89310q2.put(bool);
    }

    /* JADX INFO: renamed from: S4 */
    public static ProfileListFragLocalImpl m53842S4(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        qu90 qu90Var = new qu90();
        qu90Var.f159534a = str;
        qu90Var.f159536c = z2;
        qu90Var.f159538e = str2;
        qu90Var.f159535b = z;
        qu90Var.f159539f = z3;
        qu90Var.f159540g = RelationshipStatus.get("unknown_");
        qu90Var.f159544k = false;
        qu90Var.f159545l = z4;
        qu90Var.f159546m = -1;
        return m53843T4(qu90Var);
    }

    /* JADX INFO: renamed from: T4 */
    public static ProfileListFragLocalImpl m53843T4(qu90 qu90Var) {
        ProfileListFragLocalImpl profileListFragLocalImpl = new ProfileListFragLocalImpl();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", qu90Var.f159534a);
        bundle.putBoolean("is_edit", qu90Var.f159536c);
        bundle.putString("input_type", qu90Var.f159537d);
        bundle.putBoolean("show_buttons", qu90Var.f159535b);
        bundle.putBoolean("canShowFollowButton", qu90Var.f159545l);
        bundle.putBoolean("no_showbuttons_infofromlocal", qu90Var.f159543j);
        bundle.putString("from", qu90Var.f159538e);
        bundle.putBoolean("open_media_picker", qu90Var.f159539f);
        bundle.putString("relationship_status", qu90Var.f159540g.toString());
        bundle.putInt("button_flag", qu90Var.f159541h);
        bundle.putBoolean("with_superlike", qu90Var.f159542i);
        bundle.putInt("pic_index", qu90Var.f159546m);
        bundle.putInt("pushReason", qu90Var.f159548o);
        bundle.putString("pushTag", qu90Var.f159549p);
        bundle.putSerializable("city_centre_data", qu90Var.f159550q);
        profileListFragLocalImpl.setArguments(bundle);
        return profileListFragLocalImpl;
    }

    /* JADX INFO: renamed from: V4 */
    private String m53844V4(User user) {
        if (CoreModule.f18264c.f20303E0.m141060B3(user) || User.isTeamAccount(user.f56859id) || user.isMe()) {
            return "";
        }
        return (user.location.isHideInfo() && user.location.isHideDistance()) ? "" : String.valueOf(user.location.distance);
    }

    /* JADX INFO: renamed from: W4 */
    private String m53845W4(String str) {
        ue60 ue60VarM201037d = ve60.m201037d();
        String strM195739c = ue60VarM201037d == null ? "" : ue60VarM201037d.m195739c();
        if (TextUtils.equals("share_profile", str)) {
            return "journey_new_share";
        }
        return TextUtils.equals("from_find_partner", str) ? "p_find_partner_mainpage" : strM195739c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m53846Z4() {
        m21580b4().m21503F(this.f34824C.f205579d).m21567z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m53847a5() {
        if (NullChecker.m82486a(this.f34828G.m110562Z2())) {
            DebugUtil.m59358Ak(this.f34828G.m110562Z2(), act());
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public ArrayList<pf60<String, x20>> mo30631C4() {
        ArrayList<pf60<String, x20>> arrayList = new ArrayList<>();
        arrayList.add(jyb.m147494Y("user id", new x20() { // from class: l.lha0
            @Override // p153l.x20
            public final void call() {
                this.f132081a.m53846Z4();
            }
        }));
        arrayList.add(jyb.m147494Y("用户位置信息", new x20() { // from class: l.mha0
            @Override // p153l.x20
            public final void call() {
                this.f136836a.m53847a5();
            }
        }));
        arrayList.add(jyb.m147494Y("认证气泡本地数据清理：" + CoreModule.f18264c.f20381e0.f89317r2.get() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f18264c.f20381e0.f89310q2.get(), new x20() { // from class: l.nha0
            @Override // p153l.x20
            public final void call() {
                ProfileListFragLocalImpl.m53841R4();
            }
        }));
        arrayList.add(jyb.m147494Y("弹出先发like弹窗", new x20() { // from class: l.oha0
            @Override // p153l.x20
            public final void call() {
                wgx.m206283A().m206314N(CoreModule.m30930K().me_().f56859id);
            }
        }));
        return arrayList;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: X4, reason: merged with bridge method [inline-methods] */
    public cla0 mo30639M4() {
        cla0 cla0Var = new cla0(this, this.f34824C);
        this.f34828G = cla0Var;
        return cla0Var;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Y4, reason: merged with bridge method [inline-methods] */
    public ima0 mo30640N4() {
        ima0 ima0Var = new ima0(this, this.f34824C);
        this.f34829H = ima0Var;
        return ima0Var;
    }

    /* JADX INFO: renamed from: b5 */
    public void m53851b5() {
        this.f34828G.m110532D1();
    }

    /* JADX INFO: renamed from: c5 */
    public cla0 m53852c5() {
        return this.f34828G;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        zq90 zq90Var = new zq90(this, new jp90(this));
        this.f34824C = zq90Var;
        zq90Var.m220977d(getArguments());
        this.f34823B = new mw90(this.f34824C);
        super.mo21582d4();
        if ("my_tab_profile_like".equals(this.f34824C.f205577b)) {
            this.pageHelper.m152782q(pageId());
        } else {
            m53854e5();
        }
    }

    /* JADX INFO: renamed from: d5 */
    public t3m m53853d5() {
        return this.f34823B;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: e5 */
    public void m53854e5() {
        String str;
        this.pageHelper.m152782q(pageId());
        C8992f.m55879b().m55884f(this.f34824C.f205577b);
        zq90 zq90Var = this.f34824C;
        String str2 = zq90Var.f205579d;
        String strValueOf = "";
        if (TextUtils.equals("home_card", zq90Var.f205577b) || TextUtils.equals("from_city_center_conv_banner", this.f34824C.f205577b)) {
            str = "home";
        } else {
            str = !TextUtils.equals("home_menu", this.f34824C.f205577b) ? "other" : "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("moments_user_id", str2);
            jSONObject.put("source", str);
            jSONObject.put("is_myself", this.f34824C.m220958K() ? "true" : "false");
            User userById = CoreModule.m30930K().getUserById(this.f34824C.f205579d);
            boolean z = false;
            if (NullChecker.m82486a(userById)) {
                if (!userById.location.isHideUpdateTime() && !userById.isMe() && !CoreModule.f18264c.f20303E0.m141089x3(userById)) {
                    strValueOf = String.valueOf((pzi0.m174454o() - userById.getLastActiveTimeMillis()) / 1000);
                }
                Relationship relationship = userById.localRelationship;
                if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
                    jSONObject.put("is_match", 0);
                } else {
                    jSONObject.put("is_match", 1);
                }
                jSONObject.put("distance", m53844V4(userById));
                jSONObject.put("lastactivity_time", strValueOf);
            }
            jSONObject.put("refer_source", m53845W4(this.f34824C.f205577b));
            if (TextUtils.equals("from_city_center_conv_banner", this.f34824C.f205577b) || (NullChecker.m82486a(this.f34824C.f205576a) && this.f34824C.f205576a.isOnCityTop())) {
                z = true;
            }
            jSONObject.put("city_cover", z);
            this.pageHelper.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public void m53855f5() {
        pza0.m174356h("android_back");
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f34829H.m140888r();
    }

    /* JADX INFO: renamed from: g5 */
    public ima0 m53856g5() {
        return this.f34829H;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        this.f34829H.m140855L0(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        PerformanceLogUtil.instance().endTrance();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return NullChecker.m82486a(this.f34828G) ? this.f34828G.pageId() : super.pageId();
    }
}

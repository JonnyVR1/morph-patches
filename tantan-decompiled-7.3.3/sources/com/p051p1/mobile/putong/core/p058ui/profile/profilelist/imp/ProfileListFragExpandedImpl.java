package com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.report.C8992f;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.g6a0;
import p153l.ip90;
import p153l.jpf0;
import p153l.lza0;
import p153l.p6a0;
import p153l.pza0;
import p153l.pzi0;
import p153l.qmj0;
import p153l.qu90;
import p153l.t3m;
import p153l.ue60;
import p153l.ve60;
import p153l.zq90;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileListFragExpandedImpl extends PutongMvpFrag<g6a0, p6a0> {

    /* JADX INFO: renamed from: B */
    public g6a0 f34736B;

    /* JADX INFO: renamed from: C */
    public p6a0 f34737C;

    /* JADX INFO: renamed from: D */
    public zq90 f34738D;

    /* JADX INFO: renamed from: E */
    public t3m f34739E;

    /* JADX INFO: renamed from: F */
    public boolean f34740F = false;

    /* JADX INFO: renamed from: G */
    public boolean f34741G = false;

    /* JADX INFO: renamed from: H */
    public boolean f34742H = false;

    /* JADX INFO: renamed from: I */
    public qmj0 f34743I;

    /* JADX INFO: renamed from: O4 */
    public static ProfileListFragExpandedImpl m53589O4(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
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
        return m53590P4(qu90Var);
    }

    /* JADX INFO: renamed from: P4 */
    public static ProfileListFragExpandedImpl m53590P4(qu90 qu90Var) {
        ProfileListFragExpandedImpl profileListFragExpandedImpl = new ProfileListFragExpandedImpl();
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
        bundle.putBoolean("from_gp_live", qu90Var.f159544k);
        bundle.putInt("pic_index", qu90Var.f159546m);
        bundle.putInt("pushReason", qu90Var.f159548o);
        bundle.putString("pushTag", qu90Var.f159549p);
        bundle.putSerializable("city_centre_data", qu90Var.f159550q);
        bundle.putString("live_room_info", qu90Var.f159551r);
        profileListFragExpandedImpl.setArguments(bundle);
        return profileListFragExpandedImpl;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: D4 */
    public boolean mo30632D4(MotionEvent motionEvent, boolean z) {
        qmj0 qmj0Var = this.f34743I;
        return qmj0Var != null ? qmj0Var.m177120h(motionEvent, z) : super.mo30632D4(motionEvent, z);
    }

    /* JADX INFO: renamed from: Q4 */
    public final String m53591Q4(User user) {
        if (CoreModule.f18264c.f20303E0.m141060B3(user) || User.isTeamAccount(user.f56859id) || user.isMe()) {
            return "";
        }
        return (user.location.isHideInfo() && user.location.isHideDistance()) ? "" : String.valueOf(user.location.distance);
    }

    /* JADX INFO: renamed from: R4 */
    public final String m53592R4(String str) {
        ue60 ue60VarM201037d = ve60.m201037d();
        String strM195739c = ue60VarM201037d == null ? "" : ue60VarM201037d.m195739c();
        if (TextUtils.equals("share_profile", str)) {
            return "journey_new_share";
        }
        return TextUtils.equals("from_find_partner", str) ? "p_find_partner_mainpage" : strM195739c;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public g6a0 mo30639M4() {
        g6a0 g6a0Var = new g6a0(this, this.f34738D);
        this.f34736B = g6a0Var;
        return g6a0Var;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public p6a0 mo30640N4() {
        p6a0 p6a0Var = new p6a0(this, this.f34738D, new lza0(this.f34739E), this.f34743I);
        this.f34737C = p6a0Var;
        return p6a0Var;
    }

    /* JADX INFO: renamed from: U4 */
    public void m53595U4() {
        this.f34736B.m129188m1();
    }

    /* JADX INFO: renamed from: V4 */
    public g6a0 m53596V4() {
        return this.f34736B;
    }

    /* JADX INFO: renamed from: W4 */
    public t3m m53597W4() {
        return this.f34739E;
    }

    /* JADX INFO: renamed from: X4 */
    public void m53598X4() {
        String str;
        this.pageHelper.m152782q(pageId());
        C8992f.m55879b().m55884f(this.f34738D.f205577b);
        zq90 zq90Var = this.f34738D;
        String str2 = zq90Var.f205579d;
        String strValueOf = "";
        if (TextUtils.equals("home_card", zq90Var.f205577b) || TextUtils.equals("from_city_center_conv_banner", this.f34738D.f205577b)) {
            str = "home";
        } else {
            str = !TextUtils.equals("home_menu", this.f34738D.f205577b) ? "other" : "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("moments_user_id", str2);
            jSONObject.put("source", str);
            jSONObject.put("is_myself", this.f34738D.m220958K() ? "true" : "false");
            User userById = CoreModule.m30930K().getUserById(this.f34738D.f205579d);
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
                jSONObject.put("distance", m53591Q4(userById));
                jSONObject.put("lastactivity_time", strValueOf);
            }
            jSONObject.put("refer_source", m53592R4(this.f34738D.f205577b));
            if (TextUtils.equals("from_city_center_conv_banner", this.f34738D.f205577b) || (NullChecker.m82486a(this.f34738D.f205576a) && this.f34738D.f205576a.isOnCityTop())) {
                z = true;
            }
            jSONObject.put("city_cover", z);
            this.pageHelper.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public void m53599Y4() {
        pza0.m174356h("android_back");
    }

    /* JADX INFO: renamed from: Z4 */
    public p6a0 m53600Z4() {
        return this.f34737C;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        zq90 zq90Var = new zq90(this, new ip90(this));
        this.f34738D = zq90Var;
        zq90Var.m220977d(getArguments());
        this.f34739E = new jpf0(this.f34738D);
        this.f34743I = new qmj0(getActivity(), true);
        super.mo21582d4();
        m53598X4();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f34737C.m170765r();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        this.f34737C.m170749G(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return NullChecker.m82486a(this.f34736B) ? this.f34736B.pageId() : super.pageId();
    }
}

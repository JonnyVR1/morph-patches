package com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.report.C8829f;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.a1m;
import p149l.bhf0;
import p149l.cy90;
import p149l.eh90;
import p149l.hra0;
import p149l.lra0;
import p149l.ly90;
import p149l.mdj0;
import p149l.mm90;
import p149l.mqi0;
import p149l.o660;
import p149l.p660;
import p149l.vi90;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileListFragExpandedImpl extends PutongMvpFrag<cy90, ly90> {

    /* JADX INFO: renamed from: B */
    public cy90 f33888B;

    /* JADX INFO: renamed from: C */
    public ly90 f33889C;

    /* JADX INFO: renamed from: D */
    public vi90 f33890D;

    /* JADX INFO: renamed from: E */
    public a1m f33891E;

    /* JADX INFO: renamed from: F */
    public boolean f33892F = false;

    /* JADX INFO: renamed from: G */
    public boolean f33893G = false;

    /* JADX INFO: renamed from: H */
    public boolean f33894H = false;

    /* JADX INFO: renamed from: I */
    public mdj0 f33895I;

    /* JADX INFO: renamed from: O4 */
    public static ProfileListFragExpandedImpl m52406O4(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
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
        return m52407P4(mm90Var);
    }

    /* JADX INFO: renamed from: P4 */
    public static ProfileListFragExpandedImpl m52407P4(mm90 mm90Var) {
        ProfileListFragExpandedImpl profileListFragExpandedImpl = new ProfileListFragExpandedImpl();
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
        bundle.putBoolean("from_gp_live", mm90Var.f134572k);
        bundle.putInt("pic_index", mm90Var.f134574m);
        bundle.putInt("pushReason", mm90Var.f134576o);
        bundle.putString("pushTag", mm90Var.f134577p);
        bundle.putSerializable("city_centre_data", mm90Var.f134578q);
        bundle.putString("live_room_info", mm90Var.f134579r);
        profileListFragExpandedImpl.setArguments(bundle);
        return profileListFragExpandedImpl;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: D4 */
    public boolean mo29634D4(MotionEvent motionEvent, boolean z) {
        mdj0 mdj0Var = this.f33895I;
        return mdj0Var != null ? mdj0Var.m154072h(motionEvent, z) : super.mo29634D4(motionEvent, z);
    }

    /* JADX INFO: renamed from: Q4 */
    public final String m52408Q4(User user) {
        if (CoreModule.f17545c.f19561E0.m203772B3(user) || User.isTeamAccount(user.f56011id) || user.isMe()) {
            return "";
        }
        return (user.location.isHideInfo() && user.location.isHideDistance()) ? "" : String.valueOf(user.location.distance);
    }

    /* JADX INFO: renamed from: R4 */
    public final String m52409R4(String str) {
        o660 o660VarM167645d = p660.m167645d();
        String strM162820c = o660VarM167645d == null ? "" : o660VarM167645d.m162820c();
        if (TextUtils.equals("share_profile", str)) {
            return "journey_new_share";
        }
        return TextUtils.equals("from_find_partner", str) ? "p_find_partner_mainpage" : strM162820c;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public cy90 mo29641M4() {
        cy90 cy90Var = new cy90(this, this.f33890D);
        this.f33888B = cy90Var;
        return cy90Var;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public ly90 mo29642N4() {
        ly90 ly90Var = new ly90(this, this.f33890D, new hra0(this.f33891E), this.f33895I);
        this.f33889C = ly90Var;
        return ly90Var;
    }

    /* JADX INFO: renamed from: U4 */
    public void m52412U4() {
        this.f33888B.m109225m1();
    }

    /* JADX INFO: renamed from: V4 */
    public cy90 m52413V4() {
        return this.f33888B;
    }

    /* JADX INFO: renamed from: W4 */
    public a1m m52414W4() {
        return this.f33891E;
    }

    /* JADX INFO: renamed from: X4 */
    public void m52415X4() {
        String str;
        this.pageHelper.m109041q(pageId());
        C8829f.m54696b().m54701f(this.f33890D.f181562b);
        vi90 vi90Var = this.f33890D;
        String str2 = vi90Var.f181564d;
        String strValueOf = "";
        if (TextUtils.equals("home_card", vi90Var.f181562b) || TextUtils.equals("from_city_center_conv_banner", this.f33890D.f181562b)) {
            str = "home";
        } else {
            str = !TextUtils.equals("home_menu", this.f33890D.f181562b) ? "other" : "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("moments_user_id", str2);
            jSONObject.put("source", str);
            jSONObject.put("is_myself", this.f33890D.m198510K() ? "true" : "false");
            User userById = CoreModule.m29932K().getUserById(this.f33890D.f181564d);
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
                jSONObject.put("distance", m52408Q4(userById));
                jSONObject.put("lastactivity_time", strValueOf);
            }
            jSONObject.put("refer_source", m52409R4(this.f33890D.f181562b));
            if (TextUtils.equals("from_city_center_conv_banner", this.f33890D.f181562b) || (NullChecker.m81303a(this.f33890D.f181561a) && this.f33890D.f181561a.isOnCityTop())) {
                z = true;
            }
            jSONObject.put("city_cover", z);
            this.pageHelper.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public void m52416Y4() {
        lra0.m151149h("android_back");
    }

    /* JADX INFO: renamed from: Z4 */
    public ly90 m52417Z4() {
        return this.f33889C;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        vi90 vi90Var = new vi90(this, new eh90(this));
        this.f33890D = vi90Var;
        vi90Var.m198529d(getArguments());
        this.f33891E = new bhf0(this.f33890D);
        this.f33895I = new mdj0(getActivity(), true);
        super.mo20583d4();
        m52415X4();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f33889C.m152149r();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        this.f33889C.m152133G(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return NullChecker.m81303a(this.f33888B) ? this.f33888B.pageId() : super.pageId();
    }
}

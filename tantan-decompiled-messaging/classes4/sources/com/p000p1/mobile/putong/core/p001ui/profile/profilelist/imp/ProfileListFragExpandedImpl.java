package com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.app.PutongMvpFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.report.f;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.lra0;
import l.mdj0;
import l.mqi0;
import l.o660;
import l.p660;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.a1m;
import p002l.bhf0;
import p002l.cy90;
import p002l.dh90;
import p002l.eh90;
import p002l.hra0;
import p002l.ly90;
import p002l.mm90;
import p002l.vi90;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileListFragExpandedImpl extends PutongMvpFrag<cy90, ly90> {

    /* JADX INFO: renamed from: B */
    public cy90 f1710B;

    /* JADX INFO: renamed from: C */
    public ly90 f1711C;

    /* JADX INFO: renamed from: D */
    public vi90 f1712D;

    /* JADX INFO: renamed from: E */
    public a1m f1713E;

    /* JADX INFO: renamed from: F */
    public boolean f1714F = false;

    /* JADX INFO: renamed from: G */
    public boolean f1715G = false;

    /* JADX INFO: renamed from: H */
    public boolean f1716H = false;

    /* JADX INFO: renamed from: I */
    public mdj0 f1717I;

    /* JADX INFO: renamed from: O4 */
    public static ProfileListFragExpandedImpl m2940O4(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        mm90 mm90Var = new mm90();
        mm90Var.f15456a = str;
        mm90Var.f15458c = z2;
        mm90Var.f15460e = str2;
        mm90Var.f15457b = z;
        mm90Var.f15461f = z3;
        mm90Var.f15462g = RelationshipStatus.get("unknown_");
        mm90Var.f15466k = false;
        mm90Var.f15467l = z4;
        mm90Var.f15468m = -1;
        return m2941P4(mm90Var);
    }

    /* JADX INFO: renamed from: P4 */
    public static ProfileListFragExpandedImpl m2941P4(mm90 mm90Var) {
        ProfileListFragExpandedImpl profileListFragExpandedImpl = new ProfileListFragExpandedImpl();
        Bundle bundle = new Bundle();
        bundle.putString(SysnotifListener.KEY_USER_ID, mm90Var.f15456a);
        bundle.putBoolean("is_edit", mm90Var.f15458c);
        bundle.putString("input_type", mm90Var.f15459d);
        bundle.putBoolean("show_buttons", mm90Var.f15457b);
        bundle.putBoolean("canShowFollowButton", mm90Var.f15467l);
        bundle.putBoolean("no_showbuttons_infofromlocal", mm90Var.f15465j);
        bundle.putString("from", mm90Var.f15460e);
        bundle.putBoolean("open_media_picker", mm90Var.f15461f);
        bundle.putString("relationship_status", mm90Var.f15462g.toString());
        bundle.putInt("button_flag", mm90Var.f15463h);
        bundle.putBoolean("with_superlike", mm90Var.f15464i);
        bundle.putBoolean("from_gp_live", mm90Var.f15466k);
        bundle.putInt("pic_index", mm90Var.f15468m);
        bundle.putInt("pushReason", mm90Var.f15470o);
        bundle.putString("pushTag", mm90Var.f15471p);
        bundle.putSerializable("city_centre_data", mm90Var.f15472q);
        bundle.putString("live_room_info", mm90Var.f15473r);
        profileListFragExpandedImpl.setArguments(bundle);
        return profileListFragExpandedImpl;
    }

    /* JADX INFO: renamed from: D4 */
    public boolean m2942D4(MotionEvent motionEvent, boolean z) {
        mdj0 mdj0Var = this.f1717I;
        return mdj0Var != null ? mdj0Var.h(motionEvent, z) : super/*com.p1.mobile.putong.app.PutongFrag*/.D4(motionEvent, z);
    }

    /* JADX INFO: renamed from: Q4 */
    public final String m2945Q4(User user) {
        if (CoreModule.c.E0.B3(user) || User.isTeamAccount(((DbObject) user).id) || user.isMe()) {
            return "";
        }
        return (user.location.isHideInfo() && user.location.isHideDistance()) ? "" : String.valueOf(user.location.distance);
    }

    /* JADX INFO: renamed from: R4 */
    public final String m2946R4(String str) {
        o660 o660VarD = p660.d();
        String strC = o660VarD == null ? "" : o660VarD.c();
        if (TextUtils.equals("share_profile", str)) {
            return "journey_new_share";
        }
        return TextUtils.equals("from_find_partner", str) ? "p_find_partner_mainpage" : strC;
    }

    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public cy90 m2943M4() {
        cy90 cy90Var = new cy90(this, this.f1712D);
        this.f1710B = cy90Var;
        return cy90Var;
    }

    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public ly90 m2944N4() {
        ly90 ly90Var = new ly90(this, this.f1712D, new hra0(this.f1713E), this.f1717I);
        this.f1711C = ly90Var;
        return ly90Var;
    }

    /* JADX INFO: renamed from: U4 */
    public void m2949U4() {
        this.f1710B.m11502m1();
    }

    /* JADX INFO: renamed from: V4 */
    public cy90 m2950V4() {
        return this.f1710B;
    }

    /* JADX INFO: renamed from: W4 */
    public a1m m2951W4() {
        return this.f1713E;
    }

    /* JADX INFO: renamed from: X4 */
    public void m2952X4() {
        String str;
        ((PutongFrag) this).pageHelper.q(pageId());
        f.b().f(this.f1712D.f21138b);
        vi90 vi90Var = this.f1712D;
        String str2 = vi90Var.f21140d;
        String strValueOf = "";
        if (TextUtils.equals("home_card", vi90Var.f21138b) || TextUtils.equals("from_city_center_conv_banner", this.f1712D.f21138b)) {
            str = "home";
        } else {
            str = !TextUtils.equals("home_menu", this.f1712D.f21138b) ? LiveMessage.LiveMessageType.OTHER : "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("moments_user_id", str2);
            jSONObject.put("source", str);
            jSONObject.put("is_myself", this.f1712D.m23963K() ? "true" : "false");
            User userById = CoreModule.K().getUserById(this.f1712D.f21140d);
            boolean z = false;
            if (NullChecker.a(userById)) {
                if (!userById.location.isHideUpdateTime() && !userById.isMe() && !CoreModule.c.E0.x3(userById)) {
                    strValueOf = String.valueOf((mqi0.o() - userById.getLastActiveTimeMillis()) / 1000);
                }
                Relationship relationship = userById.localRelationship;
                if (relationship == null || !TEnum.equals(relationship.state, "matched")) {
                    jSONObject.put("is_match", 0);
                } else {
                    jSONObject.put("is_match", 1);
                }
                jSONObject.put("distance", m2945Q4(userById));
                jSONObject.put("lastactivity_time", strValueOf);
            }
            jSONObject.put("refer_source", m2946R4(this.f1712D.f21138b));
            if (TextUtils.equals("from_city_center_conv_banner", this.f1712D.f21138b) || (NullChecker.a(this.f1712D.f21137a) && this.f1712D.f21137a.isOnCityTop())) {
                z = true;
            }
            jSONObject.put("city_cover", z);
            ((PutongFrag) this).pageHelper.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public void m2953Y4() {
        lra0.h("android_back");
    }

    /* JADX INFO: renamed from: Z4 */
    public ly90 m2954Z4() {
        return this.f1711C;
    }

    /* JADX INFO: renamed from: d4 */
    public void m2955d4() {
        vi90 vi90Var = new vi90((PutongFrag) this, (dh90) new eh90(this));
        this.f1712D = vi90Var;
        vi90Var.m23982d(getArguments());
        this.f1713E = new bhf0(this.f1712D);
        this.f1717I = new mdj0(getActivity(), true);
        super.d4();
        m2952X4();
    }

    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: g4 */
    public void m2956g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f1711C.m17540r();
    }

    /* JADX INFO: renamed from: n4 */
    public void m2957n4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
        this.f1711C.m17523G(bundle);
    }

    public String pageId() {
        return NullChecker.a(this.f1710B) ? this.f1710B.pageId() : super/*com.p1.mobile.putong.app.PutongFrag*/.pageId();
    }
}

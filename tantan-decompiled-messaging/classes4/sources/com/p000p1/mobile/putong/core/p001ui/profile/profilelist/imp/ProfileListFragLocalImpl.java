package com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.PerformanceLogUtil;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.app.PutongMvpFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.report.f;
import com.p1.mobile.putong.core.util.DebugUtil;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.hpd0;
import l.j760;
import l.lra0;
import l.mqi0;
import l.o660;
import l.p660;
import l.vwb;
import l.xdx;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.a1m;
import p002l.dh90;
import p002l.eea0;
import p002l.fh90;
import p002l.io90;
import p002l.mm90;
import p002l.vi90;
import p002l.yca0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileListFragLocalImpl extends PutongMvpFrag<yca0, eea0> {

    /* JADX INFO: renamed from: B */
    public io90 f1797B;

    /* JADX INFO: renamed from: C */
    public vi90 f1798C;

    /* JADX INFO: renamed from: D */
    public boolean f1799D = false;

    /* JADX INFO: renamed from: E */
    public boolean f1800E = false;

    /* JADX INFO: renamed from: F */
    public boolean f1801F = false;

    /* JADX INFO: renamed from: G */
    public yca0 f1802G;

    /* JADX INFO: renamed from: H */
    public eea0 f1803H;

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ void m3203R4() {
        hpd0 hpd0Var = CoreModule.c.e0.r2;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.c.e0.q2.put(bool);
    }

    /* JADX INFO: renamed from: S4 */
    public static ProfileListFragLocalImpl m3204S4(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
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
        return m3205T4(mm90Var);
    }

    /* JADX INFO: renamed from: T4 */
    public static ProfileListFragLocalImpl m3205T4(mm90 mm90Var) {
        ProfileListFragLocalImpl profileListFragLocalImpl = new ProfileListFragLocalImpl();
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
        bundle.putInt("pic_index", mm90Var.f15468m);
        bundle.putInt("pushReason", mm90Var.f15470o);
        bundle.putString("pushTag", mm90Var.f15471p);
        bundle.putSerializable("city_centre_data", mm90Var.f15472q);
        profileListFragLocalImpl.setArguments(bundle);
        return profileListFragLocalImpl;
    }

    /* JADX INFO: renamed from: V4 */
    private String m3206V4(User user) {
        if (CoreModule.c.E0.B3(user) || User.isTeamAccount(((DbObject) user).id) || user.isMe()) {
            return "";
        }
        return (user.location.isHideInfo() && user.location.isHideDistance()) ? "" : String.valueOf(user.location.distance);
    }

    /* JADX INFO: renamed from: W4 */
    private String m3207W4(String str) {
        o660 o660VarD = p660.d();
        String strC = o660VarD == null ? "" : o660VarD.c();
        if (TextUtils.equals("share_profile", str)) {
            return "journey_new_share";
        }
        return TextUtils.equals("from_find_partner", str) ? "p_find_partner_mainpage" : strC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m3208Z4() {
        b4().F(this.f1798C.f21140d).z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m3209a5() {
        if (NullChecker.a(this.f1802G.m26618Z2())) {
            DebugUtil.zk(this.f1802G.m26618Z2(), act());
        }
    }

    /* JADX INFO: renamed from: U4, reason: merged with bridge method [inline-methods] */
    public ArrayList<j760<String, d30>> m3210C4() {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        arrayList.add(vwb.Y("user id", new d30() { // from class: l.h9a0
            public final void call() {
                this.f11947a.m3208Z4();
            }
        }));
        arrayList.add(vwb.Y("用户位置信息", new d30() { // from class: l.i9a0
            public final void call() {
                this.f13114a.m3209a5();
            }
        }));
        arrayList.add(vwb.Y("认证气泡本地数据清理：" + CoreModule.c.e0.r2.get() + " " + CoreModule.c.e0.q2.get(), new d30() { // from class: l.j9a0
            public final void call() {
                ProfileListFragLocalImpl.m3203R4();
            }
        }));
        arrayList.add(vwb.Y("弹出先发like弹窗", new d30() { // from class: l.k9a0
            public final void call() {
                xdx.A().N(((DbObject) CoreModule.K().me_()).id);
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: X4, reason: merged with bridge method [inline-methods] */
    public yca0 m3211M4() {
        yca0 yca0Var = new yca0(this, this.f1798C);
        this.f1802G = yca0Var;
        return yca0Var;
    }

    /* JADX INFO: renamed from: Y4, reason: merged with bridge method [inline-methods] */
    public eea0 m3212N4() {
        eea0 eea0Var = new eea0(this, this.f1798C);
        this.f1803H = eea0Var;
        return eea0Var;
    }

    /* JADX INFO: renamed from: b5 */
    public void m3216b5() {
        this.f1802G.m26587D1();
    }

    /* JADX INFO: renamed from: c5 */
    public yca0 m3217c5() {
        return this.f1802G;
    }

    /* JADX INFO: renamed from: d4 */
    public void m3218d4() {
        vi90 vi90Var = new vi90((PutongFrag) this, (dh90) new fh90(this));
        this.f1798C = vi90Var;
        vi90Var.m23982d(getArguments());
        this.f1797B = new io90(this.f1798C);
        super.d4();
        if ("my_tab_profile_like".equals(this.f1798C.f21138b)) {
            ((PutongFrag) this).pageHelper.q(pageId());
        } else {
            m3220e5();
        }
    }

    /* JADX INFO: renamed from: d5 */
    public a1m m3219d5() {
        return this.f1797B;
    }

    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: e5 */
    public void m3220e5() {
        String str;
        ((PutongFrag) this).pageHelper.q(pageId());
        f.b().f(this.f1798C.f21138b);
        vi90 vi90Var = this.f1798C;
        String str2 = vi90Var.f21140d;
        String strValueOf = "";
        if (TextUtils.equals("home_card", vi90Var.f21138b) || TextUtils.equals("from_city_center_conv_banner", this.f1798C.f21138b)) {
            str = "home";
        } else {
            str = !TextUtils.equals("home_menu", this.f1798C.f21138b) ? LiveMessage.LiveMessageType.OTHER : "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("moments_user_id", str2);
            jSONObject.put("source", str);
            jSONObject.put("is_myself", this.f1798C.m23963K() ? "true" : "false");
            User userById = CoreModule.K().getUserById(this.f1798C.f21140d);
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
                jSONObject.put("distance", m3206V4(userById));
                jSONObject.put("lastactivity_time", strValueOf);
            }
            jSONObject.put("refer_source", m3207W4(this.f1798C.f21138b));
            if (TextUtils.equals("from_city_center_conv_banner", this.f1798C.f21138b) || (NullChecker.a(this.f1798C.f21137a) && this.f1798C.f21137a.isOnCityTop())) {
                z = true;
            }
            jSONObject.put("city_cover", z);
            ((PutongFrag) this).pageHelper.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public void m3221f5() {
        lra0.h("android_back");
    }

    /* JADX INFO: renamed from: g4 */
    public void m3222g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f1803H.m12418r();
    }

    /* JADX INFO: renamed from: g5 */
    public eea0 m3223g5() {
        return this.f1803H;
    }

    /* JADX INFO: renamed from: n4 */
    public void m3224n4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
        this.f1803H.m12384L0(bundle);
    }

    public void onDestroy() {
        super/*com.p1.mobile.android.app.Frag*/.onDestroy();
        PerformanceLogUtil.instance().endTrance();
    }

    public String pageId() {
        return NullChecker.a(this.f1802G) ? this.f1802G.pageId() : super/*com.p1.mobile.putong.app.PutongFrag*/.pageId();
    }
}

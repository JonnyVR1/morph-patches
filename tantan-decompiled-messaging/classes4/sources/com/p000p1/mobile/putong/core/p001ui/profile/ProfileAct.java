package com.p000p1.mobile.putong.core.p001ui.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.immomo.medialog.util.utilcode.util.NetworkUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ProfileListExpandedEditFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.frag.model.CoreMomentModel;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.ProfileCreateData;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.PerformanceLogUtil;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.ProfileLogEntity;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.ProfileListFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.api.api.FacebookApi;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.CityCData;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.bzv;
import l.c84;
import l.cdq0;
import l.co5;
import l.czv;
import l.d30;
import l.dyq;
import l.e30;
import l.e51;
import l.fuf;
import l.fyq;
import l.j760;
import l.lsi0;
import l.mf90;
import l.mkd0;
import l.ogw;
import l.pgm;
import l.rhi;
import l.rlt;
import l.roj0;
import l.rol;
import l.rzb0;
import l.upa;
import l.v7c0;
import l.v9j;
import l.vdc0;
import l.vwb;
import l.w0c0;
import l.w9j;
import p002l.mm90;
import p002l.x0m;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileAct extends ProfileMediaAct implements dyq, rol, cdq0 {

    /* JADX INFO: renamed from: A */
    public CityCData f827A;

    /* JADX INFO: renamed from: E */
    public String f831E;

    /* JADX INFO: renamed from: H */
    public fyq f834H;

    /* JADX INFO: renamed from: I */
    public int f835I;

    /* JADX INFO: renamed from: c */
    public VLinear f837c;

    /* JADX INFO: renamed from: d */
    public VLinear f838d;

    /* JADX INFO: renamed from: e */
    public String f839e;

    /* JADX INFO: renamed from: f */
    public boolean f840f;

    /* JADX INFO: renamed from: g */
    public String f841g;

    /* JADX INFO: renamed from: h */
    public String f842h;

    /* JADX INFO: renamed from: i */
    public boolean f843i;

    /* JADX INFO: renamed from: j */
    public boolean f844j;

    /* JADX INFO: renamed from: k */
    public boolean f845k;

    /* JADX INFO: renamed from: m */
    public int f847m;

    /* JADX INFO: renamed from: n */
    public c84 f848n;

    /* JADX INFO: renamed from: o */
    public boolean f849o;

    /* JADX INFO: renamed from: p */
    public boolean f850p;

    /* JADX INFO: renamed from: r */
    @Nullable
    public HashMap<String, String> f852r;

    /* JADX INFO: renamed from: s */
    public int f853s;

    /* JADX INFO: renamed from: t */
    public String f854t;

    /* JADX INFO: renamed from: u */
    public PutongFrag f855u;

    /* JADX INFO: renamed from: w */
    public String f857w;

    /* JADX INFO: renamed from: y */
    public ProfileCreateData f859y;

    /* JADX INFO: renamed from: z */
    public CoreMomentModel f860z;

    /* JADX INFO: renamed from: l */
    public RelationshipStatus f846l = RelationshipStatus.get("unknown_");

    /* JADX INFO: renamed from: q */
    public boolean f851q = true;

    /* JADX INFO: renamed from: v */
    public boolean f856v = false;

    /* JADX INFO: renamed from: x */
    public int f858x = -1;

    /* JADX INFO: renamed from: B */
    public boolean f828B = false;

    /* JADX INFO: renamed from: C */
    public Map<String, Picture> f829C = new HashMap(1);

    /* JADX INFO: renamed from: D */
    public String f830D = "";

    /* JADX INFO: renamed from: F */
    public int f832F = -1;

    /* JADX INFO: renamed from: G */
    public boolean f833G = false;

    /* JADX INFO: renamed from: J */
    public boolean f836J = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.ProfileAct$a */
    public class C0047a implements fuf<czv> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f861a;

        public C0047a(d30 d30Var) {
            this.f861a = d30Var;
        }

        /* JADX INFO: renamed from: a */
        public void m1211a(FacebookException facebookException) {
            FacebookApi.m(facebookException);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(czv czvVar) {
            if (czvVar.a().l().containsAll(FacebookApi.e)) {
                this.f861a.call();
            }
        }

        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: A2 */
    private boolean m1160A2(MotionEvent motionEvent, boolean z) {
        PutongFrag putongFrag = this.f855u;
        if (putongFrag != null) {
            return putongFrag.D4(motionEvent, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m1174n2(Context context, String str, String str2, boolean z) {
        return m1176p2(context, str, str2, z, false);
    }

    /* JADX INFO: renamed from: o2 */
    public static Intent m1175o2(Context context, String str, String str2, boolean z, LikedUser likedUser) {
        Intent intentM1176p2 = m1176p2(context, str, str2, z, false);
        intentM1176p2.putExtra("liked_user", (Serializable) likedUser);
        return intentM1176p2;
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m1176p2(Context context, String str, String str2, boolean z, boolean z2) {
        return m1179s2(context, str, str2, z, z2, false, RelationshipStatus.get("unknown_"), 273, false, true, false);
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m1177q2(Context context, String str, String str2, boolean z, boolean z2, int i) {
        Intent intentM1176p2 = m1176p2(context, str, str2, z, z2);
        intentM1176p2.putExtra("pic_index", i);
        return intentM1176p2;
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m1178r2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, String str3, boolean z6) {
        Class cls;
        PerformanceLogUtil.instance().beginTrance();
        PerformanceLogUtil.logBegin(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        if (z2) {
            cls = EditProfileAct.class;
        } else {
            cls = (!z || upa.L3()) ? ProfileAct.class : ProfileAct_CustomTransition.class;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("userId", str);
        intent.putExtra("from", str2);
        intent.putExtra("no_showbuttons_infofromlocal", z5);
        intent.putExtra("showButtons", z);
        intent.putExtra("edit", z2);
        intent.putExtra("open_media_picker", z3);
        intent.putExtra("relationship_status", relationshipStatus.toString());
        intent.putExtra("button_flag", i);
        intent.putExtra("with_superlike", z4);
        intent.putExtra("from_gp_live", z6);
        intent.putExtra("live_room_info", str3);
        return intent;
    }

    /* JADX INFO: renamed from: s2 */
    public static Intent m1179s2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6) {
        Class cls;
        PerformanceLogUtil.instance().beginTrance();
        PerformanceLogUtil.logBegin(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        if (z2) {
            cls = EditProfileAct.class;
        } else {
            cls = (!z || upa.L3()) ? ProfileAct.class : ProfileAct_CustomTransition.class;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("userId", str);
        intent.putExtra("from", str2);
        intent.putExtra("no_showbuttons_infofromlocal", z5);
        intent.putExtra("showButtons", z);
        intent.putExtra("edit", z2);
        intent.putExtra("open_media_picker", z3);
        intent.putExtra("relationship_status", relationshipStatus.toString());
        intent.putExtra("button_flag", i);
        intent.putExtra("with_superlike", z4);
        intent.putExtra("from_gp_live", z6);
        return intent;
    }

    /* JADX INFO: renamed from: u2 */
    public static Intent m1180u2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, String str3) {
        Intent intentM1179s2 = m1179s2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6);
        intentM1179s2.putExtra("input_type", str3);
        return intentM1179s2;
    }

    /* JADX INFO: renamed from: v2 */
    public static Intent m1181v2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intent intentM1179s2 = m1179s2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6);
        intentM1179s2.putExtra("canShowFollowButton", z7);
        return intentM1179s2;
    }

    /* JADX INFO: renamed from: w2 */
    public static Intent m1182w2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7, int i2, String str3) {
        Intent intentM1179s2 = m1179s2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6);
        intentM1179s2.putExtra("canShowFollowButton", z7);
        intentM1179s2.putExtra("pushReason", i2);
        intentM1179s2.putExtra("pushTag", str3);
        return intentM1179s2;
    }

    /* JADX INFO: renamed from: y2 */
    public static Intent m1183y2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7, String str3) {
        Intent intentM1178r2 = m1178r2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, str3, z6);
        intentM1178r2.putExtra("canShowFollowButton", z7);
        return intentM1178r2;
    }

    /* JADX INFO: renamed from: z2 */
    public static Intent m1184z2(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        Intent intentM1176p2 = m1176p2(context, str, str2, z, z2);
        intentM1176p2.putExtra("canShowFollowButton", z3);
        return intentM1176p2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B2 */
    public final void m1185B2(d30 d30Var) {
        AccessToken accessTokenD = AccessToken.d();
        if (NullChecker.a(accessTokenD) && accessTokenD.l().containsAll(FacebookApi.e)) {
            d30Var.call();
            return;
        }
        if (this.f848n == null) {
            this.f848n = c84.b.a();
            bzv.m().y(this.f848n, new C0047a(d30Var));
        }
        bzv.m().t(this, FacebookApi.e);
    }

    /* JADX INFO: renamed from: C2 */
    public PutongFrag m1186C2() {
        return this.f855u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D2 */
    public final PutongFrag m1187D2() {
        mm90 mm90Var = new mm90();
        mm90Var.f15456a = this.f839e;
        mm90Var.f15457b = this.f843i;
        mm90Var.f15458c = this.f840f;
        mm90Var.f15459d = this.f841g;
        mm90Var.f15460e = this.f842h;
        mm90Var.f15461f = this.f845k;
        mm90Var.f15462g = this.f846l;
        mm90Var.f15463h = this.f847m;
        mm90Var.f15464i = this.f849o;
        mm90Var.f15465j = this.f851q;
        mm90Var.f15466k = this.f850p;
        mm90Var.f15467l = this.f844j;
        mm90Var.f15468m = this.f858x;
        mm90Var.f15469n = this.f860z;
        mm90Var.f15470o = this.f853s;
        mm90Var.f15471p = this.f854t;
        mm90Var.f15472q = this.f827A;
        mm90Var.f15473r = this.f857w;
        mm90Var.f15474s = getIntent().getStringExtra("profile_like_id");
        return (this.f840f || !upa.M3()) ? ProfileListFrag.m2375E8(mm90Var) : ProfileListFragExpandedImpl.m2941P4(mm90Var);
    }

    /* JADX INFO: renamed from: E2 */
    public final void m1188E2() {
        if (NullChecker.a(this.f859y) && this.f859y.showCountdownSendMsg) {
            creates(new e30() { // from class: l.af90
                public final void call(Object obj) {
                    this.f7530a.m1192K2((Bundle) obj);
                }
            });
            lifecycle().subscribe(mkd0.G(new e30() { // from class: l.bf90
                public final void call(Object obj) {
                    this.f8100a.m1193L2((c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final void m1189F2(String str) {
        if (User.isTeamAccount(str)) {
            return;
        }
        if ("conversation_view".equals(this.f842h) || "from_conversation".equals(this.f842h) || "messages_title".equals(this.f842h) || "messages_thumbnail_left".equals(this.f842h) || "profile_bubble".equals(this.f842h) || "home_card".equals(this.f842h)) {
            CoreModule.c.E1.D3(str);
        }
    }

    /* JADX INFO: renamed from: H2 */
    public boolean m1190H2() {
        return this.f840f;
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m1191I2() {
        this.f834H.h();
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m1192K2(Bundle bundle) {
        this.f834H = new fyq(act());
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.te90
            @Override // java.lang.Runnable
            public final void run() {
                this.f20197a.m1191I2();
            }
        });
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m1193L2(c cVar) {
        if (NullChecker.a(this.f834H)) {
            if (cVar == c.i) {
                this.f834H.g(this);
            } else if (cVar == c.j) {
                this.f834H.g((dyq) null);
            } else if (cVar == c.m) {
                this.f834H.b();
            }
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ rx.c m1194M2() {
        return CoreModule.c.f0.se(this.f839e).filter(new w9j() { // from class: l.cf90
            public final Object call(Object obj) {
                return this.f8624a.m1197R2((roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m1195N2(roj0 roj0Var) {
        if (CoreModule.Q().a().a() || "moment_visitor".equals(this.f842h) || "photo_album_feed_from_activity".equals(this.f842h) || "photo_album_feed_viewers".equals(this.f842h) || "liked_users_anchor".equals(this.f842h) || "from_conversation_search_view".equals(this.f842h)) {
            return;
        }
        finish();
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m1196Q2(String str) {
        Picture picture = this.f829C.get(str);
        if (NetworkUtils.c() && NullChecker.a(picture)) {
            CoreModule.c.e0.Ja(ogw.d(new File(rhi.z(str))), picture);
        }
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ Boolean m1197R2(roj0 roj0Var) {
        return Boolean.valueOf((this.f843i || (NullChecker.a(this.f859y) && !this.f859y.checkConv) || "places".equals(this.f842h) || "interest_card".equals(this.f842h) || "live_user_card".equals(this.f842h) || rlt.b(this.f842h) || "live_from_h5".equals(this.f842h) || "from_live_group_rank".equals(this.f842h) || "live_from_voice_entrance".equals(this.f842h) || "from_live_square".equals(this.f842h) || "anchor-search".equals(this.f842h) || "live_profile_voice_mask_mode".equals(this.f842h) || "chat_group".equals(this.f842h) || "chat_group_anonymity".equals(this.f842h) || "from_theme_recommendation".equals(this.f842h) || "group_notification".equals(this.f842h) || "group_notification_anonymity".equals(this.f842h) || "moment_gift_detail".equals(this.f842h) || "moment_gift_rank".equals(this.f842h) || "from_giftwall".equals(this.f842h) || "team_account".equals(this.f842h) || "from_christmas".equals(this.f842h) || "from_portrait_like_list".equals(this.f842h) || "from_activities_gift_profile".equals(this.f842h) || "from_meet_feed".equals(this.f842h) || "from_meet_profile".equals(this.f842h) || "form_kankan_video_list".equals(this.f842h) || "form_my_pet".equals(this.f842h) || "impress_signal".equals(this.f842h) || "from_mew_tags".equals(this.f842h) || "from_literature_third".equals(this.f842h) || "push_like".equals(this.f842h) || "from_find_partner".equals(this.f842h) || "from_voice_buzz".equals(this.f842h) || "from_pin_like".equals(this.f842h) || "from_city_center_conv_banner".equals(this.f842h) || "share_profile".equals(this.f842h) || "p_picks_profile".equals(this.f842h) || "p_mbti_detail".equals(this.f842h) || "p_picks_profile_card".equals(this.f842h) || "from_friend_tacit".equals(this.f842h) || "p_game_cp".equals(this.f842h) || "p_received_profile_like".equals(this.f842h) || "p_lifestyle_tag".equals(this.f842h) || "p_game_cp_msg".equals(this.f842h)) ? false : true);
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m1198S2() {
        lsi0.j(act().getString(R.string.Gk));
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m1199T2() {
        lsi0.j(act().getString(R.string.Hk));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m1200U2() {
        startActivityForResult(MediaPickerAct.e2(this, 1, false, false, true, "profile", MediaPickerAct.C, false), 786);
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m1201V2(Dialog dialog, View view) {
        m1185B2(new d30() { // from class: l.ue90
            public final void call() {
                this.f20598a.m1200U2();
            }
        });
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m1202W2(Dialog dialog, View view) {
        pickImagesWithPicker(1, false, true, true);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: X2 */
    public void m1203X2(int i) {
        mo1208i0(i, false);
    }

    /* JADX INFO: renamed from: Y2 */
    public x0m m1204Y2() {
        Fragment fragmentH0 = fragmentManager().h0(android.R.id.content);
        if (fragmentH0 instanceof ProfileListFragLocalImpl) {
            return (x0m) ((ProfileListFragLocalImpl) fragmentH0).m3219d5();
        }
        return fragmentH0 instanceof ProfileListFragExpandedImpl ? (x0m) ((ProfileListFragExpandedImpl) fragmentH0).m2951W4() : (x0m) fragmentH0;
    }

    /* JADX INFO: renamed from: Z2 */
    public final boolean m1205Z2() {
        return this.f856v || "from_recommend_like".equals(this.f842h) || "preview_card".equals(this.f842h) || "form_my_pet".equals(this.f842h) || "profile_bubble".equals(this.f842h) || "from_greet_act".equals(this.f842h) || "messages_title".equals(this.f842h) || "messages_thumbnail_left".equals(this.f842h) || "messages_thumbnail_right".equals(this.f842h) || "from_see_blind_box".equals(this.f842h);
    }

    public void attachBaseContext(Context context) {
        super/*com.p1.mobile.putong.app.PutongAct*/.attachBaseContext(context);
    }

    public ArrayList<j760<String, d30>> debugItems() {
        PutongFrag putongFrag = (Frag) fragmentManager().h0(android.R.id.content);
        if (putongFrag instanceof ProfileListFrag) {
            return ((ProfileListFrag) putongFrag).m2589C4();
        }
        if (putongFrag instanceof ProfileListFragLocalEditImpl) {
            return ((ProfileListFragLocalEditImpl) putongFrag).m3105C4();
        }
        return putongFrag instanceof PutongFrag ? (ArrayList) putongFrag.C4() : vwb.f0(new j760[0]);
    }

    public boolean disableAutoPV() {
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m1160A2(motionEvent, false) || super/*com.p1.mobile.putong.app.PutongAct*/.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.ProfileMediaAct
    /* JADX INFO: renamed from: f2 */
    public void mo1206f2(int i, String str) {
        this.f832F = i;
        vdc0.b(act(), str, act() instanceof EditProfileAct);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        if (m1205Z2()) {
            overridePendingTransition(0, rzb0.x);
        }
    }

    public int getDefaultThemeResId() {
        return v7c0.w;
    }

    /* JADX INFO: renamed from: h */
    public void m1207h(int i, int i2) {
        int i3 = this.f835I;
        if (i - i3 > 0 || i > 0) {
            this.f836J = true;
        } else if (i - i3 < 0) {
            this.f836J = false;
        }
        this.f835I = i;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.ProfileMediaAct
    /* JADX INFO: renamed from: i0 */
    public void mo1208i0(int i, boolean z) {
        mo1210n0(i, z, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (fragmentManager().h0(android.R.id.content) != null) {
            this.f855u = fragmentManager().h0(android.R.id.content);
            return null;
        }
        PutongFrag putongFragM1187D2 = m1187D2();
        this.f855u = putongFragM1187D2;
        if (NullChecker.a(putongFragM1187D2.getArguments())) {
            this.f855u.getArguments().putBoolean("live_flag", this.f856v);
            this.f855u.getArguments().putString("gift_msg_id", this.f831E);
            this.f855u.getArguments().putSerializable("profile_create_data", this.f859y);
        }
        if (upa.V1()) {
            String stringExtra = getIntent().getStringExtra("from_group_id");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f855u.getArguments().putString("from_group_id", stringExtra);
            }
        }
        if ("from_meet_feed".equals(this.f842h)) {
            Serializable serializable = (LikedUser) getIntent().getSerializableExtra("liked_user");
            if (NullChecker.a(serializable)) {
                this.f855u.getArguments().putSerializable("liked_user", serializable);
            }
        }
        if (NullChecker.a(this.f852r) && NullChecker.a(this.f855u.getArguments())) {
            this.f855u.getArguments().putSerializable("params_extra_map_data", this.f852r);
        }
        if (upa.r1()) {
            this.f855u.getArguments().putBoolean("long_time_no_see", this.f828B);
        }
        fragmentManager().m().s(android.R.id.content, this.f855u).i();
        fragmentManager().e0();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        this.f839e = getIntent().getStringExtra("userId");
        this.f859y = (ProfileCreateData) getIntent().getSerializableExtra("profile_create_data");
        final int iHashCode = new Object().hashCode();
        PerformanceLogUtil.logBegin(iHashCode, ProfileLogEntity.ProfileLogName.ACT_CREATE);
        creates(new e30() { // from class: l.ze90
            public final void call(Object obj) {
                PerformanceLogUtil.logEnd(iHashCode, ProfileLogEntity.ProfileLogName.ACT_CREATE);
            }
        });
        m1188E2();
    }

    public void initSubscription() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initSubscription();
        duringCreated(new v9j() { // from class: l.re90
            public final Object call() {
                return this.f18481a.m1194M2();
            }
        }, false).subscribe(mkd0.G(new e30() { // from class: l.ve90
            public final void call(Object obj) {
                this.f21094a.m1195N2((roj0) obj);
            }
        }));
        if (upa.O1()) {
            duringCreated(CoreModule.c.e0.H1).subscribe(mkd0.G(new e30() { // from class: l.we90
                public final void call(Object obj) {
                    this.f21666a.m1196Q2((String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m2 */
    public View m1209m2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mf90.b(this, layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.ProfileMediaAct
    /* JADX INFO: renamed from: n0 */
    public void mo1210n0(int i, boolean z, boolean z2, boolean z3) {
        this.f833G = z;
        this.f832F = i;
        if (!NullChecker.b(CoreModule.c.e0.p9()) || !TEnum.equals(CoreModule.c.e0.p9().source, "facebook")) {
            pickImagesWithPicker(1, false, true, true);
            return;
        }
        final Dialog dialogZ0 = dialog().O(m1209m2(inflater(), null)).z0();
        this.f837c.setOnClickListener(new View.OnClickListener() { // from class: l.df90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9200a.m1201V2(dialogZ0, view);
            }
        });
        this.f838d.setOnClickListener(new View.OnClickListener() { // from class: l.se90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18949a.m1202W2(dialogZ0, view);
            }
        });
    }

    public boolean needBindBillingService() {
        return true;
    }

    public boolean needRefreshPrivilege() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (upa.O1() && i == 786 && i2 == -1) {
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h);
            ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("selected_origin_images");
            if (!vwb.J(arrayList) && !vwb.J(arrayList2)) {
                this.f829C.put(((Media) arrayList.get(0)).url, (Picture) arrayList2.get(0));
            }
            onPickImagesResult(arrayList);
            return;
        }
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
        if (NullChecker.a(this.f848n)) {
            this.f848n.a(i, i2, intent);
        }
        if (i == 786) {
            if (i2 == 4097) {
                e51.G(new Runnable() { // from class: l.xe90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22243a.m1198S2();
                    }
                });
            } else if (i2 == 4098) {
                e51.G(new Runnable() { // from class: l.ye90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22818a.m1199T2();
                    }
                });
            }
        }
    }

    public void onBackPressed() {
        Frag fragH0 = fragmentManager().h0(android.R.id.content);
        if (fragH0 instanceof ProfileListFrag) {
            ProfileListFrag profileListFrag = (ProfileListFrag) fragH0;
            profileListFrag.m2767ce();
            profileListFrag.m2832nd();
            return;
        }
        if (fragH0 instanceof ProfileListFragLocalEditImpl) {
            ProfileListFragLocalEditImpl profileListFragLocalEditImpl = (ProfileListFragLocalEditImpl) fragH0;
            profileListFragLocalEditImpl.m3172k9();
            profileListFragLocalEditImpl.m3120K8();
            return;
        }
        if (fragH0 instanceof ProfileListFragLocalImpl) {
            ProfileListFragLocalImpl profileListFragLocalImpl = (ProfileListFragLocalImpl) fragH0;
            profileListFragLocalImpl.m3221f5();
            profileListFragLocalImpl.m3216b5();
        } else if (fragH0 instanceof ProfileListFragExpandedImpl) {
            ProfileListFragExpandedImpl profileListFragExpandedImpl = (ProfileListFragExpandedImpl) fragH0;
            profileListFragExpandedImpl.m2953Y4();
            profileListFragExpandedImpl.m2949U4();
        } else if (fragH0 instanceof ProfileListExpandedEditFrag) {
            ProfileListExpandedEditFrag profileListExpandedEditFrag = (ProfileListExpandedEditFrag) fragH0;
            profileListExpandedEditFrag.m1509G7();
            profileListExpandedEditFrag.m1579p7();
        }
    }

    public void onCropImageResult(String str) {
        Media picture = new Picture();
        picture.status = MediaLocalStatus.get("preprocessed");
        picture.url = rhi.B(str);
        ((Picture) picture).size = new Dimension(new pgm(rhi.z(picture.url)).d);
        picture.mediaType = "image/jpeg";
        onPickImagesResult(vwb.f0(new Media[]{picture}));
    }

    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        co5.c();
    }

    public void onPickImagesResult(List<Media> list) {
        if (this.f832F == -1 || !NullChecker.a(m1204Y2()) || list.size() <= 0) {
            return;
        }
        m1204Y2().mo1578p3(this.f832F, list.get(0));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onSaveInstanceState(bundle);
        bundle.putInt("imageId", this.f832F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        this.f843i = getIntent().getBooleanExtra("showButtons", false);
        this.f858x = getIntent().getIntExtra("pic_index", -1);
        this.f844j = getIntent().getBooleanExtra("canShowFollowButton", false);
        this.f851q = getIntent().getBooleanExtra("no_showbuttons_infofromlocal", true);
        this.f840f = getIntent().getBooleanExtra("edit", false);
        this.f841g = getIntent().getStringExtra("input_type");
        this.f842h = getIntent().getStringExtra("from");
        this.f847m = getIntent().getIntExtra("button_flag", 273);
        this.f849o = getIntent().getBooleanExtra("with_superlike", false);
        this.f853s = getIntent().getIntExtra("pushReason", 0);
        this.f854t = getIntent().getStringExtra("pushTag");
        this.f846l = RelationshipStatus.get(getIntent().getStringExtra("relationship_status"));
        this.f850p = getIntent().getBooleanExtra("from_gp_live", false);
        this.f856v = CoreModule.Q().Ii(getIntent());
        this.f857w = getIntent().getStringExtra("live_room_info");
        this.f828B = getIntent().getBooleanExtra("long_time_no_see", false);
        Serializable serializableExtra = getIntent().getSerializableExtra("params_extra_map_data");
        if (serializableExtra instanceof HashMap) {
            HashMap<String, String> map = (HashMap) serializableExtra;
            this.f852r = map;
            this.f831E = map.get("gift_msg_id");
        }
        CityCData serializableExtra2 = getIntent().getSerializableExtra("city_centre_data");
        if (NullChecker.a(serializableExtra2)) {
            this.f827A = serializableExtra2;
        }
        if (this.f840f) {
            setSwipeBackEnable(false);
        }
        if (NullChecker.a(bundle)) {
            this.f832F = bundle.getInt("imageId");
        }
        if (this.f843i) {
            setStatusBarColor(act().color(w0c0.O1));
        }
        this.f845k = getIntent().getBooleanExtra("open_media_picker", false);
        this.f860z = (CoreMomentModel) getIntent().getSerializableExtra("core_moment");
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        if ("home_card".equals(this.f842h) || "home_moment_theme_card".equals(this.f842h)) {
            this.f830D = "swipe";
        } else if ("conversation_view".equals(this.f842h)) {
            this.f830D = "conversationlist";
        } else if ("messages_thumbnail_right".equals(this.f842h) || "messages_thumbnail_left".equals(this.f842h) || "messages_title".equals(this.f842h) || "message_ice_break_dialog".equals(this.f842h) || "messages_friend_comment_toast".equals(this.f842h) || "profile_bubble".equals(this.f842h)) {
            this.f830D = "conversation";
        } else if ("moments_in_profile".equals(this.f842h)) {
            this.f830D = "personal_album";
        } else if ("likers".equals(this.f842h)) {
            this.f830D = "see";
        } else if ("push_scheme".equals(this.f842h)) {
            this.f830D = "push_scheme";
        } else if ("places".equals(this.f842h)) {
            this.f830D = "places";
        }
        m1189F2(this.f839e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTransparentStatusBar() {
        if (TextUtils.equals(this.f842h, "my_tab_profile_like")) {
            setLightStatusBar(1024);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().clearFlags(67108864);
            getWindow().setStatusBarColor(0);
            setStatusBarColor(0);
            if (NullChecker.a(getSupportActionBar())) {
                getSupportActionBar().A(0.0f);
            }
        }
    }

    public boolean shouldSwitchToTransparentStatus() {
        return TextUtils.equals(this.f842h, "my_tab_profile_like");
    }
}

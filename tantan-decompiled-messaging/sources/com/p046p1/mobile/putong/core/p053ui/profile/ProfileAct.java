package com.p046p1.mobile.putong.core.p053ui.profile;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.immomo.medialog.util.utilcode.util.NetworkUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.api.api.FacebookApi;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CityCData;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ProfileListExpandedEditFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.frag.model.CoreMomentModel;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.ProfileCreateData;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.ProfileLogEntity;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.ProfileListFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p147v.VLinear;
import p149l.bzv;
import p149l.c84;
import p149l.cdq0;
import p149l.co5;
import p149l.czv;
import p149l.d30;
import p149l.dyq;
import p149l.e30;
import p149l.e51;
import p149l.fuf;
import p149l.fyq;
import p149l.j760;
import p149l.lsi0;
import p149l.mf90;
import p149l.mkd0;
import p149l.mm90;
import p149l.ogw;
import p149l.pcl0;
import p149l.pgm;
import p149l.rhi;
import p149l.rlt;
import p149l.roj0;
import p149l.rol;
import p149l.rzb0;
import p149l.upa;
import p149l.v7c0;
import p149l.v9j;
import p149l.vdc0;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.x0m;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileAct extends ProfileMediaAct implements dyq, rol, cdq0 {

    /* JADX INFO: renamed from: A */
    public CityCData f33005A;

    /* JADX INFO: renamed from: E */
    public String f33009E;

    /* JADX INFO: renamed from: H */
    public fyq f33012H;

    /* JADX INFO: renamed from: I */
    public int f33013I;

    /* JADX INFO: renamed from: c */
    public VLinear f33015c;

    /* JADX INFO: renamed from: d */
    public VLinear f33016d;

    /* JADX INFO: renamed from: e */
    public String f33017e;

    /* JADX INFO: renamed from: f */
    public boolean f33018f;

    /* JADX INFO: renamed from: g */
    public String f33019g;

    /* JADX INFO: renamed from: h */
    public String f33020h;

    /* JADX INFO: renamed from: i */
    public boolean f33021i;

    /* JADX INFO: renamed from: j */
    public boolean f33022j;

    /* JADX INFO: renamed from: k */
    public boolean f33023k;

    /* JADX INFO: renamed from: m */
    public int f33025m;

    /* JADX INFO: renamed from: n */
    public c84 f33026n;

    /* JADX INFO: renamed from: o */
    public boolean f33027o;

    /* JADX INFO: renamed from: p */
    public boolean f33028p;

    /* JADX INFO: renamed from: r */
    @Nullable
    public HashMap<String, String> f33030r;

    /* JADX INFO: renamed from: s */
    public int f33031s;

    /* JADX INFO: renamed from: t */
    public String f33032t;

    /* JADX INFO: renamed from: u */
    public PutongFrag f33033u;

    /* JADX INFO: renamed from: w */
    public String f33035w;

    /* JADX INFO: renamed from: y */
    public ProfileCreateData f33037y;

    /* JADX INFO: renamed from: z */
    public CoreMomentModel f33038z;

    /* JADX INFO: renamed from: l */
    public RelationshipStatus f33024l = RelationshipStatus.get("unknown_");

    /* JADX INFO: renamed from: q */
    public boolean f33029q = true;

    /* JADX INFO: renamed from: v */
    public boolean f33034v = false;

    /* JADX INFO: renamed from: x */
    public int f33036x = -1;

    /* JADX INFO: renamed from: B */
    public boolean f33006B = false;

    /* JADX INFO: renamed from: C */
    public Map<String, Picture> f33007C = new HashMap(1);

    /* JADX INFO: renamed from: D */
    public String f33008D = "";

    /* JADX INFO: renamed from: F */
    public int f33010F = -1;

    /* JADX INFO: renamed from: G */
    public boolean f33011G = false;

    /* JADX INFO: renamed from: J */
    public boolean f33014J = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.ProfileAct$a */
    public class C8622a implements fuf<czv> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f33039a;

        public C8622a(d30 d30Var) {
            this.f33039a = d30Var;
        }

        @Override // p149l.fuf
        /* JADX INFO: renamed from: a */
        public void mo50769a(FacebookException facebookException) {
            FacebookApi.m29530m(facebookException);
        }

        @Override // p149l.fuf
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(czv czvVar) {
            if (czvVar.getAccessToken().m7420l().containsAll(FacebookApi.f17153e)) {
                this.f33039a.call();
            }
        }

        @Override // p149l.fuf
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: A2 */
    private boolean m50722A2(MotionEvent motionEvent, boolean z) {
        PutongFrag putongFrag = this.f33033u;
        if (putongFrag != null) {
            return putongFrag.mo29634D4(motionEvent, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m50736n2(Context context, String str, String str2, boolean z) {
        return m50738p2(context, str, str2, z, false);
    }

    /* JADX INFO: renamed from: o2 */
    public static Intent m50737o2(Context context, String str, String str2, boolean z, LikedUser likedUser) {
        Intent intentM50738p2 = m50738p2(context, str, str2, z, false);
        intentM50738p2.putExtra("liked_user", likedUser);
        return intentM50738p2;
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m50738p2(Context context, String str, String str2, boolean z, boolean z2) {
        return m50741s2(context, str, str2, z, z2, false, RelationshipStatus.get("unknown_"), 273, false, true, false);
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m50739q2(Context context, String str, String str2, boolean z, boolean z2, int i) {
        Intent intentM50738p2 = m50738p2(context, str, str2, z, z2);
        intentM50738p2.putExtra("pic_index", i);
        return intentM50738p2;
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m50740r2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, String str3, boolean z6) {
        Class cls;
        PerformanceLogUtil.instance().beginTrance();
        PerformanceLogUtil.logBegin(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        if (z2) {
            cls = EditProfileAct.class;
        } else {
            cls = (!z || upa.m194665L3()) ? ProfileAct.class : ProfileAct_CustomTransition.class;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("userId", str);
        intent.putExtra("from", str2);
        intent.putExtra("no_showbuttons_infofromlocal", z5);
        intent.putExtra("showButtons", z);
        intent.putExtra(SchemeKey.edit, z2);
        intent.putExtra("open_media_picker", z3);
        intent.putExtra("relationship_status", relationshipStatus.toString());
        intent.putExtra("button_flag", i);
        intent.putExtra("with_superlike", z4);
        intent.putExtra("from_gp_live", z6);
        intent.putExtra("live_room_info", str3);
        return intent;
    }

    /* JADX INFO: renamed from: s2 */
    public static Intent m50741s2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6) {
        Class cls;
        PerformanceLogUtil.instance().beginTrance();
        PerformanceLogUtil.logBegin(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        if (z2) {
            cls = EditProfileAct.class;
        } else {
            cls = (!z || upa.m194665L3()) ? ProfileAct.class : ProfileAct_CustomTransition.class;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("userId", str);
        intent.putExtra("from", str2);
        intent.putExtra("no_showbuttons_infofromlocal", z5);
        intent.putExtra("showButtons", z);
        intent.putExtra(SchemeKey.edit, z2);
        intent.putExtra("open_media_picker", z3);
        intent.putExtra("relationship_status", relationshipStatus.toString());
        intent.putExtra("button_flag", i);
        intent.putExtra("with_superlike", z4);
        intent.putExtra("from_gp_live", z6);
        return intent;
    }

    /* JADX INFO: renamed from: u2 */
    public static Intent m50742u2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, String str3) {
        Intent intentM50741s2 = m50741s2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6);
        intentM50741s2.putExtra("input_type", str3);
        return intentM50741s2;
    }

    /* JADX INFO: renamed from: v2 */
    public static Intent m50743v2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intent intentM50741s2 = m50741s2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6);
        intentM50741s2.putExtra("canShowFollowButton", z7);
        return intentM50741s2;
    }

    /* JADX INFO: renamed from: w2 */
    public static Intent m50744w2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7, int i2, String str3) {
        Intent intentM50741s2 = m50741s2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6);
        intentM50741s2.putExtra("canShowFollowButton", z7);
        intentM50741s2.putExtra("pushReason", i2);
        intentM50741s2.putExtra("pushTag", str3);
        return intentM50741s2;
    }

    /* JADX INFO: renamed from: y2 */
    public static Intent m50745y2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7, String str3) {
        Intent intentM50740r2 = m50740r2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, str3, z6);
        intentM50740r2.putExtra("canShowFollowButton", z7);
        return intentM50740r2;
    }

    /* JADX INFO: renamed from: z2 */
    public static Intent m50746z2(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        Intent intentM50738p2 = m50738p2(context, str, str2, z, z2);
        intentM50738p2.putExtra("canShowFollowButton", z3);
        return intentM50738p2;
    }

    /* JADX INFO: renamed from: B2 */
    public final void m50747B2(d30 d30Var) {
        AccessToken accessTokenM7408d = AccessToken.m7408d();
        if (NullChecker.m81303a(accessTokenM7408d) && accessTokenM7408d.m7420l().containsAll(FacebookApi.f17153e)) {
            d30Var.call();
            return;
        }
        if (this.f33026n == null) {
            this.f33026n = c84.C16094b.m105650a();
            bzv.m104655m().m104685y(this.f33026n, new C8622a(d30Var));
        }
        bzv.m104655m().m104681t(this, FacebookApi.f17153e);
    }

    /* JADX INFO: renamed from: C2 */
    public PutongFrag m50748C2() {
        return this.f33033u;
    }

    /* JADX INFO: renamed from: D2 */
    public final PutongFrag m50749D2() {
        mm90 mm90Var = new mm90();
        mm90Var.f134562a = this.f33017e;
        mm90Var.f134563b = this.f33021i;
        mm90Var.f134564c = this.f33018f;
        mm90Var.f134565d = this.f33019g;
        mm90Var.f134566e = this.f33020h;
        mm90Var.f134567f = this.f33023k;
        mm90Var.f134568g = this.f33024l;
        mm90Var.f134569h = this.f33025m;
        mm90Var.f134570i = this.f33027o;
        mm90Var.f134571j = this.f33029q;
        mm90Var.f134572k = this.f33028p;
        mm90Var.f134573l = this.f33022j;
        mm90Var.f134574m = this.f33036x;
        mm90Var.f134575n = this.f33038z;
        mm90Var.f134576o = this.f33031s;
        mm90Var.f134577p = this.f33032t;
        mm90Var.f134578q = this.f33005A;
        mm90Var.f134579r = this.f33035w;
        mm90Var.f134580s = getIntent().getStringExtra("profile_like_id");
        return (this.f33018f || !upa.m194670M3()) ? ProfileListFrag.m51847E8(mm90Var) : ProfileListFragExpandedImpl.m52407P4(mm90Var);
    }

    /* JADX INFO: renamed from: E2 */
    public final void m50750E2() {
        if (NullChecker.m81303a(this.f33037y) && this.f33037y.showCountdownSendMsg) {
            creates(new e30() { // from class: l.af90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f69160a.m50754K2((Bundle) obj);
                }
            });
            lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.bf90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f75284a.m50755L2((C4319c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final void m50751F2(String str) {
        if (User.isTeamAccount(str)) {
            return;
        }
        if ("conversation_view".equals(this.f33020h) || "from_conversation".equals(this.f33020h) || "messages_title".equals(this.f33020h) || "messages_thumbnail_left".equals(this.f33020h) || "profile_bubble".equals(this.f33020h) || "home_card".equals(this.f33020h)) {
            CoreModule.f17545c.f19562E1.m187829D3(str);
        }
    }

    /* JADX INFO: renamed from: H2 */
    public boolean m50752H2() {
        return this.f33018f;
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m50753I2() {
        this.f33012H.m123795h();
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m50754K2(Bundle bundle) {
        this.f33012H = new fyq(act());
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.te90
            @Override // java.lang.Runnable
            public final void run() {
                this.f169806a.m50753I2();
            }
        });
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m50755L2(C4319c c4319c) {
        if (NullChecker.m81303a(this.f33012H)) {
            if (c4319c == C4319c.f15548i) {
                this.f33012H.m123794g(this);
            } else if (c4319c == C4319c.f15549j) {
                this.f33012H.m123794g(null);
            } else if (c4319c == C4319c.f15552m) {
                this.f33012H.m123789b();
            }
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ C22306c m50756M2() {
        return CoreModule.f17545c.f19642f0.m33116se(this.f33017e).filter(new w9j() { // from class: l.cf90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80545a.m50759R2((roj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m50757N2(roj0 roj0Var) {
        if (CoreModule.m29936Q().mo67255a().mo124834a() || "moment_visitor".equals(this.f33020h) || "photo_album_feed_from_activity".equals(this.f33020h) || "photo_album_feed_viewers".equals(this.f33020h) || "liked_users_anchor".equals(this.f33020h) || "from_conversation_search_view".equals(this.f33020h)) {
            return;
        }
        m47815F2();
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m50758Q2(String str) {
        Picture picture = this.f33007C.get(str);
        if (NetworkUtils.m18396c() && NullChecker.m81303a(picture)) {
            CoreModule.f17545c.f19639e0.m169406Ja(ogw.m164283d(new File(rhi.m179382z(str))), picture);
        }
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ Boolean m50759R2(roj0 roj0Var) {
        return Boolean.valueOf((this.f33021i || (NullChecker.m81303a(this.f33037y) && !this.f33037y.checkConv) || "places".equals(this.f33020h) || "interest_card".equals(this.f33020h) || "live_user_card".equals(this.f33020h) || rlt.m179881b(this.f33020h) || "live_from_h5".equals(this.f33020h) || "from_live_group_rank".equals(this.f33020h) || "live_from_voice_entrance".equals(this.f33020h) || "from_live_square".equals(this.f33020h) || "anchor-search".equals(this.f33020h) || "live_profile_voice_mask_mode".equals(this.f33020h) || "chat_group".equals(this.f33020h) || "chat_group_anonymity".equals(this.f33020h) || "from_theme_recommendation".equals(this.f33020h) || "group_notification".equals(this.f33020h) || "group_notification_anonymity".equals(this.f33020h) || "moment_gift_detail".equals(this.f33020h) || "moment_gift_rank".equals(this.f33020h) || "from_giftwall".equals(this.f33020h) || "team_account".equals(this.f33020h) || "from_christmas".equals(this.f33020h) || "from_portrait_like_list".equals(this.f33020h) || "from_activities_gift_profile".equals(this.f33020h) || "from_meet_feed".equals(this.f33020h) || "from_meet_profile".equals(this.f33020h) || "form_kankan_video_list".equals(this.f33020h) || "form_my_pet".equals(this.f33020h) || "impress_signal".equals(this.f33020h) || "from_mew_tags".equals(this.f33020h) || "from_literature_third".equals(this.f33020h) || "push_like".equals(this.f33020h) || "from_find_partner".equals(this.f33020h) || "from_voice_buzz".equals(this.f33020h) || "from_pin_like".equals(this.f33020h) || "from_city_center_conv_banner".equals(this.f33020h) || "share_profile".equals(this.f33020h) || "p_picks_profile".equals(this.f33020h) || "p_mbti_detail".equals(this.f33020h) || "p_picks_profile_card".equals(this.f33020h) || "from_friend_tacit".equals(this.f33020h) || "p_game_cp".equals(this.f33020h) || "p_received_profile_like".equals(this.f33020h) || "p_lifestyle_tag".equals(this.f33020h) || "p_game_cp_msg".equals(this.f33020h)) ? false : true);
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m50760S2() {
        lsi0.m151580j(act().getString(R$string.f17767Gk));
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m50761T2() {
        lsi0.m151580j(act().getString(R$string.f17797Hk));
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m50762U2() {
        startActivityForResult(MediaPickerAct.m47784e2(this, 1, false, false, true, "profile", MediaPickerAct.f30622C, false), PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m50763V2(Dialog dialog, View view) {
        m50747B2(new d30() { // from class: l.ue90
            @Override // p149l.d30
            public final void call() {
                this.f176017a.m50762U2();
            }
        });
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m50764W2(Dialog dialog, View view) {
        pickImagesWithPicker(1, false, true, true);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: X2 */
    public void m50765X2(int i) {
        mo45972i0(i, false);
    }

    /* JADX INFO: renamed from: Y2 */
    public x0m m50766Y2() {
        pcl0 pcl0VarM2554h0 = fragmentManager().m2554h0(R.id.content);
        if (pcl0VarM2554h0 instanceof ProfileListFragLocalImpl) {
            return (x0m) ((ProfileListFragLocalImpl) pcl0VarM2554h0).m52670d5();
        }
        return pcl0VarM2554h0 instanceof ProfileListFragExpandedImpl ? (x0m) ((ProfileListFragExpandedImpl) pcl0VarM2554h0).m52414W4() : (x0m) pcl0VarM2554h0;
    }

    /* JADX INFO: renamed from: Z2 */
    public final boolean m50767Z2() {
        return this.f33034v || "from_recommend_like".equals(this.f33020h) || "preview_card".equals(this.f33020h) || "form_my_pet".equals(this.f33020h) || "profile_bubble".equals(this.f33020h) || "from_greet_act".equals(this.f33020h) || "messages_title".equals(this.f33020h) || "messages_thumbnail_left".equals(this.f33020h) || "messages_thumbnail_right".equals(this.f33020h) || "from_see_blind_box".equals(this.f33020h);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        Frag frag = (Frag) fragmentManager().m2554h0(R.id.content);
        if (frag instanceof ProfileListFrag) {
            return ((ProfileListFrag) frag).mo29633C4();
        }
        if (frag instanceof ProfileListFragLocalEditImpl) {
            return ((ProfileListFragLocalEditImpl) frag).mo29633C4();
        }
        return frag instanceof PutongFrag ? (ArrayList) ((PutongFrag) frag).mo29633C4() : vwb.m200324f0(new j760[0]);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m50722A2(motionEvent, false) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct, p149l.fwl
    /* JADX INFO: renamed from: f2 */
    public void mo43239f2(int i, String str) {
        this.f33010F = i;
        vdc0.m197988b(act(), str, act() instanceof EditProfileAct);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m47815F2() {
        super.m47815F2();
        if (m50767Z2()) {
            overridePendingTransition(0, rzb0.f161652x);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public int getDefaultThemeResId() {
        return v7c0.f180376w;
    }

    @Override // p149l.dyq
    /* JADX INFO: renamed from: h */
    public void mo42557h(int i, int i2) {
        int i3 = this.f33013I;
        if (i - i3 > 0 || i > 0) {
            this.f33014J = true;
        } else if (i - i3 < 0) {
            this.f33014J = false;
        }
        this.f33013I = i;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct, p149l.fwl
    /* JADX INFO: renamed from: i0 */
    public void mo45972i0(int i, boolean z) {
        mo43246n0(i, z, false, false);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (fragmentManager().m2554h0(R.id.content) != null) {
            this.f33033u = (PutongFrag) fragmentManager().m2554h0(R.id.content);
            return null;
        }
        PutongFrag putongFragM50749D2 = m50749D2();
        this.f33033u = putongFragM50749D2;
        if (NullChecker.m81303a(putongFragM50749D2.getArguments())) {
            this.f33033u.getArguments().putBoolean("live_flag", this.f33034v);
            this.f33033u.getArguments().putString("gift_msg_id", this.f33009E);
            this.f33033u.getArguments().putSerializable("profile_create_data", this.f33037y);
        }
        if (upa.m194706V1()) {
            String stringExtra = getIntent().getStringExtra("from_group_id");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f33033u.getArguments().putString("from_group_id", stringExtra);
            }
        }
        if ("from_meet_feed".equals(this.f33020h)) {
            LikedUser likedUser = (LikedUser) getIntent().getSerializableExtra("liked_user");
            if (NullChecker.m81303a(likedUser)) {
                this.f33033u.getArguments().putSerializable("liked_user", likedUser);
            }
        }
        if (NullChecker.m81303a(this.f33030r) && NullChecker.m81303a(this.f33033u.getArguments())) {
            this.f33033u.getArguments().putSerializable("params_extra_map_data", this.f33030r);
        }
        if (upa.m194809r1()) {
            this.f33033u.getArguments().putBoolean("long_time_no_see", this.f33006B);
        }
        fragmentManager().m2567m().m2811s(R.id.content, this.f33033u).mo2707i();
        fragmentManager().m2545e0();
        return null;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f33017e = getIntent().getStringExtra("userId");
        this.f33037y = (ProfileCreateData) getIntent().getSerializableExtra("profile_create_data");
        final int iHashCode = new Object().hashCode();
        PerformanceLogUtil.logBegin(iHashCode, ProfileLogEntity.ProfileLogName.ACT_CREATE);
        creates(new e30() { // from class: l.ze90
            @Override // p149l.e30
            public final void call(Object obj) {
                PerformanceLogUtil.logEnd(iHashCode, ProfileLogEntity.ProfileLogName.ACT_CREATE);
            }
        });
        m50750E2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(new v9j() { // from class: l.re90
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f159037a.m50756M2();
            }
        }, false).subscribe(mkd0.m154955G(new e30() { // from class: l.ve90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181161a.m50757N2((roj0) obj);
            }
        }));
        if (upa.m194678O1()) {
            duringCreated(CoreModule.f17545c.f19639e0.f149184H1).subscribe(mkd0.m154955G(new e30() { // from class: l.we90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f185916a.m50758Q2((String) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: m2 */
    public View m50768m2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mf90.m154370b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct, p149l.fwl
    /* JADX INFO: renamed from: n0 */
    public void mo43246n0(int i, boolean z, boolean z2, boolean z3) {
        this.f33011G = z;
        this.f33010F = i;
        if (!NullChecker.m81304b(CoreModule.f17545c.f19639e0.m169527p9()) || !TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().source, "facebook")) {
            pickImagesWithPicker(1, false, true, true);
            return;
        }
        final Dialog dialogM20568z0 = dialog().m20519O(m50768m2(inflater(), null)).m20568z0();
        this.f33015c.setOnClickListener(new View.OnClickListener() { // from class: l.df90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85902a.m50763V2(dialogM20568z0, view);
            }
        });
        this.f33016d.setOnClickListener(new View.OnClickListener() { // from class: l.se90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163935a.m50764W2(dialogM20568z0, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needRefreshPrivilege() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (upa.m194678O1() && i == 786 && i2 == -1) {
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
            ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("selected_origin_images");
            if (!vwb.m200296J(arrayList) && !vwb.m200296J(arrayList2)) {
                this.f33007C.put(((Media) arrayList.get(0)).url, (Picture) arrayList2.get(0));
            }
            onPickImagesResult(arrayList);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m81303a(this.f33026n)) {
            this.f33026n.mo8661a(i, i2, intent);
        }
        if (i == 786) {
            if (i2 == 4097) {
                e51.m114742G(new Runnable() { // from class: l.xe90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f192544a.m50760S2();
                    }
                });
            } else if (i2 == 4098) {
                e51.m114742G(new Runnable() { // from class: l.ye90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f197671a.m50761T2();
                    }
                });
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Frag frag = (Frag) fragmentManager().m2554h0(R.id.content);
        if (frag instanceof ProfileListFrag) {
            ProfileListFrag profileListFrag = (ProfileListFrag) frag;
            profileListFrag.m52238ce();
            profileListFrag.m52299nd();
            return;
        }
        if (frag instanceof ProfileListFragLocalEditImpl) {
            ProfileListFragLocalEditImpl profileListFragLocalEditImpl = (ProfileListFragLocalEditImpl) frag;
            profileListFragLocalEditImpl.m52628k9();
            profileListFragLocalEditImpl.m52579K8();
            return;
        }
        if (frag instanceof ProfileListFragLocalImpl) {
            ProfileListFragLocalImpl profileListFragLocalImpl = (ProfileListFragLocalImpl) frag;
            profileListFragLocalImpl.m52672f5();
            profileListFragLocalImpl.m52668b5();
        } else if (frag instanceof ProfileListFragExpandedImpl) {
            ProfileListFragExpandedImpl profileListFragExpandedImpl = (ProfileListFragExpandedImpl) frag;
            profileListFragExpandedImpl.m52416Y4();
            profileListFragExpandedImpl.m52412U4();
        } else if (frag instanceof ProfileListExpandedEditFrag) {
            ProfileListExpandedEditFrag profileListExpandedEditFrag = (ProfileListExpandedEditFrag) frag;
            profileListExpandedEditFrag.m51061G7();
            profileListExpandedEditFrag.m51127p7();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        Picture picture = new Picture();
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        picture.url = rhi.m179355B(str);
        picture.size = new Dimension(new pgm(rhi.m179382z(picture.url)).f148730d);
        picture.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        onPickImagesResult(vwb.m200324f0(picture));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.AutoReleaseVideoAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        co5.m107931c();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (this.f33010F == -1 || !NullChecker.m81303a(m50766Y2()) || list.size() <= 0) {
            return;
        }
        m50766Y2().mo51126p3(this.f33010F, list.get(0));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("imageId", this.f33010F);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f33021i = getIntent().getBooleanExtra("showButtons", false);
        this.f33036x = getIntent().getIntExtra("pic_index", -1);
        this.f33022j = getIntent().getBooleanExtra("canShowFollowButton", false);
        this.f33029q = getIntent().getBooleanExtra("no_showbuttons_infofromlocal", true);
        this.f33018f = getIntent().getBooleanExtra(SchemeKey.edit, false);
        this.f33019g = getIntent().getStringExtra("input_type");
        this.f33020h = getIntent().getStringExtra("from");
        this.f33025m = getIntent().getIntExtra("button_flag", 273);
        this.f33027o = getIntent().getBooleanExtra("with_superlike", false);
        this.f33031s = getIntent().getIntExtra("pushReason", 0);
        this.f33032t = getIntent().getStringExtra("pushTag");
        this.f33024l = RelationshipStatus.get(getIntent().getStringExtra("relationship_status"));
        this.f33028p = getIntent().getBooleanExtra("from_gp_live", false);
        this.f33034v = CoreModule.m29936Q().mo67224Ii(getIntent());
        this.f33035w = getIntent().getStringExtra("live_room_info");
        this.f33006B = getIntent().getBooleanExtra("long_time_no_see", false);
        Serializable serializableExtra = getIntent().getSerializableExtra("params_extra_map_data");
        if (serializableExtra instanceof HashMap) {
            HashMap<String, String> map = (HashMap) serializableExtra;
            this.f33030r = map;
            this.f33009E = map.get("gift_msg_id");
        }
        Serializable serializableExtra2 = getIntent().getSerializableExtra("city_centre_data");
        if (NullChecker.m81303a(serializableExtra2)) {
            this.f33005A = (CityCData) serializableExtra2;
        }
        if (this.f33018f) {
            setSwipeBackEnable(false);
        }
        if (NullChecker.m81303a(bundle)) {
            this.f33010F = bundle.getInt("imageId");
        }
        if (this.f33021i) {
            setStatusBarColor(act().color(w0c0.f183793O1));
        }
        this.f33023k = getIntent().getBooleanExtra("open_media_picker", false);
        this.f33038z = (CoreMomentModel) getIntent().getSerializableExtra("core_moment");
        super.preCreateView(bundle);
        if ("home_card".equals(this.f33020h) || "home_moment_theme_card".equals(this.f33020h)) {
            this.f33008D = "swipe";
        } else if ("conversation_view".equals(this.f33020h)) {
            this.f33008D = "conversationlist";
        } else if ("messages_thumbnail_right".equals(this.f33020h) || "messages_thumbnail_left".equals(this.f33020h) || "messages_title".equals(this.f33020h) || CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG.equals(this.f33020h) || "messages_friend_comment_toast".equals(this.f33020h) || "profile_bubble".equals(this.f33020h)) {
            this.f33008D = "conversation";
        } else if ("moments_in_profile".equals(this.f33020h)) {
            this.f33008D = "personal_album";
        } else if ("likers".equals(this.f33020h)) {
            this.f33008D = "see";
        } else if ("push_scheme".equals(this.f33020h)) {
            this.f33008D = "push_scheme";
        } else if ("places".equals(this.f33020h)) {
            this.f33008D = "places";
        }
        m50751F2(this.f33017e);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        if (TextUtils.equals(this.f33020h, "my_tab_profile_like")) {
            setLightStatusBar(1024);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            getWindow().setStatusBarColor(0);
            setStatusBarColor(0);
            if (NullChecker.m81303a(getSupportActionBar())) {
                getSupportActionBar().mo134111A(0.0f);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return TextUtils.equals(this.f33020h, "my_tab_profile_like");
    }
}

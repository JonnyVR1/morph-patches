package com.p051p1.mobile.putong.core.p058ui.profile;

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
import androidx.lifecycle.InterfaceC0476e;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.immomo.medialog.util.utilcode.util.NetworkUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.api.api.FacebookApi;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CityCData;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ProfileListExpandedEditFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.frag.model.CoreMomentModel;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.ProfileCreateData;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.PerformanceLogUtil;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.ProfileLogEntity;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragExpandedImpl;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p151v.VLinear;
import p153l.a1w;
import p153l.agc0;
import p153l.b94;
import p153l.c9c0;
import p153l.cmc0;
import p153l.crl;
import p153l.d0r;
import p153l.f0r;
import p153l.gp5;
import p153l.gra;
import p153l.hmq0;
import p153l.jyb;
import p153l.l51;
import p153l.niw;
import p153l.o1j0;
import p153l.oki;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.q3m;
import p153l.qcj;
import p153l.qn90;
import p153l.qu90;
import p153l.sim;
import p153l.tnt;
import p153l.tvf;
import p153l.uxj0;
import p153l.x20;
import p153l.x7c0;
import p153l.y20;
import p153l.z0w;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileAct extends ProfileMediaAct implements d0r, crl, hmq0 {

    /* JADX INFO: renamed from: A */
    public CityCData f33853A;

    /* JADX INFO: renamed from: E */
    public String f33857E;

    /* JADX INFO: renamed from: H */
    public f0r f33860H;

    /* JADX INFO: renamed from: I */
    public int f33861I;

    /* JADX INFO: renamed from: c */
    public VLinear f33863c;

    /* JADX INFO: renamed from: d */
    public VLinear f33864d;

    /* JADX INFO: renamed from: e */
    public String f33865e;

    /* JADX INFO: renamed from: f */
    public boolean f33866f;

    /* JADX INFO: renamed from: g */
    public String f33867g;

    /* JADX INFO: renamed from: h */
    public String f33868h;

    /* JADX INFO: renamed from: i */
    public boolean f33869i;

    /* JADX INFO: renamed from: j */
    public boolean f33870j;

    /* JADX INFO: renamed from: k */
    public boolean f33871k;

    /* JADX INFO: renamed from: m */
    public int f33873m;

    /* JADX INFO: renamed from: n */
    public b94 f33874n;

    /* JADX INFO: renamed from: o */
    public boolean f33875o;

    /* JADX INFO: renamed from: p */
    public boolean f33876p;

    /* JADX INFO: renamed from: r */
    @Nullable
    public HashMap<String, String> f33878r;

    /* JADX INFO: renamed from: s */
    public int f33879s;

    /* JADX INFO: renamed from: t */
    public String f33880t;

    /* JADX INFO: renamed from: u */
    public PutongFrag f33881u;

    /* JADX INFO: renamed from: w */
    public String f33883w;

    /* JADX INFO: renamed from: y */
    public ProfileCreateData f33885y;

    /* JADX INFO: renamed from: z */
    public CoreMomentModel f33886z;

    /* JADX INFO: renamed from: l */
    public RelationshipStatus f33872l = RelationshipStatus.get("unknown_");

    /* JADX INFO: renamed from: q */
    public boolean f33877q = true;

    /* JADX INFO: renamed from: v */
    public boolean f33882v = false;

    /* JADX INFO: renamed from: x */
    public int f33884x = -1;

    /* JADX INFO: renamed from: B */
    public boolean f33854B = false;

    /* JADX INFO: renamed from: C */
    public Map<String, Picture> f33855C = new HashMap(1);

    /* JADX INFO: renamed from: D */
    public String f33856D = "";

    /* JADX INFO: renamed from: F */
    public int f33858F = -1;

    /* JADX INFO: renamed from: G */
    public boolean f33859G = false;

    /* JADX INFO: renamed from: J */
    public boolean f33862J = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.ProfileAct$a */
    public class C8785a implements tvf<a1w> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f33887a;

        public C8785a(x20 x20Var) {
            this.f33887a = x20Var;
        }

        @Override // p153l.tvf
        /* JADX INFO: renamed from: a */
        public void mo51952a(FacebookException facebookException) {
            FacebookApi.m30528m(facebookException);
        }

        @Override // p153l.tvf
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(a1w a1wVar) {
            if (a1wVar.getAccessToken().m7474l().containsAll(FacebookApi.f17872e)) {
                this.f33887a.call();
            }
        }

        @Override // p153l.tvf
        public void onCancel() {
        }
    }

    /* JADX INFO: renamed from: A2 */
    public static Intent m51905A2(Context context, String str, String str2, boolean z, boolean z2, boolean z3) {
        Intent intentM51922q2 = m51922q2(context, str, str2, z, z2);
        intentM51922q2.putExtra("canShowFollowButton", z3);
        return intentM51922q2;
    }

    /* JADX INFO: renamed from: B2 */
    private boolean m51906B2(MotionEvent motionEvent, boolean z) {
        PutongFrag putongFrag = this.f33881u;
        if (putongFrag != null) {
            return putongFrag.mo30632D4(motionEvent, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: o2 */
    public static Intent m51920o2(Context context, String str, String str2, boolean z) {
        return m51922q2(context, str, str2, z, false);
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m51921p2(Context context, String str, String str2, boolean z, LikedUser likedUser) {
        Intent intentM51922q2 = m51922q2(context, str, str2, z, false);
        intentM51922q2.putExtra("liked_user", likedUser);
        return intentM51922q2;
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m51922q2(Context context, String str, String str2, boolean z, boolean z2) {
        return m51925u2(context, str, str2, z, z2, false, RelationshipStatus.get("unknown_"), 273, false, true, false);
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m51923r2(Context context, String str, String str2, boolean z, boolean z2, int i) {
        Intent intentM51922q2 = m51922q2(context, str, str2, z, z2);
        intentM51922q2.putExtra("pic_index", i);
        return intentM51922q2;
    }

    /* JADX INFO: renamed from: s2 */
    public static Intent m51924s2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, String str3, boolean z6) {
        Class cls;
        PerformanceLogUtil.instance().beginTrance();
        PerformanceLogUtil.logBegin(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        if (z2) {
            cls = EditProfileAct.class;
        } else {
            cls = (!z || gra.m131596L3()) ? ProfileAct.class : ProfileAct_CustomTransition.class;
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

    /* JADX INFO: renamed from: u2 */
    public static Intent m51925u2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6) {
        Class cls;
        PerformanceLogUtil.instance().beginTrance();
        PerformanceLogUtil.logBegin(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        if (z2) {
            cls = EditProfileAct.class;
        } else {
            cls = (!z || gra.m131596L3()) ? ProfileAct.class : ProfileAct_CustomTransition.class;
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

    /* JADX INFO: renamed from: v2 */
    public static Intent m51926v2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, String str3) {
        Intent intentM51925u2 = m51925u2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6);
        intentM51925u2.putExtra("input_type", str3);
        return intentM51925u2;
    }

    /* JADX INFO: renamed from: w2 */
    public static Intent m51927w2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intent intentM51925u2 = m51925u2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6);
        intentM51925u2.putExtra("canShowFollowButton", z7);
        return intentM51925u2;
    }

    /* JADX INFO: renamed from: y2 */
    public static Intent m51928y2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7, int i2, String str3) {
        Intent intentM51925u2 = m51925u2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, z6);
        intentM51925u2.putExtra("canShowFollowButton", z7);
        intentM51925u2.putExtra("pushReason", i2);
        intentM51925u2.putExtra("pushTag", str3);
        return intentM51925u2;
    }

    /* JADX INFO: renamed from: z2 */
    public static Intent m51929z2(Context context, String str, String str2, boolean z, boolean z2, boolean z3, RelationshipStatus relationshipStatus, int i, boolean z4, boolean z5, boolean z6, boolean z7, String str3) {
        Intent intentM51924s2 = m51924s2(context, str, str2, z, z2, z3, relationshipStatus, i, z4, z5, str3, z6);
        intentM51924s2.putExtra("canShowFollowButton", z7);
        return intentM51924s2;
    }

    /* JADX INFO: renamed from: C2 */
    public final void m51930C2(x20 x20Var) {
        AccessToken accessTokenM7462d = AccessToken.m7462d();
        if (NullChecker.m82486a(accessTokenM7462d) && accessTokenM7462d.m7474l().containsAll(FacebookApi.f17872e)) {
            x20Var.call();
            return;
        }
        if (this.f33874n == null) {
            this.f33874n = b94.C15949b.m103051a();
            z0w.m218186m().m218216y(this.f33874n, new C8785a(x20Var));
        }
        z0w.m218186m().m218212t(this, FacebookApi.f17872e);
    }

    /* JADX INFO: renamed from: D2 */
    public PutongFrag m51931D2() {
        return this.f33881u;
    }

    /* JADX INFO: renamed from: E2 */
    public final PutongFrag m51932E2() {
        qu90 qu90Var = new qu90();
        qu90Var.f159534a = this.f33865e;
        qu90Var.f159535b = this.f33869i;
        qu90Var.f159536c = this.f33866f;
        qu90Var.f159537d = this.f33867g;
        qu90Var.f159538e = this.f33868h;
        qu90Var.f159539f = this.f33871k;
        qu90Var.f159540g = this.f33872l;
        qu90Var.f159541h = this.f33873m;
        qu90Var.f159542i = this.f33875o;
        qu90Var.f159543j = this.f33877q;
        qu90Var.f159544k = this.f33876p;
        qu90Var.f159545l = this.f33870j;
        qu90Var.f159546m = this.f33884x;
        qu90Var.f159547n = this.f33886z;
        qu90Var.f159548o = this.f33879s;
        qu90Var.f159549p = this.f33880t;
        qu90Var.f159550q = this.f33853A;
        qu90Var.f159551r = this.f33883w;
        qu90Var.f159552s = getIntent().getStringExtra("profile_like_id");
        return (this.f33866f || !gra.m131601M3()) ? ProfileListFrag.m53030E8(qu90Var) : ProfileListFragExpandedImpl.m53590P4(qu90Var);
    }

    /* JADX INFO: renamed from: F2 */
    public final void m51933F2() {
        if (NullChecker.m82486a(this.f33885y) && this.f33885y.showCountdownSendMsg) {
            creates(new y20() { // from class: l.en90
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f94736a.m51937L2((Bundle) obj);
                }
            });
            lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.fn90
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99880a.m51938M2((C4470c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final void m51934H2(String str) {
        if (User.isTeamAccount(str)) {
            return;
        }
        if ("conversation_view".equals(this.f33868h) || "from_conversation".equals(this.f33868h) || "messages_title".equals(this.f33868h) || "messages_thumbnail_left".equals(this.f33868h) || "profile_bubble".equals(this.f33868h) || "home_card".equals(this.f33868h)) {
            CoreModule.f18264c.f20304E1.m109148D3(str);
        }
    }

    /* JADX INFO: renamed from: I2 */
    public boolean m51935I2() {
        return this.f33866f;
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m51936K2() {
        this.f33860H.m123510h();
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m51937L2(Bundle bundle) {
        this.f33860H = new f0r(act());
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.xm90
            @Override // java.lang.Runnable
            public final void run() {
                this.f195058a.m51936K2();
            }
        });
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m51938M2(C4470c c4470c) {
        if (NullChecker.m82486a(this.f33860H)) {
            if (c4470c == C4470c.f16267i) {
                this.f33860H.m123509g(this);
            } else if (c4470c == C4470c.f16268j) {
                this.f33860H.m123509g(null);
            } else if (c4470c == C4470c.f16271m) {
                this.f33860H.m123504b();
            }
        }
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ C22421c m51939N2() {
        return CoreModule.f18264c.f20384f0.m34119se(this.f33865e).filter(new qcj() { // from class: l.gn90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f105070a.m51942S2((uxj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m51940Q2(uxj0 uxj0Var) {
        if (CoreModule.m30934Q().mo68438a().mo134409a() || "moment_visitor".equals(this.f33868h) || "photo_album_feed_from_activity".equals(this.f33868h) || "photo_album_feed_viewers".equals(this.f33868h) || "liked_users_anchor".equals(this.f33868h) || "from_conversation_search_view".equals(this.f33868h)) {
            return;
        }
        m48999H2();
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m51941R2(String str) {
        Picture picture = this.f33855C.get(str);
        if (NetworkUtils.m19405c() && NullChecker.m82486a(picture)) {
            CoreModule.f18264c.f20381e0.m116479Ja(niw.m163314d(new File(oki.m168038z(str))), picture);
        }
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ Boolean m51942S2(uxj0 uxj0Var) {
        return Boolean.valueOf((this.f33869i || (NullChecker.m82486a(this.f33885y) && !this.f33885y.checkConv) || "places".equals(this.f33868h) || "interest_card".equals(this.f33868h) || "live_user_card".equals(this.f33868h) || tnt.m191965b(this.f33868h) || "live_from_h5".equals(this.f33868h) || "from_live_group_rank".equals(this.f33868h) || "live_from_voice_entrance".equals(this.f33868h) || "from_live_square".equals(this.f33868h) || "anchor-search".equals(this.f33868h) || "live_profile_voice_mask_mode".equals(this.f33868h) || "chat_group".equals(this.f33868h) || "chat_group_anonymity".equals(this.f33868h) || "from_theme_recommendation".equals(this.f33868h) || "group_notification".equals(this.f33868h) || "group_notification_anonymity".equals(this.f33868h) || "moment_gift_detail".equals(this.f33868h) || "moment_gift_rank".equals(this.f33868h) || "from_giftwall".equals(this.f33868h) || "team_account".equals(this.f33868h) || "from_christmas".equals(this.f33868h) || "from_portrait_like_list".equals(this.f33868h) || "from_activities_gift_profile".equals(this.f33868h) || "from_meet_feed".equals(this.f33868h) || "from_meet_profile".equals(this.f33868h) || "form_kankan_video_list".equals(this.f33868h) || "form_my_pet".equals(this.f33868h) || "impress_signal".equals(this.f33868h) || "from_mew_tags".equals(this.f33868h) || "from_literature_third".equals(this.f33868h) || "push_like".equals(this.f33868h) || "from_find_partner".equals(this.f33868h) || "from_voice_buzz".equals(this.f33868h) || "from_pin_like".equals(this.f33868h) || "from_city_center_conv_banner".equals(this.f33868h) || "share_profile".equals(this.f33868h) || "p_picks_profile".equals(this.f33868h) || "p_mbti_detail".equals(this.f33868h) || "p_picks_profile_card".equals(this.f33868h) || "from_friend_tacit".equals(this.f33868h) || "p_game_cp".equals(this.f33868h) || "p_received_profile_like".equals(this.f33868h) || "p_lifestyle_tag".equals(this.f33868h) || "p_game_cp_msg".equals(this.f33868h)) ? false : true);
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m51943T2() {
        o1j0.m165636j(act().getString(R$string.f19160cl));
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m51944U2() {
        o1j0.m165636j(act().getString(R$string.f19191dl));
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m51945V2() {
        startActivityForResult(MediaPickerAct.m48967g2(this, 1, false, false, true, "profile", MediaPickerAct.f31470C, false), PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m51946W2(Dialog dialog, View view) {
        m51930C2(new x20() { // from class: l.ym90
            @Override // p153l.x20
            public final void call() {
                this.f200647a.m51945V2();
            }
        });
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m51947X2(Dialog dialog, View view) {
        pickImagesWithPicker(1, false, true, true);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: Z2 */
    public void m51948Z2(int i) {
        mo47155i0(i, false);
    }

    /* JADX INFO: renamed from: a3 */
    public q3m m51949a3() {
        InterfaceC0476e interfaceC0476eM2555h0 = fragmentManager().m2555h0(R.id.content);
        if (interfaceC0476eM2555h0 instanceof ProfileListFragLocalImpl) {
            return (q3m) ((ProfileListFragLocalImpl) interfaceC0476eM2555h0).m53853d5();
        }
        return interfaceC0476eM2555h0 instanceof ProfileListFragExpandedImpl ? (q3m) ((ProfileListFragExpandedImpl) interfaceC0476eM2555h0).m53597W4() : (q3m) interfaceC0476eM2555h0;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m51950b3() {
        return this.f33882v || "from_recommend_like".equals(this.f33868h) || "preview_card".equals(this.f33868h) || "form_my_pet".equals(this.f33868h) || "profile_bubble".equals(this.f33868h) || "from_greet_act".equals(this.f33868h) || "messages_title".equals(this.f33868h) || "messages_thumbnail_left".equals(this.f33868h) || "messages_thumbnail_right".equals(this.f33868h) || "from_see_blind_box".equals(this.f33868h);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        Frag frag = (Frag) fragmentManager().m2555h0(R.id.content);
        if (frag instanceof ProfileListFrag) {
            return ((ProfileListFrag) frag).mo30631C4();
        }
        if (frag instanceof ProfileListFragLocalEditImpl) {
            return ((ProfileListFragLocalEditImpl) frag).mo30631C4();
        }
        return frag instanceof PutongFrag ? (ArrayList) ((PutongFrag) frag).mo30631C4() : jyb.m147507f0(new pf60[0]);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m51906B2(motionEvent, false) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct, p153l.xyl
    /* JADX INFO: renamed from: f2 */
    public void mo44250f2(int i, String str) {
        this.f33858F = i;
        cmc0.m111162b(act(), str, act() instanceof EditProfileAct);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m48999H2() {
        super.m48999H2();
        if (m51950b3()) {
            overridePendingTransition(0, x7c0.f192709x);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public int getDefaultThemeResId() {
        return agc0.f71137w;
    }

    @Override // p153l.d0r
    /* JADX INFO: renamed from: h */
    public void mo43567h(int i, int i2) {
        int i3 = this.f33861I;
        if (i - i3 > 0 || i > 0) {
            this.f33862J = true;
        } else if (i - i3 < 0) {
            this.f33862J = false;
        }
        this.f33861I = i;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct, p153l.xyl
    /* JADX INFO: renamed from: i0 */
    public void mo47155i0(int i, boolean z) {
        mo44257n0(i, z, false, false);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (fragmentManager().m2555h0(R.id.content) != null) {
            this.f33881u = (PutongFrag) fragmentManager().m2555h0(R.id.content);
            return null;
        }
        PutongFrag putongFragM51932E2 = m51932E2();
        this.f33881u = putongFragM51932E2;
        if (NullChecker.m82486a(putongFragM51932E2.getArguments())) {
            this.f33881u.getArguments().putBoolean("live_flag", this.f33882v);
            this.f33881u.getArguments().putString("gift_msg_id", this.f33857E);
            this.f33881u.getArguments().putSerializable("profile_create_data", this.f33885y);
        }
        if (gra.m131637V1()) {
            String stringExtra = getIntent().getStringExtra("from_group_id");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f33881u.getArguments().putString("from_group_id", stringExtra);
            }
        }
        if ("from_meet_feed".equals(this.f33868h)) {
            LikedUser likedUser = (LikedUser) getIntent().getSerializableExtra("liked_user");
            if (NullChecker.m82486a(likedUser)) {
                this.f33881u.getArguments().putSerializable("liked_user", likedUser);
            }
        }
        if (NullChecker.m82486a(this.f33878r) && NullChecker.m82486a(this.f33881u.getArguments())) {
            this.f33881u.getArguments().putSerializable("params_extra_map_data", this.f33878r);
        }
        if (gra.m131740r1()) {
            this.f33881u.getArguments().putBoolean("long_time_no_see", this.f33854B);
        }
        fragmentManager().m2568m().m2812s(R.id.content, this.f33881u).mo2708i();
        fragmentManager().m2546e0();
        return null;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f33865e = getIntent().getStringExtra("userId");
        this.f33885y = (ProfileCreateData) getIntent().getSerializableExtra("profile_create_data");
        final int iHashCode = new Object().hashCode();
        PerformanceLogUtil.logBegin(iHashCode, ProfileLogEntity.ProfileLogName.ACT_CREATE);
        creates(new y20() { // from class: l.dn90
            @Override // p153l.y20
            public final void call(Object obj) {
                PerformanceLogUtil.logEnd(iHashCode, ProfileLogEntity.ProfileLogName.ACT_CREATE);
            }
        });
        m51933F2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(new pcj() { // from class: l.vm90
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f184680a.m51939N2();
            }
        }, false).subscribe(psd0.m173596G(new y20() { // from class: l.zm90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205051a.m51940Q2((uxj0) obj);
            }
        }));
        if (gra.m131609O1()) {
            duringCreated(CoreModule.f18264c.f20381e0.f89041H1).subscribe(psd0.m173596G(new y20() { // from class: l.an90
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f72330a.m51941R2((String) obj);
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct, p153l.xyl
    /* JADX INFO: renamed from: n0 */
    public void mo44257n0(int i, boolean z, boolean z2, boolean z3) {
        this.f33859G = z;
        this.f33858F = i;
        if (!NullChecker.m82487b(CoreModule.f18264c.f20381e0.m116600p9()) || !TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().source, "facebook")) {
            pickImagesWithPicker(1, false, true, true);
            return;
        }
        final Dialog dialogM21567z0 = dialog().m21518O(m51951n2(inflater(), null)).m21567z0();
        this.f33863c.setOnClickListener(new View.OnClickListener() { // from class: l.hn90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110712a.m51946W2(dialogM21567z0, view);
            }
        });
        this.f33864d.setOnClickListener(new View.OnClickListener() { // from class: l.wm90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189782a.m51947X2(dialogM21567z0, view);
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public View m51951n2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qn90.m177212b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needRefreshPrivilege() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (gra.m131609O1() && i == 786 && i2 == -1) {
            ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
            ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("selected_origin_images");
            if (!jyb.m147479J(arrayList) && !jyb.m147479J(arrayList2)) {
                this.f33855C.put(((Media) arrayList.get(0)).url, (Picture) arrayList2.get(0));
            }
            onPickImagesResult(arrayList);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m82486a(this.f33874n)) {
            this.f33874n.mo8715a(i, i2, intent);
        }
        if (i == 786) {
            if (i2 == 4097) {
                l51.m152887G(new Runnable() { // from class: l.bn90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f77442a.m51943T2();
                    }
                });
            } else if (i2 == 4098) {
                l51.m152887G(new Runnable() { // from class: l.cn90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f82703a.m51944U2();
                    }
                });
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Frag frag = (Frag) fragmentManager().m2555h0(R.id.content);
        if (frag instanceof ProfileListFrag) {
            ProfileListFrag profileListFrag = (ProfileListFrag) frag;
            profileListFrag.m53421ce();
            profileListFrag.m53482nd();
            return;
        }
        if (frag instanceof ProfileListFragLocalEditImpl) {
            ProfileListFragLocalEditImpl profileListFragLocalEditImpl = (ProfileListFragLocalEditImpl) frag;
            profileListFragLocalEditImpl.m53811k9();
            profileListFragLocalEditImpl.m53762K8();
            return;
        }
        if (frag instanceof ProfileListFragLocalImpl) {
            ProfileListFragLocalImpl profileListFragLocalImpl = (ProfileListFragLocalImpl) frag;
            profileListFragLocalImpl.m53855f5();
            profileListFragLocalImpl.m53851b5();
        } else if (frag instanceof ProfileListFragExpandedImpl) {
            ProfileListFragExpandedImpl profileListFragExpandedImpl = (ProfileListFragExpandedImpl) frag;
            profileListFragExpandedImpl.m53599Y4();
            profileListFragExpandedImpl.m53595U4();
        } else if (frag instanceof ProfileListExpandedEditFrag) {
            ProfileListExpandedEditFrag profileListExpandedEditFrag = (ProfileListExpandedEditFrag) frag;
            profileListExpandedEditFrag.m52244G7();
            profileListExpandedEditFrag.m52309p7();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        Picture picture = new Picture();
        picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        picture.url = oki.m168011B(str);
        picture.size = new Dimension(new sim(oki.m168038z(picture.url)).f168843d);
        picture.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        onPickImagesResult(jyb.m147507f0(picture));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.AutoReleaseVideoAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        gp5.m131229c();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (this.f33858F == -1 || !NullChecker.m82486a(m51949a3()) || list.size() <= 0) {
            return;
        }
        m51949a3().mo52308p3(this.f33858F, list.get(0));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("imageId", this.f33858F);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.f33869i = getIntent().getBooleanExtra("showButtons", false);
        this.f33884x = getIntent().getIntExtra("pic_index", -1);
        this.f33870j = getIntent().getBooleanExtra("canShowFollowButton", false);
        this.f33877q = getIntent().getBooleanExtra("no_showbuttons_infofromlocal", true);
        this.f33866f = getIntent().getBooleanExtra(SchemeKey.edit, false);
        this.f33867g = getIntent().getStringExtra("input_type");
        this.f33868h = getIntent().getStringExtra("from");
        this.f33873m = getIntent().getIntExtra("button_flag", 273);
        this.f33875o = getIntent().getBooleanExtra("with_superlike", false);
        this.f33879s = getIntent().getIntExtra("pushReason", 0);
        this.f33880t = getIntent().getStringExtra("pushTag");
        this.f33872l = RelationshipStatus.get(getIntent().getStringExtra("relationship_status"));
        this.f33876p = getIntent().getBooleanExtra("from_gp_live", false);
        this.f33882v = CoreModule.m30934Q().mo68407Ii(getIntent());
        this.f33883w = getIntent().getStringExtra("live_room_info");
        this.f33854B = getIntent().getBooleanExtra("long_time_no_see", false);
        Serializable serializableExtra = getIntent().getSerializableExtra("params_extra_map_data");
        if (serializableExtra instanceof HashMap) {
            HashMap<String, String> map = (HashMap) serializableExtra;
            this.f33878r = map;
            this.f33857E = map.get("gift_msg_id");
        }
        Serializable serializableExtra2 = getIntent().getSerializableExtra("city_centre_data");
        if (NullChecker.m82486a(serializableExtra2)) {
            this.f33853A = (CityCData) serializableExtra2;
        }
        if (this.f33866f) {
            setSwipeBackEnable(false);
        }
        if (NullChecker.m82486a(bundle)) {
            this.f33858F = bundle.getInt("imageId");
        }
        if (this.f33869i) {
            setStatusBarColor(act().color(c9c0.f80365P1));
        }
        this.f33871k = getIntent().getBooleanExtra("open_media_picker", false);
        this.f33886z = (CoreMomentModel) getIntent().getSerializableExtra("core_moment");
        super.preCreateView(bundle);
        if ("home_card".equals(this.f33868h) || "home_moment_theme_card".equals(this.f33868h)) {
            this.f33856D = "swipe";
        } else if ("conversation_view".equals(this.f33868h)) {
            this.f33856D = "conversationlist";
        } else if ("messages_thumbnail_right".equals(this.f33868h) || "messages_thumbnail_left".equals(this.f33868h) || "messages_title".equals(this.f33868h) || CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG.equals(this.f33868h) || "messages_friend_comment_toast".equals(this.f33868h) || "profile_bubble".equals(this.f33868h)) {
            this.f33856D = "conversation";
        } else if ("moments_in_profile".equals(this.f33868h)) {
            this.f33856D = "personal_album";
        } else if ("likers".equals(this.f33868h)) {
            this.f33856D = "see";
        } else if ("push_scheme".equals(this.f33868h)) {
            this.f33856D = "push_scheme";
        } else if ("places".equals(this.f33868h)) {
            this.f33856D = "places";
        }
        m51934H2(this.f33865e);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        if (TextUtils.equals(this.f33868h, "my_tab_profile_like")) {
            setLightStatusBar(1024);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            getWindow().setStatusBarColor(0);
            setStatusBarColor(0);
            if (NullChecker.m82486a(getSupportActionBar())) {
                getSupportActionBar().mo102168A(0.0f);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return TextUtils.equals(this.f33868h, "my_tab_profile_like");
    }
}

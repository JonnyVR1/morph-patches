package p153l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.IdealInfo;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zq90 implements fr90 {

    /* JADX INFO: renamed from: a */
    public User f205576a;

    /* JADX INFO: renamed from: b */
    public String f205577b;

    /* JADX INFO: renamed from: c */
    public String f205578c;

    /* JADX INFO: renamed from: d */
    public String f205579d;

    /* JADX INFO: renamed from: e */
    public C21863a f205580e;

    /* JADX INFO: renamed from: f */
    public BubbleInfo f205581f;

    /* JADX INFO: renamed from: g */
    public Context f205582g;

    /* JADX INFO: renamed from: h */
    public final PutongFrag f205583h;

    /* JADX INFO: renamed from: i */
    public final hp90 f205584i;

    /* JADX INFO: renamed from: j */
    public IdealInfo f205585j;

    /* JADX INFO: renamed from: k */
    public boolean f205586k;

    /* JADX INFO: renamed from: l */
    public boolean f205587l;

    /* JADX INFO: renamed from: m */
    public boolean f205588m;

    /* JADX INFO: renamed from: n */
    public boolean f205589n;

    /* JADX INFO: renamed from: o */
    public List<Relationship> f205590o;

    /* JADX INFO: renamed from: l.zq90$a */
    public static class C21863a {

        /* JADX INFO: renamed from: a */
        public final zq90 f205591a;

        /* JADX INFO: renamed from: b */
        public String f205592b;

        /* JADX INFO: renamed from: c */
        public String f205593c;

        /* JADX INFO: renamed from: f */
        public boolean f205596f;

        /* JADX INFO: renamed from: o */
        public LikedUser f205605o;

        /* JADX INFO: renamed from: d */
        public int f205594d = 0;

        /* JADX INFO: renamed from: e */
        public String f205595e = "";

        /* JADX INFO: renamed from: g */
        public boolean f205597g = false;

        /* JADX INFO: renamed from: h */
        public String f205598h = "";

        /* JADX INFO: renamed from: i */
        public boolean f205599i = false;

        /* JADX INFO: renamed from: j */
        public boolean f205600j = false;

        /* JADX INFO: renamed from: k */
        public User f205601k = null;

        /* JADX INFO: renamed from: l */
        public int f205602l = -1;

        /* JADX INFO: renamed from: m */
        public RelationshipStatus f205603m = RelationshipStatus.get("unknown_");

        /* JADX INFO: renamed from: n */
        public boolean f205604n = false;

        public C21863a(zq90 zq90Var) {
            this.f205591a = zq90Var;
        }

        /* JADX INFO: renamed from: a */
        public void m220999a(Bundle bundle) {
            tu2.m192703a("[core][profile]", "init arguments : " + bundle.toString());
            this.f205593c = bundle.getString("user_id");
            String string = bundle.getString("from");
            this.f205592b = string;
            zq90 zq90Var = this.f205591a;
            zq90Var.f205579d = this.f205593c;
            zq90Var.f205577b = string;
            zq90Var.f205578c = bundle.getString("live_room_info");
            boolean zEquals = TextUtils.equals(this.f205592b, "preview_card");
            zq90 zq90Var2 = this.f205591a;
            if (zEquals) {
                zq90Var2.m220971X((User) bundle.getSerializable("preview_user_info"));
            } else {
                zq90Var2.m220971X(CoreModule.m30930K().getUserById(this.f205593c));
            }
            this.f205596f = bundle.getBoolean("show_buttons");
            this.f205594d = bundle.getInt("pushReason");
            this.f205595e = bundle.getString("pushTag");
            this.f205604n = bundle.getBoolean("long_time_no_see");
            this.f205602l = bundle.getInt("pic_index", -1);
            this.f205603m = RelationshipStatus.get(bundle.getString("relationship_status"));
            this.f205597g = !"live_profile_voice_mask_mode".equals(this.f205592b);
            this.f205598h = bundle.getString("profile_like_id");
            this.f205599i = bundle.getBoolean("canShowFollowButton");
            this.f205600j = bundle.getBoolean("from_gp_live");
            if (TextUtils.equals(this.f205592b, "preview_card")) {
                this.f205601k = (User) bundle.getSerializable("preview_user_info");
            }
            if (this.f205591a.m220949B() || this.f205591a.m220990r() || this.f205591a.m220994v() || this.f205591a.m220995w()) {
                if (NullChecker.m82486a(CoreModule.f18264c.f20367Z0.m210760C3(this.f205593c))) {
                    LikedUser likedUserM210760C3 = CoreModule.f18264c.f20367Z0.m210760C3(this.f205593c);
                    this.f205605o = likedUserM210760C3;
                    bundle.putSerializable("liked_user", likedUserM210760C3);
                } else if (NullChecker.m82486a(bundle.getSerializable("liked_user"))) {
                    this.f205605o = (LikedUser) bundle.getSerializable("liked_user");
                }
            }
            m221000b(bundle);
        }

        /* JADX INFO: renamed from: b */
        public final void m221000b(Bundle bundle) {
            User userById;
            if (NullChecker.m82486a(CoreModule.m30930K().getUserById(this.f205593c))) {
                userById = CoreModule.m30930K().getUserById(this.f205593c);
                bundle.putSerializable("saved_user", userById);
            } else {
                userById = NullChecker.m82486a(bundle.getSerializable("saved_user")) ? (User) bundle.getSerializable("saved_user") : null;
            }
            CoreBusinessModule.f18256g.m191629b().f169297c = userById;
            CoreBusinessModule.f18256g.m191629b().f169298d = userById;
            CoreBusinessModule.f18256g.m191629b().f169299e = userById;
            if (this.f205591a.m220987o()) {
                CoreBusinessModule.f18256g.m191629b().f169296b = this.f205593c;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m221001c() {
            this.f205592b = "";
            this.f205593c = "";
            this.f205594d = 0;
            this.f205595e = "";
            this.f205596f = false;
            this.f205597g = false;
            this.f205601k = null;
            this.f205602l = -1;
            this.f205603m = RelationshipStatus.get("unknown_");
            this.f205604n = false;
            this.f205605o = null;
        }
    }

    public zq90(PutongFrag putongFrag, hp90 hp90Var) {
        this.f205586k = false;
        this.f205587l = false;
        this.f205588m = false;
        this.f205589n = false;
        this.f205583h = putongFrag;
        this.f205582g = putongFrag.getContext();
        this.f205584i = hp90Var;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m220947l(String str) {
        return CoreModule.m30932N().mo61492Qm(str);
    }

    /* JADX INFO: renamed from: A */
    public boolean m220948A() {
        return TextUtils.equals(this.f205577b, "from_new_meet_see_feed");
    }

    /* JADX INFO: renamed from: B */
    public boolean m220949B() {
        return TextUtils.equals(this.f205577b, "from_picks");
    }

    /* JADX INFO: renamed from: C */
    public boolean m220950C() {
        return TextUtils.equals(this.f205577b, "p_received_profile_like");
    }

    /* JADX INFO: renamed from: D */
    public boolean m220951D() {
        return TextUtils.equals(this.f205577b, "p_picks_profile") || TextUtils.equals(this.f205577b, "p_picks_profile_card");
    }

    /* JADX INFO: renamed from: E */
    public boolean m220952E() {
        return TextUtils.equals(this.f205577b, "push_like");
    }

    /* JADX INFO: renamed from: F */
    public boolean m220953F() {
        return "home_moment_theme_card".equals(this.f205577b);
    }

    /* JADX INFO: renamed from: G */
    public boolean m220954G() {
        return TextUtils.equals(this.f205577b, "intl_top_picks");
    }

    /* JADX INFO: renamed from: H */
    public boolean m220955H() {
        return tnt.m191964a(this.f205577b);
    }

    /* JADX INFO: renamed from: I */
    public boolean m220956I() {
        return m220987o() || m220953F() || m220991s() || m220997y() || m220990r() || m220949B() || m220986n() || m220980g() || m220952E() || m220968U() || m220989q() || m220954G() || m220951D();
    }

    /* JADX INFO: renamed from: J */
    public boolean m220957J() {
        User user;
        if (this.f205579d != null && (user = this.f205576a) != null && !user.isMe() && !this.f205576a.isTeamAccount()) {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f205579d);
            if ((NullChecker.m82486a(conversationM33859Xe) && !TEnum.equals(conversationM33859Xe.status, "dismissed")) || User.isMatched(this.f205576a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public boolean m220958K() {
        return TextUtils.equals(this.f205579d, CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: L */
    public boolean m220959L() {
        return TextUtils.equals(this.f205577b, "preview_card");
    }

    /* JADX INFO: renamed from: M */
    public boolean m220960M() {
        User userM220973Z = m220973Z();
        return NullChecker.m82486a(userM220973Z.localRelationship) && !jyb.m147479J(userM220973Z.localRelationship.status) && userM220973Z.localRelationship.status.contains(MatchFrom.get("letter"));
    }

    /* JADX INFO: renamed from: N */
    public boolean m220961N() {
        User userM220973Z = m220973Z();
        if (m220990r()) {
            return false;
        }
        if ((m220949B() || m220994v() || m220995w()) && userM220973Z.localRelationship == null && NullChecker.m82486a(this.f205580e.f205605o)) {
            return (TEnum.equals(this.f205580e.f205605o.status, "liked") || TEnum.equals(this.f205580e.f205605o.status, "superliked")) ? false : true;
        }
        Relationship relationship = userM220973Z.localRelationship;
        return relationship == null || TEnum.equals(relationship.state, "unknown_") || TEnum.equals(userM220973Z.localRelationship.state, "default") || (TEnum.equals(userM220973Z.localRelationship.state, "liked") && NullChecker.m82486a(userM220973Z.localRelationship.relationshipExtensions) && TEnum.equals(userM220973Z.localRelationship.relationshipExtensions.relationType, RelationshipStatus.DEFAULT)) || TEnum.equals(userM220973Z.localRelationship.state, RelationshipStatus.disliked);
    }

    /* JADX INFO: renamed from: O */
    public boolean m220962O() {
        User userM220973Z = m220973Z();
        return NullChecker.m82486a(userM220973Z.localRelationship) && TEnum.equals(userM220973Z.localRelationship.state, "blocked");
    }

    /* JADX INFO: renamed from: P */
    public boolean m220963P() {
        User user;
        if (TextUtils.isEmpty(this.f205579d) || (user = this.f205576a) == null || user.isMe()) {
            return false;
        }
        return CoreModule.m30932N().mo61458Ek(m220973Z());
    }

    /* JADX INFO: renamed from: Q */
    public boolean m220964Q() {
        return false;
    }

    /* JADX INFO: renamed from: R */
    public boolean m220965R() {
        if (!NullChecker.m82486a(this.f205576a) || this.f205576a.isMe() || User.isMatched(this.f205576a)) {
            return false;
        }
        return (!CoreModule.m30930K().mo31822sg(this.f205576a.f56859id) || this.f205580e.f205596f) && m220969V(this.f205577b);
    }

    /* JADX INFO: renamed from: S */
    public boolean m220966S() {
        User userM220973Z = m220973Z();
        if (((!m220990r() && !m220949B() && !m220994v() && !m220995w()) || !NullChecker.m82486a(this.f205580e.f205605o) || (!TEnum.equals(this.f205580e.f205605o.status, "superliked") && !TEnum.equals(this.f205580e.f205605o.status, "lettered"))) && !this.f205587l && !this.f205588m) {
            if (!NullChecker.m82486a(userM220973Z.localRelationship)) {
                return false;
            }
            if ((jyb.m147479J(userM220973Z.localRelationship.status) || !userM220973Z.localRelationship.status.contains(MatchFrom.get(MatchFrom.superLiked))) && (!NullChecker.m82486a(userM220973Z.localRelationship.relationshipExtensions) || !TEnum.equals(userM220973Z.localRelationship.relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: T */
    public boolean m220967T() {
        return br5.m106044o(m220975b(), this.f205576a);
    }

    /* JADX INFO: renamed from: U */
    public boolean m220968U() {
        return "from_intl_visitor".equals(this.f205577b) || "from_intl_salvage".equals(this.f205577b);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m220969V(String str) {
        if (!d79.m114663V() || TextUtils.equals("likers", str) || TextUtils.equals("from_mew_tags", str) || TextUtils.equals("from_portrait_like_list", str) || TextUtils.equals("from_literature_third", str) || CoreModule.f18264c.f20405m0.m32023L6(this.f205579d) || CoreModule.f18264c.f20405m0.m32027M6(this.f205579d) || TextUtils.equals("from_boost_refactor", str) || TextUtils.equals("live_user_card", str) || m220992t() || m220989q()) {
            return false;
        }
        return !IntlCountryCodeController.m29118o() || nmp.m163836e();
    }

    /* JADX INFO: renamed from: W */
    public String m220970W() {
        if ("my_tab_profile_like".equals(this.f205577b)) {
            return "p_my_profile_comment";
        }
        if ("from_guess_liker_result".equals(this.f205577b)) {
            return "p_guess_who_likes_me_profile";
        }
        if ("from_christmas".equals(this.f205577b)) {
            return "p_christmas_profile";
        }
        return (TextUtils.isEmpty(this.f205579d) || !m220964Q()) ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_unmatch_profile";
    }

    /* JADX INFO: renamed from: X */
    public void m220971X(User user) {
        if (!NullChecker.m82486a(user) || !user.isMe()) {
            this.f205576a = user;
            return;
        }
        this.f205576a = user.riskAuditUser(CoreModule.m30930K().getUserById("fake_risk_audit_default_" + this.f205579d));
    }

    /* JADX INFO: renamed from: Y */
    public boolean m220972Y() {
        if (TextUtils.equals(this.f205577b, "impress_signal") || TextUtils.equals(this.f205577b, "from_pin_like") || TextUtils.equals(this.f205577b, "live_user_card") || m220992t() || m220993u()) {
            return true;
        }
        if (s75.m184965m() && TextUtils.equals("from_city_center_boost_cover", this.f205577b)) {
            return true;
        }
        return (m220996x() && !m220967T()) || m220978e() || m220958K();
    }

    /* JADX INFO: renamed from: Z */
    public User m220973Z() {
        Relationship relationship;
        return (m220984k() || m220985m() || (relationship = this.f205576a.localRelationship) == null || TEnum.equals(relationship.state, "unknown_")) ? CoreModule.m30932N().getUserById(this.f205579d) : this.f205576a;
    }

    /* JADX INFO: renamed from: a */
    public Act m220974a() {
        PutongFrag putongFrag = this.f205583h;
        return putongFrag == null ? (Act) this.f205582g : putongFrag.act();
    }

    /* JADX INFO: renamed from: b */
    public Conversation m220975b() {
        return CoreModule.f18264c.f20384f0.m33859Xe(this.f205579d);
    }

    /* JADX INFO: renamed from: c */
    public PutongFrag m220976c() {
        Context context = this.f205582g;
        if (((context instanceof ProfileAct) || (context instanceof NewUI1ContainerActivity)) && this.f205583h == null) {
            qu2.m178128w(new IllegalStateException("Profile Frag is Null"));
        }
        return this.f205583h;
    }

    /* JADX INFO: renamed from: d */
    public void m220977d(Bundle bundle) {
        C21863a c21863a = new C21863a(this);
        this.f205580e = c21863a;
        try {
            c21863a.m220999a(bundle);
        } catch (Exception unused) {
            this.f205580e.m221001c();
            this.f205576a = User.new_();
            w20.m204487b(m220974a());
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m220978e() {
        User user = this.f205576a;
        if (user == null || TextUtils.equals(user.f56859id, CoreModule.m30929H().userId())) {
            return false;
        }
        return this.f205576a.isBannedNew() || this.f205576a.isAccountCancellation();
    }

    /* JADX INFO: renamed from: f */
    public boolean m220979f() {
        User user;
        if (TextUtils.isEmpty(this.f205579d) || (user = this.f205576a) == null || user.isMe()) {
            return false;
        }
        return CoreModule.m30932N().mo61555mn(m220973Z());
    }

    /* JADX INFO: renamed from: g */
    public boolean m220980g() {
        return TextUtils.equals(this.f205577b, "from_boost_refactor");
    }

    /* JADX INFO: renamed from: h */
    public boolean m220981h() {
        return TextUtils.equals("from_city_center_conv_banner", this.f205577b);
    }

    /* JADX INFO: renamed from: i */
    public boolean m220982i() {
        return TextUtils.equals(this.f205577b, "from_conversation_search_view");
    }

    /* JADX INFO: renamed from: j */
    public boolean m220983j() {
        return TextUtils.equals(this.f205577b, "p_lifestyle_tag");
    }

    /* JADX INFO: renamed from: k */
    public boolean m220984k() {
        return m220947l(this.f205577b);
    }

    /* JADX INFO: renamed from: m */
    public boolean m220985m() {
        return TextUtils.equals(this.f205577b, "p_game_cp");
    }

    /* JADX INFO: renamed from: n */
    public boolean m220986n() {
        return TextUtils.equals(this.f205577b, "from_find_partner");
    }

    /* JADX INFO: renamed from: o */
    public boolean m220987o() {
        return "home_card".equals(this.f205577b);
    }

    /* JADX INFO: renamed from: p */
    public boolean m220988p() {
        return TextUtils.equals(this.f205577b, "from_intl_meet");
    }

    /* JADX INFO: renamed from: q */
    public boolean m220989q() {
        return TextUtils.equals(this.f205577b, "from_intl_meet_likers");
    }

    /* JADX INFO: renamed from: r */
    public boolean m220990r() {
        return "liked_users".equals(this.f205577b);
    }

    /* JADX INFO: renamed from: s */
    public boolean m220991s() {
        return TextUtils.equals("likers", this.f205577b);
    }

    /* JADX INFO: renamed from: t */
    public boolean m220992t() {
        return tnt.m191965b(this.f205577b);
    }

    /* JADX INFO: renamed from: u */
    public boolean m220993u() {
        return TextUtils.equals(this.f205577b, "home_card") && this.f205580e.f205604n;
    }

    /* JADX INFO: renamed from: v */
    public boolean m220994v() {
        if (TextUtils.equals(this.f205577b, "from_meet_feed")) {
            return true;
        }
        return CoreModule.m30932N().mo61451Co() && m220995w();
    }

    /* JADX INFO: renamed from: w */
    public boolean m220995w() {
        return TextUtils.equals(this.f205577b, "from_meet_picks_feed") || TextUtils.equals(this.f205577b, "from_meet_picks_card");
    }

    /* JADX INFO: renamed from: x */
    public boolean m220996x() {
        return TextUtils.equals(this.f205577b, "from_recommend_like") || TextUtils.equals(this.f205577b, "conversation_view") || TextUtils.equals(this.f205577b, "messages_title") || TextUtils.equals(this.f205577b, CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG) || TextUtils.equals(this.f205577b, "messages_cover") || TextUtils.equals(this.f205577b, "messages_friend_comment_toast") || TextUtils.equals(this.f205577b, "profile_bubble") || TextUtils.equals(this.f205577b, "messages_thumbnail_left") || TextUtils.equals(this.f205577b, "p_game_cp_msg");
    }

    /* JADX INFO: renamed from: y */
    public boolean m220997y() {
        return TextUtils.equals(this.f205577b, "from_new_meet_likers");
    }

    /* JADX INFO: renamed from: z */
    public boolean m220998z() {
        return TextUtils.equals(this.f205577b, "from_new_meet_picks_feed");
    }

    public zq90(Context context, hp90 hp90Var) {
        this.f205586k = false;
        this.f205587l = false;
        this.f205588m = false;
        this.f205589n = false;
        this.f205583h = null;
        this.f205582g = context;
        this.f205584i = hp90Var;
    }
}

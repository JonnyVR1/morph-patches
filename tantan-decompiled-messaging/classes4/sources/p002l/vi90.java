package p002l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.IdealInfo;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.au2;
import l.c30;
import l.du2;
import l.nkp;
import l.r65;
import l.rlt;
import l.u59;
import l.vwb;
import l.xp5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vi90 implements bj90 {

    /* JADX INFO: renamed from: a */
    public User f21137a;

    /* JADX INFO: renamed from: b */
    public String f21138b;

    /* JADX INFO: renamed from: c */
    public String f21139c;

    /* JADX INFO: renamed from: d */
    public String f21140d;

    /* JADX INFO: renamed from: e */
    public C0862a f21141e;

    /* JADX INFO: renamed from: f */
    public BubbleInfo f21142f;

    /* JADX INFO: renamed from: g */
    public Context f21143g;

    /* JADX INFO: renamed from: h */
    public final PutongFrag f21144h;

    /* JADX INFO: renamed from: i */
    public final dh90 f21145i;

    /* JADX INFO: renamed from: j */
    public IdealInfo f21146j;

    /* JADX INFO: renamed from: k */
    public boolean f21147k;

    /* JADX INFO: renamed from: l */
    public boolean f21148l;

    /* JADX INFO: renamed from: m */
    public boolean f21149m;

    /* JADX INFO: renamed from: n */
    public boolean f21150n;

    /* JADX INFO: renamed from: o */
    public List<Relationship> f21151o;

    /* JADX INFO: renamed from: l.vi90$a */
    public static class C0862a {

        /* JADX INFO: renamed from: a */
        public final vi90 f21152a;

        /* JADX INFO: renamed from: b */
        public String f21153b;

        /* JADX INFO: renamed from: c */
        public String f21154c;

        /* JADX INFO: renamed from: f */
        public boolean f21157f;

        /* JADX INFO: renamed from: o */
        public LikedUser f21166o;

        /* JADX INFO: renamed from: d */
        public int f21155d = 0;

        /* JADX INFO: renamed from: e */
        public String f21156e = "";

        /* JADX INFO: renamed from: g */
        public boolean f21158g = false;

        /* JADX INFO: renamed from: h */
        public String f21159h = "";

        /* JADX INFO: renamed from: i */
        public boolean f21160i = false;

        /* JADX INFO: renamed from: j */
        public boolean f21161j = false;

        /* JADX INFO: renamed from: k */
        public User f21162k = null;

        /* JADX INFO: renamed from: l */
        public int f21163l = -1;

        /* JADX INFO: renamed from: m */
        public RelationshipStatus f21164m = RelationshipStatus.get("unknown_");

        /* JADX INFO: renamed from: n */
        public boolean f21165n = false;

        public C0862a(vi90 vi90Var) {
            this.f21152a = vi90Var;
        }

        /* JADX INFO: renamed from: a */
        public void m24004a(Bundle bundle) {
            du2.a("[core][profile]", "init arguments : " + bundle.toString());
            this.f21154c = bundle.getString(SysnotifListener.KEY_USER_ID);
            String string = bundle.getString("from");
            this.f21153b = string;
            vi90 vi90Var = this.f21152a;
            vi90Var.f21140d = this.f21154c;
            vi90Var.f21138b = string;
            vi90Var.f21139c = bundle.getString("live_room_info");
            boolean zEquals = TextUtils.equals(this.f21153b, "preview_card");
            vi90 vi90Var2 = this.f21152a;
            if (zEquals) {
                vi90Var2.m23976X((User) bundle.getSerializable("preview_user_info"));
            } else {
                vi90Var2.m23976X(CoreModule.K().getUserById(this.f21154c));
            }
            this.f21157f = bundle.getBoolean("show_buttons");
            this.f21155d = bundle.getInt("pushReason");
            this.f21156e = bundle.getString("pushTag");
            this.f21165n = bundle.getBoolean("long_time_no_see");
            this.f21163l = bundle.getInt("pic_index", -1);
            this.f21164m = RelationshipStatus.get(bundle.getString("relationship_status"));
            this.f21158g = !"live_profile_voice_mask_mode".equals(this.f21153b);
            this.f21159h = bundle.getString("profile_like_id");
            this.f21160i = bundle.getBoolean("canShowFollowButton");
            this.f21161j = bundle.getBoolean("from_gp_live");
            if (TextUtils.equals(this.f21153b, "preview_card")) {
                this.f21162k = bundle.getSerializable("preview_user_info");
            }
            if (this.f21152a.m23954B() || this.f21152a.m23995r() || this.f21152a.m23999v() || this.f21152a.m24000w()) {
                if (NullChecker.a(CoreModule.c.Z0.C3(this.f21154c))) {
                    LikedUser likedUserC3 = CoreModule.c.Z0.C3(this.f21154c);
                    this.f21166o = likedUserC3;
                    bundle.putSerializable("liked_user", likedUserC3);
                } else if (NullChecker.a(bundle.getSerializable("liked_user"))) {
                    this.f21166o = bundle.getSerializable("liked_user");
                }
            }
            m24005b(bundle);
        }

        /* JADX INFO: renamed from: b */
        public final void m24005b(Bundle bundle) {
            User userById;
            if (NullChecker.a(CoreModule.K().getUserById(this.f21154c))) {
                userById = CoreModule.K().getUserById(this.f21154c);
                bundle.putSerializable("saved_user", userById);
            } else {
                userById = NullChecker.a(bundle.getSerializable("saved_user")) ? (User) bundle.getSerializable("saved_user") : null;
            }
            CoreBusinessModule.g.b().c = userById;
            CoreBusinessModule.g.b().d = userById;
            CoreBusinessModule.g.b().e = userById;
            if (this.f21152a.m23992o()) {
                CoreBusinessModule.g.b().b = this.f21154c;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m24006c() {
            this.f21153b = "";
            this.f21154c = "";
            this.f21155d = 0;
            this.f21156e = "";
            this.f21157f = false;
            this.f21158g = false;
            this.f21162k = null;
            this.f21163l = -1;
            this.f21164m = RelationshipStatus.get("unknown_");
            this.f21165n = false;
            this.f21166o = null;
        }
    }

    public vi90(PutongFrag putongFrag, dh90 dh90Var) {
        this.f21147k = false;
        this.f21148l = false;
        this.f21149m = false;
        this.f21150n = false;
        this.f21144h = putongFrag;
        this.f21143g = putongFrag.getContext();
        this.f21145i = dh90Var;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m23952l(String str) {
        return CoreModule.N().Qm(str);
    }

    /* JADX INFO: renamed from: A */
    public boolean m23953A() {
        return TextUtils.equals(this.f21138b, "from_new_meet_see_feed");
    }

    /* JADX INFO: renamed from: B */
    public boolean m23954B() {
        return TextUtils.equals(this.f21138b, "from_picks");
    }

    /* JADX INFO: renamed from: C */
    public boolean m23955C() {
        return TextUtils.equals(this.f21138b, "p_received_profile_like");
    }

    /* JADX INFO: renamed from: D */
    public boolean m23956D() {
        return TextUtils.equals(this.f21138b, "p_picks_profile") || TextUtils.equals(this.f21138b, "p_picks_profile_card");
    }

    /* JADX INFO: renamed from: E */
    public boolean m23957E() {
        return TextUtils.equals(this.f21138b, "push_like");
    }

    /* JADX INFO: renamed from: F */
    public boolean m23958F() {
        return "home_moment_theme_card".equals(this.f21138b);
    }

    /* JADX INFO: renamed from: G */
    public boolean m23959G() {
        return TextUtils.equals(this.f21138b, "intl_top_picks");
    }

    /* JADX INFO: renamed from: H */
    public boolean m23960H() {
        return rlt.a(this.f21138b);
    }

    /* JADX INFO: renamed from: I */
    public boolean m23961I() {
        return m23992o() || m23958F() || m23996s() || m24002y() || m23995r() || m23954B() || m23991n() || m23985g() || m23957E() || m23973U() || m23994q() || m23959G() || m23956D();
    }

    /* JADX INFO: renamed from: J */
    public boolean m23962J() {
        User user;
        if (this.f21140d != null && (user = this.f21137a) != null && !user.isMe() && !this.f21137a.isTeamAccount()) {
            Conversation conversationXe = CoreModule.c.f0.Xe(this.f21140d);
            if ((NullChecker.a(conversationXe) && !TEnum.equals(conversationXe.status, "dismissed")) || User.isMatched(this.f21137a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public boolean m23963K() {
        return TextUtils.equals(this.f21140d, CoreModule.H().userId());
    }

    /* JADX INFO: renamed from: L */
    public boolean m23964L() {
        return TextUtils.equals(this.f21138b, "preview_card");
    }

    /* JADX INFO: renamed from: M */
    public boolean m23965M() {
        User userM23978Z = m23978Z();
        return NullChecker.a(userM23978Z.localRelationship) && !vwb.J(userM23978Z.localRelationship.status) && userM23978Z.localRelationship.status.contains(MatchFrom.get("letter"));
    }

    /* JADX INFO: renamed from: N */
    public boolean m23966N() {
        User userM23978Z = m23978Z();
        if (m23995r()) {
            return false;
        }
        if ((m23954B() || m23999v() || m24000w()) && userM23978Z.localRelationship == null && NullChecker.a(this.f21141e.f21166o)) {
            return (TEnum.equals(this.f21141e.f21166o.status, "liked") || TEnum.equals(this.f21141e.f21166o.status, "superliked")) ? false : true;
        }
        Relationship relationship = userM23978Z.localRelationship;
        return relationship == null || TEnum.equals(relationship.state, "unknown_") || TEnum.equals(userM23978Z.localRelationship.state, "default") || (TEnum.equals(userM23978Z.localRelationship.state, "liked") && NullChecker.a(userM23978Z.localRelationship.relationshipExtensions) && TEnum.equals(userM23978Z.localRelationship.relationshipExtensions.relationType, "DEFAULT")) || TEnum.equals(userM23978Z.localRelationship.state, "disliked");
    }

    /* JADX INFO: renamed from: O */
    public boolean m23967O() {
        User userM23978Z = m23978Z();
        return NullChecker.a(userM23978Z.localRelationship) && TEnum.equals(userM23978Z.localRelationship.state, "blocked");
    }

    /* JADX INFO: renamed from: P */
    public boolean m23968P() {
        User user;
        if (TextUtils.isEmpty(this.f21140d) || (user = this.f21137a) == null || user.isMe()) {
            return false;
        }
        return CoreModule.N().Ek(m23978Z());
    }

    /* JADX INFO: renamed from: Q */
    public boolean m23969Q() {
        return false;
    }

    /* JADX INFO: renamed from: R */
    public boolean m23970R() {
        if (!NullChecker.a(this.f21137a) || this.f21137a.isMe() || User.isMatched(this.f21137a)) {
            return false;
        }
        return (!CoreModule.K().sg(((DbObject) this.f21137a).id) || this.f21141e.f21157f) && m23974V(this.f21138b);
    }

    /* JADX INFO: renamed from: S */
    public boolean m23971S() {
        User userM23978Z = m23978Z();
        if (((!m23995r() && !m23954B() && !m23999v() && !m24000w()) || !NullChecker.a(this.f21141e.f21166o) || (!TEnum.equals(this.f21141e.f21166o.status, "superliked") && !TEnum.equals(this.f21141e.f21166o.status, "lettered"))) && !this.f21148l && !this.f21149m) {
            if (!NullChecker.a(userM23978Z.localRelationship)) {
                return false;
            }
            if ((vwb.J(userM23978Z.localRelationship.status) || !userM23978Z.localRelationship.status.contains(MatchFrom.get("superLiked"))) && (!NullChecker.a(userM23978Z.localRelationship.relationshipExtensions) || !TEnum.equals(userM23978Z.localRelationship.relationshipExtensions.relationType, "SUPERLIKED"))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: T */
    public boolean m23972T() {
        return xp5.o(m23980b(), this.f21137a);
    }

    /* JADX INFO: renamed from: U */
    public boolean m23973U() {
        return "from_intl_visitor".equals(this.f21138b) || "from_intl_salvage".equals(this.f21138b);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m23974V(String str) {
        if (!u59.U() || TextUtils.equals("likers", str) || TextUtils.equals("from_mew_tags", str) || TextUtils.equals("from_portrait_like_list", str) || TextUtils.equals("from_literature_third", str) || CoreModule.c.m0.L6(this.f21140d) || CoreModule.c.m0.M6(this.f21140d) || TextUtils.equals("from_boost_refactor", str) || TextUtils.equals("live_user_card", str) || m23997t() || m23994q()) {
            return false;
        }
        return !IntlCountryCodeController.o() || nkp.e();
    }

    /* JADX INFO: renamed from: W */
    public String m23975W() {
        if ("my_tab_profile_like".equals(this.f21138b)) {
            return "p_my_profile_comment";
        }
        if ("from_guess_liker_result".equals(this.f21138b)) {
            return "p_guess_who_likes_me_profile";
        }
        if ("from_christmas".equals(this.f21138b)) {
            return "p_christmas_profile";
        }
        return (TextUtils.isEmpty(this.f21140d) || !m23969Q()) ? "p_suggest_user_profile_info_view" : "p_unmatch_profile";
    }

    /* JADX INFO: renamed from: X */
    public void m23976X(User user) {
        if (!NullChecker.a(user) || !user.isMe()) {
            this.f21137a = user;
            return;
        }
        this.f21137a = user.riskAuditUser(CoreModule.K().getUserById("fake_risk_audit_default_" + this.f21140d));
    }

    /* JADX INFO: renamed from: Y */
    public boolean m23977Y() {
        if (TextUtils.equals(this.f21138b, "impress_signal") || TextUtils.equals(this.f21138b, "from_pin_like") || TextUtils.equals(this.f21138b, "live_user_card") || m23997t() || m23998u()) {
            return true;
        }
        if (r65.m() && TextUtils.equals("from_city_center_boost_cover", this.f21138b)) {
            return true;
        }
        return (m24001x() && !m23972T()) || m23983e() || m23963K();
    }

    /* JADX INFO: renamed from: Z */
    public User m23978Z() {
        Relationship relationship;
        return (m23989k() || m23990m() || (relationship = this.f21137a.localRelationship) == null || TEnum.equals(relationship.state, "unknown_")) ? CoreModule.N().getUserById(this.f21140d) : this.f21137a;
    }

    /* JADX INFO: renamed from: a */
    public Act m23979a() {
        PutongFrag putongFrag = this.f21144h;
        return putongFrag == null ? this.f21143g : putongFrag.act();
    }

    /* JADX INFO: renamed from: b */
    public Conversation m23980b() {
        return CoreModule.c.f0.Xe(this.f21140d);
    }

    /* JADX INFO: renamed from: c */
    public PutongFrag m23981c() {
        Context context = this.f21143g;
        if (((context instanceof ProfileAct) || (context instanceof NewUI1ContainerActivity)) && this.f21144h == null) {
            au2.w(new IllegalStateException("Profile Frag is Null"));
        }
        return this.f21144h;
    }

    /* JADX INFO: renamed from: d */
    public void m23982d(Bundle bundle) {
        C0862a c0862a = new C0862a(this);
        this.f21141e = c0862a;
        try {
            c0862a.m24004a(bundle);
        } catch (Exception unused) {
            this.f21141e.m24006c();
            this.f21137a = User.new_();
            c30.b(m23979a());
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m23983e() {
        User user = this.f21137a;
        if (user == null || TextUtils.equals(((DbObject) user).id, CoreModule.H().userId())) {
            return false;
        }
        return this.f21137a.isBannedNew() || this.f21137a.isAccountCancellation();
    }

    /* JADX INFO: renamed from: f */
    public boolean m23984f() {
        User user;
        if (TextUtils.isEmpty(this.f21140d) || (user = this.f21137a) == null || user.isMe()) {
            return false;
        }
        return CoreModule.N().mn(m23978Z());
    }

    /* JADX INFO: renamed from: g */
    public boolean m23985g() {
        return TextUtils.equals(this.f21138b, "from_boost_refactor");
    }

    /* JADX INFO: renamed from: h */
    public boolean m23986h() {
        return TextUtils.equals("from_city_center_conv_banner", this.f21138b);
    }

    /* JADX INFO: renamed from: i */
    public boolean m23987i() {
        return TextUtils.equals(this.f21138b, "from_conversation_search_view");
    }

    /* JADX INFO: renamed from: j */
    public boolean m23988j() {
        return TextUtils.equals(this.f21138b, "p_lifestyle_tag");
    }

    /* JADX INFO: renamed from: k */
    public boolean m23989k() {
        return m23952l(this.f21138b);
    }

    /* JADX INFO: renamed from: m */
    public boolean m23990m() {
        return TextUtils.equals(this.f21138b, "p_game_cp");
    }

    /* JADX INFO: renamed from: n */
    public boolean m23991n() {
        return TextUtils.equals(this.f21138b, "from_find_partner");
    }

    /* JADX INFO: renamed from: o */
    public boolean m23992o() {
        return "home_card".equals(this.f21138b);
    }

    /* JADX INFO: renamed from: p */
    public boolean m23993p() {
        return TextUtils.equals(this.f21138b, "from_intl_meet");
    }

    /* JADX INFO: renamed from: q */
    public boolean m23994q() {
        return TextUtils.equals(this.f21138b, "from_intl_meet_likers");
    }

    /* JADX INFO: renamed from: r */
    public boolean m23995r() {
        return "liked_users".equals(this.f21138b);
    }

    /* JADX INFO: renamed from: s */
    public boolean m23996s() {
        return TextUtils.equals("likers", this.f21138b);
    }

    /* JADX INFO: renamed from: t */
    public boolean m23997t() {
        return rlt.b(this.f21138b);
    }

    /* JADX INFO: renamed from: u */
    public boolean m23998u() {
        return TextUtils.equals(this.f21138b, "home_card") && this.f21141e.f21165n;
    }

    /* JADX INFO: renamed from: v */
    public boolean m23999v() {
        if (TextUtils.equals(this.f21138b, "from_meet_feed")) {
            return true;
        }
        return CoreModule.N().Co() && m24000w();
    }

    /* JADX INFO: renamed from: w */
    public boolean m24000w() {
        return TextUtils.equals(this.f21138b, "from_meet_picks_feed") || TextUtils.equals(this.f21138b, "from_meet_picks_card");
    }

    /* JADX INFO: renamed from: x */
    public boolean m24001x() {
        return TextUtils.equals(this.f21138b, "from_recommend_like") || TextUtils.equals(this.f21138b, "conversation_view") || TextUtils.equals(this.f21138b, "messages_title") || TextUtils.equals(this.f21138b, "message_ice_break_dialog") || TextUtils.equals(this.f21138b, "messages_cover") || TextUtils.equals(this.f21138b, "messages_friend_comment_toast") || TextUtils.equals(this.f21138b, "profile_bubble") || TextUtils.equals(this.f21138b, "messages_thumbnail_left") || TextUtils.equals(this.f21138b, "p_game_cp_msg");
    }

    /* JADX INFO: renamed from: y */
    public boolean m24002y() {
        return TextUtils.equals(this.f21138b, "from_new_meet_likers");
    }

    /* JADX INFO: renamed from: z */
    public boolean m24003z() {
        return TextUtils.equals(this.f21138b, "from_new_meet_picks_feed");
    }

    public vi90(Context context, dh90 dh90Var) {
        this.f21147k = false;
        this.f21148l = false;
        this.f21149m = false;
        this.f21150n = false;
        this.f21144h = null;
        this.f21143g = context;
        this.f21145i = dh90Var;
    }
}

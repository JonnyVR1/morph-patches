package p149l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.IdealInfo;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vi90 implements bj90 {

    /* JADX INFO: renamed from: a */
    public User f181561a;

    /* JADX INFO: renamed from: b */
    public String f181562b;

    /* JADX INFO: renamed from: c */
    public String f181563c;

    /* JADX INFO: renamed from: d */
    public String f181564d;

    /* JADX INFO: renamed from: e */
    public C20647a f181565e;

    /* JADX INFO: renamed from: f */
    public BubbleInfo f181566f;

    /* JADX INFO: renamed from: g */
    public Context f181567g;

    /* JADX INFO: renamed from: h */
    public final PutongFrag f181568h;

    /* JADX INFO: renamed from: i */
    public final dh90 f181569i;

    /* JADX INFO: renamed from: j */
    public IdealInfo f181570j;

    /* JADX INFO: renamed from: k */
    public boolean f181571k;

    /* JADX INFO: renamed from: l */
    public boolean f181572l;

    /* JADX INFO: renamed from: m */
    public boolean f181573m;

    /* JADX INFO: renamed from: n */
    public boolean f181574n;

    /* JADX INFO: renamed from: o */
    public List<Relationship> f181575o;

    /* JADX INFO: renamed from: l.vi90$a */
    public static class C20647a {

        /* JADX INFO: renamed from: a */
        public final vi90 f181576a;

        /* JADX INFO: renamed from: b */
        public String f181577b;

        /* JADX INFO: renamed from: c */
        public String f181578c;

        /* JADX INFO: renamed from: f */
        public boolean f181581f;

        /* JADX INFO: renamed from: o */
        public LikedUser f181590o;

        /* JADX INFO: renamed from: d */
        public int f181579d = 0;

        /* JADX INFO: renamed from: e */
        public String f181580e = "";

        /* JADX INFO: renamed from: g */
        public boolean f181582g = false;

        /* JADX INFO: renamed from: h */
        public String f181583h = "";

        /* JADX INFO: renamed from: i */
        public boolean f181584i = false;

        /* JADX INFO: renamed from: j */
        public boolean f181585j = false;

        /* JADX INFO: renamed from: k */
        public User f181586k = null;

        /* JADX INFO: renamed from: l */
        public int f181587l = -1;

        /* JADX INFO: renamed from: m */
        public RelationshipStatus f181588m = RelationshipStatus.get("unknown_");

        /* JADX INFO: renamed from: n */
        public boolean f181589n = false;

        public C20647a(vi90 vi90Var) {
            this.f181576a = vi90Var;
        }

        /* JADX INFO: renamed from: a */
        public void m198551a(Bundle bundle) {
            du2.m113670a("[core][profile]", "init arguments : " + bundle.toString());
            this.f181578c = bundle.getString("user_id");
            String string = bundle.getString("from");
            this.f181577b = string;
            vi90 vi90Var = this.f181576a;
            vi90Var.f181564d = this.f181578c;
            vi90Var.f181562b = string;
            vi90Var.f181563c = bundle.getString("live_room_info");
            boolean zEquals = TextUtils.equals(this.f181577b, "preview_card");
            vi90 vi90Var2 = this.f181576a;
            if (zEquals) {
                vi90Var2.m198523X((User) bundle.getSerializable("preview_user_info"));
            } else {
                vi90Var2.m198523X(CoreModule.m29932K().getUserById(this.f181578c));
            }
            this.f181581f = bundle.getBoolean("show_buttons");
            this.f181579d = bundle.getInt("pushReason");
            this.f181580e = bundle.getString("pushTag");
            this.f181589n = bundle.getBoolean("long_time_no_see");
            this.f181587l = bundle.getInt("pic_index", -1);
            this.f181588m = RelationshipStatus.get(bundle.getString("relationship_status"));
            this.f181582g = !"live_profile_voice_mask_mode".equals(this.f181577b);
            this.f181583h = bundle.getString("profile_like_id");
            this.f181584i = bundle.getBoolean("canShowFollowButton");
            this.f181585j = bundle.getBoolean("from_gp_live");
            if (TextUtils.equals(this.f181577b, "preview_card")) {
                this.f181586k = (User) bundle.getSerializable("preview_user_info");
            }
            if (this.f181576a.m198501B() || this.f181576a.m198542r() || this.f181576a.m198546v() || this.f181576a.m198547w()) {
                if (NullChecker.m81303a(CoreModule.f17545c.f19625Z0.m163902C3(this.f181578c))) {
                    LikedUser likedUserM163902C3 = CoreModule.f17545c.f19625Z0.m163902C3(this.f181578c);
                    this.f181590o = likedUserM163902C3;
                    bundle.putSerializable("liked_user", likedUserM163902C3);
                } else if (NullChecker.m81303a(bundle.getSerializable("liked_user"))) {
                    this.f181590o = (LikedUser) bundle.getSerializable("liked_user");
                }
            }
            m198552b(bundle);
        }

        /* JADX INFO: renamed from: b */
        public final void m198552b(Bundle bundle) {
            User userById;
            if (NullChecker.m81303a(CoreModule.m29932K().getUserById(this.f181578c))) {
                userById = CoreModule.m29932K().getUserById(this.f181578c);
                bundle.putSerializable("saved_user", userById);
            } else {
                userById = NullChecker.m81303a(bundle.getSerializable("saved_user")) ? (User) bundle.getSerializable("saved_user") : null;
            }
            CoreBusinessModule.f17537g.m146315b().f133032c = userById;
            CoreBusinessModule.f17537g.m146315b().f133033d = userById;
            CoreBusinessModule.f17537g.m146315b().f133034e = userById;
            if (this.f181576a.m198539o()) {
                CoreBusinessModule.f17537g.m146315b().f133031b = this.f181578c;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m198553c() {
            this.f181577b = "";
            this.f181578c = "";
            this.f181579d = 0;
            this.f181580e = "";
            this.f181581f = false;
            this.f181582g = false;
            this.f181586k = null;
            this.f181587l = -1;
            this.f181588m = RelationshipStatus.get("unknown_");
            this.f181589n = false;
            this.f181590o = null;
        }
    }

    public vi90(PutongFrag putongFrag, dh90 dh90Var) {
        this.f181571k = false;
        this.f181572l = false;
        this.f181573m = false;
        this.f181574n = false;
        this.f181568h = putongFrag;
        this.f181567g = putongFrag.getContext();
        this.f181569i = dh90Var;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m198499l(String str) {
        return CoreModule.m29934N().mo60308Qm(str);
    }

    /* JADX INFO: renamed from: A */
    public boolean m198500A() {
        return TextUtils.equals(this.f181562b, "from_new_meet_see_feed");
    }

    /* JADX INFO: renamed from: B */
    public boolean m198501B() {
        return TextUtils.equals(this.f181562b, "from_picks");
    }

    /* JADX INFO: renamed from: C */
    public boolean m198502C() {
        return TextUtils.equals(this.f181562b, "p_received_profile_like");
    }

    /* JADX INFO: renamed from: D */
    public boolean m198503D() {
        return TextUtils.equals(this.f181562b, "p_picks_profile") || TextUtils.equals(this.f181562b, "p_picks_profile_card");
    }

    /* JADX INFO: renamed from: E */
    public boolean m198504E() {
        return TextUtils.equals(this.f181562b, "push_like");
    }

    /* JADX INFO: renamed from: F */
    public boolean m198505F() {
        return "home_moment_theme_card".equals(this.f181562b);
    }

    /* JADX INFO: renamed from: G */
    public boolean m198506G() {
        return TextUtils.equals(this.f181562b, "intl_top_picks");
    }

    /* JADX INFO: renamed from: H */
    public boolean m198507H() {
        return rlt.m179880a(this.f181562b);
    }

    /* JADX INFO: renamed from: I */
    public boolean m198508I() {
        return m198539o() || m198505F() || m198543s() || m198549y() || m198542r() || m198501B() || m198538n() || m198532g() || m198504E() || m198520U() || m198541q() || m198506G() || m198503D();
    }

    /* JADX INFO: renamed from: J */
    public boolean m198509J() {
        User user;
        if (this.f181564d != null && (user = this.f181561a) != null && !user.isMe() && !this.f181561a.isTeamAccount()) {
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f181564d);
            if ((NullChecker.m81303a(conversationM32856Xe) && !TEnum.equals(conversationM32856Xe.status, "dismissed")) || User.isMatched(this.f181561a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public boolean m198510K() {
        return TextUtils.equals(this.f181564d, CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: L */
    public boolean m198511L() {
        return TextUtils.equals(this.f181562b, "preview_card");
    }

    /* JADX INFO: renamed from: M */
    public boolean m198512M() {
        User userM198525Z = m198525Z();
        return NullChecker.m81303a(userM198525Z.localRelationship) && !vwb.m200296J(userM198525Z.localRelationship.status) && userM198525Z.localRelationship.status.contains(MatchFrom.get("letter"));
    }

    /* JADX INFO: renamed from: N */
    public boolean m198513N() {
        User userM198525Z = m198525Z();
        if (m198542r()) {
            return false;
        }
        if ((m198501B() || m198546v() || m198547w()) && userM198525Z.localRelationship == null && NullChecker.m81303a(this.f181565e.f181590o)) {
            return (TEnum.equals(this.f181565e.f181590o.status, "liked") || TEnum.equals(this.f181565e.f181590o.status, "superliked")) ? false : true;
        }
        Relationship relationship = userM198525Z.localRelationship;
        return relationship == null || TEnum.equals(relationship.state, "unknown_") || TEnum.equals(userM198525Z.localRelationship.state, "default") || (TEnum.equals(userM198525Z.localRelationship.state, "liked") && NullChecker.m81303a(userM198525Z.localRelationship.relationshipExtensions) && TEnum.equals(userM198525Z.localRelationship.relationshipExtensions.relationType, RelationshipStatus.DEFAULT)) || TEnum.equals(userM198525Z.localRelationship.state, RelationshipStatus.disliked);
    }

    /* JADX INFO: renamed from: O */
    public boolean m198514O() {
        User userM198525Z = m198525Z();
        return NullChecker.m81303a(userM198525Z.localRelationship) && TEnum.equals(userM198525Z.localRelationship.state, "blocked");
    }

    /* JADX INFO: renamed from: P */
    public boolean m198515P() {
        User user;
        if (TextUtils.isEmpty(this.f181564d) || (user = this.f181561a) == null || user.isMe()) {
            return false;
        }
        return CoreModule.m29934N().mo60274Ek(m198525Z());
    }

    /* JADX INFO: renamed from: Q */
    public boolean m198516Q() {
        return false;
    }

    /* JADX INFO: renamed from: R */
    public boolean m198517R() {
        if (!NullChecker.m81303a(this.f181561a) || this.f181561a.isMe() || User.isMatched(this.f181561a)) {
            return false;
        }
        return (!CoreModule.m29932K().mo30819sg(this.f181561a.f56011id) || this.f181565e.f181581f) && m198521V(this.f181562b);
    }

    /* JADX INFO: renamed from: S */
    public boolean m198518S() {
        User userM198525Z = m198525Z();
        if (((!m198542r() && !m198501B() && !m198546v() && !m198547w()) || !NullChecker.m81303a(this.f181565e.f181590o) || (!TEnum.equals(this.f181565e.f181590o.status, "superliked") && !TEnum.equals(this.f181565e.f181590o.status, "lettered"))) && !this.f181572l && !this.f181573m) {
            if (!NullChecker.m81303a(userM198525Z.localRelationship)) {
                return false;
            }
            if ((vwb.m200296J(userM198525Z.localRelationship.status) || !userM198525Z.localRelationship.status.contains(MatchFrom.get(MatchFrom.superLiked))) && (!NullChecker.m81303a(userM198525Z.localRelationship.relationshipExtensions) || !TEnum.equals(userM198525Z.localRelationship.relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: T */
    public boolean m198519T() {
        return xp5.m210475o(m198527b(), this.f181561a);
    }

    /* JADX INFO: renamed from: U */
    public boolean m198520U() {
        return "from_intl_visitor".equals(this.f181562b) || "from_intl_salvage".equals(this.f181562b);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m198521V(String str) {
        if (!u59.m191812U() || TextUtils.equals("likers", str) || TextUtils.equals("from_mew_tags", str) || TextUtils.equals("from_portrait_like_list", str) || TextUtils.equals("from_literature_third", str) || CoreModule.f17545c.f19663m0.m31020L6(this.f181564d) || CoreModule.f17545c.f19663m0.m31024M6(this.f181564d) || TextUtils.equals("from_boost_refactor", str) || TextUtils.equals("live_user_card", str) || m198544t() || m198541q()) {
            return false;
        }
        return !IntlCountryCodeController.m28119o() || nkp.m159986e();
    }

    /* JADX INFO: renamed from: W */
    public String m198522W() {
        if ("my_tab_profile_like".equals(this.f181562b)) {
            return "p_my_profile_comment";
        }
        if ("from_guess_liker_result".equals(this.f181562b)) {
            return "p_guess_who_likes_me_profile";
        }
        if ("from_christmas".equals(this.f181562b)) {
            return "p_christmas_profile";
        }
        return (TextUtils.isEmpty(this.f181564d) || !m198516Q()) ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_unmatch_profile";
    }

    /* JADX INFO: renamed from: X */
    public void m198523X(User user) {
        if (!NullChecker.m81303a(user) || !user.isMe()) {
            this.f181561a = user;
            return;
        }
        this.f181561a = user.riskAuditUser(CoreModule.m29932K().getUserById("fake_risk_audit_default_" + this.f181564d));
    }

    /* JADX INFO: renamed from: Y */
    public boolean m198524Y() {
        if (TextUtils.equals(this.f181562b, "impress_signal") || TextUtils.equals(this.f181562b, "from_pin_like") || TextUtils.equals(this.f181562b, "live_user_card") || m198544t() || m198545u()) {
            return true;
        }
        if (r65.m178035m() && TextUtils.equals("from_city_center_boost_cover", this.f181562b)) {
            return true;
        }
        return (m198548x() && !m198519T()) || m198530e() || m198510K();
    }

    /* JADX INFO: renamed from: Z */
    public User m198525Z() {
        Relationship relationship;
        return (m198536k() || m198537m() || (relationship = this.f181561a.localRelationship) == null || TEnum.equals(relationship.state, "unknown_")) ? CoreModule.m29934N().getUserById(this.f181564d) : this.f181561a;
    }

    /* JADX INFO: renamed from: a */
    public Act m198526a() {
        PutongFrag putongFrag = this.f181568h;
        return putongFrag == null ? (Act) this.f181567g : putongFrag.act();
    }

    /* JADX INFO: renamed from: b */
    public Conversation m198527b() {
        return CoreModule.f17545c.f19642f0.m32856Xe(this.f181564d);
    }

    /* JADX INFO: renamed from: c */
    public PutongFrag m198528c() {
        Context context = this.f181567g;
        if (((context instanceof ProfileAct) || (context instanceof NewUI1ContainerActivity)) && this.f181568h == null) {
            au2.m98935w(new IllegalStateException("Profile Frag is Null"));
        }
        return this.f181568h;
    }

    /* JADX INFO: renamed from: d */
    public void m198529d(Bundle bundle) {
        C20647a c20647a = new C20647a(this);
        this.f181565e = c20647a;
        try {
            c20647a.m198551a(bundle);
        } catch (Exception unused) {
            this.f181565e.m198553c();
            this.f181561a = User.new_();
            c30.m104960b(m198526a());
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m198530e() {
        User user = this.f181561a;
        if (user == null || TextUtils.equals(user.f56011id, CoreModule.m29931H().userId())) {
            return false;
        }
        return this.f181561a.isBannedNew() || this.f181561a.isAccountCancellation();
    }

    /* JADX INFO: renamed from: f */
    public boolean m198531f() {
        User user;
        if (TextUtils.isEmpty(this.f181564d) || (user = this.f181561a) == null || user.isMe()) {
            return false;
        }
        return CoreModule.m29934N().mo60371mn(m198525Z());
    }

    /* JADX INFO: renamed from: g */
    public boolean m198532g() {
        return TextUtils.equals(this.f181562b, "from_boost_refactor");
    }

    /* JADX INFO: renamed from: h */
    public boolean m198533h() {
        return TextUtils.equals("from_city_center_conv_banner", this.f181562b);
    }

    /* JADX INFO: renamed from: i */
    public boolean m198534i() {
        return TextUtils.equals(this.f181562b, "from_conversation_search_view");
    }

    /* JADX INFO: renamed from: j */
    public boolean m198535j() {
        return TextUtils.equals(this.f181562b, "p_lifestyle_tag");
    }

    /* JADX INFO: renamed from: k */
    public boolean m198536k() {
        return m198499l(this.f181562b);
    }

    /* JADX INFO: renamed from: m */
    public boolean m198537m() {
        return TextUtils.equals(this.f181562b, "p_game_cp");
    }

    /* JADX INFO: renamed from: n */
    public boolean m198538n() {
        return TextUtils.equals(this.f181562b, "from_find_partner");
    }

    /* JADX INFO: renamed from: o */
    public boolean m198539o() {
        return "home_card".equals(this.f181562b);
    }

    /* JADX INFO: renamed from: p */
    public boolean m198540p() {
        return TextUtils.equals(this.f181562b, "from_intl_meet");
    }

    /* JADX INFO: renamed from: q */
    public boolean m198541q() {
        return TextUtils.equals(this.f181562b, "from_intl_meet_likers");
    }

    /* JADX INFO: renamed from: r */
    public boolean m198542r() {
        return "liked_users".equals(this.f181562b);
    }

    /* JADX INFO: renamed from: s */
    public boolean m198543s() {
        return TextUtils.equals("likers", this.f181562b);
    }

    /* JADX INFO: renamed from: t */
    public boolean m198544t() {
        return rlt.m179881b(this.f181562b);
    }

    /* JADX INFO: renamed from: u */
    public boolean m198545u() {
        return TextUtils.equals(this.f181562b, "home_card") && this.f181565e.f181589n;
    }

    /* JADX INFO: renamed from: v */
    public boolean m198546v() {
        if (TextUtils.equals(this.f181562b, "from_meet_feed")) {
            return true;
        }
        return CoreModule.m29934N().mo60267Co() && m198547w();
    }

    /* JADX INFO: renamed from: w */
    public boolean m198547w() {
        return TextUtils.equals(this.f181562b, "from_meet_picks_feed") || TextUtils.equals(this.f181562b, "from_meet_picks_card");
    }

    /* JADX INFO: renamed from: x */
    public boolean m198548x() {
        return TextUtils.equals(this.f181562b, "from_recommend_like") || TextUtils.equals(this.f181562b, "conversation_view") || TextUtils.equals(this.f181562b, "messages_title") || TextUtils.equals(this.f181562b, CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG) || TextUtils.equals(this.f181562b, "messages_cover") || TextUtils.equals(this.f181562b, "messages_friend_comment_toast") || TextUtils.equals(this.f181562b, "profile_bubble") || TextUtils.equals(this.f181562b, "messages_thumbnail_left") || TextUtils.equals(this.f181562b, "p_game_cp_msg");
    }

    /* JADX INFO: renamed from: y */
    public boolean m198549y() {
        return TextUtils.equals(this.f181562b, "from_new_meet_likers");
    }

    /* JADX INFO: renamed from: z */
    public boolean m198550z() {
        return TextUtils.equals(this.f181562b, "from_new_meet_picks_feed");
    }

    public vi90(Context context, dh90 dh90Var) {
        this.f181571k = false;
        this.f181572l = false;
        this.f181573m = false;
        this.f181574n = false;
        this.f181568h = null;
        this.f181567g = context;
        this.f181569i = dh90Var;
    }
}

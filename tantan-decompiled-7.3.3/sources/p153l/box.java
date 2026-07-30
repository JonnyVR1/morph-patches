package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u0003J\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0003J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0003J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0003J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0003J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0003J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0003J\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0003J\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0003J%\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J-\u0010(\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b*\u0010+¨\u0006,"}, m88121d2 = {"Ll/box;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "r", "h", BaseSei.f14624X, "w", "b", "a", "m", BLiveStormDanmakuGiftResourceType.f45292l, Constants.KEY_T, "u", "c", Constants.INAPP_DATA_TAG, "j", "k", "n", ResourceDirection.f39656v, RXScreenCaptureService.KEY_INDEX, "o", "g", "f", "", "cardMembershipType", "currentMembershipStatus", "privilegeKey", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "subtype", "privilegeDescription", "layoutType", "", "balanceEnough", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "p", "(Ljava/lang/String;Ljava/lang/String;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class box {

    @NotNull
    public static final box INSTANCE = new box();

    /* JADX INFO: renamed from: l.box$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C16073a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f77704a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f77704a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m105712a() {
        i4g0.m138523u("e_my_profile_navigation_appeal_guide", OMSDialogPositon.p_navigation_view, jyb.m147494Y("ban_user_appeal_state", yc2.m215118e().m215120b()));
    }

    /* JADX INFO: renamed from: b */
    public final void m105713b() {
        i4g0.m138492A("e_my_profile_navigation_appeal_guide", OMSDialogPositon.p_navigation_view, jyb.m147494Y("ban_user_appeal_state", yc2.m215118e().m215120b()));
    }

    /* JADX INFO: renamed from: c */
    public final void m105714c() {
        i4g0.m138520r("e_navigation_turbo", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: d */
    public final void m105715d() {
        i4g0.m138526x("e_navigation_turbo", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: e */
    public final void m105716e(@NotNull String subtype, @NotNull String privilegeDescription, @NotNull String layoutType, boolean balanceEnough) {
        subtype.getClass();
        privilegeDescription.getClass();
        layoutType.getClass();
        i4g0.m138523u("e_intl_me_tab_consumables_sku_click", OMSDialogPositon.p_navigation_view, jyb.m147494Y("subtype", subtype), jyb.m147494Y("privilege_description", privilegeDescription), jyb.m147494Y("layout_type", layoutType), jyb.m147494Y("iap_sku_balance_enough", Boolean.valueOf(balanceEnough)));
    }

    /* JADX INFO: renamed from: f */
    public final void m105717f() {
        i4g0.m138520r("e_intl_mkt_catnmouse_entrance", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: g */
    public final void m105718g() {
        i4g0.m138526x("e_intl_mkt_catnmouse_entrance", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: h */
    public final void m105719h() {
        i4g0.m138526x("e_intl_like_i_sent", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: i */
    public final void m105720i() {
        i4g0.m138493B("e_setting_finish_no_location", OMSDialogPositon.p_navigation_view, new pf60[0]);
    }

    /* JADX INFO: renamed from: j */
    public final void m105721j() {
        i4g0.m138520r("e_navigation_daily_picks", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: k */
    public final void m105722k() {
        i4g0.m138526x("e_navigation_daily_picks", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: l */
    public final void m105723l() {
        i4g0.m138523u("e_picture_fake_button", OMSDialogPositon.p_navigation_view, jyb.m147494Y("pic_show_from", "picture_banner"));
    }

    /* JADX INFO: renamed from: m */
    public final void m105724m() {
        i4g0.m138492A("e_picture_fake_button", OMSDialogPositon.p_navigation_view, jyb.m147494Y("pic_show_from", "picture_banner"));
    }

    /* JADX INFO: renamed from: n */
    public final void m105725n() {
        i4g0.m138520r("e_self_edit", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: o */
    public final void m105726o() {
        i4g0.m138521s("e_red_dot_me_settings", OMSDialogPositon.p_navigation_view, i6e.m138812d());
    }

    /* JADX INFO: renamed from: p */
    public final void m105727p(@NotNull String cardMembershipType, @NotNull String currentMembershipStatus) {
        cardMembershipType.getClass();
        currentMembershipStatus.getClass();
        i4g0.m138523u("e_intl_me_tab_sub_btn_click", OMSDialogPositon.p_navigation_view, jyb.m147494Y("intl_card_membership_type", cardMembershipType), jyb.m147494Y("intl_current_membership_status", currentMembershipStatus));
    }

    /* JADX INFO: renamed from: q */
    public final void m105728q(@NotNull String cardMembershipType, @NotNull String currentMembershipStatus, @NotNull String privilegeKey) {
        cardMembershipType.getClass();
        currentMembershipStatus.getClass();
        privilegeKey.getClass();
        i4g0.m138523u("e_intl_me_tab_sub_privilege_list_click", OMSDialogPositon.p_navigation_view, jyb.m147494Y("intl_card_membership_type", cardMembershipType), jyb.m147494Y("intl_current_membership_status", currentMembershipStatus), jyb.m147494Y("intl_privilege_key", privilegeKey));
    }

    /* JADX INFO: renamed from: r */
    public final void m105729r(@NotNull PurchaseType type) {
        String strName;
        type.getClass();
        int i = C16073a.f77704a[type.ordinal()];
        int i2 = 1;
        if (i == 1) {
            strName = "vip";
        } else if (i == 2) {
            strName = "see";
        } else if (i == 3) {
            strName = (t7a.m189547c() && CoreModule.f18264c.f20311G2.m153654l3(type) && CoreModule.f18264c.f20396j0.m31605P4()) ? CoreModule.f18264c.f20311G2.m153651i3().name() : "premium";
        } else if (i != 4) {
            strName = "";
        } else {
            strName = (t7a.m189547c() && CoreModule.f18264c.f20311G2.m153654l3(type) && CoreModule.f18264c.f20396j0.m31605P4()) ? CoreModule.f18264c.f20311G2.m153651i3().name() : SummarizedPrivilegesId.ultraPremium;
        }
        strName.getClass();
        if (strName.length() > 0) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p9) && type == CoreModule.f18264c.f20414p0.m219059d3()) {
                yyh0 yyh0Var = yyh0.INSTANCE;
                userM116600p9.getClass();
                if (yyh0Var.m217988d(userM116600p9) != -1) {
                    i2 = 0;
                }
            }
            i4g0.m138523u("e_intl_me_subscription_card", OMSDialogPositon.p_navigation_view, jyb.m147494Y("subtype", strName), jyb.m147494Y("default_position", Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m105730s(@NotNull PurchaseType type) {
        String strName;
        type.getClass();
        int i = C16073a.f77704a[type.ordinal()];
        int i2 = 1;
        if (i == 1) {
            strName = "vip";
        } else if (i == 2) {
            strName = "see";
        } else if (i == 3) {
            strName = (t7a.m189547c() && CoreModule.f18264c.f20311G2.m153654l3(type) && CoreModule.f18264c.f20396j0.m31605P4()) ? CoreModule.f18264c.f20311G2.m153651i3().name() : "premium";
        } else if (i != 4) {
            strName = "";
        } else {
            strName = (t7a.m189547c() && CoreModule.f18264c.f20311G2.m153654l3(type) && CoreModule.f18264c.f20396j0.m31605P4()) ? CoreModule.f18264c.f20311G2.m153651i3().name() : SummarizedPrivilegesId.ultraPremium;
        }
        strName.getClass();
        if (strName.length() > 0) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p9) && type == CoreModule.f18264c.f20414p0.m219059d3()) {
                yyh0 yyh0Var = yyh0.INSTANCE;
                userM116600p9.getClass();
                if (yyh0Var.m217988d(userM116600p9) != -1) {
                    i2 = 0;
                }
            }
            i4g0.m138492A("e_intl_me_subscription_card", OMSDialogPositon.p_navigation_view, jyb.m147494Y("subtype", strName), jyb.m147494Y("default_position", Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m105731t() {
        i4g0.m138520r("e_navigation_super_like", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: u */
    public final void m105732u() {
        i4g0.m138526x("e_navigation_super_like", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: v */
    public final void m105733v() {
        i4g0.m138520r("e_intl_tabme_tantanid_icon", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: w */
    public final void m105734w() {
        i4g0.m138520r("e_intl_tab_me_visitors", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: x */
    public final void m105735x() {
        i4g0.m138526x("e_intl_tab_me_visitors", OMSDialogPositon.p_navigation_view);
    }
}

package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u0003J\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0003J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0003J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0003J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0003J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0003J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0003J\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0003J\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0003¨\u0006\u001d"}, m87232d2 = {"Ll/dfx;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "", "p", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "o", "g", "u", Constants.KEY_T, "b", "a", BLiveStormDanmakuGiftResourceType.f44444l, "k", "q", "r", "c", Constants.INAPP_DATA_TAG, RXScreenCaptureService.KEY_INDEX, "j", "m", BLiveStormDanmakuGiftResourceType.f44446s, "h", "n", "f", "e", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class dfx {

    @NotNull
    public static final dfx INSTANCE = new dfx();

    /* JADX INFO: renamed from: l.dfx$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C16350a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f85983a;

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
            f85983a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m111510a() {
        zvf0.m220399u("e_my_profile_navigation_appeal_guide", OMSDialogPositon.p_navigation_view, vwb.m200311Y("ban_user_appeal_state", rc2.m178723e().m178725b()));
    }

    /* JADX INFO: renamed from: b */
    public final void m111511b() {
        zvf0.m220368A("e_my_profile_navigation_appeal_guide", OMSDialogPositon.p_navigation_view, vwb.m200311Y("ban_user_appeal_state", rc2.m178723e().m178725b()));
    }

    /* JADX INFO: renamed from: c */
    public final void m111512c() {
        zvf0.m220396r("e_navigation_turbo", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: d */
    public final void m111513d() {
        zvf0.m220402x("e_navigation_turbo", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: e */
    public final void m111514e() {
        zvf0.m220396r("e_intl_mkt_catnmouse_entrance", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: f */
    public final void m111515f() {
        zvf0.m220402x("e_intl_mkt_catnmouse_entrance", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: g */
    public final void m111516g() {
        zvf0.m220402x("e_intl_like_i_sent", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: h */
    public final void m111517h() {
        zvf0.m220369B("e_setting_finish_no_location", OMSDialogPositon.p_navigation_view, new j760[0]);
    }

    /* JADX INFO: renamed from: i */
    public final void m111518i() {
        zvf0.m220396r("e_navigation_daily_picks", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: j */
    public final void m111519j() {
        zvf0.m220402x("e_navigation_daily_picks", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: k */
    public final void m111520k() {
        zvf0.m220399u("e_picture_fake_button", OMSDialogPositon.p_navigation_view, vwb.m200311Y("pic_show_from", "picture_banner"));
    }

    /* JADX INFO: renamed from: l */
    public final void m111521l() {
        zvf0.m220368A("e_picture_fake_button", OMSDialogPositon.p_navigation_view, vwb.m200311Y("pic_show_from", "picture_banner"));
    }

    /* JADX INFO: renamed from: m */
    public final void m111522m() {
        zvf0.m220396r("e_self_edit", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: n */
    public final void m111523n() {
        zvf0.m220397s("e_red_dot_me_settings", OMSDialogPositon.p_navigation_view, u4e.m191729d());
    }

    /* JADX INFO: renamed from: o */
    public final void m111524o(@NotNull PurchaseType type) {
        String strName;
        type.getClass();
        int i = C16350a.f85983a[type.ordinal()];
        int i2 = 1;
        if (i == 1) {
            strName = "vip";
        } else if (i == 2) {
            strName = "see";
        } else if (i == 3) {
            strName = (h6a.m129470c() && CoreModule.f17545c.f19569G2.m105984l3(type) && CoreModule.f17545c.f19654j0.m30602P4()) ? CoreModule.f17545c.f19569G2.m105981i3().name() : "premium";
        } else if (i != 4) {
            strName = "";
        } else {
            strName = (h6a.m129470c() && CoreModule.f17545c.f19569G2.m105984l3(type) && CoreModule.f17545c.f19654j0.m30602P4()) ? CoreModule.f17545c.f19569G2.m105981i3().name() : SummarizedPrivilegesId.ultraPremium;
        }
        strName.getClass();
        if (strName.length() > 0) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p9) && type == CoreModule.f17545c.f19672p0.m173356d3()) {
                qqh0 qqh0Var = qqh0.INSTANCE;
                userM169527p9.getClass();
                if (qqh0Var.m175925d(userM169527p9) != -1) {
                    i2 = 0;
                }
            }
            zvf0.m220399u("e_intl_me_subscription_card", OMSDialogPositon.p_navigation_view, vwb.m200311Y("subtype", strName), vwb.m200311Y("default_position", Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m111525p(@NotNull PurchaseType type) {
        String strName;
        type.getClass();
        int i = C16350a.f85983a[type.ordinal()];
        int i2 = 1;
        if (i == 1) {
            strName = "vip";
        } else if (i == 2) {
            strName = "see";
        } else if (i == 3) {
            strName = (h6a.m129470c() && CoreModule.f17545c.f19569G2.m105984l3(type) && CoreModule.f17545c.f19654j0.m30602P4()) ? CoreModule.f17545c.f19569G2.m105981i3().name() : "premium";
        } else if (i != 4) {
            strName = "";
        } else {
            strName = (h6a.m129470c() && CoreModule.f17545c.f19569G2.m105984l3(type) && CoreModule.f17545c.f19654j0.m30602P4()) ? CoreModule.f17545c.f19569G2.m105981i3().name() : SummarizedPrivilegesId.ultraPremium;
        }
        strName.getClass();
        if (strName.length() > 0) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p9) && type == CoreModule.f17545c.f19672p0.m173356d3()) {
                qqh0 qqh0Var = qqh0.INSTANCE;
                userM169527p9.getClass();
                if (qqh0Var.m175925d(userM169527p9) != -1) {
                    i2 = 0;
                }
            }
            zvf0.m220368A("e_intl_me_subscription_card", OMSDialogPositon.p_navigation_view, vwb.m200311Y("subtype", strName), vwb.m200311Y("default_position", Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m111526q() {
        zvf0.m220396r("e_navigation_super_like", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: r */
    public final void m111527r() {
        zvf0.m220402x("e_navigation_super_like", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: s */
    public final void m111528s() {
        zvf0.m220396r("e_intl_tabme_tantanid_icon", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: t */
    public final void m111529t() {
        zvf0.m220396r("e_intl_tab_me_visitors", OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: u */
    public final void m111530u() {
        zvf0.m220402x("e_intl_tab_me_visitors", OMSDialogPositon.p_navigation_view);
    }
}

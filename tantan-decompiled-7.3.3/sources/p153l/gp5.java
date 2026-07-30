package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0014J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001b\u0010\u0003J\u0019\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0014J\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0010R8\u0010#\u001a&\u0012\f\u0012\n  *\u0004\u0018\u00010\u00040\u0004  *\u0012\u0012\f\u0012\n  *\u0004\u0018\u00010\u00040\u0004\u0018\u00010!0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010$R8\u0010&\u001a&\u0012\f\u0012\n  *\u0004\u0018\u00010\u00040\u0004  *\u0012\u0012\f\u0012\n  *\u0004\u0018\u00010\u00040\u0004\u0018\u00010!0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"¨\u0006'"}, m88121d2 = {"Ll/gp5;", "", "<init>", "()V", "", "from", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "e", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "pageId", "complimentSource", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "fromSource", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)V", "userId", "h", "g", "", "b", "(Lcom/p1/mobile/android/app/Act;)Z", "j", RXScreenCaptureService.KEY_INDEX, "complimentToastType", "k", "", "kotlin.jvm.PlatformType", "", "Ljava/util/Set;", "sReportedSources", "Ljava/lang/String;", "sReportedFromShowSwipeUserId", "sReportedShowSources", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gp5 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile String sReportedFromShowSwipeUserId;

    @NotNull
    public static final gp5 INSTANCE = new gp5();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Set<String> sReportedSources = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Set<String> sReportedShowSources = Collections.newSetFromMap(new ConcurrentHashMap());

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m131227a(@Nullable String from) {
        if (TextUtils.isEmpty(from)) {
            return "";
        }
        if (Intrinsics.m88377d(from, "home_card_us_compliment_btn") || Intrinsics.m88377d(from, "home_card_compliment_btn")) {
            return "swipe";
        }
        if (Intrinsics.m88377d(from, "profile_photo_compliment_btn") || Intrinsics.m88377d(from, "profile_life_photo_compliment_btn")) {
            return "profile_photo";
        }
        if (Intrinsics.m88377d(from, "profile_content_compliment_bar")) {
            return "profile_bottom";
        }
        from.getClass();
        return C15493d.m94374J(from, "tribe", false, 2, null) ? "tribe" : "";
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m131228b(@Nullable Act act) {
        if (act instanceof ProfileAct) {
            return true;
        }
        if (act instanceof NewMainAct) {
            return ExpandedCardStyleHelper.m39093o().m39106s();
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m131229c() {
        sReportedSources.clear();
        sReportedShowSources.clear();
        sReportedFromShowSwipeUserId = null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m131230d(@NotNull String fromSource) {
        fromSource.getClass();
        if (Intrinsics.m88377d(fromSource, "swipe")) {
            sReportedFromShowSwipeUserId = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    /* JADX WARN: Code duplicated, block: B:22:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m131231e(@Nullable Act act, @Nullable String from) {
        String strPageId;
        if (act == null) {
            return;
        }
        String strM131227a = m131227a(from);
        if (TextUtils.isEmpty(strM131227a)) {
            return;
        }
        switch (strM131227a) {
            case "profile_bottom":
            case "profile_photo":
                strPageId = OMSDialogPositon.p_suggest_user_profile_info_view;
                break;
            case "swipe":
            case "tribe":
                strPageId = OMSDialogPositon.p_navigation_view;
                break;
            default:
                strPageId = act.pageId();
                break;
        }
        i4g0.m138523u("e_intl_compliment_entry_click", strPageId, jyb.m147494Y("compliment_source", strM131227a));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m131232f(@NotNull String pageId, @NotNull String complimentSource) {
        pageId.getClass();
        complimentSource.getClass();
        if (TextUtils.isEmpty(pageId) || TextUtils.isEmpty(complimentSource) || !sReportedSources.add(complimentSource)) {
            return;
        }
        switch (complimentSource.hashCode()) {
            case -1168536191:
                if (complimentSource.equals("profile_bottom")) {
                    pageId = OMSDialogPositon.p_suggest_user_profile_info_view;
                }
                break;
            case -717715428:
                if (complimentSource.equals("profile_photo")) {
                    pageId = OMSDialogPositon.p_suggest_user_profile_info_view;
                }
                break;
            case 109854522:
                if (complimentSource.equals("swipe")) {
                    pageId = OMSDialogPositon.p_navigation_view;
                }
                break;
            case 110628654:
                if (complimentSource.equals("tribe")) {
                    pageId = OMSDialogPositon.p_navigation_view;
                }
                break;
        }
        i4g0.m138492A("e_intl_compliment_entry_click", pageId, jyb.m147494Y("compliment_source", complimentSource));
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m131233g(@NotNull String fromSource) {
        fromSource.getClass();
        if (Intrinsics.m88377d(fromSource, "swipe") || Intrinsics.m88377d(fromSource, "tribe")) {
            i4g0.m138523u("e_intl_compliment_from_show", OMSDialogPositon.p_navigation_view, jyb.m147494Y("from_sourse", fromSource));
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m131234h(@NotNull String fromSource, @Nullable String userId) {
        fromSource.getClass();
        if (Intrinsics.m88377d(fromSource, "swipe") || Intrinsics.m88377d(fromSource, "tribe")) {
            if (Intrinsics.m88377d(fromSource, "swipe") && !TextUtils.isEmpty(userId)) {
                if (Intrinsics.m88377d(userId, sReportedFromShowSwipeUserId)) {
                    return;
                } else {
                    sReportedFromShowSwipeUserId = userId;
                }
            }
            i4g0.m138492A("e_intl_compliment_from_show", OMSDialogPositon.p_navigation_view, jyb.m147494Y("from_sourse", fromSource));
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m131235i(@NotNull String pageId) {
        pageId.getClass();
        if (TextUtils.isEmpty(pageId)) {
            return;
        }
        i4g0.m138495D("e_intl_compliment_remove", pageId, new pf60[0]);
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m131236j() {
        if (sReportedShowSources.add("profile")) {
            i4g0.m138492A("e_intl_compliment_show", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("show_sourse", "profile"));
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m131237k(@NotNull String pageId, @NotNull String complimentToastType) {
        String str;
        pageId.getClass();
        complimentToastType.getClass();
        if (!joa.m146386f4()) {
            str = "premium";
        } else if (joa.m146401n4()) {
            str = !joa.m146392i4() ? "see" : "other";
        } else {
            str = "vip";
        }
        i4g0.m138495D("e_intl_compliment_toast_show", pageId, jyb.m147494Y("compliment_toast_type", complimentToastType), jyb.m147494Y("user_status", str));
    }
}

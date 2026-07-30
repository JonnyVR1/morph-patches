package com.p046p1.mobile.putong.core.p053ui.report;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AIMessageFeedback;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.UnlockConversationType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.f9j;
import p149l.o660;
import p149l.p660;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.f */
/* JADX INFO: loaded from: classes9.dex */
public class C8829f {

    /* JADX INFO: renamed from: g */
    public static final C8829f f35565g = new C8829f();

    /* JADX INFO: renamed from: d */
    public String f35569d;

    /* JADX INFO: renamed from: a */
    public String f35566a = "";

    /* JADX INFO: renamed from: b */
    public String f35567b = "unmatch";

    /* JADX INFO: renamed from: c */
    public String f35568c = AIMessageFeedback.good;

    /* JADX INFO: renamed from: e */
    public final List<b> f35570e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public String f35571f = "";

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.f$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35572a;

        static {
            int[] iArr = new int[ReportCategory.values().length];
            f35572a = iArr;
            try {
                iArr[ReportCategory.FAKE_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35572a[ReportCategory.SPAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35572a[ReportCategory.FRAUD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35572a[ReportCategory.PROFANITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35572a[ReportCategory.EXPLICIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35572a[ReportCategory.VIOLENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35572a[ReportCategory.RECOMMEND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35572a[ReportCategory.OTHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.f$b */
    public interface b {
        /* JADX INFO: renamed from: f0 */
        void mo54653f0();
    }

    /* JADX INFO: renamed from: b */
    public static C8829f m54696b() {
        return f35565g;
    }

    /* JADX INFO: renamed from: a */
    public String m54697a() {
        return this.f35568c;
    }

    /* JADX INFO: renamed from: c */
    public void m54698c() {
        Iterator<b> it = this.f35570e.iterator();
        while (it.hasNext()) {
            it.next().mo54653f0();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m54699d(String str) {
        this.f35569d = str;
        this.f35566a = "";
        this.f35567b = "unmatch";
        this.f35568c = AIMessageFeedback.good;
        o660 o660VarM167645d = p660.m167645d();
        if (o660VarM167645d == null) {
            this.f35566a = "";
            return;
        }
        String strM162820c = o660VarM167645d.m162820c();
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str);
        String str2 = conversationM32856Xe != null ? conversationM32856Xe.localEverHasMessage : false ? "conversation" : "match";
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        if (userM169430Pa != null && userM169430Pa.matchedOrFollowed()) {
            Relationship relationship = userM169430Pa.localRelationship;
            if (relationship != null) {
                List<MatchFrom> list = relationship.status;
                if (userM169430Pa.onlineMatch()) {
                    this.f35567b = UnlockConversationType.quick_chat;
                } else if (list.contains(MatchFrom.get("letter"))) {
                    this.f35567b = "letter";
                } else if (list.contains(MatchFrom.get(MatchFrom.superLiked)) || list.contains(MatchFrom.get(MatchFrom.superLikedEach))) {
                    this.f35567b = "superlike";
                } else if (list.contains(MatchFrom.get("boosted"))) {
                    this.f35567b = "boost";
                } else if (list.contains(MatchFrom.get("secretcrush"))) {
                    this.f35567b = "secret";
                } else {
                    this.f35567b = "swipe";
                }
            } else if (userM169430Pa.localFollowship != null) {
                this.f35567b = "follow";
            }
        } else if (userM169430Pa != null && userM169430Pa.onlineMatch()) {
            this.f35567b = UnlockConversationType.quick_chat;
        } else if (conversationM32856Xe != null && TEnum.equals(conversationM32856Xe.status, "default")) {
            this.f35567b = "swipe";
        }
        if (OMSDialogPositon.p_suggest_user_profile_info_view.equals(strM162820c)) {
            if (TextUtils.isEmpty(this.f35571f)) {
                this.f35566a = "profile";
                return;
            } else {
                this.f35566a = m54700e(this.f35571f, str2);
                return;
            }
        }
        if ("p_unmatch_profile".equals(strM162820c) || "p_chat_setting".equals(strM162820c)) {
            this.f35566a = str2;
            if ("p_unmatch_profile".equals(strM162820c)) {
                this.f35567b = "unmatch";
                return;
            }
            return;
        }
        if ("p_album".equals(strM162820c)) {
            this.f35566a = "personal_moment";
            return;
        }
        if ("p_kankan_chat_popup".equals(strM162820c)) {
            this.f35566a = "greeting";
            return;
        }
        if ("p_user_profile_more_popup".equals(strM162820c)) {
            this.f35566a = "profile";
            return;
        }
        if (OMSDialogPositon.p_messages_view.equals(strM162820c)) {
            this.f35566a = "conversation";
        } else if ("p_user_moment_fullscreen_browse_view".equals(strM162820c) || "p_user_moments_view".equals(strM162820c)) {
            this.f35566a = "personal_moment";
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m54700e(String str, String str2) {
        if (f9j.m120084a(str)) {
            return "moment";
        }
        if ("home_card".equals(str)) {
            return "swipe";
        }
        return ("profile_bubble".equals(str) || "messages_thumbnail_left".equals(str) || "messages_title".equals(str) || CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG.equals(str) || "conversation_view".equals(str) || "messages_cover".equals(str)) ? str2 : "profile";
    }

    /* JADX INFO: renamed from: f */
    public void m54701f(String str) {
        this.f35571f = str;
    }

    /* JADX INFO: renamed from: g */
    public void m54702g(b bVar) {
        this.f35570e.add(bVar);
    }

    /* JADX INFO: renamed from: h */
    public void m54703h(b bVar) {
        List<b> list = this.f35570e;
        if (bVar == null) {
            list.clear();
        } else {
            list.remove(bVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public String m54704i() {
        return this.f35567b;
    }

    /* JADX INFO: renamed from: j */
    public String m54705j() {
        return this.f35566a;
    }

    /* JADX INFO: renamed from: k */
    public String m54706k() {
        return this.f35569d;
    }

    /* JADX INFO: renamed from: l */
    public String m54707l(ReportCategory reportCategory) {
        switch (a.f35572a[reportCategory.ordinal()]) {
            case 1:
                return "REPORT_REASON_FAKE_ACCOUNT";
            case 2:
                return "REPORT_REASON_SPAM";
            case 3:
                return "REPORT_REASON_FRAUD";
            case 4:
                return "REPORT_REASON_PROFANITY";
            case 5:
                return "REPORT_REASON_EXPLICIT";
            case 6:
                return "REPORT_REASON_VIOLENCE";
            case 7:
                return "REPORT_REASON_RECOMMEND";
            default:
                return "REPORT_REASON_OTHER";
        }
    }
}

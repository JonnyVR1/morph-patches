package com.p051p1.mobile.putong.core.p058ui.report;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AIMessageFeedback;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.UnlockConversationType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.ue60;
import p153l.ve60;
import p153l.zbj;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.f */
/* JADX INFO: loaded from: classes12.dex */
public class C8992f {

    /* JADX INFO: renamed from: g */
    public static final C8992f f36413g = new C8992f();

    /* JADX INFO: renamed from: d */
    public String f36417d;

    /* JADX INFO: renamed from: a */
    public String f36414a = "";

    /* JADX INFO: renamed from: b */
    public String f36415b = "unmatch";

    /* JADX INFO: renamed from: c */
    public String f36416c = AIMessageFeedback.good;

    /* JADX INFO: renamed from: e */
    public final List<b> f36418e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public String f36419f = "";

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.f$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36420a;

        static {
            int[] iArr = new int[ReportCategory.values().length];
            f36420a = iArr;
            try {
                iArr[ReportCategory.FAKE_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36420a[ReportCategory.SPAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36420a[ReportCategory.FRAUD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36420a[ReportCategory.PROFANITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36420a[ReportCategory.EXPLICIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36420a[ReportCategory.VIOLENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36420a[ReportCategory.RECOMMEND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36420a[ReportCategory.OTHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.f$b */
    public interface b {
        /* JADX INFO: renamed from: f0 */
        void mo55836f0();
    }

    /* JADX INFO: renamed from: b */
    public static C8992f m55879b() {
        return f36413g;
    }

    /* JADX INFO: renamed from: a */
    public String m55880a() {
        return this.f36416c;
    }

    /* JADX INFO: renamed from: c */
    public void m55881c() {
        Iterator<b> it = this.f36418e.iterator();
        while (it.hasNext()) {
            it.next().mo55836f0();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m55882d(String str) {
        this.f36417d = str;
        this.f36414a = "";
        this.f36415b = "unmatch";
        this.f36416c = AIMessageFeedback.good;
        ue60 ue60VarM201037d = ve60.m201037d();
        if (ue60VarM201037d == null) {
            this.f36414a = "";
            return;
        }
        String strM195739c = ue60VarM201037d.m195739c();
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str);
        String str2 = conversationM33859Xe != null ? conversationM33859Xe.localEverHasMessage : false ? "conversation" : "match";
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        if (userM116503Pa != null && userM116503Pa.matchedOrFollowed()) {
            Relationship relationship = userM116503Pa.localRelationship;
            if (relationship != null) {
                List<MatchFrom> list = relationship.status;
                if (userM116503Pa.onlineMatch()) {
                    this.f36415b = UnlockConversationType.quick_chat;
                } else if (list.contains(MatchFrom.get("letter"))) {
                    this.f36415b = "letter";
                } else if (list.contains(MatchFrom.get(MatchFrom.superLiked)) || list.contains(MatchFrom.get(MatchFrom.superLikedEach))) {
                    this.f36415b = "superlike";
                } else if (list.contains(MatchFrom.get("boosted"))) {
                    this.f36415b = "boost";
                } else if (list.contains(MatchFrom.get("secretcrush"))) {
                    this.f36415b = "secret";
                } else {
                    this.f36415b = "swipe";
                }
            } else if (userM116503Pa.localFollowship != null) {
                this.f36415b = "follow";
            }
        } else if (userM116503Pa != null && userM116503Pa.onlineMatch()) {
            this.f36415b = UnlockConversationType.quick_chat;
        } else if (conversationM33859Xe != null && TEnum.equals(conversationM33859Xe.status, "default")) {
            this.f36415b = "swipe";
        }
        if (OMSDialogPositon.p_suggest_user_profile_info_view.equals(strM195739c)) {
            if (TextUtils.isEmpty(this.f36419f)) {
                this.f36414a = "profile";
                return;
            } else {
                this.f36414a = m55883e(this.f36419f, str2);
                return;
            }
        }
        if ("p_unmatch_profile".equals(strM195739c) || "p_chat_setting".equals(strM195739c)) {
            this.f36414a = str2;
            if ("p_unmatch_profile".equals(strM195739c)) {
                this.f36415b = "unmatch";
                return;
            }
            return;
        }
        if ("p_album".equals(strM195739c)) {
            this.f36414a = "personal_moment";
            return;
        }
        if ("p_kankan_chat_popup".equals(strM195739c)) {
            this.f36414a = "greeting";
            return;
        }
        if ("p_user_profile_more_popup".equals(strM195739c)) {
            this.f36414a = "profile";
            return;
        }
        if (OMSDialogPositon.p_messages_view.equals(strM195739c)) {
            this.f36414a = "conversation";
        } else if ("p_user_moment_fullscreen_browse_view".equals(strM195739c) || "p_user_moments_view".equals(strM195739c)) {
            this.f36414a = "personal_moment";
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m55883e(String str, String str2) {
        if (zbj.m219194a(str)) {
            return "moment";
        }
        if ("home_card".equals(str)) {
            return "swipe";
        }
        return ("profile_bubble".equals(str) || "messages_thumbnail_left".equals(str) || "messages_title".equals(str) || CoreStaticData.ProfileFromType.MESSAGE_ICE_BREAK_DIALOG.equals(str) || "conversation_view".equals(str) || "messages_cover".equals(str)) ? str2 : "profile";
    }

    /* JADX INFO: renamed from: f */
    public void m55884f(String str) {
        this.f36419f = str;
    }

    /* JADX INFO: renamed from: g */
    public void m55885g(b bVar) {
        this.f36418e.add(bVar);
    }

    /* JADX INFO: renamed from: h */
    public void m55886h(b bVar) {
        List<b> list = this.f36418e;
        if (bVar == null) {
            list.clear();
        } else {
            list.remove(bVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public String m55887i() {
        return this.f36415b;
    }

    /* JADX INFO: renamed from: j */
    public String m55888j() {
        return this.f36414a;
    }

    /* JADX INFO: renamed from: k */
    public String m55889k() {
        return this.f36417d;
    }

    /* JADX INFO: renamed from: l */
    public String m55890l(ReportCategory reportCategory) {
        switch (a.f36420a[reportCategory.ordinal()]) {
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

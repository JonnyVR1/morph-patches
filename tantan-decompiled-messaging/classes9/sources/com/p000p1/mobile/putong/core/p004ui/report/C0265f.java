package com.p000p1.mobile.putong.core.p004ui.report;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.f9j;
import l.o660;
import l.p660;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.f */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0265f {

    /* JADX INFO: renamed from: g */
    public static final C0265f f5346g = new C0265f();

    /* JADX INFO: renamed from: d */
    public String f5350d;

    /* JADX INFO: renamed from: a */
    public String f5347a = "";

    /* JADX INFO: renamed from: b */
    public String f5348b = "unmatch";

    /* JADX INFO: renamed from: c */
    public String f5349c = "good";

    /* JADX INFO: renamed from: e */
    public final List<b> f5351e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public String f5352f = "";

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.f$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5353a;

        static {
            int[] iArr = new int[ReportCategory.values().length];
            f5353a = iArr;
            try {
                iArr[ReportCategory.FAKE_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5353a[ReportCategory.SPAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5353a[ReportCategory.FRAUD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5353a[ReportCategory.PROFANITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5353a[ReportCategory.EXPLICIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5353a[ReportCategory.VIOLENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5353a[ReportCategory.RECOMMEND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5353a[ReportCategory.OTHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.report.f$b */
    public interface b {
        /* JADX INFO: renamed from: f0 */
        void mo8003f0();
    }

    /* JADX INFO: renamed from: b */
    public static C0265f m8053b() {
        return f5346g;
    }

    /* JADX INFO: renamed from: a */
    public String m8054a() {
        return this.f5349c;
    }

    /* JADX INFO: renamed from: c */
    public void m8055c() {
        Iterator<b> it = this.f5351e.iterator();
        while (it.hasNext()) {
            it.next().mo8003f0();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m8056d(String str) {
        this.f5350d = str;
        this.f5347a = "";
        this.f5348b = "unmatch";
        this.f5349c = "good";
        o660 o660VarD = p660.d();
        if (o660VarD == null) {
            this.f5347a = "";
            return;
        }
        String strC = o660VarD.c();
        Conversation conversationM4786Xe = CoreModule.f1534c.f3631f0.m4786Xe(str);
        String str2 = conversationM4786Xe != null ? conversationM4786Xe.localEverHasMessage : false ? "conversation" : "match";
        User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(str);
        if (userM21393Pa != null && userM21393Pa.matchedOrFollowed()) {
            Relationship relationship = userM21393Pa.localRelationship;
            if (relationship != null) {
                List list = relationship.status;
                if (userM21393Pa.onlineMatch()) {
                    this.f5348b = "quick_chat";
                } else if (list.contains(MatchFrom.get("letter"))) {
                    this.f5348b = "letter";
                } else if (list.contains(MatchFrom.get("superLiked")) || list.contains(MatchFrom.get("superLikedEach"))) {
                    this.f5348b = "superlike";
                } else if (list.contains(MatchFrom.get("boosted"))) {
                    this.f5348b = "boost";
                } else if (list.contains(MatchFrom.get("secretcrush"))) {
                    this.f5348b = "secret";
                } else {
                    this.f5348b = "swipe";
                }
            } else if (userM21393Pa.localFollowship != null) {
                this.f5348b = "follow";
            }
        } else if (userM21393Pa != null && userM21393Pa.onlineMatch()) {
            this.f5348b = "quick_chat";
        } else if (conversationM4786Xe != null && TEnum.equals(conversationM4786Xe.status, CameraSticker.CATEGORY_DEFAULT_FILTER)) {
            this.f5348b = "swipe";
        }
        if ("p_suggest_user_profile_info_view".equals(strC)) {
            if (TextUtils.isEmpty(this.f5352f)) {
                this.f5347a = "profile";
                return;
            } else {
                this.f5347a = m8057e(this.f5352f, str2);
                return;
            }
        }
        if ("p_unmatch_profile".equals(strC) || "p_chat_setting".equals(strC)) {
            this.f5347a = str2;
            if ("p_unmatch_profile".equals(strC)) {
                this.f5348b = "unmatch";
                return;
            }
            return;
        }
        if ("p_album".equals(strC)) {
            this.f5347a = "personal_moment";
            return;
        }
        if ("p_kankan_chat_popup".equals(strC)) {
            this.f5347a = "greeting";
            return;
        }
        if ("p_user_profile_more_popup".equals(strC)) {
            this.f5347a = "profile";
            return;
        }
        if ("p_messages_view".equals(strC)) {
            this.f5347a = "conversation";
        } else if ("p_user_moment_fullscreen_browse_view".equals(strC) || "p_user_moments_view".equals(strC)) {
            this.f5347a = "personal_moment";
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m8057e(String str, String str2) {
        if (f9j.a(str)) {
            return "moment";
        }
        if ("home_card".equals(str)) {
            return "swipe";
        }
        return ("profile_bubble".equals(str) || "messages_thumbnail_left".equals(str) || "messages_title".equals(str) || "message_ice_break_dialog".equals(str) || "conversation_view".equals(str) || "messages_cover".equals(str)) ? str2 : "profile";
    }

    /* JADX INFO: renamed from: f */
    public void m8058f(String str) {
        this.f5352f = str;
    }

    /* JADX INFO: renamed from: g */
    public void m8059g(b bVar) {
        this.f5351e.add(bVar);
    }

    /* JADX INFO: renamed from: h */
    public void m8060h(b bVar) {
        List<b> list = this.f5351e;
        if (bVar == null) {
            list.clear();
        } else {
            list.remove(bVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public String m8061i() {
        return this.f5348b;
    }

    /* JADX INFO: renamed from: j */
    public String m8062j() {
        return this.f5347a;
    }

    /* JADX INFO: renamed from: k */
    public String m8063k() {
        return this.f5350d;
    }

    /* JADX INFO: renamed from: l */
    public String m8064l(ReportCategory reportCategory) {
        switch (a.f5353a[reportCategory.ordinal()]) {
            case 1:
                return "REPORT_REASON_FAKE_ACCOUNT";
            case 2:
                return "REPORT_REASON_SPAM";
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return "REPORT_REASON_FRAUD";
            case CameraSticker.STATE_ERROR /* 4 */:
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

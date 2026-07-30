package p149l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.data.VisitorSortType;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.SuperlikeReason;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class vyc0 {

    /* JADX INFO: renamed from: l.vyc0$a */
    public static /* synthetic */ class C20761a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f183515a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            f183515a = iArr;
            try {
                iArr[VirtualCardType.FreeTrialRealUser.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f183515a[VirtualCardType.FreeTrialOnline.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f183515a[VirtualCardType.FreeTrialPopular.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m200626a(String str) {
        zvf0.m220399u("e_svip_trial_card_button", "p_suggest_users_home_view", vwb.m200311Y("each_prop", m200631f(str)));
    }

    /* JADX INFO: renamed from: b */
    public static void m200627b(String str) {
        zvf0.m220368A("e_svip_trial_card", "p_suggest_users_home_view", vwb.m200311Y("each_prop", m200631f(str)));
    }

    /* JADX INFO: renamed from: c */
    public static void m200628c() {
        zvf0.m220396r("e_yidu_trial", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: d */
    public static Privilege m200629d(String str) {
        str.getClass();
        switch (str) {
            case "online":
            case "realUser":
            case "popular":
                return Privilege.advanced_filter;
            case "haveRead":
                return Privilege.message_read_state;
            default:
                return null;
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: e */
    public static int m200630e(String str) {
        switch (str.hashCode()) {
            case -1012222381:
                if (str.equals("online")) {
                    return b3c0.f73098m;
                }
                break;
            case -860112247:
                str.equals(VisitorSortType.realUser);
                break;
            case -393940263:
                if (str.equals(SuperlikeReason.popular)) {
                    return b3c0.f73122p;
                }
                break;
            case 231250718:
                if (str.equals("haveRead")) {
                    return b3c0.f73146s;
                }
                break;
        }
        return b3c0.f73161u;
    }

    /* JADX INFO: renamed from: f */
    public static String m200631f(String str) {
        str.getClass();
        switch (str) {
            case "online":
                return "kanzaixian";
            case "realUser":
                return "real_avatar";
            case "popular":
                return "gaoyanzhi";
            case "haveRead":
                return "yidu";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m200632g(VirtualCardType virtualCardType) {
        int i = C20761a.f183515a[virtualCardType.ordinal()];
        if (i != 1) {
            return i != 2 ? SuperlikeReason.popular : "online";
        }
        return VisitorSortType.realUser;
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public static int m200633h(String str) {
        boolean zIsFemale = CoreModule.f17545c.f19639e0.m169520na().isFemale();
        switch (str.hashCode()) {
            case -1012222381:
                if (str.equals("online")) {
                    return zIsFemale ? b3c0.f73114o : b3c0.f73106n;
                }
                break;
            case -860112247:
                str.equals(VisitorSortType.realUser);
                break;
            case -393940263:
                if (str.equals(SuperlikeReason.popular)) {
                    return zIsFemale ? b3c0.f73138r : b3c0.f73130q;
                }
                break;
            case 231250718:
                if (str.equals("haveRead")) {
                    return b3c0.f73154t;
                }
                break;
        }
        return zIsFemale ? b3c0.f73175w : b3c0.f73168v;
    }

    /* JADX INFO: renamed from: i */
    public static CharSequence m200634i(String str, int i, int i2, @ColorInt int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: j */
    public static CharSequence m200635j(String str) {
        String str2 = CoreModule.f17545c.f19691v1.m205158n3(SuperlikeReason.popular).benefitCount + "";
        switch (str.hashCode()) {
            case -1012222381:
                if (str.equals("online")) {
                    return m200634i("已为你筛选" + str2 + "位最近活跃用户！", 5, str2.length() + 5, Color.parseColor("#fe7e1d"));
                }
                return "";
            case -860112247:
                if (str.equals(VisitorSortType.realUser)) {
                    return m200634i("已为你筛选" + str2 + "位真实头像用户！", 5, str2.length() + 5, Color.parseColor("#fe7e1d"));
                }
                return "";
            case -393940263:
                if (str.equals(SuperlikeReason.popular)) {
                    return m200634i("已为你筛选" + str2 + "位最受欢迎用户！", 5, str2.length() + 5, Color.parseColor("#fe7e1d"));
                }
                return "";
            case 231250718:
                str.equals("haveRead");
                return "";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m200636k(String str) {
        str.getClass();
        switch (str) {
            case "online":
                return "在线用户筛选试用完成！";
            case "realUser":
                return "真实头像用户筛选试用完成！";
            case "popular":
                return "最受欢迎用户筛选试用完成！";
            case "haveRead":
                return "查看消息是已读试用完成！";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m200637l(String str) {
        str.getClass();
        return !str.equals("haveRead") ? "" : "向已读不回说不！";
    }

    /* JADX INFO: renamed from: m */
    public static String m200638m(String str) {
        str.getClass();
        return !str.equals("haveRead") ? "" : "查看消息是否已读";
    }

    /* JADX INFO: renamed from: n */
    public static void m200639n(CoreSuggested.UserInfo userInfo) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19394a0.m221515e())) {
            Iterator it = new ArrayList(CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded).iterator();
            while (it.hasNext()) {
                if (userInfo.virtualCardType.equals(((CoreSuggested.UserInfo) it.next()).virtualCardType)) {
                    return;
                }
            }
        }
        if (NullChecker.m81303a(Act.foreground_()) && CoreModule.m29935P().m94651a().mo33477cl(Act.foreground_().f15343a.get())) {
            CoreModule.f17545c.f19663m0.m31154w6(userInfo, 1);
        } else {
            CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m200640o() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = ura.m195053e().m195057d().mo33941wl();
        userInfo.virtualCardType = VirtualCardType.FreeTrialOnline;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        m200627b("online");
        m200639n(userInfo);
    }

    /* JADX INFO: renamed from: p */
    public static void m200641p() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = ura.m195053e().m195057d().mo33941wl();
        userInfo.virtualCardType = VirtualCardType.FreeTrialPopular;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        m200627b(SuperlikeReason.popular);
        m200639n(userInfo);
    }

    /* JADX INFO: renamed from: q */
    public static void m200642q() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = ura.m195053e().m195057d().mo33941wl();
        userInfo.virtualCardType = VirtualCardType.FreeTrialRealUser;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        m200627b(VisitorSortType.realUser);
        m200639n(userInfo);
    }

    /* JADX INFO: renamed from: r */
    public static void m200643r(Act act, String str) {
        View viewInflate = o7r.m163037a(act).inflate(k6c0.f121393j, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(x4c0.f190975J)).setText(str);
        hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(act, viewInflate).m21164B(1).m21176z(CorePopLevel.FreeTrialBubble).m21169s());
    }

    /* JADX INFO: renamed from: s */
    public static void m200644s(View view, String str) {
        C4348d.m20896l().m20900k("bubble_free_trial_card_tips");
        C4345a c4345a = new C4345a(view.getContext());
        c4345a.m20847B(t100.m186890d(2.0f)).m20849D(str).m20870k(view.getContext().getResources().getColor(z0c0.f200976d)).m20871l(t100.m186890d(7.0f)).m20874p(75).m20855J(13.0f).m20861b(2000L).m20883y(true).m20875q(C4345a.f15683Q);
        C4348d.m20896l().m20909u(c4345a, view, "bubble_free_trial_card_tips");
    }

    /* JADX INFO: renamed from: t */
    public static void m200645t(Act act, String str, String str2) {
        zvf0.m220368A("e_svip_trial_start_toast", str2, vwb.m200311Y("each_prop", m200631f(str)));
        str.getClass();
        switch (str) {
            case "online":
                m200643r(act, "已优先看在线用户");
                break;
            case "realUser":
                m200643r(act, "已开启真实头像用户筛选");
                break;
            case "popular":
                m200643r(act, "已优先看最受欢迎用户");
                break;
            case "haveRead":
                m200643r(act, "查看消息是否已读已开启");
                break;
        }
    }
}

package p003l;

import android.app.Activity;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.core.data.PartialListOpt;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p000p1.mobile.putong.core.data.VisitorSortType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import l.hdb0;
import l.j760;
import l.o7r;
import l.t100;
import l.ura;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vyc0 {

    /* JADX INFO: renamed from: l.vyc0$a */
    public static /* synthetic */ class C3457a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8103a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            f8103a = iArr;
            try {
                iArr[VirtualCardType.FreeTrialRealUser.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8103a[VirtualCardType.FreeTrialOnline.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8103a[VirtualCardType.FreeTrialPopular.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10394a(String str) {
        zvf0.u("e_svip_trial_card_button", "p_suggest_users_home_view", new j760[]{vwb.Y("each_prop", m10399f(str))});
    }

    /* JADX INFO: renamed from: b */
    public static void m10395b(String str) {
        zvf0.A("e_svip_trial_card", "p_suggest_users_home_view", new j760[]{vwb.Y("each_prop", m10399f(str))});
    }

    /* JADX INFO: renamed from: c */
    public static void m10396c() {
        zvf0.r("e_yidu_trial", "p_chat_view");
    }

    /* JADX INFO: renamed from: d */
    public static Privilege m10397d(String str) {
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
    public static int m10398e(String str) {
        switch (str.hashCode()) {
            case -1012222381:
                if (str.equals("online")) {
                    return b3c0.f3201m;
                }
                break;
            case -860112247:
                str.equals(VisitorSortType.realUser);
                break;
            case -393940263:
                if (str.equals("popular")) {
                    return b3c0.f3225p;
                }
                break;
            case 231250718:
                if (str.equals("haveRead")) {
                    return b3c0.f3249s;
                }
                break;
        }
        return b3c0.f3264u;
    }

    /* JADX INFO: renamed from: f */
    public static String m10399f(String str) {
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
    public static String m10400g(VirtualCardType virtualCardType) {
        int i = C3457a.f8103a[virtualCardType.ordinal()];
        if (i != 1) {
            return i != 2 ? "popular" : "online";
        }
        return VisitorSortType.realUser;
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public static int m10401h(String str) {
        boolean zIsFemale = CoreModule.c.e0.na().isFemale();
        switch (str.hashCode()) {
            case -1012222381:
                if (str.equals("online")) {
                    return zIsFemale ? b3c0.f3217o : b3c0.f3209n;
                }
                break;
            case -860112247:
                str.equals(VisitorSortType.realUser);
                break;
            case -393940263:
                if (str.equals("popular")) {
                    return zIsFemale ? b3c0.f3241r : b3c0.f3233q;
                }
                break;
            case 231250718:
                if (str.equals("haveRead")) {
                    return b3c0.f3257t;
                }
                break;
        }
        return zIsFemale ? b3c0.f3278w : b3c0.f3271v;
    }

    /* JADX INFO: renamed from: i */
    public static CharSequence m10402i(String str, int i, int i2, @ColorInt int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: j */
    public static CharSequence m10403j(String str) {
        String str2 = CoreModule.c.v1.n3("popular").benefitCount + "";
        switch (str.hashCode()) {
            case -1012222381:
                if (str.equals("online")) {
                    return m10402i("已为你筛选" + str2 + "位最近活跃用户！", 5, str2.length() + 5, Color.parseColor("#fe7e1d"));
                }
                return "";
            case -860112247:
                if (str.equals(VisitorSortType.realUser)) {
                    return m10402i("已为你筛选" + str2 + "位真实头像用户！", 5, str2.length() + 5, Color.parseColor("#fe7e1d"));
                }
                return "";
            case -393940263:
                if (str.equals("popular")) {
                    return m10402i("已为你筛选" + str2 + "位最受欢迎用户！", 5, str2.length() + 5, Color.parseColor("#fe7e1d"));
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
    public static String m10404k(String str) {
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
    public static String m10405l(String str) {
        str.getClass();
        return !str.equals("haveRead") ? "" : "向已读不回说不！";
    }

    /* JADX INFO: renamed from: m */
    public static String m10406m(String str) {
        str.getClass();
        return !str.equals("haveRead") ? "" : "查看消息是否已读";
    }

    /* JADX INFO: renamed from: n */
    public static void m10407n(CoreSuggested.UserInfo userInfo) {
        if (NullChecker.a(CoreModule.c.m0.a0.e())) {
            Iterator it = new ArrayList(((PartialListOpt) CoreModule.c.m0.a0.e()).loaded).iterator();
            while (it.hasNext()) {
                if (userInfo.virtualCardType.equals(((CoreSuggested.UserInfo) it.next()).virtualCardType)) {
                    return;
                }
            }
        }
        if (NullChecker.a(Act.foreground_()) && CoreModule.P().a().cl((Activity) Act.foreground_().a.get())) {
            CoreModule.c.m0.w6(userInfo, 1);
        } else {
            CoreModule.c.m0.w6(userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m10408o() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = ura.e().d().wl();
        userInfo.virtualCardType = VirtualCardType.FreeTrialOnline;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        m10395b("online");
        m10407n(userInfo);
    }

    /* JADX INFO: renamed from: p */
    public static void m10409p() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = ura.e().d().wl();
        userInfo.virtualCardType = VirtualCardType.FreeTrialPopular;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        m10395b("popular");
        m10407n(userInfo);
    }

    /* JADX INFO: renamed from: q */
    public static void m10410q() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = ura.e().d().wl();
        userInfo.virtualCardType = VirtualCardType.FreeTrialRealUser;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        m10395b(VisitorSortType.realUser);
        m10407n(userInfo);
    }

    /* JADX INFO: renamed from: r */
    public static void m10411r(Act act, String str) {
        View viewInflate = o7r.a(act).inflate(k6c0.f5556j, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(x4c0.f8316J)).setText(str);
        hdb0.c().i(new SimplePushBubble.a(act, viewInflate).B(1).z(CorePopLevel.FreeTrialBubble).s());
    }

    /* JADX INFO: renamed from: s */
    public static void m10412s(View view, String str) {
        d.l().k("bubble_free_trial_card_tips");
        a aVar = new a(view.getContext());
        aVar.B(t100.d(2.0f)).D(str).k(new int[]{view.getContext().getResources().getColor(z0c0.f9165d)}).l(t100.d(7.0f)).p(75).J(13.0f).b(2000L).y(true).q(a.Q);
        d.l().u(aVar, view, "bubble_free_trial_card_tips");
    }

    /* JADX INFO: renamed from: t */
    public static void m10413t(Act act, String str, String str2) {
        zvf0.A("e_svip_trial_start_toast", str2, new j760[]{vwb.Y("each_prop", m10399f(str))});
        str.getClass();
        switch (str) {
            case "online":
                m10411r(act, "已优先看在线用户");
                break;
            case "realUser":
                m10411r(act, "已开启真实头像用户筛选");
                break;
            case "popular":
                m10411r(act, "已优先看最受欢迎用户");
                break;
            case "haveRead":
                m10411r(act, "查看消息是否已读已开启");
                break;
        }
    }
}

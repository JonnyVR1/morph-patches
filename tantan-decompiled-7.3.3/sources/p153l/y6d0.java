package p153l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.data.VisitorSortType;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.SuperlikeReason;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class y6d0 {

    /* JADX INFO: renamed from: l.y6d0$a */
    public static /* synthetic */ class C21532a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f197680a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            f197680a = iArr;
            try {
                iArr[VirtualCardType.FreeTrialRealUser.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f197680a[VirtualCardType.FreeTrialOnline.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f197680a[VirtualCardType.FreeTrialPopular.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m214462a(String str) {
        i4g0.m138523u("e_svip_trial_card_button", "p_suggest_users_home_view", jyb.m147494Y("each_prop", m214467f(str)));
    }

    /* JADX INFO: renamed from: b */
    public static void m214463b(String str) {
        i4g0.m138492A("e_svip_trial_card", "p_suggest_users_home_view", jyb.m147494Y("each_prop", m214467f(str)));
    }

    /* JADX INFO: renamed from: c */
    public static void m214464c() {
        i4g0.m138520r("e_yidu_trial", OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: renamed from: d */
    public static Privilege m214465d(String str) {
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
    public static int m214466e(String str) {
        switch (str.hashCode()) {
            case -1012222381:
                if (str.equals("online")) {
                    return gbc0.f103349m;
                }
                break;
            case -860112247:
                str.equals(VisitorSortType.realUser);
                break;
            case -393940263:
                if (str.equals(SuperlikeReason.popular)) {
                    return gbc0.f103373p;
                }
                break;
            case 231250718:
                if (str.equals("haveRead")) {
                    return gbc0.f103397s;
                }
                break;
        }
        return gbc0.f103412u;
    }

    /* JADX INFO: renamed from: f */
    public static String m214467f(String str) {
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
    public static String m214468g(VirtualCardType virtualCardType) {
        int i = C21532a.f197680a[virtualCardType.ordinal()];
        if (i != 1) {
            return i != 2 ? SuperlikeReason.popular : "online";
        }
        return VisitorSortType.realUser;
    }

    @DrawableRes
    /* JADX INFO: renamed from: h */
    public static int m214469h(String str) {
        boolean zIsFemale = CoreModule.f18264c.f20381e0.m116593na().isFemale();
        switch (str.hashCode()) {
            case -1012222381:
                if (str.equals("online")) {
                    return zIsFemale ? gbc0.f103365o : gbc0.f103357n;
                }
                break;
            case -860112247:
                str.equals(VisitorSortType.realUser);
                break;
            case -393940263:
                if (str.equals(SuperlikeReason.popular)) {
                    return zIsFemale ? gbc0.f103389r : gbc0.f103381q;
                }
                break;
            case 231250718:
                if (str.equals("haveRead")) {
                    return gbc0.f103405t;
                }
                break;
        }
        return zIsFemale ? gbc0.f103426w : gbc0.f103419v;
    }

    /* JADX INFO: renamed from: i */
    public static CharSequence m214470i(String str, int i, int i2, @ColorInt int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        return spannableStringBuilder;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: j */
    public static CharSequence m214471j(String str) {
        String str2 = CoreModule.f18264c.f20433v1.m117814n3(SuperlikeReason.popular).benefitCount + "";
        switch (str.hashCode()) {
            case -1012222381:
                if (str.equals("online")) {
                    return m214470i("已为你筛选" + str2 + "位最近活跃用户！", 5, str2.length() + 5, Color.parseColor("#fe7e1d"));
                }
                return "";
            case -860112247:
                if (str.equals(VisitorSortType.realUser)) {
                    return m214470i("已为你筛选" + str2 + "位真实头像用户！", 5, str2.length() + 5, Color.parseColor("#fe7e1d"));
                }
                return "";
            case -393940263:
                if (str.equals(SuperlikeReason.popular)) {
                    return m214470i("已为你筛选" + str2 + "位最受欢迎用户！", 5, str2.length() + 5, Color.parseColor("#fe7e1d"));
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
    public static String m214472k(String str) {
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
    public static String m214473l(String str) {
        str.getClass();
        return !str.equals("haveRead") ? "" : "向已读不回说不！";
    }

    /* JADX INFO: renamed from: m */
    public static String m214474m(String str) {
        str.getClass();
        return !str.equals("haveRead") ? "" : "查看消息是否已读";
    }

    /* JADX INFO: renamed from: n */
    public static void m214475n(CoreSuggested.UserInfo userInfo) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20136a0.m222761e())) {
            Iterator it = new ArrayList(CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded).iterator();
            while (it.hasNext()) {
                if (userInfo.virtualCardType.equals(((CoreSuggested.UserInfo) it.next()).virtualCardType)) {
                    return;
                }
            }
        }
        if (NullChecker.m82486a(Act.foreground_()) && CoreModule.m30933P().m143405a().mo34480cl(Act.foreground_().f16062a.get())) {
            CoreModule.f18264c.f20405m0.m32157w6(userInfo, 1);
        } else {
            CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m214476o() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = gta.m132210e().m132214d().mo34944wl();
        userInfo.virtualCardType = VirtualCardType.FreeTrialOnline;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        m214463b("online");
        m214475n(userInfo);
    }

    /* JADX INFO: renamed from: p */
    public static void m214477p() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = gta.m132210e().m132214d().mo34944wl();
        userInfo.virtualCardType = VirtualCardType.FreeTrialPopular;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        m214463b(SuperlikeReason.popular);
        m214475n(userInfo);
    }

    /* JADX INFO: renamed from: q */
    public static void m214478q() {
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = gta.m132210e().m132214d().mo34944wl();
        userInfo.virtualCardType = VirtualCardType.FreeTrialRealUser;
        userInfo.preSwipedDirection = SwipeDirection.LEFT;
        m214463b(VisitorSortType.realUser);
        m214475n(userInfo);
    }

    /* JADX INFO: renamed from: r */
    public static void m214479r(Act act, String str) {
        View viewInflate = p9r.m171370a(act).inflate(pec0.f152001j, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(ddc0.f87880J)).setText(str);
        llb0.m154703c().m154710i(new SimplePushBubble.C4523a(act, viewInflate).m22163B(1).m22175z(CorePopLevel.FreeTrialBubble).m22168s());
    }

    /* JADX INFO: renamed from: s */
    public static void m214480s(View view, String str) {
        C4499d.m21895l().m21899k("bubble_free_trial_card_tips");
        C4496a c4496a = new C4496a(view.getContext());
        c4496a.m21846B(qa00.m175859d(2.0f)).m21848D(str).m21869k(view.getContext().getResources().getColor(f9c0.f97859d)).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21854J(13.0f).m21860b(2000L).m21882y(true).m21874q(C4496a.f16402Q);
        C4499d.m21895l().m21908u(c4496a, view, "bubble_free_trial_card_tips");
    }

    /* JADX INFO: renamed from: t */
    public static void m214481t(Act act, String str, String str2) {
        i4g0.m138492A("e_svip_trial_start_toast", str2, jyb.m147494Y("each_prop", m214467f(str)));
        str.getClass();
        switch (str) {
            case "online":
                m214479r(act, "已优先看在线用户");
                break;
            case "realUser":
                m214479r(act, "已开启真实头像用户筛选");
                break;
            case "popular":
                m214479r(act, "已优先看最受欢迎用户");
                break;
            case "haveRead":
                m214479r(act, "查看消息是否已读已开启");
                break;
        }
    }
}

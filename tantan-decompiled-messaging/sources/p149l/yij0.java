package p149l;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.annotation.WorkerThread;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.MetaError;
import com.p046p1.mobile.putong.data.QualificationType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.DialogAct;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import p147v.VScroll;

/* JADX INFO: loaded from: classes11.dex */
public class yij0 {

    /* JADX INFO: renamed from: b */
    public static boolean f198505b;

    /* JADX INFO: renamed from: c */
    public static int f198506c;

    /* JADX INFO: renamed from: a */
    public static final Pattern f198504a = Pattern.compile("(?=[a-zA-Z0-9]+[0-9_-])[a-zA-Z0-9_-]{6,20}");

    /* JADX INFO: renamed from: d */
    public static final Pattern f198507d = m214937O();

    /* JADX INFO: renamed from: e */
    public static final Pattern f198508e = Pattern.compile("[^a-zA-Z0-9_-]");

    /* JADX INFO: renamed from: f */
    public static final Pattern f198509f = Pattern.compile("[^\\u4e00-\\u9fa5]");

    /* JADX INFO: renamed from: g */
    public static final Pattern f198510g = m214938P();

    /* JADX INFO: renamed from: h */
    public static final Pattern f198511h = Pattern.compile("^(([1-9]\\d*)(\\.\\d{1,2})?|0\\.\\d{1,2})");

    /* JADX INFO: renamed from: i */
    public static final Pattern f198512i = Pattern.compile("^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$");

    /* JADX INFO: renamed from: j */
    public static w9j<Spannable, String> f198513j = new w9j() { // from class: l.jij0
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return yij0.m214946b((Spannable) obj);
        }
    };

    /* JADX INFO: renamed from: k */
    public static w9j<Spannable, String> f198514k = new w9j() { // from class: l.mij0
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return yij0.m214947c((Spannable) obj);
        }
    };

    /* JADX INFO: renamed from: l */
    public static w9j<Spannable, String> f198515l = new w9j() { // from class: l.oij0
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return yij0.m214952h((Spannable) obj);
        }
    };

    /* JADX INFO: renamed from: m */
    public static int f198516m = -1;

    /* JADX INFO: renamed from: A */
    public static Date m214923A() {
        return m214957m(0);
    }

    /* JADX INFO: renamed from: B */
    public static void m214924B(int i, Throwable th) {
        if (i == 40042) {
            lsi0.m151578h(R$string.f17395X1);
            return;
        }
        if (i == 40045) {
            lsi0.m151580j("对方已注销");
            return;
        }
        if (i == 40044) {
            lsi0.m151580j("注意：对方账号异常，暂时不能回复你的消息");
            return;
        }
        if (i == 40041) {
            qib0.f154714c0.mo97505R3(th);
            return;
        }
        if (i == 40099) {
            lsi0.m151580j("您输入的内容违规，请修改");
        } else if (th.getMessage() == null) {
            m214929G(th);
        } else {
            lsi0.m151578h(R$string.f17325G);
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: C */
    public static String m214925C(Throwable th) {
        Meta meta;
        List<MetaError> list;
        try {
            if (th instanceof TantanException.ServerException) {
                TantanException.ServerException serverException = (TantanException.ServerException) th;
                if (serverException.code != 503 || (meta = serverException.meta) == null || (list = meta.errors) == null || list.size() <= 0 || TextUtils.isEmpty(serverException.meta.errors.get(0).message)) {
                    lsi0.m151578h(R$string.f17325G);
                    return "server else";
                }
                if (Act.foreground_() == null || f198516m == Act.sessionCount()) {
                    return null;
                }
                f198516m = Act.sessionCount();
                Application application = App.f15369e;
                application.startActivity(DialogAct.m79377O0(application, 1, serverException.meta.errors.get(0).message));
                return "server error with message";
            }
            if (xck0.m208122c(th, ApiExcep.ClientExpired.class)) {
                zvf0.m220369B("e_auto_logout", "", j760.m140076a("logout_type", "forced_update"));
                m214966v();
                return "client expired";
            }
            if (xck0.m208122c(th, SSLPeerUnverifiedException.class)) {
                lsi0.m151584n(R$string.f17321F);
                m214939Q();
                return "ssl peer unverified";
            }
            if (xck0.m208122c(th, EOFException.class)) {
                lsi0.m151584n(R$string.f17321F);
                return "eof";
            }
            if (xck0.m208122c(th, SSLHandshakeException.class)) {
                lsi0.m151584n(R$string.f17321F);
                return "ssl handshake";
            }
            if (xck0.m208122c(th, SSLException.class)) {
                lsi0.m151584n(R$string.f17321F);
                return "ssl";
            }
            if (xck0.m208122c(th, SocketTimeoutException.class)) {
                lsi0.m151584n(R$string.f17321F);
                return "socket timeout";
            }
            if (xck0.m208122c(th, UnknownHostException.class)) {
                lsi0.m151584n(R$string.f17321F);
                return "unknown host";
            }
            if (xck0.m208122c(th, ApiExcep.Client.UnprocessableEntity.class)) {
                lsi0.m151579i(R$string.f17329H, true);
                return "unprocessable entity";
            }
            if (xck0.m208122c(th, ConnectException.class)) {
                lsi0.m151584n(R$string.f17321F);
                return "connect";
            }
            if (xck0.m208122c(th, ProtocolException.class)) {
                lsi0.m151584n(R$string.f17321F);
                return "protocol exception";
            }
            if (xck0.m208122c(th, SocketException.class)) {
                lsi0.m151584n(R$string.f17321F);
                return "socket exception";
            }
            if (xck0.m208122c(th, IOException.class)) {
                return null;
            }
            if (xck0.m208122c(th, ApiExcep.Client.Unauthorized.class)) {
                zvf0.m220369B("e_auto_logout", "", j760.m140076a("logout_type", "401_exception"));
                m214933K();
                return "network unauthorized";
            }
            if (xck0.m208122c(th, ApiExcep.Client.TooManyRequests.class)) {
                lsi0.m151578h(R$string.f17325G);
                return "too many requests";
            }
            if (!xck0.m208122c(th, TantanException.Client.AccountService.class)) {
                if (xck0.m208122c(th, ApiExcep.Client.NotFound.class) || xck0.m208122c(th, ShareHelper.PlatformNotFoundException.class)) {
                    return "";
                }
                return null;
            }
            if (((TantanException.Client.AccountService) th).code != 40026) {
                return "";
            }
            zvf0.m220369B("e_auto_logout", "", j760.m140076a("logout_type", "401_exception"));
            m214933K();
            return "invalid access token";
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m214926D(Throwable th) {
        m214928F(th);
    }

    /* JADX INFO: renamed from: E */
    public static Throwable m214927E(Throwable th) {
        String strM214925C = m214925C(th);
        if (!TextUtils.isEmpty(strM214925C)) {
            return new App.HandledGlobally(th);
        }
        if (strM214925C == null) {
            xck0.m208122c(th, App.HandledGlobally.class);
        }
        return th;
    }

    /* JADX INFO: renamed from: F */
    public static void m214928F(Throwable th) {
        try {
            if (th instanceof App.HandledGlobally) {
                return;
            }
            if (xck0.m208122c(th, ApiExcep.ClientExpired.class)) {
                zvf0.m220369B("e_auto_logout", "", j760.m140076a("logout_type", "forced_update"));
                m214966v();
                return;
            }
            if (th instanceof IOException) {
                lsi0.m151584n(R$string.f17321F);
                return;
            }
            if (!(th instanceof TantanException.Client.AccountService)) {
                if (th instanceof TantanException.Client.CoreService) {
                    m214924B(((TantanException.Client.CoreService) th).code, th);
                    return;
                }
                if (th instanceof ShareHelper.PlatformNotFoundException) {
                    lsi0.m151578h(R$string.f17408a2);
                    return;
                } else if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked()) {
                    lsi0.m151578h(R$string.f17386V0);
                    return;
                } else {
                    m214929G(th);
                    return;
                }
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                m214929G(th);
                return;
            }
            if (i == 40064) {
                osi0.m165782f(R$string.f17393X);
                return;
            }
            String strM214956l = m214956l(i);
            if (strM214956l == null) {
                m214929G(th);
            } else {
                lsi0.m151581k(strM214956l, true);
            }
        } catch (Exception unused) {
            m214929G(th);
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m214929G(Throwable th) {
        if (m214930H(th)) {
            return;
        }
        lsi0.m151578h(R$string.f17369R);
        CrashHelper.m81296c(th);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m214930H(Throwable th) {
        return (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).hasHandle;
    }

    /* JADX INFO: renamed from: I */
    public static int m214931I(TextView textView) {
        try {
            return Integer.parseInt(vwb.m200345q(textView.getText().toString()));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m214932J(QualificationType qualificationType) {
        if (qualificationType == null) {
            return false;
        }
        return TEnum.equals(qualificationType, QualificationType.BACHELOR) || TEnum.equals(qualificationType, QualificationType.MASTER) || TEnum.equals(qualificationType, QualificationType.DOCTOR);
    }

    /* JADX INFO: renamed from: K */
    public static void m214933K() {
        e51.m114748M(new Runnable() { // from class: l.rij0
            @Override // java.lang.Runnable
            public final void run() {
                yij0.m214953i();
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static String m214934L(String str) {
        if (TextUtils.isEmpty(str)) {
            return App.f15369e.getString(R$string.f17433f2);
        }
        if (User.ILLEGAL_NAME_PATTERN().matcher(str).matches()) {
            return App.f15369e.getString(R$string.f17443h2);
        }
        if ((!User.NAME_PATTERN().matcher(str).matches() || str.contains("ㅤ")) && !User.ThAI_NAME_PATTERN().matcher(str).matches()) {
            return App.f15369e.getString(R$string.f17438g2);
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public static String m214935M(TextView textView) {
        return vwb.m200345q(textView.getText().toString());
    }

    /* JADX INFO: renamed from: N */
    public static Date m214936N() {
        return "ko".equals(Locale.getDefault().getLanguage()) ? m214958n(User.AGE_MAX_KOREAN, false) : m214957m(User.AGE_MAX);
    }

    /* JADX INFO: renamed from: O */
    public static final Pattern m214937O() {
        return Pattern.compile(vwb.m200308V(new String[]{"V\\W*X", "w\\W*e\\W*c\\W*h\\W*a\\W*t", "w\\W*e\\W*i\\W*x\\W*i\\W*n", "w\\W*x", "q\\W*q", "微\\W*信", "w\\W*x\\W*i\\W*n", "v\\W*x\\W*i\\W*n", "w\\W*信", "v\\W*信"}, "|"), 2);
    }

    /* JADX INFO: renamed from: P */
    public static final Pattern m214938P() {
        return Pattern.compile(vwb.m200308V(new String[]{"南宫", "王久", "jiafen", "加粉", "赚法", "主任", "委员", "空调", "中介", "沙县", "妗子", "卑鄙", "专线", "粪", "师傅", "老师", "保姆", "阿姨", "博士", "律师", "医生", "大哥", "大姐", "爸", "爹", "妈", "媽", "父", "母", "麻麻", "姑", "姨", "叔", "伯", "舅", "爷", "奶", "婶", "嫂", "姥", "妻", "公公", "婆", "媳", "免费", "办", "肉", "包子", "饺", "饭", "警", "部长", "市长", "省长", "区长", "县长", "书记", "处长", "科长", "队长", "院长", "市政", "局长", "校长", "餐厅", "娘娘"}, "|"), 2);
    }

    /* JADX INFO: renamed from: Q */
    public static void m214939Q() {
        int i = f198506c + 1;
        f198506c = i;
        if (i < 10) {
            return;
        }
        Act.foreground().take(1).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.sij0
            @Override // p149l.e30
            public final void call(Object obj) {
                yij0.m214951g((Act.C4299r) obj);
            }
        }, new e30() { // from class: l.tij0
            @Override // p149l.e30
            public final void call(Object obj) {
                yij0.m214955k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public static void m214940R(Act act) {
        act.overridePendingTransition(qzb0.f157025f, qzb0.f157026g);
    }

    /* JADX INFO: renamed from: S */
    public static void m214941S(Act act) {
        act.overridePendingTransition(qzb0.f157027h, qzb0.f157028i);
    }

    /* JADX INFO: renamed from: T */
    public static boolean m214942T(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Checkable) {
                Checkable checkable = (Checkable) childAt;
                checkable.toggle();
                return checkable.isChecked();
            }
        }
        qkq0.m175383a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static void m214943U(c4g0 c4g0Var) {
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            return;
        }
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: V */
    public static Date m214944V() {
        int i = User.AGE_MIN_GOOGLEPLAY;
        if ("ko".equals(Locale.getDefault().getLanguage())) {
            i = User.AGE_MIN_KOREAN;
        }
        return m214957m(i);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m214945a(Activity activity, View view) {
        hfw.m130790a("showMaybeNeedsUpdateDialog", "click to app market");
        try {
            vuw.m200138d(activity);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m214946b(Spannable spannable) {
        List<Point> listM214967w = m214967w(spannable.toString());
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spannable.getSpans(0, spannable.length(), BackgroundColorSpan.class)) {
            spannable.removeSpan(backgroundColorSpan);
        }
        if (listM214967w.size() == 0) {
            return null;
        }
        for (Point point : listM214967w) {
            spannable.setSpan(new BackgroundColorSpan(-26164), point.x, point.y, 0);
        }
        return App.f15369e.getString(R$string.f17351M1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m214947c(Spannable spannable) {
        if (!TextUtils.isEmpty(spannable) && f198508e.matcher(spannable).find()) {
            return App.f15369e.getString(R$string.f17355N1);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m214948d(Integer num) {
        return "*";
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m214949e(Act act, VScroll vScroll) {
        int measuredHeight = act.getWindow().getDecorView().getMeasuredHeight() - vScroll.getHeight();
        if (measuredHeight > 0) {
            vScroll.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m214950f(DialogInterface dialogInterface) {
        f198506c = 0;
        f198505b = false;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m214951g(Act.C4299r c4299r) {
        final Activity activity;
        if (f198505b || c4299r == null || (activity = c4299r.f15343a.get()) == null) {
            return;
        }
        f198505b = true;
        new xh0.C21150a(activity).m208728g(true).m208740s(activity.getString(R$string.f17316D2)).m208730i(R$string.f17458k2).m208738q(R$string.f17463l2).m208726e(R$string.f17405a).m208734m(new DialogInterface.OnDismissListener() { // from class: l.uij0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                yij0.m214950f(dialogInterface);
            }
        }).m208736o(new View.OnClickListener() { // from class: l.vij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yij0.m214945a(activity, view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m214952h(Spannable spannable) {
        if (TextUtils.isEmpty(spannable) || f198511h.matcher(spannable).matches()) {
            return null;
        }
        return App.f15369e.getString(R$string.f17419c3);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m214953i() {
        if (qib0.f154714c0.signedIn_()) {
            lsi0.m151578h(R$string.f17305B);
            qib0.m174805Z0(false, false);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m214954j(Integer num) {
        return "*";
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m214955k(Throwable th) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX INFO: renamed from: l */
    public static String m214956l(int i) {
        int i2;
        switch (i) {
            case 40007:
                i2 = R$string.f17438g2;
                break;
            case TantanException.Client.AccountService.SHORT_PASSWORD /* 40008 */:
                i2 = R$string.f17333I;
                break;
            case 40009:
                i2 = R$string.f17309C;
                break;
            case 40010:
                i2 = R$string.f17349M;
                break;
            case 40011:
                i2 = R$string.f17361P;
                break;
            case TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL /* 40012 */:
                i2 = R$string.f17318E0;
                break;
            case 40013:
                i2 = R$string.f17345L;
                break;
            case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                i2 = R$string.f17353N;
                break;
            case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                i2 = R$string.f17341K;
                break;
            default:
                switch (i) {
                    case TantanException.Client.CoreService.MATCH_HAS_EXISTED /* 40018 */:
                        break;
                    case TantanException.Client.AccountService.ACCOUNT_DELETE /* 40019 */:
                        i2 = R$string.f17529z;
                        break;
                    case TantanException.Client.AccountService.INACTIVATED /* 40020 */:
                        i2 = R$string.f17301A;
                        break;
                    case TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD /* 40021 */:
                        i2 = R$string.f17337J;
                        break;
                    default:
                        switch (i) {
                            case TantanException.Client.AccountService.BIND_PHONE_ALREADY_REGISTERED /* 40060 */:
                                i2 = R$string.f17424d3;
                                break;
                            case TantanException.Client.AccountService.ERROR_ACCOUNT_CHANGE_PHONE_FORBIDDEN /* 40063 */:
                                i2 = R$string.f17525y;
                                break;
                            case TantanException.Client.AccountService.INACTIVATED_15DAYS /* 40091 */:
                                i2 = R$string.f17301A;
                                break;
                            case 40095:
                                i2 = R$string.f17424d3;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                        break;
                }
            case TantanException.Client.AccountService.CHINA_MOBILE_NOT_SIGN_UP /* 40016 */:
                i2 = R$string.f17357O;
                break;
        }
        if (i2 == 0) {
            return null;
        }
        return App.f15369e.getResources().getString(i2);
    }

    /* JADX INFO: renamed from: m */
    public static Date m214957m(int i) {
        GregorianCalendar gregorianCalendar = Converter.CALENDAR.get();
        gregorianCalendar.setTimeInMillis(qib0.f154693H.guessedCurrentServerTime());
        gregorianCalendar.set(1, gregorianCalendar.get(1) - i);
        gregorianCalendar.set(10, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return new Date(gregorianCalendar.getTimeInMillis());
    }

    /* JADX INFO: renamed from: n */
    public static Date m214958n(int i, boolean z) {
        GregorianCalendar gregorianCalendar = Converter.CALENDAR.get();
        gregorianCalendar.setTimeInMillis(qib0.f154693H.guessedCurrentServerTime());
        gregorianCalendar.set(1, gregorianCalendar.get(1) - i);
        gregorianCalendar.set(2, z ? 12 : 0);
        gregorianCalendar.set(5, !z ? 1 : 0);
        gregorianCalendar.set(10, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return new Date(gregorianCalendar.getTimeInMillis());
    }

    /* JADX INFO: renamed from: o */
    public static Bitmap m214959o(Bitmap bitmap, int i, int i2) {
        Bitmap bitmapM109969a = d43.m109969a(bitmap, i2, true);
        new Canvas(bitmapM109969a).drawColor(i);
        return bitmapM109969a;
    }

    /* JADX INFO: renamed from: p */
    public static Bitmap m214960p(Bitmap bitmap, int i, int i2, int i3) {
        return m214961q(bitmap, i, i2, i3, t100.m186890d(12.0f));
    }

    @WorkerThread
    /* JADX INFO: renamed from: q */
    public static Bitmap m214961q(Bitmap bitmap, int i, int i2, int i3, int i4) {
        if (!NullChecker.m81303a(bitmap)) {
            return null;
        }
        if (bitmap.getWidth() >= 4 && bitmap.getHeight() >= 4) {
            float f = i2;
            float f2 = i;
            boolean z = (f * 1.0f) / f2 > (((float) bitmap.getHeight()) * 1.0f) / ((float) bitmap.getWidth());
            float fMax = Math.max(Math.min(Math.min(1.0f, Math.min((bitmap.getWidth() * 1.0f) / f2, (bitmap.getHeight() * 1.0f) / f)), 0.5f), (0.25f / Math.max(i4, 2)) * 2.0f);
            if (!z) {
                int i5 = (int) (fMax * f2);
                int iMax = Math.max((i5 / 4) * 4, i5);
                float f3 = (iMax * 1.0f) / f2;
                if (bitmap.getWidth() * f3 >= 4.0f && bitmap.getHeight() * f3 >= 4.0f && iMax != bitmap.getWidth()) {
                    Matrix matrix = new Matrix();
                    matrix.setScale(f3, f3);
                    bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                }
                fMax = f3;
            }
            float fMax2 = Math.max(i4 * fMax, 2.0f);
            if (fMax2 > 25.0f) {
                fMax2 = 25.0f;
            }
            bitmap = d43.m109969a(bitmap, Math.round(fMax2), true);
            if (!bitmap.isMutable()) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
            new Canvas(bitmap).drawColor(i3);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: r */
    public static Animator m214962r(View view) {
        return bt0.m103746s(bt0.m103739l(view, bt0.f77162i, 0L, 200L, new DecelerateInterpolator(), 1.0f, 1.2f), bt0.m103739l(view, bt0.f77162i, 0L, 300L, new AccelerateDecelerateInterpolator(), 0.84f), bt0.m103739l(view, bt0.f77162i, 0L, 200L, new AccelerateDecelerateInterpolator(), 1.0f));
    }

    /* JADX INFO: renamed from: s */
    public static void m214963s(final Act act, final VScroll vScroll) {
        e51.m114743H(act, new Runnable() { // from class: l.qij0
            @Override // java.lang.Runnable
            public final void run() {
                yij0.m214949e(act, vScroll);
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m214964t(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Checkable) {
                Checkable checkable = (Checkable) childAt;
                checkable.setChecked(z);
                return checkable.isChecked();
            }
        }
        qkq0.m175383a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m214965u(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Checkable) {
                return ((Checkable) childAt).isChecked();
            }
        }
        qkq0.m175383a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static void m214966v() {
        qib0.f154714c0.clientNeedsForceUpdate();
    }

    /* JADX INFO: renamed from: w */
    public static List<Point> m214967w(String str) {
        return vwb.m200352x(vwb.m200316b0(f198504a.matcher(str)), vwb.m200316b0(f198507d.matcher(str)));
    }

    /* JADX INFO: renamed from: x */
    public static List<Point> m214968x(String str) {
        return vwb.m200352x(vwb.m200316b0(f198507d.matcher(str)));
    }

    /* JADX INFO: renamed from: y */
    public static String m214969y(String str) {
        String[] strArrSplit = str.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        String str2 = strArrSplit[strArrSplit.length - 1];
        if (str2.length() <= 5) {
            return vwb.m200307U(vwb.m200303Q(vwb.m200314a0(str2.length()), new w9j() { // from class: l.wij0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return yij0.m214954j((Integer) obj);
                }
            }), "");
        }
        return str2.substring(0, 3) + vwb.m200307U(vwb.m200303Q(vwb.m200314a0(str2.length() - 5), new w9j() { // from class: l.lij0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return yij0.m214948d((Integer) obj);
            }
        }), "") + str2.substring(str2.length() - 2);
    }

    /* JADX INFO: renamed from: z */
    public static int m214970z(Throwable th) {
        if (th instanceof ApiExcep) {
            return ((ApiExcep) th).response.m118609q();
        }
        return 0;
    }
}

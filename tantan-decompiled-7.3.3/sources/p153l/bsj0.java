package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.MetaError;
import com.p051p1.mobile.putong.data.QualificationType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.DialogAct;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
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
import p151v.VScroll;

/* JADX INFO: loaded from: classes10.dex */
public class bsj0 {

    /* JADX INFO: renamed from: b */
    public static boolean f78162b;

    /* JADX INFO: renamed from: c */
    public static int f78163c;

    /* JADX INFO: renamed from: a */
    public static final Pattern f78161a = Pattern.compile("(?=[a-zA-Z0-9]+[0-9_-])[a-zA-Z0-9_-]{6,20}");

    /* JADX INFO: renamed from: d */
    public static final Pattern f78164d = m106257O();

    /* JADX INFO: renamed from: e */
    public static final Pattern f78165e = Pattern.compile("[^a-zA-Z0-9_-]");

    /* JADX INFO: renamed from: f */
    public static final Pattern f78166f = Pattern.compile("[^\\u4e00-\\u9fa5]");

    /* JADX INFO: renamed from: g */
    public static final Pattern f78167g = m106258P();

    /* JADX INFO: renamed from: h */
    public static final Pattern f78168h = Pattern.compile("^(([1-9]\\d*)(\\.\\d{1,2})?|0\\.\\d{1,2})");

    /* JADX INFO: renamed from: i */
    public static final Pattern f78169i = Pattern.compile("^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$");

    /* JADX INFO: renamed from: j */
    public static qcj<Spannable, String> f78170j = new qcj() { // from class: l.mrj0
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return bsj0.m106266b((Spannable) obj);
        }
    };

    /* JADX INFO: renamed from: k */
    public static qcj<Spannable, String> f78171k = new qcj() { // from class: l.prj0
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return bsj0.m106267c((Spannable) obj);
        }
    };

    /* JADX INFO: renamed from: l */
    public static qcj<Spannable, String> f78172l = new qcj() { // from class: l.rrj0
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return bsj0.m106272h((Spannable) obj);
        }
    };

    /* JADX INFO: renamed from: m */
    public static int f78173m = -1;

    /* JADX INFO: renamed from: A */
    public static Date m106243A() {
        return m106277m(0);
    }

    /* JADX INFO: renamed from: B */
    public static void m106244B(int i, Throwable th) {
        if (i == 40042) {
            o1j0.m165634h(R$string.f18114X1);
            return;
        }
        if (i == 40045) {
            o1j0.m165636j("对方已注销");
            return;
        }
        if (i == 40044) {
            o1j0.m165636j("注意：对方账号异常，暂时不能回复你的消息");
            return;
        }
        if (i == 40041) {
            uqb0.f180397c0.mo105294R3(th);
            return;
        }
        if (i == 40099) {
            o1j0.m165636j("您输入的内容违规，请修改");
        } else if (th.getMessage() == null) {
            m106249G(th);
        } else {
            o1j0.m165634h(R$string.f18044G);
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: C */
    public static String m106245C(Throwable th) {
        Meta meta;
        List<MetaError> list;
        try {
            if (th instanceof TantanException.ServerException) {
                TantanException.ServerException serverException = (TantanException.ServerException) th;
                if (serverException.code != 503 || (meta = serverException.meta) == null || (list = meta.errors) == null || list.size() <= 0 || TextUtils.isEmpty(serverException.meta.errors.get(0).message)) {
                    o1j0.m165634h(R$string.f18044G);
                    return "server else";
                }
                if (Act.foreground_() == null || f78173m == Act.sessionCount()) {
                    return null;
                }
                f78173m = Act.sessionCount();
                Application application = App.f16088e;
                application.startActivity(DialogAct.m80560P0(application, 1, serverException.meta.errors.get(0).message));
                return "server error with message";
            }
            if (dmk0.m116964c(th, ApiExcep.ClientExpired.class)) {
                i4g0.m138493B("e_auto_logout", "", pf60.m172085a("logout_type", "forced_update"));
                m106286v();
                return "client expired";
            }
            if (dmk0.m116964c(th, SSLPeerUnverifiedException.class)) {
                o1j0.m165640n(R$string.f18040F);
                m106259Q();
                return "ssl peer unverified";
            }
            if (dmk0.m116964c(th, EOFException.class)) {
                o1j0.m165640n(R$string.f18040F);
                return "eof";
            }
            if (dmk0.m116964c(th, SSLHandshakeException.class)) {
                o1j0.m165640n(R$string.f18040F);
                return "ssl handshake";
            }
            if (dmk0.m116964c(th, SSLException.class)) {
                o1j0.m165640n(R$string.f18040F);
                return "ssl";
            }
            if (dmk0.m116964c(th, SocketTimeoutException.class)) {
                o1j0.m165640n(R$string.f18040F);
                return "socket timeout";
            }
            if (dmk0.m116964c(th, UnknownHostException.class)) {
                o1j0.m165640n(R$string.f18040F);
                return "unknown host";
            }
            if (dmk0.m116964c(th, ApiExcep.Client.UnprocessableEntity.class)) {
                o1j0.m165635i(R$string.f18048H, true);
                return "unprocessable entity";
            }
            if (dmk0.m116964c(th, ConnectException.class)) {
                o1j0.m165640n(R$string.f18040F);
                return "connect";
            }
            if (dmk0.m116964c(th, ProtocolException.class)) {
                o1j0.m165640n(R$string.f18040F);
                return "protocol exception";
            }
            if (dmk0.m116964c(th, SocketException.class)) {
                o1j0.m165640n(R$string.f18040F);
                return "socket exception";
            }
            if (dmk0.m116964c(th, IOException.class)) {
                return null;
            }
            if (dmk0.m116964c(th, ApiExcep.Client.Unauthorized.class)) {
                i4g0.m138493B("e_auto_logout", "", pf60.m172085a("logout_type", "401_exception"));
                m106253K();
                return "network unauthorized";
            }
            if (dmk0.m116964c(th, ApiExcep.Client.TooManyRequests.class)) {
                o1j0.m165634h(R$string.f18044G);
                return "too many requests";
            }
            if (!dmk0.m116964c(th, TantanException.Client.AccountService.class)) {
                if (dmk0.m116964c(th, ApiExcep.Client.NotFound.class) || dmk0.m116964c(th, ShareHelper.PlatformNotFoundException.class)) {
                    return "";
                }
                return null;
            }
            if (((TantanException.Client.AccountService) th).code != 40026) {
                return "";
            }
            i4g0.m138493B("e_auto_logout", "", pf60.m172085a("logout_type", "401_exception"));
            m106253K();
            return "invalid access token";
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m106246D(Throwable th) {
        m106248F(th);
    }

    /* JADX INFO: renamed from: E */
    public static Throwable m106247E(Throwable th) {
        String strM106245C = m106245C(th);
        if (!TextUtils.isEmpty(strM106245C)) {
            return new App.HandledGlobally(th);
        }
        if (strM106245C == null) {
            dmk0.m116964c(th, App.HandledGlobally.class);
        }
        return th;
    }

    /* JADX INFO: renamed from: F */
    public static void m106248F(Throwable th) {
        try {
            if (th instanceof App.HandledGlobally) {
                return;
            }
            if (dmk0.m116964c(th, ApiExcep.ClientExpired.class)) {
                i4g0.m138493B("e_auto_logout", "", pf60.m172085a("logout_type", "forced_update"));
                m106286v();
                return;
            }
            if (th instanceof IOException) {
                o1j0.m165640n(R$string.f18040F);
                return;
            }
            if (!(th instanceof TantanException.Client.AccountService)) {
                if (th instanceof TantanException.Client.CoreService) {
                    m106244B(((TantanException.Client.CoreService) th).code, th);
                    return;
                }
                if (th instanceof ShareHelper.PlatformNotFoundException) {
                    o1j0.m165634h(R$string.f18127a2);
                    return;
                } else if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked()) {
                    o1j0.m165634h(R$string.f18105V0);
                    return;
                } else {
                    m106249G(th);
                    return;
                }
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                m106249G(th);
                return;
            }
            if (i == 40064) {
                r1j0.m179419f(R$string.f18112X);
                return;
            }
            String strM106276l = m106276l(i);
            if (strM106276l == null) {
                m106249G(th);
            } else {
                o1j0.m165637k(strM106276l, true);
            }
        } catch (Exception unused) {
            m106249G(th);
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m106249G(Throwable th) {
        if (m106250H(th)) {
            return;
        }
        o1j0.m165634h(R$string.f18088R);
        CrashHelper.m82479c(th);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m106250H(Throwable th) {
        return (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).hasHandle;
    }

    /* JADX INFO: renamed from: I */
    public static int m106251I(TextView textView) {
        try {
            return Integer.parseInt(jyb.m147528q(textView.getText().toString()));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m106252J(QualificationType qualificationType) {
        if (qualificationType == null) {
            return false;
        }
        return TEnum.equals(qualificationType, QualificationType.BACHELOR) || TEnum.equals(qualificationType, QualificationType.MASTER) || TEnum.equals(qualificationType, QualificationType.DOCTOR);
    }

    /* JADX INFO: renamed from: K */
    public static void m106253K() {
        l51.m152893M(new Runnable() { // from class: l.urj0
            @Override // java.lang.Runnable
            public final void run() {
                bsj0.m106273i();
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static String m106254L(String str) {
        if (TextUtils.isEmpty(str)) {
            return App.f16088e.getString(R$string.f18152f2);
        }
        if (User.ILLEGAL_NAME_PATTERN().matcher(str).matches()) {
            return App.f16088e.getString(R$string.f18162h2);
        }
        if ((!User.NAME_PATTERN().matcher(str).matches() || str.contains("ㅤ")) && !User.ThAI_NAME_PATTERN().matcher(str).matches()) {
            return App.f16088e.getString(R$string.f18157g2);
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public static String m106255M(TextView textView) {
        return jyb.m147528q(textView.getText().toString());
    }

    /* JADX INFO: renamed from: N */
    public static Date m106256N() {
        return "ko".equals(Locale.getDefault().getLanguage()) ? m106278n(User.AGE_MAX_KOREAN, false) : m106277m(User.AGE_MAX);
    }

    /* JADX INFO: renamed from: O */
    public static final Pattern m106257O() {
        return Pattern.compile(jyb.m147491V(new String[]{"V\\W*X", "w\\W*e\\W*c\\W*h\\W*a\\W*t", "w\\W*e\\W*i\\W*x\\W*i\\W*n", "w\\W*x", "q\\W*q", "微\\W*信", "w\\W*x\\W*i\\W*n", "v\\W*x\\W*i\\W*n", "w\\W*信", "v\\W*信"}, "|"), 2);
    }

    /* JADX INFO: renamed from: P */
    public static final Pattern m106258P() {
        return Pattern.compile(jyb.m147491V(new String[]{"南宫", "王久", "jiafen", "加粉", "赚法", "主任", "委员", "空调", "中介", "沙县", "妗子", "卑鄙", "专线", "粪", "师傅", "老师", "保姆", "阿姨", "博士", "律师", "医生", "大哥", "大姐", "爸", "爹", "妈", "媽", "父", "母", "麻麻", "姑", "姨", "叔", "伯", "舅", "爷", "奶", "婶", "嫂", "姥", "妻", "公公", "婆", "媳", "免费", "办", "肉", "包子", "饺", "饭", "警", "部长", "市长", "省长", "区长", "县长", "书记", "处长", "科长", "队长", "院长", "市政", "局长", "校长", "餐厅", "娘娘"}, "|"), 2);
    }

    /* JADX INFO: renamed from: Q */
    public static void m106259Q() {
        int i = f78163c + 1;
        f78163c = i;
        if (i < 10) {
            return;
        }
        Act.foreground().take(1).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.vrj0
            @Override // p153l.y20
            public final void call(Object obj) {
                bsj0.m106271g((Act.C4450r) obj);
            }
        }, new y20() { // from class: l.wrj0
            @Override // p153l.y20
            public final void call(Object obj) {
                bsj0.m106275k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public static void m106260R(Act act) {
        act.overridePendingTransition(w7c0.f187736f, w7c0.f187737g);
    }

    /* JADX INFO: renamed from: S */
    public static void m106261S(Act act) {
        act.overridePendingTransition(w7c0.f187738h, w7c0.f187739i);
    }

    /* JADX INFO: renamed from: T */
    public static boolean m106262T(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Checkable) {
                Checkable checkable = (Checkable) childAt;
                checkable.toggle();
                return checkable.isChecked();
            }
        }
        wtq0.m207906a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static void m106263U(kcg0 kcg0Var) {
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            return;
        }
        kcg0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: V */
    public static Date m106264V() {
        int i = User.AGE_MIN_GOOGLEPLAY;
        if ("ko".equals(Locale.getDefault().getLanguage())) {
            i = User.AGE_MIN_KOREAN;
        }
        return m106277m(i);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m106265a(Activity activity, View view) {
        fhw.m125605a("showMaybeNeedsUpdateDialog", "click to app market");
        try {
            uxw.m198548d(activity);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m106266b(Spannable spannable) {
        List<Point> listM106287w = m106287w(spannable.toString());
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spannable.getSpans(0, spannable.length(), BackgroundColorSpan.class)) {
            spannable.removeSpan(backgroundColorSpan);
        }
        if (listM106287w.size() == 0) {
            return null;
        }
        for (Point point : listM106287w) {
            spannable.setSpan(new BackgroundColorSpan(-26164), point.x, point.y, 0);
        }
        return App.f16088e.getString(R$string.f18070M1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m106267c(Spannable spannable) {
        if (!TextUtils.isEmpty(spannable) && f78165e.matcher(spannable).find()) {
            return App.f16088e.getString(R$string.f18074N1);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m106268d(Integer num) {
        return "*";
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m106269e(Act act, VScroll vScroll) {
        int measuredHeight = act.getWindow().getDecorView().getMeasuredHeight() - vScroll.getHeight();
        if (measuredHeight > 0) {
            vScroll.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m106270f(DialogInterface dialogInterface) {
        f78163c = 0;
        f78162b = false;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m106271g(Act.C4450r c4450r) {
        final Activity activity;
        if (f78162b || c4450r == null || (activity = c4450r.f16062a.get()) == null) {
            return;
        }
        f78162b = true;
        new th0.C20312a(activity).m191148g(true).m191160s(activity.getString(R$string.f18035D2)).m191150i(R$string.f18177k2).m191158q(R$string.f18182l2).m191146e(R$string.f18124a).m191154m(new DialogInterface.OnDismissListener() { // from class: l.xrj0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bsj0.m106270f(dialogInterface);
            }
        }).m191156o(new View.OnClickListener() { // from class: l.yrj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bsj0.m106265a(activity, view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m106272h(Spannable spannable) {
        if (TextUtils.isEmpty(spannable) || f78168h.matcher(spannable).matches()) {
            return null;
        }
        return App.f16088e.getString(R$string.f18138c3);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m106273i() {
        if (uqb0.f180397c0.signedIn_()) {
            o1j0.m165634h(R$string.f18024B);
            uqb0.m197259Z0(false, false);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m106274j(Integer num) {
        return "*";
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m106275k(Throwable th) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX INFO: renamed from: l */
    public static String m106276l(int i) {
        int i2;
        switch (i) {
            case 40007:
                i2 = R$string.f18157g2;
                break;
            case TantanException.Client.AccountService.SHORT_PASSWORD /* 40008 */:
                i2 = R$string.f18052I;
                break;
            case 40009:
                i2 = R$string.f18028C;
                break;
            case 40010:
                i2 = R$string.f18068M;
                break;
            case 40011:
                i2 = R$string.f18080P;
                break;
            case TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL /* 40012 */:
                i2 = R$string.f18037E0;
                break;
            case 40013:
                i2 = R$string.f18064L;
                break;
            case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                i2 = R$string.f18072N;
                break;
            case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                i2 = R$string.f18060K;
                break;
            default:
                switch (i) {
                    case TantanException.Client.CoreService.MATCH_HAS_EXISTED /* 40018 */:
                        break;
                    case TantanException.Client.AccountService.ACCOUNT_DELETE /* 40019 */:
                        i2 = R$string.f18248z;
                        break;
                    case TantanException.Client.AccountService.INACTIVATED /* 40020 */:
                        i2 = R$string.f18020A;
                        break;
                    case TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD /* 40021 */:
                        i2 = R$string.f18056J;
                        break;
                    default:
                        switch (i) {
                            case TantanException.Client.AccountService.BIND_PHONE_ALREADY_REGISTERED /* 40060 */:
                                i2 = R$string.f18143d3;
                                break;
                            case TantanException.Client.AccountService.ERROR_ACCOUNT_CHANGE_PHONE_FORBIDDEN /* 40063 */:
                                i2 = R$string.f18244y;
                                break;
                            case TantanException.Client.AccountService.INACTIVATED_15DAYS /* 40091 */:
                                i2 = R$string.f18020A;
                                break;
                            case 40095:
                                i2 = R$string.f18143d3;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                        break;
                }
            case TantanException.Client.AccountService.CHINA_MOBILE_NOT_SIGN_UP /* 40016 */:
                i2 = R$string.f18076O;
                break;
        }
        if (i2 == 0) {
            return null;
        }
        return App.f16088e.getResources().getString(i2);
    }

    /* JADX INFO: renamed from: m */
    public static Date m106277m(int i) {
        GregorianCalendar gregorianCalendar = Converter.CALENDAR.get();
        gregorianCalendar.setTimeInMillis(uqb0.f180376H.guessedCurrentServerTime());
        gregorianCalendar.set(1, gregorianCalendar.get(1) - i);
        gregorianCalendar.set(10, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        return new Date(gregorianCalendar.getTimeInMillis());
    }

    /* JADX INFO: renamed from: n */
    public static Date m106278n(int i, boolean z) {
        GregorianCalendar gregorianCalendar = Converter.CALENDAR.get();
        gregorianCalendar.setTimeInMillis(uqb0.f180376H.guessedCurrentServerTime());
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
    public static Bitmap m106279o(Bitmap bitmap, int i, int i2) {
        Bitmap bitmapM189143a = t43.m189143a(bitmap, i2, true);
        new Canvas(bitmapM189143a).drawColor(i);
        return bitmapM189143a;
    }

    /* JADX INFO: renamed from: p */
    public static Bitmap m106280p(Bitmap bitmap, int i, int i2, int i3) {
        return m106281q(bitmap, i, i2, i3, qa00.m175859d(12.0f));
    }

    @WorkerThread
    /* JADX INFO: renamed from: q */
    public static Bitmap m106281q(Bitmap bitmap, int i, int i2, int i3, int i4) {
        if (!NullChecker.m82486a(bitmap)) {
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
            bitmap = t43.m189143a(bitmap, Math.round(fMax2), true);
            if (!bitmap.isMutable()) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
            new Canvas(bitmap).drawColor(i3);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: r */
    public static Animator m106282r(View view) {
        return gt0.m132173s(gt0.m132166l(view, gt0.f106354i, 0L, 200L, new DecelerateInterpolator(), 1.0f, 1.2f), gt0.m132166l(view, gt0.f106354i, 0L, 300L, new AccelerateDecelerateInterpolator(), 0.84f), gt0.m132166l(view, gt0.f106354i, 0L, 200L, new AccelerateDecelerateInterpolator(), 1.0f));
    }

    /* JADX INFO: renamed from: s */
    public static void m106283s(final Act act, final VScroll vScroll) {
        l51.m152888H(act, new Runnable() { // from class: l.trj0
            @Override // java.lang.Runnable
            public final void run() {
                bsj0.m106269e(act, vScroll);
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m106284t(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Checkable) {
                Checkable checkable = (Checkable) childAt;
                checkable.setChecked(z);
                return checkable.isChecked();
            }
        }
        wtq0.m207906a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m106285u(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Checkable) {
                return ((Checkable) childAt).isChecked();
            }
        }
        wtq0.m207906a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static void m106286v() {
        uqb0.f180397c0.clientNeedsForceUpdate();
    }

    /* JADX INFO: renamed from: w */
    public static List<Point> m106287w(String str) {
        return jyb.m147535x(jyb.m147499b0(f78161a.matcher(str)), jyb.m147499b0(f78164d.matcher(str)));
    }

    /* JADX INFO: renamed from: x */
    public static List<Point> m106288x(String str) {
        return jyb.m147535x(jyb.m147499b0(f78164d.matcher(str)));
    }

    /* JADX INFO: renamed from: y */
    public static String m106289y(String str) {
        String[] strArrSplit = str.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        String str2 = strArrSplit[strArrSplit.length - 1];
        if (str2.length() <= 5) {
            return jyb.m147490U(jyb.m147486Q(jyb.m147497a0(str2.length()), new qcj() { // from class: l.zrj0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return bsj0.m106274j((Integer) obj);
                }
            }), "");
        }
        return str2.substring(0, 3) + jyb.m147490U(jyb.m147486Q(jyb.m147497a0(str2.length() - 5), new qcj() { // from class: l.orj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bsj0.m106268d((Integer) obj);
            }
        }), "") + str2.substring(str2.length() - 2);
    }

    /* JADX INFO: renamed from: z */
    public static int m106290z(Throwable th) {
        if (th instanceof ApiExcep) {
            return ((ApiExcep) th).response.m138673q();
        }
        return 0;
    }
}

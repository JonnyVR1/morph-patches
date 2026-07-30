package p009l;

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
import com.p000p1.mobile.putong.p004ui.DialogAct;
import com.p000p1.mobile.putong.p004ui.share.ShareHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.data.MetaError;
import com.p1.mobile.putong.data.QualificationType;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
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
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import l.bt0;
import l.c4g0;
import l.d43;
import l.e30;
import l.e51;
import l.hfw;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.qkq0;
import l.qzb0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xck0;
import l.xh0;
import l.zvf0;
import v.VScroll;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class yij0 {

    /* JADX INFO: renamed from: b */
    public static boolean f23083b;

    /* JADX INFO: renamed from: c */
    public static int f23084c;

    /* JADX INFO: renamed from: a */
    public static final Pattern f23082a = Pattern.compile("(?=[a-zA-Z0-9]+[0-9_-])[a-zA-Z0-9_-]{6,20}");

    /* JADX INFO: renamed from: d */
    public static final Pattern f23085d = m25393O();

    /* JADX INFO: renamed from: e */
    public static final Pattern f23086e = Pattern.compile("[^a-zA-Z0-9_-]");

    /* JADX INFO: renamed from: f */
    public static final Pattern f23087f = Pattern.compile("[^\\u4e00-\\u9fa5]");

    /* JADX INFO: renamed from: g */
    public static final Pattern f23088g = m25394P();

    /* JADX INFO: renamed from: h */
    public static final Pattern f23089h = Pattern.compile("^(([1-9]\\d*)(\\.\\d{1,2})?|0\\.\\d{1,2})");

    /* JADX INFO: renamed from: i */
    public static final Pattern f23090i = Pattern.compile("^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$");

    /* JADX INFO: renamed from: j */
    public static w9j<Spannable, String> f23091j = new w9j() { // from class: l.jij0
        public final Object call(Object obj) {
            return yij0.m25402b((Spannable) obj);
        }
    };

    /* JADX INFO: renamed from: k */
    public static w9j<Spannable, String> f23092k = new w9j() { // from class: l.mij0
        public final Object call(Object obj) {
            return yij0.m25403c((Spannable) obj);
        }
    };

    /* JADX INFO: renamed from: l */
    public static w9j<Spannable, String> f23093l = new w9j() { // from class: l.oij0
        public final Object call(Object obj) {
            return yij0.m25408h((Spannable) obj);
        }
    };

    /* JADX INFO: renamed from: m */
    public static int f23094m = -1;

    /* JADX INFO: renamed from: A */
    public static Date m25379A() {
        return m25413m(0);
    }

    /* JADX INFO: renamed from: B */
    public static void m25380B(int i, Throwable th) {
        if (i == 40042) {
            lsi0.h(R.string.X1);
            return;
        }
        if (i == 40045) {
            lsi0.j("对方已注销");
            return;
        }
        if (i == 40044) {
            lsi0.j("注意：对方账号异常，暂时不能回复你的消息");
            return;
        }
        if (i == 40041) {
            qib0.c0.R3(th);
            return;
        }
        if (i == 40099) {
            lsi0.j("您输入的内容违规，请修改");
        } else if (th.getMessage() == null) {
            m25385G(th);
        } else {
            lsi0.h(R.string.G);
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: C */
    public static String m25381C(Throwable th) {
        Meta meta;
        List list;
        try {
            if (th instanceof TantanException.ServerException) {
                TantanException.ServerException serverException = (TantanException.ServerException) th;
                if (serverException.code != 503 || (meta = serverException.meta) == null || (list = meta.errors) == null || list.size() <= 0 || TextUtils.isEmpty(((MetaError) serverException.meta.errors.get(0)).message)) {
                    lsi0.h(R.string.G);
                    return "server else";
                }
                if (Act.foreground_() == null || f23094m == Act.sessionCount()) {
                    return null;
                }
                f23094m = Act.sessionCount();
                Application application = App.e;
                application.startActivity(DialogAct.m9698O0(application, 1, ((MetaError) serverException.meta.errors.get(0)).message));
                return "server error with message";
            }
            if (xck0.c(th, ApiExcep.ClientExpired.class)) {
                zvf0.B("e_auto_logout", "", new j760[]{j760.a("logout_type", "forced_update")});
                m25422v();
                return "client expired";
            }
            if (xck0.c(th, SSLPeerUnverifiedException.class)) {
                lsi0.n(R.string.F);
                m25395Q();
                return "ssl peer unverified";
            }
            if (xck0.c(th, EOFException.class)) {
                lsi0.n(R.string.F);
                return "eof";
            }
            if (xck0.c(th, SSLHandshakeException.class)) {
                lsi0.n(R.string.F);
                return "ssl handshake";
            }
            if (xck0.c(th, SSLException.class)) {
                lsi0.n(R.string.F);
                return "ssl";
            }
            if (xck0.c(th, SocketTimeoutException.class)) {
                lsi0.n(R.string.F);
                return "socket timeout";
            }
            if (xck0.c(th, UnknownHostException.class)) {
                lsi0.n(R.string.F);
                return "unknown host";
            }
            if (xck0.c(th, ApiExcep.Client.UnprocessableEntity.class)) {
                lsi0.i(R.string.H, true);
                return "unprocessable entity";
            }
            if (xck0.c(th, ConnectException.class)) {
                lsi0.n(R.string.F);
                return "connect";
            }
            if (xck0.c(th, ProtocolException.class)) {
                lsi0.n(R.string.F);
                return "protocol exception";
            }
            if (xck0.c(th, SocketException.class)) {
                lsi0.n(R.string.F);
                return "socket exception";
            }
            if (xck0.c(th, IOException.class)) {
                return null;
            }
            if (xck0.c(th, ApiExcep.Client.Unauthorized.class)) {
                zvf0.B("e_auto_logout", "", new j760[]{j760.a("logout_type", "401_exception")});
                m25389K();
                return "network unauthorized";
            }
            if (xck0.c(th, ApiExcep.Client.TooManyRequests.class)) {
                lsi0.h(R.string.G);
                return "too many requests";
            }
            if (!xck0.c(th, TantanException.Client.AccountService.class)) {
                if (xck0.c(th, ApiExcep.Client.NotFound.class) || xck0.c(th, ShareHelper.PlatformNotFoundException.class)) {
                    return "";
                }
                return null;
            }
            if (((TantanException.Client.AccountService) th).code != 40026) {
                return "";
            }
            zvf0.B("e_auto_logout", "", new j760[]{j760.a("logout_type", "401_exception")});
            m25389K();
            return "invalid access token";
        } catch (Exception e) {
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m25382D(Throwable th) {
        m25384F(th);
    }

    /* JADX INFO: renamed from: E */
    public static Throwable m25383E(Throwable th) {
        String strM25381C = m25381C(th);
        if (!TextUtils.isEmpty(strM25381C)) {
            return new App.HandledGlobally(th);
        }
        if (strM25381C == null) {
            xck0.c(th, App.HandledGlobally.class);
        }
        return th;
    }

    /* JADX INFO: renamed from: F */
    public static void m25384F(Throwable th) {
        try {
            if (th instanceof App.HandledGlobally) {
                return;
            }
            if (xck0.c(th, ApiExcep.ClientExpired.class)) {
                zvf0.B("e_auto_logout", "", new j760[]{j760.a("logout_type", "forced_update")});
                m25422v();
                return;
            }
            if (th instanceof IOException) {
                lsi0.n(R.string.F);
                return;
            }
            if (!(th instanceof TantanException.Client.AccountService)) {
                if (th instanceof TantanException.Client.CoreService) {
                    m25380B(((TantanException.Client.CoreService) th).code, th);
                    return;
                }
                if (th instanceof ShareHelper.PlatformNotFoundException) {
                    lsi0.h(R.string.a2);
                    return;
                } else if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).isBlocked()) {
                    lsi0.h(R.string.V0);
                    return;
                } else {
                    m25385G(th);
                    return;
                }
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                m25385G(th);
                return;
            }
            if (i == 40064) {
                osi0.f(R.string.X);
                return;
            }
            String strM25412l = m25412l(i);
            if (strM25412l == null) {
                m25385G(th);
            } else {
                lsi0.k(strM25412l, true);
            }
        } catch (Exception unused) {
            m25385G(th);
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m25385G(Throwable th) {
        if (m25386H(th)) {
            return;
        }
        lsi0.h(R.string.R);
        CrashHelper.c(th);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m25386H(Throwable th) {
        return (th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).hasHandle;
    }

    /* JADX INFO: renamed from: I */
    public static int m25387I(TextView textView) {
        try {
            return Integer.parseInt(vwb.q(textView.getText().toString()));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: J */
    public static boolean m25388J(QualificationType qualificationType) {
        if (qualificationType == null) {
            return false;
        }
        return TEnum.equals(qualificationType, "BACHELOR") || TEnum.equals(qualificationType, "MASTER") || TEnum.equals(qualificationType, "DOCTOR");
    }

    /* JADX INFO: renamed from: K */
    public static void m25389K() {
        e51.M(new Runnable() { // from class: l.rij0
            @Override // java.lang.Runnable
            public final void run() {
                yij0.m25409i();
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static String m25390L(String str) {
        if (TextUtils.isEmpty(str)) {
            return App.e.getString(R.string.f2);
        }
        if (User.ILLEGAL_NAME_PATTERN().matcher(str).matches()) {
            return App.e.getString(R.string.h2);
        }
        if ((!User.NAME_PATTERN().matcher(str).matches() || str.contains("ㅤ")) && !User.ThAI_NAME_PATTERN().matcher(str).matches()) {
            return App.e.getString(R.string.g2);
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public static String m25391M(TextView textView) {
        return vwb.q(textView.getText().toString());
    }

    /* JADX INFO: renamed from: N */
    public static Date m25392N() {
        return "ko".equals(Locale.getDefault().getLanguage()) ? m25414n(User.AGE_MAX_KOREAN, false) : m25413m(User.AGE_MAX);
    }

    /* JADX INFO: renamed from: O */
    public static final Pattern m25393O() {
        return Pattern.compile(vwb.V(new String[]{"V\\W*X", "w\\W*e\\W*c\\W*h\\W*a\\W*t", "w\\W*e\\W*i\\W*x\\W*i\\W*n", "w\\W*x", "q\\W*q", "微\\W*信", "w\\W*x\\W*i\\W*n", "v\\W*x\\W*i\\W*n", "w\\W*信", "v\\W*信"}, "|"), 2);
    }

    /* JADX INFO: renamed from: P */
    public static final Pattern m25394P() {
        return Pattern.compile(vwb.V(new String[]{"南宫", "王久", "jiafen", "加粉", "赚法", "主任", "委员", "空调", "中介", "沙县", "妗子", "卑鄙", "专线", "粪", "师傅", "老师", "保姆", "阿姨", "博士", "律师", "医生", "大哥", "大姐", "爸", "爹", "妈", "媽", "父", "母", "麻麻", "姑", "姨", "叔", "伯", "舅", "爷", "奶", "婶", "嫂", "姥", "妻", "公公", "婆", "媳", "免费", "办", "肉", "包子", "饺", "饭", "警", "部长", "市长", "省长", "区长", "县长", "书记", "处长", "科长", "队长", "院长", "市政", "局长", "校长", "餐厅", "娘娘"}, "|"), 2);
    }

    /* JADX INFO: renamed from: Q */
    public static void m25395Q() {
        int i = f23084c + 1;
        f23084c = i;
        if (i < 10) {
            return;
        }
        Act.foreground().take(1).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.sij0
            public final void call(Object obj) {
                yij0.m25407g((Act.r) obj);
            }
        }, new e30() { // from class: l.tij0
            public final void call(Object obj) {
                yij0.m25411k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public static void m25396R(Act act) {
        act.overridePendingTransition(qzb0.f, qzb0.g);
    }

    /* JADX INFO: renamed from: S */
    public static void m25397S(Act act) {
        act.overridePendingTransition(qzb0.h, qzb0.i);
    }

    /* JADX INFO: renamed from: T */
    public static boolean m25398T(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Checkable) {
                Checkable checkable = (Checkable) childAt;
                checkable.toggle();
                return checkable.isChecked();
            }
        }
        qkq0.a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static void m25399U(c4g0 c4g0Var) {
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            return;
        }
        c4g0Var.unsubscribe();
    }

    /* JADX INFO: renamed from: V */
    public static Date m25400V() {
        int i = User.AGE_MIN_GOOGLEPLAY;
        if ("ko".equals(Locale.getDefault().getLanguage())) {
            i = User.AGE_MIN_KOREAN;
        }
        return m25413m(i);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m25401a(Activity activity, View view) {
        hfw.a("showMaybeNeedsUpdateDialog", "click to app market");
        try {
            vuw.m23737d(activity);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m25402b(Spannable spannable) {
        List<Point> listM25423w = m25423w(spannable.toString());
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spannable.getSpans(0, spannable.length(), BackgroundColorSpan.class)) {
            spannable.removeSpan(backgroundColorSpan);
        }
        if (listM25423w.size() == 0) {
            return null;
        }
        for (Point point : listM25423w) {
            spannable.setSpan(new BackgroundColorSpan(-26164), point.x, point.y, 0);
        }
        return App.e.getString(R.string.M1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m25403c(Spannable spannable) {
        if (!TextUtils.isEmpty(spannable) && f23086e.matcher(spannable).find()) {
            return App.e.getString(R.string.N1);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m25404d(Integer num) {
        return "*";
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m25405e(Act act, VScroll vScroll) {
        int measuredHeight = act.getWindow().getDecorView().getMeasuredHeight() - vScroll.getHeight();
        if (measuredHeight > 0) {
            vScroll.smoothScrollTo(0, measuredHeight);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m25406f(DialogInterface dialogInterface) {
        f23084c = 0;
        f23083b = false;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m25407g(Act.r rVar) {
        final Activity activity;
        if (f23083b || rVar == null || (activity = (Activity) rVar.a.get()) == null) {
            return;
        }
        f23083b = true;
        new xh0.a(activity).g(true).s(activity.getString(R.string.D2)).i(R.string.k2).q(R.string.l2).e(R.string.a).m(new DialogInterface.OnDismissListener() { // from class: l.uij0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                yij0.m25406f(dialogInterface);
            }
        }).o(new View.OnClickListener() { // from class: l.vij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yij0.m25401a(activity, view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m25408h(Spannable spannable) {
        if (TextUtils.isEmpty(spannable) || f23089h.matcher(spannable).matches()) {
            return null;
        }
        return App.e.getString(R.string.c3);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m25409i() {
        if (qib0.c0.signedIn_()) {
            lsi0.h(R.string.B);
            qib0.Z0(false, false);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m25410j(Integer num) {
        return "*";
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m25411k(Throwable th) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX INFO: renamed from: l */
    public static String m25412l(int i) {
        int i2;
        switch (i) {
            case 40007:
                i2 = R.string.g2;
                break;
            case 40008:
                i2 = R.string.I;
                break;
            case 40009:
                i2 = R.string.C;
                break;
            case 40010:
                i2 = R.string.M;
                break;
            case 40011:
                i2 = R.string.P;
                break;
            case 40012:
                i2 = R.string.E0;
                break;
            case 40013:
                i2 = R.string.L;
                break;
            case 40014:
                i2 = R.string.N;
                break;
            case 40015:
                i2 = R.string.K;
                break;
            default:
                switch (i) {
                    case 40018:
                        break;
                    case 40019:
                        i2 = R.string.z;
                        break;
                    case 40020:
                        i2 = R.string.A;
                        break;
                    case 40021:
                        i2 = R.string.J;
                        break;
                    default:
                        switch (i) {
                            case 40060:
                                i2 = R.string.d3;
                                break;
                            case 40063:
                                i2 = R.string.y;
                                break;
                            case 40091:
                                i2 = R.string.A;
                                break;
                            case 40095:
                                i2 = R.string.d3;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                        break;
                }
            case 40016:
                i2 = R.string.O;
                break;
        }
        if (i2 == 0) {
            return null;
        }
        return App.e.getResources().getString(i2);
    }

    /* JADX INFO: renamed from: m */
    public static Date m25413m(int i) {
        Calendar calendar = (Calendar) Converter.CALENDAR.get();
        calendar.setTimeInMillis(qib0.H.guessedCurrentServerTime());
        calendar.set(1, calendar.get(1) - i);
        calendar.set(10, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new Date(calendar.getTimeInMillis());
    }

    /* JADX INFO: renamed from: n */
    public static Date m25414n(int i, boolean z) {
        Calendar calendar = (Calendar) Converter.CALENDAR.get();
        calendar.setTimeInMillis(qib0.H.guessedCurrentServerTime());
        calendar.set(1, calendar.get(1) - i);
        calendar.set(2, z ? 12 : 0);
        calendar.set(5, !z ? 1 : 0);
        calendar.set(10, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new Date(calendar.getTimeInMillis());
    }

    /* JADX INFO: renamed from: o */
    public static Bitmap m25415o(Bitmap bitmap, int i, int i2) {
        Bitmap bitmapA = d43.a(bitmap, i2, true);
        new Canvas(bitmapA).drawColor(i);
        return bitmapA;
    }

    /* JADX INFO: renamed from: p */
    public static Bitmap m25416p(Bitmap bitmap, int i, int i2, int i3) {
        return m25417q(bitmap, i, i2, i3, t100.d(12.0f));
    }

    @WorkerThread
    /* JADX INFO: renamed from: q */
    public static Bitmap m25417q(Bitmap bitmap, int i, int i2, int i3, int i4) {
        if (!NullChecker.a(bitmap)) {
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
            bitmap = d43.a(bitmap, Math.round(fMax2), true);
            if (!bitmap.isMutable()) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
            new Canvas(bitmap).drawColor(i3);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: r */
    public static Animator m25418r(View view) {
        return bt0.s(new Animator[]{bt0.l(view, bt0.i, 0L, 200L, new DecelerateInterpolator(), new float[]{1.0f, 1.2f}), bt0.l(view, bt0.i, 0L, 300L, new AccelerateDecelerateInterpolator(), new float[]{0.84f}), bt0.l(view, bt0.i, 0L, 200L, new AccelerateDecelerateInterpolator(), new float[]{1.0f})});
    }

    /* JADX INFO: renamed from: s */
    public static void m25419s(final Act act, final VScroll vScroll) {
        e51.H(act, new Runnable() { // from class: l.qij0
            @Override // java.lang.Runnable
            public final void run() {
                yij0.m25405e(act, vScroll);
            }
        }, 150L);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m25420t(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Checkable) {
                Checkable checkable = (Checkable) childAt;
                checkable.setChecked(z);
                return checkable.isChecked();
            }
        }
        qkq0.a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m25421u(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Checkable) {
                return ((Checkable) childAt).isChecked();
            }
        }
        qkq0.a("must have a checkable child");
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static void m25422v() {
        qib0.c0.clientNeedsForceUpdate();
    }

    /* JADX INFO: renamed from: w */
    public static List<Point> m25423w(String str) {
        return vwb.x(new List[]{vwb.b0(f23082a.matcher(str)), vwb.b0(f23085d.matcher(str))});
    }

    /* JADX INFO: renamed from: x */
    public static List<Point> m25424x(String str) {
        return vwb.x(new List[]{vwb.b0(f23085d.matcher(str))});
    }

    /* JADX INFO: renamed from: y */
    public static String m25425y(String str) {
        String[] strArrSplit = str.split(" ");
        String str2 = strArrSplit[strArrSplit.length - 1];
        if (str2.length() <= 5) {
            return vwb.U(vwb.Q(vwb.a0(str2.length()), new w9j() { // from class: l.wij0
                public final Object call(Object obj) {
                    return yij0.m25410j((Integer) obj);
                }
            }), "");
        }
        return str2.substring(0, 3) + vwb.U(vwb.Q(vwb.a0(str2.length() - 5), new w9j() { // from class: l.lij0
            public final Object call(Object obj) {
                return yij0.m25404d((Integer) obj);
            }
        }), "") + str2.substring(str2.length() - 2);
    }

    /* JADX INFO: renamed from: z */
    public static int m25426z(Throwable th) {
        if (th instanceof ApiExcep) {
            return ((ApiExcep) th).response.q();
        }
        return 0;
    }
}

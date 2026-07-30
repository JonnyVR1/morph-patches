package p149l;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public class djj0 {

    /* JADX INFO: renamed from: l.djj0$a */
    public class C16393a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f86554a;

        public C16393a(d30 d30Var) {
            this.f86554a = d30Var;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f86554a.call();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.djj0$b */
    public static class C16394b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public static WeakReference<d30> f86555a;

        public C16394b(d30 d30Var) {
            f86555a = new WeakReference<>(d30Var);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (NullChecker.m81303a(f86555a.get())) {
                f86555a.get().call();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX INFO: renamed from: a */
    public static String m112080a(int i) {
        int i2;
        if (i == 40060) {
            i2 = R$string.f16243l4;
        } else if (i == 40063) {
            i2 = R$string.f16097L;
        } else if (i != 40091) {
            switch (i) {
                case 40007:
                    i2 = R$string.f16236k3;
                    break;
                case TantanException.Client.AccountService.SHORT_PASSWORD /* 40008 */:
                    i2 = R$string.f16147V;
                    break;
                case 40009:
                    i2 = R$string.f16122Q;
                    break;
                case 40010:
                    i2 = R$string.f16167Z;
                    break;
                case 40011:
                    i2 = R$string.f16185c0;
                    break;
                case TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL /* 40012 */:
                    i2 = R$string.f16253n2;
                    break;
                case 40013:
                    i2 = R$string.f16162Y;
                    break;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    i2 = R$string.f16173a0;
                    break;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    i2 = R$string.f16157X;
                    break;
                default:
                    switch (i) {
                        case TantanException.Client.CoreService.MATCH_HAS_EXISTED /* 40018 */:
                            break;
                        case TantanException.Client.AccountService.ACCOUNT_DELETE /* 40019 */:
                            i2 = R$string.f16102M;
                            break;
                        case TantanException.Client.AccountService.INACTIVATED /* 40020 */:
                            i2 = R$string.f16107N;
                            break;
                        case TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD /* 40021 */:
                            i2 = R$string.f16152W;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                case TantanException.Client.AccountService.CHINA_MOBILE_NOT_SIGN_UP /* 40016 */:
                    i2 = R$string.f16179b0;
                    break;
            }
        } else {
            i2 = R$string.f16107N;
        }
        if (i2 == 0) {
            return null;
        }
        return App.f15369e.getResources().getString(i2);
    }

    /* JADX INFO: renamed from: b */
    public static ClickableSpan m112081b(TextView textView, String str, SpannableString spannableString, int i, d30 d30Var) {
        C16394b c16394b = new C16394b(d30Var);
        spannableString.setSpan(c16394b, i, str.length() + i, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(App.f15369e.getResources().getColor(u0c0.f172897r));
        return c16394b;
    }

    /* JADX INFO: renamed from: c */
    public static void m112082c(TextView textView, String str, d30 d30Var) {
        if (!NullChecker.m81305c(textView, SchemeKey.account, CrashHelper.ReportLevel.p9) || TextUtils.isEmpty(textView.getText())) {
            return;
        }
        String string = textView.getText().toString();
        int iIndexOf = string.indexOf(str);
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C16393a(d30Var), iIndexOf, str.length() + iIndexOf, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(App.f15369e.getResources().getColor(u0c0.f172897r));
    }

    /* JADX INFO: renamed from: d */
    public static String m112083d(Throwable th) {
        try {
            if (th instanceof IOException) {
                return App.f15369e.getResources().getString(R$string.f16137T);
            }
            if (!(th instanceof TantanException.Client.AccountService)) {
                return App.f15369e.getResources().getString(R$string.f16137T);
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                return m112084e(th);
            }
            String strM112080a = m112080a(i);
            if (strM112080a != null) {
                return strM112080a;
            }
            CrashHelper.m81296c(th);
            return m112084e(th);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return m112084e(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m112084e(Throwable th) {
        return App.f15369e.getResources().getString(R$string.f16197e0);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m112085f() {
        DisplayMetrics displayMetrics = f16.m119092a().getResources().getDisplayMetrics();
        return ((float) displayMetrics.heightPixels) / displayMetrics.density < 700.0f;
    }

    /* JADX INFO: renamed from: g */
    public static void m112086g(TextView textView, TextView textView2) {
        String strM200309W = vwb.m200309W(textView.getText().toString());
        if (!TextUtils.isEmpty(strM200309W) && !strM200309W.contains(Marker.ANY_NON_NULL_MARKER)) {
            strM200309W = Marker.ANY_NON_NULL_MARKER.concat(strM200309W);
        }
        WelcomeAct.f17059h = strM200309W;
        WelcomeAct.f17058g = vwb.m200309W(textView2.getText().toString());
    }
}

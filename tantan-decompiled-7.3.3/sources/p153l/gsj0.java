package p153l;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public class gsj0 {

    /* JADX INFO: renamed from: l.gsj0$a */
    public class C17295a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f106293a;

        public C17295a(x20 x20Var) {
            this.f106293a = x20Var;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f106293a.call();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.gsj0$b */
    public static class C17296b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public static WeakReference<x20> f106294a;

        public C17296b(x20 x20Var) {
            f106294a = new WeakReference<>(x20Var);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (NullChecker.m82486a(f106294a.get())) {
                f106294a.get().call();
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
    public static String m132057a(int i) {
        int i2;
        if (i == 40060) {
            i2 = R$string.f16962l4;
        } else if (i == 40063) {
            i2 = R$string.f16816L;
        } else if (i != 40091) {
            switch (i) {
                case 40007:
                    i2 = R$string.f16955k3;
                    break;
                case TantanException.Client.AccountService.SHORT_PASSWORD /* 40008 */:
                    i2 = R$string.f16866V;
                    break;
                case 40009:
                    i2 = R$string.f16841Q;
                    break;
                case 40010:
                    i2 = R$string.f16886Z;
                    break;
                case 40011:
                    i2 = R$string.f16904c0;
                    break;
                case TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL /* 40012 */:
                    i2 = R$string.f16972n2;
                    break;
                case 40013:
                    i2 = R$string.f16881Y;
                    break;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    i2 = R$string.f16892a0;
                    break;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    i2 = R$string.f16876X;
                    break;
                default:
                    switch (i) {
                        case TantanException.Client.CoreService.MATCH_HAS_EXISTED /* 40018 */:
                            break;
                        case TantanException.Client.AccountService.ACCOUNT_DELETE /* 40019 */:
                            i2 = R$string.f16821M;
                            break;
                        case TantanException.Client.AccountService.INACTIVATED /* 40020 */:
                            i2 = R$string.f16826N;
                            break;
                        case TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD /* 40021 */:
                            i2 = R$string.f16871W;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                case TantanException.Client.AccountService.CHINA_MOBILE_NOT_SIGN_UP /* 40016 */:
                    i2 = R$string.f16898b0;
                    break;
            }
        } else {
            i2 = R$string.f16826N;
        }
        if (i2 == 0) {
            return null;
        }
        return App.f16088e.getResources().getString(i2);
    }

    /* JADX INFO: renamed from: b */
    public static ClickableSpan m132058b(TextView textView, String str, SpannableString spannableString, int i, x20 x20Var) {
        C17296b c17296b = new C17296b(x20Var);
        spannableString.setSpan(c17296b, i, str.length() + i, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(App.f16088e.getResources().getColor(a9c0.f69033r));
        return c17296b;
    }

    /* JADX INFO: renamed from: c */
    public static void m132059c(TextView textView, String str, x20 x20Var) {
        if (!NullChecker.m82488c(textView, SchemeKey.account, CrashHelper.ReportLevel.p9) || TextUtils.isEmpty(textView.getText())) {
            return;
        }
        String string = textView.getText().toString();
        int iIndexOf = string.indexOf(str);
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C17295a(x20Var), iIndexOf, str.length() + iIndexOf, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(App.f16088e.getResources().getColor(a9c0.f69033r));
    }

    /* JADX INFO: renamed from: d */
    public static String m132060d(Throwable th) {
        try {
            if (th instanceof IOException) {
                return App.f16088e.getResources().getString(R$string.f16856T);
            }
            if (!(th instanceof TantanException.Client.AccountService)) {
                return App.f16088e.getResources().getString(R$string.f16856T);
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                return m132061e(th);
            }
            String strM132057a = m132057a(i);
            if (strM132057a != null) {
                return strM132057a;
            }
            CrashHelper.m82479c(th);
            return m132061e(th);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return m132061e(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m132061e(Throwable th) {
        return App.f16088e.getResources().getString(R$string.f16916e0);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m132062f() {
        DisplayMetrics displayMetrics = k26.m147943a().getResources().getDisplayMetrics();
        return ((float) displayMetrics.heightPixels) / displayMetrics.density < 700.0f;
    }

    /* JADX INFO: renamed from: g */
    public static void m132063g(TextView textView, TextView textView2) {
        String strM147492W = jyb.m147492W(textView.getText().toString());
        if (!TextUtils.isEmpty(strM147492W) && !strM147492W.contains(Marker.ANY_NON_NULL_MARKER)) {
            strM147492W = Marker.ANY_NON_NULL_MARKER.concat(strM147492W);
        }
        WelcomeAct.f17778h = strM147492W;
        WelcomeAct.f17777g = jyb.m147492W(textView2.getText().toString());
    }
}

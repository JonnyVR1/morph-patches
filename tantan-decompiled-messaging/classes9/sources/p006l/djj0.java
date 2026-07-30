package p006l;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.lang.ref.WeakReference;
import l.d30;
import l.f16;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class djj0 {

    /* JADX INFO: renamed from: l.djj0$a */
    public class C0643a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f10430a;

        public C0643a(d30 d30Var) {
            this.f10430a = d30Var;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f10430a.call();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.djj0$b */
    public static class C0644b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public static WeakReference<d30> f10431a;

        public C0644b(d30 d30Var) {
            f10431a = new WeakReference<>(d30Var);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (NullChecker.a(f10431a.get())) {
                f10431a.get().call();
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
    public static String m14043a(int i) {
        int i2;
        if (i == 40060) {
            i2 = R$string.f232l4;
        } else if (i == 40063) {
            i2 = R$string.f86L;
        } else if (i != 40091) {
            switch (i) {
                case 40007:
                    i2 = R$string.f225k3;
                    break;
                case TantanException.Client.AccountService.SHORT_PASSWORD /* 40008 */:
                    i2 = R$string.f136V;
                    break;
                case 40009:
                    i2 = R$string.f111Q;
                    break;
                case 40010:
                    i2 = R$string.f156Z;
                    break;
                case 40011:
                    i2 = R$string.f174c0;
                    break;
                case TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL /* 40012 */:
                    i2 = R$string.f242n2;
                    break;
                case 40013:
                    i2 = R$string.f151Y;
                    break;
                case TantanException.Client.AccountService.INVALID_SMS_CODE /* 40014 */:
                    i2 = R$string.f162a0;
                    break;
                case TantanException.Client.AccountService.CONF_CODE_EXPIRED /* 40015 */:
                    i2 = R$string.f146X;
                    break;
                default:
                    switch (i) {
                        case TantanException.Client.CoreService.MATCH_HAS_EXISTED /* 40018 */:
                            break;
                        case TantanException.Client.AccountService.ACCOUNT_DELETE /* 40019 */:
                            i2 = R$string.f91M;
                            break;
                        case TantanException.Client.AccountService.INACTIVATED /* 40020 */:
                            i2 = R$string.f96N;
                            break;
                        case TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD /* 40021 */:
                            i2 = R$string.f141W;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                case TantanException.Client.AccountService.CHINA_MOBILE_NOT_SIGN_UP /* 40016 */:
                    i2 = R$string.f168b0;
                    break;
            }
        } else {
            i2 = R$string.f96N;
        }
        if (i2 == 0) {
            return null;
        }
        return App.e.getResources().getString(i2);
    }

    /* JADX INFO: renamed from: b */
    public static ClickableSpan m14044b(TextView textView, String str, SpannableString spannableString, int i, d30 d30Var) {
        C0644b c0644b = new C0644b(d30Var);
        spannableString.setSpan(c0644b, i, str.length() + i, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(App.e.getResources().getColor(u0c0.f22411r));
        return c0644b;
    }

    /* JADX INFO: renamed from: c */
    public static void m14045c(TextView textView, String str, d30 d30Var) {
        if (!NullChecker.c(textView, "account", CrashHelper.ReportLevel.p9) || TextUtils.isEmpty(textView.getText())) {
            return;
        }
        String string = textView.getText().toString();
        int iIndexOf = string.indexOf(str);
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C0643a(d30Var), iIndexOf, str.length() + iIndexOf, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(App.e.getResources().getColor(u0c0.f22411r));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static String m14046d(Throwable th) {
        try {
            if (th instanceof IOException) {
                return App.e.getResources().getString(R$string.f126T);
            }
            if (!(th instanceof TantanException.Client.AccountService)) {
                return App.e.getResources().getString(R$string.f126T);
            }
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 40000) {
                return m14047e(th);
            }
            String strM14043a = m14043a(i);
            if (strM14043a != null) {
                return strM14043a;
            }
            CrashHelper.c(th);
            return m14047e(th);
        } catch (Exception e) {
            CrashHelper.c(e);
            return m14047e(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m14047e(Throwable th) {
        return App.e.getResources().getString(R$string.f186e0);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m14048f() {
        DisplayMetrics displayMetrics = f16.a().getResources().getDisplayMetrics();
        return ((float) displayMetrics.heightPixels) / displayMetrics.density < 700.0f;
    }

    /* JADX INFO: renamed from: g */
    public static void m14049g(TextView textView, TextView textView2) {
        String strW = vwb.W(textView.getText().toString());
        if (!TextUtils.isEmpty(strW) && !strW.contains("+")) {
            strW = "+".concat(strW);
        }
        WelcomeAct.f1048h = strW;
        WelcomeAct.f1047g = vwb.W(textView2.getText().toString());
    }
}

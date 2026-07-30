package p149l;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.C15383a;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, m87232d2 = {"Ll/uhe0;", "", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", "g", "(Landroid/view/View;)Z", "Landroid/widget/TextView;", "c", "(Landroid/widget/TextView;)Z", "b", Constants.INAPP_DATA_TAG, "f", "e", "a", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class uhe0 {

    @NotNull
    public static final uhe0 INSTANCE = new uhe0();

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m193706g(@Nullable View view) {
        if (lsb.m151554d(uhe0.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            uhe0 uhe0Var = INSTANCE;
            return uhe0Var.m193709c((TextView) view) || uhe0Var.m193707a((TextView) view) || uhe0Var.m193710d((TextView) view) || uhe0Var.m193712f((TextView) view) || uhe0Var.m193711e((TextView) view) || uhe0Var.m193708b((TextView) view);
        } catch (Throwable th) {
            lsb.m151552b(th, uhe0.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m193707a(TextView view) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            String strReplace = new Regex("\\s").replace(ccl0.m106073k(view), "");
            int length = strReplace.length();
            if (length >= 12 && length <= 19) {
                int i = 0;
                boolean z = false;
                for (int i2 = length - 1; -1 < i2; i2--) {
                    char cCharAt = strReplace.charAt(i2);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iM93461c = C15383a.m93461c(cCharAt);
                    if (z && (iM93461c = iM93461c * 2) > 9) {
                        iM93461c = (iM93461c % 10) + 1;
                    }
                    i += iM93461c;
                    z = !z;
                }
                if (i % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m193708b(TextView view) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            if (view.getInputType() == 32) {
                return true;
            }
            String strM106073k = ccl0.m106073k(view);
            if (strM106073k != null && strM106073k.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(strM106073k).matches();
            }
            return false;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m193709c(TextView view) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            if (view.getInputType() == 128) {
                return true;
            }
            return view.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m193710d(TextView view) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            return view.getInputType() == 96;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m193711e(TextView view) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            return view.getInputType() == 3;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m193712f(TextView view) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            return view.getInputType() == 112;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }
}

package p153l;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.C15490a;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, m88121d2 = {"Ll/zpe0;", "", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", "g", "(Landroid/view/View;)Z", "Landroid/widget/TextView;", "c", "(Landroid/widget/TextView;)Z", "b", Constants.INAPP_DATA_TAG, "f", "e", "a", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class zpe0 {

    @NotNull
    public static final zpe0 INSTANCE = new zpe0();

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m220836g(@Nullable View view) {
        if (ztb.m221490d(zpe0.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            zpe0 zpe0Var = INSTANCE;
            return zpe0Var.m220839c((TextView) view) || zpe0Var.m220837a((TextView) view) || zpe0Var.m220840d((TextView) view) || zpe0Var.m220842f((TextView) view) || zpe0Var.m220841e((TextView) view) || zpe0Var.m220838b((TextView) view);
        } catch (Throwable th) {
            ztb.m221488b(th, zpe0.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m220837a(TextView view) {
        if (ztb.m221490d(this)) {
            return false;
        }
        try {
            String strReplace = new Regex("\\s").replace(gll0.m130685k(view), "");
            int length = strReplace.length();
            if (length >= 12 && length <= 19) {
                int i = 0;
                boolean z = false;
                for (int i2 = length - 1; -1 < i2; i2--) {
                    char cCharAt = strReplace.charAt(i2);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iM94352c = C15490a.m94352c(cCharAt);
                    if (z && (iM94352c = iM94352c * 2) > 9) {
                        iM94352c = (iM94352c % 10) + 1;
                    }
                    i += iM94352c;
                    z = !z;
                }
                if (i % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m220838b(TextView view) {
        if (ztb.m221490d(this)) {
            return false;
        }
        try {
            if (view.getInputType() == 32) {
                return true;
            }
            String strM130685k = gll0.m130685k(view);
            if (strM130685k != null && strM130685k.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(strM130685k).matches();
            }
            return false;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m220839c(TextView view) {
        if (ztb.m221490d(this)) {
            return false;
        }
        try {
            if (view.getInputType() == 128) {
                return true;
            }
            return view.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m220840d(TextView view) {
        if (ztb.m221490d(this)) {
            return false;
        }
        try {
            return view.getInputType() == 96;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m220841e(TextView view) {
        if (ztb.m221490d(this)) {
            return false;
        }
        try {
            return view.getInputType() == 3;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m220842f(TextView view) {
        if (ztb.m221490d(this)) {
            return false;
        }
        try {
            return view.getInputType() == 112;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }
}

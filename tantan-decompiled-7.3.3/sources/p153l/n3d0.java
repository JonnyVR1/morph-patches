package p153l;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import com.tantanapp.common.utils.CrashHelper;
import java.util.regex.Pattern;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class n3d0 {
    @ColorInt
    /* JADX INFO: renamed from: a */
    public static int m161277a(@ColorRes int i) {
        return vxr.m203877e().getResources().getColor(i);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m161278b(@DrawableRes int i) {
        return vxr.m203877e().getResources().getDrawable(i);
    }

    /* JADX INFO: renamed from: c */
    public static GradientDrawable m161279c(String str, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(qa00.m175859d(i));
        gradientDrawable.setColor(m161283g(str));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: d */
    public static String m161280d(int i) {
        return vxr.m203877e().getResources().getString(i);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m161281e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase().contains(".png") || str.toLowerCase().contains(".webp") || str.toLowerCase().contains(".jpg");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m161282f(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return Pattern.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{8})$", str);
    }

    @ColorInt
    /* JADX INFO: renamed from: g */
    public static int m161283g(String str) {
        return m161284h(str, m161277a(l9c0.f130592e));
    }

    @ColorInt
    /* JADX INFO: renamed from: h */
    public static int m161284h(String str, @ColorInt int i) {
        if (TextUtils.isEmpty(str)) {
            o1j0.m165639m("颜色不可以为空，请检查 color = " + str);
            return i;
        }
        if (str.length() < 6) {
            o1j0.m165639m("颜色字符串格式不正确，请检查 color = ".concat(str));
            return i;
        }
        String strConcat = !str.startsWith("#") ? "#".concat(str) : str;
        if (Pattern.matches("^#([0-9a-fA-F]{6}|[0-9a-fA-F]{8})$", strConcat)) {
            return Color.parseColor(strConcat);
        }
        o1j0.m165639m("字符串颜色解析出现问题，请检查 color = ".concat(strConcat));
        CrashHelper.m82479c(new Exception("字符串颜色配置异常，请检查 sourceColor = ".concat(str)));
        return i;
    }

    /* JADX INFO: renamed from: i */
    public static void m161285i(VDraweeView vDraweeView, boolean z) {
        if (!z) {
            vDraweeView.setColorFilter((ColorFilter) null);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        vDraweeView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    /* JADX INFO: renamed from: j */
    public static String m161286j(int i, String str) {
        StringBuilder sb = new StringBuilder("#");
        String str2 = String.format("#%06X", Integer.valueOf(16777215 & i));
        if (str2.length() != 7 || i == -1 || !str2.startsWith("#")) {
            return "#80ffffff";
        }
        sb.append(str);
        sb.append(str2.substring(1));
        return sb.toString();
    }
}

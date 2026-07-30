package p153l;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import com.p051p1.mobile.putong.core.data.Target;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m88121d2 = {"Ll/xzr;", "", "<init>", "()V", "", "oriStr", Target.TYPE, "", "color", "Landroid/text/SpannableString;", "a", "(Ljava/lang/String;Ljava/lang/String;I)Landroid/text/SpannableString;", "b", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class xzr {

    @NotNull
    public static final xzr INSTANCE = new xzr();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final SpannableString m213805a(@NotNull String oriStr, @NotNull String target, int color) {
        oriStr.getClass();
        target.getClass();
        Pair<Integer, Integer> pairM209913w = xau.m209913w(oriStr, target);
        SpannableString spannableString = new SpannableString(oriStr);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(qa00.m175861f(18));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
        Object obj = pairM209913w.first;
        obj.getClass();
        int iIntValue = ((Number) obj).intValue();
        Object obj2 = pairM209913w.second;
        obj2.getClass();
        spannableString.setSpan(absoluteSizeSpan, iIntValue, ((Number) obj2).intValue(), 33);
        Object obj3 = pairM209913w.first;
        obj3.getClass();
        int iIntValue2 = ((Number) obj3).intValue();
        Object obj4 = pairM209913w.second;
        obj4.getClass();
        spannableString.setSpan(foregroundColorSpan, iIntValue2, ((Number) obj4).intValue(), 33);
        StyleSpan styleSpan = new StyleSpan(1);
        Object obj5 = pairM209913w.first;
        obj5.getClass();
        int iIntValue3 = ((Number) obj5).intValue();
        Object obj6 = pairM209913w.second;
        obj6.getClass();
        spannableString.setSpan(styleSpan, iIntValue3, ((Number) obj6).intValue(), 33);
        return spannableString;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final SpannableString m213806b(@NotNull String oriStr, @NotNull String target, int color) {
        oriStr.getClass();
        target.getClass();
        Pair<Integer, Integer> pairM209913w = xau.m209913w(oriStr, target);
        SpannableString spannableString = new SpannableString(oriStr);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(qa00.m175861f(16));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
        spannableString.setSpan(new ForegroundColorSpan(n3d0.m161277a(n9c0.f140785O)), 0, oriStr.length(), 33);
        Object obj = pairM209913w.first;
        obj.getClass();
        int iIntValue = ((Number) obj).intValue();
        Object obj2 = pairM209913w.second;
        obj2.getClass();
        spannableString.setSpan(absoluteSizeSpan, iIntValue, ((Number) obj2).intValue(), 33);
        Object obj3 = pairM209913w.first;
        obj3.getClass();
        int iIntValue2 = ((Number) obj3).intValue();
        Object obj4 = pairM209913w.second;
        obj4.getClass();
        spannableString.setSpan(foregroundColorSpan, iIntValue2, ((Number) obj4).intValue(), 33);
        StyleSpan styleSpan = new StyleSpan(1);
        Object obj5 = pairM209913w.first;
        obj5.getClass();
        int iIntValue3 = ((Number) obj5).intValue();
        Object obj6 = pairM209913w.second;
        obj6.getClass();
        spannableString.setSpan(styleSpan, iIntValue3, ((Number) obj6).intValue(), 33);
        return spannableString;
    }
}

package p002l;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import kotlin.Metadata;
import l.kvc0;
import l.t100;
import l.w8u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Ll/wxr;", "", "<init>", "()V", "", "oriStr", "target", "", "color", "Landroid/text/SpannableString;", "a", "(Ljava/lang/String;Ljava/lang/String;I)Landroid/text/SpannableString;", "b", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class wxr {

    @NotNull
    public static final wxr INSTANCE = new wxr();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final SpannableString m25544a(@NotNull String oriStr, @NotNull String target, int color) {
        oriStr.getClass();
        target.getClass();
        Pair pairW = w8u.w(oriStr, target);
        SpannableString spannableString = new SpannableString(oriStr);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(t100.f(18));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
        Object obj = pairW.first;
        obj.getClass();
        int iIntValue = ((Number) obj).intValue();
        Object obj2 = pairW.second;
        obj2.getClass();
        spannableString.setSpan(absoluteSizeSpan, iIntValue, ((Number) obj2).intValue(), 33);
        Object obj3 = pairW.first;
        obj3.getClass();
        int iIntValue2 = ((Number) obj3).intValue();
        Object obj4 = pairW.second;
        obj4.getClass();
        spannableString.setSpan(foregroundColorSpan, iIntValue2, ((Number) obj4).intValue(), 33);
        StyleSpan styleSpan = new StyleSpan(1);
        Object obj5 = pairW.first;
        obj5.getClass();
        int iIntValue3 = ((Number) obj5).intValue();
        Object obj6 = pairW.second;
        obj6.getClass();
        spannableString.setSpan(styleSpan, iIntValue3, ((Number) obj6).intValue(), 33);
        return spannableString;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final SpannableString m25545b(@NotNull String oriStr, @NotNull String target, int color) {
        oriStr.getClass();
        target.getClass();
        Pair pairW = w8u.w(oriStr, target);
        SpannableString spannableString = new SpannableString(oriStr);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(t100.f(16));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
        spannableString.setSpan(new ForegroundColorSpan(kvc0.a(h1c0.f11744O)), 0, oriStr.length(), 33);
        Object obj = pairW.first;
        obj.getClass();
        int iIntValue = ((Number) obj).intValue();
        Object obj2 = pairW.second;
        obj2.getClass();
        spannableString.setSpan(absoluteSizeSpan, iIntValue, ((Number) obj2).intValue(), 33);
        Object obj3 = pairW.first;
        obj3.getClass();
        int iIntValue2 = ((Number) obj3).intValue();
        Object obj4 = pairW.second;
        obj4.getClass();
        spannableString.setSpan(foregroundColorSpan, iIntValue2, ((Number) obj4).intValue(), 33);
        StyleSpan styleSpan = new StyleSpan(1);
        Object obj5 = pairW.first;
        obj5.getClass();
        int iIntValue3 = ((Number) obj5).intValue();
        Object obj6 = pairW.second;
        obj6.getClass();
        spannableString.setSpan(styleSpan, iIntValue3, ((Number) obj6).intValue(), 33);
        return spannableString;
    }
}

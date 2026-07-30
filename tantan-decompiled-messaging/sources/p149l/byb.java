package p149l;

import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class byb {

    /* JADX INFO: renamed from: a */
    @Nullable
    @ColorInt
    public final Integer f77896a;

    /* JADX INFO: renamed from: b */
    @Nullable
    @ColorInt
    public final Integer f77897b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @ColorInt
    public final Integer f77898c;

    /* JADX INFO: renamed from: d */
    @Nullable
    @ColorInt
    public final Integer f77899d;

    /* JADX INFO: renamed from: l.byb$a */
    public static final class C16010a {

        /* JADX INFO: renamed from: a */
        @Nullable
        @ColorInt
        public Integer f77900a;

        /* JADX INFO: renamed from: b */
        @Nullable
        @ColorInt
        public Integer f77901b;

        /* JADX INFO: renamed from: c */
        @Nullable
        @ColorInt
        public Integer f77902c;

        /* JADX INFO: renamed from: d */
        @Nullable
        @ColorInt
        public Integer f77903d;

        @NonNull
        /* JADX INFO: renamed from: a */
        public byb m104436a() {
            return new byb(this.f77900a, this.f77901b, this.f77902c, this.f77903d);
        }
    }

    public byb(@Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, @Nullable @ColorInt Integer num3, @Nullable @ColorInt Integer num4) {
        this.f77896a = num;
        this.f77897b = num2;
        this.f77898c = num3;
        this.f77899d = num4;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public Bundle m104435a() {
        Bundle bundle = new Bundle();
        Integer num = this.f77896a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f77897b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f77898c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f77899d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}

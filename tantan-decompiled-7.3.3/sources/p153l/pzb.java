package p153l;

import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class pzb {

    /* JADX INFO: renamed from: a */
    @Nullable
    @ColorInt
    public final Integer f154800a;

    /* JADX INFO: renamed from: b */
    @Nullable
    @ColorInt
    public final Integer f154801b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @ColorInt
    public final Integer f154802c;

    /* JADX INFO: renamed from: d */
    @Nullable
    @ColorInt
    public final Integer f154803d;

    /* JADX INFO: renamed from: l.pzb$a */
    public static final class C19466a {

        /* JADX INFO: renamed from: a */
        @Nullable
        @ColorInt
        public Integer f154804a;

        /* JADX INFO: renamed from: b */
        @Nullable
        @ColorInt
        public Integer f154805b;

        /* JADX INFO: renamed from: c */
        @Nullable
        @ColorInt
        public Integer f154806c;

        /* JADX INFO: renamed from: d */
        @Nullable
        @ColorInt
        public Integer f154807d;

        @NonNull
        /* JADX INFO: renamed from: a */
        public pzb m174359a() {
            return new pzb(this.f154804a, this.f154805b, this.f154806c, this.f154807d);
        }
    }

    public pzb(@Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, @Nullable @ColorInt Integer num3, @Nullable @ColorInt Integer num4) {
        this.f154800a = num;
        this.f154801b = num2;
        this.f154802c = num3;
        this.f154803d = num4;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public Bundle m174358a() {
        Bundle bundle = new Bundle();
        Integer num = this.f154800a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f154801b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f154802c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f154803d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}

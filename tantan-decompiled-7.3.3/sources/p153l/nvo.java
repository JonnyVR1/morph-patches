package p153l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"Ll/nvo;", "", "<init>", "()V", "Landroid/graphics/drawable/GradientDrawable;", "b", "()Landroid/graphics/drawable/GradientDrawable;", "a", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class nvo {

    @NotNull
    public static final nvo INSTANCE = new nvo();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final GradientDrawable m164908a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#332B1B"));
        gradientDrawable.setCornerRadius(qa00.m175859d(14.0f));
        return gradientDrawable;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final GradientDrawable m164909b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#00000000"));
        gradientDrawable.setStroke(qa00.m175859d(3.0f), Color.parseColor("#332B1B"));
        gradientDrawable.setCornerRadius(qa00.m175859d(12.0f));
        return gradientDrawable;
    }
}

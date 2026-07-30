package p149l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"Ll/nto;", "", "<init>", "()V", "Landroid/graphics/drawable/GradientDrawable;", "b", "()Landroid/graphics/drawable/GradientDrawable;", "a", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class nto {

    @NotNull
    public static final nto INSTANCE = new nto();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final GradientDrawable m161402a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#332B1B"));
        gradientDrawable.setCornerRadius(t100.m186890d(14.0f));
        return gradientDrawable;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final GradientDrawable m161403b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#00000000"));
        gradientDrawable.setStroke(t100.m186890d(3.0f), Color.parseColor("#332B1B"));
        gradientDrawable.setCornerRadius(t100.m186890d(12.0f));
        return gradientDrawable;
    }
}

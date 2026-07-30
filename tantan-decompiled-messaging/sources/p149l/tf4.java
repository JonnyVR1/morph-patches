package p149l;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class tf4 {

    /* JADX INFO: renamed from: g */
    public static final tf4 f169938g = new tf4(-1, RoundedDrawable.DEFAULT_BORDER_COLOR, 0, 0, -1, null);

    /* JADX INFO: renamed from: a */
    public final int f169939a;

    /* JADX INFO: renamed from: b */
    public final int f169940b;

    /* JADX INFO: renamed from: c */
    public final int f169941c;

    /* JADX INFO: renamed from: d */
    public final int f169942d;

    /* JADX INFO: renamed from: e */
    public final int f169943e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final Typeface f169944f;

    public tf4(int i, int i2, int i3, int i4, int i5, @Nullable Typeface typeface) {
        this.f169939a = i;
        this.f169940b = i2;
        this.f169941c = i3;
        this.f169942d = i4;
        this.f169943e = i5;
        this.f169944f = typeface;
    }

    @RequiresApi(19)
    /* JADX INFO: renamed from: a */
    public static tf4 m188648a(CaptioningManager.CaptionStyle captionStyle) {
        return vck0.f180948a >= 21 ? m188650c(captionStyle) : m188649b(captionStyle);
    }

    @RequiresApi(19)
    /* JADX INFO: renamed from: b */
    public static tf4 m188649b(CaptioningManager.CaptionStyle captionStyle) {
        return new tf4(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: c */
    public static tf4 m188650c(CaptioningManager.CaptionStyle captionStyle) {
        return new tf4(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f169938g.f169939a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f169938g.f169940b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f169938g.f169941c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f169938g.f169942d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f169938g.f169943e, captionStyle.getTypeface());
    }
}

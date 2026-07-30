package p153l;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class sg4 {

    /* JADX INFO: renamed from: g */
    public static final sg4 f167788g = new sg4(-1, RoundedDrawable.DEFAULT_BORDER_COLOR, 0, 0, -1, null);

    /* JADX INFO: renamed from: a */
    public final int f167789a;

    /* JADX INFO: renamed from: b */
    public final int f167790b;

    /* JADX INFO: renamed from: c */
    public final int f167791c;

    /* JADX INFO: renamed from: d */
    public final int f167792d;

    /* JADX INFO: renamed from: e */
    public final int f167793e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final Typeface f167794f;

    public sg4(int i, int i2, int i3, int i4, int i5, @Nullable Typeface typeface) {
        this.f167789a = i;
        this.f167790b = i2;
        this.f167791c = i3;
        this.f167792d = i4;
        this.f167793e = i5;
        this.f167794f = typeface;
    }

    @RequiresApi(19)
    /* JADX INFO: renamed from: a */
    public static sg4 m185689a(CaptioningManager.CaptionStyle captionStyle) {
        return bmk0.f77313a >= 21 ? m185691c(captionStyle) : m185690b(captionStyle);
    }

    @RequiresApi(19)
    /* JADX INFO: renamed from: b */
    public static sg4 m185690b(CaptioningManager.CaptionStyle captionStyle) {
        return new sg4(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: c */
    public static sg4 m185691c(CaptioningManager.CaptionStyle captionStyle) {
        return new sg4(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f167788g.f167789a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f167788g.f167790b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f167788g.f167791c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f167788g.f167792d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f167788g.f167793e, captionStyle.getTypeface());
    }
}

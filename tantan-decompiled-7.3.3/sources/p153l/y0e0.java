package p153l;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, m88121d2 = {"Ll/y0e0;", "Ll/k5m;", "<init>", "()V", "", "layoutWidth", "layoutHeight", "videoWidth", "videoHeight", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "a", "(IIIILandroid/widget/FrameLayout$LayoutParams;)Landroid/widget/FrameLayout$LayoutParams;", "Lkotlin/Pair;", "getRealSize", "()Lkotlin/Pair;", "b", "(IIII)Lkotlin/Pair;", "I", "realWidth", "realHeight", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class y0e0 implements k5m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int realWidth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int realHeight;

    @Override // p153l.k5m
    @NotNull
    /* JADX INFO: renamed from: a */
    public FrameLayout.LayoutParams mo148411a(int layoutWidth, int layoutHeight, int videoWidth, int videoHeight, @NotNull FrameLayout.LayoutParams layoutParams) {
        layoutParams.getClass();
        Pair<Integer, Integer> pairM213843b = m213843b(layoutWidth, layoutHeight, videoWidth, videoHeight);
        int iIntValue = pairM213843b.component1().intValue();
        int iIntValue2 = pairM213843b.component2().intValue();
        if (iIntValue <= 0 && iIntValue2 <= 0) {
            return layoutParams;
        }
        this.realWidth = iIntValue;
        this.realHeight = iIntValue2;
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue2;
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* JADX INFO: renamed from: b */
    public final Pair<Integer, Integer> m213843b(int layoutWidth, int layoutHeight, int videoWidth, int videoHeight) {
        float f = layoutWidth;
        float f2 = layoutHeight;
        float f3 = videoWidth / videoHeight;
        if (f / f2 > f3) {
            layoutWidth = (int) (f3 * f2);
        } else {
            layoutHeight = (int) (f / f3);
        }
        return new Pair<>(Integer.valueOf(layoutWidth), Integer.valueOf(layoutHeight));
    }

    @Override // p153l.k5m
    @NotNull
    public Pair<Integer, Integer> getRealSize() {
        return new Pair<>(Integer.valueOf(this.realWidth), Integer.valueOf(this.realHeight));
    }
}

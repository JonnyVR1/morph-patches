package p149l;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m87232d2 = {"Ll/xsd0;", "Ll/r2m;", "<init>", "()V", "", "layoutWidth", "layoutHeight", "videoWidth", "videoHeight", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "a", "(IIIILandroid/widget/FrameLayout$LayoutParams;)Landroid/widget/FrameLayout$LayoutParams;", "Lkotlin/Pair;", "getRealSize", "()Lkotlin/Pair;", "I", "realWidth", "b", "realHeight", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xsd0 implements r2m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int realWidth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int realHeight;

    @Override // p149l.r2m
    @NotNull
    /* JADX INFO: renamed from: a */
    public FrameLayout.LayoutParams mo177611a(int layoutWidth, int layoutHeight, int videoWidth, int videoHeight, @NotNull FrameLayout.LayoutParams layoutParams) {
        layoutParams.getClass();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.realWidth = layoutWidth;
        this.realHeight = layoutHeight;
        return layoutParams;
    }

    @Override // p149l.r2m
    @NotNull
    public Pair<Integer, Integer> getRealSize() {
        return new Pair<>(Integer.valueOf(this.realWidth), Integer.valueOf(this.realHeight));
    }
}

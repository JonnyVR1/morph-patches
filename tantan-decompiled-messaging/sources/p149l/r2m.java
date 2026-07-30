package p149l;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, m87232d2 = {"Ll/r2m;", "", "", "layoutWidth", "layoutHeight", "videoWidth", "videoHeight", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "a", "(IIIILandroid/widget/FrameLayout$LayoutParams;)Landroid/widget/FrameLayout$LayoutParams;", "Lkotlin/Pair;", "getRealSize", "()Lkotlin/Pair;", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface r2m {
    @NotNull
    /* JADX INFO: renamed from: a */
    FrameLayout.LayoutParams mo177611a(int layoutWidth, int layoutHeight, int videoWidth, int videoHeight, @NotNull FrameLayout.LayoutParams layoutParams);

    @NotNull
    Pair<Integer, Integer> getRealSize();
}

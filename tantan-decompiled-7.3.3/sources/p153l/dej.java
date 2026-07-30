package p153l;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m88121d2 = {"", "min", Constants.PRIORITY_MAX, "a", "(FFF)F", "Landroid/app/Activity;", "Landroid/widget/FrameLayout;", "b", "(Landroid/app/Activity;)Landroid/widget/FrameLayout;", "decorView", "putong-common_intlGmsRelease"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dej {
    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ float m115418a(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final FrameLayout m115419b(@NotNull Activity activity) {
        activity.getClass();
        try {
            View decorView = activity.getWindow().getDecorView();
            decorView.getClass();
            return (FrameLayout) decorView;
        } catch (Exception unused) {
            return null;
        }
    }
}

package p003l;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\tB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000e"}, d2 = {"Ll/ssd0;", "Landroidx/viewpager2/widget/ViewPager2$k;", "<init>", "()V", "Landroid/view/View;", "view", "", "position", "", "a", "(Landroid/view/View;F)V", "F", "mMinScale", "Companion", "b_core_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class ssd0 implements ViewPager2.k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public float mMinScale = 0.85f;

    /* JADX INFO: renamed from: a */
    public void m9480a(@NotNull View view, float position) {
        view.getClass();
        int width = view.getWidth();
        view.setPivotY(view.getHeight() >> 1);
        view.setPivotX(width >> 1);
        if (position < -1.0f) {
            view.setScaleX(this.mMinScale);
            view.setScaleY(this.mMinScale);
            view.setPivotX(width);
            return;
        }
        if (position > 1.0f) {
            view.setPivotX(0.0f);
            view.setScaleX(this.mMinScale);
            view.setScaleY(this.mMinScale);
            return;
        }
        float f = this.mMinScale;
        if (position < 0.0f) {
            float f2 = ((1.0f + position) * (1.0f - f)) + f;
            view.setScaleX(f2);
            view.setScaleY(f2);
            view.setPivotX(width * (((-position) * 0.5f) + 0.5f));
            return;
        }
        float f3 = 1.0f - position;
        float f4 = ((1.0f - f) * f3) + f;
        view.setScaleX(f4);
        view.setScaleY(f4);
        view.setPivotX(width * f3 * 0.5f);
    }
}

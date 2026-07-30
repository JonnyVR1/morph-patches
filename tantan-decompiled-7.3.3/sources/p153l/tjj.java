package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m88121d2 = {"Ll/tjj;", "Landroidx/viewpager2/widget/ViewPager2$k;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.page, "", "position", "", "a", "(Landroid/view/View;F)V", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "b", "absPosition", "c", "(F)F", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class tjj implements ViewPager2.InterfaceC0744k {
    @Override // androidx.viewpager2.widget.ViewPager2.InterfaceC0744k
    /* JADX INFO: renamed from: a */
    public void mo4287a(@NotNull View page, float position) {
        page.getClass();
        m191445d(page);
        m191443b(page, position);
    }

    /* JADX INFO: renamed from: b */
    public final void m191443b(View page, float position) {
        float fM191444c = m191444c(Math.abs(position));
        page.setScaleX(fM191444c);
        page.setScaleY(fM191444c);
    }

    /* JADX INFO: renamed from: c */
    public final float m191444c(float absPosition) {
        if (absPosition >= 1.0f) {
            return 0.9f;
        }
        return 1.0f - (absPosition * 0.100000024f);
    }

    /* JADX INFO: renamed from: d */
    public final void m191445d(View page) {
        if (page instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) page;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
    }
}

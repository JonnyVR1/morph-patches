package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0012"}, m88121d2 = {"Ll/ujj;", "Landroidx/viewpager2/widget/ViewPager2$k;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.page, "", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "", "position", "b", "(Landroid/view/View;F)V", "absPosition", "c", "(F)F", "a", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ujj implements ViewPager2.InterfaceC0744k {
    /* JADX INFO: renamed from: b */
    private final void m196371b(View page, float position) {
        float fM196372c = m196372c(Math.abs(position));
        page.setScaleX(fM196372c);
        page.setScaleY(fM196372c);
    }

    /* JADX INFO: renamed from: c */
    private final float m196372c(float absPosition) {
        if (absPosition >= 1.0f) {
            return 0.9f;
        }
        return 1.0f - (absPosition * 0.100000024f);
    }

    /* JADX INFO: renamed from: d */
    private final void m196373d(View page) {
        if (page instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) page;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.InterfaceC0744k
    /* JADX INFO: renamed from: a */
    public void mo4287a(@NotNull View page, float position) {
        page.getClass();
        m196373d(page);
        m196371b(page, position);
    }
}

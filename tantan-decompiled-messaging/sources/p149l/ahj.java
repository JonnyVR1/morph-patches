package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0012"}, m87232d2 = {"Ll/ahj;", "Landroidx/viewpager2/widget/ViewPager2$k;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.page, "", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "", "position", "b", "(Landroid/view/View;F)V", "absPosition", "c", "(F)F", "a", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ahj implements ViewPager2.InterfaceC0742k {
    /* JADX INFO: renamed from: b */
    private final void m96488b(View page, float position) {
        float fM96489c = m96489c(Math.abs(position));
        page.setScaleX(fM96489c);
        page.setScaleY(fM96489c);
    }

    /* JADX INFO: renamed from: c */
    private final float m96489c(float absPosition) {
        if (absPosition >= 1.0f) {
            return 0.9f;
        }
        return 1.0f - (absPosition * 0.100000024f);
    }

    /* JADX INFO: renamed from: d */
    private final void m96490d(View page) {
        if (page instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) page;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.InterfaceC0742k
    /* JADX INFO: renamed from: a */
    public void mo4285a(@NotNull View page, float position) {
        page.getClass();
        m96490d(page);
        m96488b(page, position);
    }
}

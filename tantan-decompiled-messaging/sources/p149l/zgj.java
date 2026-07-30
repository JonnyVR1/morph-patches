package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m87232d2 = {"Ll/zgj;", "Landroidx/viewpager2/widget/ViewPager2$k;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.page, "", "position", "", "a", "(Landroid/view/View;F)V", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "b", "absPosition", "c", "(F)F", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class zgj implements ViewPager2.InterfaceC0742k {
    @Override // androidx.viewpager2.widget.ViewPager2.InterfaceC0742k
    /* JADX INFO: renamed from: a */
    public void mo4285a(@NotNull View page, float position) {
        page.getClass();
        m218657d(page);
        m218655b(page, position);
    }

    /* JADX INFO: renamed from: b */
    public final void m218655b(View page, float position) {
        float fM218656c = m218656c(Math.abs(position));
        page.setScaleX(fM218656c);
        page.setScaleY(fM218656c);
    }

    /* JADX INFO: renamed from: c */
    public final float m218656c(float absPosition) {
        if (absPosition >= 1.0f) {
            return 0.9f;
        }
        return 1.0f - (absPosition * 0.100000024f);
    }

    /* JADX INFO: renamed from: d */
    public final void m218657d(View page) {
        if (page instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) page;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
    }
}

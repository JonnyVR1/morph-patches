package p153l;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Px;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019À\u0006\u0003"}, m88121d2 = {"Ll/aum;", "", "", "pagerCount", "currentPage", "", "a", "(II)V", "Landroid/widget/RelativeLayout$LayoutParams;", "getIndicatorParams", "()Landroid/widget/RelativeLayout$LayoutParams;", "position", "", "positionOffset", "positionOffsetPixels", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "Landroid/view/View;", "getView", "()Landroid/view/View;", OMSTemplateModeType.view, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public interface aum {
    /* JADX INFO: renamed from: a */
    void mo60794a(int pagerCount, int currentPage);

    @Nullable
    RelativeLayout.LayoutParams getIndicatorParams();

    @Nullable
    View getView();

    void onPageScrollStateChanged(int state);

    void onPageScrolled(int position, float positionOffset, @Px int positionOffsetPixels);

    void onPageSelected(int position);
}

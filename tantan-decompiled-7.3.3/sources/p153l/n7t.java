package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n7t<P extends hj2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f140627e;

    /* JADX INFO: renamed from: f */
    public View f140628f;

    /* JADX INFO: renamed from: g */
    public ViewPager2 f140629g;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199203p4, viewGroup, false);
        m161889u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m161889u(ViewGroup viewGroup) {
        this.f140627e = (LinearLayout) viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.f140628f = childAt;
        String str = childAt == null ? "_empty_view" : null;
        ViewPager2 viewPager2 = (ViewPager2) viewGroup.getChildAt(1);
        this.f140629g = viewPager2;
        if (viewPager2 == null) {
            str = "_pager_content";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}

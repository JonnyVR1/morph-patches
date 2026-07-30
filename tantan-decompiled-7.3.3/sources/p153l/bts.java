package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class bts<P extends hj2, T> extends BaseDialogHolder<P, T> {

    /* JADX INFO: renamed from: e */
    public FrameLayout f78393e;

    /* JADX INFO: renamed from: f */
    public ViewPager2 f78394f;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198921T1, viewGroup, false);
        m106380u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m106380u(ViewGroup viewGroup) {
        this.f78393e = (FrameLayout) viewGroup;
        ViewPager2 viewPager2 = (ViewPager2) viewGroup.getChildAt(0);
        this.f78394f = viewPager2;
        String str = viewPager2 == null ? "_pager_content" : null;
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: v */
    public FrameLayout m106381v() {
        return this.f78393e;
    }
}

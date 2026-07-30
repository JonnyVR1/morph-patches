package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import l.jfd0;
import p002l.zi2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ars<P extends zi2, T> extends BaseDialogHolder<P, T> {

    /* JADX INFO: renamed from: e */
    public FrameLayout f7871e;

    /* JADX INFO: renamed from: f */
    public ViewPager2 f7872f;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19685T1, viewGroup, false);
        m10070u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m10070u(ViewGroup viewGroup) {
        this.f7871e = (FrameLayout) viewGroup;
        ViewPager2 childAt = viewGroup.getChildAt(0);
        this.f7872f = childAt;
        String str = childAt == null ? "_pager_content" : null;
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: v */
    public FrameLayout m10071v() {
        return this.f7871e;
    }
}

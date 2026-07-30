package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class ars<P extends zi2, T> extends BaseDialogHolder<P, T> {

    /* JADX INFO: renamed from: e */
    public FrameLayout f71339e;

    /* JADX INFO: renamed from: f */
    public ViewPager2 f71340f;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168189T1, viewGroup, false);
        m98550u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m98550u(ViewGroup viewGroup) {
        this.f71339e = (FrameLayout) viewGroup;
        ViewPager2 viewPager2 = (ViewPager2) viewGroup.getChildAt(0);
        this.f71340f = viewPager2;
        String str = viewPager2 == null ? "_pager_content" : null;
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: v */
    public FrameLayout m98551v() {
        return this.f71339e;
    }
}

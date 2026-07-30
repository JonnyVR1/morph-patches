package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import l.jfd0;
import p002l.zi2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class m5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f15244e;

    /* JADX INFO: renamed from: f */
    public View f15245f;

    /* JADX INFO: renamed from: g */
    public ViewPager2 f15246g;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19967p4, viewGroup, false);
        m17721u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m17721u(ViewGroup viewGroup) {
        this.f15244e = (LinearLayout) viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.f15245f = childAt;
        String str = childAt == null ? "_empty_view" : null;
        ViewPager2 childAt2 = viewGroup.getChildAt(1);
        this.f15246g = childAt2;
        if (childAt2 == null) {
            str = "_pager_content";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}

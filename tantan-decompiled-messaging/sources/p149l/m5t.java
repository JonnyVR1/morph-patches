package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f131416e;

    /* JADX INFO: renamed from: f */
    public View f131417f;

    /* JADX INFO: renamed from: g */
    public ViewPager2 f131418g;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168471p4, viewGroup, false);
        m153148u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m153148u(ViewGroup viewGroup) {
        this.f131416e = (LinearLayout) viewGroup;
        View childAt = viewGroup.getChildAt(0);
        this.f131417f = childAt;
        String str = childAt == null ? "_empty_view" : null;
        ViewPager2 viewPager2 = (ViewPager2) viewGroup.getChildAt(1);
        this.f131418g = viewPager2;
        if (viewPager2 == null) {
            str = "_pager_content";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}

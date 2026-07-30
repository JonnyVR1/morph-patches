package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import l.jfd0;
import l.syk;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j4v extends BaseDialogHolder<syk, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f13571e;

    /* JADX INFO: renamed from: f */
    public VText f13572f;

    /* JADX INFO: renamed from: g */
    public VImage f13573g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f13574h;

    /* JADX INFO: renamed from: i */
    public VLinear f13575i;

    /* JADX INFO: renamed from: j */
    public VImage f13576j;

    /* JADX INFO: renamed from: k */
    public VText f13577k;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19777a9, viewGroup, false);
        m15661u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m15661u(ViewGroup viewGroup) {
        this.f13571e = (ConstraintLayout) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f13572f = childAt;
        String str = childAt == null ? "_title" : null;
        VImage childAt2 = viewGroup.getChildAt(1);
        this.f13573g = childAt2;
        if (childAt2 == null) {
            str = "_back";
        }
        VRecyclerView childAt3 = viewGroup.getChildAt(3);
        this.f13574h = childAt3;
        if (childAt3 == null) {
            str = "_recyclerView";
        }
        VLinear childAt4 = viewGroup.getChildAt(4);
        this.f13575i = childAt4;
        if (childAt4 == null) {
            str = "_empty";
        }
        VImage childAt5 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        this.f13576j = childAt5;
        if (childAt5 == null) {
            str = "_empty_icon";
        }
        VText childAt6 = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        this.f13577k = childAt6;
        if (childAt6 == null) {
            str = "_empty_text";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}

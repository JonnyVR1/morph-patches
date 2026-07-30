package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class k6v extends BaseDialogHolder<i1l, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f124211e;

    /* JADX INFO: renamed from: f */
    public VText f124212f;

    /* JADX INFO: renamed from: g */
    public VImage f124213g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f124214h;

    /* JADX INFO: renamed from: i */
    public VLinear f124215i;

    /* JADX INFO: renamed from: j */
    public VImage f124216j;

    /* JADX INFO: renamed from: k */
    public VText f124217k;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199013a9, viewGroup, false);
        m148577u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m148577u(ViewGroup viewGroup) {
        this.f124211e = (ConstraintLayout) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f124212f = vText;
        String str = vText == null ? "_title" : null;
        VImage vImage = (VImage) viewGroup.getChildAt(1);
        this.f124213g = vImage;
        if (vImage == null) {
            str = "_back";
        }
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(3);
        this.f124214h = vRecyclerView;
        if (vRecyclerView == null) {
            str = "_recyclerView";
        }
        VLinear vLinear = (VLinear) viewGroup.getChildAt(4);
        this.f124215i = vLinear;
        if (vLinear == null) {
            str = "_empty";
        }
        VImage vImage2 = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        this.f124216j = vImage2;
        if (vImage2 == null) {
            str = "_empty_icon";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        this.f124217k = vText2;
        if (vText2 == null) {
            str = "_empty_text";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}

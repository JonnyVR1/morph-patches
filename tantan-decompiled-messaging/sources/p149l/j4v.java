package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class j4v extends BaseDialogHolder<syk, String> {

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f116239e;

    /* JADX INFO: renamed from: f */
    public VText f116240f;

    /* JADX INFO: renamed from: g */
    public VImage f116241g;

    /* JADX INFO: renamed from: h */
    public VRecyclerView f116242h;

    /* JADX INFO: renamed from: i */
    public VLinear f116243i;

    /* JADX INFO: renamed from: j */
    public VImage f116244j;

    /* JADX INFO: renamed from: k */
    public VText f116245k;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168281a9, viewGroup, false);
        m139782u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m139782u(ViewGroup viewGroup) {
        this.f116239e = (ConstraintLayout) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f116240f = vText;
        String str = vText == null ? "_title" : null;
        VImage vImage = (VImage) viewGroup.getChildAt(1);
        this.f116241g = vImage;
        if (vImage == null) {
            str = "_back";
        }
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(3);
        this.f116242h = vRecyclerView;
        if (vRecyclerView == null) {
            str = "_recyclerView";
        }
        VLinear vLinear = (VLinear) viewGroup.getChildAt(4);
        this.f116243i = vLinear;
        if (vLinear == null) {
            str = "_empty";
        }
        VImage vImage2 = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        this.f116244j = vImage2;
        if (vImage2 == null) {
            str = "_empty_icon";
        }
        VText vText2 = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        this.f116245k = vText2;
        if (vText2 == null) {
            str = "_empty_text";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}

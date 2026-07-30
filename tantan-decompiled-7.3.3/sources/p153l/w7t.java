package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallManageItemView;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class w7t<P extends hj2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public VLinear f187789e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f187790f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f187791g;

    /* JADX INFO: renamed from: h */
    public TextView f187792h;

    /* JADX INFO: renamed from: i */
    public TextView f187793i;

    /* JADX INFO: renamed from: j */
    public TextView f187794j;

    /* JADX INFO: renamed from: k */
    public CallManageItemView f187795k;

    /* JADX INFO: renamed from: l */
    public CallManageItemView f187796l;

    /* JADX INFO: renamed from: m */
    public CallManageItemView f187797m;

    /* JADX INFO: renamed from: n */
    public CallManageItemView f187798n;

    /* JADX INFO: renamed from: o */
    public CallManageItemView f187799o;

    /* JADX INFO: renamed from: p */
    public CallManageItemView f187800p;

    /* JADX INFO: renamed from: q */
    public CallManageItemView f187801q;

    /* JADX INFO: renamed from: r */
    public CallManageItemView f187802r;

    /* JADX INFO: renamed from: s */
    public CallManageItemView f187803s;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199242s4, viewGroup, false);
        m205388u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m205388u(ViewGroup viewGroup) {
        this.f187789e = (VLinear) viewGroup;
        LinearLayout linearLayout = (LinearLayout) viewGroup.getChildAt(0);
        this.f187790f = linearLayout;
        String str = linearLayout == null ? "_ll_user_desc" : null;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f187791g = vDraweeView;
        if (vDraweeView == null) {
            str = "_ll_user_desc_avatar";
        }
        TextView textView = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        this.f187792h = textView;
        if (textView == null) {
            str = "_ll_user_desc_tv_name";
        }
        TextView textView2 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        this.f187793i = textView2;
        if (textView2 == null) {
            str = "_ll_user_desc_unit";
        }
        TextView textView3 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        this.f187794j = textView3;
        if (textView3 == null) {
            str = "_ll_user_desc_tv_heart";
        }
        CallManageItemView callManageItemView = (CallManageItemView) viewGroup.getChildAt(1);
        this.f187795k = callManageItemView;
        if (callManageItemView == null) {
            str = "_send_gift";
        }
        CallManageItemView callManageItemView2 = (CallManageItemView) viewGroup.getChildAt(2);
        this.f187796l = callManageItemView2;
        if (callManageItemView2 == null) {
            str = "_mute";
        }
        CallManageItemView callManageItemView3 = (CallManageItemView) viewGroup.getChildAt(3);
        this.f187797m = callManageItemView3;
        if (callManageItemView3 == null) {
            str = "_lead_role";
        }
        CallManageItemView callManageItemView4 = (CallManageItemView) viewGroup.getChildAt(4);
        this.f187798n = callManageItemView4;
        if (callManageItemView4 == null) {
            str = "_beauty";
        }
        CallManageItemView callManageItemView5 = (CallManageItemView) viewGroup.getChildAt(5);
        this.f187799o = callManageItemView5;
        if (callManageItemView5 == null) {
            str = "_switch_camera";
        }
        CallManageItemView callManageItemView6 = (CallManageItemView) viewGroup.getChildAt(6);
        this.f187800p = callManageItemView6;
        if (callManageItemView6 == null) {
            str = "_switch_video_call";
        }
        CallManageItemView callManageItemView7 = (CallManageItemView) viewGroup.getChildAt(7);
        this.f187801q = callManageItemView7;
        if (callManageItemView7 == null) {
            str = "_invite_video_call";
        }
        CallManageItemView callManageItemView8 = (CallManageItemView) viewGroup.getChildAt(8);
        this.f187802r = callManageItemView8;
        if (callManageItemView8 == null) {
            str = "_call_fans";
        }
        CallManageItemView callManageItemView9 = (CallManageItemView) viewGroup.getChildAt(9);
        this.f187803s = callManageItemView9;
        if (callManageItemView9 == null) {
            str = "_end";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }
}

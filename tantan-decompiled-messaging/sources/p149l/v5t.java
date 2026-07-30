package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallManageItemView;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class v5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public VLinear f180112e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f180113f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f180114g;

    /* JADX INFO: renamed from: h */
    public TextView f180115h;

    /* JADX INFO: renamed from: i */
    public TextView f180116i;

    /* JADX INFO: renamed from: j */
    public TextView f180117j;

    /* JADX INFO: renamed from: k */
    public CallManageItemView f180118k;

    /* JADX INFO: renamed from: l */
    public CallManageItemView f180119l;

    /* JADX INFO: renamed from: m */
    public CallManageItemView f180120m;

    /* JADX INFO: renamed from: n */
    public CallManageItemView f180121n;

    /* JADX INFO: renamed from: o */
    public CallManageItemView f180122o;

    /* JADX INFO: renamed from: p */
    public CallManageItemView f180123p;

    /* JADX INFO: renamed from: q */
    public CallManageItemView f180124q;

    /* JADX INFO: renamed from: r */
    public CallManageItemView f180125r;

    /* JADX INFO: renamed from: s */
    public CallManageItemView f180126s;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168510s4, viewGroup, false);
        m197181u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m197181u(ViewGroup viewGroup) {
        this.f180112e = (VLinear) viewGroup;
        LinearLayout linearLayout = (LinearLayout) viewGroup.getChildAt(0);
        this.f180113f = linearLayout;
        String str = linearLayout == null ? "_ll_user_desc" : null;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f180114g = vDraweeView;
        if (vDraweeView == null) {
            str = "_ll_user_desc_avatar";
        }
        TextView textView = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        this.f180115h = textView;
        if (textView == null) {
            str = "_ll_user_desc_tv_name";
        }
        TextView textView2 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        this.f180116i = textView2;
        if (textView2 == null) {
            str = "_ll_user_desc_unit";
        }
        TextView textView3 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        this.f180117j = textView3;
        if (textView3 == null) {
            str = "_ll_user_desc_tv_heart";
        }
        CallManageItemView callManageItemView = (CallManageItemView) viewGroup.getChildAt(1);
        this.f180118k = callManageItemView;
        if (callManageItemView == null) {
            str = "_send_gift";
        }
        CallManageItemView callManageItemView2 = (CallManageItemView) viewGroup.getChildAt(2);
        this.f180119l = callManageItemView2;
        if (callManageItemView2 == null) {
            str = "_mute";
        }
        CallManageItemView callManageItemView3 = (CallManageItemView) viewGroup.getChildAt(3);
        this.f180120m = callManageItemView3;
        if (callManageItemView3 == null) {
            str = "_lead_role";
        }
        CallManageItemView callManageItemView4 = (CallManageItemView) viewGroup.getChildAt(4);
        this.f180121n = callManageItemView4;
        if (callManageItemView4 == null) {
            str = "_beauty";
        }
        CallManageItemView callManageItemView5 = (CallManageItemView) viewGroup.getChildAt(5);
        this.f180122o = callManageItemView5;
        if (callManageItemView5 == null) {
            str = "_switch_camera";
        }
        CallManageItemView callManageItemView6 = (CallManageItemView) viewGroup.getChildAt(6);
        this.f180123p = callManageItemView6;
        if (callManageItemView6 == null) {
            str = "_switch_video_call";
        }
        CallManageItemView callManageItemView7 = (CallManageItemView) viewGroup.getChildAt(7);
        this.f180124q = callManageItemView7;
        if (callManageItemView7 == null) {
            str = "_invite_video_call";
        }
        CallManageItemView callManageItemView8 = (CallManageItemView) viewGroup.getChildAt(8);
        this.f180125r = callManageItemView8;
        if (callManageItemView8 == null) {
            str = "_call_fans";
        }
        CallManageItemView callManageItemView9 = (CallManageItemView) viewGroup.getChildAt(9);
        this.f180126s = callManageItemView9;
        if (callManageItemView9 == null) {
            str = "_end";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }
}

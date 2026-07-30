package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallManageItemView;
import l.jfd0;
import p002l.zi2;
import v.VDraweeView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v5t<P extends zi2> extends BaseDialogHolder<P, String> {

    /* JADX INFO: renamed from: e */
    public VLinear f20993e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f20994f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f20995g;

    /* JADX INFO: renamed from: h */
    public TextView f20996h;

    /* JADX INFO: renamed from: i */
    public TextView f20997i;

    /* JADX INFO: renamed from: j */
    public TextView f20998j;

    /* JADX INFO: renamed from: k */
    public CallManageItemView f20999k;

    /* JADX INFO: renamed from: l */
    public CallManageItemView f21000l;

    /* JADX INFO: renamed from: m */
    public CallManageItemView f21001m;

    /* JADX INFO: renamed from: n */
    public CallManageItemView f21002n;

    /* JADX INFO: renamed from: o */
    public CallManageItemView f21003o;

    /* JADX INFO: renamed from: p */
    public CallManageItemView f21004p;

    /* JADX INFO: renamed from: q */
    public CallManageItemView f21005q;

    /* JADX INFO: renamed from: r */
    public CallManageItemView f21006r;

    /* JADX INFO: renamed from: s */
    public CallManageItemView f21007s;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20006s4, viewGroup, false);
        m23779u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m23779u(ViewGroup viewGroup) {
        this.f20993e = (VLinear) viewGroup;
        LinearLayout linearLayout = (LinearLayout) viewGroup.getChildAt(0);
        this.f20994f = linearLayout;
        String str = linearLayout == null ? "_ll_user_desc" : null;
        VDraweeView childAt = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f20995g = childAt;
        if (childAt == null) {
            str = "_ll_user_desc_avatar";
        }
        TextView textView = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        this.f20996h = textView;
        if (textView == null) {
            str = "_ll_user_desc_tv_name";
        }
        TextView textView2 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        this.f20997i = textView2;
        if (textView2 == null) {
            str = "_ll_user_desc_unit";
        }
        TextView textView3 = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        this.f20998j = textView3;
        if (textView3 == null) {
            str = "_ll_user_desc_tv_heart";
        }
        CallManageItemView childAt2 = viewGroup.getChildAt(1);
        this.f20999k = childAt2;
        if (childAt2 == null) {
            str = "_send_gift";
        }
        CallManageItemView childAt3 = viewGroup.getChildAt(2);
        this.f21000l = childAt3;
        if (childAt3 == null) {
            str = "_mute";
        }
        CallManageItemView childAt4 = viewGroup.getChildAt(3);
        this.f21001m = childAt4;
        if (childAt4 == null) {
            str = "_lead_role";
        }
        CallManageItemView childAt5 = viewGroup.getChildAt(4);
        this.f21002n = childAt5;
        if (childAt5 == null) {
            str = "_beauty";
        }
        CallManageItemView childAt6 = viewGroup.getChildAt(5);
        this.f21003o = childAt6;
        if (childAt6 == null) {
            str = "_switch_camera";
        }
        CallManageItemView childAt7 = viewGroup.getChildAt(6);
        this.f21004p = childAt7;
        if (childAt7 == null) {
            str = "_switch_video_call";
        }
        CallManageItemView childAt8 = viewGroup.getChildAt(7);
        this.f21005q = childAt8;
        if (childAt8 == null) {
            str = "_invite_video_call";
        }
        CallManageItemView childAt9 = viewGroup.getChildAt(8);
        this.f21006r = childAt9;
        if (childAt9 == null) {
            str = "_call_fans";
        }
        CallManageItemView childAt10 = viewGroup.getChildAt(9);
        this.f21007s = childAt10;
        if (childAt10 == null) {
            str = "_end";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }
}

package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallSummary;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallResultView;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public class x5t<P extends zi2> extends BaseDialogHolder<P, BLiveMultiCallSummary> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f191182e;

    /* JADX INFO: renamed from: f */
    public CallResultView f191183f;

    /* JADX INFO: renamed from: g */
    public CallResultView f191184g;

    /* JADX INFO: renamed from: h */
    public CallResultView f191185h;

    /* JADX INFO: renamed from: i */
    public TextView f191186i;

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168536u4, viewGroup, false);
        m207141u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m207141u(ViewGroup viewGroup) {
        this.f191182e = (LinearLayout) viewGroup;
        CallResultView callResultView = (CallResultView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f191183f = callResultView;
        String str = callResultView == null ? "_crv_time" : null;
        CallResultView callResultView2 = (CallResultView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f191184g = callResultView2;
        if (callResultView2 == null) {
            str = "_crv_heart";
        }
        CallResultView callResultView3 = (CallResultView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f191185h = callResultView3;
        if (callResultView3 == null) {
            str = "_crv_add_fans";
        }
        TextView textView = (TextView) viewGroup.getChildAt(2);
        this.f191186i = textView;
        if (textView == null) {
            str = "_tv_confirm";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: v */
    public void mo207142v(BLiveMultiCallSummary bLiveMultiCallSummary) {
    }
}

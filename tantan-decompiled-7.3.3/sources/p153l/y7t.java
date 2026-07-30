package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallSummary;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallResultView;
import p153l.hj2;

/* JADX INFO: loaded from: classes4.dex */
public class y7t<P extends hj2> extends BaseDialogHolder<P, BLiveMultiCallSummary> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f197830e;

    /* JADX INFO: renamed from: f */
    public CallResultView f197831f;

    /* JADX INFO: renamed from: g */
    public CallResultView f197832g;

    /* JADX INFO: renamed from: h */
    public CallResultView f197833h;

    /* JADX INFO: renamed from: i */
    public TextView f197834i;

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199268u4, viewGroup, false);
        m214604u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m214604u(ViewGroup viewGroup) {
        this.f197830e = (LinearLayout) viewGroup;
        CallResultView callResultView = (CallResultView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f197831f = callResultView;
        String str = callResultView == null ? "_crv_time" : null;
        CallResultView callResultView2 = (CallResultView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f197832g = callResultView2;
        if (callResultView2 == null) {
            str = "_crv_heart";
        }
        CallResultView callResultView3 = (CallResultView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f197833h = callResultView3;
        if (callResultView3 == null) {
            str = "_crv_add_fans";
        }
        TextView textView = (TextView) viewGroup.getChildAt(2);
        this.f197834i = textView;
        if (textView == null) {
            str = "_tv_confirm";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: v */
    public void mo136466v(BLiveMultiCallSummary bLiveMultiCallSummary) {
    }
}

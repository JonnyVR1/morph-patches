package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder;
import com.p1.mobile.putong.live.base.data.BLiveMultiCallSummary;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallResultView;
import l.jfd0;
import p002l.zi2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x5t<P extends zi2> extends BaseDialogHolder<P, BLiveMultiCallSummary> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f22132e;

    /* JADX INFO: renamed from: f */
    public CallResultView f22133f;

    /* JADX INFO: renamed from: g */
    public CallResultView f22134g;

    /* JADX INFO: renamed from: h */
    public CallResultView f22135h;

    /* JADX INFO: renamed from: i */
    public TextView f22136i;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20032u4, viewGroup, false);
        m25689u((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: u */
    public void m25689u(ViewGroup viewGroup) {
        this.f22132e = (LinearLayout) viewGroup;
        CallResultView childAt = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f22133f = childAt;
        String str = childAt == null ? "_crv_time" : null;
        CallResultView childAt2 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        this.f22134g = childAt2;
        if (childAt2 == null) {
            str = "_crv_heart";
        }
        CallResultView childAt3 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        this.f22135h = childAt3;
        if (childAt3 == null) {
            str = "_crv_add_fans";
        }
        TextView textView = (TextView) viewGroup.getChildAt(2);
        this.f22136i = textView;
        if (textView == null) {
            str = "_tv_confirm";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: v */
    public void m25690v(BLiveMultiCallSummary bLiveMultiCallSummary) {
    }
}

package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonVoiceView;
import com.p046p1.mobile.putong.live.external.view.widgets.VirtualVoiceSquareTopBtnView;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class x8v implements s7m<t8v> {

    /* JADX INFO: renamed from: a */
    public final View f191552a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f191553b;

    /* JADX INFO: renamed from: c */
    public t8v f191554c;

    /* JADX INFO: renamed from: e */
    public View f191556e;

    /* JADX INFO: renamed from: f */
    public VLinear f191557f;

    /* JADX INFO: renamed from: d */
    public boolean f191555d = false;

    /* JADX INFO: renamed from: g */
    public List<BLiveVoiceSquareButton> f191558g = new ArrayList();

    public x8v(LiveSquareTopButtonVoiceView liveSquareTopButtonVoiceView) {
        VDraweeView vDraweeView = liveSquareTopButtonVoiceView.f45041d;
        this.f191553b = vDraweeView;
        this.f191556e = liveSquareTopButtonVoiceView.f45042e;
        this.f191552a = liveSquareTopButtonVoiceView.f45043f;
        this.f191557f = liveSquareTopButtonVoiceView.f45040c;
        xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.u8v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175166a.m207447k(view);
            }
        });
        xdl0.m208329E0(this.f191556e, new View.OnClickListener() { // from class: l.v8v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180594a.m207448l(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m207447k(View view) {
        getAct().startActivity(f7v.m119832p(getAct()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m207448l(View view) {
        ehn0.m116502e(getAct(), AnchorStartData.getBuilder().m67563n("create-room-btn").m67569t("upper_right_button").m67560k());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f191554c.getAct();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(t8v t8vVar) {
        this.f191554c = t8vVar;
    }

    /* JADX INFO: renamed from: e */
    public void m207450e(boolean z) {
        xdl0.m208344M(this.f191552a, false);
        if (this.f191555d) {
            xdl0.m208344M(this.f191553b, false);
            xdl0.m208344M(this.f191556e, false);
            return;
        }
        boolean zM150808m = lor.m150808m();
        VDraweeView vDraweeView = this.f191553b;
        if (!zM150808m) {
            xdl0.m208344M(vDraweeView, z);
            xdl0.m208344M(this.f191556e, z);
            xdl0.m208344M(this.f191557f, z);
        } else {
            xdl0.m208344M(vDraweeView, false);
            xdl0.m208344M(this.f191556e, false);
            xdl0.m208344M(this.f191557f, false);
            xdl0.m208344M(this.f191552a, z);
        }
    }

    /* JADX INFO: renamed from: f */
    public final View m207451f(Act act, BLiveVoiceSquareButton bLiveVoiceSquareButton) {
        VirtualVoiceSquareTopBtnView virtualVoiceSquareTopBtnView = new VirtualVoiceSquareTopBtnView(act);
        virtualVoiceSquareTopBtnView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        xdl0.m208359W(virtualVoiceSquareTopBtnView, t100.m186890d(6.0f));
        virtualVoiceSquareTopBtnView.m70934d(bLiveVoiceSquareButton);
        return virtualVoiceSquareTopBtnView;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m207452i(List<BLiveVoiceSquareButton> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).type, this.f191558g.get(i).type)) {
                return false;
            }
        }
        return true;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m207453j(List<BLiveVoiceSquareButton> list) {
        return (list.size() == this.f191558g.size() && m207452i(list)) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m207454m(Act act, BLiveVoiceSquareButton bLiveVoiceSquareButton) {
        this.f191557f.addView(m207451f(act, bLiveVoiceSquareButton));
    }

    /* JADX INFO: renamed from: n */
    public final void m207455n(List<BLiveVoiceSquareButton> list) {
        for (int i = 0; i < list.size() && i < this.f191557f.getChildCount(); i++) {
            View childAt = this.f191557f.getChildAt(i);
            BLiveVoiceSquareButton bLiveVoiceSquareButton = list.get(i);
            if (childAt instanceof VirtualVoiceSquareTopBtnView) {
                VirtualVoiceSquareTopBtnView virtualVoiceSquareTopBtnView = (VirtualVoiceSquareTopBtnView) childAt;
                if (virtualVoiceSquareTopBtnView.m70933c(bLiveVoiceSquareButton.type)) {
                    virtualVoiceSquareTopBtnView.m70935e(bLiveVoiceSquareButton.showRedDot);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m207456p(final Act act, List<BLiveVoiceSquareButton> list) {
        if (!m207453j(list)) {
            if (vwb.m200296J(list)) {
                return;
            }
            m207455n(list);
        } else {
            this.f191558g.clear();
            this.f191557f.removeAllViews();
            if (vwb.m200296J(list)) {
                return;
            }
            this.f191558g.addAll(list);
            vwb.m200354z(this.f191558g, new e30() { // from class: l.w8v
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f185259a.m207454m(act, (BLiveVoiceSquareButton) obj);
                }
            });
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}

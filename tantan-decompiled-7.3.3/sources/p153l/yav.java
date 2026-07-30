package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSquareButton;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonVoiceView;
import com.p051p1.mobile.putong.live.external.view.widgets.VirtualVoiceSquareTopBtnView;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes9.dex */
public class yav implements iam<uav> {

    /* JADX INFO: renamed from: a */
    public final View f198254a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f198255b;

    /* JADX INFO: renamed from: c */
    public uav f198256c;

    /* JADX INFO: renamed from: e */
    public View f198258e;

    /* JADX INFO: renamed from: f */
    public VLinear f198259f;

    /* JADX INFO: renamed from: d */
    public boolean f198257d = false;

    /* JADX INFO: renamed from: g */
    public List<BLiveVoiceSquareButton> f198260g = new ArrayList();

    public yav(LiveSquareTopButtonVoiceView liveSquareTopButtonVoiceView) {
        VDraweeView vDraweeView = liveSquareTopButtonVoiceView.f45889d;
        this.f198255b = vDraweeView;
        this.f198258e = liveSquareTopButtonVoiceView.f45890e;
        this.f198254a = liveSquareTopButtonVoiceView.f45891f;
        this.f198259f = liveSquareTopButtonVoiceView.f45888c;
        bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.vav
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183171a.m214949k(view);
            }
        });
        bnl0.m105509E0(this.f198258e, new View.OnClickListener() { // from class: l.wav
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188170a.m214950l(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m214949k(View view) {
        getAct().startActivity(g9v.m129622p(getAct()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m214950l(View view) {
        iqn0.m141677e(getAct(), AnchorStartData.getBuilder().m68746n("create-room-btn").m68752t("upper_right_button").m68743k());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f198256c.getAct();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(uav uavVar) {
        this.f198256c = uavVar;
    }

    /* JADX INFO: renamed from: e */
    public void m214952e(boolean z) {
        bnl0.m105524M(this.f198254a, false);
        if (this.f198257d) {
            bnl0.m105524M(this.f198255b, false);
            bnl0.m105524M(this.f198258e, false);
            return;
        }
        boolean zM159593m = mqr.m159593m();
        VDraweeView vDraweeView = this.f198255b;
        if (!zM159593m) {
            bnl0.m105524M(vDraweeView, z);
            bnl0.m105524M(this.f198258e, z);
            bnl0.m105524M(this.f198259f, z);
        } else {
            bnl0.m105524M(vDraweeView, false);
            bnl0.m105524M(this.f198258e, false);
            bnl0.m105524M(this.f198259f, false);
            bnl0.m105524M(this.f198254a, z);
        }
    }

    /* JADX INFO: renamed from: f */
    public final View m214953f(Act act, BLiveVoiceSquareButton bLiveVoiceSquareButton) {
        VirtualVoiceSquareTopBtnView virtualVoiceSquareTopBtnView = new VirtualVoiceSquareTopBtnView(act);
        virtualVoiceSquareTopBtnView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        bnl0.m105539W(virtualVoiceSquareTopBtnView, qa00.m175859d(6.0f));
        virtualVoiceSquareTopBtnView.m72117d(bLiveVoiceSquareButton);
        return virtualVoiceSquareTopBtnView;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m214954i(List<BLiveVoiceSquareButton> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(list.get(i).type, this.f198260g.get(i).type)) {
                return false;
            }
        }
        return true;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m214955j(List<BLiveVoiceSquareButton> list) {
        return (list.size() == this.f198260g.size() && m214954i(list)) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m214956m(Act act, BLiveVoiceSquareButton bLiveVoiceSquareButton) {
        this.f198259f.addView(m214953f(act, bLiveVoiceSquareButton));
    }

    /* JADX INFO: renamed from: n */
    public final void m214957n(List<BLiveVoiceSquareButton> list) {
        for (int i = 0; i < list.size() && i < this.f198259f.getChildCount(); i++) {
            View childAt = this.f198259f.getChildAt(i);
            BLiveVoiceSquareButton bLiveVoiceSquareButton = list.get(i);
            if (childAt instanceof VirtualVoiceSquareTopBtnView) {
                VirtualVoiceSquareTopBtnView virtualVoiceSquareTopBtnView = (VirtualVoiceSquareTopBtnView) childAt;
                if (virtualVoiceSquareTopBtnView.m72116c(bLiveVoiceSquareButton.type)) {
                    virtualVoiceSquareTopBtnView.m72118e(bLiveVoiceSquareButton.showRedDot);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m214958p(final Act act, List<BLiveVoiceSquareButton> list) {
        if (!m214955j(list)) {
            if (jyb.m147479J(list)) {
                return;
            }
            m214957n(list);
        } else {
            this.f198260g.clear();
            this.f198259f.removeAllViews();
            if (jyb.m147479J(list)) {
                return;
            }
            this.f198260g.addAll(list);
            jyb.m147537z(this.f198260g, new y20() { // from class: l.xav
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f193087a.m214956m(act, (BLiveVoiceSquareButton) obj);
                }
            });
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}

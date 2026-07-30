package com.p051p1.mobile.putong.live.livingroom.officialshow.pusher;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.view.LiveLoadingView;
import com.p051p1.mobile.putong.live.livingroom.base.pusher.C12878a;
import com.p051p1.mobile.putong.live.livingroom.base.pusher.RefreshCause;
import p151v.VImage;
import p151v.VText;
import p153l.abc0;
import p153l.bnl0;
import p153l.d4m;
import p153l.iam;
import p153l.lu6;
import p153l.mdc0;
import p153l.n3d0;
import p153l.qa00;
import p153l.qf50;
import p153l.sf50;
import p153l.yec0;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class OfficialShowPusherView extends FrameLayout implements iam<qf50>, d4m {

    /* JADX INFO: renamed from: a */
    public FrameLayout f51959a;

    /* JADX INFO: renamed from: b */
    public VImage f51960b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f51961c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f51962d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f51963e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f51964f;

    /* JADX INFO: renamed from: g */
    public VText f51965g;

    /* JADX INFO: renamed from: h */
    public ImageView f51966h;

    /* JADX INFO: renamed from: i */
    public ViewStub f51967i;

    /* JADX INFO: renamed from: j */
    public ViewStub f51968j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f51969k;

    /* JADX INFO: renamed from: l */
    public qf50 f51970l;

    /* JADX INFO: renamed from: m */
    public PopupWindow f51971m;

    /* JADX INFO: renamed from: n */
    public int f51972n;

    /* JADX INFO: renamed from: o */
    public LiveLoadingView f51973o;

    public OfficialShowPusherView(@NonNull Context context) {
        super(context);
        this.f51972n = -qa00.m175859d(50.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m76578f(int i, View view) {
        this.f51970l.mo95984q1(RefreshCause.ClickError, i);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.d4m
    /* JADX INFO: renamed from: a */
    public void mo73156a(String str, final int i) {
        m76581i(false);
        if (this.f51969k == null) {
            LinearLayout linearLayout = (LinearLayout) this.f51968j.inflate();
            this.f51969k = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f51969k.findViewById(mdc0.f136274q1).setOnClickListener(new View.OnClickListener() { // from class: l.rf50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f162761a.m76578f(i, view);
                }
            });
        }
        ((TextView) this.f51969k.findViewById(mdc0.f136301t1)).setText(str);
        this.f51969k.setTag(mdc0.f135932F3, Integer.valueOf(i));
        bnl0.m105524M(this.f51969k, true);
    }

    @Override // p153l.d4m
    /* JADX INFO: renamed from: b */
    public void mo73157b() {
        LinearLayout linearLayout = this.f51969k;
        if (linearLayout != null) {
            bnl0.m105524M(linearLayout, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m76579d(View view) {
        sf50.m185581a(this, view);
    }

    @Override // p153l.iam
    public void destroy() {
        m76581i(false);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qf50 qf50Var) {
        this.f51970l = qf50Var;
    }

    @Override // p153l.d4m
    public int getErrorCode() {
        LinearLayout linearLayout = this.f51969k;
        if (linearLayout == null) {
            return 0;
        }
        Object tag = linearLayout.getTag(mdc0.f135932F3);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public void m76581i(boolean z) {
        m76582j(z);
        PopupWindow popupWindow = this.f51971m;
        if (!z) {
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f51971m.dismiss();
            return;
        }
        if (popupWindow == null) {
            View viewInflate = View.inflate(getContext(), yec0.f199327yb, null);
            viewInflate.setBackgroundDrawable(n3d0.m161278b(abc0.f69545r6));
            ((TextView) viewInflate.findViewById(R.id.message)).setText(lu6.m155847c(zrv.m221193k().m203546W3()));
            PopupWindow popupWindow2 = new PopupWindow(getContext());
            this.f51971m = popupWindow2;
            popupWindow2.setContentView(viewInflate);
            this.f51971m.setTouchable(false);
            this.f51971m.setBackgroundDrawable(null);
        }
        if (this.f51971m.isShowing()) {
            return;
        }
        this.f51971m.showAtLocation(this, 17, 0, this.f51972n);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m76582j(boolean z) {
        if (z || this.f51973o != null) {
            if (this.f51973o == null) {
                this.f51973o = (LiveLoadingView) this.f51967i.inflate();
            }
            LiveLoadingView liveLoadingView = this.f51973o;
            if (z) {
                bnl0.m105524M(liveLoadingView, true);
                this.f51973o.m69927g();
            } else {
                liveLoadingView.m69928h();
                bnl0.m105524M(this.f51967i, false);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76579d(this);
        C12878a.INSTANCE.m73163a(this.f51966h);
    }

    public void setWaterMarkUserId(String str) {
        this.f51965g.setText(String.format("%s", str));
    }

    public void setWaterMarkVisible(boolean z) {
        bnl0.m105524M(this.f51964f, z);
    }

    public OfficialShowPusherView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51972n = -qa00.m175859d(50.0f);
    }

    public OfficialShowPusherView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51972n = -qa00.m175859d(50.0f);
    }
}

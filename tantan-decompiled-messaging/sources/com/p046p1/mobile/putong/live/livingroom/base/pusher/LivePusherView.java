package com.p046p1.mobile.putong.live.livingroom.base.pusher;

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
import com.p046p1.mobile.putong.live.base.view.LiveLoadingView;
import p147v.VText;
import p149l.fdt;
import p149l.g5c0;
import p149l.it6;
import p149l.k1m;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.u2c0;
import p149l.xdl0;
import p149l.ygb0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class LivePusherView extends FrameLayout implements s7m<ygb0>, k1m {

    /* JADX INFO: renamed from: a */
    public FrameLayout f47870a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f47871b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f47872c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f47873d;

    /* JADX INFO: renamed from: e */
    public VText f47874e;

    /* JADX INFO: renamed from: f */
    public ImageView f47875f;

    /* JADX INFO: renamed from: g */
    public ViewStub f47876g;

    /* JADX INFO: renamed from: h */
    public ViewStub f47877h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f47878i;

    /* JADX INFO: renamed from: j */
    public ygb0 f47879j;

    /* JADX INFO: renamed from: k */
    public PopupWindow f47880k;

    /* JADX INFO: renamed from: l */
    public int f47881l;

    /* JADX INFO: renamed from: m */
    public LiveLoadingView f47882m;

    public LivePusherView(@NonNull Context context) {
        super(context);
        this.f47881l = -t100.m186890d(50.0f);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.k1m
    /* JADX INFO: renamed from: a */
    public void mo71973a(String str, final int i) {
        m71978i(false);
        if (this.f47878i == null) {
            LinearLayout linearLayout = (LinearLayout) this.f47877h.inflate();
            this.f47878i = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f47878i.findViewById(g5c0.f101029q1).setOnClickListener(new View.OnClickListener() { // from class: l.edt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f90643a.m71977f(i, view);
                }
            });
        }
        ((TextView) this.f47878i.findViewById(g5c0.f101056t1)).setText(str);
        this.f47878i.setTag(g5c0.f100687F3, Integer.valueOf(i));
        xdl0.m208344M(this.f47878i, true);
    }

    @Override // p149l.k1m
    /* JADX INFO: renamed from: b */
    public void mo71974b() {
        LinearLayout linearLayout = this.f47878i;
        if (linearLayout != null) {
            xdl0.m208344M(linearLayout, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m71975d(View view) {
        fdt.m121005a(this, view);
    }

    @Override // p149l.s7m
    public void destroy() {
        m71978i(false);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ygb0 ygb0Var) {
        this.f47879j = ygb0Var;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m71977f(int i, View view) {
        this.f47879j.mo100521q1(RefreshCause.ClickError, i);
    }

    @Override // p149l.k1m
    public int getErrorCode() {
        LinearLayout linearLayout = this.f47878i;
        if (linearLayout == null) {
            return 0;
        }
        Object tag = linearLayout.getTag(g5c0.f100687F3);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public void m71978i(boolean z) {
        m71979j(z);
        PopupWindow popupWindow = this.f47880k;
        if (!z) {
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f47880k.dismiss();
            return;
        }
        if (popupWindow == null) {
            View viewInflate = View.inflate(getContext(), t6c0.f168595yb, null);
            viewInflate.setBackgroundDrawable(getContext().getResources().getDrawable(u2c0.f173425r6));
            ((TextView) viewInflate.findViewById(R.id.message)).setText(it6.m138182c(ypv.m215672k().m195759W3()));
            PopupWindow popupWindow2 = new PopupWindow(getContext());
            this.f47880k = popupWindow2;
            popupWindow2.setContentView(viewInflate);
            this.f47880k.setTouchable(false);
            this.f47880k.setBackgroundDrawable(null);
        }
        if (this.f47880k.isShowing()) {
            return;
        }
        this.f47880k.showAtLocation(this, 17, 0, this.f47881l);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m71979j(boolean z) {
        if (z || this.f47882m != null) {
            if (this.f47882m == null) {
                this.f47882m = (LiveLoadingView) this.f47876g.inflate();
            }
            LiveLoadingView liveLoadingView = this.f47882m;
            if (z) {
                xdl0.m208344M(liveLoadingView, true);
                this.f47882m.m68744g();
            } else {
                liveLoadingView.m68745h();
                xdl0.m208344M(this.f47876g, false);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71975d(this);
        C12715a.INSTANCE.m71980a(this.f47875f);
    }

    public void setWaterMarkUserId(String str) {
        this.f47874e.setText(String.format("%s", str));
    }

    public void setWaterMarkVisible(boolean z) {
        xdl0.m208344M(this.f47873d, z);
    }

    public LivePusherView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47881l = -t100.m186890d(50.0f);
    }

    public LivePusherView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47881l = -t100.m186890d(50.0f);
    }
}

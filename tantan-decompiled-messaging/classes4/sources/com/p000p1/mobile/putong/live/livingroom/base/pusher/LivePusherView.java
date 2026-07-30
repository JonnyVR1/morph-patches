package com.p000p1.mobile.putong.live.livingroom.base.pusher;

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
import com.p1.mobile.putong.live.base.view.LiveLoadingView;
import l.it6;
import l.s7m;
import l.t100;
import l.u2c0;
import l.xdl0;
import l.ypv;
import p002l.fdt;
import p002l.g5c0;
import p002l.k1m;
import p002l.t6c0;
import p002l.ygb0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LivePusherView extends FrameLayout implements s7m<ygb0>, k1m {

    /* JADX INFO: renamed from: a */
    public FrameLayout f3912a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f3913b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f3914c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f3915d;

    /* JADX INFO: renamed from: e */
    public VText f3916e;

    /* JADX INFO: renamed from: f */
    public ImageView f3917f;

    /* JADX INFO: renamed from: g */
    public ViewStub f3918g;

    /* JADX INFO: renamed from: h */
    public ViewStub f3919h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f3920i;

    /* JADX INFO: renamed from: j */
    public ygb0 f3921j;

    /* JADX INFO: renamed from: k */
    public PopupWindow f3922k;

    /* JADX INFO: renamed from: l */
    public int f3923l;

    /* JADX INFO: renamed from: m */
    public LiveLoadingView f3924m;

    public LivePusherView(@NonNull Context context) {
        super(context);
        this.f3923l = -t100.d(50.0f);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5360C0() {
        return getContext();
    }

    @Override // p002l.k1m
    /* JADX INFO: renamed from: a */
    public void mo5361a(String str, final int i) {
        m5366i(false);
        if (this.f3920i == null) {
            LinearLayout linearLayout = (LinearLayout) this.f3919h.inflate();
            this.f3920i = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f3920i.findViewById(g5c0.f11179q1).setOnClickListener(new View.OnClickListener() { // from class: l.edt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9686a.m5365f(i, view);
                }
            });
        }
        ((TextView) this.f3920i.findViewById(g5c0.f11206t1)).setText(str);
        this.f3920i.setTag(g5c0.f10837F3, Integer.valueOf(i));
        xdl0.M(this.f3920i, true);
    }

    @Override // p002l.k1m
    /* JADX INFO: renamed from: b */
    public void mo5362b() {
        LinearLayout linearLayout = this.f3920i;
        if (linearLayout != null) {
            xdl0.M(linearLayout, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5363d(View view) {
        fdt.m13133a(this, view);
    }

    public void destroy() {
        m5366i(false);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m5367i1(ygb0 ygb0Var) {
        this.f3921j = ygb0Var;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m5365f(int i, View view) {
        this.f3921j.mo10198q1(RefreshCause.ClickError, i);
    }

    @Override // p002l.k1m
    public int getErrorCode() {
        LinearLayout linearLayout = this.f3920i;
        if (linearLayout == null) {
            return 0;
        }
        Object tag = linearLayout.getTag(g5c0.f10837F3);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public void m5366i(boolean z) {
        m5368j(z);
        PopupWindow popupWindow = this.f3922k;
        if (!z) {
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f3922k.dismiss();
            return;
        }
        if (popupWindow == null) {
            View viewInflate = View.inflate(m5360C0(), t6c0.f20091yb, null);
            viewInflate.setBackgroundDrawable(m5360C0().getResources().getDrawable(u2c0.r6));
            ((TextView) viewInflate.findViewById(R.id.message)).setText(it6.c(ypv.k().W3()));
            PopupWindow popupWindow2 = new PopupWindow(m5360C0());
            this.f3922k = popupWindow2;
            popupWindow2.setContentView(viewInflate);
            this.f3922k.setTouchable(false);
            this.f3922k.setBackgroundDrawable(null);
        }
        if (this.f3922k.isShowing()) {
            return;
        }
        this.f3922k.showAtLocation(this, 17, 0, this.f3923l);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m5368j(boolean z) {
        if (z || this.f3924m != null) {
            if (this.f3924m == null) {
                this.f3924m = this.f3918g.inflate();
            }
            LiveLoadingView liveLoadingView = this.f3924m;
            if (z) {
                xdl0.M(liveLoadingView, true);
                this.f3924m.g();
            } else {
                liveLoadingView.h();
                xdl0.M(this.f3918g, false);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5363d(this);
        C0304a.INSTANCE.m5369a(this.f3917f);
    }

    public void setWaterMarkUserId(String str) {
        this.f3916e.setText(String.format("%s", str));
    }

    public void setWaterMarkVisible(boolean z) {
        xdl0.M(this.f3915d, z);
    }

    public LivePusherView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3923l = -t100.d(50.0f);
    }

    public LivePusherView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3923l = -t100.d(50.0f);
    }
}

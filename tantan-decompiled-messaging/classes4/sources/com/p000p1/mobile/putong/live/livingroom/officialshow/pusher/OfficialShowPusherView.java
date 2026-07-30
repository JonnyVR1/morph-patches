package com.p000p1.mobile.putong.live.livingroom.officialshow.pusher;

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
import com.p000p1.mobile.putong.live.livingroom.base.pusher.C0304a;
import com.p000p1.mobile.putong.live.livingroom.base.pusher.RefreshCause;
import com.p1.mobile.putong.live.base.view.LiveLoadingView;
import l.it6;
import l.kvc0;
import l.s7m;
import l.t100;
import l.u2c0;
import l.xdl0;
import l.ypv;
import p002l.b750;
import p002l.d750;
import p002l.g5c0;
import p002l.k1m;
import p002l.t6c0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OfficialShowPusherView extends FrameLayout implements s7m<b750>, k1m {

    /* JADX INFO: renamed from: a */
    public FrameLayout f7153a;

    /* JADX INFO: renamed from: b */
    public VImage f7154b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f7155c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f7156d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f7157e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f7158f;

    /* JADX INFO: renamed from: g */
    public VText f7159g;

    /* JADX INFO: renamed from: h */
    public ImageView f7160h;

    /* JADX INFO: renamed from: i */
    public ViewStub f7161i;

    /* JADX INFO: renamed from: j */
    public ViewStub f7162j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f7163k;

    /* JADX INFO: renamed from: l */
    public b750 f7164l;

    /* JADX INFO: renamed from: m */
    public PopupWindow f7165m;

    /* JADX INFO: renamed from: n */
    public int f7166n;

    /* JADX INFO: renamed from: o */
    public LiveLoadingView f7167o;

    public OfficialShowPusherView(@NonNull Context context) {
        super(context);
        this.f7166n = -t100.d(50.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m9022f(int i, View view) {
        this.f7164l.mo10198q1(RefreshCause.ClickError, i);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9023C0() {
        return getContext();
    }

    @Override // p002l.k1m
    /* JADX INFO: renamed from: a */
    public void mo5361a(String str, final int i) {
        m9026i(false);
        if (this.f7163k == null) {
            LinearLayout linearLayout = (LinearLayout) this.f7162j.inflate();
            this.f7163k = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f7163k.findViewById(g5c0.f11179q1).setOnClickListener(new View.OnClickListener() { // from class: l.c750
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8516a.m9022f(i, view);
                }
            });
        }
        ((TextView) this.f7163k.findViewById(g5c0.f11206t1)).setText(str);
        this.f7163k.setTag(g5c0.f10837F3, Integer.valueOf(i));
        xdl0.M(this.f7163k, true);
    }

    @Override // p002l.k1m
    /* JADX INFO: renamed from: b */
    public void mo5362b() {
        LinearLayout linearLayout = this.f7163k;
        if (linearLayout != null) {
            xdl0.M(linearLayout, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9024d(View view) {
        d750.m11613a(this, view);
    }

    public void destroy() {
        m9026i(false);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m9027i1(b750 b750Var) {
        this.f7164l = b750Var;
    }

    @Override // p002l.k1m
    public int getErrorCode() {
        LinearLayout linearLayout = this.f7163k;
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
    public void m9026i(boolean z) {
        m9028j(z);
        PopupWindow popupWindow = this.f7165m;
        if (!z) {
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f7165m.dismiss();
            return;
        }
        if (popupWindow == null) {
            View viewInflate = View.inflate(m9023C0(), t6c0.f20091yb, null);
            viewInflate.setBackgroundDrawable(kvc0.b(u2c0.r6));
            ((TextView) viewInflate.findViewById(R.id.message)).setText(it6.c(ypv.k().W3()));
            PopupWindow popupWindow2 = new PopupWindow(m9023C0());
            this.f7165m = popupWindow2;
            popupWindow2.setContentView(viewInflate);
            this.f7165m.setTouchable(false);
            this.f7165m.setBackgroundDrawable(null);
        }
        if (this.f7165m.isShowing()) {
            return;
        }
        this.f7165m.showAtLocation(this, 17, 0, this.f7166n);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m9028j(boolean z) {
        if (z || this.f7167o != null) {
            if (this.f7167o == null) {
                this.f7167o = this.f7161i.inflate();
            }
            LiveLoadingView liveLoadingView = this.f7167o;
            if (z) {
                xdl0.M(liveLoadingView, true);
                this.f7167o.g();
            } else {
                liveLoadingView.h();
                xdl0.M(this.f7161i, false);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9024d(this);
        C0304a.INSTANCE.m5369a(this.f7160h);
    }

    public void setWaterMarkUserId(String str) {
        this.f7159g.setText(String.format("%s", str));
    }

    public void setWaterMarkVisible(boolean z) {
        xdl0.M(this.f7158f, z);
    }

    public OfficialShowPusherView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7166n = -t100.d(50.0f);
    }

    public OfficialShowPusherView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7166n = -t100.d(50.0f);
    }
}

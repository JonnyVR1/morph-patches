package com.p046p1.mobile.putong.live.livingroom.officialshow.pusher;

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
import com.p046p1.mobile.putong.live.livingroom.base.pusher.C12715a;
import com.p046p1.mobile.putong.live.livingroom.base.pusher.RefreshCause;
import p147v.VImage;
import p147v.VText;
import p149l.b750;
import p149l.d750;
import p149l.g5c0;
import p149l.it6;
import p149l.k1m;
import p149l.kvc0;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.u2c0;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class OfficialShowPusherView extends FrameLayout implements s7m<b750>, k1m {

    /* JADX INFO: renamed from: a */
    public FrameLayout f51111a;

    /* JADX INFO: renamed from: b */
    public VImage f51112b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f51113c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f51114d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f51115e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f51116f;

    /* JADX INFO: renamed from: g */
    public VText f51117g;

    /* JADX INFO: renamed from: h */
    public ImageView f51118h;

    /* JADX INFO: renamed from: i */
    public ViewStub f51119i;

    /* JADX INFO: renamed from: j */
    public ViewStub f51120j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f51121k;

    /* JADX INFO: renamed from: l */
    public b750 f51122l;

    /* JADX INFO: renamed from: m */
    public PopupWindow f51123m;

    /* JADX INFO: renamed from: n */
    public int f51124n;

    /* JADX INFO: renamed from: o */
    public LiveLoadingView f51125o;

    public OfficialShowPusherView(@NonNull Context context) {
        super(context);
        this.f51124n = -t100.m186890d(50.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m75395f(int i, View view) {
        this.f51122l.mo100521q1(RefreshCause.ClickError, i);
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
        m75398i(false);
        if (this.f51121k == null) {
            LinearLayout linearLayout = (LinearLayout) this.f51120j.inflate();
            this.f51121k = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f51121k.findViewById(g5c0.f101029q1).setOnClickListener(new View.OnClickListener() { // from class: l.c750
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79595a.m75395f(i, view);
                }
            });
        }
        ((TextView) this.f51121k.findViewById(g5c0.f101056t1)).setText(str);
        this.f51121k.setTag(g5c0.f100687F3, Integer.valueOf(i));
        xdl0.m208344M(this.f51121k, true);
    }

    @Override // p149l.k1m
    /* JADX INFO: renamed from: b */
    public void mo71974b() {
        LinearLayout linearLayout = this.f51121k;
        if (linearLayout != null) {
            xdl0.m208344M(linearLayout, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m75396d(View view) {
        d750.m110224a(this, view);
    }

    @Override // p149l.s7m
    public void destroy() {
        m75398i(false);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(b750 b750Var) {
        this.f51122l = b750Var;
    }

    @Override // p149l.k1m
    public int getErrorCode() {
        LinearLayout linearLayout = this.f51121k;
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
    public void m75398i(boolean z) {
        m75399j(z);
        PopupWindow popupWindow = this.f51123m;
        if (!z) {
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f51123m.dismiss();
            return;
        }
        if (popupWindow == null) {
            View viewInflate = View.inflate(getContext(), t6c0.f168595yb, null);
            viewInflate.setBackgroundDrawable(kvc0.m147353b(u2c0.f173425r6));
            ((TextView) viewInflate.findViewById(R.id.message)).setText(it6.m138182c(ypv.m215672k().m195759W3()));
            PopupWindow popupWindow2 = new PopupWindow(getContext());
            this.f51123m = popupWindow2;
            popupWindow2.setContentView(viewInflate);
            this.f51123m.setTouchable(false);
            this.f51123m.setBackgroundDrawable(null);
        }
        if (this.f51123m.isShowing()) {
            return;
        }
        this.f51123m.showAtLocation(this, 17, 0, this.f51124n);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m75399j(boolean z) {
        if (z || this.f51125o != null) {
            if (this.f51125o == null) {
                this.f51125o = (LiveLoadingView) this.f51119i.inflate();
            }
            LiveLoadingView liveLoadingView = this.f51125o;
            if (z) {
                xdl0.m208344M(liveLoadingView, true);
                this.f51125o.m68744g();
            } else {
                liveLoadingView.m68745h();
                xdl0.m208344M(this.f51119i, false);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75396d(this);
        C12715a.INSTANCE.m71980a(this.f51118h);
    }

    public void setWaterMarkUserId(String str) {
        this.f51117g.setText(String.format("%s", str));
    }

    public void setWaterMarkVisible(boolean z) {
        xdl0.m208344M(this.f51116f, z);
    }

    public OfficialShowPusherView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51124n = -t100.m186890d(50.0f);
    }

    public OfficialShowPusherView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51124n = -t100.m186890d(50.0f);
    }
}

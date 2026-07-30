package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.panel.unknown.PanelUnknownView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoicePanelUnknownViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4183a;

    /* JADX INFO: renamed from: b */
    public PanelUnknownView f4184b;

    /* JADX INFO: renamed from: c */
    public VLinear f4185c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f4186d;

    /* JADX INFO: renamed from: e */
    public VText f4187e;

    /* JADX INFO: renamed from: f */
    public VFrame f4188f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f4189g;

    public LiveVirtualVoicePanelUnknownViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5489C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5490a(ViewGroup viewGroup) {
        this.f4184b = (PanelUnknownView) viewGroup;
        VLinear childAt = viewGroup.getChildAt(0);
        this.f4185c = childAt;
        String str = childAt == null ? "_ll_title" : null;
        VDraweeView childAt2 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f4186d = childAt2;
        if (childAt2 == null) {
            str = "_ll_title_icon";
        }
        VText childAt3 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f4187e = childAt3;
        if (childAt3 == null) {
            str = "_ll_title_content";
        }
        VFrame childAt4 = viewGroup.getChildAt(1);
        this.f4188f = childAt4;
        if (childAt4 == null) {
            str = "_expand_view";
        }
        RecyclerView childAt5 = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f4189g = childAt5;
        if (childAt5 == null) {
            str = "_recyclerview";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public PanelUnknownView getRoot() {
        return this.f4184b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5491i1(T t) {
        this.f4183a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19879i7, viewGroup, false);
        m5490a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5490a(this);
    }

    public LiveVirtualVoicePanelUnknownViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoicePanelUnknownViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

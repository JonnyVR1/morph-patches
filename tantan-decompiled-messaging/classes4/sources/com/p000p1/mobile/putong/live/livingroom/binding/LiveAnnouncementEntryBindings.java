package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.annoncements.view.LiveAnnouncementEntryView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveAnnouncementEntryBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f3999d;

    /* JADX INFO: renamed from: e */
    public LiveAnnouncementEntryView f4000e;

    /* JADX INFO: renamed from: f */
    public VText f4001f;

    public LiveAnnouncementEntryBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5404C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public LiveAnnouncementEntryView getRoot() {
        return this.f4000e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5405h0(ViewGroup viewGroup) {
        this.f4000e = (LiveAnnouncementEntryView) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f4001f = childAt;
        String str = childAt == null ? "_announcement_entry" : null;
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5406i1(T t) {
        this.f3999d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19845g, viewGroup, false);
        m5405h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5405h0(this);
    }

    public LiveAnnouncementEntryBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveAnnouncementEntryBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

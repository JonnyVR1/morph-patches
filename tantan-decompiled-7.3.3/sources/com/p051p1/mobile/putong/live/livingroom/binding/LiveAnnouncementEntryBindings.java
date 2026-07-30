package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.annoncements.view.LiveAnnouncementEntryView;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveAnnouncementEntryBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48805d;

    /* JADX INFO: renamed from: e */
    public LiveAnnouncementEntryView f48806e;

    /* JADX INFO: renamed from: f */
    public VText f48807f;

    public LiveAnnouncementEntryBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public LiveAnnouncementEntryView getRoot() {
        return this.f48806e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73194h0(ViewGroup viewGroup) {
        this.f48806e = (LiveAnnouncementEntryView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48807f = vText;
        String str = vText == null ? "_announcement_entry" : null;
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48805d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199081g, viewGroup, false);
        m73194h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73194h0(this);
    }

    public LiveAnnouncementEntryBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveAnnouncementEntryBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

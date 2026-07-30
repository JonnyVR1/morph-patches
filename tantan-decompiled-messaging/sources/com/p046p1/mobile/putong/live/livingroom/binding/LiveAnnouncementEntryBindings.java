package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.annoncements.view.LiveAnnouncementEntryView;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveAnnouncementEntryBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f47957d;

    /* JADX INFO: renamed from: e */
    public LiveAnnouncementEntryView f47958e;

    /* JADX INFO: renamed from: f */
    public VText f47959f;

    public LiveAnnouncementEntryBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public LiveAnnouncementEntryView getRoot() {
        return this.f47958e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72011h0(ViewGroup viewGroup) {
        this.f47958e = (LiveAnnouncementEntryView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f47959f = vText;
        String str = vText == null ? "_announcement_entry" : null;
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f47957d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168349g, viewGroup, false);
        m72011h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72011h0(this);
    }

    public LiveAnnouncementEntryBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveAnnouncementEntryBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

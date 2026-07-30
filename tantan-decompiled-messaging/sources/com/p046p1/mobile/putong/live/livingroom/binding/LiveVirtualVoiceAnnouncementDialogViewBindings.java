package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.announcement.AnnouncementView;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceAnnouncementDialogViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48089a;

    /* JADX INFO: renamed from: b */
    public AnnouncementView f48090b;

    /* JADX INFO: renamed from: c */
    public EditText f48091c;

    /* JADX INFO: renamed from: d */
    public VText f48092d;

    public LiveVirtualVoiceAnnouncementDialogViewBindings(Context context) {
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

    /* JADX INFO: renamed from: f */
    public void m72034f(ViewGroup viewGroup) {
        this.f48090b = (AnnouncementView) viewGroup;
        EditText editText = (EditText) viewGroup.getChildAt(1);
        this.f48091c = editText;
        String str = editText == null ? "_input_notice_text" : null;
        VText vText = (VText) viewGroup.getChildAt(2);
        this.f48092d = vText;
        if (vText == null) {
            str = "_go";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public AnnouncementView getRoot() {
        return this.f48090b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48089a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168218V6, viewGroup, false);
        m72034f((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72034f(this);
    }

    public LiveVirtualVoiceAnnouncementDialogViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceAnnouncementDialogViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

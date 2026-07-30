package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.announcement.AnnouncementView;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceAnnouncementDialogViewBindings<T extends k3m> extends LinearLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f48937a;

    /* JADX INFO: renamed from: b */
    public AnnouncementView f48938b;

    /* JADX INFO: renamed from: c */
    public EditText f48939c;

    /* JADX INFO: renamed from: d */
    public VText f48940d;

    public LiveVirtualVoiceAnnouncementDialogViewBindings(Context context) {
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

    /* JADX INFO: renamed from: f */
    public void m73217f(ViewGroup viewGroup) {
        this.f48938b = (AnnouncementView) viewGroup;
        EditText editText = (EditText) viewGroup.getChildAt(1);
        this.f48939c = editText;
        String str = editText == null ? "_input_notice_text" : null;
        VText vText = (VText) viewGroup.getChildAt(2);
        this.f48940d = vText;
        if (vText == null) {
            str = "_go";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public AnnouncementView getRoot() {
        return this.f48938b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48937a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198950V6, viewGroup, false);
        m73217f((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73217f(this);
    }

    public LiveVirtualVoiceAnnouncementDialogViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceAnnouncementDialogViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

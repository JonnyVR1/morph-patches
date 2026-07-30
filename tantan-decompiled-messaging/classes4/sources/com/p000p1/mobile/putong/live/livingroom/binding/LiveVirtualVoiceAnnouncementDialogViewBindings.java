package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.announcement.AnnouncementView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceAnnouncementDialogViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4131a;

    /* JADX INFO: renamed from: b */
    public AnnouncementView f4132b;

    /* JADX INFO: renamed from: c */
    public EditText f4133c;

    /* JADX INFO: renamed from: d */
    public VText f4134d;

    public LiveVirtualVoiceAnnouncementDialogViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5461C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m5462f(ViewGroup viewGroup) {
        this.f4132b = (AnnouncementView) viewGroup;
        EditText editText = (EditText) viewGroup.getChildAt(1);
        this.f4133c = editText;
        String str = editText == null ? "_input_notice_text" : null;
        VText childAt = viewGroup.getChildAt(2);
        this.f4134d = childAt;
        if (childAt == null) {
            str = "_go";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public AnnouncementView getRoot() {
        return this.f4132b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5463i1(T t) {
        this.f4131a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19714V6, viewGroup, false);
        m5462f((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5462f(this);
    }

    public LiveVirtualVoiceAnnouncementDialogViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceAnnouncementDialogViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

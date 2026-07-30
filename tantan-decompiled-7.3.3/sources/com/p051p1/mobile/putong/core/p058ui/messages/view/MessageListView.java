package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.VList_ViewBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class MessageListView extends VList_ViewBuffer {

    /* JADX INFO: renamed from: i */
    public boolean f33276i;

    /* JADX INFO: renamed from: j */
    public Runnable f33277j;

    public MessageListView(Context context) {
        super(context);
        this.f33276i = false;
        this.f33277j = new Runnable() { // from class: l.kfz
            @Override // java.lang.Runnable
            public final void run() {
                this.f126536a.m51119c();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m51119c() {
        scrollListBy(1000);
    }

    @Override // p151v.VList_ViewBuffer, android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!CoreModule.m30933P().m143412i().mo180314E() || this.f33276i) {
            return;
        }
        removeCallbacks(this.f33277j);
        postDelayed(this.f33277j, 250L);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33276i) {
            removeCallbacks(this.f33277j);
        }
        this.f33276i = true;
        return super.onTouchEvent(motionEvent);
    }

    public MessageListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33276i = false;
        this.f33277j = new Runnable() { // from class: l.kfz
            @Override // java.lang.Runnable
            public final void run() {
                this.f126536a.m51119c();
            }
        };
    }

    public MessageListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33276i = false;
        this.f33277j = new Runnable() { // from class: l.kfz
            @Override // java.lang.Runnable
            public final void run() {
                this.f126536a.m51119c();
            }
        };
    }
}

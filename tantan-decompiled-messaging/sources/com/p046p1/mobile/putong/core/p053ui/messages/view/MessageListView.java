package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.VList_ViewBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class MessageListView extends VList_ViewBuffer {

    /* JADX INFO: renamed from: i */
    public boolean f32428i;

    /* JADX INFO: renamed from: j */
    public Runnable f32429j;

    public MessageListView(Context context) {
        super(context);
        this.f32428i = false;
        this.f32429j = new Runnable() { // from class: l.n6z
            @Override // java.lang.Runnable
            public final void run() {
                this.f137470a.m49936c();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m49936c() {
        scrollListBy(1000);
    }

    @Override // p147v.VList_ViewBuffer, android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!CoreModule.m29935P().m94658i().mo158222E() || this.f32428i) {
            return;
        }
        removeCallbacks(this.f32429j);
        postDelayed(this.f32429j, 250L);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32428i) {
            removeCallbacks(this.f32429j);
        }
        this.f32428i = true;
        return super.onTouchEvent(motionEvent);
    }

    public MessageListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32428i = false;
        this.f32429j = new Runnable() { // from class: l.n6z
            @Override // java.lang.Runnable
            public final void run() {
                this.f137470a.m49936c();
            }
        };
    }

    public MessageListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32428i = false;
        this.f32429j = new Runnable() { // from class: l.n6z
            @Override // java.lang.Runnable
            public final void run() {
                this.f137470a.m49936c();
            }
        };
    }
}

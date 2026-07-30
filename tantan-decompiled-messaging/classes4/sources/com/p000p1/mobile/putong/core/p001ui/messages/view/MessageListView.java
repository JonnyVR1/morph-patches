package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p1.mobile.putong.core.CoreModule;
import v.VList_ViewBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MessageListView extends VList_ViewBuffer {

    /* JADX INFO: renamed from: i */
    public boolean f250i;

    /* JADX INFO: renamed from: j */
    public Runnable f251j;

    public MessageListView(Context context) {
        super(context);
        this.f250i = false;
        this.f251j = new Runnable() { // from class: l.n6z
            @Override // java.lang.Runnable
            public final void run() {
                this.f15849a.m358c();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m358c() {
        scrollListBy(1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!CoreModule.P().i().E() || this.f250i) {
            return;
        }
        removeCallbacks(this.f251j);
        postDelayed(this.f251j, 250L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f250i) {
            removeCallbacks(this.f251j);
        }
        this.f250i = true;
        return super/*android.view.View*/.onTouchEvent(motionEvent);
    }

    public MessageListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f250i = false;
        this.f251j = new Runnable() { // from class: l.n6z
            @Override // java.lang.Runnable
            public final void run() {
                this.f15849a.m358c();
            }
        };
    }

    public MessageListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f250i = false;
        this.f251j = new Runnable() { // from class: l.n6z
            @Override // java.lang.Runnable
            public final void run() {
                this.f15849a.m358c();
            }
        };
    }
}

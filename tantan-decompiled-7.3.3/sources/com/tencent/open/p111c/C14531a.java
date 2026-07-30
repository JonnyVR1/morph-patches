package com.tencent.open.p111c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.tencent.open.c.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14531a extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private static final String f61082a = "com.tencent.open.c.a";

    /* JADX INFO: renamed from: b */
    private Rect f61083b;

    /* JADX INFO: renamed from: c */
    private boolean f61084c;

    /* JADX INFO: renamed from: d */
    private a f61085d;

    /* JADX INFO: renamed from: com.tencent.open.c.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo85471a();

        /* JADX INFO: renamed from: a */
        void mo85472a(int i);
    }

    public C14531a(Context context) {
        super(context);
        this.f61083b = null;
        this.f61084c = false;
        this.f61085d = null;
        this.f61083b = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public void m85470a(a aVar) {
        this.f61085d = aVar;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        Activity activity = (Activity) getContext();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.f61083b);
        int height = (activity.getWindowManager().getDefaultDisplay().getHeight() - this.f61083b.top) - size;
        a aVar = this.f61085d;
        if (aVar != null && size != 0) {
            if (height > 100) {
                aVar.mo85472a((Math.abs(this.f61083b.height()) - getPaddingBottom()) - getPaddingTop());
            } else {
                aVar.mo85471a();
            }
        }
        super.onMeasure(i, i2);
    }
}

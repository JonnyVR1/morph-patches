package com.tencent.open.p106c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.tencent.open.c.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14368a extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private static final String f60234a = "com.tencent.open.c.a";

    /* JADX INFO: renamed from: b */
    private Rect f60235b;

    /* JADX INFO: renamed from: c */
    private boolean f60236c;

    /* JADX INFO: renamed from: d */
    private a f60237d;

    /* JADX INFO: renamed from: com.tencent.open.c.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo84288a();

        /* JADX INFO: renamed from: a */
        void mo84289a(int i);
    }

    public C14368a(Context context) {
        super(context);
        this.f60235b = null;
        this.f60236c = false;
        this.f60237d = null;
        this.f60235b = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public void m84287a(a aVar) {
        this.f60237d = aVar;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        Activity activity = (Activity) getContext();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.f60235b);
        int height = (activity.getWindowManager().getDefaultDisplay().getHeight() - this.f60235b.top) - size;
        a aVar = this.f60237d;
        if (aVar != null && size != 0) {
            if (height > 100) {
                aVar.mo84289a((Math.abs(this.f60235b.height()) - getPaddingBottom()) - getPaddingTop());
            } else {
                aVar.mo84288a();
            }
        }
        super.onMeasure(i, i2);
    }
}

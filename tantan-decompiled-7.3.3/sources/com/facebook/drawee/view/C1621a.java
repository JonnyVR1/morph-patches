package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.drawee.view.a */
/* JADX INFO: loaded from: classes.dex */
public class C1621a {

    /* JADX INFO: renamed from: com.facebook.drawee.view.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f6394a;

        /* JADX INFO: renamed from: b */
        public int f6395b;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8346a(int i) {
        return i == 0 || i == -2;
    }

    /* JADX INFO: renamed from: b */
    public static void m8347b(a aVar, float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f <= 0.0f || layoutParams == null) {
            return;
        }
        if (m8346a(layoutParams.height)) {
            aVar.f6395b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.f6394a) - i) / f) + i2), aVar.f6395b), 1073741824);
        } else if (m8346a(layoutParams.width)) {
            aVar.f6394a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.f6395b) - i2) * f) + i), aVar.f6394a), 1073741824);
        }
    }
}

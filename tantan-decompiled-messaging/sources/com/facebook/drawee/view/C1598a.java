package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.drawee.view.a */
/* JADX INFO: loaded from: classes.dex */
public class C1598a {

    /* JADX INFO: renamed from: com.facebook.drawee.view.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f6357a;

        /* JADX INFO: renamed from: b */
        public int f6358b;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8292a(int i) {
        return i == 0 || i == -2;
    }

    /* JADX INFO: renamed from: b */
    public static void m8293b(a aVar, float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f <= 0.0f || layoutParams == null) {
            return;
        }
        if (m8292a(layoutParams.height)) {
            aVar.f6358b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.f6357a) - i) / f) + i2), aVar.f6358b), 1073741824);
        } else if (m8292a(layoutParams.width)) {
            aVar.f6357a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.f6358b) - i2) * f) + i), aVar.f6357a), 1073741824);
        }
    }
}

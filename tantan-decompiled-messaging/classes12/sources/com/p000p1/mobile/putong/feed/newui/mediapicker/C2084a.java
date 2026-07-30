package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import l.hu0;
import p007l.a8c0;
import p007l.b5c0;
import p007l.o6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2084a extends hu0 {

    /* JADX INFO: renamed from: a */
    public TopSheetBehavior<FrameLayout> f2015a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f2016b;

    /* JADX INFO: renamed from: c */
    public TopSheetBehavior.AbstractC2082c f2017c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.a$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C2084a.this.isShowing()) {
                C2084a.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.a$b */
    public class b extends TopSheetBehavior.AbstractC2082c {
        public b() {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior.AbstractC2082c
        /* JADX INFO: renamed from: a */
        public void mo3581a(@NonNull View view, float f) {
        }

        @Override // com.p000p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior.AbstractC2082c
        /* JADX INFO: renamed from: b */
        public void mo3582b(@NonNull View view, int i) {
            if (i == 5) {
                C2084a.this.dismiss();
            }
        }
    }

    public C2084a(@NonNull Context context) {
        super(context, getThemeResId(context, 0));
        this.f2017c = new b();
        supportRequestWindowFeature(1);
    }

    public static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : a8c0.f5640i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        this.f2016b.removeAllViews();
        super/*android.app.Dialog*/.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final View m3597q(int i, View view, ViewGroup.LayoutParams layoutParams) {
        CoordinatorLayout coordinatorLayoutInflate = View.inflate(getContext(), o6c0.f11352z5, null);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayoutInflate, false);
        }
        FrameLayout frameLayout = (FrameLayout) coordinatorLayoutInflate.findViewById(b5c0.f5965H);
        this.f2016b = frameLayout;
        TopSheetBehavior<FrameLayout> topSheetBehaviorM3577n = TopSheetBehavior.m3577n(frameLayout);
        this.f2015a = topSheetBehaviorM3577n;
        topSheetBehaviorM3577n.m3578o(this.f2017c);
        FrameLayout frameLayout2 = this.f2016b;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayoutInflate.findViewById(b5c0.f6018Y1).setOnClickListener(new a());
        return coordinatorLayoutInflate;
    }

    public void setContentView(View view) {
        super.setContentView(m3597q(0, view, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
    }

    public void setContentView(@LayoutRes int i) {
        super.setContentView(m3597q(i, null, null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m3597q(0, view, layoutParams));
    }
}

package com.p046p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C2466R;
import p149l.a8c0;
import p149l.b5c0;
import p149l.hu0;
import p149l.o6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.a */
/* JADX INFO: loaded from: classes12.dex */
public class DialogC11240a extends hu0 {

    /* JADX INFO: renamed from: a */
    public TopSheetBehavior<FrameLayout> f40554a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f40555b;

    /* JADX INFO: renamed from: c */
    public TopSheetBehavior.AbstractC11238c f40556c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.a$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (DialogC11240a.this.isShowing()) {
                DialogC11240a.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.a$b */
    public class b extends TopSheetBehavior.AbstractC11238c {
        public b() {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior.AbstractC11238c
        /* JADX INFO: renamed from: a */
        public void mo62576a(@NonNull View view, float f) {
        }

        @Override // com.p046p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior.AbstractC11238c
        /* JADX INFO: renamed from: b */
        public void mo62577b(@NonNull View view, int i) {
            if (i == 5) {
                DialogC11240a.this.dismiss();
            }
        }
    }

    public DialogC11240a(@NonNull Context context) {
        super(context, getThemeResId(context, 0));
        this.f40556c = new b();
        supportRequestWindowFeature(1);
    }

    public static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C2466R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : a8c0.f68020i;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f40555b.removeAllViews();
        super.dismiss();
    }

    @Override // p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: q */
    public final View m62592q(int i, View view, ViewGroup.LayoutParams layoutParams) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) View.inflate(getContext(), o6c0.f142333z5, null);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) coordinatorLayout.findViewById(b5c0.f73484H);
        this.f40555b = frameLayout;
        TopSheetBehavior<FrameLayout> topSheetBehaviorM62572n = TopSheetBehavior.m62572n(frameLayout);
        this.f40554a = topSheetBehaviorM62572n;
        topSheetBehaviorM62572n.m62573o(this.f40556c);
        FrameLayout frameLayout2 = this.f40555b;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(b5c0.f73537Y1).setOnClickListener(new a());
        return coordinatorLayout;
    }

    @Override // p149l.hu0, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m62592q(0, view, null));
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }

    @Override // p149l.hu0, android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        super.setContentView(m62592q(i, null, null));
    }

    @Override // p149l.hu0, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m62592q(0, view, layoutParams));
    }
}

package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C2489R;
import p153l.fgc0;
import p153l.hdc0;
import p153l.nu0;
import p153l.tec0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.a */
/* JADX INFO: loaded from: classes13.dex */
public class DialogC11403a extends nu0 {

    /* JADX INFO: renamed from: a */
    public TopSheetBehavior<FrameLayout> f41402a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f41403b;

    /* JADX INFO: renamed from: c */
    public TopSheetBehavior.AbstractC11401c f41404c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.a$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (DialogC11403a.this.isShowing()) {
                DialogC11403a.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.a$b */
    public class b extends TopSheetBehavior.AbstractC11401c {
        public b() {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior.AbstractC11401c
        /* JADX INFO: renamed from: a */
        public void mo63759a(@NonNull View view, float f) {
        }

        @Override // com.p051p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior.AbstractC11401c
        /* JADX INFO: renamed from: b */
        public void mo63760b(@NonNull View view, int i) {
            if (i == 5) {
                DialogC11403a.this.dismiss();
            }
        }
    }

    public DialogC11403a(@NonNull Context context) {
        super(context, getThemeResId(context, 0));
        this.f41404c = new b();
        supportRequestWindowFeature(1);
    }

    public static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C2489R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : fgc0.f98906i;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f41403b.removeAllViews();
        super.dismiss();
    }

    @Override // p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
    }

    /* JADX INFO: renamed from: q */
    public final View m63775q(int i, View view, ViewGroup.LayoutParams layoutParams) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) View.inflate(getContext(), tec0.f173802z5, null);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) coordinatorLayout.findViewById(hdc0.f108837H);
        this.f41403b = frameLayout;
        TopSheetBehavior<FrameLayout> topSheetBehaviorM63755n = TopSheetBehavior.m63755n(frameLayout);
        this.f41402a = topSheetBehaviorM63755n;
        topSheetBehaviorM63755n.m63756o(this.f41404c);
        FrameLayout frameLayout2 = this.f41403b;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(hdc0.f108890Y1).setOnClickListener(new a());
        return coordinatorLayout;
    }

    @Override // p153l.nu0, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m63775q(0, view, null));
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }

    @Override // p153l.nu0, android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        super.setContentView(m63775q(i, null, null));
    }

    @Override // p153l.nu0, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m63775q(0, view, layoutParams));
    }
}

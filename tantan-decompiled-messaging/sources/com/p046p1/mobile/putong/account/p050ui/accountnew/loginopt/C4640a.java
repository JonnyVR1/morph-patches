package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p149l.t100;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a */
/* JADX INFO: loaded from: classes9.dex */
public class C4640a {

    /* JADX INFO: renamed from: g */
    public static float f16586g;

    /* JADX INFO: renamed from: a */
    public TextView f16587a;

    /* JADX INFO: renamed from: b */
    public TextPaint f16588b = new TextPaint();

    /* JADX INFO: renamed from: c */
    public boolean f16589c;

    /* JADX INFO: renamed from: d */
    public ArrayList<c> f16590d;

    /* JADX INFO: renamed from: e */
    public TextWatcher f16591e;

    /* JADX INFO: renamed from: f */
    public View.OnLayoutChangeListener f16592f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a$a */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C4640a.this.m28655d();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a$b */
    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C4640a.m28649a(C4640a.this);
            if (NullChecker.m81303a(null)) {
                C4640a.m28649a(C4640a.this);
                throw null;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C4640a.this.m28655d();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo28596a(float f, float f2);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a$d */
    public interface d {
    }

    public C4640a(TextView textView) {
        this.f16591e = new b();
        this.f16592f = new a();
        this.f16587a = textView;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ d m28649a(C4640a c4640a) {
        c4640a.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static void m28651e(TextView textView, TextPaint textPaint) {
        float fM186892f;
        int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        if (width <= 0) {
            return;
        }
        CharSequence text = textView.getText();
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (NullChecker.m81303a(transformationMethod)) {
            text = transformationMethod.getTransformation(text, textView);
        }
        Context context = textView.getContext();
        Resources system = Resources.getSystem();
        if (NullChecker.m81305c(context, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            system = context.getResources();
        }
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        float f = f16586g;
        textPaint.set(textView.getPaint());
        textPaint.setTextSize(f16586g);
        if (m28653g(text, textPaint, f, width, displayMetrics) >= 2) {
            fM186892f = t100.m186892f(14);
            textPaint.setTextSize(fM186892f);
            if (textView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) textView.getLayoutParams()).bottomMargin = t100.m186890d(4.0f);
            }
        } else {
            fM186892f = f16586g;
            textPaint.setTextSize(fM186892f);
            if (textView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) textView.getLayoutParams()).bottomMargin = t100.m186890d(0.0f);
            }
        }
        textView.setTextSize(0, fM186892f);
    }

    /* JADX INFO: renamed from: f */
    public static C4640a m28652f(TextView textView, AttributeSet attributeSet, int i) {
        C4640a c4640a = new C4640a(textView);
        f16586g = textView.getTextSize();
        c4640a.m28657i(true);
        return c4640a;
    }

    /* JADX INFO: renamed from: g */
    public static int m28653g(CharSequence charSequence, TextPaint textPaint, float f, float f2, DisplayMetrics displayMetrics) {
        textPaint.setTextSize(TypedValue.applyDimension(0, f, displayMetrics));
        return new StaticLayout(charSequence, textPaint, (int) f2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
    }

    /* JADX INFO: renamed from: c */
    public C4640a m28654c(c cVar) {
        if (this.f16590d == null) {
            this.f16590d = new ArrayList<>();
        }
        this.f16590d.add(cVar);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m28655d() {
        float textSize = this.f16587a.getTextSize();
        m28651e(this.f16587a, this.f16588b);
        float textSize2 = this.f16587a.getTextSize();
        if (textSize2 != textSize) {
            m28656h(textSize2, textSize);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m28656h(float f, float f2) {
        ArrayList<c> arrayList = this.f16590d;
        if (arrayList == null) {
            return;
        }
        Iterator<c> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo28596a(f, f2);
        }
    }

    /* JADX INFO: renamed from: i */
    public C4640a m28657i(boolean z) {
        if (this.f16589c != z) {
            this.f16589c = z;
            TextView textView = this.f16587a;
            if (z) {
                textView.addTextChangedListener(this.f16591e);
                this.f16587a.addOnLayoutChangeListener(this.f16592f);
                m28655d();
                return this;
            }
            textView.removeTextChangedListener(this.f16591e);
            this.f16587a.removeOnLayoutChangeListener(this.f16592f);
        }
        return this;
    }
}

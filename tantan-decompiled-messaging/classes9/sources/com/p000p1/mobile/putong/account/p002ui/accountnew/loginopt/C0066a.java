package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt;

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
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import l.t100;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0066a {

    /* JADX INFO: renamed from: g */
    public static float f575g;

    /* JADX INFO: renamed from: a */
    public TextView f576a;

    /* JADX INFO: renamed from: b */
    public TextPaint f577b = new TextPaint();

    /* JADX INFO: renamed from: c */
    public boolean f578c;

    /* JADX INFO: renamed from: d */
    public ArrayList<c> f579d;

    /* JADX INFO: renamed from: e */
    public TextWatcher f580e;

    /* JADX INFO: renamed from: f */
    public View.OnLayoutChangeListener f581f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a$a */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C0066a.this.m554d();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a$b */
    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C0066a.m548a(C0066a.this);
            if (NullChecker.a((Object) null)) {
                C0066a.m548a(C0066a.this);
                throw null;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C0066a.this.m554d();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo493a(float f, float f2);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a$d */
    public interface d {
    }

    public C0066a(TextView textView) {
        this.f580e = new b();
        this.f581f = new a();
        this.f576a = textView;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ d m548a(C0066a c0066a) {
        c0066a.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static void m550e(TextView textView, TextPaint textPaint) {
        float f;
        int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        if (width <= 0) {
            return;
        }
        CharSequence text = textView.getText();
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (NullChecker.a(transformationMethod)) {
            text = transformationMethod.getTransformation(text, textView);
        }
        Context context = textView.getContext();
        Resources system = Resources.getSystem();
        if (NullChecker.c(context, "account", CrashHelper.ReportLevel.p9)) {
            system = context.getResources();
        }
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        float f2 = f575g;
        textPaint.set(textView.getPaint());
        textPaint.setTextSize(f575g);
        if (m552g(text, textPaint, f2, width, displayMetrics) >= 2) {
            f = t100.f(14);
            textPaint.setTextSize(f);
            if (textView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) textView.getLayoutParams()).bottomMargin = t100.d(4.0f);
            }
        } else {
            f = f575g;
            textPaint.setTextSize(f);
            if (textView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) textView.getLayoutParams()).bottomMargin = t100.d(0.0f);
            }
        }
        textView.setTextSize(0, f);
    }

    /* JADX INFO: renamed from: f */
    public static C0066a m551f(TextView textView, AttributeSet attributeSet, int i) {
        C0066a c0066a = new C0066a(textView);
        f575g = textView.getTextSize();
        c0066a.m556i(true);
        return c0066a;
    }

    /* JADX INFO: renamed from: g */
    public static int m552g(CharSequence charSequence, TextPaint textPaint, float f, float f2, DisplayMetrics displayMetrics) {
        textPaint.setTextSize(TypedValue.applyDimension(0, f, displayMetrics));
        return new StaticLayout(charSequence, textPaint, (int) f2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
    }

    /* JADX INFO: renamed from: c */
    public C0066a m553c(c cVar) {
        if (this.f579d == null) {
            this.f579d = new ArrayList<>();
        }
        this.f579d.add(cVar);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m554d() {
        float textSize = this.f576a.getTextSize();
        m550e(this.f576a, this.f577b);
        float textSize2 = this.f576a.getTextSize();
        if (textSize2 != textSize) {
            m555h(textSize2, textSize);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m555h(float f, float f2) {
        ArrayList<c> arrayList = this.f579d;
        if (arrayList == null) {
            return;
        }
        Iterator<c> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo493a(f, f2);
        }
    }

    /* JADX INFO: renamed from: i */
    public C0066a m556i(boolean z) {
        if (this.f578c != z) {
            this.f578c = z;
            TextView textView = this.f576a;
            if (z) {
                textView.addTextChangedListener(this.f580e);
                this.f576a.addOnLayoutChangeListener(this.f581f);
                m554d();
                return this;
            }
            textView.removeTextChangedListener(this.f580e);
            this.f576a.removeOnLayoutChangeListener(this.f581f);
        }
        return this;
    }
}

package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt;

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
import com.p051p1.mobile.putong.data.SchemeKey;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p153l.qa00;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a */
/* JADX INFO: loaded from: classes9.dex */
public class C4791a {

    /* JADX INFO: renamed from: g */
    public static float f17305g;

    /* JADX INFO: renamed from: a */
    public TextView f17306a;

    /* JADX INFO: renamed from: b */
    public TextPaint f17307b = new TextPaint();

    /* JADX INFO: renamed from: c */
    public boolean f17308c;

    /* JADX INFO: renamed from: d */
    public ArrayList<c> f17309d;

    /* JADX INFO: renamed from: e */
    public TextWatcher f17310e;

    /* JADX INFO: renamed from: f */
    public View.OnLayoutChangeListener f17311f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a$a */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C4791a.this.m29654d();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a$b */
    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C4791a.m29648a(C4791a.this);
            if (NullChecker.m82486a(null)) {
                C4791a.m29648a(C4791a.this);
                throw null;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C4791a.this.m29654d();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo29595a(float f, float f2);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.loginopt.a$d */
    public interface d {
    }

    public C4791a(TextView textView) {
        this.f17310e = new b();
        this.f17311f = new a();
        this.f17306a = textView;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ d m29648a(C4791a c4791a) {
        c4791a.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static void m29650e(TextView textView, TextPaint textPaint) {
        float fM175861f;
        int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        if (width <= 0) {
            return;
        }
        CharSequence text = textView.getText();
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (NullChecker.m82486a(transformationMethod)) {
            text = transformationMethod.getTransformation(text, textView);
        }
        Context context = textView.getContext();
        Resources system = Resources.getSystem();
        if (NullChecker.m82488c(context, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            system = context.getResources();
        }
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        float f = f17305g;
        textPaint.set(textView.getPaint());
        textPaint.setTextSize(f17305g);
        if (m29652g(text, textPaint, f, width, displayMetrics) >= 2) {
            fM175861f = qa00.m175861f(14);
            textPaint.setTextSize(fM175861f);
            if (textView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) textView.getLayoutParams()).bottomMargin = qa00.m175859d(4.0f);
            }
        } else {
            fM175861f = f17305g;
            textPaint.setTextSize(fM175861f);
            if (textView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) textView.getLayoutParams()).bottomMargin = qa00.m175859d(0.0f);
            }
        }
        textView.setTextSize(0, fM175861f);
    }

    /* JADX INFO: renamed from: f */
    public static C4791a m29651f(TextView textView, AttributeSet attributeSet, int i) {
        C4791a c4791a = new C4791a(textView);
        f17305g = textView.getTextSize();
        c4791a.m29656i(true);
        return c4791a;
    }

    /* JADX INFO: renamed from: g */
    public static int m29652g(CharSequence charSequence, TextPaint textPaint, float f, float f2, DisplayMetrics displayMetrics) {
        textPaint.setTextSize(TypedValue.applyDimension(0, f, displayMetrics));
        return new StaticLayout(charSequence, textPaint, (int) f2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
    }

    /* JADX INFO: renamed from: c */
    public C4791a m29653c(c cVar) {
        if (this.f17309d == null) {
            this.f17309d = new ArrayList<>();
        }
        this.f17309d.add(cVar);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m29654d() {
        float textSize = this.f17306a.getTextSize();
        m29650e(this.f17306a, this.f17307b);
        float textSize2 = this.f17306a.getTextSize();
        if (textSize2 != textSize) {
            m29655h(textSize2, textSize);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m29655h(float f, float f2) {
        ArrayList<c> arrayList = this.f17309d;
        if (arrayList == null) {
            return;
        }
        Iterator<c> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo29595a(f, f2);
        }
    }

    /* JADX INFO: renamed from: i */
    public C4791a m29656i(boolean z) {
        if (this.f17308c != z) {
            this.f17308c = z;
            TextView textView = this.f17306a;
            if (z) {
                textView.addTextChangedListener(this.f17310e);
                this.f17306a.addOnLayoutChangeListener(this.f17311f);
                m29654d();
                return this;
            }
            textView.removeTextChangedListener(this.f17310e);
            this.f17306a.removeOnLayoutChangeListener(this.f17311f);
        }
        return this;
    }
}

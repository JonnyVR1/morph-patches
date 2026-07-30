package tech.sud.runtime.component.p023e;

import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.FrameLayout;
import tech.sud.runtime.core.C1241g;

/* JADX INFO: renamed from: tech.sud.runtime.component.e.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
class C1213c extends EditText {

    /* JADX INFO: renamed from: a */
    public boolean f11328a;

    /* JADX INFO: renamed from: b */
    private String f11329b;

    /* JADX INFO: renamed from: c */
    private boolean f11330c;

    /* JADX INFO: renamed from: d */
    private final C1241g f11331d;

    /* JADX INFO: renamed from: e */
    private TextWatcher f11332e;

    /* JADX INFO: renamed from: tech.sud.runtime.component.e.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        float f11334a;

        /* JADX INFO: renamed from: b */
        float f11335b;

        /* JADX INFO: renamed from: c */
        float f11336c;

        /* JADX INFO: renamed from: d */
        int f11337d;

        /* JADX INFO: renamed from: e */
        boolean f11338e;

        /* JADX INFO: renamed from: f */
        String f11339f;

        /* JADX INFO: renamed from: g */
        int f11340g;

        /* JADX INFO: renamed from: h */
        float f11341h;
    }

    public C1213c(Context context, C1241g c1241g) {
        super(context);
        this.f11328a = false;
        this.f11329b = "";
        this.f11330c = false;
        this.f11332e = new TextWatcher() { // from class: tech.sud.runtime.component.e.c.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String string = C1213c.this.getText().toString();
                if (C1213c.this.f11330c || string.equals(C1213c.this.f11329b)) {
                    return;
                }
                C1213c.this.f11329b = string;
                C1213c.this.f11331d.m10459a(6, string);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.f11331d = c1241g;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setImeOptions(268435456);
        setLineSpacing(0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public void m10254a(String str, a aVar) {
        int i;
        setTextSize(0, aVar.f11336c);
        if (aVar.f11340g > 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(aVar.f11340g)});
        } else {
            setFilters(new InputFilter[0]);
        }
        setIncludeFontPadding(false);
        setPadding(0, 0, 0, 0);
        setBackground(null);
        if (!this.f11328a) {
            this.f11328a = true;
            addTextChangedListener(this.f11332e);
        }
        setWidth((int) aVar.f11334a);
        m10253a(str);
        this.f11330c = true;
        if (aVar.f11338e) {
            setImeOptions(1);
            setInputType(131073);
            setMaxHeight((int) aVar.f11335b);
        } else {
            setImeOptions(6);
            if (aVar.f11339f.equals("password")) {
                i = 129;
            } else {
                i = aVar.f11339f.equals("tel") ? 12290 : 1;
            }
            setInputType(i);
            setMaxLines(1);
        }
        setHeight((int) aVar.f11335b);
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        float f2 = aVar.f11341h;
        setLineSpacing(f2 < f ? 0.0f : f2 - f, 1.0f);
        setGravity(aVar.f11337d);
        this.f11330c = false;
    }

    /* JADX INFO: renamed from: a */
    public void m10253a(String str) {
        String string = getText().toString();
        this.f11329b = string;
        if (string.equals(str)) {
            return;
        }
        this.f11329b = str;
        this.f11330c = true;
        setText(str);
        this.f11330c = false;
    }
}

package tech.sud.runtime.component.p023e;

import android.R;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import tech.sud.gip.core.view.round.RoundedDrawable;
import tech.sud.runtime.component.p026h.C1225c;
import tech.sud.runtime.component.p026h.C1226d;
import tech.sud.runtime.component.p026h.C1227e;

/* JADX INFO: renamed from: tech.sud.runtime.component.e.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1211a extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private LinearLayout f11298a;

    /* JADX INFO: renamed from: b */
    private EditText f11299b;

    /* JADX INFO: renamed from: c */
    private Button f11300c;

    /* JADX INFO: renamed from: d */
    private View f11301d;

    /* JADX INFO: renamed from: e */
    private final Window f11302e;

    /* JADX INFO: renamed from: f */
    private final View f11303f;

    /* JADX INFO: renamed from: g */
    private boolean f11304g;

    /* JADX INFO: renamed from: h */
    private final a f11305h;

    /* JADX INFO: renamed from: i */
    private boolean f11306i;

    /* JADX INFO: renamed from: j */
    private String f11307j;

    /* JADX INFO: renamed from: k */
    private Integer f11308k;

    /* JADX INFO: renamed from: l */
    private TextWatcher f11309l;

    /* JADX INFO: renamed from: m */
    private View.OnClickListener f11310m;

    /* JADX INFO: renamed from: n */
    private TextView.OnEditorActionListener f11311n;

    /* JADX INFO: renamed from: o */
    private View.OnFocusChangeListener f11312o;

    /* JADX INFO: renamed from: p */
    private C1227e.a f11313p;

    /* JADX INFO: renamed from: tech.sud.runtime.component.e.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo10231a(int i);

        /* JADX INFO: renamed from: a */
        void mo10232a(String str);

        /* JADX INFO: renamed from: b */
        void mo10233b(String str);

        /* JADX INFO: renamed from: c */
        void mo10234c(String str);
    }

    public C1211a(Context context, a aVar, Integer num) {
        super(context);
        this.f11306i = false;
        this.f11307j = "";
        this.f11309l = new TextWatcher() { // from class: tech.sud.runtime.component.e.a.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String string = editable.toString();
                if (string.equals(C1211a.this.f11307j)) {
                    return;
                }
                C1211a.this.f11307j = string;
                C1211a.this.f11305h.mo10232a(string);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.f11310m = new View.OnClickListener() { // from class: tech.sud.runtime.component.e.a.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1211a.this.f11305h.mo10233b(C1211a.this.getInputString());
                if (C1211a.this.f11304g) {
                    return;
                }
                C1227e.m10323b(C1211a.this.getContext(), C1211a.this.f11299b);
            }
        };
        this.f11311n = new TextView.OnEditorActionListener() { // from class: tech.sud.runtime.component.e.a.5
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                C1211a.this.f11305h.mo10233b(C1211a.this.getInputString());
                boolean unused = C1211a.this.f11304g;
                return false;
            }
        };
        this.f11312o = new View.OnFocusChangeListener() { // from class: tech.sud.runtime.component.e.a.6
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                C1227e.m10323b(C1211a.this.getContext(), C1211a.this.f11299b);
            }
        };
        this.f11313p = new C1227e.a() { // from class: tech.sud.runtime.component.e.a.7
            @Override // tech.sud.runtime.component.p026h.C1227e.a
            /* JADX INFO: renamed from: a */
            public void mo10230a(int i) {
                if (i > 0) {
                    Integer num2 = C1211a.this.f11308k;
                    if (num2 != null) {
                        i += num2.intValue();
                    }
                    C1211a.this.m10217a(i);
                } else if (i == 0) {
                    C1211a.this.m10229c();
                }
                C1211a.this.setPadding(0, 0, 0, i);
            }
        };
        setOrientation(1);
        this.f11308k = num;
        this.f11305h = aVar;
        Window window = C1225c.m10314a(context).getWindow();
        this.f11302e = window;
        this.f11303f = window.getDecorView();
        C1227e.m10320a(getContext(), window, this.f11313p);
        m10222d();
    }

    /* JADX INFO: renamed from: d */
    private void m10222d() {
        this.f11301d = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        this.f11301d.setLayoutParams(layoutParams);
        this.f11301d.setOnClickListener(new View.OnClickListener() { // from class: tech.sud.runtime.component.e.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C1211a.this.m10229c();
                C1227e.m10323b(C1211a.this.getContext(), C1211a.this.f11299b);
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f11298a = linearLayout;
        linearLayout.setOrientation(0);
        this.f11298a.setGravity(17);
        this.f11298a.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f11299b = new EditText(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.weight = 1.0f;
        this.f11299b.setLayoutParams(layoutParams2);
        this.f11299b.setImeActionLabel("完成", 6);
        this.f11299b.setImeActionLabel("下一个", 5);
        this.f11299b.setImeActionLabel("搜索", 3);
        this.f11299b.setImeActionLabel("前往", 2);
        this.f11299b.setImeActionLabel("发送", 4);
        this.f11299b.addTextChangedListener(this.f11309l);
        this.f11299b.setOnFocusChangeListener(this.f11312o);
        int iM10315a = C1226d.m10315a(getContext(), 16.0f);
        int iM10315a2 = C1226d.m10315a(getContext(), 13.0f);
        this.f11299b.setPadding(iM10315a, iM10315a2, iM10315a, iM10315a2);
        this.f11299b.setBackgroundColor(-1);
        this.f11299b.setTextSize(16.0f);
        this.f11299b.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        Button button = new Button(getContext());
        this.f11300c = button;
        button.setText(R.string.ok);
        this.f11300c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f11300c.setOnClickListener(this.f11310m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getInputString() {
        Editable text = this.f11299b.getText();
        return text == null ? "" : text.toString();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[PHI: r5
      0x0043: PHI (r5v7 int) = (r5v6 int), (r5v8 int) binds: [B:12:0x003b, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public void m10227a(String str, int i, boolean z, boolean z2, int i2) {
        this.f11299b.setText(str);
        EditText editText = this.f11299b;
        if (i > 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        } else {
            editText.setFilters(new InputFilter[0]);
        }
        if (z) {
            this.f11299b.setMaxLines(8);
            this.f11299b.setInputType(131073);
            this.f11299b.setImeOptions(1);
        } else {
            int i3 = 6;
            if (i2 != 0) {
                if (i2 != 1) {
                    int i4 = 3;
                    if (i2 == 2) {
                        i3 = i4;
                    } else if (i2 != 3) {
                        i4 = 4;
                        if (i2 == 4) {
                            i3 = i4;
                        }
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 5;
                }
            }
            this.f11299b.setSingleLine(true);
            this.f11299b.setInputType(1);
            this.f11299b.setImeOptions(i3 | 33554432);
        }
        if (this.f11299b.getParent() == null) {
            addView(this.f11301d);
            addView(this.f11298a);
            this.f11298a.addView(this.f11299b);
            if (z) {
                this.f11298a.addView(this.f11300c);
                this.f11299b.setOnEditorActionListener(null);
            } else {
                this.f11299b.setOnEditorActionListener(this.f11311n);
            }
        }
        this.f11304g = z2;
        post(new Runnable() { // from class: tech.sud.runtime.component.e.a.1
            @Override // java.lang.Runnable
            public void run() {
                C1211a.this.f11299b.requestFocus();
                C1211a.this.f11299b.setSelection(C1211a.this.f11299b.getText().length());
                C1211a.this.m10217a(0);
                C1227e.m10318a(C1211a.this.getContext(), C1211a.this.f11299b);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m10228b() {
        EditText editText = this.f11299b;
        if (editText == null || editText.getParent() == null) {
            return;
        }
        this.f11298a.removeAllViews();
        removeAllViews();
        this.f11305h.mo10234c(getInputString());
    }

    /* JADX INFO: renamed from: c */
    public void m10229c() {
        if (this.f11306i) {
            this.f11306i = false;
            C1227e.m10323b(getContext(), this.f11299b);
            m10228b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10225a() {
        C1227e.m10321a(this.f11302e);
    }

    /* JADX INFO: renamed from: a */
    public void m10226a(String str) {
        this.f11299b.setText(str);
        this.f11299b.setSelection(str.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m10217a(int i) {
        if (this.f11306i || this.f11299b.getParent() == null) {
            return;
        }
        this.f11306i = true;
        this.f11305h.mo10231a(i);
    }
}

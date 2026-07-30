package tech.sud.runtime.component.p142e;

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
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import tech.sud.gip.core.view.round.RoundedDrawable;
import tech.sud.runtime.component.p145h.C22432c;
import tech.sud.runtime.component.p145h.C22433d;
import tech.sud.runtime.component.p145h.C22434e;

/* JADX INFO: renamed from: tech.sud.runtime.component.e.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22418a extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private LinearLayout f207673a;

    /* JADX INFO: renamed from: b */
    private EditText f207674b;

    /* JADX INFO: renamed from: c */
    private Button f207675c;

    /* JADX INFO: renamed from: d */
    private View f207676d;

    /* JADX INFO: renamed from: e */
    private final Window f207677e;

    /* JADX INFO: renamed from: f */
    private final View f207678f;

    /* JADX INFO: renamed from: g */
    private boolean f207679g;

    /* JADX INFO: renamed from: h */
    private final a f207680h;

    /* JADX INFO: renamed from: i */
    private boolean f207681i;

    /* JADX INFO: renamed from: j */
    private String f207682j;

    /* JADX INFO: renamed from: k */
    private Integer f207683k;

    /* JADX INFO: renamed from: l */
    private TextWatcher f207684l;

    /* JADX INFO: renamed from: m */
    private View.OnClickListener f207685m;

    /* JADX INFO: renamed from: n */
    private TextView.OnEditorActionListener f207686n;

    /* JADX INFO: renamed from: o */
    private View.OnFocusChangeListener f207687o;

    /* JADX INFO: renamed from: p */
    private C22434e.a f207688p;

    /* JADX INFO: renamed from: tech.sud.runtime.component.e.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo221760a(int i);

        /* JADX INFO: renamed from: a */
        void mo221761a(String str);

        /* JADX INFO: renamed from: b */
        void mo221762b(String str);

        /* JADX INFO: renamed from: c */
        void mo221763c(String str);
    }

    public C22418a(Context context, a aVar, Integer num) {
        super(context);
        this.f207681i = false;
        this.f207682j = "";
        this.f207684l = new TextWatcher() { // from class: tech.sud.runtime.component.e.a.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String string = editable.toString();
                if (string.equals(C22418a.this.f207682j)) {
                    return;
                }
                C22418a.this.f207682j = string;
                C22418a.this.f207680h.mo221761a(string);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.f207685m = new View.OnClickListener() { // from class: tech.sud.runtime.component.e.a.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C22418a.this.f207680h.mo221762b(C22418a.this.getInputString());
                if (C22418a.this.f207679g) {
                    return;
                }
                C22434e.m221852b(C22418a.this.getContext(), C22418a.this.f207674b);
            }
        };
        this.f207686n = new TextView.OnEditorActionListener() { // from class: tech.sud.runtime.component.e.a.5
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                C22418a.this.f207680h.mo221762b(C22418a.this.getInputString());
                boolean unused = C22418a.this.f207679g;
                return false;
            }
        };
        this.f207687o = new View.OnFocusChangeListener() { // from class: tech.sud.runtime.component.e.a.6
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                C22434e.m221852b(C22418a.this.getContext(), C22418a.this.f207674b);
            }
        };
        this.f207688p = new C22434e.a() { // from class: tech.sud.runtime.component.e.a.7
            @Override // tech.sud.runtime.component.p145h.C22434e.a
            /* JADX INFO: renamed from: a */
            public void mo221759a(int i) {
                if (i > 0) {
                    Integer num2 = C22418a.this.f207683k;
                    if (num2 != null) {
                        i += num2.intValue();
                    }
                    C22418a.this.m221746a(i);
                } else if (i == 0) {
                    C22418a.this.m221758c();
                }
                C22418a.this.setPadding(0, 0, 0, i);
            }
        };
        setOrientation(1);
        this.f207683k = num;
        this.f207680h = aVar;
        Window window = C22432c.m221843a(context).getWindow();
        this.f207677e = window;
        this.f207678f = window.getDecorView();
        C22434e.m221849a(getContext(), window, this.f207688p);
        m221751d();
    }

    /* JADX INFO: renamed from: d */
    private void m221751d() {
        this.f207676d = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        this.f207676d.setLayoutParams(layoutParams);
        this.f207676d.setOnClickListener(new View.OnClickListener() { // from class: tech.sud.runtime.component.e.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C22418a.this.m221758c();
                C22434e.m221852b(C22418a.this.getContext(), C22418a.this.f207674b);
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f207673a = linearLayout;
        linearLayout.setOrientation(0);
        this.f207673a.setGravity(17);
        this.f207673a.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f207674b = new EditText(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.weight = 1.0f;
        this.f207674b.setLayoutParams(layoutParams2);
        this.f207674b.setImeActionLabel("完成", 6);
        this.f207674b.setImeActionLabel("下一个", 5);
        this.f207674b.setImeActionLabel("搜索", 3);
        this.f207674b.setImeActionLabel("前往", 2);
        this.f207674b.setImeActionLabel("发送", 4);
        this.f207674b.addTextChangedListener(this.f207684l);
        this.f207674b.setOnFocusChangeListener(this.f207687o);
        int iM221844a = C22433d.m221844a(getContext(), 16.0f);
        int iM221844a2 = C22433d.m221844a(getContext(), 13.0f);
        this.f207674b.setPadding(iM221844a, iM221844a2, iM221844a, iM221844a2);
        this.f207674b.setBackgroundColor(-1);
        this.f207674b.setTextSize(16.0f);
        this.f207674b.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        Button button = new Button(getContext());
        this.f207675c = button;
        button.setText(R.string.ok);
        this.f207675c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f207675c.setOnClickListener(this.f207685m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getInputString() {
        Editable text = this.f207674b.getText();
        return text == null ? "" : text.toString();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[PHI: r5
      0x0043: PHI (r5v7 int) = (r5v6 int), (r5v8 int) binds: [B:12:0x003b, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public void m221756a(String str, int i, boolean z, boolean z2, int i2) {
        this.f207674b.setText(str);
        EditText editText = this.f207674b;
        if (i > 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        } else {
            editText.setFilters(new InputFilter[0]);
        }
        if (z) {
            this.f207674b.setMaxLines(8);
            this.f207674b.setInputType(IjkMediaPlayer.OnNativeInvokeListener.CTRL_WILL_TCP_OPEN);
            this.f207674b.setImeOptions(1);
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
            this.f207674b.setSingleLine(true);
            this.f207674b.setInputType(1);
            this.f207674b.setImeOptions(i3 | 33554432);
        }
        if (this.f207674b.getParent() == null) {
            addView(this.f207676d);
            addView(this.f207673a);
            this.f207673a.addView(this.f207674b);
            if (z) {
                this.f207673a.addView(this.f207675c);
                this.f207674b.setOnEditorActionListener(null);
            } else {
                this.f207674b.setOnEditorActionListener(this.f207686n);
            }
        }
        this.f207679g = z2;
        post(new Runnable() { // from class: tech.sud.runtime.component.e.a.1
            @Override // java.lang.Runnable
            public void run() {
                C22418a.this.f207674b.requestFocus();
                C22418a.this.f207674b.setSelection(C22418a.this.f207674b.getText().length());
                C22418a.this.m221746a(0);
                C22434e.m221847a(C22418a.this.getContext(), C22418a.this.f207674b);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m221757b() {
        EditText editText = this.f207674b;
        if (editText == null || editText.getParent() == null) {
            return;
        }
        this.f207673a.removeAllViews();
        removeAllViews();
        this.f207680h.mo221763c(getInputString());
    }

    /* JADX INFO: renamed from: c */
    public void m221758c() {
        if (this.f207681i) {
            this.f207681i = false;
            C22434e.m221852b(getContext(), this.f207674b);
            m221757b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221754a() {
        C22434e.m221850a(this.f207677e);
    }

    /* JADX INFO: renamed from: a */
    public void m221755a(String str) {
        this.f207674b.setText(str);
        this.f207674b.setSelection(str.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m221746a(int i) {
        if (this.f207681i || this.f207674b.getParent() == null) {
            return;
        }
        this.f207681i = true;
        this.f207680h.mo221760a(i);
    }
}

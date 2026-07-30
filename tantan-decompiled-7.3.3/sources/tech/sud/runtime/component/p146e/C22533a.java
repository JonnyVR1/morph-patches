package tech.sud.runtime.component.p146e;

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
import tech.sud.runtime.component.p149h.C22547c;
import tech.sud.runtime.component.p149h.C22548d;
import tech.sud.runtime.component.p149h.C22549e;

/* JADX INFO: renamed from: tech.sud.runtime.component.e.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22533a extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private LinearLayout f208595a;

    /* JADX INFO: renamed from: b */
    private EditText f208596b;

    /* JADX INFO: renamed from: c */
    private Button f208597c;

    /* JADX INFO: renamed from: d */
    private View f208598d;

    /* JADX INFO: renamed from: e */
    private final Window f208599e;

    /* JADX INFO: renamed from: f */
    private final View f208600f;

    /* JADX INFO: renamed from: g */
    private boolean f208601g;

    /* JADX INFO: renamed from: h */
    private final a f208602h;

    /* JADX INFO: renamed from: i */
    private boolean f208603i;

    /* JADX INFO: renamed from: j */
    private String f208604j;

    /* JADX INFO: renamed from: k */
    private Integer f208605k;

    /* JADX INFO: renamed from: l */
    private TextWatcher f208606l;

    /* JADX INFO: renamed from: m */
    private View.OnClickListener f208607m;

    /* JADX INFO: renamed from: n */
    private TextView.OnEditorActionListener f208608n;

    /* JADX INFO: renamed from: o */
    private View.OnFocusChangeListener f208609o;

    /* JADX INFO: renamed from: p */
    private C22549e.a f208610p;

    /* JADX INFO: renamed from: tech.sud.runtime.component.e.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo223006a(int i);

        /* JADX INFO: renamed from: a */
        void mo223007a(String str);

        /* JADX INFO: renamed from: b */
        void mo223008b(String str);

        /* JADX INFO: renamed from: c */
        void mo223009c(String str);
    }

    public C22533a(Context context, a aVar, Integer num) {
        super(context);
        this.f208603i = false;
        this.f208604j = "";
        this.f208606l = new TextWatcher() { // from class: tech.sud.runtime.component.e.a.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String string = editable.toString();
                if (string.equals(C22533a.this.f208604j)) {
                    return;
                }
                C22533a.this.f208604j = string;
                C22533a.this.f208602h.mo223007a(string);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.f208607m = new View.OnClickListener() { // from class: tech.sud.runtime.component.e.a.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C22533a.this.f208602h.mo223008b(C22533a.this.getInputString());
                if (C22533a.this.f208601g) {
                    return;
                }
                C22549e.m223098b(C22533a.this.getContext(), C22533a.this.f208596b);
            }
        };
        this.f208608n = new TextView.OnEditorActionListener() { // from class: tech.sud.runtime.component.e.a.5
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                C22533a.this.f208602h.mo223008b(C22533a.this.getInputString());
                boolean unused = C22533a.this.f208601g;
                return false;
            }
        };
        this.f208609o = new View.OnFocusChangeListener() { // from class: tech.sud.runtime.component.e.a.6
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (z) {
                    return;
                }
                C22549e.m223098b(C22533a.this.getContext(), C22533a.this.f208596b);
            }
        };
        this.f208610p = new C22549e.a() { // from class: tech.sud.runtime.component.e.a.7
            @Override // tech.sud.runtime.component.p149h.C22549e.a
            /* JADX INFO: renamed from: a */
            public void mo223005a(int i) {
                if (i > 0) {
                    Integer num2 = C22533a.this.f208605k;
                    if (num2 != null) {
                        i += num2.intValue();
                    }
                    C22533a.this.m222992a(i);
                } else if (i == 0) {
                    C22533a.this.m223004c();
                }
                C22533a.this.setPadding(0, 0, 0, i);
            }
        };
        setOrientation(1);
        this.f208605k = num;
        this.f208602h = aVar;
        Window window = C22547c.m223089a(context).getWindow();
        this.f208599e = window;
        this.f208600f = window.getDecorView();
        C22549e.m223095a(getContext(), window, this.f208610p);
        m222997d();
    }

    /* JADX INFO: renamed from: d */
    private void m222997d() {
        this.f208598d = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        this.f208598d.setLayoutParams(layoutParams);
        this.f208598d.setOnClickListener(new View.OnClickListener() { // from class: tech.sud.runtime.component.e.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C22533a.this.m223004c();
                C22549e.m223098b(C22533a.this.getContext(), C22533a.this.f208596b);
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f208595a = linearLayout;
        linearLayout.setOrientation(0);
        this.f208595a.setGravity(17);
        this.f208595a.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f208596b = new EditText(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.weight = 1.0f;
        this.f208596b.setLayoutParams(layoutParams2);
        this.f208596b.setImeActionLabel("完成", 6);
        this.f208596b.setImeActionLabel("下一个", 5);
        this.f208596b.setImeActionLabel("搜索", 3);
        this.f208596b.setImeActionLabel("前往", 2);
        this.f208596b.setImeActionLabel("发送", 4);
        this.f208596b.addTextChangedListener(this.f208606l);
        this.f208596b.setOnFocusChangeListener(this.f208609o);
        int iM223090a = C22548d.m223090a(getContext(), 16.0f);
        int iM223090a2 = C22548d.m223090a(getContext(), 13.0f);
        this.f208596b.setPadding(iM223090a, iM223090a2, iM223090a, iM223090a2);
        this.f208596b.setBackgroundColor(-1);
        this.f208596b.setTextSize(16.0f);
        this.f208596b.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        Button button = new Button(getContext());
        this.f208597c = button;
        button.setText(R.string.ok);
        this.f208597c.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f208597c.setOnClickListener(this.f208607m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getInputString() {
        Editable text = this.f208596b.getText();
        return text == null ? "" : text.toString();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[PHI: r5
      0x0043: PHI (r5v7 int) = (r5v6 int), (r5v8 int) binds: [B:12:0x003b, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public void m223002a(String str, int i, boolean z, boolean z2, int i2) {
        this.f208596b.setText(str);
        EditText editText = this.f208596b;
        if (i > 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        } else {
            editText.setFilters(new InputFilter[0]);
        }
        if (z) {
            this.f208596b.setMaxLines(8);
            this.f208596b.setInputType(IjkMediaPlayer.OnNativeInvokeListener.CTRL_WILL_TCP_OPEN);
            this.f208596b.setImeOptions(1);
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
            this.f208596b.setSingleLine(true);
            this.f208596b.setInputType(1);
            this.f208596b.setImeOptions(i3 | 33554432);
        }
        if (this.f208596b.getParent() == null) {
            addView(this.f208598d);
            addView(this.f208595a);
            this.f208595a.addView(this.f208596b);
            if (z) {
                this.f208595a.addView(this.f208597c);
                this.f208596b.setOnEditorActionListener(null);
            } else {
                this.f208596b.setOnEditorActionListener(this.f208608n);
            }
        }
        this.f208601g = z2;
        post(new Runnable() { // from class: tech.sud.runtime.component.e.a.1
            @Override // java.lang.Runnable
            public void run() {
                C22533a.this.f208596b.requestFocus();
                C22533a.this.f208596b.setSelection(C22533a.this.f208596b.getText().length());
                C22533a.this.m222992a(0);
                C22549e.m223093a(C22533a.this.getContext(), C22533a.this.f208596b);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m223003b() {
        EditText editText = this.f208596b;
        if (editText == null || editText.getParent() == null) {
            return;
        }
        this.f208595a.removeAllViews();
        removeAllViews();
        this.f208602h.mo223009c(getInputString());
    }

    /* JADX INFO: renamed from: c */
    public void m223004c() {
        if (this.f208603i) {
            this.f208603i = false;
            C22549e.m223098b(getContext(), this.f208596b);
            m223003b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m223000a() {
        C22549e.m223096a(this.f208599e);
    }

    /* JADX INFO: renamed from: a */
    public void m223001a(String str) {
        this.f208596b.setText(str);
        this.f208596b.setSelection(str.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m222992a(int i) {
        if (this.f208603i || this.f208596b.getParent() == null) {
            return;
        }
        this.f208603i = true;
        this.f208602h.mo223006a(i);
    }
}

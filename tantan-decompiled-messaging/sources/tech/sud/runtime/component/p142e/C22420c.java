package tech.sud.runtime.component.p142e;

import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.heytap.mcssdk.mode.CommandMessage;
import com.momo.momortc.MMConstants;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import tech.sud.runtime.core.C22448g;

/* JADX INFO: renamed from: tech.sud.runtime.component.e.c */
/* JADX INFO: loaded from: classes3.dex */
class C22420c extends EditText {

    /* JADX INFO: renamed from: a */
    public boolean f207703a;

    /* JADX INFO: renamed from: b */
    private String f207704b;

    /* JADX INFO: renamed from: c */
    private boolean f207705c;

    /* JADX INFO: renamed from: d */
    private final C22448g f207706d;

    /* JADX INFO: renamed from: e */
    private TextWatcher f207707e;

    /* JADX INFO: renamed from: tech.sud.runtime.component.e.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        float f207709a;

        /* JADX INFO: renamed from: b */
        float f207710b;

        /* JADX INFO: renamed from: c */
        float f207711c;

        /* JADX INFO: renamed from: d */
        int f207712d;

        /* JADX INFO: renamed from: e */
        boolean f207713e;

        /* JADX INFO: renamed from: f */
        String f207714f;

        /* JADX INFO: renamed from: g */
        int f207715g;

        /* JADX INFO: renamed from: h */
        float f207716h;
    }

    public C22420c(Context context, C22448g c22448g) {
        super(context);
        this.f207703a = false;
        this.f207704b = "";
        this.f207705c = false;
        this.f207707e = new TextWatcher() { // from class: tech.sud.runtime.component.e.c.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String string = C22420c.this.getText().toString();
                if (C22420c.this.f207705c || string.equals(C22420c.this.f207704b)) {
                    return;
                }
                C22420c.this.f207704b = string;
                C22420c.this.f207706d.m221988a(6, string);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.f207706d = c22448g;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setImeOptions(268435456);
        setLineSpacing(0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public void m221783a(String str, a aVar) {
        int i;
        setTextSize(0, aVar.f207711c);
        if (aVar.f207715g > 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(aVar.f207715g)});
        } else {
            setFilters(new InputFilter[0]);
        }
        setIncludeFontPadding(false);
        setPadding(0, 0, 0, 0);
        setBackground(null);
        if (!this.f207703a) {
            this.f207703a = true;
            addTextChangedListener(this.f207707e);
        }
        setWidth((int) aVar.f207709a);
        m221782a(str);
        this.f207705c = true;
        if (aVar.f207713e) {
            setImeOptions(1);
            setInputType(IjkMediaPlayer.OnNativeInvokeListener.CTRL_WILL_TCP_OPEN);
            setMaxHeight((int) aVar.f207710b);
        } else {
            setImeOptions(6);
            if (aVar.f207714f.equals(SignInGrantType.password)) {
                i = MMConstants.ERR_WATERMARK_READ;
            } else {
                i = aVar.f207714f.equals("tel") ? CommandMessage.COMMAND_UNREGISTER : 1;
            }
            setInputType(i);
            setMaxLines(1);
        }
        setHeight((int) aVar.f207710b);
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        float f2 = aVar.f207716h;
        setLineSpacing(f2 < f ? 0.0f : f2 - f, 1.0f);
        setGravity(aVar.f207712d);
        this.f207705c = false;
    }

    /* JADX INFO: renamed from: a */
    public void m221782a(String str) {
        String string = getText().toString();
        this.f207704b = string;
        if (string.equals(str)) {
            return;
        }
        this.f207704b = str;
        this.f207705c = true;
        setText(str);
        this.f207705c = false;
    }
}

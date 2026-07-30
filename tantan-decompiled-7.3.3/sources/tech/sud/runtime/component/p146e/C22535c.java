package tech.sud.runtime.component.p146e;

import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.heytap.mcssdk.mode.CommandMessage;
import com.momo.momortc.MMConstants;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import io.requery.android.database.sqlite.SQLiteDatabase;
import tech.sud.runtime.core.C22563g;

/* JADX INFO: renamed from: tech.sud.runtime.component.e.c */
/* JADX INFO: loaded from: classes3.dex */
class C22535c extends EditText {

    /* JADX INFO: renamed from: a */
    public boolean f208625a;

    /* JADX INFO: renamed from: b */
    private String f208626b;

    /* JADX INFO: renamed from: c */
    private boolean f208627c;

    /* JADX INFO: renamed from: d */
    private final C22563g f208628d;

    /* JADX INFO: renamed from: e */
    private TextWatcher f208629e;

    /* JADX INFO: renamed from: tech.sud.runtime.component.e.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        float f208631a;

        /* JADX INFO: renamed from: b */
        float f208632b;

        /* JADX INFO: renamed from: c */
        float f208633c;

        /* JADX INFO: renamed from: d */
        int f208634d;

        /* JADX INFO: renamed from: e */
        boolean f208635e;

        /* JADX INFO: renamed from: f */
        String f208636f;

        /* JADX INFO: renamed from: g */
        int f208637g;

        /* JADX INFO: renamed from: h */
        float f208638h;
    }

    public C22535c(Context context, C22563g c22563g) {
        super(context);
        this.f208625a = false;
        this.f208626b = "";
        this.f208627c = false;
        this.f208629e = new TextWatcher() { // from class: tech.sud.runtime.component.e.c.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String string = C22535c.this.getText().toString();
                if (C22535c.this.f208627c || string.equals(C22535c.this.f208626b)) {
                    return;
                }
                C22535c.this.f208626b = string;
                C22535c.this.f208628d.m223234a(6, string);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.f208628d = c22563g;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setImeOptions(SQLiteDatabase.CREATE_IF_NECESSARY);
        setLineSpacing(0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public void m223029a(String str, a aVar) {
        int i;
        setTextSize(0, aVar.f208633c);
        if (aVar.f208637g > 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(aVar.f208637g)});
        } else {
            setFilters(new InputFilter[0]);
        }
        setIncludeFontPadding(false);
        setPadding(0, 0, 0, 0);
        setBackground(null);
        if (!this.f208625a) {
            this.f208625a = true;
            addTextChangedListener(this.f208629e);
        }
        setWidth((int) aVar.f208631a);
        m223028a(str);
        this.f208627c = true;
        if (aVar.f208635e) {
            setImeOptions(1);
            setInputType(IjkMediaPlayer.OnNativeInvokeListener.CTRL_WILL_TCP_OPEN);
            setMaxHeight((int) aVar.f208632b);
        } else {
            setImeOptions(6);
            if (aVar.f208636f.equals(SignInGrantType.password)) {
                i = MMConstants.ERR_WATERMARK_READ;
            } else {
                i = aVar.f208636f.equals("tel") ? CommandMessage.COMMAND_UNREGISTER : 1;
            }
            setInputType(i);
            setMaxLines(1);
        }
        setHeight((int) aVar.f208632b);
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        float f = fontMetrics.bottom - fontMetrics.top;
        float f2 = aVar.f208638h;
        setLineSpacing(f2 < f ? 0.0f : f2 - f, 1.0f);
        setGravity(aVar.f208634d);
        this.f208627c = false;
    }

    /* JADX INFO: renamed from: a */
    public void m223028a(String str) {
        String string = getText().toString();
        this.f208626b = string;
        if (string.equals(str)) {
            return;
        }
        this.f208626b = str;
        this.f208627c = true;
        setText(str);
        this.f208627c = false;
    }
}

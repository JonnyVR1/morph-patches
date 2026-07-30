package com.momo.xeengine;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.Keep;
import io.agora.rtc2.internal.AudioRoutingController;
import p149l.a6c0;
import p149l.o4c0;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class XInputActivity extends Activity implements TextWatcher, View.OnClickListener {
    private static final String KEY_ENGINE = "key_engine";
    private static final String KEY_HINT = "key_hint";
    private static final String KEY_INPUT_MODE = "key_input_mode";
    private static final String KEY_MAX_LENGTH = "key_max_length";
    private static final String KEY_POINTER = "key_id";
    private static final String KEY_RETURN_TYPE = "key_return_type";
    private static final String KEY_SELECT_TEXT = "key_select_text";
    private static final String KEY_TEXT = "key_text";
    private long editBoxID;
    private EditText editText;
    private long engineInsPointer;
    private Button submitBtn;
    private boolean hasReturned = false;
    private boolean beforeTextChangedCalled = false;

    public static class XInputMode {
        private static final int XUI_ANY = 0;
        private static final int XUI_DECIMAL = 5;
        private static final int XUI_EMAIL_ADDRESS = 1;
        private static final int XUI_NUMERIC = 2;
        private static final int XUI_PHONE_NUMBER = 3;
        private static final int XUI_SINGLE_LINE = 6;
        private static final int XUI_URL = 4;

        private XInputMode() {
        }
    }

    public static class XKeyboardReturnType {
        private static final int XUI_DEFAULT = 0;
        private static final int XUI_DONE = 1;
        private static final int XUI_GO = 4;
        private static final int XUI_NEXT = 5;
        private static final int XUI_SEARCH = 3;
        private static final int XUI_SEND = 2;

        private XKeyboardReturnType() {
        }
    }

    private native void nativeBeforeTextChanged(long j, long j2);

    private native void nativeFinishInput(long j, long j2, String str);

    private native void nativeOnActivityClose(long j, long j2, String str);

    private native void nativeOnTextChanged(long j, long j2, String str);

    private void setInputMode(int i) {
        if (i == 1) {
            this.editText.setInputType(32);
            return;
        }
        if (i == 2) {
            this.editText.setInputType(2);
        } else if (i == 3) {
            this.editText.setInputType(3);
        } else {
            if (i != 4) {
                return;
            }
            this.editText.setInputType(16);
        }
    }

    private void setUpSelf(Intent intent) {
        this.engineInsPointer = intent.getLongExtra(KEY_ENGINE, 0L);
        this.editBoxID = intent.getLongExtra(KEY_POINTER, 0L);
        String stringExtra = intent.getStringExtra(KEY_TEXT);
        String stringExtra2 = intent.getStringExtra(KEY_HINT);
        int intExtra = intent.getIntExtra(KEY_MAX_LENGTH, 0);
        int intExtra2 = intent.getIntExtra(KEY_INPUT_MODE, 0);
        int intExtra3 = intent.getIntExtra(KEY_RETURN_TYPE, 0);
        boolean booleanExtra = intent.getBooleanExtra(KEY_SELECT_TEXT, false);
        int length = stringExtra2.length();
        EditText editText = this.editText;
        if (length > 0) {
            editText.setHint(stringExtra2);
        } else {
            editText.setHint("");
        }
        int length2 = stringExtra.length();
        EditText editText2 = this.editText;
        if (length2 > 0) {
            editText2.setText(stringExtra);
        } else {
            editText2.setText("");
        }
        if (booleanExtra) {
            Selection.selectAll(this.editText.getText());
        }
        if (intExtra > 0) {
            this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(intExtra)});
        }
        setInputMode(intExtra2);
        setReturnType(intExtra3);
    }

    public static boolean start(long j, long j2, String str, String str2, boolean z, int i, int i2, int i3) {
        Context context = XEnginePreferences.getContext();
        if (context == null) {
            return false;
        }
        Intent intent = new Intent(context, (Class<?>) XInputActivity.class);
        intent.putExtra(KEY_ENGINE, j);
        intent.putExtra(KEY_POINTER, j2);
        intent.putExtra(KEY_TEXT, str);
        intent.putExtra(KEY_HINT, str2);
        intent.putExtra(KEY_MAX_LENGTH, i);
        intent.putExtra(KEY_SELECT_TEXT, z);
        intent.putExtra(KEY_INPUT_MODE, i2);
        intent.putExtra(KEY_RETURN_TYPE, i3);
        intent.setFlags(805306368);
        context.startActivity(intent);
        return true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.beforeTextChangedCalled) {
            return;
        }
        nativeBeforeTextChanged(this.engineInsPointer, this.editBoxID);
        this.beforeTextChangedCalled = true;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.hasReturned) {
            return;
        }
        if (view.getId() == o4c0.f141762a) {
            this.hasReturned = true;
            nativeOnActivityClose(this.engineInsPointer, this.editBoxID, this.editText.getText().toString());
            finish();
        } else if (view.getId() == o4c0.f141763b) {
            this.hasReturned = true;
            nativeFinishInput(this.engineInsPointer, this.editBoxID, this.editText.getText().toString());
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a6c0.f67756a);
        getWindow().addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        View viewFindViewById = findViewById(o4c0.f141762a);
        this.editText = (EditText) findViewById(o4c0.f141764c);
        this.submitBtn = (Button) findViewById(o4c0.f141763b);
        this.editText.addTextChangedListener(this);
        viewFindViewById.setOnClickListener(this);
        this.submitBtn.setOnClickListener(this);
        setUpSelf(getIntent());
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setUpSelf(intent);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.editText.setFocusable(true);
        this.editText.setFocusableInTouchMode(true);
        this.editText.requestFocus();
        getWindow().setSoftInputMode(5);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        nativeOnTextChanged(this.engineInsPointer, this.editBoxID, charSequence.toString());
    }

    public void setReturnType(int i) {
        if (i == 1) {
            this.submitBtn.setText("完成");
            this.editText.setImeOptions(268435462);
            return;
        }
        if (i == 2) {
            this.submitBtn.setText("发送");
            this.editText.setImeOptions(268435460);
            return;
        }
        if (i == 3) {
            this.submitBtn.setText("搜索");
            this.editText.setImeOptions(268435459);
        } else if (i == 4) {
            this.submitBtn.setText("前往");
            this.editText.setImeOptions(268435458);
        } else if (i != 5) {
            this.editText.setImeOptions(268435457);
        } else {
            this.submitBtn.setText("下一项");
            this.editText.setImeOptions(268435461);
        }
    }
}

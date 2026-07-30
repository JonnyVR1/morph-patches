package com.p051p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import p151v.VEditText;
import p153l.fc2;
import p153l.qa00;
import p153l.sqq;
import p153l.ynp0;

/* JADX INFO: loaded from: classes4.dex */
public class JsDialogInput extends VEditText implements sqq {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogInput$a */
    public class C12926a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveJsDialogItemType f50105a;

        public C12926a(BLiveJsDialogItemType bLiveJsDialogItemType) {
            this.f50105a = bLiveJsDialogItemType;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strTrim = editable.toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                return;
            }
            BLiveJsDialogItemType bLiveJsDialogItemType = this.f50105a;
            bLiveJsDialogItemType.actionListener.call(bLiveJsDialogItemType.callback, strTrim);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public JsDialogInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p153l.sqq
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: g */
    public void mo74286g(BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams) {
        m187556c(this, str, bLiveJsDialogItemType);
        clearFocus();
        setCursorVisible(false);
        setBackground(fc2.m124979i(ynp0.m216917B(bLiveJsDialogItemType.bgColor), 6));
        int iM175859d = qa00.m175859d(9.0f);
        int iM175859d2 = qa00.m175859d(10.0f);
        setPadding(iM175859d2, iM175859d, iM175859d2, iM175859d);
        int iM175859d3 = qa00.m175859d(24.0f);
        layoutParams.leftMargin = iM175859d3;
        layoutParams.rightMargin = iM175859d3;
        addTextChangedListener(new C12926a(bLiveJsDialogItemType));
        setOnTouchListener(new View.OnTouchListener() { // from class: l.rqq
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f164509a.m74298k(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m74298k(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        setCursorVisible(true);
        setSelection(getText().toString().trim().length());
        return false;
    }

    public JsDialogInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JsDialogInput(Context context) {
        super(context);
    }
}

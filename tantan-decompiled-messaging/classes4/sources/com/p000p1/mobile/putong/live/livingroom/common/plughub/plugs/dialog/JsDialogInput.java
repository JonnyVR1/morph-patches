package com.p000p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import l.t100;
import l.uep0;
import l.yb2;
import p002l.soq;
import v.VEditText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class JsDialogInput extends VEditText implements soq {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogInput$a */
    public class C0352a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveJsDialogItemType f5299a;

        public C0352a(BLiveJsDialogItemType bLiveJsDialogItemType) {
            this.f5299a = bLiveJsDialogItemType;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strTrim = editable.toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                return;
            }
            BLiveJsDialogItemType bLiveJsDialogItemType = this.f5299a;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.soq
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: g */
    public void mo6629g(BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams) {
        m22585c(this, str, bLiveJsDialogItemType);
        clearFocus();
        setCursorVisible(false);
        setBackground(yb2.i(uep0.B(bLiveJsDialogItemType.bgColor), 6));
        int iD = t100.d(9.0f);
        int iD2 = t100.d(10.0f);
        setPadding(iD2, iD, iD2, iD);
        int iD3 = t100.d(24.0f);
        layoutParams.leftMargin = iD3;
        layoutParams.rightMargin = iD3;
        addTextChangedListener(new C0352a(bLiveJsDialogItemType));
        setOnTouchListener(new View.OnTouchListener() { // from class: l.roq
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f18628a.m6641k(view, motionEvent);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m6641k(View view, MotionEvent motionEvent) {
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

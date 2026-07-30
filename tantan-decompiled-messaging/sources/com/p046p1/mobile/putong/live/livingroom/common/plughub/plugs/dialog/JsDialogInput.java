package com.p046p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import p147v.VEditText;
import p149l.soq;
import p149l.t100;
import p149l.uep0;
import p149l.yb2;

/* JADX INFO: loaded from: classes4.dex */
public class JsDialogInput extends VEditText implements soq {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogInput$a */
    public class C12763a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveJsDialogItemType f49257a;

        public C12763a(BLiveJsDialogItemType bLiveJsDialogItemType) {
            this.f49257a = bLiveJsDialogItemType;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strTrim = editable.toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                return;
            }
            BLiveJsDialogItemType bLiveJsDialogItemType = this.f49257a;
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

    @Override // p149l.soq
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: g */
    public void mo73103g(BLiveJsDialogItemType bLiveJsDialogItemType, String str, LinearLayout.LayoutParams layoutParams) {
        m185292c(this, str, bLiveJsDialogItemType);
        clearFocus();
        setCursorVisible(false);
        setBackground(yb2.m213884i(uep0.m193307B(bLiveJsDialogItemType.bgColor), 6));
        int iM186890d = t100.m186890d(9.0f);
        int iM186890d2 = t100.m186890d(10.0f);
        setPadding(iM186890d2, iM186890d, iM186890d2, iM186890d);
        int iM186890d3 = t100.m186890d(24.0f);
        layoutParams.leftMargin = iM186890d3;
        layoutParams.rightMargin = iM186890d3;
        addTextChangedListener(new C12763a(bLiveJsDialogItemType));
        setOnTouchListener(new View.OnTouchListener() { // from class: l.roq
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f160409a.m73115k(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m73115k(View view, MotionEvent motionEvent) {
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

package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopCustomSignatureTypeFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import p147v.VEditText;
import p147v.VText;
import p149l.f6c0;
import p149l.lsi0;
import p149l.u4c0;
import p149l.ura;
import p149l.xdl0;
import p149l.yha0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomSignatureTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public VEditText f33334F;

    /* JADX INFO: renamed from: G */
    public VText f33335G;

    /* JADX INFO: renamed from: H */
    public TextView f33336H;

    /* JADX INFO: renamed from: I */
    public View f33337I;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomSignatureTypeFrag$a */
    public class C8652a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ExpProfileLoopTextTypeData f33338a;

        public C8652a(ExpProfileLoopTextTypeData expProfileLoopTextTypeData) {
            this.f33338a = expProfileLoopTextTypeData;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = editable.length();
            ExpProfileLoopTextTypeData expProfileLoopTextTypeData = this.f33338a;
            int i = expProfileLoopTextTypeData.maxCount;
            if (length > i) {
                CharSequence charSequenceSubSequence = editable.subSequence(0, i);
                this.f33338a.text1 = charSequenceSubSequence.toString().trim();
            } else {
                expProfileLoopTextTypeData.text1 = editable.toString().trim();
            }
            ExpProfileLoopCustomSignatureTypeFrag.this.m51249R4(true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ boolean m51353V4(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if ((motionEvent.getAction() & 255) == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo51246O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95477N2, viewGroup, false);
        this.f33334F = (VEditText) viewInflate.findViewById(u4c0.f174392o3);
        this.f33335G = (VText) viewInflate.findViewById(u4c0.f174241f4);
        this.f33337I = viewInflate.findViewById(u4c0.f173907L3);
        this.f33336H = (TextView) viewInflate.findViewById(u4c0.f173924M3);
        return viewInflate;
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m51355X4(View view, boolean z) {
        if (z) {
            xdl0.m208344M(this.f33335G, false);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        ExpProfileLoopTextTypeData textType = this.f33279A.getData().getTextType();
        if (!TextUtils.isEmpty(textType.text2)) {
            this.f33334F.setHint(textType.text2);
        }
        if (!TextUtils.isEmpty(textType.text1)) {
            this.f33334F.setText(textType.text1);
        }
        if (TextUtils.isEmpty(textType.text3)) {
            xdl0.m208344M(this.f33337I, false);
        } else {
            this.f33336H.setText(textType.text3);
        }
        VEditText vEditText = this.f33334F;
        vEditText.setSelection(vEditText.length());
        this.f33334F.addTextChangedListener(new C8652a(textType));
        this.f33334F.setOnTouchListener(new View.OnTouchListener() { // from class: l.ihf
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ExpProfileLoopCustomSignatureTypeFrag.m51353V4(view, motionEvent);
            }
        });
        this.f33334F.setFilters(new InputFilter[]{new InputFilter.LengthFilter(textType.maxCount)});
        if (this.f33279A.inputTypeName == 14 && this.f33284z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            String strM137708n3 = CoreModule.f17545c.f19677q2.m137708n3();
            if (!TextUtils.isEmpty(strM137708n3) && !ura.m195053e().m195057d().mo33799am()) {
                xdl0.m208344M(this.f33335G, true);
                this.f33335G.setText(strM137708n3 + " ，请修改");
            }
            this.f33334F.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.jhf
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    this.f117938a.m51355X4(view, z);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag, p149l.gif
    /* JADX INFO: renamed from: x3 */
    public boolean mo51254x3() {
        ExpProfileLoopTextTypeData textType = this.f33279A.getData().getTextType();
        if (yha0.m214797b(textType.text1)) {
            lsi0.m151595y(CoreModule.f17544b.getString(R$string.f18260X3));
            return false;
        }
        String str = textType.text1;
        if (str != null && str.trim().length() >= textType.needCount) {
            return true;
        }
        lsi0.m151595y("请至少用15个字介绍一下你自己");
        return false;
    }
}

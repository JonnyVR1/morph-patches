package com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopCustomSignatureTypeFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import p151v.VEditText;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.cqa0;
import p153l.gta;
import p153l.kec0;
import p153l.o1j0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomSignatureTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public VEditText f34182F;

    /* JADX INFO: renamed from: G */
    public VText f34183G;

    /* JADX INFO: renamed from: H */
    public TextView f34184H;

    /* JADX INFO: renamed from: I */
    public View f34185I;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomSignatureTypeFrag$a */
    public class C8815a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ExpProfileLoopTextTypeData f34186a;

        public C8815a(ExpProfileLoopTextTypeData expProfileLoopTextTypeData) {
            this.f34186a = expProfileLoopTextTypeData;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = editable.length();
            ExpProfileLoopTextTypeData expProfileLoopTextTypeData = this.f34186a;
            int i = expProfileLoopTextTypeData.maxCount;
            if (length > i) {
                CharSequence charSequenceSubSequence = editable.subSequence(0, i);
                this.f34186a.text1 = charSequenceSubSequence.toString().trim();
            } else {
                expProfileLoopTextTypeData.text1 = editable.toString().trim();
            }
            ExpProfileLoopCustomSignatureTypeFrag.this.m52432R4(true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ boolean m52536V4(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if ((motionEvent.getAction() & 255) == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo52429O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125531N2, viewGroup, false);
        this.f34182F = (VEditText) viewInflate.findViewById(adc0.f70517q3);
        this.f34183G = (VText) viewInflate.findViewById(adc0.f70366h4);
        this.f34185I = viewInflate.findViewById(adc0.f70029N3);
        this.f34184H = (TextView) viewInflate.findViewById(adc0.f70046O3);
        return viewInflate;
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m52538X4(View view, boolean z) {
        if (z) {
            bnl0.m105524M(this.f34183G, false);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        ExpProfileLoopTextTypeData textType = this.f34127A.getData().getTextType();
        if (!TextUtils.isEmpty(textType.text2)) {
            this.f34182F.setHint(textType.text2);
        }
        if (!TextUtils.isEmpty(textType.text1)) {
            this.f34182F.setText(textType.text1);
        }
        if (TextUtils.isEmpty(textType.text3)) {
            bnl0.m105524M(this.f34185I, false);
        } else {
            this.f34184H.setText(textType.text3);
        }
        VEditText vEditText = this.f34182F;
        vEditText.setSelection(vEditText.length());
        this.f34182F.addTextChangedListener(new C8815a(textType));
        this.f34182F.setOnTouchListener(new View.OnTouchListener() { // from class: l.oif
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ExpProfileLoopCustomSignatureTypeFrag.m52536V4(view, motionEvent);
            }
        });
        this.f34182F.setFilters(new InputFilter[]{new InputFilter.LengthFilter(textType.maxCount)});
        if (this.f34127A.inputTypeName == 14 && this.f34132z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            String strM197489n3 = CoreModule.f18264c.f20419q2.m197489n3();
            if (!TextUtils.isEmpty(strM197489n3) && !gta.m132210e().m132214d().mo34802am()) {
                bnl0.m105524M(this.f34183G, true);
                this.f34183G.setText(strM197489n3 + " ，请修改");
            }
            this.f34182F.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.pif
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    this.f152531a.m52538X4(view, z);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag, p153l.mjf
    /* JADX INFO: renamed from: x3 */
    public boolean mo52437x3() {
        ExpProfileLoopTextTypeData textType = this.f34127A.getData().getTextType();
        if (cqa0.m111887b(textType.text1)) {
            o1j0.m165651y(CoreModule.f18263b.getString(R$string.f19050Z3));
            return false;
        }
        String str = textType.text1;
        if (str != null && str.trim().length() >= textType.needCount) {
            return true;
        }
        o1j0.m165651y("请至少用15个字介绍一下你自己");
        return false;
    }
}

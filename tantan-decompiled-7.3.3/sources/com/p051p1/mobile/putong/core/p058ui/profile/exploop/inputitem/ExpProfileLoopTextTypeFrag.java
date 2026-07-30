package com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopTextTypeFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.bsj0;
import p153l.dbc0;
import p153l.kec0;
import p153l.qa00;
import p153l.r1j0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopTextTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public VLinear f34205F;

    /* JADX INFO: renamed from: G */
    public VEditText f34206G;

    /* JADX INFO: renamed from: H */
    public View f34207H;

    /* JADX INFO: renamed from: I */
    public VLinear f34208I;

    /* JADX INFO: renamed from: J */
    public VText f34209J;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopTextTypeFrag$a */
    public class C8817a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ExpProfileLoopTextTypeData f34210a;

        public C8817a(ExpProfileLoopTextTypeData expProfileLoopTextTypeData) {
            this.f34210a = expProfileLoopTextTypeData;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().trim().length() == 0) {
                String strReplaceAll = editable.toString().replaceAll("\\s+", "");
                if (!editable.toString().equals(strReplaceAll)) {
                    ExpProfileLoopTextTypeFrag.this.f34206G.setText(strReplaceAll);
                    ExpProfileLoopTextTypeFrag.this.f34206G.setSelection(strReplaceAll.length());
                }
            }
            int length = editable.length();
            ExpProfileLoopTextTypeData expProfileLoopTextTypeData = this.f34210a;
            int i = expProfileLoopTextTypeData.maxCount;
            if (length > i) {
                this.f34210a.text1 = editable.subSequence(0, i).toString().trim();
            } else {
                expProfileLoopTextTypeData.text1 = editable.toString().trim();
            }
            bnl0.m105524M(ExpProfileLoopTextTypeFrag.this.f34208I, false);
            if (ExpProfileLoopTextTypeFrag.this.f34127A.inputContentType == 5) {
                if (!TextUtils.isEmpty(this.f34210a.text1) || TextUtils.isEmpty(this.f34210a.errorTips)) {
                    ExpProfileLoopTextTypeFrag.this.f34205F.setBackgroundResource(dbc0.f87197ls);
                    bnl0.m105524M(ExpProfileLoopTextTypeFrag.this.f34208I, false);
                } else {
                    ExpProfileLoopTextTypeFrag.this.f34205F.setBackgroundResource(dbc0.f87230ms);
                    bnl0.m105524M(ExpProfileLoopTextTypeFrag.this.f34208I, true);
                    ExpProfileLoopTextTypeFrag.this.f34209J.setText(this.f34210a.errorTips);
                }
                bnl0.m105524M(ExpProfileLoopTextTypeFrag.this.f34207H, !TextUtils.isEmpty(editable.toString().trim()));
            }
            ExpProfileLoopTextTypeFrag.this.m52432R4(true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ CharSequence m52550V4(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence == null || !charSequence.toString().contains(SignParameters.NEW_LINE)) {
            return null;
        }
        return charSequence.toString().replace(SignParameters.NEW_LINE, "");
    }

    /* JADX INFO: renamed from: r */
    private void m52557r() {
        final ExpProfileLoopTextTypeData textType = this.f34127A.getData().getTextType();
        int i = this.f34127A.inputContentType;
        VEditText vEditText = this.f34206G;
        if (i == 5) {
            int i2 = qa00.f156292E;
            bnl0.m105505C0(vEditText, i2);
            this.f34206G.setPadding(qa00.f156328o, 0, i2, 0);
            this.f34206G.setGravity(16);
            this.f34206G.setMaxLines(1);
            this.f34206G.setSingleLine(true);
            bnl0.m105509E0(this.f34207H, new View.OnClickListener() { // from class: l.qjf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f157964a.m52559d5(textType, view);
                }
            });
        } else {
            bnl0.m105505C0(vEditText, qa00.m175859d(200.0f));
            VEditText vEditText2 = this.f34206G;
            int i3 = qa00.f156328o;
            vEditText2.setPadding(i3, i3, i3, i3);
            this.f34206G.setGravity(8388611);
            this.f34206G.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f34206G.setSingleLine(false);
            bnl0.m105524M(this.f34207H, false);
        }
        if (!TextUtils.isEmpty(textType.text2)) {
            this.f34206G.setHint(textType.text2);
        }
        if (!TextUtils.isEmpty(textType.text1)) {
            this.f34206G.setText(textType.text1);
        }
        if (this.f34127A.inputContentType == 5) {
            bnl0.m105524M(this.f34207H, !TextUtils.isEmpty(textType.text1));
        }
        VEditText vEditText3 = this.f34206G;
        vEditText3.setSelection(vEditText3.length());
        this.f34206G.setFilters(new InputFilter[]{new InputFilter() { // from class: l.rjf
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
                return ExpProfileLoopTextTypeFrag.m52550V4(charSequence, i4, i5, spanned, i6, i7);
            }
        }, new InputFilter.LengthFilter(textType.maxCount)});
        this.f34206G.addTextChangedListener(new C8817a(textType));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo52429O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125547O2, viewGroup, false);
        this.f34205F = (VLinear) viewInflate.findViewById(adc0.f70466n3);
        this.f34206G = (VEditText) viewInflate.findViewById(adc0.f70517q3);
        this.f34207H = viewInflate.findViewById(adc0.f70617w1);
        this.f34208I = (VLinear) viewInflate.findViewById(adc0.f69910G3);
        this.f34209J = (VText) viewInflate.findViewById(adc0.f69927H3);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m52558c5() {
        ExpLoopInputType expLoopInputType = this.f34127A;
        if (expLoopInputType.inputContentType != 5 || expLoopInputType.inputTypeName != 17) {
            return true;
        }
        String strM106254L = bsj0.m106254L(this.f34206G.getText().toString());
        if (TextUtils.isEmpty(strM106254L)) {
            return true;
        }
        r1j0.m179420g(strM106254L);
        return false;
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m52559d5(ExpProfileLoopTextTypeData expProfileLoopTextTypeData, View view) {
        this.f34206G.setText("");
        expProfileLoopTextTypeData.text1 = "";
        bnl0.m105524M(this.f34207H, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        m52557r();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag, p153l.mjf
    /* JADX INFO: renamed from: x3 */
    public boolean mo52437x3() {
        ExpProfileLoopTextTypeData textType = this.f34127A.getData().getTextType();
        String str = textType.text1;
        if (str != null && str.trim().length() >= textType.needCount) {
            return m52558c5();
        }
        m52558c5();
        return false;
    }
}

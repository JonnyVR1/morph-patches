package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

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
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopTextTypeFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;
import p149l.f6c0;
import p149l.osi0;
import p149l.t100;
import p149l.u4c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.yij0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopTextTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public VLinear f33357F;

    /* JADX INFO: renamed from: G */
    public VEditText f33358G;

    /* JADX INFO: renamed from: H */
    public View f33359H;

    /* JADX INFO: renamed from: I */
    public VLinear f33360I;

    /* JADX INFO: renamed from: J */
    public VText f33361J;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopTextTypeFrag$a */
    public class C8654a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ExpProfileLoopTextTypeData f33362a;

        public C8654a(ExpProfileLoopTextTypeData expProfileLoopTextTypeData) {
            this.f33362a = expProfileLoopTextTypeData;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().trim().length() == 0) {
                String strReplaceAll = editable.toString().replaceAll("\\s+", "");
                if (!editable.toString().equals(strReplaceAll)) {
                    ExpProfileLoopTextTypeFrag.this.f33358G.setText(strReplaceAll);
                    ExpProfileLoopTextTypeFrag.this.f33358G.setSelection(strReplaceAll.length());
                }
            }
            int length = editable.length();
            ExpProfileLoopTextTypeData expProfileLoopTextTypeData = this.f33362a;
            int i = expProfileLoopTextTypeData.maxCount;
            if (length > i) {
                this.f33362a.text1 = editable.subSequence(0, i).toString().trim();
            } else {
                expProfileLoopTextTypeData.text1 = editable.toString().trim();
            }
            xdl0.m208344M(ExpProfileLoopTextTypeFrag.this.f33360I, false);
            if (ExpProfileLoopTextTypeFrag.this.f33279A.inputContentType == 5) {
                if (!TextUtils.isEmpty(this.f33362a.text1) || TextUtils.isEmpty(this.f33362a.errorTips)) {
                    ExpProfileLoopTextTypeFrag.this.f33357F.setBackgroundResource(x2c0.f190726xr);
                    xdl0.m208344M(ExpProfileLoopTextTypeFrag.this.f33360I, false);
                } else {
                    ExpProfileLoopTextTypeFrag.this.f33357F.setBackgroundResource(x2c0.f190758yr);
                    xdl0.m208344M(ExpProfileLoopTextTypeFrag.this.f33360I, true);
                    ExpProfileLoopTextTypeFrag.this.f33361J.setText(this.f33362a.errorTips);
                }
                xdl0.m208344M(ExpProfileLoopTextTypeFrag.this.f33359H, !TextUtils.isEmpty(editable.toString().trim()));
            }
            ExpProfileLoopTextTypeFrag.this.m51249R4(true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ CharSequence m51367V4(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence == null || !charSequence.toString().contains(SignParameters.NEW_LINE)) {
            return null;
        }
        return charSequence.toString().replace(SignParameters.NEW_LINE, "");
    }

    /* JADX INFO: renamed from: r */
    private void m51374r() {
        final ExpProfileLoopTextTypeData textType = this.f33279A.getData().getTextType();
        int i = this.f33279A.inputContentType;
        VEditText vEditText = this.f33358G;
        if (i == 5) {
            int i2 = t100.f167230E;
            xdl0.m208325C0(vEditText, i2);
            this.f33358G.setPadding(t100.f167266o, 0, i2, 0);
            this.f33358G.setGravity(16);
            this.f33358G.setMaxLines(1);
            this.f33358G.setSingleLine(true);
            xdl0.m208329E0(this.f33359H, new View.OnClickListener() { // from class: l.kif
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123322a.m51376d5(textType, view);
                }
            });
        } else {
            xdl0.m208325C0(vEditText, t100.m186890d(200.0f));
            VEditText vEditText2 = this.f33358G;
            int i3 = t100.f167266o;
            vEditText2.setPadding(i3, i3, i3, i3);
            this.f33358G.setGravity(8388611);
            this.f33358G.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f33358G.setSingleLine(false);
            xdl0.m208344M(this.f33359H, false);
        }
        if (!TextUtils.isEmpty(textType.text2)) {
            this.f33358G.setHint(textType.text2);
        }
        if (!TextUtils.isEmpty(textType.text1)) {
            this.f33358G.setText(textType.text1);
        }
        if (this.f33279A.inputContentType == 5) {
            xdl0.m208344M(this.f33359H, !TextUtils.isEmpty(textType.text1));
        }
        VEditText vEditText3 = this.f33358G;
        vEditText3.setSelection(vEditText3.length());
        this.f33358G.setFilters(new InputFilter[]{new InputFilter() { // from class: l.lif
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
                return ExpProfileLoopTextTypeFrag.m51367V4(charSequence, i4, i5, spanned, i6, i7);
            }
        }, new InputFilter.LengthFilter(textType.maxCount)});
        this.f33358G.addTextChangedListener(new C8654a(textType));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo51246O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95493O2, viewGroup, false);
        this.f33357F = (VLinear) viewInflate.findViewById(u4c0.f174341l3);
        this.f33358G = (VEditText) viewInflate.findViewById(u4c0.f174392o3);
        this.f33359H = viewInflate.findViewById(u4c0.f174526w1);
        this.f33360I = (VLinear) viewInflate.findViewById(u4c0.f173788E3);
        this.f33361J = (VText) viewInflate.findViewById(u4c0.f173805F3);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m51375c5() {
        ExpLoopInputType expLoopInputType = this.f33279A;
        if (expLoopInputType.inputContentType != 5 || expLoopInputType.inputTypeName != 17) {
            return true;
        }
        String strM214934L = yij0.m214934L(this.f33358G.getText().toString());
        if (TextUtils.isEmpty(strM214934L)) {
            return true;
        }
        osi0.m165783g(strM214934L);
        return false;
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m51376d5(ExpProfileLoopTextTypeData expProfileLoopTextTypeData, View view) {
        this.f33358G.setText("");
        expProfileLoopTextTypeData.text1 = "";
        xdl0.m208344M(this.f33359H, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        m51374r();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag, p149l.gif
    /* JADX INFO: renamed from: x3 */
    public boolean mo51254x3() {
        ExpProfileLoopTextTypeData textType = this.f33279A.getData().getTextType();
        String str = textType.text1;
        if (str != null && str.trim().length() >= textType.needCount) {
            return m51375c5();
        }
        m51375c5();
        return false;
    }
}

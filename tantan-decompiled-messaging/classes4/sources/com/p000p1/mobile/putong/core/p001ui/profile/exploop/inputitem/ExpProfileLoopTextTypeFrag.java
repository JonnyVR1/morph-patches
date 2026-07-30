package com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem;

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
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopTextTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import l.f6c0;
import l.osi0;
import l.t100;
import l.u4c0;
import l.x2c0;
import l.xdl0;
import l.yij0;
import v.VEditText;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileLoopTextTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public VLinear f1179F;

    /* JADX INFO: renamed from: G */
    public VEditText f1180G;

    /* JADX INFO: renamed from: H */
    public View f1181H;

    /* JADX INFO: renamed from: I */
    public VLinear f1182I;

    /* JADX INFO: renamed from: J */
    public VText f1183J;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopTextTypeFrag$a */
    public class C0079a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ExpProfileLoopTextTypeData f1184a;

        public C0079a(ExpProfileLoopTextTypeData expProfileLoopTextTypeData) {
            this.f1184a = expProfileLoopTextTypeData;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().trim().length() == 0) {
                String strReplaceAll = editable.toString().replaceAll("\\s+", "");
                if (!editable.toString().equals(strReplaceAll)) {
                    ExpProfileLoopTextTypeFrag.this.f1180G.setText(strReplaceAll);
                    ExpProfileLoopTextTypeFrag.this.f1180G.setSelection(strReplaceAll.length());
                }
            }
            int length = editable.length();
            ExpProfileLoopTextTypeData expProfileLoopTextTypeData = this.f1184a;
            int i = expProfileLoopTextTypeData.maxCount;
            if (length > i) {
                this.f1184a.text1 = editable.subSequence(0, i).toString().trim();
            } else {
                expProfileLoopTextTypeData.text1 = editable.toString().trim();
            }
            xdl0.M(ExpProfileLoopTextTypeFrag.this.f1182I, false);
            if (ExpProfileLoopTextTypeFrag.this.f1101A.inputContentType == 5) {
                if (!TextUtils.isEmpty(this.f1184a.text1) || TextUtils.isEmpty(this.f1184a.errorTips)) {
                    ExpProfileLoopTextTypeFrag.this.f1179F.setBackgroundResource(x2c0.xr);
                    xdl0.M(ExpProfileLoopTextTypeFrag.this.f1182I, false);
                } else {
                    ExpProfileLoopTextTypeFrag.this.f1179F.setBackgroundResource(x2c0.yr);
                    xdl0.M(ExpProfileLoopTextTypeFrag.this.f1182I, true);
                    ExpProfileLoopTextTypeFrag.this.f1183J.setText(this.f1184a.errorTips);
                }
                xdl0.M(ExpProfileLoopTextTypeFrag.this.f1181H, !TextUtils.isEmpty(editable.toString().trim()));
            }
            ExpProfileLoopTextTypeFrag.this.m1704R4(true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ CharSequence m1847V4(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence == null || !charSequence.toString().contains("\n")) {
            return null;
        }
        return charSequence.toString().replace("\n", "");
    }

    /* JADX INFO: renamed from: r */
    private void m1854r() {
        final ExpProfileLoopTextTypeData textType = this.f1101A.getData().getTextType();
        int i = this.f1101A.inputContentType;
        VEditText vEditText = this.f1180G;
        if (i == 5) {
            int i2 = t100.E;
            xdl0.C0(vEditText, i2);
            this.f1180G.setPadding(t100.o, 0, i2, 0);
            this.f1180G.setGravity(16);
            this.f1180G.setMaxLines(1);
            this.f1180G.setSingleLine(true);
            xdl0.E0(this.f1181H, new View.OnClickListener() { // from class: l.kif
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14339a.m1856d5(textType, view);
                }
            });
        } else {
            xdl0.C0(vEditText, t100.d(200.0f));
            VEditText vEditText2 = this.f1180G;
            int i3 = t100.o;
            vEditText2.setPadding(i3, i3, i3, i3);
            this.f1180G.setGravity(8388611);
            this.f1180G.setMaxLines(Integer.MAX_VALUE);
            this.f1180G.setSingleLine(false);
            xdl0.M(this.f1181H, false);
        }
        if (!TextUtils.isEmpty(textType.text2)) {
            this.f1180G.setHint(textType.text2);
        }
        if (!TextUtils.isEmpty(textType.text1)) {
            this.f1180G.setText(textType.text1);
        }
        if (this.f1101A.inputContentType == 5) {
            xdl0.M(this.f1181H, !TextUtils.isEmpty(textType.text1));
        }
        VEditText vEditText3 = this.f1180G;
        vEditText3.setSelection(vEditText3.length());
        this.f1180G.setFilters(new InputFilter[]{new InputFilter() { // from class: l.lif
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
                return ExpProfileLoopTextTypeFrag.m1847V4(charSequence, i4, i5, spanned, i6, i7);
            }
        }, new InputFilter.LengthFilter(textType.maxCount)});
        this.f1180G.addTextChangedListener(new C0079a(textType));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo1701O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.O2, viewGroup, false);
        this.f1179F = viewInflate.findViewById(u4c0.l3);
        this.f1180G = viewInflate.findViewById(u4c0.o3);
        this.f1181H = viewInflate.findViewById(u4c0.w1);
        this.f1182I = viewInflate.findViewById(u4c0.E3);
        this.f1183J = viewInflate.findViewById(u4c0.F3);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m1855c5() {
        ExpLoopInputType expLoopInputType = this.f1101A;
        if (expLoopInputType.inputContentType != 5 || expLoopInputType.inputTypeName != 17) {
            return true;
        }
        String strL = yij0.L(this.f1180G.getText().toString());
        if (TextUtils.isEmpty(strL)) {
            return true;
        }
        osi0.g(strL);
        return false;
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m1856d5(ExpProfileLoopTextTypeData expProfileLoopTextTypeData, View view) {
        this.f1180G.setText("");
        expProfileLoopTextTypeData.text1 = "";
        xdl0.M(this.f1181H, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        m1854r();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag, p002l.gif
    /* JADX INFO: renamed from: x3 */
    public boolean mo1710x3() {
        ExpProfileLoopTextTypeData textType = this.f1101A.getData().getTextType();
        String str = textType.text1;
        if (str != null && str.trim().length() >= textType.needCount) {
            return m1855c5();
        }
        m1855c5();
        return false;
    }
}

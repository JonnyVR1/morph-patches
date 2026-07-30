package com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem;

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
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopCustomSignatureTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import l.f6c0;
import l.lsi0;
import l.u4c0;
import l.ura;
import l.xdl0;
import p002l.yha0;
import v.VEditText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileLoopCustomSignatureTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public VEditText f1156F;

    /* JADX INFO: renamed from: G */
    public VText f1157G;

    /* JADX INFO: renamed from: H */
    public TextView f1158H;

    /* JADX INFO: renamed from: I */
    public View f1159I;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomSignatureTypeFrag$a */
    public class C0077a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ExpProfileLoopTextTypeData f1160a;

        public C0077a(ExpProfileLoopTextTypeData expProfileLoopTextTypeData) {
            this.f1160a = expProfileLoopTextTypeData;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = editable.length();
            ExpProfileLoopTextTypeData expProfileLoopTextTypeData = this.f1160a;
            int i = expProfileLoopTextTypeData.maxCount;
            if (length > i) {
                CharSequence charSequenceSubSequence = editable.subSequence(0, i);
                this.f1160a.text1 = charSequenceSubSequence.toString().trim();
            } else {
                expProfileLoopTextTypeData.text1 = editable.toString().trim();
            }
            ExpProfileLoopCustomSignatureTypeFrag.this.m1704R4(true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ boolean m1826V4(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if ((motionEvent.getAction() & 255) == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo1701O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.N2, viewGroup, false);
        this.f1156F = viewInflate.findViewById(u4c0.o3);
        this.f1157G = viewInflate.findViewById(u4c0.f4);
        this.f1159I = viewInflate.findViewById(u4c0.L3);
        this.f1158H = (TextView) viewInflate.findViewById(u4c0.M3);
        return viewInflate;
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m1828X4(View view, boolean z) {
        if (z) {
            xdl0.M(this.f1157G, false);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: g4 */
    public void m1829g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        ExpProfileLoopTextTypeData textType = this.f1101A.getData().getTextType();
        if (!TextUtils.isEmpty(textType.text2)) {
            this.f1156F.setHint(textType.text2);
        }
        if (!TextUtils.isEmpty(textType.text1)) {
            this.f1156F.setText(textType.text1);
        }
        if (TextUtils.isEmpty(textType.text3)) {
            xdl0.M(this.f1159I, false);
        } else {
            this.f1158H.setText(textType.text3);
        }
        VEditText vEditText = this.f1156F;
        vEditText.setSelection(vEditText.length());
        this.f1156F.addTextChangedListener(new C0077a(textType));
        this.f1156F.setOnTouchListener(new View.OnTouchListener() { // from class: l.ihf
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return ExpProfileLoopCustomSignatureTypeFrag.m1826V4(view, motionEvent);
            }
        });
        this.f1156F.setFilters(new InputFilter[]{new InputFilter.LengthFilter(textType.maxCount)});
        if (this.f1101A.inputTypeName == 14 && this.f1106z == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            String strN3 = CoreModule.c.q2.n3();
            if (!TextUtils.isEmpty(strN3) && !ura.e().d().am()) {
                xdl0.M(this.f1157G, true);
                this.f1157G.setText(strN3 + " ，请修改");
            }
            this.f1156F.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.jhf
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    this.f13774a.m1828X4(view, z);
                }
            });
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag, p002l.gif
    /* JADX INFO: renamed from: x3 */
    public boolean mo1710x3() {
        ExpProfileLoopTextTypeData textType = this.f1101A.getData().getTextType();
        if (yha0.m26718b(textType.text1)) {
            lsi0.y(CoreModule.b.getString(R.string.X3));
            return false;
        }
        String str = textType.text1;
        if (str != null && str.trim().length() >= textType.needCount) {
            return true;
        }
        lsi0.y("请至少用15个字介绍一下你自己");
        return false;
    }
}

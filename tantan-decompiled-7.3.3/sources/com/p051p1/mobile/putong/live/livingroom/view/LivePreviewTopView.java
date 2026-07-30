package com.p051p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.edt;
import p153l.izs;
import p153l.qa00;
import p153l.xau;

/* JADX INFO: loaded from: classes5.dex */
public class LivePreviewTopView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f52857a;

    /* JADX INFO: renamed from: b */
    public VLinear f52858b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f52859c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f52860d;

    /* JADX INFO: renamed from: e */
    public VLinear f52861e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f52862f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f52863g;

    /* JADX INFO: renamed from: h */
    public VText f52864h;

    /* JADX INFO: renamed from: i */
    public VImage f52865i;

    /* JADX INFO: renamed from: j */
    public VEditText f52866j;

    public LivePreviewTopView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m77725a(View view) {
        edt.m120519a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77725a(this);
    }

    public void setAvatarFile(String str) {
        izs.m142868s("context_livingAct", this.f52863g, str);
    }

    public void setAvatarUrl(String str) {
        izs.m142869t("context_livingAct", this.f52863g, str, qa00.f156294G);
    }

    public void setCheckingStatus(String str) {
        if (xau.m209897B()) {
            bnl0.m105517I0(this.f52864h, str);
            bnl0.m105524M(this.f52865i, false);
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VImage vImage = this.f52865i;
        if (zIsEmpty) {
            bnl0.m105524M(vImage, false);
        } else {
            bnl0.m105524M(vImage, true);
        }
        bnl0.m105524M(this.f52864h, false);
    }

    public void setTitle(String str) {
        this.f52866j.setText(str);
        this.f52866j.setSelection(this.f52866j.getText() == null ? 0 : this.f52866j.getText().length());
    }

    public LivePreviewTopView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePreviewTopView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

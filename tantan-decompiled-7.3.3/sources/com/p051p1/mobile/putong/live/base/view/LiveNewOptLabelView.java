package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveCoverLabel;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.fc2;
import p153l.izs;
import p153l.jyb;
import p153l.l9c0;
import p153l.l9t;
import p153l.n3d0;
import p153l.qa00;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class LiveNewOptLabelView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VLinear f45555d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f45556e;

    /* JADX INFO: renamed from: f */
    public VText f45557f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f45558g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f45559h;

    /* JADX INFO: renamed from: i */
    public boolean f45560i;

    /* JADX INFO: renamed from: j */
    public boolean f45561j;

    /* JADX INFO: renamed from: k */
    public boolean f45562k;

    public LiveNewOptLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45560i = true;
        this.f45561j = true;
        this.f45562k = true;
    }

    /* JADX INFO: renamed from: B */
    public static String m69933B(List<BLiveCoverLabel> list) {
        return (list == null || list.isEmpty() || ((BLiveCoverLabel) jyb.m147529r(list, new qcj() { // from class: l.k9t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveCoverLabel bLiveCoverLabel = (BLiveCoverLabel) obj;
                return Boolean.valueOf("E".equals(bLiveCoverLabel.type) && "红包".equals(bLiveCoverLabel.name));
            }
        })) == null) ? "0" : "1";
    }

    /* JADX INFO: renamed from: z */
    public static int m69935z(List<String> list, int i) {
        if (jyb.m147479J(list) || i >= list.size()) {
            return 0;
        }
        return n3d0.m161284h(list.get(i), 0);
    }

    /* JADX INFO: renamed from: H */
    public final void m69936H() {
        bnl0.m105524M(this.f45555d, false);
        bnl0.m105524M(this.f45558g, false);
        bnl0.m105524M(this.f45559h, false);
    }

    /* JADX INFO: renamed from: I */
    public final void m69937I(BLiveCoverLabel bLiveCoverLabel) {
        GradientDrawable gradientDrawableM124980j;
        if (this.f45560i) {
            bnl0.m105524M(this.f45555d, true);
            boolean zIsEmpty = TextUtils.isEmpty(bLiveCoverLabel.icon);
            VDraweeView vDraweeView = this.f45556e;
            if (zIsEmpty) {
                bnl0.m105524M(vDraweeView, false);
                bnl0.m105538V(this.f45557f, qa00.m175859d(6.0f));
                gradientDrawableM124980j = fc2.m124979i(n3d0.m161277a(l9c0.f130588a), 6);
            } else {
                bnl0.m105524M(vDraweeView, true);
                izs.m142868s("context_square", this.f45556e, bLiveCoverLabel.icon);
                bnl0.m105538V(this.f45557f, 0);
                gradientDrawableM124980j = !jyb.m147479J(bLiveCoverLabel.background) ? fc2.m124980j(m69935z(bLiveCoverLabel.background, 0), m69935z(bLiveCoverLabel.background, 1), 6) : null;
            }
            this.f45557f.setText(bLiveCoverLabel.text);
            if (NullChecker.m82486a(gradientDrawableM124980j)) {
                this.f45555d.setBackground(gradientDrawableM124980j);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m69938L(BLiveCoverLabel bLiveCoverLabel) {
        if (this.f45561j) {
            bnl0.m105524M(this.f45558g, true);
            izs.m142868s("context_square", this.f45558g, bLiveCoverLabel.bgImage);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m69939M(BLiveCoverLabel bLiveCoverLabel) {
        if (this.f45562k) {
            bnl0.m105524M(this.f45559h, true);
            izs.m142868s("context_square", this.f45559h, bLiveCoverLabel.icon);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m69940O(List<BLiveCoverLabel> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        m69936H();
        for (BLiveCoverLabel bLiveCoverLabel : list) {
            String str = bLiveCoverLabel.type;
            str.getClass();
            switch (str) {
                case "A":
                    m69937I(bLiveCoverLabel);
                    break;
                case "B":
                    m69938L(bLiveCoverLabel);
                    break;
                case "C":
                    m69939M(bLiveCoverLabel);
                    break;
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69941q(this);
        this.f45557f.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: q */
    public final void m69941q(View view) {
        l9t.m153454a(this, view);
    }

    public void setAAreaLabelEnable(boolean z) {
        this.f45560i = z;
    }

    public void setBAreaLabelEnable(boolean z) {
        this.f45561j = z;
    }

    public void setCAreaLabelEnable(boolean z) {
        this.f45562k = z;
    }

    public LiveNewOptLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LiveNewOptLabelView(Context context) {
        this(context, null);
    }
}

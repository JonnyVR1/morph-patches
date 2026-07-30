package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveCoverLabel;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.f1c0;
import p149l.hxs;
import p149l.k7t;
import p149l.kvc0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes13.dex */
public class LiveNewOptLabelView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VLinear f44707d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f44708e;

    /* JADX INFO: renamed from: f */
    public VText f44709f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f44710g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f44711h;

    /* JADX INFO: renamed from: i */
    public boolean f44712i;

    /* JADX INFO: renamed from: j */
    public boolean f44713j;

    /* JADX INFO: renamed from: k */
    public boolean f44714k;

    public LiveNewOptLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44712i = true;
        this.f44713j = true;
        this.f44714k = true;
    }

    /* JADX INFO: renamed from: B */
    public static String m68750B(List<BLiveCoverLabel> list) {
        return (list == null || list.isEmpty() || ((BLiveCoverLabel) vwb.m200346r(list, new w9j() { // from class: l.j7t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveCoverLabel bLiveCoverLabel = (BLiveCoverLabel) obj;
                return Boolean.valueOf("E".equals(bLiveCoverLabel.type) && "红包".equals(bLiveCoverLabel.name));
            }
        })) == null) ? "0" : "1";
    }

    /* JADX INFO: renamed from: z */
    public static int m68752z(List<String> list, int i) {
        if (vwb.m200296J(list) || i >= list.size()) {
            return 0;
        }
        return kvc0.m147359h(list.get(i), 0);
    }

    /* JADX INFO: renamed from: H */
    public final void m68753H() {
        xdl0.m208344M(this.f44707d, false);
        xdl0.m208344M(this.f44710g, false);
        xdl0.m208344M(this.f44711h, false);
    }

    /* JADX INFO: renamed from: I */
    public final void m68754I(BLiveCoverLabel bLiveCoverLabel) {
        GradientDrawable gradientDrawableM213885j;
        if (this.f44712i) {
            xdl0.m208344M(this.f44707d, true);
            boolean zIsEmpty = TextUtils.isEmpty(bLiveCoverLabel.icon);
            VDraweeView vDraweeView = this.f44708e;
            if (zIsEmpty) {
                xdl0.m208344M(vDraweeView, false);
                xdl0.m208358V(this.f44709f, t100.m186890d(6.0f));
                gradientDrawableM213885j = yb2.m213884i(kvc0.m147352a(f1c0.f94064a), 6);
            } else {
                xdl0.m208344M(vDraweeView, true);
                hxs.m133406s("context_square", this.f44708e, bLiveCoverLabel.icon);
                xdl0.m208358V(this.f44709f, 0);
                gradientDrawableM213885j = !vwb.m200296J(bLiveCoverLabel.background) ? yb2.m213885j(m68752z(bLiveCoverLabel.background, 0), m68752z(bLiveCoverLabel.background, 1), 6) : null;
            }
            this.f44709f.setText(bLiveCoverLabel.text);
            if (NullChecker.m81303a(gradientDrawableM213885j)) {
                this.f44707d.setBackground(gradientDrawableM213885j);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m68755L(BLiveCoverLabel bLiveCoverLabel) {
        if (this.f44713j) {
            xdl0.m208344M(this.f44710g, true);
            hxs.m133406s("context_square", this.f44710g, bLiveCoverLabel.bgImage);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m68756M(BLiveCoverLabel bLiveCoverLabel) {
        if (this.f44714k) {
            xdl0.m208344M(this.f44711h, true);
            hxs.m133406s("context_square", this.f44711h, bLiveCoverLabel.icon);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m68757O(List<BLiveCoverLabel> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        m68753H();
        for (BLiveCoverLabel bLiveCoverLabel : list) {
            String str = bLiveCoverLabel.type;
            str.getClass();
            switch (str) {
                case "A":
                    m68754I(bLiveCoverLabel);
                    break;
                case "B":
                    m68755L(bLiveCoverLabel);
                    break;
                case "C":
                    m68756M(bLiveCoverLabel);
                    break;
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68758q(this);
        this.f44709f.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: q */
    public final void m68758q(View view) {
        k7t.m144701a(this, view);
    }

    public void setAAreaLabelEnable(boolean z) {
        this.f44712i = z;
    }

    public void setBAreaLabelEnable(boolean z) {
        this.f44713j = z;
    }

    public void setCAreaLabelEnable(boolean z) {
        this.f44714k = z;
    }

    public LiveNewOptLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LiveNewOptLabelView(Context context) {
        this(context, null);
    }
}

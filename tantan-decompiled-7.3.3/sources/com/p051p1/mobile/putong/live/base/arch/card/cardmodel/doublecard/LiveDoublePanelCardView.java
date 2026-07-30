package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.doublecard;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import p151v.VDraweeView;
import p153l.fc2;
import p153l.izs;
import p153l.jdc0;
import p153l.jyb;
import p153l.n3d0;
import p153l.qa00;
import p153l.rbt;

/* JADX INFO: loaded from: classes13.dex */
public class LiveDoublePanelCardView extends FrameLayout {
    private View bgView;
    private VDraweeView iconView;
    private TextView subTitleView;
    private TextView titleView;

    public LiveDoublePanelCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static int m68620a(List<String> list, int i) {
        if (jyb.m147479J(list) || i >= list.size()) {
            return 0;
        }
        return n3d0.m161284h(list.get(i), 0);
    }

    /* JADX INFO: renamed from: b */
    public void m68621b(rbt rbtVar) {
        this.titleView.setText(rbtVar.title);
        this.subTitleView.setText(rbtVar.subTitle);
        VDraweeView vDraweeView = this.iconView;
        String strM180762b = rbtVar.m180762b();
        int i = qa00.f156335v;
        izs.m142870u("context_square", vDraweeView, strM180762b, i, i);
        if (jyb.m147479J(rbtVar.background)) {
            return;
        }
        this.bgView.setBackground(fc2.m124980j(m68620a(rbtVar.background, 0), m68620a(rbtVar.background, 1), 10));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.bgView = findViewById(jdc0.f120143J0);
        this.iconView = (VDraweeView) findViewById(jdc0.f120160S);
        TextView textView = (TextView) findViewById(jdc0.f120175Z0);
        this.titleView = textView;
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        this.subTitleView = (TextView) findViewById(jdc0.f120147L0);
    }

    public LiveDoublePanelCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveDoublePanelCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

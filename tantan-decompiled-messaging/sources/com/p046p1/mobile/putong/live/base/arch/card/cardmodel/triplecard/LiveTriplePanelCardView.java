package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.triplecard;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import p147v.VDraweeView;
import p149l.d5c0;
import p149l.hxs;
import p149l.kvc0;
import p149l.q9t;
import p149l.t100;
import p149l.vwb;
import p149l.yb2;

/* JADX INFO: loaded from: classes13.dex */
public class LiveTriplePanelCardView extends FrameLayout {
    private View bgView;
    private VDraweeView iconView;
    private TextView subTitleView;
    private TextView titleView;

    public LiveTriplePanelCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static int m67515a(List<String> list, int i) {
        if (vwb.m200296J(list) || i >= list.size()) {
            return 0;
        }
        return kvc0.m147359h(list.get(i), 0);
    }

    /* JADX INFO: renamed from: b */
    public void m67516b(q9t q9tVar) {
        this.titleView.setText(q9tVar.title);
        this.subTitleView.setText(q9tVar.subTitle);
        VDraweeView vDraweeView = this.iconView;
        String strM173674b = q9tVar.m173674b();
        int i = t100.f167273v;
        hxs.m133408u("context_square", vDraweeView, strM173674b, i, i);
        if (vwb.m200296J(q9tVar.background)) {
            return;
        }
        this.bgView.setBackground(yb2.m213885j(m67515a(q9tVar.background, 0), m67515a(q9tVar.background, 1), 10));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.bgView = findViewById(d5c0.f84425J0);
        this.iconView = (VDraweeView) findViewById(d5c0.f84442S);
        TextView textView = (TextView) findViewById(d5c0.f84457Z0);
        this.titleView = textView;
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        this.subTitleView = (TextView) findViewById(d5c0.f84429L0);
    }

    public LiveTriplePanelCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveTriplePanelCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

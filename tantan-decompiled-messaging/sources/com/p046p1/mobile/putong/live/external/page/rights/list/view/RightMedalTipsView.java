package com.p046p1.mobile.putong.live.external.page.rights.list.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightMedalTipsView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p147v.VText;
import p149l.agv;
import p149l.g3c0;
import p149l.l9s;
import p149l.t100;
import p149l.w3d0;
import p149l.y3d0;

/* JADX INFO: loaded from: classes13.dex */
public class RightMedalTipsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RightMedalTipsView f46090a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f46091b;

    /* JADX INFO: renamed from: c */
    public VText f46092c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f46093d;

    /* JADX INFO: renamed from: e */
    public VText f46094e;

    /* JADX INFO: renamed from: f */
    public CommonMedalView f46095f;

    /* JADX INFO: renamed from: g */
    public CommonMedalView f46096g;

    /* JADX INFO: renamed from: h */
    public TextView f46097h;

    /* JADX INFO: renamed from: i */
    public TextView f46098i;

    /* JADX INFO: renamed from: j */
    public final int f46099j;

    /* JADX INFO: renamed from: k */
    public final int f46100k;

    /* JADX INFO: renamed from: l */
    public final int f46101l;

    public RightMedalTipsView(Context context) {
        super(context);
        this.f46099j = t100.m186890d(4.0f);
        this.f46100k = t100.m186890d(6.0f);
        this.f46101l = t100.m186890d(14.0f);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m70623a(BLiveRightItem bLiveRightItem, BLiveRightItem bLiveRightItem2) {
        return (int) (bLiveRightItem.updatedTimeInSeconds - bLiveRightItem2.updatedTimeInSeconds);
    }

    /* JADX INFO: renamed from: b */
    public final void m70624b(View view) {
        y3d0.m212796a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m70625c(w3d0 w3d0Var) {
        int childCount = this.f46093d.getChildCount();
        if (childCount == 0) {
            this.f46093d.addView(this.f46097h, m70626d(0));
            if (w3d0Var.m201280I()) {
                return;
            }
            this.f46093d.addView(this.f46098i, m70626d(this.f46099j));
            return;
        }
        if (childCount != 1 || w3d0Var.m201280I()) {
            return;
        }
        this.f46093d.addView(this.f46098i, m70626d(this.f46099j));
    }

    /* JADX INFO: renamed from: d */
    public final LinearLayout.LayoutParams m70626d(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.f46101l);
        if (i > 0) {
            layoutParams.leftMargin = i;
        }
        return layoutParams;
    }

    /* JADX INFO: renamed from: e */
    public final TextView m70627e(int i) {
        TextView textView = new TextView(getContext());
        textView.setText(i);
        int i2 = this.f46100k;
        textView.setPadding(i2, 0, i2, 0);
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setTextSize(10.0f);
        textView.setBackgroundResource(g3c0.f100413e);
        return textView;
    }

    /* JADX INFO: renamed from: f */
    public final void m70628f() {
        this.f46095f = new CommonMedalView(getContext());
        this.f46096g = new CommonMedalView(getContext());
        this.f46097h = m70627e(R$string.f44148Z0);
        this.f46098i = m70627e(R$string.f44151a1);
    }

    /* JADX INFO: renamed from: g */
    public final void m70629g(w3d0 w3d0Var) {
        int size = w3d0Var.m201279H().size();
        StringBuilder sb = new StringBuilder();
        sb.append(size);
        sb.append("/");
        sb.append(w3d0Var.m201280I() ? 1 : 2);
        this.f46094e.setText(String.format(getContext().getString(R$string.f44157c1), sb.toString()));
        this.f46094e.setTextColor(Color.parseColor(size > 0 ? "#212121" : "#999999"));
    }

    /* JADX INFO: renamed from: h */
    public final void m70630h(BLiveRightItem bLiveRightItem, CommonMedalView commonMedalView) {
        agv.m96351i(commonMedalView, 0, bLiveRightItem.getThumbnailUrl(), bLiveRightItem.dynamicUrl);
    }

    /* JADX INFO: renamed from: i */
    public final void m70631i(w3d0 w3d0Var) {
        List<BLiveRightItem> listM201279H = w3d0Var.m201279H();
        int size = listM201279H.size();
        this.f46093d.removeAllViews();
        Collections.sort(listM201279H, new Comparator() { // from class: l.x3d0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return RightMedalTipsView.m70623a((BLiveRightItem) obj, (BLiveRightItem) obj2);
            }
        });
        if (size == 1) {
            m70630h(listM201279H.get(0), this.f46095f);
            this.f46093d.addView(this.f46095f, m70626d(0));
        } else if (size == 2) {
            m70630h(listM201279H.get(0), this.f46095f);
            m70630h(listM201279H.get(1), this.f46096g);
            this.f46093d.addView(this.f46095f, m70626d(0));
            this.f46093d.addView(this.f46096g, m70626d(this.f46099j));
        }
        m70625c(w3d0Var);
    }

    /* JADX INFO: renamed from: j */
    public final void m70632j() {
        this.f46092c.setText(l9s.m149047J().name);
    }

    /* JADX INFO: renamed from: k */
    public void m70633k(w3d0 w3d0Var) {
        m70632j();
        m70631i(w3d0Var);
        m70629g(w3d0Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70624b(this);
        m70628f();
    }

    public RightMedalTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46099j = t100.m186890d(4.0f);
        this.f46100k = t100.m186890d(6.0f);
        this.f46101l = t100.m186890d(14.0f);
    }

    public RightMedalTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46099j = t100.m186890d(4.0f);
        this.f46100k = t100.m186890d(6.0f);
        this.f46101l = t100.m186890d(14.0f);
    }
}

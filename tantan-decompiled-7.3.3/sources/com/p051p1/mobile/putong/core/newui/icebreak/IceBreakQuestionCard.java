package com.p051p1.mobile.putong.core.newui.icebreak;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.data.IceBreakQuestion;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VCheckBox;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.jbm;
import p153l.jyb;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class IceBreakQuestionCard extends CardView {

    /* JADX INFO: renamed from: a */
    public ImageView f24825a;

    /* JADX INFO: renamed from: b */
    public VText f24826b;

    /* JADX INFO: renamed from: c */
    public VText f24827c;

    /* JADX INFO: renamed from: d */
    public VText f24828d;

    /* JADX INFO: renamed from: e */
    public VLinear f24829e;

    /* JADX INFO: renamed from: f */
    public VLinear f24830f;

    /* JADX INFO: renamed from: g */
    public VText f24831g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f24832h;

    /* JADX INFO: renamed from: i */
    public VLinear f24833i;

    /* JADX INFO: renamed from: j */
    public VText f24834j;

    /* JADX INFO: renamed from: k */
    public VCheckBox f24835k;

    /* JADX INFO: renamed from: l */
    public VLinear f24836l;

    /* JADX INFO: renamed from: m */
    public VText f24837m;

    /* JADX INFO: renamed from: n */
    public VCheckBox f24838n;

    /* JADX INFO: renamed from: o */
    public List<C8218a> f24839o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.icebreak.IceBreakQuestionCard$a */
    public static class C8218a {

        /* JADX INFO: renamed from: a */
        public View f24840a;

        /* JADX INFO: renamed from: b */
        public VText f24841b;

        /* JADX INFO: renamed from: c */
        public VCheckBox f24842c;

        /* JADX INFO: renamed from: d */
        public IceBreakQuestion f24843d;

        public C8218a(View view, VText vText, VCheckBox vCheckBox) {
            this.f24840a = view;
            this.f24841b = vText;
            this.f24842c = vCheckBox;
            vText.getPaint().setFakeBoldText(true);
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m40245b(CompoundButton compoundButton, boolean z) {
            this.f24840a.setSelected(z);
        }

        /* JADX INFO: renamed from: c */
        public void m40246c(IceBreakQuestion iceBreakQuestion) {
            this.f24843d = iceBreakQuestion;
            bnl0.m105524M(this.f24840a, true);
            this.f24841b.setText(iceBreakQuestion.content);
            this.f24842c.setChecked(true);
            this.f24840a.setSelected(true);
            this.f24842c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ibm
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f114234a.m40245b(compoundButton, z);
                }
            });
            this.f24842c.setClickable(true);
        }

        /* JADX INFO: renamed from: d */
        public void m40247d() {
            this.f24843d = null;
            bnl0.m105524M(this.f24840a, false);
            this.f24842c.setChecked(false);
        }
    }

    public IceBreakQuestionCard(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m40241e(View view) {
        jbm.m144326a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m40242f(y20 y20Var, View view) {
        List<String> checkedIds = getCheckedIds();
        if (jyb.m147479J(checkedIds) || !NullChecker.m82486a(y20Var)) {
            return;
        }
        y20Var.call(checkedIds);
    }

    public List<String> getCheckedIds() {
        IceBreakQuestion iceBreakQuestion;
        ArrayList arrayList = new ArrayList();
        for (C8218a c8218a : this.f24839o) {
            if (c8218a.f24842c.isChecked() && (iceBreakQuestion = c8218a.f24843d) != null) {
                arrayList.add(iceBreakQuestion.f21161id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public void m40243h(List<IceBreakQuestion> list, final y20<List<String>> y20Var) {
        for (int i = 0; i < this.f24839o.size(); i++) {
            int size = list.size();
            List<C8218a> list2 = this.f24839o;
            if (size > i) {
                list2.get(i).m40246c(list.get(i));
            } else {
                list2.get(i).m40247d();
            }
        }
        bnl0.m105509E0(this.f24828d, new View.OnClickListener() { // from class: l.hbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108603a.m40242f(y20Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40241e(this);
        this.f24826b.getPaint().setFakeBoldText(true);
        this.f24828d.getPaint().setFakeBoldText(true);
        this.f24839o = jyb.m147507f0(new C8218a(this.f24830f, this.f24831g, this.f24832h), new C8218a(this.f24833i, this.f24834j, this.f24835k), new C8218a(this.f24836l, this.f24837m, this.f24838n));
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f24829e.getMeasuredHeight() > ((View) this.f24829e.getParent()).getMeasuredHeight()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24829e.getLayoutParams();
            layoutParams.gravity = 48;
            this.f24829e.setLayoutParams(layoutParams);
        }
    }

    public IceBreakQuestionCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IceBreakQuestionCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p046p1.mobile.putong.core.newui.icebreak;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.data.IceBreakQuestion;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VCheckBox;
import p147v.VLinear;
import p147v.VText;
import p149l.e30;
import p149l.t8m;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class IceBreakQuestionCard extends CardView {

    /* JADX INFO: renamed from: a */
    public ImageView f24083a;

    /* JADX INFO: renamed from: b */
    public VText f24084b;

    /* JADX INFO: renamed from: c */
    public VText f24085c;

    /* JADX INFO: renamed from: d */
    public VText f24086d;

    /* JADX INFO: renamed from: e */
    public VLinear f24087e;

    /* JADX INFO: renamed from: f */
    public VLinear f24088f;

    /* JADX INFO: renamed from: g */
    public VText f24089g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f24090h;

    /* JADX INFO: renamed from: i */
    public VLinear f24091i;

    /* JADX INFO: renamed from: j */
    public VText f24092j;

    /* JADX INFO: renamed from: k */
    public VCheckBox f24093k;

    /* JADX INFO: renamed from: l */
    public VLinear f24094l;

    /* JADX INFO: renamed from: m */
    public VText f24095m;

    /* JADX INFO: renamed from: n */
    public VCheckBox f24096n;

    /* JADX INFO: renamed from: o */
    public List<C8067a> f24097o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.icebreak.IceBreakQuestionCard$a */
    public static class C8067a {

        /* JADX INFO: renamed from: a */
        public View f24098a;

        /* JADX INFO: renamed from: b */
        public VText f24099b;

        /* JADX INFO: renamed from: c */
        public VCheckBox f24100c;

        /* JADX INFO: renamed from: d */
        public IceBreakQuestion f24101d;

        public C8067a(View view, VText vText, VCheckBox vCheckBox) {
            this.f24098a = view;
            this.f24099b = vText;
            this.f24100c = vCheckBox;
            vText.getPaint().setFakeBoldText(true);
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m39242b(CompoundButton compoundButton, boolean z) {
            this.f24098a.setSelected(z);
        }

        /* JADX INFO: renamed from: c */
        public void m39243c(IceBreakQuestion iceBreakQuestion) {
            this.f24101d = iceBreakQuestion;
            xdl0.m208344M(this.f24098a, true);
            this.f24099b.setText(iceBreakQuestion.content);
            this.f24100c.setChecked(true);
            this.f24098a.setSelected(true);
            this.f24100c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.s8m
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f163091a.m39242b(compoundButton, z);
                }
            });
            this.f24100c.setClickable(true);
        }

        /* JADX INFO: renamed from: d */
        public void m39244d() {
            this.f24101d = null;
            xdl0.m208344M(this.f24098a, false);
            this.f24100c.setChecked(false);
        }
    }

    public IceBreakQuestionCard(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m39238e(View view) {
        t8m.m187556a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m39239f(e30 e30Var, View view) {
        List<String> checkedIds = getCheckedIds();
        if (vwb.m200296J(checkedIds) || !NullChecker.m81303a(e30Var)) {
            return;
        }
        e30Var.call(checkedIds);
    }

    public List<String> getCheckedIds() {
        IceBreakQuestion iceBreakQuestion;
        ArrayList arrayList = new ArrayList();
        for (C8067a c8067a : this.f24097o) {
            if (c8067a.f24100c.isChecked() && (iceBreakQuestion = c8067a.f24101d) != null) {
                arrayList.add(iceBreakQuestion.f20419id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public void m39240h(List<IceBreakQuestion> list, final e30<List<String>> e30Var) {
        for (int i = 0; i < this.f24097o.size(); i++) {
            int size = list.size();
            List<C8067a> list2 = this.f24097o;
            if (size > i) {
                list2.get(i).m39243c(list.get(i));
            } else {
                list2.get(i).m39244d();
            }
        }
        xdl0.m208329E0(this.f24086d, new View.OnClickListener() { // from class: l.r8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158240a.m39239f(e30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39238e(this);
        this.f24084b.getPaint().setFakeBoldText(true);
        this.f24086d.getPaint().setFakeBoldText(true);
        this.f24097o = vwb.m200324f0(new C8067a(this.f24088f, this.f24089g, this.f24090h), new C8067a(this.f24091i, this.f24092j, this.f24093k), new C8067a(this.f24094l, this.f24095m, this.f24096n));
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f24087e.getMeasuredHeight() > ((View) this.f24087e.getParent()).getMeasuredHeight()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24087e.getLayoutParams();
            layoutParams.gravity = 48;
            this.f24087e.setLayoutParams(layoutParams);
        }
    }

    public IceBreakQuestionCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IceBreakQuestionCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

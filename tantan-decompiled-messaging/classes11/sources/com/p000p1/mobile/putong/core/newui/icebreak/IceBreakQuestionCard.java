package com.p000p1.mobile.putong.core.newui.icebreak;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.p1.mobile.putong.core.data.IceBreakQuestion;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.t8m;
import l.vwb;
import l.xdl0;
import v.VCheckBox;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IceBreakQuestionCard extends CardView {

    /* JADX INFO: renamed from: a */
    public ImageView f2861a;

    /* JADX INFO: renamed from: b */
    public VText f2862b;

    /* JADX INFO: renamed from: c */
    public VText f2863c;

    /* JADX INFO: renamed from: d */
    public VText f2864d;

    /* JADX INFO: renamed from: e */
    public VLinear f2865e;

    /* JADX INFO: renamed from: f */
    public VLinear f2866f;

    /* JADX INFO: renamed from: g */
    public VText f2867g;

    /* JADX INFO: renamed from: h */
    public VCheckBox f2868h;

    /* JADX INFO: renamed from: i */
    public VLinear f2869i;

    /* JADX INFO: renamed from: j */
    public VText f2870j;

    /* JADX INFO: renamed from: k */
    public VCheckBox f2871k;

    /* JADX INFO: renamed from: l */
    public VLinear f2872l;

    /* JADX INFO: renamed from: m */
    public VText f2873m;

    /* JADX INFO: renamed from: n */
    public VCheckBox f2874n;

    /* JADX INFO: renamed from: o */
    public List<C0231a> f2875o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.icebreak.IceBreakQuestionCard$a */
    public static class C0231a {

        /* JADX INFO: renamed from: a */
        public View f2876a;

        /* JADX INFO: renamed from: b */
        public VText f2877b;

        /* JADX INFO: renamed from: c */
        public VCheckBox f2878c;

        /* JADX INFO: renamed from: d */
        public IceBreakQuestion f2879d;

        public C0231a(View view, VText vText, VCheckBox vCheckBox) {
            this.f2876a = view;
            this.f2877b = vText;
            this.f2878c = vCheckBox;
            vText.getPaint().setFakeBoldText(true);
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m3260b(CompoundButton compoundButton, boolean z) {
            this.f2876a.setSelected(z);
        }

        /* JADX INFO: renamed from: c */
        public void m3261c(IceBreakQuestion iceBreakQuestion) {
            this.f2879d = iceBreakQuestion;
            xdl0.M(this.f2876a, true);
            this.f2877b.setText(iceBreakQuestion.content);
            this.f2878c.setChecked(true);
            this.f2876a.setSelected(true);
            this.f2878c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.s8m
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.f20133a.m3260b(compoundButton, z);
                }
            });
            this.f2878c.setClickable(true);
        }

        /* JADX INFO: renamed from: d */
        public void m3262d() {
            this.f2879d = null;
            xdl0.M(this.f2876a, false);
            this.f2878c.setChecked(false);
        }
    }

    public IceBreakQuestionCard(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m3256e(View view) {
        t8m.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m3257f(e30 e30Var, View view) {
        List<String> checkedIds = getCheckedIds();
        if (vwb.J(checkedIds) || !NullChecker.a(e30Var)) {
            return;
        }
        e30Var.call(checkedIds);
    }

    public List<String> getCheckedIds() {
        IceBreakQuestion iceBreakQuestion;
        ArrayList arrayList = new ArrayList();
        for (C0231a c0231a : this.f2875o) {
            if (c0231a.f2878c.isChecked() && (iceBreakQuestion = c0231a.f2879d) != null) {
                arrayList.add(iceBreakQuestion.id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public void m3258h(List<IceBreakQuestion> list, final e30<List<String>> e30Var) {
        for (int i = 0; i < this.f2875o.size(); i++) {
            int size = list.size();
            List<C0231a> list2 = this.f2875o;
            if (size > i) {
                list2.get(i).m3261c(list.get(i));
            } else {
                list2.get(i).m3262d();
            }
        }
        xdl0.E0(this.f2864d, new View.OnClickListener() { // from class: l.r8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19694a.m3257f(e30Var, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3256e(this);
        this.f2862b.getPaint().setFakeBoldText(true);
        this.f2864d.getPaint().setFakeBoldText(true);
        this.f2875o = vwb.f0(new C0231a[]{new C0231a(this.f2866f, this.f2867g, this.f2868h), new C0231a(this.f2869i, this.f2870j, this.f2871k), new C0231a(this.f2872l, this.f2873m, this.f2874n)});
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2865e.getMeasuredHeight() > ((View) this.f2865e.getParent()).getMeasuredHeight()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2865e.getLayoutParams();
            layoutParams.gravity = 48;
            this.f2865e.setLayoutParams(layoutParams);
        }
    }

    public IceBreakQuestionCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IceBreakQuestionCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

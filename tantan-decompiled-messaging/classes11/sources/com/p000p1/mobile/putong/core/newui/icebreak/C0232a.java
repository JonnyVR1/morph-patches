package com.p000p1.mobile.putong.core.newui.icebreak;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.newui.icebreak.C0232a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IceBreakQuestion;
import com.p1.mobile.putong.core.ui.profile.CityTopGreetDialog;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.j760;
import l.l5j0;
import l.p4c0;
import l.vwb;
import l.xdl0;
import l.z8m;
import l.zvf0;
import p009l.i0e;
import p009l.o8m;
import v.VCheckBox;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.icebreak.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0232a extends l5j0 {

    /* JADX INFO: renamed from: f */
    public View f2880f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f2881g;

    /* JADX INFO: renamed from: h */
    public ImageView f2882h;

    /* JADX INFO: renamed from: i */
    public VImage f2883i;

    /* JADX INFO: renamed from: j */
    public TextView f2884j;

    /* JADX INFO: renamed from: k */
    public VLinear f2885k;

    /* JADX INFO: renamed from: l */
    public VText f2886l;

    /* JADX INFO: renamed from: m */
    public VCheckBox f2887m;

    /* JADX INFO: renamed from: n */
    public VLinear f2888n;

    /* JADX INFO: renamed from: o */
    public VText f2889o;

    /* JADX INFO: renamed from: p */
    public VCheckBox f2890p;

    /* JADX INFO: renamed from: q */
    public VLinear f2891q;

    /* JADX INFO: renamed from: r */
    public VText f2892r;

    /* JADX INFO: renamed from: s */
    public VCheckBox f2893s;

    /* JADX INFO: renamed from: t */
    public TextView f2894t;

    /* JADX INFO: renamed from: u */
    public Act f2895u;

    /* JADX INFO: renamed from: v */
    public cwf0 f2896v;

    /* JADX INFO: renamed from: w */
    public BottomSheetBehavior f2897w;

    /* JADX INFO: renamed from: x */
    public List<IceBreakQuestion> f2898x;

    /* JADX INFO: renamed from: y */
    public ArrayList<IceBreakQuestionCard.C0231a> f2899y;

    /* JADX INFO: renamed from: z */
    public final BottomSheetBehavior.BottomSheetCallback f2900z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.icebreak.a$a */
    public class a extends BottomSheetBehavior.BottomSheetCallback {
        public a() {
        }

        public void onSlide(@NonNull View view, float f) {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                C0232a.this.f2897w.setState(3);
            }
        }
    }

    public C0232a(@NonNull Context context) {
        super(context);
        this.f2900z = new a();
        m3267I(context);
    }

    /* JADX INFO: renamed from: G */
    private String m3266G() {
        return "p_add_like_question_to_chat";
    }

    /* JADX INFO: renamed from: I */
    private void m3267I(Context context) {
        this.f2895u = xdl0.D(context);
        setContentView(m3273E(LayoutInflater.from(context), null));
        setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m3268K(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m3269L(View view) {
        List<String> listM3275H = m3275H();
        if (vwb.J(listM3275H)) {
            return;
        }
        zvf0.u("e_add_chat_question", "p_add_like_question_to_chat", new j760[]{vwb.Y("chat_question_content", vwb.U(listM3275H, "_"))});
        o8m.m19650a().m19654e();
        CoreModule.c.e0.sa(m3274F());
        dismiss();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m3271y(View view) {
    }

    /* JADX INFO: renamed from: E */
    public View m3273E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z8m.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public List<String> m3274F() {
        IceBreakQuestion iceBreakQuestion;
        ArrayList arrayList = new ArrayList();
        for (IceBreakQuestionCard.C0231a c0231a : this.f2899y) {
            if (c0231a.f2878c.isChecked() && (iceBreakQuestion = c0231a.f2879d) != null) {
                arrayList.add(iceBreakQuestion.id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public List<String> m3275H() {
        IceBreakQuestion iceBreakQuestion;
        ArrayList arrayList = new ArrayList();
        for (IceBreakQuestionCard.C0231a c0231a : this.f2899y) {
            if (c0231a.f2878c.isChecked() && (iceBreakQuestion = c0231a.f2879d) != null) {
                arrayList.add(iceBreakQuestion.content);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public void m3276J() {
        this.f2899y = vwb.f0(new IceBreakQuestionCard.C0231a[]{new IceBreakQuestionCard.C0231a(this.f2885k, this.f2886l, this.f2887m), new IceBreakQuestionCard.C0231a(this.f2888n, this.f2889o, this.f2890p), new IceBreakQuestionCard.C0231a(this.f2891q, this.f2892r, this.f2893s)});
        for (int i = 0; i < this.f2899y.size(); i++) {
            int size = this.f2898x.size();
            ArrayList<IceBreakQuestionCard.C0231a> arrayList = this.f2899y;
            if (size > i) {
                arrayList.get(i).m3261c(this.f2898x.get(i));
            } else {
                arrayList.get(i).m3262d();
            }
        }
        xdl0.E0(this.f2882h, new View.OnClickListener() { // from class: l.w8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21949a.m3268K(view);
            }
        });
        xdl0.E0(this.f2881g, new View.OnClickListener() { // from class: l.x8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0232a.m3271y(view);
            }
        });
        xdl0.E0(this.f2894t, new View.OnClickListener() { // from class: l.y8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22933a.m3269L(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m3277M(DialogInterface dialogInterface) {
        i0e.m16064e(this.f2896v);
    }

    /* JADX INFO: renamed from: N */
    public void m3278N(List<IceBreakQuestion> list) {
        this.f2898x = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f2897w = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f2897w.setBottomSheetCallback(this.f2900z);
        m3276J();
        if (this.f2896v == null) {
            this.f2896v = i0e.m16062c(m3266G(), CityTopGreetDialog.class.getSimpleName());
        }
        i0e.m16065f(this.f2896v);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.u8m
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f21018a.m3277M(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.v8m
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                o8m.m19650a().m19655f();
            }
        });
        super/*android.app.Dialog*/.show();
    }
}

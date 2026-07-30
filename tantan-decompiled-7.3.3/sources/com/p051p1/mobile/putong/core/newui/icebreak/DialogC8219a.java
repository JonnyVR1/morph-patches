package com.p051p1.mobile.putong.core.newui.icebreak;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IceBreakQuestion;
import com.p051p1.mobile.putong.core.newui.icebreak.DialogC8219a;
import com.p051p1.mobile.putong.core.p058ui.profile.CityTopGreetDialog;
import java.util.ArrayList;
import java.util.List;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.ebm;
import p153l.i4g0;
import p153l.jyb;
import p153l.l4g0;
import p153l.pbm;
import p153l.pej0;
import p153l.vcc0;
import p153l.w1e;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.icebreak.a */
/* JADX INFO: loaded from: classes11.dex */
public class DialogC8219a extends pej0 {

    /* JADX INFO: renamed from: f */
    public View f24844f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f24845g;

    /* JADX INFO: renamed from: h */
    public ImageView f24846h;

    /* JADX INFO: renamed from: i */
    public VImage f24847i;

    /* JADX INFO: renamed from: j */
    public TextView f24848j;

    /* JADX INFO: renamed from: k */
    public VLinear f24849k;

    /* JADX INFO: renamed from: l */
    public VText f24850l;

    /* JADX INFO: renamed from: m */
    public VCheckBox f24851m;

    /* JADX INFO: renamed from: n */
    public VLinear f24852n;

    /* JADX INFO: renamed from: o */
    public VText f24853o;

    /* JADX INFO: renamed from: p */
    public VCheckBox f24854p;

    /* JADX INFO: renamed from: q */
    public VLinear f24855q;

    /* JADX INFO: renamed from: r */
    public VText f24856r;

    /* JADX INFO: renamed from: s */
    public VCheckBox f24857s;

    /* JADX INFO: renamed from: t */
    public TextView f24858t;

    /* JADX INFO: renamed from: u */
    public Act f24859u;

    /* JADX INFO: renamed from: v */
    public l4g0 f24860v;

    /* JADX INFO: renamed from: w */
    public BottomSheetBehavior f24861w;

    /* JADX INFO: renamed from: x */
    public List<IceBreakQuestion> f24862x;

    /* JADX INFO: renamed from: y */
    public ArrayList<IceBreakQuestionCard.C8218a> f24863y;

    /* JADX INFO: renamed from: z */
    public final BottomSheetBehavior.BottomSheetCallback f24864z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.icebreak.a$a */
    public class a extends BottomSheetBehavior.BottomSheetCallback {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                DialogC8219a.this.f24861w.setState(3);
            }
        }
    }

    public DialogC8219a(@NonNull Context context) {
        super(context);
        this.f24864z = new a();
        m40252I(context);
    }

    /* JADX INFO: renamed from: G */
    private String m40251G() {
        return "p_add_like_question_to_chat";
    }

    /* JADX INFO: renamed from: I */
    private void m40252I(Context context) {
        this.f24859u = (Act) bnl0.m105506D(context);
        setContentView(m40258E(LayoutInflater.from(context), null));
        setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m40253K(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m40254L(View view) {
        List<String> listM40260H = m40260H();
        if (jyb.m147479J(listM40260H)) {
            return;
        }
        i4g0.m138523u("e_add_chat_question", "p_add_like_question_to_chat", jyb.m147494Y("chat_question_content", jyb.m147490U(listM40260H, "_")));
        ebm.m120180a().m120184e();
        CoreModule.f18264c.f20381e0.m116613sa(m40259F());
        dismiss();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m40256y(View view) {
    }

    /* JADX INFO: renamed from: E */
    public View m40258E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pbm.m171526b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public List<String> m40259F() {
        IceBreakQuestion iceBreakQuestion;
        ArrayList arrayList = new ArrayList();
        for (IceBreakQuestionCard.C8218a c8218a : this.f24863y) {
            if (c8218a.f24842c.isChecked() && (iceBreakQuestion = c8218a.f24843d) != null) {
                arrayList.add(iceBreakQuestion.f21161id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public List<String> m40260H() {
        IceBreakQuestion iceBreakQuestion;
        ArrayList arrayList = new ArrayList();
        for (IceBreakQuestionCard.C8218a c8218a : this.f24863y) {
            if (c8218a.f24842c.isChecked() && (iceBreakQuestion = c8218a.f24843d) != null) {
                arrayList.add(iceBreakQuestion.content);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public void m40261J() {
        this.f24863y = jyb.m147507f0(new IceBreakQuestionCard.C8218a(this.f24849k, this.f24850l, this.f24851m), new IceBreakQuestionCard.C8218a(this.f24852n, this.f24853o, this.f24854p), new IceBreakQuestionCard.C8218a(this.f24855q, this.f24856r, this.f24857s));
        for (int i = 0; i < this.f24863y.size(); i++) {
            int size = this.f24862x.size();
            ArrayList<IceBreakQuestionCard.C8218a> arrayList = this.f24863y;
            if (size > i) {
                arrayList.get(i).m40246c(this.f24862x.get(i));
            } else {
                arrayList.get(i).m40247d();
            }
        }
        bnl0.m105509E0(this.f24846h, new View.OnClickListener() { // from class: l.mbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135737a.m40253K(view);
            }
        });
        bnl0.m105509E0(this.f24845g, new View.OnClickListener() { // from class: l.nbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8219a.m40256y(view);
            }
        });
        bnl0.m105509E0(this.f24858t, new View.OnClickListener() { // from class: l.obm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146600a.m40254L(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m40262M(DialogInterface dialogInterface) {
        w1e.m204401e(this.f24860v);
    }

    /* JADX INFO: renamed from: N */
    public void m40263N(List<IceBreakQuestion> list) {
        this.f24862x = list;
    }

    @Override // android.app.Dialog
    public void show() {
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f24861w = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f24861w.setBottomSheetCallback(this.f24864z);
        m40261J();
        if (this.f24860v == null) {
            this.f24860v = w1e.m204399c(m40251G(), CityTopGreetDialog.class.getSimpleName());
        }
        w1e.m204402f(this.f24860v);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.kbm
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f124964a.m40262M(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.lbm
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ebm.m120180a().m120185f();
            }
        });
        super.show();
    }
}

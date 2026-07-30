package com.p046p1.mobile.putong.core.newui.icebreak;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IceBreakQuestion;
import com.p046p1.mobile.putong.core.newui.icebreak.DialogC8068a;
import com.p046p1.mobile.putong.core.p053ui.profile.CityTopGreetDialog;
import java.util.ArrayList;
import java.util.List;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.cwf0;
import p149l.i0e;
import p149l.l5j0;
import p149l.o8m;
import p149l.p4c0;
import p149l.vwb;
import p149l.xdl0;
import p149l.z8m;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.icebreak.a */
/* JADX INFO: loaded from: classes11.dex */
public class DialogC8068a extends l5j0 {

    /* JADX INFO: renamed from: f */
    public View f24102f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f24103g;

    /* JADX INFO: renamed from: h */
    public ImageView f24104h;

    /* JADX INFO: renamed from: i */
    public VImage f24105i;

    /* JADX INFO: renamed from: j */
    public TextView f24106j;

    /* JADX INFO: renamed from: k */
    public VLinear f24107k;

    /* JADX INFO: renamed from: l */
    public VText f24108l;

    /* JADX INFO: renamed from: m */
    public VCheckBox f24109m;

    /* JADX INFO: renamed from: n */
    public VLinear f24110n;

    /* JADX INFO: renamed from: o */
    public VText f24111o;

    /* JADX INFO: renamed from: p */
    public VCheckBox f24112p;

    /* JADX INFO: renamed from: q */
    public VLinear f24113q;

    /* JADX INFO: renamed from: r */
    public VText f24114r;

    /* JADX INFO: renamed from: s */
    public VCheckBox f24115s;

    /* JADX INFO: renamed from: t */
    public TextView f24116t;

    /* JADX INFO: renamed from: u */
    public Act f24117u;

    /* JADX INFO: renamed from: v */
    public cwf0 f24118v;

    /* JADX INFO: renamed from: w */
    public BottomSheetBehavior f24119w;

    /* JADX INFO: renamed from: x */
    public List<IceBreakQuestion> f24120x;

    /* JADX INFO: renamed from: y */
    public ArrayList<IceBreakQuestionCard.C8067a> f24121y;

    /* JADX INFO: renamed from: z */
    public final BottomSheetBehavior.BottomSheetCallback f24122z;

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
                DialogC8068a.this.f24119w.setState(3);
            }
        }
    }

    public DialogC8068a(@NonNull Context context) {
        super(context);
        this.f24122z = new a();
        m39249I(context);
    }

    /* JADX INFO: renamed from: G */
    private String m39248G() {
        return "p_add_like_question_to_chat";
    }

    /* JADX INFO: renamed from: I */
    private void m39249I(Context context) {
        this.f24117u = (Act) xdl0.m208326D(context);
        setContentView(m39255E(LayoutInflater.from(context), null));
        setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m39250K(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m39251L(View view) {
        List<String> listM39257H = m39257H();
        if (vwb.m200296J(listM39257H)) {
            return;
        }
        zvf0.m220399u("e_add_chat_question", "p_add_like_question_to_chat", vwb.m200311Y("chat_question_content", vwb.m200307U(listM39257H, "_")));
        o8m.m163183a().m163187e();
        CoreModule.f17545c.f19639e0.m169540sa(m39256F());
        dismiss();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m39253y(View view) {
    }

    /* JADX INFO: renamed from: E */
    public View m39255E(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z8m.m217618b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: F */
    public List<String> m39256F() {
        IceBreakQuestion iceBreakQuestion;
        ArrayList arrayList = new ArrayList();
        for (IceBreakQuestionCard.C8067a c8067a : this.f24121y) {
            if (c8067a.f24100c.isChecked() && (iceBreakQuestion = c8067a.f24101d) != null) {
                arrayList.add(iceBreakQuestion.f20419id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public List<String> m39257H() {
        IceBreakQuestion iceBreakQuestion;
        ArrayList arrayList = new ArrayList();
        for (IceBreakQuestionCard.C8067a c8067a : this.f24121y) {
            if (c8067a.f24100c.isChecked() && (iceBreakQuestion = c8067a.f24101d) != null) {
                arrayList.add(iceBreakQuestion.content);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public void m39258J() {
        this.f24121y = vwb.m200324f0(new IceBreakQuestionCard.C8067a(this.f24107k, this.f24108l, this.f24109m), new IceBreakQuestionCard.C8067a(this.f24110n, this.f24111o, this.f24112p), new IceBreakQuestionCard.C8067a(this.f24113q, this.f24114r, this.f24115s));
        for (int i = 0; i < this.f24121y.size(); i++) {
            int size = this.f24120x.size();
            ArrayList<IceBreakQuestionCard.C8067a> arrayList = this.f24121y;
            if (size > i) {
                arrayList.get(i).m39243c(this.f24120x.get(i));
            } else {
                arrayList.get(i).m39244d();
            }
        }
        xdl0.m208329E0(this.f24104h, new View.OnClickListener() { // from class: l.w8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185233a.m39250K(view);
            }
        });
        xdl0.m208329E0(this.f24103g, new View.OnClickListener() { // from class: l.x8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC8068a.m39253y(view);
            }
        });
        xdl0.m208329E0(this.f24116t, new View.OnClickListener() { // from class: l.y8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196853a.m39251L(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m39259M(DialogInterface dialogInterface) {
        i0e.m133796e(this.f24118v);
    }

    /* JADX INFO: renamed from: N */
    public void m39260N(List<IceBreakQuestion> list) {
        this.f24120x = list;
    }

    @Override // android.app.Dialog
    public void show() {
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -1;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        this.f24119w = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setState(3);
        this.f24119w.setBottomSheetCallback(this.f24122z);
        m39258J();
        if (this.f24118v == null) {
            this.f24118v = i0e.m133794c(m39248G(), CityTopGreetDialog.class.getSimpleName());
        }
        i0e.m133797f(this.f24118v);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.u8m
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f175144a.m39259M(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.v8m
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                o8m.m163183a().m163188f();
            }
        });
        super.show();
    }
}

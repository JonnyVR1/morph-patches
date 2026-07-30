package p149l;

import android.R;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.NextQuestionnaire;
import com.p046p1.mobile.putong.core.data.NextQuestionnaireOptions;
import com.p046p1.mobile.putong.core.data.Questionnaire;
import com.p046p1.mobile.putong.core.data.QuestionnaireOptions;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gij0 extends l5j0 {

    /* JADX INFO: renamed from: A */
    public ui40 f102905A;

    /* JADX INFO: renamed from: B */
    public tob0 f102906B;

    /* JADX INFO: renamed from: C */
    public cwf0 f102907C;

    /* JADX INFO: renamed from: D */
    public cwf0 f102908D;

    /* JADX INFO: renamed from: E */
    public cwf0 f102909E;

    /* JADX INFO: renamed from: f */
    public VLinear f102910f;

    /* JADX INFO: renamed from: g */
    public VImage f102911g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f102912h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f102913i;

    /* JADX INFO: renamed from: j */
    public VText f102914j;

    /* JADX INFO: renamed from: k */
    public VLinear f102915k;

    /* JADX INFO: renamed from: l */
    public VLinear f102916l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f102917m;

    /* JADX INFO: renamed from: n */
    public VText f102918n;

    /* JADX INFO: renamed from: o */
    public VLinear f102919o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f102920p;

    /* JADX INFO: renamed from: q */
    public VText f102921q;

    /* JADX INFO: renamed from: r */
    public VLinear f102922r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f102923s;

    /* JADX INFO: renamed from: t */
    public VText f102924t;

    /* JADX INFO: renamed from: u */
    public VLinear f102925u;

    /* JADX INFO: renamed from: v */
    public RecyclerView f102926v;

    /* JADX INFO: renamed from: w */
    public VText_Bold f102927w;

    /* JADX INFO: renamed from: x */
    public VText_Bold f102928x;

    /* JADX INFO: renamed from: y */
    public final Act f102929y;

    /* JADX INFO: renamed from: z */
    public String f102930z;

    public gij0(Act act) {
        super(act, v7c0.f180356c);
        this.f102907C = new cwf0("p_action_survey_experience", gij0.class.getName());
        this.f102908D = new cwf0("p_action_survey_question", gij0.class.getName());
        this.f102909E = new cwf0("p_action_survey_feedback", gij0.class.getName());
        setCancelable(false);
        this.f102929y = act;
    }

    /* JADX INFO: renamed from: Z */
    private void m126313Z() {
        Window window = getWindow();
        this.f102910f.post(new Runnable() { // from class: l.jhj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f117952a.m126330b0();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m81303a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p);
            frameLayout.setBackgroundResource(n3c0.f136963a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C17085a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: a0 */
    private void m126314a0() {
        setContentView(m126326V(LayoutInflater.from(this.f102929y), null));
        this.f102918n.setTypeface(Typeface.defaultFromStyle(1));
        this.f102921q.setTypeface(Typeface.defaultFromStyle(1));
        this.f102924t.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: A0 */
    public void m126318A0(final Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        this.f102930z = "P1";
        ArrayList arrayList = new ArrayList();
        Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().value);
        }
        this.f102908D.m109040p(vwb.m200311Y("paper_number", this.f102930z), vwb.m200311Y("experience_question_number", questionnaire.title), vwb.m200311Y("action_survey_answer_list", et4.m117971a("-", arrayList)));
        this.f102908D.m109033i();
        this.f102908D.m109036l();
        show();
        this.f102912h.setImageResource(x2c0.f190693wq);
        if (!TextUtils.isEmpty(questionnaire.title)) {
            this.f102913i.setText(questionnaire.title);
        }
        if (!TextUtils.isEmpty(questionnaire.description)) {
            this.f102914j.setText(questionnaire.description);
        }
        xdl0.m208344M(this.f102915k, false);
        xdl0.m208344M(this.f102925u, true);
        xdl0.m208344M(this.f102928x, false);
        this.f102906B = new tob0(this.f102929y, questionnaire.options);
        this.f102926v.setLayoutManager(new LinearLayoutManager(this.f102929y));
        this.f102926v.setAdapter(this.f102906B);
        this.f102906B.notifyDataSetChanged();
        m126325H0(false);
        this.f102906B.m189863D(new tob0.InterfaceC20220b() { // from class: l.zhj0
            @Override // p149l.tob0.InterfaceC20220b
            /* JADX INFO: renamed from: a */
            public final void mo189865a(View view, QuestionnaireOptions questionnaireOptions, int i) {
                this.f203183a.m126331c0(questionnaire, view, questionnaireOptions, i);
            }
        });
        xdl0.m208329E0(this.f102927w, new View.OnClickListener() { // from class: l.aij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69996a.m126332d0(questionnaire, view);
            }
        });
        xdl0.m208329E0(this.f102911g, new View.OnClickListener() { // from class: l.bij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75763a.m126333e0(view);
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    public final void m126319B0() {
        m126324G0();
        this.f102912h.setImageResource(x2c0.f190661vq);
        this.f102913i.setText("反馈已收到！");
        this.f102914j.setText("我们将尽快处理你的反馈和建议。如有任何体验问题，请通过我的客服发起咨询。");
        boolean zEquals = TextUtils.equals(this.f102930z, "P1");
        VText_Bold vText_Bold = this.f102928x;
        if (zEquals) {
            vText_Bold.setText("继续划卡");
        } else {
            vText_Bold.setText("知道了");
        }
        xdl0.m208344M(this.f102915k, false);
        xdl0.m208344M(this.f102925u, false);
        xdl0.m208344M(this.f102928x, true);
        xdl0.m208329E0(this.f102928x, new View.OnClickListener() { // from class: l.ohj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144005a.m126334f0(view);
            }
        });
        xdl0.m208329E0(this.f102911g, new View.OnClickListener() { // from class: l.phj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148936a.m126335g0(view);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public void m126320C0(Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        this.f102930z = "P2";
        ArrayList arrayList = new ArrayList();
        Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().value);
        }
        this.f102907C.m109040p(vwb.m200311Y("paper_number", "p2"), vwb.m200311Y("experience_question_number", questionnaire.title), vwb.m200311Y("action_survey_answer_list", et4.m117971a("-", arrayList)));
        this.f102907C.m109033i();
        this.f102907C.m109036l();
        show();
        this.f102912h.setImageResource(x2c0.f190757yq);
        m126323F0(questionnaire);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m126321D0(final NextQuestionnaire nextQuestionnaire) {
        ArrayList arrayList = new ArrayList();
        Iterator<NextQuestionnaireOptions> it = nextQuestionnaire.options.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().value);
        }
        this.f102908D.m109040p(vwb.m200311Y("paper_number", this.f102930z), vwb.m200311Y("experience_question_number", nextQuestionnaire.title), vwb.m200311Y("action_survey_answer_list", et4.m117971a("-", arrayList)));
        this.f102908D.m109033i();
        this.f102908D.m109036l();
        if (!TextUtils.isEmpty(nextQuestionnaire.title)) {
            this.f102913i.setText(nextQuestionnaire.title);
        }
        if (!TextUtils.isEmpty(nextQuestionnaire.description)) {
            this.f102914j.setText(nextQuestionnaire.description);
        }
        xdl0.m208344M(this.f102915k, false);
        xdl0.m208344M(this.f102925u, true);
        xdl0.m208344M(this.f102928x, false);
        this.f102905A = new ui40(this.f102929y, nextQuestionnaire.options);
        this.f102926v.setLayoutManager(new LinearLayoutManager(this.f102929y));
        this.f102926v.setAdapter(this.f102905A);
        this.f102905A.notifyDataSetChanged();
        m126325H0(false);
        this.f102905A.m193847D(new ui40.InterfaceC20437b() { // from class: l.vhj0
            @Override // p149l.ui40.InterfaceC20437b
            /* JADX INFO: renamed from: a */
            public final void mo193850a(View view, NextQuestionnaireOptions nextQuestionnaireOptions, int i) {
                this.f181508a.m126336h0(nextQuestionnaire, view, nextQuestionnaireOptions, i);
            }
        });
        xdl0.m208329E0(this.f102927w, new View.OnClickListener() { // from class: l.whj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186441a.m126337i0(nextQuestionnaire, view);
            }
        });
        xdl0.m208329E0(this.f102911g, new View.OnClickListener() { // from class: l.xhj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192895a.m126338j0(view);
            }
        });
    }

    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m126347s0() {
        m126324G0();
        this.f102912h.setImageResource(x2c0.f190661vq);
        this.f102913i.setText("感谢您的支持！");
        this.f102914j.setText("探探将继续为你推荐更适合的对象，如有任何体验问题，请随时反馈。");
        boolean zEquals = TextUtils.equals(this.f102930z, "P1");
        VText_Bold vText_Bold = this.f102928x;
        if (zEquals) {
            vText_Bold.setText("继续划卡");
        } else {
            vText_Bold.setText("知道了");
        }
        xdl0.m208344M(this.f102915k, false);
        xdl0.m208344M(this.f102925u, false);
        xdl0.m208344M(this.f102928x, true);
        xdl0.m208329E0(this.f102928x, new View.OnClickListener() { // from class: l.shj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164588a.m126339k0(view);
            }
        });
        xdl0.m208329E0(this.f102911g, new View.OnClickListener() { // from class: l.thj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170259a.m126340l0(view);
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    public final void m126323F0(final Questionnaire questionnaire) {
        if (!TextUtils.isEmpty(questionnaire.title)) {
            this.f102913i.setText(questionnaire.title);
        }
        if (!TextUtils.isEmpty(questionnaire.description)) {
            this.f102914j.setText(questionnaire.description);
        }
        xdl0.m208344M(this.f102915k, true);
        xdl0.m208344M(this.f102925u, false);
        xdl0.m208344M(this.f102928x, false);
        qib0.f154691G.m102331L0(this.f102917m, questionnaire.options.get(0).image);
        qib0.f154691G.m102331L0(this.f102920p, questionnaire.options.get(1).image);
        qib0.f154691G.m102331L0(this.f102923s, questionnaire.options.get(2).image);
        qib0.f154691G.m102377x0(questionnaire.options.get(0).imageSelected);
        qib0.f154691G.m102377x0(questionnaire.options.get(1).imageSelected);
        qib0.f154691G.m102377x0(questionnaire.options.get(2).imageSelected);
        this.f102918n.setText(questionnaire.options.get(0).value);
        this.f102921q.setText(questionnaire.options.get(1).value);
        this.f102924t.setText(questionnaire.options.get(2).value);
        xdl0.m208329E0(this.f102916l, new View.OnClickListener() { // from class: l.cij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81094a.m126343o0(questionnaire, view);
            }
        });
        xdl0.m208329E0(this.f102919o, new View.OnClickListener() { // from class: l.dij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86392a.m126346r0(questionnaire, view);
            }
        });
        xdl0.m208329E0(this.f102922r, new View.OnClickListener() { // from class: l.eij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91609a.m126349u0(questionnaire, view);
            }
        });
        xdl0.m208329E0(this.f102911g, new View.OnClickListener() { // from class: l.fij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97683a.m126350v0(view);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final void m126324G0() {
        this.f102909E.m109033i();
        this.f102909E.m109036l();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m126325H0(boolean z) {
        VText_Bold vText_Bold = this.f102927w;
        if (z) {
            vText_Bold.setBackgroundResource(x2c0.f189629P4);
        } else {
            vText_Bold.setBackgroundResource(x2c0.f189660Q4);
        }
        this.f102927w.setEnabled(z);
    }

    /* JADX INFO: renamed from: V */
    public View m126326V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hij0.m131260b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W */
    public final void m126327W() {
        this.f102907C.m109035k();
        this.f102907C.m109034j();
    }

    /* JADX INFO: renamed from: X */
    public final void m126328X() {
        this.f102909E.m109035k();
        this.f102909E.m109034j();
    }

    /* JADX INFO: renamed from: Y */
    public final void m126329Y() {
        this.f102907C.m109035k();
        this.f102907C.m109034j();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m126330b0() {
        getBehavior().setPeekHeight(this.f102910f.getHeight());
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m126331c0(Questionnaire questionnaire, View view, QuestionnaireOptions questionnaireOptions, int i) {
        boolean z = true;
        questionnaireOptions.checked = !questionnaireOptions.checked;
        this.f102906B.notifyItemChanged(i);
        Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
        while (it.hasNext()) {
            if (it.next().checked) {
                m126325H0(z);
            }
        }
        z = false;
        m126325H0(z);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m126332d0(Questionnaire questionnaire, View view) {
        ArrayList arrayList = new ArrayList();
        for (QuestionnaireOptions questionnaireOptions : questionnaire.options) {
            if (questionnaireOptions.checked) {
                arrayList.add(questionnaireOptions.value);
            }
        }
        m126353y0(this.f102930z, questionnaire.title, et4.m117971a("-", arrayList));
        m126329Y();
        m126319B0();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m126333e0(View view) {
        m126329Y();
        dismiss();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m126334f0(View view) {
        m126352x0();
        m126328X();
        dismiss();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m126335g0(View view) {
        m126328X();
        dismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m126336h0(NextQuestionnaire nextQuestionnaire, View view, NextQuestionnaireOptions nextQuestionnaireOptions, int i) {
        boolean z = true;
        nextQuestionnaireOptions.checked = !nextQuestionnaireOptions.checked;
        this.f102905A.notifyItemChanged(i);
        Iterator<NextQuestionnaireOptions> it = nextQuestionnaire.options.iterator();
        while (it.hasNext()) {
            if (it.next().checked) {
                m126325H0(z);
            }
        }
        z = false;
        m126325H0(z);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m126337i0(NextQuestionnaire nextQuestionnaire, View view) {
        ArrayList arrayList = new ArrayList();
        for (NextQuestionnaireOptions nextQuestionnaireOptions : nextQuestionnaire.options) {
            if (nextQuestionnaireOptions.checked) {
                arrayList.add(nextQuestionnaireOptions.value);
            }
        }
        m126353y0(this.f102930z, nextQuestionnaire.title, et4.m117971a("-", arrayList));
        m126329Y();
        m126319B0();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m126338j0(View view) {
        m126329Y();
        dismiss();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m126339k0(View view) {
        m126352x0();
        m126328X();
        dismiss();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m126340l0(View view) {
        m126328X();
        dismiss();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m126342n0(Questionnaire questionnaire) {
        m126321D0(questionnaire.options.get(0).nextPage);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m126343o0(final Questionnaire questionnaire, View view) {
        this.f102916l.setBackgroundResource(x2c0.f190725xq);
        this.f102918n.setTextColor(Color.parseColor("#FE7E1D"));
        m126351w0(this.f102930z, questionnaire.title, questionnaire.options.get(0).value);
        m126327W();
        qib0.f154691G.m102331L0(this.f102917m, questionnaire.options.get(0).imageSelected);
        if (questionnaire.options.get(0).nextPage == null || TextUtils.isEmpty(questionnaire.options.get(0).nextPage.title)) {
            e51.m114743H(this.f102929y, new Runnable() { // from class: l.qhj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f154471a.m126341m0();
                }
            }, 500L);
        } else {
            e51.m114743H(this.f102929y, new Runnable() { // from class: l.rhj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159369a.m126342n0(questionnaire);
                }
            }, 500L);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m126314a0();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.uhj0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zch0.m218024a().m218033j(false, "UXQuestionnaireBottomSheetDialog");
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.yhj0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                zch0.m218024a().m218033j(true, "UXQuestionnaireBottomSheetDialog");
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m126345q0(Questionnaire questionnaire) {
        m126321D0(questionnaire.options.get(1).nextPage);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m126346r0(final Questionnaire questionnaire, View view) {
        this.f102919o.setBackgroundResource(x2c0.f190725xq);
        this.f102921q.setTextColor(Color.parseColor("#FE7E1D"));
        m126351w0(this.f102930z, questionnaire.title, questionnaire.options.get(1).value);
        m126327W();
        qib0.f154691G.m102331L0(this.f102920p, questionnaire.options.get(1).imageSelected);
        if (questionnaire.options.get(1).nextPage == null || TextUtils.isEmpty(questionnaire.options.get(1).nextPage.title)) {
            e51.m114743H(this.f102929y, new Runnable() { // from class: l.mhj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133824a.m126344p0();
                }
            }, 500L);
        } else {
            e51.m114743H(this.f102929y, new Runnable() { // from class: l.nhj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f138998a.m126345q0(questionnaire);
                }
            }, 500L);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m126313Z();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m126348t0(Questionnaire questionnaire) {
        m126321D0(questionnaire.options.get(2).nextPage);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m126349u0(final Questionnaire questionnaire, View view) {
        this.f102922r.setBackgroundResource(x2c0.f190725xq);
        this.f102924t.setTextColor(Color.parseColor("#FE7E1D"));
        m126351w0(this.f102930z, questionnaire.title, questionnaire.options.get(2).value);
        m126327W();
        qib0.f154691G.m102331L0(this.f102923s, questionnaire.options.get(2).imageSelected);
        if (questionnaire.options.get(2).nextPage == null || TextUtils.isEmpty(questionnaire.options.get(2).nextPage.title)) {
            e51.m114743H(this.f102929y, new Runnable() { // from class: l.khj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123172a.m126347s0();
                }
            }, 500L);
        } else {
            e51.m114743H(this.f102929y, new Runnable() { // from class: l.lhj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f128113a.m126348t0(questionnaire);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m126350v0(View view) {
        m126327W();
        dismiss();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m126351w0(String str, String str2, String str3) {
        zvf0.m220399u("e_experience_chose_btn", "p_action_survey_experience", vwb.m200311Y("paper_number", str), vwb.m200311Y("experience_question_number", str2), vwb.m200311Y("experience_question_answer", str3));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m126352x0() {
        zvf0.m220396r("e_continue_btn", "p_action_survey_feedback");
    }

    /* JADX INFO: renamed from: y0 */
    public final void m126353y0(String str, String str2, String str3) {
        zvf0.m220399u("e_question_chose_btn", "p_action_survey_question", vwb.m200311Y("paper_number", str), vwb.m200311Y("experience_question_number", str2), vwb.m200311Y("experience_question_answer", str3));
    }

    /* JADX INFO: renamed from: z0 */
    public void m126354z0(Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        this.f102930z = "P1";
        ArrayList arrayList = new ArrayList();
        Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().value);
        }
        this.f102907C.m109040p(vwb.m200311Y("paper_number", this.f102930z), vwb.m200311Y("experience_question_number", questionnaire.title), vwb.m200311Y("action_survey_answer_list", et4.m117971a("-", arrayList)));
        this.f102907C.m109033i();
        this.f102907C.m109036l();
        show();
        this.f102912h.setImageResource(x2c0.f190693wq);
        m126323F0(questionnaire);
    }

    /* JADX INFO: renamed from: l.gij0$a */
    public class C17085a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f102931a;

        public C17085a(BottomSheetBehavior bottomSheetBehavior) {
            this.f102931a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f102931a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                gij0.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

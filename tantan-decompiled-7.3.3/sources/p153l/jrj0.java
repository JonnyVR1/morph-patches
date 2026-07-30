package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.NextQuestionnaire;
import com.p051p1.mobile.putong.core.data.NextQuestionnaireOptions;
import com.p051p1.mobile.putong.core.data.Questionnaire;
import com.p051p1.mobile.putong.core.data.QuestionnaireOptions;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes2.dex */
public class jrj0 extends pej0 {

    /* JADX INFO: renamed from: A */
    public ir40 f122362A;

    /* JADX INFO: renamed from: B */
    public xwb0 f122363B;

    /* JADX INFO: renamed from: C */
    public l4g0 f122364C;

    /* JADX INFO: renamed from: D */
    public l4g0 f122365D;

    /* JADX INFO: renamed from: E */
    public l4g0 f122366E;

    /* JADX INFO: renamed from: f */
    public VLinear f122367f;

    /* JADX INFO: renamed from: g */
    public VImage f122368g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f122369h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f122370i;

    /* JADX INFO: renamed from: j */
    public VText f122371j;

    /* JADX INFO: renamed from: k */
    public VLinear f122372k;

    /* JADX INFO: renamed from: l */
    public VLinear f122373l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f122374m;

    /* JADX INFO: renamed from: n */
    public VText f122375n;

    /* JADX INFO: renamed from: o */
    public VLinear f122376o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f122377p;

    /* JADX INFO: renamed from: q */
    public VText f122378q;

    /* JADX INFO: renamed from: r */
    public VLinear f122379r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f122380s;

    /* JADX INFO: renamed from: t */
    public VText f122381t;

    /* JADX INFO: renamed from: u */
    public VLinear f122382u;

    /* JADX INFO: renamed from: v */
    public RecyclerView f122383v;

    /* JADX INFO: renamed from: w */
    public VText_Bold f122384w;

    /* JADX INFO: renamed from: x */
    public VText_Bold f122385x;

    /* JADX INFO: renamed from: y */
    public final Act f122386y;

    /* JADX INFO: renamed from: z */
    public String f122387z;

    public jrj0(Act act) {
        super(act, agc0.f71117c);
        this.f122364C = new l4g0("p_action_survey_experience", jrj0.class.getName());
        this.f122365D = new l4g0("p_action_survey_question", jrj0.class.getName());
        this.f122366E = new l4g0("p_action_survey_feedback", jrj0.class.getName());
        setCancelable(false);
        this.f122386y = act;
    }

    /* JADX INFO: renamed from: Z */
    private void m146772Z() {
        Window window = getWindow();
        this.f122367f.post(new Runnable() { // from class: l.mqj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f138071a.m146789b0();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m82486a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p);
            frameLayout.setBackgroundResource(tbc0.f172878a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C18020a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: a0 */
    private void m146773a0() {
        setContentView(m146785V(LayoutInflater.from(this.f122386y), null));
        this.f122375n.setTypeface(Typeface.defaultFromStyle(1));
        this.f122378q.setTypeface(Typeface.defaultFromStyle(1));
        this.f122381t.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: A0 */
    public void m146777A0(final Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        this.f122387z = "P1";
        ArrayList arrayList = new ArrayList();
        Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().value);
        }
        this.f122365D.m152781p(jyb.m147494Y("paper_number", this.f122387z), jyb.m147494Y("experience_question_number", questionnaire.title), jyb.m147494Y("action_survey_answer_list", du4.m118067a("-", arrayList)));
        this.f122365D.m152774i();
        this.f122365D.m152777l();
        show();
        this.f122369h.setImageResource(dbc0.f87163kr);
        if (!TextUtils.isEmpty(questionnaire.title)) {
            this.f122370i.setText(questionnaire.title);
        }
        if (!TextUtils.isEmpty(questionnaire.description)) {
            this.f122371j.setText(questionnaire.description);
        }
        bnl0.m105524M(this.f122372k, false);
        bnl0.m105524M(this.f122382u, true);
        bnl0.m105524M(this.f122385x, false);
        this.f122363B = new xwb0(this.f122386y, questionnaire.options);
        this.f122383v.setLayoutManager(new LinearLayoutManager(this.f122386y));
        this.f122383v.setAdapter(this.f122363B);
        this.f122363B.notifyDataSetChanged();
        m146784H0(false);
        this.f122363B.m213349D(new xwb0.InterfaceC21462b() { // from class: l.crj0
            @Override // p153l.xwb0.InterfaceC21462b
            /* JADX INFO: renamed from: a */
            public final void mo112082a(View view, QuestionnaireOptions questionnaireOptions, int i) {
                this.f83334a.m146790c0(questionnaire, view, questionnaireOptions, i);
            }
        });
        bnl0.m105509E0(this.f122384w, new View.OnClickListener() { // from class: l.drj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90394a.m146791d0(questionnaire, view);
            }
        });
        bnl0.m105509E0(this.f122368g, new View.OnClickListener() { // from class: l.erj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95479a.m146792e0(view);
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    public final void m146778B0() {
        m146783G0();
        this.f122369h.setImageResource(dbc0.f87130jr);
        this.f122370i.setText("反馈已收到！");
        this.f122371j.setText("我们将尽快处理你的反馈和建议。如有任何体验问题，请通过我的客服发起咨询。");
        boolean zEquals = TextUtils.equals(this.f122387z, "P1");
        VText_Bold vText_Bold = this.f122385x;
        if (zEquals) {
            vText_Bold.setText("继续划卡");
        } else {
            vText_Bold.setText("知道了");
        }
        bnl0.m105524M(this.f122372k, false);
        bnl0.m105524M(this.f122382u, false);
        bnl0.m105524M(this.f122385x, true);
        bnl0.m105509E0(this.f122385x, new View.OnClickListener() { // from class: l.rqj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164499a.m146793f0(view);
            }
        });
        bnl0.m105509E0(this.f122368g, new View.OnClickListener() { // from class: l.sqj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170180a.m146794g0(view);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public void m146779C0(Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        this.f122387z = "P2";
        ArrayList arrayList = new ArrayList();
        Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().value);
        }
        this.f122364C.m152781p(jyb.m147494Y("paper_number", "p2"), jyb.m147494Y("experience_question_number", questionnaire.title), jyb.m147494Y("action_survey_answer_list", du4.m118067a("-", arrayList)));
        this.f122364C.m152774i();
        this.f122364C.m152777l();
        show();
        this.f122369h.setImageResource(dbc0.f87229mr);
        m146782F0(questionnaire);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m146780D0(final NextQuestionnaire nextQuestionnaire) {
        ArrayList arrayList = new ArrayList();
        Iterator<NextQuestionnaireOptions> it = nextQuestionnaire.options.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().value);
        }
        this.f122365D.m152781p(jyb.m147494Y("paper_number", this.f122387z), jyb.m147494Y("experience_question_number", nextQuestionnaire.title), jyb.m147494Y("action_survey_answer_list", du4.m118067a("-", arrayList)));
        this.f122365D.m152774i();
        this.f122365D.m152777l();
        if (!TextUtils.isEmpty(nextQuestionnaire.title)) {
            this.f122370i.setText(nextQuestionnaire.title);
        }
        if (!TextUtils.isEmpty(nextQuestionnaire.description)) {
            this.f122371j.setText(nextQuestionnaire.description);
        }
        bnl0.m105524M(this.f122372k, false);
        bnl0.m105524M(this.f122382u, true);
        bnl0.m105524M(this.f122385x, false);
        this.f122362A = new ir40(this.f122386y, nextQuestionnaire.options);
        this.f122383v.setLayoutManager(new LinearLayoutManager(this.f122386y));
        this.f122383v.setAdapter(this.f122362A);
        this.f122362A.notifyDataSetChanged();
        m146784H0(false);
        this.f122362A.m141771D(new ir40.InterfaceC17782b() { // from class: l.yqj0
            @Override // p153l.ir40.InterfaceC17782b
            /* JADX INFO: renamed from: a */
            public final void mo141774a(View view, NextQuestionnaireOptions nextQuestionnaireOptions, int i) {
                this.f201220a.m146795h0(nextQuestionnaire, view, nextQuestionnaireOptions, i);
            }
        });
        bnl0.m105509E0(this.f122384w, new View.OnClickListener() { // from class: l.zqj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205619a.m146796i0(nextQuestionnaire, view);
            }
        });
        bnl0.m105509E0(this.f122368g, new View.OnClickListener() { // from class: l.arj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72951a.m146797j0(view);
            }
        });
    }

    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m146806s0() {
        m146783G0();
        this.f122369h.setImageResource(dbc0.f87130jr);
        this.f122370i.setText("感谢您的支持！");
        this.f122371j.setText("探探将继续为你推荐更适合的对象，如有任何体验问题，请随时反馈。");
        boolean zEquals = TextUtils.equals(this.f122387z, "P1");
        VText_Bold vText_Bold = this.f122385x;
        if (zEquals) {
            vText_Bold.setText("继续划卡");
        } else {
            vText_Bold.setText("知道了");
        }
        bnl0.m105524M(this.f122372k, false);
        bnl0.m105524M(this.f122382u, false);
        bnl0.m105524M(this.f122385x, true);
        bnl0.m105509E0(this.f122385x, new View.OnClickListener() { // from class: l.vqj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185355a.m146798k0(view);
            }
        });
        bnl0.m105509E0(this.f122368g, new View.OnClickListener() { // from class: l.wqj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190413a.m146799l0(view);
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    public final void m146782F0(final Questionnaire questionnaire) {
        if (!TextUtils.isEmpty(questionnaire.title)) {
            this.f122370i.setText(questionnaire.title);
        }
        if (!TextUtils.isEmpty(questionnaire.description)) {
            this.f122371j.setText(questionnaire.description);
        }
        bnl0.m105524M(this.f122372k, true);
        bnl0.m105524M(this.f122382u, false);
        bnl0.m105524M(this.f122385x, false);
        uqb0.f180374G.m127115L0(this.f122374m, questionnaire.options.get(0).image);
        uqb0.f180374G.m127115L0(this.f122377p, questionnaire.options.get(1).image);
        uqb0.f180374G.m127115L0(this.f122380s, questionnaire.options.get(2).image);
        uqb0.f180374G.m127160x0(questionnaire.options.get(0).imageSelected);
        uqb0.f180374G.m127160x0(questionnaire.options.get(1).imageSelected);
        uqb0.f180374G.m127160x0(questionnaire.options.get(2).imageSelected);
        this.f122375n.setText(questionnaire.options.get(0).value);
        this.f122378q.setText(questionnaire.options.get(1).value);
        this.f122381t.setText(questionnaire.options.get(2).value);
        bnl0.m105509E0(this.f122373l, new View.OnClickListener() { // from class: l.frj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100431a.m146802o0(questionnaire, view);
            }
        });
        bnl0.m105509E0(this.f122376o, new View.OnClickListener() { // from class: l.grj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106058a.m146805r0(questionnaire, view);
            }
        });
        bnl0.m105509E0(this.f122379r, new View.OnClickListener() { // from class: l.hrj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111346a.m146808u0(questionnaire, view);
            }
        });
        bnl0.m105509E0(this.f122368g, new View.OnClickListener() { // from class: l.irj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116574a.m146809v0(view);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final void m146783G0() {
        this.f122366E.m152774i();
        this.f122366E.m152777l();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m146784H0(boolean z) {
        VText_Bold vText_Bold = this.f122384w;
        if (z) {
            vText_Bold.setBackgroundResource(dbc0.f86493Q4);
        } else {
            vText_Bold.setBackgroundResource(dbc0.f86525R4);
        }
        this.f122384w.setEnabled(z);
    }

    /* JADX INFO: renamed from: V */
    public View m146785V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return krj0.m151094b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W */
    public final void m146786W() {
        this.f122364C.m152776k();
        this.f122364C.m152775j();
    }

    /* JADX INFO: renamed from: X */
    public final void m146787X() {
        this.f122366E.m152776k();
        this.f122366E.m152775j();
    }

    /* JADX INFO: renamed from: Y */
    public final void m146788Y() {
        this.f122364C.m152776k();
        this.f122364C.m152775j();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m146789b0() {
        getBehavior().setPeekHeight(this.f122367f.getHeight());
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m146790c0(Questionnaire questionnaire, View view, QuestionnaireOptions questionnaireOptions, int i) {
        boolean z = true;
        questionnaireOptions.checked = !questionnaireOptions.checked;
        this.f122363B.notifyItemChanged(i);
        Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
        while (it.hasNext()) {
            if (it.next().checked) {
                m146784H0(z);
            }
        }
        z = false;
        m146784H0(z);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m146791d0(Questionnaire questionnaire, View view) {
        ArrayList arrayList = new ArrayList();
        for (QuestionnaireOptions questionnaireOptions : questionnaire.options) {
            if (questionnaireOptions.checked) {
                arrayList.add(questionnaireOptions.value);
            }
        }
        m146812y0(this.f122387z, questionnaire.title, du4.m118067a("-", arrayList));
        m146788Y();
        m146778B0();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m146792e0(View view) {
        m146788Y();
        dismiss();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m146793f0(View view) {
        m146811x0();
        m146787X();
        dismiss();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m146794g0(View view) {
        m146787X();
        dismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m146795h0(NextQuestionnaire nextQuestionnaire, View view, NextQuestionnaireOptions nextQuestionnaireOptions, int i) {
        boolean z = true;
        nextQuestionnaireOptions.checked = !nextQuestionnaireOptions.checked;
        this.f122362A.notifyItemChanged(i);
        Iterator<NextQuestionnaireOptions> it = nextQuestionnaire.options.iterator();
        while (it.hasNext()) {
            if (it.next().checked) {
                m146784H0(z);
            }
        }
        z = false;
        m146784H0(z);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m146796i0(NextQuestionnaire nextQuestionnaire, View view) {
        ArrayList arrayList = new ArrayList();
        for (NextQuestionnaireOptions nextQuestionnaireOptions : nextQuestionnaire.options) {
            if (nextQuestionnaireOptions.checked) {
                arrayList.add(nextQuestionnaireOptions.value);
            }
        }
        m146812y0(this.f122387z, nextQuestionnaire.title, du4.m118067a("-", arrayList));
        m146788Y();
        m146778B0();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m146797j0(View view) {
        m146788Y();
        dismiss();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m146798k0(View view) {
        m146811x0();
        m146787X();
        dismiss();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m146799l0(View view) {
        m146787X();
        dismiss();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m146801n0(Questionnaire questionnaire) {
        m146780D0(questionnaire.options.get(0).nextPage);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m146802o0(final Questionnaire questionnaire, View view) {
        this.f122373l.setBackgroundResource(dbc0.f87196lr);
        this.f122375n.setTextColor(Color.parseColor("#FE7E1D"));
        m146810w0(this.f122387z, questionnaire.title, questionnaire.options.get(0).value);
        m146786W();
        uqb0.f180374G.m127115L0(this.f122374m, questionnaire.options.get(0).imageSelected);
        if (questionnaire.options.get(0).nextPage == null || TextUtils.isEmpty(questionnaire.options.get(0).nextPage.title)) {
            l51.m152888H(this.f122386y, new Runnable() { // from class: l.tqj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f175750a.m146800m0();
                }
            }, 500L);
        } else {
            l51.m152888H(this.f122386y, new Runnable() { // from class: l.uqj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180478a.m146801n0(questionnaire);
                }
            }, 500L);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m146773a0();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.xqj0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                hlh0.m135741a().m135750j(false, "UXQuestionnaireBottomSheetDialog");
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.brj0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                hlh0.m135741a().m135750j(true, "UXQuestionnaireBottomSheetDialog");
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m146804q0(Questionnaire questionnaire) {
        m146780D0(questionnaire.options.get(1).nextPage);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m146805r0(final Questionnaire questionnaire, View view) {
        this.f122376o.setBackgroundResource(dbc0.f87196lr);
        this.f122378q.setTextColor(Color.parseColor("#FE7E1D"));
        m146810w0(this.f122387z, questionnaire.title, questionnaire.options.get(1).value);
        m146786W();
        uqb0.f180374G.m127115L0(this.f122377p, questionnaire.options.get(1).imageSelected);
        if (questionnaire.options.get(1).nextPage == null || TextUtils.isEmpty(questionnaire.options.get(1).nextPage.title)) {
            l51.m152888H(this.f122386y, new Runnable() { // from class: l.pqj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f153678a.m146803p0();
                }
            }, 500L);
        } else {
            l51.m152888H(this.f122386y, new Runnable() { // from class: l.qqj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159014a.m146804q0(questionnaire);
                }
            }, 500L);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m146772Z();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m146807t0(Questionnaire questionnaire) {
        m146780D0(questionnaire.options.get(2).nextPage);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m146808u0(final Questionnaire questionnaire, View view) {
        this.f122379r.setBackgroundResource(dbc0.f87196lr);
        this.f122381t.setTextColor(Color.parseColor("#FE7E1D"));
        m146810w0(this.f122387z, questionnaire.title, questionnaire.options.get(2).value);
        m146786W();
        uqb0.f180374G.m127115L0(this.f122380s, questionnaire.options.get(2).imageSelected);
        if (questionnaire.options.get(2).nextPage == null || TextUtils.isEmpty(questionnaire.options.get(2).nextPage.title)) {
            l51.m152888H(this.f122386y, new Runnable() { // from class: l.nqj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f143236a.m146806s0();
                }
            }, 500L);
        } else {
            l51.m152888H(this.f122386y, new Runnable() { // from class: l.oqj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f148598a.m146807t0(questionnaire);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m146809v0(View view) {
        m146786W();
        dismiss();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m146810w0(String str, String str2, String str3) {
        i4g0.m138523u("e_experience_chose_btn", "p_action_survey_experience", jyb.m147494Y("paper_number", str), jyb.m147494Y("experience_question_number", str2), jyb.m147494Y("experience_question_answer", str3));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m146811x0() {
        i4g0.m138520r("e_continue_btn", "p_action_survey_feedback");
    }

    /* JADX INFO: renamed from: y0 */
    public final void m146812y0(String str, String str2, String str3) {
        i4g0.m138523u("e_question_chose_btn", "p_action_survey_question", jyb.m147494Y("paper_number", str), jyb.m147494Y("experience_question_number", str2), jyb.m147494Y("experience_question_answer", str3));
    }

    /* JADX INFO: renamed from: z0 */
    public void m146813z0(Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        this.f122387z = "P1";
        ArrayList arrayList = new ArrayList();
        Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().value);
        }
        this.f122364C.m152781p(jyb.m147494Y("paper_number", this.f122387z), jyb.m147494Y("experience_question_number", questionnaire.title), jyb.m147494Y("action_survey_answer_list", du4.m118067a("-", arrayList)));
        this.f122364C.m152774i();
        this.f122364C.m152777l();
        show();
        this.f122369h.setImageResource(dbc0.f87163kr);
        m146782F0(questionnaire);
    }

    /* JADX INFO: renamed from: l.jrj0$a */
    public class C18020a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f122388a;

        public C18020a(BottomSheetBehavior bottomSheetBehavior) {
            this.f122388a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f122388a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                jrj0.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}

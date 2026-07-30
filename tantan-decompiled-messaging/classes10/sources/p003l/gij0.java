package p003l;

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
import com.p000p1.mobile.putong.core.data.CoreStaticData;
import com.p000p1.mobile.putong.core.data.NextQuestionnaire;
import com.p000p1.mobile.putong.core.data.NextQuestionnaireOptions;
import com.p000p1.mobile.putong.core.data.Questionnaire;
import com.p000p1.mobile.putong.core.data.QuestionnaireOptions;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import l.cwf0;
import l.e51;
import l.et4;
import l.i5c0;
import l.j760;
import l.l5j0;
import l.n3c0;
import l.qib0;
import l.v7c0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zch0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gij0 extends l5j0 {

    /* JADX INFO: renamed from: A */
    public ui40 f4631A;

    /* JADX INFO: renamed from: B */
    public tob0 f4632B;

    /* JADX INFO: renamed from: C */
    public cwf0 f4633C;

    /* JADX INFO: renamed from: D */
    public cwf0 f4634D;

    /* JADX INFO: renamed from: E */
    public cwf0 f4635E;

    /* JADX INFO: renamed from: f */
    public VLinear f4636f;

    /* JADX INFO: renamed from: g */
    public VImage f4637g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f4638h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f4639i;

    /* JADX INFO: renamed from: j */
    public VText f4640j;

    /* JADX INFO: renamed from: k */
    public VLinear f4641k;

    /* JADX INFO: renamed from: l */
    public VLinear f4642l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f4643m;

    /* JADX INFO: renamed from: n */
    public VText f4644n;

    /* JADX INFO: renamed from: o */
    public VLinear f4645o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f4646p;

    /* JADX INFO: renamed from: q */
    public VText f4647q;

    /* JADX INFO: renamed from: r */
    public VLinear f4648r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f4649s;

    /* JADX INFO: renamed from: t */
    public VText f4650t;

    /* JADX INFO: renamed from: u */
    public VLinear f4651u;

    /* JADX INFO: renamed from: v */
    public RecyclerView f4652v;

    /* JADX INFO: renamed from: w */
    public VText_Bold f4653w;

    /* JADX INFO: renamed from: x */
    public VText_Bold f4654x;

    /* JADX INFO: renamed from: y */
    public final Act f4655y;

    /* JADX INFO: renamed from: z */
    public String f4656z;

    public gij0(Act act) {
        super(act, v7c0.c);
        this.f4633C = new cwf0("p_action_survey_experience", gij0.class.getName());
        this.f4634D = new cwf0("p_action_survey_question", gij0.class.getName());
        this.f4635E = new cwf0("p_action_survey_feedback", gij0.class.getName());
        setCancelable(false);
        this.f4655y = act;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    private void m6670Z() {
        Window window = getWindow();
        this.f4636f.post(new Runnable() { // from class: l.jhj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5327a.m6687b0();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p);
            frameLayout.setBackgroundResource(n3c0.a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C3335a(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: a0 */
    private void m6671a0() {
        setContentView(m6683V(LayoutInflater.from(this.f4655y), null));
        this.f4644n.setTypeface(Typeface.defaultFromStyle(1));
        this.f4647q.setTypeface(Typeface.defaultFromStyle(1));
        this.f4650t.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: A0 */
    public void m6675A0(final Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        this.f4656z = "P1";
        ArrayList arrayList = new ArrayList();
        Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().value);
        }
        this.f4634D.p(new j760[]{vwb.Y("paper_number", this.f4656z), vwb.Y("experience_question_number", questionnaire.title), vwb.Y("action_survey_answer_list", et4.a(CoreStaticData.FriendPurposeDataType.HOUSE_RIEGION_NONE_STR, arrayList))});
        this.f4634D.i();
        this.f4634D.l();
        show();
        this.f4638h.setImageResource(x2c0.wq);
        if (!TextUtils.isEmpty(questionnaire.title)) {
            this.f4639i.setText(questionnaire.title);
        }
        if (!TextUtils.isEmpty(questionnaire.description)) {
            this.f4640j.setText(questionnaire.description);
        }
        xdl0.M(this.f4641k, false);
        xdl0.M(this.f4651u, true);
        xdl0.M(this.f4654x, false);
        this.f4632B = new tob0(this.f4655y, questionnaire.options);
        this.f4652v.setLayoutManager(new LinearLayoutManager(this.f4655y));
        this.f4652v.setAdapter(this.f4632B);
        this.f4632B.notifyDataSetChanged();
        m6682H0(false);
        this.f4632B.m9608D(new tob0.InterfaceC3434b() { // from class: l.zhj0
            @Override // p003l.tob0.InterfaceC3434b
            /* JADX INFO: renamed from: a */
            public final void mo9610a(View view, QuestionnaireOptions questionnaireOptions, int i) {
                this.f9255a.m6688c0(questionnaire, view, questionnaireOptions, i);
            }
        });
        xdl0.E0(this.f4653w, new View.OnClickListener() { // from class: l.aij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2788a.m6689d0(questionnaire, view);
            }
        });
        xdl0.E0(this.f4637g, new View.OnClickListener() { // from class: l.bij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3383a.m6690e0(view);
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    public final void m6676B0() {
        m6681G0();
        this.f4638h.setImageResource(x2c0.vq);
        this.f4639i.setText("反馈已收到！");
        this.f4640j.setText("我们将尽快处理你的反馈和建议。如有任何体验问题，请通过我的客服发起咨询。");
        boolean zEquals = TextUtils.equals(this.f4656z, "P1");
        VText_Bold vText_Bold = this.f4654x;
        if (zEquals) {
            vText_Bold.setText("继续划卡");
        } else {
            vText_Bold.setText("知道了");
        }
        xdl0.M(this.f4641k, false);
        xdl0.M(this.f4651u, false);
        xdl0.M(this.f4654x, true);
        xdl0.E0(this.f4654x, new View.OnClickListener() { // from class: l.ohj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6664a.m6691f0(view);
            }
        });
        xdl0.E0(this.f4637g, new View.OnClickListener() { // from class: l.phj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6857a.m6692g0(view);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public void m6677C0(Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        this.f4656z = "P2";
        ArrayList arrayList = new ArrayList();
        Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().value);
        }
        this.f4633C.p(new j760[]{vwb.Y("paper_number", "p2"), vwb.Y("experience_question_number", questionnaire.title), vwb.Y("action_survey_answer_list", et4.a(CoreStaticData.FriendPurposeDataType.HOUSE_RIEGION_NONE_STR, arrayList))});
        this.f4633C.i();
        this.f4633C.l();
        show();
        this.f4638h.setImageResource(x2c0.yq);
        m6680F0(questionnaire);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m6678D0(final NextQuestionnaire nextQuestionnaire) {
        ArrayList arrayList = new ArrayList();
        Iterator<NextQuestionnaireOptions> it = nextQuestionnaire.options.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().value);
        }
        this.f4634D.p(new j760[]{vwb.Y("paper_number", this.f4656z), vwb.Y("experience_question_number", nextQuestionnaire.title), vwb.Y("action_survey_answer_list", et4.a(CoreStaticData.FriendPurposeDataType.HOUSE_RIEGION_NONE_STR, arrayList))});
        this.f4634D.i();
        this.f4634D.l();
        if (!TextUtils.isEmpty(nextQuestionnaire.title)) {
            this.f4639i.setText(nextQuestionnaire.title);
        }
        if (!TextUtils.isEmpty(nextQuestionnaire.description)) {
            this.f4640j.setText(nextQuestionnaire.description);
        }
        xdl0.M(this.f4641k, false);
        xdl0.M(this.f4651u, true);
        xdl0.M(this.f4654x, false);
        this.f4631A = new ui40(this.f4655y, nextQuestionnaire.options);
        this.f4652v.setLayoutManager(new LinearLayoutManager(this.f4655y));
        this.f4652v.setAdapter(this.f4631A);
        this.f4631A.notifyDataSetChanged();
        m6682H0(false);
        this.f4631A.m9732D(new ui40.InterfaceC3443b() { // from class: l.vhj0
            @Override // p003l.ui40.InterfaceC3443b
            /* JADX INFO: renamed from: a */
            public final void mo9735a(View view, NextQuestionnaireOptions nextQuestionnaireOptions, int i) {
                this.f7984a.m6693h0(nextQuestionnaire, view, nextQuestionnaireOptions, i);
            }
        });
        xdl0.E0(this.f4653w, new View.OnClickListener() { // from class: l.whj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8189a.m6694i0(nextQuestionnaire, view);
            }
        });
        xdl0.E0(this.f4637g, new View.OnClickListener() { // from class: l.xhj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8462a.m6695j0(view);
            }
        });
    }

    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m6704s0() {
        m6681G0();
        this.f4638h.setImageResource(x2c0.vq);
        this.f4639i.setText("感谢您的支持！");
        this.f4640j.setText("探探将继续为你推荐更适合的对象，如有任何体验问题，请随时反馈。");
        boolean zEquals = TextUtils.equals(this.f4656z, "P1");
        VText_Bold vText_Bold = this.f4654x;
        if (zEquals) {
            vText_Bold.setText("继续划卡");
        } else {
            vText_Bold.setText("知道了");
        }
        xdl0.M(this.f4641k, false);
        xdl0.M(this.f4651u, false);
        xdl0.M(this.f4654x, true);
        xdl0.E0(this.f4654x, new View.OnClickListener() { // from class: l.shj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7368a.m6696k0(view);
            }
        });
        xdl0.E0(this.f4637g, new View.OnClickListener() { // from class: l.thj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7565a.m6697l0(view);
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    public final void m6680F0(final Questionnaire questionnaire) {
        if (!TextUtils.isEmpty(questionnaire.title)) {
            this.f4639i.setText(questionnaire.title);
        }
        if (!TextUtils.isEmpty(questionnaire.description)) {
            this.f4640j.setText(questionnaire.description);
        }
        xdl0.M(this.f4641k, true);
        xdl0.M(this.f4651u, false);
        xdl0.M(this.f4654x, false);
        qib0.G.L0(this.f4643m, questionnaire.options.get(0).image);
        qib0.G.L0(this.f4646p, questionnaire.options.get(1).image);
        qib0.G.L0(this.f4649s, questionnaire.options.get(2).image);
        qib0.G.x0(questionnaire.options.get(0).imageSelected);
        qib0.G.x0(questionnaire.options.get(1).imageSelected);
        qib0.G.x0(questionnaire.options.get(2).imageSelected);
        this.f4644n.setText(questionnaire.options.get(0).value);
        this.f4647q.setText(questionnaire.options.get(1).value);
        this.f4650t.setText(questionnaire.options.get(2).value);
        xdl0.E0(this.f4642l, new View.OnClickListener() { // from class: l.cij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4040a.m6700o0(questionnaire, view);
            }
        });
        xdl0.E0(this.f4645o, new View.OnClickListener() { // from class: l.dij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4147a.m6703r0(questionnaire, view);
            }
        });
        xdl0.E0(this.f4648r, new View.OnClickListener() { // from class: l.eij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4303a.m6706u0(questionnaire, view);
            }
        });
        xdl0.E0(this.f4637g, new View.OnClickListener() { // from class: l.fij0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4441a.m6707v0(view);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final void m6681G0() {
        this.f4635E.i();
        this.f4635E.l();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m6682H0(boolean z) {
        VText_Bold vText_Bold = this.f4653w;
        if (z) {
            vText_Bold.setBackgroundResource(x2c0.P4);
        } else {
            vText_Bold.setBackgroundResource(x2c0.Q4);
        }
        this.f4653w.setEnabled(z);
    }

    /* JADX INFO: renamed from: V */
    public View m6683V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hij0.m7005b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W */
    public final void m6684W() {
        this.f4633C.k();
        this.f4633C.j();
    }

    /* JADX INFO: renamed from: X */
    public final void m6685X() {
        this.f4635E.k();
        this.f4635E.j();
    }

    /* JADX INFO: renamed from: Y */
    public final void m6686Y() {
        this.f4633C.k();
        this.f4633C.j();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m6687b0() {
        getBehavior().setPeekHeight(this.f4636f.getHeight());
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m6688c0(Questionnaire questionnaire, View view, QuestionnaireOptions questionnaireOptions, int i) {
        boolean z = true;
        questionnaireOptions.checked = !questionnaireOptions.checked;
        this.f4632B.notifyItemChanged(i);
        Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
        while (it.hasNext()) {
            if (it.next().checked) {
                m6682H0(z);
            }
        }
        z = false;
        m6682H0(z);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m6689d0(Questionnaire questionnaire, View view) {
        ArrayList arrayList = new ArrayList();
        for (QuestionnaireOptions questionnaireOptions : questionnaire.options) {
            if (questionnaireOptions.checked) {
                arrayList.add(questionnaireOptions.value);
            }
        }
        m6710y0(this.f4656z, questionnaire.title, et4.a(CoreStaticData.FriendPurposeDataType.HOUSE_RIEGION_NONE_STR, arrayList));
        m6686Y();
        m6676B0();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m6690e0(View view) {
        m6686Y();
        dismiss();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m6691f0(View view) {
        m6709x0();
        m6685X();
        dismiss();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m6692g0(View view) {
        m6685X();
        dismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m6693h0(NextQuestionnaire nextQuestionnaire, View view, NextQuestionnaireOptions nextQuestionnaireOptions, int i) {
        boolean z = true;
        nextQuestionnaireOptions.checked = !nextQuestionnaireOptions.checked;
        this.f4631A.notifyItemChanged(i);
        Iterator<NextQuestionnaireOptions> it = nextQuestionnaire.options.iterator();
        while (it.hasNext()) {
            if (it.next().checked) {
                m6682H0(z);
            }
        }
        z = false;
        m6682H0(z);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m6694i0(NextQuestionnaire nextQuestionnaire, View view) {
        ArrayList arrayList = new ArrayList();
        for (NextQuestionnaireOptions nextQuestionnaireOptions : nextQuestionnaire.options) {
            if (nextQuestionnaireOptions.checked) {
                arrayList.add(nextQuestionnaireOptions.value);
            }
        }
        m6710y0(this.f4656z, nextQuestionnaire.title, et4.a(CoreStaticData.FriendPurposeDataType.HOUSE_RIEGION_NONE_STR, arrayList));
        m6686Y();
        m6676B0();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m6695j0(View view) {
        m6686Y();
        dismiss();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m6696k0(View view) {
        m6709x0();
        m6685X();
        dismiss();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m6697l0(View view) {
        m6685X();
        dismiss();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m6699n0(Questionnaire questionnaire) {
        m6678D0(questionnaire.options.get(0).nextPage);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m6700o0(final Questionnaire questionnaire, View view) {
        this.f4642l.setBackgroundResource(x2c0.xq);
        this.f4644n.setTextColor(Color.parseColor("#FE7E1D"));
        m6708w0(this.f4656z, questionnaire.title, questionnaire.options.get(0).value);
        m6684W();
        qib0.G.L0(this.f4643m, questionnaire.options.get(0).imageSelected);
        if (questionnaire.options.get(0).nextPage == null || TextUtils.isEmpty(questionnaire.options.get(0).nextPage.title)) {
            e51.H(this.f4655y, new Runnable() { // from class: l.qhj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7025a.m6698m0();
                }
            }, 500L);
        } else {
            e51.H(this.f4655y, new Runnable() { // from class: l.rhj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7178a.m6699n0(questionnaire);
                }
            }, 500L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m6671a0();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.uhj0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zch0.a().j(false, "UXQuestionnaireBottomSheetDialog");
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.yhj0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                zch0.a().j(true, "UXQuestionnaireBottomSheetDialog");
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m6702q0(Questionnaire questionnaire) {
        m6678D0(questionnaire.options.get(1).nextPage);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m6703r0(final Questionnaire questionnaire, View view) {
        this.f4645o.setBackgroundResource(x2c0.xq);
        this.f4647q.setTextColor(Color.parseColor("#FE7E1D"));
        m6708w0(this.f4656z, questionnaire.title, questionnaire.options.get(1).value);
        m6684W();
        qib0.G.L0(this.f4646p, questionnaire.options.get(1).imageSelected);
        if (questionnaire.options.get(1).nextPage == null || TextUtils.isEmpty(questionnaire.options.get(1).nextPage.title)) {
            e51.H(this.f4655y, new Runnable() { // from class: l.mhj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6346a.m6701p0();
                }
            }, 500L);
        } else {
            e51.H(this.f4655y, new Runnable() { // from class: l.nhj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6507a.m6702q0(questionnaire);
                }
            }, 500L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m6670Z();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m6705t0(Questionnaire questionnaire) {
        m6678D0(questionnaire.options.get(2).nextPage);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m6706u0(final Questionnaire questionnaire, View view) {
        this.f4648r.setBackgroundResource(x2c0.xq);
        this.f4650t.setTextColor(Color.parseColor("#FE7E1D"));
        m6708w0(this.f4656z, questionnaire.title, questionnaire.options.get(2).value);
        m6684W();
        qib0.G.L0(this.f4649s, questionnaire.options.get(2).imageSelected);
        if (questionnaire.options.get(2).nextPage == null || TextUtils.isEmpty(questionnaire.options.get(2).nextPage.title)) {
            e51.H(this.f4655y, new Runnable() { // from class: l.khj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5654a.m6704s0();
                }
            }, 500L);
        } else {
            e51.H(this.f4655y, new Runnable() { // from class: l.lhj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6153a.m6705t0(questionnaire);
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m6707v0(View view) {
        m6684W();
        dismiss();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m6708w0(String str, String str2, String str3) {
        zvf0.u("e_experience_chose_btn", "p_action_survey_experience", new j760[]{vwb.Y("paper_number", str), vwb.Y("experience_question_number", str2), vwb.Y("experience_question_answer", str3)});
    }

    /* JADX INFO: renamed from: x0 */
    public final void m6709x0() {
        zvf0.r("e_continue_btn", "p_action_survey_feedback");
    }

    /* JADX INFO: renamed from: y0 */
    public final void m6710y0(String str, String str2, String str3) {
        zvf0.u("e_question_chose_btn", "p_action_survey_question", new j760[]{vwb.Y("paper_number", str), vwb.Y("experience_question_number", str2), vwb.Y("experience_question_answer", str3)});
    }

    /* JADX INFO: renamed from: z0 */
    public void m6711z0(Questionnaire questionnaire) {
        if (questionnaire == null) {
            return;
        }
        this.f4656z = "P1";
        ArrayList arrayList = new ArrayList();
        Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().value);
        }
        this.f4633C.p(new j760[]{vwb.Y("paper_number", this.f4656z), vwb.Y("experience_question_number", questionnaire.title), vwb.Y("action_survey_answer_list", et4.a(CoreStaticData.FriendPurposeDataType.HOUSE_RIEGION_NONE_STR, arrayList))});
        this.f4633C.i();
        this.f4633C.l();
        show();
        this.f4638h.setImageResource(x2c0.wq);
        m6680F0(questionnaire);
    }

    /* JADX INFO: renamed from: l.gij0$a */
    public class C3335a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f4657a;

        public C3335a(BottomSheetBehavior bottomSheetBehavior) {
            this.f4657a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f4657a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                gij0.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}

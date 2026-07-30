package p149l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Options;
import com.p046p1.mobile.putong.core.data.Surveys;
import com.p046p1.mobile.putong.core.p053ui.survey.SurveyAct;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VButton;
import p147v.VEditText;
import p147v.VImage;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class r4h0 implements s7m<o4h0> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f157672a;

    /* JADX INFO: renamed from: b */
    public VText f157673b;

    /* JADX INFO: renamed from: c */
    public VText f157674c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f157675d;

    /* JADX INFO: renamed from: e */
    public VImage f157676e;

    /* JADX INFO: renamed from: f */
    public VText f157677f;

    /* JADX INFO: renamed from: g */
    public VText f157678g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f157679h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f157680i;

    /* JADX INFO: renamed from: j */
    public VEditText f157681j;

    /* JADX INFO: renamed from: k */
    public VText f157682k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f157683l;

    /* JADX INFO: renamed from: m */
    public VScroll f157684m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f157685n;

    /* JADX INFO: renamed from: o */
    public RelativeLayout f157686o;

    /* JADX INFO: renamed from: p */
    public VButton f157687p;

    /* JADX INFO: renamed from: q */
    public SurveyAct f157688q;

    /* JADX INFO: renamed from: r */
    public o4h0 f157689r;

    /* JADX INFO: renamed from: s */
    public String f157690s = "";

    /* JADX INFO: renamed from: t */
    public List<View> f157691t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public String f157692u = "";

    /* JADX INFO: renamed from: v */
    public String f157693v = "";

    /* JADX INFO: renamed from: w */
    public List<Surveys> f157694w = null;

    /* JADX INFO: renamed from: x */
    public int f157695x = 0;

    public r4h0(SurveyAct surveyAct) {
        this.f157688q = surveyAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m177791k(View view) {
        String str;
        if (this.f157687p.isEnabled()) {
            if (TextUtils.equals(this.f157690s, "surveys_finish")) {
                act().m44477e2();
                return;
            }
            if (vwb.m200296J(this.f157694w)) {
                return;
            }
            String string = "";
            if (TextUtils.equals(this.f157690s, "selection")) {
                str = "single_choice";
            } else if (TextUtils.equals(this.f157690s, "multi_selection")) {
                str = "multiple_choice";
            } else {
                str = TextUtils.equals(this.f157690s, "fill_blank") ? "question_answer" : "";
            }
            zvf0.m220399u("e_feedback_question_submit_button", "p_feedback_question_popup", vwb.m200311Y("feedback_question_type", str), vwb.m200311Y("feedback_question_num", this.f157694w.get(0).questions.get(0).index));
            this.f157693v = Converter.dateToApiTimeString(mqi0.m155944o());
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", this.f157689r.m162588m0());
                jSONObject2.put("type", "survey");
                jSONObject.put("survey", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                if (TextUtils.equals(this.f157690s, "selection") || TextUtils.equals(this.f157690s, "multi_selection")) {
                    JSONArray jSONArray = new JSONArray();
                    m177804s(jSONArray);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("choices", jSONArray);
                    jSONObject3.put("selection", jSONObject4);
                } else if (TextUtils.equals(this.f157690s, "fill_blank")) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("value", this.f157681j.getText().toString().trim());
                    jSONObject3.put("fillBlank", jSONObject5);
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("id", this.f157694w.get(0).questions.get(0).f20481id);
                jSONObject6.put("type", "survey_question");
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("id", CoreModule.m29931H().userId());
                jSONObject7.put("type", "user");
                jSONObject.put("question", jSONObject6);
                jSONObject.put(Owner.TYPE, jSONObject7);
                jSONObject.put("solution", jSONObject3);
                jSONObject.put(StudentVerRejectedReason.startTime, this.f157692u);
                jSONObject.put("endTime", this.f157693v);
                string = jSONObject.toString();
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
            this.f157689r.m162593x0(string);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f157688q;
    }

    /* JADX INFO: renamed from: c */
    public View m177792c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s4h0.m182224b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SurveyAct act() {
        return this.f157688q;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(o4h0 o4h0Var) {
        this.f157689r = o4h0Var;
    }

    /* JADX INFO: renamed from: f */
    public int m177795f() {
        return 50;
    }

    /* JADX INFO: renamed from: i */
    public final int m177796i() {
        Iterator<View> it = this.f157691t.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().isSelected()) {
                i++;
            }
        }
        return i;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m177792c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m177797j(View view) {
        for (int i = 0; i < this.f157691t.size(); i++) {
            if (TextUtils.equals(((VText) view.findViewById(u4c0.f174436qd)).getText().toString(), ((VText) this.f157691t.get(i).findViewById(u4c0.f174436qd)).getText().toString())) {
                return this.f157694w.get(0).questions.get(0).content.selection.options.get(i).exclusive;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m177798l(VText vText, List list, View view) {
        if (TextUtils.equals(this.f157690s, "selection")) {
            m177802q();
            view.setSelected(true);
            vText.setTextColor(Color.parseColor("#d74d37"));
            view.findViewById(u4c0.f174419pd).setBackgroundResource(x2c0.f189464Jp);
        } else if (TextUtils.equals(this.f157690s, "multi_selection") && (this.f157695x < ((Surveys) list.get(0)).questions.get(0).content.selection.maxChoices || m177797j(view) || (this.f157695x == ((Surveys) list.get(0)).questions.get(0).content.selection.maxChoices && view.isSelected()))) {
            view.setSelected(!view.isSelected());
            m177799m(view);
            if (view.isSelected()) {
                m177800n(m177797j(view));
            }
            this.f157695x = m177796i();
        }
        m177801p();
    }

    /* JADX INFO: renamed from: m */
    public final void m177799m(View view) {
        view.findViewById(u4c0.f174419pd).setBackgroundResource(view.isSelected() ? x2c0.f189464Jp : x2c0.f189433Ip);
        ((VText) view.findViewById(u4c0.f174436qd)).setTextColor(Color.parseColor(view.isSelected() ? "#d74d37" : "#212121"));
        xdl0.m208344M(view.findViewById(u4c0.f174402od), !view.isSelected());
        xdl0.m208344M(view.findViewById(u4c0.f174385nd), view.isSelected());
    }

    /* JADX INFO: renamed from: n */
    public final void m177800n(boolean z) {
        List<Options> list = this.f157694w.get(0).questions.get(0).content.selection.options;
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(Boolean.toString(z), Boolean.toString(list.get(i).exclusive))) {
                View view = this.f157691t.get(i);
                view.setSelected(false);
                m177799m(view);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m177801p() {
        Iterator<View> it = this.f157691t.iterator();
        while (it.hasNext()) {
            if (it.next().isSelected()) {
                this.f157687p.setEnabled(true);
                return;
            }
        }
        this.f157687p.setEnabled(false);
    }

    /* JADX INFO: renamed from: q */
    public final void m177802q() {
        for (View view : this.f157691t) {
            view.findViewById(u4c0.f174419pd).setBackgroundResource(x2c0.f189433Ip);
            ((VText) view.findViewById(u4c0.f174436qd)).setTextColor(Color.parseColor("#212121"));
            view.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m177803r() {
        this.f157674c.getPaint().setFakeBoldText(true);
        xdl0.m208329E0(this.f157687p, new View.OnClickListener() { // from class: l.q4h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152626a.m177791k(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m177804s(JSONArray jSONArray) {
        if (vwb.m200296J(this.f157694w)) {
            return;
        }
        for (int i = 0; i < this.f157691t.size(); i++) {
            if (this.f157691t.get(i).isSelected()) {
                jSONArray.put(this.f157694w.get(0).questions.get(0).content.selection.options.get(i).f20463id);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m177805u() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f157684m, "translationX", 0.0f, -xdl0.m208412y0());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f157684m, "translationX", xdl0.m208412y0(), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: v */
    public void m177806v(final List<Surveys> list) {
        this.f157694w = list;
        this.f157695x = 0;
        this.f157692u = Converter.dateToApiTimeString(mqi0.m155944o());
        this.f157685n.removeAllViews();
        this.f157691t.clear();
        xdl0.m208344M(this.f157679h, false);
        xdl0.m208344M(this.f157683l, false);
        xdl0.m208344M(this.f157675d, false);
        this.f157687p.setEnabled(false);
        if (vwb.m200296J(list) || vwb.m200296J(list.get(0).questions)) {
            this.f157690s = "surveys_finish";
            xdl0.m208344M(this.f157674c, false);
            xdl0.m208344M(this.f157673b, false);
            xdl0.m208344M(this.f157675d, true);
            this.f157687p.setEnabled(true);
            this.f157687p.setText("完成");
            return;
        }
        String str = list.get(0).questions.get(0).type;
        this.f157690s = str;
        if (TextUtils.equals(str, "fill_blank")) {
            if (!list.get(0).questions.get(0).content.fillBlank.required) {
                this.f157687p.setEnabled(true);
            }
            xdl0.m208344M(this.f157679h, true);
            this.f157673b.setText(list.get(0).questions.get(0).index + " 填空");
            this.f157674c.setText(list.get(0).questions.get(0).title);
            this.f157681j.addTextChangedListener(new C19635a(list));
            return;
        }
        if (TextUtils.equals(this.f157690s, "selection") || TextUtils.equals(this.f157690s, "multi_selection")) {
            VText vText = this.f157673b;
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(0).questions.get(0).index);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(TextUtils.equals(this.f157690s, "selection") ? "单选" : "多选");
            vText.setText(sb.toString());
            this.f157674c.setText(list.get(0).questions.get(0).title);
            xdl0.m208344M(this.f157683l, true);
            for (Options options : list.get(0).questions.get(0).content.selection.options) {
                View viewInflate = o7r.m163037a(act()).inflate(f6c0.f95932oc, (ViewGroup) null);
                final VText vText2 = (VText) viewInflate.findViewById(u4c0.f174436qd);
                VImage vImage = (VImage) viewInflate.findViewById(u4c0.f174402od);
                VImage vImage2 = (VImage) viewInflate.findViewById(u4c0.f174385nd);
                viewInflate.findViewById(u4c0.f174419pd).setMinimumHeight(t100.m186890d(62.0f));
                if (TextUtils.equals(this.f157690s, "multi_selection")) {
                    xdl0.m208344M(vImage, true);
                    xdl0.m208344M(vImage2, false);
                }
                vText2.getPaint().setFakeBoldText(true);
                vText2.setText(options.text);
                this.f157691t.add(viewInflate);
                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.p4h0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f147174a.m177798l(vText2, list, view);
                    }
                });
                this.f157685n.addView(viewInflate);
            }
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.r4h0$a */
    public class C19635a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f157696a;

        public C19635a(List list) {
            this.f157696a = list;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = 500 - editable.toString().length();
            boolean z = editable.toString().trim().length() > 0;
            r4h0.this.f157682k.setText(String.valueOf(length));
            if (((Surveys) this.f157696a.get(0)).questions.get(0).content.fillBlank.required) {
                if (length >= 500 || !z) {
                    r4h0.this.f157687p.setEnabled(false);
                } else {
                    r4h0.this.f157687p.setEnabled(true);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

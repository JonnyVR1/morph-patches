package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Options;
import com.p051p1.mobile.putong.core.data.Surveys;
import com.p051p1.mobile.putong.core.p058ui.survey.SurveyAct;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VButton;
import p151v.VEditText;
import p151v.VImage;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class zch0 implements iam<wch0> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f203761a;

    /* JADX INFO: renamed from: b */
    public VText f203762b;

    /* JADX INFO: renamed from: c */
    public VText f203763c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f203764d;

    /* JADX INFO: renamed from: e */
    public VImage f203765e;

    /* JADX INFO: renamed from: f */
    public VText f203766f;

    /* JADX INFO: renamed from: g */
    public VText f203767g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f203768h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f203769i;

    /* JADX INFO: renamed from: j */
    public VEditText f203770j;

    /* JADX INFO: renamed from: k */
    public VText f203771k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f203772l;

    /* JADX INFO: renamed from: m */
    public VScroll f203773m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f203774n;

    /* JADX INFO: renamed from: o */
    public RelativeLayout f203775o;

    /* JADX INFO: renamed from: p */
    public VButton f203776p;

    /* JADX INFO: renamed from: q */
    public SurveyAct f203777q;

    /* JADX INFO: renamed from: r */
    public wch0 f203778r;

    /* JADX INFO: renamed from: s */
    public String f203779s = "";

    /* JADX INFO: renamed from: t */
    public List<View> f203780t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public String f203781u = "";

    /* JADX INFO: renamed from: v */
    public String f203782v = "";

    /* JADX INFO: renamed from: w */
    public List<Surveys> f203783w = null;

    /* JADX INFO: renamed from: x */
    public int f203784x = 0;

    public zch0(SurveyAct surveyAct) {
        this.f203777q = surveyAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m219243k(View view) {
        String str;
        if (this.f203776p.isEnabled()) {
            if (TextUtils.equals(this.f203779s, "surveys_finish")) {
                act().m45660g2();
                return;
            }
            if (jyb.m147479J(this.f203783w)) {
                return;
            }
            String string = "";
            if (TextUtils.equals(this.f203779s, "selection")) {
                str = "single_choice";
            } else if (TextUtils.equals(this.f203779s, "multi_selection")) {
                str = "multiple_choice";
            } else {
                str = TextUtils.equals(this.f203779s, "fill_blank") ? "question_answer" : "";
            }
            i4g0.m138523u("e_feedback_question_submit_button", "p_feedback_question_popup", jyb.m147494Y("feedback_question_type", str), jyb.m147494Y("feedback_question_num", this.f203783w.get(0).questions.get(0).index));
            this.f203782v = Converter.dateToApiTimeString(pzi0.m174454o());
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", this.f203778r.m205812m0());
                jSONObject2.put("type", "survey");
                jSONObject.put("survey", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                if (TextUtils.equals(this.f203779s, "selection") || TextUtils.equals(this.f203779s, "multi_selection")) {
                    JSONArray jSONArray = new JSONArray();
                    m219256s(jSONArray);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("choices", jSONArray);
                    jSONObject3.put("selection", jSONObject4);
                } else if (TextUtils.equals(this.f203779s, "fill_blank")) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("value", this.f203770j.getText().toString().trim());
                    jSONObject3.put("fillBlank", jSONObject5);
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("id", this.f203783w.get(0).questions.get(0).f21223id);
                jSONObject6.put("type", "survey_question");
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("id", CoreModule.m30929H().userId());
                jSONObject7.put("type", "user");
                jSONObject.put("question", jSONObject6);
                jSONObject.put(Owner.TYPE, jSONObject7);
                jSONObject.put("solution", jSONObject3);
                jSONObject.put(StudentVerRejectedReason.startTime, this.f203781u);
                jSONObject.put("endTime", this.f203782v);
                string = jSONObject.toString();
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
            this.f203778r.m205817x0(string);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f203777q;
    }

    /* JADX INFO: renamed from: c */
    public View m219244c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return adh0.m97068b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SurveyAct act() {
        return this.f203777q;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(wch0 wch0Var) {
        this.f203778r = wch0Var;
    }

    /* JADX INFO: renamed from: f */
    public int m219247f() {
        return 50;
    }

    /* JADX INFO: renamed from: i */
    public final int m219248i() {
        Iterator<View> it = this.f203780t.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().isSelected()) {
                i++;
            }
        }
        return i;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m219244c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m219249j(View view) {
        for (int i = 0; i < this.f203780t.size(); i++) {
            if (TextUtils.equals(((VText) view.findViewById(adc0.f70561sd)).getText().toString(), ((VText) this.f203780t.get(i).findViewById(adc0.f70561sd)).getText().toString())) {
                return this.f203783w.get(0).questions.get(0).content.selection.options.get(i).exclusive;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m219250l(VText vText, List list, View view) {
        if (TextUtils.equals(this.f203779s, "selection")) {
            m219254q();
            view.setSelected(true);
            vText.setTextColor(Color.parseColor("#d74d37"));
            view.findViewById(adc0.f70544rd).setBackgroundResource(dbc0.f87588xq);
        } else if (TextUtils.equals(this.f203779s, "multi_selection") && (this.f203784x < ((Surveys) list.get(0)).questions.get(0).content.selection.maxChoices || m219249j(view) || (this.f203784x == ((Surveys) list.get(0)).questions.get(0).content.selection.maxChoices && view.isSelected()))) {
            view.setSelected(!view.isSelected());
            m219251m(view);
            if (view.isSelected()) {
                m219252n(m219249j(view));
            }
            this.f203784x = m219248i();
        }
        m219253p();
    }

    /* JADX INFO: renamed from: m */
    public final void m219251m(View view) {
        view.findViewById(adc0.f70544rd).setBackgroundResource(view.isSelected() ? dbc0.f87588xq : dbc0.f87556wq);
        ((VText) view.findViewById(adc0.f70561sd)).setTextColor(Color.parseColor(view.isSelected() ? "#d74d37" : "#212121"));
        bnl0.m105524M(view.findViewById(adc0.f70527qd), !view.isSelected());
        bnl0.m105524M(view.findViewById(adc0.f70510pd), view.isSelected());
    }

    /* JADX INFO: renamed from: n */
    public final void m219252n(boolean z) {
        List<Options> list = this.f203783w.get(0).questions.get(0).content.selection.options;
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(Boolean.toString(z), Boolean.toString(list.get(i).exclusive))) {
                View view = this.f203780t.get(i);
                view.setSelected(false);
                m219251m(view);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m219253p() {
        Iterator<View> it = this.f203780t.iterator();
        while (it.hasNext()) {
            if (it.next().isSelected()) {
                this.f203776p.setEnabled(true);
                return;
            }
        }
        this.f203776p.setEnabled(false);
    }

    /* JADX INFO: renamed from: q */
    public final void m219254q() {
        for (View view : this.f203780t) {
            view.findViewById(adc0.f70544rd).setBackgroundResource(dbc0.f87556wq);
            ((VText) view.findViewById(adc0.f70561sd)).setTextColor(Color.parseColor("#212121"));
            view.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m219255r() {
        this.f203763c.getPaint().setFakeBoldText(true);
        bnl0.m105509E0(this.f203776p, new View.OnClickListener() { // from class: l.ych0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198509a.m219243k(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m219256s(JSONArray jSONArray) {
        if (jyb.m147479J(this.f203783w)) {
            return;
        }
        for (int i = 0; i < this.f203780t.size(); i++) {
            if (this.f203780t.get(i).isSelected()) {
                jSONArray.put(this.f203783w.get(0).questions.get(0).content.selection.options.get(i).f21205id);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m219257u() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f203773m, "translationX", 0.0f, -bnl0.m105592y0());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f203773m, "translationX", bnl0.m105592y0(), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: v */
    public void m219258v(final List<Surveys> list) {
        this.f203783w = list;
        this.f203784x = 0;
        this.f203781u = Converter.dateToApiTimeString(pzi0.m174454o());
        this.f203774n.removeAllViews();
        this.f203780t.clear();
        bnl0.m105524M(this.f203768h, false);
        bnl0.m105524M(this.f203772l, false);
        bnl0.m105524M(this.f203764d, false);
        this.f203776p.setEnabled(false);
        if (jyb.m147479J(list) || jyb.m147479J(list.get(0).questions)) {
            this.f203779s = "surveys_finish";
            bnl0.m105524M(this.f203763c, false);
            bnl0.m105524M(this.f203762b, false);
            bnl0.m105524M(this.f203764d, true);
            this.f203776p.setEnabled(true);
            this.f203776p.setText("完成");
            return;
        }
        String str = list.get(0).questions.get(0).type;
        this.f203779s = str;
        if (TextUtils.equals(str, "fill_blank")) {
            if (!list.get(0).questions.get(0).content.fillBlank.required) {
                this.f203776p.setEnabled(true);
            }
            bnl0.m105524M(this.f203768h, true);
            this.f203762b.setText(list.get(0).questions.get(0).index + " 填空");
            this.f203763c.setText(list.get(0).questions.get(0).title);
            this.f203770j.addTextChangedListener(new C21791a(list));
            return;
        }
        if (TextUtils.equals(this.f203779s, "selection") || TextUtils.equals(this.f203779s, "multi_selection")) {
            VText vText = this.f203762b;
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(0).questions.get(0).index);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(TextUtils.equals(this.f203779s, "selection") ? "单选" : "多选");
            vText.setText(sb.toString());
            this.f203763c.setText(list.get(0).questions.get(0).title);
            bnl0.m105524M(this.f203772l, true);
            for (Options options : list.get(0).questions.get(0).content.selection.options) {
                View viewInflate = p9r.m171370a(act()).inflate(kec0.f126105vc, (ViewGroup) null);
                final VText vText2 = (VText) viewInflate.findViewById(adc0.f70561sd);
                VImage vImage = (VImage) viewInflate.findViewById(adc0.f70527qd);
                VImage vImage2 = (VImage) viewInflate.findViewById(adc0.f70510pd);
                viewInflate.findViewById(adc0.f70544rd).setMinimumHeight(qa00.m175859d(62.0f));
                if (TextUtils.equals(this.f203779s, "multi_selection")) {
                    bnl0.m105524M(vImage, true);
                    bnl0.m105524M(vImage2, false);
                }
                vText2.getPaint().setFakeBoldText(true);
                vText2.setText(options.text);
                this.f203780t.add(viewInflate);
                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.xch0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f193311a.m219250l(vText2, list, view);
                    }
                });
                this.f203774n.addView(viewInflate);
            }
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.zch0$a */
    public class C21791a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f203785a;

        public C21791a(List list) {
            this.f203785a = list;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = 500 - editable.toString().length();
            boolean z = editable.toString().trim().length() > 0;
            zch0.this.f203771k.setText(String.valueOf(length));
            if (((Surveys) this.f203785a.get(0)).questions.get(0).content.fillBlank.required) {
                if (length >= 500 || !z) {
                    zch0.this.f203776p.setEnabled(false);
                } else {
                    zch0.this.f203776p.setEnabled(true);
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

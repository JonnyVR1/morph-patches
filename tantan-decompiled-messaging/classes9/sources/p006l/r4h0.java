package p006l;

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
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.survey.SurveyAct;
import com.p1.mobile.putong.core.data.Options;
import com.p1.mobile.putong.core.data.Questions;
import com.p1.mobile.putong.core.data.Surveys;
import com.p1.mobile.putong.data.Converter;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.j760;
import l.mqi0;
import l.o7r;
import l.s4h0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v.VButton;
import v.VEditText;
import v.VImage;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class r4h0 implements s7m<o4h0> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f20311a;

    /* JADX INFO: renamed from: b */
    public VText f20312b;

    /* JADX INFO: renamed from: c */
    public VText f20313c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f20314d;

    /* JADX INFO: renamed from: e */
    public VImage f20315e;

    /* JADX INFO: renamed from: f */
    public VText f20316f;

    /* JADX INFO: renamed from: g */
    public VText f20317g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f20318h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f20319i;

    /* JADX INFO: renamed from: j */
    public VEditText f20320j;

    /* JADX INFO: renamed from: k */
    public VText f20321k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f20322l;

    /* JADX INFO: renamed from: m */
    public VScroll f20323m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f20324n;

    /* JADX INFO: renamed from: o */
    public RelativeLayout f20325o;

    /* JADX INFO: renamed from: p */
    public VButton f20326p;

    /* JADX INFO: renamed from: q */
    public SurveyAct f20327q;

    /* JADX INFO: renamed from: r */
    public o4h0 f20328r;

    /* JADX INFO: renamed from: s */
    public String f20329s = "";

    /* JADX INFO: renamed from: t */
    public List<View> f20330t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public String f20331u = "";

    /* JADX INFO: renamed from: v */
    public String f20332v = "";

    /* JADX INFO: renamed from: w */
    public List<Surveys> f20333w = null;

    /* JADX INFO: renamed from: x */
    public int f20334x = 0;

    public r4h0(SurveyAct surveyAct) {
        this.f20327q = surveyAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m22621k(View view) {
        String str;
        if (this.f20326p.isEnabled()) {
            if (TextUtils.equals(this.f20329s, "surveys_finish")) {
                act().finish();
                return;
            }
            if (vwb.J(this.f20333w)) {
                return;
            }
            String string = "";
            if (TextUtils.equals(this.f20329s, "selection")) {
                str = "single_choice";
            } else if (TextUtils.equals(this.f20329s, "multi_selection")) {
                str = "multiple_choice";
            } else {
                str = TextUtils.equals(this.f20329s, "fill_blank") ? "question_answer" : "";
            }
            zvf0.u("e_feedback_question_submit_button", "p_feedback_question_popup", new j760[]{vwb.Y("feedback_question_type", str), vwb.Y("feedback_question_num", ((Questions) this.f20333w.get(0).questions.get(0)).index)});
            this.f20332v = Converter.dateToApiTimeString(mqi0.o());
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", this.f20328r.m20319m0());
                jSONObject2.put("type", "survey");
                jSONObject.put("survey", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                if (TextUtils.equals(this.f20329s, "selection") || TextUtils.equals(this.f20329s, "multi_selection")) {
                    JSONArray jSONArray = new JSONArray();
                    m22636s(jSONArray);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("choices", jSONArray);
                    jSONObject3.put("selection", jSONObject4);
                } else if (TextUtils.equals(this.f20329s, "fill_blank")) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("value", this.f20320j.getText().toString().trim());
                    jSONObject3.put("fillBlank", jSONObject5);
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("id", ((Questions) this.f20333w.get(0).questions.get(0)).id);
                jSONObject6.put("type", "survey_question");
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("id", CoreModule.m1850H().userId());
                jSONObject7.put("type", "user");
                jSONObject.put("question", jSONObject6);
                jSONObject.put("owner", jSONObject7);
                jSONObject.put("solution", jSONObject3);
                jSONObject.put("startTime", this.f20331u);
                jSONObject.put("endTime", this.f20332v);
                string = jSONObject.toString();
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
            this.f20328r.m20324x0(string);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22622C0() {
        return this.f20327q;
    }

    /* JADX INFO: renamed from: c */
    public View m22623c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s4h0.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SurveyAct act() {
        return this.f20327q;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m22628i1(o4h0 o4h0Var) {
        this.f20328r = o4h0Var;
    }

    /* JADX INFO: renamed from: f */
    public int m22626f() {
        return 50;
    }

    /* JADX INFO: renamed from: i */
    public final int m22627i() {
        Iterator<View> it = this.f20330t.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().isSelected()) {
                i++;
            }
        }
        return i;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m22623c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m22629j(View view) {
        for (int i = 0; i < this.f20330t.size(); i++) {
            if (TextUtils.equals(view.findViewById(u4c0.f23184qd).getText().toString(), this.f20330t.get(i).findViewById(u4c0.f23184qd).getText().toString())) {
                return ((Options) ((Questions) this.f20333w.get(0).questions.get(0)).content.selection.options.get(i)).exclusive;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m22630l(VText vText, List list, View view) {
        if (TextUtils.equals(this.f20329s, "selection")) {
            m22634q();
            view.setSelected(true);
            vText.setTextColor(Color.parseColor("#d74d37"));
            view.findViewById(u4c0.f23167pd).setBackgroundResource(x2c0.f26000Jp);
        } else if (TextUtils.equals(this.f20329s, "multi_selection") && (this.f20334x < ((Questions) ((Surveys) list.get(0)).questions.get(0)).content.selection.maxChoices || m22629j(view) || (this.f20334x == ((Questions) ((Surveys) list.get(0)).questions.get(0)).content.selection.maxChoices && view.isSelected()))) {
            view.setSelected(!view.isSelected());
            m22631m(view);
            if (view.isSelected()) {
                m22632n(m22629j(view));
            }
            this.f20334x = m22627i();
        }
        m22633p();
    }

    /* JADX INFO: renamed from: m */
    public final void m22631m(View view) {
        view.findViewById(u4c0.f23167pd).setBackgroundResource(view.isSelected() ? x2c0.f26000Jp : x2c0.f25969Ip);
        view.findViewById(u4c0.f23184qd).setTextColor(Color.parseColor(view.isSelected() ? "#d74d37" : "#212121"));
        xdl0.M(view.findViewById(u4c0.f23150od), !view.isSelected());
        xdl0.M(view.findViewById(u4c0.f23133nd), view.isSelected());
    }

    /* JADX INFO: renamed from: n */
    public final void m22632n(boolean z) {
        List list = ((Questions) this.f20333w.get(0).questions.get(0)).content.selection.options;
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.equals(Boolean.toString(z), Boolean.toString(((Options) list.get(i)).exclusive))) {
                View view = this.f20330t.get(i);
                view.setSelected(false);
                m22631m(view);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m22633p() {
        Iterator<View> it = this.f20330t.iterator();
        while (it.hasNext()) {
            if (it.next().isSelected()) {
                this.f20326p.setEnabled(true);
                return;
            }
        }
        this.f20326p.setEnabled(false);
    }

    /* JADX INFO: renamed from: q */
    public final void m22634q() {
        for (View view : this.f20330t) {
            view.findViewById(u4c0.f23167pd).setBackgroundResource(x2c0.f25969Ip);
            view.findViewById(u4c0.f23184qd).setTextColor(Color.parseColor("#212121"));
            view.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m22635r() {
        this.f20313c.getPaint().setFakeBoldText(true);
        xdl0.E0(this.f20326p, new View.OnClickListener() { // from class: l.q4h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19631a.m22621k(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m22636s(JSONArray jSONArray) {
        if (vwb.J(this.f20333w)) {
            return;
        }
        for (int i = 0; i < this.f20330t.size(); i++) {
            if (this.f20330t.get(i).isSelected()) {
                jSONArray.put(((Options) ((Questions) this.f20333w.get(0).questions.get(0)).content.selection.options.get(i)).id);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m22637u() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f20323m, "translationX", 0.0f, -xdl0.y0());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f20323m, "translationX", xdl0.y0(), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: v */
    public void m22638v(final List<Surveys> list) {
        this.f20333w = list;
        this.f20334x = 0;
        this.f20331u = Converter.dateToApiTimeString(mqi0.o());
        this.f20324n.removeAllViews();
        this.f20330t.clear();
        xdl0.M(this.f20318h, false);
        xdl0.M(this.f20322l, false);
        xdl0.M(this.f20314d, false);
        this.f20326p.setEnabled(false);
        if (vwb.J(list) || vwb.J(list.get(0).questions)) {
            this.f20329s = "surveys_finish";
            xdl0.M(this.f20313c, false);
            xdl0.M(this.f20312b, false);
            xdl0.M(this.f20314d, true);
            this.f20326p.setEnabled(true);
            this.f20326p.setText("完成");
            return;
        }
        String str = ((Questions) list.get(0).questions.get(0)).type;
        this.f20329s = str;
        if (TextUtils.equals(str, "fill_blank")) {
            if (!((Questions) list.get(0).questions.get(0)).content.fillBlank.required) {
                this.f20326p.setEnabled(true);
            }
            xdl0.M(this.f20318h, true);
            this.f20312b.setText(((Questions) list.get(0).questions.get(0)).index + " 填空");
            this.f20313c.setText(((Questions) list.get(0).questions.get(0)).title);
            this.f20320j.addTextChangedListener(new C1203a(list));
            return;
        }
        if (TextUtils.equals(this.f20329s, "selection") || TextUtils.equals(this.f20329s, "multi_selection")) {
            VText vText = this.f20312b;
            StringBuilder sb = new StringBuilder();
            sb.append(((Questions) list.get(0).questions.get(0)).index);
            sb.append(" ");
            sb.append(TextUtils.equals(this.f20329s, "selection") ? "单选" : "多选");
            vText.setText(sb.toString());
            this.f20313c.setText(((Questions) list.get(0).questions.get(0)).title);
            xdl0.M(this.f20322l, true);
            for (Options options : ((Questions) list.get(0).questions.get(0)).content.selection.options) {
                View viewInflate = o7r.a(act()).inflate(f6c0.f12346oc, (ViewGroup) null);
                final VText vTextFindViewById = viewInflate.findViewById(u4c0.f23184qd);
                VImage vImageFindViewById = viewInflate.findViewById(u4c0.f23150od);
                VImage vImageFindViewById2 = viewInflate.findViewById(u4c0.f23133nd);
                viewInflate.findViewById(u4c0.f23167pd).setMinimumHeight(t100.d(62.0f));
                if (TextUtils.equals(this.f20329s, "multi_selection")) {
                    xdl0.M(vImageFindViewById, true);
                    xdl0.M(vImageFindViewById2, false);
                }
                vTextFindViewById.getPaint().setFakeBoldText(true);
                vTextFindViewById.setText(options.text);
                this.f20330t.add(viewInflate);
                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.p4h0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f18586a.m22630l(vTextFindViewById, list, view);
                    }
                });
                this.f20324n.addView(viewInflate);
            }
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.r4h0$a */
    public class C1203a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f20335a;

        public C1203a(List list) {
            this.f20335a = list;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int length = 500 - editable.toString().length();
            boolean z = editable.toString().trim().length() > 0;
            r4h0.this.f20321k.setText(String.valueOf(length));
            if (((Questions) ((Surveys) this.f20335a.get(0)).questions.get(0)).content.fillBlank.required) {
                if (length >= 500 || !z) {
                    r4h0.this.f20326p.setEnabled(false);
                } else {
                    r4h0.this.f20326p.setEnabled(true);
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

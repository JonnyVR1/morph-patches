package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Questionnaire;
import com.p046p1.mobile.putong.core.data.QuestionnaireOptions;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.a1c0;
import p149l.cwf0;
import p149l.dml;
import p149l.eqh0;
import p149l.et4;
import p149l.l6c0;
import p149l.qsz;
import p149l.t5q;
import p149l.ura;
import p149l.vwb;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLocalUXQuestionnaire extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemLocalUXQuestionnaire f31083a;

    /* JADX INFO: renamed from: b */
    public VText f31084b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f31085c;

    /* JADX INFO: renamed from: d */
    public C8491a f31086d;

    /* JADX INFO: renamed from: e */
    public cwf0 f31087e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemLocalUXQuestionnaire$a */
    public static class C8491a extends RecyclerView.Adapter<C8492b> {

        /* JADX INFO: renamed from: a */
        public Context f31088a;

        /* JADX INFO: renamed from: b */
        public List<QuestionnaireOptions> f31089b;

        /* JADX INFO: renamed from: c */
        public InterfaceC8493c f31090c;

        public C8491a(Context context, List<QuestionnaireOptions> list) {
            this.f31088a = context;
            this.f31089b = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m48269z(int i, View view) {
            InterfaceC8493c interfaceC8493c = this.f31090c;
            if (interfaceC8493c != null) {
                interfaceC8493c.mo48276a(view, this.f31089b.get(i), i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull @NotNull C8492b c8492b, final int i) {
            c8492b.itemView.setLayoutParams(new RecyclerView.C0578p(-1, -2));
            c8492b.f31091a.setTypeface(Typeface.defaultFromStyle(1));
            c8492b.m48275b(this.f31089b.get(i));
            c8492b.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.s5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f162578a.m48269z(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C8492b onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
            return new C8492b(LayoutInflater.from(viewGroup.getContext()).inflate(l6c0.f126484h3, (ViewGroup) null));
        }

        /* JADX INFO: renamed from: D */
        public void m48272D(List<QuestionnaireOptions> list) {
            this.f31089b = list;
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: E */
        public void m48273E(InterfaceC8493c interfaceC8493c) {
            this.f31090c = interfaceC8493c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<QuestionnaireOptions> list = this.f31089b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemLocalUXQuestionnaire$b */
    public static class C8492b extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public VText f31091a;

        public C8492b(@NonNull View view) {
            super(view);
            this.f31091a = (VText) view.findViewById(y4c0.f196081Z);
            if (ura.m195053e().m195057d().mo33699I4()) {
                this.f31091a.setTextColor(view.getResources().getColor(a1c0.f67153g));
            }
        }

        /* JADX INFO: renamed from: b */
        public void m48275b(QuestionnaireOptions questionnaireOptions) {
            this.f31091a.setText(questionnaireOptions.value);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemLocalUXQuestionnaire$c */
    public interface InterfaceC8493c {
        /* JADX INFO: renamed from: a */
        void mo48276a(View view, QuestionnaireOptions questionnaireOptions, int i);
    }

    public ItemLocalUXQuestionnaire(Context context) {
        super(context);
        this.f31087e = new cwf0("p_action_survey_experience", ItemLocalUXQuestionnaire.class.getName());
    }

    /* JADX INFO: renamed from: b */
    public final void m48262b(View view) {
        t5q.m187338a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m48263c() {
        this.f31087e.m109035k();
        this.f31087e.m109034j();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m48264d(Message message, Questionnaire questionnaire, View view, QuestionnaireOptions questionnaireOptions, int i) {
        m48263c();
        m48266f(message.cid, questionnaire.title, questionnaireOptions.value);
        CoreModule.f17545c.f19642f0.m32762Pf(message.cid, MessageType.local_ux_questionnaire);
        CoreModule.f17545c.f19642f0.m32989ih(message.cid, "感谢你的反馈！\n探探将努力为你推荐更优质的聊天对象");
    }

    /* JADX INFO: renamed from: e */
    public void m48265e(MessagesAct messagesAct, dml dmlVar, final Message message, qsz qszVar) {
        if (NullChecker.m81303a(message) && NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.localUXQuestionnaire)) {
            final Questionnaire questionnaire = message.additionalData.localUXQuestionnaire;
            if (!qszVar.m176377a(message.f56011id)) {
                qszVar.m176378b(message.f56011id);
                ArrayList arrayList = new ArrayList();
                Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().value);
                }
                this.f31087e.m109040p(vwb.m200311Y("paper_number", "p2"), vwb.m200311Y("experience_question_number", questionnaire.title), vwb.m200311Y("action_survey_answer_list", et4.m117971a("-", arrayList)));
                m48267g();
            }
            this.f31084b.setText(questionnaire.title);
            C8491a c8491a = this.f31086d;
            List<QuestionnaireOptions> list = questionnaire.options;
            if (c8491a == null) {
                this.f31086d = new C8491a(messagesAct, list);
                this.f31085c.setLayoutManager(new LinearLayoutManager(messagesAct));
                this.f31085c.setAdapter(this.f31086d);
                this.f31086d.notifyDataSetChanged();
            } else {
                c8491a.m48272D(list);
            }
            this.f31086d.m48273E(new InterfaceC8493c() { // from class: l.r5q
                @Override // com.p046p1.mobile.putong.core.p053ui.messages.ItemLocalUXQuestionnaire.InterfaceC8493c
                /* JADX INFO: renamed from: a */
                public final void mo48276a(View view, QuestionnaireOptions questionnaireOptions, int i) {
                    this.f157865a.m48264d(message, questionnaire, view, questionnaireOptions, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m48266f(String str, String str2, String str3) {
        zvf0.m220399u("e_experience_chose_btn", "p_action_survey_experience", vwb.m200311Y("other_uid", str), vwb.m200311Y("paper_number", "P3"), vwb.m200311Y("experience_question_number", str2), vwb.m200311Y("experience_question_answer", str3));
    }

    /* JADX INFO: renamed from: g */
    public final void m48267g() {
        this.f31087e.m109033i();
        this.f31087e.m109036l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48262b(this);
        this.f31084b.setTypeface(eqh0.m117752c(3), 1);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31084b.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public ItemLocalUXQuestionnaire(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31087e = new cwf0("p_action_survey_experience", ItemLocalUXQuestionnaire.class.getName());
    }

    public ItemLocalUXQuestionnaire(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31087e = new cwf0("p_action_survey_experience", ItemLocalUXQuestionnaire.class.getName());
    }
}

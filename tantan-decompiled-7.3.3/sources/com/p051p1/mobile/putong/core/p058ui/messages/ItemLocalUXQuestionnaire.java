package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Questionnaire;
import com.p051p1.mobile.putong.core.data.QuestionnaireOptions;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.du4;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.jyb;
import p153l.l4g0;
import p153l.lyh0;
import p153l.n100;
import p153l.pol;
import p153l.qec0;
import p153l.t7q;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLocalUXQuestionnaire extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemLocalUXQuestionnaire f31931a;

    /* JADX INFO: renamed from: b */
    public VText f31932b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f31933c;

    /* JADX INFO: renamed from: d */
    public C8654a f31934d;

    /* JADX INFO: renamed from: e */
    public l4g0 f31935e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemLocalUXQuestionnaire$a */
    public static class C8654a extends RecyclerView.Adapter<C8655b> {

        /* JADX INFO: renamed from: a */
        public Context f31936a;

        /* JADX INFO: renamed from: b */
        public List<QuestionnaireOptions> f31937b;

        /* JADX INFO: renamed from: c */
        public InterfaceC8656c f31938c;

        public C8654a(Context context, List<QuestionnaireOptions> list) {
            this.f31936a = context;
            this.f31937b = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m49452z(int i, View view) {
            InterfaceC8656c interfaceC8656c = this.f31938c;
            if (interfaceC8656c != null) {
                interfaceC8656c.mo49459a(view, this.f31937b.get(i), i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull @NotNull C8655b c8655b, final int i) {
            c8655b.itemView.setLayoutParams(new RecyclerView.C0580p(-1, -2));
            c8655b.f31939a.setTypeface(Typeface.defaultFromStyle(1));
            c8655b.m49458b(this.f31937b.get(i));
            c8655b.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.s7q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166704a.m49452z(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C8655b onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
            return new C8655b(LayoutInflater.from(viewGroup.getContext()).inflate(qec0.f157040h3, (ViewGroup) null));
        }

        /* JADX INFO: renamed from: D */
        public void m49455D(List<QuestionnaireOptions> list) {
            this.f31937b = list;
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: E */
        public void m49456E(InterfaceC8656c interfaceC8656c) {
            this.f31938c = interfaceC8656c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<QuestionnaireOptions> list = this.f31937b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemLocalUXQuestionnaire$b */
    public static class C8655b extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public VText f31939a;

        public C8655b(@NonNull View view) {
            super(view);
            this.f31939a = (VText) view.findViewById(edc0.f93316Z);
            if (gta.m132210e().m132214d().mo34702I4()) {
                this.f31939a.setTextColor(view.getResources().getColor(g9c0.f102817g));
            }
        }

        /* JADX INFO: renamed from: b */
        public void m49458b(QuestionnaireOptions questionnaireOptions) {
            this.f31939a.setText(questionnaireOptions.value);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemLocalUXQuestionnaire$c */
    public interface InterfaceC8656c {
        /* JADX INFO: renamed from: a */
        void mo49459a(View view, QuestionnaireOptions questionnaireOptions, int i);
    }

    public ItemLocalUXQuestionnaire(Context context) {
        super(context);
        this.f31935e = new l4g0("p_action_survey_experience", ItemLocalUXQuestionnaire.class.getName());
    }

    /* JADX INFO: renamed from: b */
    public final void m49445b(View view) {
        t7q.m189629a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m49446c() {
        this.f31935e.m152776k();
        this.f31935e.m152775j();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m49447d(Message message, Questionnaire questionnaire, View view, QuestionnaireOptions questionnaireOptions, int i) {
        m49446c();
        m49449f(message.cid, questionnaire.title, questionnaireOptions.value);
        CoreModule.f18264c.f20384f0.m33765Pf(message.cid, MessageType.local_ux_questionnaire);
        CoreModule.f18264c.f20384f0.m33992ih(message.cid, "感谢你的反馈！\n探探将努力为你推荐更优质的聊天对象");
    }

    /* JADX INFO: renamed from: e */
    public void m49448e(MessagesAct messagesAct, pol polVar, final Message message, n100 n100Var) {
        if (NullChecker.m82486a(message) && NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.localUXQuestionnaire)) {
            final Questionnaire questionnaire = message.additionalData.localUXQuestionnaire;
            if (!n100Var.m161054a(message.f56859id)) {
                n100Var.m161055b(message.f56859id);
                ArrayList arrayList = new ArrayList();
                Iterator<QuestionnaireOptions> it = questionnaire.options.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().value);
                }
                this.f31935e.m152781p(jyb.m147494Y("paper_number", "p2"), jyb.m147494Y("experience_question_number", questionnaire.title), jyb.m147494Y("action_survey_answer_list", du4.m118067a("-", arrayList)));
                m49450g();
            }
            this.f31932b.setText(questionnaire.title);
            C8654a c8654a = this.f31934d;
            List<QuestionnaireOptions> list = questionnaire.options;
            if (c8654a == null) {
                this.f31934d = new C8654a(messagesAct, list);
                this.f31933c.setLayoutManager(new LinearLayoutManager(messagesAct));
                this.f31933c.setAdapter(this.f31934d);
                this.f31934d.notifyDataSetChanged();
            } else {
                c8654a.m49455D(list);
            }
            this.f31934d.m49456E(new InterfaceC8656c() { // from class: l.r7q
                @Override // com.p051p1.mobile.putong.core.p058ui.messages.ItemLocalUXQuestionnaire.InterfaceC8656c
                /* JADX INFO: renamed from: a */
                public final void mo49459a(View view, QuestionnaireOptions questionnaireOptions, int i) {
                    this.f161630a.m49447d(message, questionnaire, view, questionnaireOptions, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m49449f(String str, String str2, String str3) {
        i4g0.m138523u("e_experience_chose_btn", "p_action_survey_experience", jyb.m147494Y("other_uid", str), jyb.m147494Y("paper_number", "P3"), jyb.m147494Y("experience_question_number", str2), jyb.m147494Y("experience_question_answer", str3));
    }

    /* JADX INFO: renamed from: g */
    public final void m49450g() {
        this.f31935e.m152774i();
        this.f31935e.m152777l();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49445b(this);
        this.f31932b.setTypeface(lyh0.m156283c(3), 1);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31932b.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public ItemLocalUXQuestionnaire(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31935e = new l4g0("p_action_survey_experience", ItemLocalUXQuestionnaire.class.getName());
    }

    public ItemLocalUXQuestionnaire(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31935e = new l4g0("p_action_survey_experience", ItemLocalUXQuestionnaire.class.getName());
    }
}

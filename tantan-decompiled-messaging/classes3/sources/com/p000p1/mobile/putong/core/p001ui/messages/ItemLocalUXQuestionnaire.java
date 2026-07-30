package com.p000p1.mobile.putong.core.p001ui.messages;

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
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.Questionnaire;
import com.p1.mobile.putong.core.data.QuestionnaireOptions;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.a1c0;
import l.cwf0;
import l.et4;
import l.j760;
import l.l6c0;
import l.t5q;
import l.ura;
import l.vwb;
import l.y4c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p003l.dml;
import p003l.eqh0;
import p003l.qsz;
import p028v.VRecyclerView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemLocalUXQuestionnaire extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ItemLocalUXQuestionnaire f974a;

    /* JADX INFO: renamed from: b */
    public VText f975b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f976c;

    /* JADX INFO: renamed from: d */
    public C0074a f977d;

    /* JADX INFO: renamed from: e */
    public cwf0 f978e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemLocalUXQuestionnaire$a */
    public static class C0074a extends RecyclerView.Adapter<C0075b> {

        /* JADX INFO: renamed from: a */
        public Context f979a;

        /* JADX INFO: renamed from: b */
        public List<QuestionnaireOptions> f980b;

        /* JADX INFO: renamed from: c */
        public InterfaceC0076c f981c;

        public C0074a(Context context, List<QuestionnaireOptions> list) {
            this.f979a = context;
            this.f980b = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m1352z(int i, View view) {
            InterfaceC0076c interfaceC0076c = this.f981c;
            if (interfaceC0076c != null) {
                interfaceC0076c.mo1359a(view, this.f980b.get(i), i);
            }
        }

        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull @NotNull C0075b c0075b, final int i) {
            ((RecyclerView.d0) c0075b).itemView.setLayoutParams(new RecyclerView.p(-1, -2));
            c0075b.f982a.setTypeface(Typeface.defaultFromStyle(1));
            c0075b.m1358b(this.f980b.get(i));
            ((RecyclerView.d0) c0075b).itemView.setOnClickListener(new View.OnClickListener() { // from class: l.s5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7146a.m1352z(i, view);
                }
            });
        }

        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C0075b onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
            return new C0075b(LayoutInflater.from(viewGroup.getContext()).inflate(l6c0.h3, (ViewGroup) null));
        }

        /* JADX INFO: renamed from: D */
        public void m1355D(List<QuestionnaireOptions> list) {
            this.f980b = list;
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: E */
        public void m1356E(InterfaceC0076c interfaceC0076c) {
            this.f981c = interfaceC0076c;
        }

        public int getItemCount() {
            List<QuestionnaireOptions> list = this.f980b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemLocalUXQuestionnaire$b */
    public static class C0075b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public VText f982a;

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public C0075b(@NonNull View view) {
            super(view);
            this.f982a = (VText) view.findViewById(y4c0.Z);
            if (ura.e().d().I4()) {
                this.f982a.setTextColor(view.getResources().getColor(a1c0.g));
            }
        }

        /* JADX INFO: renamed from: b */
        public void m1358b(QuestionnaireOptions questionnaireOptions) {
            this.f982a.setText(questionnaireOptions.value);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemLocalUXQuestionnaire$c */
    public interface InterfaceC0076c {
        /* JADX INFO: renamed from: a */
        void mo1359a(View view, QuestionnaireOptions questionnaireOptions, int i);
    }

    public ItemLocalUXQuestionnaire(Context context) {
        super(context);
        this.f978e = new cwf0("p_action_survey_experience", ItemLocalUXQuestionnaire.class.getName());
    }

    /* JADX INFO: renamed from: b */
    public final void m1345b(View view) {
        t5q.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m1346c() {
        this.f978e.k();
        this.f978e.j();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m1347d(Message message, Questionnaire questionnaire, View view, QuestionnaireOptions questionnaireOptions, int i) {
        m1346c();
        m1349f(message.cid, questionnaire.title, questionnaireOptions.value);
        CoreModule.c.f0.Pf(message.cid, "local_ux_questionnaire");
        CoreModule.c.f0.ih(message.cid, "感谢你的反馈！\n探探将努力为你推荐更优质的聊天对象");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m1348e(MessagesAct messagesAct, dml dmlVar, final Message message, qsz qszVar) {
        if (NullChecker.a(message) && NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.localUXQuestionnaire)) {
            final Questionnaire questionnaire = message.additionalData.localUXQuestionnaire;
            if (!qszVar.m7030a(((DbObject) message).id)) {
                qszVar.m7031b(((DbObject) message).id);
                ArrayList arrayList = new ArrayList();
                Iterator it = questionnaire.options.iterator();
                while (it.hasNext()) {
                    arrayList.add(((QuestionnaireOptions) it.next()).value);
                }
                this.f978e.p(new j760[]{vwb.Y("paper_number", "p2"), vwb.Y("experience_question_number", questionnaire.title), vwb.Y("action_survey_answer_list", et4.a("-", arrayList))});
                m1350g();
            }
            this.f975b.setText(questionnaire.title);
            C0074a c0074a = this.f977d;
            List<QuestionnaireOptions> list = questionnaire.options;
            if (c0074a == null) {
                this.f977d = new C0074a(messagesAct, list);
                this.f976c.setLayoutManager(new LinearLayoutManager(messagesAct));
                this.f976c.setAdapter(this.f977d);
                this.f977d.notifyDataSetChanged();
            } else {
                c0074a.m1355D(list);
            }
            this.f977d.m1356E(new InterfaceC0076c() { // from class: l.r5q
                @Override // com.p000p1.mobile.putong.core.p001ui.messages.ItemLocalUXQuestionnaire.InterfaceC0076c
                /* JADX INFO: renamed from: a */
                public final void mo1359a(View view, QuestionnaireOptions questionnaireOptions, int i) {
                    this.f6790a.m1347d(message, questionnaire, view, questionnaireOptions, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1349f(String str, String str2, String str3) {
        zvf0.u("e_experience_chose_btn", "p_action_survey_experience", new j760[]{vwb.Y("other_uid", str), vwb.Y("paper_number", "P3"), vwb.Y("experience_question_number", str2), vwb.Y("experience_question_answer", str3)});
    }

    /* JADX INFO: renamed from: g */
    public final void m1350g() {
        this.f978e.i();
        this.f978e.l();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1345b(this);
        this.f975b.setTypeface(eqh0.m3924c(3), 1);
        if (ura.e().d().I4()) {
            this.f975b.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public ItemLocalUXQuestionnaire(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f978e = new cwf0("p_action_survey_experience", ItemLocalUXQuestionnaire.class.getName());
    }

    public ItemLocalUXQuestionnaire(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f978e = new cwf0("p_action_survey_experience", ItemLocalUXQuestionnaire.class.getName());
    }
}

package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopCustomQuestionTypeFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p149l.dac0;
import p149l.e30;
import p149l.f30;
import p149l.f6c0;
import p149l.mkd0;
import p149l.nel;
import p149l.t100;
import p149l.u4c0;
import p149l.ura;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.yif;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomQuestionTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public RecyclerView f33318F;

    /* JADX INFO: renamed from: G */
    public List<Question> f33319G;

    /* JADX INFO: renamed from: H */
    public C8647a f33320H;

    /* JADX INFO: renamed from: I */
    public VText_Medium f33321I;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomQuestionTypeFrag$a */
    public static class C8647a extends dac0<Question> {

        /* JADX INFO: renamed from: c */
        public final ExpProfileLoopCustomQuestionTypeFrag f33322c;

        /* JADX INFO: renamed from: d */
        public ArrayList<Question> f33323d = new ArrayList<>();

        public C8647a(ExpProfileLoopCustomQuestionTypeFrag expProfileLoopCustomQuestionTypeFrag, ExpLoopInputType expLoopInputType) {
            this.f33322c = expProfileLoopCustomQuestionTypeFrag;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f33323d.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f95333E2, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final Question question, int i, int i2) {
            VText_Medium vText_Medium = (VText_Medium) view.findViewById(u4c0.f174268ge);
            ImageView imageView = (ImageView) view.findViewById(u4c0.f173903L);
            imageView.setImageDrawable(this.f33322c.getResources().getDrawable(x2c0.f189548Mg));
            xdl0.m208344M(imageView, true);
            vText_Medium.setText(question.text);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.xgf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f192768a.m51323H(question, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public Question getItem(int i) {
            return this.f33323d.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m51323H(Question question, View view) {
            this.f33322c.m51319j5(question);
        }

        /* JADX INFO: renamed from: I */
        public void m51324I(List<Question> list) {
            this.f33323d.clear();
            this.f33323d.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ Question m51312c5(Question question) {
        question.nullCheck();
        question.editable.nullCheck();
        return question;
    }

    /* JADX INFO: renamed from: d5 */
    public static /* synthetic */ Boolean m51313d5(User user, Question question) {
        boolean z = false;
        if (NullChecker.m81303a(user)) {
            if (question != null && !vwb.m200303Q(user.profile.answers, new w9j() { // from class: l.ugf
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Answer) obj).question;
                }
            }).contains(question.f56011id)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (question != null && !vwb.m200303Q(ura.m195053e().m195057d().mo33757Uc().profile.answers, new w9j() { // from class: l.vgf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Answer) obj).question;
            }
        }).contains(question.f56011id)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: g5 */
    private void m51315g5() {
        final User userM51245N4 = m51245N4();
        duringCreated(CoreModule.f17545c.f19636d0.f199753R.m121230k().filter(new w9j() { // from class: l.ngf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).take(1)).flatMap(new w9j() { // from class: l.ogf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.from((List) obj);
            }
        }).map(new w9j() { // from class: l.pgf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19636d0.m215900o3((String) obj);
            }
        }).filter(new w9j() { // from class: l.qgf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ExpProfileLoopCustomQuestionTypeFrag.m51313d5(userM51245N4, (Question) obj);
            }
        }).map(new w9j() { // from class: l.rgf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ExpProfileLoopCustomQuestionTypeFrag.m51312c5((Question) obj);
            }
        }).filter(new w9j() { // from class: l.sgf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Question) obj).editable.languages.size() == 0);
            }
        }).toList().subscribe(mkd0.m154955G(new e30() { // from class: l.tgf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170093a.m51318h5((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i5 */
    private void m51316i5(List<Question> list) {
        xdl0.m208344M(this.f33321I, vwb.m200296J(list));
        C8647a c8647a = this.f33320H;
        if (c8647a == null) {
            return;
        }
        c8647a.m51324I(list);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo51246O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        this.f33318F = recyclerView;
        int i = xdl0.f192403e;
        frameLayout.addView(recyclerView, i, i);
        VText_Medium vText_Medium = new VText_Medium(viewGroup.getContext());
        this.f33321I = vText_Medium;
        vText_Medium.setTextColor(viewGroup.getResources().getColor(w0c0.f183899x));
        this.f33321I.setTextSize(1, 16.0f);
        this.f33321I.setGravity(17);
        this.f33321I.setText("没有更多的问题了");
        int i2 = xdl0.f192403e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.topMargin = t100.f167247V;
        frameLayout.addView(this.f33321I, layoutParams);
        xdl0.m208344M(this.f33321I, false);
        return frameLayout;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m51315g5();
    }

    /* JADX INFO: renamed from: f5 */
    public void m51317f5(Question question, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33279A.setData(new ExpProfileLoopTextTypeData(question.f56011id, str));
        m51243M4().m51231a2().m203205q0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f33320H = new C8647a(this, this.f33279A);
        this.f33318F.setLayoutManager(linearLayoutManager);
        this.f33318F.addItemDecoration(new nel(t100.m186890d(12.0f)));
        this.f33318F.setAdapter(this.f33320H);
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m51318h5(List list) {
        Question questionM215894i3 = CoreModule.f17545c.f19636d0.m215894i3(ura.m195053e().m195057d().mo33757Uc());
        if (NullChecker.m81303a(questionM215894i3)) {
            list.add(0, questionM215894i3);
        }
        this.f33319G = list;
        m51316i5(list);
    }

    /* JADX INFO: renamed from: j5 */
    public final void m51319j5(Question question) {
        ExpProfileLoopTextTypeData textType = this.f33279A.getData().getTextType();
        new yif(getContext(), question, TextUtils.equals(textType.text1, question.text) ? textType.text2 : "", new f30() { // from class: l.wgf
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f186190a.m51317f5((Question) obj, (String) obj2);
            }
        }).show();
    }
}

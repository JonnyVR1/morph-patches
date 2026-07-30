package com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopCustomQuestionTypeFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.dhl;
import p153l.ekf;
import p153l.gta;
import p153l.jic0;
import p153l.jyb;
import p153l.kec0;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomQuestionTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public RecyclerView f34166F;

    /* JADX INFO: renamed from: G */
    public List<Question> f34167G;

    /* JADX INFO: renamed from: H */
    public C8810a f34168H;

    /* JADX INFO: renamed from: I */
    public VText_Medium f34169I;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomQuestionTypeFrag$a */
    public static class C8810a extends jic0<Question> {

        /* JADX INFO: renamed from: c */
        public final ExpProfileLoopCustomQuestionTypeFrag f34170c;

        /* JADX INFO: renamed from: d */
        public ArrayList<Question> f34171d = new ArrayList<>();

        public C8810a(ExpProfileLoopCustomQuestionTypeFrag expProfileLoopCustomQuestionTypeFrag, ExpLoopInputType expLoopInputType) {
            this.f34170c = expProfileLoopCustomQuestionTypeFrag;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f34171d.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f125386E2, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final Question question, int i, int i2) {
            VText_Medium vText_Medium = (VText_Medium) view.findViewById(adc0.f70409je);
            ImageView imageView = (ImageView) view.findViewById(adc0.f69991L);
            imageView.setImageDrawable(this.f34170c.getResources().getDrawable(dbc0.f85994Ah));
            bnl0.m105524M(imageView, true);
            vText_Medium.setText(question.text);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.dif
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f88630a.m52506H(question, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public Question getItem(int i) {
            return this.f34171d.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m52506H(Question question, View view) {
            this.f34170c.m52502j5(question);
        }

        /* JADX INFO: renamed from: I */
        public void m52507I(List<Question> list) {
            this.f34171d.clear();
            this.f34171d.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ Question m52495c5(Question question) {
        question.nullCheck();
        question.editable.nullCheck();
        return question;
    }

    /* JADX INFO: renamed from: d5 */
    public static /* synthetic */ Boolean m52496d5(User user, Question question) {
        boolean z = false;
        if (NullChecker.m82486a(user)) {
            if (question != null && !jyb.m147486Q(user.profile.answers, new qcj() { // from class: l.aif
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Answer) obj).question;
                }
            }).contains(question.f56859id)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (question != null && !jyb.m147486Q(gta.m132210e().m132214d().mo34760Uc().profile.answers, new qcj() { // from class: l.bif
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Answer) obj).question;
            }
        }).contains(question.f56859id)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: g5 */
    private void m52498g5() {
        final User userM52428N4 = m52428N4();
        duringCreated(CoreModule.f18264c.f20378d0.f128826R.m159274k().filter(new qcj() { // from class: l.thf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).take(1)).flatMap(new qcj() { // from class: l.uhf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.from((List) obj);
            }
        }).map(new qcj() { // from class: l.vhf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20378d0.m151465o3((String) obj);
            }
        }).filter(new qcj() { // from class: l.whf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ExpProfileLoopCustomQuestionTypeFrag.m52496d5(userM52428N4, (Question) obj);
            }
        }).map(new qcj() { // from class: l.xhf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ExpProfileLoopCustomQuestionTypeFrag.m52495c5((Question) obj);
            }
        }).filter(new qcj() { // from class: l.yhf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Question) obj).editable.languages.size() == 0);
            }
        }).toList().subscribe(psd0.m173596G(new y20() { // from class: l.zhf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204411a.m52501h5((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i5 */
    private void m52499i5(List<Question> list) {
        bnl0.m105524M(this.f34169I, jyb.m147479J(list));
        C8810a c8810a = this.f34168H;
        if (c8810a == null) {
            return;
        }
        c8810a.m52507I(list);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo52429O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        this.f34166F = recyclerView;
        int i = bnl0.f77544e;
        frameLayout.addView(recyclerView, i, i);
        VText_Medium vText_Medium = new VText_Medium(viewGroup.getContext());
        this.f34169I = vText_Medium;
        vText_Medium.setTextColor(viewGroup.getResources().getColor(c9c0.f80469x));
        this.f34169I.setTextSize(1, 16.0f);
        this.f34169I.setGravity(17);
        this.f34169I.setText("没有更多的问题了");
        int i2 = bnl0.f77544e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.topMargin = qa00.f156309V;
        frameLayout.addView(this.f34169I, layoutParams);
        bnl0.m105524M(this.f34169I, false);
        return frameLayout;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m52498g5();
    }

    /* JADX INFO: renamed from: f5 */
    public void m52500f5(Question question, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f34127A.setData(new ExpProfileLoopTextTypeData(question.f56859id, str));
        m52426M4().m52414b2().m110171q0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f34168H = new C8810a(this, this.f34127A);
        this.f34166F.setLayoutManager(linearLayoutManager);
        this.f34166F.addItemDecoration(new dhl(qa00.m175859d(12.0f)));
        this.f34166F.setAdapter(this.f34168H);
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m52501h5(List list) {
        Question questionM151459i3 = CoreModule.f18264c.f20378d0.m151459i3(gta.m132210e().m132214d().mo34760Uc());
        if (NullChecker.m82486a(questionM151459i3)) {
            list.add(0, questionM151459i3);
        }
        this.f34167G = list;
        m52499i5(list);
    }

    /* JADX INFO: renamed from: j5 */
    public final void m52502j5(Question question) {
        ExpProfileLoopTextTypeData textType = this.f34127A.getData().getTextType();
        new ekf(getContext(), question, TextUtils.equals(textType.text1, question.text) ? textType.text2 : "", new z20() { // from class: l.cif
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f81935a.m52500f5((Question) obj, (String) obj2);
            }
        }).show();
    }
}

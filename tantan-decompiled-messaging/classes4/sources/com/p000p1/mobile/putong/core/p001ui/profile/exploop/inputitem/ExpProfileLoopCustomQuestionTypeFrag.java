package com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopCustomQuestionTypeFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.f30;
import l.f6c0;
import l.mkd0;
import l.t100;
import l.u4c0;
import l.ura;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import p002l.nel;
import p002l.yif;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileLoopCustomQuestionTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public RecyclerView f1140F;

    /* JADX INFO: renamed from: G */
    public List<Question> f1141G;

    /* JADX INFO: renamed from: H */
    public C0072a f1142H;

    /* JADX INFO: renamed from: I */
    public VText_Medium f1143I;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomQuestionTypeFrag$a */
    public static class C0072a extends dac0<Question> {

        /* JADX INFO: renamed from: c */
        public final ExpProfileLoopCustomQuestionTypeFrag f1144c;

        /* JADX INFO: renamed from: d */
        public ArrayList<Question> f1145d = new ArrayList<>();

        public C0072a(ExpProfileLoopCustomQuestionTypeFrag expProfileLoopCustomQuestionTypeFrag, ExpLoopInputType expLoopInputType) {
            this.f1144c = expProfileLoopCustomQuestionTypeFrag;
        }

        /* JADX INFO: renamed from: C */
        public int m1788C() {
            return this.f1145d.size();
        }

        /* JADX INFO: renamed from: D */
        public View m1789D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.E2, viewGroup, false);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m1787A(View view, final Question question, int i, int i2) {
            VText_Medium vText_MediumFindViewById = view.findViewById(u4c0.ge);
            ImageView imageView = (ImageView) view.findViewById(u4c0.L);
            imageView.setImageDrawable(this.f1144c.getResources().getDrawable(x2c0.Mg));
            xdl0.M(imageView, true);
            vText_MediumFindViewById.setText(question.text);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.xgf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f22277a.m1792H(question, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public Question getItem(int i) {
            return this.f1145d.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m1792H(Question question, View view) {
            this.f1144c.m1785j5(question);
        }

        /* JADX INFO: renamed from: I */
        public void m1793I(List<Question> list) {
            this.f1145d.clear();
            this.f1145d.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ Question m1776c5(Question question) {
        question.nullCheck();
        question.editable.nullCheck();
        return question;
    }

    /* JADX INFO: renamed from: d5 */
    public static /* synthetic */ Boolean m1777d5(User user, Question question) {
        boolean z = false;
        if (NullChecker.a(user)) {
            if (question != null && !vwb.Q(user.profile.answers, new w9j() { // from class: l.ugf
                public final Object call(Object obj) {
                    return ((Answer) obj).question;
                }
            }).contains(((DbObject) question).id)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (question != null && !vwb.Q(ura.e().d().Uc().profile.answers, new w9j() { // from class: l.vgf
            public final Object call(Object obj) {
                return ((Answer) obj).question;
            }
        }).contains(((DbObject) question).id)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: g5 */
    private void m1779g5() {
        final User userM1700N4 = m1700N4();
        duringCreated(CoreModule.c.d0.R.k().filter(new w9j() { // from class: l.ngf
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).take(1)).flatMap(new w9j() { // from class: l.ogf
            public final Object call(Object obj) {
                return c.from((List) obj);
            }
        }).map(new w9j() { // from class: l.pgf
            public final Object call(Object obj) {
                return CoreModule.c.d0.o3((String) obj);
            }
        }).filter(new w9j() { // from class: l.qgf
            public final Object call(Object obj) {
                return ExpProfileLoopCustomQuestionTypeFrag.m1777d5(userM1700N4, (Question) obj);
            }
        }).map(new w9j() { // from class: l.rgf
            public final Object call(Object obj) {
                return ExpProfileLoopCustomQuestionTypeFrag.m1776c5((Question) obj);
            }
        }).filter(new w9j() { // from class: l.sgf
            public final Object call(Object obj) {
                return Boolean.valueOf(((Question) obj).editable.languages.size() == 0);
            }
        }).toList().subscribe(mkd0.G(new e30() { // from class: l.tgf
            public final void call(Object obj) {
                this.f20228a.m1784h5((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i5 */
    private void m1780i5(List<Question> list) {
        xdl0.M(this.f1143I, vwb.J(list));
        C0072a c0072a = this.f1142H;
        if (c0072a == null) {
            return;
        }
        c0072a.m1793I(list);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo1701O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        View recyclerView = new RecyclerView(viewGroup.getContext());
        this.f1140F = recyclerView;
        int i = xdl0.e;
        frameLayout.addView(recyclerView, i, i);
        VText_Medium vText_Medium = new VText_Medium(viewGroup.getContext());
        this.f1143I = vText_Medium;
        vText_Medium.setTextColor(viewGroup.getResources().getColor(w0c0.x));
        this.f1143I.setTextSize(1, 16.0f);
        this.f1143I.setGravity(17);
        this.f1143I.setText("没有更多的问题了");
        int i2 = xdl0.e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.topMargin = t100.V;
        frameLayout.addView(this.f1143I, layoutParams);
        xdl0.M(this.f1143I, false);
        return frameLayout;
    }

    /* JADX INFO: renamed from: f4 */
    public void m1781f4() {
        super.f4();
        m1779g5();
    }

    /* JADX INFO: renamed from: f5 */
    public void m1782f5(Question question, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f1101A.setData(new ExpProfileLoopTextTypeData(((DbObject) question).id, str));
        m1698M4().m1686a2().m24655q0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m1783g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f1142H = new C0072a(this, this.f1101A);
        this.f1140F.setLayoutManager(linearLayoutManager);
        this.f1140F.addItemDecoration(new nel(t100.d(12.0f)));
        this.f1140F.setAdapter(this.f1142H);
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m1784h5(List list) {
        Question questionI3 = CoreModule.c.d0.i3(ura.e().d().Uc());
        if (NullChecker.a(questionI3)) {
            list.add(0, questionI3);
        }
        this.f1141G = list;
        m1780i5(list);
    }

    /* JADX INFO: renamed from: j5 */
    public final void m1785j5(Question question) {
        ExpProfileLoopTextTypeData textType = this.f1101A.getData().getTextType();
        new yif(getContext(), question, TextUtils.equals(textType.text1, question.text) ? textType.text2 : "", new f30() { // from class: l.wgf
            public final void call(Object obj, Object obj2) {
                this.f21748a.m1782f5((Question) obj, (String) obj2);
            }
        }).show();
    }
}

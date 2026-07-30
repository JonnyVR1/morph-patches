package p002l;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.messages.question.IceBreakingQuestionEditAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatProfile;
import com.p1.mobile.putong.core.data.IceBreakingQuestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.f30;
import l.lsi0;
import l.pam;
import l.qib0;
import l.s7m;
import l.t100;
import l.v19;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.y4c0;
import v.VButton;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oam implements s7m<dam> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f16452a;

    /* JADX INFO: renamed from: b */
    public VFrame f16453b;

    /* JADX INFO: renamed from: c */
    public VImage f16454c;

    /* JADX INFO: renamed from: d */
    public VText f16455d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f16456e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f16457f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f16458g;

    /* JADX INFO: renamed from: h */
    public VText f16459h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f16460i;

    /* JADX INFO: renamed from: j */
    public VText f16461j;

    /* JADX INFO: renamed from: k */
    public RecyclerView f16462k;

    /* JADX INFO: renamed from: l */
    public VButton f16463l;

    /* JADX INFO: renamed from: m */
    public final IceBreakingQuestionEditAct f16464m;

    /* JADX INFO: renamed from: n */
    public dam f16465n;

    /* JADX INFO: renamed from: q */
    public mob0 f16468q;

    /* JADX INFO: renamed from: r */
    public mob0 f16469r;

    /* JADX INFO: renamed from: t */
    public final Paint f16471t;

    /* JADX INFO: renamed from: u */
    public final Rect f16472u;

    /* JADX INFO: renamed from: v */
    public u9m f16473v;

    /* JADX INFO: renamed from: w */
    public int f16474w;

    /* JADX INFO: renamed from: x */
    public final List<IceBreakingQuestion> f16475x;

    /* JADX INFO: renamed from: o */
    public final List<job0> f16466o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final List<job0> f16467p = new ArrayList();

    /* JADX INFO: renamed from: s */
    public int f16470s = 0;

    public oam(IceBreakingQuestionEditAct iceBreakingQuestionEditAct) {
        Paint paint = new Paint();
        this.f16471t = paint;
        this.f16472u = new Rect();
        this.f16475x = new ArrayList();
        this.f16464m = iceBreakingQuestionEditAct;
        paint.setTextSize(t100.f(14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m19339F(View view) {
        this.f16464m.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m19340G(View view) {
        this.f16465n.m11730s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m19341H(View view) {
        m19360L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m19342I(View view) {
        m19359K();
    }

    /* JADX INFO: renamed from: A */
    public final void m19353A() {
        mob0 mob0Var = new mob0(this.f16467p);
        this.f16469r = mob0Var;
        mob0Var.m18123L(new f30() { // from class: l.eam
            public final void call(Object obj, Object obj2) {
                this.f9653a.m19357E((Integer) obj, (job0) obj2);
            }
        });
        RecyclerView recyclerView = this.f16462k;
        int i = t100.j;
        recyclerView.addItemDecoration(new zlf0(0, 0, i, i));
        this.f16462k.setAdapter(this.f16469r);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m19354B() {
        u9m u9mVar = this.f16473v;
        if (u9mVar != null) {
            u9mVar.m23391c();
        }
        this.f16464m.hideInput();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m19355C(Integer num, job0 job0Var) {
        job0 job0VarRemove = this.f16466o.remove(num.intValue());
        job0VarRemove.m16043d(false);
        this.f16468q.m18124M(this.f16466o);
        xdl0.M(this.f16458g, true);
        m19375y();
        m19363O();
        if (job0Var.m16042c()) {
            this.f16467p.add(job0VarRemove);
            mob0 mob0Var = this.f16469r;
            if (mob0Var != null) {
                mob0Var.m18124M(this.f16467p);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m19356C0() {
        return this.f16464m;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m19357E(Integer num, job0 job0Var) {
        if (this.f16466o.size() >= 3) {
            lsi0.y("最多设置3个话题");
            return;
        }
        if (m19371u(job0Var.m16040a().content)) {
            lsi0.y("新的问题不能和已有的重复");
            return;
        }
        job0 job0VarRemove = this.f16467p.remove(num.intValue());
        job0VarRemove.m16043d(true);
        this.f16466o.add(job0VarRemove);
        this.f16469r.m18124M(this.f16467p);
        this.f16468q.m18124M(this.f16466o);
        m19363O();
        if (this.f16466o.size() >= 3) {
            this.f16464m.hideInput();
            xdl0.M(this.f16458g, false);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m19358J() {
        if (m19372v(this.f16473v.m23392d())) {
            ((EditText) this.f16473v.getContentView().findViewById(y4c0.E0)).setText("");
        }
        m19375y();
    }

    /* JADX INFO: renamed from: K */
    public final void m19359K() {
        if (this.f16469r == null || vwb.J(this.f16475x)) {
            return;
        }
        m19366n(this.f16475x);
        this.f16469r.m18124M(this.f16467p);
    }

    /* JADX INFO: renamed from: L */
    public final void m19360L() {
        if (this.f16473v == null) {
            u9m u9mVar = new u9m(this.f16464m);
            this.f16473v = u9mVar;
            u9mVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.lam
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f14748a.m19358J();
                }
            });
        }
        this.f16473v.m23395g(this.f16458g);
        xdl0.M0(this.f16458g, false);
    }

    /* JADX INFO: renamed from: M */
    public void m19361M(List<IceBreakingQuestion> list) {
        if (vwb.J(list) || this.f16470s <= 0) {
            return;
        }
        this.f16475x.clear();
        this.f16475x.addAll(list);
        this.f16474w = 0;
        m19366n(list);
        mob0 mob0Var = this.f16469r;
        if (mob0Var == null) {
            m19353A();
        } else {
            mob0Var.m18124M(this.f16467p);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m19362N(List<IceBreakingQuestion> list) {
        this.f16466o.clear();
        Iterator<IceBreakingQuestion> it = list.iterator();
        while (it.hasNext()) {
            this.f16466o.add(new job0(it.next(), true, false));
        }
        if (this.f16466o.size() >= 3) {
            xdl0.M(this.f16458g, false);
        }
        this.f16470s = (xdl0.w0() - xdl0.F0()) - t100.d(405.0f);
        mob0 mob0Var = this.f16468q;
        if (mob0Var == null) {
            m19376z();
        } else {
            mob0Var.m18124M(this.f16466o);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m19363O() {
        ChatProfile chatProfileAo = CoreModule.c.f0.ao();
        List arrayList = chatProfileAo == null ? new ArrayList() : chatProfileAo.iceBreakingQuestions;
        final ArrayList arrayList2 = new ArrayList();
        vwb.z(this.f16466o, new e30() { // from class: l.kam
            public final void call(Object obj) {
                arrayList2.add(((job0) obj).m16040a());
            }
        });
        boolean zA = v19.a(arrayList2, arrayList);
        this.f16463l.setEnabled(!zA);
        this.f16463l.setAlpha(!zA ? 1.0f : 0.4f);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m19365m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m19365m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pam.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public final void m19366n(List<IceBreakingQuestion> list) {
        this.f16467p.clear();
        int i = this.f16470s;
        Iterator<job0> it = this.f16466o.iterator();
        int iM19368q = 0;
        while (it.hasNext()) {
            iM19368q += m19368q(it.next().m16040a().content);
        }
        int iD = t100.d(166.0f);
        if (iM19368q > iD) {
            i -= iM19368q - iD;
        }
        int iM19368q2 = 0;
        while (iM19368q2 < i) {
            IceBreakingQuestion iceBreakingQuestion = list.get(this.f16474w);
            iM19368q2 += m19368q(iceBreakingQuestion.content);
            if (iM19368q2 > i) {
                return;
            }
            this.f16474w = (this.f16474w + 1) % list.size();
            this.f16467p.add(new job0(iceBreakingQuestion, false, true));
        }
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m19364i1(dam damVar) {
        this.f16465n = damVar;
    }

    /* JADX INFO: renamed from: q */
    public final int m19368q(String str) {
        this.f16472u.setEmpty();
        this.f16471t.getTextBounds(str, 0, str.length(), this.f16472u);
        return (this.f16472u.height() * ((this.f16472u.width() / (xdl0.y0() - t100.d(100.0f))) + 1)) + t100.x;
    }

    /* JADX INFO: renamed from: r */
    public void m19369r() {
        SpannableString spannableString = new SpannableString("设置 3 个你感兴趣的问题");
        spannableString.setSpan(new ForegroundColorSpan(-43979), 2, 4, 33);
        this.f16455d.setText(spannableString);
        this.f16463l.setEnabled(false);
        this.f16463l.setAlpha(0.4f);
        xdl0.E0(this.f16454c, new View.OnClickListener() { // from class: l.gam
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11321a.m19339F(view);
            }
        });
        xdl0.E0(this.f16463l, new View.OnClickListener() { // from class: l.ham
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11955a.m19340G(view);
            }
        });
        xdl0.E0(this.f16458g, new View.OnClickListener() { // from class: l.iam
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13126a.m19341H(view);
            }
        });
        xdl0.E0(this.f16461j, new View.OnClickListener() { // from class: l.jam
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13655a.m19342I(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final int m19370s(String str) {
        if (TextUtils.isEmpty(str.trim())) {
            return 1;
        }
        if (qib0.Z.K(str) || qib0.Z.P(str)) {
            return 3;
        }
        return m19371u(str) ? 2 : 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m19371u(String str) {
        if (vwb.J(this.f16466o)) {
            return false;
        }
        Iterator<job0> it = this.f16466o.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().m16040a().content, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m19372v(CharSequence charSequence) {
        xdl0.M(this.f16458g, true);
        this.f16458g.postDelayed(new Runnable() { // from class: l.nam
            @Override // java.lang.Runnable
            public final void run() {
                this.f15906a.m19354B();
            }
        }, 40L);
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        String string = charSequence.toString();
        int iM19370s = m19370s(string);
        if (iM19370s != 0) {
            if (iM19370s == 2) {
                lsi0.y("新的问题不能和已有的重复");
            } else if (iM19370s == 3) {
                lsi0.y("请修改内容后重试");
            }
            return false;
        }
        IceBreakingQuestion iceBreakingQuestionNew_ = IceBreakingQuestion.new_();
        iceBreakingQuestionNew_.content = string;
        this.f16466o.add(new job0(iceBreakingQuestionNew_, true, false));
        if (this.f16468q == null) {
            m19376z();
        }
        this.f16468q.m18124M(this.f16466o);
        IceBreakingQuestionEditAct iceBreakingQuestionEditAct = this.f16464m;
        if (iceBreakingQuestionEditAct != null) {
            iceBreakingQuestionEditAct.hideInput();
        }
        m19363O();
        xdl0.M(this.f16458g, this.f16466o.size() < 3);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public List<IceBreakingQuestion> m19373w() {
        ArrayList arrayList = new ArrayList();
        for (final job0 job0Var : this.f16466o) {
            IceBreakingQuestion iceBreakingQuestionNew_ = IceBreakingQuestion.new_();
            IceBreakingQuestion iceBreakingQuestion = (IceBreakingQuestion) vwb.r(this.f16475x, new w9j() { // from class: l.mam
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((IceBreakingQuestion) obj).content, job0Var.m16040a().content));
                }
            });
            iceBreakingQuestionNew_.id = iceBreakingQuestion == null ? "0" : iceBreakingQuestion.id;
            iceBreakingQuestionNew_.content = job0Var.m16040a().content;
            arrayList.add(iceBreakingQuestionNew_);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public boolean m19374x() {
        VButton vButton = this.f16463l;
        return vButton != null && vButton.isEnabled();
    }

    /* JADX INFO: renamed from: y */
    public void m19375y() {
        xdl0.M(this.f16459h, true);
        m19363O();
    }

    /* JADX INFO: renamed from: z */
    public final void m19376z() {
        mob0 mob0Var = new mob0(this.f16466o);
        this.f16468q = mob0Var;
        mob0Var.m18122K(new f30() { // from class: l.fam
            public final void call(Object obj, Object obj2) {
                this.f10213a.m19355C((Integer) obj, (job0) obj2);
            }
        });
        this.f16457f.addItemDecoration(new zlf0(0, 0, t100.j, 0));
        this.f16457f.setAdapter(this.f16468q);
    }

    public void destroy() {
    }
}

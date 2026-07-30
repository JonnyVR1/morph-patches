package p149l;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatProfile;
import com.p046p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p046p1.mobile.putong.core.p053ui.messages.question.IceBreakingQuestionEditAct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VButton;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class oam implements s7m<dam> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f142815a;

    /* JADX INFO: renamed from: b */
    public VFrame f142816b;

    /* JADX INFO: renamed from: c */
    public VImage f142817c;

    /* JADX INFO: renamed from: d */
    public VText f142818d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f142819e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f142820f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f142821g;

    /* JADX INFO: renamed from: h */
    public VText f142822h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f142823i;

    /* JADX INFO: renamed from: j */
    public VText f142824j;

    /* JADX INFO: renamed from: k */
    public RecyclerView f142825k;

    /* JADX INFO: renamed from: l */
    public VButton f142826l;

    /* JADX INFO: renamed from: m */
    public final IceBreakingQuestionEditAct f142827m;

    /* JADX INFO: renamed from: n */
    public dam f142828n;

    /* JADX INFO: renamed from: q */
    public mob0 f142831q;

    /* JADX INFO: renamed from: r */
    public mob0 f142832r;

    /* JADX INFO: renamed from: t */
    public final Paint f142834t;

    /* JADX INFO: renamed from: u */
    public final Rect f142835u;

    /* JADX INFO: renamed from: v */
    public u9m f142836v;

    /* JADX INFO: renamed from: w */
    public int f142837w;

    /* JADX INFO: renamed from: x */
    public final List<IceBreakingQuestion> f142838x;

    /* JADX INFO: renamed from: o */
    public final List<job0> f142829o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final List<job0> f142830p = new ArrayList();

    /* JADX INFO: renamed from: s */
    public int f142833s = 0;

    public oam(IceBreakingQuestionEditAct iceBreakingQuestionEditAct) {
        Paint paint = new Paint();
        this.f142834t = paint;
        this.f142835u = new Rect();
        this.f142838x = new ArrayList();
        this.f142827m = iceBreakingQuestionEditAct;
        paint.setTextSize(t100.m186892f(14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m163301F(View view) {
        this.f142827m.lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m163302G(View view) {
        this.f142828n.m110629s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m163303H(View view) {
        m163321L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m163304I(View view) {
        m163320K();
    }

    /* JADX INFO: renamed from: A */
    public final void m163315A() {
        mob0 mob0Var = new mob0(this.f142830p);
        this.f142832r = mob0Var;
        mob0Var.m155666L(new f30() { // from class: l.eam
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f90214a.m163318E((Integer) obj, (job0) obj2);
            }
        });
        RecyclerView recyclerView = this.f142825k;
        int i = t100.f167261j;
        recyclerView.addItemDecoration(new zlf0(0, 0, i, i));
        this.f142825k.setAdapter(this.f142832r);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m163316B() {
        u9m u9mVar = this.f142836v;
        if (u9mVar != null) {
            u9mVar.m192564c();
        }
        this.f142827m.hideInput();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m163317C(Integer num, job0 job0Var) {
        job0 job0VarRemove = this.f142829o.remove(num.intValue());
        job0VarRemove.m142426d(false);
        this.f142831q.m155667M(this.f142829o);
        xdl0.m208344M(this.f142821g, true);
        m163335y();
        m163324O();
        if (job0Var.m142425c()) {
            this.f142830p.add(job0VarRemove);
            mob0 mob0Var = this.f142832r;
            if (mob0Var != null) {
                mob0Var.m155667M(this.f142830p);
            }
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f142827m;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m163318E(Integer num, job0 job0Var) {
        if (this.f142829o.size() >= 3) {
            lsi0.m151595y("最多设置3个话题");
            return;
        }
        if (m163331u(job0Var.m142423a().content)) {
            lsi0.m151595y("新的问题不能和已有的重复");
            return;
        }
        job0 job0VarRemove = this.f142830p.remove(num.intValue());
        job0VarRemove.m142426d(true);
        this.f142829o.add(job0VarRemove);
        this.f142832r.m155667M(this.f142830p);
        this.f142831q.m155667M(this.f142829o);
        m163324O();
        if (this.f142829o.size() >= 3) {
            this.f142827m.hideInput();
            xdl0.m208344M(this.f142821g, false);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m163319J() {
        if (m163332v(this.f142836v.m192565d())) {
            ((EditText) this.f142836v.getContentView().findViewById(y4c0.f195956E0)).setText("");
        }
        m163335y();
    }

    /* JADX INFO: renamed from: K */
    public final void m163320K() {
        if (this.f142832r == null || vwb.m200296J(this.f142838x)) {
            return;
        }
        m163326n(this.f142838x);
        this.f142832r.m155667M(this.f142830p);
    }

    /* JADX INFO: renamed from: L */
    public final void m163321L() {
        if (this.f142836v == null) {
            u9m u9mVar = new u9m(this.f142827m);
            this.f142836v = u9mVar;
            u9mVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.lam
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f127224a.m163319J();
                }
            });
        }
        this.f142836v.m192568g(this.f142821g);
        xdl0.m208345M0(this.f142821g, false);
    }

    /* JADX INFO: renamed from: M */
    public void m163322M(List<IceBreakingQuestion> list) {
        if (vwb.m200296J(list) || this.f142833s <= 0) {
            return;
        }
        this.f142838x.clear();
        this.f142838x.addAll(list);
        this.f142837w = 0;
        m163326n(list);
        mob0 mob0Var = this.f142832r;
        if (mob0Var == null) {
            m163315A();
        } else {
            mob0Var.m155667M(this.f142830p);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m163323N(List<IceBreakingQuestion> list) {
        this.f142829o.clear();
        Iterator<IceBreakingQuestion> it = list.iterator();
        while (it.hasNext()) {
            this.f142829o.add(new job0(it.next(), true, false));
        }
        if (this.f142829o.size() >= 3) {
            xdl0.m208344M(this.f142821g, false);
        }
        this.f142833s = (xdl0.m208408w0() - xdl0.m208331F0()) - t100.m186890d(405.0f);
        mob0 mob0Var = this.f142831q;
        if (mob0Var == null) {
            m163336z();
        } else {
            mob0Var.m155667M(this.f142829o);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m163324O() {
        ChatProfile chatProfileM32901ao = CoreModule.f17545c.f19642f0.m32901ao();
        List arrayList = chatProfileM32901ao == null ? new ArrayList() : chatProfileM32901ao.iceBreakingQuestions;
        final ArrayList arrayList2 = new ArrayList();
        vwb.m200354z(this.f142829o, new e30() { // from class: l.kam
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList2.add(((job0) obj).m142423a());
            }
        });
        boolean zM196540a = v19.m196540a(arrayList2, arrayList);
        this.f142826l.setEnabled(!zM196540a);
        this.f142826l.setAlpha(!zM196540a ? 1.0f : 0.4f);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m163325m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m163325m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pam.m168096b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public final void m163326n(List<IceBreakingQuestion> list) {
        this.f142830p.clear();
        int i = this.f142833s;
        Iterator<job0> it = this.f142829o.iterator();
        int iM163328q = 0;
        while (it.hasNext()) {
            iM163328q += m163328q(it.next().m142423a().content);
        }
        int iM186890d = t100.m186890d(166.0f);
        if (iM163328q > iM186890d) {
            i -= iM163328q - iM186890d;
        }
        int iM163328q2 = 0;
        while (iM163328q2 < i) {
            IceBreakingQuestion iceBreakingQuestion = list.get(this.f142837w);
            iM163328q2 += m163328q(iceBreakingQuestion.content);
            if (iM163328q2 > i) {
                return;
            }
            this.f142837w = (this.f142837w + 1) % list.size();
            this.f142830p.add(new job0(iceBreakingQuestion, false, true));
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(dam damVar) {
        this.f142828n = damVar;
    }

    /* JADX INFO: renamed from: q */
    public final int m163328q(String str) {
        this.f142835u.setEmpty();
        this.f142834t.getTextBounds(str, 0, str.length(), this.f142835u);
        return (this.f142835u.height() * ((this.f142835u.width() / (xdl0.m208412y0() - t100.m186890d(100.0f))) + 1)) + t100.f167275x;
    }

    /* JADX INFO: renamed from: r */
    public void m163329r() {
        SpannableString spannableString = new SpannableString("设置 3 个你感兴趣的问题");
        spannableString.setSpan(new ForegroundColorSpan(-43979), 2, 4, 33);
        this.f142818d.setText(spannableString);
        this.f142826l.setEnabled(false);
        this.f142826l.setAlpha(0.4f);
        xdl0.m208329E0(this.f142817c, new View.OnClickListener() { // from class: l.gam
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101682a.m163301F(view);
            }
        });
        xdl0.m208329E0(this.f142826l, new View.OnClickListener() { // from class: l.ham
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106760a.m163302G(view);
            }
        });
        xdl0.m208329E0(this.f142821g, new View.OnClickListener() { // from class: l.iam
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112314a.m163303H(view);
            }
        });
        xdl0.m208329E0(this.f142824j, new View.OnClickListener() { // from class: l.jam
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117103a.m163304I(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final int m163330s(String str) {
        if (TextUtils.isEmpty(str.trim())) {
            return 1;
        }
        if (qib0.f154711Z.m119125K(str) || qib0.f154711Z.m119130P(str)) {
            return 3;
        }
        return m163331u(str) ? 2 : 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m163331u(String str) {
        if (vwb.m200296J(this.f142829o)) {
            return false;
        }
        Iterator<job0> it = this.f142829o.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().m142423a().content, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m163332v(CharSequence charSequence) {
        xdl0.m208344M(this.f142821g, true);
        this.f142821g.postDelayed(new Runnable() { // from class: l.nam
            @Override // java.lang.Runnable
            public final void run() {
                this.f137920a.m163316B();
            }
        }, 40L);
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        String string = charSequence.toString();
        int iM163330s = m163330s(string);
        if (iM163330s != 0) {
            if (iM163330s == 2) {
                lsi0.m151595y("新的问题不能和已有的重复");
            } else if (iM163330s == 3) {
                lsi0.m151595y("请修改内容后重试");
            }
            return false;
        }
        IceBreakingQuestion iceBreakingQuestionNew_ = IceBreakingQuestion.new_();
        iceBreakingQuestionNew_.content = string;
        this.f142829o.add(new job0(iceBreakingQuestionNew_, true, false));
        if (this.f142831q == null) {
            m163336z();
        }
        this.f142831q.m155667M(this.f142829o);
        IceBreakingQuestionEditAct iceBreakingQuestionEditAct = this.f142827m;
        if (iceBreakingQuestionEditAct != null) {
            iceBreakingQuestionEditAct.hideInput();
        }
        m163324O();
        xdl0.m208344M(this.f142821g, this.f142829o.size() < 3);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public List<IceBreakingQuestion> m163333w() {
        ArrayList arrayList = new ArrayList();
        for (final job0 job0Var : this.f142829o) {
            IceBreakingQuestion iceBreakingQuestionNew_ = IceBreakingQuestion.new_();
            IceBreakingQuestion iceBreakingQuestion = (IceBreakingQuestion) vwb.m200346r(this.f142838x, new w9j() { // from class: l.mam
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((IceBreakingQuestion) obj).content, job0Var.m142423a().content));
                }
            });
            iceBreakingQuestionNew_.f20420id = iceBreakingQuestion == null ? "0" : iceBreakingQuestion.f20420id;
            iceBreakingQuestionNew_.content = job0Var.m142423a().content;
            arrayList.add(iceBreakingQuestionNew_);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public boolean m163334x() {
        VButton vButton = this.f142826l;
        return vButton != null && vButton.isEnabled();
    }

    /* JADX INFO: renamed from: y */
    public void m163335y() {
        xdl0.m208344M(this.f142822h, true);
        m163324O();
    }

    /* JADX INFO: renamed from: z */
    public final void m163336z() {
        mob0 mob0Var = new mob0(this.f142829o);
        this.f142831q = mob0Var;
        mob0Var.m155665K(new f30() { // from class: l.fam
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f96616a.m163317C((Integer) obj, (job0) obj2);
            }
        });
        this.f142820f.addItemDecoration(new zlf0(0, 0, t100.f167261j, 0));
        this.f142820f.setAdapter(this.f142831q);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}

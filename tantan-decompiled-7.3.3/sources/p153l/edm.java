package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatProfile;
import com.p051p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p051p1.mobile.putong.core.p058ui.messages.question.IceBreakingQuestionEditAct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VButton;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class edm implements iam<tcm> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f93531a;

    /* JADX INFO: renamed from: b */
    public VFrame f93532b;

    /* JADX INFO: renamed from: c */
    public VImage f93533c;

    /* JADX INFO: renamed from: d */
    public VText f93534d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f93535e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f93536f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f93537g;

    /* JADX INFO: renamed from: h */
    public VText f93538h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f93539i;

    /* JADX INFO: renamed from: j */
    public VText f93540j;

    /* JADX INFO: renamed from: k */
    public RecyclerView f93541k;

    /* JADX INFO: renamed from: l */
    public VButton f93542l;

    /* JADX INFO: renamed from: m */
    public final IceBreakingQuestionEditAct f93543m;

    /* JADX INFO: renamed from: n */
    public tcm f93544n;

    /* JADX INFO: renamed from: q */
    public qwb0 f93547q;

    /* JADX INFO: renamed from: r */
    public qwb0 f93548r;

    /* JADX INFO: renamed from: t */
    public final Paint f93550t;

    /* JADX INFO: renamed from: u */
    public final Rect f93551u;

    /* JADX INFO: renamed from: v */
    public kcm f93552v;

    /* JADX INFO: renamed from: w */
    public int f93553w;

    /* JADX INFO: renamed from: x */
    public final List<IceBreakingQuestion> f93554x;

    /* JADX INFO: renamed from: o */
    public final List<nwb0> f93545o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final List<nwb0> f93546p = new ArrayList();

    /* JADX INFO: renamed from: s */
    public int f93549s = 0;

    public edm(IceBreakingQuestionEditAct iceBreakingQuestionEditAct) {
        Paint paint = new Paint();
        this.f93550t = paint;
        this.f93551u = new Rect();
        this.f93554x = new ArrayList();
        this.f93543m = iceBreakingQuestionEditAct;
        paint.setTextSize(qa00.m175861f(14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m120467F(View view) {
        this.f93543m.lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m120468G(View view) {
        this.f93544n.m190483s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m120469H(View view) {
        m120487L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m120470I(View view) {
        m120486K();
    }

    /* JADX INFO: renamed from: A */
    public final void m120481A() {
        qwb0 qwb0Var = new qwb0(this.f93546p);
        this.f93548r = qwb0Var;
        qwb0Var.m178469L(new z20() { // from class: l.ucm
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f178451a.m120484E((Integer) obj, (nwb0) obj2);
            }
        });
        RecyclerView recyclerView = this.f93541k;
        int i = qa00.f156323j;
        recyclerView.addItemDecoration(new iuf0(0, 0, i, i));
        this.f93541k.setAdapter(this.f93548r);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m120482B() {
        kcm kcmVar = this.f93552v;
        if (kcmVar != null) {
            kcmVar.m149118c();
        }
        this.f93543m.hideInput();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m120483C(Integer num, nwb0 nwb0Var) {
        nwb0 nwb0VarRemove = this.f93545o.remove(num.intValue());
        nwb0VarRemove.m164984d(false);
        this.f93547q.m178470M(this.f93545o);
        bnl0.m105524M(this.f93537g, true);
        m120501y();
        m120490O();
        if (nwb0Var.m164983c()) {
            this.f93546p.add(nwb0VarRemove);
            qwb0 qwb0Var = this.f93548r;
            if (qwb0Var != null) {
                qwb0Var.m178470M(this.f93546p);
            }
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f93543m;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m120484E(Integer num, nwb0 nwb0Var) {
        if (this.f93545o.size() >= 3) {
            o1j0.m165651y("最多设置3个话题");
            return;
        }
        if (m120497u(nwb0Var.m164981a().content)) {
            o1j0.m165651y("新的问题不能和已有的重复");
            return;
        }
        nwb0 nwb0VarRemove = this.f93546p.remove(num.intValue());
        nwb0VarRemove.m164984d(true);
        this.f93545o.add(nwb0VarRemove);
        this.f93548r.m178470M(this.f93546p);
        this.f93547q.m178470M(this.f93545o);
        m120490O();
        if (this.f93545o.size() >= 3) {
            this.f93543m.hideInput();
            bnl0.m105524M(this.f93537g, false);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m120485J() {
        if (m120498v(this.f93552v.m149119d())) {
            ((EditText) this.f93552v.getContentView().findViewById(edc0.f93191E0)).setText("");
        }
        m120501y();
    }

    /* JADX INFO: renamed from: K */
    public final void m120486K() {
        if (this.f93548r == null || jyb.m147479J(this.f93554x)) {
            return;
        }
        m120492n(this.f93554x);
        this.f93548r.m178470M(this.f93546p);
    }

    /* JADX INFO: renamed from: L */
    public final void m120487L() {
        if (this.f93552v == null) {
            kcm kcmVar = new kcm(this.f93543m);
            this.f93552v = kcmVar;
            kcmVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.bdm
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f76275a.m120485J();
                }
            });
        }
        this.f93552v.m149122g(this.f93537g);
        bnl0.m105525M0(this.f93537g, false);
    }

    /* JADX INFO: renamed from: M */
    public void m120488M(List<IceBreakingQuestion> list) {
        if (jyb.m147479J(list) || this.f93549s <= 0) {
            return;
        }
        this.f93554x.clear();
        this.f93554x.addAll(list);
        this.f93553w = 0;
        m120492n(list);
        qwb0 qwb0Var = this.f93548r;
        if (qwb0Var == null) {
            m120481A();
        } else {
            qwb0Var.m178470M(this.f93546p);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m120489N(List<IceBreakingQuestion> list) {
        this.f93545o.clear();
        Iterator<IceBreakingQuestion> it = list.iterator();
        while (it.hasNext()) {
            this.f93545o.add(new nwb0(it.next(), true, false));
        }
        if (this.f93545o.size() >= 3) {
            bnl0.m105524M(this.f93537g, false);
        }
        this.f93549s = (bnl0.m105588w0() - bnl0.m105511F0()) - qa00.m175859d(405.0f);
        qwb0 qwb0Var = this.f93547q;
        if (qwb0Var == null) {
            m120502z();
        } else {
            qwb0Var.m178470M(this.f93545o);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m120490O() {
        ChatProfile chatProfileM33904ao = CoreModule.f18264c.f20384f0.m33904ao();
        List arrayList = chatProfileM33904ao == null ? new ArrayList() : chatProfileM33904ao.iceBreakingQuestions;
        final ArrayList arrayList2 = new ArrayList();
        jyb.m147537z(this.f93545o, new y20() { // from class: l.adm
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList2.add(((nwb0) obj).m164981a());
            }
        });
        boolean zM119254a = e39.m119254a(arrayList2, arrayList);
        this.f93542l.setEnabled(!zM119254a);
        this.f93542l.setAlpha(!zM119254a ? 1.0f : 0.4f);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m120491m(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public View m120491m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fdm.m125104b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public final void m120492n(List<IceBreakingQuestion> list) {
        this.f93546p.clear();
        int i = this.f93549s;
        Iterator<nwb0> it = this.f93545o.iterator();
        int iM120494q = 0;
        while (it.hasNext()) {
            iM120494q += m120494q(it.next().m164981a().content);
        }
        int iM175859d = qa00.m175859d(166.0f);
        if (iM120494q > iM175859d) {
            i -= iM120494q - iM175859d;
        }
        int iM120494q2 = 0;
        while (iM120494q2 < i) {
            IceBreakingQuestion iceBreakingQuestion = list.get(this.f93553w);
            iM120494q2 += m120494q(iceBreakingQuestion.content);
            if (iM120494q2 > i) {
                return;
            }
            this.f93553w = (this.f93553w + 1) % list.size();
            this.f93546p.add(new nwb0(iceBreakingQuestion, false, true));
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(tcm tcmVar) {
        this.f93544n = tcmVar;
    }

    /* JADX INFO: renamed from: q */
    public final int m120494q(String str) {
        this.f93551u.setEmpty();
        this.f93550t.getTextBounds(str, 0, str.length(), this.f93551u);
        return (this.f93551u.height() * ((this.f93551u.width() / (bnl0.m105592y0() - qa00.m175859d(100.0f))) + 1)) + qa00.f156337x;
    }

    /* JADX INFO: renamed from: r */
    public void m120495r() {
        SpannableString spannableString = new SpannableString("设置 3 个你感兴趣的问题");
        spannableString.setSpan(new ForegroundColorSpan(-43979), 2, 4, 33);
        this.f93534d.setText(spannableString);
        this.f93542l.setEnabled(false);
        this.f93542l.setAlpha(0.4f);
        bnl0.m105509E0(this.f93533c, new View.OnClickListener() { // from class: l.wcm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188484a.m120467F(view);
            }
        });
        bnl0.m105509E0(this.f93542l, new View.OnClickListener() { // from class: l.xcm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193352a.m120468G(view);
            }
        });
        bnl0.m105509E0(this.f93537g, new View.OnClickListener() { // from class: l.ycm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198524a.m120469H(view);
            }
        });
        bnl0.m105509E0(this.f93540j, new View.OnClickListener() { // from class: l.zcm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203809a.m120470I(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final int m120496s(String str) {
        if (TextUtils.isEmpty(str.trim())) {
            return 1;
        }
        if (uqb0.f180394Z.m95954K(str) || uqb0.f180394Z.m95959P(str)) {
            return 3;
        }
        return m120497u(str) ? 2 : 0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m120497u(String str) {
        if (jyb.m147479J(this.f93545o)) {
            return false;
        }
        Iterator<nwb0> it = this.f93545o.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().m164981a().content, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m120498v(CharSequence charSequence) {
        bnl0.m105524M(this.f93537g, true);
        this.f93537g.postDelayed(new Runnable() { // from class: l.ddm
            @Override // java.lang.Runnable
            public final void run() {
                this.f87947a.m120482B();
            }
        }, 40L);
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        String string = charSequence.toString();
        int iM120496s = m120496s(string);
        if (iM120496s != 0) {
            if (iM120496s == 2) {
                o1j0.m165651y("新的问题不能和已有的重复");
            } else if (iM120496s == 3) {
                o1j0.m165651y("请修改内容后重试");
            }
            return false;
        }
        IceBreakingQuestion iceBreakingQuestionNew_ = IceBreakingQuestion.new_();
        iceBreakingQuestionNew_.content = string;
        this.f93545o.add(new nwb0(iceBreakingQuestionNew_, true, false));
        if (this.f93547q == null) {
            m120502z();
        }
        this.f93547q.m178470M(this.f93545o);
        IceBreakingQuestionEditAct iceBreakingQuestionEditAct = this.f93543m;
        if (iceBreakingQuestionEditAct != null) {
            iceBreakingQuestionEditAct.hideInput();
        }
        m120490O();
        bnl0.m105524M(this.f93537g, this.f93545o.size() < 3);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public List<IceBreakingQuestion> m120499w() {
        ArrayList arrayList = new ArrayList();
        for (final nwb0 nwb0Var : this.f93545o) {
            IceBreakingQuestion iceBreakingQuestionNew_ = IceBreakingQuestion.new_();
            IceBreakingQuestion iceBreakingQuestion = (IceBreakingQuestion) jyb.m147529r(this.f93554x, new qcj() { // from class: l.cdm
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((IceBreakingQuestion) obj).content, nwb0Var.m164981a().content));
                }
            });
            iceBreakingQuestionNew_.f21162id = iceBreakingQuestion == null ? "0" : iceBreakingQuestion.f21162id;
            iceBreakingQuestionNew_.content = nwb0Var.m164981a().content;
            arrayList.add(iceBreakingQuestionNew_);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public boolean m120500x() {
        VButton vButton = this.f93542l;
        return vButton != null && vButton.isEnabled();
    }

    /* JADX INFO: renamed from: y */
    public void m120501y() {
        bnl0.m105524M(this.f93538h, true);
        m120490O();
    }

    /* JADX INFO: renamed from: z */
    public final void m120502z() {
        qwb0 qwb0Var = new qwb0(this.f93545o);
        this.f93547q = qwb0Var;
        qwb0Var.m178468K(new z20() { // from class: l.vcm
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f183474a.m120483C((Integer) obj, (nwb0) obj2);
            }
        });
        this.f93536f.addItemDecoration(new iuf0(0, 0, qa00.f156323j, 0));
        this.f93536f.setAdapter(this.f93547q);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}

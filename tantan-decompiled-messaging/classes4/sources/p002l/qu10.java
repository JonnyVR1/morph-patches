package p002l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopEditInfo;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.data.Answer;
import java.util.List;
import l.ru10;
import l.s7m;
import l.t100;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.xh0;
import l.zvf0;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qu10 implements s7m<iu10> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f18225a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f18226b;

    /* JADX INFO: renamed from: c */
    public VText f18227c;

    /* JADX INFO: renamed from: d */
    public VText f18228d;

    /* JADX INFO: renamed from: e */
    public Act f18229e;

    /* JADX INFO: renamed from: f */
    public du10 f18230f;

    /* JADX INFO: renamed from: g */
    public iu10 f18231g;

    /* JADX INFO: renamed from: h */
    public boolean f18232h = false;

    public qu10(Act act) {
        this.f18229e = act;
    }

    /* JADX INFO: renamed from: l */
    private void m21565l() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m21566C0());
        linearLayoutManager.setOrientation(1);
        this.f18226b.setLayoutManager(linearLayoutManager);
        du10 du10Var = new du10();
        this.f18230f = du10Var;
        this.f18226b.setAdapter(du10Var);
        this.f18230f.m12023I(new du10.InterfaceC0534a() { // from class: l.nu10
            @Override // p002l.du10.InterfaceC0534a
            /* JADX INFO: renamed from: a */
            public final void mo12025a(Question question, Answer answer) {
                this.f16196a.m21571n(question, answer);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m21566C0() {
        return this.f18229e;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m21568j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m21568j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ru10.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m21567i1(iu10 iu10Var) {
        this.f18231g = iu10Var;
    }

    /* JADX INFO: renamed from: m */
    public void m21570m() {
        xdl0.E0(this.f18227c, new View.OnClickListener() { // from class: l.ku10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14512a.m21572p(view);
            }
        });
        xdl0.E0(this.f18228d, new View.OnClickListener() { // from class: l.lu10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15067a.m21573q(view);
            }
        });
        xdl0.E0(this.f18225a, new View.OnClickListener() { // from class: l.mu10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15633a.m21577v(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m21571n(Question question, Answer answer) {
        LoopInputType loopInputType = LoopInputType.QUESTION_EDIT;
        LoopEditInfo createTagInfo = LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 500, "");
        createTagInfo.setSubTitle(question.text, true).setEditObjKey(answer.question).setDefaultContent(answer.value).setEmptyInput(true);
        this.f18229e.startActivityForResult(ProfileLoopCreateTagAct.m2131b2(createTagInfo, this.f18229e), loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m21572p(View view) {
        LoopFragmentFactory.m1947I(this.f18231g.f13409a, this.f18229e, LoopInputType.QUESTION_CHOICE);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m21573q(View view) {
        zvf0.r("e_edit_answer_done", this.f18229e.pageId());
        this.f18231g.m15395n0();
    }

    /* JADX INFO: renamed from: r */
    public void m21574r() {
        this.f18228d.setTypeface((Typeface) null, 1);
        this.f18227c.setTypeface((Typeface) null, 1);
        this.f18228d.setEnabled(false);
        Drawable drawable = this.f18229e.getResources().getDrawable(x2c0.ul);
        int i = t100.j;
        drawable.setBounds(0, 0, i, i);
        this.f18227c.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f18227c.setCompoundDrawablePadding(4);
        m21565l();
        m21570m();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m21575s(View view) {
        this.f18231g.m15395n0();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m21576u(View view) {
        this.f18229e.finish();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m21577v(View view) {
        if (this.f18232h) {
            new xh0.a(act()).s("修改未保存").j("是否保存本次修改？").g(false).r("保存").o(new View.OnClickListener() { // from class: l.ou10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f16792a.m21575s(view2);
                }
            }).f("不保存").c(new View.OnClickListener() { // from class: l.pu10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f17650a.m21576u(view2);
                }
            }).a().g();
        } else {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m21578w() {
        int iW0 = ((xdl0.w0() - this.f18226b.getHeight()) - this.f18225a.getHeight()) - xdl0.F0();
        int iD = t100.d(100.0f) + this.f18227c.getHeight();
        int height = this.f18225a.getHeight() + t100.h;
        RecyclerView recyclerView = this.f18226b;
        if (iW0 < iD) {
            xdl0.C0(recyclerView, -1);
            xdl0.X(this.f18226b, height);
            xdl0.U(this.f18226b, iD);
        } else {
            xdl0.X(recyclerView, 0);
            xdl0.C0(this.f18226b, -2);
            xdl0.U(this.f18226b, 0);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m21579x(List<Answer> list, boolean z) {
        if (vwb.J(list)) {
            return;
        }
        this.f18230f.m12024J(list);
        this.f18230f.notifyDataSetChanged();
        this.f18232h = z;
        if (z) {
            this.f18228d.setBackgroundResource(x2c0.t);
            this.f18228d.setTextColor(this.f18229e.getResources().getColor(w0c0.b2));
            this.f18228d.setEnabled(true);
        }
        m21580y();
    }

    /* JADX INFO: renamed from: y */
    public final void m21580y() {
        this.f18226b.post(new Runnable() { // from class: l.ju10
            @Override // java.lang.Runnable
            public final void run() {
                this.f14015a.m21578w();
            }
        });
    }

    public void destroy() {
    }
}

package p153l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopEditInfo;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p051p1.mobile.putong.data.Answer;
import java.util.List;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public class y220 implements iam<q220> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f197168a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f197169b;

    /* JADX INFO: renamed from: c */
    public VText f197170c;

    /* JADX INFO: renamed from: d */
    public VText f197171d;

    /* JADX INFO: renamed from: e */
    public Act f197172e;

    /* JADX INFO: renamed from: f */
    public l220 f197173f;

    /* JADX INFO: renamed from: g */
    public q220 f197174g;

    /* JADX INFO: renamed from: h */
    public boolean f197175h = false;

    public y220(Act act) {
        this.f197172e = act;
    }

    /* JADX INFO: renamed from: l */
    private void m214020l() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        this.f197169b.setLayoutManager(linearLayoutManager);
        l220 l220Var = new l220();
        this.f197173f = l220Var;
        this.f197169b.setAdapter(l220Var);
        this.f197173f.m152554I(new l220.InterfaceC18335a() { // from class: l.v220
            @Override // p153l.l220.InterfaceC18335a
            /* JADX INFO: renamed from: a */
            public final void mo152556a(Question question, Answer answer) {
                this.f182065a.m214024n(question, answer);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f197172e;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m214021j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m214021j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z220.m218386b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(q220 q220Var) {
        this.f197174g = q220Var;
    }

    /* JADX INFO: renamed from: m */
    public void m214023m() {
        bnl0.m105509E0(this.f197170c, new View.OnClickListener() { // from class: l.s220
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165853a.m214025p(view);
            }
        });
        bnl0.m105509E0(this.f197171d, new View.OnClickListener() { // from class: l.t220
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171710a.m214026q(view);
            }
        });
        bnl0.m105509E0(this.f197168a, new View.OnClickListener() { // from class: l.u220
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177174a.m214030v(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m214024n(Question question, Answer answer) {
        LoopInputType loopInputType = LoopInputType.QUESTION_EDIT;
        LoopEditInfo createTagInfo = LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 500, "");
        createTagInfo.setSubTitle(question.text, true).setEditObjKey(answer.question).setDefaultContent(answer.value).setEmptyInput(true);
        this.f197172e.startActivityForResult(ProfileLoopCreateTagAct.m52821c2(createTagInfo, this.f197172e), loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m214025p(View view) {
        LoopFragmentFactory.m52648I(this.f197174g.f155267a, this.f197172e, LoopInputType.QUESTION_CHOICE);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m214026q(View view) {
        i4g0.m138520r("e_edit_answer_done", this.f197172e.pageId());
        this.f197174g.m174986n0();
    }

    /* JADX INFO: renamed from: r */
    public void m214027r() {
        this.f197171d.setTypeface(null, 1);
        this.f197170c.setTypeface(null, 1);
        this.f197171d.setEnabled(false);
        Drawable drawable = this.f197172e.getResources().getDrawable(dbc0.f87093im);
        int i = qa00.f156323j;
        drawable.setBounds(0, 0, i, i);
        this.f197170c.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f197170c.setCompoundDrawablePadding(4);
        m214020l();
        m214023m();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m214028s(View view) {
        this.f197174g.m174986n0();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m214029u(View view) {
        this.f197172e.m48999H2();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m214030v(View view) {
        if (this.f197175h) {
            new th0.C20312a(getAct()).m191160s("修改未保存").m191151j("是否保存本次修改？").m191148g(false).m191159r("保存").m191156o(new View.OnClickListener() { // from class: l.w220
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f186866a.m214028s(view2);
                }
            }).m191147f("不保存").m191144c(new View.OnClickListener() { // from class: l.x220
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f192114a.m214029u(view2);
                }
            }).m191142a().m191141g();
        } else {
            getAct().m48999H2();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m214031w() {
        int iM105588w0 = ((bnl0.m105588w0() - this.f197169b.getHeight()) - this.f197168a.getHeight()) - bnl0.m105511F0();
        int iM175859d = qa00.m175859d(100.0f) + this.f197170c.getHeight();
        int height = this.f197168a.getHeight() + qa00.f156321h;
        RecyclerView recyclerView = this.f197169b;
        if (iM105588w0 < iM175859d) {
            bnl0.m105505C0(recyclerView, -1);
            bnl0.m105540X(this.f197169b, height);
            bnl0.m105537U(this.f197169b, iM175859d);
        } else {
            bnl0.m105540X(recyclerView, 0);
            bnl0.m105505C0(this.f197169b, -2);
            bnl0.m105537U(this.f197169b, 0);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m214032x(List<Answer> list, boolean z) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f197173f.m152555J(list);
        this.f197173f.notifyDataSetChanged();
        this.f197175h = z;
        if (z) {
            this.f197171d.setBackgroundResource(dbc0.f87465u);
            this.f197171d.setTextColor(this.f197172e.getResources().getColor(c9c0.f80407c2));
            this.f197171d.setEnabled(true);
        }
        m214033y();
    }

    /* JADX INFO: renamed from: y */
    public final void m214033y() {
        this.f197169b.post(new Runnable() { // from class: l.r220
            @Override // java.lang.Runnable
            public final void run() {
                this.f160872a.m214031w();
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}

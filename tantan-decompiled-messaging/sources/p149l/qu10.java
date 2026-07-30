package p149l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopEditInfo;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p046p1.mobile.putong.data.Answer;
import java.util.List;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public class qu10 implements s7m<iu10> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f156414a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f156415b;

    /* JADX INFO: renamed from: c */
    public VText f156416c;

    /* JADX INFO: renamed from: d */
    public VText f156417d;

    /* JADX INFO: renamed from: e */
    public Act f156418e;

    /* JADX INFO: renamed from: f */
    public du10 f156419f;

    /* JADX INFO: renamed from: g */
    public iu10 f156420g;

    /* JADX INFO: renamed from: h */
    public boolean f156421h = false;

    public qu10(Act act) {
        this.f156418e = act;
    }

    /* JADX INFO: renamed from: l */
    private void m176502l() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        this.f156415b.setLayoutManager(linearLayoutManager);
        du10 du10Var = new du10();
        this.f156419f = du10Var;
        this.f156415b.setAdapter(du10Var);
        this.f156419f.m113667I(new du10.InterfaceC16471a() { // from class: l.nu10
            @Override // p149l.du10.InterfaceC16471a
            /* JADX INFO: renamed from: a */
            public final void mo113669a(Question question, Answer answer) {
                this.f140561a.m176506n(question, answer);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f156418e;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m176503j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m176503j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ru10.m180849b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(iu10 iu10Var) {
        this.f156420g = iu10Var;
    }

    /* JADX INFO: renamed from: m */
    public void m176505m() {
        xdl0.m208329E0(this.f156416c, new View.OnClickListener() { // from class: l.ku10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124641a.m176507p(view);
            }
        });
        xdl0.m208329E0(this.f156417d, new View.OnClickListener() { // from class: l.lu10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130027a.m176508q(view);
            }
        });
        xdl0.m208329E0(this.f156414a, new View.OnClickListener() { // from class: l.mu10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135718a.m176512v(view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m176506n(Question question, Answer answer) {
        LoopInputType loopInputType = LoopInputType.QUESTION_EDIT;
        LoopEditInfo createTagInfo = LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 500, "");
        createTagInfo.setSubTitle(question.text, true).setEditObjKey(answer.question).setDefaultContent(answer.value).setEmptyInput(true);
        this.f156418e.startActivityForResult(ProfileLoopCreateTagAct.m51638b2(createTagInfo, this.f156418e), loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m176507p(View view) {
        LoopFragmentFactory.m51465I(this.f156420g.f114964a, this.f156418e, LoopInputType.QUESTION_CHOICE);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m176508q(View view) {
        zvf0.m220396r("e_edit_answer_done", this.f156418e.pageId());
        this.f156420g.m138350n0();
    }

    /* JADX INFO: renamed from: r */
    public void m176509r() {
        this.f156417d.setTypeface(null, 1);
        this.f156416c.setTypeface(null, 1);
        this.f156417d.setEnabled(false);
        Drawable drawable = this.f156418e.getResources().getDrawable(x2c0.f190624ul);
        int i = t100.f167261j;
        drawable.setBounds(0, 0, i, i);
        this.f156416c.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f156416c.setCompoundDrawablePadding(4);
        m176502l();
        m176505m();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m176510s(View view) {
        this.f156420g.m138350n0();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m176511u(View view) {
        this.f156418e.m47815F2();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m176512v(View view) {
        if (this.f156421h) {
            new xh0.C21150a(getAct()).m208740s("修改未保存").m208731j("是否保存本次修改？").m208728g(false).m208739r("保存").m208736o(new View.OnClickListener() { // from class: l.ou10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f145650a.m176510s(view2);
                }
            }).m208727f("不保存").m208724c(new View.OnClickListener() { // from class: l.pu10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f151239a.m176511u(view2);
                }
            }).m208722a().m208721g();
        } else {
            getAct().m47815F2();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m176513w() {
        int iM208408w0 = ((xdl0.m208408w0() - this.f156415b.getHeight()) - this.f156414a.getHeight()) - xdl0.m208331F0();
        int iM186890d = t100.m186890d(100.0f) + this.f156416c.getHeight();
        int height = this.f156414a.getHeight() + t100.f167259h;
        RecyclerView recyclerView = this.f156415b;
        if (iM208408w0 < iM186890d) {
            xdl0.m208325C0(recyclerView, -1);
            xdl0.m208360X(this.f156415b, height);
            xdl0.m208357U(this.f156415b, iM186890d);
        } else {
            xdl0.m208360X(recyclerView, 0);
            xdl0.m208325C0(this.f156415b, -2);
            xdl0.m208357U(this.f156415b, 0);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m176514x(List<Answer> list, boolean z) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f156419f.m113668J(list);
        this.f156419f.notifyDataSetChanged();
        this.f156421h = z;
        if (z) {
            this.f156417d.setBackgroundResource(x2c0.f190570t);
            this.f156417d.setTextColor(this.f156418e.getResources().getColor(w0c0.f183834b2));
            this.f156417d.setEnabled(true);
        }
        m176515y();
    }

    /* JADX INFO: renamed from: y */
    public final void m176515y() {
        this.f156415b.post(new Runnable() { // from class: l.ju10
            @Override // java.lang.Runnable
            public final void run() {
                this.f119724a.m176513w();
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}

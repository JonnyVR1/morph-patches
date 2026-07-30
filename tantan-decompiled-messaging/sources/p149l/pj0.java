package p149l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.messages.AllPairsAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class pj0 implements s7m<oj0> {

    /* JADX INFO: renamed from: a */
    public VFrame f149695a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f149696b;

    /* JADX INFO: renamed from: c */
    public VImage f149697c;

    /* JADX INFO: renamed from: d */
    public VText f149698d;

    /* JADX INFO: renamed from: e */
    public VPullUpRecyclerView f149699e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f149700f;

    /* JADX INFO: renamed from: g */
    public ij0 f149701g;

    /* JADX INFO: renamed from: h */
    public AllPairsAct f149702h;

    /* JADX INFO: renamed from: i */
    public oj0 f149703i;

    /* JADX INFO: renamed from: l.pj0$b */
    public static class C19241b {
        /* JADX INFO: renamed from: b */
        public static void m169782b(pj0 pj0Var, View view) {
            pj0Var.f149695a = (VFrame) view;
            ViewGroup viewGroup = (ViewGroup) view;
            pj0Var.f149696b = (LinearLayout) viewGroup.getChildAt(0);
            pj0Var.f149697c = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            pj0Var.f149698d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            pj0Var.f149699e = (VPullUpRecyclerView) viewGroup.getChildAt(1);
            pj0Var.f149700f = (VProgressBar) viewGroup.getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m169783c(pj0 pj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f95330E, viewGroup, false);
            m169782b(pj0Var, viewInflate);
            return viewInflate;
        }
    }

    public pj0(AllPairsAct allPairsAct) {
        this.f149702h = allPairsAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f149702h;
    }

    /* JADX INFO: renamed from: i */
    public View m169773i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19241b.m169783c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM169773i = m169773i(layoutInflater, viewGroup);
        this.f149695a.setBackgroundColor(-1);
        return viewM169773i;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(oj0 oj0Var) {
        this.f149703i = oj0Var;
    }

    /* JADX INFO: renamed from: k */
    public ij0 m169775k() {
        if (this.f149701g == null) {
            this.f149701g = new ij0(this.f149702h);
        }
        return this.f149701g;
    }

    /* JADX INFO: renamed from: l */
    public void m169776l(boolean z, boolean z2) {
        if (z) {
            this.f149696b.setVisibility(4);
            this.f149700f.setVisibility(0);
            this.f149699e.setVisibility(4);
            return;
        }
        LinearLayout linearLayout = this.f149696b;
        if (z2) {
            linearLayout.setVisibility(0);
            this.f149700f.setVisibility(4);
            this.f149699e.setVisibility(4);
        } else {
            linearLayout.setVisibility(4);
            this.f149700f.setVisibility(4);
            this.f149699e.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m169777m() {
        this.f149699e.setLayoutManager(new GridLayoutManager(this.f149702h, 2));
        this.f149699e.setAdapter(m169775k());
        if (wf6.m202950e()) {
            VPullUpRecyclerView vPullUpRecyclerView = this.f149699e;
            vPullUpRecyclerView.addOnItemTouchListener(new C19240a(vPullUpRecyclerView));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m169778n(q860<Conversation> q860Var) {
        if (NullChecker.m81303a(q860Var)) {
            m169775k().m136502G(q860Var.f153135a);
            m169776l(false, q860Var.f153135a.size() == 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m169779p() {
        this.f149698d.setText("暂时没有未聊配对");
        this.f149697c.setImageResource(x2c0.f190251j0);
    }

    /* JADX INFO: renamed from: q */
    public void m169780q(CharSequence charSequence) {
        try {
            TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(this.f149702h.toolbar());
            textView.setTranslationX(-t100.m186890d(35.0f));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextColor(Color.parseColor("#CC000000"));
        } catch (IllegalAccessException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
        this.f149702h.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: l.pj0$a */
    public class C19240a extends j36 {
        public C19240a(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // p149l.j36
        /* JADX INFO: renamed from: d */
        public void mo41872d(RecyclerView.AbstractC0566d0 abstractC0566d0) {
            if (NullChecker.m81303a(abstractC0566d0)) {
                KeyEvent.Callback callback = abstractC0566d0.itemView;
                if (callback instanceof gj0) {
                    ((gj0) callback).mo40540b();
                }
            }
        }

        @Override // p149l.j36
        /* JADX INFO: renamed from: f */
        public void mo41873f(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}

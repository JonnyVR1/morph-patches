package p009l;

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
import com.p000p1.mobile.putong.core.newui.messages.AllPairsAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.f6c0;
import l.s7m;
import l.t100;
import l.x2c0;
import v.VFrame;
import v.VImage;
import v.VProgressBar;
import v.VPullUpRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pj0 implements s7m<oj0> {

    /* JADX INFO: renamed from: a */
    public VFrame f18720a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f18721b;

    /* JADX INFO: renamed from: c */
    public VImage f18722c;

    /* JADX INFO: renamed from: d */
    public VText f18723d;

    /* JADX INFO: renamed from: e */
    public VPullUpRecyclerView f18724e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f18725f;

    /* JADX INFO: renamed from: g */
    public ij0 f18726g;

    /* JADX INFO: renamed from: h */
    public AllPairsAct f18727h;

    /* JADX INFO: renamed from: i */
    public oj0 f18728i;

    /* JADX INFO: renamed from: l.pj0$b */
    public static class C1116b {
        /* JADX INFO: renamed from: b */
        public static void m20455b(pj0 pj0Var, View view) {
            pj0Var.f18720a = (VFrame) view;
            ViewGroup viewGroup = (ViewGroup) view;
            pj0Var.f18721b = (LinearLayout) viewGroup.getChildAt(0);
            pj0Var.f18722c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            pj0Var.f18723d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            pj0Var.f18724e = viewGroup.getChildAt(1);
            pj0Var.f18725f = viewGroup.getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m20456c(pj0 pj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.E, viewGroup, false);
            m20455b(pj0Var, viewInflate);
            return viewInflate;
        }
    }

    public pj0(AllPairsAct allPairsAct) {
        this.f18727h = allPairsAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20444C0() {
        return this.f18727h;
    }

    /* JADX INFO: renamed from: i */
    public View m20445i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C1116b.m20456c(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM20445i = m20445i(layoutInflater, viewGroup);
        this.f18720a.setBackgroundColor(-1);
        return viewM20445i;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m20446i1(oj0 oj0Var) {
        this.f18728i = oj0Var;
    }

    /* JADX INFO: renamed from: k */
    public ij0 m20448k() {
        if (this.f18726g == null) {
            this.f18726g = new ij0(this.f18727h);
        }
        return this.f18726g;
    }

    /* JADX INFO: renamed from: l */
    public void m20449l(boolean z, boolean z2) {
        if (z) {
            this.f18721b.setVisibility(4);
            this.f18725f.setVisibility(0);
            this.f18724e.setVisibility(4);
            return;
        }
        LinearLayout linearLayout = this.f18721b;
        if (z2) {
            linearLayout.setVisibility(0);
            this.f18725f.setVisibility(4);
            this.f18724e.setVisibility(4);
        } else {
            linearLayout.setVisibility(4);
            this.f18725f.setVisibility(4);
            this.f18724e.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m20450m() {
        this.f18724e.setLayoutManager(new GridLayoutManager(this.f18727h, 2));
        this.f18724e.setAdapter(m20448k());
        if (wf6.m24193e()) {
            VPullUpRecyclerView vPullUpRecyclerView = this.f18724e;
            vPullUpRecyclerView.addOnItemTouchListener(new C1115a(vPullUpRecyclerView));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m20451n(q860<Conversation> q860Var) {
        if (NullChecker.a(q860Var)) {
            m20448k().m16582G(q860Var.f19068a);
            m20449l(false, q860Var.f19068a.size() == 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m20452p() {
        this.f18723d.setText("暂时没有未聊配对");
        this.f18722c.setImageResource(x2c0.j0);
    }

    /* JADX INFO: renamed from: q */
    public void m20453q(CharSequence charSequence) {
        try {
            TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(this.f18727h.toolbar());
            textView.setTranslationX(-t100.d(35.0f));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextColor(Color.parseColor("#CC000000"));
        } catch (IllegalAccessException e) {
            CrashHelper.c(e);
            e.printStackTrace();
        }
        this.f18727h.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: l.pj0$a */
    public class C1115a extends j36 {
        public C1115a(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // p009l.j36
        /* JADX INFO: renamed from: d */
        public void mo6005d(RecyclerView.d0 d0Var) {
            if (NullChecker.a(d0Var)) {
                KeyEvent.Callback callback = d0Var.itemView;
                if (callback instanceof gj0) {
                    ((gj0) callback).mo4633b();
                }
            }
        }

        @Override // p009l.j36
        /* JADX INFO: renamed from: f */
        public void mo6006f(RecyclerView.d0 d0Var) {
        }
    }

    public void destroy() {
    }
}

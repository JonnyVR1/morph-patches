package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.messages.AllPairsAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class lj0 implements iam<kj0> {

    /* JADX INFO: renamed from: a */
    public VFrame f132278a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f132279b;

    /* JADX INFO: renamed from: c */
    public VImage f132280c;

    /* JADX INFO: renamed from: d */
    public VText f132281d;

    /* JADX INFO: renamed from: e */
    public VPullUpRecyclerView f132282e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f132283f;

    /* JADX INFO: renamed from: g */
    public ej0 f132284g;

    /* JADX INFO: renamed from: h */
    public AllPairsAct f132285h;

    /* JADX INFO: renamed from: i */
    public kj0 f132286i;

    /* JADX INFO: renamed from: l.lj0$b */
    public static class C18402b {
        /* JADX INFO: renamed from: b */
        public static void m154452b(lj0 lj0Var, View view) {
            lj0Var.f132278a = (VFrame) view;
            ViewGroup viewGroup = (ViewGroup) view;
            lj0Var.f132279b = (LinearLayout) viewGroup.getChildAt(0);
            lj0Var.f132280c = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            lj0Var.f132281d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            lj0Var.f132282e = (VPullUpRecyclerView) viewGroup.getChildAt(1);
            lj0Var.f132283f = (VProgressBar) viewGroup.getChildAt(2);
        }

        /* JADX INFO: renamed from: c */
        public static View m154453c(lj0 lj0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(kec0.f125383E, viewGroup, false);
            m154452b(lj0Var, viewInflate);
            return viewInflate;
        }
    }

    public lj0(AllPairsAct allPairsAct) {
        this.f132285h = allPairsAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f132285h;
    }

    /* JADX INFO: renamed from: i */
    public View m154443i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C18402b.m154453c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM154443i = m154443i(layoutInflater, viewGroup);
        this.f132278a.setBackgroundColor(-1);
        return viewM154443i;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(kj0 kj0Var) {
        this.f132286i = kj0Var;
    }

    /* JADX INFO: renamed from: k */
    public ej0 m154445k() {
        if (this.f132284g == null) {
            this.f132284g = new ej0(this.f132285h);
        }
        return this.f132284g;
    }

    /* JADX INFO: renamed from: l */
    public void m154446l(boolean z, boolean z2) {
        if (z) {
            this.f132279b.setVisibility(4);
            this.f132283f.setVisibility(0);
            this.f132282e.setVisibility(4);
            return;
        }
        LinearLayout linearLayout = this.f132279b;
        if (z2) {
            linearLayout.setVisibility(0);
            this.f132283f.setVisibility(4);
            this.f132282e.setVisibility(4);
        } else {
            linearLayout.setVisibility(4);
            this.f132283f.setVisibility(4);
            this.f132282e.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m154447m() {
        this.f132282e.setLayoutManager(new GridLayoutManager(this.f132285h, 2));
        this.f132282e.setAdapter(m154445k());
        if (zg6.m219594e()) {
            VPullUpRecyclerView vPullUpRecyclerView = this.f132282e;
            vPullUpRecyclerView.addOnItemTouchListener(new C18401a(vPullUpRecyclerView));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m154448n(vg60<Conversation> vg60Var) {
        if (NullChecker.m82486a(vg60Var)) {
            m154445k().m120953G(vg60Var.f184001a);
            m154446l(false, vg60Var.f184001a.size() == 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m154449p() {
        this.f132281d.setText("暂时没有未聊配对");
        this.f132280c.setImageResource(dbc0.f87136k0);
    }

    /* JADX INFO: renamed from: q */
    public void m154450q(CharSequence charSequence) {
        try {
            TextView textView = (TextView) Act.TOOLBAR_TITLE_VIEW_FILED.get(this.f132285h.toolbar());
            textView.setTranslationX(-qa00.m175859d(35.0f));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextColor(Color.parseColor("#CC000000"));
        } catch (IllegalAccessException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
        this.f132285h.setTitle(charSequence);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.lj0$a */
    public class C18401a extends o46 {
        public C18401a(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // p153l.o46
        /* JADX INFO: renamed from: d */
        public void mo42883d(RecyclerView.AbstractC0569e0 abstractC0569e0) {
            if (NullChecker.m82486a(abstractC0569e0)) {
                KeyEvent.Callback callback = abstractC0569e0.itemView;
                if (callback instanceof cj0) {
                    ((cj0) callback).mo41551b();
                }
            }
        }

        @Override // p153l.o46
        /* JADX INFO: renamed from: f */
        public void mo42884f(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        }
    }
}

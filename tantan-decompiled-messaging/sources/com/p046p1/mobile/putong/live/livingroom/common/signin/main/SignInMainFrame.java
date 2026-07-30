package com.p046p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import p147v.VImage;
import p147v.VText;
import p149l.ap0;
import p149l.d30;
import p149l.jtk;
import p149l.p3f0;
import p149l.ptk;
import p149l.s4f0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class SignInMainFrame extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VImage f49309a;

    /* JADX INFO: renamed from: b */
    public VImage f49310b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f49311c;

    /* JADX INFO: renamed from: d */
    public VImage f49312d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f49313e;

    /* JADX INFO: renamed from: f */
    public VText f49314f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f49315g;

    /* JADX INFO: renamed from: h */
    public C12769a f49316h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInMainFrame$a */
    public class C12774a extends ap0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f49317a;

        public C12774a(d30 d30Var) {
            this.f49317a = d30Var;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            xdl0.m208344M(SignInMainFrame.this.f49312d, true);
            xdl0.m208344M(SignInMainFrame.this.f49313e, false);
            d30 d30Var = this.f49317a;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInMainFrame$b */
    public static class C12775b extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int itemViewType = recyclerView.getAdapter().getItemViewType(childAdapterPosition);
            if (itemViewType == 1) {
                rect.set(0, -(childAdapterPosition == 0 ? t100.m186890d(10.0f) : t100.m186890d(19.0f)), 0, -t100.m186890d(19.0f));
            } else if (itemViewType == 3) {
                rect.set(0, childAdapterPosition == 0 ? 0 : -t100.f167265n, 0, 0);
            } else if (itemViewType == 4) {
                rect.set(0, -t100.f167263l, 0, t100.f167264m);
            }
        }

        public C12775b() {
        }
    }

    public SignInMainFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public final void m73218c(View view) {
        p3f0.m167244a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m73219d(C12769a c12769a) {
        this.f49316h = c12769a;
        xdl0.m208329E0(this.f49311c, new View.OnClickListener() { // from class: l.m3f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131042a.m73220e(view);
            }
        });
        xdl0.m208329E0(this.f49309a, new View.OnClickListener() { // from class: l.n3f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136991a.m73221f(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m73220e(View view) {
        this.f49316h.m73176t4();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m73221f(View view) {
        this.f49316h.m73177u4();
    }

    /* JADX INFO: renamed from: g */
    public void m73222g(BLiveSignInDetail bLiveSignInDetail) {
        this.f49314f.setText(String.format(getResources().getString(R$string.f46875Od), String.valueOf(bLiveSignInDetail.signInCount)));
        this.f49315g.setAdapter(new s4f0(this.f49316h, bLiveSignInDetail));
    }

    /* JADX INFO: renamed from: h */
    public void m73223h(d30 d30Var) {
        xdl0.m208344M(this.f49312d, false);
        xdl0.m208344M(this.f49313e, true);
        this.f49313e.mo68502l("https://auto.tancdn.com/v1/raw/1b67db46-ad43-43cd-ac40-2c0a403a30d111.so", 1, new C12774a(d30Var));
    }

    /* JADX INFO: renamed from: i */
    public String m73224i() {
        jtk jtkVarM143130v = new jtk(getContext()).m143129u(getResources().getString(R$string.f46833Md)).m143113e(Color.parseColor("#f79533"), Color.parseColor("#f7c333")).m143119k(true).m143128t(12).m143130v(false);
        int i = t100.f167260i;
        int i2 = t100.f167257f;
        return ptk.m171332h().m171346t(jtkVarM143130v.m143127s(i, i2, i, i2).m143123o(t100.m186890d(-8.0f)).m143117i(jtk.f119614A), this.f49311c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73218c(this);
        this.f49315g.addItemDecoration(new C12775b());
        this.f49315g.setHasFixedSize(true);
        this.f49315g.setOverScrollMode(2);
        RecyclerView recyclerView = this.f49315g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }
}

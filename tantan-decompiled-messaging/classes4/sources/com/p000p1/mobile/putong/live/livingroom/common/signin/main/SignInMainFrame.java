package com.p000p1.mobile.putong.live.livingroom.common.signin.main;

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
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.ap0;
import l.d30;
import l.jtk;
import l.ptk;
import l.t100;
import l.xdl0;
import p002l.p3f0;
import p002l.s4f0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SignInMainFrame extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VImage f5351a;

    /* JADX INFO: renamed from: b */
    public VImage f5352b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f5353c;

    /* JADX INFO: renamed from: d */
    public VImage f5354d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f5355e;

    /* JADX INFO: renamed from: f */
    public VText f5356f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f5357g;

    /* JADX INFO: renamed from: h */
    public C0358a f5358h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInMainFrame$a */
    public class C0363a extends ap0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f5359a;

        public C0363a(d30 d30Var) {
            this.f5359a = d30Var;
        }

        /* JADX INFO: renamed from: b */
        public void m6754b() {
            xdl0.M(SignInMainFrame.this.f5354d, true);
            xdl0.M(SignInMainFrame.this.f5355e, false);
            d30 d30Var = this.f5359a;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInMainFrame$b */
    public static class C0364b extends RecyclerView.n {
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int itemViewType = recyclerView.getAdapter().getItemViewType(childAdapterPosition);
            if (itemViewType == 1) {
                rect.set(0, -(childAdapterPosition == 0 ? t100.d(10.0f) : t100.d(19.0f)), 0, -t100.d(19.0f));
            } else if (itemViewType == 3) {
                rect.set(0, childAdapterPosition == 0 ? 0 : -t100.n, 0, 0);
            } else if (itemViewType == 4) {
                rect.set(0, -t100.l, 0, t100.m);
            }
        }

        public C0364b() {
        }
    }

    public SignInMainFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public final void m6747c(View view) {
        p3f0.m20019a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m6748d(C0358a c0358a) {
        this.f5358h = c0358a;
        xdl0.E0(this.f5353c, new View.OnClickListener() { // from class: l.m3f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15227a.m6749e(view);
            }
        });
        xdl0.E0(this.f5351a, new View.OnClickListener() { // from class: l.n3f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15817a.m6750f(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m6749e(View view) {
        this.f5358h.m6705t4();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m6750f(View view) {
        this.f5358h.m6706u4();
    }

    /* JADX INFO: renamed from: g */
    public void m6751g(BLiveSignInDetail bLiveSignInDetail) {
        this.f5356f.setText(String.format(getResources().getString(R$string.f2917Od), String.valueOf(bLiveSignInDetail.signInCount)));
        this.f5357g.setAdapter(new s4f0(this.f5358h, bLiveSignInDetail));
    }

    /* JADX INFO: renamed from: h */
    public void m6752h(d30 d30Var) {
        xdl0.M(this.f5354d, false);
        xdl0.M(this.f5355e, true);
        this.f5355e.l("https://auto.tancdn.com/v1/raw/1b67db46-ad43-43cd-ac40-2c0a403a30d111.so", 1, new C0363a(d30Var));
    }

    /* JADX INFO: renamed from: i */
    public String m6753i() {
        jtk jtkVarV = new jtk(getContext()).u(getResources().getString(R$string.f2875Md)).e(new int[]{Color.parseColor("#f79533"), Color.parseColor("#f7c333")}).k(true).t(12).v(false);
        int i = t100.i;
        int i2 = t100.f;
        return ptk.h().t(jtkVarV.s(i, i2, i, i2).o(t100.d(-8.0f)).i(jtk.A), this.f5353c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6747c(this);
        this.f5357g.addItemDecoration(new C0364b());
        this.f5357g.setHasFixedSize(true);
        this.f5357g.setOverScrollMode(2);
        RecyclerView recyclerView = this.f5357g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }
}

package com.p051p1.mobile.putong.live.livingroom.common.signin.main;

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
import com.p051p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.fwk;
import p153l.qa00;
import p153l.wbf0;
import p153l.wo0;
import p153l.x20;
import p153l.zcf0;
import p153l.zvk;

/* JADX INFO: loaded from: classes4.dex */
public class SignInMainFrame extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VImage f50157a;

    /* JADX INFO: renamed from: b */
    public VImage f50158b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f50159c;

    /* JADX INFO: renamed from: d */
    public VImage f50160d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f50161e;

    /* JADX INFO: renamed from: f */
    public VText f50162f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f50163g;

    /* JADX INFO: renamed from: h */
    public C12932a f50164h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInMainFrame$a */
    public class C12937a extends wo0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f50165a;

        public C12937a(x20 x20Var) {
            this.f50165a = x20Var;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            bnl0.m105524M(SignInMainFrame.this.f50160d, true);
            bnl0.m105524M(SignInMainFrame.this.f50161e, false);
            x20 x20Var = this.f50165a;
            if (x20Var != null) {
                x20Var.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.main.SignInMainFrame$b */
    public static class C12938b extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int itemViewType = recyclerView.getAdapter().getItemViewType(childAdapterPosition);
            if (itemViewType == 1) {
                rect.set(0, -(childAdapterPosition == 0 ? qa00.m175859d(10.0f) : qa00.m175859d(19.0f)), 0, -qa00.m175859d(19.0f));
            } else if (itemViewType == 3) {
                rect.set(0, childAdapterPosition == 0 ? 0 : -qa00.f156327n, 0, 0);
            } else if (itemViewType == 4) {
                rect.set(0, -qa00.f156325l, 0, qa00.f156326m);
            }
        }

        public C12938b() {
        }
    }

    public SignInMainFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public final void m74401c(View view) {
        wbf0.m205716a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m74402d(C12932a c12932a) {
        this.f50164h = c12932a;
        bnl0.m105509E0(this.f50159c, new View.OnClickListener() { // from class: l.tbf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172920a.m74403e(view);
            }
        });
        bnl0.m105509E0(this.f50157a, new View.OnClickListener() { // from class: l.ubf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178305a.m74404f(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m74403e(View view) {
        this.f50164h.m74359t4();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m74404f(View view) {
        this.f50164h.m74360u4();
    }

    /* JADX INFO: renamed from: g */
    public void m74405g(BLiveSignInDetail bLiveSignInDetail) {
        this.f50162f.setText(String.format(getResources().getString(R$string.f47723Od), String.valueOf(bLiveSignInDetail.signInCount)));
        this.f50163g.setAdapter(new zcf0(this.f50164h, bLiveSignInDetail));
    }

    /* JADX INFO: renamed from: h */
    public void m74406h(x20 x20Var) {
        bnl0.m105524M(this.f50160d, false);
        bnl0.m105524M(this.f50161e, true);
        this.f50161e.mo69685l("https://auto.tancdn.com/v1/raw/1b67db46-ad43-43cd-ac40-2c0a403a30d111.so", 1, new C12937a(x20Var));
    }

    /* JADX INFO: renamed from: i */
    public String m74407i() {
        zvk zvkVarM221777v = new zvk(getContext()).m221776u(getResources().getString(R$string.f47681Md)).m221760e(Color.parseColor("#f79533"), Color.parseColor("#f7c333")).m221766k(true).m221775t(12).m221777v(false);
        int i = qa00.f156322i;
        int i2 = qa00.f156319f;
        return fwk.m127777h().m127791t(zvkVarM221777v.m221774s(i, i2, i, i2).m221770o(qa00.m175859d(-8.0f)).m221764i(zvk.f206224A), this.f50159c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74401c(this);
        this.f50163g.addItemDecoration(new C12938b());
        this.f50163g.setHasFixedSize(true);
        this.f50163g.setOverScrollMode(2);
        RecyclerView recyclerView = this.f50163g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }
}

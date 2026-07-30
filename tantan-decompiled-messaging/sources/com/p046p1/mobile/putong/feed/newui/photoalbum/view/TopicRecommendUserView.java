package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RecommendUsers;
import java.util.List;
import p147v.VLinear;
import p147v.VRecyclerView;
import p149l.aic0;
import p149l.j760;
import p149l.l80;
import p149l.nkg;
import p149l.p1j0;
import p149l.p6j0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class TopicRecommendUserView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f42588c;

    /* JADX INFO: renamed from: d */
    public TextView f42589d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f42590e;

    /* JADX INFO: renamed from: f */
    public aic0 f42591f;

    /* JADX INFO: renamed from: g */
    public String f42592g;

    /* JADX INFO: renamed from: h */
    public int f42593h;

    /* JADX INFO: renamed from: i */
    public l80 f42594i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserView$a */
    public class C11313a extends l80<RecommendUsers> {
        public C11313a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(RecommendUsers recommendUsers, int i) {
            p6j0.m167671e("e_user_suggest_card", TopicRecommendUserView.this.getPageId(), new j760("card_user_id", recommendUsers.userId));
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(RecommendUsers recommendUsers, int i, long j) {
        }
    }

    public TopicRecommendUserView(Context context) {
        super(context);
        this.f42594i = new C11313a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageId() {
        if (!nkg.m159904s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f42593h;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    /* JADX INFO: renamed from: r */
    private void m65295r() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f42590e.setLayoutManager(linearLayoutManager);
        aic0 aic0Var = new aic0((Act) getContext(), this.f42593h, this.f42592g, this.f42594i);
        this.f42591f = aic0Var;
        this.f42590e.setAdapter(aic0Var);
    }

    /* JADX INFO: renamed from: Q */
    public final void m65296Q(View view) {
        p1j0.m167073a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m65297R(j760<List<RecommendUsers>, List<Moment>> j760Var, String str, String str2, int i) {
        if (j760Var == null || vwb.m200296J(j760Var.f116564a) || j760Var.f116564a.size() < 2) {
            xdl0.m208344M(this.f42588c, false);
            return;
        }
        xdl0.m208344M(this.f42588c, true);
        this.f42593h = i;
        this.f42592g = str2;
        this.f42589d.setText(str);
        m65295r();
        this.f42591f.m96803N(j760Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65296Q(this);
    }

    public TopicRecommendUserView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42594i = new C11313a();
    }

    public TopicRecommendUserView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42594i = new C11313a();
    }
}

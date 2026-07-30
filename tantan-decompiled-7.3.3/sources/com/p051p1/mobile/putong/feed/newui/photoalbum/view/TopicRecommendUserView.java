package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RecommendUsers;
import java.util.List;
import p151v.VLinear;
import p151v.VRecyclerView;
import p153l.bnl0;
import p153l.cmg;
import p153l.h80;
import p153l.hqc0;
import p153l.jyb;
import p153l.pf60;
import p153l.taj0;
import p153l.tfj0;

/* JADX INFO: loaded from: classes13.dex */
public class TopicRecommendUserView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f43436c;

    /* JADX INFO: renamed from: d */
    public TextView f43437d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f43438e;

    /* JADX INFO: renamed from: f */
    public hqc0 f43439f;

    /* JADX INFO: renamed from: g */
    public String f43440g;

    /* JADX INFO: renamed from: h */
    public int f43441h;

    /* JADX INFO: renamed from: i */
    public h80 f43442i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserView$a */
    public class C11476a extends h80<RecommendUsers> {
        public C11476a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(RecommendUsers recommendUsers, int i) {
            tfj0.m190942e("e_user_suggest_card", TopicRecommendUserView.this.getPageId(), new pf60("card_user_id", recommendUsers.userId));
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(RecommendUsers recommendUsers, int i, long j) {
        }
    }

    public TopicRecommendUserView(Context context) {
        super(context);
        this.f43442i = new C11476a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageId() {
        if (!cmg.m111233s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f43441h;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    /* JADX INFO: renamed from: r */
    private void m66478r() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f43438e.setLayoutManager(linearLayoutManager);
        hqc0 hqc0Var = new hqc0((Act) getContext(), this.f43441h, this.f43440g, this.f43442i);
        this.f43439f = hqc0Var;
        this.f43438e.setAdapter(hqc0Var);
    }

    /* JADX INFO: renamed from: Q */
    public final void m66479Q(View view) {
        taj0.m189857a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m66480R(pf60<List<RecommendUsers>, List<Moment>> pf60Var, String str, String str2, int i) {
        if (pf60Var == null || jyb.m147479J(pf60Var.f152156a) || pf60Var.f152156a.size() < 2) {
            bnl0.m105524M(this.f43436c, false);
            return;
        }
        bnl0.m105524M(this.f43436c, true);
        this.f43441h = i;
        this.f43440g = str2;
        this.f43437d.setText(str);
        m66478r();
        this.f43439f.m136618N(pf60Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66479Q(this);
    }

    public TopicRecommendUserView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43442i = new C11476a();
    }

    public TopicRecommendUserView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43442i = new C11476a();
    }
}

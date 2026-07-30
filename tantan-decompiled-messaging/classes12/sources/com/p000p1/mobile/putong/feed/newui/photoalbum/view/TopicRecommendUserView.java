package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RecommendUsers;
import java.util.Collection;
import java.util.List;
import l.j760;
import l.vwb;
import l.xdl0;
import p007l.aic0;
import p007l.l80;
import p007l.nkg;
import p007l.p1j0;
import p007l.p6j0;
import v.VLinear;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopicRecommendUserView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f4049c;

    /* JADX INFO: renamed from: d */
    public TextView f4050d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f4051e;

    /* JADX INFO: renamed from: f */
    public aic0 f4052f;

    /* JADX INFO: renamed from: g */
    public String f4053g;

    /* JADX INFO: renamed from: h */
    public int f4054h;

    /* JADX INFO: renamed from: i */
    public l80 f4055i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.view.TopicRecommendUserView$a */
    public class C2157a extends l80<RecommendUsers> {
        public C2157a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(RecommendUsers recommendUsers, int i) {
            p6j0.m12915e("e_user_suggest_card", TopicRecommendUserView.this.getPageId(), new j760("card_user_id", recommendUsers.userId));
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(RecommendUsers recommendUsers, int i, long j) {
        }
    }

    public TopicRecommendUserView(Context context) {
        super(context);
        this.f4055i = new C2157a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageId() {
        if (!nkg.m12263s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f4054h;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m6396r() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f4051e.setLayoutManager(linearLayoutManager);
        aic0 aic0Var = new aic0(getContext(), this.f4054h, this.f4053g, this.f4055i);
        this.f4052f = aic0Var;
        this.f4051e.setAdapter(aic0Var);
    }

    /* JADX INFO: renamed from: Q */
    public final void m6397Q(View view) {
        p1j0.m12901a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m6398R(j760<List<RecommendUsers>, List<Moment>> j760Var, String str, String str2, int i) {
        if (j760Var == null || vwb.J((Collection) j760Var.a) || ((List) j760Var.a).size() < 2) {
            xdl0.M(this.f4049c, false);
            return;
        }
        xdl0.M(this.f4049c, true);
        this.f4054h = i;
        this.f4053g = str2;
        this.f4050d.setText(str);
        m6396r();
        this.f4052f.m8574N(j760Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6397Q(this);
    }

    public TopicRecommendUserView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4055i = new C2157a();
    }

    public TopicRecommendUserView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4055i = new C2157a();
    }
}

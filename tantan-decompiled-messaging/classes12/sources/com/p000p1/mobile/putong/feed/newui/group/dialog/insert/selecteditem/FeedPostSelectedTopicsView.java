package com.p000p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem;

import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l.e30;
import l.j760;
import l.jxk;
import l.lsi0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import p007l.c3h;
import p007l.fuh;
import p007l.kth;
import p007l.l80;
import p007l.mth;
import p007l.nkg;
import p007l.vzi0;
import v.VButton;
import v.VMenuBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostSelectedTopicsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VMenuBar f1460a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f1461b;

    /* JADX INFO: renamed from: c */
    public VButton f1462c;

    /* JADX INFO: renamed from: d */
    public c3h<TopicMoment> f1463d;

    /* JADX INFO: renamed from: e */
    public ArrayList<TopicMoment> f1464e;

    /* JADX INFO: renamed from: f */
    public Dialog f1465f;

    /* JADX INFO: renamed from: g */
    public e30<ArrayList<TopicMoment>> f1466g;

    /* JADX INFO: renamed from: h */
    public jxk f1467h;

    /* JADX INFO: renamed from: i */
    public mth f1468i;

    /* JADX INFO: renamed from: j */
    public FeedPostSelectedHeader f1469j;

    /* JADX INFO: renamed from: k */
    public HashSet<TopicMoment> f1470k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedTopicsView$a */
    public class C2039a extends l80<TopicMoment> {
        public C2039a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(TopicMoment topicMoment, int i) {
            if (FeedPostSelectedTopicsView.this.f1470k.add(topicMoment)) {
                zvf0.A("e_topic", "p_moment_post", new j760[]{j760.a("topic_id", topicMoment.f708id), j760.a("topic_type", topicMoment.topicType)});
            }
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(TopicMoment topicMoment, int i, long j) {
        }
    }

    public FeedPostSelectedTopicsView(Context context) {
        super(context);
        this.f1464e = new ArrayList<>();
        this.f1470k = new HashSet<>();
        m2894h(context);
    }

    /* JADX INFO: renamed from: f */
    public View m2892f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fuh.m10323b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g */
    public void m2893g(TopicMoment topicMoment) {
        this.f1464e.remove(topicMoment);
        m2900n();
        this.f1468i.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: h */
    public final void m2894h(Context context) {
        addView(m2892f(LayoutInflater.from(context), this), new ViewGroup.LayoutParams(-1, -1));
        this.f1463d = new vzi0(this.f1464e, this, true);
        m2895i();
    }

    /* JADX INFO: renamed from: i */
    public final void m2895i() {
        this.f1460a.setLeftRegionClick(new View.OnClickListener() { // from class: l.buh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6439a.m2896j(view);
            }
        });
        xdl0.E0(this.f1462c, new View.OnClickListener() { // from class: l.cuh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6731a.m2897k(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m2896j(View view) {
        this.f1465f.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m2897k(View view) {
        this.f1465f.dismiss();
        if (NullChecker.a(this.f1466g)) {
            this.f1466g.call(this.f1464e);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m2898l(final TopicMoment topicMoment) {
        if (!topicMoment.selected && this.f1464e.size() + 1 > 3) {
            lsi0.z(getResources().getString(R$string.f598r1), this.f1465f.getWindow().getDecorView());
            return;
        }
        TopicMoment topicMoment2 = (TopicMoment) vwb.r(this.f1464e, new w9j() { // from class: l.euh
            public final Object call(Object obj) {
                return Boolean.valueOf(((TopicMoment) obj).f708id.equals(topicMoment.f708id));
            }
        });
        if (NullChecker.a(topicMoment2)) {
            topicMoment.selected = false;
            this.f1464e.remove(topicMoment2);
        } else {
            if (m2901o(topicMoment)) {
                return;
            }
            topicMoment.selected = true;
            this.f1464e.add(topicMoment);
            zvf0.u("e_topic", "p_moment_post", new j760[]{j760.a("topic_id", topicMoment.f708id), j760.a("topic_type", topicMoment.topicType)});
        }
    }

    /* JADX INFO: renamed from: m */
    public void m2899m(List<TopicMoment> list, Dialog dialog, e30<ArrayList<TopicMoment>> e30Var) {
        this.f1465f = dialog;
        this.f1466g = e30Var;
        if (list == null) {
            return;
        }
        for (TopicMoment topicMoment : list) {
            if (topicMoment.selected) {
                this.f1464e.add(topicMoment);
            }
        }
        mth mthVar = new mth(getContext(), list, new C2039a());
        this.f1468i = mthVar;
        this.f1467h = new jxk(mthVar);
        this.f1468i.m12034J(new e30() { // from class: l.duh
            public final void call(Object obj) {
                this.f7065a.m2902p((TopicMoment) obj);
            }
        });
        FeedPostSelectedHeader feedPostSelectedHeader = new FeedPostSelectedHeader(getContext());
        this.f1469j = feedPostSelectedHeader;
        this.f1463d.m9087t(feedPostSelectedHeader.f1458f);
        this.f1467h.H(this.f1469j);
        this.f1461b.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f1461b.addItemDecoration(new kth());
        this.f1461b.setAdapter(this.f1467h);
        m2900n();
    }

    /* JADX INFO: renamed from: n */
    public final void m2900n() {
        int size = this.f1464e.size();
        FeedPostSelectedHeader feedPostSelectedHeader = this.f1469j;
        if (size <= 0) {
            feedPostSelectedHeader.f1458f.setVisibility(8);
            this.f1469j.f1455c.setVisibility(8);
        } else {
            feedPostSelectedHeader.f1458f.setVisibility(0);
            this.f1469j.f1455c.setVisibility(0);
            ((vzi0) this.f1463d).m15639F(this.f1464e);
            this.f1463d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2901o(TopicMoment topicMoment) {
        if (vwb.J(this.f1464e)) {
            return false;
        }
        if (this.f1464e.get(0).isTopicAnonymousType()) {
            if (topicMoment.isTopicAnonymousType()) {
                lsi0.z("只能添加一条匿名话题", this.f1465f.getWindow().getDecorView());
            } else {
                boolean zM12217O = nkg.m12217O();
                Dialog dialog = this.f1465f;
                if (zM12217O) {
                    lsi0.z("你已添加匿名话题，不可同选当前话题", dialog.getWindow().getDecorView());
                } else {
                    lsi0.z("添加了匿名话题，不能再添加普通话题", dialog.getWindow().getDecorView());
                }
            }
            return true;
        }
        if (!topicMoment.isTopicAnonymousType()) {
            return false;
        }
        boolean zM12217O2 = nkg.m12217O();
        Dialog dialog2 = this.f1465f;
        if (zM12217O2) {
            lsi0.z("匿名话题与已添加话题不可同选", dialog2.getWindow().getDecorView());
        } else {
            lsi0.z("添加了普通话题，不能再添加匿名话题", dialog2.getWindow().getDecorView());
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m2902p(TopicMoment topicMoment) {
        m2898l(topicMoment);
        m2900n();
        this.f1468i.notifyDataSetChanged();
    }

    public FeedPostSelectedTopicsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1464e = new ArrayList<>();
        this.f1470k = new HashSet<>();
        m2894h(context);
    }

    public FeedPostSelectedTopicsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1464e = new ArrayList<>();
        this.f1470k = new HashSet<>();
        m2894h(context);
    }
}

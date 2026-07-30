package com.p046p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem;

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
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p147v.VButton;
import p147v.VMenuBar;
import p149l.c3h;
import p149l.e30;
import p149l.fuh;
import p149l.j760;
import p149l.jxk;
import p149l.kth;
import p149l.l80;
import p149l.lsi0;
import p149l.mth;
import p149l.nkg;
import p149l.vwb;
import p149l.vzi0;
import p149l.w9j;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostSelectedTopicsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VMenuBar f39999a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f40000b;

    /* JADX INFO: renamed from: c */
    public VButton f40001c;

    /* JADX INFO: renamed from: d */
    public c3h<TopicMoment> f40002d;

    /* JADX INFO: renamed from: e */
    public ArrayList<TopicMoment> f40003e;

    /* JADX INFO: renamed from: f */
    public Dialog f40004f;

    /* JADX INFO: renamed from: g */
    public e30<ArrayList<TopicMoment>> f40005g;

    /* JADX INFO: renamed from: h */
    public jxk f40006h;

    /* JADX INFO: renamed from: i */
    public mth f40007i;

    /* JADX INFO: renamed from: j */
    public FeedPostSelectedHeader f40008j;

    /* JADX INFO: renamed from: k */
    public HashSet<TopicMoment> f40009k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedTopicsView$a */
    public class C11195a extends l80<TopicMoment> {
        public C11195a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(TopicMoment topicMoment, int i) {
            if (FeedPostSelectedTopicsView.this.f40009k.add(topicMoment)) {
                zvf0.m220368A("e_topic", "p_moment_post", j760.m140076a("topic_id", topicMoment.f39247id), j760.m140076a("topic_type", topicMoment.topicType));
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(TopicMoment topicMoment, int i, long j) {
        }
    }

    public FeedPostSelectedTopicsView(Context context) {
        super(context);
        this.f40003e = new ArrayList<>();
        this.f40009k = new HashSet<>();
        m61920h(context);
    }

    /* JADX INFO: renamed from: f */
    public View m61918f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fuh.m123188b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g */
    public void m61919g(TopicMoment topicMoment) {
        this.f40003e.remove(topicMoment);
        m61926n();
        this.f40007i.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: h */
    public final void m61920h(Context context) {
        addView(m61918f(LayoutInflater.from(context), this), new ViewGroup.LayoutParams(-1, -1));
        this.f40002d = new vzi0(this.f40003e, this, true);
        m61921i();
    }

    /* JADX INFO: renamed from: i */
    public final void m61921i() {
        this.f39999a.setLeftRegionClick(new View.OnClickListener() { // from class: l.buh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77321a.m61922j(view);
            }
        });
        xdl0.m208329E0(this.f40001c, new View.OnClickListener() { // from class: l.cuh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82569a.m61923k(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m61922j(View view) {
        this.f40004f.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m61923k(View view) {
        this.f40004f.dismiss();
        if (NullChecker.m81303a(this.f40005g)) {
            this.f40005g.call(this.f40003e);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m61924l(final TopicMoment topicMoment) {
        if (!topicMoment.selected && this.f40003e.size() + 1 > 3) {
            lsi0.m151596z(getResources().getString(R$string.f39137r1), this.f40004f.getWindow().getDecorView());
            return;
        }
        TopicMoment topicMoment2 = (TopicMoment) vwb.m200346r(this.f40003e, new w9j() { // from class: l.euh
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(topicMoment.f39247id));
            }
        });
        if (NullChecker.m81303a(topicMoment2)) {
            topicMoment.selected = false;
            this.f40003e.remove(topicMoment2);
        } else {
            if (m61927o(topicMoment)) {
                return;
            }
            topicMoment.selected = true;
            this.f40003e.add(topicMoment);
            zvf0.m220399u("e_topic", "p_moment_post", j760.m140076a("topic_id", topicMoment.f39247id), j760.m140076a("topic_type", topicMoment.topicType));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m61925m(List<TopicMoment> list, Dialog dialog, e30<ArrayList<TopicMoment>> e30Var) {
        this.f40004f = dialog;
        this.f40005g = e30Var;
        if (list == null) {
            return;
        }
        for (TopicMoment topicMoment : list) {
            if (topicMoment.selected) {
                this.f40003e.add(topicMoment);
            }
        }
        mth mthVar = new mth(getContext(), list, new C11195a());
        this.f40007i = mthVar;
        this.f40006h = new jxk(mthVar);
        this.f40007i.m156224J(new e30() { // from class: l.duh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87976a.m61928p((TopicMoment) obj);
            }
        });
        FeedPostSelectedHeader feedPostSelectedHeader = new FeedPostSelectedHeader(getContext());
        this.f40008j = feedPostSelectedHeader;
        this.f40002d.m105022t(feedPostSelectedHeader.f39997f);
        this.f40006h.m143815H(this.f40008j);
        this.f40000b.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f40000b.addItemDecoration(new kth());
        this.f40000b.setAdapter(this.f40006h);
        m61926n();
    }

    /* JADX INFO: renamed from: n */
    public final void m61926n() {
        int size = this.f40003e.size();
        FeedPostSelectedHeader feedPostSelectedHeader = this.f40008j;
        if (size <= 0) {
            feedPostSelectedHeader.f39997f.setVisibility(8);
            this.f40008j.f39994c.setVisibility(8);
        } else {
            feedPostSelectedHeader.f39997f.setVisibility(0);
            this.f40008j.f39994c.setVisibility(0);
            ((vzi0) this.f40002d).m200763F(this.f40003e);
            this.f40002d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m61927o(TopicMoment topicMoment) {
        if (vwb.m200296J(this.f40003e)) {
            return false;
        }
        if (this.f40003e.get(0).isTopicAnonymousType()) {
            if (topicMoment.isTopicAnonymousType()) {
                lsi0.m151596z("只能添加一条匿名话题", this.f40004f.getWindow().getDecorView());
            } else {
                boolean zM159858O = nkg.m159858O();
                Dialog dialog = this.f40004f;
                if (zM159858O) {
                    lsi0.m151596z("你已添加匿名话题，不可同选当前话题", dialog.getWindow().getDecorView());
                } else {
                    lsi0.m151596z("添加了匿名话题，不能再添加普通话题", dialog.getWindow().getDecorView());
                }
            }
            return true;
        }
        if (!topicMoment.isTopicAnonymousType()) {
            return false;
        }
        boolean zM159858O2 = nkg.m159858O();
        Dialog dialog2 = this.f40004f;
        if (zM159858O2) {
            lsi0.m151596z("匿名话题与已添加话题不可同选", dialog2.getWindow().getDecorView());
        } else {
            lsi0.m151596z("添加了普通话题，不能再添加匿名话题", dialog2.getWindow().getDecorView());
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m61928p(TopicMoment topicMoment) {
        m61924l(topicMoment);
        m61926n();
        this.f40007i.notifyDataSetChanged();
    }

    public FeedPostSelectedTopicsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40003e = new ArrayList<>();
        this.f40009k = new HashSet<>();
        m61920h(context);
    }

    public FeedPostSelectedTopicsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40003e = new ArrayList<>();
        this.f40009k = new HashSet<>();
        m61920h(context);
    }
}

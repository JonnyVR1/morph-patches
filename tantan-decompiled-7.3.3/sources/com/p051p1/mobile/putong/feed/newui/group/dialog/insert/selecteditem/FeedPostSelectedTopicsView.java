package com.p051p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem;

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
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p151v.VButton;
import p151v.VMenuBar;
import p153l.bnl0;
import p153l.bvh;
import p153l.cmg;
import p153l.h80;
import p153l.i4g0;
import p153l.jyb;
import p153l.o1j0;
import p153l.pf60;
import p153l.qcj;
import p153l.r4h;
import p153l.uvh;
import p153l.y20;
import p153l.z8j0;
import p153l.zuh;
import p153l.zzk;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostSelectedTopicsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VMenuBar f40847a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f40848b;

    /* JADX INFO: renamed from: c */
    public VButton f40849c;

    /* JADX INFO: renamed from: d */
    public r4h<TopicMoment> f40850d;

    /* JADX INFO: renamed from: e */
    public ArrayList<TopicMoment> f40851e;

    /* JADX INFO: renamed from: f */
    public Dialog f40852f;

    /* JADX INFO: renamed from: g */
    public y20<ArrayList<TopicMoment>> f40853g;

    /* JADX INFO: renamed from: h */
    public zzk f40854h;

    /* JADX INFO: renamed from: i */
    public bvh f40855i;

    /* JADX INFO: renamed from: j */
    public FeedPostSelectedHeader f40856j;

    /* JADX INFO: renamed from: k */
    public HashSet<TopicMoment> f40857k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedTopicsView$a */
    public class C11358a extends h80<TopicMoment> {
        public C11358a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(TopicMoment topicMoment, int i) {
            if (FeedPostSelectedTopicsView.this.f40857k.add(topicMoment)) {
                i4g0.m138492A("e_topic", "p_moment_post", pf60.m172085a("topic_id", topicMoment.f40095id), pf60.m172085a("topic_type", topicMoment.topicType));
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(TopicMoment topicMoment, int i, long j) {
        }
    }

    public FeedPostSelectedTopicsView(Context context) {
        super(context);
        this.f40851e = new ArrayList<>();
        this.f40857k = new HashSet<>();
        m63103h(context);
    }

    /* JADX INFO: renamed from: f */
    public View m63101f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uvh.m198264b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g */
    public void m63102g(TopicMoment topicMoment) {
        this.f40851e.remove(topicMoment);
        m63109n();
        this.f40855i.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: h */
    public final void m63103h(Context context) {
        addView(m63101f(LayoutInflater.from(context), this), new ViewGroup.LayoutParams(-1, -1));
        this.f40850d = new z8j0(this.f40851e, this, true);
        m63104i();
    }

    /* JADX INFO: renamed from: i */
    public final void m63104i() {
        this.f40847a.setLeftRegionClick(new View.OnClickListener() { // from class: l.qvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159758a.m63105j(view);
            }
        });
        bnl0.m105509E0(this.f40849c, new View.OnClickListener() { // from class: l.rvh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165016a.m63106k(view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m63105j(View view) {
        this.f40852f.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m63106k(View view) {
        this.f40852f.dismiss();
        if (NullChecker.m82486a(this.f40853g)) {
            this.f40853g.call(this.f40851e);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m63107l(final TopicMoment topicMoment) {
        if (!topicMoment.selected && this.f40851e.size() + 1 > 3) {
            o1j0.m165652z(getResources().getString(R$string.f39985r1), this.f40852f.getWindow().getDecorView());
            return;
        }
        TopicMoment topicMoment2 = (TopicMoment) jyb.m147529r(this.f40851e, new qcj() { // from class: l.tvh
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(topicMoment.f40095id));
            }
        });
        if (NullChecker.m82486a(topicMoment2)) {
            topicMoment.selected = false;
            this.f40851e.remove(topicMoment2);
        } else {
            if (m63110o(topicMoment)) {
                return;
            }
            topicMoment.selected = true;
            this.f40851e.add(topicMoment);
            i4g0.m138523u("e_topic", "p_moment_post", pf60.m172085a("topic_id", topicMoment.f40095id), pf60.m172085a("topic_type", topicMoment.topicType));
        }
    }

    /* JADX INFO: renamed from: m */
    public void m63108m(List<TopicMoment> list, Dialog dialog, y20<ArrayList<TopicMoment>> y20Var) {
        this.f40852f = dialog;
        this.f40853g = y20Var;
        if (list == null) {
            return;
        }
        for (TopicMoment topicMoment : list) {
            if (topicMoment.selected) {
                this.f40851e.add(topicMoment);
            }
        }
        bvh bvhVar = new bvh(getContext(), list, new C11358a());
        this.f40855i = bvhVar;
        this.f40854h = new zzk(bvhVar);
        this.f40855i.m106572J(new y20() { // from class: l.svh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170841a.m63111p((TopicMoment) obj);
            }
        });
        FeedPostSelectedHeader feedPostSelectedHeader = new FeedPostSelectedHeader(getContext());
        this.f40856j = feedPostSelectedHeader;
        this.f40850d.m179763t(feedPostSelectedHeader.f40845f);
        this.f40854h.m222265H(this.f40856j);
        this.f40848b.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f40848b.addItemDecoration(new zuh());
        this.f40848b.setAdapter(this.f40854h);
        m63109n();
    }

    /* JADX INFO: renamed from: n */
    public final void m63109n() {
        int size = this.f40851e.size();
        FeedPostSelectedHeader feedPostSelectedHeader = this.f40856j;
        if (size <= 0) {
            feedPostSelectedHeader.f40845f.setVisibility(8);
            this.f40856j.f40842c.setVisibility(8);
        } else {
            feedPostSelectedHeader.f40845f.setVisibility(0);
            this.f40856j.f40842c.setVisibility(0);
            ((z8j0) this.f40850d).m219002F(this.f40851e);
            this.f40850d.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m63110o(TopicMoment topicMoment) {
        if (jyb.m147479J(this.f40851e)) {
            return false;
        }
        if (this.f40851e.get(0).isTopicAnonymousType()) {
            if (topicMoment.isTopicAnonymousType()) {
                o1j0.m165652z("只能添加一条匿名话题", this.f40852f.getWindow().getDecorView());
            } else {
                boolean zM111187O = cmg.m111187O();
                Dialog dialog = this.f40852f;
                if (zM111187O) {
                    o1j0.m165652z("你已添加匿名话题，不可同选当前话题", dialog.getWindow().getDecorView());
                } else {
                    o1j0.m165652z("添加了匿名话题，不能再添加普通话题", dialog.getWindow().getDecorView());
                }
            }
            return true;
        }
        if (!topicMoment.isTopicAnonymousType()) {
            return false;
        }
        boolean zM111187O2 = cmg.m111187O();
        Dialog dialog2 = this.f40852f;
        if (zM111187O2) {
            o1j0.m165652z("匿名话题与已添加话题不可同选", dialog2.getWindow().getDecorView());
        } else {
            o1j0.m165652z("添加了普通话题，不能再添加匿名话题", dialog2.getWindow().getDecorView());
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m63111p(TopicMoment topicMoment) {
        m63107l(topicMoment);
        m63109n();
        this.f40855i.notifyDataSetChanged();
    }

    public FeedPostSelectedTopicsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40851e = new ArrayList<>();
        this.f40857k = new HashSet<>();
        m63103h(context);
    }

    public FeedPostSelectedTopicsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40851e = new ArrayList<>();
        this.f40857k = new HashSet<>();
        m63103h(context);
    }
}

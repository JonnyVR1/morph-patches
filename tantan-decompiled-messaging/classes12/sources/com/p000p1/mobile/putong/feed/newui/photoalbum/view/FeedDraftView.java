package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.NewMomentDraft;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.c4g0;
import l.e30;
import l.ggi;
import l.hpd0;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.qnd;
import l.vwb;
import l.xdl0;
import l.zpd0;
import p007l.a5i;
import p007l.e1c0;
import p007l.f3c0;
import p007l.i2h;
import p007l.nkg;
import p007l.oe40;
import p007l.p6j0;
import p007l.vqg;
import rx.subjects.a;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedDraftView extends VRelative {

    /* JADX INFO: renamed from: r */
    public static ggi<NewMomentDraft> f3821r = new ggi<>(new qnd("new_moment_draft_text", (String) null, FeedModule.m1139F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: s */
    public static ggi<NewMomentDraft> f3822s = new ggi<>(new qnd("new_moment_draft_media", (String) null, FeedModule.m1139F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: t */
    public static zpd0 f3823t = new zpd0("close_draft_guide_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: u */
    public static a<Boolean> f3824u = a.b();

    /* JADX INFO: renamed from: d */
    public VRelative f3825d;

    /* JADX INFO: renamed from: e */
    public VFrame f3826e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f3827f;

    /* JADX INFO: renamed from: g */
    public TextView f3828g;

    /* JADX INFO: renamed from: h */
    public VImage f3829h;

    /* JADX INFO: renamed from: i */
    public VImage f3830i;

    /* JADX INFO: renamed from: j */
    public VLinear f3831j;

    /* JADX INFO: renamed from: k */
    public TextView f3832k;

    /* JADX INFO: renamed from: l */
    public VText f3833l;

    /* JADX INFO: renamed from: m */
    public hpd0 f3834m;

    /* JADX INFO: renamed from: n */
    public PutongFrag f3835n;

    /* JADX INFO: renamed from: o */
    public c4g0 f3836o;

    /* JADX INFO: renamed from: p */
    public TopicOperations f3837p;

    /* JADX INFO: renamed from: q */
    public String f3838q;

    public FeedDraftView(Context context) {
        super(context);
        this.f3834m = FeedModule.f316d.f14954U;
        m6203Q(context);
    }

    /* JADX INFO: renamed from: P */
    public static void m6202P(boolean z) {
        f3824u.onNext(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    private void m6203Q(Context context) {
        setPadding(0, 1, 0, 0);
        addView(m6209M(LayoutInflater.from(context), this));
        xdl0.M(this.f3825d, false);
        this.f3830i.setOnClickListener(new View.OnClickListener() { // from class: l.b2h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5892a.m6204T(view);
            }
        });
        ((Act) context).duringCreated(FeedModule.f316d.m16732t7()).subscribe(mkd0.H(new e30() { // from class: l.c2h
            public final void call(Object obj) {
                this.f6493a.m6213V((TopicOperations) obj);
            }
        }, new e30() { // from class: l.d2h
            public final void call(Object obj) {
                FeedDraftView.m6208z((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m6204T(View view) {
        f3823t.put(Long.valueOf(mqi0.o()));
        xdl0.M(this.f3825d, false);
        if (NullChecker.a(this.f3836o)) {
            mkd0.z(this.f3836o);
        }
    }

    /* JADX INFO: renamed from: c0 */
    private void m6205c0(ArrayList<Media> arrayList) {
        if (arrayList.size() > 0) {
            Media media = arrayList.get(0);
            if (media instanceof Audio) {
                this.f3826e.setBackgroundResource(f3c0.f7658M0);
                int i = (int) ((Audio) media).duration;
                this.f3828g.setText(i + "\"");
                this.f3828g.setVisibility(0);
                this.f3827f.setVisibility(8);
                this.f3838q = "voice";
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m6208z(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public View m6209M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i2h.m10772b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public boolean m6210O() {
        return PermissionHelper.b(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    /* JADX INFO: renamed from: R */
    public void m6211R(PutongFrag putongFrag) {
        this.f3835n = putongFrag;
        this.f3836o = putongFrag.duringCreated(f3824u).subscribe(mkd0.G(new e30() { // from class: l.h2h
            public final void call(Object obj) {
                this.f8565a.m6214W((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final void m6212S(View view) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.g2h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8305a.m6215X(view2);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m6213V(TopicOperations topicOperations) {
        if (!NullChecker.a(topicOperations)) {
            xdl0.M(this.f3825d, false);
        } else {
            if (a5i.m8407g(((Long) f3823t.get()).longValue())) {
                return;
            }
            this.f3837p = topicOperations;
            m6217Z();
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m6214W(Boolean bool) {
        m6217Z();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m6215X(View view) {
        oe40.m12583k0(this.f3835n.act(), vwb.f0(new Media[0]), true, "moment_post_drafts");
        p6j0.m12913c("e_moment_post_drafts", nkg.m12227Y() ? "p_like" : "p_follow", j760.a("moment_drafts_type", String.valueOf(this.f3838q)));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m6216Y(ggi.a aVar) {
        if (aVar == null) {
            return;
        }
        m6218a0((NewMomentDraft) aVar.a);
        xdl0.M(this.f3825d, NullChecker.a(this.f3837p));
        p6j0.m12915e("e_moment_post_drafts", nkg.m12227Y() ? "p_like" : "p_follow", j760.a("moment_drafts_type", String.valueOf(this.f3838q)));
    }

    /* JADX INFO: renamed from: Z */
    public void m6217Z() {
        ggi<NewMomentDraft> ggiVar;
        if (this.f3835n == null) {
            return;
        }
        if (!m6210O()) {
            xdl0.M(this.f3825d, false);
            return;
        }
        if (((Boolean) FeedModule.f316d.f14956V.get()).booleanValue()) {
            ggiVar = f3821r;
        } else {
            if (!((Boolean) this.f3834m.get()).booleanValue()) {
                xdl0.M(this.f3825d, false);
                return;
            }
            ggiVar = f3822s;
        }
        this.f3835n.duringCreated(ggiVar.k().compose(mkd0.C())).subscribe(mkd0.G(new e30() { // from class: l.e2h
            public final void call(Object obj) {
                this.f7176a.m6216Y((ggi.a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m6218a0(NewMomentDraft newMomentDraft) {
        this.f3828g.setVisibility(8);
        this.f3829h.setVisibility(8);
        if (vwb.J(newMomentDraft.images)) {
            this.f3826e.setBackgroundResource(f3c0.f7665N0);
            this.f3829h.setVisibility(0);
            this.f3827f.setVisibility(8);
            this.f3838q = "word";
        } else if (vqg.m15501Y(newMomentDraft.images)) {
            m6205c0((ArrayList) newMomentDraft.images);
        } else {
            this.f3827f.setVisibility(0);
            this.f3826e.setBackgroundResource(e1c0.f7155n0);
            m6220e0((ArrayList) newMomentDraft.images);
        }
        if (NullChecker.a(this.f3837p)) {
            this.f3832k.setText(this.f3837p.postGuide.title);
            this.f3833l.setText(this.f3837p.postGuide.subTitle);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m6219b0(PutongFrag putongFrag) {
        if (a5i.m8407g(((Long) f3823t.get()).longValue())) {
            return;
        }
        m6211R(putongFrag);
        m6217Z();
        vwb.z(vwb.f0(new ViewGroup[]{this.f3826e, this.f3831j}), new e30() { // from class: l.f2h
            public final void call(Object obj) {
                this.f7525a.m6212S((ViewGroup) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final void m6220e0(ArrayList<Media> arrayList) {
        if (arrayList.size() > 0) {
            Media media = arrayList.get(0);
            if (media instanceof Video) {
                qib0.G.m0(this.f3827f, ((Video) media).cover.url);
                this.f3838q = "video";
            } else {
                qib0.G.L0(this.f3827f, media.url);
                this.f3838q = "photo";
            }
        }
    }

    public FeedDraftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3834m = FeedModule.f316d.f14954U;
        m6203Q(context);
    }

    public FeedDraftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3834m = FeedModule.f316d.f14954U;
        m6203Q(context);
    }
}

package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.NewMomentDraft;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.a5i;
import p149l.c4g0;
import p149l.e1c0;
import p149l.e30;
import p149l.f3c0;
import p149l.ggi;
import p149l.hpd0;
import p149l.i2h;
import p149l.j760;
import p149l.mkd0;
import p149l.mqi0;
import p149l.nkg;
import p149l.oe40;
import p149l.p6j0;
import p149l.qib0;
import p149l.qnd;
import p149l.vqg;
import p149l.vwb;
import p149l.xdl0;
import p149l.zpd0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedDraftView extends VRelative {

    /* JADX INFO: renamed from: r */
    public static ggi<NewMomentDraft> f42360r = new ggi<>(new qnd("new_moment_draft_text", null, FeedModule.m60221F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: s */
    public static ggi<NewMomentDraft> f42361s = new ggi<>(new qnd("new_moment_draft_media", null, FeedModule.m60221F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: t */
    public static zpd0 f42362t = new zpd0("close_draft_guide_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: u */
    public static C22392a<Boolean> f42363u = C22392a.m221512b();

    /* JADX INFO: renamed from: d */
    public VRelative f42364d;

    /* JADX INFO: renamed from: e */
    public VFrame f42365e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f42366f;

    /* JADX INFO: renamed from: g */
    public TextView f42367g;

    /* JADX INFO: renamed from: h */
    public VImage f42368h;

    /* JADX INFO: renamed from: i */
    public VImage f42369i;

    /* JADX INFO: renamed from: j */
    public VLinear f42370j;

    /* JADX INFO: renamed from: k */
    public TextView f42371k;

    /* JADX INFO: renamed from: l */
    public VText f42372l;

    /* JADX INFO: renamed from: m */
    public hpd0 f42373m;

    /* JADX INFO: renamed from: n */
    public PutongFrag f42374n;

    /* JADX INFO: renamed from: o */
    public c4g0 f42375o;

    /* JADX INFO: renamed from: p */
    public TopicOperations f42376p;

    /* JADX INFO: renamed from: q */
    public String f42377q;

    public FeedDraftView(Context context) {
        super(context);
        this.f42373m = FeedModule.f38855d.f193019U;
        m65102Q(context);
    }

    /* JADX INFO: renamed from: P */
    public static void m65101P(boolean z) {
        f42363u.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: Q */
    private void m65102Q(Context context) {
        setPadding(0, 1, 0, 0);
        addView(m65108M(LayoutInflater.from(context), this));
        xdl0.m208344M(this.f42364d, false);
        this.f42369i.setOnClickListener(new View.OnClickListener() { // from class: l.b2h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72696a.m65103T(view);
            }
        });
        ((Act) context).duringCreated(FeedModule.f38855d.m209551t7()).subscribe(mkd0.m154956H(new e30() { // from class: l.c2h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78358a.m65112V((TopicOperations) obj);
            }
        }, new e30() { // from class: l.d2h
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedDraftView.m65107z((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m65103T(View view) {
        f42362t.put(Long.valueOf(mqi0.m155944o()));
        xdl0.m208344M(this.f42364d, false);
        if (NullChecker.m81303a(this.f42375o)) {
            mkd0.m154992z(this.f42375o);
        }
    }

    /* JADX INFO: renamed from: c0 */
    private void m65104c0(ArrayList<Media> arrayList) {
        if (arrayList.size() > 0) {
            Media media = arrayList.get(0);
            if (media instanceof Audio) {
                this.f42365e.setBackgroundResource(f3c0.f94375M0);
                int i = (int) ((Audio) media).duration;
                this.f42367g.setText(i + "\"");
                this.f42367g.setVisibility(0);
                this.f42366f.setVisibility(8);
                this.f42377q = "voice";
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m65107z(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public View m65108M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i2h.m134052b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public boolean m65109O() {
        return PermissionHelper.m79881b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX INFO: renamed from: R */
    public void m65110R(PutongFrag putongFrag) {
        this.f42374n = putongFrag;
        this.f42375o = putongFrag.duringCreated(f42363u).subscribe(mkd0.m154955G(new e30() { // from class: l.h2h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105531a.m65113W((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final void m65111S(View view) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.g2h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f100262a.m65114X(view2);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m65112V(TopicOperations topicOperations) {
        if (!NullChecker.m81303a(topicOperations)) {
            xdl0.m208344M(this.f42364d, false);
        } else {
            if (a5i.m95031g(f42362t.get().longValue())) {
                return;
            }
            this.f42376p = topicOperations;
            m65116Z();
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m65113W(Boolean bool) {
        m65116Z();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m65114X(View view) {
        oe40.m163846k0(this.f42374n.act(), vwb.m200324f0(new Media[0]), true, "moment_post_drafts");
        p6j0.m167669c("e_moment_post_drafts", nkg.m159868Y() ? "p_like" : "p_follow", j760.m140076a("moment_drafts_type", String.valueOf(this.f42377q)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m65115Y(ggi.C17074a c17074a) {
        if (c17074a == null) {
            return;
        }
        m65117a0((NewMomentDraft) c17074a.f102512a);
        xdl0.m208344M(this.f42364d, NullChecker.m81303a(this.f42376p));
        p6j0.m167671e("e_moment_post_drafts", nkg.m159868Y() ? "p_like" : "p_follow", j760.m140076a("moment_drafts_type", String.valueOf(this.f42377q)));
    }

    /* JADX INFO: renamed from: Z */
    public void m65116Z() {
        ggi<NewMomentDraft> ggiVar;
        if (this.f42374n == null) {
            return;
        }
        if (!m65109O()) {
            xdl0.m208344M(this.f42364d, false);
            return;
        }
        if (FeedModule.f38855d.f193021V.get().booleanValue()) {
            ggiVar = f42360r;
        } else {
            if (!this.f42373m.get().booleanValue()) {
                xdl0.m208344M(this.f42364d, false);
                return;
            }
            ggiVar = f42361s;
        }
        this.f42374n.duringCreated((C22306c) ggiVar.m125973k().compose(mkd0.m154951C())).subscribe(mkd0.m154955G(new e30() { // from class: l.e2h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88919a.m65115Y((ggi.C17074a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m65117a0(NewMomentDraft newMomentDraft) {
        this.f42367g.setVisibility(8);
        this.f42368h.setVisibility(8);
        if (vwb.m200296J(newMomentDraft.images)) {
            this.f42365e.setBackgroundResource(f3c0.f94382N0);
            this.f42368h.setVisibility(0);
            this.f42366f.setVisibility(8);
            this.f42377q = "word";
        } else if (vqg.m199531Y(newMomentDraft.images)) {
            m65104c0((ArrayList) newMomentDraft.images);
        } else {
            this.f42366f.setVisibility(0);
            this.f42365e.setBackgroundResource(e1c0.f88799n0);
            m65119e0((ArrayList) newMomentDraft.images);
        }
        if (NullChecker.m81303a(this.f42376p)) {
            this.f42371k.setText(this.f42376p.postGuide.title);
            this.f42372l.setText(this.f42376p.postGuide.subTitle);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m65118b0(PutongFrag putongFrag) {
        if (a5i.m95031g(f42362t.get().longValue())) {
            return;
        }
        m65110R(putongFrag);
        m65116Z();
        vwb.m200354z(vwb.m200324f0(this.f42365e, this.f42370j), new e30() { // from class: l.f2h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94180a.m65111S((ViewGroup) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final void m65119e0(ArrayList<Media> arrayList) {
        if (arrayList.size() > 0) {
            Media media = arrayList.get(0);
            if (media instanceof Video) {
                qib0.f154691G.m102367m0(this.f42366f, ((Video) media).cover.url);
                this.f42377q = "video";
            } else {
                qib0.f154691G.m102331L0(this.f42366f, media.url);
                this.f42377q = ReminderAction.photo;
            }
        }
    }

    public FeedDraftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42373m = FeedModule.f38855d.f193019U;
        m65102Q(context);
    }

    public FeedDraftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42373m = FeedModule.f38855d.f193019U;
        m65102Q(context);
    }
}

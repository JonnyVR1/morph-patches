package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.NewMomentDraft;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.byd0;
import p153l.cmg;
import p153l.cn40;
import p153l.dji;
import p153l.jxd0;
import p153l.jyb;
import p153l.k9c0;
import p153l.kcg0;
import p153l.ksg;
import p153l.lbc0;
import p153l.p6i;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.tfj0;
import p153l.uqb0;
import p153l.vod;
import p153l.x3h;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedDraftView extends VRelative {

    /* JADX INFO: renamed from: r */
    public static dji<NewMomentDraft> f43208r = new dji<>(new vod("new_moment_draft_text", null, FeedModule.m61405F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: s */
    public static dji<NewMomentDraft> f43209s = new dji<>(new vod("new_moment_draft_media", null, FeedModule.m61405F().userId()), -1, NewMomentDraft.PROTOBUF_ADAPTER);

    /* JADX INFO: renamed from: t */
    public static byd0 f43210t = new byd0("close_draft_guide_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: u */
    public static C22507a<Boolean> f43211u = C22507a.m222758b();

    /* JADX INFO: renamed from: d */
    public VRelative f43212d;

    /* JADX INFO: renamed from: e */
    public VFrame f43213e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f43214f;

    /* JADX INFO: renamed from: g */
    public TextView f43215g;

    /* JADX INFO: renamed from: h */
    public VImage f43216h;

    /* JADX INFO: renamed from: i */
    public VImage f43217i;

    /* JADX INFO: renamed from: j */
    public VLinear f43218j;

    /* JADX INFO: renamed from: k */
    public TextView f43219k;

    /* JADX INFO: renamed from: l */
    public VText f43220l;

    /* JADX INFO: renamed from: m */
    public jxd0 f43221m;

    /* JADX INFO: renamed from: n */
    public PutongFrag f43222n;

    /* JADX INFO: renamed from: o */
    public kcg0 f43223o;

    /* JADX INFO: renamed from: p */
    public TopicOperations f43224p;

    /* JADX INFO: renamed from: q */
    public String f43225q;

    public FeedDraftView(Context context) {
        super(context);
        this.f43221m = FeedModule.f39703d.f121329U;
        m66285Q(context);
    }

    /* JADX INFO: renamed from: P */
    public static void m66284P(boolean z) {
        f43211u.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: Q */
    private void m66285Q(Context context) {
        setPadding(0, 1, 0, 0);
        addView(m66291M(LayoutInflater.from(context), this));
        bnl0.m105524M(this.f43212d, false);
        this.f43217i.setOnClickListener(new View.OnClickListener() { // from class: l.q3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155447a.m66286T(view);
            }
        });
        ((Act) context).duringCreated(FeedModule.f39703d.m145792t7()).subscribe(psd0.m173597H(new y20() { // from class: l.r3h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161040a.m66295V((TopicOperations) obj);
            }
        }, new y20() { // from class: l.s3h
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedDraftView.m66290z((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m66286T(View view) {
        f43210t.put(Long.valueOf(pzi0.m174454o()));
        bnl0.m105524M(this.f43212d, false);
        if (NullChecker.m82486a(this.f43223o)) {
            psd0.m173633z(this.f43223o);
        }
    }

    /* JADX INFO: renamed from: c0 */
    private void m66287c0(ArrayList<Media> arrayList) {
        if (arrayList.size() > 0) {
            Media media = arrayList.get(0);
            if (media instanceof Audio) {
                this.f43213e.setBackgroundResource(lbc0.f130893M0);
                int i = (int) ((Audio) media).duration;
                this.f43215g.setText(i + "\"");
                this.f43215g.setVisibility(0);
                this.f43214f.setVisibility(8);
                this.f43225q = "voice";
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m66290z(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public View m66291M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x3h.m209213b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: O */
    public boolean m66292O() {
        return PermissionHelper.m81064b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX INFO: renamed from: R */
    public void m66293R(PutongFrag putongFrag) {
        this.f43222n = putongFrag;
        this.f43223o = putongFrag.duringCreated(f43211u).subscribe(psd0.m173596G(new y20() { // from class: l.w3h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187138a.m66296W((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: S */
    public final void m66294S(View view) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.v3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f182210a.m66297X(view2);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m66295V(TopicOperations topicOperations) {
        if (!NullChecker.m82486a(topicOperations)) {
            bnl0.m105524M(this.f43212d, false);
        } else {
            if (p6i.m170898g(f43210t.get().longValue())) {
                return;
            }
            this.f43224p = topicOperations;
            m66299Z();
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m66296W(Boolean bool) {
        m66299Z();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m66297X(View view) {
        cn40.m111396k0(this.f43222n.act(), jyb.m147507f0(new Media[0]), true, "moment_post_drafts");
        tfj0.m190940c("e_moment_post_drafts", cmg.m111197Y() ? "p_like" : "p_follow", pf60.m172085a("moment_drafts_type", String.valueOf(this.f43225q)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m66298Y(dji.C16549a c16549a) {
        if (c16549a == null) {
            return;
        }
        m66300a0((NewMomentDraft) c16549a.f88861a);
        bnl0.m105524M(this.f43212d, NullChecker.m82486a(this.f43224p));
        tfj0.m190942e("e_moment_post_drafts", cmg.m111197Y() ? "p_like" : "p_follow", pf60.m172085a("moment_drafts_type", String.valueOf(this.f43225q)));
    }

    /* JADX INFO: renamed from: Z */
    public void m66299Z() {
        dji<NewMomentDraft> djiVar;
        if (this.f43222n == null) {
            return;
        }
        if (!m66292O()) {
            bnl0.m105524M(this.f43212d, false);
            return;
        }
        if (FeedModule.f39703d.f121331V.get().booleanValue()) {
            djiVar = f43208r;
        } else {
            if (!this.f43221m.get().booleanValue()) {
                bnl0.m105524M(this.f43212d, false);
                return;
            }
            djiVar = f43209s;
        }
        this.f43222n.duringCreated((C22421c) djiVar.m116105k().compose(psd0.m173592C())).subscribe(psd0.m173596G(new y20() { // from class: l.t3h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171920a.m66298Y((dji.C16549a) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m66300a0(NewMomentDraft newMomentDraft) {
        this.f43215g.setVisibility(8);
        this.f43216h.setVisibility(8);
        if (jyb.m147479J(newMomentDraft.images)) {
            this.f43213e.setBackgroundResource(lbc0.f130900N0);
            this.f43216h.setVisibility(0);
            this.f43214f.setVisibility(8);
            this.f43225q = "word";
        } else if (ksg.m151190Y(newMomentDraft.images)) {
            m66287c0((ArrayList) newMomentDraft.images);
        } else {
            this.f43214f.setVisibility(0);
            this.f43213e.setBackgroundResource(k9c0.f124522n0);
            m66302e0((ArrayList) newMomentDraft.images);
        }
        if (NullChecker.m82486a(this.f43224p)) {
            this.f43219k.setText(this.f43224p.postGuide.title);
            this.f43220l.setText(this.f43224p.postGuide.subTitle);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m66301b0(PutongFrag putongFrag) {
        if (p6i.m170898g(f43210t.get().longValue())) {
            return;
        }
        m66293R(putongFrag);
        m66299Z();
        jyb.m147537z(jyb.m147507f0(this.f43213e, this.f43218j), new y20() { // from class: l.u3h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177344a.m66294S((ViewGroup) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final void m66302e0(ArrayList<Media> arrayList) {
        if (arrayList.size() > 0) {
            Media media = arrayList.get(0);
            if (media instanceof Video) {
                uqb0.f180374G.m127150m0(this.f43214f, ((Video) media).cover.url);
                this.f43225q = "video";
            } else {
                uqb0.f180374G.m127115L0(this.f43214f, media.url);
                this.f43225q = ReminderAction.photo;
            }
        }
    }

    public FeedDraftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43221m = FeedModule.f39703d.f121329U;
        m66285Q(context);
    }

    public FeedDraftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43221m = FeedModule.f39703d.f121329U;
        m66285Q(context);
    }
}

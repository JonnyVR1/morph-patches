package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CommentInfo;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.MomentMessageType;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.MomentDetailExpandBottomView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentChildDetailsView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentDetailsView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentParentDetailsView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.MomentDetailExpandCommentView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class hi00 extends di5 {

    /* JADX INFO: renamed from: B */
    public static int f109957B;

    /* JADX INFO: renamed from: k */
    public final String f109959k;

    /* JADX INFO: renamed from: l */
    public MomentDetailFrag f109960l;

    /* JADX INFO: renamed from: m */
    public nk00 f109961m;

    /* JADX INFO: renamed from: n */
    public hj00 f109962n;

    /* JADX INFO: renamed from: p */
    public Links f109964p;

    /* JADX INFO: renamed from: q */
    public final Act f109965q;

    /* JADX INFO: renamed from: r */
    public final n570 f109966r;

    /* JADX INFO: renamed from: s */
    public Moment f109967s;

    /* JADX INFO: renamed from: t */
    public final String f109968t;

    /* JADX INFO: renamed from: u */
    public final String f109969u;

    /* JADX INFO: renamed from: v */
    public MomentDetailHeaderBottomView f109970v;

    /* JADX INFO: renamed from: w */
    public final boolean f109971w;

    /* JADX INFO: renamed from: x */
    public MomentDetailExpandCommentView f109972x;

    /* JADX INFO: renamed from: y */
    public x20 f109973y;

    /* JADX INFO: renamed from: z */
    public boolean f109974z;

    /* JADX INFO: renamed from: o */
    public boolean f109963o = false;

    /* JADX INFO: renamed from: A */
    public h80<MomentMessage> f109958A = new C17465a();

    /* JADX INFO: renamed from: l.hi00$a */
    public class C17465a extends h80<MomentMessage> {
        public C17465a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo65120k(MomentMessage momentMessage, int i, View view) {
            String str;
            MomentMessageType momentMessageType = momentMessage.messageType;
            if (TEnum.equals(momentMessageType, "sticker")) {
                str = "gif";
            } else {
                str = TEnum.equals(momentMessageType, "picture") ? "picture" : "text";
            }
            tfj0.m190942e("e_user_comment", "p_user_moment_interactions_details_view", pf60.m172085a("comment_user_id", momentMessage.owner), pf60.m172085a("comment_type", str), pf60.m172085a("owner_id", hi00.this.f109967s.owner), pf60.m172085a("moment_id", hi00.this.f109967s.f56859id), pf60.m172085a("moment_type", er60.m122104w().m122135y(hi00.this.f109967s)), pf60.m172085a("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"));
            j9h.m143945d(hi00.this.f109967s, "p_user_moment_interactions_details_view");
        }
    }

    public hi00(boolean z, Act act, n570 n570Var, Moment moment, String str, String str2, MomentDetailFrag momentDetailFrag, nk00 nk00Var, hj00 hj00Var, x20 x20Var) {
        this.f109971w = z;
        this.f109965q = act;
        this.f109966r = n570Var;
        this.f109967s = moment;
        this.f109968t = str;
        this.f109969u = str2;
        this.f109960l = momentDetailFrag;
        this.f109961m = nk00Var;
        this.f109962n = hj00Var;
        this.f109959k = hj00Var.f110140v;
        f109957B = 0;
        this.f109973y = x20Var;
    }

    /* JADX INFO: renamed from: q0 */
    private void m135085q0() {
        this.f109960l.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.fi00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99142a.m135089o0((C4470c) obj);
            }
        }));
    }

    @Override // p153l.di5, p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        boolean zIsEmpty = this.f88578c.isEmpty();
        List<MomentMessage> list = this.f88578c;
        return zIsEmpty ? list.size() + 2 : list.size() + 1 + f109957B;
    }

    @Override // p153l.di5, p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 0) {
            MomentDetailHeaderBottomView momentDetailHeaderBottomView = (MomentDetailHeaderBottomView) this.f109965q.inflater().inflate(tec0.f173647d4, (ViewGroup) this.f109961m.f142397c, false);
            this.f109970v = momentDetailHeaderBottomView;
            return momentDetailHeaderBottomView;
        }
        if (i == 8) {
            MomentDetailExpandCommentView momentDetailExpandCommentView = (MomentDetailExpandCommentView) this.f109965q.inflater().inflate(tec0.f173742r1, (ViewGroup) this.f109961m.f142397c, false);
            this.f109972x = momentDetailExpandCommentView;
            return momentDetailExpandCommentView;
        }
        if (i == 2) {
            CommonEmptyView commonEmptyView = (CommonEmptyView) this.f109965q.inflater().inflate(tec0.f173649e, viewGroup, false);
            bnl0.m105554f0(commonEmptyView, qa00.m175859d(28.0f));
            bnl0.m105524M(commonEmptyView.f41668a, false);
            return commonEmptyView;
        }
        if (i == 5) {
            return this.f109965q.inflater().inflate(tec0.f173735q1, viewGroup, false);
        }
        if (i == 4) {
            return this.f109965q.inflater().inflate(tec0.f173624a2, viewGroup, false);
        }
        Act act = this.f109965q;
        return i == 3 ? act.inflater().inflate(tec0.f173638c2, viewGroup, false) : act.inflater().inflate(tec0.f173732p5, viewGroup, false);
    }

    @Override // p153l.di5, p153l.jic0
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, MomentMessage momentMessage, int i, int i2) {
        MomentMessage momentMessage2;
        int i3;
        hi00 hi00Var = this;
        if (i != 0) {
            if (i == 1) {
                ((PhotoAlbumCommentDetailsView) view).m64692u(hi00Var.f109966r, momentMessage, hi00Var.f109968t, hi00Var.f109962n.f110133o);
            } else {
                if (i == 5) {
                    n570 n570Var = hi00Var.f109966r;
                    String str = hi00Var.f109968t;
                    String str2 = hi00Var.f109962n.f110133o;
                    String str3 = momentMessage.commentInfo.parentMessageId;
                    Links linksM115856T = hi00Var.m115856T(str3);
                    CommentInfo commentInfo = momentMessage.commentInfo;
                    ((MomentDetailExpandBottomView) view).m64330l(n570Var, this, str, str2, str3, linksM115856T, commentInfo.moreSubMessages, hi00Var.f88582g.get(commentInfo.parentMessageId).booleanValue(), i2 - 1);
                    hi00Var = this;
                    momentMessage2 = momentMessage;
                } else if (i == 4) {
                    if (view instanceof PhotoAlbumCommentChildDetailsView) {
                        ((PhotoAlbumCommentChildDetailsView) view).m64760q0(hi00Var, hi00Var.f109966r, momentMessage, hi00Var.f109968t, hi00Var.f109962n.f110123e, hi00Var.f109969u);
                    }
                    momentMessage2 = momentMessage;
                } else if (i == 3) {
                    momentMessage2 = momentMessage;
                    ((PhotoAlbumCommentParentDetailsView) view).m64760q0(hi00Var, hi00Var.f109966r, momentMessage2, hi00Var.f109968t, hi00Var.f109962n.f110123e, hi00Var.f109969u);
                } else {
                    momentMessage2 = momentMessage;
                    if (i == 2) {
                        bnl0.m105525M0(view, hi00Var.f109963o);
                        CommonEmptyView commonEmptyView = (CommonEmptyView) view;
                        boolean zEquals = TextUtils.equals(hi00Var.f109968t, FeedModule.m61405F().userId());
                        Act act = hi00Var.f109965q;
                        String string = zEquals ? act.getString(R$string.f39870a4) : act.getString(R$string.f39919h4);
                        if (hi00Var.f109971w) {
                            string = hi00Var.f109965q.getString(R$string.f39890d3);
                        }
                        commonEmptyView.f41669b.setText(string);
                        commonEmptyView.f41668a.setImageResource(lbc0.f130994a3);
                        commonEmptyView.f41669b.setTextColor(hi00Var.f109960l.getResources().getColor(k9c0.f124520m0));
                        i3 = 1;
                        bnl0.m105524M(commonEmptyView.f41668a, true);
                    } else {
                        i3 = 1;
                        if (i == 8) {
                            MomentDetailExpandCommentView momentDetailExpandCommentView = (MomentDetailExpandCommentView) view;
                            momentDetailExpandCommentView.m66058b(hi00Var);
                            if (di5.m115850W(hi00Var.f109964p)) {
                                momentDetailExpandCommentView.setVisibility(0);
                                bnl0.m105505C0(momentDetailExpandCommentView, -2);
                            } else {
                                momentDetailExpandCommentView.setVisibility(8);
                                bnl0.m105505C0(momentDetailExpandCommentView, 0);
                            }
                        }
                    }
                }
                i3 = 1;
            }
            if (i != i3 || i == 4 || i == 3) {
                hi00Var.f109958A.m133881h(view, momentMessage2, i2);
            }
            return;
        }
        MomentDetailHeaderBottomView momentDetailHeaderBottomView = (MomentDetailHeaderBottomView) view;
        hi00Var.f109970v = momentDetailHeaderBottomView;
        hi00Var.m135088n0(momentDetailHeaderBottomView);
        MomentDetailHeaderBottomView momentDetailHeaderBottomView2 = hi00Var.f109970v;
        n570 n570Var2 = hi00Var.f109966r;
        Moment moment = hi00Var.f109967s;
        String str4 = hi00Var.f109969u;
        boolean z = hi00Var.f109971w;
        hj00 hj00Var = hi00Var.f109962n;
        momentDetailHeaderBottomView2.m64383f0(n570Var2, moment, str4, z, hj00Var.f110141w, hi00Var.f109973y, hj00Var.f110142x);
        if (!hi00Var.f109974z) {
            hi00Var.f109974z = true;
            hi00Var.f109970v.m64392o0();
        }
        hi00Var.m135085q0();
        i3 = 1;
        momentMessage2 = momentMessage;
        if (i != i3) {
        }
        hi00Var.f109958A.m133881h(view, momentMessage2, i2);
    }

    @Override // p153l.di5, p153l.jic0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public MomentMessage getItem(int i) {
        if (i == 0 || this.f88578c.isEmpty()) {
            return null;
        }
        return this.f88578c.get(i - 1);
    }

    @Override // p153l.di5
    /* JADX INFO: renamed from: d0 */
    public void mo115865d0(List<MomentMessage> list) {
        this.f88582g.clear();
        this.f88583h.clear();
        this.f109963o = true;
        for (int size = list.size() - 1; size >= 0; size--) {
            MomentMessage momentMessage = list.get(size);
            if (momentMessage.isChildComment()) {
                m115861Z(momentMessage, momentMessage.commentInfo.parentMessageId);
                list.remove(momentMessage);
            }
        }
        int size2 = 0;
        while (size2 < list.size()) {
            MomentMessage momentMessage2 = list.get(size2);
            m115870i0(momentMessage2);
            List<MomentMessage> listM115853Q = m115853Q(momentMessage2, this.f88580e.get(momentMessage2.f56856id), false);
            if (!NullChecker.m82486a(listM115853Q) || listM115853Q.size() <= 0) {
                size2++;
            } else {
                list.addAll(size2 + 1, listM115853Q);
                size2 += listM115853Q.size() + 1;
            }
        }
        super.mo115865d0(list);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (this.f88578c.size() - i < 2) {
            m135090p0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (this.f88578c.isEmpty()) {
            return 2;
        }
        if (i == this.f88578c.size() + 1) {
            return 8;
        }
        if (ksg.m151187V(this.f109967s)) {
            return 1;
        }
        MomentMessage item = getItem(i);
        if (mo115862a0(item)) {
            return 5;
        }
        return item.isChildComment() ? 4 : 3;
    }

    @Override // p153l.di5
    /* JADX INFO: renamed from: h0 */
    public void mo115869h0() {
        this.f109962n.m135286H1(this.f88578c);
    }

    /* JADX INFO: renamed from: l0 */
    public int m135086l0(final MomentMessage momentMessage) {
        if (momentMessage == null) {
            return 0;
        }
        return jyb.m147476G(this.f88578c, new qcj() { // from class: l.gi00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(momentMessage.f56856id.equals(((MomentMessage) obj).f56856id));
            }
        }) + 2;
    }

    /* JADX INFO: renamed from: m0 */
    public final RawFeed m135087m0(Moment moment) {
        if (NullChecker.m82486a(moment) && this.f109966r.m161687p()) {
            return this.f109966r.f140315b.m177160c(moment.f56859id);
        }
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m135088n0(MomentDetailHeaderBottomView momentDetailHeaderBottomView) {
        fo00 go00Var;
        if ((NullChecker.m82487b(momentDetailHeaderBottomView) && NullChecker.m82486a(this.f109967s) && (ksg.m151187V(this.f109967s) || this.f109967s.media.size() != 0 || ksg.m151191Z(this.f109967s))) || (cmg.m111224n0() && NullChecker.m82486a(this.f109967s) && this.f109967s.shareMyVote)) {
            int size = this.f109967s.media.size();
            if (size != 0) {
                if (size != 1) {
                    go00Var = new co00();
                } else {
                    Media media = this.f109967s.media.get(0);
                    if (media instanceof Video) {
                        go00Var = new ko00();
                    } else if (media instanceof Audio) {
                        go00Var = new yn00();
                    } else {
                        String str = this.f109967s.hyperlink;
                        boolean z = str != null && str.contains("type=\"img\"");
                        boolean z2 = !(TextUtils.isEmpty(this.f109967s.landingPage) && TextUtils.isEmpty(this.f109967s.deeplink)) && ksg.m151187V(this.f109967s);
                        if (!NullChecker.m82486a(this.f109967s.simpleActivity) || TextUtils.isEmpty(pu20.m173807b(this.f109967s.simpleActivity.f40083id))) {
                            go00Var = (z2 || z) ? new ao00() : new co00();
                        } else {
                            go00Var = new ho00();
                        }
                    }
                }
            } else if (ksg.m151191Z(this.f109967s)) {
                go00Var = new zn00();
            } else {
                go00Var = ksg.m151229s0(this.f109967s) ? new go00() : new io00();
            }
            if (cmg.m111224n0() && NullChecker.m82486a(this.f109967s) && this.f109967s.shareMyVote) {
                go00Var = new jo00();
            }
            go00Var.m126437f(this.f109969u);
            go00Var.m126438g(m135087m0(this.f109967s));
            hj00 hj00Var = this.f109962n;
            go00Var.m126436e(hj00Var.f110141w, hj00Var.f110142x);
            momentDetailHeaderBottomView.setMomentHeaderInsertProxy(go00Var);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m135089o0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            if (NullChecker.m82486a(this.f109970v)) {
                this.f109970v.m64382e0();
            }
        } else if (c4470c == C4470c.f16268j) {
            if (NullChecker.m82486a(this.f109970v)) {
                this.f109970v.m64381d0();
            }
        } else if (c4470c == C4470c.f16269k && NullChecker.m82486a(this.f109970v)) {
            this.f109970v.m64398t0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f109958A.m133884o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f109958A.m133884o();
    }

    /* JADX INFO: renamed from: p0 */
    public void m135090p0() {
        if (!di5.m115850W(this.f109964p) || this.f88578c.size() <= 0) {
            return;
        }
        this.f109966r.mo65703z();
    }
}

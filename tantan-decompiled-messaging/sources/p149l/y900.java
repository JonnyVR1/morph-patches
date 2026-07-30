package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CommentInfo;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.MomentMessageType;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.MomentDetailExpandBottomView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentChildDetailsView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentDetailsView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentParentDetailsView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.MomentDetailExpandCommentView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class y900 extends dh5 {

    /* JADX INFO: renamed from: B */
    public static int f196907B;

    /* JADX INFO: renamed from: k */
    public final String f196909k;

    /* JADX INFO: renamed from: l */
    public MomentDetailFrag f196910l;

    /* JADX INFO: renamed from: m */
    public ec00 f196911m;

    /* JADX INFO: renamed from: n */
    public ya00 f196912n;

    /* JADX INFO: renamed from: p */
    public Links f196914p;

    /* JADX INFO: renamed from: q */
    public final Act f196915q;

    /* JADX INFO: renamed from: r */
    public final hx60 f196916r;

    /* JADX INFO: renamed from: s */
    public Moment f196917s;

    /* JADX INFO: renamed from: t */
    public final String f196918t;

    /* JADX INFO: renamed from: u */
    public final String f196919u;

    /* JADX INFO: renamed from: v */
    public MomentDetailHeaderBottomView f196920v;

    /* JADX INFO: renamed from: w */
    public final boolean f196921w;

    /* JADX INFO: renamed from: x */
    public MomentDetailExpandCommentView f196922x;

    /* JADX INFO: renamed from: y */
    public d30 f196923y;

    /* JADX INFO: renamed from: z */
    public boolean f196924z;

    /* JADX INFO: renamed from: o */
    public boolean f196913o = false;

    /* JADX INFO: renamed from: A */
    public l80<MomentMessage> f196908A = new C21336a();

    /* JADX INFO: renamed from: l.y900$a */
    public class C21336a extends l80<MomentMessage> {
        public C21336a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo63937k(MomentMessage momentMessage, int i, View view) {
            String str;
            MomentMessageType momentMessageType = momentMessage.messageType;
            if (TEnum.equals(momentMessageType, "sticker")) {
                str = "gif";
            } else {
                str = TEnum.equals(momentMessageType, "picture") ? "picture" : "text";
            }
            p6j0.m167671e("e_user_comment", "p_user_moment_interactions_details_view", j760.m140076a("comment_user_id", momentMessage.owner), j760.m140076a("comment_type", str), j760.m140076a("owner_id", y900.this.f196917s.owner), j760.m140076a("moment_id", y900.this.f196917s.f56011id), j760.m140076a("moment_type", zi60.m218961w().m218992y(y900.this.f196917s)), j760.m140076a("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"));
            u7h.m192139d(y900.this.f196917s, "p_user_moment_interactions_details_view");
        }
    }

    public y900(boolean z, Act act, hx60 hx60Var, Moment moment, String str, String str2, MomentDetailFrag momentDetailFrag, ec00 ec00Var, ya00 ya00Var, d30 d30Var) {
        this.f196921w = z;
        this.f196915q = act;
        this.f196916r = hx60Var;
        this.f196917s = moment;
        this.f196918t = str;
        this.f196919u = str2;
        this.f196910l = momentDetailFrag;
        this.f196911m = ec00Var;
        this.f196912n = ya00Var;
        this.f196909k = ya00Var.f197130v;
        f196907B = 0;
        this.f196923y = d30Var;
    }

    /* JADX INFO: renamed from: q0 */
    private void m213521q0() {
        this.f196910l.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.w900
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185290a.m213525o0((C4319c) obj);
            }
        }));
    }

    @Override // p149l.dh5, p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        boolean zIsEmpty = this.f86234c.isEmpty();
        List<MomentMessage> list = this.f86234c;
        return zIsEmpty ? list.size() + 2 : list.size() + 1 + f196907B;
    }

    @Override // p149l.dh5, p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 0) {
            MomentDetailHeaderBottomView momentDetailHeaderBottomView = (MomentDetailHeaderBottomView) this.f196915q.inflater().inflate(o6c0.f142178d4, (ViewGroup) this.f196911m.f90425c, false);
            this.f196920v = momentDetailHeaderBottomView;
            return momentDetailHeaderBottomView;
        }
        if (i == 8) {
            MomentDetailExpandCommentView momentDetailExpandCommentView = (MomentDetailExpandCommentView) this.f196915q.inflater().inflate(o6c0.f142273r1, (ViewGroup) this.f196911m.f90425c, false);
            this.f196922x = momentDetailExpandCommentView;
            return momentDetailExpandCommentView;
        }
        if (i == 2) {
            CommonEmptyView commonEmptyView = (CommonEmptyView) this.f196915q.inflater().inflate(o6c0.f142180e, viewGroup, false);
            xdl0.m208374f0(commonEmptyView, t100.m186890d(28.0f));
            xdl0.m208344M(commonEmptyView.f40820a, false);
            return commonEmptyView;
        }
        if (i == 5) {
            return this.f196915q.inflater().inflate(o6c0.f142266q1, viewGroup, false);
        }
        if (i == 4) {
            return this.f196915q.inflater().inflate(o6c0.f142155a2, viewGroup, false);
        }
        Act act = this.f196915q;
        return i == 3 ? act.inflater().inflate(o6c0.f142169c2, viewGroup, false) : act.inflater().inflate(o6c0.f142263p5, viewGroup, false);
    }

    @Override // p149l.dh5, p149l.dac0
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, MomentMessage momentMessage, int i, int i2) {
        MomentMessage momentMessage2;
        int i3;
        y900 y900Var = this;
        if (i != 0) {
            if (i == 1) {
                ((PhotoAlbumCommentDetailsView) view).m63509u(y900Var.f196916r, momentMessage, y900Var.f196918t, y900Var.f196912n.f197123o);
            } else {
                if (i == 5) {
                    hx60 hx60Var = y900Var.f196916r;
                    String str = y900Var.f196918t;
                    String str2 = y900Var.f196912n.f197123o;
                    String str3 = momentMessage.commentInfo.parentMessageId;
                    Links linksM111796T = y900Var.m111796T(str3);
                    CommentInfo commentInfo = momentMessage.commentInfo;
                    ((MomentDetailExpandBottomView) view).m63147l(hx60Var, this, str, str2, str3, linksM111796T, commentInfo.moreSubMessages, y900Var.f86238g.get(commentInfo.parentMessageId).booleanValue(), i2 - 1);
                    y900Var = this;
                    momentMessage2 = momentMessage;
                } else if (i == 4) {
                    if (view instanceof PhotoAlbumCommentChildDetailsView) {
                        ((PhotoAlbumCommentChildDetailsView) view).m63577q0(y900Var, y900Var.f196916r, momentMessage, y900Var.f196918t, y900Var.f196912n.f197113e, y900Var.f196919u);
                    }
                    momentMessage2 = momentMessage;
                } else if (i == 3) {
                    momentMessage2 = momentMessage;
                    ((PhotoAlbumCommentParentDetailsView) view).m63577q0(y900Var, y900Var.f196916r, momentMessage2, y900Var.f196918t, y900Var.f196912n.f197113e, y900Var.f196919u);
                } else {
                    momentMessage2 = momentMessage;
                    if (i == 2) {
                        xdl0.m208345M0(view, y900Var.f196913o);
                        CommonEmptyView commonEmptyView = (CommonEmptyView) view;
                        boolean zEquals = TextUtils.equals(y900Var.f196918t, FeedModule.m60221F().userId());
                        Act act = y900Var.f196915q;
                        String string = zEquals ? act.getString(R$string.f39022a4) : act.getString(R$string.f39071h4);
                        if (y900Var.f196921w) {
                            string = y900Var.f196915q.getString(R$string.f39042d3);
                        }
                        commonEmptyView.f40821b.setText(string);
                        commonEmptyView.f40820a.setImageResource(f3c0.f94476a3);
                        commonEmptyView.f40821b.setTextColor(y900Var.f196910l.getResources().getColor(e1c0.f88797m0));
                        i3 = 1;
                        xdl0.m208344M(commonEmptyView.f40820a, true);
                    } else {
                        i3 = 1;
                        if (i == 8) {
                            MomentDetailExpandCommentView momentDetailExpandCommentView = (MomentDetailExpandCommentView) view;
                            momentDetailExpandCommentView.m64875b(y900Var);
                            if (dh5.m111790W(y900Var.f196914p)) {
                                momentDetailExpandCommentView.setVisibility(0);
                                xdl0.m208325C0(momentDetailExpandCommentView, -2);
                            } else {
                                momentDetailExpandCommentView.setVisibility(8);
                                xdl0.m208325C0(momentDetailExpandCommentView, 0);
                            }
                        }
                    }
                }
                i3 = 1;
            }
            if (i != i3 || i == 4 || i == 3) {
                y900Var.f196908A.m148839h(view, momentMessage2, i2);
            }
            return;
        }
        MomentDetailHeaderBottomView momentDetailHeaderBottomView = (MomentDetailHeaderBottomView) view;
        y900Var.f196920v = momentDetailHeaderBottomView;
        y900Var.m213524n0(momentDetailHeaderBottomView);
        MomentDetailHeaderBottomView momentDetailHeaderBottomView2 = y900Var.f196920v;
        hx60 hx60Var2 = y900Var.f196916r;
        Moment moment = y900Var.f196917s;
        String str4 = y900Var.f196919u;
        boolean z = y900Var.f196921w;
        ya00 ya00Var = y900Var.f196912n;
        momentDetailHeaderBottomView2.m63200f0(hx60Var2, moment, str4, z, ya00Var.f197131w, y900Var.f196923y, ya00Var.f197132x);
        if (!y900Var.f196924z) {
            y900Var.f196924z = true;
            y900Var.f196920v.m63209o0();
        }
        y900Var.m213521q0();
        i3 = 1;
        momentMessage2 = momentMessage;
        if (i != i3) {
        }
        y900Var.f196908A.m148839h(view, momentMessage2, i2);
    }

    @Override // p149l.dh5, p149l.dac0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public MomentMessage getItem(int i) {
        if (i == 0 || this.f86234c.isEmpty()) {
            return null;
        }
        return this.f86234c.get(i - 1);
    }

    @Override // p149l.dh5
    /* JADX INFO: renamed from: d0 */
    public void mo111805d0(List<MomentMessage> list) {
        this.f86238g.clear();
        this.f86239h.clear();
        this.f196913o = true;
        for (int size = list.size() - 1; size >= 0; size--) {
            MomentMessage momentMessage = list.get(size);
            if (momentMessage.isChildComment()) {
                m111801Z(momentMessage, momentMessage.commentInfo.parentMessageId);
                list.remove(momentMessage);
            }
        }
        int size2 = 0;
        while (size2 < list.size()) {
            MomentMessage momentMessage2 = list.get(size2);
            m111810i0(momentMessage2);
            List<MomentMessage> listM111793Q = m111793Q(momentMessage2, this.f86236e.get(momentMessage2.f56008id), false);
            if (!NullChecker.m81303a(listM111793Q) || listM111793Q.size() <= 0) {
                size2++;
            } else {
                list.addAll(size2 + 1, listM111793Q);
                size2 += listM111793Q.size() + 1;
            }
        }
        super.mo111805d0(list);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (this.f86234c.size() - i < 2) {
            m213526p0();
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
        if (this.f86234c.isEmpty()) {
            return 2;
        }
        if (i == this.f86234c.size() + 1) {
            return 8;
        }
        if (vqg.m199528V(this.f196917s)) {
            return 1;
        }
        MomentMessage item = getItem(i);
        if (mo111802a0(item)) {
            return 5;
        }
        return item.isChildComment() ? 4 : 3;
    }

    @Override // p149l.dh5
    /* JADX INFO: renamed from: h0 */
    public void mo111809h0() {
        this.f196912n.m213753H1(this.f86234c);
    }

    /* JADX INFO: renamed from: l0 */
    public int m213522l0(final MomentMessage momentMessage) {
        if (momentMessage == null) {
            return 0;
        }
        return vwb.m200293G(this.f86234c, new w9j() { // from class: l.x900
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(momentMessage.f56008id.equals(((MomentMessage) obj).f56008id));
            }
        }) + 2;
    }

    /* JADX INFO: renamed from: m0 */
    public final RawFeed m213523m0(Moment moment) {
        if (NullChecker.m81303a(moment) && this.f196916r.m133308p()) {
            return this.f196916r.f109833b.m130721c(moment.f56011id);
        }
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m213524n0(MomentDetailHeaderBottomView momentDetailHeaderBottomView) {
        wf00 xf00Var;
        if ((NullChecker.m81304b(momentDetailHeaderBottomView) && NullChecker.m81303a(this.f196917s) && (vqg.m199528V(this.f196917s) || this.f196917s.media.size() != 0 || vqg.m199532Z(this.f196917s))) || (nkg.m159895n0() && NullChecker.m81303a(this.f196917s) && this.f196917s.shareMyVote)) {
            int size = this.f196917s.media.size();
            if (size != 0) {
                if (size != 1) {
                    xf00Var = new tf00();
                } else {
                    Media media = this.f196917s.media.get(0);
                    if (media instanceof Video) {
                        xf00Var = new bg00();
                    } else if (media instanceof Audio) {
                        xf00Var = new pf00();
                    } else {
                        String str = this.f196917s.hyperlink;
                        boolean z = str != null && str.contains("type=\"img\"");
                        boolean z2 = !(TextUtils.isEmpty(this.f196917s.landingPage) && TextUtils.isEmpty(this.f196917s.deeplink)) && vqg.m199528V(this.f196917s);
                        if (!NullChecker.m81303a(this.f196917s.simpleActivity) || TextUtils.isEmpty(fm20.m122119b(this.f196917s.simpleActivity.f39235id))) {
                            xf00Var = (z2 || z) ? new rf00() : new tf00();
                        } else {
                            xf00Var = new yf00();
                        }
                    }
                }
            } else if (vqg.m199532Z(this.f196917s)) {
                xf00Var = new qf00();
            } else {
                xf00Var = vqg.m199570s0(this.f196917s) ? new xf00() : new zf00();
            }
            if (nkg.m159895n0() && NullChecker.m81303a(this.f196917s) && this.f196917s.shareMyVote) {
                xf00Var = new ag00();
            }
            xf00Var.m202943f(this.f196919u);
            xf00Var.m202944g(m213523m0(this.f196917s));
            ya00 ya00Var = this.f196912n;
            xf00Var.m202942e(ya00Var.f197131w, ya00Var.f197132x);
            momentDetailHeaderBottomView.setMomentHeaderInsertProxy(xf00Var);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m213525o0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            if (NullChecker.m81303a(this.f196920v)) {
                this.f196920v.m63199e0();
            }
        } else if (c4319c == C4319c.f15549j) {
            if (NullChecker.m81303a(this.f196920v)) {
                this.f196920v.m63198d0();
            }
        } else if (c4319c == C4319c.f15550k && NullChecker.m81303a(this.f196920v)) {
            this.f196920v.m63215t0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f196908A.m148842o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f196908A.m148842o();
    }

    /* JADX INFO: renamed from: p0 */
    public void m213526p0() {
        if (!dh5.m111790W(this.f196914p) || this.f86234c.size() <= 0) {
            return;
        }
        this.f196916r.mo64520z();
    }
}

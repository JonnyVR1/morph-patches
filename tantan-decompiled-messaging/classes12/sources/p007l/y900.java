package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CommentInfo;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.MomentMessageType;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.MomentDetailExpandBottomView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.MomentDetailHeaderBottomView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentChildDetailsView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentDetailsView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentParentDetailsView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.MomentDetailExpandCommentView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class y900 extends dh5 {

    /* JADX INFO: renamed from: B */
    public static int f15307B;

    /* JADX INFO: renamed from: k */
    public final String f15309k;

    /* JADX INFO: renamed from: l */
    public MomentDetailFrag f15310l;

    /* JADX INFO: renamed from: m */
    public ec00 f15311m;

    /* JADX INFO: renamed from: n */
    public ya00 f15312n;

    /* JADX INFO: renamed from: p */
    public Links f15314p;

    /* JADX INFO: renamed from: q */
    public final Act f15315q;

    /* JADX INFO: renamed from: r */
    public final hx60 f15316r;

    /* JADX INFO: renamed from: s */
    public Moment f15317s;

    /* JADX INFO: renamed from: t */
    public final String f15318t;

    /* JADX INFO: renamed from: u */
    public final String f15319u;

    /* JADX INFO: renamed from: v */
    public MomentDetailHeaderBottomView f15320v;

    /* JADX INFO: renamed from: w */
    public final boolean f15321w;

    /* JADX INFO: renamed from: x */
    public MomentDetailExpandCommentView f15322x;

    /* JADX INFO: renamed from: y */
    public d30 f15323y;

    /* JADX INFO: renamed from: z */
    public boolean f15324z;

    /* JADX INFO: renamed from: o */
    public boolean f15313o = false;

    /* JADX INFO: renamed from: A */
    public l80<MomentMessage> f15308A = new C2536a();

    /* JADX INFO: renamed from: l.y900$a */
    public class C2536a extends l80<MomentMessage> {
        public C2536a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo4975k(MomentMessage momentMessage, int i, View view) {
            String str;
            MomentMessageType momentMessageType = momentMessage.messageType;
            if (TEnum.equals(momentMessageType, "sticker")) {
                str = "gif";
            } else {
                str = TEnum.equals(momentMessageType, "picture") ? "picture" : "text";
            }
            p6j0.m12915e("e_user_comment", "p_user_moment_interactions_details_view", j760.a("comment_user_id", momentMessage.owner), j760.a("comment_type", str), j760.a("owner_id", y900.this.f15317s.owner), j760.a("moment_id", ((DbObject) y900.this.f15317s).id), j760.a("moment_type", zi60.m17436w().m17467y(y900.this.f15317s)), j760.a("comment_detail", momentMessage.isChildComment() ? "reply" : "comment"));
            u7h.m14786d(y900.this.f15317s, "p_user_moment_interactions_details_view");
        }
    }

    public y900(boolean z, Act act, hx60 hx60Var, Moment moment, String str, String str2, MomentDetailFrag momentDetailFrag, ec00 ec00Var, ya00 ya00Var, d30 d30Var) {
        this.f15321w = z;
        this.f15315q = act;
        this.f15316r = hx60Var;
        this.f15317s = moment;
        this.f15318t = str;
        this.f15319u = str2;
        this.f15310l = momentDetailFrag;
        this.f15311m = ec00Var;
        this.f15312n = ya00Var;
        this.f15309k = ya00Var.f15364v;
        f15307B = 0;
        this.f15323y = d30Var;
    }

    /* JADX INFO: renamed from: q0 */
    private void m16992q0() {
        this.f15310l.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.w900
            public final void call(Object obj) {
                this.f14473a.m16997o0((c) obj);
            }
        }));
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: C */
    public int mo9384C() {
        boolean zIsEmpty = this.f6931c.isEmpty();
        List<MomentMessage> list = this.f6931c;
        return zIsEmpty ? list.size() + 2 : list.size() + 1 + f15307B;
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: D */
    public View mo9385D(ViewGroup viewGroup, int i) {
        if (i == 0) {
            MomentDetailHeaderBottomView momentDetailHeaderBottomView = (MomentDetailHeaderBottomView) this.f15315q.inflater().inflate(o6c0.f11197d4, (ViewGroup) this.f15311m.f7301c, false);
            this.f15320v = momentDetailHeaderBottomView;
            return momentDetailHeaderBottomView;
        }
        if (i == 8) {
            MomentDetailExpandCommentView momentDetailExpandCommentView = (MomentDetailExpandCommentView) this.f15315q.inflater().inflate(o6c0.f11292r1, (ViewGroup) this.f15311m.f7301c, false);
            this.f15322x = momentDetailExpandCommentView;
            return momentDetailExpandCommentView;
        }
        if (i == 2) {
            CommonEmptyView commonEmptyView = (CommonEmptyView) this.f15315q.inflater().inflate(o6c0.f11199e, viewGroup, false);
            xdl0.f0(commonEmptyView, t100.d(28.0f));
            xdl0.M(commonEmptyView.f2281a, false);
            return commonEmptyView;
        }
        if (i == 5) {
            return this.f15315q.inflater().inflate(o6c0.f11285q1, viewGroup, false);
        }
        if (i == 4) {
            return this.f15315q.inflater().inflate(o6c0.f11174a2, viewGroup, false);
        }
        Act act = this.f15315q;
        return i == 3 ? act.inflater().inflate(o6c0.f11188c2, viewGroup, false) : act.inflater().inflate(o6c0.f11282p5, viewGroup, false);
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo9383A(View view, MomentMessage momentMessage, int i, int i2) {
        MomentMessage momentMessage2;
        int i3;
        y900 y900Var = this;
        if (i != 0) {
            if (i == 1) {
                ((PhotoAlbumCommentDetailsView) view).m4526u(y900Var.f15316r, momentMessage, y900Var.f15318t, y900Var.f15312n.f15357o);
            } else {
                if (i == 5) {
                    hx60 hx60Var = y900Var.f15316r;
                    String str = y900Var.f15318t;
                    String str2 = y900Var.f15312n.f15357o;
                    String str3 = momentMessage.commentInfo.parentMessageId;
                    Links linksM9391T = y900Var.m9391T(str3);
                    CommentInfo commentInfo = momentMessage.commentInfo;
                    ((MomentDetailExpandBottomView) view).m4163l(hx60Var, this, str, str2, str3, linksM9391T, commentInfo.moreSubMessages, y900Var.f6935g.get(commentInfo.parentMessageId).booleanValue(), i2 - 1);
                    y900Var = this;
                    momentMessage2 = momentMessage;
                } else if (i == 4) {
                    if (view instanceof PhotoAlbumCommentChildDetailsView) {
                        ((PhotoAlbumCommentChildDetailsView) view).m4594q0(y900Var, y900Var.f15316r, momentMessage, y900Var.f15318t, y900Var.f15312n.f15347e, y900Var.f15319u);
                    }
                    momentMessage2 = momentMessage;
                } else if (i == 3) {
                    momentMessage2 = momentMessage;
                    ((PhotoAlbumCommentParentDetailsView) view).m4594q0(y900Var, y900Var.f15316r, momentMessage2, y900Var.f15318t, y900Var.f15312n.f15347e, y900Var.f15319u);
                } else {
                    momentMessage2 = momentMessage;
                    if (i == 2) {
                        xdl0.M0(view, y900Var.f15313o);
                        CommonEmptyView commonEmptyView = (CommonEmptyView) view;
                        boolean zEquals = TextUtils.equals(y900Var.f15318t, FeedModule.m1139F().userId());
                        Act act = y900Var.f15315q;
                        String string = zEquals ? act.getString(R$string.f483a4) : act.getString(R$string.f532h4);
                        if (y900Var.f15321w) {
                            string = y900Var.f15315q.getString(R$string.f503d3);
                        }
                        commonEmptyView.f2282b.setText(string);
                        commonEmptyView.f2281a.setImageResource(f3c0.f7759a3);
                        commonEmptyView.f2282b.setTextColor(y900Var.f15310l.getResources().getColor(e1c0.f7153m0));
                        i3 = 1;
                        xdl0.M(commonEmptyView.f2281a, true);
                    } else {
                        i3 = 1;
                        if (i == 8) {
                            MomentDetailExpandCommentView momentDetailExpandCommentView = (MomentDetailExpandCommentView) view;
                            momentDetailExpandCommentView.m5974b(y900Var);
                            if (dh5.m9382W(y900Var.f15314p)) {
                                momentDetailExpandCommentView.setVisibility(0);
                                xdl0.C0(momentDetailExpandCommentView, -2);
                            } else {
                                momentDetailExpandCommentView.setVisibility(8);
                                xdl0.C0(momentDetailExpandCommentView, 0);
                            }
                        }
                    }
                }
                i3 = 1;
            }
            if (i != i3 || i == 4 || i == 3) {
                y900Var.f15308A.m11594h(view, momentMessage2, i2);
            }
            return;
        }
        MomentDetailHeaderBottomView momentDetailHeaderBottomView = (MomentDetailHeaderBottomView) view;
        y900Var.f15320v = momentDetailHeaderBottomView;
        y900Var.m16996n0(momentDetailHeaderBottomView);
        MomentDetailHeaderBottomView momentDetailHeaderBottomView2 = y900Var.f15320v;
        hx60 hx60Var2 = y900Var.f15316r;
        Moment moment = y900Var.f15317s;
        String str4 = y900Var.f15319u;
        boolean z = y900Var.f15321w;
        ya00 ya00Var = y900Var.f15312n;
        momentDetailHeaderBottomView2.m4216f0(hx60Var2, moment, str4, z, ya00Var.f15365w, y900Var.f15323y, ya00Var.f15366x);
        if (!y900Var.f15324z) {
            y900Var.f15324z = true;
            y900Var.f15320v.m4225o0();
        }
        y900Var.m16992q0();
        i3 = 1;
        momentMessage2 = momentMessage;
        if (i != i3) {
        }
        y900Var.f15308A.m11594h(view, momentMessage2, i2);
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public MomentMessage getItem(int i) {
        if (i == 0 || this.f6931c.isEmpty()) {
            return null;
        }
        return this.f6931c.get(i - 1);
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: d0 */
    public void mo9400d0(List<MomentMessage> list) {
        this.f6935g.clear();
        this.f6936h.clear();
        this.f15313o = true;
        for (int size = list.size() - 1; size >= 0; size--) {
            MomentMessage momentMessage = list.get(size);
            if (momentMessage.isChildComment()) {
                m9396Z(momentMessage, momentMessage.commentInfo.parentMessageId);
                list.remove(momentMessage);
            }
        }
        int size2 = 0;
        while (size2 < list.size()) {
            MomentMessage momentMessage2 = list.get(size2);
            m9405i0(momentMessage2);
            List<MomentMessage> listM9388Q = m9388Q(momentMessage2, this.f6933e.get(((CopyObject) momentMessage2).id), false);
            if (!NullChecker.a(listM9388Q) || listM9388Q.size() <= 0) {
                size2++;
            } else {
                list.addAll(size2 + 1, listM9388Q);
                size2 += listM9388Q.size() + 1;
            }
        }
        super.mo9400d0(list);
    }

    /* JADX INFO: renamed from: e */
    public void m16993e(int i) {
        if (this.f6931c.size() - i < 2) {
            m16998p0();
        }
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (this.f6931c.isEmpty()) {
            return 2;
        }
        if (i == this.f6931c.size() + 1) {
            return 8;
        }
        if (vqg.m15498V(this.f15317s)) {
            return 1;
        }
        MomentMessage item = getItem(i);
        if (mo9397a0(item)) {
            return 5;
        }
        return item.isChildComment() ? 4 : 3;
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: h0 */
    public void mo9404h0() {
        this.f15312n.m17043H1(this.f6931c);
    }

    /* JADX INFO: renamed from: l0 */
    public int m16994l0(final MomentMessage momentMessage) {
        if (momentMessage == null) {
            return 0;
        }
        return vwb.G(this.f6931c, new w9j() { // from class: l.x900
            public final Object call(Object obj) {
                return Boolean.valueOf(((CopyObject) momentMessage).id.equals(((CopyObject) ((MomentMessage) obj)).id));
            }
        }) + 2;
    }

    /* JADX INFO: renamed from: m0 */
    public final RawFeed m16995m0(Moment moment) {
        if (NullChecker.a(moment) && this.f15316r.m10743p()) {
            return this.f15316r.f8835b.m10602c(((DbObject) moment).id);
        }
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m16996n0(MomentDetailHeaderBottomView momentDetailHeaderBottomView) {
        wf00 xf00Var;
        if ((NullChecker.b(momentDetailHeaderBottomView) && NullChecker.a(this.f15317s) && (vqg.m15498V(this.f15317s) || this.f15317s.media.size() != 0 || vqg.m15502Z(this.f15317s))) || (nkg.m12254n0() && NullChecker.a(this.f15317s) && this.f15317s.shareMyVote)) {
            int size = this.f15317s.media.size();
            if (size != 0) {
                if (size != 1) {
                    xf00Var = new tf00();
                } else {
                    Media media = this.f15317s.media.get(0);
                    if (media instanceof Video) {
                        xf00Var = new bg00();
                    } else if (media instanceof Audio) {
                        xf00Var = new pf00();
                    } else {
                        String str = this.f15317s.hyperlink;
                        boolean z = str != null && str.contains("type=\"img\"");
                        boolean z2 = !(TextUtils.isEmpty(this.f15317s.landingPage) && TextUtils.isEmpty(this.f15317s.deeplink)) && vqg.m15498V(this.f15317s);
                        if (!NullChecker.a(this.f15317s.simpleActivity) || TextUtils.isEmpty(fm20.m10222b(this.f15317s.simpleActivity.f696id))) {
                            xf00Var = (z2 || z) ? new rf00() : new tf00();
                        } else {
                            xf00Var = new yf00();
                        }
                    }
                }
            } else if (vqg.m15502Z(this.f15317s)) {
                xf00Var = new qf00();
            } else {
                xf00Var = vqg.m15540s0(this.f15317s) ? new xf00() : new zf00();
            }
            if (nkg.m12254n0() && NullChecker.a(this.f15317s) && this.f15317s.shareMyVote) {
                xf00Var = new ag00();
            }
            xf00Var.m15811f(this.f15319u);
            xf00Var.m15812g(m16995m0(this.f15317s));
            ya00 ya00Var = this.f15312n;
            xf00Var.m15810e(ya00Var.f15365w, ya00Var.f15366x);
            momentDetailHeaderBottomView.setMomentHeaderInsertProxy(xf00Var);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m16997o0(c cVar) {
        if (cVar == c.i) {
            if (NullChecker.a(this.f15320v)) {
                this.f15320v.m4215e0();
            }
        } else if (cVar == c.j) {
            if (NullChecker.a(this.f15320v)) {
                this.f15320v.m4214d0();
            }
        } else if (cVar == c.k && NullChecker.a(this.f15320v)) {
            this.f15320v.m4231t0();
        }
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f15308A.m11597o();
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f15308A.m11597o();
    }

    /* JADX INFO: renamed from: p0 */
    public void m16998p0() {
        if (!dh5.m9382W(this.f15314p) || this.f6931c.size() <= 0) {
            return;
        }
        this.f15316r.mo5611z();
    }
}

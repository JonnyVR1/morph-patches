package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CommentInfo;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.MomentDetailExpandBottomView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentChildDetailsView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentDetailsView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentParentDetailsView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import l.j760;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pjm extends dh5 {

    /* JADX INFO: renamed from: k */
    public dkm f11867k;

    /* JADX INFO: renamed from: l */
    public boolean f11868l = false;

    /* JADX INFO: renamed from: m */
    public Links f11869m;

    /* JADX INFO: renamed from: n */
    public final Act f11870n;

    /* JADX INFO: renamed from: o */
    public final hx60 f11871o;

    /* JADX INFO: renamed from: p */
    public Moment f11872p;

    /* JADX INFO: renamed from: q */
    public final String f11873q;

    /* JADX INFO: renamed from: r */
    public final boolean f11874r;

    /* JADX INFO: renamed from: s */
    public String f11875s;

    public pjm(boolean z, Act act, hx60 hx60Var, Moment moment, String str, dkm dkmVar, String str2) {
        this.f11874r = z;
        this.f11870n = act;
        this.f11871o = hx60Var;
        this.f11872p = moment;
        this.f11873q = str;
        this.f11867k = dkmVar;
        this.f11875s = str2;
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: C */
    public int mo9384C() {
        if (this.f6931c.isEmpty()) {
            return 1;
        }
        return this.f6931c.size();
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: D */
    public View mo9385D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            CommonEmptyView commonEmptyView = (CommonEmptyView) this.f11870n.inflater().inflate(o6c0.f11199e, viewGroup, false);
            xdl0.f0(commonEmptyView, t100.d(60.0f));
            xdl0.M(commonEmptyView.f2281a, false);
            return commonEmptyView;
        }
        if (i == 5) {
            return this.f11870n.inflater().inflate(o6c0.f11285q1, viewGroup, false);
        }
        if (i == 4) {
            return this.f11870n.inflater().inflate(o6c0.f11174a2, viewGroup, false);
        }
        Act act = this.f11870n;
        return i == 3 ? act.inflater().inflate(o6c0.f11188c2, viewGroup, false) : act.inflater().inflate(o6c0.f11282p5, viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x013d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0140  */
    @Override // p007l.dh5
    /* JADX INFO: renamed from: O */
    public void mo9383A(View view, MomentMessage momentMessage, int i, int i2) {
        MomentMessage momentMessage2;
        String string;
        String str;
        pjm pjmVar = this;
        if (i != 1) {
            if (i == 5) {
                hx60 hx60Var = pjmVar.f11871o;
                String str2 = pjmVar.f11873q;
                String str3 = pjmVar.f11867k.f6979j;
                String str4 = momentMessage.commentInfo.parentMessageId;
                Links linksM9391T = pjmVar.m9391T(str4);
                CommentInfo commentInfo = momentMessage.commentInfo;
                ((MomentDetailExpandBottomView) view).m4163l(hx60Var, pjmVar, str2, str3, str4, linksM9391T, commentInfo.moreSubMessages, pjmVar.f6935g.get(commentInfo.parentMessageId).booleanValue(), i2 - 1);
                pjmVar = pjmVar;
            } else if (i == 4) {
                PhotoAlbumCommentChildDetailsView photoAlbumCommentChildDetailsView = (PhotoAlbumCommentChildDetailsView) view;
                photoAlbumCommentChildDetailsView.setIsFromImmersionVideo(true);
                photoAlbumCommentChildDetailsView.m4594q0(pjmVar, pjmVar.f11871o, momentMessage, pjmVar.f11873q, pjmVar.f11867k.f6972c, pjmVar.f11875s);
                momentMessage2 = momentMessage;
            } else if (i == 3) {
                PhotoAlbumCommentParentDetailsView photoAlbumCommentParentDetailsView = (PhotoAlbumCommentParentDetailsView) view;
                photoAlbumCommentParentDetailsView.setIsFromImmersionVideo(true);
                momentMessage2 = momentMessage;
                photoAlbumCommentParentDetailsView.m4594q0(pjmVar, pjmVar.f11871o, momentMessage2, pjmVar.f11873q, pjmVar.f11867k.f6972c, pjmVar.f11875s);
            } else {
                momentMessage2 = momentMessage;
                if (i == 2) {
                    xdl0.M0(view, pjmVar.f11868l);
                    CommonEmptyView commonEmptyView = (CommonEmptyView) view;
                    if (TextUtils.equals(pjmVar.f11873q, FeedModule.m1139F().userId())) {
                        string = pjmVar.f11870n.getString(R$string.f483a4);
                    } else if ("feed".equals(pjmVar.f11875s)) {
                        string = (NullChecker.a(FeedModule.f316d.m16628e8(pjmVar.f11873q)) && FeedModule.f316d.m16628e8(pjmVar.f11873q).isFemale()) ? "暂时没有评论，来和她互动一下吧～" : "暂时没有评论，来和他互动一下吧～";
                    } else {
                        string = "暂时没有评论，快来互动一下吧！";
                    }
                    if (pjmVar.f11874r) {
                        string = pjmVar.f11870n.getString(R$string.f503d3);
                    }
                    commonEmptyView.f2282b.setText(string);
                    commonEmptyView.f2281a.setImageResource(f3c0.f7829j1);
                    commonEmptyView.f2282b.setTextColor(pjmVar.f11870n.getResources().getColor(e1c0.f7153m0));
                    xdl0.M(commonEmptyView.f2281a, true);
                }
            }
            if (i != 1 || i == 4 || i == 3) {
                j760 j760VarA = j760.a("comment_user_id", momentMessage2.owner);
                j760 j760VarA2 = j760.a("owner_id", pjmVar.f11872p.owner);
                j760 j760VarA3 = j760.a("moment_id", ((DbObject) pjmVar.f11872p).id);
                j760 j760VarA4 = j760.a("moment_type", zi60.m17436w().m17467y(pjmVar.f11872p));
                if (momentMessage2.isChildComment()) {
                    str = "reply";
                } else {
                    str = "comment";
                }
                p6j0.m12915e("e_user_comment", "p_immersion_comment_page", j760VarA, j760VarA2, j760VarA3, j760VarA4, j760.a("comment_detail", str));
            }
            return;
        }
        ((PhotoAlbumCommentDetailsView) view).m4526u(pjmVar.f11871o, momentMessage, pjmVar.f11873q, pjmVar.f11867k.f6979j);
        momentMessage2 = momentMessage;
        if (i != 1) {
        }
        j760 j760VarA5 = j760.a("comment_user_id", momentMessage2.owner);
        j760 j760VarA6 = j760.a("owner_id", pjmVar.f11872p.owner);
        j760 j760VarA7 = j760.a("moment_id", ((DbObject) pjmVar.f11872p).id);
        j760 j760VarA8 = j760.a("moment_type", zi60.m17436w().m17467y(pjmVar.f11872p));
        if (momentMessage2.isChildComment()) {
            str = "reply";
        } else {
            str = "comment";
        }
        p6j0.m12915e("e_user_comment", "p_immersion_comment_page", j760VarA5, j760VarA6, j760VarA7, j760VarA8, j760.a("comment_detail", str));
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: U */
    public MomentMessage getItem(int i) {
        if (this.f6931c.isEmpty()) {
            return null;
        }
        return this.f6931c.get(i);
    }

    @Override // p007l.dh5
    /* JADX INFO: renamed from: d0 */
    public void mo9400d0(List<MomentMessage> list) {
        this.f6935g.clear();
        this.f6936h.clear();
        this.f11868l = true;
        Iterator<MomentMessage> it = list.iterator();
        while (it.hasNext()) {
            MomentMessage next = it.next();
            if (next.isChildComment()) {
                m9396Z(next, next.commentInfo.parentMessageId);
                it.remove();
            }
        }
        int size = 0;
        while (size < list.size()) {
            MomentMessage momentMessage = list.get(size);
            m9405i0(momentMessage);
            List<MomentMessage> listM9388Q = m9388Q(momentMessage, this.f6933e.get(((CopyObject) momentMessage).id), false);
            if (!NullChecker.a(listM9388Q) || listM9388Q.size() <= 0) {
                size++;
            } else {
                list.addAll(size + 1, listM9388Q);
                size += listM9388Q.size() + 1;
            }
        }
        super.mo9400d0(list);
    }

    /* JADX INFO: renamed from: e */
    public void m13064e(int i) {
        if (!dh5.m9382W(this.f11869m) || this.f6931c.size() <= 0 || this.f6931c.size() - i >= 2) {
            return;
        }
        this.f11871o.mo5611z();
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        if (this.f6931c.isEmpty()) {
            return 2;
        }
        if (vqg.m15498V(this.f11872p)) {
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
        this.f11867k.m9459b1(this.f6931c);
    }

    /* JADX INFO: renamed from: k0 */
    public int m13065k0(final MomentMessage momentMessage) {
        if (momentMessage == null) {
            return 0;
        }
        return vwb.G(this.f6931c, new w9j() { // from class: l.ojm
            public final Object call(Object obj) {
                return Boolean.valueOf(((CopyObject) momentMessage).id.equals(((CopyObject) ((MomentMessage) obj)).id));
            }
        }) + 2;
    }
}

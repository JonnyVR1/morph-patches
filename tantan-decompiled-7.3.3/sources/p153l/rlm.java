package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CommentInfo;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.MomentDetailExpandBottomView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentChildDetailsView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentDetailsView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentParentDetailsView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class rlm extends di5 {

    /* JADX INFO: renamed from: k */
    public fmm f163765k;

    /* JADX INFO: renamed from: l */
    public boolean f163766l = false;

    /* JADX INFO: renamed from: m */
    public Links f163767m;

    /* JADX INFO: renamed from: n */
    public final Act f163768n;

    /* JADX INFO: renamed from: o */
    public final n570 f163769o;

    /* JADX INFO: renamed from: p */
    public Moment f163770p;

    /* JADX INFO: renamed from: q */
    public final String f163771q;

    /* JADX INFO: renamed from: r */
    public final boolean f163772r;

    /* JADX INFO: renamed from: s */
    public String f163773s;

    public rlm(boolean z, Act act, n570 n570Var, Moment moment, String str, fmm fmmVar, String str2) {
        this.f163772r = z;
        this.f163768n = act;
        this.f163769o = n570Var;
        this.f163770p = moment;
        this.f163771q = str;
        this.f163765k = fmmVar;
        this.f163773s = str2;
    }

    @Override // p153l.di5, p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f88578c.isEmpty()) {
            return 1;
        }
        return this.f88578c.size();
    }

    @Override // p153l.di5, p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            CommonEmptyView commonEmptyView = (CommonEmptyView) this.f163768n.inflater().inflate(tec0.f173649e, viewGroup, false);
            bnl0.m105554f0(commonEmptyView, qa00.m175859d(60.0f));
            bnl0.m105524M(commonEmptyView.f41668a, false);
            return commonEmptyView;
        }
        if (i == 5) {
            return this.f163768n.inflater().inflate(tec0.f173735q1, viewGroup, false);
        }
        if (i == 4) {
            return this.f163768n.inflater().inflate(tec0.f173624a2, viewGroup, false);
        }
        Act act = this.f163768n;
        return i == 3 ? act.inflater().inflate(tec0.f173638c2, viewGroup, false) : act.inflater().inflate(tec0.f173732p5, viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x013d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0140  */
    @Override // p153l.di5, p153l.jic0
    /* JADX INFO: renamed from: O */
    public void mo29822A(View view, MomentMessage momentMessage, int i, int i2) {
        MomentMessage momentMessage2;
        String string;
        String str;
        rlm rlmVar = this;
        if (i != 1) {
            if (i == 5) {
                n570 n570Var = rlmVar.f163769o;
                String str2 = rlmVar.f163771q;
                String str3 = rlmVar.f163765k.f99806j;
                String str4 = momentMessage.commentInfo.parentMessageId;
                Links linksM115856T = rlmVar.m115856T(str4);
                CommentInfo commentInfo = momentMessage.commentInfo;
                ((MomentDetailExpandBottomView) view).m64330l(n570Var, rlmVar, str2, str3, str4, linksM115856T, commentInfo.moreSubMessages, rlmVar.f88582g.get(commentInfo.parentMessageId).booleanValue(), i2 - 1);
                rlmVar = rlmVar;
            } else if (i == 4) {
                PhotoAlbumCommentChildDetailsView photoAlbumCommentChildDetailsView = (PhotoAlbumCommentChildDetailsView) view;
                photoAlbumCommentChildDetailsView.setIsFromImmersionVideo(true);
                photoAlbumCommentChildDetailsView.m64760q0(rlmVar, rlmVar.f163769o, momentMessage, rlmVar.f163771q, rlmVar.f163765k.f99799c, rlmVar.f163773s);
                momentMessage2 = momentMessage;
            } else if (i == 3) {
                PhotoAlbumCommentParentDetailsView photoAlbumCommentParentDetailsView = (PhotoAlbumCommentParentDetailsView) view;
                photoAlbumCommentParentDetailsView.setIsFromImmersionVideo(true);
                momentMessage2 = momentMessage;
                photoAlbumCommentParentDetailsView.m64760q0(rlmVar, rlmVar.f163769o, momentMessage2, rlmVar.f163771q, rlmVar.f163765k.f99799c, rlmVar.f163773s);
            } else {
                momentMessage2 = momentMessage;
                if (i == 2) {
                    bnl0.m105525M0(view, rlmVar.f163766l);
                    CommonEmptyView commonEmptyView = (CommonEmptyView) view;
                    if (TextUtils.equals(rlmVar.f163771q, FeedModule.m61405F().userId())) {
                        string = rlmVar.f163768n.getString(R$string.f39870a4);
                    } else if ("feed".equals(rlmVar.f163773s)) {
                        string = (NullChecker.m82486a(FeedModule.f39703d.m145688e8(rlmVar.f163771q)) && FeedModule.f39703d.m145688e8(rlmVar.f163771q).isFemale()) ? "暂时没有评论，来和她互动一下吧～" : "暂时没有评论，来和他互动一下吧～";
                    } else {
                        string = "暂时没有评论，快来互动一下吧！";
                    }
                    if (rlmVar.f163772r) {
                        string = rlmVar.f163768n.getString(R$string.f39890d3);
                    }
                    commonEmptyView.f41669b.setText(string);
                    commonEmptyView.f41668a.setImageResource(lbc0.f131064j1);
                    commonEmptyView.f41669b.setTextColor(rlmVar.f163768n.getResources().getColor(k9c0.f124520m0));
                    bnl0.m105524M(commonEmptyView.f41668a, true);
                }
            }
            if (i != 1 || i == 4 || i == 3) {
                pf60 pf60VarM172085a = pf60.m172085a("comment_user_id", momentMessage2.owner);
                pf60 pf60VarM172085a2 = pf60.m172085a("owner_id", rlmVar.f163770p.owner);
                pf60 pf60VarM172085a3 = pf60.m172085a("moment_id", rlmVar.f163770p.f56859id);
                pf60 pf60VarM172085a4 = pf60.m172085a("moment_type", er60.m122104w().m122135y(rlmVar.f163770p));
                if (momentMessage2.isChildComment()) {
                    str = SysnotifListener.ACTION_REPLY;
                } else {
                    str = "comment";
                }
                tfj0.m190942e("e_user_comment", "p_immersion_comment_page", pf60VarM172085a, pf60VarM172085a2, pf60VarM172085a3, pf60VarM172085a4, pf60.m172085a("comment_detail", str));
            }
            return;
        }
        ((PhotoAlbumCommentDetailsView) view).m64692u(rlmVar.f163769o, momentMessage, rlmVar.f163771q, rlmVar.f163765k.f99806j);
        momentMessage2 = momentMessage;
        if (i != 1) {
        }
        pf60 pf60VarM172085a5 = pf60.m172085a("comment_user_id", momentMessage2.owner);
        pf60 pf60VarM172085a6 = pf60.m172085a("owner_id", rlmVar.f163770p.owner);
        pf60 pf60VarM172085a7 = pf60.m172085a("moment_id", rlmVar.f163770p.f56859id);
        pf60 pf60VarM172085a8 = pf60.m172085a("moment_type", er60.m122104w().m122135y(rlmVar.f163770p));
        if (momentMessage2.isChildComment()) {
            str = SysnotifListener.ACTION_REPLY;
        } else {
            str = "comment";
        }
        tfj0.m190942e("e_user_comment", "p_immersion_comment_page", pf60VarM172085a5, pf60VarM172085a6, pf60VarM172085a7, pf60VarM172085a8, pf60.m172085a("comment_detail", str));
    }

    @Override // p153l.di5, p153l.jic0
    /* JADX INFO: renamed from: U */
    public MomentMessage getItem(int i) {
        if (this.f88578c.isEmpty()) {
            return null;
        }
        return this.f88578c.get(i);
    }

    @Override // p153l.di5
    /* JADX INFO: renamed from: d0 */
    public void mo115865d0(List<MomentMessage> list) {
        this.f88582g.clear();
        this.f88583h.clear();
        this.f163766l = true;
        Iterator<MomentMessage> it = list.iterator();
        while (it.hasNext()) {
            MomentMessage next = it.next();
            if (next.isChildComment()) {
                m115861Z(next, next.commentInfo.parentMessageId);
                it.remove();
            }
        }
        int size = 0;
        while (size < list.size()) {
            MomentMessage momentMessage = list.get(size);
            m115870i0(momentMessage);
            List<MomentMessage> listM115853Q = m115853Q(momentMessage, this.f88580e.get(momentMessage.f56856id), false);
            if (!NullChecker.m82486a(listM115853Q) || listM115853Q.size() <= 0) {
                size++;
            } else {
                list.addAll(size + 1, listM115853Q);
                size += listM115853Q.size() + 1;
            }
        }
        super.mo115865d0(list);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (!di5.m115850W(this.f163767m) || this.f88578c.size() <= 0 || this.f88578c.size() - i >= 2) {
            return;
        }
        this.f163769o.mo65703z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f88578c.isEmpty()) {
            return 2;
        }
        if (ksg.m151187V(this.f163770p)) {
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
        this.f163765k.m126309b1(this.f88578c);
    }

    /* JADX INFO: renamed from: k0 */
    public int m182020k0(final MomentMessage momentMessage) {
        if (momentMessage == null) {
            return 0;
        }
        return jyb.m147476G(this.f88578c, new qcj() { // from class: l.qlm
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(momentMessage.f56856id.equals(((MomentMessage) obj).f56856id));
            }
        }) + 2;
    }
}

package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CommentInfo;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.MomentDetailExpandBottomView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentChildDetailsView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentDetailsView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentParentDetailsView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class pjm extends dh5 {

    /* JADX INFO: renamed from: k */
    public dkm f149835k;

    /* JADX INFO: renamed from: l */
    public boolean f149836l = false;

    /* JADX INFO: renamed from: m */
    public Links f149837m;

    /* JADX INFO: renamed from: n */
    public final Act f149838n;

    /* JADX INFO: renamed from: o */
    public final hx60 f149839o;

    /* JADX INFO: renamed from: p */
    public Moment f149840p;

    /* JADX INFO: renamed from: q */
    public final String f149841q;

    /* JADX INFO: renamed from: r */
    public final boolean f149842r;

    /* JADX INFO: renamed from: s */
    public String f149843s;

    public pjm(boolean z, Act act, hx60 hx60Var, Moment moment, String str, dkm dkmVar, String str2) {
        this.f149842r = z;
        this.f149838n = act;
        this.f149839o = hx60Var;
        this.f149840p = moment;
        this.f149841q = str;
        this.f149835k = dkmVar;
        this.f149843s = str2;
    }

    @Override // p149l.dh5, p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f86234c.isEmpty()) {
            return 1;
        }
        return this.f86234c.size();
    }

    @Override // p149l.dh5, p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 2) {
            CommonEmptyView commonEmptyView = (CommonEmptyView) this.f149838n.inflater().inflate(o6c0.f142180e, viewGroup, false);
            xdl0.m208374f0(commonEmptyView, t100.m186890d(60.0f));
            xdl0.m208344M(commonEmptyView.f40820a, false);
            return commonEmptyView;
        }
        if (i == 5) {
            return this.f149838n.inflater().inflate(o6c0.f142266q1, viewGroup, false);
        }
        if (i == 4) {
            return this.f149838n.inflater().inflate(o6c0.f142155a2, viewGroup, false);
        }
        Act act = this.f149838n;
        return i == 3 ? act.inflater().inflate(o6c0.f142169c2, viewGroup, false) : act.inflater().inflate(o6c0.f142263p5, viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x013d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0140  */
    @Override // p149l.dh5, p149l.dac0
    /* JADX INFO: renamed from: O */
    public void mo28823A(View view, MomentMessage momentMessage, int i, int i2) {
        MomentMessage momentMessage2;
        String string;
        String str;
        pjm pjmVar = this;
        if (i != 1) {
            if (i == 5) {
                hx60 hx60Var = pjmVar.f149839o;
                String str2 = pjmVar.f149841q;
                String str3 = pjmVar.f149835k.f86677j;
                String str4 = momentMessage.commentInfo.parentMessageId;
                Links linksM111796T = pjmVar.m111796T(str4);
                CommentInfo commentInfo = momentMessage.commentInfo;
                ((MomentDetailExpandBottomView) view).m63147l(hx60Var, pjmVar, str2, str3, str4, linksM111796T, commentInfo.moreSubMessages, pjmVar.f86238g.get(commentInfo.parentMessageId).booleanValue(), i2 - 1);
                pjmVar = pjmVar;
            } else if (i == 4) {
                PhotoAlbumCommentChildDetailsView photoAlbumCommentChildDetailsView = (PhotoAlbumCommentChildDetailsView) view;
                photoAlbumCommentChildDetailsView.setIsFromImmersionVideo(true);
                photoAlbumCommentChildDetailsView.m63577q0(pjmVar, pjmVar.f149839o, momentMessage, pjmVar.f149841q, pjmVar.f149835k.f86670c, pjmVar.f149843s);
                momentMessage2 = momentMessage;
            } else if (i == 3) {
                PhotoAlbumCommentParentDetailsView photoAlbumCommentParentDetailsView = (PhotoAlbumCommentParentDetailsView) view;
                photoAlbumCommentParentDetailsView.setIsFromImmersionVideo(true);
                momentMessage2 = momentMessage;
                photoAlbumCommentParentDetailsView.m63577q0(pjmVar, pjmVar.f149839o, momentMessage2, pjmVar.f149841q, pjmVar.f149835k.f86670c, pjmVar.f149843s);
            } else {
                momentMessage2 = momentMessage;
                if (i == 2) {
                    xdl0.m208345M0(view, pjmVar.f149836l);
                    CommonEmptyView commonEmptyView = (CommonEmptyView) view;
                    if (TextUtils.equals(pjmVar.f149841q, FeedModule.m60221F().userId())) {
                        string = pjmVar.f149838n.getString(R$string.f39022a4);
                    } else if ("feed".equals(pjmVar.f149843s)) {
                        string = (NullChecker.m81303a(FeedModule.f38855d.m209447e8(pjmVar.f149841q)) && FeedModule.f38855d.m209447e8(pjmVar.f149841q).isFemale()) ? "暂时没有评论，来和她互动一下吧～" : "暂时没有评论，来和他互动一下吧～";
                    } else {
                        string = "暂时没有评论，快来互动一下吧！";
                    }
                    if (pjmVar.f149842r) {
                        string = pjmVar.f149838n.getString(R$string.f39042d3);
                    }
                    commonEmptyView.f40821b.setText(string);
                    commonEmptyView.f40820a.setImageResource(f3c0.f94546j1);
                    commonEmptyView.f40821b.setTextColor(pjmVar.f149838n.getResources().getColor(e1c0.f88797m0));
                    xdl0.m208344M(commonEmptyView.f40820a, true);
                }
            }
            if (i != 1 || i == 4 || i == 3) {
                j760 j760VarM140076a = j760.m140076a("comment_user_id", momentMessage2.owner);
                j760 j760VarM140076a2 = j760.m140076a("owner_id", pjmVar.f149840p.owner);
                j760 j760VarM140076a3 = j760.m140076a("moment_id", pjmVar.f149840p.f56011id);
                j760 j760VarM140076a4 = j760.m140076a("moment_type", zi60.m218961w().m218992y(pjmVar.f149840p));
                if (momentMessage2.isChildComment()) {
                    str = SysnotifListener.ACTION_REPLY;
                } else {
                    str = "comment";
                }
                p6j0.m167671e("e_user_comment", "p_immersion_comment_page", j760VarM140076a, j760VarM140076a2, j760VarM140076a3, j760VarM140076a4, j760.m140076a("comment_detail", str));
            }
            return;
        }
        ((PhotoAlbumCommentDetailsView) view).m63509u(pjmVar.f149839o, momentMessage, pjmVar.f149841q, pjmVar.f149835k.f86677j);
        momentMessage2 = momentMessage;
        if (i != 1) {
        }
        j760 j760VarM140076a5 = j760.m140076a("comment_user_id", momentMessage2.owner);
        j760 j760VarM140076a6 = j760.m140076a("owner_id", pjmVar.f149840p.owner);
        j760 j760VarM140076a7 = j760.m140076a("moment_id", pjmVar.f149840p.f56011id);
        j760 j760VarM140076a8 = j760.m140076a("moment_type", zi60.m218961w().m218992y(pjmVar.f149840p));
        if (momentMessage2.isChildComment()) {
            str = SysnotifListener.ACTION_REPLY;
        } else {
            str = "comment";
        }
        p6j0.m167671e("e_user_comment", "p_immersion_comment_page", j760VarM140076a5, j760VarM140076a6, j760VarM140076a7, j760VarM140076a8, j760.m140076a("comment_detail", str));
    }

    @Override // p149l.dh5, p149l.dac0
    /* JADX INFO: renamed from: U */
    public MomentMessage getItem(int i) {
        if (this.f86234c.isEmpty()) {
            return null;
        }
        return this.f86234c.get(i);
    }

    @Override // p149l.dh5
    /* JADX INFO: renamed from: d0 */
    public void mo111805d0(List<MomentMessage> list) {
        this.f86238g.clear();
        this.f86239h.clear();
        this.f149836l = true;
        Iterator<MomentMessage> it = list.iterator();
        while (it.hasNext()) {
            MomentMessage next = it.next();
            if (next.isChildComment()) {
                m111801Z(next, next.commentInfo.parentMessageId);
                it.remove();
            }
        }
        int size = 0;
        while (size < list.size()) {
            MomentMessage momentMessage = list.get(size);
            m111810i0(momentMessage);
            List<MomentMessage> listM111793Q = m111793Q(momentMessage, this.f86236e.get(momentMessage.f56008id), false);
            if (!NullChecker.m81303a(listM111793Q) || listM111793Q.size() <= 0) {
                size++;
            } else {
                list.addAll(size + 1, listM111793Q);
                size += listM111793Q.size() + 1;
            }
        }
        super.mo111805d0(list);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (!dh5.m111790W(this.f149837m) || this.f86234c.size() <= 0 || this.f86234c.size() - i >= 2) {
            return;
        }
        this.f149839o.mo64520z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f86234c.isEmpty()) {
            return 2;
        }
        if (vqg.m199528V(this.f149840p)) {
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
        this.f149835k.m112261b1(this.f86234c);
    }

    /* JADX INFO: renamed from: k0 */
    public int m169911k0(final MomentMessage momentMessage) {
        if (momentMessage == null) {
            return 0;
        }
        return vwb.m200293G(this.f86234c, new w9j() { // from class: l.ojm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(momentMessage.f56008id.equals(((MomentMessage) obj).f56008id));
            }
        }) + 2;
    }
}

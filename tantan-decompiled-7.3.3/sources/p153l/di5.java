package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.feed.data.CommentInfo;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.helper.exception.BottomCommentIndexException;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class di5 extends jic0<MomentMessage> {

    /* JADX INFO: renamed from: c */
    public final List<MomentMessage> f88578c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<StickerInfo> f88579d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Map<String, List<MomentMessage>> f88580e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final Map<String, List<MomentMessage>> f88581f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Map<String, Boolean> f88582g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Map<String, Integer> f88583h = new HashMap();

    /* JADX INFO: renamed from: i */
    public final List<String> f88584i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final Map<String, Links> f88585j = new HashMap();

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ Boolean m115843H(String str, MomentMessage momentMessage) {
        CommentInfo commentInfo = momentMessage.commentInfo;
        return Boolean.valueOf(commentInfo != null && commentInfo.isBottom && commentInfo.parentMessageId.equals(str));
    }

    /* JADX INFO: renamed from: W */
    public static boolean m115850W(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return 0;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public void m115852P(int i, String str, List<MomentMessage> list, Links links, boolean z) {
        if (z) {
            String strMo115858V = mo115858V(str);
            if (!TextUtils.isEmpty(strMo115858V)) {
                this.f88581f.put(strMo115858V, list);
            }
        }
        m115867f0(str, links);
        List<MomentMessage> list2 = this.f88580e.get(str);
        for (int i2 = 0; i2 < list.size(); i2++) {
            final MomentMessage momentMessage = list.get(i2);
            if (jyb.m147529r(list2, new qcj() { // from class: l.bi5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(momentMessage.f56856id.equals(((MomentMessage) obj).f56856id));
                }
            }) == null) {
                list2.add(momentMessage);
            }
        }
        this.f88580e.put(str, list2);
        int iIntValue = this.f88583h.get(str).intValue();
        int size = list2.size() - iIntValue;
        ArrayList arrayList = new ArrayList();
        for (int i3 = iIntValue; i3 < Math.min(size, 3) + iIntValue; i3++) {
            arrayList.add(list2.get(i3));
        }
        this.f88578c.addAll(mo115854R(str), arrayList);
        boolean z2 = m115859X(str) || size > 3;
        this.f88582g.put(str, Boolean.valueOf(!z2));
        this.f88583h.put(str, Integer.valueOf(iIntValue + arrayList.size()));
        int i4 = i + 1;
        notifyItemRangeInserted(i4, arrayList.size());
        notifyItemRangeChanged(i4, getItemCount() - i, "change_position");
        if (!z2 && list2.size() <= 3) {
            int iMo115854R = mo115854R(str);
            this.f88578c.remove(iMo115854R);
            notifyItemRangeRemoved(iMo115854R, 1);
            notifyItemRangeChanged(iMo115854R - 2, (getItemCount() - iMo115854R) + 2, "change_position");
        }
        mo115869h0();
    }

    /* JADX INFO: renamed from: Q */
    public List<MomentMessage> m115853Q(MomentMessage momentMessage, List<MomentMessage> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(list) && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                MomentMessage momentMessage2 = list.get(i);
                if (!momentMessage2.isBottom && (!NullChecker.m82487b(momentMessage2.commentInfo) || !momentMessage2.commentInfo.isBottom)) {
                    arrayList.add(momentMessage2);
                }
            }
        }
        this.f88583h.put(momentMessage.f56856id, Integer.valueOf(arrayList.size()));
        if (!mo115863b0(momentMessage) || arrayList.size() > 3) {
            MomentMessage momentMessageNew_ = MomentMessage.new_();
            if (z) {
                momentMessageNew_.parentCommentId = momentMessage.f56856id;
                momentMessageNew_.isBottom = true;
                momentMessageNew_.moreSubComments = momentMessage.moreSubComments;
            } else {
                CommentInfo commentInfo = momentMessageNew_.commentInfo;
                commentInfo.parentMessageId = momentMessage.f56856id;
                commentInfo.isBottom = true;
                commentInfo.moreSubMessages = momentMessage.commentInfo.moreSubMessages;
            }
            arrayList.add(momentMessageNew_);
        }
        this.f88582g.put(momentMessage.f56856id, Boolean.valueOf(mo115863b0(momentMessage)));
        return arrayList;
    }

    /* JADX INFO: renamed from: R */
    public int mo115854R(final String str) {
        int iIndexOf = this.f88578c.indexOf((MomentMessage) jyb.m147529r(this.f88578c, new qcj() { // from class: l.ai5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return di5.m115843H(str, (MomentMessage) obj);
            }
        }));
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        BottomCommentIndexException.reportBottomCommentIndexOutOfBounds(this instanceof hi00 ? ((hi00) this).f109962n.f110133o : null, str);
        return 0;
    }

    /* JADX INFO: renamed from: S */
    public List<MomentMessage> m115855S(String str) {
        return this.f88580e.get(str);
    }

    /* JADX INFO: renamed from: T */
    public Links m115856T(String str) {
        return this.f88585j.get(str);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: U */
    public MomentMessage getItem(int i) {
        return null;
    }

    /* JADX INFO: renamed from: V */
    public String mo115858V(final String str) {
        MomentMessage momentMessage;
        CommentInfo commentInfo;
        if (TextUtils.isEmpty(str) || (momentMessage = (MomentMessage) jyb.m147529r(this.f88578c, new qcj() { // from class: l.ci5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((MomentMessage) obj).f56856id));
            }
        })) == null || (commentInfo = momentMessage.commentInfo) == null) {
            return null;
        }
        return commentInfo.moreSubMessages;
    }

    /* JADX INFO: renamed from: X */
    public boolean m115859X(String str) {
        return (this.f88585j.get(str) == null || TextUtils.isEmpty(this.f88585j.get(str).next)) ? false : true;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m115860Y(String str) {
        List<MomentMessage> list = this.f88580e.get(str);
        return list != null && list.size() > this.f88583h.get(str).intValue();
    }

    /* JADX INFO: renamed from: Z */
    public void m115861Z(final MomentMessage momentMessage, String str) {
        List<MomentMessage> arrayList = this.f88580e.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (NullChecker.m82487b(momentMessage)) {
            if (arrayList.size() == 0 || jyb.m147529r(arrayList, new qcj() { // from class: l.yh5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((MomentMessage) obj).f56856id.equals(momentMessage.f56856id));
                }
            }) == null) {
                m115868g0(momentMessage, arrayList);
            }
            this.f88580e.put(str, arrayList);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public boolean mo115862a0(MomentMessage momentMessage) {
        CommentInfo commentInfo = momentMessage.commentInfo;
        return commentInfo != null && commentInfo.isBottom;
    }

    /* JADX INFO: renamed from: b0 */
    public boolean mo115863b0(MomentMessage momentMessage) {
        CommentInfo commentInfo = momentMessage.commentInfo;
        if (commentInfo == null || TextUtils.isEmpty(commentInfo.moreSubMessages)) {
            this.f88581f.put(momentMessage.f56856id, null);
            return true;
        }
        List<MomentMessage> list = this.f88581f.get(momentMessage.commentInfo.moreSubMessages);
        if (NullChecker.m82486a(list) && list.size() > 0) {
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                final MomentMessage momentMessage2 = list.get(i2);
                if (jyb.m147529r(this.f88580e.get(momentMessage.f56856id), new qcj() { // from class: l.zh5
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(momentMessage2.f56856id.equals(((MomentMessage) obj).f56856id));
                    }
                }) != null) {
                    return !NullChecker.m82486a(m115856T(momentMessage.f56856id)) || TextUtils.isEmpty(m115856T(momentMessage.f56856id).next);
                }
                if (!jyb.m147479J(this.f88584i) && this.f88584i.contains(momentMessage2.f56856id)) {
                    i++;
                }
            }
            if (i == list.size()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public void m115864c0(int i, String str) {
        int size = this.f88580e.get(str).size() - 3;
        int i2 = i - size;
        int i3 = i2 + 1;
        int iMo115854R = mo115854R(str) - 1;
        for (int i4 = 0; i4 < size; i4++) {
            this.f88578c.remove(iMo115854R);
            iMo115854R--;
        }
        this.f88582g.put(str, Boolean.FALSE);
        this.f88583h.put(str, 3);
        notifyItemRangeRemoved(i3, size);
        notifyItemRangeChanged(i2, (getItemCount() - i3) + 2, "change_position");
    }

    /* JADX INFO: renamed from: d0 */
    public void mo115865d0(List<MomentMessage> list) {
        this.f88578c.clear();
        this.f88578c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e0 */
    public void mo115866e0(MomentMessage momentMessage) {
        if (momentMessage.isChildComment()) {
            this.f88580e.get(momentMessage.commentInfo.parentMessageId).remove(momentMessage);
            this.f88584i.add(momentMessage.f56856id);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m115867f0(String str, Links links) {
        this.f88585j.put(str, links);
    }

    /* JADX INFO: renamed from: g0 */
    public final List<MomentMessage> m115868g0(MomentMessage momentMessage, List<MomentMessage> list) {
        if (!mo115862a0(momentMessage)) {
            if (momentMessage.isNewComment && TextUtils.isEmpty(momentMessage.replyCommentId)) {
                list.add(0, momentMessage);
                return list;
            }
            list.add(momentMessage);
        }
        return list;
    }

    /* JADX INFO: renamed from: i0 */
    public void m115870i0(MomentMessage momentMessage) {
        List<MomentMessage> list = this.f88580e.get(momentMessage.f56856id);
        List<String> list2 = momentMessage.commentInfo.subMessageIds;
        if (jyb.m147479J(list)) {
            return;
        }
        List<MomentMessage> arrayList = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            final String str = list2.get(i);
            final MomentMessage momentMessage2 = (MomentMessage) jyb.m147529r(list, new qcj() { // from class: l.th5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((MomentMessage) obj).f56856id));
                }
            });
            if (NullChecker.m82486a(momentMessage2) && jyb.m147529r(arrayList, new qcj() { // from class: l.uh5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((MomentMessage) obj).f56856id.equals(momentMessage2.f56856id));
                }
            }) == null) {
                arrayList.add(momentMessage2);
            }
        }
        for (final MomentMessage momentMessage3 : list) {
            if (!momentMessage3.isNewComment && jyb.m147529r(arrayList, new qcj() { // from class: l.vh5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((MomentMessage) obj).f56856id.equals(momentMessage3.f56856id));
                }
            }) == null) {
                arrayList.add(momentMessage3);
            }
        }
        for (final MomentMessage momentMessage4 : list) {
            if (momentMessage4.isNewComment) {
                if (!TextUtils.isEmpty(momentMessage4.replyCommentId)) {
                    arrayList.remove(momentMessage4);
                    arrayList.add(jyb.m147476G(arrayList, new qcj() { // from class: l.wh5
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(momentMessage4.replyCommentId.equals(((MomentMessage) obj).f56856id));
                        }
                    }) + 1, momentMessage4);
                } else if (jyb.m147529r(arrayList, new qcj() { // from class: l.xh5
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((MomentMessage) obj).f56856id.equals(momentMessage4.f56856id));
                    }
                }) == null) {
                    arrayList.add(momentMessage4);
                }
            }
        }
        this.f88580e.put(momentMessage.f56856id, arrayList);
    }

    /* JADX INFO: renamed from: h0 */
    public void mo115869h0() {
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: O */
    public void mo29822A(View view, MomentMessage momentMessage, int i, int i2) {
    }
}

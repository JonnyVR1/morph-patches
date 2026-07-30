package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.feed.data.CommentInfo;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.helper.exception.BottomCommentIndexException;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class dh5 extends dac0<MomentMessage> {

    /* JADX INFO: renamed from: c */
    public final List<MomentMessage> f86234c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<StickerInfo> f86235d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Map<String, List<MomentMessage>> f86236e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final Map<String, List<MomentMessage>> f86237f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Map<String, Boolean> f86238g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Map<String, Integer> f86239h = new HashMap();

    /* JADX INFO: renamed from: i */
    public final List<String> f86240i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final Map<String, Links> f86241j = new HashMap();

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ Boolean m111783H(String str, MomentMessage momentMessage) {
        CommentInfo commentInfo = momentMessage.commentInfo;
        return Boolean.valueOf(commentInfo != null && commentInfo.isBottom && commentInfo.parentMessageId.equals(str));
    }

    /* JADX INFO: renamed from: W */
    public static boolean m111790W(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return 0;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public void m111792P(int i, String str, List<MomentMessage> list, Links links, boolean z) {
        if (z) {
            String strMo111798V = mo111798V(str);
            if (!TextUtils.isEmpty(strMo111798V)) {
                this.f86237f.put(strMo111798V, list);
            }
        }
        m111807f0(str, links);
        List<MomentMessage> list2 = this.f86236e.get(str);
        for (int i2 = 0; i2 < list.size(); i2++) {
            final MomentMessage momentMessage = list.get(i2);
            if (vwb.m200346r(list2, new w9j() { // from class: l.bh5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(momentMessage.f56008id.equals(((MomentMessage) obj).f56008id));
                }
            }) == null) {
                list2.add(momentMessage);
            }
        }
        this.f86236e.put(str, list2);
        int iIntValue = this.f86239h.get(str).intValue();
        int size = list2.size() - iIntValue;
        ArrayList arrayList = new ArrayList();
        for (int i3 = iIntValue; i3 < Math.min(size, 3) + iIntValue; i3++) {
            arrayList.add(list2.get(i3));
        }
        this.f86234c.addAll(mo111794R(str), arrayList);
        boolean z2 = m111799X(str) || size > 3;
        this.f86238g.put(str, Boolean.valueOf(!z2));
        this.f86239h.put(str, Integer.valueOf(iIntValue + arrayList.size()));
        int i4 = i + 1;
        notifyItemRangeInserted(i4, arrayList.size());
        notifyItemRangeChanged(i4, getItemCount() - i, "change_position");
        if (!z2 && list2.size() <= 3) {
            int iMo111794R = mo111794R(str);
            this.f86234c.remove(iMo111794R);
            notifyItemRangeRemoved(iMo111794R, 1);
            notifyItemRangeChanged(iMo111794R - 2, (getItemCount() - iMo111794R) + 2, "change_position");
        }
        mo111809h0();
    }

    /* JADX INFO: renamed from: Q */
    public List<MomentMessage> m111793Q(MomentMessage momentMessage, List<MomentMessage> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(list) && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                MomentMessage momentMessage2 = list.get(i);
                if (!momentMessage2.isBottom && (!NullChecker.m81304b(momentMessage2.commentInfo) || !momentMessage2.commentInfo.isBottom)) {
                    arrayList.add(momentMessage2);
                }
            }
        }
        this.f86239h.put(momentMessage.f56008id, Integer.valueOf(arrayList.size()));
        if (!mo111803b0(momentMessage) || arrayList.size() > 3) {
            MomentMessage momentMessageNew_ = MomentMessage.new_();
            if (z) {
                momentMessageNew_.parentCommentId = momentMessage.f56008id;
                momentMessageNew_.isBottom = true;
                momentMessageNew_.moreSubComments = momentMessage.moreSubComments;
            } else {
                CommentInfo commentInfo = momentMessageNew_.commentInfo;
                commentInfo.parentMessageId = momentMessage.f56008id;
                commentInfo.isBottom = true;
                commentInfo.moreSubMessages = momentMessage.commentInfo.moreSubMessages;
            }
            arrayList.add(momentMessageNew_);
        }
        this.f86238g.put(momentMessage.f56008id, Boolean.valueOf(mo111803b0(momentMessage)));
        return arrayList;
    }

    /* JADX INFO: renamed from: R */
    public int mo111794R(final String str) {
        int iIndexOf = this.f86234c.indexOf((MomentMessage) vwb.m200346r(this.f86234c, new w9j() { // from class: l.ah5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return dh5.m111783H(str, (MomentMessage) obj);
            }
        }));
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        BottomCommentIndexException.reportBottomCommentIndexOutOfBounds(this instanceof y900 ? ((y900) this).f196912n.f197123o : null, str);
        return 0;
    }

    /* JADX INFO: renamed from: S */
    public List<MomentMessage> m111795S(String str) {
        return this.f86236e.get(str);
    }

    /* JADX INFO: renamed from: T */
    public Links m111796T(String str) {
        return this.f86241j.get(str);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: U */
    public MomentMessage getItem(int i) {
        return null;
    }

    /* JADX INFO: renamed from: V */
    public String mo111798V(final String str) {
        MomentMessage momentMessage;
        CommentInfo commentInfo;
        if (TextUtils.isEmpty(str) || (momentMessage = (MomentMessage) vwb.m200346r(this.f86234c, new w9j() { // from class: l.ch5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((MomentMessage) obj).f56008id));
            }
        })) == null || (commentInfo = momentMessage.commentInfo) == null) {
            return null;
        }
        return commentInfo.moreSubMessages;
    }

    /* JADX INFO: renamed from: X */
    public boolean m111799X(String str) {
        return (this.f86241j.get(str) == null || TextUtils.isEmpty(this.f86241j.get(str).next)) ? false : true;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m111800Y(String str) {
        List<MomentMessage> list = this.f86236e.get(str);
        return list != null && list.size() > this.f86239h.get(str).intValue();
    }

    /* JADX INFO: renamed from: Z */
    public void m111801Z(final MomentMessage momentMessage, String str) {
        List<MomentMessage> arrayList = this.f86236e.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (NullChecker.m81304b(momentMessage)) {
            if (arrayList.size() == 0 || vwb.m200346r(arrayList, new w9j() { // from class: l.yg5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((MomentMessage) obj).f56008id.equals(momentMessage.f56008id));
                }
            }) == null) {
                m111808g0(momentMessage, arrayList);
            }
            this.f86236e.put(str, arrayList);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public boolean mo111802a0(MomentMessage momentMessage) {
        CommentInfo commentInfo = momentMessage.commentInfo;
        return commentInfo != null && commentInfo.isBottom;
    }

    /* JADX INFO: renamed from: b0 */
    public boolean mo111803b0(MomentMessage momentMessage) {
        CommentInfo commentInfo = momentMessage.commentInfo;
        if (commentInfo == null || TextUtils.isEmpty(commentInfo.moreSubMessages)) {
            this.f86237f.put(momentMessage.f56008id, null);
            return true;
        }
        List<MomentMessage> list = this.f86237f.get(momentMessage.commentInfo.moreSubMessages);
        if (NullChecker.m81303a(list) && list.size() > 0) {
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                final MomentMessage momentMessage2 = list.get(i2);
                if (vwb.m200346r(this.f86236e.get(momentMessage.f56008id), new w9j() { // from class: l.zg5
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(momentMessage2.f56008id.equals(((MomentMessage) obj).f56008id));
                    }
                }) != null) {
                    return !NullChecker.m81303a(m111796T(momentMessage.f56008id)) || TextUtils.isEmpty(m111796T(momentMessage.f56008id).next);
                }
                if (!vwb.m200296J(this.f86240i) && this.f86240i.contains(momentMessage2.f56008id)) {
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
    public void m111804c0(int i, String str) {
        int size = this.f86236e.get(str).size() - 3;
        int i2 = i - size;
        int i3 = i2 + 1;
        int iMo111794R = mo111794R(str) - 1;
        for (int i4 = 0; i4 < size; i4++) {
            this.f86234c.remove(iMo111794R);
            iMo111794R--;
        }
        this.f86238g.put(str, Boolean.FALSE);
        this.f86239h.put(str, 3);
        notifyItemRangeRemoved(i3, size);
        notifyItemRangeChanged(i2, (getItemCount() - i3) + 2, "change_position");
    }

    /* JADX INFO: renamed from: d0 */
    public void mo111805d0(List<MomentMessage> list) {
        this.f86234c.clear();
        this.f86234c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e0 */
    public void mo111806e0(MomentMessage momentMessage) {
        if (momentMessage.isChildComment()) {
            this.f86236e.get(momentMessage.commentInfo.parentMessageId).remove(momentMessage);
            this.f86240i.add(momentMessage.f56008id);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m111807f0(String str, Links links) {
        this.f86241j.put(str, links);
    }

    /* JADX INFO: renamed from: g0 */
    public final List<MomentMessage> m111808g0(MomentMessage momentMessage, List<MomentMessage> list) {
        if (!mo111802a0(momentMessage)) {
            if (momentMessage.isNewComment && TextUtils.isEmpty(momentMessage.replyCommentId)) {
                list.add(0, momentMessage);
                return list;
            }
            list.add(momentMessage);
        }
        return list;
    }

    /* JADX INFO: renamed from: i0 */
    public void m111810i0(MomentMessage momentMessage) {
        List<MomentMessage> list = this.f86236e.get(momentMessage.f56008id);
        List<String> list2 = momentMessage.commentInfo.subMessageIds;
        if (vwb.m200296J(list)) {
            return;
        }
        List<MomentMessage> arrayList = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            final String str = list2.get(i);
            final MomentMessage momentMessage2 = (MomentMessage) vwb.m200346r(list, new w9j() { // from class: l.tg5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((MomentMessage) obj).f56008id));
                }
            });
            if (NullChecker.m81303a(momentMessage2) && vwb.m200346r(arrayList, new w9j() { // from class: l.ug5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((MomentMessage) obj).f56008id.equals(momentMessage2.f56008id));
                }
            }) == null) {
                arrayList.add(momentMessage2);
            }
        }
        for (final MomentMessage momentMessage3 : list) {
            if (!momentMessage3.isNewComment && vwb.m200346r(arrayList, new w9j() { // from class: l.vg5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((MomentMessage) obj).f56008id.equals(momentMessage3.f56008id));
                }
            }) == null) {
                arrayList.add(momentMessage3);
            }
        }
        for (final MomentMessage momentMessage4 : list) {
            if (momentMessage4.isNewComment) {
                if (!TextUtils.isEmpty(momentMessage4.replyCommentId)) {
                    arrayList.remove(momentMessage4);
                    arrayList.add(vwb.m200293G(arrayList, new w9j() { // from class: l.wg5
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(momentMessage4.replyCommentId.equals(((MomentMessage) obj).f56008id));
                        }
                    }) + 1, momentMessage4);
                } else if (vwb.m200346r(arrayList, new w9j() { // from class: l.xg5
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((MomentMessage) obj).f56008id.equals(momentMessage4.f56008id));
                    }
                }) == null) {
                    arrayList.add(momentMessage4);
                }
            }
        }
        this.f86236e.put(momentMessage.f56008id, arrayList);
    }

    /* JADX INFO: renamed from: h0 */
    public void mo111809h0() {
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: O */
    public void mo28823A(View view, MomentMessage momentMessage, int i, int i2) {
    }
}

package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p000p1.mobile.putong.feed.data.CommentInfo;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.helper.exception.BottomCommentIndexException;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.dac0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dh5 extends dac0<MomentMessage> {

    /* JADX INFO: renamed from: c */
    public final List<MomentMessage> f6931c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<StickerInfo> f6932d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Map<String, List<MomentMessage>> f6933e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final Map<String, List<MomentMessage>> f6934f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Map<String, Boolean> f6935g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Map<String, Integer> f6936h = new HashMap();

    /* JADX INFO: renamed from: i */
    public final List<String> f6937i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final Map<String, Links> f6938j = new HashMap();

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ Boolean m9375H(String str, MomentMessage momentMessage) {
        CommentInfo commentInfo = momentMessage.commentInfo;
        return Boolean.valueOf(commentInfo != null && commentInfo.isBottom && commentInfo.parentMessageId.equals(str));
    }

    /* JADX INFO: renamed from: W */
    public static boolean m9382W(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    public int mo9384C() {
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public View mo9385D(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public void m9387P(int i, String str, List<MomentMessage> list, Links links, boolean z) {
        if (z) {
            String strMo9393V = mo9393V(str);
            if (!TextUtils.isEmpty(strMo9393V)) {
                this.f6934f.put(strMo9393V, list);
            }
        }
        m9402f0(str, links);
        List<MomentMessage> list2 = this.f6933e.get(str);
        for (int i2 = 0; i2 < list.size(); i2++) {
            final MomentMessage momentMessage = list.get(i2);
            if (vwb.r(list2, new w9j() { // from class: l.bh5
                public final Object call(Object obj) {
                    return Boolean.valueOf(((CopyObject) momentMessage).id.equals(((CopyObject) ((MomentMessage) obj)).id));
                }
            }) == null) {
                list2.add(momentMessage);
            }
        }
        this.f6933e.put(str, list2);
        int iIntValue = this.f6936h.get(str).intValue();
        int size = list2.size() - iIntValue;
        ArrayList arrayList = new ArrayList();
        for (int i3 = iIntValue; i3 < Math.min(size, 3) + iIntValue; i3++) {
            arrayList.add(list2.get(i3));
        }
        this.f6931c.addAll(mo9389R(str), arrayList);
        boolean z2 = m9394X(str) || size > 3;
        this.f6935g.put(str, Boolean.valueOf(!z2));
        this.f6936h.put(str, Integer.valueOf(iIntValue + arrayList.size()));
        int i4 = i + 1;
        notifyItemRangeInserted(i4, arrayList.size());
        notifyItemRangeChanged(i4, getItemCount() - i, "change_position");
        if (!z2 && list2.size() <= 3) {
            int iMo9389R = mo9389R(str);
            this.f6931c.remove(iMo9389R);
            notifyItemRangeRemoved(iMo9389R, 1);
            notifyItemRangeChanged(iMo9389R - 2, (getItemCount() - iMo9389R) + 2, "change_position");
        }
        mo9404h0();
    }

    /* JADX INFO: renamed from: Q */
    public List<MomentMessage> m9388Q(MomentMessage momentMessage, List<MomentMessage> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(list) && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                MomentMessage momentMessage2 = list.get(i);
                if (!momentMessage2.isBottom && (!NullChecker.b(momentMessage2.commentInfo) || !momentMessage2.commentInfo.isBottom)) {
                    arrayList.add(momentMessage2);
                }
            }
        }
        this.f6936h.put(((CopyObject) momentMessage).id, Integer.valueOf(arrayList.size()));
        if (!mo9398b0(momentMessage) || arrayList.size() > 3) {
            MomentMessage momentMessageNew_ = MomentMessage.new_();
            if (z) {
                momentMessageNew_.parentCommentId = ((CopyObject) momentMessage).id;
                momentMessageNew_.isBottom = true;
                momentMessageNew_.moreSubComments = momentMessage.moreSubComments;
            } else {
                CommentInfo commentInfo = momentMessageNew_.commentInfo;
                commentInfo.parentMessageId = ((CopyObject) momentMessage).id;
                commentInfo.isBottom = true;
                commentInfo.moreSubMessages = momentMessage.commentInfo.moreSubMessages;
            }
            arrayList.add(momentMessageNew_);
        }
        this.f6935g.put(((CopyObject) momentMessage).id, Boolean.valueOf(mo9398b0(momentMessage)));
        return arrayList;
    }

    /* JADX INFO: renamed from: R */
    public int mo9389R(final String str) {
        int iIndexOf = this.f6931c.indexOf((MomentMessage) vwb.r(this.f6931c, new w9j() { // from class: l.ah5
            public final Object call(Object obj) {
                return dh5.m9375H(str, (MomentMessage) obj);
            }
        }));
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        BottomCommentIndexException.reportBottomCommentIndexOutOfBounds(this instanceof y900 ? ((y900) this).f15312n.f15357o : null, str);
        return 0;
    }

    /* JADX INFO: renamed from: S */
    public List<MomentMessage> m9390S(String str) {
        return this.f6933e.get(str);
    }

    /* JADX INFO: renamed from: T */
    public Links m9391T(String str) {
        return this.f6938j.get(str);
    }

    @Override // 
    /* JADX INFO: renamed from: U */
    public MomentMessage getItem(int i) {
        return null;
    }

    /* JADX INFO: renamed from: V */
    public String mo9393V(final String str) {
        MomentMessage momentMessage;
        CommentInfo commentInfo;
        if (TextUtils.isEmpty(str) || (momentMessage = (MomentMessage) vwb.r(this.f6931c, new w9j() { // from class: l.ch5
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((CopyObject) ((MomentMessage) obj)).id));
            }
        })) == null || (commentInfo = momentMessage.commentInfo) == null) {
            return null;
        }
        return commentInfo.moreSubMessages;
    }

    /* JADX INFO: renamed from: X */
    public boolean m9394X(String str) {
        return (this.f6938j.get(str) == null || TextUtils.isEmpty(this.f6938j.get(str).next)) ? false : true;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m9395Y(String str) {
        List<MomentMessage> list = this.f6933e.get(str);
        return list != null && list.size() > this.f6936h.get(str).intValue();
    }

    /* JADX INFO: renamed from: Z */
    public void m9396Z(final MomentMessage momentMessage, String str) {
        List<MomentMessage> arrayList = this.f6933e.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (NullChecker.b(momentMessage)) {
            if (arrayList.size() == 0 || vwb.r(arrayList, new w9j() { // from class: l.yg5
                public final Object call(Object obj) {
                    return Boolean.valueOf(((CopyObject) ((MomentMessage) obj)).id.equals(((CopyObject) momentMessage).id));
                }
            }) == null) {
                m9403g0(momentMessage, arrayList);
            }
            this.f6933e.put(str, arrayList);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public boolean mo9397a0(MomentMessage momentMessage) {
        CommentInfo commentInfo = momentMessage.commentInfo;
        return commentInfo != null && commentInfo.isBottom;
    }

    /* JADX INFO: renamed from: b0 */
    public boolean mo9398b0(MomentMessage momentMessage) {
        CommentInfo commentInfo = momentMessage.commentInfo;
        if (commentInfo == null || TextUtils.isEmpty(commentInfo.moreSubMessages)) {
            this.f6934f.put(((CopyObject) momentMessage).id, null);
            return true;
        }
        List<MomentMessage> list = this.f6934f.get(momentMessage.commentInfo.moreSubMessages);
        if (NullChecker.a(list) && list.size() > 0) {
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                final MomentMessage momentMessage2 = list.get(i2);
                if (vwb.r(this.f6933e.get(((CopyObject) momentMessage).id), new w9j() { // from class: l.zg5
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CopyObject) momentMessage2).id.equals(((CopyObject) ((MomentMessage) obj)).id));
                    }
                }) != null) {
                    return !NullChecker.a(m9391T(((CopyObject) momentMessage).id)) || TextUtils.isEmpty(m9391T(((CopyObject) momentMessage).id).next);
                }
                if (!vwb.J(this.f6937i) && this.f6937i.contains(((CopyObject) momentMessage2).id)) {
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
    public void m9399c0(int i, String str) {
        int size = this.f6933e.get(str).size() - 3;
        int i2 = i - size;
        int i3 = i2 + 1;
        int iMo9389R = mo9389R(str) - 1;
        for (int i4 = 0; i4 < size; i4++) {
            this.f6931c.remove(iMo9389R);
            iMo9389R--;
        }
        this.f6935g.put(str, Boolean.FALSE);
        this.f6936h.put(str, 3);
        notifyItemRangeRemoved(i3, size);
        notifyItemRangeChanged(i2, (getItemCount() - i3) + 2, "change_position");
    }

    /* JADX INFO: renamed from: d0 */
    public void mo9400d0(List<MomentMessage> list) {
        this.f6931c.clear();
        this.f6931c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e0 */
    public void mo9401e0(MomentMessage momentMessage) {
        if (momentMessage.isChildComment()) {
            this.f6933e.get(momentMessage.commentInfo.parentMessageId).remove(momentMessage);
            this.f6937i.add(((CopyObject) momentMessage).id);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m9402f0(String str, Links links) {
        this.f6938j.put(str, links);
    }

    /* JADX INFO: renamed from: g0 */
    public final List<MomentMessage> m9403g0(MomentMessage momentMessage, List<MomentMessage> list) {
        if (!mo9397a0(momentMessage)) {
            if (momentMessage.isNewComment && TextUtils.isEmpty(momentMessage.replyCommentId)) {
                list.add(0, momentMessage);
                return list;
            }
            list.add(momentMessage);
        }
        return list;
    }

    /* JADX INFO: renamed from: i0 */
    public void m9405i0(MomentMessage momentMessage) {
        List<MomentMessage> list = this.f6933e.get(((CopyObject) momentMessage).id);
        List<String> list2 = momentMessage.commentInfo.subMessageIds;
        if (vwb.J(list)) {
            return;
        }
        List<MomentMessage> arrayList = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            final String str = list2.get(i);
            final MomentMessage momentMessage2 = (MomentMessage) vwb.r(list, new w9j() { // from class: l.tg5
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((CopyObject) ((MomentMessage) obj)).id));
                }
            });
            if (NullChecker.a(momentMessage2) && vwb.r(arrayList, new w9j() { // from class: l.ug5
                public final Object call(Object obj) {
                    return Boolean.valueOf(((CopyObject) ((MomentMessage) obj)).id.equals(((CopyObject) momentMessage2).id));
                }
            }) == null) {
                arrayList.add(momentMessage2);
            }
        }
        for (final MomentMessage momentMessage3 : list) {
            if (!momentMessage3.isNewComment && vwb.r(arrayList, new w9j() { // from class: l.vg5
                public final Object call(Object obj) {
                    return Boolean.valueOf(((CopyObject) ((MomentMessage) obj)).id.equals(((CopyObject) momentMessage3).id));
                }
            }) == null) {
                arrayList.add(momentMessage3);
            }
        }
        for (final MomentMessage momentMessage4 : list) {
            if (momentMessage4.isNewComment) {
                if (!TextUtils.isEmpty(momentMessage4.replyCommentId)) {
                    arrayList.remove(momentMessage4);
                    arrayList.add(vwb.G(arrayList, new w9j() { // from class: l.wg5
                        public final Object call(Object obj) {
                            return Boolean.valueOf(momentMessage4.replyCommentId.equals(((CopyObject) ((MomentMessage) obj)).id));
                        }
                    }) + 1, momentMessage4);
                } else if (vwb.r(arrayList, new w9j() { // from class: l.xg5
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((CopyObject) ((MomentMessage) obj)).id.equals(((CopyObject) momentMessage4).id));
                    }
                }) == null) {
                    arrayList.add(momentMessage4);
                }
            }
        }
        this.f6933e.put(((CopyObject) momentMessage).id, arrayList);
    }

    /* JADX INFO: renamed from: h0 */
    public void mo9404h0() {
    }

    @Override // 
    /* JADX INFO: renamed from: O */
    public void mo9383A(View view, MomentMessage momentMessage, int i, int i2) {
    }
}

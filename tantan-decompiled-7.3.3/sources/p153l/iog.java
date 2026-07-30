package p153l;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.widget.EditText;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.NotifyUsers;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.FeedHighlightSpan;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class iog {

    /* JADX INFO: renamed from: a */
    public List<String> f116147a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Pattern f116148b;

    /* JADX INFO: renamed from: c */
    public mu4 f116149c;

    public iog(mu4 mu4Var) {
        this.f116149c = mu4Var;
        for (NotifyUsers notifyUsers : dth.m117872c()) {
            if (!User.isWisdomStar(notifyUsers.userId) || dth.m117871b()) {
                this.f116147a.add("@" + notifyUsers.name);
            }
        }
        this.f116148b = Pattern.compile(du4.m118067a("|", this.f116147a));
    }

    /* JADX INFO: renamed from: b */
    public void m141298b(Editable editable, ArrayList<NotifyUsers> arrayList, ArrayList<String> arrayList2) {
        m141300d(editable, arrayList, arrayList2);
        NotifyUsers notifyUsersM145597R7 = FeedModule.f39703d.m145597R7(User.ID_WISDOM_STAR);
        if (NullChecker.m82486a(notifyUsersM145597R7)) {
            if (TextUtils.equals("@" + notifyUsersM145597R7.name, editable) && dth.m117871b()) {
                this.f116149c.m160092q();
                return;
            }
        }
        m141299c();
    }

    /* JADX INFO: renamed from: c */
    public final void m141299c() {
        if (this.f116149c.m160085j()) {
            this.f116149c.m160082g();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m141300d(Editable editable, ArrayList<NotifyUsers> arrayList, ArrayList<String> arrayList2) {
        arrayList.clear();
        arrayList2.clear();
        Matcher matcher = this.f116148b.matcher(editable);
        while (!jyb.m147479J(this.f116147a) && matcher.find()) {
            final String strGroup = matcher.group();
            if (!TextUtils.isEmpty(strGroup)) {
                NotifyUsers notifyUsers = (NotifyUsers) jyb.m147529r(FeedModule.f39703d.f121361k0, new qcj() { // from class: l.hog
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((NotifyUsers) obj).name, strGroup.substring(1)));
                    }
                });
                arrayList.add(notifyUsers);
                arrayList2.add("@" + notifyUsers.name);
            }
            Object[] spans = editable.getSpans(matcher.start(), matcher.end(), FeedHighlightSpan.class);
            if (spans == null || spans.length <= 0) {
                editable.setSpan(new FeedHighlightSpan(-98787), matcher.start(), matcher.end(), 33);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m141301e(Editable editable) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        FeedHighlightSpan[] feedHighlightSpanArr = (FeedHighlightSpan[]) editable.getSpans(selectionStart, selectionEnd, FeedHighlightSpan.class);
        if (feedHighlightSpanArr == null || feedHighlightSpanArr.length == 0) {
            return;
        }
        FeedHighlightSpan feedHighlightSpan = feedHighlightSpanArr[0];
        int spanStart = editable.getSpanStart(feedHighlightSpan);
        int spanEnd = editable.getSpanEnd(feedHighlightSpan);
        if (spanEnd == selectionStart && selectionStart == selectionEnd) {
            Selection.setSelection(editable, spanStart, spanEnd);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m141302f(EditText editText, CharSequence charSequence, int i, int i2, int i3, x20 x20Var) {
        int length;
        if (!TextUtils.isEmpty(charSequence) && i3 > 0 && (length = editText.getText().length()) > 0 && TextUtils.equals(editText.getText().subSequence(length - 1, length), "@") && NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }
}

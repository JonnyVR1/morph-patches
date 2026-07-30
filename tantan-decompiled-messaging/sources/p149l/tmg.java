package p149l;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.widget.EditText;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.NotifyUsers;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.FeedHighlightSpan;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public class tmg {

    /* JADX INFO: renamed from: a */
    public List<String> f171149a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Pattern f171150b;

    /* JADX INFO: renamed from: c */
    public nt4 f171151c;

    public tmg(nt4 nt4Var) {
        this.f171151c = nt4Var;
        for (NotifyUsers notifyUsers : orh.m165570c()) {
            if (!User.isWisdomStar(notifyUsers.userId) || orh.m165569b()) {
                this.f171149a.add("@" + notifyUsers.name);
            }
        }
        this.f171150b = Pattern.compile(et4.m117971a("|", this.f171149a));
    }

    /* JADX INFO: renamed from: b */
    public void m189691b(Editable editable, ArrayList<NotifyUsers> arrayList, ArrayList<String> arrayList2) {
        m189693d(editable, arrayList, arrayList2);
        NotifyUsers notifyUsersM209356R7 = FeedModule.f38855d.m209356R7(User.ID_WISDOM_STAR);
        if (NullChecker.m81303a(notifyUsersM209356R7)) {
            if (TextUtils.equals("@" + notifyUsersM209356R7.name, editable) && orh.m165569b()) {
                this.f171151c.m161321q();
                return;
            }
        }
        m189692c();
    }

    /* JADX INFO: renamed from: c */
    public final void m189692c() {
        if (this.f171151c.m161314j()) {
            this.f171151c.m161311g();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m189693d(Editable editable, ArrayList<NotifyUsers> arrayList, ArrayList<String> arrayList2) {
        arrayList.clear();
        arrayList2.clear();
        Matcher matcher = this.f171150b.matcher(editable);
        while (!vwb.m200296J(this.f171149a) && matcher.find()) {
            final String strGroup = matcher.group();
            if (!TextUtils.isEmpty(strGroup)) {
                NotifyUsers notifyUsers = (NotifyUsers) vwb.m200346r(FeedModule.f38855d.f193051k0, new w9j() { // from class: l.smg
                    @Override // p149l.w9j
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
    public void m189694e(Editable editable) {
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
    public void m189695f(EditText editText, CharSequence charSequence, int i, int i2, int i3, d30 d30Var) {
        int length;
        if (!TextUtils.isEmpty(charSequence) && i3 > 0 && (length = editText.getText().length()) > 0 && TextUtils.equals(editText.getText().subSequence(length - 1, length), "@") && NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }
}

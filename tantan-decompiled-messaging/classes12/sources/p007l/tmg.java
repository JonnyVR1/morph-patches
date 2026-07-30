package p007l;

import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.widget.EditText;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.NotifyUsers;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.FeedHighlightSpan;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.d30;
import l.et4;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tmg {

    /* JADX INFO: renamed from: a */
    public List<String> f13340a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Pattern f13341b;

    /* JADX INFO: renamed from: c */
    public nt4 f13342c;

    public tmg(nt4 nt4Var) {
        this.f13342c = nt4Var;
        for (NotifyUsers notifyUsers : orh.m12747c()) {
            if (!User.isWisdomStar(notifyUsers.userId) || orh.m12746b()) {
                this.f13340a.add("@" + notifyUsers.name);
            }
        }
        this.f13341b = Pattern.compile(et4.a("|", this.f13340a));
    }

    /* JADX INFO: renamed from: b */
    public void m14570b(Editable editable, ArrayList<NotifyUsers> arrayList, ArrayList<String> arrayList2) {
        m14572d(editable, arrayList, arrayList2);
        NotifyUsers notifyUsersM16537R7 = FeedModule.f316d.m16537R7(User.ID_WISDOM_STAR);
        if (NullChecker.a(notifyUsersM16537R7)) {
            if (TextUtils.equals("@" + notifyUsersM16537R7.name, editable) && orh.m12746b()) {
                this.f13342c.m12321q();
                return;
            }
        }
        m14571c();
    }

    /* JADX INFO: renamed from: c */
    public final void m14571c() {
        if (this.f13342c.m12314j()) {
            this.f13342c.m12311g();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m14572d(Editable editable, ArrayList<NotifyUsers> arrayList, ArrayList<String> arrayList2) {
        arrayList.clear();
        arrayList2.clear();
        Matcher matcher = this.f13341b.matcher(editable);
        while (!vwb.J(this.f13340a) && matcher.find()) {
            final String strGroup = matcher.group();
            if (!TextUtils.isEmpty(strGroup)) {
                NotifyUsers notifyUsers = (NotifyUsers) vwb.r(FeedModule.f316d.f14986k0, new w9j() { // from class: l.smg
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
    public void m14573e(Editable editable) {
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
    public void m14574f(EditText editText, CharSequence charSequence, int i, int i2, int i3, d30 d30Var) {
        int length;
        if (!TextUtils.isEmpty(charSequence) && i3 > 0 && (length = editText.getText().length()) > 0 && TextUtils.equals(editText.getText().subSequence(length - 1, length), "@") && NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }
}

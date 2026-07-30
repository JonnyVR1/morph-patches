package p149l;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.EditText;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.span.FeedTitleTagsSpan;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class eqg {

    /* JADX INFO: renamed from: a */
    public EditText f92796a;

    /* JADX INFO: renamed from: b */
    public HashSet<String> f92797b = new HashSet<>();

    /* JADX INFO: renamed from: c */
    public HashSet<String> f92798c = new HashSet<>();

    /* JADX INFO: renamed from: d */
    public d30 f92799d;

    public eqg(EditText editText, List<String> list) {
        this.f92796a = editText;
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f92798c.add(it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m117739a(String str) {
        return str.replaceAll("&~!~&", "");
    }

    /* JADX INFO: renamed from: b */
    public String m117740b(Editable editable) {
        FeedTitleTagsSpan[] feedTitleTagsSpanArr = (FeedTitleTagsSpan[]) editable.getSpans(0, editable.length(), FeedTitleTagsSpan.class);
        if (feedTitleTagsSpanArr == null || feedTitleTagsSpanArr.length == 0) {
            return editable.toString();
        }
        ArrayList arrayList = new ArrayList();
        m117747i(feedTitleTagsSpanArr, arrayList, editable);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        FeedTitleTagsSpan feedTitleTagsSpan = arrayList.get(0);
        int spanStart = editable.getSpanStart(feedTitleTagsSpan);
        int spanEnd = editable.getSpanEnd(feedTitleTagsSpan);
        if (spanStart > 0) {
            spannableStringBuilder.append(editable.subSequence(0, spanStart));
        }
        int size = arrayList.size();
        int i = 1;
        while (i < size) {
            FeedTitleTagsSpan feedTitleTagsSpan2 = arrayList.get(i);
            int spanStart2 = editable.getSpanStart(feedTitleTagsSpan2);
            int spanEnd2 = editable.getSpanEnd(feedTitleTagsSpan2);
            CharSequence charSequenceSubSequence = editable.subSequence(spanEnd, spanStart2);
            spannableStringBuilder.append((CharSequence) "&~!~&");
            spannableStringBuilder.append((CharSequence) feedTitleTagsSpan.titleTag);
            spannableStringBuilder.append((CharSequence) "：");
            spannableStringBuilder.append((CharSequence) "&~!~&");
            spannableStringBuilder.append(charSequenceSubSequence);
            i++;
            feedTitleTagsSpan = feedTitleTagsSpan2;
            spanEnd = spanEnd2;
        }
        CharSequence charSequenceSubSequence2 = editable.subSequence(spanEnd, editable.length());
        spannableStringBuilder.append((CharSequence) "&~!~&");
        spannableStringBuilder.append((CharSequence) feedTitleTagsSpan.titleTag);
        spannableStringBuilder.append((CharSequence) "：");
        spannableStringBuilder.append((CharSequence) "&~!~&");
        spannableStringBuilder.append(charSequenceSubSequence2);
        return spannableStringBuilder.toString();
    }

    /* JADX INFO: renamed from: c */
    public void m117741c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f92797b.add(str);
        int length = this.f92796a.getText().length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "：");
        spannableStringBuilder.setSpan(new FeedTitleTagsSpan(1291845632, str), 0, spannableStringBuilder.length(), 33);
        this.f92796a.requestFocus();
        if (length > 0 && '\n' != this.f92796a.getText().charAt(length - 1)) {
            this.f92796a.getText().append((CharSequence) String.valueOf('\n'));
        }
        this.f92796a.getText().append((CharSequence) spannableStringBuilder);
        EditText editText = this.f92796a;
        editText.setSelection(editText.getText().length());
    }

    /* JADX INFO: renamed from: d */
    public boolean m117742d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f92797b.contains(str);
    }

    /* JADX INFO: renamed from: e */
    public void m117743e(Editable editable) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        FeedTitleTagsSpan[] feedTitleTagsSpanArr = (FeedTitleTagsSpan[]) editable.getSpans(selectionStart, selectionEnd, FeedTitleTagsSpan.class);
        if (feedTitleTagsSpanArr == null || feedTitleTagsSpanArr.length == 0) {
            return;
        }
        FeedTitleTagsSpan feedTitleTagsSpan = feedTitleTagsSpanArr[0];
        int spanStart = editable.getSpanStart(feedTitleTagsSpan);
        int spanEnd = editable.getSpanEnd(feedTitleTagsSpan);
        if (spanEnd == selectionStart && selectionStart == selectionEnd) {
            Selection.setSelection(editable, spanStart, spanEnd);
        }
        for (FeedTitleTagsSpan feedTitleTagsSpan2 : feedTitleTagsSpanArr) {
            if (editable.getSpanStart(feedTitleTagsSpan) != selectionEnd) {
                m117744f(feedTitleTagsSpan2.titleTag);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m117744f(String str) {
        this.f92797b.remove(str);
        d30 d30Var = this.f92799d;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m117745g(String str) {
        FeedTitleTagsSpan feedTitleTagsSpan;
        if (TextUtils.isEmpty(str) || !this.f92797b.contains(str)) {
            return;
        }
        this.f92797b.remove(str);
        int i = 0;
        FeedTitleTagsSpan[] feedTitleTagsSpanArr = (FeedTitleTagsSpan[]) this.f92796a.getText().getSpans(0, this.f92796a.getText().length(), FeedTitleTagsSpan.class);
        int length = feedTitleTagsSpanArr.length;
        while (true) {
            if (i >= length) {
                feedTitleTagsSpan = null;
                break;
            }
            feedTitleTagsSpan = feedTitleTagsSpanArr[i];
            if (TextUtils.equals(str, feedTitleTagsSpan.titleTag)) {
                break;
            } else {
                i++;
            }
        }
        if (feedTitleTagsSpan == null) {
            return;
        }
        int spanStart = this.f92796a.getText().getSpanStart(feedTitleTagsSpan);
        int spanEnd = this.f92796a.getText().getSpanEnd(feedTitleTagsSpan);
        if (spanStart < 0 || spanEnd < spanStart) {
            return;
        }
        int length2 = this.f92796a.getText().length();
        int i2 = spanEnd;
        while (spanEnd < length2 && '\n' == this.f92796a.getText().charAt(spanEnd)) {
            i2 = spanEnd + 1;
            spanEnd = i2;
        }
        this.f92796a.getText().removeSpan(feedTitleTagsSpan);
        this.f92796a.getText().replace(spanStart, i2, "");
    }

    /* JADX INFO: renamed from: h */
    public void m117746h(d30 d30Var) {
        this.f92799d = d30Var;
    }

    /* JADX INFO: renamed from: i */
    public void m117747i(FeedTitleTagsSpan[] feedTitleTagsSpanArr, List<FeedTitleTagsSpan> list, Editable editable) {
        if (feedTitleTagsSpanArr.length <= 1) {
            list.add(feedTitleTagsSpanArr[0]);
            return;
        }
        for (FeedTitleTagsSpan feedTitleTagsSpan : feedTitleTagsSpanArr) {
            int size = list.size();
            if (size > 0) {
                int spanStart = editable.getSpanStart(feedTitleTagsSpan);
                int i = 0;
                while (true) {
                    if (i >= size) {
                        list.add(feedTitleTagsSpan);
                        break;
                    } else {
                        if (editable.getSpanStart(list.get(i)) > spanStart) {
                            list.add(i, feedTitleTagsSpan);
                            break;
                        }
                        i++;
                    }
                }
            } else {
                list.add(feedTitleTagsSpan);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public SpannableStringBuilder m117748j(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (String str2 : this.f92798c) {
            String str3 = "&~!~&" + str2 + "：&~!~&";
            int iIndexOf = spannableStringBuilder.toString().indexOf(str3);
            if (iIndexOf >= 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
                spannableStringBuilder2.append((CharSequence) "：");
                spannableStringBuilder2.setSpan(new FeedTitleTagsSpan(1291845632, str2), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder.replace(iIndexOf, str3.length() + iIndexOf, (CharSequence) spannableStringBuilder2);
                this.f92797b.add(str2);
            }
        }
        for (int iIndexOf2 = spannableStringBuilder.toString().indexOf("&~!~&"); iIndexOf2 >= 0; iIndexOf2 = spannableStringBuilder.toString().indexOf("&~!~&")) {
            spannableStringBuilder.replace(iIndexOf2, iIndexOf2 + 5, (CharSequence) "");
        }
        d30 d30Var = this.f92799d;
        if (d30Var != null) {
            d30Var.call();
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: k */
    public Editable m117749k(Editable editable) {
        FeedTitleTagsSpan[] feedTitleTagsSpanArr = (FeedTitleTagsSpan[]) editable.getSpans(0, editable.length(), FeedTitleTagsSpan.class);
        if (feedTitleTagsSpanArr == null || feedTitleTagsSpanArr.length == 0) {
            return editable;
        }
        ArrayList arrayList = new ArrayList();
        m117747i(feedTitleTagsSpanArr, arrayList, editable);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        FeedTitleTagsSpan feedTitleTagsSpan = arrayList.get(0);
        int spanStart = editable.getSpanStart(feedTitleTagsSpan);
        int spanEnd = editable.getSpanEnd(feedTitleTagsSpan);
        if (spanStart > 0) {
            spannableStringBuilder.append(editable.subSequence(0, spanStart));
        }
        int size = arrayList.size();
        int i = 1;
        while (i < size) {
            FeedTitleTagsSpan feedTitleTagsSpan2 = arrayList.get(i);
            int spanStart2 = editable.getSpanStart(feedTitleTagsSpan2);
            int spanEnd2 = editable.getSpanEnd(feedTitleTagsSpan2);
            CharSequence charSequenceSubSequence = editable.subSequence(spanEnd, spanStart2);
            if (charSequenceSubSequence != null && !TextUtils.isEmpty(charSequenceSubSequence.toString().trim())) {
                spannableStringBuilder.append((CharSequence) feedTitleTagsSpan.titleTag);
                spannableStringBuilder.append((CharSequence) "：");
                spannableStringBuilder.append(charSequenceSubSequence);
            }
            i++;
            feedTitleTagsSpan = feedTitleTagsSpan2;
            spanEnd = spanEnd2;
        }
        CharSequence charSequenceSubSequence2 = editable.subSequence(spanEnd, editable.length());
        if (charSequenceSubSequence2 != null && !TextUtils.isEmpty(charSequenceSubSequence2.toString().trim())) {
            spannableStringBuilder.append((CharSequence) feedTitleTagsSpan.titleTag);
            spannableStringBuilder.append((CharSequence) "：");
            spannableStringBuilder.append(charSequenceSubSequence2);
        }
        return Editable.Factory.getInstance().newEditable(spannableStringBuilder);
    }
}

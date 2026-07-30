package p009l;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.newui.view.HighlightData;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.vwb;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class k2l {

    /* JADX INFO: renamed from: a */
    public List<HighlightData> f15394a = new ArrayList();

    /* JADX INFO: renamed from: l.k2l$a */
    public class C0982a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HighlightData f15395a;

        public C0982a(HighlightData highlightData) {
            this.f15395a = highlightData;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            if (NullChecker.a(this.f15395a.getClickListener())) {
                this.f15395a.getClickListener().call();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m17281a(VText vText, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (TextUtils.isEmpty(charSequence) || TextUtils.isEmpty(charSequence.toString())) {
            return;
        }
        for (HighlightData highlightData : this.f15394a) {
            String key = highlightData.getKey();
            if (!TextUtils.isEmpty(key)) {
                int startIndex = highlightData.getStartIndex();
                int endIndex = highlightData.getEndIndex();
                if (startIndex < 0 || endIndex < 0) {
                    startIndex = charSequence.toString().indexOf(key);
                    endIndex = startIndex + key.length();
                }
                if (startIndex >= 0 && endIndex >= 0 && startIndex <= charSequence.length() && endIndex <= charSequence.length()) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(App.e.getResources().getColor(highlightData.getHighColor())), startIndex, endIndex, 33);
                    spannableStringBuilder.setSpan(new C0982a(highlightData), startIndex, endIndex, 33);
                    if (highlightData.isBold()) {
                        spannableStringBuilder.setSpan(new StyleSpan(1), startIndex, endIndex, 33);
                    }
                }
            }
        }
        vText.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: b */
    public void m17282b(VText vText, CharSequence charSequence, List<HighlightData> list) {
        this.f15394a = list;
        if (TextUtils.isEmpty(charSequence) || TextUtils.isEmpty(charSequence.toString()) || vwb.J(this.f15394a)) {
            vText.setText(charSequence);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (HighlightData highlightData : this.f15394a) {
            if (!TextUtils.isEmpty(highlightData.getKey())) {
                if (highlightData.isMatchAll()) {
                    int iIndexOf = charSequence.toString().indexOf(highlightData.getKey());
                    if (iIndexOf != -1) {
                        while (iIndexOf < charSequence.length()) {
                            int iIndexOf2 = charSequence.toString().indexOf(highlightData.getKey(), iIndexOf);
                            int length = highlightData.getKey().length() + iIndexOf2;
                            if (iIndexOf2 == -1) {
                                break;
                            }
                            HighlightData highlightDataCopy = highlightData.copy(highlightData);
                            if (highlightDataCopy != null) {
                                highlightDataCopy.setStartIndex(iIndexOf2);
                                highlightDataCopy.setEndIndex(Math.min(length, charSequence.length()));
                                arrayList.add(highlightDataCopy);
                                iIndexOf = length - 1;
                            }
                            iIndexOf++;
                        }
                    }
                } else {
                    arrayList.add(highlightData);
                }
            }
        }
        this.f15394a.clear();
        this.f15394a.addAll(arrayList);
        m17281a(vText, charSequence);
    }
}

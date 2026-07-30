package p153l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveRightInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class p2l {
    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: a */
    public static SpannableString m170375a(q2l q2lVar) {
        String strM105844a = bpj.m105844a(q2lVar.m175048g().rightName);
        int i = q2lVar.m175046e().switchCount;
        String string = i > 0 ? tbs.f172988a.getString(R$string.f44975P, Integer.valueOf(i), strM105844a) : tbs.f172988a.getString(R$string.f44977Q, strM105844a);
        SpannableString spannableString = new SpannableString(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#d74d37"));
        int length = string.length();
        spannableString.setSpan(foregroundColorSpan, length - strM105844a.length(), length, 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: b */
    public static List<q2l> m170376b(BLiveRightInfo bLiveRightInfo, BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig) {
        ArrayList arrayList = new ArrayList();
        if (bLiveRightInfo != null) {
            int size = bLiveRightInfo.multiple.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new q2l(bLiveRightInfo.multiple.get(i), bLiveHideAvatarEnterConfig, i));
            }
        }
        return arrayList;
    }
}

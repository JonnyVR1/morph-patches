package p149l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveRightInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class zzk {
    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: a */
    public static SpannableString m221019a(a0l a0lVar) {
        String strM150590a = lmj.m150590a(a0lVar.m94438g().rightName);
        int i = a0lVar.m94436e().switchCount;
        String string = i > 0 ? s9s.f163227a.getString(R$string.f44127P, Integer.valueOf(i), strM150590a) : s9s.f163227a.getString(R$string.f44129Q, strM150590a);
        SpannableString spannableString = new SpannableString(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#d74d37"));
        int length = string.length();
        spannableString.setSpan(foregroundColorSpan, length - strM150590a.length(), length, 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: b */
    public static List<a0l> m221020b(BLiveRightInfo bLiveRightInfo, BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig) {
        ArrayList arrayList = new ArrayList();
        if (bLiveRightInfo != null) {
            int size = bLiveRightInfo.multiple.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new a0l(bLiveRightInfo.multiple.get(i), bLiveHideAvatarEnterConfig, i));
            }
        }
        return arrayList;
    }
}

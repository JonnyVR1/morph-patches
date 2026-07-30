package p006l;

import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Detect;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.data.DetectRequest;
import com.p1.mobile.putong.data.DetectText;
import com.p1.mobile.putong.util.AntiSpamHelper;
import com.tantan.core.base.R;
import l.lsi0;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class os9 extends ax6 {
    public os9(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ Boolean m20725a3(Act act, Detect detect) {
        if (detect.text.isEmpty()) {
            return Boolean.TRUE;
        }
        if (AntiSpamHelper.a(detect, act.pageId())) {
            lsi0.w(R.string.c);
        } else {
            lsi0.w(R.string.n);
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: b3 */
    public c<Boolean> m20726b3(final Act act, String str, DetectCategoryType detectCategoryType) {
        if (qib0.f19802Z.m14990K(str)) {
            lsi0.y("含有违反社区规范信息，请重新编辑");
            return c.just(Boolean.FALSE);
        }
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = detectCategoryType;
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = detectCategoryType.toString();
        detectTextNew_.value = str;
        detectRequestNew_.text = vwb.f0(new DetectText[]{detectTextNew_});
        return ya5.m28135Q(detectRequestNew_).map(new w9j() { // from class: l.ns9
            public final Object call(Object obj) {
                return os9.m20725a3(act, (Detect) obj);
            }
        });
    }
}

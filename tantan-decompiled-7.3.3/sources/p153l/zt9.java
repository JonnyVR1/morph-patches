package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.util.AntiSpamHelper;
import com.tantan.core.base.R$string;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class zt9 extends dy6 {
    public zt9(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ Boolean m221452a3(Act act, Detect detect) {
        if (detect.text.isEmpty()) {
            return Boolean.TRUE;
        }
        if (AntiSpamHelper.m81449a(detect, act.pageId())) {
            o1j0.m165649w(R$string.f56614c);
        } else {
            o1j0.m165649w(R$string.f56625n);
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: b3 */
    public C22421c<Boolean> m221453b3(final Act act, String str, DetectCategoryType detectCategoryType) {
        if (uqb0.f180394Z.m95954K(str)) {
            o1j0.m165651y("含有违反社区规范信息，请重新编辑");
            return C22421c.just(Boolean.FALSE);
        }
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = detectCategoryType;
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = detectCategoryType.toString();
        detectTextNew_.value = str;
        detectRequestNew_.text = jyb.m147507f0(detectTextNew_);
        return yb5.m214988Q(detectRequestNew_).map(new qcj() { // from class: l.yt9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zt9.m221452a3(act, (Detect) obj);
            }
        });
    }
}

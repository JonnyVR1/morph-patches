package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.util.AntiSpamHelper;
import com.tantan.core.base.R$string;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class os9 extends ax6 {
    public os9(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ Boolean m165737a3(Act act, Detect detect) {
        if (detect.text.isEmpty()) {
            return Boolean.TRUE;
        }
        if (AntiSpamHelper.m80266a(detect, act.pageId())) {
            lsi0.m151593w(R$string.f55766c);
        } else {
            lsi0.m151593w(R$string.f55777n);
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: b3 */
    public C22306c<Boolean> m165738b3(final Act act, String str, DetectCategoryType detectCategoryType) {
        if (qib0.f154711Z.m119125K(str)) {
            lsi0.m151595y("含有违反社区规范信息，请重新编辑");
            return C22306c.just(Boolean.FALSE);
        }
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = detectCategoryType;
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = detectCategoryType.toString();
        detectTextNew_.value = str;
        detectRequestNew_.text = vwb.m200324f0(detectTextNew_);
        return ya5.m213801Q(detectRequestNew_).map(new w9j() { // from class: l.ns9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return os9.m165737a3(act, (Detect) obj);
            }
        });
    }
}

package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.FateRadar;
import com.p046p1.mobile.putong.core.data.GreetingItem;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class pdw extends jq2<sdw> {

    /* JADX INFO: renamed from: l.pdw$a */
    public class C19187a implements e30<FateRadar> {
        public C19187a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(FateRadar fateRadar) {
            ((sdw) pdw.this.viewModel).m183568m();
            if (NullChecker.m81303a(fateRadar) && NullChecker.m81303a(fateRadar.aiGreeting) && !TextUtils.isEmpty(fateRadar.aiGreeting.value)) {
                ((sdw) pdw.this.viewModel).m183570s(fateRadar.aiGreeting.value);
            } else {
                osi0.m165783g("网络异常！");
            }
        }
    }

    /* JADX INFO: renamed from: l.pdw$b */
    public class C19188b implements e30<Throwable> {
        public C19188b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            ((sdw) pdw.this.viewModel).m183568m();
            osi0.m165783g("网络异常！");
        }
    }

    /* JADX INFO: renamed from: l.pdw$c */
    public class C19189c implements e30<Boolean> {
        public C19189c() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            ((sdw) pdw.this.viewModel).m183568m();
            if (!bool.booleanValue()) {
                osi0.m165783g("保存失败");
            } else {
                CoreModule.f17545c.f19683s2.f170716S.onNext(Boolean.TRUE);
                ((sdw) pdw.this.viewModel).getAct().lambda$debugItems$19();
            }
        }
    }

    /* JADX INFO: renamed from: l.pdw$d */
    public class C19190d implements e30<Throwable> {
        public C19190d() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            ((sdw) pdw.this.viewModel).m183568m();
            if (NullChecker.m81303a(th) && (th instanceof TantanException.Client.TantanForbidden)) {
                TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                if (tantanForbidden.code == 40399) {
                    String str = tantanForbidden.message;
                    if (!TextUtils.isEmpty(str)) {
                        lsi0.m151595y(str);
                        return;
                    }
                }
            }
            osi0.m165783g("保存失败");
        }
    }

    public pdw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m168424p0(Bundle bundle) {
        ((sdw) this.viewModel).m183569n(bundle);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.mdw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133320a.m168424p0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m168425n0(GreetingItem greetingItem) {
        duringCreated(greetingItem.f20403id == 0 ? CoreModule.f17545c.f19683s2.m189327J3(greetingItem) : CoreModule.f17545c.f19683s2.m189329L3(greetingItem)).subscribe(mkd0.m154956H(new C19189c(), new C19190d()));
    }

    /* JADX INFO: renamed from: o0 */
    public void m168426o0() {
        ((sdw) this.viewModel).m183571u();
        duringCreated(CoreModule.f17545c.f19683s2.m189323F3()).subscribe(mkd0.m154956H(new C19187a(), new C19188b()));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m168427q0(GreetingItem greetingItem, Detect detect) {
        if (!NullChecker.m81303a(detect.text) || detect.text.size() <= 0) {
            m168425n0(greetingItem);
            return;
        }
        ((sdw) this.viewModel).m183568m();
        if (AntiSpamHelper.m80266a(detect, "p_artwork_send_message")) {
            lsi0.m151593w(R$string.f18409c0);
        } else {
            osi0.m165783g(((sdw) this.viewModel).getAct().getString(R$string.f17844J7));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m168428r0(Throwable th) {
        ((sdw) this.viewModel).m183568m();
    }

    /* JADX INFO: renamed from: s0 */
    public void m168429s0(final GreetingItem greetingItem) {
        if (greetingItem == null) {
            return;
        }
        ((sdw) this.viewModel).m183571u();
        if (TextUtils.equals(greetingItem.category, "ai")) {
            m168425n0(greetingItem);
            return;
        }
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = DetectCategoryType.get("greeting");
        ArrayList arrayList = new ArrayList();
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = "greeting";
        detectTextNew_.value = greetingItem.value;
        arrayList.add(detectTextNew_);
        detectRequestNew_.text = arrayList;
        ((sdw) this.viewModel).getAct().duringCreated(ya5.m213801Q(detectRequestNew_)).subscribe(mkd0.m154956H(new e30() { // from class: l.ndw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138558a.m168427q0(greetingItem, (Detect) obj);
            }
        }, new e30() { // from class: l.odw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143248a.m168428r0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}

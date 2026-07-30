package p009l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.util.AntiSpamHelper;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.FateRadar;
import com.p1.mobile.putong.core.data.GreetingItem;
import com.p1.mobile.putong.data.Detect;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.data.DetectRequest;
import com.p1.mobile.putong.data.DetectText;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.ya5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pdw extends jq2<sdw> {

    /* JADX INFO: renamed from: l.pdw$a */
    public class C1103a implements e30<FateRadar> {
        public C1103a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(FateRadar fateRadar) {
            ((sdw) ((jq2) pdw.this).viewModel).m22123m();
            if (NullChecker.a(fateRadar) && NullChecker.a(fateRadar.aiGreeting) && !TextUtils.isEmpty(fateRadar.aiGreeting.value)) {
                ((sdw) ((jq2) pdw.this).viewModel).m22125s(fateRadar.aiGreeting.value);
            } else {
                osi0.g("网络异常！");
            }
        }
    }

    /* JADX INFO: renamed from: l.pdw$b */
    public class C1104b implements e30<Throwable> {
        public C1104b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            ((sdw) ((jq2) pdw.this).viewModel).m22123m();
            osi0.g("网络异常！");
        }
    }

    /* JADX INFO: renamed from: l.pdw$c */
    public class C1105c implements e30<Boolean> {
        public C1105c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            ((sdw) ((jq2) pdw.this).viewModel).m22123m();
            if (!bool.booleanValue()) {
                osi0.g("保存失败");
            } else {
                CoreModule.c.s2.S.onNext(Boolean.TRUE);
                ((sdw) ((jq2) pdw.this).viewModel).act().finish();
            }
        }
    }

    /* JADX INFO: renamed from: l.pdw$d */
    public class C1106d implements e30<Throwable> {
        public C1106d() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            ((sdw) ((jq2) pdw.this).viewModel).m22123m();
            if (NullChecker.a(th) && (th instanceof TantanException.Client.TantanForbidden)) {
                TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                if (tantanForbidden.code == 40399) {
                    String str = tantanForbidden.message;
                    if (!TextUtils.isEmpty(str)) {
                        lsi0.y(str);
                        return;
                    }
                }
            }
            osi0.g("保存失败");
        }
    }

    public pdw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m20166p0(Bundle bundle) {
        ((sdw) ((jq2) this).viewModel).m22124n(bundle);
    }

    /* JADX INFO: renamed from: a0 */
    public void m20167a0() {
        super.a0();
        creates(new e30() { // from class: l.mdw
            public final void call(Object obj) {
                this.f16848a.m20166p0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m20168n0(GreetingItem greetingItem) {
        duringCreated(greetingItem.id == 0 ? CoreModule.c.s2.J3(greetingItem) : CoreModule.c.s2.L3(greetingItem)).subscribe(mkd0.H(new C1105c(), new C1106d()));
    }

    /* JADX INFO: renamed from: o0 */
    public void m20169o0() {
        ((sdw) ((jq2) this).viewModel).m22126u();
        duringCreated(CoreModule.c.s2.F3()).subscribe(mkd0.H(new C1103a(), new C1104b()));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m20170q0(GreetingItem greetingItem, Detect detect) {
        if (!NullChecker.a(detect.text) || detect.text.size() <= 0) {
            m20168n0(greetingItem);
            return;
        }
        ((sdw) ((jq2) this).viewModel).m22123m();
        if (AntiSpamHelper.m10617a(detect, "p_artwork_send_message")) {
            lsi0.w(R.string.c0);
        } else {
            osi0.g(((sdw) ((jq2) this).viewModel).act().getString(R.string.J7));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m20171r0(Throwable th) {
        ((sdw) ((jq2) this).viewModel).m22123m();
    }

    /* JADX INFO: renamed from: s0 */
    public void m20172s0(final GreetingItem greetingItem) {
        if (greetingItem == null) {
            return;
        }
        ((sdw) ((jq2) this).viewModel).m22126u();
        if (TextUtils.equals(greetingItem.category, "ai")) {
            m20168n0(greetingItem);
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
        ((sdw) ((jq2) this).viewModel).act().duringCreated(ya5.Q(detectRequestNew_)).subscribe(mkd0.H(new e30() { // from class: l.ndw
            public final void call(Object obj) {
                this.f17428a.m20170q0(greetingItem, (Detect) obj);
            }
        }, new e30() { // from class: l.odw
            public final void call(Object obj) {
                this.f17933a.m20171r0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}

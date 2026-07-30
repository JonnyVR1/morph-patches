package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.FateRadar;
import com.p051p1.mobile.putong.core.data.GreetingItem;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class nfw extends ar2<qfw> {

    /* JADX INFO: renamed from: l.nfw$a */
    public class C18870a implements y20<FateRadar> {
        public C18870a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(FateRadar fateRadar) {
            ((qfw) nfw.this.viewModel).m176422m();
            if (NullChecker.m82486a(fateRadar) && NullChecker.m82486a(fateRadar.aiGreeting) && !TextUtils.isEmpty(fateRadar.aiGreeting.value)) {
                ((qfw) nfw.this.viewModel).m176424s(fateRadar.aiGreeting.value);
            } else {
                r1j0.m179420g("网络异常！");
            }
        }
    }

    /* JADX INFO: renamed from: l.nfw$b */
    public class C18871b implements y20<Throwable> {
        public C18871b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            ((qfw) nfw.this.viewModel).m176422m();
            r1j0.m179420g("网络异常！");
        }
    }

    /* JADX INFO: renamed from: l.nfw$c */
    public class C18872c implements y20<Boolean> {
        public C18872c() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            ((qfw) nfw.this.viewModel).m176422m();
            if (!bool.booleanValue()) {
                r1j0.m179420g("保存失败");
            } else {
                CoreModule.f18264c.f20425s2.f110502S.onNext(Boolean.TRUE);
                ((qfw) nfw.this.viewModel).getAct().lambda$debugItems$19();
            }
        }
    }

    /* JADX INFO: renamed from: l.nfw$d */
    public class C18873d implements y20<Throwable> {
        public C18873d() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            ((qfw) nfw.this.viewModel).m176422m();
            if (NullChecker.m82486a(th) && (th instanceof TantanException.Client.TantanForbidden)) {
                TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
                if (tantanForbidden.code == 40399) {
                    String str = tantanForbidden.message;
                    if (!TextUtils.isEmpty(str)) {
                        o1j0.m165651y(str);
                        return;
                    }
                }
            }
            r1j0.m179420g("保存失败");
        }
    }

    public nfw(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m162951p0(Bundle bundle) {
        ((qfw) this.viewModel).m176423n(bundle);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.kfw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126512a.m162951p0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final void m162952n0(GreetingItem greetingItem) {
        duringCreated(greetingItem.f21145id == 0 ? CoreModule.f18264c.f20425s2.m135734J3(greetingItem) : CoreModule.f18264c.f20425s2.m135736L3(greetingItem)).subscribe(psd0.m173597H(new C18872c(), new C18873d()));
    }

    /* JADX INFO: renamed from: o0 */
    public void m162953o0() {
        ((qfw) this.viewModel).m176425u();
        duringCreated(CoreModule.f18264c.f20425s2.m135730F3()).subscribe(psd0.m173597H(new C18870a(), new C18871b()));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m162954q0(GreetingItem greetingItem, Detect detect) {
        if (!NullChecker.m82486a(detect.text) || detect.text.size() <= 0) {
            m162952n0(greetingItem);
            return;
        }
        ((qfw) this.viewModel).m176422m();
        if (AntiSpamHelper.m81449a(detect, "p_artwork_send_message")) {
            o1j0.m165649w(R$string.f19139c0);
        } else {
            r1j0.m179420g(((qfw) this.viewModel).getAct().getString(R$string.f18634L7));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m162955r0(Throwable th) {
        ((qfw) this.viewModel).m176422m();
    }

    /* JADX INFO: renamed from: s0 */
    public void m162956s0(final GreetingItem greetingItem) {
        if (greetingItem == null) {
            return;
        }
        ((qfw) this.viewModel).m176425u();
        if (TextUtils.equals(greetingItem.category, "ai")) {
            m162952n0(greetingItem);
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
        ((qfw) this.viewModel).getAct().duringCreated(yb5.m214988Q(detectRequestNew_)).subscribe(psd0.m173597H(new y20() { // from class: l.lfw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131903a.m162954q0(greetingItem, (Detect) obj);
            }
        }, new y20() { // from class: l.mfw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136677a.m162955r0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}

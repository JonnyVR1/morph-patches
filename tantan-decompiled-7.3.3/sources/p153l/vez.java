package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.core.data.StickerPackage;
import com.p051p1.mobile.putong.core.data.UserSticker;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageBar;
import com.p051p1.mobile.putong.data.BundleStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class vez extends j3z<AbstractC18764n2> {

    /* JADX INFO: renamed from: b */
    public int f183865b;

    /* JADX INFO: renamed from: c */
    public boolean f183866c;

    /* JADX INFO: renamed from: d */
    public boolean f183867d;

    /* JADX INFO: renamed from: e */
    public boolean f183868e;

    /* JADX INFO: renamed from: f */
    public boolean f183869f;

    /* JADX INFO: renamed from: g */
    public boolean f183870g;

    /* JADX INFO: renamed from: h */
    public C22507a<Integer> f183871h;

    public vez(ner nerVar) {
        super(nerVar);
        this.f183865b = 0;
        this.f183866c = false;
        this.f183867d = false;
        this.f183868e = false;
        this.f183869f = false;
        this.f183870g = false;
        this.f183871h = C22507a.m222759c(0);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m201081i0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Boolean m201088p0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ List m201090r0(List list, Throwable th) {
        return list;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m201091s0(y20 y20Var, List list) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(list);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m201093A0() {
        creates(new y20() { // from class: l.iez
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114638a.m201099H0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m201094C0() {
        return this.f183869f;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m201095D0() {
        return this.f183866c;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m201096E0() {
        return this.f183865b == 0;
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m201097F0() {
        return this.f183865b == 1;
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m201098G0(List list) {
        ((AbstractC18764n2) this.viewModel).mo125457a().m49983D(list);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m201099H0(Bundle bundle) {
        if (this.f183868e) {
            this.f183868e = false;
            duringCreated(qzz.f160320I1).filter(new qcj() { // from class: l.nez
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return vez.m201088p0((Boolean) obj);
                }
            }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.oez
                @Override // p153l.y20
                public final void call(Object obj) {
                    clz.f82443F0.onNext(uxj0.f181467a);
                }
            }));
        } else if (this.f183867d) {
            this.f183867d = false;
            ((AbstractC18764n2) this.viewModel).mo125462f();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ C22421c m201101J0(final List list) {
        return CoreModule.m30933P().m143412i().mo180523q() ? CoreModule.f18264c.f20366Z.f20885T.m159274k().map(new qcj() { // from class: l.jez
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f120543a.m201100I0(list, (CoreData) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.kez
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vez.m201090r0(list, (Throwable) obj);
            }
        }) : C22421c.just(list);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m201102L0(final y20<List<pf60<StickerBundle, StickerPackage>>> y20Var) {
        duringCreated(CoreModule.f18264c.f20366Z.f20884S.m159274k().filter(new a0a()).map(new qcj() { // from class: l.pez
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f152142a.m201112z0((CoreData) obj);
            }
        }).switchMap(new qcj() { // from class: l.qez
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f157231a.m201101J0((List) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.rez
            @Override // p153l.y20
            public final void call(Object obj) {
                vez.m201091s0(y20Var, (List) obj);
            }
        }, new y20() { // from class: l.sez
            @Override // p153l.y20
            public final void call(Object obj) {
                vez.m201081i0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public void m201103N0(boolean z) {
        this.f183869f = z;
    }

    /* JADX INFO: renamed from: O0 */
    public void m201104O0(boolean z) {
        ((AbstractC18764n2) this.viewModel).mo125468n(z);
    }

    /* JADX INFO: renamed from: P0 */
    public void m201105P0(boolean z) {
        this.f183866c = z;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m201106Q0(float f) {
        this.f183871h.onNext(Integer.valueOf((int) f));
    }

    /* JADX INFO: renamed from: R0 */
    public void m201107R0(int i) {
        this.f183865b = i;
        m143372e0().mo50138B0().m194226y2(i);
    }

    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final List<pf60<StickerBundle, StickerPackage>> m201100I0(List<pf60<StickerBundle, StickerPackage>> list, CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || jyb.m147479J(coreData.userStickers)) ? UserSticker.new_() : coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        StickerPackage stickerPackageNew_ = StickerPackage.new_();
        stickerPackageNew_.stickers = userStickerNew_.favoriteStickers;
        stickerPackageNew_.f21248id = "custom_stickers";
        if (!jyb.m147479J(list) && NullChecker.m82486a(list.get(0).f152157b) && "custom_stickers".equals(list.get(0).f152157b.f21248id)) {
            list.remove(0);
        }
        list.add(0, pf60.m172085a(StickerBundle.new_(), stickerPackageNew_));
        return list;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f183867d = act().getIntent().getBooleanExtra("keyboardUp", false);
        this.f183868e = act().getIntent().getBooleanExtra("media_keyboard", false);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m201093A0();
    }

    /* JADX INFO: renamed from: u0 */
    public void m201109u0() {
        MessageBar messageBarM114041t0 = m143372e0().mo50138B0().m143374g0().m114041t0();
        if (((AbstractC18764n2) this.viewModel).mo125457a() == null && NullChecker.m82486a(messageBarM114041t0.getHidden_slide_out())) {
            messageBarM114041t0.getHidden_slide_out().addView(((AbstractC18764n2) this.viewModel).inflateView(act().inflater(), messageBarM114041t0.getHidden_slide_out()));
            ((AbstractC18764n2) this.viewModel).mo125463i();
            m201102L0(new y20() { // from class: l.mez
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f136582a.m201098G0((List) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x0 */
    public C22507a<Integer> m201110x0() {
        return this.f183871h;
    }

    /* JADX INFO: renamed from: y0 */
    public int m201111y0() {
        return this.f183865b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public final List<pf60<StickerBundle, StickerPackage>> m201112z0(CoreData coreData) {
        final HashMap map = new HashMap();
        for (StickerPackage stickerPackage : coreData.packages) {
            map.put(stickerPackage.f21248id, stickerPackage);
        }
        ArrayList arrayListM147534w = jyb.m147534w(coreData.bundles, new qcj() { // from class: l.tez
            @Override // p153l.qcj
            public final Object call(Object obj) {
                StickerBundle stickerBundle = (StickerBundle) obj;
                return jyb.m147486Q(stickerBundle.packages, new qcj() { // from class: l.lez
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return jyb.m147494Y(stickerBundle, (StickerPackage) map.get((String) obj2));
                    }
                });
            }
        });
        Iterator it = arrayListM147534w.iterator();
        while (it.hasNext()) {
            pf60 pf60Var = (pf60) it.next();
            if (pf60Var.f152157b == 0) {
                it.remove();
            } else if (TextUtils.equals(((StickerBundle) pf60Var.f152156a).f21247id, "4")) {
                ((StickerBundle) pf60Var.f152156a).status = BundleStatus.get(BundleStatus.purchased);
                Locale locale = act().getResources().getConfiguration().locale;
                if (!"zh".equals(locale.getLanguage()) || !"CN".equalsIgnoreCase(locale.getCountry())) {
                    S s = pf60Var.f152157b;
                    ((StickerPackage) s).stickers = jyb.m147522n(((StickerPackage) s).stickers, new qcj() { // from class: l.uez
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!rgj.m181447a((String) obj));
                        }
                    });
                }
            } else {
                it.remove();
            }
        }
        return arrayListM147534w;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}

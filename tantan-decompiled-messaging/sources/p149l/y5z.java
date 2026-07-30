package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.core.data.StickerPackage;
import com.p046p1.mobile.putong.core.data.UserSticker;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageBar;
import com.p046p1.mobile.putong.data.BundleStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class y5z extends muy<AbstractC18604n2> {

    /* JADX INFO: renamed from: b */
    public int f196495b;

    /* JADX INFO: renamed from: c */
    public boolean f196496c;

    /* JADX INFO: renamed from: d */
    public boolean f196497d;

    /* JADX INFO: renamed from: e */
    public boolean f196498e;

    /* JADX INFO: renamed from: f */
    public boolean f196499f;

    /* JADX INFO: renamed from: g */
    public boolean f196500g;

    /* JADX INFO: renamed from: h */
    public C22392a<Integer> f196501h;

    public y5z(mcr mcrVar) {
        super(mcrVar);
        this.f196495b = 0;
        this.f196496c = false;
        this.f196497d = false;
        this.f196498e = false;
        this.f196499f = false;
        this.f196500g = false;
        this.f196501h = C22392a.m221513c(0);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m213036i0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Boolean m213043p0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ List m213045r0(List list, Throwable th) {
        return list;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m213046s0(e30 e30Var, List list) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(list);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m213048A0() {
        creates(new e30() { // from class: l.l5z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126217a.m213054H0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m213049C0() {
        return this.f196499f;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m213050D0() {
        return this.f196496c;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m213051E0() {
        return this.f196495b == 0;
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m213052F0() {
        return this.f196495b == 1;
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m213053G0(List list) {
        ((AbstractC18604n2) this.viewModel).mo134702a().m48800D(list);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m213054H0(Bundle bundle) {
        if (this.f196498e) {
            this.f196498e = false;
            duringCreated(tqz.f171657I1).filter(new w9j() { // from class: l.q5z
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return y5z.m213043p0((Boolean) obj);
                }
            }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.r5z
                @Override // p149l.e30
                public final void call(Object obj) {
                    fcz.f96880F0.onNext(roj0.f160388a);
                }
            }));
        } else if (this.f196497d) {
            this.f196497d = false;
            ((AbstractC18604n2) this.viewModel).mo134707f();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ C22306c m213056J0(final List list) {
        return CoreModule.m29935P().m94658i().mo158431q() ? CoreModule.f17545c.f19624Z.f20143T.m121230k().map(new w9j() { // from class: l.m5z
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f131433a.m213055I0(list, (CoreData) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.n5z
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return y5z.m213045r0(list, (Throwable) obj);
            }
        }) : C22306c.just(list);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m213057L0(final e30<List<j760<StickerBundle, StickerPackage>>> e30Var) {
        duringCreated(CoreModule.f17545c.f19624Z.f20142S.m121230k().filter(new py9()).map(new w9j() { // from class: l.s5z
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f162604a.m213067z0((CoreData) obj);
            }
        }).switchMap(new w9j() { // from class: l.t5z
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f167892a.m213056J0((List) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.u5z
            @Override // p149l.e30
            public final void call(Object obj) {
                y5z.m213046s0(e30Var, (List) obj);
            }
        }, new e30() { // from class: l.v5z
            @Override // p149l.e30
            public final void call(Object obj) {
                y5z.m213036i0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public void m213058N0(boolean z) {
        this.f196499f = z;
    }

    /* JADX INFO: renamed from: O0 */
    public void m213059O0(boolean z) {
        ((AbstractC18604n2) this.viewModel).mo134713n(z);
    }

    /* JADX INFO: renamed from: P0 */
    public void m213060P0(boolean z) {
        this.f196496c = z;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m213061Q0(float f) {
        this.f196501h.onNext(Integer.valueOf((int) f));
    }

    /* JADX INFO: renamed from: R0 */
    public void m213062R0(int i) {
        this.f196495b = i;
        m156455e0().mo48954A0().m210948y2(i);
    }

    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final List<j760<StickerBundle, StickerPackage>> m213055I0(List<j760<StickerBundle, StickerPackage>> list, CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || vwb.m200296J(coreData.userStickers)) ? UserSticker.new_() : coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        StickerPackage stickerPackageNew_ = StickerPackage.new_();
        stickerPackageNew_.stickers = userStickerNew_.favoriteStickers;
        stickerPackageNew_.f20506id = "custom_stickers";
        if (!vwb.m200296J(list) && NullChecker.m81303a(list.get(0).f116565b) && "custom_stickers".equals(list.get(0).f116565b.f20506id)) {
            list.remove(0);
        }
        list.add(0, j760.m140076a(StickerBundle.new_(), stickerPackageNew_));
        return list;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f196497d = act().getIntent().getBooleanExtra("keyboardUp", false);
        this.f196498e = act().getIntent().getBooleanExtra("media_keyboard", false);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m213048A0();
    }

    /* JADX INFO: renamed from: u0 */
    public void m213064u0() {
        MessageBar messageBarM128210t0 = m156455e0().mo48954A0().m156457g0().m128210t0();
        if (((AbstractC18604n2) this.viewModel).mo134702a() == null && NullChecker.m81303a(messageBarM128210t0.getHidden_slide_out())) {
            messageBarM128210t0.getHidden_slide_out().addView(((AbstractC18604n2) this.viewModel).inflateView(act().inflater(), messageBarM128210t0.getHidden_slide_out()));
            ((AbstractC18604n2) this.viewModel).mo134708i();
            m213057L0(new e30() { // from class: l.p5z
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f147347a.m213053G0((List) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x0 */
    public C22392a<Integer> m213065x0() {
        return this.f196501h;
    }

    /* JADX INFO: renamed from: y0 */
    public int m213066y0() {
        return this.f196495b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public final List<j760<StickerBundle, StickerPackage>> m213067z0(CoreData coreData) {
        final HashMap map = new HashMap();
        for (StickerPackage stickerPackage : coreData.packages) {
            map.put(stickerPackage.f20506id, stickerPackage);
        }
        ArrayList arrayListM200351w = vwb.m200351w(coreData.bundles, new w9j() { // from class: l.w5z
            @Override // p149l.w9j
            public final Object call(Object obj) {
                StickerBundle stickerBundle = (StickerBundle) obj;
                return vwb.m200303Q(stickerBundle.packages, new w9j() { // from class: l.o5z
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return vwb.m200311Y(stickerBundle, (StickerPackage) map.get((String) obj2));
                    }
                });
            }
        });
        Iterator it = arrayListM200351w.iterator();
        while (it.hasNext()) {
            j760 j760Var = (j760) it.next();
            if (j760Var.f116565b == 0) {
                it.remove();
            } else if (TextUtils.equals(((StickerBundle) j760Var.f116564a).f20505id, "4")) {
                ((StickerBundle) j760Var.f116564a).status = BundleStatus.get(BundleStatus.purchased);
                Locale locale = act().getResources().getConfiguration().locale;
                if (!"zh".equals(locale.getLanguage()) || !"CN".equalsIgnoreCase(locale.getCountry())) {
                    S s = j760Var.f116565b;
                    ((StickerPackage) s).stickers = vwb.m200339n(((StickerPackage) s).stickers, new w9j() { // from class: l.x5z
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!xdj.m208315a((String) obj));
                        }
                    });
                }
            } else {
                it.remove();
            }
        }
        return arrayListM200351w;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}

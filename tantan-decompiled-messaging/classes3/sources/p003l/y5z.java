package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageBar;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.StickerBundle;
import com.p1.mobile.putong.core.data.StickerPackage;
import com.p1.mobile.putong.core.data.UserSticker;
import com.p1.mobile.putong.data.BundleStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.py9;
import l.roj0;
import l.vwb;
import p014rx.C1099c;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class y5z extends muy<AbstractC0438n2> {

    /* JADX INFO: renamed from: b */
    public int f8919b;

    /* JADX INFO: renamed from: c */
    public boolean f8920c;

    /* JADX INFO: renamed from: d */
    public boolean f8921d;

    /* JADX INFO: renamed from: e */
    public boolean f8922e;

    /* JADX INFO: renamed from: f */
    public boolean f8923f;

    /* JADX INFO: renamed from: g */
    public boolean f8924g;

    /* JADX INFO: renamed from: h */
    public C1185a<Integer> f8925h;

    public y5z(mcr mcrVar) {
        super(mcrVar);
        this.f8919b = 0;
        this.f8920c = false;
        this.f8921d = false;
        this.f8922e = false;
        this.f8923f = false;
        this.f8924g = false;
        this.f8925h = C1185a.m9970c(0);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m8890i0(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ Boolean m8897p0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ List m8899r0(List list, Throwable th) {
        return list;
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m8900s0(e30 e30Var, List list) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(list);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m8902A0() {
        creates(new e30() { // from class: l.l5z
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5222a.m8908H0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m8903C0() {
        return this.f8923f;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean m8904D0() {
        return this.f8920c;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m8905E0() {
        return this.f8919b == 0;
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m8906F0() {
        return this.f8919b == 1;
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m8907G0(List list) {
        ((AbstractC0438n2) ((jq2) this).viewModel).mo5099a().m1884D(list);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m8908H0(Bundle bundle) {
        if (this.f8922e) {
            this.f8922e = false;
            duringCreated(tqz.f7589I1).filter(new w9j() { // from class: l.q5z
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return y5z.m8897p0((Boolean) obj);
                }
            }).take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.r5z
                @Override // p003l.e30
                public final void call(Object obj) {
                    fcz.f3512F0.onNext(roj0.a);
                }
            }));
        } else if (this.f8921d) {
            this.f8921d = false;
            ((AbstractC0438n2) ((jq2) this).viewModel).mo5104f();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ C1099c m8910J0(final List list) {
        return CoreModule.P().i().q() ? CoreModule.c.Z.T.k().map(new w9j() { // from class: l.m5z
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f5556a.m8909I0(list, (CoreData) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.n5z
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return y5z.m8899r0(list, (Throwable) obj);
            }
        }) : C1099c.just(list);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m8911L0(final e30<List<j760<StickerBundle, StickerPackage>>> e30Var) {
        duringCreated(CoreModule.c.Z.S.k().filter(new py9()).map(new w9j() { // from class: l.s5z
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f7149a.m8923z0((CoreData) obj);
            }
        }).switchMap(new w9j() { // from class: l.t5z
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f7411a.m8910J0((List) obj);
            }
        })).subscribe((m250) mkd0.H(new e30() { // from class: l.u5z
            @Override // p003l.e30
            public final void call(Object obj) {
                y5z.m8900s0(e30Var, (List) obj);
            }
        }, new e30() { // from class: l.v5z
            @Override // p003l.e30
            public final void call(Object obj) {
                y5z.m8890i0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public void m8912N0(boolean z) {
        this.f8923f = z;
    }

    /* JADX INFO: renamed from: O0 */
    public void m8913O0(boolean z) {
        ((AbstractC0438n2) ((jq2) this).viewModel).mo5111n(z);
    }

    /* JADX INFO: renamed from: P0 */
    public void m8914P0(boolean z) {
        this.f8920c = z;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m8915Q0(float f) {
        this.f8925h.onNext(Integer.valueOf((int) f));
    }

    /* JADX INFO: renamed from: R0 */
    public void m8916R0(int i) {
        this.f8919b = i;
        m6497e0().mo2046A0().m8847y2(i);
    }

    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final List<j760<StickerBundle, StickerPackage>> m8909I0(List<j760<StickerBundle, StickerPackage>> list, CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || vwb.J(coreData.userStickers)) ? UserSticker.new_() : (UserSticker) coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        StickerPackage stickerPackageNew_ = StickerPackage.new_();
        stickerPackageNew_.stickers = userStickerNew_.favoriteStickers;
        stickerPackageNew_.id = "custom_stickers";
        if (!vwb.J(list) && NullChecker.a(list.get(0).b) && "custom_stickers".equals(((StickerPackage) list.get(0).b).id)) {
            list.remove(0);
        }
        list.add(0, j760.a(StickerBundle.new_(), stickerPackageNew_));
        return list;
    }

    /* JADX INFO: renamed from: Z */
    public void m8918Z() {
        super.Z();
        this.f8921d = act().getIntent().getBooleanExtra("keyboardUp", false);
        this.f8922e = act().getIntent().getBooleanExtra("media_keyboard", false);
    }

    /* JADX INFO: renamed from: a0 */
    public void m8919a0() {
        super.a0();
        m8902A0();
    }

    /* JADX INFO: renamed from: u0 */
    public void m8920u0() {
        MessageBar messageBarM4844t0 = m6497e0().mo2046A0().m6499g0().m4844t0();
        if (((AbstractC0438n2) ((jq2) this).viewModel).mo5099a() == null && NullChecker.a(messageBarM4844t0.getHidden_slide_out())) {
            messageBarM4844t0.getHidden_slide_out().addView(((AbstractC0438n2) ((jq2) this).viewModel).inflateView(act().inflater(), messageBarM4844t0.getHidden_slide_out()));
            ((AbstractC0438n2) ((jq2) this).viewModel).mo5105i();
            m8911L0(new e30() { // from class: l.p5z
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6323a.m8907G0((List) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x0 */
    public C1185a<Integer> m8921x0() {
        return this.f8925h;
    }

    /* JADX INFO: renamed from: y0 */
    public int m8922y0() {
        return this.f8919b;
    }

    /* JADX INFO: renamed from: z0 */
    public final List<j760<StickerBundle, StickerPackage>> m8923z0(CoreData coreData) {
        final HashMap map = new HashMap();
        for (StickerPackage stickerPackage : coreData.packages) {
            map.put(stickerPackage.id, stickerPackage);
        }
        ArrayList arrayListW = vwb.w(coreData.bundles, new w9j() { // from class: l.w5z
            @Override // p003l.w9j
            public final Object call(Object obj) {
                StickerBundle stickerBundle = (StickerBundle) obj;
                return vwb.Q(stickerBundle.packages, new w9j() { // from class: l.o5z
                    @Override // p003l.w9j
                    public final Object call(Object obj2) {
                        return vwb.Y(stickerBundle, (StickerPackage) map.get((String) obj2));
                    }
                });
            }
        });
        Iterator it = arrayListW.iterator();
        while (it.hasNext()) {
            j760 j760Var = (j760) it.next();
            if (j760Var.b == null) {
                it.remove();
            } else if (TextUtils.equals(((StickerBundle) j760Var.a).id, "4")) {
                ((StickerBundle) j760Var.a).status = BundleStatus.get("purchased");
                Locale locale = act().getResources().getConfiguration().locale;
                if (!"zh".equals(locale.getLanguage()) || !"CN".equalsIgnoreCase(locale.getCountry())) {
                    Object obj = j760Var.b;
                    ((StickerPackage) obj).stickers = vwb.n(((StickerPackage) obj).stickers, new w9j() { // from class: l.x5z
                        @Override // p003l.w9j
                        public final Object call(Object obj2) {
                            return Boolean.valueOf(!xdj.m8698a((String) obj2));
                        }
                    });
                }
            } else {
                it.remove();
            }
        }
        return arrayListW;
    }

    public void destroy() {
    }
}

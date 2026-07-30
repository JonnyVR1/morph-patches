package p002l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.base.data.BLiveDynamicEffect;
import com.p1.mobile.putong.live.base.data.BLiveMagic;
import com.p1.mobile.putong.live.base.data.BLiveMagicList;
import com.p1.mobile.putong.live.livingroom.view.MagicGestureView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l.e30;
import l.ffw;
import l.fld0;
import l.hdv;
import l.hfw;
import l.idv;
import l.lsi0;
import l.pph0;
import l.qph0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bt3 extends mz0 {

    /* JADX INFO: renamed from: A */
    public String f8346A;

    /* JADX INFO: renamed from: y */
    public List<BLiveMagicList> f8347y;

    /* JADX INFO: renamed from: z */
    public C0200a f8348z;

    public bt3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, 0, str2);
        this.f8347y = new ArrayList();
    }

    /* JADX INFO: renamed from: B4 */
    public static /* synthetic */ void m10577B4(DialogInterface dialogInterface) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public /* synthetic */ void m10582L4(BLiveButtonType bLiveButtonType) {
        m10611V4();
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m10586r4(Throwable th) {
        StringBuilder sb = new StringBuilder("magic_gesture error:");
        sb.append(th == null ? "no message" : th.getMessage());
        hfw.a("magic_gesture", sb.toString());
    }

    /* JADX INFO: renamed from: G4 */
    public final boolean m10595G4(@NotNull List<BLiveMagicList> list) {
        Iterator<BLiveMagicList> it = list.iterator();
        while (it.hasNext()) {
            if (vwb.m(it.next().dynamicEffect, new w9j() { // from class: l.ps3
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveDynamicEffect) obj).hasDownloaded);
                }
            })) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H4 */
    public final C0200a m10596H4() {
        MagicGestureView magicGestureViewInflate = act().inflater().inflate(t6c0.f19567J3, (ViewGroup) null);
        magicGestureViewInflate.R(this.f8346A, this.f8347y, new ls3(this));
        final byr byrVar = new byr((wxs) this, (View) magicGestureViewInflate);
        byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ms3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bt3.m10577B4(dialogInterface);
            }
        });
        magicGestureViewInflate.c.setOnClickListener(new View.OnClickListener() { // from class: l.ns3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byrVar.dismiss();
            }
        });
        return byrVar;
    }

    /* JADX INFO: renamed from: I4 */
    public final void m10597I4(BLiveDynamicEffect bLiveDynamicEffect) {
        if (((idv) ypv.l(fld0.b)).f()) {
            return;
        }
        if (!TextUtils.equals(bLiveDynamicEffect.type, "4")) {
            ((bxl) m14184F3(new bu00(2500))).mo5261t0(bLiveDynamicEffect.typeName, bLiveDynamicEffect.modelPath);
            return;
        }
        ((bxl) m14184F3(new bu00(800))).mo5236G(1002);
        pph0 pph0VarB = qph0.a().b(act(), bLiveDynamicEffect.modelPath);
        if (pph0VarB != null) {
            ((bxl) m14184F3(new bu00(800))).mo5231B(1002, pph0VarB);
        }
    }

    /* JADX INFO: renamed from: J4 */
    public final void m10598J4(BLiveDynamicEffect bLiveDynamicEffect) {
        if (((idv) ypv.l(fld0.b)).f()) {
            return;
        }
        if (TextUtils.equals(bLiveDynamicEffect.type, "4")) {
            ((bxl) m14184F3(new bu00(800))).mo5236G(1002);
        } else {
            ((bxl) m14184F3(new bu00(2500))).mo5233D0(bLiveDynamicEffect.typeName);
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final List<BLiveMagicList> m10599K4(List<BLiveMagicList> list) {
        return vwb.n(list, new w9j() { // from class: l.os3
            public final Object call(Object obj) {
                return this.f16767a.m10604Q4((BLiveMagicList) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ c m10600M4(BLiveMagic bLiveMagic) {
        this.f8346A = bLiveMagic.title;
        List<BLiveMagicList> listM10606S4 = m10606S4(bLiveMagic.liveMagicLists);
        return vwb.J(listM10606S4) ? c.never() : c.just(listM10606S4);
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ c m10601N4(List list) {
        this.f8347y = m10599K4(list);
        hfw.a("magic_gesture", "liveMagicLists size:" + this.f8347y.size());
        return apw.m10010l(list);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ c m10602O4(roj0 roj0Var) {
        return ypv.j().k().take(1).filter(new w9j() { // from class: l.zs3
            public final Object call(Object obj) {
                BLiveMagic bLiveMagic = (BLiveMagic) obj;
                return Boolean.valueOf((bLiveMagic == null || vwb.J(bLiveMagic.liveMagicLists)) ? false : true);
            }
        }).flatMap(new w9j() { // from class: l.at3
            public final Object call(Object obj) {
                return apw.m10009k((BLiveMagic) obj);
            }
        }).flatMap(new w9j() { // from class: l.js3
            public final Object call(Object obj) {
                return this.f13998a.m10600M4((BLiveMagic) obj);
            }
        }).flatMap(new w9j() { // from class: l.ks3
            public final Object call(Object obj) {
                return this.f14494a.m10601N4((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m10603P4(final BLiveDynamicEffect bLiveDynamicEffect) {
        BLiveDynamicEffect bLiveDynamicEffect2;
        BLiveMagicList bLiveMagicList = (BLiveMagicList) vwb.r(this.f8347y, new w9j() { // from class: l.xs3
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMagicList) obj).typeName, bLiveDynamicEffect.typeName));
            }
        });
        if (bLiveMagicList == null || (bLiveDynamicEffect2 = (BLiveDynamicEffect) vwb.r(bLiveMagicList.dynamicEffect, new w9j() { // from class: l.ys3
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveDynamicEffect) obj).productID, bLiveDynamicEffect.productID));
            }
        })) == null) {
            return;
        }
        bLiveDynamicEffect2.copyOther(bLiveDynamicEffect);
        m10609U4(bLiveDynamicEffect);
        boolean zM10595G4 = m10595G4(this.f8347y);
        hfw.a("magic_gesture", "checkMagicList:" + zM10595G4);
        m10612W4(zM10595G4);
        m10608T4(this.f8347y);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ Boolean m10604Q4(BLiveMagicList bLiveMagicList) {
        return Boolean.valueOf(!bLiveMagicList.filterLiveMode.contains(m25547E2().m17234j().liveMode));
    }

    /* JADX INFO: renamed from: R4 */
    public final void m10605R4(BLiveDynamicEffect bLiveDynamicEffect, boolean z) {
        if (z) {
            m10597I4(bLiveDynamicEffect);
            lsi0.y(bLiveDynamicEffect.notice);
        } else {
            m10598J4(bLiveDynamicEffect);
        }
        HashSet hashSet = new HashSet();
        for (BLiveMagicList bLiveMagicList : this.f8347y) {
            if (!vwb.J(bLiveMagicList.dynamicEffect)) {
                for (BLiveDynamicEffect bLiveDynamicEffect2 : bLiveMagicList.dynamicEffect) {
                    if (bLiveDynamicEffect2.isSelected && !TextUtils.equals(bLiveDynamicEffect2.type, "4")) {
                        hashSet.add(bLiveDynamicEffect2.productID);
                    }
                }
            }
        }
        ((hdv) ypv.l(fld0.e)).a.put(hashSet);
    }

    @NotNull
    /* JADX INFO: renamed from: S4 */
    public final List<BLiveMagicList> m10606S4(@NotNull List<BLiveMagicList> list) {
        BLiveMagicList bLiveMagicList;
        boolean zJ = vwb.J(this.f8347y);
        ArrayList arrayList = new ArrayList();
        for (final BLiveMagicList bLiveMagicList2 : list) {
            if (vwb.J(bLiveMagicList2.dynamicEffect)) {
                arrayList.add(bLiveMagicList2);
            } else if (!zJ && (bLiveMagicList = (BLiveMagicList) vwb.r(this.f8347y, new w9j() { // from class: l.qs3
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveMagicList) obj).type, bLiveMagicList2.type));
                }
            })) != null) {
                for (final BLiveDynamicEffect bLiveDynamicEffect : bLiveMagicList2.dynamicEffect) {
                    BLiveDynamicEffect bLiveDynamicEffect2 = (BLiveDynamicEffect) vwb.r(bLiveMagicList.dynamicEffect, new w9j() { // from class: l.rs3
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals(((BLiveDynamicEffect) obj).productID, bLiveDynamicEffect.productID));
                        }
                    });
                    if (bLiveDynamicEffect2 != null) {
                        bLiveDynamicEffect.copyOther(bLiveDynamicEffect2);
                    }
                }
            }
        }
        list.removeAll(arrayList);
        return list;
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: T */
    public void mo10607T() {
        super.mo10607T();
        duringCreated((c) m25548F2().BottomEvent.showDialog().g()).filter(new w9j() { // from class: l.is3
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((BLiveButtonType) obj, "magicGesture"));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.ss3
            public final void call(Object obj) {
                this.f19259a.m10582L4((BLiveButtonType) obj);
            }
        }));
        duringCreated(((bxl) m14184F3(new bu00(2500))).mo5263v().take(1).flatMap(new w9j() { // from class: l.ts3
            public final Object call(Object obj) {
                return this.f20364a.m10602O4((roj0) obj);
            }
        })).filter(new w9j() { // from class: l.us3
            public final Object call(Object obj) {
                BLiveDynamicEffect bLiveDynamicEffect = (BLiveDynamicEffect) obj;
                return Boolean.valueOf(bLiveDynamicEffect != null && bLiveDynamicEffect.hasDownloaded);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.vs3
            public final void call(Object obj) {
                this.f21283a.m10603P4((BLiveDynamicEffect) obj);
            }
        }, new e30() { // from class: l.ws3
            public final void call(Object obj) {
                bt3.m10586r4((Throwable) obj);
            }
        }));
        ypv.j().z();
    }

    /* JADX INFO: renamed from: T4 */
    public void m10608T4(List<BLiveMagicList> list) {
        C0200a c0200a;
        if (vwb.J(list) || (c0200a = this.f8348z) == null) {
            return;
        }
        c0200a.m5128R().R(this.f8346A, list, new ls3(this));
    }

    /* JADX INFO: renamed from: U4 */
    public final void m10609U4(BLiveDynamicEffect bLiveDynamicEffect) {
        if (((Set) ((hdv) ypv.l(fld0.e)).a.get()).contains(bLiveDynamicEffect.productID)) {
            bLiveDynamicEffect.isSelected = true;
            m10597I4(bLiveDynamicEffect);
        }
    }

    @Override // p002l.i80, p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        super.mo10610V3(view);
        m25548F2().BottomEvent.showDialog().j(BLiveButtonType.get("magicGesture"));
    }

    /* JADX INFO: renamed from: V4 */
    public void m10611V4() {
        if (this.f8348z == null) {
            this.f8348z = m10596H4();
        }
        this.f8348z.show();
    }

    /* JADX INFO: renamed from: W4 */
    public void m10612W4(boolean z) {
        mo11811b4(z);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("magicGesture");
    }
}

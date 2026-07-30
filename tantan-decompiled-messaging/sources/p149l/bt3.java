package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveDynamicEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveMagic;
import com.p046p1.mobile.putong.live.base.data.BLiveMagicList;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.view.MagicGestureView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class bt3 extends mz0 {

    /* JADX INFO: renamed from: A */
    public String f77174A;

    /* JADX INFO: renamed from: y */
    public List<BLiveMagicList> f77175y;

    /* JADX INFO: renamed from: z */
    public DialogC12611a f77176z;

    public bt3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, 0, str2);
        this.f77175y = new ArrayList();
    }

    /* JADX INFO: renamed from: B4 */
    public static /* synthetic */ void m103772B4(DialogInterface dialogInterface) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public /* synthetic */ void m103777L4(BLiveButtonType bLiveButtonType) {
        m103805V4();
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m103781r4(Throwable th) {
        StringBuilder sb = new StringBuilder("magic_gesture error:");
        sb.append(th == null ? "no message" : th.getMessage());
        hfw.m130790a("magic_gesture", sb.toString());
    }

    /* JADX INFO: renamed from: G4 */
    public final boolean m103790G4(@NotNull List<BLiveMagicList> list) {
        Iterator<BLiveMagicList> it = list.iterator();
        while (it.hasNext()) {
            if (vwb.m200337m(it.next().dynamicEffect, new w9j() { // from class: l.ps3
                @Override // p149l.w9j
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
    public final DialogC12611a m103791H4() {
        MagicGestureView magicGestureView = (MagicGestureView) act().inflater().inflate(t6c0.f168071J3, (ViewGroup) null);
        magicGestureView.m76604R(this.f77174A, this.f77175y, new ls3(this));
        final byr byrVar = new byr(this, magicGestureView);
        byrVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ms3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bt3.m103772B4(dialogInterface);
            }
        });
        magicGestureView.f52063c.setOnClickListener(new View.OnClickListener() { // from class: l.ns3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byrVar.dismiss();
            }
        });
        return byrVar;
    }

    /* JADX INFO: renamed from: I4 */
    public final void m103792I4(BLiveDynamicEffect bLiveDynamicEffect) {
        if (((idv) ypv.m215673l(fld0.f98147b)).m135634f()) {
            return;
        }
        if (!TextUtils.equals(bLiveDynamicEffect.type, "4")) {
            ((bxl) m129297F3(new bu00(2500))).mo71883t0(bLiveDynamicEffect.typeName, bLiveDynamicEffect.modelPath);
            return;
        }
        ((bxl) m129297F3(new bu00(800))).mo71858G(1002);
        pph0 pph0VarM175842b = qph0.m175841a().m175842b(act(), bLiveDynamicEffect.modelPath);
        if (pph0VarM175842b != null) {
            ((bxl) m129297F3(new bu00(800))).mo71853B(1002, pph0VarM175842b);
        }
    }

    /* JADX INFO: renamed from: J4 */
    public final void m103793J4(BLiveDynamicEffect bLiveDynamicEffect) {
        if (((idv) ypv.m215673l(fld0.f98147b)).m135634f()) {
            return;
        }
        if (TextUtils.equals(bLiveDynamicEffect.type, "4")) {
            ((bxl) m129297F3(new bu00(800))).mo71858G(1002);
        } else {
            ((bxl) m129297F3(new bu00(2500))).mo71855D0(bLiveDynamicEffect.typeName);
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final List<BLiveMagicList> m103794K4(List<BLiveMagicList> list) {
        return vwb.m200339n(list, new w9j() { // from class: l.os3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f145373a.m103799Q4((BLiveMagicList) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ C22306c m103795M4(BLiveMagic bLiveMagic) {
        this.f77174A = bLiveMagic.title;
        List<BLiveMagicList> listM103801S4 = m103801S4(bLiveMagic.liveMagicLists);
        return vwb.m200296J(listM103801S4) ? C22306c.never() : C22306c.just(listM103801S4);
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ C22306c m103796N4(List list) {
        this.f77175y = m103794K4(list);
        hfw.m130790a("magic_gesture", "liveMagicLists size:" + this.f77175y.size());
        return apw.m98186l(list);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ C22306c m103797O4(roj0 roj0Var) {
        return ypv.m215671j().m121230k().take(1).filter(new w9j() { // from class: l.zs3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveMagic bLiveMagic = (BLiveMagic) obj;
                return Boolean.valueOf((bLiveMagic == null || vwb.m200296J(bLiveMagic.liveMagicLists)) ? false : true);
            }
        }).flatMap(new w9j() { // from class: l.at3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return apw.m98185k((BLiveMagic) obj);
            }
        }).flatMap(new w9j() { // from class: l.js3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f119474a.m103795M4((BLiveMagic) obj);
            }
        }).flatMap(new w9j() { // from class: l.ks3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f124416a.m103796N4((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m103798P4(final BLiveDynamicEffect bLiveDynamicEffect) {
        BLiveDynamicEffect bLiveDynamicEffect2;
        BLiveMagicList bLiveMagicList = (BLiveMagicList) vwb.m200346r(this.f77175y, new w9j() { // from class: l.xs3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMagicList) obj).typeName, bLiveDynamicEffect.typeName));
            }
        });
        if (bLiveMagicList == null || (bLiveDynamicEffect2 = (BLiveDynamicEffect) vwb.m200346r(bLiveMagicList.dynamicEffect, new w9j() { // from class: l.ys3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveDynamicEffect) obj).productID, bLiveDynamicEffect.productID));
            }
        })) == null) {
            return;
        }
        bLiveDynamicEffect2.copyOther(bLiveDynamicEffect);
        m103803U4(bLiveDynamicEffect);
        boolean zM103790G4 = m103790G4(this.f77175y);
        hfw.m130790a("magic_gesture", "checkMagicList:" + zM103790G4);
        m103806W4(zM103790G4);
        m103802T4(this.f77175y);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ Boolean m103799Q4(BLiveMagicList bLiveMagicList) {
        return Boolean.valueOf(!bLiveMagicList.filterLiveMode.contains(m206027E2().mo149813j().liveMode));
    }

    /* JADX INFO: renamed from: R4 */
    public final void m103800R4(BLiveDynamicEffect bLiveDynamicEffect, boolean z) {
        if (z) {
            m103792I4(bLiveDynamicEffect);
            lsi0.m151595y(bLiveDynamicEffect.notice);
        } else {
            m103793J4(bLiveDynamicEffect);
        }
        HashSet hashSet = new HashSet();
        for (BLiveMagicList bLiveMagicList : this.f77175y) {
            if (!vwb.m200296J(bLiveMagicList.dynamicEffect)) {
                for (BLiveDynamicEffect bLiveDynamicEffect2 : bLiveMagicList.dynamicEffect) {
                    if (bLiveDynamicEffect2.isSelected && !TextUtils.equals(bLiveDynamicEffect2.type, "4")) {
                        hashSet.add(bLiveDynamicEffect2.productID);
                    }
                }
            }
        }
        ((hdv) ypv.m215673l(fld0.f98150e)).f107295a.put(hashSet);
    }

    @NotNull
    /* JADX INFO: renamed from: S4 */
    public final List<BLiveMagicList> m103801S4(@NotNull List<BLiveMagicList> list) {
        BLiveMagicList bLiveMagicList;
        boolean zM200296J = vwb.m200296J(this.f77175y);
        ArrayList arrayList = new ArrayList();
        for (final BLiveMagicList bLiveMagicList2 : list) {
            if (vwb.m200296J(bLiveMagicList2.dynamicEffect)) {
                arrayList.add(bLiveMagicList2);
            } else if (!zM200296J && (bLiveMagicList = (BLiveMagicList) vwb.m200346r(this.f77175y, new w9j() { // from class: l.qs3
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveMagicList) obj).type, bLiveMagicList2.type));
                }
            })) != null) {
                for (final BLiveDynamicEffect bLiveDynamicEffect : bLiveMagicList2.dynamicEffect) {
                    BLiveDynamicEffect bLiveDynamicEffect2 = (BLiveDynamicEffect) vwb.m200346r(bLiveMagicList.dynamicEffect, new w9j() { // from class: l.rs3
                        @Override // p149l.w9j
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

    @Override // p149l.df2, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().BottomEvent.showDialog().m172460g()).filter(new w9j() { // from class: l.is3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((BLiveButtonType) obj, BLiveButtonType.magicGesture));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ss3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166157a.m103777L4((BLiveButtonType) obj);
            }
        }));
        duringCreated((C22306c) ((bxl) m129297F3(new bu00(2500))).mo71885v().take(1).flatMap(new w9j() { // from class: l.ts3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f171905a.m103797O4((roj0) obj);
            }
        })).filter(new w9j() { // from class: l.us3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveDynamicEffect bLiveDynamicEffect = (BLiveDynamicEffect) obj;
                return Boolean.valueOf(bLiveDynamicEffect != null && bLiveDynamicEffect.hasDownloaded);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.vs3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182796a.m103798P4((BLiveDynamicEffect) obj);
            }
        }, new e30() { // from class: l.ws3
            @Override // p149l.e30
            public final void call(Object obj) {
                bt3.m103781r4((Throwable) obj);
            }
        }));
        ypv.m215671j().m121236q();
    }

    /* JADX INFO: renamed from: T4 */
    public void m103802T4(List<BLiveMagicList> list) {
        DialogC12611a dialogC12611a;
        if (vwb.m200296J(list) || (dialogC12611a = this.f77176z) == null) {
            return;
        }
        ((MagicGestureView) dialogC12611a.m71760R()).m76604R(this.f77174A, list, new ls3(this));
    }

    /* JADX INFO: renamed from: U4 */
    public final void m103803U4(BLiveDynamicEffect bLiveDynamicEffect) {
        if (((hdv) ypv.m215673l(fld0.f98150e)).f107295a.get().contains(bLiveDynamicEffect.productID)) {
            bLiveDynamicEffect.isSelected = true;
            m103792I4(bLiveDynamicEffect);
        }
    }

    @Override // p149l.i80, p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        super.mo103804V3(view);
        m206028F2().BottomEvent.showDialog().mo172463j(BLiveButtonType.get(BLiveButtonType.magicGesture));
    }

    /* JADX INFO: renamed from: V4 */
    public void m103805V4() {
        if (this.f77176z == null) {
            this.f77176z = m103791H4();
        }
        this.f77176z.show();
    }

    /* JADX INFO: renamed from: W4 */
    public void m103806W4(boolean z) {
        mo111419b4(z);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get(BLiveButtonType.magicGesture);
    }
}

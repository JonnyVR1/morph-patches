package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveDynamicEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveMagic;
import com.p051p1.mobile.putong.live.base.data.BLiveMagicList;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.view.MagicGestureView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class au3 extends tz0 {

    /* JADX INFO: renamed from: A */
    public String f73464A;

    /* JADX INFO: renamed from: y */
    public List<BLiveMagicList> f73465y;

    /* JADX INFO: renamed from: z */
    public DialogC12774a f73466z;

    public au3(dum dumVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(dumVar, bLiveBottomButton, i, i2, str, 0, str2);
        this.f73465y = new ArrayList();
    }

    /* JADX INFO: renamed from: B4 */
    public static /* synthetic */ void m100319B4(DialogInterface dialogInterface) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public /* synthetic */ void m100324L4(BLiveButtonType bLiveButtonType) {
        m100351V4();
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m100328r4(Throwable th) {
        StringBuilder sb = new StringBuilder("magic_gesture error:");
        sb.append(th == null ? "no message" : th.getMessage());
        fhw.m125605a("magic_gesture", sb.toString());
    }

    /* JADX INFO: renamed from: G4 */
    public final boolean m100337G4(@NotNull List<BLiveMagicList> list) {
        Iterator<BLiveMagicList> it = list.iterator();
        while (it.hasNext()) {
            if (jyb.m147520m(it.next().dynamicEffect, new qcj() { // from class: l.ot3
                @Override // p153l.qcj
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
    public final DialogC12774a m100338H4() {
        MagicGestureView magicGestureView = (MagicGestureView) act().inflater().inflate(yec0.f198803J3, (ViewGroup) null);
        magicGestureView.m77787R(this.f73464A, this.f73465y, new kt3(this));
        final c0s c0sVar = new c0s(this, magicGestureView);
        c0sVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.lt3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                au3.m100319B4(dialogInterface);
            }
        });
        magicGestureView.f52911c.setOnClickListener(new View.OnClickListener() { // from class: l.mt3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0sVar.dismiss();
            }
        });
        return c0sVar;
    }

    /* JADX INFO: renamed from: I4 */
    public final void m100339I4(BLiveDynamicEffect bLiveDynamicEffect) {
        if (((jfv) zrv.m221194l(htd0.f111520b)).m144719f()) {
            return;
        }
        if (!TextUtils.equals(bLiveDynamicEffect.type, "4")) {
            ((uzl) m138856F3(new k210(2500))).mo73066t0(bLiveDynamicEffect.typeName, bLiveDynamicEffect.modelPath);
            return;
        }
        ((uzl) m138856F3(new k210(800))).mo73041G(1002);
        wxh0 wxh0VarM213525b = xxh0.m213524a().m213525b(act(), bLiveDynamicEffect.modelPath);
        if (wxh0VarM213525b != null) {
            ((uzl) m138856F3(new k210(800))).mo73036B(1002, wxh0VarM213525b);
        }
    }

    /* JADX INFO: renamed from: J4 */
    public final void m100340J4(BLiveDynamicEffect bLiveDynamicEffect) {
        if (((jfv) zrv.m221194l(htd0.f111520b)).m144719f()) {
            return;
        }
        if (TextUtils.equals(bLiveDynamicEffect.type, "4")) {
            ((uzl) m138856F3(new k210(800))).mo73041G(1002);
        } else {
            ((uzl) m138856F3(new k210(2500))).mo73038D0(bLiveDynamicEffect.typeName);
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final List<BLiveMagicList> m100341K4(List<BLiveMagicList> list) {
        return jyb.m147522n(list, new qcj() { // from class: l.nt3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f143576a.m100346Q4((BLiveMagicList) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ C22421c m100342M4(BLiveMagic bLiveMagic) {
        this.f73464A = bLiveMagic.title;
        List<BLiveMagicList> listM100348S4 = m100348S4(bLiveMagic.liveMagicLists);
        return jyb.m147479J(listM100348S4) ? C22421c.never() : C22421c.just(listM100348S4);
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ C22421c m100343N4(List list) {
        this.f73465y = m100341K4(list);
        fhw.m125605a("magic_gesture", "liveMagicLists size:" + this.f73465y.size());
        return zrw.m221219l(list);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ C22421c m100344O4(uxj0 uxj0Var) {
        return zrv.m221192j().m159274k().take(1).filter(new qcj() { // from class: l.yt3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveMagic bLiveMagic = (BLiveMagic) obj;
                return Boolean.valueOf((bLiveMagic == null || jyb.m147479J(bLiveMagic.liveMagicLists)) ? false : true);
            }
        }).flatMap(new qcj() { // from class: l.zt3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zrw.m221218k((BLiveMagic) obj);
            }
        }).flatMap(new qcj() { // from class: l.it3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f116787a.m100342M4((BLiveMagic) obj);
            }
        }).flatMap(new qcj() { // from class: l.jt3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f122550a.m100343N4((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m100345P4(final BLiveDynamicEffect bLiveDynamicEffect) {
        BLiveDynamicEffect bLiveDynamicEffect2;
        BLiveMagicList bLiveMagicList = (BLiveMagicList) jyb.m147529r(this.f73465y, new qcj() { // from class: l.wt3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveMagicList) obj).typeName, bLiveDynamicEffect.typeName));
            }
        });
        if (bLiveMagicList == null || (bLiveDynamicEffect2 = (BLiveDynamicEffect) jyb.m147529r(bLiveMagicList.dynamicEffect, new qcj() { // from class: l.xt3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveDynamicEffect) obj).productID, bLiveDynamicEffect.productID));
            }
        })) == null) {
            return;
        }
        bLiveDynamicEffect2.copyOther(bLiveDynamicEffect);
        m100350U4(bLiveDynamicEffect);
        boolean zM100337G4 = m100337G4(this.f73465y);
        fhw.m125605a("magic_gesture", "checkMagicList:" + zM100337G4);
        m100352W4(zM100337G4);
        m100349T4(this.f73465y);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ Boolean m100346Q4(BLiveMagicList bLiveMagicList) {
        return Boolean.valueOf(!bLiveMagicList.filterLiveMode.contains(m213810E2().mo183435j().liveMode));
    }

    /* JADX INFO: renamed from: R4 */
    public final void m100347R4(BLiveDynamicEffect bLiveDynamicEffect, boolean z) {
        if (z) {
            m100339I4(bLiveDynamicEffect);
            o1j0.m165651y(bLiveDynamicEffect.notice);
        } else {
            m100340J4(bLiveDynamicEffect);
        }
        HashSet hashSet = new HashSet();
        for (BLiveMagicList bLiveMagicList : this.f73465y) {
            if (!jyb.m147479J(bLiveMagicList.dynamicEffect)) {
                for (BLiveDynamicEffect bLiveDynamicEffect2 : bLiveMagicList.dynamicEffect) {
                    if (bLiveDynamicEffect2.isSelected && !TextUtils.equals(bLiveDynamicEffect2.type, "4")) {
                        hashSet.add(bLiveDynamicEffect2.productID);
                    }
                }
            }
        }
        ((ifv) zrv.m221194l(htd0.f111523e)).f114692a.put(hashSet);
    }

    @NotNull
    /* JADX INFO: renamed from: S4 */
    public final List<BLiveMagicList> m100348S4(@NotNull List<BLiveMagicList> list) {
        BLiveMagicList bLiveMagicList;
        boolean zM147479J = jyb.m147479J(this.f73465y);
        ArrayList arrayList = new ArrayList();
        for (final BLiveMagicList bLiveMagicList2 : list) {
            if (jyb.m147479J(bLiveMagicList2.dynamicEffect)) {
                arrayList.add(bLiveMagicList2);
            } else if (!zM147479J && (bLiveMagicList = (BLiveMagicList) jyb.m147529r(this.f73465y, new qcj() { // from class: l.pt3
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveMagicList) obj).type, bLiveMagicList2.type));
                }
            })) != null) {
                for (final BLiveDynamicEffect bLiveDynamicEffect : bLiveMagicList2.dynamicEffect) {
                    BLiveDynamicEffect bLiveDynamicEffect2 = (BLiveDynamicEffect) jyb.m147529r(bLiveMagicList.dynamicEffect, new qcj() { // from class: l.qt3
                        @Override // p153l.qcj
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

    @Override // p153l.kf2, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().BottomEvent.showDialog().m199270g()).filter(new qcj() { // from class: l.ht3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((BLiveButtonType) obj, BLiveButtonType.magicGesture));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.rt3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164765a.m100324L4((BLiveButtonType) obj);
            }
        }));
        duringCreated((C22421c) ((uzl) m138856F3(new k210(2500))).mo73068v().take(1).flatMap(new qcj() { // from class: l.st3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f170543a.m100344O4((uxj0) obj);
            }
        })).filter(new qcj() { // from class: l.tt3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveDynamicEffect bLiveDynamicEffect = (BLiveDynamicEffect) obj;
                return Boolean.valueOf(bLiveDynamicEffect != null && bLiveDynamicEffect.hasDownloaded);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.ut3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180888a.m100345P4((BLiveDynamicEffect) obj);
            }
        }, new y20() { // from class: l.vt3
            @Override // p153l.y20
            public final void call(Object obj) {
                au3.m100328r4((Throwable) obj);
            }
        }));
        zrv.m221192j().m159280q();
    }

    /* JADX INFO: renamed from: T4 */
    public void m100349T4(List<BLiveMagicList> list) {
        DialogC12774a dialogC12774a;
        if (jyb.m147479J(list) || (dialogC12774a = this.f73466z) == null) {
            return;
        }
        ((MagicGestureView) dialogC12774a.m72943R()).m77787R(this.f73464A, list, new kt3(this));
    }

    /* JADX INFO: renamed from: U4 */
    public final void m100350U4(BLiveDynamicEffect bLiveDynamicEffect) {
        if (((ifv) zrv.m221194l(htd0.f111523e)).f114692a.get().contains(bLiveDynamicEffect.productID)) {
            bLiveDynamicEffect.isSelected = true;
            m100339I4(bLiveDynamicEffect);
        }
    }

    @Override // p153l.e80, p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        super.mo96798V3(view);
        m213811F2().BottomEvent.showDialog().mo199273j(BLiveButtonType.get(BLiveButtonType.magicGesture));
    }

    /* JADX INFO: renamed from: V4 */
    public void m100351V4() {
        if (this.f73466z == null) {
            this.f73466z = m100338H4();
        }
        this.f73466z.show();
    }

    /* JADX INFO: renamed from: W4 */
    public void m100352W4(boolean z) {
        mo119794b4(z);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get(BLiveButtonType.magicGesture);
    }
}

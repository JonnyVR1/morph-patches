package com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import p153l.aks;
import p153l.ere;
import p153l.htd0;
import p153l.iam;
import p153l.jfv;
import p153l.mdc0;
import p153l.muj;
import p153l.nks;
import p153l.oks;
import p153l.pks;
import p153l.rre;
import p153l.uks;
import p153l.vxr;
import p153l.xks;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftLayer extends FrameLayout implements iam<aks> {

    /* JADX INFO: renamed from: a */
    public aks f50500a;

    /* JADX INFO: renamed from: b */
    public final pks f50501b;

    /* JADX INFO: renamed from: c */
    public final uks f50502c;

    /* JADX INFO: renamed from: d */
    public final nks f50503d;

    /* JADX INFO: renamed from: e */
    public final oks f50504e;

    /* JADX INFO: renamed from: f */
    public final xks f50505f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f50506g;

    /* JADX INFO: renamed from: h */
    public LiveGiftExtLayer f50507h;

    public LiveGiftLayer(@NonNull Context context) {
        super(context);
        this.f50501b = new pks();
        this.f50502c = new uks();
        this.f50503d = new nks();
        this.f50504e = new oks();
        this.f50505f = new xks();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(aks aksVar) {
        this.f50500a = aksVar;
    }

    /* JADX INFO: renamed from: b */
    public void m74810b(GiftTrayData giftTrayData) {
        muj.m160164G(giftTrayData);
        boolean zM213815L2 = this.f50500a.m213815L2();
        this.f50500a.m213814K2().m189704k(false);
        if (((jfv) zrv.m221194l(htd0.f111520b)).m144719f()) {
            muj.m160220v(giftTrayData);
            rre.m182746r(giftTrayData, zM213815L2);
            return;
        }
        String str = giftTrayData.f50967y;
        BLiveEffect bLiveEffectM122151h = ere.m122146i().m122151h(str);
        boolean zM98620N3 = this.f50500a.m98620N3(bLiveEffectM122151h, giftTrayData, zM213815L2);
        rre.m182725E(zM213815L2, str, !zM98620N3);
        if (!zM98620N3) {
            if (vxr.m203876d().m170973E1()) {
                this.f50504e.m168048d(this.f50506g, this.f50507h, "https://auto.tancdn.com/v1/raw/719775d5-33be-45b7-9d72-3eb7f6dffe9610.so", giftTrayData, zM213815L2);
                return;
            } else {
                this.f50501b.m172759f(this, this.f50507h, giftTrayData, zM213815L2);
                return;
            }
        }
        if (giftTrayData.m75348r()) {
            this.f50503d.m163667c(this.f50506g, giftTrayData.f50925G);
            return;
        }
        if (vxr.m203876d().m170973E1() && ("svga".equals(bLiveEffectM122151h.type) || "video".equals(bLiveEffectM122151h.type))) {
            this.f50505f.m211413f(this.f50506g, this.f50507h, bLiveEffectM122151h, giftTrayData, zM213815L2);
            return;
        }
        if ("svga".equals(bLiveEffectM122151h.type)) {
            this.f50501b.m172758e(this.f50506g, this.f50507h, bLiveEffectM122151h, giftTrayData, zM213815L2);
        } else if ("video".equals(bLiveEffectM122151h.type)) {
            this.f50502c.m196524k(this.f50506g, this.f50507h, bLiveEffectM122151h, giftTrayData, zM213815L2);
        } else if ("game".equals(bLiveEffectM122151h.type)) {
            this.f50500a.m98623R3(bLiveEffectM122151h, giftTrayData);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m74811c() {
    }

    @Override // p153l.iam
    public void destroy() {
        this.f50502c.m196520g();
        this.f50501b.m172757d();
        this.f50503d.m163666b();
        this.f50504e.m168046b();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f50506g = (FrameLayout) findViewById(mdc0.f135915D4);
        this.f50507h = (LiveGiftExtLayer) findViewById(mdc0.f136346y1);
    }

    public LiveGiftLayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50501b = new pks();
        this.f50502c = new uks();
        this.f50503d = new nks();
        this.f50504e = new oks();
        this.f50505f = new xks();
    }

    public LiveGiftLayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50501b = new pks();
        this.f50502c = new uks();
        this.f50503d = new nks();
        this.f50504e = new oks();
        this.f50505f = new xks();
    }
}

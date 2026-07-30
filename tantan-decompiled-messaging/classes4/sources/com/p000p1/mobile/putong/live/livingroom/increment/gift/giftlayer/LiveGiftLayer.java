package com.p000p1.mobile.putong.live.livingroom.increment.gift.giftlayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import l.fld0;
import l.idv;
import l.s7m;
import l.uvr;
import l.ypv;
import p002l.aqe;
import p002l.g5c0;
import p002l.mis;
import p002l.nis;
import p002l.nqe;
import p002l.ois;
import p002l.tis;
import p002l.wis;
import p002l.wrj;
import p002l.zhs;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGiftLayer extends FrameLayout implements s7m<zhs> {

    /* JADX INFO: renamed from: a */
    public zhs f5694a;

    /* JADX INFO: renamed from: b */
    public final ois f5695b;

    /* JADX INFO: renamed from: c */
    public final tis f5696c;

    /* JADX INFO: renamed from: d */
    public final mis f5697d;

    /* JADX INFO: renamed from: e */
    public final nis f5698e;

    /* JADX INFO: renamed from: f */
    public final wis f5699f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f5700g;

    /* JADX INFO: renamed from: h */
    public LiveGiftExtLayer f5701h;

    public LiveGiftLayer(@NonNull Context context) {
        super(context);
        this.f5695b = new ois();
        this.f5696c = new tis();
        this.f5697d = new mis();
        this.f5698e = new nis();
        this.f5699f = new wis();
    }

    /* JADX INFO: renamed from: C0 */
    public Context m7172C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m7176i1(zhs zhsVar) {
        this.f5694a = zhsVar;
    }

    /* JADX INFO: renamed from: b */
    public void m7174b(GiftTrayData giftTrayData) {
        wrj.m25372G(giftTrayData);
        boolean zM25552L2 = this.f5694a.m25552L2();
        this.f5694a.m25551K2().m22223k(false);
        if (((idv) ypv.l(fld0.b)).f()) {
            wrj.m25428v(giftTrayData);
            nqe.m18963r(giftTrayData, zM25552L2);
            return;
        }
        String str = giftTrayData.f6161y;
        BLiveEffect bLiveEffectM10044h = aqe.m10039i().m10044h(str);
        boolean zM27384N3 = this.f5694a.m27384N3(bLiveEffectM10044h, giftTrayData, zM25552L2);
        nqe.m18942E(zM25552L2, str, !zM27384N3);
        if (!zM27384N3) {
            if (uvr.d().E1()) {
                this.f5698e.m18802d(this.f5700g, this.f5701h, "https://auto.tancdn.com/v1/raw/719775d5-33be-45b7-9d72-3eb7f6dffe9610.so", giftTrayData, zM25552L2);
                return;
            } else {
                this.f5695b.m19557f(this, this.f5701h, giftTrayData, zM25552L2);
                return;
            }
        }
        if (giftTrayData.m7730r()) {
            this.f5697d.m17967c(this.f5700g, giftTrayData.f6119G);
            return;
        }
        if (uvr.d().E1() && ("svga".equals(bLiveEffectM10044h.type) || "video".equals(bLiveEffectM10044h.type))) {
            this.f5699f.m24672f(this.f5700g, this.f5701h, bLiveEffectM10044h, giftTrayData, zM25552L2);
            return;
        }
        if ("svga".equals(bLiveEffectM10044h.type)) {
            this.f5695b.m19556e(this.f5700g, this.f5701h, bLiveEffectM10044h, giftTrayData, zM25552L2);
        } else if ("video".equals(bLiveEffectM10044h.type)) {
            this.f5696c.m22974k(this.f5700g, this.f5701h, bLiveEffectM10044h, giftTrayData, zM25552L2);
        } else if ("game".equals(bLiveEffectM10044h.type)) {
            this.f5694a.m27387R3(bLiveEffectM10044h, giftTrayData);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7175c() {
    }

    public void destroy() {
        this.f5696c.m22970g();
        this.f5695b.m19555d();
        this.f5697d.m17966b();
        this.f5698e.m18800b();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f5700g = (FrameLayout) findViewById(g5c0.f10820D4);
        this.f5701h = (LiveGiftExtLayer) findViewById(g5c0.f11251y1);
    }

    public LiveGiftLayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5695b = new ois();
        this.f5696c = new tis();
        this.f5697d = new mis();
        this.f5698e = new nis();
        this.f5699f = new wis();
    }

    public LiveGiftLayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5695b = new ois();
        this.f5696c = new tis();
        this.f5697d = new mis();
        this.f5698e = new nis();
        this.f5699f = new wis();
    }
}

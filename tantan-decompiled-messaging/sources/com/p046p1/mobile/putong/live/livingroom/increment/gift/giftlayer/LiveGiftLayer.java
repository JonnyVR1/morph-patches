package com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import p149l.aqe;
import p149l.fld0;
import p149l.g5c0;
import p149l.idv;
import p149l.mis;
import p149l.nis;
import p149l.nqe;
import p149l.ois;
import p149l.s7m;
import p149l.tis;
import p149l.uvr;
import p149l.wis;
import p149l.wrj;
import p149l.ypv;
import p149l.zhs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftLayer extends FrameLayout implements s7m<zhs> {

    /* JADX INFO: renamed from: a */
    public zhs f49652a;

    /* JADX INFO: renamed from: b */
    public final ois f49653b;

    /* JADX INFO: renamed from: c */
    public final tis f49654c;

    /* JADX INFO: renamed from: d */
    public final mis f49655d;

    /* JADX INFO: renamed from: e */
    public final nis f49656e;

    /* JADX INFO: renamed from: f */
    public final wis f49657f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f49658g;

    /* JADX INFO: renamed from: h */
    public LiveGiftExtLayer f49659h;

    public LiveGiftLayer(@NonNull Context context) {
        super(context);
        this.f49653b = new ois();
        this.f49654c = new tis();
        this.f49655d = new mis();
        this.f49656e = new nis();
        this.f49657f = new wis();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zhs zhsVar) {
        this.f49652a = zhsVar;
    }

    /* JADX INFO: renamed from: b */
    public void m73627b(GiftTrayData giftTrayData) {
        wrj.m205200G(giftTrayData);
        boolean zM206032L2 = this.f49652a.m206032L2();
        this.f49652a.m206031K2().m182468k(false);
        if (((idv) ypv.m215673l(fld0.f98147b)).m135634f()) {
            wrj.m205256v(giftTrayData);
            nqe.m160612r(giftTrayData, zM206032L2);
            return;
        }
        String str = giftTrayData.f50119y;
        BLiveEffect bLiveEffectM98266h = aqe.m98261i().m98266h(str);
        boolean zM218860N3 = this.f49652a.m218860N3(bLiveEffectM98266h, giftTrayData, zM206032L2);
        nqe.m160591E(zM206032L2, str, !zM218860N3);
        if (!zM218860N3) {
            if (uvr.m196087d().m162666E1()) {
                this.f49656e.m159557d(this.f49658g, this.f49659h, "https://auto.tancdn.com/v1/raw/719775d5-33be-45b7-9d72-3eb7f6dffe9610.so", giftTrayData, zM206032L2);
                return;
            } else {
                this.f49653b.m164561f(this, this.f49659h, giftTrayData, zM206032L2);
                return;
            }
        }
        if (giftTrayData.m74165r()) {
            this.f49655d.m154753c(this.f49658g, giftTrayData.f50077G);
            return;
        }
        if (uvr.m196087d().m162666E1() && ("svga".equals(bLiveEffectM98266h.type) || "video".equals(bLiveEffectM98266h.type))) {
            this.f49657f.m203353f(this.f49658g, this.f49659h, bLiveEffectM98266h, giftTrayData, zM206032L2);
            return;
        }
        if ("svga".equals(bLiveEffectM98266h.type)) {
            this.f49653b.m164560e(this.f49658g, this.f49659h, bLiveEffectM98266h, giftTrayData, zM206032L2);
        } else if ("video".equals(bLiveEffectM98266h.type)) {
            this.f49654c.m189229k(this.f49658g, this.f49659h, bLiveEffectM98266h, giftTrayData, zM206032L2);
        } else if ("game".equals(bLiveEffectM98266h.type)) {
            this.f49652a.m218863R3(bLiveEffectM98266h, giftTrayData);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m73628c() {
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f49654c.m189225g();
        this.f49653b.m164559d();
        this.f49655d.m154752b();
        this.f49656e.m159555b();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f49658g = (FrameLayout) findViewById(g5c0.f100670D4);
        this.f49659h = (LiveGiftExtLayer) findViewById(g5c0.f101101y1);
    }

    public LiveGiftLayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49653b = new ois();
        this.f49654c = new tis();
        this.f49655d = new mis();
        this.f49656e = new nis();
        this.f49657f = new wis();
    }

    public LiveGiftLayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49653b = new ois();
        this.f49654c = new tis();
        this.f49655d = new mis();
        this.f49656e = new nis();
        this.f49657f = new wis();
    }
}

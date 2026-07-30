package com.p000p1.mobile.putong.live.livingroom.increment.gift.game;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.JsonObject;
import com.momo.xeengine.script.ScriptBridge;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import l.s7m;
import l.xdl0;
import p002l.ees;
import p002l.iij;
import p002l.oij;
import p002l.spe;
import p002l.vhj;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GameEffectView extends FrameLayout implements s7m<ees> {

    /* JADX INFO: renamed from: a */
    public C0392a f5665a;

    /* JADX INFO: renamed from: b */
    public C0392a.c f5666b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0387c f5667c;

    /* JADX INFO: renamed from: d */
    public GiftTrayData f5668d;

    /* JADX INFO: renamed from: e */
    public ees f5669e;

    /* JADX INFO: renamed from: f */
    public final Runnable f5670f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView$a */
    public class C0385a implements C0392a.c {
        public C0385a() {
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.C0392a.c
        /* JADX INFO: renamed from: a */
        public void mo7134a(String str, ScriptBridge.Callback callback) {
            if (GameEffectView.this.f5667c != null) {
                GameEffectView.this.f5667c.mo7140a(str, callback);
            }
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.C0392a.c
        /* JADX INFO: renamed from: b */
        public void mo7135b(String str) {
            iij.m15193o("游戏开启错误，错误原因：" + str);
            iij.m15189k(str, GameEffectView.this.f5668d);
            if (GameEffectView.this.f5667c != null) {
                GameEffectView.this.f5667c.mo7141b(str);
            }
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.C0392a.c
        /* JADX INFO: renamed from: c */
        public void mo7136c() {
            iij.m15188j(GameEffectView.this.f5668d);
            if (GameEffectView.this.f5667c != null) {
                GameEffectView.this.f5667c.mo7143d();
            }
            GameEffectView.this.m7120x("onRemoveGame");
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.C0392a.c
        /* JADX INFO: renamed from: d */
        public void mo7137d(View view) {
            GameEffectView.this.m7125l(view);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.C0392a.c
        /* JADX INFO: renamed from: e */
        public void mo7138e() {
            if (GameEffectView.this.f5667c != null) {
                GameEffectView.this.f5667c.mo7142c();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView$b */
    public class C0386b implements InterfaceC0387c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f5672a;

        public C0386b(GiftTrayData giftTrayData) {
            this.f5672a = giftTrayData;
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView.InterfaceC0387c
        /* JADX INFO: renamed from: a */
        public void mo7140a(String str, ScriptBridge.Callback callback) {
            iij.m15190l(str);
            if (GameEffectView.this.f5669e != null) {
                GameEffectView.this.f5669e.m12445V3(this.f5672a, str, callback);
            }
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView.InterfaceC0387c
        /* JADX INFO: renamed from: b */
        public void mo7141b(String str) {
            GameEffectView.this.setGameEffectStatusShow(false);
            GameEffectView.this.f5669e.m14183E3(GameEffectView.this.f5670f);
            boolean zM19549d = oij.m19549d();
            GameEffectView gameEffectView = GameEffectView.this;
            if (!zM19549d) {
                gameEffectView.m7119v(this.f5672a.f6161y);
            } else if (gameEffectView.f5669e != null) {
                ees eesVar = GameEffectView.this.f5669e;
                final GiftTrayData giftTrayData = this.f5672a;
                eesVar.m14207z3(4000L, new Runnable() { // from class: l.xhj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22284a.m7144f(giftTrayData);
                    }
                });
            }
            GameEffectView.this.m7121A("onGamePrepareFailed");
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView.InterfaceC0387c
        /* JADX INFO: renamed from: c */
        public void mo7142c() {
            iij.m15183e(this.f5672a);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView.InterfaceC0387c
        /* JADX INFO: renamed from: d */
        public void mo7143d() {
            GameEffectView.this.setGameEffectStatusShow(false);
            GameEffectView.this.f5669e.m14183E3(GameEffectView.this.f5670f);
            GameEffectView.this.m7119v(this.f5672a.f6161y);
            iij.m15182d(this.f5672a);
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m7144f(GiftTrayData giftTrayData) {
            GameEffectView.this.m7119v(giftTrayData.f6161y);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView$c */
    public interface InterfaceC0387c {
        /* JADX INFO: renamed from: a */
        void mo7140a(String str, ScriptBridge.Callback callback);

        /* JADX INFO: renamed from: b */
        void mo7141b(String str);

        /* JADX INFO: renamed from: c */
        void mo7142c();

        /* JADX INFO: renamed from: d */
        void mo7143d();
    }

    public GameEffectView(@NonNull Context context) {
        super(context);
        this.f5670f = new Runnable() { // from class: l.whj
            @Override // java.lang.Runnable
            public final void run() {
                this.f21783a.m7118s();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m7118s() {
        iij.m15185g();
        if (m7129q()) {
            setGameEffectStatusShow(false);
            m7121A("tryToStopGameEffectRunnable");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m7119v(String str) {
        ees eesVar = this.f5669e;
        if (eesVar != null) {
            eesVar.m12444U3(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* JADX INFO: renamed from: x */
    public void m7120x(String str) {
        if (getContext() != null) {
            iij.m15184f(str);
            xdl0.M(this, false);
            removeAllViews();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m7121A(String str) {
        iij.m15192n(str);
        m7120x("stopEngineGame");
        C0392a c0392a = this.f5665a;
        if (c0392a != null) {
            c0392a.m7161o();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7122C0() {
        return getContext();
    }

    public void destroy() {
        this.f5669e.m14183E3(this.f5670f);
        m7121A("onDestroy");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f5668d.m7738z()) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public String getEffectId() {
        GiftTrayData giftTrayData = this.f5668d;
        return giftTrayData != null ? giftTrayData.f6161y : "";
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m7123i1(ees eesVar) {
        this.f5669e = eesVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m7125l(View view) {
        removeAllViews();
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        iij.m15179a();
    }

    /* JADX INFO: renamed from: m */
    public final void m7126m() {
        this.f5666b = new C0385a();
    }

    /* JADX INFO: renamed from: n */
    public final String m7127n(GiftTrayData giftTrayData) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("effectId", giftTrayData.f6161y);
        jsonObject.addProperty("tantanId", giftTrayData.f6114B);
        jsonObject.addProperty("productId", Integer.valueOf(giftTrayData.f6141e));
        jsonObject.addProperty("roomId", giftTrayData.f6117E);
        jsonObject.addProperty("showId", giftTrayData.f6144h);
        jsonObject.addProperty("tradeNo", giftTrayData.f6154r);
        return jsonObject.toString();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f5668d.m7738z()) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f5668d.m7738z()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final String m7128p(GiftTrayData giftTrayData) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("nickname", giftTrayData.f6113A);
        jsonObject.addProperty("roomId", giftTrayData.f6117E);
        jsonObject.addProperty("tantanId", giftTrayData.f6114B);
        jsonObject.addProperty("avatarUrl", giftTrayData.f6162z);
        return jsonObject.toString();
    }

    /* JADX INFO: renamed from: q */
    public boolean m7129q() {
        C0392a c0392a = this.f5665a;
        if (c0392a != null) {
            return c0392a.m7155i();
        }
        return false;
    }

    public void setGameEffectStatusShow(boolean z) {
        ees eesVar = this.f5669e;
        if (eesVar != null) {
            eesVar.m25551K2().m22223k(z);
        }
    }

    public void setGameEffectViewListener(InterfaceC0387c interfaceC0387c) {
        this.f5667c = interfaceC0387c;
    }

    /* JADX INFO: renamed from: u */
    public void m7130u() {
        setGameEffectStatusShow(false);
        this.f5669e.m14183E3(this.f5670f);
        m7121A("onPause");
        m7119v(getEffectId());
    }

    /* JADX INFO: renamed from: w */
    public final void m7131w() {
        this.f5666b = null;
        C0392a c0392a = this.f5665a;
        if (c0392a != null) {
            c0392a.m7153g();
            this.f5665a = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m7132y(GiftTrayData giftTrayData, String str, boolean z) {
        m7131w();
        xdl0.M(this, true);
        this.f5668d = giftTrayData;
        removeAllViews();
        m7126m();
        C0392a c0392a = new C0392a(this.f5666b, m7128p(giftTrayData), m7127n(giftTrayData), giftTrayData.f6155s, str, giftTrayData.m7738z(), z);
        this.f5665a = c0392a;
        c0392a.m7157k(getContext());
    }

    /* JADX INFO: renamed from: z */
    public void m7133z(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        iij.m15187i(giftTrayData);
        this.f5669e.m14183E3(this.f5670f);
        setGameEffectViewListener(new C0386b(giftTrayData));
        m7132y(giftTrayData, ((vhj) spe.m22604d("game")).mo11105b(bLiveEffect), z);
        if (giftTrayData.m7738z()) {
            setGameEffectStatusShow(true);
        }
        iij.m15186h();
        ees eesVar = this.f5669e;
        if (eesVar != null) {
            eesVar.m14207z3(giftTrayData.f6145i, this.f5670f);
        }
    }

    public GameEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5670f = new Runnable() { // from class: l.whj
            @Override // java.lang.Runnable
            public final void run() {
                this.f21783a.m7118s();
            }
        };
    }

    public GameEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5670f = new Runnable() { // from class: l.whj
            @Override // java.lang.Runnable
            public final void run() {
                this.f21783a.m7118s();
            }
        };
    }

    public GameEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5670f = new Runnable() { // from class: l.whj
            @Override // java.lang.Runnable
            public final void run() {
                this.f21783a.m7118s();
            }
        };
    }
}

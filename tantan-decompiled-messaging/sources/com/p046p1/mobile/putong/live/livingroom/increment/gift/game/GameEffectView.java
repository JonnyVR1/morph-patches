package com.p046p1.mobile.putong.live.livingroom.increment.gift.game;

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
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import p149l.ees;
import p149l.iij;
import p149l.oij;
import p149l.s7m;
import p149l.spe;
import p149l.vhj;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class GameEffectView extends FrameLayout implements s7m<ees> {

    /* JADX INFO: renamed from: a */
    public C12803a f49623a;

    /* JADX INFO: renamed from: b */
    public C12803a.c f49624b;

    /* JADX INFO: renamed from: c */
    public InterfaceC12798c f49625c;

    /* JADX INFO: renamed from: d */
    public GiftTrayData f49626d;

    /* JADX INFO: renamed from: e */
    public ees f49627e;

    /* JADX INFO: renamed from: f */
    public final Runnable f49628f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView$a */
    public class C12796a implements C12803a.c {
        public C12796a() {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.C12803a.c
        /* JADX INFO: renamed from: a */
        public void mo73588a(String str, ScriptBridge.Callback callback) {
            if (GameEffectView.this.f49625c != null) {
                GameEffectView.this.f49625c.mo73594a(str, callback);
            }
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.C12803a.c
        /* JADX INFO: renamed from: b */
        public void mo73589b(String str) {
            iij.m136421o("游戏开启错误，错误原因：" + str);
            iij.m136417k(str, GameEffectView.this.f49626d);
            if (GameEffectView.this.f49625c != null) {
                GameEffectView.this.f49625c.mo73595b(str);
            }
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.C12803a.c
        /* JADX INFO: renamed from: c */
        public void mo73590c() {
            iij.m136416j(GameEffectView.this.f49626d);
            if (GameEffectView.this.f49625c != null) {
                GameEffectView.this.f49625c.mo73597d();
            }
            GameEffectView.this.m73576x("onRemoveGame");
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.C12803a.c
        /* JADX INFO: renamed from: d */
        public void mo73591d(View view) {
            GameEffectView.this.m73579l(view);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.C12803a.c
        /* JADX INFO: renamed from: e */
        public void mo73592e() {
            if (GameEffectView.this.f49625c != null) {
                GameEffectView.this.f49625c.mo73596c();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView$b */
    public class C12797b implements InterfaceC12798c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f49630a;

        public C12797b(GiftTrayData giftTrayData) {
            this.f49630a = giftTrayData;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView.InterfaceC12798c
        /* JADX INFO: renamed from: a */
        public void mo73594a(String str, ScriptBridge.Callback callback) {
            iij.m136418l(str);
            if (GameEffectView.this.f49627e != null) {
                GameEffectView.this.f49627e.m116001V3(this.f49630a, str, callback);
            }
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView.InterfaceC12798c
        /* JADX INFO: renamed from: b */
        public void mo73595b(String str) {
            GameEffectView.this.setGameEffectStatusShow(false);
            GameEffectView.this.f49627e.m129296E3(GameEffectView.this.f49628f);
            boolean zM164528d = oij.m164528d();
            GameEffectView gameEffectView = GameEffectView.this;
            if (!zM164528d) {
                gameEffectView.m73575v(this.f49630a.f50119y);
            } else if (gameEffectView.f49627e != null) {
                ees eesVar = GameEffectView.this.f49627e;
                final GiftTrayData giftTrayData = this.f49630a;
                eesVar.m129320z3(4000L, new Runnable() { // from class: l.xhj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f192893a.m73598f(giftTrayData);
                    }
                });
            }
            GameEffectView.this.m73577A("onGamePrepareFailed");
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView.InterfaceC12798c
        /* JADX INFO: renamed from: c */
        public void mo73596c() {
            iij.m136411e(this.f49630a);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView.InterfaceC12798c
        /* JADX INFO: renamed from: d */
        public void mo73597d() {
            GameEffectView.this.setGameEffectStatusShow(false);
            GameEffectView.this.f49627e.m129296E3(GameEffectView.this.f49628f);
            GameEffectView.this.m73575v(this.f49630a.f50119y);
            iij.m136410d(this.f49630a);
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m73598f(GiftTrayData giftTrayData) {
            GameEffectView.this.m73575v(giftTrayData.f50119y);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView$c */
    public interface InterfaceC12798c {
        /* JADX INFO: renamed from: a */
        void mo73594a(String str, ScriptBridge.Callback callback);

        /* JADX INFO: renamed from: b */
        void mo73595b(String str);

        /* JADX INFO: renamed from: c */
        void mo73596c();

        /* JADX INFO: renamed from: d */
        void mo73597d();
    }

    public GameEffectView(@NonNull Context context) {
        super(context);
        this.f49628f = new Runnable() { // from class: l.whj
            @Override // java.lang.Runnable
            public final void run() {
                this.f186440a.m73574s();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m73574s() {
        iij.m136413g();
        if (m73583q()) {
            setGameEffectStatusShow(false);
            m73577A("tryToStopGameEffectRunnable");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m73575v(String str) {
        ees eesVar = this.f49627e;
        if (eesVar != null) {
            eesVar.m116000U3(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* JADX INFO: renamed from: x */
    public void m73576x(String str) {
        if (getContext() != null) {
            iij.m136412f(str);
            xdl0.m208344M(this, false);
            removeAllViews();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m73577A(String str) {
        iij.m136420n(str);
        m73576x("stopEngineGame");
        C12803a c12803a = this.f49623a;
        if (c12803a != null) {
            c12803a.m73615o();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f49627e.m129296E3(this.f49628f);
        m73577A("onDestroy");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f49626d.m74173z()) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public String getEffectId() {
        GiftTrayData giftTrayData = this.f49626d;
        return giftTrayData != null ? giftTrayData.f50119y : "";
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ees eesVar) {
        this.f49627e = eesVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m73579l(View view) {
        removeAllViews();
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        iij.m136407a();
    }

    /* JADX INFO: renamed from: m */
    public final void m73580m() {
        this.f49624b = new C12796a();
    }

    /* JADX INFO: renamed from: n */
    public final String m73581n(GiftTrayData giftTrayData) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("effectId", giftTrayData.f50119y);
        jsonObject.addProperty("tantanId", giftTrayData.f50072B);
        jsonObject.addProperty("productId", Integer.valueOf(giftTrayData.f50099e));
        jsonObject.addProperty("roomId", giftTrayData.f50075E);
        jsonObject.addProperty("showId", giftTrayData.f50102h);
        jsonObject.addProperty("tradeNo", giftTrayData.f50112r);
        return jsonObject.toString();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f49626d.m74173z()) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f49626d.m74173z()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final String m73582p(GiftTrayData giftTrayData) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("nickname", giftTrayData.f50071A);
        jsonObject.addProperty("roomId", giftTrayData.f50075E);
        jsonObject.addProperty("tantanId", giftTrayData.f50072B);
        jsonObject.addProperty("avatarUrl", giftTrayData.f50120z);
        return jsonObject.toString();
    }

    /* JADX INFO: renamed from: q */
    public boolean m73583q() {
        C12803a c12803a = this.f49623a;
        if (c12803a != null) {
            return c12803a.m73609i();
        }
        return false;
    }

    public void setGameEffectStatusShow(boolean z) {
        ees eesVar = this.f49627e;
        if (eesVar != null) {
            eesVar.m206031K2().m182468k(z);
        }
    }

    public void setGameEffectViewListener(InterfaceC12798c interfaceC12798c) {
        this.f49625c = interfaceC12798c;
    }

    /* JADX INFO: renamed from: u */
    public void m73584u() {
        setGameEffectStatusShow(false);
        this.f49627e.m129296E3(this.f49628f);
        m73577A("onPause");
        m73575v(getEffectId());
    }

    /* JADX INFO: renamed from: w */
    public final void m73585w() {
        this.f49624b = null;
        C12803a c12803a = this.f49623a;
        if (c12803a != null) {
            c12803a.m73607g();
            this.f49623a = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m73586y(GiftTrayData giftTrayData, String str, boolean z) {
        m73585w();
        xdl0.m208344M(this, true);
        this.f49626d = giftTrayData;
        removeAllViews();
        m73580m();
        C12803a c12803a = new C12803a(this.f49624b, m73582p(giftTrayData), m73581n(giftTrayData), giftTrayData.f50113s, str, giftTrayData.m74173z(), z);
        this.f49623a = c12803a;
        c12803a.m73611k(getContext());
    }

    /* JADX INFO: renamed from: z */
    public void m73587z(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        iij.m136415i(giftTrayData);
        this.f49627e.m129296E3(this.f49628f);
        setGameEffectViewListener(new C12797b(giftTrayData));
        m73586y(giftTrayData, ((vhj) spe.m185365d("game")).mo107443b(bLiveEffect), z);
        if (giftTrayData.m74173z()) {
            setGameEffectStatusShow(true);
        }
        iij.m136414h();
        ees eesVar = this.f49627e;
        if (eesVar != null) {
            eesVar.m129320z3(giftTrayData.f50103i, this.f49628f);
        }
    }

    public GameEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49628f = new Runnable() { // from class: l.whj
            @Override // java.lang.Runnable
            public final void run() {
                this.f186440a.m73574s();
            }
        };
    }

    public GameEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49628f = new Runnable() { // from class: l.whj
            @Override // java.lang.Runnable
            public final void run() {
                this.f186440a.m73574s();
            }
        };
    }

    public GameEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f49628f = new Runnable() { // from class: l.whj
            @Override // java.lang.Runnable
            public final void run() {
                this.f186440a.m73574s();
            }
        };
    }
}

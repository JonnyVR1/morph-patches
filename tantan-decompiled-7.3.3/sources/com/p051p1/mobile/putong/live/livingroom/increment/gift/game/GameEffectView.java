package com.p051p1.mobile.putong.live.livingroom.increment.gift.game;

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
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import p153l.bnl0;
import p153l.clj;
import p153l.fgs;
import p153l.hlj;
import p153l.iam;
import p153l.pkj;
import p153l.wqe;

/* JADX INFO: loaded from: classes4.dex */
public class GameEffectView extends FrameLayout implements iam<fgs> {

    /* JADX INFO: renamed from: a */
    public C12966a f50471a;

    /* JADX INFO: renamed from: b */
    public C12966a.c f50472b;

    /* JADX INFO: renamed from: c */
    public InterfaceC12961c f50473c;

    /* JADX INFO: renamed from: d */
    public GiftTrayData f50474d;

    /* JADX INFO: renamed from: e */
    public fgs f50475e;

    /* JADX INFO: renamed from: f */
    public final Runnable f50476f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView$a */
    public class C12959a implements C12966a.c {
        public C12959a() {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.game.C12966a.c
        /* JADX INFO: renamed from: a */
        public void mo74771a(String str, ScriptBridge.Callback callback) {
            if (GameEffectView.this.f50473c != null) {
                GameEffectView.this.f50473c.mo74777a(str, callback);
            }
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.game.C12966a.c
        /* JADX INFO: renamed from: b */
        public void mo74772b(String str) {
            clj.m110636o("游戏开启错误，错误原因：" + str);
            clj.m110632k(str, GameEffectView.this.f50474d);
            if (GameEffectView.this.f50473c != null) {
                GameEffectView.this.f50473c.mo74778b(str);
            }
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.game.C12966a.c
        /* JADX INFO: renamed from: c */
        public void mo74773c() {
            clj.m110631j(GameEffectView.this.f50474d);
            if (GameEffectView.this.f50473c != null) {
                GameEffectView.this.f50473c.mo74780d();
            }
            GameEffectView.this.m74759x("onRemoveGame");
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.game.C12966a.c
        /* JADX INFO: renamed from: d */
        public void mo74774d(View view) {
            GameEffectView.this.m74762l(view);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.game.C12966a.c
        /* JADX INFO: renamed from: e */
        public void mo74775e() {
            if (GameEffectView.this.f50473c != null) {
                GameEffectView.this.f50473c.mo74779c();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView$b */
    public class C12960b implements InterfaceC12961c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GiftTrayData f50478a;

        public C12960b(GiftTrayData giftTrayData) {
            this.f50478a = giftTrayData;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView.InterfaceC12961c
        /* JADX INFO: renamed from: a */
        public void mo74777a(String str, ScriptBridge.Callback callback) {
            clj.m110633l(str);
            if (GameEffectView.this.f50475e != null) {
                GameEffectView.this.f50475e.m125527V3(this.f50478a, str, callback);
            }
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView.InterfaceC12961c
        /* JADX INFO: renamed from: b */
        public void mo74778b(String str) {
            GameEffectView.this.setGameEffectStatusShow(false);
            GameEffectView.this.f50475e.m138855E3(GameEffectView.this.f50476f);
            boolean zM135755d = hlj.m135755d();
            GameEffectView gameEffectView = GameEffectView.this;
            if (!zM135755d) {
                gameEffectView.m74758v(this.f50478a.f50967y);
            } else if (gameEffectView.f50475e != null) {
                fgs fgsVar = GameEffectView.this.f50475e;
                final GiftTrayData giftTrayData = this.f50478a;
                fgsVar.m138879z3(4000L, new Runnable() { // from class: l.rkj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f163624a.m74781f(giftTrayData);
                    }
                });
            }
            GameEffectView.this.m74760A("onGamePrepareFailed");
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView.InterfaceC12961c
        /* JADX INFO: renamed from: c */
        public void mo74779c() {
            clj.m110626e(this.f50478a);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView.InterfaceC12961c
        /* JADX INFO: renamed from: d */
        public void mo74780d() {
            GameEffectView.this.setGameEffectStatusShow(false);
            GameEffectView.this.f50475e.m138855E3(GameEffectView.this.f50476f);
            GameEffectView.this.m74758v(this.f50478a.f50967y);
            clj.m110625d(this.f50478a);
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m74781f(GiftTrayData giftTrayData) {
            GameEffectView.this.m74758v(giftTrayData.f50967y);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView$c */
    public interface InterfaceC12961c {
        /* JADX INFO: renamed from: a */
        void mo74777a(String str, ScriptBridge.Callback callback);

        /* JADX INFO: renamed from: b */
        void mo74778b(String str);

        /* JADX INFO: renamed from: c */
        void mo74779c();

        /* JADX INFO: renamed from: d */
        void mo74780d();
    }

    public GameEffectView(@NonNull Context context) {
        super(context);
        this.f50476f = new Runnable() { // from class: l.qkj
            @Override // java.lang.Runnable
            public final void run() {
                this.f158142a.m74757s();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m74757s() {
        clj.m110628g();
        if (m74766q()) {
            setGameEffectStatusShow(false);
            m74760A("tryToStopGameEffectRunnable");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m74758v(String str) {
        fgs fgsVar = this.f50475e;
        if (fgsVar != null) {
            fgsVar.m125526U3(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* JADX INFO: renamed from: x */
    public void m74759x(String str) {
        if (getContext() != null) {
            clj.m110627f(str);
            bnl0.m105524M(this, false);
            removeAllViews();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m74760A(String str) {
        clj.m110635n(str);
        m74759x("stopEngineGame");
        C12966a c12966a = this.f50471a;
        if (c12966a != null) {
            c12966a.m74798o();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
        this.f50475e.m138855E3(this.f50476f);
        m74760A("onDestroy");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f50474d.m75356z()) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public String getEffectId() {
        GiftTrayData giftTrayData = this.f50474d;
        return giftTrayData != null ? giftTrayData.f50967y : "";
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fgs fgsVar) {
        this.f50475e = fgsVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m74762l(View view) {
        removeAllViews();
        addView(view, new FrameLayout.LayoutParams(-1, -1));
        clj.m110622a();
    }

    /* JADX INFO: renamed from: m */
    public final void m74763m() {
        this.f50472b = new C12959a();
    }

    /* JADX INFO: renamed from: n */
    public final String m74764n(GiftTrayData giftTrayData) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("effectId", giftTrayData.f50967y);
        jsonObject.addProperty("tantanId", giftTrayData.f50920B);
        jsonObject.addProperty("productId", Integer.valueOf(giftTrayData.f50947e));
        jsonObject.addProperty("roomId", giftTrayData.f50923E);
        jsonObject.addProperty("showId", giftTrayData.f50950h);
        jsonObject.addProperty("tradeNo", giftTrayData.f50960r);
        return jsonObject.toString();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f50474d.m75356z()) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f50474d.m75356z()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final String m74765p(GiftTrayData giftTrayData) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("nickname", giftTrayData.f50919A);
        jsonObject.addProperty("roomId", giftTrayData.f50923E);
        jsonObject.addProperty("tantanId", giftTrayData.f50920B);
        jsonObject.addProperty("avatarUrl", giftTrayData.f50968z);
        return jsonObject.toString();
    }

    /* JADX INFO: renamed from: q */
    public boolean m74766q() {
        C12966a c12966a = this.f50471a;
        if (c12966a != null) {
            return c12966a.m74792i();
        }
        return false;
    }

    public void setGameEffectStatusShow(boolean z) {
        fgs fgsVar = this.f50475e;
        if (fgsVar != null) {
            fgsVar.m213814K2().m189704k(z);
        }
    }

    public void setGameEffectViewListener(InterfaceC12961c interfaceC12961c) {
        this.f50473c = interfaceC12961c;
    }

    /* JADX INFO: renamed from: u */
    public void m74767u() {
        setGameEffectStatusShow(false);
        this.f50475e.m138855E3(this.f50476f);
        m74760A("onPause");
        m74758v(getEffectId());
    }

    /* JADX INFO: renamed from: w */
    public final void m74768w() {
        this.f50472b = null;
        C12966a c12966a = this.f50471a;
        if (c12966a != null) {
            c12966a.m74790g();
            this.f50471a = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m74769y(GiftTrayData giftTrayData, String str, boolean z) {
        m74768w();
        bnl0.m105524M(this, true);
        this.f50474d = giftTrayData;
        removeAllViews();
        m74763m();
        C12966a c12966a = new C12966a(this.f50472b, m74765p(giftTrayData), m74764n(giftTrayData), giftTrayData.f50961s, str, giftTrayData.m75356z(), z);
        this.f50471a = c12966a;
        c12966a.m74794k(getContext());
    }

    /* JADX INFO: renamed from: z */
    public void m74770z(BLiveEffect bLiveEffect, GiftTrayData giftTrayData, boolean z) {
        clj.m110630i(giftTrayData);
        this.f50475e.m138855E3(this.f50476f);
        setGameEffectViewListener(new C12960b(giftTrayData));
        m74769y(giftTrayData, ((pkj) wqe.m207509d("game")).mo144686b(bLiveEffect), z);
        if (giftTrayData.m75356z()) {
            setGameEffectStatusShow(true);
        }
        clj.m110629h();
        fgs fgsVar = this.f50475e;
        if (fgsVar != null) {
            fgsVar.m138879z3(giftTrayData.f50951i, this.f50476f);
        }
    }

    public GameEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50476f = new Runnable() { // from class: l.qkj
            @Override // java.lang.Runnable
            public final void run() {
                this.f158142a.m74757s();
            }
        };
    }

    public GameEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50476f = new Runnable() { // from class: l.qkj
            @Override // java.lang.Runnable
            public final void run() {
                this.f158142a.m74757s();
            }
        };
    }

    public GameEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f50476f = new Runnable() { // from class: l.qkj
            @Override // java.lang.Runnable
            public final void run() {
                this.f158142a.m74757s();
            }
        };
    }
}

package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.LangModel;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class guj {

    /* JADX INFO: renamed from: a */
    public final bjs<?> f106510a;

    /* JADX INFO: renamed from: b */
    public boolean f106511b = false;

    /* JADX INFO: renamed from: c */
    public kcg0 f106512c;

    public guj(bjs<?> bjsVar) {
        this.f106510a = bjsVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m132301g(final jjs jjsVar, final LiveGiftItemView liveGiftItemView, final int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        if (m132307m(bLiveGivenGiftBrief, true)) {
            return;
        }
        if (bLiveGivenGiftBrief != null) {
            bLiveGiftItemM145122h.interactRules = bLiveGivenGiftBrief.interactRules;
        }
        if (TextUtils.isEmpty(bLiveGiftItemM145122h.getClickAction(true))) {
            liveGiftItemView.setOnLongClickListener(null);
            liveGiftItemView.setHapticFeedbackEnabled(false);
        } else {
            liveGiftItemView.setHapticFeedbackEnabled(true);
            liveGiftItemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ytj
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f201516a.m132309o(liveGiftItemView, jjsVar, i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m132302h(final jjs jjsVar, final LiveGiftItemView liveGiftItemView, final int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        if (m132307m(bLiveGivenGiftBrief, false)) {
            return;
        }
        if (bLiveGivenGiftBrief != null) {
            bLiveGiftItemM145122h.interactRules = bLiveGivenGiftBrief.interactRules;
        }
        liveGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.auj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73522a.m132310p(liveGiftItemView, jjsVar, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m132303i(jjs jjsVar, LiveGiftItemView liveGiftItemView) {
        int[] iArr = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr);
        jjsVar.m145139y(iArr);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m132304j(jjs jjsVar) {
        return !this.f106510a.m104738a5((double) jjsVar.m145122h().getPrice()) || ((civ) zrv.m221194l(htd0.f111524f)).m109958b();
    }

    /* JADX INFO: renamed from: k */
    public final long m132305k(jjs jjsVar) {
        long j = jjsVar.m145122h().interactRules.longPress.intervalMs;
        if (j < 300) {
            return 300L;
        }
        if (j >= 600) {
            return 600L;
        }
        return j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x004d A[PHI: r8
      0x004d: PHI (r8v13 byte) = 
      (r8v0 byte)
      (r8v0 byte)
      (r8v0 byte)
      (r8v2 byte)
      (r8v0 byte)
      (r8v3 byte)
      (r8v0 byte)
      (r8v4 byte)
      (r8v0 byte)
      (r8v5 byte)
      (r8v0 byte)
      (r8v6 byte)
      (r8v0 byte)
      (r8v7 byte)
      (r8v0 byte)
      (r8v8 byte)
      (r8v0 byte)
      (r8v9 byte)
     binds: [B:11:0x004a, B:46:0x00af, B:42:0x00a4, B:44:0x00a7, B:38:0x0099, B:40:0x009c, B:34:0x008e, B:36:0x0091, B:30:0x0083, B:32:0x0086, B:26:0x0078, B:28:0x007b, B:22:0x006d, B:24:0x0070, B:18:0x0062, B:20:0x0065, B:14:0x0056, B:16:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: l */
    public final void m132306l(final boolean z, final jjs jjsVar, final LiveGiftItemView liveGiftItemView, final int i) {
        boolean z2;
        bjs<?> bjsVar = this.f106510a;
        if (bjsVar != null) {
            bjsVar.m104714L5(jjsVar);
        }
        final String strValueOf = jjsVar.m145122h().isPaidGift() ? String.valueOf(this.f106510a.m104738a5(jjsVar.m145122h().getPrice())) : "NA";
        final y20<BLiveGivenGiftBrief> y20Var = new y20() { // from class: l.cuj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83842a.m132311q(jjsVar, i, z, (BLiveGivenGiftBrief) obj);
            }
        };
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        String clickAction = bLiveGiftItemM145122h.getClickAction(z);
        String actionScheme = bLiveGiftItemM145122h.getActionScheme(z);
        liveGiftItemView.getContext();
        m132303i(jjsVar, liveGiftItemView);
        clickAction.getClass();
        byte b = -1;
        switch (clickAction) {
            case "ShowSlotGift":
                z2 = false;
                b = 0;
                break;
            case "ShowNotice":
                b = 1;
            case "ShowExpirationInfo":
                b = 2;
            case "JumpToScheme":
                b = 3;
            case "GivenGift":
                b = 4;
            case "GivenGiftAndShowComboGearMenu":
                b = 5;
            case "AutoCombo":
                b = 6;
            case "Draw":
                b = 7;
            case "GivenGiftOnce":
                b = 8;
            default:
                z2 = false;
                break;
        }
        final String str = "";
        switch (b) {
            case 0:
                this.f106510a.m104742e6(jjsVar, liveGiftItemView.getReplaceListener());
                break;
            case 1:
                LangModel langModelM111775K = cpj.m111775K(bLiveGiftItemM145122h.getActionNotice(z));
                if (langModelM111775K != null) {
                    o1j0.m165620B(langModelM111775K.getLocalName(), z2, true);
                }
                break;
            case 2:
                this.f106510a.m104740c6(jjsVar, liveGiftItemView, i);
                break;
            case 3:
                bae0.C15954b c15954b = new bae0.C15954b();
                c15954b.m103156b(liveGiftItemView);
                c15954b.m103157c(jjsVar);
                this.f106510a.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(200).m103154e(actionScheme).m103153d(c15954b).m103152c());
                break;
            case 4:
            case 5:
                bjs<?> bjsVar2 = this.f106510a;
                toe0.m192021b(bjsVar2, bLiveGiftItemM145122h, bjsVar2.m104721P4(), new Function1() { // from class: l.euj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return this.f95873a.m132312r(jjsVar, liveGiftItemView, i, strValueOf, str, y20Var, (stj) obj);
                    }
                });
                break;
            case 6:
                m132317w(jjsVar, liveGiftItemView, i, strValueOf, "", y20Var);
                break;
            case 7:
                this.f106510a.m104739a6(jjsVar);
                break;
            case 8:
                BLiveEffect bLiveEffectM122151h = ere.m122146i().m122151h(bLiveGiftItemM145122h.liveResourceId);
                if (bLiveEffectM122151h != null && "game".equals(bLiveEffectM122151h.type) && hlj.m135755d()) {
                    clj.m110636o("GameEffect is not ready When click gift item. because the engine so is not load.");
                    o1j0.m165651y(xau.m209910t(R$string.f48121h5));
                } else {
                    this.f106510a.m104700E4();
                    m132316v(jjsVar, liveGiftItemView, i, strValueOf, "", y20Var, false, null);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m132307m(@Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief, boolean z) {
        return bLiveGivenGiftBrief != null && TextUtils.isEmpty(bLiveGivenGiftBrief.getClickAction(z));
    }

    /* JADX INFO: renamed from: n */
    public boolean m132308n() {
        return this.f106511b;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean m132309o(LiveGiftItemView liveGiftItemView, jjs jjsVar, int i, View view) {
        this.f106511b = true;
        liveGiftItemView.m74660P0();
        m132306l(true, jjsVar, liveGiftItemView, i);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m132310p(LiveGiftItemView liveGiftItemView, jjs jjsVar, int i, View view) {
        this.f106511b = false;
        liveGiftItemView.m74660P0();
        m132306l(false, jjsVar, liveGiftItemView, i);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m132311q(jjs jjsVar, int i, boolean z, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        bjs<?> bjsVar = this.f106510a;
        qzj.m178801r(bjsVar, jjsVar, i, bLiveGivenGiftBrief, bjsVar.mo78457R2(), 1, "", this.f106510a.m104721P4(), z);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Unit m132312r(jjs jjsVar, LiveGiftItemView liveGiftItemView, int i, String str, String str2, y20 y20Var, stj stjVar) {
        m132316v(jjsVar, liveGiftItemView, i, str, str2, y20Var, false, stjVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ boolean m132313s(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            psd0.m173633z(this.f106512c);
            if (this.f106511b) {
                this.f106510a.m213811F2().GiftDialogEventGroup.giftLongPressCancel().m199277p();
                this.f106511b = false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m132314t(jjs jjsVar, LiveGiftItemView liveGiftItemView, int i, String str, String str2, y20 y20Var, Long l2) {
        m132316v(jjsVar, liveGiftItemView, i, str, str2, y20Var, true, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: u */
    public void m132315u(jjs jjsVar, LiveGiftItemView liveGiftItemView, int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m132302h(jjsVar, liveGiftItemView, i, bLiveGivenGiftBrief);
        m132301g(jjsVar, liveGiftItemView, i, bLiveGivenGiftBrief);
        liveGiftItemView.setOnTouchListener(new View.OnTouchListener() { // from class: l.wtj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f190790a.m132313s(view, motionEvent);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: v */
    public final void m132316v(jjs jjsVar, LiveGiftItemView liveGiftItemView, int i, String str, String str2, y20<BLiveGivenGiftBrief> y20Var, boolean z, @Nullable stj stjVar) {
        if (!TextUtils.isEmpty(jjsVar.m145122h().liveResourceId)) {
            rre.m182726F(this.f106510a.m213810E2().mo118373p(), jjsVar.m145122h().liveResourceId, liveGiftItemView.m74655B0(), false, ere.m122146i().m122151h(jjsVar.m145122h().liveResourceId) != null);
        }
        if (liveGiftItemView.m74673z0()) {
            liveGiftItemView.m74665d1();
            return;
        }
        if (liveGiftItemView.m74656D0()) {
            liveGiftItemView.m74672u0();
        } else {
            if (!jjsVar.m145130p()) {
                o1j0.m165651y(xau.m209910t(R$string.f48121h5));
                return;
            }
            this.f106510a.m104732W5(jjsVar, liveGiftItemView, y20Var, 1, i, z, stjVar);
            bjs<?> bjsVar = this.f106510a;
            qzj.m178793j(bjsVar, jjsVar, i, str, bjsVar.mo78457R2(), 1, str2, this.f106510a.m104721P4(), z);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m132317w(final jjs jjsVar, final LiveGiftItemView liveGiftItemView, final int i, final String str, final String str2, final y20<BLiveGivenGiftBrief> y20Var) {
        if (liveGiftItemView.m74673z0()) {
            liveGiftItemView.m74665d1();
            return;
        }
        if (liveGiftItemView.m74656D0()) {
            liveGiftItemView.m74672u0();
            return;
        }
        if (!jjsVar.m145130p()) {
            o1j0.m165651y(xau.m209910t(R$string.f48121h5));
            this.f106511b = false;
            return;
        }
        psd0.m173633z(this.f106512c);
        long jM132305k = m132305k(jjsVar);
        if (m132304j(jjsVar)) {
            this.f106511b = false;
            m132316v(jjsVar, liveGiftItemView, i, str, str2, y20Var, false, null);
        } else {
            m132316v(jjsVar, liveGiftItemView, i, str, str2, y20Var, true, null);
            this.f106512c = this.f106510a.duringCreated(C22421c.interval(jM132305k, TimeUnit.MILLISECONDS)).compose(psd0.m173592C()).subscribe(dhw.m115825d(new y20() { // from class: l.fuj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f100918a.m132314t(jjsVar, liveGiftItemView, i, str, str2, y20Var, (Long) obj);
                }
            }));
        }
    }
}

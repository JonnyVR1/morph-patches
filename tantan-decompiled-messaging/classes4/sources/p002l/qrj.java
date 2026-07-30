package p002l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p1.mobile.putong.data.LangModel;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.bgv;
import l.c4g0;
import l.e30;
import l.ffw;
import l.fld0;
import l.lsi0;
import l.mkd0;
import l.w8u;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qrj {

    /* JADX INFO: renamed from: a */
    public final ahs<?> f18191a;

    /* JADX INFO: renamed from: b */
    public boolean f18192b = false;

    /* JADX INFO: renamed from: c */
    public c4g0 f18193c;

    public qrj(ahs<?> ahsVar) {
        this.f18191a = ahsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m21515g(final ihs ihsVar, final LiveGiftItemView liveGiftItemView, final int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM15160h = ihsVar.m15160h();
        if (m21521m(bLiveGivenGiftBrief, true)) {
            return;
        }
        if (bLiveGivenGiftBrief != null) {
            bLiveGiftItemM15160h.interactRules = bLiveGivenGiftBrief.interactRules;
        }
        if (TextUtils.isEmpty(bLiveGiftItemM15160h.getClickAction(true))) {
            liveGiftItemView.setOnLongClickListener(null);
            liveGiftItemView.setHapticFeedbackEnabled(false);
        } else {
            liveGiftItemView.setHapticFeedbackEnabled(true);
            liveGiftItemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.irj
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f13379a.m21523o(liveGiftItemView, ihsVar, i, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m21516h(final ihs ihsVar, final LiveGiftItemView liveGiftItemView, final int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM15160h = ihsVar.m15160h();
        if (m21521m(bLiveGivenGiftBrief, false)) {
            return;
        }
        if (bLiveGivenGiftBrief != null) {
            bLiveGiftItemM15160h.interactRules = bLiveGivenGiftBrief.interactRules;
        }
        liveGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.krj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14482a.m21524p(liveGiftItemView, ihsVar, i, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m21517i(ihs ihsVar, LiveGiftItemView liveGiftItemView) {
        int[] iArr = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr);
        ihsVar.m15177y(iArr);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m21518j(ihs ihsVar) {
        return !this.f18191a.m9748a5((double) ihsVar.m15160h().getPrice()) || ((bgv) ypv.l(fld0.f)).b();
    }

    /* JADX INFO: renamed from: k */
    public final long m21519k(ihs ihsVar) {
        long j = ihsVar.m15160h().interactRules.longPress.intervalMs;
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final void m21520l(final boolean z, final ihs ihsVar, final LiveGiftItemView liveGiftItemView, final int i) {
        boolean z2;
        ahs<?> ahsVar = this.f18191a;
        if (ahsVar != null) {
            ahsVar.m9723L5(ihsVar);
        }
        final String strValueOf = ihsVar.m15160h().isPaidGift() ? String.valueOf(this.f18191a.m9748a5(ihsVar.m15160h().getPrice())) : "NA";
        final e30<BLiveGivenGiftBrief> e30Var = new e30() { // from class: l.mrj
            public final void call(Object obj) {
                this.f15603a.m21525q(ihsVar, i, z, (BLiveGivenGiftBrief) obj);
            }
        };
        BLiveGiftItem bLiveGiftItemM15160h = ihsVar.m15160h();
        String clickAction = bLiveGiftItemM15160h.getClickAction(z);
        String actionScheme = bLiveGiftItemM15160h.getActionScheme(z);
        liveGiftItemView.getContext();
        m21517i(ihsVar, liveGiftItemView);
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
                this.f18191a.m9752e6(ihsVar, liveGiftItemView.getReplaceListener());
                break;
            case 1:
                LangModel langModelM18050K = mmj.m18050K(bLiveGiftItemM15160h.getActionNotice(z));
                if (langModelM18050K != null) {
                    lsi0.B(langModelM18050K.getLocalName(), z2, true);
                }
                break;
            case 2:
                this.f18191a.m9750c6(ihsVar, liveGiftItemView, i);
                break;
            case 3:
                x1e0.C0892b c0892b = new x1e0.C0892b();
                c0892b.m25612b(liveGiftItemView);
                c0892b.m25613c(ihsVar);
                this.f18191a.m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(200).m25610e(actionScheme).m25609d(c0892b).m25608c());
                break;
            case 4:
            case 5:
                ahs<?> ahsVar2 = this.f18191a;
                oge0.m19471b(ahsVar2, bLiveGiftItemM15160h, ahsVar2.m9730P4(), new Function1() { // from class: l.orj
                    public final Object invoke(Object obj) {
                        return this.f16759a.m21526r(ihsVar, liveGiftItemView, i, strValueOf, str, e30Var, (crj) obj);
                    }
                });
                break;
            case 6:
                m21531w(ihsVar, liveGiftItemView, i, strValueOf, "", e30Var);
                break;
            case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                this.f18191a.m9749a6(ihsVar);
                break;
            case ExpLoopInputType.GAME_NAME /* 8 */:
                BLiveEffect bLiveEffectM10044h = aqe.m10039i().m10044h(bLiveGiftItemM15160h.liveResourceId);
                if (bLiveEffectM10044h != null && "game".equals(bLiveEffectM10044h.type) && oij.m19549d()) {
                    iij.m15193o("GameEffect is not ready When click gift item. because the engine so is not load.");
                    lsi0.y(w8u.t(R$string.f3315h5));
                } else {
                    this.f18191a.m9709E4();
                    m21530v(ihsVar, liveGiftItemView, i, strValueOf, "", e30Var, false, null);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m21521m(@Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief, boolean z) {
        return bLiveGivenGiftBrief != null && TextUtils.isEmpty(bLiveGivenGiftBrief.getClickAction(z));
    }

    /* JADX INFO: renamed from: n */
    public boolean m21522n() {
        return this.f18192b;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean m21523o(LiveGiftItemView liveGiftItemView, ihs ihsVar, int i, View view) {
        this.f18192b = true;
        liveGiftItemView.m7019P0();
        m21520l(true, ihsVar, liveGiftItemView, i);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m21524p(LiveGiftItemView liveGiftItemView, ihs ihsVar, int i, View view) {
        this.f18192b = false;
        liveGiftItemView.m7019P0();
        m21520l(false, ihsVar, liveGiftItemView, i);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m21525q(ihs ihsVar, int i, boolean z, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        ahs<?> ahsVar = this.f18191a;
        axj.m10104r(ahsVar, ihsVar, i, bLiveGivenGiftBrief, ahsVar.mo21430R2(), 1, "", this.f18191a.m9730P4(), z);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Unit m21526r(ihs ihsVar, LiveGiftItemView liveGiftItemView, int i, String str, String str2, e30 e30Var, crj crjVar) {
        m21530v(ihsVar, liveGiftItemView, i, str, str2, e30Var, false, crjVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ boolean m21527s(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            mkd0.z(this.f18193c);
            if (this.f18192b) {
                this.f18191a.m25548F2().GiftDialogEventGroup.giftLongPressCancel().p();
                this.f18192b = false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m21528t(ihs ihsVar, LiveGiftItemView liveGiftItemView, int i, String str, String str2, e30 e30Var, Long l2) {
        m21530v(ihsVar, liveGiftItemView, i, str, str2, e30Var, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: u */
    public void m21529u(ihs ihsVar, LiveGiftItemView liveGiftItemView, int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m21516h(ihsVar, liveGiftItemView, i, bLiveGivenGiftBrief);
        m21515g(ihsVar, liveGiftItemView, i, bLiveGivenGiftBrief);
        liveGiftItemView.setOnTouchListener(new View.OnTouchListener() { // from class: l.grj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f11601a.m21527s(view, motionEvent);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: v */
    public final void m21530v(ihs ihsVar, LiveGiftItemView liveGiftItemView, int i, String str, String str2, e30<BLiveGivenGiftBrief> e30Var, boolean z, @Nullable crj crjVar) {
        if (!TextUtils.isEmpty(ihsVar.m15160h().liveResourceId)) {
            nqe.m18943F(this.f18191a.m25547E2().mo9893p(), ihsVar.m15160h().liveResourceId, liveGiftItemView.m7014B0(), false, aqe.m10039i().m10044h(ihsVar.m15160h().liveResourceId) != null);
        }
        if (liveGiftItemView.m7032z0()) {
            liveGiftItemView.m7024d1();
            return;
        }
        if (liveGiftItemView.m7015D0()) {
            liveGiftItemView.m7031u0();
        } else {
            if (!ihsVar.m15168p()) {
                lsi0.y(w8u.t(R$string.f3315h5));
                return;
            }
            this.f18191a.m9742W5(ihsVar, liveGiftItemView, e30Var, 1, i, z, crjVar);
            ahs<?> ahsVar = this.f18191a;
            axj.m10096j(ahsVar, ihsVar, i, str, ahsVar.mo21430R2(), 1, str2, this.f18191a.m9730P4(), z);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m21531w(final ihs ihsVar, final LiveGiftItemView liveGiftItemView, final int i, final String str, final String str2, final e30<BLiveGivenGiftBrief> e30Var) {
        if (liveGiftItemView.m7032z0()) {
            liveGiftItemView.m7024d1();
            return;
        }
        if (liveGiftItemView.m7015D0()) {
            liveGiftItemView.m7031u0();
            return;
        }
        if (!ihsVar.m15168p()) {
            lsi0.y(w8u.t(R$string.f3315h5));
            this.f18192b = false;
            return;
        }
        mkd0.z(this.f18193c);
        long jM21519k = m21519k(ihsVar);
        if (m21518j(ihsVar)) {
            this.f18192b = false;
            m21530v(ihsVar, liveGiftItemView, i, str, str2, e30Var, false, null);
        } else {
            m21530v(ihsVar, liveGiftItemView, i, str, str2, e30Var, true, null);
            this.f18193c = this.f18191a.duringCreated(c.interval(jM21519k, TimeUnit.MILLISECONDS)).compose(mkd0.C()).subscribe(ffw.d(new e30() { // from class: l.prj
                public final void call(Object obj) {
                    this.f17625a.m21528t(ihsVar, liveGiftItemView, i, str, str2, e30Var, (Long) obj);
                }
            }));
        }
    }
}

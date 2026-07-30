package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.LangModel;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class qrj {

    /* JADX INFO: renamed from: a */
    public final ahs<?> f155994a;

    /* JADX INFO: renamed from: b */
    public boolean f155995b = false;

    /* JADX INFO: renamed from: c */
    public c4g0 f155996c;

    public qrj(ahs<?> ahsVar) {
        this.f155994a = ahsVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m176019g(final ihs ihsVar, final LiveGiftItemView liveGiftItemView, final int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        if (m176025m(bLiveGivenGiftBrief, true)) {
            return;
        }
        if (bLiveGivenGiftBrief != null) {
            bLiveGiftItemM136283h.interactRules = bLiveGivenGiftBrief.interactRules;
        }
        if (TextUtils.isEmpty(bLiveGiftItemM136283h.getClickAction(true))) {
            liveGiftItemView.setOnLongClickListener(null);
            liveGiftItemView.setHapticFeedbackEnabled(false);
        } else {
            liveGiftItemView.setHapticFeedbackEnabled(true);
            liveGiftItemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.irj
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f114649a.m176027o(liveGiftItemView, ihsVar, i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m176020h(final ihs ihsVar, final LiveGiftItemView liveGiftItemView, final int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        if (m176025m(bLiveGivenGiftBrief, false)) {
            return;
        }
        if (bLiveGivenGiftBrief != null) {
            bLiveGiftItemM136283h.interactRules = bLiveGivenGiftBrief.interactRules;
        }
        liveGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.krj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124356a.m176028p(liveGiftItemView, ihsVar, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m176021i(ihs ihsVar, LiveGiftItemView liveGiftItemView) {
        int[] iArr = new int[2];
        liveGiftItemView.getLocationOnScreen(iArr);
        ihsVar.m136300y(iArr);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m176022j(ihs ihsVar) {
        return !this.f155994a.m96651a5((double) ihsVar.m136283h().getPrice()) || ((bgv) ypv.m215673l(fld0.f98151f)).m101722b();
    }

    /* JADX INFO: renamed from: k */
    public final long m176023k(ihs ihsVar) {
        long j = ihsVar.m136283h().interactRules.longPress.intervalMs;
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
    public final void m176024l(final boolean z, final ihs ihsVar, final LiveGiftItemView liveGiftItemView, final int i) {
        boolean z2;
        ahs<?> ahsVar = this.f155994a;
        if (ahsVar != null) {
            ahsVar.m96627L5(ihsVar);
        }
        final String strValueOf = ihsVar.m136283h().isPaidGift() ? String.valueOf(this.f155994a.m96651a5(ihsVar.m136283h().getPrice())) : "NA";
        final e30<BLiveGivenGiftBrief> e30Var = new e30() { // from class: l.mrj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135368a.m176029q(ihsVar, i, z, (BLiveGivenGiftBrief) obj);
            }
        };
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        String clickAction = bLiveGiftItemM136283h.getClickAction(z);
        String actionScheme = bLiveGiftItemM136283h.getActionScheme(z);
        liveGiftItemView.getContext();
        m176021i(ihsVar, liveGiftItemView);
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
                this.f155994a.m96655e6(ihsVar, liveGiftItemView.getReplaceListener());
                break;
            case 1:
                LangModel langModelM155408K = mmj.m155408K(bLiveGiftItemM136283h.getActionNotice(z));
                if (langModelM155408K != null) {
                    lsi0.m151564B(langModelM155408K.getLocalName(), z2, true);
                }
                break;
            case 2:
                this.f155994a.m96653c6(ihsVar, liveGiftItemView, i);
                break;
            case 3:
                x1e0.C21019b c21019b = new x1e0.C21019b();
                c21019b.m206703b(liveGiftItemView);
                c21019b.m206704c(ihsVar);
                this.f155994a.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(200).m206701e(actionScheme).m206700d(c21019b).m206699c());
                break;
            case 4:
            case 5:
                ahs<?> ahsVar2 = this.f155994a;
                oge0.m164198b(ahsVar2, bLiveGiftItemM136283h, ahsVar2.m96634P4(), new Function1() { // from class: l.orj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return this.f145326a.m176030r(ihsVar, liveGiftItemView, i, strValueOf, str, e30Var, (crj) obj);
                    }
                });
                break;
            case 6:
                m176035w(ihsVar, liveGiftItemView, i, strValueOf, "", e30Var);
                break;
            case 7:
                this.f155994a.m96652a6(ihsVar);
                break;
            case 8:
                BLiveEffect bLiveEffectM98266h = aqe.m98261i().m98266h(bLiveGiftItemM136283h.liveResourceId);
                if (bLiveEffectM98266h != null && "game".equals(bLiveEffectM98266h.type) && oij.m164528d()) {
                    iij.m136421o("GameEffect is not ready When click gift item. because the engine so is not load.");
                    lsi0.m151595y(w8u.m202217t(R$string.f47273h5));
                } else {
                    this.f155994a.m96613E4();
                    m176034v(ihsVar, liveGiftItemView, i, strValueOf, "", e30Var, false, null);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m176025m(@Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief, boolean z) {
        return bLiveGivenGiftBrief != null && TextUtils.isEmpty(bLiveGivenGiftBrief.getClickAction(z));
    }

    /* JADX INFO: renamed from: n */
    public boolean m176026n() {
        return this.f155995b;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean m176027o(LiveGiftItemView liveGiftItemView, ihs ihsVar, int i, View view) {
        this.f155995b = true;
        liveGiftItemView.m73477P0();
        m176024l(true, ihsVar, liveGiftItemView, i);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m176028p(LiveGiftItemView liveGiftItemView, ihs ihsVar, int i, View view) {
        this.f155995b = false;
        liveGiftItemView.m73477P0();
        m176024l(false, ihsVar, liveGiftItemView, i);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m176029q(ihs ihsVar, int i, boolean z, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        ahs<?> ahsVar = this.f155994a;
        axj.m99444r(ahsVar, ihsVar, i, bLiveGivenGiftBrief, ahsVar.mo77274R2(), 1, "", this.f155994a.m96634P4(), z);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Unit m176030r(ihs ihsVar, LiveGiftItemView liveGiftItemView, int i, String str, String str2, e30 e30Var, crj crjVar) {
        m176034v(ihsVar, liveGiftItemView, i, str, str2, e30Var, false, crjVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ boolean m176031s(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            mkd0.m154992z(this.f155996c);
            if (this.f155995b) {
                this.f155994a.m206028F2().GiftDialogEventGroup.giftLongPressCancel().m172467p();
                this.f155995b = false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m176032t(ihs ihsVar, LiveGiftItemView liveGiftItemView, int i, String str, String str2, e30 e30Var, Long l2) {
        m176034v(ihsVar, liveGiftItemView, i, str, str2, e30Var, true, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: u */
    public void m176033u(ihs ihsVar, LiveGiftItemView liveGiftItemView, int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m176020h(ihsVar, liveGiftItemView, i, bLiveGivenGiftBrief);
        m176019g(ihsVar, liveGiftItemView, i, bLiveGivenGiftBrief);
        liveGiftItemView.setOnTouchListener(new View.OnTouchListener() { // from class: l.grj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f104068a.m176031s(view, motionEvent);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: v */
    public final void m176034v(ihs ihsVar, LiveGiftItemView liveGiftItemView, int i, String str, String str2, e30<BLiveGivenGiftBrief> e30Var, boolean z, @Nullable crj crjVar) {
        if (!TextUtils.isEmpty(ihsVar.m136283h().liveResourceId)) {
            nqe.m160592F(this.f155994a.m206027E2().mo97490p(), ihsVar.m136283h().liveResourceId, liveGiftItemView.m73472B0(), false, aqe.m98261i().m98266h(ihsVar.m136283h().liveResourceId) != null);
        }
        if (liveGiftItemView.m73490z0()) {
            liveGiftItemView.m73482d1();
            return;
        }
        if (liveGiftItemView.m73473D0()) {
            liveGiftItemView.m73489u0();
        } else {
            if (!ihsVar.m136291p()) {
                lsi0.m151595y(w8u.m202217t(R$string.f47273h5));
                return;
            }
            this.f155994a.m96645W5(ihsVar, liveGiftItemView, e30Var, 1, i, z, crjVar);
            ahs<?> ahsVar = this.f155994a;
            axj.m99436j(ahsVar, ihsVar, i, str, ahsVar.mo77274R2(), 1, str2, this.f155994a.m96634P4(), z);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m176035w(final ihs ihsVar, final LiveGiftItemView liveGiftItemView, final int i, final String str, final String str2, final e30<BLiveGivenGiftBrief> e30Var) {
        if (liveGiftItemView.m73490z0()) {
            liveGiftItemView.m73482d1();
            return;
        }
        if (liveGiftItemView.m73473D0()) {
            liveGiftItemView.m73489u0();
            return;
        }
        if (!ihsVar.m136291p()) {
            lsi0.m151595y(w8u.m202217t(R$string.f47273h5));
            this.f155995b = false;
            return;
        }
        mkd0.m154992z(this.f155996c);
        long jM176023k = m176023k(ihsVar);
        if (m176022j(ihsVar)) {
            this.f155995b = false;
            m176034v(ihsVar, liveGiftItemView, i, str, str2, e30Var, false, null);
        } else {
            m176034v(ihsVar, liveGiftItemView, i, str, str2, e30Var, true, null);
            this.f155996c = this.f155994a.duringCreated(C22306c.interval(jM176023k, TimeUnit.MILLISECONDS)).compose(mkd0.m154951C()).subscribe(ffw.m121193d(new e30() { // from class: l.prj
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f150913a.m176032t(ihsVar, liveGiftItemView, i, str, str2, e30Var, (Long) obj);
                }
            }));
        }
    }
}

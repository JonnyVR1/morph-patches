package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.LangModel;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class huj {

    /* JADX INFO: renamed from: a */
    public final vlu<?> f111672a;

    /* JADX INFO: renamed from: b */
    public boolean f111673b = false;

    /* JADX INFO: renamed from: c */
    public kcg0 f111674c;

    public huj(vlu<?> vluVar) {
        this.f111672a = vluVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m137233e(final jjs jjsVar, final LiveVChatGiftItemView liveVChatGiftItemView, final int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        if (m137239k(bLiveGivenGiftBrief, true)) {
            return;
        }
        if (bLiveGivenGiftBrief != null) {
            bLiveGiftItemM145122h.interactRules = bLiveGivenGiftBrief.interactRules;
        }
        if (TextUtils.isEmpty(bLiveGiftItemM145122h.getClickAction(true))) {
            liveVChatGiftItemView.setOnLongClickListener(null);
            liveVChatGiftItemView.setHapticFeedbackEnabled(false);
        } else {
            liveVChatGiftItemView.setHapticFeedbackEnabled(true);
            liveVChatGiftItemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ztj
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f206011a.m137241m(liveVChatGiftItemView, jjsVar, i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m137234f(final jjs jjsVar, final LiveVChatGiftItemView liveVChatGiftItemView, final int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        if (m137239k(bLiveGivenGiftBrief, false)) {
            return;
        }
        if (bLiveGivenGiftBrief != null) {
            bLiveGiftItemM145122h.interactRules = bLiveGivenGiftBrief.interactRules;
        }
        liveVChatGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.buj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78513a.m137242n(liveVChatGiftItemView, jjsVar, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m137235g(jjs jjsVar, LiveVChatGiftItemView liveVChatGiftItemView) {
        int[] iArr = new int[2];
        liveVChatGiftItemView.getLocationOnScreen(iArr);
        jjsVar.m145139y(iArr);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m137236h(jjs jjsVar) {
        return !this.f111672a.m201720x3((double) jjsVar.m145122h().getPrice()) || ((civ) zrv.m221194l(htd0.f111524f)).m109958b();
    }

    /* JADX INFO: renamed from: i */
    public final long m137237i(jjs jjsVar) {
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
    /* JADX WARN: Code duplicated, block: B:9:0x0041 A[PHI: r7
      0x0041: PHI (r7v8 byte) = 
      (r7v0 byte)
      (r7v0 byte)
      (r7v0 byte)
      (r7v2 byte)
      (r7v0 byte)
      (r7v3 byte)
      (r7v0 byte)
      (r7v4 byte)
      (r7v0 byte)
      (r7v5 byte)
     binds: [B:8:0x003e, B:27:0x0075, B:23:0x006a, B:25:0x006d, B:19:0x005f, B:21:0x0062, B:15:0x0054, B:17:0x0057, B:11:0x0049, B:13:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: j */
    public final void m137238j(boolean z, jjs jjsVar, LiveVChatGiftItemView liveVChatGiftItemView, int i) {
        boolean z2;
        String strValueOf = jjsVar.m145122h().isPaidGift() ? String.valueOf(this.f111672a.m201720x3(jjsVar.m145122h().getPrice())) : "NA";
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        String clickAction = bLiveGiftItemM145122h.getClickAction(z);
        String actionScheme = bLiveGiftItemM145122h.getActionScheme(z);
        liveVChatGiftItemView.getContext();
        m137235g(jjsVar, liveVChatGiftItemView);
        clickAction.getClass();
        byte b = -1;
        switch (clickAction.hashCode()) {
            case -1666103211:
                if (!clickAction.equals("ShowNotice")) {
                    z2 = false;
                } else {
                    z2 = false;
                    b = 0;
                }
                break;
            case -1072576914:
                if (clickAction.equals("JumpToScheme")) {
                    b = 1;
                }
                z2 = false;
                break;
            case -822153683:
                if (clickAction.equals("GivenGift")) {
                    b = 2;
                }
                z2 = false;
                break;
            case -709977099:
                if (clickAction.equals("GivenGiftAndShowComboGearMenu")) {
                    b = 3;
                }
                z2 = false;
                break;
            case -655705857:
                if (clickAction.equals("AutoCombo")) {
                    b = 4;
                }
                z2 = false;
                break;
            default:
                z2 = false;
                break;
        }
        switch (b) {
            case 0:
                LangModel langModelM117404x = dpj.m117404x(bLiveGiftItemM145122h.getActionNotice(z));
                if (langModelM117404x != null) {
                    o1j0.m165620B(langModelM117404x.getLocalName(), z2, true);
                }
                break;
            case 1:
                aae0.C15677b c15677b = new aae0.C15677b();
                c15677b.m96629a(liveVChatGiftItemView);
                c15677b.m96630b(jjsVar);
                this.f111672a.m97928K2().SchemeHandleEvent.m70385a().mo199273j(new aae0.C15676a(200).m96628e(actionScheme).m96627d(c15677b).m96626c());
                break;
            case 2:
            case 3:
                m137246r(jjsVar, liveVChatGiftItemView, i, strValueOf, "", null, false);
                break;
            case 4:
                m137247s(jjsVar, liveVChatGiftItemView, i, strValueOf, "");
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m137239k(@Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief, boolean z) {
        return bLiveGivenGiftBrief != null && TextUtils.isEmpty(bLiveGivenGiftBrief.getClickAction(z));
    }

    /* JADX INFO: renamed from: l */
    public boolean m137240l() {
        return this.f111673b;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m137241m(LiveVChatGiftItemView liveVChatGiftItemView, jjs jjsVar, int i, View view) {
        this.f111673b = true;
        liveVChatGiftItemView.m70611L0();
        m137238j(true, jjsVar, liveVChatGiftItemView, i);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m137242n(LiveVChatGiftItemView liveVChatGiftItemView, jjs jjsVar, int i, View view) {
        this.f111673b = false;
        liveVChatGiftItemView.m70611L0();
        m137238j(false, jjsVar, liveVChatGiftItemView, i);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean m137243o(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            psd0.m173633z(this.f111674c);
            if (this.f111673b) {
                this.f111672a.m97928K2().GiftDialogEventGroup.m70358c().m199277p();
                this.f111673b = false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m137244p(jjs jjsVar, LiveVChatGiftItemView liveVChatGiftItemView, int i, String str, String str2, Long l2) {
        m137246r(jjsVar, liveVChatGiftItemView, i, str, str2, null, true);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: q */
    public void m137245q(jjs jjsVar, LiveVChatGiftItemView liveVChatGiftItemView, int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m137234f(jjsVar, liveVChatGiftItemView, i, bLiveGivenGiftBrief);
        m137233e(jjsVar, liveVChatGiftItemView, i, bLiveGivenGiftBrief);
        liveVChatGiftItemView.setOnTouchListener(new View.OnTouchListener() { // from class: l.xtj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f196225a.m137243o(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m137246r(jjs jjsVar, LiveVChatGiftItemView liveVChatGiftItemView, int i, String str, String str2, y20<BLiveGivenGiftBrief> y20Var, boolean z) {
        if (liveVChatGiftItemView.m70650y0()) {
            liveVChatGiftItemView.m70622Y0();
            return;
        }
        if (liveVChatGiftItemView.m70651z0()) {
            liveVChatGiftItemView.m70646t0();
        } else if (!jjsVar.m145130p()) {
            o1j0.m165651y(xau.m209910t(R$string.f48121h5));
        } else {
            this.f111672a.m201699V3(jjsVar, liveVChatGiftItemView, y20Var, 1, i, z);
            btu.m106395k(jjsVar, i, str, "p_live_user_video_quickchat_room", 1, str2, this.f111672a.m97926H2().m212345o(), z);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m137247s(final jjs jjsVar, final LiveVChatGiftItemView liveVChatGiftItemView, final int i, final String str, final String str2) {
        if (liveVChatGiftItemView.m70650y0()) {
            liveVChatGiftItemView.m70622Y0();
            return;
        }
        if (liveVChatGiftItemView.m70651z0()) {
            liveVChatGiftItemView.m70646t0();
            return;
        }
        if (!jjsVar.m145130p()) {
            o1j0.m165651y(xau.m209910t(R$string.f48121h5));
            this.f111673b = false;
            return;
        }
        psd0.m173633z(this.f111674c);
        long jM137237i = m137237i(jjsVar);
        if (m137236h(jjsVar)) {
            this.f111673b = false;
            m137246r(jjsVar, liveVChatGiftItemView, i, str, str2, null, false);
        } else {
            m137246r(jjsVar, liveVChatGiftItemView, i, str, str2, null, true);
            this.f111674c = this.f111672a.duringCreated(C22421c.interval(jM137237i, TimeUnit.MILLISECONDS)).compose(psd0.m173592C()).subscribe(dhw.m115825d(new y20() { // from class: l.duj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90798a.m137244p(jjsVar, liveVChatGiftItemView, i, str, str2, (Long) obj);
                }
            }));
        }
    }
}

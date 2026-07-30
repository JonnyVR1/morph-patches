package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.LangModel;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class rrj {

    /* JADX INFO: renamed from: a */
    public final uju<?> f160750a;

    /* JADX INFO: renamed from: b */
    public boolean f160751b = false;

    /* JADX INFO: renamed from: c */
    public c4g0 f160752c;

    public rrj(uju<?> ujuVar) {
        this.f160750a = ujuVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m180551e(final ihs ihsVar, final LiveVChatGiftItemView liveVChatGiftItemView, final int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        if (m180557k(bLiveGivenGiftBrief, true)) {
            return;
        }
        if (bLiveGivenGiftBrief != null) {
            bLiveGiftItemM136283h.interactRules = bLiveGivenGiftBrief.interactRules;
        }
        if (TextUtils.isEmpty(bLiveGiftItemM136283h.getClickAction(true))) {
            liveVChatGiftItemView.setOnLongClickListener(null);
            liveVChatGiftItemView.setHapticFeedbackEnabled(false);
        } else {
            liveVChatGiftItemView.setHapticFeedbackEnabled(true);
            liveVChatGiftItemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.jrj
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f119415a.m180559m(liveVChatGiftItemView, ihsVar, i, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m180552f(final ihs ihsVar, final LiveVChatGiftItemView liveVChatGiftItemView, final int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        if (m180557k(bLiveGivenGiftBrief, false)) {
            return;
        }
        if (bLiveGivenGiftBrief != null) {
            bLiveGiftItemM136283h.interactRules = bLiveGivenGiftBrief.interactRules;
        }
        liveVChatGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.lrj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129711a.m180560n(liveVChatGiftItemView, ihsVar, i, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m180553g(ihs ihsVar, LiveVChatGiftItemView liveVChatGiftItemView) {
        int[] iArr = new int[2];
        liveVChatGiftItemView.getLocationOnScreen(iArr);
        ihsVar.m136300y(iArr);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m180554h(ihs ihsVar) {
        return !this.f160750a.m194090x3((double) ihsVar.m136283h().getPrice()) || ((bgv) ypv.m215673l(fld0.f98151f)).m101722b();
    }

    /* JADX INFO: renamed from: i */
    public final long m180555i(ihs ihsVar) {
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
    public final void m180556j(boolean z, ihs ihsVar, LiveVChatGiftItemView liveVChatGiftItemView, int i) {
        boolean z2;
        String strValueOf = ihsVar.m136283h().isPaidGift() ? String.valueOf(this.f160750a.m194090x3(ihsVar.m136283h().getPrice())) : "NA";
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        String clickAction = bLiveGiftItemM136283h.getClickAction(z);
        String actionScheme = bLiveGiftItemM136283h.getActionScheme(z);
        liveVChatGiftItemView.getContext();
        m180553g(ihsVar, liveVChatGiftItemView);
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
                LangModel langModelM160112x = nmj.m160112x(bLiveGiftItemM136283h.getActionNotice(z));
                if (langModelM160112x != null) {
                    lsi0.m151564B(langModelM160112x.getLocalName(), z2, true);
                }
                break;
            case 1:
                w1e0.C20785b c20785b = new w1e0.C20785b();
                c20785b.m200925a(liveVChatGiftItemView);
                c20785b.m200926b(ihsVar);
                this.f160750a.m218411K2().SchemeHandleEvent.m69202a().mo172463j(new w1e0.C20784a(200).m200924e(actionScheme).m200923d(c20785b).m200922c());
                break;
            case 2:
            case 3:
                m180564r(ihsVar, liveVChatGiftItemView, i, strValueOf, "", null, false);
                break;
            case 4:
                m180565s(ihsVar, liveVChatGiftItemView, i, strValueOf, "");
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m180557k(@Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief, boolean z) {
        return bLiveGivenGiftBrief != null && TextUtils.isEmpty(bLiveGivenGiftBrief.getClickAction(z));
    }

    /* JADX INFO: renamed from: l */
    public boolean m180558l() {
        return this.f160751b;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m180559m(LiveVChatGiftItemView liveVChatGiftItemView, ihs ihsVar, int i, View view) {
        this.f160751b = true;
        liveVChatGiftItemView.m69428L0();
        m180556j(true, ihsVar, liveVChatGiftItemView, i);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m180560n(LiveVChatGiftItemView liveVChatGiftItemView, ihs ihsVar, int i, View view) {
        this.f160751b = false;
        liveVChatGiftItemView.m69428L0();
        m180556j(false, ihsVar, liveVChatGiftItemView, i);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean m180561o(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            mkd0.m154992z(this.f160752c);
            if (this.f160751b) {
                this.f160750a.m218411K2().GiftDialogEventGroup.m69175c().m172467p();
                this.f160751b = false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m180562p(ihs ihsVar, LiveVChatGiftItemView liveVChatGiftItemView, int i, String str, String str2, Long l2) {
        m180564r(ihsVar, liveVChatGiftItemView, i, str, str2, null, true);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: q */
    public void m180563q(ihs ihsVar, LiveVChatGiftItemView liveVChatGiftItemView, int i, @Nullable BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m180552f(ihsVar, liveVChatGiftItemView, i, bLiveGivenGiftBrief);
        m180551e(ihsVar, liveVChatGiftItemView, i, bLiveGivenGiftBrief);
        liveVChatGiftItemView.setOnTouchListener(new View.OnTouchListener() { // from class: l.hrj
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f109227a.m180561o(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m180564r(ihs ihsVar, LiveVChatGiftItemView liveVChatGiftItemView, int i, String str, String str2, e30<BLiveGivenGiftBrief> e30Var, boolean z) {
        if (liveVChatGiftItemView.m69467y0()) {
            liveVChatGiftItemView.m69439Y0();
            return;
        }
        if (liveVChatGiftItemView.m69468z0()) {
            liveVChatGiftItemView.m69463t0();
        } else if (!ihsVar.m136291p()) {
            lsi0.m151595y(w8u.m202217t(R$string.f47273h5));
        } else {
            this.f160750a.m194069V3(ihsVar, liveVChatGiftItemView, e30Var, 1, i, z);
            aru.m98562k(ihsVar, i, str, "p_live_user_video_quickchat_room", 1, str2, this.f160750a.m218409H2().m203938o(), z);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m180565s(final ihs ihsVar, final LiveVChatGiftItemView liveVChatGiftItemView, final int i, final String str, final String str2) {
        if (liveVChatGiftItemView.m69467y0()) {
            liveVChatGiftItemView.m69439Y0();
            return;
        }
        if (liveVChatGiftItemView.m69468z0()) {
            liveVChatGiftItemView.m69463t0();
            return;
        }
        if (!ihsVar.m136291p()) {
            lsi0.m151595y(w8u.m202217t(R$string.f47273h5));
            this.f160751b = false;
            return;
        }
        mkd0.m154992z(this.f160752c);
        long jM180555i = m180555i(ihsVar);
        if (m180554h(ihsVar)) {
            this.f160751b = false;
            m180564r(ihsVar, liveVChatGiftItemView, i, str, str2, null, false);
        } else {
            m180564r(ihsVar, liveVChatGiftItemView, i, str, str2, null, true);
            this.f160752c = this.f160750a.duringCreated(C22306c.interval(jM180555i, TimeUnit.MILLISECONDS)).compose(mkd0.m154951C()).subscribe(ffw.m121193d(new e30() { // from class: l.nrj
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f140193a.m180562p(ihsVar, liveVChatGiftItemView, i, str, str2, (Long) obj);
                }
            }));
        }
    }
}

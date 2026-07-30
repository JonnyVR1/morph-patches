package com.p000p1.mobile.putong.core.p004ui.quickaudio.party;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p1.mobile.putong.core.data.QuickChatPartyInvitation;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import l.yb1;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p006l.bkb0;
import p006l.exb0;
import p006l.qib0;
import p006l.x2c0;
import p006l.xwb0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AudioQuickChatPartyInvitationCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public AudioQuickChatPartyInvitationCardView f5162a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5163b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f5164c;

    /* JADX INFO: renamed from: d */
    public VImage f5165d;

    /* JADX INFO: renamed from: e */
    public VText f5166e;

    /* JADX INFO: renamed from: f */
    public VText f5167f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f5168g;

    /* JADX INFO: renamed from: h */
    public VText f5169h;

    /* JADX INFO: renamed from: i */
    public VText f5170i;

    /* JADX INFO: renamed from: j */
    public NewNewHomeFrag f5171j;

    /* JADX INFO: renamed from: k */
    public xwb0 f5172k;

    /* JADX INFO: renamed from: l */
    public boolean f5173l;

    /* JADX INFO: renamed from: m */
    public VirtualCardType f5174m;

    public AudioQuickChatPartyInvitationCardView(@NonNull @NotNull Context context) {
        super(context);
        this.f5173l = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m7879e(View view) {
        yb1.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final String m7880f(QuickChatPartyInvitation quickChatPartyInvitation) {
        StringBuilder sb = new StringBuilder();
        if (quickChatPartyInvitation == null || !quickChatPartyInvitation.isValueAvailable()) {
            sb.append("每周");
            return sb.toString();
        }
        sb.append(m7881h(quickChatPartyInvitation.weekDay));
        int i = quickChatPartyInvitation.beginHour;
        if (i > 9) {
            sb.append(i);
        } else {
            sb.append(0);
            sb.append(quickChatPartyInvitation.beginHour);
        }
        sb.append(":00至");
        int i2 = quickChatPartyInvitation.endHour;
        if (i2 > 9) {
            sb.append(i2);
        } else {
            sb.append(0);
            sb.append(quickChatPartyInvitation.endHour);
        }
        sb.append(":00，限时开启");
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public final String m7881h(int i) {
        switch (i) {
            case 0:
                return "每周日";
            case 1:
                return "每周一";
            case 2:
                return "每周二";
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return "每周三";
            case CameraSticker.STATE_ERROR /* 4 */:
                return "每周四";
            case 5:
                return "每周五";
            case 6:
                return "每周六";
            case 7:
                return "每周日";
            default:
                return "每周";
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7882i() {
        this.f5165d.setImageResource(x2c0.f25936Hn);
        bkb0 bkb0Var = qib0.f19782G;
        VDraweeView vDraweeView = this.f5164c;
        int i = t100.Z;
        bkb0Var.m12738I0(vDraweeView, "https://static.tancdn.com/pe-webplatform/3Sprv2rbsGvUxNUpmnj-9lwF.webp", i, i);
        qib0.f19782G.m12738I0(this.f5163b, "https://static.tancdn.com/pe-webplatform/hTh3ByKmdeJRuvqaA0TNInZj.webp", t100.d(190.0f), t100.d(148.0f));
        qib0.f19782G.m12738I0(this.f5168g, "https://static.tancdn.com/pe-webplatform/gcyXEc-3NM-VdbuEN0wPLIzc.webp", t100.d(299.0f), t100.d(250.0f));
    }

    /* JADX INFO: renamed from: j */
    public final void m7883j() {
        this.f5165d.setImageResource(x2c0.f25967In);
        bkb0 bkb0Var = qib0.f19782G;
        VDraweeView vDraweeView = this.f5164c;
        int i = t100.Z;
        bkb0Var.m12738I0(vDraweeView, "https://static.tancdn.com/pe-webplatform/_DZZOUF4eeLN6ug6QNvVkgTH.webp", i, i);
        qib0.f19782G.m12738I0(this.f5163b, "https://static.tancdn.com/pe-webplatform/G9SeajOtK1zJHOcY3uSSUD5h.webp", t100.d(190.0f), t100.d(148.0f));
        qib0.f19782G.m12738I0(this.f5168g, "https://static.tancdn.com/pe-webplatform/iKiD6UfDTb_pOoQZ2RHTCzP5.webp", t100.d(299.0f), t100.d(250.0f));
    }

    /* JADX INFO: renamed from: k */
    public final void m7884k() {
        if (NullChecker.a(this.f5172k)) {
            VirtualCardType virtualCardType = this.f5172k.f27758d;
            VirtualCardType virtualCardType2 = VirtualCardType.TextQuickChatPartyInvitationCard;
            if (virtualCardType == virtualCardType2) {
                this.f5174m = virtualCardType2;
                m7883j();
                return;
            }
        }
        this.f5174m = VirtualCardType.AudioQuickChatPartyInvitationCard;
        m7882i();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m7885l(xwb0 xwb0Var, NewNewHomeFrag newNewHomeFrag, View view) {
        zvf0.u("e_card_quickchat_activity", "p_suggest_users_home_view", new j760[]{vwb.Y("quickchat_activity_card_type", this.f5174m == VirtualCardType.TextQuickChatPartyInvitationCard ? "quickchat_party" : "voice_quickchat_party")});
        xwb0Var.f27757c = Boolean.TRUE;
        newNewHomeFrag.C.A2().A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: m */
    public void m7886m(final NewNewHomeFrag newNewHomeFrag, final xwb0 xwb0Var) {
        if (newNewHomeFrag == null || xwb0Var == null) {
            return;
        }
        this.f5171j = newNewHomeFrag;
        this.f5172k = xwb0Var;
        m7884k();
        this.f5167f.setText(m7880f(exb0.m14911i().f11491a));
        if (this.f5173l) {
            this.f5173l = false;
            zvf0.A("e_card_quickchat_activity", "p_suggest_users_home_view", new j760[]{vwb.Y("quickchat_activity_card_type", this.f5174m == VirtualCardType.TextQuickChatPartyInvitationCard ? "quickchat_party" : "voice_quickchat_party")});
        }
        xdl0.E0(this.f5170i, new View.OnClickListener() { // from class: l.xb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27435a.m7885l(xwb0Var, newNewHomeFrag, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7879e(this);
        this.f5166e.setTypeface(Typeface.defaultFromStyle(1));
        this.f5170i.setTypeface(Typeface.defaultFromStyle(1));
    }

    public AudioQuickChatPartyInvitationCardView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5173l = true;
    }

    public AudioQuickChatPartyInvitationCardView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5173l = true;
    }
}

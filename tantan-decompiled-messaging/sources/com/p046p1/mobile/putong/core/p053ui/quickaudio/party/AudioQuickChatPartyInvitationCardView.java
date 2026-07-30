package com.p046p1.mobile.putong.core.p053ui.quickaudio.party;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.data.QuickChatPartyInvitation;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.bkb0;
import p149l.exb0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xwb0;
import p149l.yb1;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class AudioQuickChatPartyInvitationCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public AudioQuickChatPartyInvitationCardView f35381a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f35382b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f35383c;

    /* JADX INFO: renamed from: d */
    public VImage f35384d;

    /* JADX INFO: renamed from: e */
    public VText f35385e;

    /* JADX INFO: renamed from: f */
    public VText f35386f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f35387g;

    /* JADX INFO: renamed from: h */
    public VText f35388h;

    /* JADX INFO: renamed from: i */
    public VText f35389i;

    /* JADX INFO: renamed from: j */
    public NewNewHomeFrag f35390j;

    /* JADX INFO: renamed from: k */
    public xwb0 f35391k;

    /* JADX INFO: renamed from: l */
    public boolean f35392l;

    /* JADX INFO: renamed from: m */
    public VirtualCardType f35393m;

    public AudioQuickChatPartyInvitationCardView(@NonNull @NotNull Context context) {
        super(context);
        this.f35392l = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m54536e(View view) {
        yb1.m213875a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final String m54537f(QuickChatPartyInvitation quickChatPartyInvitation) {
        StringBuilder sb = new StringBuilder();
        if (quickChatPartyInvitation == null || !quickChatPartyInvitation.isValueAvailable()) {
            sb.append("每周");
            return sb.toString();
        }
        sb.append(m54538h(quickChatPartyInvitation.weekDay));
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
    public final String m54538h(int i) {
        switch (i) {
            case 0:
                return "每周日";
            case 1:
                return "每周一";
            case 2:
                return "每周二";
            case 3:
                return "每周三";
            case 4:
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
    public final void m54539i() {
        this.f35384d.setImageResource(x2c0.f189400Hn);
        bkb0 bkb0Var = qib0.f154691G;
        VDraweeView vDraweeView = this.f35383c;
        int i = t100.f167251Z;
        bkb0Var.m102325I0(vDraweeView, "https://static.tancdn.com/pe-webplatform/3Sprv2rbsGvUxNUpmnj-9lwF.webp", i, i);
        qib0.f154691G.m102325I0(this.f35382b, "https://static.tancdn.com/pe-webplatform/hTh3ByKmdeJRuvqaA0TNInZj.webp", t100.m186890d(190.0f), t100.m186890d(148.0f));
        qib0.f154691G.m102325I0(this.f35387g, "https://static.tancdn.com/pe-webplatform/gcyXEc-3NM-VdbuEN0wPLIzc.webp", t100.m186890d(299.0f), t100.m186890d(250.0f));
    }

    /* JADX INFO: renamed from: j */
    public final void m54540j() {
        this.f35384d.setImageResource(x2c0.f189431In);
        bkb0 bkb0Var = qib0.f154691G;
        VDraweeView vDraweeView = this.f35383c;
        int i = t100.f167251Z;
        bkb0Var.m102325I0(vDraweeView, "https://static.tancdn.com/pe-webplatform/_DZZOUF4eeLN6ug6QNvVkgTH.webp", i, i);
        qib0.f154691G.m102325I0(this.f35382b, "https://static.tancdn.com/pe-webplatform/G9SeajOtK1zJHOcY3uSSUD5h.webp", t100.m186890d(190.0f), t100.m186890d(148.0f));
        qib0.f154691G.m102325I0(this.f35387g, "https://static.tancdn.com/pe-webplatform/iKiD6UfDTb_pOoQZ2RHTCzP5.webp", t100.m186890d(299.0f), t100.m186890d(250.0f));
    }

    /* JADX INFO: renamed from: k */
    public final void m54541k() {
        if (NullChecker.m81303a(this.f35391k)) {
            VirtualCardType virtualCardType = this.f35391k.f194723d;
            VirtualCardType virtualCardType2 = VirtualCardType.TextQuickChatPartyInvitationCard;
            if (virtualCardType == virtualCardType2) {
                this.f35393m = virtualCardType2;
                m54540j();
                return;
            }
        }
        this.f35393m = VirtualCardType.AudioQuickChatPartyInvitationCard;
        m54539i();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m54542l(xwb0 xwb0Var, NewNewHomeFrag newNewHomeFrag, View view) {
        zvf0.m220399u("e_card_quickchat_activity", "p_suggest_users_home_view", vwb.m200311Y("quickchat_activity_card_type", this.f35393m == VirtualCardType.TextQuickChatPartyInvitationCard ? "quickchat_party" : "voice_quickchat_party"));
        xwb0Var.f194722c = Boolean.TRUE;
        newNewHomeFrag.f21678C.m37125A2().mo38801A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: m */
    public void m54543m(final NewNewHomeFrag newNewHomeFrag, final xwb0 xwb0Var) {
        if (newNewHomeFrag == null || xwb0Var == null) {
            return;
        }
        this.f35390j = newNewHomeFrag;
        this.f35391k = xwb0Var;
        m54541k();
        this.f35386f.setText(m54537f(exb0.m118586i().f93591a));
        if (this.f35392l) {
            this.f35392l = false;
            zvf0.m220368A("e_card_quickchat_activity", "p_suggest_users_home_view", vwb.m200311Y("quickchat_activity_card_type", this.f35393m == VirtualCardType.TextQuickChatPartyInvitationCard ? "quickchat_party" : "voice_quickchat_party"));
        }
        xdl0.m208329E0(this.f35389i, new View.OnClickListener() { // from class: l.xb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191858a.m54542l(xwb0Var, newNewHomeFrag, view);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54536e(this);
        this.f35385e.setTypeface(Typeface.defaultFromStyle(1));
        this.f35389i.setTypeface(Typeface.defaultFromStyle(1));
    }

    public AudioQuickChatPartyInvitationCardView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35392l = true;
    }

    public AudioQuickChatPartyInvitationCardView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35392l = true;
    }
}

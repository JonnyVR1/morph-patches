package com.p051p1.mobile.putong.core.p058ui.quickaudio.party;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.data.QuickChatPartyInvitation;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.b5c0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.fc1;
import p153l.fsb0;
import p153l.i4g0;
import p153l.i5c0;
import p153l.jyb;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class AudioQuickChatPartyInvitationCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public AudioQuickChatPartyInvitationCardView f36229a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f36230b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f36231c;

    /* JADX INFO: renamed from: d */
    public VImage f36232d;

    /* JADX INFO: renamed from: e */
    public VText f36233e;

    /* JADX INFO: renamed from: f */
    public VText f36234f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f36235g;

    /* JADX INFO: renamed from: h */
    public VText f36236h;

    /* JADX INFO: renamed from: i */
    public VText f36237i;

    /* JADX INFO: renamed from: j */
    public NewNewHomeFrag f36238j;

    /* JADX INFO: renamed from: k */
    public b5c0 f36239k;

    /* JADX INFO: renamed from: l */
    public boolean f36240l;

    /* JADX INFO: renamed from: m */
    public VirtualCardType f36241m;

    public AudioQuickChatPartyInvitationCardView(@NonNull @NotNull Context context) {
        super(context);
        this.f36240l = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m55719e(View view) {
        fc1.m124970a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final String m55720f(QuickChatPartyInvitation quickChatPartyInvitation) {
        StringBuilder sb = new StringBuilder();
        if (quickChatPartyInvitation == null || !quickChatPartyInvitation.isValueAvailable()) {
            sb.append("每周");
            return sb.toString();
        }
        sb.append(m55721h(quickChatPartyInvitation.weekDay));
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
    public final String m55721h(int i) {
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
    public final void m55722i() {
        this.f36232d.setImageResource(dbc0.f87554wo);
        fsb0 fsb0Var = uqb0.f180374G;
        VDraweeView vDraweeView = this.f36231c;
        int i = qa00.f156313Z;
        fsb0Var.m127109I0(vDraweeView, "https://static.tancdn.com/pe-webplatform/3Sprv2rbsGvUxNUpmnj-9lwF.webp", i, i);
        uqb0.f180374G.m127109I0(this.f36230b, "https://static.tancdn.com/pe-webplatform/hTh3ByKmdeJRuvqaA0TNInZj.webp", qa00.m175859d(190.0f), qa00.m175859d(148.0f));
        uqb0.f180374G.m127109I0(this.f36235g, "https://static.tancdn.com/pe-webplatform/gcyXEc-3NM-VdbuEN0wPLIzc.webp", qa00.m175859d(299.0f), qa00.m175859d(250.0f));
    }

    /* JADX INFO: renamed from: j */
    public final void m55723j() {
        this.f36232d.setImageResource(dbc0.f87586xo);
        fsb0 fsb0Var = uqb0.f180374G;
        VDraweeView vDraweeView = this.f36231c;
        int i = qa00.f156313Z;
        fsb0Var.m127109I0(vDraweeView, "https://static.tancdn.com/pe-webplatform/_DZZOUF4eeLN6ug6QNvVkgTH.webp", i, i);
        uqb0.f180374G.m127109I0(this.f36230b, "https://static.tancdn.com/pe-webplatform/G9SeajOtK1zJHOcY3uSSUD5h.webp", qa00.m175859d(190.0f), qa00.m175859d(148.0f));
        uqb0.f180374G.m127109I0(this.f36235g, "https://static.tancdn.com/pe-webplatform/iKiD6UfDTb_pOoQZ2RHTCzP5.webp", qa00.m175859d(299.0f), qa00.m175859d(250.0f));
    }

    /* JADX INFO: renamed from: k */
    public final void m55724k() {
        if (NullChecker.m82486a(this.f36239k)) {
            VirtualCardType virtualCardType = this.f36239k.f75050d;
            VirtualCardType virtualCardType2 = VirtualCardType.TextQuickChatPartyInvitationCard;
            if (virtualCardType == virtualCardType2) {
                this.f36241m = virtualCardType2;
                m55723j();
                return;
            }
        }
        this.f36241m = VirtualCardType.AudioQuickChatPartyInvitationCard;
        m55722i();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m55725l(b5c0 b5c0Var, NewNewHomeFrag newNewHomeFrag, View view) {
        i4g0.m138523u("e_card_quickchat_activity", "p_suggest_users_home_view", jyb.m147494Y("quickchat_activity_card_type", this.f36241m == VirtualCardType.TextQuickChatPartyInvitationCard ? "quickchat_party" : "voice_quickchat_party"));
        b5c0Var.f75049c = Boolean.TRUE;
        newNewHomeFrag.f22420C.m38128A2().mo39804A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: m */
    public void m55726m(final NewNewHomeFrag newNewHomeFrag, final b5c0 b5c0Var) {
        if (newNewHomeFrag == null || b5c0Var == null) {
            return;
        }
        this.f36238j = newNewHomeFrag;
        this.f36239k = b5c0Var;
        m55724k();
        this.f36234f.setText(m55720f(i5c0.m138650i().f113028a));
        if (this.f36240l) {
            this.f36240l = false;
            i4g0.m138492A("e_card_quickchat_activity", "p_suggest_users_home_view", jyb.m147494Y("quickchat_activity_card_type", this.f36241m == VirtualCardType.TextQuickChatPartyInvitationCard ? "quickchat_party" : "voice_quickchat_party"));
        }
        bnl0.m105509E0(this.f36237i, new View.OnClickListener() { // from class: l.ec1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92999a.m55725l(b5c0Var, newNewHomeFrag, view);
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
        m55719e(this);
        this.f36233e.setTypeface(Typeface.defaultFromStyle(1));
        this.f36237i.setTypeface(Typeface.defaultFromStyle(1));
    }

    public AudioQuickChatPartyInvitationCardView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36240l = true;
    }

    public AudioQuickChatPartyInvitationCardView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36240l = true;
    }
}

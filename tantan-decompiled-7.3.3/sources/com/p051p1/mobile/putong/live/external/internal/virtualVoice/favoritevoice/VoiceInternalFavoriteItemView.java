package com.p051p1.mobile.putong.live.external.internal.virtualVoice.favoritevoice;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p051p1.mobile.putong.p070ui.MultipleChatIconView;
import p151v.VText;
import p153l.bnl0;
import p153l.fc2;
import p153l.i4g0;
import p153l.jnn0;
import p153l.jyb;
import p153l.n3d0;
import p153l.pzi0;
import p153l.qa00;
import p153l.z91;
import p153l.zeu;

/* JADX INFO: loaded from: classes9.dex */
public class VoiceInternalFavoriteItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MultipleChatIconView f46338d;

    /* JADX INFO: renamed from: e */
    public LiveMainlandTagView f46339e;

    /* JADX INFO: renamed from: f */
    public TextView f46340f;

    /* JADX INFO: renamed from: g */
    public VText f46341g;

    /* JADX INFO: renamed from: h */
    public VText f46342h;

    /* JADX INFO: renamed from: i */
    public VText f46343i;

    public VoiceInternalFavoriteItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m71038i0(View view) {
        jnn0.m146281a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m71039j0(int i, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        getContext().startActivity(z91.m219041a(getContext(), AudienceStartData.getBuilder().m68777E(virtualVoiceGroupConversationCell.roomInfo.liveId).m68789Q(true).m68794u()));
        i4g0.m138523u("e_live_audio_room_enter", zeu.f204080g, jyb.m147494Y("anchorId", virtualVoiceGroupConversationCell.roomInfo.anchorId), jyb.m147494Y("roomId", virtualVoiceGroupConversationCell.roomInfo.roomId), jyb.m147494Y("liveId", virtualVoiceGroupConversationCell.roomInfo.liveId), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i)), jyb.m147494Y("audio_card_type", "liked_audio_room"), jyb.m147494Y("liveStatus", virtualVoiceGroupConversationCell.roomInfo.isLiving ? "onLive" : "endLive"));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m71040k0(int i, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, View view) {
        m71039j0(i, virtualVoiceGroupConversationCell);
    }

    /* JADX INFO: renamed from: l0 */
    public void m71041l0(final int i, final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        this.f46338d.setRadius(55.0f);
        this.f46338d.m80580p0(virtualVoiceGroupConversationCell.roomInfo.avatars, false);
        this.f46340f.setText(virtualVoiceGroupConversationCell.roomInfo.title);
        String str = virtualVoiceGroupConversationCell.roomInfo.roomStateText;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) " · ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(n3d0.m161283g(virtualVoiceGroupConversationCell.roomInfo.roomStateTextColor)), 0, spannableStringBuilder.length(), 34);
        }
        if (!TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.commonMsg)) {
            spannableStringBuilder.append((CharSequence) virtualVoiceGroupConversationCell.chatInfo.commonMsg);
        }
        this.f46341g.setText(spannableStringBuilder.toString());
        boolean z = virtualVoiceGroupConversationCell.roomInfo.isLiving;
        VText vText = this.f46342h;
        if (z) {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f46343i, true);
            bnl0.m105524M(this.f46339e, true);
            bnl0.m105539W(this.f46341g, qa00.m175859d(84.0f));
            this.f46339e.setBackground(fc2.m124980j(Color.parseColor("#41d2FF"), Color.parseColor("#279Aff"), 5));
            this.f46339e.m69931c(-1, -1);
        } else {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f46343i, false);
            bnl0.m105524M(this.f46339e, false);
            bnl0.m105539W(this.f46341g, qa00.m175859d(16.0f));
            this.f46342h.setText(pzi0.m174442G(virtualVoiceGroupConversationCell.chatInfo.currentTime));
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.inn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115983a.m71040k0(i, virtualVoiceGroupConversationCell, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71038i0(this);
    }

    public VoiceInternalFavoriteItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceInternalFavoriteItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

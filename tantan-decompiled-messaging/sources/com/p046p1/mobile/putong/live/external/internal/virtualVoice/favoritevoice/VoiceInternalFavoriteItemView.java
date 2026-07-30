package com.p046p1.mobile.putong.live.external.internal.virtualVoice.favoritevoice;

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
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p046p1.mobile.putong.p065ui.MultipleChatIconView;
import p147v.VText;
import p149l.fen0;
import p149l.kvc0;
import p149l.mqi0;
import p149l.s91;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.yb2;
import p149l.ycu;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceInternalFavoriteItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MultipleChatIconView f45490d;

    /* JADX INFO: renamed from: e */
    public LiveMainlandTagView f45491e;

    /* JADX INFO: renamed from: f */
    public TextView f45492f;

    /* JADX INFO: renamed from: g */
    public VText f45493g;

    /* JADX INFO: renamed from: h */
    public VText f45494h;

    /* JADX INFO: renamed from: i */
    public VText f45495i;

    public VoiceInternalFavoriteItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m69855i0(View view) {
        fen0.m121059a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m69856j0(int i, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        getContext().startActivity(s91.m182688a(getContext(), AudienceStartData.getBuilder().m67594E(virtualVoiceGroupConversationCell.roomInfo.liveId).m67606Q(true).m67611u()));
        zvf0.m220399u("e_live_audio_room_enter", ycu.f197489g, vwb.m200311Y("anchorId", virtualVoiceGroupConversationCell.roomInfo.anchorId), vwb.m200311Y("roomId", virtualVoiceGroupConversationCell.roomInfo.roomId), vwb.m200311Y("liveId", virtualVoiceGroupConversationCell.roomInfo.liveId), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i)), vwb.m200311Y("audio_card_type", "liked_audio_room"), vwb.m200311Y("liveStatus", virtualVoiceGroupConversationCell.roomInfo.isLiving ? "onLive" : "endLive"));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m69857k0(int i, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, View view) {
        m69856j0(i, virtualVoiceGroupConversationCell);
    }

    /* JADX INFO: renamed from: l0 */
    public void m69858l0(final int i, final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        this.f45490d.setRadius(55.0f);
        this.f45490d.m79397p0(virtualVoiceGroupConversationCell.roomInfo.avatars, false);
        this.f45492f.setText(virtualVoiceGroupConversationCell.roomInfo.title);
        String str = virtualVoiceGroupConversationCell.roomInfo.roomStateText;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) " · ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(kvc0.m147358g(virtualVoiceGroupConversationCell.roomInfo.roomStateTextColor)), 0, spannableStringBuilder.length(), 34);
        }
        if (!TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.commonMsg)) {
            spannableStringBuilder.append((CharSequence) virtualVoiceGroupConversationCell.chatInfo.commonMsg);
        }
        this.f45493g.setText(spannableStringBuilder.toString());
        boolean z = virtualVoiceGroupConversationCell.roomInfo.isLiving;
        VText vText = this.f45494h;
        if (z) {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f45495i, true);
            xdl0.m208344M(this.f45491e, true);
            xdl0.m208359W(this.f45493g, t100.m186890d(84.0f));
            this.f45491e.setBackground(yb2.m213885j(Color.parseColor("#41d2FF"), Color.parseColor("#279Aff"), 5));
            this.f45491e.m68748c(-1, -1);
        } else {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f45495i, false);
            xdl0.m208344M(this.f45491e, false);
            xdl0.m208359W(this.f45493g, t100.m186890d(16.0f));
            this.f45494h.setText(mqi0.m155932G(virtualVoiceGroupConversationCell.chatInfo.currentTime));
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.een0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90755a.m69857k0(i, virtualVoiceGroupConversationCell, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69855i0(this);
    }

    public VoiceInternalFavoriteItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceInternalFavoriteItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

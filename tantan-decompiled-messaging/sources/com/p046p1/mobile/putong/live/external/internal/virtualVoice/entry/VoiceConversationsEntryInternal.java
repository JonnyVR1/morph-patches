package com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.view.VoiceConversationsEntryAvatarView;
import p147v.VImage;
import p147v.VMarqueeText;
import p147v.VText;
import p149l.h3c0;
import p149l.i2n0;
import p149l.l9s;
import p149l.s7m;
import p149l.s9s;
import p149l.t100;
import p149l.v1n0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceConversationsEntryInternal extends FrameLayout implements s7m<i2n0> {
    public Guideline _avatar_guide;
    public ConstraintLayout _container_layout;
    public VoiceConversationsEntryInternal _conversation_entry_all_layout;
    public VoiceConversationsEntryAvatarView _dynamic_avatars;
    public VText _num_red_dot;
    public VImage _red_dot;
    public VoiceEntryAvatarLayout _tag_avatars;
    public FrameLayout _tag_group;
    public TextView _tag_group_tag;
    public VMarqueeText _voice_des;
    public TextView _voice_title;
    private final int blueEndColor;
    private final int blueStartColor;
    private LiveVoiceInternalEntryBean info;
    private final int newBlueColor;
    private final int orangeEndColor;
    private final int orangeStartColor;
    private i2n0 presenter;

    public VoiceConversationsEntryInternal(@NonNull Context context) {
        super(context);
        this.blueStartColor = Color.parseColor("#41d2ff");
        this.blueEndColor = Color.parseColor("#279aff");
        this.orangeStartColor = Color.parseColor("#fdb04d");
        this.orangeEndColor = Color.parseColor("#fdbe52");
        this.newBlueColor = Color.parseColor("#00aaff");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m69839f(View view) {
        i2n0 i2n0Var = this.presenter;
        if (i2n0Var != null) {
            i2n0Var.m134074o0(getContext(), this.info);
        }
        m69851q();
    }

    /* JADX INFO: renamed from: m */
    private void m69840m() {
        xdl0.m208344M(this, true);
        xdl0.m208344M(this._tag_group, false);
        xdl0.m208344M(this._tag_avatars, false);
        xdl0.m208344M(this._dynamic_avatars, false);
    }

    /* JADX INFO: renamed from: n */
    private void m69841n() {
        xdl0.m208329E0(this._container_layout, new View.OnClickListener() { // from class: l.u1n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173035a.m69839f(view);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m69842b(View view) {
        v1n0.m196647a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(i2n0 i2n0Var) {
        this.presenter = i2n0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m69844d(VoiceConversationsEntryInternal voiceConversationsEntryInternal) {
        m69842b(this);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m69845e(boolean z) {
        xdl0.m208344M(this._conversation_entry_all_layout, z);
    }

    /* JADX INFO: renamed from: i */
    public final void m69846i(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        xdl0.m208344M(this._tag_avatars, false);
        xdl0.m208344M(this._tag_group, false);
        xdl0.m208344M(this._dynamic_avatars, true);
        if (TextUtils.equals(liveVoiceInternalEntryBean.getTitle(), this._voice_title.getText()) && TextUtils.equals(liveVoiceInternalEntryBean.getSubTitle(), this._voice_des.getText()) && !this._dynamic_avatars.m69906h()) {
            return;
        }
        this._dynamic_avatars.m69908j();
        if (liveVoiceInternalEntryBean.getHeadSculptureList() == null) {
            return;
        }
        this._voice_title.setText(liveVoiceInternalEntryBean.getTitle());
        this._voice_des.setText(liveVoiceInternalEntryBean.getSubTitle());
        if (l9s.m149078h()) {
            VoiceConversationsEntryAvatarView voiceConversationsEntryAvatarView = this._dynamic_avatars;
            int i = this.newBlueColor;
            voiceConversationsEntryAvatarView.m69909k(i, i);
        } else {
            boolean zEquals = TextUtils.equals(liveVoiceInternalEntryBean.getBgStyle(), LiveVoiceInternalEntryBean.TYPE_BG_STYLE_ORANGE);
            VoiceConversationsEntryAvatarView voiceConversationsEntryAvatarView2 = this._dynamic_avatars;
            if (zEquals) {
                voiceConversationsEntryAvatarView2.m69909k(this.orangeStartColor, this.orangeEndColor);
            } else {
                voiceConversationsEntryAvatarView2.m69909k(this.blueStartColor, this.blueEndColor);
            }
        }
        this._dynamic_avatars.m69910l(act(), liveVoiceInternalEntryBean.getHeadSculptureList());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m69847j() {
        if (this.info == null) {
            xdl0.m208344M(this, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m69848k(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        this._voice_title.setText(liveVoiceInternalEntryBean.getTitle());
        this._voice_des.setText(liveVoiceInternalEntryBean.getSubTitle());
        xdl0.m208344M(this._tag_avatars, true);
        xdl0.m208344M(this._tag_group, true);
        xdl0.m208344M(this._dynamic_avatars, false);
        VoiceConversationsEntryAvatarView voiceConversationsEntryAvatarView = this._dynamic_avatars;
        if (voiceConversationsEntryAvatarView != null) {
            voiceConversationsEntryAvatarView.m69908j();
        }
        this._tag_avatars.m69852h0(vwb.m200334k0(liveVoiceInternalEntryBean.getHeadSculptureList(), 4), 44.0f);
        LiveCardTracker.trackMv(liveVoiceInternalEntryBean.getTrackData());
    }

    /* JADX INFO: renamed from: l */
    public void m69849l(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        int i;
        m69845e(true);
        this.info = liveVoiceInternalEntryBean;
        m69840m();
        setRedDot(liveVoiceInternalEntryBean);
        if (l9s.m149078h()) {
            i = h3c0.f105595A0;
        } else {
            i = TextUtils.equals(liveVoiceInternalEntryBean.getBgStyle(), LiveVoiceInternalEntryBean.TYPE_BG_STYLE_ORANGE) ? h3c0.f105724y0 : h3c0.f105727z0;
        }
        this._container_layout.setBackgroundResource(i);
        this._tag_avatars.m69853i0(liveVoiceInternalEntryBean.getLabel());
        boolean zIsEmpty = TextUtils.isEmpty(liveVoiceInternalEntryBean.getLabel());
        FrameLayout frameLayout = this._tag_group;
        if (zIsEmpty) {
            xdl0.m208344M(frameLayout, false);
            xdl0.m208344M(this._tag_group_tag, false);
        } else {
            xdl0.m208344M(frameLayout, true);
            xdl0.m208344M(this._tag_group_tag, true);
            this._tag_group_tag.setText(liveVoiceInternalEntryBean.getLabel());
            this._tag_group_tag.setBackgroundResource(TextUtils.equals(liveVoiceInternalEntryBean.getBgStyle(), LiveVoiceInternalEntryBean.TYPE_BG_STYLE_ORANGE) ? h3c0.f105696p : h3c0.f105666f);
        }
        if (TextUtils.equals(liveVoiceInternalEntryBean.getImageStyle(), LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_STATIC)) {
            m69848k(liveVoiceInternalEntryBean);
        } else {
            m69846i(liveVoiceInternalEntryBean);
        }
        zvf0.m220403y("e_voice_chat", OMSDialogPositon.p_messages_view, liveVoiceInternalEntryBean.getTrackData());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69844d(this);
        m69841n();
    }

    /* JADX INFO: renamed from: p */
    public final void m69850p(VText vText, boolean z) {
        if (z) {
            xdl0.m208358V(vText, t100.m186890d(0.0f));
        } else {
            xdl0.m208358V(vText, t100.m186890d(3.0f));
        }
    }

    /* JADX INFO: renamed from: q */
    public void m69851q() {
        LiveVoiceInternalEntryBean liveVoiceInternalEntryBean = this.info;
        if (liveVoiceInternalEntryBean == null) {
            return;
        }
        zvf0.m220397s("e_voice_chat", OMSDialogPositon.p_messages_view, liveVoiceInternalEntryBean.getTrackData());
    }

    public void setRedDot(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        int unreadShowNumber = liveVoiceInternalEntryBean.getUnreadShowNumber();
        if (!s9s.f163228b.m195753V5()) {
            xdl0.m208344M(this._num_red_dot, false);
            xdl0.m208344M(this._red_dot, liveVoiceInternalEntryBean.getHasRedSpot());
            return;
        }
        if (unreadShowNumber >= 0 && unreadShowNumber <= 99) {
            m69850p(this._num_red_dot, false);
            this._num_red_dot.setText(String.valueOf(unreadShowNumber));
        } else if (unreadShowNumber > 99) {
            m69850p(this._num_red_dot, true);
            this._num_red_dot.setText("99+");
        }
        xdl0.m208344M(this._num_red_dot, unreadShowNumber > 0);
        xdl0.m208344M(this._red_dot, false);
    }

    public VoiceConversationsEntryInternal(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.blueStartColor = Color.parseColor("#41d2ff");
        this.blueEndColor = Color.parseColor("#279aff");
        this.orangeStartColor = Color.parseColor("#fdb04d");
        this.orangeEndColor = Color.parseColor("#fdbe52");
        this.newBlueColor = Color.parseColor("#00aaff");
    }
}

package com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry;

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
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.view.VoiceConversationsEntryAvatarView;
import p151v.VImage;
import p151v.VMarqueeText;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.iam;
import p153l.jyb;
import p153l.mbn0;
import p153l.mbs;
import p153l.nbc0;
import p153l.qa00;
import p153l.tbs;
import p153l.zan0;

/* JADX INFO: loaded from: classes9.dex */
public class VoiceConversationsEntryInternal extends FrameLayout implements iam<mbn0> {
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
    private mbn0 presenter;

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
    public /* synthetic */ void m71022f(View view) {
        mbn0 mbn0Var = this.presenter;
        if (mbn0Var != null) {
            mbn0Var.m157808o0(getContext(), this.info);
        }
        m71034q();
    }

    /* JADX INFO: renamed from: m */
    private void m71023m() {
        bnl0.m105524M(this, true);
        bnl0.m105524M(this._tag_group, false);
        bnl0.m105524M(this._tag_avatars, false);
        bnl0.m105524M(this._dynamic_avatars, false);
    }

    /* JADX INFO: renamed from: n */
    private void m71024n() {
        bnl0.m105509E0(this._container_layout, new View.OnClickListener() { // from class: l.yan0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198226a.m71022f(view);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m71025b(View view) {
        zan0.m219130a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(mbn0 mbn0Var) {
        this.presenter = mbn0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m71027d(VoiceConversationsEntryInternal voiceConversationsEntryInternal) {
        m71025b(this);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m71028e(boolean z) {
        bnl0.m105524M(this._conversation_entry_all_layout, z);
    }

    /* JADX INFO: renamed from: i */
    public final void m71029i(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        bnl0.m105524M(this._tag_avatars, false);
        bnl0.m105524M(this._tag_group, false);
        bnl0.m105524M(this._dynamic_avatars, true);
        if (TextUtils.equals(liveVoiceInternalEntryBean.getTitle(), this._voice_title.getText()) && TextUtils.equals(liveVoiceInternalEntryBean.getSubTitle(), this._voice_des.getText()) && !this._dynamic_avatars.m71089h()) {
            return;
        }
        this._dynamic_avatars.m71091j();
        if (liveVoiceInternalEntryBean.getHeadSculptureList() == null) {
            return;
        }
        this._voice_title.setText(liveVoiceInternalEntryBean.getTitle());
        this._voice_des.setText(liveVoiceInternalEntryBean.getSubTitle());
        if (mbs.m157855h()) {
            VoiceConversationsEntryAvatarView voiceConversationsEntryAvatarView = this._dynamic_avatars;
            int i = this.newBlueColor;
            voiceConversationsEntryAvatarView.m71092k(i, i);
        } else {
            boolean zEquals = TextUtils.equals(liveVoiceInternalEntryBean.getBgStyle(), LiveVoiceInternalEntryBean.TYPE_BG_STYLE_ORANGE);
            VoiceConversationsEntryAvatarView voiceConversationsEntryAvatarView2 = this._dynamic_avatars;
            if (zEquals) {
                voiceConversationsEntryAvatarView2.m71092k(this.orangeStartColor, this.orangeEndColor);
            } else {
                voiceConversationsEntryAvatarView2.m71092k(this.blueStartColor, this.blueEndColor);
            }
        }
        this._dynamic_avatars.m71093l(act(), liveVoiceInternalEntryBean.getHeadSculptureList());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m71030j() {
        if (this.info == null) {
            bnl0.m105524M(this, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m71031k(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        this._voice_title.setText(liveVoiceInternalEntryBean.getTitle());
        this._voice_des.setText(liveVoiceInternalEntryBean.getSubTitle());
        bnl0.m105524M(this._tag_avatars, true);
        bnl0.m105524M(this._tag_group, true);
        bnl0.m105524M(this._dynamic_avatars, false);
        VoiceConversationsEntryAvatarView voiceConversationsEntryAvatarView = this._dynamic_avatars;
        if (voiceConversationsEntryAvatarView != null) {
            voiceConversationsEntryAvatarView.m71091j();
        }
        this._tag_avatars.m71035h0(jyb.m147517k0(liveVoiceInternalEntryBean.getHeadSculptureList(), 4), 44.0f);
        LiveCardTracker.trackMv(liveVoiceInternalEntryBean.getTrackData());
    }

    /* JADX INFO: renamed from: l */
    public void m71032l(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        int i;
        m71028e(true);
        this.info = liveVoiceInternalEntryBean;
        m71023m();
        setRedDot(liveVoiceInternalEntryBean);
        if (mbs.m157855h()) {
            i = nbc0.f141086A0;
        } else {
            i = TextUtils.equals(liveVoiceInternalEntryBean.getBgStyle(), LiveVoiceInternalEntryBean.TYPE_BG_STYLE_ORANGE) ? nbc0.f141215y0 : nbc0.f141218z0;
        }
        this._container_layout.setBackgroundResource(i);
        this._tag_avatars.m71036i0(liveVoiceInternalEntryBean.getLabel());
        boolean zIsEmpty = TextUtils.isEmpty(liveVoiceInternalEntryBean.getLabel());
        FrameLayout frameLayout = this._tag_group;
        if (zIsEmpty) {
            bnl0.m105524M(frameLayout, false);
            bnl0.m105524M(this._tag_group_tag, false);
        } else {
            bnl0.m105524M(frameLayout, true);
            bnl0.m105524M(this._tag_group_tag, true);
            this._tag_group_tag.setText(liveVoiceInternalEntryBean.getLabel());
            this._tag_group_tag.setBackgroundResource(TextUtils.equals(liveVoiceInternalEntryBean.getBgStyle(), LiveVoiceInternalEntryBean.TYPE_BG_STYLE_ORANGE) ? nbc0.f141187p : nbc0.f141157f);
        }
        if (TextUtils.equals(liveVoiceInternalEntryBean.getImageStyle(), LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_STATIC)) {
            m71031k(liveVoiceInternalEntryBean);
        } else {
            m71029i(liveVoiceInternalEntryBean);
        }
        i4g0.m138527y("e_voice_chat", OMSDialogPositon.p_messages_view, liveVoiceInternalEntryBean.getTrackData());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71027d(this);
        m71024n();
    }

    /* JADX INFO: renamed from: p */
    public final void m71033p(VText vText, boolean z) {
        if (z) {
            bnl0.m105538V(vText, qa00.m175859d(0.0f));
        } else {
            bnl0.m105538V(vText, qa00.m175859d(3.0f));
        }
    }

    /* JADX INFO: renamed from: q */
    public void m71034q() {
        LiveVoiceInternalEntryBean liveVoiceInternalEntryBean = this.info;
        if (liveVoiceInternalEntryBean == null) {
            return;
        }
        i4g0.m138521s("e_voice_chat", OMSDialogPositon.p_messages_view, liveVoiceInternalEntryBean.getTrackData());
    }

    public void setRedDot(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        int unreadShowNumber = liveVoiceInternalEntryBean.getUnreadShowNumber();
        if (!tbs.f172989b.m203540V5()) {
            bnl0.m105524M(this._num_red_dot, false);
            bnl0.m105524M(this._red_dot, liveVoiceInternalEntryBean.getHasRedSpot());
            return;
        }
        if (unreadShowNumber >= 0 && unreadShowNumber <= 99) {
            m71033p(this._num_red_dot, false);
            this._num_red_dot.setText(String.valueOf(unreadShowNumber));
        } else if (unreadShowNumber > 99) {
            m71033p(this._num_red_dot, true);
            this._num_red_dot.setText("99+");
        }
        bnl0.m105524M(this._num_red_dot, unreadShowNumber > 0);
        bnl0.m105524M(this._red_dot, false);
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

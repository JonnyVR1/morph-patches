package com.p051p1.mobile.putong.core.newui.newmeet.header;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p051p1.mobile.putong.core.data.LiveType;
import com.p051p1.mobile.putong.core.newui.newmeet.header.MeetStateHeaderItem;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dby;
import p153l.fsb0;
import p153l.gbc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.qa00;
import p153l.ufy;
import p153l.uqb0;
import p153l.wfy;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class MeetStateHeaderItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f27068c;

    /* JADX INFO: renamed from: d */
    public VIcon f27069d;

    /* JADX INFO: renamed from: e */
    public VText f27070e;

    /* JADX INFO: renamed from: f */
    public VText f27071f;

    /* JADX INFO: renamed from: g */
    public MeetLiveItemData f27072g;

    /* JADX INFO: renamed from: h */
    public long f27073h;

    public MeetStateHeaderItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27073h = 0L;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ boolean m44043P(y20 y20Var, View view) {
        y20Var.call(view);
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final void m44044Q(View view) {
        wfy.m206173a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m44045R(MeetLiveItemData meetLiveItemData, y20<View> y20Var, y20<View> y20Var2) {
        String str;
        int i;
        String str2;
        this.f27072g = meetLiveItemData;
        if (!meetLiveItemData.isAnonymous() || jyb.m147479J(meetLiveItemData.user.profile.extensions.live.voiceImgUrl)) {
            str = (NullChecker.m82486a(meetLiveItemData.user) && meetLiveItemData.user.hasPic()) ? meetLiveItemData.user.picture(0).url : null;
        } else {
            str = meetLiveItemData.user.profile.extensions.live.voiceImgUrl.get(0);
        }
        String str3 = str;
        if (meetLiveItemData.isFollowed()) {
            i = gbc0.f103191R0;
        } else if (meetLiveItemData.isMatched()) {
            i = gbc0.f103212U0;
        } else if (meetLiveItemData.isSuperLikedMe()) {
            i = gbc0.f103226W0;
        } else if (meetLiveItemData.isLikedUser()) {
            i = gbc0.f103198S0;
        } else if (meetLiveItemData.isPicksUser()) {
            i = gbc0.f103219V0;
        } else {
            i = meetLiveItemData.isSeeUser() ? gbc0.f103205T0 : -1;
        }
        int i2 = i;
        if (meetLiveItemData.getItem().liveType == LiveType.get("live")) {
            str2 = "直播中";
        } else {
            str2 = meetLiveItemData.getItem().liveType == LiveType.get(LiveType.liveVoice) ? "语聊中" : "无状态";
        }
        m44046S(str3, i2, meetLiveItemData.user.name, str2, y20Var, y20Var2);
    }

    /* JADX INFO: renamed from: S */
    public final void m44046S(String str, int i, String str2, String str3, y20<View> y20Var, final y20<View> y20Var2) {
        if (!TextUtils.isEmpty(str)) {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f27068c;
            int i2 = qa00.f156291D;
            fsb0Var.m127109I0(vDraweeView, str, i2, i2);
        }
        this.f27070e.setText(str2);
        this.f27071f.setText(str3);
        Objects.requireNonNull(y20Var);
        setOnClickListener(new ufy(y20Var));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.vfy
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return MeetStateHeaderItem.m44043P(y20Var2, view);
            }
        });
        VIcon vIcon = this.f27069d;
        if (i <= 0) {
            bnl0.m105524M(vIcon, false);
        } else {
            bnl0.m105524M(vIcon, true);
            this.f27069d.setImageResource(i);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m44047T() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f27073h;
        if (NullChecker.m82486a(this.f27072g) && TEnum.equals(this.f27072g.getItem().liveType, "live") && NullChecker.m82486a(this.f27072g.user) && jCurrentTimeMillis >= 500) {
            this.f27073h = System.currentTimeMillis();
            i4g0.m138492A("e_live_room_enter", "p_meet", jyb.m147494Y("meet_realtime_relationship", dby.m115175c(this.f27072g)), jyb.m147494Y("module", "meet_photo"), jyb.m147494Y("other_user_id", this.f27072g.user.f56859id), jyb.m147494Y("live_enter_source", "realtime_meet"));
        } else if (NullChecker.m82486a(this.f27072g) && TEnum.equals(this.f27072g.getItem().liveType, LiveType.liveVoice) && NullChecker.m82486a(this.f27072g.user) && jCurrentTimeMillis >= 500) {
            i4g0.m138492A("e_live_audio_room_enter", "p_meet", jyb.m147494Y("meet_realtime_relationship", dby.m115175c(this.f27072g)), jyb.m147494Y("audio_card_type", "meet_photo"));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m44047T();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44044Q(this);
    }

    public MeetStateHeaderItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MeetStateHeaderItem(Context context) {
        this(context, null);
    }
}

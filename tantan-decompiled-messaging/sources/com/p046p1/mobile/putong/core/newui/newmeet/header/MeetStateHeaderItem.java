package com.p046p1.mobile.putong.core.newui.newmeet.header;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p046p1.mobile.putong.core.data.LiveType;
import com.p046p1.mobile.putong.core.newui.newmeet.header.MeetStateHeaderItem;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VText;
import p149l.b3c0;
import p149l.bkb0;
import p149l.e30;
import p149l.g2y;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.x6y;
import p149l.xdl0;
import p149l.z6y;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class MeetStateHeaderItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f26326c;

    /* JADX INFO: renamed from: d */
    public VIcon f26327d;

    /* JADX INFO: renamed from: e */
    public VText f26328e;

    /* JADX INFO: renamed from: f */
    public VText f26329f;

    /* JADX INFO: renamed from: g */
    public MeetLiveItemData f26330g;

    /* JADX INFO: renamed from: h */
    public long f26331h;

    public MeetStateHeaderItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26331h = 0L;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ boolean m43032P(e30 e30Var, View view) {
        e30Var.call(view);
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final void m43033Q(View view) {
        z6y.m217425a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m43034R(MeetLiveItemData meetLiveItemData, e30<View> e30Var, e30<View> e30Var2) {
        String str;
        int i;
        String str2;
        this.f26330g = meetLiveItemData;
        if (!meetLiveItemData.isAnonymous() || vwb.m200296J(meetLiveItemData.user.profile.extensions.live.voiceImgUrl)) {
            str = (NullChecker.m81303a(meetLiveItemData.user) && meetLiveItemData.user.hasPic()) ? meetLiveItemData.user.picture(0).url : null;
        } else {
            str = meetLiveItemData.user.profile.extensions.live.voiceImgUrl.get(0);
        }
        String str3 = str;
        if (meetLiveItemData.isFollowed()) {
            i = b3c0.f72940R0;
        } else if (meetLiveItemData.isMatched()) {
            i = b3c0.f72961U0;
        } else if (meetLiveItemData.isSuperLikedMe()) {
            i = b3c0.f72975W0;
        } else if (meetLiveItemData.isLikedUser()) {
            i = b3c0.f72947S0;
        } else if (meetLiveItemData.isPicksUser()) {
            i = b3c0.f72968V0;
        } else {
            i = meetLiveItemData.isSeeUser() ? b3c0.f72954T0 : -1;
        }
        int i2 = i;
        if (meetLiveItemData.getItem().liveType == LiveType.get("live")) {
            str2 = "直播中";
        } else {
            str2 = meetLiveItemData.getItem().liveType == LiveType.get(LiveType.liveVoice) ? "语聊中" : "无状态";
        }
        m43035S(str3, i2, meetLiveItemData.user.name, str2, e30Var, e30Var2);
    }

    /* JADX INFO: renamed from: S */
    public final void m43035S(String str, int i, String str2, String str3, e30<View> e30Var, final e30<View> e30Var2) {
        if (!TextUtils.isEmpty(str)) {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f26326c;
            int i2 = t100.f167229D;
            bkb0Var.m102325I0(vDraweeView, str, i2, i2);
        }
        this.f26328e.setText(str2);
        this.f26329f.setText(str3);
        Objects.requireNonNull(e30Var);
        setOnClickListener(new x6y(e30Var));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.y6y
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return MeetStateHeaderItem.m43032P(e30Var2, view);
            }
        });
        VIcon vIcon = this.f26327d;
        if (i <= 0) {
            xdl0.m208344M(vIcon, false);
        } else {
            xdl0.m208344M(vIcon, true);
            this.f26327d.setImageResource(i);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m43036T() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f26331h;
        if (NullChecker.m81303a(this.f26330g) && TEnum.equals(this.f26330g.getItem().liveType, "live") && NullChecker.m81303a(this.f26330g.user) && jCurrentTimeMillis >= 500) {
            this.f26331h = System.currentTimeMillis();
            zvf0.m220368A("e_live_room_enter", "p_meet", vwb.m200311Y("meet_realtime_relationship", g2y.m124193c(this.f26330g)), vwb.m200311Y("module", "meet_photo"), vwb.m200311Y("other_user_id", this.f26330g.user.f56011id), vwb.m200311Y("live_enter_source", "realtime_meet"));
        } else if (NullChecker.m81303a(this.f26330g) && TEnum.equals(this.f26330g.getItem().liveType, LiveType.liveVoice) && NullChecker.m81303a(this.f26330g.user) && jCurrentTimeMillis >= 500) {
            zvf0.m220368A("e_live_audio_room_enter", "p_meet", vwb.m200311Y("meet_realtime_relationship", g2y.m124193c(this.f26330g)), vwb.m200311Y("audio_card_type", "meet_photo"));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m43036T();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43033Q(this);
    }

    public MeetStateHeaderItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MeetStateHeaderItem(Context context) {
        this(context, null);
    }
}

package com.p000p1.mobile.putong.core.newui.newmeet.header;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.newmeet.header.MeetStateHeaderItem;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p1.mobile.putong.core.data.LiveType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.b3c0;
import l.bkb0;
import l.e30;
import l.j760;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.z6y;
import l.zvf0;
import p009l.g2y;
import v.VDraweeView;
import v.VIcon;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MeetStateHeaderItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f5104c;

    /* JADX INFO: renamed from: d */
    public VIcon f5105d;

    /* JADX INFO: renamed from: e */
    public VText f5106e;

    /* JADX INFO: renamed from: f */
    public VText f5107f;

    /* JADX INFO: renamed from: g */
    public MeetLiveItemData f5108g;

    /* JADX INFO: renamed from: h */
    public long f5109h;

    public MeetStateHeaderItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5109h = 0L;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ boolean m7234P(e30 e30Var, View view) {
        e30Var.call(view);
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final void m7235Q(View view) {
        z6y.a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m7236R(MeetLiveItemData meetLiveItemData, e30<View> e30Var, e30<View> e30Var2) {
        String str;
        int i;
        String str2;
        this.f5108g = meetLiveItemData;
        if (!meetLiveItemData.isAnonymous() || vwb.J(((AbsMeetUserItemData) meetLiveItemData).user.profile.extensions.live.voiceImgUrl)) {
            str = (NullChecker.a(((AbsMeetUserItemData) meetLiveItemData).user) && ((AbsMeetUserItemData) meetLiveItemData).user.hasPic()) ? ((Media) ((AbsMeetUserItemData) meetLiveItemData).user.picture(0)).url : null;
        } else {
            str = (String) ((AbsMeetUserItemData) meetLiveItemData).user.profile.extensions.live.voiceImgUrl.get(0);
        }
        String str3 = str;
        if (meetLiveItemData.isFollowed()) {
            i = b3c0.R0;
        } else if (meetLiveItemData.isMatched()) {
            i = b3c0.U0;
        } else if (meetLiveItemData.isSuperLikedMe()) {
            i = b3c0.W0;
        } else if (meetLiveItemData.isLikedUser()) {
            i = b3c0.S0;
        } else if (meetLiveItemData.isPicksUser()) {
            i = b3c0.V0;
        } else {
            i = meetLiveItemData.isSeeUser() ? b3c0.T0 : -1;
        }
        int i2 = i;
        if (meetLiveItemData.getItem().liveType == LiveType.get("live")) {
            str2 = "直播中";
        } else {
            str2 = meetLiveItemData.getItem().liveType == LiveType.get("liveVoice") ? "语聊中" : "无状态";
        }
        m7237S(str3, i2, ((AbsMeetUserItemData) meetLiveItemData).user.name, str2, e30Var, e30Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final void m7237S(String str, int i, String str2, String str3, final e30<View> e30Var, final e30<View> e30Var2) {
        if (!TextUtils.isEmpty(str)) {
            bkb0 bkb0Var = qib0.G;
            VDraweeView vDraweeView = this.f5104c;
            int i2 = t100.D;
            bkb0Var.I0(vDraweeView, str, i2, i2);
        }
        this.f5106e.setText(str2);
        this.f5107f.setText(str3);
        Objects.requireNonNull(e30Var);
        setOnClickListener(new View.OnClickListener() { // from class: l.x6y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.y6y
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return MeetStateHeaderItem.m7234P(e30Var2, view);
            }
        });
        VIcon vIcon = this.f5105d;
        if (i <= 0) {
            xdl0.M(vIcon, false);
        } else {
            xdl0.M(vIcon, true);
            this.f5105d.setImageResource(i);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m7238T() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f5109h;
        if (NullChecker.a(this.f5108g) && TEnum.equals(this.f5108g.getItem().liveType, "live") && NullChecker.a(((AbsMeetUserItemData) this.f5108g).user) && jCurrentTimeMillis >= 500) {
            this.f5109h = System.currentTimeMillis();
            zvf0.A("e_live_room_enter", "p_meet", new j760[]{vwb.Y("meet_realtime_relationship", g2y.m14766c(this.f5108g)), vwb.Y("module", "meet_photo"), vwb.Y("other_user_id", ((DbObject) ((AbsMeetUserItemData) this.f5108g).user).id), vwb.Y("live_enter_source", "realtime_meet")});
        } else if (NullChecker.a(this.f5108g) && TEnum.equals(this.f5108g.getItem().liveType, "liveVoice") && NullChecker.a(((AbsMeetUserItemData) this.f5108g).user) && jCurrentTimeMillis >= 500) {
            zvf0.A("e_live_audio_room_enter", "p_meet", new j760[]{vwb.Y("meet_realtime_relationship", g2y.m14766c(this.f5108g)), vwb.Y("audio_card_type", "meet_photo")});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        m7238T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7235Q(this);
    }

    public MeetStateHeaderItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MeetStateHeaderItem(Context context) {
        this(context, null);
    }
}

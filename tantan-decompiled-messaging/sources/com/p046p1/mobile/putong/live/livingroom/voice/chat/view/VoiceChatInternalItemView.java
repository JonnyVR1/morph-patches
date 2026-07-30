package com.p046p1.mobile.putong.live.livingroom.voice.chat.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0222a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p046p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p147v.VLinear;
import p147v.VText;
import p149l.agv;
import p149l.mqv;
import p149l.nol;
import p149l.pol;
import p149l.qib0;
import p149l.t100;
import p149l.w9j;
import p149l.xdl0;
import p149l.zzm0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceChatInternalItemView extends ConstraintLayout implements pol {

    /* JADX INFO: renamed from: i */
    public static int f53043i;

    /* JADX INFO: renamed from: d */
    public VText f53044d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f53045e;

    /* JADX INFO: renamed from: f */
    public VLinear f53046f;

    /* JADX INFO: renamed from: g */
    public VoiceChatItem f53047g;

    /* JADX INFO: renamed from: h */
    public VoiceChatItem f53048h;

    public VoiceChatInternalItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: o0 */
    public static String m78028o0(long j, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m78029p0(long j) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        calendar.setTimeInMillis(j);
        return i == calendar.get(1);
    }

    @Override // p149l.pol
    /* JADX INFO: renamed from: M */
    public void mo72494M() {
        this.f53047g.mo72494M();
        this.f53048h.mo72494M();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m78030m0(View view) {
        zzm0.m221021a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m78031n0() {
        C0222a c0222a = new C0222a();
        c0222a.m1148c(this);
        if (f53043i == 0) {
            f53043i = (int) ((xdl0.m208338J(this.f53044d.getContext()).x / 2.0f) - (this.f53044d.getWidth() / 2.0f));
        }
        c0222a.m1151f(this.f53044d.getId(), 6, 0, 6, f53043i);
        c0222a.m1163s(this.f53044d.getId(), 0);
        c0222a.m1146a(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78030m0(this);
        this.f53048h.setLongClickArea(IChatItemLongClickArea.LongClickArea.CONTENT);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean m78032q0(nol nolVar, LiveMessage liveMessage, View view) {
        nolVar.mo72694b(this.f53045e, liveMessage);
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ boolean m78033r0(nol nolVar, LiveMessage liveMessage, View view) {
        nolVar.mo72694b(this.f53048h, liveMessage);
        return true;
    }

    /* JADX INFO: renamed from: s0 */
    public void m78034s0(final nol nolVar, final LiveMessage liveMessage, boolean z) {
        List<SpannableStringBuilder> list = liveMessage.spanList;
        if (list != null && list.size() >= 2) {
            this.f53047g.f48761c.setPadding(0, 0, 0, 0);
            this.f53047g.m72516e(nolVar, liveMessage, list.get(0), 2);
            this.f53048h.m72516e(nolVar, liveMessage, list.get(1), 1);
        }
        final LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
        CommonMaskAvatarView commonMaskAvatarView = this.f53045e;
        if (liveUserInfo != null) {
            agv.m96345c(commonMaskAvatarView, t100.f167276y, mqv.m155998f(liveUserInfo).m156001c(liveUserInfo.userId, liveUserInfo.userMask, liveUserInfo.isMaskMode), new w9j() { // from class: l.uzm0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LiveUserInfo) obj).userImage;
                }
            }, 0);
        } else {
            agv.m96349g(commonMaskAvatarView, t100.f167276y, "defaultUrl", null, null);
        }
        xdl0.m208329E0(this.f53045e, new View.OnClickListener() { // from class: l.vzm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nolVar.mo72697e(liveUserInfo, liveMessage.seq);
            }
        });
        this.f53045e.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.wzm0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f188746a.m78032q0(nolVar, liveMessage, view);
            }
        });
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        if ((extInfo == null || !extInfo.isSystemReplaceMessage) && !TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) {
            this.f53048h.f48761c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.xzm0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f195210a.m78033r0(nolVar, liveMessage, view);
                }
            });
        }
        this.f53048h.f48761c.setPadding(t100.m186890d(12.0f), t100.m186890d(8.0f), t100.m186890d(12.0f), t100.m186890d(8.0f));
        xdl0.m208374f0(this.f53047g.f48761c, t100.m186890d(2.0f));
        xdl0.m208357U(this.f53048h, z ? 0 : t100.m186890d(6.0f));
        xdl0.m208360X(this.f53047g, t100.m186890d(6.0f));
        long j = liveMessage.createTime - liveMessage.preMessageTime;
        VText vText = this.f53044d;
        if (j <= AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED) {
            vText.setVisibility(8);
            return;
        }
        vText.setVisibility(4);
        VText vText2 = this.f53044d;
        long j2 = liveMessage.createTime;
        vText2.setText(m78028o0(j2, m78029p0(j2) ? "MM月dd日 HH:mm" : "yyyy年MM月dd日 HH:mm"));
        this.f53044d.post(new Runnable() { // from class: l.yzm0
            @Override // java.lang.Runnable
            public final void run() {
                this.f200898a.m78031n0();
            }
        });
    }

    public VoiceChatInternalItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceChatInternalItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

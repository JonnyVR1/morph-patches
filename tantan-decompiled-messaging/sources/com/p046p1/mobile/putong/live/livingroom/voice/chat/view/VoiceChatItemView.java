package com.p046p1.mobile.putong.live.livingroom.voice.chat.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p046p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import java.util.List;
import p147v.VLinear;
import p149l.agv;
import p149l.mqv;
import p149l.nol;
import p149l.pol;
import p149l.q0n0;
import p149l.qib0;
import p149l.t100;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceChatItemView extends RelativeLayout implements pol {

    /* JADX INFO: renamed from: a */
    public CommonMaskAvatarView f53049a;

    /* JADX INFO: renamed from: b */
    public VLinear f53050b;

    /* JADX INFO: renamed from: c */
    public VoiceChatItem f53051c;

    /* JADX INFO: renamed from: d */
    public VoiceChatItem f53052d;

    public VoiceChatItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m78039f(nol nolVar, LiveMessage liveMessage, View view) {
        nolVar.mo72694b(this.f53049a, liveMessage);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ boolean m78040g(nol nolVar, LiveMessage liveMessage, View view) {
        nolVar.mo72694b(this.f53052d, liveMessage);
        return true;
    }

    @Override // p149l.pol
    /* JADX INFO: renamed from: M */
    public void mo72494M() {
        this.f53051c.mo72494M();
        this.f53052d.mo72494M();
    }

    /* JADX INFO: renamed from: e */
    public final void m78041e(View view) {
        q0n0.m172335a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m78042h(final nol nolVar, final LiveMessage liveMessage, boolean z) {
        List<SpannableStringBuilder> list = liveMessage.spanList;
        if (list != null && list.size() >= 2) {
            this.f53051c.f48761c.setPadding(0, 0, 0, 0);
            this.f53051c.m72516e(nolVar, liveMessage, list.get(0), 2);
            this.f53052d.m72516e(nolVar, liveMessage, list.get(1), 1);
        }
        final LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
        CommonMaskAvatarView commonMaskAvatarView = this.f53049a;
        if (liveUserInfo != null) {
            agv.m96346d(commonMaskAvatarView, t100.f167276y, mqv.m155998f(liveUserInfo).m156001c(liveUserInfo.userId, liveUserInfo.userMask, liveUserInfo.isMaskMode), true, new w9j() { // from class: l.m0n0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LiveUserInfo) obj).userImage;
                }
            });
        } else {
            agv.m96349g(commonMaskAvatarView, t100.f167276y, "defaultUrl", null, null);
        }
        xdl0.m208329E0(this.f53049a, new View.OnClickListener() { // from class: l.n0n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nolVar.mo72697e(liveUserInfo, liveMessage.seq);
            }
        });
        this.f53049a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.o0n0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f141350a.m78039f(nolVar, liveMessage, view);
            }
        });
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        if ((extInfo == null || !extInfo.isSystemReplaceMessage) && !TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) {
            this.f53052d.f48761c.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.p0n0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f146608a.m78040g(nolVar, liveMessage, view);
                }
            });
        }
        this.f53052d.f48761c.setPadding(t100.m186890d(12.0f), t100.m186890d(8.0f), t100.m186890d(12.0f), t100.m186890d(8.0f));
        xdl0.m208374f0(this.f53051c.f48761c, t100.m186890d(2.0f));
        xdl0.m208357U(this.f53052d, z ? 0 : t100.m186890d(6.0f));
        xdl0.m208360X(this.f53051c, t100.m186890d(6.0f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78041e(this);
        this.f53052d.setLongClickArea(IChatItemLongClickArea.LongClickArea.CONTENT);
    }

    public VoiceChatItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceChatItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p046p1.mobile.putong.live.livingroom.voice.chat.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView;
import java.util.List;
import p147v.VDraweeView;
import p149l.agv;
import p149l.ap0;
import p149l.hxs;
import p149l.i3c0;
import p149l.i7n;
import p149l.mqv;
import p149l.nol;
import p149l.pol;
import p149l.t100;
import p149l.w0n0;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceChatMicEmojiItemView extends RelativeLayout implements pol {

    /* JADX INFO: renamed from: a */
    public CommonMaskAvatarView f53054a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f53055b;

    /* JADX INFO: renamed from: c */
    public VoiceChatItem f53056c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f53057d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f53058e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f53059f;

    /* JADX INFO: renamed from: g */
    public VoiceTripleDiceView f53060g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f53061h;

    /* JADX INFO: renamed from: i */
    public LiveMessage f53062i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatMicEmojiItemView$a */
    public class C13011a extends ap0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f53063a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f53064b;

        public C13011a(List list, String str) {
            this.f53063a = list;
            this.f53064b = str;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            if (TextUtils.isEmpty(((VoiceMicEmoji.EmojiPlayResult) this.f53063a.get(0)).getContentPic())) {
                return;
            }
            VoiceChatMicEmojiItemView.this.m78055m(this.f53063a, this.f53064b);
        }
    }

    public VoiceChatMicEmojiItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ boolean m78047i(nol nolVar, LiveMessage liveMessage, View view) {
        nolVar.mo72694b(this.f53054a, liveMessage);
        return true;
    }

    @Override // p149l.pol
    /* JADX INFO: renamed from: M */
    public void mo72494M() {
        this.f53056c.mo72494M();
        m78059q();
        this.f53062i = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m78048e(View view) {
        w0n0.m200896a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m78049f() {
        LiveMessage liveMessage = this.f53062i;
        if (liveMessage != null) {
            LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
            m78053k(liveUserInfo.emojiResult, liveUserInfo.emojiType, liveMessage.localCreateTime);
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m78050g(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return i7n.m134916b() ? 1 : -1;
        }
        return j > 0 ? 10 : 2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m78051h(List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
        return "emojiRandomTripleDice".equals(str) && list.size() >= 3;
    }

    /* JADX INFO: renamed from: j */
    public final void m78052j(List<VoiceMicEmoji.EmojiPlayResult> list) {
        if (list.size() < 1) {
            return;
        }
        m78057o(true, false, false);
        this.f53059f.m68499i(list.get(0).getLoadingSvg(), 1, null, false);
    }

    /* JADX INFO: renamed from: k */
    public final void m78053k(List<VoiceMicEmoji.EmojiPlayResult> list, String str, long j) {
        if (list == null || list.size() <= 0) {
            return;
        }
        long loadingDurationS = list.get(0).getLoadingDurationS();
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        m78059q();
        boolean z = jCurrentTimeMillis > loadingDurationS * 1000;
        if (m78051h(list, str) || !TextUtils.isEmpty(list.get(0).getContentPic())) {
            if (z) {
                m78055m(list, str);
                return;
            } else {
                m78058p(list, str);
                return;
            }
        }
        if (z && i7n.m134916b()) {
            m78052j(list);
        } else {
            m78058p(list, str);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m78054l(final nol nolVar, final LiveMessage liveMessage) {
        this.f53062i = liveMessage;
        List<SpannableStringBuilder> list = liveMessage.spanList;
        if (list != null && list.size() >= 1) {
            this.f53056c.f48761c.setPadding(0, 0, 0, 0);
            this.f53056c.m72516e(nolVar, liveMessage, list.get(0), 2);
        }
        final LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
        CommonMaskAvatarView commonMaskAvatarView = this.f53054a;
        if (liveUserInfo != null) {
            agv.m96346d(commonMaskAvatarView, t100.f167276y, mqv.m155998f(liveUserInfo).m156001c(liveUserInfo.userId, liveUserInfo.userMask, liveUserInfo.isMaskMode), true, new w9j() { // from class: l.t0n0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LiveUserInfo) obj).userImage;
                }
            });
        } else {
            agv.m96349g(commonMaskAvatarView, t100.f167276y, "defaultUrl", null, null);
        }
        xdl0.m208329E0(this.f53054a, new View.OnClickListener() { // from class: l.u0n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nolVar.mo72697e(liveUserInfo, liveMessage.seq);
            }
        });
        this.f53054a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.v0n0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f179127a.m78047i(nolVar, liveMessage, view);
            }
        });
        this.f53057d.setBackgroundResource(i3c0.f110805O);
        xdl0.m208374f0(this.f53056c.f48761c, t100.m186890d(2.0f));
        xdl0.m208357U(this.f53057d, t100.m186890d(6.0f));
        xdl0.m208360X(this.f53056c, t100.m186890d(6.0f));
        xdl0.m208358V(this, t100.m186890d(-2.0f));
        m78053k(liveUserInfo.emojiResult, liveUserInfo.emojiType, liveMessage.localCreateTime);
    }

    /* JADX INFO: renamed from: m */
    public final void m78055m(List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
        if (m78051h(list, str)) {
            this.f53060g.m78131g();
            if (TextUtils.isEmpty(list.get(0).getContentPic())) {
                return;
            }
            m78057o(false, false, true);
            this.f53060g.m78127c(list.get(0).getContentPic(), list.get(1).getContentPic(), list.get(2).getContentPic());
            return;
        }
        if (list.size() >= 1) {
            m78059q();
            m78057o(false, true, false);
            hxs.m133406s("context_single_room", this.f53061h, list.get(0).getContentPic());
        }
    }

    /* JADX INFO: renamed from: n */
    public void m78056n(List<VoiceMicEmoji.EmojiPlayResult> list, String str, String str2, String str3) {
        LiveUserInfo liveUserInfo;
        LiveMessage liveMessage = this.f53062i;
        if (liveMessage == null || (liveUserInfo = liveMessage.liveUserInfo) == null || !str2.equals(liveUserInfo.userId) || !str3.equals(this.f53062i.liveUserInfo.mid)) {
            return;
        }
        m78055m(list, str);
    }

    /* JADX INFO: renamed from: o */
    public final void m78057o(boolean z, boolean z2, boolean z3) {
        xdl0.m208344M(this.f53059f, z);
        xdl0.m208344M(this.f53061h, z2);
        xdl0.m208344M(this.f53060g, z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m78049f();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78048e(this);
        this.f53060g.m78128d(t100.m186890d(35.0f), t100.m186890d(35.0f), -t100.m186890d(7.0f), -t100.m186890d(10.5f));
    }

    /* JADX INFO: renamed from: p */
    public final void m78058p(List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
        if (m78051h(list, str)) {
            m78057o(false, false, true);
            this.f53060g.m78130f(list);
        } else {
            if (list.size() < 1) {
                return;
            }
            m78057o(true, false, false);
            this.f53059f.mo68502l(list.get(0).getLoadingSvg(), m78050g(list.get(0).getContentPic(), list.get(0).getResultShowDurationS()), new C13011a(list, str));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m78059q() {
        AnimEffectPlayer animEffectPlayer = this.f53059f;
        if (animEffectPlayer != null) {
            animEffectPlayer.m68504n();
        }
        VoiceTripleDiceView voiceTripleDiceView = this.f53060g;
        if (voiceTripleDiceView != null) {
            voiceTripleDiceView.m78131g();
        }
    }

    public VoiceChatMicEmojiItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceChatMicEmojiItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p051p1.mobile.putong.live.livingroom.voice.chat.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.VoiceChatItem;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView;
import java.util.List;
import p151v.VDraweeView;
import p153l.aan0;
import p153l.arl;
import p153l.biv;
import p153l.bnl0;
import p153l.i9n;
import p153l.izs;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.qcj;
import p153l.wo0;
import p153l.yql;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceChatMicEmojiItemView extends RelativeLayout implements arl {

    /* JADX INFO: renamed from: a */
    public CommonMaskAvatarView f53902a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f53903b;

    /* JADX INFO: renamed from: c */
    public VoiceChatItem f53904c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f53905d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f53906e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f53907f;

    /* JADX INFO: renamed from: g */
    public VoiceTripleDiceView f53908g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f53909h;

    /* JADX INFO: renamed from: i */
    public LiveMessage f53910i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatMicEmojiItemView$a */
    public class C13174a extends wo0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f53911a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f53912b;

        public C13174a(List list, String str) {
            this.f53911a = list;
            this.f53912b = str;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            if (TextUtils.isEmpty(((VoiceMicEmoji.EmojiPlayResult) this.f53911a.get(0)).getContentPic())) {
                return;
            }
            VoiceChatMicEmojiItemView.this.m79238m(this.f53911a, this.f53912b);
        }
    }

    public VoiceChatMicEmojiItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ boolean m79230i(yql yqlVar, LiveMessage liveMessage, View view) {
        yqlVar.mo73877b(this.f53902a, liveMessage);
        return true;
    }

    @Override // p153l.arl
    /* JADX INFO: renamed from: M */
    public void mo73677M() {
        this.f53904c.mo73677M();
        m79242q();
        this.f53910i = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m79231e(View view) {
        aan0.m96653a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m79232f() {
        LiveMessage liveMessage = this.f53910i;
        if (liveMessage != null) {
            LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
            m79236k(liveUserInfo.emojiResult, liveUserInfo.emojiType, liveMessage.localCreateTime);
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m79233g(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return i9n.m139127b() ? 1 : -1;
        }
        return j > 0 ? 10 : 2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m79234h(List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
        return "emojiRandomTripleDice".equals(str) && list.size() >= 3;
    }

    /* JADX INFO: renamed from: j */
    public final void m79235j(List<VoiceMicEmoji.EmojiPlayResult> list) {
        if (list.size() < 1) {
            return;
        }
        m79240o(true, false, false);
        this.f53907f.m69682i(list.get(0).getLoadingSvg(), 1, null, false);
    }

    /* JADX INFO: renamed from: k */
    public final void m79236k(List<VoiceMicEmoji.EmojiPlayResult> list, String str, long j) {
        if (list == null || list.size() <= 0) {
            return;
        }
        long loadingDurationS = list.get(0).getLoadingDurationS();
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        m79242q();
        boolean z = jCurrentTimeMillis > loadingDurationS * 1000;
        if (m79234h(list, str) || !TextUtils.isEmpty(list.get(0).getContentPic())) {
            if (z) {
                m79238m(list, str);
                return;
            } else {
                m79241p(list, str);
                return;
            }
        }
        if (z && i9n.m139127b()) {
            m79235j(list);
        } else {
            m79241p(list, str);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m79237l(final yql yqlVar, final LiveMessage liveMessage) {
        this.f53910i = liveMessage;
        List<SpannableStringBuilder> list = liveMessage.spanList;
        if (list != null && list.size() >= 1) {
            this.f53904c.f49609c.setPadding(0, 0, 0, 0);
            this.f53904c.m73699e(yqlVar, liveMessage, list.get(0), 2);
        }
        final LiveUserInfo liveUserInfo = liveMessage.liveUserInfo;
        CommonMaskAvatarView commonMaskAvatarView = this.f53902a;
        if (liveUserInfo != null) {
            biv.m104519d(commonMaskAvatarView, qa00.f156338y, nsv.m164636f(liveUserInfo).m164639c(liveUserInfo.userId, liveUserInfo.userMask, liveUserInfo.isMaskMode), true, new qcj() { // from class: l.x9n0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveUserInfo) obj).userImage;
                }
            });
        } else {
            biv.m104522g(commonMaskAvatarView, qa00.f156338y, "defaultUrl", null, null);
        }
        bnl0.m105509E0(this.f53902a, new View.OnClickListener() { // from class: l.y9n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yqlVar.mo73880e(liveUserInfo, liveMessage.seq);
            }
        });
        this.f53902a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.z9n0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f203497a.m79230i(yqlVar, liveMessage, view);
            }
        });
        this.f53905d.setBackgroundResource(obc0.f146133O);
        bnl0.m105554f0(this.f53904c.f49609c, qa00.m175859d(2.0f));
        bnl0.m105537U(this.f53905d, qa00.m175859d(6.0f));
        bnl0.m105540X(this.f53904c, qa00.m175859d(6.0f));
        bnl0.m105538V(this, qa00.m175859d(-2.0f));
        m79236k(liveUserInfo.emojiResult, liveUserInfo.emojiType, liveMessage.localCreateTime);
    }

    /* JADX INFO: renamed from: m */
    public final void m79238m(List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
        if (m79234h(list, str)) {
            this.f53908g.m79314g();
            if (TextUtils.isEmpty(list.get(0).getContentPic())) {
                return;
            }
            m79240o(false, false, true);
            this.f53908g.m79310c(list.get(0).getContentPic(), list.get(1).getContentPic(), list.get(2).getContentPic());
            return;
        }
        if (list.size() >= 1) {
            m79242q();
            m79240o(false, true, false);
            izs.m142868s("context_single_room", this.f53909h, list.get(0).getContentPic());
        }
    }

    /* JADX INFO: renamed from: n */
    public void m79239n(List<VoiceMicEmoji.EmojiPlayResult> list, String str, String str2, String str3) {
        LiveUserInfo liveUserInfo;
        LiveMessage liveMessage = this.f53910i;
        if (liveMessage == null || (liveUserInfo = liveMessage.liveUserInfo) == null || !str2.equals(liveUserInfo.userId) || !str3.equals(this.f53910i.liveUserInfo.mid)) {
            return;
        }
        m79238m(list, str);
    }

    /* JADX INFO: renamed from: o */
    public final void m79240o(boolean z, boolean z2, boolean z3) {
        bnl0.m105524M(this.f53907f, z);
        bnl0.m105524M(this.f53909h, z2);
        bnl0.m105524M(this.f53908g, z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m79232f();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79231e(this);
        this.f53908g.m79311d(qa00.m175859d(35.0f), qa00.m175859d(35.0f), -qa00.m175859d(7.0f), -qa00.m175859d(10.5f));
    }

    /* JADX INFO: renamed from: p */
    public final void m79241p(List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
        if (m79234h(list, str)) {
            m79240o(false, false, true);
            this.f53908g.m79313f(list);
        } else {
            if (list.size() < 1) {
                return;
            }
            m79240o(true, false, false);
            this.f53907f.mo69685l(list.get(0).getLoadingSvg(), m79233g(list.get(0).getContentPic(), list.get(0).getResultShowDurationS()), new C13174a(list, str));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m79242q() {
        AnimEffectPlayer animEffectPlayer = this.f53907f;
        if (animEffectPlayer != null) {
            animEffectPlayer.m69687n();
        }
        VoiceTripleDiceView voiceTripleDiceView = this.f53908g;
        if (voiceTripleDiceView != null) {
            voiceTripleDiceView.m79314g();
        }
    }

    public VoiceChatMicEmojiItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceChatMicEmojiItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

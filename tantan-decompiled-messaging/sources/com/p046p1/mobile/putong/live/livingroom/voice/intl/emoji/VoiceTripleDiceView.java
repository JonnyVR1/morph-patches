package com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.util.List;
import p147v.VDraweeView;
import p149l.ap0;
import p149l.bwo0;
import p149l.hxs;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceTripleDiceView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f53118a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f53119b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f53120c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f53121d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53122e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53123f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView$a */
    public class C13017a extends ap0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f53124a;

        public C13017a(List list) {
            this.f53124a = list;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208344M(VoiceTripleDiceView.this.f53118a, false);
            xdl0.m208344M(VoiceTripleDiceView.this.f53121d, true);
            hxs.m133406s("context_livingAct", VoiceTripleDiceView.this.f53121d, ((VoiceMicEmoji.EmojiPlayResult) this.f53124a.get(0)).getContentPic());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView$b */
    public class C13018b extends ap0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f53126a;

        public C13018b(List list) {
            this.f53126a = list;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208344M(VoiceTripleDiceView.this.f53119b, false);
            xdl0.m208344M(VoiceTripleDiceView.this.f53122e, true);
            hxs.m133406s("context_livingAct", VoiceTripleDiceView.this.f53122e, ((VoiceMicEmoji.EmojiPlayResult) this.f53126a.get(1)).getContentPic());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView$c */
    public class C13019c extends ap0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f53128a;

        public C13019c(List list) {
            this.f53128a = list;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208344M(VoiceTripleDiceView.this.f53120c, false);
            xdl0.m208344M(VoiceTripleDiceView.this.f53123f, true);
            hxs.m133406s("context_livingAct", VoiceTripleDiceView.this.f53123f, ((VoiceMicEmoji.EmojiPlayResult) this.f53128a.get(2)).getContentPic());
        }
    }

    public VoiceTripleDiceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78125a(View view) {
        bwo0.m104164a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public boolean m78126b() {
        AnimEffectPlayer animEffectPlayer = this.f53118a;
        if (animEffectPlayer != null) {
            return animEffectPlayer.isAnimating() || this.f53119b.isAnimating() || this.f53120c.isAnimating();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m78127c(String str, String str2, String str3) {
        m78129e(false);
        hxs.m133406s("context_livingAct", this.f53121d, str);
        hxs.m133406s("context_livingAct", this.f53122e, str2);
        hxs.m133406s("context_livingAct", this.f53123f, str3);
    }

    /* JADX INFO: renamed from: d */
    public void m78128d(int i, int i2, int i3, int i4) {
        xdl0.m208327D0(i, this.f53121d);
        xdl0.m208327D0(i, this.f53122e);
        xdl0.m208327D0(i, this.f53123f);
        xdl0.m208325C0(this.f53121d, i2);
        xdl0.m208325C0(this.f53122e, i2);
        xdl0.m208325C0(this.f53123f, i2);
        xdl0.m208360X(this.f53122e, i4);
        xdl0.m208360X(this.f53123f, i4);
        xdl0.m208358V(this.f53123f, i3);
        xdl0.m208327D0(i, this.f53118a);
        xdl0.m208327D0(i, this.f53119b);
        xdl0.m208327D0(i, this.f53120c);
        xdl0.m208325C0(this.f53118a, i2);
        xdl0.m208325C0(this.f53119b, i2);
        xdl0.m208325C0(this.f53120c, i2);
        xdl0.m208360X(this.f53119b, i4);
        xdl0.m208360X(this.f53120c, i4);
        xdl0.m208358V(this.f53120c, i3);
    }

    /* JADX INFO: renamed from: e */
    public final void m78129e(boolean z) {
        xdl0.m208344M(this.f53121d, !z);
        xdl0.m208344M(this.f53122e, !z);
        xdl0.m208344M(this.f53123f, !z);
        xdl0.m208344M(this.f53118a, z);
        xdl0.m208344M(this.f53119b, z);
        xdl0.m208344M(this.f53120c, z);
    }

    /* JADX INFO: renamed from: f */
    public void m78130f(List<VoiceMicEmoji.EmojiPlayResult> list) {
        if (list == null || list.size() < 3) {
            return;
        }
        m78129e(true);
        this.f53118a.mo68502l(list.get(0).getLoadingSvg(), TextUtils.isEmpty(list.get(0).getContentPic()) ? -1 : 10, new C13017a(list));
        this.f53119b.mo68502l(list.get(1).getLoadingSvg(), TextUtils.isEmpty(list.get(1).getContentPic()) ? -1 : 10, new C13018b(list));
        this.f53120c.mo68502l(list.get(2).getLoadingSvg(), TextUtils.isEmpty(list.get(2).getContentPic()) ? -1 : 10, new C13019c(list));
    }

    /* JADX INFO: renamed from: g */
    public void m78131g() {
        AnimEffectPlayer animEffectPlayer = this.f53118a;
        if (animEffectPlayer != null) {
            animEffectPlayer.m68504n();
            this.f53119b.m68504n();
            this.f53120c.m68504n();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78125a(this);
        AnimEffectPlayer animEffectPlayer = this.f53118a;
        if (animEffectPlayer != null) {
            animEffectPlayer.setClearsAfterStop(true);
            this.f53119b.setClearsAfterStop(true);
            this.f53120c.setClearsAfterStop(true);
        }
    }

    public VoiceTripleDiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceTripleDiceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

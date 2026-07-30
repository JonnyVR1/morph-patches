package com.p051p1.mobile.putong.live.livingroom.voice.intl.emoji;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.f5p0;
import p153l.izs;
import p153l.wo0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceTripleDiceView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f53966a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f53967b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f53968c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f53969d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53970e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53971f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView$a */
    public class C13180a extends wo0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f53972a;

        public C13180a(List list) {
            this.f53972a = list;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105524M(VoiceTripleDiceView.this.f53966a, false);
            bnl0.m105524M(VoiceTripleDiceView.this.f53969d, true);
            izs.m142868s("context_livingAct", VoiceTripleDiceView.this.f53969d, ((VoiceMicEmoji.EmojiPlayResult) this.f53972a.get(0)).getContentPic());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView$b */
    public class C13181b extends wo0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f53974a;

        public C13181b(List list) {
            this.f53974a = list;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105524M(VoiceTripleDiceView.this.f53967b, false);
            bnl0.m105524M(VoiceTripleDiceView.this.f53970e, true);
            izs.m142868s("context_livingAct", VoiceTripleDiceView.this.f53970e, ((VoiceMicEmoji.EmojiPlayResult) this.f53974a.get(1)).getContentPic());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView$c */
    public class C13182c extends wo0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f53976a;

        public C13182c(List list) {
            this.f53976a = list;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105524M(VoiceTripleDiceView.this.f53968c, false);
            bnl0.m105524M(VoiceTripleDiceView.this.f53971f, true);
            izs.m142868s("context_livingAct", VoiceTripleDiceView.this.f53971f, ((VoiceMicEmoji.EmojiPlayResult) this.f53976a.get(2)).getContentPic());
        }
    }

    public VoiceTripleDiceView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79308a(View view) {
        f5p0.m124158a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public boolean m79309b() {
        AnimEffectPlayer animEffectPlayer = this.f53966a;
        if (animEffectPlayer != null) {
            return animEffectPlayer.isAnimating() || this.f53967b.isAnimating() || this.f53968c.isAnimating();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m79310c(String str, String str2, String str3) {
        m79312e(false);
        izs.m142868s("context_livingAct", this.f53969d, str);
        izs.m142868s("context_livingAct", this.f53970e, str2);
        izs.m142868s("context_livingAct", this.f53971f, str3);
    }

    /* JADX INFO: renamed from: d */
    public void m79311d(int i, int i2, int i3, int i4) {
        bnl0.m105507D0(i, this.f53969d);
        bnl0.m105507D0(i, this.f53970e);
        bnl0.m105507D0(i, this.f53971f);
        bnl0.m105505C0(this.f53969d, i2);
        bnl0.m105505C0(this.f53970e, i2);
        bnl0.m105505C0(this.f53971f, i2);
        bnl0.m105540X(this.f53970e, i4);
        bnl0.m105540X(this.f53971f, i4);
        bnl0.m105538V(this.f53971f, i3);
        bnl0.m105507D0(i, this.f53966a);
        bnl0.m105507D0(i, this.f53967b);
        bnl0.m105507D0(i, this.f53968c);
        bnl0.m105505C0(this.f53966a, i2);
        bnl0.m105505C0(this.f53967b, i2);
        bnl0.m105505C0(this.f53968c, i2);
        bnl0.m105540X(this.f53967b, i4);
        bnl0.m105540X(this.f53968c, i4);
        bnl0.m105538V(this.f53968c, i3);
    }

    /* JADX INFO: renamed from: e */
    public final void m79312e(boolean z) {
        bnl0.m105524M(this.f53969d, !z);
        bnl0.m105524M(this.f53970e, !z);
        bnl0.m105524M(this.f53971f, !z);
        bnl0.m105524M(this.f53966a, z);
        bnl0.m105524M(this.f53967b, z);
        bnl0.m105524M(this.f53968c, z);
    }

    /* JADX INFO: renamed from: f */
    public void m79313f(List<VoiceMicEmoji.EmojiPlayResult> list) {
        if (list == null || list.size() < 3) {
            return;
        }
        m79312e(true);
        this.f53966a.mo69685l(list.get(0).getLoadingSvg(), TextUtils.isEmpty(list.get(0).getContentPic()) ? -1 : 10, new C13180a(list));
        this.f53967b.mo69685l(list.get(1).getLoadingSvg(), TextUtils.isEmpty(list.get(1).getContentPic()) ? -1 : 10, new C13181b(list));
        this.f53968c.mo69685l(list.get(2).getLoadingSvg(), TextUtils.isEmpty(list.get(2).getContentPic()) ? -1 : 10, new C13182c(list));
    }

    /* JADX INFO: renamed from: g */
    public void m79314g() {
        AnimEffectPlayer animEffectPlayer = this.f53966a;
        if (animEffectPlayer != null) {
            animEffectPlayer.m69687n();
            this.f53967b.m69687n();
            this.f53968c.m69687n();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79308a(this);
        AnimEffectPlayer animEffectPlayer = this.f53966a;
        if (animEffectPlayer != null) {
            animEffectPlayer.setClearsAfterStop(true);
            this.f53967b.setClearsAfterStop(true);
            this.f53968c.setClearsAfterStop(true);
        }
    }

    public VoiceTripleDiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceTripleDiceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

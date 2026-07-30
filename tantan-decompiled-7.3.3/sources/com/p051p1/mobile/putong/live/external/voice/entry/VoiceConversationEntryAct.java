package com.p051p1.mobile.putong.live.external.voice.entry;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.external.voiceslipcard.chatroom.VoiceTopicChatRoomFrag;
import io.agora.rtc2.internal.AudioRoutingController;
import p153l.dhw;
import p153l.ldc0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class VoiceConversationEntryAct extends PutongAct {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m72128Y1(Context context) {
        Intent intent = new Intent(context, (Class<?>) VoiceConversationEntryAct.class);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public /* synthetic */ void m72129Z1(C4470c c4470c) {
        if (c4470c == C4470c.f16264f) {
            AbstractC0428k abstractC0428kM2568m = getSupportFragmentManager().m2568m();
            abstractC0428kM2568m.m2813t(ldc0.f131499R0, VoiceTopicChatRoomFrag.m72327P4("from_feed", getIntent().getStringExtra("default_select_tab")), "VOICE_ENTRY_ACT_FRAG_TAG");
            abstractC0428kM2568m.mo2709j();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(ldc0.f131499R0);
        return frameLayout;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.pan0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151314a.m72129Z1((C4470c) obj);
            }
        }));
    }
}

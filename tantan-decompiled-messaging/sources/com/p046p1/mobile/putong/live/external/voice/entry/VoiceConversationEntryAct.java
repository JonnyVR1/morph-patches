package com.p046p1.mobile.putong.live.external.voice.entry;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.external.voiceslipcard.chatroom.VoiceTopicChatRoomFrag;
import io.agora.rtc2.internal.AudioRoutingController;
import p149l.e30;
import p149l.f5c0;
import p149l.ffw;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceConversationEntryAct extends PutongAct {
    /* JADX INFO: renamed from: X1 */
    public static Intent m70945X1(Context context) {
        Intent intent = new Intent(context, (Class<?>) VoiceConversationEntryAct.class);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public /* synthetic */ void m70946Y1(C4319c c4319c) {
        if (c4319c == C4319c.f15545f) {
            AbstractC0427k abstractC0427kM2567m = getSupportFragmentManager().m2567m();
            abstractC0427kM2567m.m2812t(f5c0.f95042R0, VoiceTopicChatRoomFrag.m71144P4("from_feed", getIntent().getStringExtra("default_select_tab")), "VOICE_ENTRY_ACT_FRAG_TAG");
            abstractC0427kM2567m.mo2708j();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(f5c0.f95042R0);
        return frameLayout;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.l1n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125672a.m70946Y1((C4319c) obj);
            }
        }));
    }
}

package com.p046p1.mobile.putong.live.external.page.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.Target;
import com.p046p1.mobile.putong.live.external.internal.live.square.featuredExp.LiveSquareFrag;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.videochat.LiveVideoChatFrag;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.favoritevoice.VoiceInternalFavoriteRoomFrag;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.search.LiveVoiceSearchFrag;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.LiveVoiceInternalSquareFrag;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.p061me.LiveMyVoiceRoomPageFrag;
import com.p046p1.mobile.putong.live.external.intl.music.MusicPlaylistPageFrag;
import com.p046p1.mobile.putong.live.external.intl.music.MusicScanningPageFrag;
import com.p046p1.mobile.putong.live.external.page.setting.hideavatar.LiveHideAvatarFrag;
import com.p046p1.mobile.putong.live.external.page.setting.privacy.frag.HideWealthIconFrag;
import com.p046p1.mobile.putong.live.external.page.setting.privacy.frag.LivePrivacySettingFrag;
import com.p046p1.mobile.putong.live.external.voice.home.LiveSquareVoiceFragment;
import org.eclipse.jetty.http.HttpTokens;
import p149l.d5c0;
import p149l.e30;
import p149l.pgi0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveIndependentSettingAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public String f46166c;

    /* JADX INFO: renamed from: X1 */
    public static Intent m70698X1(Context context, String str) {
        return m70699Y1(context, str, new Bundle());
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m70699Y1(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) LiveIndependentSettingAct.class);
        intent.putExtra(Target.TYPE, str);
        intent.putExtra("bundle_for_frag", bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public void m70700Z1(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra(Target.TYPE);
        PutongFrag putongFragM70702a2 = m70702a2(stringExtra, getIntent().getBundleExtra("bundle_for_frag"));
        if (putongFragM70702a2 == null) {
            lambda$debugItems$19();
            return;
        }
        this.f46166c = stringExtra;
        AbstractC0427k abstractC0427kM2567m = getSupportFragmentManager().m2567m();
        abstractC0427kM2567m.m2812t(d5c0.f84419G0, putongFragM70702a2, stringExtra);
        abstractC0427kM2567m.mo2708j();
    }

    /* JADX INFO: renamed from: b2 */
    public static void m70701b2(Context context, String str) {
        context.startActivity(m70698X1(context, str));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a2 */
    public final PutongFrag m70702a2(String str, Bundle bundle) {
        if (str == null) {
            return null;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case -2047173500:
                if (str.equals("live_internal_voice_search")) {
                    b = 0;
                }
                break;
            case -1989216462:
                if (str.equals("live_internal_my_room_frag")) {
                    b = 1;
                }
                break;
            case -1310914045:
                if (str.equals("scheme_dummy_frag")) {
                    b = 2;
                }
                break;
            case -1265876153:
                if (str.equals("voice_favorite_chat_rooms")) {
                    b = 3;
                }
                break;
            case -1249044591:
                if (str.equals("live_setting_page")) {
                    b = 4;
                }
                break;
            case -872464527:
                if (str.equals("intl_music_playlist_page_frag")) {
                    b = 5;
                }
                break;
            case -639604094:
                if (str.equals("scheme_fake_frag")) {
                    b = 6;
                }
                break;
            case -482553098:
                if (str.equals("hide_avatar")) {
                    b = 7;
                }
                break;
            case -185733554:
                if (str.equals("hide_wealth_icon")) {
                    b = 8;
                }
                break;
            case 205338138:
                if (str.equals("live_video_square_page")) {
                    b = 9;
                }
                break;
            case 1006366948:
                if (str.equals("voice_square_page")) {
                    b = 10;
                }
                break;
            case 1052233881:
                if (str.equals("privacy_setting")) {
                    b = 11;
                }
                break;
            case 1718347215:
                if (str.equals("live_video_chat")) {
                    b = 12;
                }
                break;
            case 1941121756:
                if (str.equals("voice_internal_square_page")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 1962199952:
                if (str.equals("intl_music_scanning_page_frag")) {
                    b = 14;
                }
                break;
        }
        switch (b) {
            case 0:
                return LiveVoiceSearchFrag.m69863O4();
            case 1:
                return LiveMyVoiceRoomPageFrag.m69897O4();
            case 2:
                return new LiveSchemeDummyFrag();
            case 3:
                return VoiceInternalFavoriteRoomFrag.m69859M4();
            case 4:
                return LiveSettingFragNew.m70705D5(bundle);
            case 5:
                return MusicPlaylistPageFrag.m70236M4();
            case 6:
                return new LiveSchemeFakeFrag();
            case 7:
                return LiveHideAvatarFrag.m70776M4(bundle);
            case 8:
                return HideWealthIconFrag.m70784N4();
            case 9:
                return LiveSquareFrag.m69030S4(bundle);
            case 10:
                return new LiveSquareVoiceFragment();
            case 11:
                return LivePrivacySettingFrag.m70786M4(bundle);
            case 12:
                return LiveVideoChatFrag.m69136l5(bundle);
            case 13:
                return LiveVoiceInternalSquareFrag.m69870N4(bundle);
            case 14:
                return MusicScanningPageFrag.m70238M4();
            default:
                return null;
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(d5c0.f84419G0);
        return frameLayout;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.uxs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178757a.m70700Z1((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if ("live_video_square_page".equals(this.f46166c) && pgi0.m168730l().m168751x()) {
            return;
        }
        super.onBackPressed();
    }
}

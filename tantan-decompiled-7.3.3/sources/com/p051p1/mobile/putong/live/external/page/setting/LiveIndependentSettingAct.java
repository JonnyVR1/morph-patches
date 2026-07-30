package com.p051p1.mobile.putong.live.external.page.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.Target;
import com.p051p1.mobile.putong.live.external.internal.live.square.featuredExp.LiveSquareFrag;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.videochat.LiveVideoChatFrag;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.favoritevoice.VoiceInternalFavoriteRoomFrag;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.search.LiveVoiceSearchFrag;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.LiveVoiceInternalSquareFrag;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.p066me.LiveMyVoiceRoomPageFrag;
import com.p051p1.mobile.putong.live.external.intl.music.MusicPlaylistPageFrag;
import com.p051p1.mobile.putong.live.external.intl.music.MusicScanningPageFrag;
import com.p051p1.mobile.putong.live.external.page.setting.hideavatar.LiveHideAvatarFrag;
import com.p051p1.mobile.putong.live.external.page.setting.privacy.frag.HideWealthIconFrag;
import com.p051p1.mobile.putong.live.external.page.setting.privacy.frag.LivePrivacySettingFrag;
import com.p051p1.mobile.putong.live.external.voice.home.LiveSquareVoiceFragment;
import org.eclipse.jetty.http.HttpTokens;
import p153l.jdc0;
import p153l.ppi0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveIndependentSettingAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public String f47014c;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m71881Y1(Context context, String str) {
        return m71882Z1(context, str, new Bundle());
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m71882Z1(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) LiveIndependentSettingAct.class);
        intent.putExtra(Target.TYPE, str);
        intent.putExtra("bundle_for_frag", bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public void m71883a2(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra(Target.TYPE);
        PutongFrag putongFragM71885b2 = m71885b2(stringExtra, getIntent().getBundleExtra("bundle_for_frag"));
        if (putongFragM71885b2 == null) {
            lambda$debugItems$19();
            return;
        }
        this.f47014c = stringExtra;
        AbstractC0428k abstractC0428kM2568m = getSupportFragmentManager().m2568m();
        abstractC0428kM2568m.m2813t(jdc0.f120137G0, putongFragM71885b2, stringExtra);
        abstractC0428kM2568m.mo2709j();
    }

    /* JADX INFO: renamed from: c2 */
    public static void m71884c2(Context context, String str) {
        context.startActivity(m71881Y1(context, str));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b2 */
    public final PutongFrag m71885b2(String str, Bundle bundle) {
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
                return LiveVoiceSearchFrag.m71046O4();
            case 1:
                return LiveMyVoiceRoomPageFrag.m71080O4();
            case 2:
                return new LiveSchemeDummyFrag();
            case 3:
                return VoiceInternalFavoriteRoomFrag.m71042M4();
            case 4:
                return LiveSettingFragNew.m71888D5(bundle);
            case 5:
                return MusicPlaylistPageFrag.m71419M4();
            case 6:
                return new LiveSchemeFakeFrag();
            case 7:
                return LiveHideAvatarFrag.m71959M4(bundle);
            case 8:
                return HideWealthIconFrag.m71967N4();
            case 9:
                return LiveSquareFrag.m70213S4(bundle);
            case 10:
                return new LiveSquareVoiceFragment();
            case 11:
                return LivePrivacySettingFrag.m71969M4(bundle);
            case 12:
                return LiveVideoChatFrag.m70319l5(bundle);
            case 13:
                return LiveVoiceInternalSquareFrag.m71053N4(bundle);
            case 14:
                return MusicScanningPageFrag.m71421M4();
            default:
                return null;
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(jdc0.f120137G0);
        return frameLayout;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.vzs
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186509a.m71883a2((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if ("live_video_square_page".equals(this.f47014c) && ppi0.m173207l().m173228x()) {
            return;
        }
        super.onBackPressed();
    }
}

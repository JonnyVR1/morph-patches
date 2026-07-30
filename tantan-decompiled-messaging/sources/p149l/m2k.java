package p149l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class m2k extends ztl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        m152696y(act, w2e0Var);
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return SchemeKey.enterVoiceRoom.equals(str);
    }

    /* JADX INFO: renamed from: s */
    public final void m152690s(String str, String str2, String str3, String str4) {
        if ("manager-recall-invite-card".equals(str4)) {
            zvf0.m220399u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, vwb.m200311Y("audio_card_type", "user_invite_room_admin"));
        } else if ("live-chat-tab-report".equals(str4)) {
            zvf0.m220399u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, vwb.m200311Y("anchorId", str), vwb.m200311Y("liveId", str2), vwb.m200311Y("audio_tab_id", "NA"), vwb.m200311Y("profile_user_id", str3), vwb.m200311Y("audio_room_type", "normal_audio"), vwb.m200311Y("audio_card_type", str4));
        }
    }

    /* JADX INFO: renamed from: t */
    public Intent m152691t(Context context, String str, String str2, boolean z, String str3, String str4) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "default";
        }
        BLiveVoice bLiveVoiceNew_ = BLiveVoice.new_();
        bLiveVoiceNew_.type = BLiveAbsData.VOICE_LIVE;
        bLiveVoiceNew_.f44323id = str;
        bLiveVoiceNew_.anchor = BLiveOwner.new_();
        if (TextUtils.equals(str4, "virtualAvatar")) {
            AudienceStartData.C11430a c11430aM67612v = AudienceStartData.getBuilder().m67606Q(true).m67594E(str).m67604O(str2).m67612v(z);
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            return s9s.f163232f.m134373f(context, c11430aM67612v.m67616z(str3).m67611u());
        }
        Bundle bundleM172515g = q2u.m172515g(bLiveVoiceNew_, str2);
        if (!TextUtils.isEmpty(str3)) {
            bundleM172515g.putString("live_push_voice_focus_user_id", str3);
            bundleM172515g.putString("live_push_voice", "live.schema.push.all");
        }
        return x9o0.m207503c(context, bundleM172515g);
    }

    /* JADX INFO: renamed from: u */
    public final void m152692u(Act act, String str) {
        if (ytl.m216064h(act)) {
            if (TextUtils.equals(str, l9s.m149047J().f56011id)) {
                lsi0.m151595y("已在自己的群聊中");
            } else {
                lsi0.m151595y("正在麦上，无法进入其他群聊");
            }
        }
        act.startActivity(LiveIndependentSettingAct.m70699Y1(act, "scheme_fake_frag", null));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m152693v(Act act, boolean z, g6n0 g6n0Var) {
        rwj0.m181415n(g6n0Var);
        if (!vwb.m200296J(g6n0Var.f101294a)) {
            m152695x(act, g6n0Var.f101294a.get(0).liveId, z);
        } else {
            osi0.m165782f(R$string.f44866D0);
            yuf0.m216111a(act, "tabId");
        }
    }

    /* JADX INFO: renamed from: w */
    public void m152694w(Act act, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8) {
        String str9 = TextUtils.isEmpty(str3) ? "default" : str3;
        if (TextUtils.equals(str3, "link-share-voice-live") && ytl.m216065i()) {
            m152692u(act, str);
            return;
        }
        m152690s(str, str2, str6, str3);
        Intent intentM152691t = m152691t(act, str2, str9, z, str6, str8);
        if (!TextUtils.equals(str8, "virtualAvatar")) {
            intentM152691t.putExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA, AudienceStartData.getBuilder().m67606Q(true).m67594E(str2).m67604O(str9).m67596G(str5).m67616z(TextUtils.isEmpty(str6) ? "" : str6).m67590A(TextUtils.isEmpty(str7) ? "" : str7).m67609T(str4).m67611u());
        }
        act.startActivity(intentM152691t);
    }

    /* JADX INFO: renamed from: x */
    public final void m152695x(Act act, String str, boolean z) {
        m152694w(act, "", str, "voice-chat-admin", z, AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR, null, "", "", "");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX INFO: renamed from: y */
    public final void m152696y(final Act act, w2e0 w2e0Var) {
        String str;
        if (TextUtils.isEmpty(w2e0Var.m201098f().get("liveId"))) {
            return;
        }
        String strM181411j = rwj0.m181411j(w2e0Var, "anchorId");
        String strM181411j2 = rwj0.m181411j(w2e0Var, "anchor");
        String strM181411j3 = rwj0.m181411j(w2e0Var, "liveId");
        String strM181411j4 = rwj0.m181411j(w2e0Var, "source");
        final boolean zM181406e = rwj0.m181406e(w2e0Var, "autoJoinGame");
        String strM181411j5 = rwj0.m181411j(w2e0Var, "recallSourceId");
        if (TextUtils.isEmpty(strM181411j5)) {
            strM181411j5 = rwj0.m181411j(w2e0Var, "fromUserId");
        }
        if (TextUtils.isEmpty(strM181411j5)) {
            strM181411j5 = rwj0.m181411j(w2e0Var, "sourceUserId");
        }
        String str2 = strM181411j5;
        String strM201095c = w2e0Var.m201095c();
        if (TextUtils.isEmpty(strM201095c)) {
            str = "";
        } else {
            String queryParameter = Uri.parse(strM201095c).getQueryParameter(OMSTemplateModeType.toast);
            if (TextUtils.isEmpty(queryParameter)) {
                str = "";
            } else {
                try {
                    str = new String(Base64.decode(queryParameter, 0));
                } catch (IllegalArgumentException e) {
                    CrashHelper.m81296c(e);
                    str = "";
                }
            }
        }
        String strM181411j6 = rwj0.m181411j(w2e0Var, "live_mode");
        if (TextUtils.isEmpty(strM181411j6)) {
            strM181411j6 = rwj0.m181411j(w2e0Var, "liveMode");
        }
        String str3 = strM181411j6;
        rwj0.m181411j(w2e0Var, "from");
        if (rwj0.m181407f(w2e0Var, "locateChat") == 1) {
            m216069b(act, "voiceSquare", null);
        }
        if (TextUtils.equals(strM181411j2, "my-fixed-room")) {
            act.duringCreated(LiveVoiceApi.getVoiceDataByChatAssistant(strM181411j2, "")).subscribe(ffw.m121197h(new e30() { // from class: l.l2k
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f125793a.m152693v(act, zM181406e, (g6n0) obj);
                }
            }));
        } else {
            m152694w(act, strM181411j, strM181411j3, strM181411j4, zM181406e, TextUtils.equals("my-fixed-room", strM181411j2) ? AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR : "", "", str2, str, str3);
        }
    }
}

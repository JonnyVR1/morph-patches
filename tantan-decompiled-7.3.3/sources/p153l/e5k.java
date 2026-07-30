package p153l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class e5k extends nwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        m119544y(act, abe0Var);
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return SchemeKey.enterVoiceRoom.equals(str);
    }

    /* JADX INFO: renamed from: s */
    public final void m119538s(String str, String str2, String str3, String str4) {
        if ("manager-recall-invite-card".equals(str4)) {
            i4g0.m138523u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, jyb.m147494Y("audio_card_type", "user_invite_room_admin"));
        } else if ("live-chat-tab-report".equals(str4)) {
            i4g0.m138523u("e_live_audio_room_enter", OMSDialogPositon.p_chat_view, jyb.m147494Y("anchorId", str), jyb.m147494Y("liveId", str2), jyb.m147494Y("audio_tab_id", "NA"), jyb.m147494Y("profile_user_id", str3), jyb.m147494Y("audio_room_type", "normal_audio"), jyb.m147494Y("audio_card_type", str4));
        }
    }

    /* JADX INFO: renamed from: t */
    public Intent m119539t(Context context, String str, String str2, boolean z, String str3, String str4) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "default";
        }
        BLiveVoice bLiveVoiceNew_ = BLiveVoice.new_();
        bLiveVoiceNew_.type = BLiveAbsData.VOICE_LIVE;
        bLiveVoiceNew_.f45171id = str;
        bLiveVoiceNew_.anchor = BLiveOwner.new_();
        if (TextUtils.equals(str4, "virtualAvatar")) {
            AudienceStartData.C11593a c11593aM68795v = AudienceStartData.getBuilder().m68789Q(true).m68777E(str).m68787O(str2).m68795v(z);
            if (TextUtils.isEmpty(str3)) {
                str3 = "";
            }
            return tbs.f172993f.m143704f(context, c11593aM68795v.m68799z(str3).m68794u());
        }
        Bundle bundleM179824g = r4u.m179824g(bLiveVoiceNew_, str2);
        if (!TextUtils.isEmpty(str3)) {
            bundleM179824g.putString("live_push_voice_focus_user_id", str3);
            bundleM179824g.putString("live_push_voice", "live.schema.push.all");
        }
        return bjo0.m104636c(context, bundleM179824g);
    }

    /* JADX INFO: renamed from: u */
    public final void m119540u(Act act, String str) {
        if (mwl.m160558h(act)) {
            if (TextUtils.equals(str, mbs.m157824J().f56859id)) {
                o1j0.m165651y("已在自己的群聊中");
            } else {
                o1j0.m165651y("正在麦上，无法进入其他群聊");
            }
        }
        act.startActivity(LiveIndependentSettingAct.m71882Z1(act, "scheme_fake_frag", null));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m119541v(Act act, boolean z, kfn0 kfn0Var) {
        v5k0.m199902n(kfn0Var);
        if (!jyb.m147479J(kfn0Var.f126460a)) {
            m119543x(act, kfn0Var.f126460a.get(0).liveId, z);
        } else {
            r1j0.m179419f(R$string.f45714D0);
            h3g0.m133482a(act, "tabId");
        }
    }

    /* JADX INFO: renamed from: w */
    public void m119542w(Act act, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8) {
        String str9 = TextUtils.isEmpty(str3) ? "default" : str3;
        if (TextUtils.equals(str3, "link-share-voice-live") && mwl.m160559i()) {
            m119540u(act, str);
            return;
        }
        m119538s(str, str2, str6, str3);
        Intent intentM119539t = m119539t(act, str2, str9, z, str6, str8);
        if (!TextUtils.equals(str8, "virtualAvatar")) {
            intentM119539t.putExtra(AudienceStartData.LIVE_AUDIENCE_START_DATA, AudienceStartData.getBuilder().m68789Q(true).m68777E(str2).m68787O(str9).m68779G(str5).m68799z(TextUtils.isEmpty(str6) ? "" : str6).m68773A(TextUtils.isEmpty(str7) ? "" : str7).m68792T(str4).m68794u());
        }
        act.startActivity(intentM119539t);
    }

    /* JADX INFO: renamed from: x */
    public final void m119543x(Act act, String str, boolean z) {
        m119542w(act, "", str, "voice-chat-admin", z, AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR, null, "", "", "");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX INFO: renamed from: y */
    public final void m119544y(final Act act, abe0 abe0Var) {
        String str;
        if (TextUtils.isEmpty(abe0Var.m96743f().get("liveId"))) {
            return;
        }
        String strM199898j = v5k0.m199898j(abe0Var, "anchorId");
        String strM199898j2 = v5k0.m199898j(abe0Var, "anchor");
        String strM199898j3 = v5k0.m199898j(abe0Var, "liveId");
        String strM199898j4 = v5k0.m199898j(abe0Var, "source");
        final boolean zM199893e = v5k0.m199893e(abe0Var, "autoJoinGame");
        String strM199898j5 = v5k0.m199898j(abe0Var, "recallSourceId");
        if (TextUtils.isEmpty(strM199898j5)) {
            strM199898j5 = v5k0.m199898j(abe0Var, "fromUserId");
        }
        if (TextUtils.isEmpty(strM199898j5)) {
            strM199898j5 = v5k0.m199898j(abe0Var, "sourceUserId");
        }
        String str2 = strM199898j5;
        String strM96740c = abe0Var.m96740c();
        if (TextUtils.isEmpty(strM96740c)) {
            str = "";
        } else {
            String queryParameter = Uri.parse(strM96740c).getQueryParameter(OMSTemplateModeType.toast);
            if (TextUtils.isEmpty(queryParameter)) {
                str = "";
            } else {
                try {
                    str = new String(Base64.decode(queryParameter, 0));
                } catch (IllegalArgumentException e) {
                    CrashHelper.m82479c(e);
                    str = "";
                }
            }
        }
        String strM199898j6 = v5k0.m199898j(abe0Var, "live_mode");
        if (TextUtils.isEmpty(strM199898j6)) {
            strM199898j6 = v5k0.m199898j(abe0Var, "liveMode");
        }
        String str3 = strM199898j6;
        v5k0.m199898j(abe0Var, "from");
        if (v5k0.m199894f(abe0Var, "locateChat") == 1) {
            m160564b(act, "voiceSquare", null);
        }
        if (TextUtils.equals(strM199898j2, "my-fixed-room")) {
            act.duringCreated(LiveVoiceApi.getVoiceDataByChatAssistant(strM199898j2, "")).subscribe(dhw.m115829h(new y20() { // from class: l.d5k
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f85160a.m119541v(act, zM199893e, (kfn0) obj);
                }
            }));
        } else {
            m119542w(act, strM199898j, strM199898j3, strM199898j4, zM199893e, TextUtils.equals("my-fixed-room", strM199898j2) ? AudienceStartData.ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR : "", "", str2, str, str3);
        }
    }
}

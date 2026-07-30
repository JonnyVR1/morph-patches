package com.p051p1.mobile.putong.core.newui.messages.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.wyd0;

/* JADX INFO: loaded from: classes11.dex */
public enum ConversationCounterTypeSp {
    aEmojiIceBreakingNoReplyTime("associate_emoji_ice_breaking_no_reply_time", WeJson.EMPTY_MAP),
    aEmojiIceBreakingMessageTimeLimitTime("associate_emoji_ice_message_time_limit_time", WeJson.EMPTY_MAP),
    messageSensitiveTipsShowUser("message_sensitive_tips_show_user", WeJson.EMPTY_MAP),
    platinumPinChatOriginLevel("platinum_pinned_chat_origin_level", WeJson.EMPTY_MAP),
    platinumChatPinGuideCloseCount("platinum_pinned_chat_guide_close_count", WeJson.EMPTY_MAP),
    platinumChatPinGuideLastCloseTime("platinum_pinned_chat_guide_last_close_time", WeJson.EMPTY_MAP),
    CityCentreShowBigCard("city_centre_show_big_card", WeJson.EMPTY_MAP),
    CityCentrePushShowInfo("city_centre_push_show_info", WeJson.EMPTY_MAP),
    oDiamondVisitorHideFootPrintShowCount("o_diamond_visitor_hide_footprint_show_count", WeJson.EMPTY_MAP),
    iceBreakLastMessageShowCountLimit("ice_break_last_message_show_count_limit", WeJson.EMPTY_MAP),
    oDiamondVisitorHideFootPrintLastCloseMills("o_diamond_visitor_hide_footprint_last_close_time", WeJson.EMPTY_MAP),
    wechatNotifyGuideShowCount("wechat_notify_guide_item", WeJson.EMPTY_MAP),
    idealTypeFeedbackLastCloseTime("idealtype_feedback_last_close_time", WeJson.EMPTY_MAP),
    idealTypeFeedbackResponseCount("idealtype_feedback_show_count", WeJson.EMPTY_MAP),
    IdealGuideMsg("ideal_guide_msg", WeJson.EMPTY_MAP),
    LoveLetterGuideShowTime("love_letter_guide_show_time", WeJson.EMPTY_MAP),
    LoveLetterGuideShowCount("love_letter_guide_show_count", WeJson.EMPTY_MAP),
    InviationForAuthenticationTime("inviation_for_authentication_time", WeJson.EMPTY_MAP),
    IsInsertInviationForAuthentication("isinsert_inviation_for_authentication_time", WeJson.EMPTY_MAP),
    ShowPicLikeGuideTime("show_pic_like_guide_time", WeJson.EMPTY_MAP),
    PrologueNotResponseGuideLastShowTime("PrologueNotResponseGuideLastShowTime", WeJson.EMPTY_MAP),
    ProloguesEnterChatCount("prologues_enter_chat_count", WeJson.EMPTY_MAP);

    private String defValue;
    private boolean ignoreAccount;
    private JSONObject jsonObject;

    /* JADX INFO: renamed from: sp */
    private wyd0 f26697sp;
    private String spKey;

    ConversationCounterTypeSp(String str, String str2) {
        this.ignoreAccount = false;
        this.spKey = str;
        this.defValue = str2;
    }

    private void init() {
        if (this.f26697sp == null) {
            if (this.ignoreAccount) {
                this.f26697sp = new wyd0(this.spKey, this.defValue);
            } else {
                this.f26697sp = new wyd0(this.spKey + CoreModule.m30929H().userId(), this.defValue);
            }
        }
        if (this.jsonObject == null) {
            try {
                this.jsonObject = new JSONObject(this.f26697sp.get());
            } catch (JSONException unused) {
            }
        }
    }

    public static void resetAll() {
        for (ConversationCounterTypeSp conversationCounterTypeSp : values()) {
            conversationCounterTypeSp.reset();
        }
    }

    public void clear() {
        if (NullChecker.m82486a(this.f26697sp)) {
            this.f26697sp.clear();
        }
        reset();
    }

    public int get(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (this.jsonObject == null) {
            init();
        }
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return ((Integer) this.jsonObject.get(str)).intValue();
            } catch (JSONException unused) {
            }
        }
        return 0;
    }

    public long getLong(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (this.jsonObject == null) {
            init();
        }
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return this.jsonObject.optLong(str, 0L);
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    @Nullable
    public String getStr(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (this.jsonObject == null) {
            init();
        }
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return this.jsonObject.optString(str, "");
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public boolean hasKey(String str) {
        init();
        if (this.jsonObject == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.jsonObject.has(str);
    }

    public void reset() {
        this.f26697sp = null;
        this.jsonObject = null;
    }

    public void set(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.jsonObject == null) {
            init();
        }
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(str, i);
            this.f26697sp.put(this.jsonObject.toString());
        } catch (JSONException unused) {
        }
    }

    public void setLong(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.jsonObject == null) {
            init();
        }
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(str, j);
            this.f26697sp.put(this.jsonObject.toString());
        } catch (JSONException unused) {
        }
    }

    public void setStr(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.jsonObject == null) {
            init();
        }
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
            this.f26697sp.put(this.jsonObject.toString());
        } catch (JSONException unused) {
        }
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        init();
        JSONObject jSONObject = this.jsonObject;
        return jSONObject == null ? this.defValue : jSONObject.toString();
    }

    ConversationCounterTypeSp(String str, String str2, boolean z) {
        this.spKey = str;
        this.defValue = str2;
        this.ignoreAccount = z;
    }

    public void set(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        set(str, get(str) + 1);
    }
}

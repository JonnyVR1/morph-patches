package com.p000p1.mobile.putong.core.newui.messages.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.uqd0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public enum ConversationCounterTypeSp {
    aEmojiIceBreakingNoReplyTime("associate_emoji_ice_breaking_no_reply_time", "{}"),
    aEmojiIceBreakingMessageTimeLimitTime("associate_emoji_ice_message_time_limit_time", "{}"),
    messageSensitiveTipsShowUser("message_sensitive_tips_show_user", "{}"),
    platinumPinChatOriginLevel("platinum_pinned_chat_origin_level", "{}"),
    platinumChatPinGuideCloseCount("platinum_pinned_chat_guide_close_count", "{}"),
    platinumChatPinGuideLastCloseTime("platinum_pinned_chat_guide_last_close_time", "{}"),
    CityCentreShowBigCard("city_centre_show_big_card", "{}"),
    CityCentrePushShowInfo("city_centre_push_show_info", "{}"),
    oDiamondVisitorHideFootPrintShowCount("o_diamond_visitor_hide_footprint_show_count", "{}"),
    iceBreakLastMessageShowCountLimit("ice_break_last_message_show_count_limit", "{}"),
    oDiamondVisitorHideFootPrintLastCloseMills("o_diamond_visitor_hide_footprint_last_close_time", "{}"),
    wechatNotifyGuideShowCount("wechat_notify_guide_item", "{}"),
    idealTypeFeedbackLastCloseTime("idealtype_feedback_last_close_time", "{}"),
    idealTypeFeedbackResponseCount("idealtype_feedback_show_count", "{}"),
    IdealGuideMsg("ideal_guide_msg", "{}"),
    LoveLetterGuideShowTime("love_letter_guide_show_time", "{}"),
    LoveLetterGuideShowCount("love_letter_guide_show_count", "{}"),
    InviationForAuthenticationTime("inviation_for_authentication_time", "{}"),
    IsInsertInviationForAuthentication("isinsert_inviation_for_authentication_time", "{}"),
    ShowPicLikeGuideTime("show_pic_like_guide_time", "{}"),
    PrologueNotResponseGuideLastShowTime("PrologueNotResponseGuideLastShowTime", "{}"),
    ProloguesEnterChatCount("prologues_enter_chat_count", "{}");

    private String defValue;
    private boolean ignoreAccount;
    private JSONObject jsonObject;

    /* JADX INFO: renamed from: sp */
    private uqd0 f4733sp;
    private String spKey;

    ConversationCounterTypeSp(String str, String str2) {
        this.ignoreAccount = false;
        this.spKey = str;
        this.defValue = str2;
    }

    private void init() {
        if (this.f4733sp == null) {
            if (this.ignoreAccount) {
                this.f4733sp = new uqd0(this.spKey, this.defValue);
            } else {
                this.f4733sp = new uqd0(this.spKey + CoreModule.H().userId(), this.defValue);
            }
        }
        if (this.jsonObject == null) {
            try {
                this.jsonObject = new JSONObject((String) this.f4733sp.get());
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
        if (NullChecker.a(this.f4733sp)) {
            this.f4733sp.clear();
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
        this.f4733sp = null;
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
            this.f4733sp.put(this.jsonObject.toString());
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
            this.f4733sp.put(this.jsonObject.toString());
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
            this.f4733sp.put(this.jsonObject.toString());
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

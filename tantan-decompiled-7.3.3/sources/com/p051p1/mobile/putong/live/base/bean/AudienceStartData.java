package com.p051p1.mobile.putong.live.base.bean;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import java.io.Serializable;
import java.util.UUID;
import p153l.wft;

/* JADX INFO: loaded from: classes13.dex */
public class AudienceStartData implements Serializable {
    public static final String ANCHOR_TAG = "jump_to_tag";
    public static final String ENTER_VOICE_KEY_CHAT_ASSISTANT = "chatAssistant";
    public static final String ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR = "chatAssistantFixAnchor";
    public static final String ENTER_VOICE_KEY_CHAT_ASSISTANT_FIX_ANCHOR_SHOW_PACKAGE = "chatAssistantFixAnchorShowPackage";
    public static final String LIVE_AUDIENCE_START_DATA = "LIVE_AUDIENCE_START_DATA";
    public boolean autoJoinGame;

    @Nullable
    public String backgroundType;

    @Nullable
    public String backgroundUrl;
    public String category;
    public String focusUserId;
    public String focusUserLeftToast;
    public boolean fromFW;
    public boolean fromLiveSquare;
    public String gameType;
    public boolean handleEnterRoomResult;
    public boolean isOfficialShowAnchor;
    public boolean isTeenMode;
    public BLiveAbsData live;
    public String liveSchema;
    public String liveType;
    public boolean needAutoApplySettle;
    public boolean needShowRoomInfoDialog;
    public String open;
    private String roomId;
    public boolean showSignInDialog;
    public boolean simpleChat;
    public String source;
    public String template;
    public String traceId;
    private String voiceBusinessProvider;
    private String voiceBusinessType;
    public String voiceEnterType;
    private String voicePushUrl;
    public boolean withMute;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.AudienceStartData$a */
    public static class C11593a {

        /* JADX INFO: renamed from: A */
        public String f45110A;

        /* JADX INFO: renamed from: B */
        public String f45111B;

        /* JADX INFO: renamed from: C */
        public String f45112C;

        /* JADX INFO: renamed from: D */
        public String f45113D;

        /* JADX INFO: renamed from: a */
        public boolean f45114a;

        /* JADX INFO: renamed from: b */
        public boolean f45115b;

        /* JADX INFO: renamed from: c */
        public String f45116c;

        /* JADX INFO: renamed from: d */
        public BLiveAbsData f45117d;

        /* JADX INFO: renamed from: j */
        public String f45123j;

        /* JADX INFO: renamed from: l */
        public String f45125l;

        /* JADX INFO: renamed from: m */
        public String f45126m;

        /* JADX INFO: renamed from: n */
        public boolean f45127n;

        /* JADX INFO: renamed from: p */
        public String f45129p;

        /* JADX INFO: renamed from: q */
        public String f45130q;

        /* JADX INFO: renamed from: r */
        public String f45131r;

        /* JADX INFO: renamed from: s */
        public boolean f45132s;

        /* JADX INFO: renamed from: t */
        public boolean f45133t;

        /* JADX INFO: renamed from: u */
        public String f45134u;

        /* JADX INFO: renamed from: v */
        public String f45135v;

        /* JADX INFO: renamed from: w */
        public boolean f45136w;

        /* JADX INFO: renamed from: x */
        public boolean f45137x;

        /* JADX INFO: renamed from: y */
        public boolean f45138y;

        /* JADX INFO: renamed from: z */
        public String f45139z;

        /* JADX INFO: renamed from: e */
        public boolean f45118e = false;

        /* JADX INFO: renamed from: f */
        public String f45119f = "";

        /* JADX INFO: renamed from: g */
        public String f45120g = "";

        /* JADX INFO: renamed from: h */
        public String f45121h = "";

        /* JADX INFO: renamed from: i */
        public boolean f45122i = false;

        /* JADX INFO: renamed from: k */
        public boolean f45124k = false;

        /* JADX INFO: renamed from: o */
        public boolean f45128o = false;

        /* JADX INFO: renamed from: A */
        public C11593a m68773A(String str) {
            this.f45131r = str;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C11593a m68774B(boolean z) {
            this.f45118e = z;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C11593a m68775C(boolean z) {
            this.f45122i = z;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C11593a m68776D(BLiveAbsData bLiveAbsData) {
            this.f45117d = bLiveAbsData;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public C11593a m68777E(String str) {
            this.f45123j = str;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public C11593a m68778F(String str) {
            this.f45113D = str;
            return this;
        }

        /* JADX INFO: renamed from: G */
        public C11593a m68779G(String str) {
            this.f45130q = str;
            return this;
        }

        /* JADX INFO: renamed from: H */
        public C11593a m68780H(String str) {
            this.f45125l = str;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public C11593a m68781I(boolean z) {
            this.f45114a = z;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public C11593a m68782J(String str) {
            this.f45116c = str;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public C11593a m68783K(String str) {
            this.f45126m = str;
            return this;
        }

        /* JADX INFO: renamed from: L */
        public C11593a m68784L(String str) {
            this.f45139z = str;
            return this;
        }

        /* JADX INFO: renamed from: M */
        public C11593a m68785M(boolean z) {
            this.f45128o = z;
            return this;
        }

        /* JADX INFO: renamed from: N */
        public C11593a m68786N(boolean z) {
            this.f45132s = z;
            return this;
        }

        /* JADX INFO: renamed from: O */
        public C11593a m68787O(String str) {
            this.f45119f = str;
            return this;
        }

        /* JADX INFO: renamed from: P */
        public C11593a m68788P(boolean z) {
            this.f45115b = z;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public C11593a m68789Q(boolean z) {
            this.f45124k = z;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public C11593a m68790R(String str) {
            this.f45111B = str;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C11593a m68791S(String str) {
            this.f45112C = str;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public C11593a m68792T(String str) {
            this.f45129p = str;
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C11593a m68793U(String str) {
            this.f45110A = str;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public AudienceStartData m68794u() {
            if (this.f45117d == null) {
                BLiveAbsData bLiveAbsDataNew_ = this.f45124k ? BLiveVoice.new_() : BLive.new_();
                this.f45117d = bLiveAbsDataNew_;
                bLiveAbsDataNew_.f45171id = this.f45123j;
            }
            return new AudienceStartData(this);
        }

        /* JADX INFO: renamed from: v */
        public C11593a m68795v(boolean z) {
            this.f45138y = z;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C11593a m68796w(String str) {
            this.f45134u = str;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C11593a m68797x(String str) {
            this.f45135v = str;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C11593a m68798y(String str) {
            this.f45120g = str;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C11593a m68799z(String str) {
            this.f45121h = str;
            return this;
        }
    }

    private AudienceStartData(C11593a c11593a) {
        this.live = c11593a.f45117d;
        this.fromFW = c11593a.f45118e;
        this.source = c11593a.f45119f;
        this.category = c11593a.f45120g;
        this.focusUserId = c11593a.f45121h;
        this.fromLiveSquare = c11593a.f45122i;
        this.live.requestExtra = c11593a.f45126m;
        this.showSignInDialog = c11593a.f45128o;
        this.isTeenMode = c11593a.f45115b;
        this.open = c11593a.f45116c;
        this.voiceEnterType = c11593a.f45129p;
        this.liveSchema = c11593a.f45130q;
        this.focusUserLeftToast = c11593a.f45131r;
        this.traceId = UUID.randomUUID().toString();
        this.withMute = c11593a.f45127n;
        this.liveType = c11593a.f45125l;
        this.simpleChat = c11593a.f45132s;
        this.handleEnterRoomResult = c11593a.f45133t;
        this.backgroundType = c11593a.f45134u;
        this.backgroundUrl = c11593a.f45135v;
        this.needAutoApplySettle = c11593a.f45136w;
        this.needShowRoomInfoDialog = c11593a.f45137x;
        this.isOfficialShowAnchor = c11593a.f45114a;
        this.roomId = c11593a.f45139z;
        this.voiceBusinessProvider = c11593a.f45111B;
        this.voicePushUrl = c11593a.f45110A;
        this.voiceBusinessType = c11593a.f45112C;
        this.autoJoinGame = c11593a.f45138y;
        if (wft.m206159b(1) || !TextUtils.isEmpty(this.live.liveMode)) {
            return;
        }
        this.live.liveMode = c11593a.f45113D;
    }

    public static C11593a getBuilder() {
        return new C11593a();
    }

    public void clearQuickInfo() {
        this.roomId = "";
        this.voiceBusinessType = "";
        this.voicePushUrl = "";
        this.voiceBusinessProvider = "";
    }

    public String consumeFocusUserLeftToast() {
        String str = this.focusUserLeftToast;
        this.focusUserLeftToast = "";
        return str;
    }

    public String getFocusUser() {
        return this.focusUserId;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public String getVoiceBusinessProvider() {
        return this.voiceBusinessProvider;
    }

    public String getVoiceBusinessType() {
        return this.voiceBusinessType;
    }

    public String getVoicePushUrl() {
        return this.voicePushUrl;
    }

    public boolean isQuickEnterRtc() {
        return (TextUtils.isEmpty(this.roomId) || TextUtils.isEmpty(this.voiceBusinessProvider) || TextUtils.isEmpty(this.voicePushUrl) || TextUtils.isEmpty(this.voiceBusinessType)) ? false : true;
    }

    public String toString() {
        String str = this.live.isVoiceLive() ? "voice" : "live";
        BLiveOwner bLiveOwner = this.live.anchor;
        return "AudienceStartData{liveId=" + this.live.f45171id + ",liveType=" + str + ",anchorId=" + (bLiveOwner != null ? bLiveOwner.f45267id : "") + ", isTeenMode=" + this.isTeenMode + ", fromFW=" + this.fromFW + ", source='" + this.source + ", category='" + this.category + ", focusUserId='" + this.focusUserId + ", fromLiveSquare=" + this.fromLiveSquare + ", showSignInDialog=" + this.showSignInDialog + ", open='" + this.open + ", voiceEnterType='" + this.voiceEnterType + ", liveSchema='" + this.liveSchema + ", simpleChat='" + this.simpleChat + '}';
    }
}

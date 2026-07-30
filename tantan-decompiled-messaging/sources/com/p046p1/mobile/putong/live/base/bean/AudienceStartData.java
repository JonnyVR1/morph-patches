package com.p046p1.mobile.putong.live.base.bean;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import java.io.Serializable;
import java.util.UUID;
import p149l.vdt;

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
    public static class C11430a {

        /* JADX INFO: renamed from: A */
        public String f44262A;

        /* JADX INFO: renamed from: B */
        public String f44263B;

        /* JADX INFO: renamed from: C */
        public String f44264C;

        /* JADX INFO: renamed from: D */
        public String f44265D;

        /* JADX INFO: renamed from: a */
        public boolean f44266a;

        /* JADX INFO: renamed from: b */
        public boolean f44267b;

        /* JADX INFO: renamed from: c */
        public String f44268c;

        /* JADX INFO: renamed from: d */
        public BLiveAbsData f44269d;

        /* JADX INFO: renamed from: j */
        public String f44275j;

        /* JADX INFO: renamed from: l */
        public String f44277l;

        /* JADX INFO: renamed from: m */
        public String f44278m;

        /* JADX INFO: renamed from: n */
        public boolean f44279n;

        /* JADX INFO: renamed from: p */
        public String f44281p;

        /* JADX INFO: renamed from: q */
        public String f44282q;

        /* JADX INFO: renamed from: r */
        public String f44283r;

        /* JADX INFO: renamed from: s */
        public boolean f44284s;

        /* JADX INFO: renamed from: t */
        public boolean f44285t;

        /* JADX INFO: renamed from: u */
        public String f44286u;

        /* JADX INFO: renamed from: v */
        public String f44287v;

        /* JADX INFO: renamed from: w */
        public boolean f44288w;

        /* JADX INFO: renamed from: x */
        public boolean f44289x;

        /* JADX INFO: renamed from: y */
        public boolean f44290y;

        /* JADX INFO: renamed from: z */
        public String f44291z;

        /* JADX INFO: renamed from: e */
        public boolean f44270e = false;

        /* JADX INFO: renamed from: f */
        public String f44271f = "";

        /* JADX INFO: renamed from: g */
        public String f44272g = "";

        /* JADX INFO: renamed from: h */
        public String f44273h = "";

        /* JADX INFO: renamed from: i */
        public boolean f44274i = false;

        /* JADX INFO: renamed from: k */
        public boolean f44276k = false;

        /* JADX INFO: renamed from: o */
        public boolean f44280o = false;

        /* JADX INFO: renamed from: A */
        public C11430a m67590A(String str) {
            this.f44283r = str;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C11430a m67591B(boolean z) {
            this.f44270e = z;
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C11430a m67592C(boolean z) {
            this.f44274i = z;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C11430a m67593D(BLiveAbsData bLiveAbsData) {
            this.f44269d = bLiveAbsData;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public C11430a m67594E(String str) {
            this.f44275j = str;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public C11430a m67595F(String str) {
            this.f44265D = str;
            return this;
        }

        /* JADX INFO: renamed from: G */
        public C11430a m67596G(String str) {
            this.f44282q = str;
            return this;
        }

        /* JADX INFO: renamed from: H */
        public C11430a m67597H(String str) {
            this.f44277l = str;
            return this;
        }

        /* JADX INFO: renamed from: I */
        public C11430a m67598I(boolean z) {
            this.f44266a = z;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public C11430a m67599J(String str) {
            this.f44268c = str;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public C11430a m67600K(String str) {
            this.f44278m = str;
            return this;
        }

        /* JADX INFO: renamed from: L */
        public C11430a m67601L(String str) {
            this.f44291z = str;
            return this;
        }

        /* JADX INFO: renamed from: M */
        public C11430a m67602M(boolean z) {
            this.f44280o = z;
            return this;
        }

        /* JADX INFO: renamed from: N */
        public C11430a m67603N(boolean z) {
            this.f44284s = z;
            return this;
        }

        /* JADX INFO: renamed from: O */
        public C11430a m67604O(String str) {
            this.f44271f = str;
            return this;
        }

        /* JADX INFO: renamed from: P */
        public C11430a m67605P(boolean z) {
            this.f44267b = z;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public C11430a m67606Q(boolean z) {
            this.f44276k = z;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public C11430a m67607R(String str) {
            this.f44263B = str;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C11430a m67608S(String str) {
            this.f44264C = str;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public C11430a m67609T(String str) {
            this.f44281p = str;
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C11430a m67610U(String str) {
            this.f44262A = str;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public AudienceStartData m67611u() {
            if (this.f44269d == null) {
                BLiveAbsData bLiveAbsDataNew_ = this.f44276k ? BLiveVoice.new_() : BLive.new_();
                this.f44269d = bLiveAbsDataNew_;
                bLiveAbsDataNew_.f44323id = this.f44275j;
            }
            return new AudienceStartData(this);
        }

        /* JADX INFO: renamed from: v */
        public C11430a m67612v(boolean z) {
            this.f44290y = z;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C11430a m67613w(String str) {
            this.f44286u = str;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C11430a m67614x(String str) {
            this.f44287v = str;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C11430a m67615y(String str) {
            this.f44272g = str;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C11430a m67616z(String str) {
            this.f44273h = str;
            return this;
        }
    }

    private AudienceStartData(C11430a c11430a) {
        this.live = c11430a.f44269d;
        this.fromFW = c11430a.f44270e;
        this.source = c11430a.f44271f;
        this.category = c11430a.f44272g;
        this.focusUserId = c11430a.f44273h;
        this.fromLiveSquare = c11430a.f44274i;
        this.live.requestExtra = c11430a.f44278m;
        this.showSignInDialog = c11430a.f44280o;
        this.isTeenMode = c11430a.f44267b;
        this.open = c11430a.f44268c;
        this.voiceEnterType = c11430a.f44281p;
        this.liveSchema = c11430a.f44282q;
        this.focusUserLeftToast = c11430a.f44283r;
        this.traceId = UUID.randomUUID().toString();
        this.withMute = c11430a.f44279n;
        this.liveType = c11430a.f44277l;
        this.simpleChat = c11430a.f44284s;
        this.handleEnterRoomResult = c11430a.f44285t;
        this.backgroundType = c11430a.f44286u;
        this.backgroundUrl = c11430a.f44287v;
        this.needAutoApplySettle = c11430a.f44288w;
        this.needShowRoomInfoDialog = c11430a.f44289x;
        this.isOfficialShowAnchor = c11430a.f44266a;
        this.roomId = c11430a.f44291z;
        this.voiceBusinessProvider = c11430a.f44263B;
        this.voicePushUrl = c11430a.f44262A;
        this.voiceBusinessType = c11430a.f44264C;
        this.autoJoinGame = c11430a.f44290y;
        if (vdt.m198092b(1) || !TextUtils.isEmpty(this.live.liveMode)) {
            return;
        }
        this.live.liveMode = c11430a.f44265D;
    }

    public static C11430a getBuilder() {
        return new C11430a();
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
        return "AudienceStartData{liveId=" + this.live.f44323id + ",liveType=" + str + ",anchorId=" + (bLiveOwner != null ? bLiveOwner.f44419id : "") + ", isTeenMode=" + this.isTeenMode + ", fromFW=" + this.fromFW + ", source='" + this.source + ", category='" + this.category + ", focusUserId='" + this.focusUserId + ", fromLiveSquare=" + this.fromLiveSquare + ", showSignInDialog=" + this.showSignInDialog + ", open='" + this.open + ", voiceEnterType='" + this.voiceEnterType + ", liveSchema='" + this.liveSchema + ", simpleChat='" + this.simpleChat + '}';
    }
}

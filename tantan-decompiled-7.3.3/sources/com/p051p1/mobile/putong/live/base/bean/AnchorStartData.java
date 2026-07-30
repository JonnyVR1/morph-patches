package com.p051p1.mobile.putong.live.base.bean;

import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: loaded from: classes13.dex */
public class AnchorStartData implements Serializable {
    public static final String ANCHOR_SOURCE_BACK_FROM_OFFICIAL_SHOW = "back-from-official-show";
    public static final String ANCHOR_SOURCE_H5 = "H5";
    public static final String ANCHOR_SOURCE_MULTI_CALL_MATCH = "moment-nearby-match";
    public static final String ANCHOR_SOURCE_P_LIVE = "p_live";
    public final String anchorSource;
    public final String gameType;
    public final boolean isFromFloatWindow;
    public final boolean needFinish;
    public final boolean needVerification;
    public final OfficialShowSwitchRoomData switchRoomData;
    public final String template;
    public final String topicId;
    public final String traceId;
    public String type;
    public final String voiceEntranceType;

    public static class OfficialShowSwitchRoomData implements Serializable {
        public String avatarUrl;
        public String liveId;
        public String name;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.bean.AnchorStartData$a */
    public static class C11592a {

        /* JADX INFO: renamed from: a */
        public String f45100a = "type_normal_live";

        /* JADX INFO: renamed from: b */
        public String f45101b;

        /* JADX INFO: renamed from: c */
        public String f45102c;

        /* JADX INFO: renamed from: d */
        public boolean f45103d;

        /* JADX INFO: renamed from: e */
        public boolean f45104e;

        /* JADX INFO: renamed from: f */
        public String f45105f;

        /* JADX INFO: renamed from: g */
        public boolean f45106g;

        /* JADX INFO: renamed from: h */
        public OfficialShowSwitchRoomData f45107h;

        /* JADX INFO: renamed from: i */
        public String f45108i;

        /* JADX INFO: renamed from: j */
        public String f45109j;

        /* JADX INFO: renamed from: k */
        public AnchorStartData m68743k() {
            return new AnchorStartData(this);
        }

        /* JADX INFO: renamed from: l */
        public C11592a m68744l(boolean z) {
            this.f45104e = z;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C11592a m68745m(boolean z) {
            this.f45103d = z;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C11592a m68746n(String str) {
            this.f45101b = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C11592a m68747o(boolean z) {
            this.f45106g = z;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C11592a m68748p(String str) {
            this.f45109j = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C11592a m68749q(OfficialShowSwitchRoomData officialShowSwitchRoomData) {
            this.f45107h = officialShowSwitchRoomData;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C11592a m68750r(String str) {
            this.f45108i = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C11592a m68751s(String str) {
            this.f45102c = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C11592a m68752t(String str) {
            this.f45105f = str;
            return this;
        }
    }

    private AnchorStartData(C11592a c11592a) {
        this.type = c11592a.f45100a;
        this.topicId = c11592a.f45102c;
        this.needFinish = c11592a.f45104e;
        this.needVerification = c11592a.f45103d;
        this.traceId = UUID.randomUUID().toString();
        this.voiceEntranceType = c11592a.f45105f;
        this.isFromFloatWindow = c11592a.f45106g;
        if (c11592a.f45107h != null) {
            this.switchRoomData = c11592a.f45107h;
            this.anchorSource = ANCHOR_SOURCE_BACK_FROM_OFFICIAL_SHOW;
        } else {
            this.switchRoomData = null;
            this.anchorSource = c11592a.f45101b;
        }
        this.template = c11592a.f45108i;
        this.gameType = c11592a.f45109j;
    }

    public static C11592a getBuilder() {
        return new C11592a();
    }
}

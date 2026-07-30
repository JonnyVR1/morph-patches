package com.p046p1.mobile.putong.live.base.bean;

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
    public static class C11429a {

        /* JADX INFO: renamed from: a */
        public String f44252a = "type_normal_live";

        /* JADX INFO: renamed from: b */
        public String f44253b;

        /* JADX INFO: renamed from: c */
        public String f44254c;

        /* JADX INFO: renamed from: d */
        public boolean f44255d;

        /* JADX INFO: renamed from: e */
        public boolean f44256e;

        /* JADX INFO: renamed from: f */
        public String f44257f;

        /* JADX INFO: renamed from: g */
        public boolean f44258g;

        /* JADX INFO: renamed from: h */
        public OfficialShowSwitchRoomData f44259h;

        /* JADX INFO: renamed from: i */
        public String f44260i;

        /* JADX INFO: renamed from: j */
        public String f44261j;

        /* JADX INFO: renamed from: k */
        public AnchorStartData m67560k() {
            return new AnchorStartData(this);
        }

        /* JADX INFO: renamed from: l */
        public C11429a m67561l(boolean z) {
            this.f44256e = z;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C11429a m67562m(boolean z) {
            this.f44255d = z;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C11429a m67563n(String str) {
            this.f44253b = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C11429a m67564o(boolean z) {
            this.f44258g = z;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C11429a m67565p(String str) {
            this.f44261j = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C11429a m67566q(OfficialShowSwitchRoomData officialShowSwitchRoomData) {
            this.f44259h = officialShowSwitchRoomData;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C11429a m67567r(String str) {
            this.f44260i = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C11429a m67568s(String str) {
            this.f44254c = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C11429a m67569t(String str) {
            this.f44257f = str;
            return this;
        }
    }

    private AnchorStartData(C11429a c11429a) {
        this.type = c11429a.f44252a;
        this.topicId = c11429a.f44254c;
        this.needFinish = c11429a.f44256e;
        this.needVerification = c11429a.f44255d;
        this.traceId = UUID.randomUUID().toString();
        this.voiceEntranceType = c11429a.f44257f;
        this.isFromFloatWindow = c11429a.f44258g;
        if (c11429a.f44259h != null) {
            this.switchRoomData = c11429a.f44259h;
            this.anchorSource = ANCHOR_SOURCE_BACK_FROM_OFFICIAL_SHOW;
        } else {
            this.switchRoomData = null;
            this.anchorSource = c11429a.f44253b;
        }
        this.template = c11429a.f44260i;
        this.gameType = c11429a.f44261j;
    }

    public static C11429a getBuilder() {
        return new C11429a();
    }
}

package com.p051p1.mobile.putong.live.livingroom.common.jumproom;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public class JumpRoomData implements Serializable {
    private JumpRoomType jumpRoomType;
    private BLiveAbsData live;
    private HashSet<String> liveIdNeedToRemove = new HashSet<>();
    private String liveType;
    private final String oldAnchorName;
    private final String oldLiveId;
    private final String oldRoomId;
    private String oldSource;
    private String source;
    private final String toLiveId;
    private final String toRoomId;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData$a */
    public static class C12924a {

        /* JADX INFO: renamed from: a */
        public String f50027a;

        /* JADX INFO: renamed from: b */
        public String f50028b;

        /* JADX INFO: renamed from: c */
        public String f50029c;

        /* JADX INFO: renamed from: d */
        public String f50030d;

        /* JADX INFO: renamed from: e */
        public String f50031e;

        /* JADX INFO: renamed from: f */
        public String f50032f;

        /* JADX INFO: renamed from: g */
        public BLiveAbsData f50033g;

        /* JADX INFO: renamed from: h */
        public String f50034h;

        /* JADX INFO: renamed from: i */
        public JumpRoomType f50035i = null;

        /* JADX INFO: renamed from: j */
        public HashSet<String> f50036j = new HashSet<>();

        /* JADX INFO: renamed from: k */
        public String f50037k;

        /* JADX INFO: renamed from: l */
        public C12924a m74206l(String... strArr) {
            this.f50036j.addAll(Arrays.asList(strArr));
            return this;
        }

        /* JADX INFO: renamed from: m */
        public JumpRoomData m74207m() {
            if (this.f50035i == null) {
                this.f50035i = JumpRoomType.DEFAULT;
            }
            return new JumpRoomData(this);
        }

        /* JADX INFO: renamed from: n */
        public C12924a m74208n(JumpRoomType jumpRoomType) {
            this.f50035i = jumpRoomType;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C12924a m74209o(BLiveAbsData bLiveAbsData) {
            this.f50033g = bLiveAbsData;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C12924a m74210p(String str) {
            this.f50034h = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C12924a m74211q(String str) {
            this.f50029c = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C12924a m74212r(String str) {
            this.f50027a = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C12924a m74213s(String str) {
            this.f50028b = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C12924a m74214t(String str) {
            this.f50037k = str;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C12924a m74215u(String str) {
            this.f50032f = str;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C12924a m74216v(String str) {
            this.f50030d = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C12924a m74217w(String str) {
            this.f50031e = str;
            return this;
        }
    }

    public JumpRoomData(C12924a c12924a) {
        this.jumpRoomType = JumpRoomType.DEFAULT;
        this.oldAnchorName = c12924a.f50029c;
        this.oldLiveId = c12924a.f50027a;
        this.oldRoomId = c12924a.f50028b;
        this.toLiveId = c12924a.f50030d;
        this.toRoomId = c12924a.f50031e;
        this.source = c12924a.f50032f;
        this.live = c12924a.f50033g;
        this.liveType = c12924a.f50034h;
        this.jumpRoomType = c12924a.f50035i;
        this.liveIdNeedToRemove.addAll(c12924a.f50036j);
        this.oldSource = c12924a.f50037k;
    }

    public JumpRoomType getJumpRoomType() {
        return this.jumpRoomType;
    }

    public BLiveAbsData getLive() {
        return this.live;
    }

    public HashSet<String> getLiveIdNeedToRemove() {
        return this.liveIdNeedToRemove;
    }

    public String getLiveType() {
        return this.liveType;
    }

    public String getOldAnchorName() {
        return this.oldAnchorName;
    }

    public String getOldLiveId() {
        return this.oldLiveId;
    }

    public String getOldRoomId() {
        return this.oldRoomId;
    }

    public String getOldSource() {
        return this.oldSource;
    }

    public String getSource() {
        return this.source;
    }

    public String getToLiveId() {
        return this.toLiveId;
    }

    public String getToRoomId() {
        return this.toRoomId;
    }

    public boolean isOldDataValid() {
        return (TextUtils.isEmpty(this.oldLiveId) || TextUtils.isEmpty(this.oldRoomId) || TextUtils.isEmpty(this.oldAnchorName)) ? false : true;
    }

    public void setLive(BLiveAbsData bLiveAbsData) {
        this.live = bLiveAbsData;
    }

    public void setLiveType(String str) {
        this.liveType = str;
    }

    public void setOldSource(String str) {
        this.oldSource = str;
    }

    public void setSource(String str) {
        this.source = str;
    }
}

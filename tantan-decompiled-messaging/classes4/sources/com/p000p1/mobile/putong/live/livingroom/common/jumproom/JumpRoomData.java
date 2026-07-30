package com.p000p1.mobile.putong.live.livingroom.common.jumproom;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
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
    public static class C0350a {

        /* JADX INFO: renamed from: a */
        public String f5221a;

        /* JADX INFO: renamed from: b */
        public String f5222b;

        /* JADX INFO: renamed from: c */
        public String f5223c;

        /* JADX INFO: renamed from: d */
        public String f5224d;

        /* JADX INFO: renamed from: e */
        public String f5225e;

        /* JADX INFO: renamed from: f */
        public String f5226f;

        /* JADX INFO: renamed from: g */
        public BLiveAbsData f5227g;

        /* JADX INFO: renamed from: h */
        public String f5228h;

        /* JADX INFO: renamed from: i */
        public JumpRoomType f5229i = null;

        /* JADX INFO: renamed from: j */
        public HashSet<String> f5230j = new HashSet<>();

        /* JADX INFO: renamed from: k */
        public String f5231k;

        /* JADX INFO: renamed from: l */
        public C0350a m6546l(String... strArr) {
            this.f5230j.addAll(Arrays.asList(strArr));
            return this;
        }

        /* JADX INFO: renamed from: m */
        public JumpRoomData m6547m() {
            if (this.f5229i == null) {
                this.f5229i = JumpRoomType.DEFAULT;
            }
            return new JumpRoomData(this);
        }

        /* JADX INFO: renamed from: n */
        public C0350a m6548n(JumpRoomType jumpRoomType) {
            this.f5229i = jumpRoomType;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C0350a m6549o(BLiveAbsData bLiveAbsData) {
            this.f5227g = bLiveAbsData;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C0350a m6550p(String str) {
            this.f5228h = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C0350a m6551q(String str) {
            this.f5223c = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C0350a m6552r(String str) {
            this.f5221a = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C0350a m6553s(String str) {
            this.f5222b = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C0350a m6554t(String str) {
            this.f5231k = str;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C0350a m6555u(String str) {
            this.f5226f = str;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C0350a m6556v(String str) {
            this.f5224d = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C0350a m6557w(String str) {
            this.f5225e = str;
            return this;
        }
    }

    public JumpRoomData(C0350a c0350a) {
        this.jumpRoomType = JumpRoomType.DEFAULT;
        this.oldAnchorName = c0350a.f5223c;
        this.oldLiveId = c0350a.f5221a;
        this.oldRoomId = c0350a.f5222b;
        this.toLiveId = c0350a.f5224d;
        this.toRoomId = c0350a.f5225e;
        this.source = c0350a.f5226f;
        this.live = c0350a.f5227g;
        this.liveType = c0350a.f5228h;
        this.jumpRoomType = c0350a.f5229i;
        this.liveIdNeedToRemove.addAll(c0350a.f5230j);
        this.oldSource = c0350a.f5231k;
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

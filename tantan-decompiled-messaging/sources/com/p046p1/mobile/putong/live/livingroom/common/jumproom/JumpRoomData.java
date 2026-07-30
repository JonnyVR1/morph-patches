package com.p046p1.mobile.putong.live.livingroom.common.jumproom;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
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
    public static class C12761a {

        /* JADX INFO: renamed from: a */
        public String f49179a;

        /* JADX INFO: renamed from: b */
        public String f49180b;

        /* JADX INFO: renamed from: c */
        public String f49181c;

        /* JADX INFO: renamed from: d */
        public String f49182d;

        /* JADX INFO: renamed from: e */
        public String f49183e;

        /* JADX INFO: renamed from: f */
        public String f49184f;

        /* JADX INFO: renamed from: g */
        public BLiveAbsData f49185g;

        /* JADX INFO: renamed from: h */
        public String f49186h;

        /* JADX INFO: renamed from: i */
        public JumpRoomType f49187i = null;

        /* JADX INFO: renamed from: j */
        public HashSet<String> f49188j = new HashSet<>();

        /* JADX INFO: renamed from: k */
        public String f49189k;

        /* JADX INFO: renamed from: l */
        public C12761a m73023l(String... strArr) {
            this.f49188j.addAll(Arrays.asList(strArr));
            return this;
        }

        /* JADX INFO: renamed from: m */
        public JumpRoomData m73024m() {
            if (this.f49187i == null) {
                this.f49187i = JumpRoomType.DEFAULT;
            }
            return new JumpRoomData(this);
        }

        /* JADX INFO: renamed from: n */
        public C12761a m73025n(JumpRoomType jumpRoomType) {
            this.f49187i = jumpRoomType;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C12761a m73026o(BLiveAbsData bLiveAbsData) {
            this.f49185g = bLiveAbsData;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C12761a m73027p(String str) {
            this.f49186h = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C12761a m73028q(String str) {
            this.f49181c = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C12761a m73029r(String str) {
            this.f49179a = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C12761a m73030s(String str) {
            this.f49180b = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C12761a m73031t(String str) {
            this.f49189k = str;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C12761a m73032u(String str) {
            this.f49184f = str;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C12761a m73033v(String str) {
            this.f49182d = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C12761a m73034w(String str) {
            this.f49183e = str;
            return this;
        }
    }

    public JumpRoomData(C12761a c12761a) {
        this.jumpRoomType = JumpRoomType.DEFAULT;
        this.oldAnchorName = c12761a.f49181c;
        this.oldLiveId = c12761a.f49179a;
        this.oldRoomId = c12761a.f49180b;
        this.toLiveId = c12761a.f49182d;
        this.toRoomId = c12761a.f49183e;
        this.source = c12761a.f49184f;
        this.live = c12761a.f49185g;
        this.liveType = c12761a.f49186h;
        this.jumpRoomType = c12761a.f49187i;
        this.liveIdNeedToRemove.addAll(c12761a.f49188j);
        this.oldSource = c12761a.f49189k;
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

package com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceInternalEntryBean extends BaseLiveBean {
    public static final String TYPE_BG_STYLE_BLUE = "blue";
    public static final String TYPE_BG_STYLE_ORANGE = "orange";
    public static final String TYPE_IMAGE_STYLE_DYNAMIC = "dynamic";
    public static final String TYPE_IMAGE_STYLE_STATIC = "static";
    public static final int TYPE_MULTI_AVATAR = 0;
    public static final int TYPE_SINGLE_AVATAR = 1;

    @SerializedName("bgStyle")
    private String bgStyle;

    @SerializedName("goAction")
    private LiveGoAction goAction;

    @SerializedName("hasRedSpot")
    private boolean hasRedSpot;

    @SerializedName("headSculptureList")
    private ArrayList<String> headSculptureList;

    @SerializedName("imageStyle")
    private String imageStyle;

    @SerializedName("jumpBackToMessage")
    private boolean jumpBackToMessage;

    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private String label;

    @SerializedName("subTitle")
    private String subTitle;

    @SerializedName("title")
    private String title;

    @SerializedName("trackData")
    private LiveCardTrackData trackData;

    @SerializedName("type")
    private int type;

    @SerializedName("unreadShowNumber")
    private int unreadShowNumber;

    public String getBgStyle() {
        return this.bgStyle;
    }

    public LiveGoAction getGoAction() {
        return this.goAction;
    }

    public boolean getHasRedSpot() {
        return this.hasRedSpot;
    }

    public ArrayList<String> getHeadSculptureList() {
        return this.headSculptureList;
    }

    public String getImageStyle() {
        return this.imageStyle;
    }

    public String getLabel() {
        return this.label;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public LiveCardTrackData getTrackData() {
        return this.trackData;
    }

    public int getType() {
        return this.type;
    }

    public int getUnreadShowNumber() {
        return this.unreadShowNumber;
    }

    public boolean isJumpBackToMessage() {
        return this.jumpBackToMessage;
    }

    public void setBgStyle(String str) {
        this.bgStyle = str;
    }

    public void setGoAction(LiveGoAction liveGoAction) {
        this.goAction = liveGoAction;
    }

    public void setHasRedSpot(boolean z) {
        this.hasRedSpot = z;
    }

    public void setHeadSculptureList(ArrayList<String> arrayList) {
        this.headSculptureList = arrayList;
    }

    public void setImageStyle(String str) {
        this.imageStyle = str;
    }

    public void setJumpBackToMessage(boolean z) {
        this.jumpBackToMessage = z;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackData(LiveCardTrackData liveCardTrackData) {
        this.trackData = liveCardTrackData;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUnreadShowNumber(int i) {
        this.unreadShowNumber = i;
    }
}

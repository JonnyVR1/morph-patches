package com.p000p1.mobile.putong.core.data;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class HeartbeatPushInfo {
    public List<Media> mediaList;
    public PushMessageCustom pushMessage;
    public long startTime;
    private boolean hasRenderByCard = false;
    private boolean hasRenderByMsg = false;
    private boolean hasReportSvipDlgShow = false;
    private boolean abandoned = false;
    private List<String> autoDismissedTab = new ArrayList();
    public List<String> autoDismissTab = new ArrayList();
    private boolean isFake = false;
    private boolean isTrack = false;
    private boolean hasReportExposure = false;
    private List<TabName> showTabs = new ArrayList();

    public HeartbeatPushInfo(PushMessageCustom pushMessageCustom, List<Media> list, long j) {
        this.pushMessage = pushMessageCustom;
        this.mediaList = list;
        this.startTime = j;
    }

    public List<TabName> getShowTabs() {
        return this.showTabs;
    }

    public boolean hasReportDlg() {
        return this.hasReportSvipDlgShow;
    }

    public boolean hasReportExposure() {
        return this.hasReportExposure;
    }

    public boolean isAbandoned() {
        return this.abandoned;
    }

    public boolean isActiveMsg() {
        return NullChecker.a(this.pushMessage) && !TextUtils.isEmpty(this.pushMessage.triggeredUserId) && TextUtils.equals(this.pushMessage.triggeredUserId, CoreModule.H().userId());
    }

    public boolean isFake() {
        return this.isFake;
    }

    public boolean isHasAutoDismissed(TabName tabName) {
        return this.autoDismissedTab.contains(tabName.toString());
    }

    public boolean isHasRenderByCard() {
        return this.hasRenderByCard;
    }

    public boolean isHasRenderByMsg() {
        return this.hasRenderByMsg;
    }

    public boolean isTabShowed(TabName tabName) {
        return this.showTabs.contains(tabName);
    }

    public boolean isTrack() {
        return this.isTrack;
    }

    public void setAbandoned() {
        this.abandoned = true;
    }

    public void setAutoDismissed(TabName tabName) {
        this.autoDismissedTab.add(tabName.toString());
    }

    public void setFake(boolean z) {
        this.isFake = z;
    }

    public void setHasRenderByCard() {
        this.hasRenderByCard = true;
    }

    public void setHasRenderByMsg() {
        this.hasRenderByMsg = true;
    }

    public void setReportExposure(boolean z) {
        this.hasReportExposure = z;
    }

    public void setSvipDlgShow() {
        this.hasReportSvipDlgShow = true;
    }

    public void setTabShow(TabName tabName) {
        this.showTabs.add(tabName);
    }

    public void setTrack(boolean z) {
        this.isTrack = z;
    }
}

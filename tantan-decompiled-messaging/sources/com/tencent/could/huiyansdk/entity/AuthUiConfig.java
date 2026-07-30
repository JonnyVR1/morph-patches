package com.tencent.could.huiyansdk.entity;

import com.tencent.could.huiyansdk.enums.VideoSize;

/* JADX INFO: loaded from: classes2.dex */
public class AuthUiConfig {
    public VideoSize videoSize = VideoSize.SIZE_480P;
    public boolean isShowCountdown = true;
    public boolean isShowErrorDialog = true;
    public int authLayoutResId = -1;
    public int landAuthLayoutResId = -1;
    public int authWithLongCheck720LayoutResId = -1;
    public int feedBackErrorColor = -1;
    public int feedBackExtraTipColor = -1;
    public int feedBackTxtColor = -1;
    public int authCircleErrorColor = -1;
    public int authCircleCorrectColor = -1;
    public int authLayoutBgColor = -1;
    public int loadingStageBgColor = -1;
    public int loadingStageTipsColor = -1;
    public int mainActivityThemeId = -1;
    public int cancelTxtColor = -10;
    public int countDownTxtColor = -10;
    public int statusBarColor = -1;
    public boolean isTransparentStatusBar = false;
    public int transparentStatusBarMoveHeight = 15;
    public boolean useDeepColorStatusBarIcon = false;
    public boolean isHideFrontCircleViewOnStart = false;
    public boolean isHideFrontCircleViewOnCheck = false;
    public boolean isHideFrontCircleViewOnReflect = false;
    public boolean isHideAvatarGuideFrame = false;

    public int getAuthCircleCorrectColor() {
        return this.authCircleCorrectColor;
    }

    public int getAuthCircleErrorColor() {
        return this.authCircleErrorColor;
    }

    public int getAuthLayoutBgColor() {
        return this.authLayoutBgColor;
    }

    public int getAuthLayoutResId() {
        return this.authLayoutResId;
    }

    public int getAuthWithLongCheck720LayoutResId() {
        return this.authWithLongCheck720LayoutResId;
    }

    public int getCancelTxtColor() {
        return this.cancelTxtColor;
    }

    public int getCountDownTxtColor() {
        return this.countDownTxtColor;
    }

    public int getFeedBackErrorColor() {
        return this.feedBackErrorColor;
    }

    public int getFeedBackExtraTipColor() {
        return this.feedBackExtraTipColor;
    }

    public int getFeedBackTxtColor() {
        return this.feedBackTxtColor;
    }

    public int getLandAuthLayoutResId() {
        return this.landAuthLayoutResId;
    }

    public int getLoadingStageBgColor() {
        return this.loadingStageBgColor;
    }

    public int getLoadingStageTipsColor() {
        return this.loadingStageTipsColor;
    }

    public int getMainActivityThemeId() {
        return this.mainActivityThemeId;
    }

    public int getStatusBarColor() {
        return this.statusBarColor;
    }

    public int getTransparentStatusBarMoveHeight() {
        return this.transparentStatusBarMoveHeight;
    }

    public VideoSize getVideoSize() {
        return this.videoSize;
    }

    public boolean isHideAvatarGuideFrame() {
        return this.isHideAvatarGuideFrame;
    }

    public boolean isHideFrontCircleViewOnCheck() {
        return this.isHideFrontCircleViewOnCheck;
    }

    public boolean isHideFrontCircleViewOnReflect() {
        return this.isHideFrontCircleViewOnReflect;
    }

    public boolean isHideFrontCircleViewOnStart() {
        return this.isHideFrontCircleViewOnStart;
    }

    public boolean isShowCountdown() {
        return this.isShowCountdown;
    }

    public boolean isShowErrorDialog() {
        return this.isShowErrorDialog;
    }

    public boolean isTransparentStatusBar() {
        return this.isTransparentStatusBar;
    }

    public boolean isUseDeepColorStatusBarIcon() {
        return this.useDeepColorStatusBarIcon;
    }

    public void setAuthCircleCorrectColor(int i) {
        this.authCircleCorrectColor = i;
    }

    public void setAuthCircleErrorColor(int i) {
        this.authCircleErrorColor = i;
    }

    public void setAuthLayoutBgColor(int i) {
        this.authLayoutBgColor = i;
    }

    public void setAuthLayoutResId(int i) {
        this.authLayoutResId = i;
    }

    public void setAuthWithLongCheck720LayoutResId(int i) {
        this.authWithLongCheck720LayoutResId = i;
    }

    public void setCancelTxtColor(int i) {
        this.cancelTxtColor = i;
    }

    public void setCountDownTxtColor(int i) {
        this.countDownTxtColor = i;
    }

    public void setFeedBackErrorColor(int i) {
        this.feedBackErrorColor = i;
    }

    public void setFeedBackExtraTipColor(int i) {
        this.feedBackExtraTipColor = i;
    }

    public void setFeedBackTxtColor(int i) {
        this.feedBackTxtColor = i;
    }

    public void setHideAvatarGuideFrame(boolean z) {
        this.isHideAvatarGuideFrame = z;
    }

    public void setHideFrontCircleViewOnCheck(boolean z) {
        this.isHideFrontCircleViewOnCheck = z;
    }

    public void setHideFrontCircleViewOnReflect(boolean z) {
        this.isHideFrontCircleViewOnReflect = z;
    }

    public void setHideFrontCircleViewOnStart(boolean z) {
        this.isHideFrontCircleViewOnStart = z;
    }

    public void setLandAuthLayoutResId(int i) {
        this.landAuthLayoutResId = i;
    }

    public void setLoadingStageBgColor(int i) {
        this.loadingStageBgColor = i;
    }

    public void setLoadingStageTipsColor(int i) {
        this.loadingStageTipsColor = i;
    }

    public void setMainActivityThemeId(int i) {
        this.mainActivityThemeId = i;
    }

    public void setShowCountdown(boolean z) {
        this.isShowCountdown = z;
    }

    public void setShowErrorDialog(boolean z) {
        this.isShowErrorDialog = z;
    }

    public void setStatusBarColor(int i) {
        this.statusBarColor = i;
    }

    public void setTransparentStatusBar(boolean z) {
        this.isTransparentStatusBar = z;
    }

    public void setTransparentStatusBarMoveHeight(int i) {
        this.transparentStatusBarMoveHeight = i;
    }

    public void setUseDeepColorStatusBarIcon(boolean z) {
        this.useDeepColorStatusBarIcon = z;
    }

    public void setVideoSize(VideoSize videoSize) {
        this.videoSize = videoSize;
    }
}

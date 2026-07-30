package com.idv.identity.platform.config;

import java.io.Serializable;
import p153l.azb;
import p153l.y8c0;
import p153l.z4d0;

/* JADX INFO: loaded from: classes7.dex */
public class FaceConfig implements Serializable {
    private String alertSupportFailedConfirmColor;
    private String alertSupportFailedMsgColor;
    private String alertSupportFailedTitleColor;
    private String autoScanBase64;
    private String exitAlertCancelColor;
    private String exitAlertConfirmationColor;
    private String exitAlertMessageColor;
    private String exitAlertTitleColor;
    private String exitIconBase64;
    private String faceBGColor;
    private String faceProgressEndColor;
    private String faceProgressStartColor;
    private String faceTipColor;
    private String faceTitleColor;
    private String interruptedAlertConfirmColor;
    private String interruptedAlertMessageColor;
    private String interruptedAlertTitleColor;
    private String opFailedConfirmColor;
    private String opFailedTipColor;
    private String opFailedTitleColor;
    private String permissionFailedAlertConfirmColor;
    private String permissionFailedAlertMessageColor;
    private String permissionFailedAlertTitleColor;
    private String timeoutAlertConfirmationColor;
    private String timeoutAlertMessageColor;
    private String timeoutAlertTitleColor;
    private String tooManyRetriesAlertConfirmColor;
    private String tooManyRetriesAlertMessageColor;
    private String tooManyRetriesAlertTitleColor;
    private String verifyLoadingColor;
    private String verifyNetworkErrorAlertCancelColor;
    private String verifyNetworkErrorAlertConfirmColor;
    private String verifyNetworkErrorAlertMessageColor;
    private String verifyNetworkErrorAlertTitleColor;

    public String getAlertSupportFailedConfirmColor() {
        return this.alertSupportFailedConfirmColor;
    }

    public String getAlertSupportFailedMsgColor() {
        return this.alertSupportFailedMsgColor;
    }

    public String getAlertSupportFailedTitleColor() {
        return this.alertSupportFailedTitleColor;
    }

    public String getAutoScanBase64() {
        return this.autoScanBase64;
    }

    public azb.C15866a getDialogCamOpenFailedConfig() {
        azb.C15866a c15866a = new azb.C15866a();
        c15866a.f74130a = z4d0.m218576d(this.alertSupportFailedTitleColor, y8c0.f197989d);
        c15866a.f74131b = z4d0.m218576d(this.alertSupportFailedMsgColor, y8c0.f197988c);
        c15866a.f74132c = z4d0.m218576d(this.alertSupportFailedConfirmColor, y8c0.f197987b);
        return c15866a;
    }

    public azb.C15866a getDialogExitConfig() {
        azb.C15866a c15866a = new azb.C15866a();
        c15866a.f74130a = z4d0.m218576d(this.exitAlertTitleColor, y8c0.f197989d);
        c15866a.f74131b = z4d0.m218576d(this.exitAlertMessageColor, y8c0.f197988c);
        c15866a.f74133d = z4d0.m218576d(this.exitAlertCancelColor, y8c0.f197986a);
        c15866a.f74132c = z4d0.m218576d(this.exitAlertConfirmationColor, y8c0.f197987b);
        return c15866a;
    }

    public azb.C15866a getDialogSDKErrConfig() {
        azb.C15866a c15866a = new azb.C15866a();
        c15866a.f74130a = z4d0.m218576d(this.opFailedTitleColor, y8c0.f197989d);
        c15866a.f74131b = z4d0.m218576d(this.opFailedTipColor, y8c0.f197988c);
        c15866a.f74132c = z4d0.m218576d(this.opFailedConfirmColor, y8c0.f197987b);
        return c15866a;
    }

    public azb.C15866a getDialogTimeOutConfig() {
        azb.C15866a c15866a = new azb.C15866a();
        c15866a.f74130a = z4d0.m218576d(this.timeoutAlertTitleColor, y8c0.f197989d);
        c15866a.f74131b = z4d0.m218576d(this.timeoutAlertMessageColor, y8c0.f197988c);
        c15866a.f74132c = z4d0.m218576d(this.timeoutAlertConfirmationColor, y8c0.f197987b);
        return c15866a;
    }

    public azb.C15866a getDialogTooManyRetriesConfig() {
        azb.C15866a c15866a = new azb.C15866a();
        c15866a.f74130a = z4d0.m218576d(this.tooManyRetriesAlertTitleColor, y8c0.f197989d);
        c15866a.f74131b = z4d0.m218576d(this.tooManyRetriesAlertMessageColor, y8c0.f197988c);
        c15866a.f74132c = z4d0.m218576d(this.tooManyRetriesAlertConfirmColor, y8c0.f197987b);
        return c15866a;
    }

    public String getExitAlertCancelColor() {
        return this.exitAlertCancelColor;
    }

    public String getExitAlertConfirmationColor() {
        return this.exitAlertConfirmationColor;
    }

    public String getExitAlertMessageColor() {
        return this.exitAlertMessageColor;
    }

    public String getExitAlertTitleColor() {
        return this.exitAlertTitleColor;
    }

    public String getExitIconBase64() {
        return this.exitIconBase64;
    }

    public int getFaceBGColor(int i) {
        return z4d0.m218576d(this.faceBGColor, i);
    }

    public int getFaceProgressEndColor(int i) {
        return z4d0.m218576d(this.faceProgressEndColor, i);
    }

    public int getFaceProgressStartColor(int i) {
        return z4d0.m218576d(this.faceProgressStartColor, i);
    }

    public int getFaceTipColor(int i) {
        return z4d0.m218576d(this.faceTipColor, i);
    }

    public int getFaceTitleColor(int i) {
        return z4d0.m218576d(this.faceTitleColor, i);
    }

    public String getOpFailedConfirmColor() {
        return this.opFailedConfirmColor;
    }

    public String getOpFailedTipColor() {
        return this.opFailedTipColor;
    }

    public String getOpFailedTitleColor() {
        return this.opFailedTitleColor;
    }

    public String getTimeoutAlertConfirmationColor() {
        return this.timeoutAlertConfirmationColor;
    }

    public String getTimeoutAlertMessageColor() {
        return this.timeoutAlertMessageColor;
    }

    public String getTimeoutAlertTitleColor() {
        return this.timeoutAlertTitleColor;
    }

    public String getTooManyRetriesAlertConfirmColor() {
        return this.tooManyRetriesAlertConfirmColor;
    }

    public String getTooManyRetriesAlertMessageColor() {
        return this.tooManyRetriesAlertMessageColor;
    }

    public String getTooManyRetriesAlertTitleColor() {
        return this.tooManyRetriesAlertTitleColor;
    }

    public int getVerifyLoadingColor(int i) {
        return z4d0.m218576d(this.verifyLoadingColor, i);
    }

    public void setAlertSupportFailedConfirmColor(String str) {
        this.alertSupportFailedConfirmColor = str;
    }

    public void setAlertSupportFailedMsgColor(String str) {
        this.alertSupportFailedMsgColor = str;
    }

    public void setAlertSupportFailedTitleColor(String str) {
        this.alertSupportFailedTitleColor = str;
    }

    public void setAutoScanBase64(String str) {
        this.autoScanBase64 = str;
    }

    public void setExitAlertCancelColor(String str) {
        this.exitAlertCancelColor = str;
    }

    public void setExitAlertConfirmationColor(String str) {
        this.exitAlertConfirmationColor = str;
    }

    public void setExitAlertMessageColor(String str) {
        this.exitAlertMessageColor = str;
    }

    public void setExitAlertTitleColor(String str) {
        this.exitAlertTitleColor = str;
    }

    public void setExitIconBase64(String str) {
        this.exitIconBase64 = str;
    }

    public void setFaceBGColor(String str) {
        this.faceBGColor = str;
    }

    public void setFaceProgressEndColor(String str) {
        this.faceProgressEndColor = str;
    }

    public void setFaceProgressStartColor(String str) {
        this.faceProgressStartColor = str;
    }

    public void setFaceTipColor(String str) {
        this.faceTipColor = str;
    }

    public void setFaceTitleColor(String str) {
        this.faceTitleColor = str;
    }

    public void setInterruptedAlertConfirmColor(String str) {
        this.interruptedAlertConfirmColor = str;
    }

    public void setInterruptedAlertMessageColor(String str) {
        this.interruptedAlertMessageColor = str;
    }

    public void setInterruptedAlertTitleColor(String str) {
        this.interruptedAlertTitleColor = str;
    }

    public void setOpFailedConfirmColor(String str) {
        this.opFailedConfirmColor = str;
    }

    public void setOpFailedTipColor(String str) {
        this.opFailedTipColor = str;
    }

    public void setOpFailedTitleColor(String str) {
        this.opFailedTitleColor = str;
    }

    public void setPermissionFailedAlertConfirmColor(String str) {
        this.permissionFailedAlertConfirmColor = str;
    }

    public void setPermissionFailedAlertMessageColor(String str) {
        this.permissionFailedAlertMessageColor = str;
    }

    public void setPermissionFailedAlertTitleColor(String str) {
        this.permissionFailedAlertTitleColor = str;
    }

    public void setTimeoutAlertConfirmationColor(String str) {
        this.timeoutAlertConfirmationColor = str;
    }

    public void setTimeoutAlertMessageColor(String str) {
        this.timeoutAlertMessageColor = str;
    }

    public void setTimeoutAlertTitleColor(String str) {
        this.timeoutAlertTitleColor = str;
    }

    public void setTooManyRetriesAlertConfirmColor(String str) {
        this.tooManyRetriesAlertConfirmColor = str;
    }

    public void setTooManyRetriesAlertMessageColor(String str) {
        this.tooManyRetriesAlertMessageColor = str;
    }

    public void setTooManyRetriesAlertTitleColor(String str) {
        this.tooManyRetriesAlertTitleColor = str;
    }

    public void setVerifyLoadingColor(String str) {
        this.verifyLoadingColor = str;
    }

    public void setVerifyNetworkErrorAlertCancelColor(String str) {
        this.verifyNetworkErrorAlertCancelColor = str;
    }

    public void setVerifyNetworkErrorAlertConfirmColor(String str) {
        this.verifyNetworkErrorAlertConfirmColor = str;
    }

    public void setVerifyNetworkErrorAlertMessageColor(String str) {
        this.verifyNetworkErrorAlertMessageColor = str;
    }

    public void setVerifyNetworkErrorAlertTitleColor(String str) {
        this.verifyNetworkErrorAlertTitleColor = str;
    }

    public String toString() {
        return "FaceConfig{faceTitleColor='" + this.faceTitleColor + "', faceTipColor='" + this.faceTipColor + "', faceBGColor='" + this.faceBGColor + "', faceProgressStartColor='" + this.faceProgressStartColor + "', faceProgressEndColor='" + this.faceProgressEndColor + "', exitIconBase64='" + this.exitIconBase64 + "', interruptedAlertTitleColor='" + this.interruptedAlertTitleColor + "', interruptedAlertMessageColor='" + this.interruptedAlertMessageColor + "', interruptedAlertConfirmColor='" + this.interruptedAlertConfirmColor + "', tooManyRetriesAlertTitleColor='" + this.tooManyRetriesAlertTitleColor + "', tooManyRetriesAlertMessageColor='" + this.tooManyRetriesAlertMessageColor + "', tooManyRetriesAlertConfirmColor='" + this.tooManyRetriesAlertConfirmColor + "', exitAlertTitleColor='" + this.exitAlertTitleColor + "', exitAlertMessageColor='" + this.exitAlertMessageColor + "', exitAlertCancelColor='" + this.exitAlertCancelColor + "', exitAlertConfirmationColor='" + this.exitAlertConfirmationColor + "', opFailedTitleColor='" + this.opFailedTitleColor + "', opFailedTipColor='" + this.opFailedTipColor + "', opFailedConfirmColor='" + this.opFailedConfirmColor + "', timeoutAlertTitleColor='" + this.timeoutAlertTitleColor + "', timeoutAlertMessageColor='" + this.timeoutAlertMessageColor + "', timeoutAlertConfirmationColor='" + this.timeoutAlertConfirmationColor + "', alertSupportFailedTitleColor='" + this.alertSupportFailedTitleColor + "', alertSupportFailedMsgColor='" + this.alertSupportFailedMsgColor + "', alertSupportFailedConfirmColor='" + this.alertSupportFailedConfirmColor + "', permissionFailedAlertTitleColor='" + this.permissionFailedAlertTitleColor + "', permissionFailedAlertMessageColor='" + this.permissionFailedAlertMessageColor + "', permissionFailedAlertConfirmColor='" + this.permissionFailedAlertConfirmColor + "', verifyNetworkErrorAlertTitleColor='" + this.verifyNetworkErrorAlertTitleColor + "', verifyNetworkErrorAlertMessageColor='" + this.verifyNetworkErrorAlertMessageColor + "', verifyNetworkErrorAlertCancelColor='" + this.verifyNetworkErrorAlertCancelColor + "', verifyNetworkErrorAlertConfirmColor='" + this.verifyNetworkErrorAlertConfirmColor + "', verifyLoadingColor='" + this.verifyLoadingColor + "'}";
    }
}

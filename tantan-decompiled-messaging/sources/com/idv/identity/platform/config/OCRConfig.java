package com.idv.identity.platform.config;

import java.io.Serializable;
import p149l.mxb;
import p149l.s1c0;
import p149l.vwc0;

/* JADX INFO: loaded from: classes7.dex */
public class OCRConfig implements Serializable {
    private String albumBase64;
    private String autoScanBase64;
    private String docErrorAlertCancelColor;
    private String docErrorAlertConfirmColor;
    private String docErrorAlertMessageColor;
    private String docErrorAlertTitleColor;
    private String exitAlertCancelColor;
    private String exitAlertConfirmationColor;
    private String exitAlertTitleColor;
    private String exitIconBase64;
    private String failedAlertCancelColor;
    private String failedAlertConfirmationColor;
    private String failedAlertMessageColor;
    private String failedAlertTitleColor;
    private String floodLightBase64;
    private String nfcConfirmBtnBGColor;
    private String nfcConfirmBtnTextColor;
    private String nfcContentColor;
    private String nfcExitIconBase64;
    private String nfcInputBackAlertCancelColor;
    private String nfcInputBackAlertConfirmColor;
    private String nfcInputBackAlertMessageColor;
    private String nfcInputBackAlertTitleColor;
    private String nfcInputBirthdayEditColor;
    private String nfcInputBirthdayEditHintColor;
    private String nfcInputBirthdayLabelColor;
    private String nfcInputCheckAlertCancelColor;
    private String nfcInputCheckAlertConfirmColor;
    private String nfcInputCheckAlertMessageColor;
    private String nfcInputCheckAlertTitleColor;
    private String nfcInputExitIconBase64;
    private String nfcInputNextBtnBGSelectColor;
    private String nfcInputNextBtnBGUnSelectColor;
    private String nfcInputNextBtnTextSelectColor;
    private String nfcInputNextBtnTextUnSelectColor;
    private String nfcInputPassportEditColor;
    private String nfcInputPassportEditHintColor;
    private String nfcInputPassportLabelColor;
    private String nfcInputTitleColor;
    private String nfcInputValidityEditColor;
    private String nfcInputValidityEditHintColor;
    private String nfcInputValidityLabelColor;
    private String nfcReadBackAlertCancelColor;
    private String nfcReadBackAlertConfirmColor;
    private String nfcReadBackAlertMessageColor;
    private String nfcReadBackAlertTitleColor;
    private String nfcReadStatusExitBase64;
    private String nfcReadStatusTextColor;
    private String nfcSettingAlertCancelColor;
    private String nfcSettingAlertConfirmColor;
    private String nfcSettingAlertMessageColor;
    private String nfcSettingAlertTitleColor;
    private String nfcTitleColor;
    private String ocrAlbumLabelColor;
    private String ocrBorderColor;
    private String ocrGuideContentColor;
    private String ocrGuideExitIconBase64;
    private String ocrGuideIndicatorSelectedColor;
    private String ocrGuideIndicatorUnSelectedColor;
    private String ocrGuideStartBtnBGColor;
    private String ocrGuideStartBtnDisableBGColor;
    private String ocrGuideStartBtnDisableTextColor;
    private String ocrGuideStartBtnTextColor;
    private String ocrGuideTitleColor;
    private String ocrLoadingColor;
    private String ocrMessageFailAlertCancelColor;
    private String ocrMessageFailAlertConfirmColor;
    private String ocrMessageFailAlertTitleColor;
    private String ocrNetworkErrorAlertCancelColor;
    private String ocrNetworkErrorAlertConfirmColor;
    private String ocrNetworkErrorAlertMessageColor;
    private String ocrNetworkErrorAlertTitleColor;
    private String ocrResultConfirmBtnDisabledBGColor;
    private String ocrResultConfirmBtnDisabledTitleColor;
    private String ocrResultConfirmBtnEnabledBGColor;
    private String ocrResultConfirmBtnEnabledTitleColor;
    private String ocrResultErrorTipBGColor;
    private String ocrResultExitAlertCancelColor;
    private String ocrResultExitAlertConfirmationColor;
    private String ocrResultExitAlertTitleColor;
    private String ocrResultExitIconBase64;
    private String ocrResultInfoBorderColor;
    private String ocrResultInfoContentColor;
    private String ocrResultInfoEmptyAlertConfirmColor;
    private String ocrResultInfoEmptyAlertTitleColor;
    private String ocrResultInfoErrorAlertConfirmColor;
    private String ocrResultInfoErrorAlertMessageColor;
    private String ocrResultInfoTitleColor;
    private String ocrResultNetworkErrorAlertCancelColor;
    private String ocrResultNetworkErrorAlertConfirmColor;
    private String ocrResultNetworkErrorAlertMessageColor;
    private String ocrResultNetworkErrorAlertTitleColor;
    private String ocrResultTipBGColor;
    private String ocrResultTipColor;
    private String ocrResultTipIconBase64;
    private String ocrResultTipTitleColor;
    private String ocrResultTitleColor;
    private String ocrSubmitTitleColor;
    private String ocrTakePhotoLabelColor;
    private String ocrTitleColor;
    private String permissionFailedAlertConfirmColor;
    private String permissionFailedAlertMessageColor;
    private String permissionFailedAlertTitleColor;
    private String restrictionsAlertConfirmationColor;
    private String restrictionsAlertMessageColor;
    private String restrictionsAlertTitleColor;
    private String submitBase64;
    private String takePhotoBase64;
    private String takeShootBase64;
    private String timeoutAlertConfirmationColor;
    private String timeoutAlertMessageColor;
    private String timeoutAlertTitleColor;
    private String unFloodLightBase64;

    public String getAlbumBase64() {
        return this.albumBase64;
    }

    public String getAutoScanBase64() {
        return this.autoScanBase64;
    }

    public String getExitAlertCancelColor() {
        return this.exitAlertCancelColor;
    }

    public String getExitAlertConfirmationColor() {
        return this.exitAlertConfirmationColor;
    }

    public String getExitAlertTitleColor() {
        return this.exitAlertTitleColor;
    }

    public String getExitIconBase64() {
        return this.exitIconBase64;
    }

    public String getFailedAlertCancelColor() {
        return this.failedAlertCancelColor;
    }

    public String getFailedAlertConfirmationColor() {
        return this.failedAlertConfirmationColor;
    }

    public String getFailedAlertMessageColor() {
        return this.failedAlertMessageColor;
    }

    public String getFailedAlertTitleColor() {
        return this.failedAlertTitleColor;
    }

    public String getFloodLightBase64() {
        return this.floodLightBase64;
    }

    public int getNfcConfirmBtnBGColor(int i) {
        return vwc0.m200358d(this.nfcConfirmBtnBGColor, i);
    }

    public int getNfcConfirmBtnTextColor(int i) {
        return vwc0.m200358d(this.nfcConfirmBtnTextColor, i);
    }

    public int getNfcContentColor(int i) {
        return vwc0.m200358d(this.nfcContentColor, i);
    }

    public String getNfcExitIconBase64() {
        return this.nfcExitIconBase64;
    }

    public mxb.C18583a getNfcInputBackDialogConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.nfcInputBackAlertTitleColor, s1c0.f161878d);
        c18583a.f136158c = vwc0.m200358d(this.nfcInputBackAlertConfirmColor, s1c0.f161876b);
        c18583a.f136159d = vwc0.m200358d(this.nfcInputBackAlertCancelColor, s1c0.f161875a);
        return c18583a;
    }

    public int getNfcInputBirthdayEditColor(int i) {
        return vwc0.m200358d(this.nfcInputBirthdayEditColor, i);
    }

    public int getNfcInputBirthdayEditHintColor(int i) {
        return vwc0.m200358d(this.nfcInputBirthdayEditHintColor, i);
    }

    public int getNfcInputBirthdayLabelColor(int i) {
        return vwc0.m200358d(this.nfcInputBirthdayLabelColor, i);
    }

    public mxb.C18583a getNfcInputCheckDialogConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.nfcInputCheckAlertTitleColor, s1c0.f161878d);
        c18583a.f136157b = vwc0.m200358d(this.nfcInputCheckAlertMessageColor, s1c0.f161877c);
        c18583a.f136159d = vwc0.m200358d(this.nfcInputCheckAlertCancelColor, s1c0.f161875a);
        c18583a.f136158c = vwc0.m200358d(this.nfcInputCheckAlertConfirmColor, s1c0.f161876b);
        return c18583a;
    }

    public String getNfcInputExitIconBase64() {
        return this.nfcInputExitIconBase64;
    }

    public int getNfcInputNextBtnBGSelectColor(int i) {
        return vwc0.m200358d(this.nfcInputNextBtnBGSelectColor, i);
    }

    public int getNfcInputNextBtnBGUnSelectColor(int i) {
        return vwc0.m200358d(this.nfcInputNextBtnBGUnSelectColor, i);
    }

    public int getNfcInputNextBtnTextSelectColor(int i) {
        return vwc0.m200358d(this.nfcInputNextBtnTextSelectColor, i);
    }

    public int getNfcInputNextBtnTextUnSelectColor(int i) {
        return vwc0.m200358d(this.nfcInputNextBtnTextUnSelectColor, i);
    }

    public int getNfcInputPassportEditColor(int i) {
        return vwc0.m200358d(this.nfcInputPassportEditColor, i);
    }

    public int getNfcInputPassportEditHintColor(int i) {
        return vwc0.m200358d(this.nfcInputPassportEditHintColor, i);
    }

    public int getNfcInputPassportLabelColor(int i) {
        return vwc0.m200358d(this.nfcInputPassportLabelColor, i);
    }

    public int getNfcInputTitleColor(int i) {
        return vwc0.m200358d(this.nfcInputTitleColor, i);
    }

    public int getNfcInputValidityEditColor(int i) {
        return vwc0.m200358d(this.nfcInputValidityEditColor, i);
    }

    public int getNfcInputValidityEditHintColor(int i) {
        return vwc0.m200358d(this.nfcInputValidityEditHintColor, i);
    }

    public int getNfcInputValidityLabelColor(int i) {
        return vwc0.m200358d(this.nfcInputValidityLabelColor, i);
    }

    public mxb.C18583a getNfcReadBackDialogConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.nfcReadBackAlertTitleColor, s1c0.f161878d);
        c18583a.f136158c = vwc0.m200358d(this.nfcReadBackAlertConfirmColor, s1c0.f161876b);
        c18583a.f136159d = vwc0.m200358d(this.nfcReadBackAlertCancelColor, s1c0.f161875a);
        return c18583a;
    }

    public String getNfcReadStatusExitBase64() {
        return this.nfcReadStatusExitBase64;
    }

    public int getNfcReadStatusTextColor(int i) {
        return vwc0.m200358d(this.nfcReadStatusTextColor, i);
    }

    public mxb.C18583a getNfcSettingDialogConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.nfcSettingAlertTitleColor, s1c0.f161878d);
        c18583a.f136157b = vwc0.m200358d(this.nfcSettingAlertMessageColor, s1c0.f161877c);
        c18583a.f136159d = vwc0.m200358d(this.nfcSettingAlertCancelColor, s1c0.f161875a);
        c18583a.f136158c = vwc0.m200358d(this.nfcSettingAlertConfirmColor, s1c0.f161876b);
        return c18583a;
    }

    public int getNfcTitleColor(int i) {
        return vwc0.m200358d(this.nfcTitleColor, i);
    }

    public int getOcrAlbumLabelColor(int i) {
        return vwc0.m200358d(this.ocrAlbumLabelColor, i);
    }

    public int getOcrBorderColor(int i) {
        return vwc0.m200358d(this.ocrBorderColor, i);
    }

    public mxb.C18583a getOcrDialogExitConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.exitAlertTitleColor, s1c0.f161878d);
        c18583a.f136159d = vwc0.m200358d(this.exitAlertCancelColor, s1c0.f161875a);
        c18583a.f136158c = vwc0.m200358d(this.exitAlertConfirmationColor, s1c0.f161876b);
        return c18583a;
    }

    public mxb.C18583a getOcrDialogFailConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.failedAlertTitleColor, s1c0.f161878d);
        c18583a.f136157b = vwc0.m200358d(this.failedAlertMessageColor, s1c0.f161877c);
        c18583a.f136159d = vwc0.m200358d(this.failedAlertCancelColor, s1c0.f161875a);
        c18583a.f136158c = vwc0.m200358d(this.failedAlertConfirmationColor, s1c0.f161876b);
        return c18583a;
    }

    public mxb.C18583a getOcrDialogMessageErrorConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.ocrMessageFailAlertTitleColor, s1c0.f161878d);
        c18583a.f136159d = vwc0.m200358d(this.ocrMessageFailAlertCancelColor, s1c0.f161875a);
        c18583a.f136158c = vwc0.m200358d(this.ocrMessageFailAlertConfirmColor, s1c0.f161876b);
        return c18583a;
    }

    public mxb.C18583a getOcrDialogNTErrorConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.ocrNetworkErrorAlertTitleColor, s1c0.f161878d);
        c18583a.f136157b = vwc0.m200358d(this.ocrNetworkErrorAlertMessageColor, s1c0.f161877c);
        c18583a.f136159d = vwc0.m200358d(this.ocrNetworkErrorAlertCancelColor, s1c0.f161875a);
        c18583a.f136158c = vwc0.m200358d(this.ocrNetworkErrorAlertConfirmColor, s1c0.f161876b);
        return c18583a;
    }

    public mxb.C18583a getOcrDialogPermissionGrantedConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.permissionFailedAlertTitleColor, s1c0.f161878d);
        c18583a.f136158c = vwc0.m200358d(this.permissionFailedAlertConfirmColor, s1c0.f161876b);
        return c18583a;
    }

    public mxb.C18583a getOcrDialogRestrictionConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.restrictionsAlertTitleColor, s1c0.f161878d);
        c18583a.f136157b = vwc0.m200358d(this.restrictionsAlertMessageColor, s1c0.f161877c);
        c18583a.f136158c = vwc0.m200358d(this.restrictionsAlertConfirmationColor, s1c0.f161876b);
        return c18583a;
    }

    public mxb.C18583a getOcrDialogResultExitConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.ocrResultExitAlertTitleColor, s1c0.f161878d);
        c18583a.f136159d = vwc0.m200358d(this.ocrResultExitAlertCancelColor, s1c0.f161875a);
        c18583a.f136158c = vwc0.m200358d(this.ocrResultExitAlertConfirmationColor, s1c0.f161876b);
        return c18583a;
    }

    public mxb.C18583a getOcrDialogResultInfoEmptyConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.ocrResultInfoEmptyAlertTitleColor, s1c0.f161878d);
        c18583a.f136158c = vwc0.m200358d(this.ocrResultInfoEmptyAlertConfirmColor, s1c0.f161876b);
        return c18583a;
    }

    public mxb.C18583a getOcrDialogResultNetErrorConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.ocrResultNetworkErrorAlertTitleColor, s1c0.f161878d);
        c18583a.f136157b = vwc0.m200358d(this.ocrResultNetworkErrorAlertMessageColor, s1c0.f161877c);
        c18583a.f136159d = vwc0.m200358d(this.ocrResultNetworkErrorAlertCancelColor, s1c0.f161875a);
        c18583a.f136158c = vwc0.m200358d(this.ocrResultNetworkErrorAlertConfirmColor, s1c0.f161876b);
        return c18583a;
    }

    public mxb.C18583a getOcrDialogTimeOutConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.timeoutAlertTitleColor, s1c0.f161878d);
        c18583a.f136157b = vwc0.m200358d(this.timeoutAlertMessageColor, s1c0.f161877c);
        c18583a.f136158c = vwc0.m200358d(this.timeoutAlertConfirmationColor, s1c0.f161876b);
        return c18583a;
    }

    public mxb.C18583a getOcrDialogTypeErrorConfig() {
        mxb.C18583a c18583a = new mxb.C18583a();
        c18583a.f136156a = vwc0.m200358d(this.docErrorAlertTitleColor, s1c0.f161878d);
        c18583a.f136157b = vwc0.m200358d(this.docErrorAlertMessageColor, s1c0.f161877c);
        c18583a.f136159d = vwc0.m200358d(this.docErrorAlertCancelColor, s1c0.f161875a);
        c18583a.f136158c = vwc0.m200358d(this.docErrorAlertConfirmColor, s1c0.f161876b);
        return c18583a;
    }

    public int getOcrGuideContentColor(int i) {
        return vwc0.m200358d(this.ocrGuideContentColor, i);
    }

    public String getOcrGuideExitIconBase64() {
        return this.ocrGuideExitIconBase64;
    }

    public int getOcrGuideIndicatorSelectedColor(int i) {
        return vwc0.m200358d(this.ocrGuideIndicatorSelectedColor, i);
    }

    public int getOcrGuideIndicatorUnSelectedColor(int i) {
        return vwc0.m200358d(this.ocrGuideIndicatorUnSelectedColor, i);
    }

    public int getOcrGuideStartBtnBGColor(int i) {
        return vwc0.m200358d(this.ocrGuideStartBtnBGColor, i);
    }

    public int getOcrGuideStartBtnDisableBGColor(int i) {
        return vwc0.m200358d(this.ocrGuideStartBtnDisableBGColor, i);
    }

    public int getOcrGuideStartBtnDisableTextColor(int i) {
        return vwc0.m200358d(this.ocrGuideStartBtnDisableTextColor, i);
    }

    public int getOcrGuideStartBtnTextColor(int i) {
        return vwc0.m200358d(this.ocrGuideStartBtnTextColor, i);
    }

    public int getOcrGuideTitleColor(int i) {
        return vwc0.m200358d(this.ocrGuideTitleColor, i);
    }

    public int getOcrLoadingColor(int i) {
        return vwc0.m200358d(this.ocrLoadingColor, i);
    }

    public String getOcrNetworkErrorAlertCancelColor() {
        return this.ocrNetworkErrorAlertCancelColor;
    }

    public String getOcrNetworkErrorAlertConfirmColor() {
        return this.ocrNetworkErrorAlertConfirmColor;
    }

    public String getOcrNetworkErrorAlertMessageColor() {
        return this.ocrNetworkErrorAlertMessageColor;
    }

    public String getOcrNetworkErrorAlertTitleColor() {
        return this.ocrNetworkErrorAlertTitleColor;
    }

    public int getOcrResultConfirmBtnDisabledBGColor(int i) {
        return vwc0.m200358d(this.ocrResultConfirmBtnDisabledBGColor, i);
    }

    public int getOcrResultConfirmBtnDisabledTitleColor(int i) {
        return vwc0.m200358d(this.ocrResultConfirmBtnDisabledTitleColor, i);
    }

    public int getOcrResultConfirmBtnEnabledBGColor(int i) {
        return vwc0.m200358d(this.ocrResultConfirmBtnEnabledBGColor, i);
    }

    public int getOcrResultConfirmBtnEnabledTitleColor(int i) {
        return vwc0.m200358d(this.ocrResultConfirmBtnEnabledTitleColor, i);
    }

    public int getOcrResultErrorTipBGColor(int i) {
        return vwc0.m200358d(this.ocrResultErrorTipBGColor, i);
    }

    public String getOcrResultExitAlertConfirmationColor() {
        return this.ocrResultExitAlertConfirmationColor;
    }

    public String getOcrResultExitAlertTitleColor() {
        return this.ocrResultExitAlertTitleColor;
    }

    public String getOcrResultExitIconBase64() {
        return this.ocrResultExitIconBase64;
    }

    public int getOcrResultInfoBorderColor(int i) {
        return vwc0.m200358d(this.ocrResultInfoBorderColor, i);
    }

    public int getOcrResultInfoContentColor(int i) {
        return vwc0.m200358d(this.ocrResultInfoContentColor, i);
    }

    public int getOcrResultInfoTitleColor(int i) {
        return vwc0.m200358d(this.ocrResultInfoTitleColor, i);
    }

    public int getOcrResultTipBGColor(int i) {
        return vwc0.m200358d(this.ocrResultTipBGColor, i);
    }

    public int getOcrResultTipColor(int i) {
        return vwc0.m200358d(this.ocrResultTipColor, i);
    }

    public String getOcrResultTipIconBase64() {
        return this.ocrResultTipIconBase64;
    }

    public int getOcrResultTipTitleColor(int i) {
        return vwc0.m200358d(this.ocrResultTipTitleColor, i);
    }

    public int getOcrResultTitleColor(int i) {
        return vwc0.m200358d(this.ocrResultTitleColor, i);
    }

    public int getOcrSubmitTitleColor(int i) {
        return vwc0.m200358d(this.ocrSubmitTitleColor, i);
    }

    public int getOcrTakePhotoLabelColor(int i) {
        return vwc0.m200358d(this.ocrTakePhotoLabelColor, i);
    }

    public int getOcrTitleColor(int i) {
        return vwc0.m200358d(this.ocrTitleColor, i);
    }

    public String getRestrictionsAlertConfirmationColor() {
        return this.restrictionsAlertConfirmationColor;
    }

    public String getRestrictionsAlertMessageColor() {
        return this.restrictionsAlertMessageColor;
    }

    public String getRestrictionsAlertTitleColor() {
        return this.restrictionsAlertTitleColor;
    }

    public String getSubmitBase64() {
        return this.submitBase64;
    }

    public String getTakePhotoBase64() {
        return this.takePhotoBase64;
    }

    public String getTakeShootBase64() {
        return this.takeShootBase64;
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

    public String getUnFloodLightBase64() {
        return this.unFloodLightBase64;
    }

    public void setAlbumBase64(String str) {
        this.albumBase64 = str;
    }

    public void setAutoScanBase64(String str) {
        this.autoScanBase64 = str;
    }

    public void setDocErrorAlertCancelColor(String str) {
        this.docErrorAlertCancelColor = str;
    }

    public void setDocErrorAlertConfirmColor(String str) {
        this.docErrorAlertConfirmColor = str;
    }

    public void setDocErrorAlertMessageColor(String str) {
        this.docErrorAlertMessageColor = str;
    }

    public void setDocErrorAlertTitleColor(String str) {
        this.docErrorAlertTitleColor = str;
    }

    public void setExitAlertCancelColor(String str) {
        this.exitAlertCancelColor = str;
    }

    public void setExitAlertConfirmationColor(String str) {
        this.exitAlertConfirmationColor = str;
    }

    public void setExitAlertTitleColor(String str) {
        this.exitAlertTitleColor = str;
    }

    public void setExitIconBase64(String str) {
        this.exitIconBase64 = str;
    }

    public void setFailedAlertCancelColor(String str) {
        this.failedAlertCancelColor = str;
    }

    public void setFailedAlertConfirmationColor(String str) {
        this.failedAlertConfirmationColor = str;
    }

    public void setFailedAlertMessageColor(String str) {
        this.failedAlertMessageColor = str;
    }

    public void setFailedAlertTitleColor(String str) {
        this.failedAlertTitleColor = str;
    }

    public void setFloodLightBase64(String str) {
        this.floodLightBase64 = str;
    }

    public void setNfcConfirmBtnBGColor(String str) {
        this.nfcConfirmBtnBGColor = str;
    }

    public void setNfcConfirmBtnTextColor(String str) {
        this.nfcConfirmBtnTextColor = str;
    }

    public void setNfcContentColor(String str) {
        this.nfcContentColor = str;
    }

    public void setNfcExitIconBase64(String str) {
        this.nfcExitIconBase64 = str;
    }

    public void setNfcInputBackAlertCancelColor(String str) {
        this.nfcInputBackAlertCancelColor = str;
    }

    public void setNfcInputBackAlertConfirmColor(String str) {
        this.nfcInputBackAlertConfirmColor = str;
    }

    public void setNfcInputBackAlertMessageColor(String str) {
        this.nfcInputBackAlertMessageColor = str;
    }

    public void setNfcInputBackAlertTitleColor(String str) {
        this.nfcInputBackAlertTitleColor = str;
    }

    public void setNfcInputBirthdayEditColor(String str) {
        this.nfcInputBirthdayEditColor = str;
    }

    public void setNfcInputBirthdayEditHintColor(String str) {
        this.nfcInputBirthdayEditHintColor = str;
    }

    public void setNfcInputBirthdayLabelColor(String str) {
        this.nfcInputBirthdayLabelColor = str;
    }

    public void setNfcInputCheckAlertCancelColor(String str) {
        this.nfcInputCheckAlertCancelColor = str;
    }

    public void setNfcInputCheckAlertConfirmColor(String str) {
        this.nfcInputCheckAlertConfirmColor = str;
    }

    public void setNfcInputCheckAlertMessageColor(String str) {
        this.nfcInputCheckAlertMessageColor = str;
    }

    public void setNfcInputCheckAlertTitleColor(String str) {
        this.nfcInputCheckAlertTitleColor = str;
    }

    public void setNfcInputExitIconBase64(String str) {
        this.nfcInputExitIconBase64 = str;
    }

    public void setNfcInputNextBtnBGSelectColor(String str) {
        this.nfcInputNextBtnBGSelectColor = str;
    }

    public void setNfcInputNextBtnBGUnSelectColor(String str) {
        this.nfcInputNextBtnBGUnSelectColor = str;
    }

    public void setNfcInputNextBtnTextSelectColor(String str) {
        this.nfcInputNextBtnTextSelectColor = str;
    }

    public void setNfcInputNextBtnTextUnSelectColor(String str) {
        this.nfcInputNextBtnTextUnSelectColor = str;
    }

    public void setNfcInputPassportEditColor(String str) {
        this.nfcInputPassportEditColor = str;
    }

    public void setNfcInputPassportEditHintColor(String str) {
        this.nfcInputPassportEditHintColor = str;
    }

    public void setNfcInputPassportLabelColor(String str) {
        this.nfcInputPassportLabelColor = str;
    }

    public void setNfcInputTitleColor(String str) {
        this.nfcInputTitleColor = str;
    }

    public void setNfcInputValidityEditColor(String str) {
        this.nfcInputValidityEditColor = str;
    }

    public void setNfcInputValidityEditHintColor(String str) {
        this.nfcInputValidityEditHintColor = str;
    }

    public void setNfcInputValidityLabelColor(String str) {
        this.nfcInputValidityLabelColor = str;
    }

    public void setNfcReadBackAlertCancelColor(String str) {
        this.nfcReadBackAlertCancelColor = str;
    }

    public void setNfcReadBackAlertConfirmColor(String str) {
        this.nfcReadBackAlertConfirmColor = str;
    }

    public void setNfcReadBackAlertMessageColor(String str) {
        this.nfcReadBackAlertMessageColor = str;
    }

    public void setNfcReadBackAlertTitleColor(String str) {
        this.nfcReadBackAlertTitleColor = str;
    }

    public void setNfcReadStatusExitBase64(String str) {
        this.nfcReadStatusExitBase64 = str;
    }

    public void setNfcReadStatusTextColor(String str) {
        this.nfcReadStatusTextColor = str;
    }

    public void setNfcSettingAlertCancelColor(String str) {
        this.nfcSettingAlertCancelColor = str;
    }

    public void setNfcSettingAlertConfirmColor(String str) {
        this.nfcSettingAlertConfirmColor = str;
    }

    public void setNfcSettingAlertMessageColor(String str) {
        this.nfcSettingAlertMessageColor = str;
    }

    public void setNfcSettingAlertTitleColor(String str) {
        this.nfcSettingAlertTitleColor = str;
    }

    public void setNfcTitleColor(String str) {
        this.nfcTitleColor = str;
    }

    public void setOcrAlbumLabelColor(String str) {
        this.ocrAlbumLabelColor = str;
    }

    public void setOcrBorderColor(String str) {
        this.ocrBorderColor = str;
    }

    public void setOcrGuideContentColor(String str) {
        this.ocrGuideContentColor = str;
    }

    public void setOcrGuideExitIconBase64(String str) {
        this.ocrGuideExitIconBase64 = str;
    }

    public void setOcrGuideIndicatorSelectedColor(String str) {
        this.ocrGuideIndicatorSelectedColor = str;
    }

    public void setOcrGuideIndicatorUnSelectedColor(String str) {
        this.ocrGuideIndicatorUnSelectedColor = str;
    }

    public void setOcrGuideStartBtnBGColor(String str) {
        this.ocrGuideStartBtnBGColor = str;
    }

    public void setOcrGuideStartBtnDisableBGColor(String str) {
        this.ocrGuideStartBtnDisableBGColor = str;
    }

    public void setOcrGuideStartBtnDisableTextColor(String str) {
        this.ocrGuideStartBtnDisableTextColor = str;
    }

    public void setOcrGuideStartBtnTextColor(String str) {
        this.ocrGuideStartBtnTextColor = str;
    }

    public void setOcrGuideTitleColor(String str) {
        this.ocrGuideTitleColor = str;
    }

    public void setOcrLoadingColor(String str) {
        this.ocrLoadingColor = str;
    }

    public void setOcrMessageFailAlertCancelColor(String str) {
        this.ocrMessageFailAlertCancelColor = str;
    }

    public void setOcrMessageFailAlertConfirmColor(String str) {
        this.ocrMessageFailAlertConfirmColor = str;
    }

    public void setOcrMessageFailAlertTitleColor(String str) {
        this.ocrMessageFailAlertTitleColor = str;
    }

    public void setOcrNetworkErrorAlertCancelColor(String str) {
        this.ocrNetworkErrorAlertCancelColor = str;
    }

    public void setOcrNetworkErrorAlertConfirmColor(String str) {
        this.ocrNetworkErrorAlertConfirmColor = str;
    }

    public void setOcrNetworkErrorAlertMessageColor(String str) {
        this.ocrNetworkErrorAlertMessageColor = str;
    }

    public void setOcrNetworkErrorAlertTitleColor(String str) {
        this.ocrNetworkErrorAlertTitleColor = str;
    }

    public void setOcrResultConfirmBtnDisabledBGColor(String str) {
        this.ocrResultConfirmBtnDisabledBGColor = str;
    }

    public void setOcrResultConfirmBtnDisabledTitleColor(String str) {
        this.ocrResultConfirmBtnDisabledTitleColor = str;
    }

    public void setOcrResultConfirmBtnEnabledBGColor(String str) {
        this.ocrResultConfirmBtnEnabledBGColor = str;
    }

    public void setOcrResultConfirmBtnEnabledTitleColor(String str) {
        this.ocrResultConfirmBtnEnabledTitleColor = str;
    }

    public void setOcrResultErrorTipBGColor(String str) {
        this.ocrResultErrorTipBGColor = str;
    }

    public void setOcrResultExitAlertCancelColor(String str) {
        this.ocrResultExitAlertCancelColor = str;
    }

    public void setOcrResultExitAlertConfirmationColor(String str) {
        this.ocrResultExitAlertConfirmationColor = str;
    }

    public void setOcrResultExitAlertTitleColor(String str) {
        this.ocrResultExitAlertTitleColor = str;
    }

    public void setOcrResultExitIconBase64(String str) {
        this.ocrResultExitIconBase64 = str;
    }

    public void setOcrResultInfoBorderColor(String str) {
        this.ocrResultInfoBorderColor = str;
    }

    public void setOcrResultInfoContentColor(String str) {
        this.ocrResultInfoContentColor = str;
    }

    public void setOcrResultInfoEmptyAlertConfirmColor(String str) {
        this.ocrResultInfoEmptyAlertConfirmColor = str;
    }

    public void setOcrResultInfoEmptyAlertTitleColor(String str) {
        this.ocrResultInfoEmptyAlertTitleColor = str;
    }

    public void setOcrResultInfoErrorAlertConfirmColor(String str) {
        this.ocrResultInfoErrorAlertConfirmColor = str;
    }

    public void setOcrResultInfoErrorAlertMessageColor(String str) {
        this.ocrResultInfoErrorAlertMessageColor = str;
    }

    public void setOcrResultInfoTitleColor(String str) {
        this.ocrResultInfoTitleColor = str;
    }

    public void setOcrResultNetworkErrorAlertCancelColor(String str) {
        this.ocrResultNetworkErrorAlertCancelColor = str;
    }

    public void setOcrResultNetworkErrorAlertConfirmColor(String str) {
        this.ocrResultNetworkErrorAlertConfirmColor = str;
    }

    public void setOcrResultNetworkErrorAlertMessageColor(String str) {
        this.ocrResultNetworkErrorAlertMessageColor = str;
    }

    public void setOcrResultNetworkErrorAlertTitleColor(String str) {
        this.ocrResultNetworkErrorAlertTitleColor = str;
    }

    public void setOcrResultTipBGColor(String str) {
        this.ocrResultTipBGColor = str;
    }

    public void setOcrResultTipColor(String str) {
        this.ocrResultTipColor = str;
    }

    public void setOcrResultTipIconBase64(String str) {
        this.ocrResultTipIconBase64 = str;
    }

    public void setOcrResultTipTitleColor(String str) {
        this.ocrResultTipTitleColor = str;
    }

    public void setOcrResultTitleColor(String str) {
        this.ocrResultTitleColor = str;
    }

    public void setOcrSubmitTitleColor(String str) {
        this.ocrSubmitTitleColor = str;
    }

    public void setOcrTakePhotoLabelColor(String str) {
        this.ocrTakePhotoLabelColor = str;
    }

    public void setOcrTitleColor(String str) {
        this.ocrTitleColor = str;
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

    public void setRestrictionsAlertConfirmationColor(String str) {
        this.restrictionsAlertConfirmationColor = str;
    }

    public void setRestrictionsAlertMessageColor(String str) {
        this.restrictionsAlertMessageColor = str;
    }

    public void setRestrictionsAlertTitleColor(String str) {
        this.restrictionsAlertTitleColor = str;
    }

    public void setSubmitBase64(String str) {
        this.submitBase64 = str;
    }

    public void setTakePhotoBase64(String str) {
        this.takePhotoBase64 = str;
    }

    public void setTakeShootBase64(String str) {
        this.takeShootBase64 = str;
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

    public void setUnFloodLightBase64(String str) {
        this.unFloodLightBase64 = str;
    }

    public String toString() {
        return "OCRConfig{failedAlertTitleColor='" + this.failedAlertTitleColor + "', failedAlertMessageColor='" + this.failedAlertMessageColor + "', failedAlertConfirmationColor='" + this.failedAlertConfirmationColor + "', failedAlertCancelColor='" + this.failedAlertCancelColor + "', timeoutAlertTitleColor='" + this.timeoutAlertTitleColor + "', timeoutAlertMessageColor='" + this.timeoutAlertMessageColor + "', timeoutAlertConfirmationColor='" + this.timeoutAlertConfirmationColor + "', exitAlertTitleColor='" + this.exitAlertTitleColor + "', exitAlertCancelColor='" + this.exitAlertCancelColor + "', exitAlertConfirmationColor='" + this.exitAlertConfirmationColor + "', ocrResultExitAlertTitleColor='" + this.ocrResultExitAlertTitleColor + "', ocrResultExitAlertCancelColor='" + this.ocrResultExitAlertCancelColor + "', ocrResultExitAlertConfirmationColor='" + this.ocrResultExitAlertConfirmationColor + "', ocrNetworkErrorAlertTitleColor='" + this.ocrNetworkErrorAlertTitleColor + "', ocrNetworkErrorAlertMessageColor='" + this.ocrNetworkErrorAlertMessageColor + "', ocrNetworkErrorAlertCancelColor='" + this.ocrNetworkErrorAlertCancelColor + "', ocrNetworkErrorAlertConfirmColor='" + this.ocrNetworkErrorAlertConfirmColor + "', restrictionsAlertTitleColor='" + this.restrictionsAlertTitleColor + "', restrictionsAlertMessageColor='" + this.restrictionsAlertMessageColor + "', restrictionsAlertConfirmationColor='" + this.restrictionsAlertConfirmationColor + "', ocrMessageFailAlertTitleColor='" + this.ocrMessageFailAlertTitleColor + "', ocrMessageFailAlertCancelColor='" + this.ocrMessageFailAlertCancelColor + "', ocrMessageFailAlertConfirmColor='" + this.ocrMessageFailAlertConfirmColor + "', permissionFailedAlertTitleColor='" + this.permissionFailedAlertTitleColor + "', permissionFailedAlertMessageColor='" + this.permissionFailedAlertMessageColor + "', permissionFailedAlertConfirmColor='" + this.permissionFailedAlertConfirmColor + "', docErrorAlertTitleColor='" + this.docErrorAlertTitleColor + "', docErrorAlertMessageColor='" + this.docErrorAlertMessageColor + "', docErrorAlertCancelColor='" + this.docErrorAlertCancelColor + "', docErrorAlertConfirmColor='" + this.docErrorAlertConfirmColor + "', ocrResultNetworkErrorAlertTitleColor='" + this.ocrResultNetworkErrorAlertTitleColor + "', ocrResultNetworkErrorAlertMessageColor='" + this.ocrResultNetworkErrorAlertMessageColor + "', ocrResultNetworkErrorAlertConfirmColor='" + this.ocrResultNetworkErrorAlertConfirmColor + "', ocrResultNetworkErrorAlertCancelColor='" + this.ocrResultNetworkErrorAlertCancelColor + "', ocrResultInfoEmptyAlertTitleColor='" + this.ocrResultInfoEmptyAlertTitleColor + "', ocrResultInfoEmptyAlertConfirmColor='" + this.ocrResultInfoEmptyAlertConfirmColor + "', ocrResultInfoErrorAlertConfirmColor='" + this.ocrResultInfoErrorAlertConfirmColor + "', ocrResultInfoErrorAlertMessageColor='" + this.ocrResultInfoErrorAlertMessageColor + "', exitIconBase64='" + this.exitIconBase64 + "', ocrBorderColor='" + this.ocrBorderColor + "', albumBase64='" + this.albumBase64 + "', takePhotoBase64='" + this.takePhotoBase64 + "', ocrTitleColor='" + this.ocrTitleColor + "', submitBase64='" + this.submitBase64 + "', ocrLoadingColor='" + this.ocrLoadingColor + "', ocrSubmitTitleColor='" + this.ocrSubmitTitleColor + "', ocrResultTitleColor='" + this.ocrResultTitleColor + "', ocrResultExitIconBase64='" + this.ocrResultExitIconBase64 + "', ocrResultTipBGColor='" + this.ocrResultTipBGColor + "', ocrResultTipColor='" + this.ocrResultTipColor + "', ocrResultConfirmBtnEnabledBGColor='" + this.ocrResultConfirmBtnEnabledBGColor + "', ocrResultTipTitleColor='" + this.ocrResultTipTitleColor + "', ocrResultConfirmBtnDisabledTitleColor='" + this.ocrResultConfirmBtnDisabledTitleColor + "', ocrResultErrorTipBGColor='" + this.ocrResultErrorTipBGColor + "', ocrResultInfoTitleColor='" + this.ocrResultInfoTitleColor + "', ocrResultTipIconBase64='" + this.ocrResultTipIconBase64 + "', ocrResultConfirmBtnDisabledBGColor='" + this.ocrResultConfirmBtnDisabledBGColor + "', ocrResultConfirmBtnEnabledTitleColor='" + this.ocrResultConfirmBtnEnabledTitleColor + "', ocrResultInfoContentColor='" + this.ocrResultInfoContentColor + "', ocrResultInfoBorderColor='" + this.ocrResultInfoBorderColor + "', ocrGuideExitIconBase64='" + this.ocrGuideExitIconBase64 + "', ocrGuideStartBtnBGColor='" + this.ocrGuideStartBtnBGColor + "', ocrGuideStartBtnTextColor='" + this.ocrGuideStartBtnTextColor + "', ocrGuideIndicatorSelectedColor='" + this.ocrGuideIndicatorSelectedColor + "', ocrGuideIndicatorUnSelectedColor='" + this.ocrGuideIndicatorUnSelectedColor + "', ocrGuideTitleColor='" + this.ocrGuideTitleColor + "', ocrGuideContentColor='" + this.ocrGuideContentColor + "', nfcConfirmBtnBGColor='" + this.nfcConfirmBtnBGColor + "', nfcConfirmBtnTextColor='" + this.nfcConfirmBtnTextColor + "', nfcTitleColor='" + this.nfcTitleColor + "', nfcContentColor='" + this.nfcContentColor + "', nfcExitIconBase64='" + this.nfcExitIconBase64 + "', nfcReadStatusTextColor='" + this.nfcReadStatusTextColor + "', nfcInputPassportLabelColor='" + this.nfcInputPassportLabelColor + "', nfcInputBirthdayLabelColor='" + this.nfcInputBirthdayLabelColor + "', nfcInputValidityLabelColor='" + this.nfcInputValidityLabelColor + "', nfcInputPassportEditColor='" + this.nfcInputPassportEditColor + "', nfcInputBirthdayEditColor='" + this.nfcInputBirthdayEditColor + "', nfcInputValidityEditColor='" + this.nfcInputValidityEditColor + "', nfcInputPassportEditHintColor='" + this.nfcInputPassportEditHintColor + "', nfcInputBirthdayEditHintColor='" + this.nfcInputBirthdayEditHintColor + "', nfcInputValidityEditHintColor='" + this.nfcInputValidityEditHintColor + "', nfcSettingAlertTitleColor='" + this.nfcSettingAlertTitleColor + "', nfcSettingAlertMessageColor='" + this.nfcSettingAlertMessageColor + "', nfcSettingAlertConfirmColor='" + this.nfcSettingAlertConfirmColor + "', nfcSettingAlertCancelColor='" + this.nfcSettingAlertCancelColor + "', nfcInputCheckAlertTitleColor='" + this.nfcInputCheckAlertTitleColor + "', nfcInputCheckAlertMessageColor='" + this.nfcInputCheckAlertMessageColor + "', nfcInputCheckAlertConfirmColor='" + this.nfcInputCheckAlertConfirmColor + "', nfcInputCheckAlertCancelColor='" + this.nfcInputCheckAlertCancelColor + "', nfcInputTitleColor='" + this.nfcInputTitleColor + "', nfcInputBackAlertTitleColor='" + this.nfcInputBackAlertTitleColor + "', nfcInputBackAlertMessageColor='" + this.nfcInputBackAlertMessageColor + "', nfcInputBackAlertConfirmColor='" + this.nfcInputBackAlertConfirmColor + "', nfcInputBackAlertCancelColor='" + this.nfcInputBackAlertCancelColor + "', nfcReadBackAlertTitleColor='" + this.nfcReadBackAlertTitleColor + "', nfcReadBackAlertMessageColor='" + this.nfcReadBackAlertMessageColor + "', nfcReadBackAlertConfirmColor='" + this.nfcReadBackAlertConfirmColor + "', nfcReadBackAlertCancelColor='" + this.nfcReadBackAlertCancelColor + "'}";
    }
}

package com.surveysparrow.ss_android_sdk;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public final class SsSurvey implements Serializable {
    private String baseUrl;
    public transient C13503a[] customParamsValue;
    private HashMap properties;
    private String surveyDomain;
    private String surveyToken;
    private String customVariableString = "?";
    private int surveyType = 1;
    private boolean isThankYouRedirect = true;

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurvey$a */
    public static class C13503a {
    }

    public SsSurvey(CharSequence charSequence, CharSequence charSequence2, C13503a[] c13503aArr, HashMap map) {
        this.baseUrl = generateBaseUrl(charSequence, charSequence2);
        this.surveyToken = charSequence2.toString();
        this.surveyDomain = charSequence.toString();
        this.customParamsValue = c13503aArr;
        this.properties = map;
        addCustomParams(c13503aArr);
        addCustomParam("sparrowLang", map.get("langCode").toString());
    }

    private String generateBaseUrl(CharSequence charSequence, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append((Object) charSequence);
        sb.append("/");
        sb.append(this.surveyType == 3 ? 'n' : 's');
        sb.append("/android/");
        sb.append((Object) charSequence2);
        return sb.toString();
    }

    public SsSurvey addCustomParam(CharSequence charSequence, CharSequence charSequence2) {
        try {
            this.customVariableString += ((Object) charSequence) + "=" + URLEncoder.encode(charSequence2.toString(), "UTF-8") + "&";
            return this;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return this;
        }
    }

    public SsSurvey addCustomParams(C13503a[] c13503aArr) {
        for (C13503a c13503a : c13503aArr) {
            addCustomParam(null);
        }
        return this;
    }

    public C13503a[] getCustomParams() {
        return this.customParamsValue;
    }

    public String getDomain() {
        return this.surveyDomain;
    }

    public HashMap getProperties() {
        return this.properties;
    }

    public String getSsUrl() {
        return this.baseUrl + this.customVariableString;
    }

    public String getSurveyToken() {
        return this.surveyToken;
    }

    public boolean getThankYouRedirect() {
        return this.isThankYouRedirect;
    }

    public SsSurvey setSurveyType(@SurveyType int i) {
        this.surveyType = i;
        return this;
    }

    public SsSurvey setThankYouRedirect(boolean z) {
        this.isThankYouRedirect = z;
        return this;
    }

    public SsSurvey addCustomParam(C13503a c13503a) {
        throw null;
    }

    public SsSurvey(CharSequence charSequence, CharSequence charSequence2, C13503a[] c13503aArr) {
        this.baseUrl = generateBaseUrl(charSequence, charSequence2);
        this.surveyToken = charSequence2.toString();
        this.surveyDomain = charSequence.toString();
        this.customParamsValue = c13503aArr;
        addCustomParams(c13503aArr);
    }

    public SsSurvey(CharSequence charSequence, CharSequence charSequence2) {
        this.baseUrl = generateBaseUrl(charSequence, charSequence2);
        this.surveyToken = charSequence2.toString();
        this.surveyDomain = charSequence.toString();
    }
}

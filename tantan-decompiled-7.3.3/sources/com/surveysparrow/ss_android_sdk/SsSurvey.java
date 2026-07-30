package com.surveysparrow.ss_android_sdk;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class SsSurvey implements Serializable {
    private String baseUrl;
    public transient C13666a[] customParamsValue;
    private HashMap properties;
    private String surveyDomain;
    private String surveyToken;
    private String customVariableString = "?";
    private int surveyType = 1;
    private boolean isThankYouRedirect = true;

    /* JADX INFO: renamed from: com.surveysparrow.ss_android_sdk.SsSurvey$a */
    public static class C13666a {
    }

    public SsSurvey(CharSequence charSequence, CharSequence charSequence2, C13666a[] c13666aArr, HashMap map) {
        this.baseUrl = generateBaseUrl(charSequence, charSequence2);
        this.surveyToken = charSequence2.toString();
        this.surveyDomain = charSequence.toString();
        this.customParamsValue = c13666aArr;
        this.properties = map;
        addCustomParams(c13666aArr);
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

    public SsSurvey addCustomParams(C13666a[] c13666aArr) {
        for (C13666a c13666a : c13666aArr) {
            addCustomParam(null);
        }
        return this;
    }

    public C13666a[] getCustomParams() {
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

    public SsSurvey addCustomParam(C13666a c13666a) {
        throw null;
    }

    public SsSurvey(CharSequence charSequence, CharSequence charSequence2, C13666a[] c13666aArr) {
        this.baseUrl = generateBaseUrl(charSequence, charSequence2);
        this.surveyToken = charSequence2.toString();
        this.surveyDomain = charSequence.toString();
        this.customParamsValue = c13666aArr;
        addCustomParams(c13666aArr);
    }

    public SsSurvey(CharSequence charSequence, CharSequence charSequence2) {
        this.baseUrl = generateBaseUrl(charSequence, charSequence2);
        this.surveyToken = charSequence2.toString();
        this.surveyDomain = charSequence.toString();
    }
}

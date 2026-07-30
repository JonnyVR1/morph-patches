package p149l;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class m6t0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f131763a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f131764b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f131765c;

    /* JADX INFO: renamed from: d */
    public List f131766d;

    /* JADX INFO: renamed from: e */
    public List f131767e;

    /* JADX INFO: renamed from: f */
    public int f131768f = 1;

    /* JADX INFO: renamed from: g */
    public int f131769g;

    public m6t0() {
        List list = Collections.EMPTY_LIST;
        this.f131766d = list;
        this.f131767e = list;
        this.f131769g = 1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static m6t0 m153295a(JsonReader jsonReader) throws IOException {
        int i;
        m6t0 m6t0Var = new m6t0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int i2 = 3;
            switch (strNextName.hashCode()) {
                case -2001388947:
                    if (strNextName.equals("consent_signal")) {
                        String strNextString = jsonReader.nextString();
                        switch (strNextString.hashCode()) {
                            case -2058725357:
                                if (!strNextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                    rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 5;
                                m6t0Var.f131768f = i2;
                                break;
                                break;
                            case -1969035850:
                                if (!strNextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 7;
                                m6t0Var.f131768f = i2;
                                break;
                                break;
                            case -1263695752:
                                if (!strNextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 1;
                                m6t0Var.f131768f = i2;
                                break;
                                break;
                            case -954325659:
                                if (!strNextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                m6t0Var.f131768f = i2;
                                break;
                            case -918677260:
                                if (!strNextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 8;
                                m6t0Var.f131768f = i2;
                                break;
                                break;
                            case 429411856:
                                if (!strNextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 4;
                                m6t0Var.f131768f = i2;
                                break;
                                break;
                            case 467888915:
                                if (!strNextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 2;
                                m6t0Var.f131768f = i2;
                                break;
                                break;
                            case 1725474845:
                                if (!strNextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 6;
                                m6t0Var.f131768f = i2;
                                break;
                                break;
                            default:
                                rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                return null;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1938755376:
                    if (strNextName.equals("error_message")) {
                        m6t0Var.f131765c = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1851537225:
                    if (strNextName.equals("consent_form_base_url")) {
                        m6t0Var.f131764b = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1324537865:
                    if (strNextName.equals("privacy_options_required")) {
                        String strNextString2 = jsonReader.nextString();
                        int iHashCode = strNextString2.hashCode();
                        if (iHashCode == -1888946261) {
                            if (!strNextString2.equals("NOT_REQUIRED")) {
                                rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                                return null;
                            }
                            m6t0Var.f131769g = i2;
                        } else if (iHashCode != 389487519) {
                            if (iHashCode != 433141802 || !strNextString2.equals("UNKNOWN")) {
                                rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                                return null;
                            }
                            i2 = 1;
                            m6t0Var.f131769g = i2;
                        } else {
                            if (!strNextString2.equals("REQUIRED")) {
                                rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                                return null;
                            }
                            i2 = 2;
                            m6t0Var.f131769g = i2;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1161803523:
                    if (strNextName.equals(Constants.KEY_ACTIONS)) {
                        m6t0Var.f131767e = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            d5t0 d5t0Var = new d5t0();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String strNextName2 = jsonReader.nextName();
                                int iHashCode2 = strNextName2.hashCode();
                                if (iHashCode2 != -2105551094) {
                                    if (iHashCode2 == 1583758243 && strNextName2.equals("action_type")) {
                                        String strNextString3 = jsonReader.nextString();
                                        int iHashCode3 = strNextString3.hashCode();
                                        if (iHashCode3 != 64208429) {
                                            if (iHashCode3 != 82862015) {
                                                if (iHashCode3 != 1856333582 || !strNextString3.equals("UNKNOWN_ACTION_TYPE")) {
                                                    rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                    return null;
                                                }
                                                i = 1;
                                                d5t0Var.f84557b = i;
                                            } else {
                                                if (!strNextString3.equals("WRITE")) {
                                                    rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                    return null;
                                                }
                                                i = 2;
                                                d5t0Var.f84557b = i;
                                            }
                                        } else {
                                            if (!strNextString3.equals("CLEAR")) {
                                                rhg0.m179353a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                return null;
                                            }
                                            i = 3;
                                            d5t0Var.f84557b = i;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName2.equals("args_json")) {
                                    d5t0Var.f84556a = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            m6t0Var.f131767e.add(d5t0Var);
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -986806987:
                    if (strNextName.equals("request_info_keys")) {
                        m6t0Var.f131766d = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            m6t0Var.f131766d.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -790907624:
                    if (strNextName.equals("consent_form_payload")) {
                        m6t0Var.f131763a = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m6t0Var;
    }
}

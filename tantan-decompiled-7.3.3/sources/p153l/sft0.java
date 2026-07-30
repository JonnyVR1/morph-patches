package p153l;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class sft0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f167767a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f167768b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f167769c;

    /* JADX INFO: renamed from: d */
    public List f167770d;

    /* JADX INFO: renamed from: e */
    public List f167771e;

    /* JADX INFO: renamed from: f */
    public int f167772f = 1;

    /* JADX INFO: renamed from: g */
    public int f167773g;

    public sft0() {
        List list = Collections.EMPTY_LIST;
        this.f167770d = list;
        this.f167771e = list;
        this.f167773g = 1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static sft0 m185671a(JsonReader jsonReader) throws IOException {
        int i;
        sft0 sft0Var = new sft0();
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
                                    zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 5;
                                sft0Var.f167772f = i2;
                                break;
                                break;
                            case -1969035850:
                                if (!strNextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 7;
                                sft0Var.f167772f = i2;
                                break;
                                break;
                            case -1263695752:
                                if (!strNextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 1;
                                sft0Var.f167772f = i2;
                                break;
                                break;
                            case -954325659:
                                if (!strNextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                sft0Var.f167772f = i2;
                                break;
                            case -918677260:
                                if (!strNextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 8;
                                sft0Var.f167772f = i2;
                                break;
                                break;
                            case 429411856:
                                if (!strNextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 4;
                                sft0Var.f167772f = i2;
                                break;
                                break;
                            case 467888915:
                                if (!strNextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 2;
                                sft0Var.f167772f = i2;
                                break;
                                break;
                            case 1725474845:
                                if (!strNextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                    return null;
                                }
                                i2 = 6;
                                sft0Var.f167772f = i2;
                                break;
                                break;
                            default:
                                zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                return null;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1938755376:
                    if (strNextName.equals("error_message")) {
                        sft0Var.f167769c = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1851537225:
                    if (strNextName.equals("consent_form_base_url")) {
                        sft0Var.f167768b = jsonReader.nextString();
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
                                zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                                return null;
                            }
                            sft0Var.f167773g = i2;
                        } else if (iHashCode != 389487519) {
                            if (iHashCode != 433141802 || !strNextString2.equals("UNKNOWN")) {
                                zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                                return null;
                            }
                            i2 = 1;
                            sft0Var.f167773g = i2;
                        } else {
                            if (!strNextString2.equals("REQUIRED")) {
                                zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                                return null;
                            }
                            i2 = 2;
                            sft0Var.f167773g = i2;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1161803523:
                    if (strNextName.equals(Constants.KEY_ACTIONS)) {
                        sft0Var.f167771e = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jet0 jet0Var = new jet0();
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
                                                    zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                    return null;
                                                }
                                                i = 1;
                                                jet0Var.f120524b = i;
                                            } else {
                                                if (!strNextString3.equals("WRITE")) {
                                                    zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                    return null;
                                                }
                                                i = 2;
                                                jet0Var.f120524b = i;
                                            }
                                        } else {
                                            if (!strNextString3.equals("CLEAR")) {
                                                zpg0.m220844a("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                return null;
                                            }
                                            i = 3;
                                            jet0Var.f120524b = i;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName2.equals("args_json")) {
                                    jet0Var.f120523a = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            sft0Var.f167771e.add(jet0Var);
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -986806987:
                    if (strNextName.equals("request_info_keys")) {
                        sft0Var.f167770d = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            sft0Var.f167770d.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -790907624:
                    if (strNextName.equals("consent_form_payload")) {
                        sft0Var.f167767a = jsonReader.nextString();
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
        return sft0Var;
    }
}

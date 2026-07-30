package p149l;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.immomo.framework.storage.p039kv.C3750KV;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Ll/hei;", "", "<init>", "()V", "", "bid", "kotlin.jvm.PlatformType", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ljava/lang/String;", "e", "abGroupsResult", "c", "Ll/esj0;", LovePlanetStage.result, "", "a", "(Ljava/lang/String;Ll/esj0;)V", "url", "abGroup", "f", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", "b", "(Ljava/lang/String;)Lorg/json/JSONObject;", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class hei {
    public static final hei INSTANCE = new hei();

    private hei() {
    }

    /* JADX INFO: renamed from: c */
    private final String m130630c(String abGroupsResult) {
        return "v-/" + abGroupsResult;
    }

    /* JADX INFO: renamed from: d */
    private final String m130631d(String bid) {
        return C3750KV.m18339f(m130632e(bid), "");
    }

    /* JADX INFO: renamed from: e */
    private final String m130632e(String bid) {
        if (bid != null) {
            return "FepABConfig_".concat(bid);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m130633a(@Nullable String bid, @Nullable esj0 result) {
        Map<String, Object> mapM117909b;
        if (bid == null || StringsKt.m93438e0(bid) || result == null || (mapM117909b = result.m117909b()) == null) {
            return;
        }
        Object obj = mapM117909b.get("abTest");
        if (obj != null) {
            C3750KV.m18343j(INSTANCE.m130632e(bid), obj.toString());
            return;
        }
        String strM130632e = INSTANCE.m130632e(bid);
        if (C3750KV.m18334a(strM130632e)) {
            C3750KV.m18342i(strM130632e);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final JSONObject m130634b(@Nullable String bid) {
        String strM130631d;
        if (bid == null || (strM130631d = INSTANCE.m130631d(bid)) == null || StringsKt.m93438e0(strM130631d)) {
            return null;
        }
        try {
            return new JSONObject(strM130631d).optJSONObject("groups");
        } catch (Throwable th) {
            MDLog.printErrStackTrace("FepABConfigLoader", th);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final String m130635f(@Nullable String url, @Nullable String abGroup) {
        if (url != null && abGroup != null) {
            try {
                if (!StringsKt.m93438e0(abGroup)) {
                    int i = 0;
                    if (C15386d.m93483J(url, "http://", false, 2, null) || C15386d.m93483J(url, "https://", false, 2, null)) {
                        String strM218869b = zhw.m218869b(url);
                        if (strM218869b != null && !StringsKt.m93438e0(strM218869b)) {
                            hei heiVar = INSTANCE;
                            String strM18339f = C3750KV.m18339f(heiVar.m130632e(strM218869b), "");
                            strM18339f.getClass();
                            if (!StringsKt.m93438e0(strM18339f)) {
                                JSONObject jSONObject = new JSONObject(strM18339f);
                                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("groups");
                                String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(abGroup) : null;
                                String strOptString2 = jSONObject.optString("project");
                                if (strOptString != null && !StringsKt.m93438e0(strOptString)) {
                                    strOptString2.getClass();
                                    if (!StringsKt.m93438e0(strOptString2) && StringsKt.m93412P(url, strOptString2, false, 2, null) && !StringsKt.m93412P(url, heiVar.m130630c(strOptString), false, 2, null)) {
                                        Uri uri = Uri.parse(url);
                                        Uri.Builder builderBuildUpon = uri.buildUpon();
                                        builderBuildUpon.path("");
                                        List<String> pathSegments = uri.getPathSegments();
                                        boolean zP = StringsKt.m93412P(url, "/v-/", false, 2, null);
                                        List<String> list = pathSegments;
                                        if (list != null && !list.isEmpty()) {
                                            pathSegments.getClass();
                                            int i2 = -1;
                                            for (Object obj : pathSegments) {
                                                int i3 = i + 1;
                                                if (i < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                String str = (String) obj;
                                                if (!zP) {
                                                    builderBuildUpon.appendPath(str);
                                                    if (Intrinsics.m87488d(str, strOptString2)) {
                                                        builderBuildUpon.appendPath("v-").appendPath(strOptString);
                                                    }
                                                } else if (Intrinsics.m87488d(str, "v-")) {
                                                    builderBuildUpon.appendPath(str);
                                                    i2 = i3;
                                                } else if (i2 == i) {
                                                    builderBuildUpon.appendPath(strOptString);
                                                } else {
                                                    builderBuildUpon.appendPath(str);
                                                }
                                                i = i3;
                                            }
                                            return builderBuildUpon.toString();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return url;
                }
            } catch (Throwable th) {
                MDLog.printErrStackTrace("FepABConfigLoader", th);
            }
        }
        return url;
    }
}

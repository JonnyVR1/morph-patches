package com.facebook.appevents.codeless.internal;

import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.TrackReferenceTypeBox;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vivo.push.PushClientConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0007\u001dB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0019\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\f\u0010\tR\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u001b\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u001e"}, m87232d2 = {"Lcom/facebook/appevents/codeless/internal/PathComponent;", "", "Lorg/json/JSONObject;", "component", "<init>", "(Lorg/json/JSONObject;)V", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", PushClientConstants.TAG_CLASS_NAME, "", "b", "I", "e", "()I", FirebaseAnalytics.Param.INDEX, "c", Constants.INAPP_DATA_TAG, "id", "h", "text", "g", "tag", "f", "description", TrackReferenceTypeBox.TYPE1, "matchBitmask", "Companion", "MatchBitmaskType", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class PathComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String className;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final String hint;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int matchBitmask;

    @Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m87232d2 = {"Lcom/facebook/appevents/codeless/internal/PathComponent$MatchBitmaskType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ID", "TEXT", "TAG", "DESCRIPTION", "HINT", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int value;

        MatchBitmaskType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public PathComponent(@NotNull JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        String string = jSONObject.getString("class_name");
        string.getClass();
        this.className = string;
        this.index = jSONObject.optInt(FirebaseAnalytics.Param.INDEX, -1);
        this.id = jSONObject.optInt("id");
        String strOptString = jSONObject.optString("text");
        strOptString.getClass();
        this.text = strOptString;
        String strOptString2 = jSONObject.optString("tag");
        strOptString2.getClass();
        this.tag = strOptString2;
        String strOptString3 = jSONObject.optString("description");
        strOptString3.getClass();
        this.description = strOptString3;
        String strOptString4 = jSONObject.optString(TrackReferenceTypeBox.TYPE1);
        strOptString4.getClass();
        this.hint = strOptString4;
        this.matchBitmask = jSONObject.optInt("match_bitmask");
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMatchBitmask() {
        return this.matchBitmask;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getText() {
        return this.text;
    }
}

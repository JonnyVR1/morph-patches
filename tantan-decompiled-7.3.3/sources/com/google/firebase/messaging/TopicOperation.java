package com.google.firebase.messaging;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;
import p153l.gzi0;
import p153l.p7f;

/* JADX INFO: loaded from: classes7.dex */
final class TopicOperation {
    private static final String OLD_TOPIC_PREFIX = "/topics/";

    @VisibleForTesting
    static final String OPERATION_PAIR_DIVIDER = "!";
    private static final String TOPIC_NAME_PATTERN = "[a-zA-Z0-9-_.~%]{1,900}";
    private static final Pattern TOPIC_NAME_REGEXP = Pattern.compile(TOPIC_NAME_PATTERN);
    private final String operation;
    private final String serializedString;
    private final String topic;

    private TopicOperation(String str, String str2) {
        this.topic = normalizeTopicOrThrow(str2, str);
        this.operation = str;
        this.serializedString = str + OPERATION_PAIR_DIVIDER + str2;
    }

    @Nullable
    public static TopicOperation from(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(OPERATION_PAIR_DIVIDER, -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new TopicOperation(strArrSplit[0], strArrSplit[1]);
    }

    @NonNull
    private static String normalizeTopicOrThrow(String str, String str2) {
        if (str != null && str.startsWith(OLD_TOPIC_PREFIX)) {
            String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2);
            str = str.substring(8);
        }
        if (str != null && TOPIC_NAME_REGEXP.matcher(str).matches()) {
            return str;
        }
        gzi0.m133102a("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, TOPIC_NAME_PATTERN});
        return null;
    }

    public static TopicOperation subscribe(@NonNull String str) {
        return new TopicOperation(p7f.LATITUDE_SOUTH, str);
    }

    public static TopicOperation unsubscribe(@NonNull String str) {
        return new TopicOperation("U", str);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TopicOperation)) {
            return false;
        }
        TopicOperation topicOperation = (TopicOperation) obj;
        return this.topic.equals(topicOperation.topic) && this.operation.equals(topicOperation.operation);
    }

    public String getOperation() {
        return this.operation;
    }

    public String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return Objects.hashCode(this.operation, this.topic);
    }

    public String serialize() {
        return this.serializedString;
    }
}

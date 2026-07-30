package com.tantanapp.beatles.p072v2.data;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.UUID;
import p149l.ig3;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class EventId {
    public static final EventId EMPTY_ID = new EventId(new UUID(0, 0));

    @NonNull
    private final UUID uuid;

    public EventId(@Nullable UUID uuid) {
        this.uuid = uuid == null ? UUID.randomUUID() : uuid;
    }

    private UUID fromStringEventId(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 32) {
            str = new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString();
        }
        if (str.length() == 36) {
            return UUID.fromString(str);
        }
        ig3.m135964a("String representation of EventId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.uuid.compareTo(((EventId) obj).uuid) == 0;
    }

    public int hashCode() {
        return this.uuid.hashCode();
    }

    public String toString() {
        return this.uuid.toString().replace("-", "");
    }

    public EventId() {
        this((UUID) null);
    }

    public EventId(String str) {
        this.uuid = fromStringEventId(str);
    }
}

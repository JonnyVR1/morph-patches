package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class LogSourceMetrics {
    private static final LogSourceMetrics DEFAULT_INSTANCE = new Builder().build();
    private final List<LogEventDropped> log_event_dropped_;
    private final String log_source_;

    public static final class Builder {
        private String log_source_ = "";
        private List<LogEventDropped> log_event_dropped_ = new ArrayList();

        public Builder addLogEventDropped(LogEventDropped logEventDropped) {
            this.log_event_dropped_.add(logEventDropped);
            return this;
        }

        public LogSourceMetrics build() {
            return new LogSourceMetrics(this.log_source_, Collections.unmodifiableList(this.log_event_dropped_));
        }

        public Builder setLogEventDroppedList(List<LogEventDropped> list) {
            this.log_event_dropped_ = list;
            return this;
        }

        public Builder setLogSource(String str) {
            this.log_source_ = str;
            return this;
        }
    }

    public LogSourceMetrics(String str, List<LogEventDropped> list) {
        this.log_source_ = str;
        this.log_event_dropped_ = list;
    }

    public static LogSourceMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logEventDropped")
    public List<LogEventDropped> getLogEventDroppedList() {
        return this.log_event_dropped_;
    }

    @Protobuf(tag = 1)
    public String getLogSource() {
        return this.log_source_;
    }
}

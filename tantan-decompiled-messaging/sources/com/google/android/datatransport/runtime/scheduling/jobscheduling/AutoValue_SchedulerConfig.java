package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;
import p149l.jfd0;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_SchedulerConfig extends SchedulerConfig {
    private final Clock clock;
    private final Map<Priority, SchedulerConfig.ConfigValue> values;

    public AutoValue_SchedulerConfig(Clock clock, Map<Priority, SchedulerConfig.ConfigValue> map) {
        if (clock == null) {
            jfd0.m141176a("Null clock");
            throw null;
        }
        this.clock = clock;
        if (map != null) {
            this.values = map;
        } else {
            jfd0.m141176a("Null values");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig) {
            SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
            if (this.clock.equals(schedulerConfig.getClock()) && this.values.equals(schedulerConfig.getValues())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Clock getClock() {
        return this.clock;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Map<Priority, SchedulerConfig.ConfigValue> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() ^ ((this.clock.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.clock + ", values=" + this.values + "}";
    }
}

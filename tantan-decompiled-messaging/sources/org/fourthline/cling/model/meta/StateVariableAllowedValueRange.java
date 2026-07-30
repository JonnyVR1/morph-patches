package org.fourthline.cling.model.meta;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.Validatable;
import org.fourthline.cling.model.ValidationError;

/* JADX INFO: loaded from: classes3.dex */
public class StateVariableAllowedValueRange implements Validatable {
    private static final Logger log = Logger.getLogger(StateVariableAllowedValueRange.class.getName());
    private final long maximum;
    private final long minimum;
    private final long step;

    public StateVariableAllowedValueRange(long j, long j2, long j3) {
        if (j > j2) {
            log.warning("UPnP specification violation, allowed value range minimum '" + j + "' is greater than maximum '" + j2 + "', switching values.");
            this.minimum = j2;
            this.maximum = j;
        } else {
            this.minimum = j;
            this.maximum = j2;
        }
        this.step = j3;
    }

    public long getMaximum() {
        return this.maximum;
    }

    public long getMinimum() {
        return this.minimum;
    }

    public long getStep() {
        return this.step;
    }

    public boolean isInRange(long j) {
        return j >= getMinimum() && j <= getMaximum() && j % this.step == 0;
    }

    public String toString() {
        return "Range Min: " + getMinimum() + " Max: " + getMaximum() + " Step: " + getStep();
    }

    @Override // org.fourthline.cling.model.Validatable
    public List<ValidationError> validate() {
        return new ArrayList();
    }

    public StateVariableAllowedValueRange(long j, long j2) {
        this(j, j2, 1L);
    }
}

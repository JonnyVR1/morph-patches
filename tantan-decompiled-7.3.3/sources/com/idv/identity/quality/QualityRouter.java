package com.idv.identity.quality;

import java.util.Collections;
import java.util.List;
import p153l.dn2;

/* JADX INFO: loaded from: classes7.dex */
public class QualityRouter implements dn2 {
    public static final String MODEL_NAME = "face_occ.mnn";

    @Override // p153l.dn2
    public List<String> getModel() {
        return Collections.singletonList(MODEL_NAME);
    }
}

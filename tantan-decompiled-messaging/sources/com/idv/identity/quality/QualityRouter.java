package com.idv.identity.quality;

import java.util.Collections;
import java.util.List;
import p149l.wm2;

/* JADX INFO: loaded from: classes7.dex */
public class QualityRouter implements wm2 {
    public static final String MODEL_NAME = "face_occ.mnn";

    @Override // p149l.wm2
    public List<String> getModel() {
        return Collections.singletonList(MODEL_NAME);
    }
}

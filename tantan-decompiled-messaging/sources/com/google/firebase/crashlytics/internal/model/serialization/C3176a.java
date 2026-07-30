package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.serialization.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3176a implements CrashlyticsReportJsonTransform.ObjectParser {
    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public final Object parse(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.parseEventFrame(jsonReader);
    }
}

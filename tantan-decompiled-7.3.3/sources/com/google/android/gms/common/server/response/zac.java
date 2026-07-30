package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
final class zac implements zai {
    @Override // com.google.android.gms.common.server.response.zai
    @Nullable
    public final /* synthetic */ Object zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return Float.valueOf(fastParser.zak(bufferedReader));
    }
}

package com.idv.identity.face;

import android.content.Context;
import android.content.Intent;
import com.idv.identity.face.p043ui.ToygerLandActivity;
import com.idv.identity.face.p043ui.ToygerPortActivity;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityFaceApi {
    public static boolean start(Context context, boolean z) {
        context.startActivity(z ? new Intent(context, (Class<?>) ToygerPortActivity.class) : new Intent(context, (Class<?>) ToygerLandActivity.class));
        return true;
    }
}

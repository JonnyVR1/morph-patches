package com.google.firebase.sessions;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m87232d2 = {"Lcom/google/firebase/sessions/SessionDataStoreConfigs;", "", "()V", "PROCESS_NAME", "", "kotlin.jvm.PlatformType", "SESSIONS_CONFIG_NAME", "getSESSIONS_CONFIG_NAME", "()Ljava/lang/String;", "SETTINGS_CONFIG_NAME", "getSETTINGS_CONFIG_NAME", "com.google.firebase-firebase-sessions"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class SessionDataStoreConfigs {

    @NotNull
    public static final SessionDataStoreConfigs INSTANCE = new SessionDataStoreConfigs();
    private static final String PROCESS_NAME;

    @NotNull
    private static final String SESSIONS_CONFIG_NAME;

    @NotNull
    private static final String SETTINGS_CONFIG_NAME;

    static {
        String strEncodeToString = Base64.encodeToString(C15386d.m93487u(ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions()), 10);
        PROCESS_NAME = strEncodeToString;
        SESSIONS_CONFIG_NAME = "firebase_session_" + strEncodeToString + "_data";
        SETTINGS_CONFIG_NAME = "firebase_session_" + strEncodeToString + "_settings";
    }

    private SessionDataStoreConfigs() {
    }

    @NotNull
    public final String getSESSIONS_CONFIG_NAME() {
        return SESSIONS_CONFIG_NAME;
    }

    @NotNull
    public final String getSETTINGS_CONFIG_NAME() {
        return SETTINGS_CONFIG_NAME;
    }
}

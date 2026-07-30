package com.google.firebase.installations.ktx;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.ktx.Firebase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m88121d2 = {"installations", "Lcom/google/firebase/installations/FirebaseInstallations;", "Lcom/google/firebase/ktx/Firebase;", "getInstallations", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/installations/FirebaseInstallations;", "app", "Lcom/google/firebase/FirebaseApp;", "com.google.firebase-firebase-installations"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class InstallationsKt {
    @NotNull
    public static final FirebaseInstallations getInstallations(@NotNull Firebase firebase) {
        firebase.getClass();
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance();
        firebaseInstallations.getClass();
        return firebaseInstallations;
    }

    @NotNull
    public static final FirebaseInstallations installations(@NotNull Firebase firebase, @NotNull FirebaseApp firebaseApp) {
        firebase.getClass();
        firebaseApp.getClass();
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance(firebaseApp);
        firebaseInstallations.getClass();
        return firebaseInstallations;
    }
}

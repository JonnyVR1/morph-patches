package com.google.firebase.messaging.ktx;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0019\b\u0004\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0087\bø\u0001\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, m88121d2 = {"messaging", "Lcom/google/firebase/messaging/FirebaseMessaging;", "Lcom/google/firebase/ktx/Firebase;", "getMessaging", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/messaging/FirebaseMessaging;", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "to", "", "init", "Lkotlin/Function1;", "Lcom/google/firebase/messaging/RemoteMessage$Builder;", "", "Lkotlin/ExtensionFunctionType;", "com.google.firebase-firebase-messaging"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class MessagingKt {
    @NotNull
    public static final FirebaseMessaging getMessaging(@NotNull Firebase firebase) {
        firebase.getClass();
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        firebaseMessaging.getClass();
        return firebaseMessaging;
    }

    @Deprecated
    @NotNull
    public static final RemoteMessage remoteMessage(@NotNull String str, @NotNull Function1<? super RemoteMessage.Builder, Unit> function1) {
        str.getClass();
        function1.getClass();
        RemoteMessage.Builder builder = new RemoteMessage.Builder(str);
        function1.invoke(builder);
        RemoteMessage remoteMessageBuild = builder.build();
        remoteMessageBuild.getClass();
        return remoteMessageBuild;
    }
}

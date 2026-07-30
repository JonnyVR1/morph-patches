package com.google.firebase;

import android.content.Context;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.p051p1.mobile.putong.core.data.Options;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.f7f;
import p153l.p7f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\rH\u0082\b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u001a\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m88121d2 = {"app", "Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/Firebase;", "getApp", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/FirebaseApp;", Options.TYPE, "Lcom/google/firebase/FirebaseOptions;", "getOptions", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/FirebaseOptions;", "coroutineDispatcher", "Lcom/google/firebase/components/Component;", "Lkotlinx/coroutines/CoroutineDispatcher;", p7f.GPS_DIRECTION_TRUE, "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "initialize", "context", "Landroid/content/Context;", "com.google.firebase-firebase-common"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class FirebaseKt {
    @NotNull
    public static final FirebaseApp app(@NotNull Firebase firebase, @NotNull String str) {
        firebase.getClass();
        str.getClass();
        FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
        firebaseApp.getClass();
        return firebaseApp;
    }

    private static final /* synthetic */ <T extends Annotation> Component<CoroutineDispatcher> coroutineDispatcher() {
        Intrinsics.m88382i(4, p7f.GPS_DIRECTION_TRUE);
        Component.Builder builder = Component.builder(Qualified.qualified(Annotation.class, CoroutineDispatcher.class));
        Intrinsics.m88382i(4, p7f.GPS_DIRECTION_TRUE);
        Component.Builder builderAdd = builder.add(Dependency.required((Qualified<?>) Qualified.qualified(Annotation.class, Executor.class)));
        Intrinsics.m88381h();
        Component<CoroutineDispatcher> componentBuild = builderAdd.factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseKt.coroutineDispatcher.1
            @Override // com.google.firebase.components.ComponentFactory
            public final CoroutineDispatcher create(ComponentContainer componentContainer) {
                Intrinsics.m88382i(4, p7f.GPS_DIRECTION_TRUE);
                Object obj = componentContainer.get(Qualified.qualified(Annotation.class, Executor.class));
                obj.getClass();
                return f7f.m124439b((Executor) obj);
            }
        }).build();
        componentBuild.getClass();
        return componentBuild;
    }

    @NotNull
    public static final FirebaseApp getApp(@NotNull Firebase firebase) {
        firebase.getClass();
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        firebaseApp.getClass();
        return firebaseApp;
    }

    @NotNull
    public static final FirebaseOptions getOptions(@NotNull Firebase firebase) {
        firebase.getClass();
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        options.getClass();
        return options;
    }

    @NotNull
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context, @NotNull FirebaseOptions firebaseOptions, @NotNull String str) {
        firebase.getClass();
        context.getClass();
        firebaseOptions.getClass();
        str.getClass();
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, firebaseOptions, str);
        firebaseAppInitializeApp.getClass();
        return firebaseAppInitializeApp;
    }

    @NotNull
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context, @NotNull FirebaseOptions firebaseOptions) {
        firebase.getClass();
        context.getClass();
        firebaseOptions.getClass();
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        firebaseAppInitializeApp.getClass();
        return firebaseAppInitializeApp;
    }

    @Nullable
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context) {
        firebase.getClass();
        context.getClass();
        return FirebaseApp.initializeApp(context);
    }
}

package com.google.firebase.ktx;

import android.content.Context;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.p046p1.mobile.putong.core.data.Options;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.z5f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\rH\u0082\b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a$\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m87232d2 = {"app", "Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/ktx/Firebase;", "getApp", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/FirebaseApp;", Options.TYPE, "Lcom/google/firebase/FirebaseOptions;", "getOptions", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/FirebaseOptions;", "coroutineDispatcher", "Lcom/google/firebase/components/Component;", "Lkotlinx/coroutines/CoroutineDispatcher;", j6f.GPS_DIRECTION_TRUE, "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "initialize", "context", "Landroid/content/Context;", "com.google.firebase-firebase-common"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
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
        Intrinsics.m87493i(4, j6f.GPS_DIRECTION_TRUE);
        Component.Builder builder = Component.builder(Qualified.qualified(Annotation.class, CoroutineDispatcher.class));
        Intrinsics.m87493i(4, j6f.GPS_DIRECTION_TRUE);
        Component.Builder builderAdd = builder.add(Dependency.required((Qualified<?>) Qualified.qualified(Annotation.class, Executor.class)));
        Intrinsics.m87492h();
        Component<CoroutineDispatcher> componentBuild = builderAdd.factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseKt.coroutineDispatcher.1
            @Override // com.google.firebase.components.ComponentFactory
            public final CoroutineDispatcher create(ComponentContainer componentContainer) {
                Intrinsics.m87493i(4, j6f.GPS_DIRECTION_TRUE);
                Object obj = componentContainer.get(Qualified.qualified(Annotation.class, Executor.class));
                obj.getClass();
                return z5f.m217297b((Executor) obj);
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

    @Deprecated
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

    @Deprecated
    @NotNull
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context, @NotNull FirebaseOptions firebaseOptions) {
        firebase.getClass();
        context.getClass();
        firebaseOptions.getClass();
        FirebaseApp firebaseAppInitializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        firebaseAppInitializeApp.getClass();
        return firebaseAppInitializeApp;
    }

    @Deprecated
    @Nullable
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context) {
        firebase.getClass();
        context.getClass();
        return FirebaseApp.initializeApp(context);
    }
}

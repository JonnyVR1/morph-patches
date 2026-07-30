package com.google.mlkit.p034nl.languageid;

import androidx.annotation.NonNull;
import androidx.lifecycle.InterfaceC0485n;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.util.List;
import p153l.jer;

/* JADX INFO: loaded from: classes7.dex */
public interface LanguageIdentifier extends Closeable, jer, OptionalModuleApi {
    public static final float DEFAULT_IDENTIFY_LANGUAGE_CONFIDENCE_THRESHOLD = 0.5f;
    public static final float DEFAULT_IDENTIFY_POSSIBLE_LANGUAGES_CONFIDENCE_THRESHOLD = 0.01f;

    @NonNull
    public static final String UNDETERMINED_LANGUAGE_TAG = "und";

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC0485n(Lifecycle.Event.ON_DESTROY)
    void close();

    @NonNull
    Task<String> identifyLanguage(@NonNull String str);

    @NonNull
    Task<List<IdentifiedLanguage>> identifyPossibleLanguages(@NonNull String str);
}

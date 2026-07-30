package androidx.datastore.preferences.core;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ci80;
import p149l.eri;
import p149l.i5c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005JF\u0010\r\u001a\u00020\u000221\u0010\f\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m87232d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStore;", "Ll/i5c;", "Ll/ci80;", "delegate", "<init>", "(Ll/i5c;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, Constants.KEY_T, "Lkotlin/coroutines/Continuation;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/i5c;", "Ll/eri;", "getData", "()Ll/eri;", "data", "datastore-preferences-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class PreferenceDataStore implements i5c<ci80> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final i5c<ci80> delegate;

    public PreferenceDataStore(@NotNull i5c<ci80> i5cVar) {
        i5cVar.getClass();
        this.delegate = i5cVar;
    }

    @Override // p149l.i5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo1413a(@NotNull Function2<? super ci80, ? super Continuation<? super ci80>, ? extends Object> function2, @NotNull Continuation<? super ci80> continuation) {
        return this.delegate.mo1413a(new PreferenceDataStore$updateData$2(function2, null), continuation);
    }

    @Override // p149l.i5c
    @NotNull
    public eri<ci80> getData() {
        return this.delegate.getData();
    }
}

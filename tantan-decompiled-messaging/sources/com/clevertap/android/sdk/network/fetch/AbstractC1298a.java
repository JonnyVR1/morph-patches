package com.clevertap.android.sdk.network.fetch;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;

/* JADX INFO: renamed from: com.clevertap.android.sdk.network.fetch.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/fetch/a;", j6f.GPS_DIRECTION_TRUE, "", "<init>", "()V", "c", Constants.INAPP_DATA_TAG, "a", "b", "Lcom/clevertap/android/sdk/network/fetch/a$a;", "Lcom/clevertap/android/sdk/network/fetch/a$b;", "Lcom/clevertap/android/sdk/network/fetch/a$c;", "Lcom/clevertap/android/sdk/network/fetch/a$d;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class AbstractC1298a<T> {

    /* JADX INFO: renamed from: com.clevertap.android.sdk.network.fetch.a$a */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/fetch/a$a;", "Lcom/clevertap/android/sdk/network/fetch/a;", "", "<init>", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class a extends AbstractC1298a {

        @NotNull
        public static final a INSTANCE = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.network.fetch.a$b */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/fetch/a$b;", "Lcom/clevertap/android/sdk/network/fetch/a;", "", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class b extends AbstractC1298a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Throwable th) {
            super(null);
            th.getClass();
            this.cause = th;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && Intrinsics.m87488d(this.cause, ((b) other).cause);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @NotNull
        public String toString() {
            return "NetworkFailure(cause=" + this.cause + ')';
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.network.fetch.a$c */
    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/fetch/a$c;", j6f.GPS_DIRECTION_TRUE, "Lcom/clevertap/android/sdk/network/fetch/a;", "data", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class c<T> extends AbstractC1298a<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final T data;

        public c(T t) {
            super(null);
            this.data = t;
        }

        /* JADX INFO: renamed from: a */
        public final T m6867a() {
            return this.data;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && Intrinsics.m87488d(this.data, ((c) other).data);
        }

        public int hashCode() {
            T t = this.data;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.network.fetch.a$d */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/fetch/a$d;", "Lcom/clevertap/android/sdk/network/fetch/a;", "", "<init>", "()V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class d extends AbstractC1298a {

        @NotNull
        public static final d INSTANCE = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC1298a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC1298a() {
    }
}

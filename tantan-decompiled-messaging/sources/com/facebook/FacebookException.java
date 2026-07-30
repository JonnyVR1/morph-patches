package com.facebook;

import com.facebook.FacebookException;
import com.facebook.internal.FeatureManager;
import java.util.Arrays;
import java.util.Random;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.f2f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\b\u0016\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u0014B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007B+\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t\"\u0004\u0018\u00010\n¢\u0006\u0004\b\u0003\u0010\fB\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0003\u0010\u000fB\u0013\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0003\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m87232d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "", "message", "(Ljava/lang/String;)V", "format", "", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "Companion", "a", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public class FacebookException extends RuntimeException {
    public static final long serialVersionUID = 1;

    public FacebookException(@Nullable final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !C1577c.m8027F() || random.nextInt(100) <= 50) {
            return;
        }
        FeatureManager.m8676a(FeatureManager.Feature.ErrorReport, new FeatureManager.InterfaceC1642a() { // from class: l.iuf
            @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
            /* JADX INFO: renamed from: a */
            public final void mo8684a(boolean z) {
                FacebookException.m7493a(str, z);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m7493a(String str, boolean z) {
        if (z) {
            try {
                f2f.m119180f(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public FacebookException() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FacebookException(@Nullable String str, @NotNull Object... objArr) {
        String str2;
        objArr.getClass();
        if (str != null) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        } else {
            str2 = null;
        }
        this(str2);
    }

    public FacebookException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public FacebookException(@Nullable Throwable th) {
        super(th);
    }
}

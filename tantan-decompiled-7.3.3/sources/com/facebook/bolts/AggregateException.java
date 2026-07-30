package com.facebook.bolts;

import androidx.core.app.NotificationCompat;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0013B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\r\u0010\u0010R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0014"}, m88121d2 = {"Lcom/facebook/bolts/AggregateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "detailMessage", "", "", "innerThrowables", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/io/PrintStream;", NotificationCompat.CATEGORY_ERROR, "", "printStackTrace", "(Ljava/io/PrintStream;)V", "Ljava/io/PrintWriter;", "(Ljava/io/PrintWriter;)V", "Ljava/util/List;", "Companion", "a", "facebook-bolts_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class AggregateException extends Exception {
    private static final long serialVersionUID = 1;

    @NotNull
    private final List<Throwable> innerThrowables;

    public AggregateException(@Nullable String str, @Nullable List<? extends Throwable> list) {
        super(str, (list == null || list.isEmpty()) ? null : list.get(0));
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(list == null ? CollectionsKt.emptyList() : list);
        listUnmodifiableList.getClass();
        this.innerThrowables = listUnmodifiableList;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@NotNull PrintStream err) {
        err.getClass();
        super.printStackTrace(err);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            err.append(SignParameters.NEW_LINE);
            err.append("  Inner throwable #");
            i++;
            err.append((CharSequence) String.valueOf(i));
            err.append(": ");
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append(SignParameters.NEW_LINE);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@NotNull PrintWriter err) {
        err.getClass();
        super.printStackTrace(err);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            err.append(SignParameters.NEW_LINE);
            err.append("  Inner throwable #");
            i++;
            err.append((CharSequence) String.valueOf(i));
            err.append(": ");
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append(SignParameters.NEW_LINE);
        }
    }
}

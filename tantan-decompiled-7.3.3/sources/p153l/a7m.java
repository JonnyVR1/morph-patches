package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0012J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007JC\u0010\u000e\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH&¢\u0006\u0004\b\u0017\u0010\u0013J%\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/a7m;", "", "", "url", "bid", "", "g", "(Ljava/lang/String;Ljava/lang/String;)V", "", "needUrlCheckGrey", "Ll/cd00;", "callback", "Lkotlin/Function0;", "onFinished", "c", "(Ljava/lang/String;Ljava/lang/String;ZLl/cd00;Lkotlin/jvm/functions/Function0;)V", "e", "(Ll/cd00;)V", "a", "()Z", "", "b", "()I", "f", "Ll/a7m$a;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;)Ll/a7m$a;", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public interface a7m {

    /* JADX INFO: renamed from: l.a7m$a */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"Ll/a7m$a;", "", "", "a", "()J", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public interface InterfaceC15666a {
        /* JADX INFO: renamed from: a */
        long mo96380a();
    }

    /* JADX INFO: renamed from: a */
    boolean mo96373a();

    /* JADX INFO: renamed from: b */
    int mo96374b();

    /* JADX INFO: renamed from: c */
    void mo96375c(@Nullable String url, @Nullable String bid, boolean needUrlCheckGrey, @Nullable cd00 callback, @NotNull Function0<Unit> onFinished);

    @Nullable
    /* JADX INFO: renamed from: d */
    InterfaceC15666a mo96376d(@Nullable String bid, @Nullable String url);

    /* JADX INFO: renamed from: e */
    void mo96377e(@Nullable cd00 callback);

    /* JADX INFO: renamed from: f */
    boolean mo96378f();

    /* JADX INFO: renamed from: g */
    void mo96379g(@Nullable String url, @Nullable String bid);
}

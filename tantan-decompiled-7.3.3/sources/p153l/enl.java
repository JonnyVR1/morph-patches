package p153l;

import com.facebook.AuthenticationTokenClaims;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010 R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001cR\u0016\u0010+\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001c¨\u0006,"}, m88121d2 = {"Ll/enl;", "Ll/jvl;", "Ll/i5d0;", "response", "<init>", "(Ll/i5d0;)V", "", AuthenticationTokenClaims.JSON_KEY_NAME, "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", "", "getHeaders", "(Ljava/lang/String;)Ljava/util/List;", "a", "Ll/i5d0;", "", "b", "Lkotlin/Lazy;", "c", "()[B", "cachedBodyBytes", "Ljava/lang/String;", "cachedContentType", "", "getCode", "()I", "code", "getMessage", "()Ljava/lang/String;", "message", "", "isSuccessful", "()Z", "isRedirect", "getHeaderNames", "()Ljava/util/List;", "headerNames", "Ljava/io/InputStream;", "()Ljava/io/InputStream;", "bodyStream", "getContentType", "contentType", "getBodyString", "bodyString", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class enl implements jvl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final i5d0 response;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy cachedBodyBytes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String cachedContentType;

    public enl(@NotNull i5d0 i5d0Var) {
        e7y e7yVarContentType;
        i5d0Var.getClass();
        this.response = i5d0Var;
        this.cachedBodyBytes = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.dnl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return enl.m121544b(this.f89813a);
            }
        });
        k5d0 k5d0VarM138670k = i5d0Var.m138670k();
        this.cachedContentType = (k5d0VarM138670k == null || (e7yVarContentType = k5d0VarM138670k.contentType()) == null) ? null : e7yVarContentType.toString();
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m121544b(enl enlVar) {
        k5d0 k5d0VarM138670k = enlVar.response.m138670k();
        if (k5d0VarM138670k != null) {
            return k5d0VarM138670k.bytes();
        }
        return null;
    }

    @Override // p153l.jvl
    @Nullable
    /* JADX INFO: renamed from: a */
    public InputStream getSimpleBodyStream() {
        byte[] bArrM121546c = m121546c();
        if (bArrM121546c != null) {
            return new ByteArrayInputStream(bArrM121546c);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m121546c() {
        return (byte[]) this.cachedBodyBytes.getValue();
    }

    @Override // p153l.jvl
    @Nullable
    public String getBodyString() {
        byte[] bArrM121546c = m121546c();
        if (bArrM121546c != null) {
            return new String(bArrM121546c, Charsets.UTF_8);
        }
        return null;
    }

    @Override // p153l.jvl
    /* JADX INFO: renamed from: getCode */
    public int getSimpleCode() {
        return this.response.m138673q();
    }

    @Override // p153l.jvl
    @Nullable
    /* JADX INFO: renamed from: getContentType, reason: from getter */
    public String getCachedContentType() {
        return this.cachedContentType;
    }

    @Override // p153l.jvl
    @Nullable
    public String getHeader(@NotNull String name) {
        name.getClass();
        return this.response.m138675u(name);
    }

    @Override // p153l.jvl
    @NotNull
    public List<String> getHeaderNames() {
        Set<String> setM118876g = this.response.m138659F().m118876g();
        setM118876g.getClass();
        return CollectionsKt.toList(setM118876g);
    }

    @Override // p153l.jvl
    @Nullable
    public List<String> getHeaders(@NotNull String name) {
        name.getClass();
        return this.response.m138658B(name);
    }

    @Override // p153l.jvl
    @Nullable
    /* JADX INFO: renamed from: getMessage */
    public String getSimpleMessage() {
        return this.response.m138662J();
    }

    @Override // p153l.jvl
    public boolean isRedirect() {
        return this.response.m138660H();
    }

    @Override // p153l.jvl
    public boolean isSuccessful() {
        return this.response.m138661I();
    }
}

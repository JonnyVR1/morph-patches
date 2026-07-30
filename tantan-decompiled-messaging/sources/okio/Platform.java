package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-Platform, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000\u001a\f\u0010\t\u001a\u00020\u0003*\u00020\nH\u0000\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\u0003H\u0000*\n\u0010\f\"\u00020\r2\u00020\r*\n\u0010\u000e\"\u00020\u000f2\u00020\u000f*\n\u0010\u0010\"\u00020\u00112\u00020\u0011*\n\u0010\u0012\"\u00020\u00132\u00020\u0013*\n\u0010\u0014\"\u00020\u00152\u00020\u0015¨\u0006\u0016"}, m87232d2 = {"arraycopy", "", "src", "", "srcPos", "", "dest", "destPos", "length", "asUtf8ToByteArray", "", "toUtf8String", "ArrayIndexOutOfBoundsException", "Ljava/lang/ArrayIndexOutOfBoundsException;", "JvmField", "Lkotlin/jvm/JvmField;", "JvmName", "Lkotlin/jvm/JvmName;", "JvmOverloads", "Lkotlin/jvm/JvmOverloads;", "JvmStatic", "Lkotlin/jvm/JvmStatic;", "jvm"}, m87233k = 2, m87234mv = {1, 1, 11})
@JvmName
public final class Platform {
    public static final void arraycopy(@NotNull byte[] bArr, int i, @NotNull byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i, bArr2, i2, i3);
    }

    @NotNull
    public static final byte[] asUtf8ToByteArray(@NotNull String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return bytes;
    }

    @NotNull
    public static final String toUtf8String(@NotNull byte[] bArr) {
        bArr.getClass();
        return new String(bArr, Charsets.UTF_8);
    }
}

package p153l;

import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/kim;", "", "<init>", "()V", "", "value", "", "a", "(Ljava/lang/String;)[B", "byteArray", "pattern", "", "c", "([B[B)Z", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "b", "([B[BI)Z", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class kim {

    @NotNull
    public static final kim INSTANCE = new kim();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final byte[] m149917a(@NotNull String value) {
        value.getClass();
        try {
            Charset charsetForName = Charset.forName("ASCII");
            charsetForName.getClass();
            byte[] bytes = value.getBytes(charsetForName);
            bytes.getClass();
            return bytes;
        } catch (UnsupportedEncodingException e) {
            vtq0.m202761a("ASCII not found!", e);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m149918b(@NotNull byte[] byteArray, @NotNull byte[] pattern, int offset) {
        byteArray.getClass();
        pattern.getClass();
        if (pattern.length + offset > byteArray.length) {
            return false;
        }
        Iterable indices = ArraysKt.getIndices(pattern);
        if ((indices instanceof Collection) && ((Collection) indices).isEmpty()) {
            return true;
        }
        Iterator it = indices.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (byteArray[offset + iNextInt] != pattern[iNextInt]) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m149919c(@NotNull byte[] byteArray, @NotNull byte[] pattern) {
        byteArray.getClass();
        pattern.getClass();
        return m149918b(byteArray, pattern, 0);
    }
}

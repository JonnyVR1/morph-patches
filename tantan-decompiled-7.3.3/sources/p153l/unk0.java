package p153l;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Ll/unk0;", "", "<init>", "()V", "Ljava/io/File;", "a", "()Ljava/io/File;", "file", "", "", "Ll/bqw;", "c", "(Ljava/io/File;)Ljava/util/Map;", "texts", "", "maxLen", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;I)[I", "str", "b", "(Ljava/lang/String;)Ljava/lang/String;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class unk0 {

    @NotNull
    public static final unk0 INSTANCE = new unk0();

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final File m196869a() {
        if (ztb.m221490d(unk0.class)) {
            return null;
        }
        try {
            File file = new File(C1600c.m8101l().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            ztb.m221488b(th, unk0.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Map<String, bqw> m196870c(@NotNull File file) {
        Map<String, bqw> map;
        Map<String, bqw> map2 = null;
        if (ztb.m221490d(unk0.class)) {
            return null;
        }
        try {
            file.getClass();
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int iAvailable = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[iAvailable];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (iAvailable < 4) {
                    return null;
                }
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i = byteBufferWrap.getInt();
                int i2 = i + 4;
                if (iAvailable < i2) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i, Charsets.UTF_8));
                JSONArray jSONArrayNames = jSONObject.names();
                int length = jSONArrayNames.length();
                String[] strArr = new String[length];
                for (int i3 = 0; i3 < length; i3++) {
                    strArr[i3] = jSONArrayNames.getString(i3);
                }
                ArraysKt.sort((Object[]) strArr);
                HashMap map3 = new HashMap();
                int i4 = 0;
                while (i4 < length) {
                    String str = strArr[i4];
                    if (str == null) {
                        map = map2;
                    } else {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i5 = 1;
                        map = map2;
                        for (int i6 = 0; i6 < length2; i6++) {
                            try {
                                int i7 = jSONArray.getInt(i6);
                                iArr[i6] = i7;
                                i5 *= i7;
                            } catch (Exception unused) {
                                return map;
                            } catch (Throwable th) {
                                th = th;
                                ztb.m221488b(th, unk0.class);
                                return map;
                            }
                        }
                        int i8 = i5 * 4;
                        int i9 = i2 + i8;
                        if (i9 > iAvailable) {
                            return map;
                        }
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i2, i8);
                        byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                        bqw bqwVar = new bqw(iArr);
                        byteBufferWrap2.asFloatBuffer().get(bqwVar.getData(), 0, i5);
                        map3.put(str, bqwVar);
                        i2 = i9;
                    }
                    i4++;
                    map2 = map;
                }
                return map3;
            } catch (Exception unused2) {
                return map2;
            }
        } catch (Throwable th2) {
            th = th2;
            map = map2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m196871b(@NotNull String str) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            str.getClass();
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.m88378e(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String strJoin = TextUtils.join(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, (String[]) new Regex("\\s+").split(str.subSequence(i, length + 1).toString(), 0).toArray(new String[0]));
            strJoin.getClass();
            return strJoin;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final int[] m196872d(@NotNull String texts, int maxLen) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            texts.getClass();
            int[] iArr = new int[maxLen];
            String strM196871b = m196871b(texts);
            Charset charsetForName = Charset.forName("UTF-8");
            charsetForName.getClass();
            byte[] bytes = strM196871b.getBytes(charsetForName);
            bytes.getClass();
            for (int i = 0; i < maxLen; i++) {
                if (i < bytes.length) {
                    iArr[i] = bytes[i] & 255;
                } else {
                    iArr[i] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }
}

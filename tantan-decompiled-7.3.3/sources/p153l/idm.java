package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.p051p1.mobile.putong.data.StreamUrl;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class idm extends gpf0 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f114511c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a */
    public final CharsetDecoder f114512a = et4.f95689c.newDecoder();

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f114513b = et4.f95688b.newDecoder();

    @Override // p153l.gpf0
    /* JADX INFO: renamed from: b */
    public Metadata mo108050b(ba00 ba00Var, ByteBuffer byteBuffer) {
        String strM139537c = m139537c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strM139537c == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f114511c.matcher(strM139537c);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM138051e = i11.m138051e(strGroup);
                strM138051e.getClass();
                if (strM138051e.equals(StreamUrl.TYPE)) {
                    str2 = strGroup2;
                } else if (strM138051e.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m139537c(ByteBuffer byteBuffer) {
        try {
            String string = this.f114512a.decode(byteBuffer).toString();
            this.f114512a.reset();
            byteBuffer.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.f114512a.reset();
            byteBuffer.rewind();
            try {
                return this.f114513b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f114513b.reset();
                byteBuffer.rewind();
            }
        } catch (Throwable th) {
            this.f114512a.reset();
            byteBuffer.rewind();
            throw th;
        }
    }
}

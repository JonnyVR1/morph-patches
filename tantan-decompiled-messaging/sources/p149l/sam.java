package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.p046p1.mobile.putong.data.StreamUrl;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class sam extends ygf0 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f163421c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a */
    public final CharsetDecoder f163422a = fs4.f99036c.newDecoder();

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f163423b = fs4.f99035b.newDecoder();

    @Override // p149l.ygf0
    /* JADX INFO: renamed from: b */
    public Metadata mo122590b(e100 e100Var, ByteBuffer byteBuffer) {
        String strM183088c = m183088c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strM183088c == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f163421c.matcher(strM183088c);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM99804e = b11.m99804e(strGroup);
                strM99804e.getClass();
                if (strM99804e.equals(StreamUrl.TYPE)) {
                    str2 = strGroup2;
                } else if (strM99804e.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m183088c(ByteBuffer byteBuffer) {
        try {
            String string = this.f163422a.decode(byteBuffer).toString();
            this.f163422a.reset();
            byteBuffer.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.f163422a.reset();
            byteBuffer.rewind();
            try {
                return this.f163423b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f163423b.reset();
                byteBuffer.rewind();
            }
        } catch (Throwable th) {
            this.f163422a.reset();
            byteBuffer.rewind();
            throw th;
        }
    }
}

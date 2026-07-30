package p149l;

import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.codec.CharEncoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 *2\u00020\u0001:\u0002\u001f\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R\"\u0010&\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, m87232d2 = {"Ll/oo0;", "", "Ll/ep0;", GameIdentity.player, "<init>", "(Ll/ep0;)V", "Ll/irl;", "fileContainer", "", "enableVersion1", "", "defaultVideoMode", "defaultFps", "e", "(Ll/irl;ZII)I", "_videoWidth", "_videoHeight", "", "a", "(II)V", "c", "(Ll/irl;II)Z", "", "boxHead", "Ll/oo0$a;", Constants.INAPP_DATA_TAG, "([B)Ll/oo0$a;", "Ll/ep0;", "getPlayer", "()Ll/ep0;", "Ll/no0;", "b", "Ll/no0;", "()Ll/no0;", "setConfig", "(Ll/no0;)V", Constants.KEY_CONFIG, "Z", "isParsingConfig", "()Z", "setParsingConfig", "(Z)V", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class oo0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ep0 player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public no0 config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isParsingConfig;

    /* JADX INFO: renamed from: l.oo0$a */
    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\r\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/oo0$a;", "", "<init>", "()V", "", "a", "J", "getStartIndex", "()J", Constants.INAPP_DATA_TAG, "(J)V", "startIndex", "", "b", "I", "()I", "c", "(I)V", "length", "", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "type", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18985a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public long startIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int length;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public String type;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getLength() {
            return this.length;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: c */
        public final void m165252c(int i) {
            this.length = i;
        }

        /* JADX INFO: renamed from: d */
        public final void m165253d(long j) {
            this.startIndex = j;
        }

        /* JADX INFO: renamed from: e */
        public final void m165254e(@Nullable String str) {
            this.type = str;
        }
    }

    public oo0(@NotNull ep0 ep0Var) {
        ep0Var.getClass();
        this.player = ep0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m165245a(int _videoWidth, int _videoHeight) {
        no0 no0Var;
        no0 no0Var2 = this.config;
        if ((no0Var2 == null || no0Var2.getIsDefaultConfig()) && (no0Var = this.config) != null) {
            no0Var.m160397v(_videoWidth);
            no0Var.m160396u(_videoHeight);
            int defaultVideoMode = no0Var.getDefaultVideoMode();
            if (defaultVideoMode == 1) {
                no0Var.m160398w(_videoWidth / 2);
                no0Var.m160393r(_videoHeight);
                no0Var.m160389n(new ga80(0, 0, no0Var.getWidth(), no0Var.getHeight()));
                no0Var.m160395t(new ga80(no0Var.getWidth(), 0, no0Var.getWidth(), no0Var.getHeight()));
                return;
            }
            if (defaultVideoMode == 2) {
                no0Var.m160398w(_videoWidth);
                no0Var.m160393r(_videoHeight / 2);
                no0Var.m160389n(new ga80(0, 0, no0Var.getWidth(), no0Var.getHeight()));
                no0Var.m160395t(new ga80(0, no0Var.getHeight(), no0Var.getWidth(), no0Var.getHeight()));
                return;
            }
            if (defaultVideoMode == 3) {
                no0Var.m160398w(_videoWidth / 2);
                no0Var.m160393r(_videoHeight);
                no0Var.m160395t(new ga80(0, 0, no0Var.getWidth(), no0Var.getHeight()));
                no0Var.m160389n(new ga80(no0Var.getWidth(), 0, no0Var.getWidth(), no0Var.getHeight()));
                return;
            }
            if (defaultVideoMode != 4) {
                no0Var.m160398w(_videoWidth / 2);
                no0Var.m160393r(_videoHeight);
                no0Var.m160389n(new ga80(0, 0, no0Var.getWidth(), no0Var.getHeight()));
                no0Var.m160395t(new ga80(no0Var.getWidth(), 0, no0Var.getWidth(), no0Var.getHeight()));
                return;
            }
            no0Var.m160398w(_videoWidth);
            no0Var.m160393r(_videoHeight / 2);
            no0Var.m160395t(new ga80(0, 0, no0Var.getWidth(), no0Var.getHeight()));
            no0Var.m160389n(new ga80(0, no0Var.getHeight(), no0Var.getWidth(), no0Var.getHeight()));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final no0 getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m165247c(irl fileContainer, int defaultVideoMode, int defaultFps) {
        C18985a c18985aM165248d;
        no0 no0Var = new no0();
        this.config = no0Var;
        fileContainer.mo137902a();
        byte[] bArr = new byte[8];
        long length = 0;
        while (true) {
            if (fileContainer.read(bArr, 0, 8) != 8 || (c18985aM165248d = m165248d(bArr)) == null) {
                c18985aM165248d = null;
                break;
            }
            if (Intrinsics.m87488d("vapc", c18985aM165248d.getType())) {
                c18985aM165248d.m165253d(length);
                break;
            }
            length += (long) c18985aM165248d.getLength();
            fileContainer.skip(((long) c18985aM165248d.getLength()) - 8);
        }
        if (c18985aM165248d == null) {
            C21588z0.INSTANCE.m216707b("AnimPlayer.AnimConfigManager", "vapc box head not found");
            no0Var.m160390o(true);
            no0Var.m160391p(defaultVideoMode);
            no0Var.m160392q(defaultFps);
            this.player.m117551x(no0Var.getFps());
            return true;
        }
        int length2 = c18985aM165248d.getLength() - 8;
        byte[] bArr2 = new byte[length2];
        fileContainer.read(bArr2, 0, length2);
        fileContainer.mo137903b();
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        JSONObject jSONObject = new JSONObject(new String(bArr2, 0, length2, charsetForName));
        no0Var.m160394s(jSONObject);
        boolean zM160388m = no0Var.m160388m(jSONObject);
        if (defaultFps > 0) {
            no0Var.m160392q(defaultFps);
        }
        this.player.m117551x(no0Var.getFps());
        return zM160388m;
    }

    /* JADX INFO: renamed from: d */
    public final C18985a m165248d(byte[] boxHead) {
        if (boxHead.length != 8) {
            return null;
        }
        C18985a c18985a = new C18985a();
        c18985a.m165252c(((boxHead[2] & 255) << 8) | ((boxHead[0] & 255) << 24) | ((boxHead[1] & 255) << 16) | (boxHead[3] & 255));
        Charset charsetForName = Charset.forName(CharEncoding.US_ASCII);
        charsetForName.getClass();
        c18985a.m165254e(new String(boxHead, 4, 4, charsetForName));
        return c18985a;
    }

    /* JADX INFO: renamed from: e */
    public final int m165249e(@NotNull irl fileContainer, boolean enableVersion1, int defaultVideoMode, int defaultFps) {
        fileContainer.getClass();
        try {
            this.isParsingConfig = true;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean zM165247c = m165247c(fileContainer, defaultVideoMode, defaultFps);
            C21588z0.INSTANCE.m216709d("AnimPlayer.AnimConfigManager", "parseConfig cost=" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms enableVersion1=" + enableVersion1 + " result=" + zM165247c);
            if (!zM165247c) {
                this.isParsingConfig = false;
                return 10005;
            }
            no0 no0Var = this.config;
            if (no0Var != null && no0Var.getIsDefaultConfig() && !enableVersion1) {
                this.isParsingConfig = false;
                return 10005;
            }
            no0 no0Var2 = this.config;
            int iM122546b = no0Var2 != null ? this.player.getPluginManager().m122546b(no0Var2) : 0;
            this.isParsingConfig = false;
            return iM122546b;
        } catch (Throwable th) {
            C21588z0.INSTANCE.m216708c("AnimPlayer.AnimConfigManager", "parseConfig error " + th, th);
            this.isParsingConfig = false;
            return 10005;
        }
    }
}

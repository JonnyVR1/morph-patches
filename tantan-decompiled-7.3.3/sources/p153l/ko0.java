package p153l;

import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.codec.CharEncoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 *2\u00020\u0001:\u0002\u001f\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R\"\u0010&\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, m88121d2 = {"Ll/ko0;", "", "Ll/ap0;", GameIdentity.player, "<init>", "(Ll/ap0;)V", "Ll/wtl;", "fileContainer", "", "enableVersion1", "", "defaultVideoMode", "defaultFps", "e", "(Ll/wtl;ZII)I", "_videoWidth", "_videoHeight", "", "a", "(II)V", "c", "(Ll/wtl;II)Z", "", "boxHead", "Ll/ko0$a;", Constants.INAPP_DATA_TAG, "([B)Ll/ko0$a;", "Ll/ap0;", "getPlayer", "()Ll/ap0;", "Ll/jo0;", "b", "Ll/jo0;", "()Ll/jo0;", "setConfig", "(Ll/jo0;)V", Constants.KEY_CONFIG, "Z", "isParsingConfig", "()Z", "setParsingConfig", "(Z)V", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ko0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ap0 player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public jo0 config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isParsingConfig;

    /* JADX INFO: renamed from: l.ko0$a */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\r\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/ko0$a;", "", "<init>", "()V", "", "a", "J", "getStartIndex", "()J", Constants.INAPP_DATA_TAG, "(J)V", "startIndex", "", "b", "I", "()I", "c", "(I)V", "length", "", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "type", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18217a {

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
        public final void m150563c(int i) {
            this.length = i;
        }

        /* JADX INFO: renamed from: d */
        public final void m150564d(long j) {
            this.startIndex = j;
        }

        /* JADX INFO: renamed from: e */
        public final void m150565e(@Nullable String str) {
            this.type = str;
        }
    }

    public ko0(@NotNull ap0 ap0Var) {
        ap0Var.getClass();
        this.player = ap0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m150556a(int _videoWidth, int _videoHeight) {
        jo0 jo0Var;
        jo0 jo0Var2 = this.config;
        if ((jo0Var2 == null || jo0Var2.getIsDefaultConfig()) && (jo0Var = this.config) != null) {
            jo0Var.m146317v(_videoWidth);
            jo0Var.m146316u(_videoHeight);
            int defaultVideoMode = jo0Var.getDefaultVideoMode();
            if (defaultVideoMode == 1) {
                jo0Var.m146318w(_videoWidth / 2);
                jo0Var.m146313r(_videoHeight);
                jo0Var.m146309n(new mi80(0, 0, jo0Var.getWidth(), jo0Var.getHeight()));
                jo0Var.m146315t(new mi80(jo0Var.getWidth(), 0, jo0Var.getWidth(), jo0Var.getHeight()));
                return;
            }
            if (defaultVideoMode == 2) {
                jo0Var.m146318w(_videoWidth);
                jo0Var.m146313r(_videoHeight / 2);
                jo0Var.m146309n(new mi80(0, 0, jo0Var.getWidth(), jo0Var.getHeight()));
                jo0Var.m146315t(new mi80(0, jo0Var.getHeight(), jo0Var.getWidth(), jo0Var.getHeight()));
                return;
            }
            if (defaultVideoMode == 3) {
                jo0Var.m146318w(_videoWidth / 2);
                jo0Var.m146313r(_videoHeight);
                jo0Var.m146315t(new mi80(0, 0, jo0Var.getWidth(), jo0Var.getHeight()));
                jo0Var.m146309n(new mi80(jo0Var.getWidth(), 0, jo0Var.getWidth(), jo0Var.getHeight()));
                return;
            }
            if (defaultVideoMode != 4) {
                jo0Var.m146318w(_videoWidth / 2);
                jo0Var.m146313r(_videoHeight);
                jo0Var.m146309n(new mi80(0, 0, jo0Var.getWidth(), jo0Var.getHeight()));
                jo0Var.m146315t(new mi80(jo0Var.getWidth(), 0, jo0Var.getWidth(), jo0Var.getHeight()));
                return;
            }
            jo0Var.m146318w(_videoWidth);
            jo0Var.m146313r(_videoHeight / 2);
            jo0Var.m146315t(new mi80(0, 0, jo0Var.getWidth(), jo0Var.getHeight()));
            jo0Var.m146309n(new mi80(0, jo0Var.getHeight(), jo0Var.getWidth(), jo0Var.getHeight()));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo0 getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m150558c(wtl fileContainer, int defaultVideoMode, int defaultFps) {
        C18217a c18217aM150559d;
        jo0 jo0Var = new jo0();
        this.config = jo0Var;
        fileContainer.mo167773a();
        byte[] bArr = new byte[8];
        long length = 0;
        while (true) {
            if (fileContainer.read(bArr, 0, 8) != 8 || (c18217aM150559d = m150559d(bArr)) == null) {
                c18217aM150559d = null;
                break;
            }
            if (Intrinsics.m88377d("vapc", c18217aM150559d.getType())) {
                c18217aM150559d.m150564d(length);
                break;
            }
            length += (long) c18217aM150559d.getLength();
            fileContainer.skip(((long) c18217aM150559d.getLength()) - 8);
        }
        if (c18217aM150559d == null) {
            C21726z0.INSTANCE.m218093b("AnimPlayer.AnimConfigManager", "vapc box head not found");
            jo0Var.m146310o(true);
            jo0Var.m146311p(defaultVideoMode);
            jo0Var.m146312q(defaultFps);
            this.player.m99262x(jo0Var.getFps());
            return true;
        }
        int length2 = c18217aM150559d.getLength() - 8;
        byte[] bArr2 = new byte[length2];
        fileContainer.read(bArr2, 0, length2);
        fileContainer.mo167774b();
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        JSONObject jSONObject = new JSONObject(new String(bArr2, 0, length2, charsetForName));
        jo0Var.m146314s(jSONObject);
        boolean zM146308m = jo0Var.m146308m(jSONObject);
        if (defaultFps > 0) {
            jo0Var.m146312q(defaultFps);
        }
        this.player.m99262x(jo0Var.getFps());
        return zM146308m;
    }

    /* JADX INFO: renamed from: d */
    public final C18217a m150559d(byte[] boxHead) {
        if (boxHead.length != 8) {
            return null;
        }
        C18217a c18217a = new C18217a();
        c18217a.m150563c(((boxHead[2] & 255) << 8) | ((boxHead[0] & 255) << 24) | ((boxHead[1] & 255) << 16) | (boxHead[3] & 255));
        Charset charsetForName = Charset.forName(CharEncoding.US_ASCII);
        charsetForName.getClass();
        c18217a.m150565e(new String(boxHead, 4, 4, charsetForName));
        return c18217a;
    }

    /* JADX INFO: renamed from: e */
    public final int m150560e(@NotNull wtl fileContainer, boolean enableVersion1, int defaultVideoMode, int defaultFps) {
        fileContainer.getClass();
        try {
            this.isParsingConfig = true;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean zM150558c = m150558c(fileContainer, defaultVideoMode, defaultFps);
            C21726z0.INSTANCE.m218095d("AnimPlayer.AnimConfigManager", "parseConfig cost=" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms enableVersion1=" + enableVersion1 + " result=" + zM150558c);
            if (!zM150558c) {
                this.isParsingConfig = false;
                return 10005;
            }
            jo0 jo0Var = this.config;
            if (jo0Var != null && jo0Var.getIsDefaultConfig() && !enableVersion1) {
                this.isParsingConfig = false;
                return 10005;
            }
            jo0 jo0Var2 = this.config;
            int iM105759b = jo0Var2 != null ? this.player.getPluginManager().m105759b(jo0Var2) : 0;
            this.isParsingConfig = false;
            return iM105759b;
        } catch (Throwable th) {
            C21726z0.INSTANCE.m218094c("AnimPlayer.AnimConfigManager", "parseConfig error " + th, th);
            this.isParsingConfig = false;
            return 10005;
        }
    }
}

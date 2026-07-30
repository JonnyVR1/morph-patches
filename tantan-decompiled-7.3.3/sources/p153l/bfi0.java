package p153l;

import com.clevertap.android.sdk.Constants;
import com.tencent.mmkv.MMKV;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, m88121d2 = {"Ll/bfi0;", "Ll/oxl;", "<init>", "()V", "", Constants.KEY_KEY, "defaultValue", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Z)Z", "value", "e", "(Ljava/lang/String;Ljava/lang/String;)Z", "c", "", "f", "(Ljava/lang/String;)V", "a", "(Ljava/lang/String;)Z", "Lcom/tencent/mmkv/MMKV;", "Lcom/tencent/mmkv/MMKV;", "mmkv", "Companion", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class bfi0 implements oxl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public MMKV mmkv;

    @Override // p153l.oxl
    /* JADX INFO: renamed from: a */
    public boolean mo18378a(@Nullable String key) {
        MMKV mmkv = this.mmkv;
        if (mmkv != null && key != null) {
            try {
                mmkv.getClass();
                return mmkv.containsKey(key);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // p153l.oxl
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo18379b(@Nullable String key, @Nullable String defaultValue) {
        MMKV mmkv = this.mmkv;
        if (mmkv != null && key != null) {
            try {
                mmkv.getClass();
                return mmkv.decodeString(key, defaultValue);
            } catch (Throwable unused) {
            }
        }
        return defaultValue;
    }

    @Override // p153l.oxl
    /* JADX INFO: renamed from: c */
    public boolean mo18380c(@Nullable String key, boolean value) {
        MMKV mmkv = this.mmkv;
        if (mmkv != null && key != null) {
            try {
                mmkv.getClass();
                return mmkv.encode(key, value);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // p153l.oxl
    /* JADX INFO: renamed from: d */
    public boolean mo18381d(@Nullable String key, boolean defaultValue) {
        MMKV mmkv = this.mmkv;
        if (mmkv != null && key != null) {
            try {
                mmkv.getClass();
                return mmkv.decodeBool(key, defaultValue);
            } catch (Throwable unused) {
            }
        }
        return defaultValue;
    }

    @Override // p153l.oxl
    /* JADX INFO: renamed from: e */
    public boolean mo18382e(@Nullable String key, @Nullable String value) {
        MMKV mmkv = this.mmkv;
        if (mmkv != null && key != null) {
            try {
                mmkv.getClass();
                return mmkv.encode(key, value);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // p153l.oxl
    /* JADX INFO: renamed from: f */
    public void mo18383f(@Nullable String key) {
        MMKV mmkv = this.mmkv;
        if (mmkv == null || key == null) {
            return;
        }
        try {
            mmkv.getClass();
            mmkv.removeValueForKey(key);
        } catch (Throwable unused) {
        }
    }
}

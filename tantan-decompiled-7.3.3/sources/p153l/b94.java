package p153l;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0002\b\nJ)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m88121d2 = {"Ll/b94;", "", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "a", "(IILandroid/content/Intent;)Z", "b", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public interface b94 {

    /* JADX INFO: renamed from: l.b94$a */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/b94$a;", "", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "<init>", "(IILandroid/content/Intent;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getRequestCode", "b", "getResultCode", "c", "Landroid/content/Intent;", "getData", "()Landroid/content/Intent;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final /* data */ class C15948a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int requestCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int resultCode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final Intent data;

        public C15948a(int i, int i2, @Nullable Intent intent) {
            this.requestCode = i;
            this.resultCode = i2;
            this.data = intent;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C15948a)) {
                return false;
            }
            C15948a c15948a = (C15948a) other;
            return this.requestCode == c15948a.requestCode && this.resultCode == c15948a.resultCode && Intrinsics.m88377d(this.data, c15948a.data);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.requestCode) * 31) + Integer.hashCode(this.resultCode)) * 31;
            Intent intent = this.data;
            return iHashCode + (intent == null ? 0 : intent.hashCode());
        }

        @NotNull
        public String toString() {
            return "ActivityResultParameters(requestCode=" + this.requestCode + ", resultCode=" + this.resultCode + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: l.b94$b */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/b94$b;", "", "<init>", "()V", "Ll/b94;", "a", "()Ll/b94;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C15949b {

        @NotNull
        public static final C15949b INSTANCE = new C15949b();

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public static final b94 m103051a() {
            return new CallbackManagerImpl();
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo8715a(int requestCode, int resultCode, @Nullable Intent data);
}

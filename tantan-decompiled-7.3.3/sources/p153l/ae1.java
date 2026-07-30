package p153l;

import android.content.SharedPreferences;
import com.facebook.AuthenticationToken;
import com.facebook.C1600c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m88121d2 = {"Ll/ae1;", "", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/SharedPreferences;)V", "()V", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "", "b", "(Lcom/facebook/AuthenticationToken;)V", "a", "Landroid/content/SharedPreferences;", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class ae1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SharedPreferences sharedPreferences;

    /* JADX WARN: Illegal instructions before constructor call */
    public ae1() {
        SharedPreferences sharedPreferences = C1600c.m8101l().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        sharedPreferences.getClass();
        this(sharedPreferences);
    }

    /* JADX INFO: renamed from: a */
    public final void m97171a() {
        this.sharedPreferences.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
    }

    /* JADX INFO: renamed from: b */
    public final void m97172b(@NotNull AuthenticationToken authenticationToken) {
        authenticationToken.getClass();
        try {
            this.sharedPreferences.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.m7502b().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public ae1(@NotNull SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
    }
}

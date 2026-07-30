package p149l;

import android.content.SharedPreferences;
import com.facebook.C1577c;
import com.facebook.Profile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0010"}, m87232d2 = {"Ll/kh90;", "", "<init>", "()V", "Lcom/facebook/Profile;", "b", "()Lcom/facebook/Profile;", "profile", "", "c", "(Lcom/facebook/Profile;)V", "a", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class kh90 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SharedPreferences sharedPreferences;

    public kh90() {
        SharedPreferences sharedPreferences = C1577c.m8047l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public final void m145953a() {
        this.sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Profile m145954b() {
        String string = this.sharedPreferences.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m145955c(@NotNull Profile profile) {
        profile.getClass();
        JSONObject jSONObjectM7618f = profile.m7618f();
        if (jSONObjectM7618f != null) {
            this.sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObjectM7618f.toString()).apply();
        }
    }
}

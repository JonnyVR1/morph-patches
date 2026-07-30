package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010!J3\u0010&\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+¨\u0006,"}, m88121d2 = {"Ll/b6c;", "", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", Constants.KEY_CONFIG, "Ll/h1c;", "dbAdapter", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ll/h1c;)V", "", "c", "()Ljava/lang/String;", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "json", "", "f", "(Ljava/lang/String;)V", "e", "()V", "", "length", "g", "(I)V", "", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/Map;", "deviceID", "profile", "", "h", "(Ljava/lang/String;Lorg/json/JSONObject;)J", "", "keysToMigrate", "Lkotlin/Function1;", "migrate", Constants.INAPP_DATA_TAG, "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "a", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Ll/h1c;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class b6c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CleverTapInstanceConfig config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final h1c dbAdapter;

    public b6c(@NotNull Context context, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig, @NotNull h1c h1cVar) {
        context.getClass();
        cleverTapInstanceConfig.getClass();
        h1cVar.getClass();
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.dbAdapter = h1cVar;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m102726a(b6c b6cVar, File file, String str) {
        b6cVar.getClass();
        str.getClass();
        if (C15493d.m94374J(str, "inApp", false, 2, null)) {
            if (C15493d.m94380w(str, b6cVar.config.getAccountId() + ".xml", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public JSONObject m102727b() {
        JSONObject jSONObjectM156027h = lw3.m156027h(m102728c(), this.config.getLogger(), this.config.getAccountId());
        jSONObjectM156027h.getClass();
        return jSONObjectM156027h;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public String m102728c() {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        return v5g0.m199857k(context, accountId, Constants.CACHED_GUIDS_KEY, null);
    }

    /* JADX INFO: renamed from: d */
    public void m102729d(@NotNull List<String> keysToMigrate, @NotNull Function1<? super String, String> migrate) {
        keysToMigrate.getClass();
        migrate.getClass();
        File[] fileArrListFiles = new File(this.context.getApplicationInfo().dataDir, "shared_prefs").listFiles(new FilenameFilter() { // from class: l.a6c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return b6c.m102726a(this.f68717a, file, str);
            }
        });
        if (fileArrListFiles != null) {
            ArrayList<SharedPreferences> arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                file.getClass();
                arrayList.add(this.context.getSharedPreferences(yki.m216472t(file), 0));
            }
            for (SharedPreferences sharedPreferences : arrayList) {
                for (String str : keysToMigrate) {
                    String string = sharedPreferences.getString(str, null);
                    if (string != null) {
                        String strInvoke = migrate.invoke(string);
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(str, strInvoke);
                        editorEdit.apply();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m102730e() {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        v5g0.m199849A(context, accountId, Constants.CACHED_GUIDS_KEY);
    }

    /* JADX INFO: renamed from: f */
    public void m102731f(@Nullable String json) {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        v5g0.m199863w(context, accountId, Constants.CACHED_GUIDS_KEY, json);
    }

    /* JADX INFO: renamed from: g */
    public void m102732g(int length) {
        Context context = this.context;
        String accountId = this.config.getAccountId();
        accountId.getClass();
        v5g0.m199861r(context, accountId, Constants.CACHED_GUIDS_LENGTH_KEY, length);
    }

    /* JADX INFO: renamed from: h */
    public long m102733h(@NotNull String deviceID, @NotNull JSONObject profile) {
        deviceID.getClass();
        profile.getClass();
        return this.dbAdapter.m133298Q(this.config.getAccountId(), deviceID, profile);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public Map<String, JSONObject> m102734i() {
        return this.dbAdapter.m133314s(this.config.getAccountId());
    }
}

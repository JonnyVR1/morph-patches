package p153l;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ykx0 {

    /* JADX INFO: renamed from: a */
    public final String f200498a;

    /* JADX INFO: renamed from: b */
    public final Bundle f200499b;

    /* JADX INFO: renamed from: c */
    public Bundle f200500c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ajx0 f200501d;

    public ykx0(ajx0 ajx0Var, String str, Bundle bundle) {
        this.f200501d = ajx0Var;
        Preconditions.checkNotEmpty(str);
        this.f200498a = str;
        if (ajx0Var.mo15139a().m98440n(whs0.f189279l1)) {
            this.f200499b = new Bundle();
        } else {
            this.f200499b = new Bundle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0100 A[Catch: NumberFormatException | JSONException -> 0x0110, NumberFormatException | JSONException -> 0x0110, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0110, blocks: (B:9:0x0025, B:21:0x0051, B:21:0x0051, B:23:0x0059, B:23:0x0059, B:25:0x005f, B:25:0x005f, B:27:0x006d, B:27:0x006d, B:29:0x007f, B:29:0x007f, B:30:0x0088, B:30:0x0088, B:50:0x0100, B:50:0x0100, B:31:0x008d, B:31:0x008d, B:33:0x0095, B:33:0x0095, B:35:0x009b, B:35:0x009b, B:37:0x00a9, B:37:0x00a9, B:39:0x00bb, B:39:0x00bb, B:40:0x00c4, B:40:0x00c4, B:41:0x00c8, B:41:0x00c8, B:43:0x00d0, B:43:0x00d0, B:44:0x00d8, B:44:0x00d8, B:46:0x00e0, B:46:0x00e0, B:47:0x00ec, B:47:0x00ec, B:49:0x00f4, B:49:0x00f4), top: B:68:0x0025, outer: #0 }] */
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final Bundle m216543a() {
        if (this.f200500c == null) {
            String string = this.f200501d.m98507D().getString(this.f200498a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString(Constants.KEY_T);
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode != 3445 || !string3.equals("la")) {
                                                this.f200501d.zzj().m114558A().m153301b("Unrecognized persisted bundle type. Type", string3);
                                            } else if (spy0.m187491a() && this.f200501d.mo15139a().m98440n(whs0.f189211J0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString(ResourceDirection.f39656v));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i2 = 0; i2 < length; i2++) {
                                                    jArr[i2] = jSONArray2.optLong(i2);
                                                }
                                                bundle.putLongArray(string2, jArr);
                                            }
                                        } else if (!string3.equals("ia")) {
                                            this.f200501d.zzj().m114558A().m153301b("Unrecognized persisted bundle type. Type", string3);
                                        } else if (spy0.m187491a() && this.f200501d.mo15139a().m98440n(whs0.f189211J0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString(ResourceDirection.f39656v));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i3 = 0; i3 < length2; i3++) {
                                                iArr[i3] = jSONArray3.optInt(i3);
                                            }
                                            bundle.putIntArray(string2, iArr);
                                        }
                                    } else if (string3.equals(BLiveStormDanmakuGiftResourceType.f45294s)) {
                                        bundle.putString(string2, jSONObject.getString(ResourceDirection.f39656v));
                                    } else {
                                        this.f200501d.zzj().m114558A().m153301b("Unrecognized persisted bundle type. Type", string3);
                                    }
                                } else if (string3.equals(BLiveStormDanmakuGiftResourceType.f45292l)) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString(ResourceDirection.f39656v)));
                                } else {
                                    this.f200501d.zzj().m114558A().m153301b("Unrecognized persisted bundle type. Type", string3);
                                }
                            } else if (string3.equals(Constants.INAPP_DATA_TAG)) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString(ResourceDirection.f39656v)));
                            } else {
                                this.f200501d.zzj().m114558A().m153301b("Unrecognized persisted bundle type. Type", string3);
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f200501d.zzj().m114558A().m153300a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f200500c = bundle;
                } catch (JSONException unused2) {
                    this.f200501d.zzj().m114558A().m153300a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f200500c == null) {
                this.f200500c = this.f200499b;
            }
        }
        return this.f200501d.mo15139a().m98440n(whs0.f189279l1) ? new Bundle((Bundle) Preconditions.checkNotNull(this.f200500c)) : (Bundle) Preconditions.checkNotNull(this.f200500c);
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m216544b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        } else if (this.f200501d.mo15139a().m98440n(whs0.f189279l1)) {
            bundle = new Bundle(bundle);
        }
        SharedPreferences.Editor editorEdit = this.f200501d.m98507D().edit();
        int size = bundle.size();
        String str = this.f200498a;
        if (size == 0) {
            editorEdit.remove(str);
        } else {
            editorEdit.putString(str, m216545c(bundle));
        }
        editorEdit.apply();
        this.f200500c = bundle;
    }

    /* JADX INFO: renamed from: c */
    public final String m216545c(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str);
                    if (spy0.m187491a() && this.f200501d.mo15139a().m98440n(whs0.f189211J0)) {
                        if (obj instanceof String) {
                            jSONObject.put(ResourceDirection.f39656v, String.valueOf(obj));
                            jSONObject.put(Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f45294s);
                        } else if (obj instanceof Long) {
                            jSONObject.put(ResourceDirection.f39656v, String.valueOf(obj));
                            jSONObject.put(Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f45292l);
                        } else if (obj instanceof int[]) {
                            jSONObject.put(ResourceDirection.f39656v, Arrays.toString((int[]) obj));
                            jSONObject.put(Constants.KEY_T, "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put(ResourceDirection.f39656v, Arrays.toString((long[]) obj));
                            jSONObject.put(Constants.KEY_T, "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put(ResourceDirection.f39656v, String.valueOf(obj));
                            jSONObject.put(Constants.KEY_T, Constants.INAPP_DATA_TAG);
                        } else {
                            this.f200501d.zzj().m114558A().m153301b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } else {
                        jSONObject.put(ResourceDirection.f39656v, String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put(Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f45294s);
                        } else if (obj instanceof Long) {
                            jSONObject.put(Constants.KEY_T, BLiveStormDanmakuGiftResourceType.f45292l);
                        } else if (obj instanceof Double) {
                            jSONObject.put(Constants.KEY_T, Constants.INAPP_DATA_TAG);
                        } else {
                            this.f200501d.zzj().m114558A().m153301b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e) {
                    this.f200501d.zzj().m114558A().m153301b("Cannot serialize bundle value to SharedPreferences", e);
                }
            }
        }
        return jSONArray.toString();
    }
}

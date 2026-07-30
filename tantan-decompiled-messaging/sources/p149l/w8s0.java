package p149l;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class w8s0 extends fyb {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f185250a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final List f185251b = Arrays.asList(((String) d1s0.m109677c().m144697a(m7s0.f131890D9)).split(Constants.SEPARATOR_COMMA));

    /* JADX INFO: renamed from: c */
    public final z8s0 f185252c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final fyb f185253d;

    public w8s0(@NonNull z8s0 z8s0Var, @Nullable fyb fybVar) {
        this.f185253d = fybVar;
        this.f185252c = z8s0Var;
    }

    @Override // p149l.fyb
    /* JADX INFO: renamed from: a */
    public final void mo123731a(String str, @Nullable Bundle bundle) {
        fyb fybVar = this.f185253d;
        if (fybVar != null) {
            fybVar.mo123731a(str, bundle);
        }
    }

    @Override // p149l.fyb
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Bundle mo123732b(String str, @Nullable Bundle bundle) {
        fyb fybVar = this.f185253d;
        if (fybVar != null) {
            return fybVar.mo123732b(str, bundle);
        }
        return null;
    }

    @Override // p149l.fyb
    /* JADX INFO: renamed from: c */
    public final void mo123733c(@Nullable Bundle bundle) {
        this.f185250a.set(false);
        fyb fybVar = this.f185253d;
        if (fybVar != null) {
            fybVar.mo123733c(bundle);
        }
    }

    @Override // p149l.fyb
    /* JADX INFO: renamed from: d */
    public final void mo123734d(int i, @Nullable Bundle bundle) {
        List list;
        this.f185250a.set(false);
        fyb fybVar = this.f185253d;
        if (fybVar != null) {
            fybVar.mo123734d(i, bundle);
        }
        this.f185252c.m217631i(vny0.m199064b().currentTimeMillis());
        if (this.f185252c == null || (list = this.f185251b) == null || !list.contains(String.valueOf(i))) {
            return;
        }
        this.f185252c.m217628f();
    }

    @Override // p149l.fyb
    /* JADX INFO: renamed from: e */
    public final void mo123735e(String str, @Nullable Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f185250a.set(true);
                this.f185252c.m217630h(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            xsu0.m210835l("Message is not in JSON format: ", e);
        }
        fyb fybVar = this.f185253d;
        if (fybVar != null) {
            fybVar.mo123735e(str, bundle);
        }
    }

    @Override // p149l.fyb
    /* JADX INFO: renamed from: f */
    public final void mo123736f(int i, Uri uri, boolean z, @Nullable Bundle bundle) {
        fyb fybVar = this.f185253d;
        if (fybVar != null) {
            fybVar.mo123736f(i, uri, z, bundle);
        }
    }

    /* JADX INFO: renamed from: g */
    public final Boolean m202201g() {
        return Boolean.valueOf(this.f185250a.get());
    }
}

package p153l;

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
public final class cis0 extends tzb {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f81984a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final List f81985b = Arrays.asList(((String) jas0.m144075c().m176505a(sgs0.f167961D9)).split(Constants.SEPARATOR_COMMA));

    /* JADX INFO: renamed from: c */
    public final fis0 f81986c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final tzb f81987d;

    public cis0(@NonNull fis0 fis0Var, @Nullable tzb tzbVar) {
        this.f81987d = tzbVar;
        this.f81986c = fis0Var;
    }

    @Override // p153l.tzb
    /* JADX INFO: renamed from: a */
    public final void mo109941a(String str, @Nullable Bundle bundle) {
        tzb tzbVar = this.f81987d;
        if (tzbVar != null) {
            tzbVar.mo109941a(str, bundle);
        }
    }

    @Override // p153l.tzb
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Bundle mo109942b(String str, @Nullable Bundle bundle) {
        tzb tzbVar = this.f81987d;
        if (tzbVar != null) {
            return tzbVar.mo109942b(str, bundle);
        }
        return null;
    }

    @Override // p153l.tzb
    /* JADX INFO: renamed from: c */
    public final void mo109943c(@Nullable Bundle bundle) {
        this.f81984a.set(false);
        tzb tzbVar = this.f81987d;
        if (tzbVar != null) {
            tzbVar.mo109943c(bundle);
        }
    }

    @Override // p153l.tzb
    /* JADX INFO: renamed from: d */
    public final void mo109944d(int i, @Nullable Bundle bundle) {
        List list;
        this.f81984a.set(false);
        tzb tzbVar = this.f81987d;
        if (tzbVar != null) {
            tzbVar.mo109944d(i, bundle);
        }
        this.f81986c.m125722i(bxy0.m106918b().currentTimeMillis());
        if (this.f81986c == null || (list = this.f81985b) == null || !list.contains(String.valueOf(i))) {
            return;
        }
        this.f81986c.m125719f();
    }

    @Override // p153l.tzb
    /* JADX INFO: renamed from: e */
    public final void mo109945e(String str, @Nullable Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f81984a.set(true);
                this.f81986c.m125721h(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            d2v0.m113738l("Message is not in JSON format: ", e);
        }
        tzb tzbVar = this.f81987d;
        if (tzbVar != null) {
            tzbVar.mo109945e(str, bundle);
        }
    }

    @Override // p153l.tzb
    /* JADX INFO: renamed from: f */
    public final void mo109946f(int i, Uri uri, boolean z, @Nullable Bundle bundle) {
        tzb tzbVar = this.f81987d;
        if (tzbVar != null) {
            tzbVar.mo109946f(i, uri, z, bundle);
        }
    }

    /* JADX INFO: renamed from: g */
    public final Boolean m109947g() {
        return Boolean.valueOf(this.f81984a.get());
    }
}

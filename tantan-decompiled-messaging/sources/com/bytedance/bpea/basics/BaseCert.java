package com.bytedance.bpea.basics;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m87232d2 = {"Lcom/bytedance/bpea/basics/BaseCert;", "Lcom/bytedance/bpea/basics/Cert;", "Ljava/io/Serializable;", "certToken", "", "certType", "", "(Ljava/lang/String;I)V", "toJSON", "Lorg/json/JSONObject;", "toString", "validate", "", "context", "Lcom/bytedance/bpea/basics/CertContext;", "basics_release"}, m87233k = 1, m87234mv = {1, 1, 16})
public abstract class BaseCert implements Cert, Serializable {
    private final String certToken;
    private final int certType;

    public BaseCert(@Nullable String str, int i) {
        this.certToken = str;
        this.certType = i;
    }

    @Override // com.bytedance.bpea.basics.Cert
    @Nullable
    /* JADX INFO: renamed from: certToken, reason: from getter */
    public String getCertToken() {
        return this.certToken;
    }

    @Override // com.bytedance.bpea.basics.Cert
    /* JADX INFO: renamed from: certType, reason: from getter */
    public int getCertType() {
        return this.certType;
    }

    @Override // com.bytedance.bpea.basics.Cert
    @NotNull
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("certToken", this.certToken);
            jSONObject.put("certType", this.certType);
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return jSONObject;
        }
    }

    @NotNull
    public String toString() {
        String string = toJSON().toString();
        string.getClass();
        return string;
    }

    @Override // com.bytedance.bpea.basics.Cert
    public void validate(@NotNull CertContext context) throws BPEAException {
        context.getClass();
        String str = this.certToken;
        if (str == null || str.length() == 0) {
            throw new BPEAException(-1, "certToken is empty");
        }
    }
}

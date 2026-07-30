package com.vivo.push.p111b;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14532a;
import com.vivo.push.util.C14647p;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.b.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C14558x extends AbstractC14621o {

    /* JADX INFO: renamed from: a */
    private HashMap<String, String> f60945a;

    /* JADX INFO: renamed from: b */
    private long f60946b;

    public C14558x() {
        super(2012);
    }

    /* JADX INFO: renamed from: a */
    public final void m84784a(HashMap<String, String> map) {
        this.f60945a = map;
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        c14532a.m84715a("ReporterCommand.EXTRA_PARAMS", this.f60945a);
        c14532a.m84714a("ReporterCommand.EXTRA_REPORTER_TYPE", this.f60946b);
    }

    /* JADX INFO: renamed from: d */
    public final void m84785d() {
        if (this.f60945a == null) {
            C14647p.m85021d("ReporterCommand", "reportParams is empty");
            return;
        }
        StringBuilder sb = new StringBuilder("report message reportType:");
        sb.append(this.f60946b);
        sb.append(",msgId:");
        String str = this.f60945a.get(Message.MESSAGE_ID);
        if (TextUtils.isEmpty(str)) {
            str = this.f60945a.get(Constants.MessagePayloadKeys.MSGID_SERVER);
        }
        sb.append(str);
        C14647p.m85021d("ReporterCommand", sb.toString());
    }

    @Override // com.vivo.push.AbstractC14621o
    public final String toString() {
        return "ReporterCommand（" + this.f60946b + ")";
    }

    public C14558x(long j) {
        this();
        this.f60946b = j;
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        this.f60945a = (HashMap) c14532a.m84725d("ReporterCommand.EXTRA_PARAMS");
        this.f60946b = c14532a.m84721b("ReporterCommand.EXTRA_REPORTER_TYPE", this.f60946b);
    }
}

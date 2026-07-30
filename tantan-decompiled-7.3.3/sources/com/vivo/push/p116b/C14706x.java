package com.vivo.push.p116b;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.AbstractC14769o;
import com.vivo.push.C14680a;
import com.vivo.push.util.C14795p;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.b.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C14706x extends AbstractC14769o {

    /* JADX INFO: renamed from: a */
    private HashMap<String, String> f61792a;

    /* JADX INFO: renamed from: b */
    private long f61793b;

    public C14706x() {
        super(2012);
    }

    /* JADX INFO: renamed from: a */
    public final void m85955a(HashMap<String, String> map) {
        this.f61792a = map;
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        c14680a.m85886a("ReporterCommand.EXTRA_PARAMS", this.f61792a);
        c14680a.m85885a("ReporterCommand.EXTRA_REPORTER_TYPE", this.f61793b);
    }

    /* JADX INFO: renamed from: d */
    public final void m85956d() {
        if (this.f61792a == null) {
            C14795p.m86192d("ReporterCommand", "reportParams is empty");
            return;
        }
        StringBuilder sb = new StringBuilder("report message reportType:");
        sb.append(this.f61793b);
        sb.append(",msgId:");
        String str = this.f61792a.get(Message.MESSAGE_ID);
        if (TextUtils.isEmpty(str)) {
            str = this.f61792a.get(Constants.MessagePayloadKeys.MSGID_SERVER);
        }
        sb.append(str);
        C14795p.m86192d("ReporterCommand", sb.toString());
    }

    @Override // com.vivo.push.AbstractC14769o
    public final String toString() {
        return "ReporterCommand（" + this.f61793b + ")";
    }

    public C14706x(long j) {
        this();
        this.f61793b = j;
    }

    @Override // com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        this.f61792a = (HashMap) c14680a.m85896d("ReporterCommand.EXTRA_PARAMS");
        this.f61793b = c14680a.m85892b("ReporterCommand.EXTRA_REPORTER_TYPE", this.f61793b);
    }
}

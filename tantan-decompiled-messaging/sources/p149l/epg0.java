package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class epg0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final rqg0 f92653a;

    public epg0(Looper looper, rqg0 rqg0Var) {
        super(looper);
        this.f92653a = rqg0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f92653a.f160632c++;
            return;
        }
        if (i == 1) {
            this.f92653a.f160633d++;
            return;
        }
        if (i == 2) {
            rqg0 rqg0Var = this.f92653a;
            long j = message.arg1;
            int i2 = rqg0Var.f160641l + 1;
            rqg0Var.f160641l = i2;
            long j2 = rqg0Var.f160635f + j;
            rqg0Var.f160635f = j2;
            rqg0Var.f160638i = j2 / ((long) i2);
            return;
        }
        if (i == 3) {
            rqg0 rqg0Var2 = this.f92653a;
            long j3 = message.arg1;
            rqg0Var2.f160642m++;
            long j4 = rqg0Var2.f160636g + j3;
            rqg0Var2.f160636g = j4;
            rqg0Var2.f160639j = j4 / ((long) rqg0Var2.f160641l);
            return;
        }
        if (i != 4) {
            x5g0.f191136i.post(new zmg0(message));
            return;
        }
        rqg0 rqg0Var3 = this.f92653a;
        Long l2 = (Long) message.obj;
        rqg0Var3.f160640k++;
        long jLongValue = l2.longValue() + rqg0Var3.f160634e;
        rqg0Var3.f160634e = jLongValue;
        rqg0Var3.f160637h = jLongValue / ((long) rqg0Var3.f160640k);
    }
}

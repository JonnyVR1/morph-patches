package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class mxg0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final zyg0 f139240a;

    public mxg0(Looper looper, zyg0 zyg0Var) {
        super(looper);
        this.f139240a = zyg0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f139240a.f206580c++;
            return;
        }
        if (i == 1) {
            this.f139240a.f206581d++;
            return;
        }
        if (i == 2) {
            zyg0 zyg0Var = this.f139240a;
            long j = message.arg1;
            int i2 = zyg0Var.f206589l + 1;
            zyg0Var.f206589l = i2;
            long j2 = zyg0Var.f206583f + j;
            zyg0Var.f206583f = j2;
            zyg0Var.f206586i = j2 / ((long) i2);
            return;
        }
        if (i == 3) {
            zyg0 zyg0Var2 = this.f139240a;
            long j3 = message.arg1;
            zyg0Var2.f206590m++;
            long j4 = zyg0Var2.f206584g + j3;
            zyg0Var2.f206584g = j4;
            zyg0Var2.f206587j = j4 / ((long) zyg0Var2.f206589l);
            return;
        }
        if (i != 4) {
            feg0.f98665i.post(new hvg0(message));
            return;
        }
        zyg0 zyg0Var3 = this.f139240a;
        Long l2 = (Long) message.obj;
        zyg0Var3.f206588k++;
        long jLongValue = l2.longValue() + zyg0Var3.f206582e;
        zyg0Var3.f206582e = jLongValue;
        zyg0Var3.f206585h = jLongValue / ((long) zyg0Var3.f206588k);
    }
}

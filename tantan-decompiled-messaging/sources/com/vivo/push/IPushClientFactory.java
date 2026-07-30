package com.vivo.push;

import android.content.Intent;
import com.vivo.push.p113d.AbstractC14607z;

/* JADX INFO: loaded from: classes2.dex */
public interface IPushClientFactory {
    AbstractC14607z createReceiveTask(AbstractC14621o abstractC14621o);

    AbstractC14621o createReceiverCommand(Intent intent);

    AbstractRunnableC14616l createTask(AbstractC14621o abstractC14621o);
}

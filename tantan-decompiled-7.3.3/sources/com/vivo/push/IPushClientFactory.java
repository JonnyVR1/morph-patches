package com.vivo.push;

import android.content.Intent;
import com.vivo.push.p118d.AbstractC14755z;

/* JADX INFO: loaded from: classes2.dex */
public interface IPushClientFactory {
    AbstractC14755z createReceiveTask(AbstractC14769o abstractC14769o);

    AbstractC14769o createReceiverCommand(Intent intent);

    AbstractRunnableC14764l createTask(AbstractC14769o abstractC14769o);
}
